
public class RuntimeException_Sub1 extends RuntimeException {

	String aString1806;
	public static String aString1807;
	Throwable aThrowable1808;

	static int method931(int var0, int var1, int var2) {
		return (Class39.renderRules[var0][var1][var2] & 8) != 0 ? 0
				: (var0 > 0 && (Class39.renderRules[1][var1][var2] & 2) != 0 ? var0 - 1 : var0);
	}

	RuntimeException_Sub1(Throwable var1, String var2) {
		this.aString1806 = var2;
		this.aThrowable1808 = var1;
	}

	static final boolean method932(Widget var0) {
		if (var0.anIntArray1191 == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.anIntArray1191.length; ++var1) {
				int var2 = Class117.method442(var0, var1);
				int var3 = var0.anIntArray1168[var1];
				if (var0.anIntArray1191[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.anIntArray1191[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.anIntArray1191[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
