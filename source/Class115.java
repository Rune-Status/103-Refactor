public class Class115 {

   static String osName;
   String aString798;
   String aString800;
   public int anInt799;
   public long aLong797;
   public ExchangeOffer anExchangeOffer796;

   public String method439() {
      return this.aString800;
   }

   public String method440() {
      return this.aString798;
   }

   Class115(ByteBuf var1, byte var2, int var3) {
      this.aString798 = var1.getString();
      this.aString800 = var1.getString();
      this.anInt799 = var1.getUShort();
      this.aLong797 = var1.getLong();
      int var4 = var1.getInt();
      int var5 = var1.getInt();
      this.anExchangeOffer796 = new ExchangeOffer();
      this.anExchangeOffer796.method371(2);
      this.anExchangeOffer796.method370(var2);
      this.anExchangeOffer796.price = var4;
      this.anExchangeOffer796.itemQuantity = var5;
      this.anExchangeOffer796.transferred = 0;
      this.anExchangeOffer796.spent = 0;
      this.anExchangeOffer796.itemId = var3;
   }

}
