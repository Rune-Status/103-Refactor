public final class Class38 {

   boolean aBool415 = true;
   int anInt416;
   int anInt422;
   int anInt418;
   int anInt419;
   int[] anIntArray424;
   int[] anIntArray425;
   int[] anIntArray407;
   int[] anIntArray411;
   int[] anIntArray426;
   int[] anIntArray413;
   int[] anIntArray417;
   int[] anIntArray409;
   int[] anIntArray410;
   int[] anIntArray414;
   static int[] anIntArray405 = new int[6];
   static int[][] anIntArrayArray406 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
   static int[] anIntArray408 = new int[6];
   static int[] anIntArray412 = new int[6];
   static int[] anIntArray420 = new int[6];
   static int[] anIntArray421 = new int[6];
   static int[][] anIntArrayArray423 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};

   Class38(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
      if(var6 != var7 || var6 != var8 || var6 != var9) {
         this.aBool415 = false;
      }

      this.anInt416 = var1;
      this.anInt422 = var2;
      this.anInt418 = var18;
      this.anInt419 = var19;
      short var23 = 128;
      int var33 = var23 / 2;
      int var25 = var23 / 4;
      int var26 = var23 * 3 / 4;
      int[] var29 = anIntArrayArray406[var1];
      int var30 = var29.length;
      this.anIntArray424 = new int[var30];
      this.anIntArray425 = new int[var30];
      this.anIntArray407 = new int[var30];
      int[] var27 = new int[var30];
      int[] var37 = new int[var30];
      int var34 = var4 * var23;
      int var24 = var5 * var23;

      int var20;
      int var21;
      int var22;
      int var31;
      int var35;
      int var36;
      for(int var38 = 0; var38 < var30; var38++) {
         var21 = var29[var38];
         if((var21 & 0x1) == 0 && var21 <= 8) {
            var21 = (var21 - var2 - var2 - 1 & 0x7) + 1;
         }

         if(var21 > 8 && var21 <= 12) {
            var21 = (var21 - 9 - var2 & 0x3) + 9;
         }

         if(var21 > 12 && var21 <= 16) {
            var21 = (var21 - 13 - var2 & 0x3) + 13;
         }

         if(var21 == 1) {
            var35 = var34;
            var22 = var24;
            var20 = var6;
            var36 = var10;
            var31 = var14;
         } else if(var21 == 2) {
            var35 = var34 + var33;
            var22 = var24;
            var20 = var6 + var7 >> 1;
            var36 = var10 + var11 >> 1;
            var31 = var14 + var15 >> 1;
         } else if(var21 == 3) {
            var35 = var34 + var23;
            var22 = var24;
            var20 = var7;
            var36 = var11;
            var31 = var15;
         } else if(var21 == 4) {
            var35 = var34 + var23;
            var22 = var24 + var33;
            var20 = var7 + var8 >> 1;
            var36 = var11 + var12 >> 1;
            var31 = var15 + var16 >> 1;
         } else if(var21 == 5) {
            var35 = var34 + var23;
            var22 = var24 + var23;
            var20 = var8;
            var36 = var12;
            var31 = var16;
         } else if(var21 == 6) {
            var35 = var34 + var33;
            var22 = var24 + var23;
            var20 = var8 + var9 >> 1;
            var36 = var12 + var13 >> 1;
            var31 = var16 + var17 >> 1;
         } else if(var21 == 7) {
            var35 = var34;
            var22 = var24 + var23;
            var20 = var9;
            var36 = var13;
            var31 = var17;
         } else if(var21 == 8) {
            var35 = var34;
            var22 = var24 + var33;
            var20 = var9 + var6 >> 1;
            var36 = var13 + var10 >> 1;
            var31 = var17 + var14 >> 1;
         } else if(var21 == 9) {
            var35 = var34 + var33;
            var22 = var24 + var25;
            var20 = var6 + var7 >> 1;
            var36 = var10 + var11 >> 1;
            var31 = var14 + var15 >> 1;
         } else if(var21 == 10) {
            var35 = var34 + var26;
            var22 = var24 + var33;
            var20 = var7 + var8 >> 1;
            var36 = var11 + var12 >> 1;
            var31 = var15 + var16 >> 1;
         } else if(var21 == 11) {
            var35 = var34 + var33;
            var22 = var24 + var26;
            var20 = var8 + var9 >> 1;
            var36 = var12 + var13 >> 1;
            var31 = var16 + var17 >> 1;
         } else if(var21 == 12) {
            var35 = var34 + var25;
            var22 = var24 + var33;
            var20 = var9 + var6 >> 1;
            var36 = var13 + var10 >> 1;
            var31 = var17 + var14 >> 1;
         } else if(var21 == 13) {
            var35 = var34 + var25;
            var22 = var24 + var25;
            var20 = var6;
            var36 = var10;
            var31 = var14;
         } else if(var21 == 14) {
            var35 = var34 + var26;
            var22 = var24 + var25;
            var20 = var7;
            var36 = var11;
            var31 = var15;
         } else if(var21 == 15) {
            var35 = var34 + var26;
            var22 = var24 + var26;
            var20 = var8;
            var36 = var12;
            var31 = var16;
         } else {
            var35 = var34 + var25;
            var22 = var24 + var26;
            var20 = var9;
            var36 = var13;
            var31 = var17;
         }

         this.anIntArray424[var38] = var35;
         this.anIntArray425[var38] = var20;
         this.anIntArray407[var38] = var22;
         var27[var38] = var36;
         var37[var38] = var31;
      }

      int[] var381 = anIntArrayArray423[var1];
      var21 = var381.length / 4;
      this.anIntArray411 = new int[var21];
      this.anIntArray426 = new int[var21];
      this.anIntArray413 = new int[var21];
      this.anIntArray417 = new int[var21];
      this.anIntArray409 = new int[var21];
      this.anIntArray410 = new int[var21];
      if(var3 != -1) {
         this.anIntArray414 = new int[var21];
      }

      var35 = 0;

      for(var22 = 0; var22 < var21; var22++) {
         var20 = var381[var35];
         var36 = var381[var35 + 1];
         var31 = var381[var35 + 2];
         int var28 = var381[var35 + 3];
         var35 += 4;
         if(var36 < 4) {
            var36 = var36 - var2 & 0x3;
         }

         if(var31 < 4) {
            var31 = var31 - var2 & 0x3;
         }

         if(var28 < 4) {
            var28 = var28 - var2 & 0x3;
         }

         this.anIntArray411[var22] = var36;
         this.anIntArray426[var22] = var31;
         this.anIntArray413[var22] = var28;
         if(var20 == 0) {
            this.anIntArray417[var22] = var27[var36];
            this.anIntArray409[var22] = var27[var31];
            this.anIntArray410[var22] = var27[var28];
            if(this.anIntArray414 != null) {
               this.anIntArray414[var22] = -1;
            }
         } else {
            this.anIntArray417[var22] = var37[var36];
            this.anIntArray409[var22] = var37[var31];
            this.anIntArray410[var22] = var37[var28];
            if(this.anIntArray414 != null) {
               this.anIntArray414[var22] = var3;
            }
         }
      }

      var22 = var6;
      var20 = var7;
      if(var7 < var6) {
         var22 = var7;
      }

      if(var7 > var7) {
         var20 = var7;
      }

      if(var8 < var22) {
         var22 = var8;
      }

      if(var8 > var20) {
         var20 = var8;
      }

      if(var9 < var22) {
         var22 = var9;
      }

      if(var9 > var20) {
         var20 = var9;
      }

      var22 /= 14;
      var20 /= 14;
   }

}
