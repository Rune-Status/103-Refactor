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

   static String userHome;
   IsaacRandom random;
   int bitPosition;
   static int[] bitMasks = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

   public void setRandom(int[] var1) {
      this.random = new IsaacRandom(var1);
   }

   public void putHeader(int var1) {
      this.payload[++this.position - 1] = (byte)(this.random.val() + var1);
   }

   public int bitsAvail(int var1) {
      return var1 * 8 - this.bitPosition;
   }

   public void bitAccess() {
      this.bitPosition = this.position * 8;
   }

   public int getHeader() {
      return this.payload[++this.position - 1] - this.random.val() & 0xff;
   }

   public void byteAccess() {
      this.position = (this.bitPosition + 7) / 8;
   }

   public int getBits(int var1) {
      int var2 = this.bitPosition >> 3;
      int var4 = 8 - (this.bitPosition & 0x7);
      int var3 = 0;

      for(this.bitPosition += var1; var1 > var4; var4 = 8) {
         var3 += (this.payload[var2++] & bitMasks[var4]) << var1 - var4;
         var1 -= var4;
      }

      if(var4 == var1) {
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
      ClassVerifier ver = (ClassVerifier)Class119.aClass103_804.method420();
      if(ver != null) {
         int pos = buf.position;
         buf.putInt(ver.anInt1426);

         for(int index = 0; index < ver.count; index++) {
            if(ver.errorIdentifiers[index] != 0) {
               buf.putByte(ver.errorIdentifiers[index]);
            } else {
               try {
                  int var21 = ver.type[index];
                  Field field;
                  int fieldValue;
                  if(var21 == 0) {
                     field = ver.fields[index];
                     fieldValue = field.getInt((Object)null);
                     buf.putByte(0);
                     buf.putInt(fieldValue);
                  } else if(var21 == 1) {
                     field = ver.fields[index];
                     field.setInt((Object)null, ver.fieldValues[index]);
                     buf.putByte(0);
                  } else if(var21 == 2) {
                     field = ver.fields[index];
                     fieldValue = field.getModifiers();
                     buf.putByte(0);
                     buf.putInt(fieldValue);
                  }

                  Method method;
                  if(var21 != 3) {
                     if(var21 == 4) {
                        method = ver.methods[index];
                        fieldValue = method.getModifiers();
                        buf.putByte(0);
                        buf.putInt(fieldValue);
                     }
                  } else {
                     method = ver.methods[index];
                     byte[][] bytecodes = ver.methodsBytecodes[index];
                     Object[] objects = new Object[bytecodes.length];

                     for(int invoke = 0; invoke < bytecodes.length; invoke++) {
                        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytecodes[invoke]));
                        objects[invoke] = ois.readObject();
                     }

                     Object var24 = method.invoke((Object)null, objects);
                     if(var24 == null) {
                        buf.putByte(0);
                     } else if(var24 instanceof Number) {
                        buf.putByte(1);
                        buf.putLong(((Number)var24).longValue());
                     } else if(var24 instanceof String) {
                        buf.putByte(2);
                        buf.putString((String)var24);
                     } else {
                        buf.putByte(4);
                     }
                  }
               } catch (ClassNotFoundException var12) {
                  buf.putByte(-10);
               } catch (InvalidClassException var13) {
                  buf.putByte(-11);
               } catch (StreamCorruptedException var14) {
                  buf.putByte(-12);
               } catch (OptionalDataException var15) {
                  buf.putByte(-13);
               } catch (IllegalAccessException var16) {
                  buf.putByte(-14);
               } catch (IllegalArgumentException var17) {
                  buf.putByte(-15);
               } catch (InvocationTargetException var18) {
                  buf.putByte(-16);
               } catch (SecurityException var19) {
                  buf.putByte(-17);
               } catch (IOException var20) {
                  buf.putByte(-18);
               } catch (NullPointerException var211) {
                  buf.putByte(-19);
               } catch (Exception var22) {
                  buf.putByte(-20);
               } catch (Throwable var23) {
                  buf.putByte(-21);
               }
            }
         }

         buf.putCrc(pos);
         ver.unlink();
      }

   }

}
