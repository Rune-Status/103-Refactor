public class MilliTimer extends Timer {

   int anInt1317 = 256;
   int anInt1322 = 1;
   long milliTime = AnimationSkin.currentTimeMs();
   int anInt1321;
   int anInt1320 = 0;
   long[] aLongArray1319 = new long[10];

   void method321() {
      for(int var2 = 0; var2 < 10; var2++) {
         this.aLongArray1319[var2] = 0L;
      }

   }

   int method322(int var1, int var2) {
      int var4 = this.anInt1317;
      int var5 = this.anInt1322;
      this.anInt1317 = 300;
      this.anInt1322 = 1;
      this.milliTime = AnimationSkin.currentTimeMs();
      if(this.aLongArray1319[this.anInt1321] == 0L) {
         this.anInt1317 = var4;
         this.anInt1322 = var5;
      } else if(this.milliTime > this.aLongArray1319[this.anInt1321]) {
         this.anInt1317 = (int)((long)(var1 * 2560) / (this.milliTime - this.aLongArray1319[this.anInt1321]));
      }

      if(this.anInt1317 < 25) {
         this.anInt1317 = 25;
      }

      if(this.anInt1317 > 256) {
         this.anInt1317 = 256;
         this.anInt1322 = (int)((long)var1 - (this.milliTime - this.aLongArray1319[this.anInt1321]) / 10L);
      }

      if(this.anInt1322 > var1) {
         this.anInt1322 = var1;
      }

      this.aLongArray1319[this.anInt1321] = this.milliTime;
      this.anInt1321 = (this.anInt1321 + 1) % 10;
      int var6;
      if(this.anInt1322 > 1) {
         for(var6 = 0; var6 < 10; var6++) {
            if(this.aLongArray1319[var6] != 0L) {
               this.aLongArray1319[var6] += (long)this.anInt1322;
            }
         }
      }

      if(this.anInt1322 < var2) {
         this.anInt1322 = var2;
      }

      Class96_Sub1.sleep((long)this.anInt1322);

      for(var6 = 0; this.anInt1320 < 256; this.anInt1320 += this.anInt1317) {
         ++var6;
      }

      this.anInt1320 &= 255;
      return var6;
   }

   MilliTimer() {
      for(int var1 = 0; var1 < 10; var1++) {
         this.aLongArray1319[var1] = this.milliTime;
      }

   }

   public static VarClientType getVarClientType(int id) {
      VarClientType type = (VarClientType)VarClientType.varclients.get((long)id);
      if(type != null) {
         return type;
      } else {
         byte[] bytes = VarClientType.varclient_ref.getFile(19, id);
         type = new VarClientType();
         if(bytes != null) {
            type.decode(new ByteBuf(bytes));
         }

         VarClientType.varclients.put(type, (long)id);
         return type;
      }
   }

   public static boolean method553(char var0) {
      return var0 >= 48 && var0 <= 57;
   }

   static final void method554(int var0, int var1) {
      int var2 = Class35.b12_full.method967("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.menuItemCount; var3++) {
         var4 = Class35.b12_full.method967(Class25.method165(var3));
         if(var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.menuItemCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if(var2 + var4 > Class34.gameWidth) {
         var4 = Class34.gameWidth - var2;
      }

      if(var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if(var1 + var3 > Node_Sub9.gameHeight) {
         var5 = Node_Sub9.gameHeight - var3;
      }

      if(var5 < 0) {
         var5 = 0;
      }

      Client.menuOpen = true;
      Class7.menuX = var4;
      InvType.menuY = var5;
      Class4.menuWidth = var2;
      Class4.menuHeight = Client.menuItemCount * 15 + 22;
   }

}
