
public final class Class31 {

	static int currentSpellTargets;
	boolean aBool343 = true;
	int anInt344;
	int anInt345;
	int anInt346;
	int anInt347;
	int anInt348;
	protected static String aString349;
	public static DualNode_Sub13_Sub3_Sub1 aDualNode_Sub13_Sub3_Sub1_350;
	static Connection gameConnection;
	static int anInt352;
	int anInt353;

	public static void method190(AbstractIndex var0) {
		Class112.inv_ref = var0;
	}

	public static int method191(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	public static void method192() {
		KeyFocusListener var0 = KeyFocusListener.kfListener;
		synchronized (var0) {
			KeyFocusListener.anInt601 += 2055192291;
			KeyFocusListener.anInt599 = -1719539323 * KeyFocusListener.anInt600;
			KeyFocusListener.anInt602 = 0;
			int var1;
			if (1397604687 * KeyFocusListener.anInt596 < 0) {
				for (var1 = 0; var1 < 112; ++var1) {
					KeyFocusListener.aBoolArray593[var1] = false;
				}

				KeyFocusListener.anInt596 = -1859441207 * KeyFocusListener.anInt595;
			} else {
				while (KeyFocusListener.anInt595 * 1246538247 != 1397604687 * KeyFocusListener.anInt596) {
					var1 = KeyFocusListener.anIntArray594[1246538247 * KeyFocusListener.anInt595];
					KeyFocusListener.anInt595 = 1502651319 * (1 + 1246538247 * KeyFocusListener.anInt595 & 127);
					if (var1 < 0) {
						KeyFocusListener.aBoolArray593[~var1] = false;
					} else {
						if (!KeyFocusListener.aBoolArray593[var1]
								&& 1701596051 * KeyFocusListener.anInt602 < KeyFocusListener.anIntArray592.length - 1) {
							KeyFocusListener.anIntArray592[(KeyFocusListener.anInt602 += -2027189605) * 1701596051 - 1] = var1;
						}

						KeyFocusListener.aBoolArray593[var1] = true;
					}
				}
			}

			KeyFocusListener.anInt600 = -1548916671 * KeyFocusListener.anInt591;
		}
	}

	Class31(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.anInt347 = -525826095 * var1;
		this.anInt353 = 289745453 * var2;
		this.anInt344 = var3 * -1255272067;
		this.anInt345 = 1787141445 * var4;
		this.anInt346 = 1167699771 * var5;
		this.anInt348 = var6 * 1968954883;
		this.aBool343 = var7;
	}
}
