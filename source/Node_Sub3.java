public class Node_Sub3 extends Node {

   static int anInt1232;
   static int anInt1224;
   static int anInt1237;
   static int anInt1234;
   static float[] aFloatArray1246;
   static Class12[] aClass12Array1243;
   static Class18[] aClass18Array1236;
   static Class9[] aClass9Array1230;
   static Class17[] aClass17Array1238;
   static boolean[] aBoolArray1239;
   static int[] anIntArray1233;
   static float[] aFloatArray1247;
   static float[] aFloatArray1248;
   static float[] aFloatArray1250;
   static int[] anIntArray1253;
   static float[] aFloatArray1249;
   static float[] aFloatArray1251;
   static float[] aFloatArray1231;
   static int[] anIntArray1254;
   static boolean aBool1241 = false;
   int anInt1225;
   float[] aFloatArray1242;
   byte[] aByteArray1235;
   int anInt1227;
   int anInt1257;
   int anInt1240;
   int anInt1226;
   int anInt1256;
   int anInt1228;
   boolean aBool1229;
   byte[][] aByteArrayArray1255;
   static byte[] aByteArray1252;
   int anInt1244;
   boolean aBool1245;

   static int method515() {
      int var0 = aByteArray1252[anInt1224] >> anInt1232 & 0x1;
      ++anInt1232;
      anInt1224 += anInt1232 >> 3;
      anInt1232 &= 7;
      return var0;
   }

   static void method516(byte[] var0) {
      method521(var0, 0);
      anInt1237 = 1 << method517(4);
      anInt1234 = 1 << method517(4);
      aFloatArray1246 = new float[anInt1234];

      int var1;
      int var2;
      int var3;
      int var6;
      int var7;
      for(var6 = 0; var6 < 2; var6++) {
         var7 = var6 != 0 ? anInt1234 : anInt1237;
         var3 = var7 >> 1;
         var2 = var7 >> 2;
         var1 = var7 >> 3;
         float[] var19 = new float[var3];

         for(int var18 = 0; var18 < var2; var18++) {
            var19[var18 * 2] = (float)Math.cos((double)(var18 * 4) * 3.141592653589793D / (double)var7);
            var19[var18 * 2 + 1] = -((float)Math.sin((double)(var18 * 4) * 3.141592653589793D / (double)var7));
         }

         float[] var16 = new float[var3];

         for(int var20 = 0; var20 < var2; var20++) {
            var16[var20 * 2] = (float)Math.cos((double)(var20 * 2 + 1) * 3.141592653589793D / (double)(var7 * 2));
            var16[var20 * 2 + 1] = (float)Math.sin((double)(var20 * 2 + 1) * 3.141592653589793D / (double)(var7 * 2));
         }

         float[] var17 = new float[var2];

         for(int var21 = 0; var21 < var1; var21++) {
            var17[var21 * 2] = (float)Math.cos((double)(var21 * 4 + 2) * 3.141592653589793D / (double)var7);
            var17[var21 * 2 + 1] = -((float)Math.sin((double)(var21 * 4 + 2) * 3.141592653589793D / (double)var7));
         }

         int[] var181 = new int[var1];
         int var12 = DualNode_Sub8.method709(var1 - 1);

         for(int var8 = 0; var8 < var1; var8++) {
            int var5 = var8;
            int var13 = var12;

            int var15;
            for(var15 = 0; var13 > 0; --var13) {
               var15 = var15 << 1 | var5 & 0x1;
               var5 >>>= 1;
            }

            var181[var8] = var15;
         }

         if(var6 != 0) {
            aFloatArray1249 = var19;
            aFloatArray1251 = var16;
            aFloatArray1231 = var17;
            anIntArray1254 = var181;
         } else {
            aFloatArray1247 = var19;
            aFloatArray1248 = var16;
            aFloatArray1250 = var17;
            anIntArray1253 = var181;
         }
      }

      var6 = method517(8) + 1;
      aClass12Array1243 = new Class12[var6];

      for(var7 = 0; var7 < var6; var7++) {
         aClass12Array1243[var7] = new Class12();
      }

      var7 = method517(6) + 1;

      for(var3 = 0; var3 < var7; var3++) {
         method517(16);
      }

      var7 = method517(6) + 1;
      aClass18Array1236 = new Class18[var7];

      for(var3 = 0; var3 < var7; var3++) {
         aClass18Array1236[var3] = new Class18();
      }

      var3 = method517(6) + 1;
      aClass9Array1230 = new Class9[var3];

      for(var2 = 0; var2 < var3; var2++) {
         aClass9Array1230[var2] = new Class9();
      }

      var2 = method517(6) + 1;
      aClass17Array1238 = new Class17[var2];

      for(var1 = 0; var1 < var2; var1++) {
         aClass17Array1238[var1] = new Class17();
      }

      var1 = method517(6) + 1;
      aBoolArray1239 = new boolean[var1];
      anIntArray1233 = new int[var1];

      for(int var151 = 0; var151 < var1; var151++) {
         aBoolArray1239[var151] = method515() != 0;
         method517(16);
         method517(16);
         anIntArray1233[var151] = method517(8);
      }

   }

   static int method517(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - anInt1232; var0 -= var3) {
         var3 = 8 - anInt1232;
         int var4 = (1 << var3) - 1;
         var1 += (aByteArray1252[anInt1224] >> anInt1232 & var4) << var2;
         anInt1232 = 0;
         ++anInt1224;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (aByteArray1252[anInt1224] >> anInt1232 & var3) << var2;
         anInt1232 += var0;
      }

      return var1;
   }

   static boolean method518(AbstractIndex var0) {
      if(!aBool1241) {
         byte[] var1 = var0.getFile(0, 0);
         if(var1 == null) {
            return false;
         }

         method516(var1);
         aBool1241 = true;
      }

      return true;
   }

   Node_Sub2_Sub1 method519(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.aByteArray1235 == null) {
            this.anInt1225 = 0;
            this.aFloatArray1242 = new float[anInt1234];
            this.aByteArray1235 = new byte[this.anInt1226];
            this.anInt1227 = 0;
            this.anInt1257 = 0;
         }

         for(; this.anInt1257 < this.aByteArrayArray1255.length; this.anInt1257++) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var7 = this.method523(this.anInt1257);
            if(var7 != null) {
               int var5 = this.anInt1227;
               int var6 = var7.length;
               if(var6 > this.anInt1226 - var5) {
                  var6 = this.anInt1226 - var5;
               }

               for(int var3 = 0; var3 < var6; var3++) {
                  int var4 = (int)(var7[var3] * 128.0F + 128.0F);
                  if((var4 & 0xffffff00) != 0) {
                     var4 = ~var4 >> 31;
                  }

                  this.aByteArray1235[var5++] = (byte)(var4 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var5 - this.anInt1227;
               }

               this.anInt1227 = var5;
            }
         }

         this.aFloatArray1242 = null;
         byte[] var71 = this.aByteArray1235;
         this.aByteArray1235 = null;
         return new Node_Sub2_Sub1(this.anInt1240, var71, this.anInt1256, this.anInt1228, this.aBool1229);
      }
   }

   void method520(byte[] var1) {
      ByteBuf var2 = new ByteBuf(var1);
      this.anInt1240 = var2.getInt();
      this.anInt1226 = var2.getInt();
      this.anInt1256 = var2.getInt();
      this.anInt1228 = var2.getInt();
      if(this.anInt1228 < 0) {
         this.anInt1228 = ~this.anInt1228;
         this.aBool1229 = true;
      }

      int var5 = var2.getInt();
      this.aByteArrayArray1255 = new byte[var5][];

      for(int var3 = 0; var3 < var5; var3++) {
         int var6 = 0;

         int var4;
         do {
            var4 = var2.getUByte();
            var6 += var4;
         } while(var4 >= 255);

         byte[] var7 = new byte[var6];
         var2.getBytes(var7, 0, var6);
         this.aByteArrayArray1255[var3] = var7;
      }

   }

   static void method521(byte[] var0, int var1) {
      aByteArray1252 = var0;
      anInt1224 = var1;
      anInt1232 = 0;
   }

   static Node_Sub3 method522(AbstractIndex var0, int var1, int var2) {
      if(!method518(var0)) {
         var0.method388(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.getFile(var1, var2);
         return var3 == null ? null : new Node_Sub3(var3);
      }
   }

   Node_Sub3(byte[] var1) {
      this.method520(var1);
   }

   float[] method523(int var1) {
      method521(this.aByteArrayArray1255[var1], 0);
      method515();
      int var25 = method517(DualNode_Sub8.method709(anIntArray1233.length - 1));
      boolean var10 = aBoolArray1239[var25];
      int var9 = var10 ? anInt1234 : anInt1237;
      boolean var13 = false;
      boolean var14 = false;
      if(var10) {
         var13 = method515() != 0;
         var14 = method515() != 0;
      }

      int var22 = var9 >> 1;
      int var11;
      int var19;
      int var21;
      if(var10 && !var13) {
         var11 = (var9 >> 2) - (anInt1237 >> 2);
         var19 = (var9 >> 2) + (anInt1237 >> 2);
         var21 = anInt1237 >> 1;
      } else {
         var11 = 0;
         var19 = var22;
         var21 = var9 >> 1;
      }

      int var20;
      int var23;
      int var24;
      if(var10 && !var14) {
         var23 = var9 - (var9 >> 2) - (anInt1237 >> 2);
         var20 = var9 - (var9 >> 2) + (anInt1237 >> 2);
         var24 = anInt1237 >> 1;
      } else {
         var23 = var22;
         var20 = var9;
         var24 = var9 >> 1;
      }

      Class17 var26 = aClass17Array1238[anIntArray1233[var25]];
      int var27 = var26.anInt249;
      int var28 = var26.anIntArray248[var27];
      boolean var29 = !aClass18Array1236[var28].method134();
      boolean var50 = var29;

      for(var28 = 0; var28 < var26.anInt247; var28++) {
         Class9 var51 = aClass9Array1230[var26.anIntArray250[var28]];
         float[] var47 = aFloatArray1246;
         var51.method97(var47, var9 >> 1, var50);
      }

      int var48;
      if(!var29) {
         var28 = var26.anInt249;
         var48 = var26.anIntArray248[var28];
         aClass18Array1236[var48].method136(aFloatArray1246, var9 >> 1);
      }

      float[] var52;
      int var53;
      int var491;
      if(var29) {
         for(var28 = var9 >> 1; var28 < var9; var28++) {
            aFloatArray1246[var28] = 0.0F;
         }
      } else {
         var28 = var9 >> 1;
         var48 = var9 >> 2;
         var491 = var9 >> 3;
         var52 = aFloatArray1246;

         for(var53 = 0; var53 < var28; var53++) {
            var52[var53] *= 0.5F;
         }

         for(var53 = var28; var53 < var9; var53++) {
            var52[var53] = -var52[var9 - var53 - 1];
         }

         float[] var54 = var10 ? aFloatArray1249 : aFloatArray1247;
         float[] var34 = var10 ? aFloatArray1251 : aFloatArray1248;
         float[] var18 = var10 ? aFloatArray1231 : aFloatArray1250;
         int[] var39 = var10 ? anIntArray1254 : anIntArray1253;

         float var2;
         float var3;
         float var5;
         int var16;
         float var17;
         for(var16 = 0; var16 < var48; var16++) {
            var17 = var52[var16 * 4] - var52[var9 - var16 * 4 - 1];
            var5 = var52[var16 * 4 + 2] - var52[var9 - var16 * 4 - 3];
            var2 = var54[var16 * 2];
            var3 = var54[var16 * 2 + 1];
            var52[var9 - var16 * 4 - 1] = var17 * var2 - var5 * var3;
            var52[var9 - var16 * 4 - 3] = var17 * var3 + var5 * var2;
         }

         float var4;
         float var6;
         for(var16 = 0; var16 < var491; var16++) {
            var17 = var52[var28 + 3 + var16 * 4];
            var5 = var52[var28 + 1 + var16 * 4];
            var2 = var52[var16 * 4 + 3];
            var3 = var52[var16 * 4 + 1];
            var52[var28 + 3 + var16 * 4] = var17 + var2;
            var52[var28 + 1 + var16 * 4] = var5 + var3;
            var6 = var54[var28 - 4 - var16 * 4];
            var4 = var54[var28 - 3 - var16 * 4];
            var52[var16 * 4 + 3] = (var17 - var2) * var6 - (var5 - var3) * var4;
            var52[var16 * 4 + 1] = (var5 - var3) * var6 + (var17 - var2) * var4;
         }

         var16 = DualNode_Sub8.method709(var9 - 1);

         int var40;
         int var41;
         int var43;
         int var49;
         for(var49 = 0; var49 < var16 - 3; var49++) {
            var43 = var9 >> var49 + 2;
            var40 = 8 << var49;

            for(var41 = 0; var41 < 2 << var49; var41++) {
               int var45 = var9 - var43 * 2 * var41;
               int var46 = var9 - (var41 * 2 + 1) * var43;

               for(int var7 = 0; var7 < var9 >> var49 + 4; var7++) {
                  int var8 = var7 * 4;
                  float var35 = var52[var45 - 1 - var8];
                  float var31 = var52[var45 - 3 - var8];
                  float var36 = var52[var46 - 1 - var8];
                  float var32 = var52[var46 - 3 - var8];
                  var52[var45 - 1 - var8] = var35 + var36;
                  var52[var45 - 3 - var8] = var31 + var32;
                  float var37 = var54[var7 * var40];
                  float var38 = var54[var7 * var40 + 1];
                  var52[var46 - 1 - var8] = (var35 - var36) * var37 - (var31 - var32) * var38;
                  var52[var46 - 3 - var8] = (var31 - var32) * var37 + (var35 - var36) * var38;
               }
            }
         }

         for(var49 = 1; var49 < var491 - 1; var49++) {
            var43 = var39[var49];
            if(var49 < var43) {
               var40 = var49 * 8;
               var41 = var43 * 8;
               var6 = var52[var40 + 1];
               var52[var40 + 1] = var52[var41 + 1];
               var52[var41 + 1] = var6;
               var6 = var52[var40 + 3];
               var52[var40 + 3] = var52[var41 + 3];
               var52[var41 + 3] = var6;
               var6 = var52[var40 + 5];
               var52[var40 + 5] = var52[var41 + 5];
               var52[var41 + 5] = var6;
               var6 = var52[var40 + 7];
               var52[var40 + 7] = var52[var41 + 7];
               var52[var41 + 7] = var6;
            }
         }

         for(var49 = 0; var49 < var28; var49++) {
            var52[var49] = var52[var49 * 2 + 1];
         }

         for(var49 = 0; var49 < var491; var49++) {
            var52[var9 - 1 - var49 * 2] = var52[var49 * 4];
            var52[var9 - 2 - var49 * 2] = var52[var49 * 4 + 1];
            var52[var9 - var48 - 1 - var49 * 2] = var52[var49 * 4 + 2];
            var52[var9 - var48 - 2 - var49 * 2] = var52[var49 * 4 + 3];
         }

         for(var49 = 0; var49 < var491; var49++) {
            var5 = var18[var49 * 2];
            var2 = var18[var49 * 2 + 1];
            var3 = var52[var49 * 2 + var28];
            var6 = var52[var49 * 2 + var28 + 1];
            var4 = var52[var9 - 2 - var49 * 2];
            float var511 = var52[var9 - 1 - var49 * 2];
            float var521 = (var3 - var4) * var2 + (var6 + var511) * var5;
            var52[var49 * 2 + var28] = (var3 + var4 + var521) * 0.5F;
            var52[var9 - 2 - var49 * 2] = (var3 + var4 - var521) * 0.5F;
            var521 = (var6 + var511) * var2 - (var3 - var4) * var5;
            var52[var49 * 2 + var28 + 1] = (var6 - var511 + var521) * 0.5F;
            var52[var9 - 1 - var49 * 2] = (-var6 + var511 + var521) * 0.5F;
         }

         for(var49 = 0; var49 < var48; var49++) {
            var52[var49] = var52[var49 * 2 + var28] * var34[var49 * 2] + var52[var49 * 2 + 1 + var28] * var34[var49 * 2 + 1];
            var52[var28 - 1 - var49] = var52[var49 * 2 + var28] * var34[var49 * 2 + 1] - var52[var49 * 2 + 1 + var28] * var34[var49 * 2];
         }

         for(var49 = 0; var49 < var48; var49++) {
            var52[var9 - var48 + var49] = -var52[var49];
         }

         for(var49 = 0; var49 < var48; var49++) {
            var52[var49] = var52[var48 + var49];
         }

         for(var49 = 0; var49 < var48; var49++) {
            var52[var48 + var49] = -var52[var48 - var49 - 1];
         }

         for(var49 = 0; var49 < var48; var49++) {
            var52[var28 + var49] = var52[var9 - var49 - 1];
         }

         for(var49 = var11; var49 < var19; var49++) {
            var5 = (float)Math.sin(((double)(var49 - var11) + 0.5D) / (double)var21 * 0.5D * 3.141592653589793D);
            aFloatArray1246[var49] *= (float)Math.sin((double)var5 * 1.5707963267948966D * (double)var5);
         }

         for(var49 = var23; var49 < var20; var49++) {
            var5 = (float)Math.sin(((double)(var49 - var23) + 0.5D) / (double)var24 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            aFloatArray1246[var49] *= (float)Math.sin((double)var5 * 1.5707963267948966D * (double)var5);
         }
      }

      var52 = null;
      if(this.anInt1225 > 0) {
         var48 = this.anInt1225 + var9 >> 2;
         var52 = new float[var48];
         if(!this.aBool1245) {
            for(var491 = 0; var491 < this.anInt1244; var491++) {
               var53 = (this.anInt1225 >> 1) + var491;
               var52[var491] += this.aFloatArray1242[var53];
            }
         }

         if(!var29) {
            for(var491 = var11; var491 < var9 >> 1; var491++) {
               var53 = var52.length - (var9 >> 1) + var491;
               var52[var53] += aFloatArray1246[var491];
            }
         }
      }

      float[] var501 = this.aFloatArray1242;
      this.aFloatArray1242 = aFloatArray1246;
      aFloatArray1246 = var501;
      this.anInt1225 = var9;
      this.anInt1244 = var20 - (var9 >> 1);
      this.aBool1245 = var29;
      return var52;
   }

   static float method524(int var0) {
      int var1 = var0 & 0x1fffff;
      int var3 = var0 & 0x80000000;
      int var2 = (var0 & 0x7fe00000) >> 21;
      if(var3 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var2 - 788)));
   }

}
