
public class Class65 {

	public static int[] anIntArray582 = new int[99];
	public static boolean[] aBoolArray583 = new boolean[] { true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
	static int cameraYaw;

	static {
		int var3 = 0;

		for (int var0 = 0; var0 < 99; ++var0) {
			int var1 = 1 + var0;
			int var2 = (int) ((double) var1 + 300.0D * Math.pow(2.0D, (double) var1 / 7.0D));
			var3 += var2;
			anIntArray582[var0] = var3 / 4;
		}

	}

	public static void method317(String[] var0, short[] var1) {
		ItemPile.method455(var0, var1, 0, var0.length - 1);
	}

	public static void method318() {
		Class7.anIntArray149 = null;
		VarPlayerType.anIntArray1544 = null;
		Class7.anIntArray150 = null;
		Class7.anIntArray151 = null;
		Class85.anIntArray690 = null;
		Npc.aByteArrayArray1966 = (byte[][]) null;
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
		Class110.anInt782 = 325298615;
		Class110.aClass87_783 = null;
		Class98.anInt748 = -18032949;
		Class111.anInt788 = 832158449;
		Class110.anInt787 = 0;
		Class44.aBool464 = false;
		Class110.anInt785 = -1836270845 * var0;
	}
}
