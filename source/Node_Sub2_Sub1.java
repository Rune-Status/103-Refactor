public class Node_Sub2_Sub1 extends Node_Sub2 {

   public byte[] aByteArray1543;
   public int anInt1542;
   public int anInt1541;
   int anInt1540;
   public boolean aBool1539;

   public Node_Sub2_Sub1 method722(Class16 var1) {
      this.aByteArray1543 = var1.method129(this.aByteArray1543);
      this.anInt1542 = var1.method128(this.anInt1542);
      if(this.anInt1541 == this.anInt1540) {
         this.anInt1541 = this.anInt1540 = var1.method131(this.anInt1541);
      } else {
         this.anInt1541 = var1.method131(this.anInt1541);
         this.anInt1540 = var1.method131(this.anInt1540);
         if(this.anInt1541 == this.anInt1540) {
            --this.anInt1541;
         }
      }

      return this;
   }

   Node_Sub2_Sub1(int var1, byte[] var2, int var3, int var4) {
      this.anInt1542 = var1;
      this.aByteArray1543 = var2;
      this.anInt1541 = var3;
      this.anInt1540 = var4;
   }

   Node_Sub2_Sub1(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.anInt1542 = var1;
      this.aByteArray1543 = var2;
      this.anInt1541 = var3;
      this.anInt1540 = var4;
      this.aBool1539 = var5;
   }

}
