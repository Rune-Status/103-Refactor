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

	public static void method883(BitBuf var0) {
		Node_Sub16 var1 = (Node_Sub16) Class119.aClass103_804.method420();
		if (var1 != null) {
			int var2 = var0.position * 314639891;
			var0.putInt(var1.anInt1426 * 2103128295);

			for (int var3 = 0; var3 < var1.anInt1419 * -707810723; ++var3) {
				if (var1.anIntArray1421[var3] != 0) {
					var0.putByte(var1.anIntArray1421[var3]);
				} else {
					try {
						int var4 = var1.anIntArray1420[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.aFieldArray1422[var3];
							var6 = var5.getInt((Object) null);
							var0.putByte(0);
							var0.putInt(var6);
						} else if (var4 == 1) {
							var5 = var1.aFieldArray1422[var3];
							var5.setInt((Object) null, var1.anIntArray1423[var3]);
							var0.putByte(0);
						} else if (var4 == 2) {
							var5 = var1.aFieldArray1422[var3];
							var6 = var5.getModifiers();
							var0.putByte(0);
							var0.putInt(var6);
						}

						Method var22;
						if (var4 == 3) {
							var22 = var1.aMethodArray1424[var3];
							byte[][] var23 = var1.aByteArrayArrayArray1425[var3];
							Object[] var7 = new Object[var23.length];

							for (int var8 = 0; var8 < var23.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
								var7[var8] = var9.readObject();
							}

							Object var24 = var22.invoke((Object) null, var7);
							if (var24 == null) {
								var0.putByte(0);
							} else if (var24 instanceof Number) {
								var0.putByte(1);
								var0.putLong(((Number) var24).longValue());
							} else if (var24 instanceof String) {
								var0.putByte(2);
								var0.putString((String) var24);
							} else {
								var0.putByte(4);
							}
						} else if (var4 == 4) {
							var22 = var1.aMethodArray1424[var3];
							var6 = var22.getModifiers();
							var0.putByte(0);
							var0.putInt(var6);
						}
					} catch (ClassNotFoundException var10) {
						var0.putByte(-10);
					} catch (InvalidClassException var11) {
						var0.putByte(-11);
					} catch (StreamCorruptedException var12) {
						var0.putByte(-12);
					} catch (OptionalDataException var13) {
						var0.putByte(-13);
					} catch (IllegalAccessException var14) {
						var0.putByte(-14);
					} catch (IllegalArgumentException var15) {
						var0.putByte(-15);
					} catch (InvocationTargetException var16) {
						var0.putByte(-16);
					} catch (SecurityException var17) {
						var0.putByte(-17);
					} catch (IOException var18) {
						var0.putByte(-18);
					} catch (NullPointerException var19) {
						var0.putByte(-19);
					} catch (Exception var20) {
						var0.putByte(-20);
					} catch (Throwable var21) {
						var0.putByte(-21);
					}
				}
			}

			var0.putCrc(var2);
			var1.unlink();
		}
	}
}
