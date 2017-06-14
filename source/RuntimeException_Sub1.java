public class RuntimeException_Sub1 extends RuntimeException {

	public static String myPlayerName;
	String aString1806;
	Throwable aThrowable1808;

	static int getRenderLevel(int level, int x, int y) {
		return (Scene.renderFlags[level][x][y] & 0x8) != 0 ? 0
				: (level > 0 && (Scene.renderFlags[1][x][y] & 0x2) != 0 ? level - 1 : level);
	}

	RuntimeException_Sub1(Throwable var1, String var2) {
		this.aString1806 = var2;
		this.aThrowable1808 = var1;
	}

	static final boolean method932(Widget var0) {
		if (var0.anIntArray1191 == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.anIntArray1191.length; var1++) {
				int var2 = InterfaceScripts.method442(var0, var1);
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
