public abstract class Class48 {

   public int anInt509;
   public int anInt510;
   public int anInt511;
   public int anInt512;

   protected abstract boolean method245(int var1, int var2, int var3, CollisionMap var4, int var5);

   public static String method246(String var0) {
      int var1 = var0.length();
      char[] var4 = new char[var1];
      byte var3 = 2;

      for(int var5 = 0; var5 < var1; var5++) {
         char var2 = var0.charAt(var5);
         if(var3 != 0) {
            if(var3 == 2 || java.lang.Character.isUpperCase(var2)) {
               var2 = VarBitType.method878(var2);
            }
         } else {
            var2 = java.lang.Character.toLowerCase(var2);
         }

         if(!java.lang.Character.isLetter(var2)) {
            if(var2 != 46 && var2 != 63 && var2 != 33) {
               if(java.lang.Character.isSpaceChar(var2)) {
                  if(var3 != 2) {
                     var3 = 1;
                  }
               } else {
                  var3 = 1;
               }
            } else {
               var3 = 2;
            }
         } else {
            var3 = 0;
         }

         var4[var5] = var2;
      }

      return new String(var4);
   }

   static int method247(World var0, World var1, int var2, boolean var3) {
      if(var2 == 1) {
         int var5 = var0.population;
         int var4 = var1.population;
         if(!var3) {
            if(var5 == -1) {
               var5 = 2001;
            }

            if(var4 == -1) {
               var4 = 2001;
            }
         }

         return var5 - var4;
      } else {
         return var2 == 2 ? var0.location - var1.location : (var2 == 3 ? (var0.activity.equals("-") ? (var1.activity.equals("-") ? 0 : (var3 ? -1 : 1)) : (var1.activity.equals("-") ? (var3 ? 1 : -1) : var0.activity.compareTo(var1.activity))) : (var2 == 4 ? (var0.method480() ? (var1.method480() ? 0 : 1) : (var1.method480() ? -1 : 0)) : (var2 == 5 ? (var0.method478() ? (var1.method478() ? 0 : 1) : (var1.method478() ? -1 : 0)) : (var2 == 6 ? (var0.method479() ? (var1.method479() ? 0 : 1) : (var1.method479() ? -1 : 0)) : (var2 == 7 ? (var0.method477() ? (var1.method477() ? 0 : 1) : (var1.method477() ? -1 : 0)) : var0.id - var1.id)))));
      }
   }

}
