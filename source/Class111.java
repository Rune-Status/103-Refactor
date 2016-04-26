import java.util.Comparator;

final class Class111 implements Comparator {

	public static int anInt788;

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	int method436(Class115 var1, Class115 var2) {
		return var1.anExchangeOffer796.price < var2.anExchangeOffer796.price ? -1
				: (var2.anExchangeOffer796.price == var1.anExchangeOffer796.price ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method436((Class115) var1, (Class115) var2);
	}

}
