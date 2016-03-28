public class OverlayType extends DualNode {

   public static AbstractIndex overlay_ref;
   public int texture = -1;
   public int rgbColor = 0;
   public int otherRgbColor = -1;
   public boolean hideUnderlay = true;
   public int hue;
   public int saturation;
   public int lightness;
   public int otherHue;
   public int otherSaturation;
   public int otherLightness;
   public static NodeMap overlays = new NodeMap(64);

   void decode(ByteBuf var1, int var2) {
      while(true) {
         int var3 = var1.getUByte();
         if(var3 == 0) {
            return;
         }

         this.method713(var1, var3, var2);
      }
   }

   void method713(ByteBuf var1, int var2, int var3) {
      if(var2 == 1) {
         this.rgbColor = var1.getMedium();
      } else if(var2 == 2) {
         this.texture = var1.getUByte();
      } else if(var2 == 5) {
         this.hideUnderlay = false;
      } else if(var2 == 7) {
         this.otherRgbColor = var1.getMedium();
      } else if(var2 == 8) {
         ;
      }

   }

   void setHSL(int rgb) {
      double red = (double)(rgb >> 16 & 0xff) / 256.0D;
      double green = (double)(rgb >> 8 & 0xff) / 256.0D;
      double blue = (double)(rgb & 0xff) / 256.0D;
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
      double lightness = (max + min) / 2.0D;
      if(min != max) {
         if(lightness < 0.5D) {
            saturation = (max - min) / (min + max);
         }

         if(lightness >= 0.5D) {
            saturation = (max - min) / (2.0D - max - min);
         }

         if(max == red) {
            hue = (green - blue) / (max - min);
         } else if(green == max) {
            hue = (blue - red) / (max - min) + 2.0D;
         } else if(max == blue) {
            hue = (red - green) / (max - min) + 4.0D;
         }
      }

      hue /= 6.0D;
      this.hue = (int)(hue * 256.0D);
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

   }

   void post() {
      if(this.otherRgbColor != -1) {
         this.setHSL(this.otherRgbColor);
         this.otherHue = this.hue;
         this.otherSaturation = this.saturation;
         this.otherLightness = this.lightness;
      }

      this.setHSL(this.rgbColor);
   }

   public static String method716(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var4 = 0;

            for(long var2 = var0; var2 != 0L; var2 /= 37L) {
               ++var4;
            }

            char var3;
            StringBuilder var8;
            for(var8 = new StringBuilder(var4); var0 != 0L; var8.append(var3)) {
               long var7 = var0;
               var0 /= 37L;
               var3 = Class91.aCharArray723[(int)(var7 - var0 * 37L)];
               if(var3 == 95) {
                  int var9 = var8.length() - 1;
                  var8.setCharAt(var9, java.lang.Character.toUpperCase(var8.charAt(var9)));
                  var3 = 160;
               }
            }

            var8.reverse();
            var8.setCharAt(0, java.lang.Character.toUpperCase(var8.charAt(0)));
            return var8.toString();
         }
      } else {
         return null;
      }
   }

}
