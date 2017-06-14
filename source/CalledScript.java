public class CalledScript {

	String[] stringOperands;
	RuneScript callingScript;
	int[] intOperands;
	static VarClientHub aClass28_364;
	static int[] anIntArray365;
	int anInt363 = -1;

	static final int getSmoothNoise2D(int x, int y) {
		int corners = VarClientType.getNoise(x - 1, y - 1) + VarClientType.getNoise(x + 1, y - 1)
				+ VarClientType.getNoise(x - 1, y + 1) + VarClientType.getNoise(x + 1, y + 1);
		int sides = VarClientType.getNoise(x - 1, y) + VarClientType.getNoise(x + 1, y)
				+ VarClientType.getNoise(x, y - 1) + VarClientType.getNoise(x, y + 1);
		int center = VarClientType.getNoise(x, y);
		return center / 4 + sides / 8 + corners / 16;
	}

	static void method198(int var0) {
		ItemTable var1 = (ItemTable) ItemTable.itemTables.get((long) var0);
		if (var1 != null) {
			var1.unlink();
		}

	}

	static boolean method199(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
	}

	static final int adjustHSLListness0(int color, int lightness) {
		if (color == -2) {
			return 12345678;
		} else if (color == -1) {
			if (lightness < 2) {
				lightness = 2;
			} else if (lightness > 126) {
				lightness = 126;
			}

			return lightness;
		} else {
			lightness = (color & 0x7f) * lightness / 128;
			if (lightness < 2) {
				lightness = 2;
			} else if (lightness > 126) {
				lightness = 126;
			}

			return (color & 0xff80) + lightness;
		}
	}

}
