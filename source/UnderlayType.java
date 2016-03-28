public class UnderlayType extends DualNode {

   static AbstractIndex underlay_ref;
   int rgbColor = 0;
   public int saturation;
   public int lightness;
   public int pCDivider;
   public int hue;
   static NodeMap underlays = new NodeMap(64);

   void post() {
      this.setHSL(this.rgbColor);
   }

   void decode(ByteBuf buf, int var2) {
      while(true) {
         int opcode = buf.getUByte();
         if(opcode == 0) {
            return;
         }

         this.decode(buf, opcode, var2);
      }
   }

   void setHSL(int rgbColor) {
      double red = (double)(rgbColor >> 16 & 0xff) / 256.0D;
      double green = (double)(rgbColor >> 8 & 0xff) / 256.0D;
      double blue = (double)(rgbColor & 0xff) / 256.0D;
      double min = red;
      if(green < red) {
         min = green;
      }

      if(blue < min) {
         min = blue;
      }

      double max = red;
      if(green > red) {
         max = green;
      }

      if(blue > max) {
         max = blue;
      }

      double hue = 0.0D;
      double saturation = 0.0D;
      double lightness = (min + max) / 2.0D;
      if(max != min) {
         if(lightness < 0.5D) {
            saturation = (max - min) / (max + min);
         }

         if(lightness >= 0.5D) {
            saturation = (max - min) / (2.0D - max - min);
         }

         if(max == red) {
            hue = (green - blue) / (max - min);
         } else if(max == green) {
            hue = (blue - red) / (max - min) + 2.0D;
         } else if(max == blue) {
            hue = (red - green) / (max - min) + 4.0D;
         }
      }

      hue /= 6.0D;
      this.saturation = (int)(saturation * 256.0D);
      this.lightness = (int)(lightness * 256.0D);
      if(this.saturation < 0) {
         this.saturation = 0;
      } else if(this.saturation > 255) {
         this.saturation = 255;
      }

      if(this.lightness < 0) {
         this.lightness = 0;
      } else if(this.lightness > 255) {
         this.lightness = 255;
      }

      if(lightness > 0.5D) {
         this.pCDivider = (int)((1.0D - lightness) * saturation * 512.0D);
      } else {
         this.pCDivider = (int)(saturation * 512.0D * lightness);
      }

      if(this.pCDivider < 1) {
         this.pCDivider = 1;
      }

      this.hue = (int)((double)this.pCDivider * hue);
   }

   static void method704(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var4 = new int[4];
      var2[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var3 = 0; var3 < 4; var3++) {
         if(World.anIntArray1118[var3] != var0) {
            var2[var5] = World.anIntArray1118[var3];
            var4[var5] = World.anIntArray1119[var3];
            ++var5;
         }
      }

      World.anIntArray1118 = var2;
      World.anIntArray1119 = var4;
      Permission.method331(World.worlds, 0, World.worlds.length - 1, World.anIntArray1118, World.anIntArray1119);
   }

   static void method705() {
      for(int var0 = 0; var0 < Client.menuItemCount; var0++) {
         if(Class33.method199(Client.menuOpcodes[var0])) {
            if(var0 < Client.menuItemCount - 1) {
               for(int var1 = var0; var1 < Client.menuItemCount - 1; var1++) {
                  Client.menuActions[var1] = Client.menuActions[var1 + 1];
                  Client.menuNouns[var1] = Client.menuNouns[var1 + 1];
                  Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
                  Client.menuArg0[var1] = Client.menuArg0[var1 + 1];
                  Client.menuArg1[var1] = Client.menuArg1[var1 + 1];
                  Client.menuArg2[var1] = Client.menuArg2[var1 + 1];
               }
            }

            --Client.menuItemCount;
         }
      }

   }

   void decode(ByteBuf buf, int opcode, int var3) {
      if(opcode == 1) {
         this.rgbColor = buf.getMedium();
      }

   }

   static final byte[] decodeContainer(byte[] bytes) {
      ByteBuf buf = new ByteBuf(bytes);
      int type = buf.getUByte();
      int size = buf.getInt();
      if(size < 0 || AbstractIndex.anInt710 != 0 && size > AbstractIndex.anInt710) {
         throw new RuntimeException();
      } else if(type == 0) {
         byte[] uSize1 = new byte[size];
         buf.getBytes(uSize1, 0, size);
         return uSize1;
      } else {
         int uSize = buf.getInt();
         if(uSize < 0 || AbstractIndex.anInt710 != 0 && uSize > AbstractIndex.anInt710) {
            throw new RuntimeException();
         } else {
            byte[] data = new byte[uSize];
            if(type == 1) {
               Class55.bunzip2(data, uSize, bytes, size, 9);
            } else {
               AbstractIndex.gzip.decompress(buf, data);
            }

            return data;
         }
      }
   }

}
