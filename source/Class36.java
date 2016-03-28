import java.lang.management.GarbageCollectorMXBean;

public class Class36 implements IOrdinal {

   static GarbageCollectorMXBean aGarbageCollectorMXBean400;
   static int anInt402;
   int anInt401;
   static Class36 aClass36_397 = new Class36(2);
   static Class36 aClass36_398 = new Class36(1);
   static Class36 aClass36_399 = new Class36(3);
   static Class36 aClass36_403 = new Class36(0);

   public int ordinal() {
      return this.anInt401;
   }

   public static void method206() {
      Widget.aClass106_1167.method429();
      Widget.aClass106_1127.method429();
      Widget.aClass106_1192.method429();
      Widget.aClass106_1202.method429();
   }

   static final void method207() {
      int var0 = Class7.menuX;
      int var1 = InvType.menuY;
      int var3 = Class4.menuWidth;
      int var4 = Class4.menuHeight;
      int var2 = 6116423;
      RSGraphics.method793(var0, var1, var3, var4, var2);
      RSGraphics.method793(var0 + 1, var1 + 1, var3 - 2, 16, 0);
      RSGraphics.drawRectangle(var0 + 1, var1 + 18, var3 - 2, var4 - 19, 0);
      Class35.b12_full.method980("Choose Option", var0 + 3, var1 + 14, var2, -1);
      int var5 = Class74.anInt621;
      int var9 = Class74.anInt622;

      int var7;
      int var8;
      int var10;
      for(var8 = 0; var8 < Client.menuItemCount; var8++) {
         var7 = var1 + 31 + (Client.menuItemCount - 1 - var8) * 15;
         var10 = 16777215;
         if(var5 > var0 && var5 < var0 + var3 && var9 > var7 - 13 && var9 < var7 + 3) {
            var10 = 16776960;
         }

         Class35.b12_full.method980(Class25.method165(var8), var0 + 3, var7, var10, 0);
      }

      var8 = Class7.menuX;
      var7 = InvType.menuY;
      var10 = Class4.menuWidth;
      int var11 = Class4.menuHeight;

      for(int var6 = 0; var6 < Client.anInt2168; var6++) {
         if(Client.anIntArray2175[var6] + Client.anIntArray2173[var6] > var8 && Client.anIntArray2173[var6] < var8 + var10 && Client.anIntArray2174[var6] + Client.anIntArray2176[var6] > var7 && Client.anIntArray2174[var6] < var7 + var11) {
            Client.aBoolArray2171[var6] = true;
         }
      }

   }

   Class36(int var1) {
      this.anInt401 = var1;
   }

}
