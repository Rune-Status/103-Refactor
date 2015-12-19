import java.io.File;

public class Class75 {

	static File cacheLocation;
	static File aFile632;
	public static Class121 randomDat = null;
	public static Class121 aClass121_634 = null;
	static int anInt635;
	public static Class121 aClass121_636 = null;
	static int anInt637;
	static int anInt638;

	static void method334(int var0, String var1, String var2) {
		DualNode_Sub1.method658(var0, var1, var2, (String) null);
	}

	static void method335() {
		Class126 var0 = null;

		try {
			var0 = BoundaryStub.method154("", Client.aClass77_2091.aString646, true);
			ByteBuf var1 = Node_Sub5.aClass24_1265.method159();
			var0.method460(var1.payload, 0, var1.position * 314639891);
		} catch (Exception var3) {
			;
		}

		try {
			if (var0 != null) {
				var0.method459();
			}
		} catch (Exception var2) {
			;
		}

	}

	Class75() throws Throwable {
		throw new Error();
	}

	public static void method336(int var0, int var1) {
		Varpbit var2 = Class87_Sub1.getVarpbit(var0);
		int var6 = 12908597 * var2.varp;
		int var5 = -585070571 * var2.lowBit;
		int var3 = var2.highBit * 984543857;
		int var4 = Class94.anIntArray734[var3 - var5];
		if (var1 < 0 || var1 > var4) {
			var1 = 0;
		}

		var4 <<= var5;
		Class94.tempVars[var6] = Class94.tempVars[var6] & ~var4 | var1 << var5 & var4;
	}
}
