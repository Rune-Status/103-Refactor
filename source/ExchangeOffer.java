
public class ExchangeOffer {

	public int itemQuantity;
	public int itemId;
	public int price;
	byte status;
	public int spent;
	public int transferred;

	public int method368() {
		return (this.status & 8) == 8 ? 1 : 0;
	}

	void method369(Integer var1) {
	}

	void method370(int var1) {
		this.status &= -9;
		if (var1 == 1) {
			this.status = (byte) (this.status | 8);
		}

	}

	void method371(int var1) {
		this.status &= -8;
		this.status = (byte) (this.status | var1 & 7);
	}

	public ExchangeOffer(ByteBuf var1, boolean var2) {
		this.status = var1.getByte();
		this.itemId = var1.getUShort() * 2093012407;
		this.price = var1.getInt() * -47131975;
		this.itemQuantity = var1.getInt() * -176675101;
		this.transferred = var1.getInt() * -937940271;
		this.spent = var1.getInt() * 1084003279;
		if (var2) {
			int var5 = 0;
			boolean var3 = false;

			while (true) {
				int var7 = var1.getUByte();
				if (var7 == 255) {
					Integer var6 = var3 ? Integer.valueOf(var5) : null;
					this.method369(var6);
					break;
				}

				if (var7 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var4 = var1.getUByte();
					if (var4 == 255) {
						break;
					}

					var1.position -= -184175589;
					if (var1.getUShort() != 0) {
						throw new IllegalStateException("");
					}

					if (var3) {
						throw new IllegalStateException("");
					}

					var5 = var1.getInt();
					var3 = true;
				}
			}
		}

	}

	public int method372() {
		return this.status & 7;
	}

	public ExchangeOffer() {
	}

	public static void method373() {
		Varpbit.aClass106_1726.method429();
	}
}
