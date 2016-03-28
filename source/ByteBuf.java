import java.math.BigInteger;

public class ByteBuf extends Node {

   public byte[] payload;
   public int position;
   static int[] crc32Table = new int[256];
   static long[] crc64Table;

   public ByteBuf(byte[] var1) {
      this.payload = var1;
      this.position = 0;
   }

   public int getMEMedium() {
      this.position += 3;
      return ((this.payload[this.position - 2] & 0xff) << 16) + ((this.payload[this.position - 3] & 0xff) << 8) + (this.payload[this.position - 1] & 0xff);
   }

   public void putShort(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
      this.payload[++this.position - 1] = (byte)var1;
   }

   public void putMedium(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 >> 16);
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
      this.payload[++this.position - 1] = (byte)var1;
   }

   public void putInt(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 >> 24);
      this.payload[++this.position - 1] = (byte)(var1 >> 16);
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
      this.payload[++this.position - 1] = (byte)var1;
   }

   public void put48Bit(long var1) {
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.position - 1] = (byte)((int)var1);
   }

   public void putLong(long var1) {
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 56));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 48));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.position - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.position - 1] = (byte)((int)var1);
   }

   public void putString(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 < 0) {
         this.position += Class53.putJagString(var1, 0, var1.length(), this.payload, this.position);
         this.payload[++this.position - 1] = 0;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public void putVarInt(int var1) {
      this.payload[this.position - var1 - 4] = (byte)(var1 >> 24);
      this.payload[this.position - var1 - 3] = (byte)(var1 >> 16);
      this.payload[this.position - var1 - 2] = (byte)(var1 >> 8);
      this.payload[this.position - var1 - 1] = (byte)var1;
   }

   public void putVarShort(int var1) {
      this.payload[this.position - var1 - 2] = (byte)(var1 >> 8);
      this.payload[this.position - var1 - 1] = (byte)var1;
   }

   public void encryptRSA(BigInteger exp, BigInteger mod) {
      int var3 = this.position;
      this.position = 0;
      byte[] var6 = new byte[var3];
      this.getBytes(var6, 0, var3);
      BigInteger var7 = new BigInteger(var6);
      BigInteger var4 = var7.modPow(exp, mod);
      byte[] var5 = var4.toByteArray();
      this.position = 0;
      this.putShort(var5.length);
      this.putBytes(var5, 0, var5.length);
   }

   public void putUSmart(int var1) {
      if(var1 >= 0 && var1 < 128) {
         this.putByte(var1);
      } else {
         if(var1 < 0 || var1 >= '\u8000') {
            throw new IllegalArgumentException();
         }

         this.putShort(var1 + '\u8000');
      }

   }

   public void putFlags(int var1) {
      if((var1 & 0xffffff80) != 0) {
         if((var1 & 0xffffc000) != 0) {
            if((var1 & 0xffe00000) != 0) {
               if((var1 & 0xf0000000) != 0) {
                  this.putByte(var1 >>> 28 | 128);
               }

               this.putByte(var1 >>> 21 | 128);
            }

            this.putByte(var1 >>> 14 | 128);
         }

         this.putByte(var1 >>> 7 | 128);
      }

      this.putByte(var1 & 0x7f);
   }

   public int getUByte() {
      return this.payload[++this.position - 1] & 0xff;
   }

   public int getUShort() {
      this.position += 2;
      return ((this.payload[this.position - 2] & 0xff) << 8) + (this.payload[this.position - 1] & 0xff);
   }

   public int getShort() {
      this.position += 2;
      int var1 = (this.payload[this.position - 1] & 0xff) + ((this.payload[this.position - 2] & 0xff) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int getMedium() {
      this.position += 3;
      return (this.payload[this.position - 1] & 0xff) + ((this.payload[this.position - 3] & 0xff) << 16) + ((this.payload[this.position - 2] & 0xff) << 8);
   }

   public int getInt() {
      this.position += 4;
      return (this.payload[this.position - 1] & 0xff) + ((this.payload[this.position - 4] & 0xff) << 24) + ((this.payload[this.position - 3] & 0xff) << 16) + ((this.payload[this.position - 2] & 0xff) << 8);
   }

   public long getLong() {
      long var1 = (long)this.getInt() & 0xffffffff;
      long var3 = (long)this.getInt() & 0xffffffff;
      return (var1 << 32) + var3;
   }

   public String getNullString() {
      if(this.payload[this.position] == 0) {
         ++this.position;
         return null;
      } else {
         return this.getString();
      }
   }

   public String getString() {
      int sPos = this.position;

      while(this.payload[++this.position - 1] != 0) {
         ;
      }

      int off = this.position - sPos - 1;
      return off == 0 ? "" : LandscapeTile.getString(this.payload, sPos, off);
   }

   public String getJagString() {
      byte var1 = this.payload[++this.position - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int size = this.method632();
         if(this.position + size > this.payload.length) {
            throw new IllegalStateException("");
         } else {
            String string = Class46.getJagString(this.payload, this.position, size);
            this.position += size;
            return string;
         }
      }
   }

   public int getUSmart() {
      int var1 = this.payload[this.position] & 0xff;
      return var1 >= 128 ? this.getUShort() - '\u8000' : this.getUByte();
   }

   public static int method603(int var0) {
      return var0 <= 0 ? (var0 < 0 ? -1 : 0) : 1;
   }

   public void encryptXTEA(int[] keys) {
      int var2 = this.position / 8;
      this.position = 0;

      for(int var6 = 0; var6 < var2; var6++) {
         int var3 = this.getInt();
         int var4 = this.getInt();
         int var5 = 0;
         int var8 = -1640531527;

         for(int var7 = 32; var7-- > 0; var4 += (var3 << 4 ^ var3 >>> 5) + var3 ^ keys[var5 >>> 11 & 0x3] + var5) {
            var3 += (var4 << 4 ^ var4 >>> 5) + var4 ^ keys[var5 & 0x3] + var5;
            var5 += var8;
         }

         this.position -= 8;
         this.putInt(var3);
         this.putInt(var4);
      }

   }

   public void decryptXTEA(int[] keys) {
      int var2 = this.position / 8;
      this.position = 0;

      for(int var4 = 0; var4 < var2; var4++) {
         int var6 = this.getInt();
         int var5 = this.getInt();
         int var7 = -957401312;
         int var3 = -1640531527;

         for(int var8 = 32; var8-- > 0; var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ keys[var7 & 0x3] + var7) {
            var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ keys[var7 >>> 11 & 0x3] + var7;
            var7 -= var3;
         }

         this.position -= 8;
         this.putInt(var6);
         this.putInt(var5);
      }

   }

   public void encryptXTEA(int[] keys, int offset, int length) {
      int var4 = this.position;
      this.position = offset;
      int var8 = (length - offset) / 8;

      for(int var9 = 0; var9 < var8; var9++) {
         int var6 = this.getInt();
         int var5 = this.getInt();
         int var7 = 0;
         int var11 = -1640531527;

         for(int var10 = 32; var10-- > 0; var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ keys[var7 >>> 11 & 0x3] + var7) {
            var6 += (var5 << 4 ^ var5 >>> 5) + var5 ^ keys[var7 & 0x3] + var7;
            var7 += var11;
         }

         this.position -= 8;
         this.putInt(var6);
         this.putInt(var5);
      }

      this.position = var4;
   }

   public void decryptXTEA(int[] keys, int offset, int length) {
      int var4 = this.position;
      this.position = offset;
      int var6 = (length - offset) / 8;

      for(int var5 = 0; var5 < var6; var5++) {
         int var8 = this.getInt();
         int var7 = this.getInt();
         int var10 = -957401312;
         int var9 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ keys[var10 & 0x3] + var10) {
            var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ keys[var10 >>> 11 & 0x3] + var10;
            var10 -= var9;
         }

         this.position -= 8;
         this.putInt(var8);
         this.putInt(var7);
      }

      this.position = var4;
   }

   public int putCrc(int offset) {
      int val = Class58.getCrc(this.payload, offset, this.position);
      this.putInt(val);
      return val;
   }

   public void putByteC(int var1) {
      this.payload[++this.position - 1] = (byte)(0 - var1);
   }

   public int getUByteA() {
      return this.payload[++this.position - 1] - 128 & 0xff;
   }

   public int getUByteC() {
      return 0 - this.payload[++this.position - 1] & 0xff;
   }

   public int getUByteS() {
      return 128 - this.payload[++this.position - 1] & 0xff;
   }

   public void putByte(int var1) {
      this.payload[++this.position - 1] = (byte)var1;
   }

   public int getLEInt() {
      this.position += 4;
      return ((this.payload[this.position - 2] & 0xff) << 16) + ((this.payload[this.position - 1] & 0xff) << 24) + ((this.payload[this.position - 3] & 0xff) << 8) + (this.payload[this.position - 4] & 0xff);
   }

   public int getSmart() {
      int var1 = this.payload[this.position] & 0xff;
      return var1 < 128 ? this.getUByte() - 64 : this.getUShort() - '\uc000';
   }

   public int getULEShortA() {
      this.position += 2;
      return (this.payload[this.position - 2] - 128 & 0xff) + ((this.payload[this.position - 1] & 0xff) << 8);
   }

   public int getLEShort() {
      this.position += 2;
      int var1 = ((this.payload[this.position - 1] & 0xff) << 8) + (this.payload[this.position - 2] & 0xff);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public void putMEMedium(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
      this.payload[++this.position - 1] = (byte)(var1 >> 16);
      this.payload[++this.position - 1] = (byte)var1;
   }

   public void putMEInt(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
      this.payload[++this.position - 1] = (byte)var1;
      this.payload[++this.position - 1] = (byte)(var1 >> 24);
      this.payload[++this.position - 1] = (byte)(var1 >> 16);
   }

   public void getBytes(byte[] bytes, int offset, int length) {
      for(int index = offset; index < length + offset; index++) {
         bytes[index] = this.payload[++this.position - 1];
      }

   }

   public int getMEInt() {
      this.position += 4;
      return ((this.payload[this.position - 2] & 0xff) << 24) + ((this.payload[this.position - 1] & 0xff) << 16) + ((this.payload[this.position - 4] & 0xff) << 8) + (this.payload[this.position - 3] & 0xff);
   }

   public int getIMEInt() {
      this.position += 4;
      return (this.payload[this.position - 2] & 0xff) + ((this.payload[this.position - 3] & 0xff) << 24) + ((this.payload[this.position - 4] & 0xff) << 16) + ((this.payload[this.position - 1] & 0xff) << 8);
   }

   public ByteBuf(int size) {
      this.payload = Class50.unpooled(size);
      this.position = 0;
   }

   public void putLEShort(int var1) {
      this.payload[++this.position - 1] = (byte)var1;
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
   }

   public int getShortA() {
      this.position += 2;
      int var1 = ((this.payload[this.position - 2] & 0xff) << 8) + (this.payload[this.position - 1] - 128 & 0xff);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int getLEShortA() {
      this.position += 2;
      int var1 = (this.payload[this.position - 2] - 128 & 0xff) + ((this.payload[this.position - 1] & 0xff) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int getLargeSmart() {
      return this.payload[this.position] >= 0 ? this.getUShort() : this.getInt() & 0x7fffffff;
   }

   public void putJagString(String string) {
      int var2 = string.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.payload[++this.position - 1] = 0;
         this.position += Class53.putJagString(string, 0, string.length(), this.payload, this.position);
         this.payload[++this.position - 1] = 0;
      }
   }

   public void putIMEInt(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 >> 16);
      this.payload[++this.position - 1] = (byte)(var1 >> 24);
      this.payload[++this.position - 1] = (byte)var1;
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
   }

   public void putLEInt(int var1) {
      this.payload[++this.position - 1] = (byte)var1;
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
      this.payload[++this.position - 1] = (byte)(var1 >> 16);
      this.payload[++this.position - 1] = (byte)(var1 >> 24);
   }

   public void putShortA(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
      this.payload[++this.position - 1] = (byte)(var1 + 128);
   }

   public void putBytes(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; var4++) {
         this.payload[++this.position - 1] = var1[var4];
      }

   }

   public int method632() {
      byte val = this.payload[++this.position - 1];

      int val2;
      for(val2 = 0; val < 0; val = this.payload[++this.position - 1]) {
         val2 = (val & 0x7f | val2) << 7;
      }

      return val2 | val;
   }

   public byte getByte() {
      return this.payload[++this.position - 1];
   }

   public byte getByteS() {
      return (byte)(128 - this.payload[++this.position - 1]);
   }

   public int getULEShort() {
      this.position += 2;
      return (this.payload[this.position - 2] & 0xff) + ((this.payload[this.position - 1] & 0xff) << 8);
   }

   public void putByteS(int var1) {
      this.payload[++this.position - 1] = (byte)(128 - var1);
   }

   public byte getByteA() {
      return (byte)(this.payload[++this.position - 1] - 128);
   }

   static final int method637(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      return ((var0 & 0xff00) * var3 + (var1 & 0xff00) * var2 & 0xff0000) + ((var1 & 0xff00ff) * var2 + (var0 & 0xff00ff) * var3 & 0xff00ff00) >> 8;
   }

   public void putVarByte(int var1) {
      this.payload[this.position - var1 - 1] = (byte)var1;
   }

   public boolean checkCrc() {
      this.position -= 4;
      int calc = Class58.getCrc(this.payload, 0, this.position);
      int excp = this.getInt();
      return calc == excp;
   }

   public void putCESU8(CharSequence sequence) {
      int length = sequence.length();
      int size = 0;

      for(int index = 0; index < length; index++) {
         char c = sequence.charAt(index);
         if(c <= 127) {
            ++size;
         } else if(c <= 2047) {
            size += 2;
         } else {
            size += 3;
         }
      }

      this.payload[++this.position - 1] = 0;
      this.putFlags(size);
      this.position += Class7.encodeCESU8(this.payload, this.position, sequence);
   }

   public int getUShortA() {
      this.position += 2;
      return ((this.payload[this.position - 2] & 0xff) << 8) + (this.payload[this.position - 1] - 128 & 0xff);
   }

   public void putLEShortA(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 + 128);
      this.payload[++this.position - 1] = (byte)(var1 >> 8);
   }

   public void putByteA(int var1) {
      this.payload[++this.position - 1] = (byte)(var1 + 128);
   }

   static void method644() {
      for(InterfaceNode node = (InterfaceNode)Client.interfaceNodes.method150(); node != null; node = (InterfaceNode)Client.interfaceNodes.method151()) {
         int type = node.type;
         if(IdentKitType.loadWidget(type)) {
            boolean var1 = true;
            Widget[] childs = Widget.interfaces[type];

            int var2;
            for(var2 = 0; var2 < childs.length; var2++) {
               if(childs[var2] != null) {
                  var1 = childs[var2].interactable;
                  break;
               }
            }

            if(!var1) {
               var2 = (int)node.key;
               Widget var5 = Class94.getWidget(var2);
               if(var5 != null) {
                  Class68.method326(var5);
               }
            }
         }
      }

   }

   public String method645() {
      byte var1 = this.payload[++this.position - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.position;

         while(this.payload[++this.position - 1] != 0) {
            ;
         }

         int var3 = this.position - var2 - 1;
         return var3 == 0 ? "" : LandscapeTile.getString(this.payload, var2, var3);
      }
   }

   static {
      int var3;
      for(int var4 = 0; var4 < 256; var4++) {
         int var2 = var4;

         for(var3 = 0; var3 < 8; var3++) {
            if((var2 & 0x1) == 1) {
               var2 = var2 >>> 1 ^ -306674912;
            } else {
               var2 >>>= 1;
            }
         }

         crc32Table[var4] = var2;
      }

      crc64Table = new long[256];

      for(var3 = 0; var3 < 256; var3++) {
         long var41 = (long)var3;

         for(int var0 = 0; var0 < 8; var0++) {
            if((var41 & 0x1) == 1L) {
               var41 = var41 >>> 1 ^ -3932672073523589310L;
            } else {
               var41 >>>= 1;
            }
         }

         crc64Table[var3] = var41;
      }

   }

}
