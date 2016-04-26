public class Class65 {

	static int cameraYaw;
	public static int[] anIntArray582 = new int[99];
	public static boolean[] aBoolArray583 = new boolean[] { true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	public static void method317(String[] var0, short[] var1) {
		ItemPile.method455(var0, var1, 0, var0.length - 1);
	}

	public static void resetSprite() {
		Class7.offsetsX = null;
		VarPlayerType.offsetsY = null;
		Class7.subWidths = null;
		Class7.subHeights = null;
		Class85.palette = null;
		Npc.spritePixels = (byte[][]) ((byte[][]) null);
	}

	Class65() throws Throwable {
		throw new Error();
	}

	static final void method319(int var0, int var1) {
		if (IdentKitType.loadWidget(var0)) {
			Class86.method365(Widget.interfaces[var0], var1);
		}

	}

	public static void method320(int var0) {
		Class110.anInt782 = 1;
		Class110.aClass87_783 = null;
		Class98.musicId = -1;
		Class111.anInt788 = -1;
		Class110.anInt787 = 0;
		Class44.aBool464 = false;
		Class110.anInt785 = var0;
	}

	static {
		int var3 = 0;

		for (int var0 = 0; var0 < 99; var0++) {
			int var1 = var0 + 1;
			int var2 = (int) ((double) var1 + Math.pow(2.0D, (double) var1 / 7.0D) * 300.0D);
			var3 += var2;
			anIntArray582[var0] = var3 / 4;
		}

	}

}
