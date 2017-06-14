public final class TileUnderlay {

	static int currentSpellTargets;
	protected static String aString349;
	public static IndexedFont aDualNode_Sub13_Sub3_Sub1_350;
	static Connection gameConnection;
	static int anInt352;
	boolean flat = true;
	int swColor;
	int seColor;
	int neColor;
	int nwColor;
	int tectureId;
	int rgb;

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
			++KeyFocusListener.anInt601;
			KeyFocusListener.anInt599 = KeyFocusListener.anInt600;
			KeyFocusListener.anInt602 = 0;
			int var1;
			if (KeyFocusListener.anInt596 < 0) {
				for (var1 = 0; var1 < 112; var1++) {
					KeyFocusListener.aBoolArray593[var1] = false;
				}

				KeyFocusListener.anInt596 = KeyFocusListener.anInt595;
			} else {
				while (KeyFocusListener.anInt595 != KeyFocusListener.anInt596) {
					var1 = KeyFocusListener.anIntArray594[KeyFocusListener.anInt595];
					KeyFocusListener.anInt595 = KeyFocusListener.anInt595 + 1 & 0x7f;
					if (var1 < 0) {
						KeyFocusListener.aBoolArray593[~var1] = false;
					} else {
						if (!KeyFocusListener.aBoolArray593[var1]
								&& KeyFocusListener.anInt602 < KeyFocusListener.anIntArray592.length - 1) {
							KeyFocusListener.anIntArray592[++KeyFocusListener.anInt602 - 1] = var1;
						}

						KeyFocusListener.aBoolArray593[var1] = true;
					}
				}
			}

			KeyFocusListener.anInt600 = KeyFocusListener.anInt591;
		}
	}

	TileUnderlay(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.tectureId = var5;
		this.rgb = var6;
		this.flat = var7;
	}

}
