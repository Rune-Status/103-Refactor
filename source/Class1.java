public class Class1 {

   static CacheIndex texturesIndex;
   public static FileRequest currentRequest;
   static Class1 aClass1_1 = new Class1();
   static Class1 aClass1_2 = new Class1();
   static Class1 aClass1_3 = new Class1();
   static Class1 aClass1_6 = new Class1();

   static final String method13(int var0) {
      return var0 < 100000 ? "<col=ffff00>" + var0 + "</col>" : (var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>");
   }

   static final void method14(int var0) {
      short var1 = 256;
      Class6.anInt114 += var0 * 128;
      int var2;
      if(Class6.anInt114 > Class33.anIntArray365.length) {
         Class6.anInt114 -= Class33.anIntArray365.length;
         var2 = (int)(Math.random() * 12.0D);
         VarBitType.method877(Class6.runesSprite[var2]);
      }

      var2 = 0;
      int var4 = var0 * 128;
      int var5 = (var1 - var0) * 128;

      int var3;
      int var7;
      for(var3 = 0; var3 < var5; var3++) {
         var7 = Class122.anIntArray818[var2 + var4] - Class33.anIntArray365[Class6.anInt114 + var2 & Class33.anIntArray365.length - 1] * var0 / 6;
         if(var7 < 0) {
            var7 = 0;
         }

         Class122.anIntArray818[var2++] = var7;
      }

      int var6;
      int var8;
      for(var3 = var1 - var0; var3 < var1; var3++) {
         var7 = var3 * 128;

         for(var8 = 0; var8 < 128; var8++) {
            var6 = (int)(Math.random() * 100.0D);
            if(var6 < 50 && var8 > 10 && var8 < 118) {
               Class122.anIntArray818[var8 + var7] = 255;
            } else {
               Class122.anIntArray818[var8 + var7] = 0;
            }
         }
      }

      if(Class6.anInt138 > 0) {
         Class6.anInt138 -= var0 * 4;
      }

      if(Class6.anInt127 > 0) {
         Class6.anInt127 -= var0 * 4;
      }

      if(Class6.anInt138 == 0 && Class6.anInt127 == 0) {
         var3 = (int)(Math.random() * (double)(2000 / var0));
         if(var3 == 0) {
            Class6.anInt138 = 1024;
         }

         if(var3 == 1) {
            Class6.anInt127 = 1024;
         }
      }

      for(var3 = 0; var3 < var1 - var0; var3++) {
         Class6.anIntArray145[var3] = Class6.anIntArray145[var3 + var0];
      }

      for(var3 = var1 - var0; var3 < var1; var3++) {
         Class6.anIntArray145[var3] = (int)(Math.sin((double)Class6.anInt130 / 14.0D) * 16.0D + Math.sin((double)Class6.anInt130 / 15.0D) * 14.0D + Math.sin((double)Class6.anInt130 / 16.0D) * 12.0D);
         ++Class6.anInt130;
      }

      Class6.anInt129 += var0 * -809494109;
      var3 = ((Client.engineCycle & 0x1) + var0) / 2;
      if(var3 > 0) {
         for(var7 = 0; var7 < Class6.anInt129 * 1962167372; var7++) {
            var8 = (int)(Math.random() * 124.0D) + 2;
            var6 = (int)(Math.random() * 128.0D) + 128;
            Class122.anIntArray818[(var6 << 7) + var8] = 192;
         }

         Class6.anInt129 = 0;

         int var9;
         for(var7 = 0; var7 < var1; var7++) {
            var8 = 0;
            var6 = var7 * 128;

            for(var9 = -var3; var9 < 128; var9++) {
               if(var3 + var9 < 128) {
                  var8 += Class122.anIntArray818[var3 + var6 + var9];
               }

               if(var9 - (var3 + 1) >= 0) {
                  var8 -= Class122.anIntArray818[var6 + var9 - (var3 + 1)];
               }

               if(var9 >= 0) {
                  Class4.anIntArray110[var6 + var9] = var8 / (var3 * 2 + 1);
               }
            }
         }

         for(var7 = 0; var7 < 128; var7++) {
            var8 = 0;

            for(var6 = -var3; var6 < var1; var6++) {
               var9 = var6 * 128;
               if(var6 + var3 < var1) {
                  var8 += Class4.anIntArray110[var9 + var7 + var3 * 128];
               }

               if(var6 - (var3 + 1) >= 0) {
                  var8 -= Class4.anIntArray110[var9 + var7 - (var3 + 1) * 128];
               }

               if(var6 >= 0) {
                  Class122.anIntArray818[var7 + var9] = var8 / (var3 * 2 + 1);
               }
            }
         }
      }

   }

}
