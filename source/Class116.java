import java.util.Comparator;

final class Class116 implements Comparator {

	int method441(Class115 var1, Class115 var2) {
		return var1.aLong797 * -3596478625201456337L < -3596478625201456337L * var2.aLong797 ? -1
				: (var1.aLong797 * -3596478625201456337L == var2.aLong797 * -3596478625201456337L ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method441((Class115) var1, (Class115) var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

}
