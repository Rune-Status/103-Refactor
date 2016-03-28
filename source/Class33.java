public class Class33 {

   String[] aStringArray360;
   RuneScript aRuneScript361;
   int[] anIntArray362;
   static VarClientHub aClass28_364;
   static int[] anIntArray365;
   int anInt363 = -1;

   static final int method197(int var0, int var1) {
      int var2 = VarClientType.method721(var0 - 1, var1 - 1) + VarClientType.method721(var0 + 1, var1 - 1) + VarClientType.method721(var0 - 1, var1 + 1) + VarClientType.method721(var0 + 1, var1 + 1);
      int var4 = VarClientType.method721(var0 - 1, var1) + VarClientType.method721(var0 + 1, var1) + VarClientType.method721(var0, var1 - 1) + VarClientType.method721(var0, var1 + 1);
      int var3 = VarClientType.method721(var0, var1);
      return var3 / 4 + var4 / 8 + var2 / 16;
   }

   static void method198(int var0) {
      ItemTable var1 = (ItemTable)ItemTable.itemTables.get((long)var0);
      if(var1 != null) {
         var1.unlink();
      }

   }

   static boolean method199(int var0) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }

   static final int method200(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 0x7f) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 0xff80) + var1;
      }
   }

}
