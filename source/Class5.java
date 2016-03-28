public class Class5 {

   public static int anInt112;
   DualNode_Sub8[] aDualNode_Sub8Array113 = new DualNode_Sub8[100];
   int anInt111;

   static final void method71(int var0, int var1, int var2, int var3) {
      if(Client.cursorState == 1) {
         Class88.aSpriteArray712[Client.anInt2097 / 100].method946(Client.anInt2095 - 8, Client.anInt2096 - 8);
      }

      if(Client.cursorState == 2) {
         Class88.aSpriteArray712[Client.anInt2097 / 100 + 4].method946(Client.anInt2095 - 8, Client.anInt2096 - 8);
      }

      GameType.method339();
   }

   DualNode_Sub8 method72(int var1, String var2, String var3, String var4) {
      DualNode_Sub8 var5 = this.aDualNode_Sub8Array113[99];

      for(int var6 = this.anInt111; var6 > 0; --var6) {
         if(var6 != 100) {
            this.aDualNode_Sub8Array113[var6] = this.aDualNode_Sub8Array113[var6 - 1];
         }
      }

      if(var5 == null) {
         var5 = new DualNode_Sub8(var1, var2, var4, var3);
      } else {
         var5.unlink();
         var5.unlinkDual();
         var5.method708(var1, var2, var4, var3);
      }

      this.aDualNode_Sub8Array113[0] = var5;
      if(this.anInt111 < 100) {
         ++this.anInt111;
      }

      return var5;
   }

   int method73() {
      return this.anInt111;
   }

   DualNode_Sub8 method74(int var1) {
      return var1 >= 0 && var1 < this.anInt111 ? this.aDualNode_Sub8Array113[var1] : null;
   }

}
