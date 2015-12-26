
public class Class35 {

	static DualNode_Sub13_Sub3_Sub1 b12_full;
	static String aString387 = ",";
	static String aString388 = "|";
	static String aString389 = " (";
	static String aString390 = "<br>";
	static String aString391 = "->";
	static String aString392 = ")";
	static String aString393 = "</col>";
	static Connection aClass60_394;
	static DualNode_Sub13_Sub2[] aDualNode_Sub13_Sub2Array395;
	static String aString396 = "true";

	public static boolean method202(AbstractIndex var0, int var1, int var2) {
		byte[] var3 = var0.getFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			Player.method1042(var3);
			return true;
		}
	}

	Class35() throws Throwable {
		throw new Error();
	}

	public static void method203(AbstractIndex var0, AbstractIndex var1) {
		IdentKitType.identKit_ref = var0;
		Class120.aClass87_805 = var1;
		IdentKitType.anInt1457 = IdentKitType.identKit_ref.fileCount(3) * 1406368173;
	}

	public static RuntimeException_Sub1 method204(Throwable var0, String var1) {
		RuntimeException_Sub1 var2;
		if (var0 instanceof RuntimeException_Sub1) {
			var2 = (RuntimeException_Sub1) var0;
			var2.aString1806 = var2.aString1806 + ' ' + var1;
		} else {
			var2 = new RuntimeException_Sub1(var0, var1);
		}

		return var2;
	}

	static final void method205(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.aBool2071) {
			Client.anInt2072 = -1954862944;
		} else {
			Client.anInt2072 = 0;
		}

		Client.aBool2071 = false;
		int var7;
		if (Class74.anInt624 * -562612321 == 1 || !ClanMate.aBool1221 && -562612321 * Class74.anInt624 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < 16 + var2) {
				var0.insetY -= -1544178172;
				Class68.method326(var0);
			} else if (var5 >= var1 && var5 < 16 + var1 && var6 >= var2 + var3 - 16 && var6 < var3 + var2) {
				var0.insetY += -1544178172;
				Class68.method326(var0);
			} else if (var5 >= var1 - Client.anInt2072 * -1117204083
					&& var5 < var1 + 16 + Client.anInt2072 * -1117204083 && var6 >= 16 + var2
					&& var6 < var3 + var2 - 16) {
				var7 = (var3 - 32) * var3 / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var9 = var6 - var2 - 16 - var7 / 2;
				int var8 = var3 - 32 - var7;
				var0.insetY = -1459786367 * (var9 * (var4 - var3) / var8);
				Class68.method326(var0);
				Client.aBool2071 = true;
			}
		}

		if (Client.anInt2163 * -1955541359 != 0) {
			var7 = 1645211541 * var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < 16 + var1 && var6 <= var2 + var3) {
				var0.insetY += -379762947 * Client.anInt2163;
				Class68.method326(var0);
			}
		}

	}
}
