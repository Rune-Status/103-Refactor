
public class Class115 {

	public ExchangeOffer anExchangeOffer796;
	public long aLong797;
	String aString798;
	public int anInt799;
	String aString800;
	static String aString801;

	public String method439() {
		return this.aString800;
	}

	public String method440() {
		return this.aString798;
	}

	Class115(ByteBuf var1, byte var2, int var3) {
		this.aString798 = var1.getString();
		this.aString800 = var1.getString();
		this.anInt799 = var1.getUShort() * -1446820033;
		this.aLong797 = var1.getLong() * 5393883135847443407L;
		int var4 = var1.getInt();
		int var5 = var1.getInt();
		this.anExchangeOffer796 = new ExchangeOffer();
		this.anExchangeOffer796.method371(2);
		this.anExchangeOffer796.method370(var2);
		this.anExchangeOffer796.price = var4 * -47131975;
		this.anExchangeOffer796.itemQuantity = var5 * -176675101;
		this.anExchangeOffer796.transferred = 0;
		this.anExchangeOffer796.spent = 0;
		this.anExchangeOffer796.itemId = 2093012407 * var3;
	}
}
