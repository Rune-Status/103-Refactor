public class DualNode_Sub8 extends DualNode {

	int anInt1516 = VarPlayerType.method724();
	int anInt1517;
	int anInt1518;
	String aString1521;
	String aString1519;
	String aString1520;

	void method708(int var1, String var2, String var3, String var4) {
		this.anInt1516 = VarPlayerType.method724();
		this.anInt1517 = Client.engineCycle;
		this.anInt1518 = var1;
		this.aString1521 = var2;
		this.aString1519 = var3;
		this.aString1520 = var4;
	}

	DualNode_Sub8(int var1, String var2, String var3, String var4) {
		this.anInt1517 = Client.engineCycle;
		this.anInt1518 = var1;
		this.aString1521 = var2;
		this.aString1519 = var3;
		this.aString1520 = var4;
	}

	public static int ilog(int x) {
		int res = 0;
		if (x < 0 || x >= 65536) {
			x >>>= 16;
			res += 16;
		}

		if (x >= 256) {
			x >>>= 8;
			res += 8;
		}

		if (x >= 16) {
			x >>>= 4;
			res += 4;
		}

		if (x >= 4) {
			x >>>= 2;
			res += 2;
		}

		if (x >= 1) {
			x >>>= 1;
			++res;
		}

		return x + res;
	}

	static final void method710(Character var0) {
		if (var0.orientation * -2031663291 != 0) {
			if (var0.targetIndex != -1) {
				Object var5 = null;
				if (var0.targetIndex < '\u8000') {
					var5 = Client.npcArray[var0.targetIndex];
				} else if (var0.targetIndex >= '\u8000') {
					var5 = Client.playerArray[var0.targetIndex - '\u8000'];
				}

				if (var5 != null) {
					int var4 = var0.strictX - ((Character) var5).strictX;
					int var2 = var0.strictY - ((Character) var5).strictY;
					if (var4 != 0 || var2 != 0) {
						var0.anInt1953 = ((int) (Math.atan2((double) var4, (double) var2) * 325.949D) & 0x7ff)
								* 736533899;
					}
				} else if (var0.aBool1930) {
					var0.targetIndex = -1;
					var0.aBool1930 = false;
				}
			}

			if (var0.anInt1931 != -1 && (var0.queueSize == 0 || var0.anInt1956 > 0)) {
				var0.anInt1953 = var0.anInt1931 * 736533899;
				var0.anInt1931 = -1;
			}

			int var41 = var0.anInt1953 * -2061229533 - var0.anInt1937 * -2061229533 & 0x7ff;
			if (var41 == 0 && var0.aBool1930) {
				var0.targetIndex = -1;
				var0.aBool1930 = false;
			}

			if (var41 != 0) {
				++var0.anInt1922;
				boolean var51;
				if (var41 > 1024) {
					var0.anInt1937 -= var0.orientation * -1253637257;
					var51 = true;
					if (var41 < var0.orientation * -2031663291 || var41 > 2048 - var0.orientation * -2031663291) {
						var0.anInt1937 = var0.anInt1953;
						var51 = false;
					}

					if (var0.anInt1959 == var0.anInt1932 && (var0.anInt1922 > 25 || var51)) {
						if (var0.anInt1916 != -1) {
							var0.anInt1932 = var0.anInt1916;
						} else {
							var0.anInt1932 = var0.anInt1918;
						}
					}
				} else {
					var0.anInt1937 += var0.orientation * -1253637257;
					var51 = true;
					if (var41 < var0.orientation * -2031663291 || var41 > 2048 - var0.orientation * -2031663291) {
						var0.anInt1937 = var0.anInt1953;
						var51 = false;
					}

					if (var0.anInt1959 == var0.anInt1932 && (var0.anInt1922 > 25 || var51)) {
						if (var0.anInt1917 * 57983255 != -1) {
							var0.anInt1932 = var0.anInt1917 * 57983255;
						} else {
							var0.anInt1932 = var0.anInt1918;
						}
					}
				}

				var0.anInt1937 = (var0.anInt1937 * -2061229533 & 0x7ff) * 736533899;
			} else {
				var0.anInt1922 = 0;
			}
		}

	}

	public static void method711() {
		ItemType.aClass106_1620.method429();
	}

}
