import java.util.Comparator;

final class Class112 implements Comparator {

	static AbstractIndex inv_ref;

	public int compare(Object var1, Object var2) {
		return this.method437((Class115) var1, (Class115) var2);
	}

	int method437(Class115 var1, Class115 var2) {
		return 752101567 * var1.anInt799 < var2.anInt799 * 752101567 ? -1
				: (var1.anInt799 * 752101567 != 752101567 * var2.anInt799 ? 1 : 0);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

}
