import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class BitBuf extends ByteBuf {

	IsaacRandom random;
	int bitPosition;
	static String aString1729;
	static int[] bitMasks = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767,
			'\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	public void setRandom(int[] var1) {
		this.random = new IsaacRandom(var1);
	}

	public void putHeader(int var1) {
		this.payload[(this.position += -184175589) * 314639891 - 1] = (byte) (var1 + this.random.method66());
	}

	public int bitsAvail(int var1) {
		return 8 * var1 - this.bitPosition * 1539886523;
	}

	public void bitAccess() {
		this.bitPosition = 928758856 * this.position;
	}

	public int getHeader() {
		return this.payload[(this.position += -184175589) * 314639891 - 1] - this.random.method66() & 255;
	}

	public void byteAccess() {
		this.position = (7 + this.bitPosition * 1539886523) / 8 * -184175589;
	}

	public int getBits(int var1) {
		int var2 = 1539886523 * this.bitPosition >> 3;
		int var4 = 8 - (this.bitPosition * 1539886523 & 7);
		int var3 = 0;

		for (this.bitPosition += 495906675 * var1; var1 > var4; var4 = 8) {
			var3 += (this.payload[var2++] & bitMasks[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var3 += this.payload[var2] & bitMasks[var4];
		} else {
			var3 += this.payload[var2] >> var4 - var1 & bitMasks[var1];
		}

		return var3;
	}

	public BitBuf(int var1) {
		super(var1);
	}

	public static void encodeClassVerifier(BitBuf buf) {
		ClassVerifier ver = (ClassVerifier) Class119.aClass103_804.method420();
		if (ver != null) {
			int pos = buf.position * 314639891;
			buf.putInt(ver.anInt1426 * 2103128295);

			for (int index = 0; index < ver.count * -707810723; ++index) {
				if (ver.errorIdentifiers[index] != 0) {
					buf.putByte(ver.errorIdentifiers[index]);
				} else {
					try {
						int type = ver.type[index];
						Field field;
						int fieldValue;
						if (type == 0) {
							field = ver.fields[index];
							fieldValue = field.getInt((Object) null);
							buf.putByte(0);
							buf.putInt(fieldValue);
						} else if (type == 1) {
							field = ver.fields[index];
							field.setInt((Object) null, ver.fieldValues[index]);
							buf.putByte(0);
						} else if (type == 2) {
							field = ver.fields[index];
							fieldValue = field.getModifiers();
							buf.putByte(0);
							buf.putInt(fieldValue);
						}

						Method method;
						if (type == 3) {
							method = ver.methods[index];
							byte[][] bytecodes = ver.methodsBytecodes[index];
							Object[] objects = new Object[bytecodes.length];

							for (int code = 0; code < bytecodes.length; ++code) {
								ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytecodes[code]));
								objects[code] = ois.readObject();
							}

							Object invoke = method.invoke((Object) null, objects);
							if (invoke == null) {
								buf.putByte(0);
							} else if (invoke instanceof Number) {
								buf.putByte(1);
								buf.putLong(((Number) invoke).longValue());
							} else if (invoke instanceof String) {
								buf.putByte(2);
								buf.putString((String) invoke);
							} else {
								buf.putByte(4);
							}
						} else if (type == 4) {
							method = ver.methods[index];
							fieldValue = method.getModifiers();
							buf.putByte(0);
							buf.putInt(fieldValue);
						}
					} catch (ClassNotFoundException var10) {
						buf.putByte(-10);
					} catch (InvalidClassException var11) {
						buf.putByte(-11);
					} catch (StreamCorruptedException var12) {
						buf.putByte(-12);
					} catch (OptionalDataException var13) {
						buf.putByte(-13);
					} catch (IllegalAccessException var14) {
						buf.putByte(-14);
					} catch (IllegalArgumentException var15) {
						buf.putByte(-15);
					} catch (InvocationTargetException var16) {
						buf.putByte(-16);
					} catch (SecurityException var17) {
						buf.putByte(-17);
					} catch (IOException var18) {
						buf.putByte(-18);
					} catch (NullPointerException var19) {
						buf.putByte(-19);
					} catch (Exception var20) {
						buf.putByte(-20);
					} catch (Throwable var21) {
						buf.putByte(-21);
					}
				}
			}

			buf.putCrc(pos);
			ver.unlink();
		}
	}
}
