import java.util.Comparator;

final class Class123 implements Comparator {

	public int compare(Object var1, Object var2) {
		return this.method453((Class115) var1, (Class115) var2);
	}

	int method453(Class115 var1, Class115 var2) {
		return var1.anExchangeOffer796.itemQuantity < var2.anExchangeOffer796.itemQuantity ? -1
				: (var1.anExchangeOffer796.itemQuantity == var2.anExchangeOffer796.itemQuantity ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

}
