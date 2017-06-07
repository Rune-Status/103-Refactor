public class Class35 {

	static DualNode_Sub13_Sub3_Sub1 b12_full;
	static Connection aClass60_394;
	static Sprite[] scrollbar;
	static String aString387 = ",";
	static String aString388 = "|";
	static String aString389 = " (";
	static String aString390 = "<br>";
	static String aString391 = "->";
	static String aString392 = ")";
	static String aString393 = "</col>";
	static String aString396 = "true";

	public static boolean decodeSprite(AbstractIndex var0, int var1, int var2) {
		byte[] var3 = var0.getFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			Player.decodeSprite(var3);
			return true;
		}
	}

	Class35() throws Throwable {
		throw new Error();
	}

	public static void method203(AbstractIndex var0, AbstractIndex var1) {
		IdentKitType.identKit_ref = var0;
		Class120.aClass87_805 = var1;
		IdentKitType.anInt1457 = IdentKitType.identKit_ref.fileCount(3);
	}

	static final void method205(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.aBool2071) {
			Client.anInt2072 = 32;
		} else {
			Client.anInt2072 = 0;
		}

		Client.aBool2071 = false;
		int var7;
		if (MouseInput.anInt624 == 1 || !ClanMate.aBool1221 && MouseInput.anInt624 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.insetY -= 4;
				Class68.method326(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var3 + var2) {
				var0.insetY += 4;
				Class68.method326(var0);
			} else if (var5 >= var1 - Client.anInt2072 && var5 < var1 + 16 + Client.anInt2072 && var6 >= var2 + 16
					&& var6 < var3 + var2 - 16) {
				var7 = (var3 - 32) * var3 / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var9 = var6 - var2 - 16 - var7 / 2;
				int var8 = var3 - 32 - var7;
				var0.insetY = (var4 - var3) * var9 / var8;
				Class68.method326(var0);
				Client.aBool2071 = true;
			}
		}

		if (Client.anInt2163 != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var2 + var3) {
				var0.insetY += Client.anInt2163 * 45;
				Class68.method326(var0);
			}
		}

	}

}
