
public class DualNode_Sub8 extends DualNode {

	int anInt1516 = DualNode_Sub11.method724() * 396806425;
	int anInt1517;
	int anInt1518;
	String aString1519;
	String aString1520;
	String aString1521;

	void method708(int var1, String var2, String var3, String var4) {
		this.anInt1516 = DualNode_Sub11.method724() * 396806425;
		this.anInt1517 = 1070678137 * Client.engineCycle;
		this.anInt1518 = var1 * 373059241;
		this.aString1521 = var2;
		this.aString1519 = var3;
		this.aString1520 = var4;
	}

	DualNode_Sub8(int var1, String var2, String var3, String var4) {
		this.anInt1517 = 1070678137 * Client.engineCycle;
		this.anInt1518 = var1 * 373059241;
		this.aString1521 = var2;
		this.aString1519 = var3;
		this.aString1520 = var4;
	}

	public static int method709(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	static final void method710(Character var0) {
		if (var0.orientation * 1361576967 != 0) {
			if (734924805 * var0.targetIndex != -1) {
				Object var3 = null;
				if (var0.targetIndex * 734924805 < '\u8000') {
					var3 = Client.npcArray[var0.targetIndex * 734924805];
				} else if (734924805 * var0.targetIndex >= '\u8000') {
					var3 = Client.playerArray[734924805 * var0.targetIndex - '\u8000'];
				}

				if (var3 != null) {
					int var1 = 1272643751 * var0.strictX - ((Character) var3).strictX * 1272643751;
					int var2 = -1801433343 * var0.strictY - ((Character) var3).strictY * -1801433343;
					if (var1 != 0 || var2 != 0) {
						var0.anInt1953 = ((int) (Math.atan2((double) var1, (double) var2) * 325.949D) & 2047)
								* 736533899;
					}
				} else if (var0.aBool1930) {
					var0.targetIndex = -1611414733;
					var0.aBool1930 = false;
				}
			}

			if (-744366479 * var0.anInt1931 != -1
					&& (632093179 * var0.queueSize == 0 || var0.anInt1956 * 1616877363 > 0)) {
				var0.anInt1953 = var0.anInt1931 * 47518811;
				var0.anInt1931 = 316267887;
			}

			int var5 = -2061229533 * var0.anInt1953 - var0.anInt1937 * -2031663291 & 2047;
			if (var5 == 0 && var0.aBool1930) {
				var0.targetIndex = -1611414733;
				var0.aBool1930 = false;
			}

			if (var5 != 0) {
				var0.anInt1922 += -1568587987;
				boolean var4;
				if (var5 > 1024) {
					var0.anInt1937 -= var0.orientation * 1080073435;
					var4 = true;
					if (var5 < 1361576967 * var0.orientation || var5 > 2048 - var0.orientation * 1361576967) {
						var0.anInt1937 = var0.anInt1953 * -2141141433;
						var4 = false;
					}

					if (370127001 * var0.anInt1959 == var0.anInt1932 * 57983255
							&& (var0.anInt1922 * -1440192347 > 25 || var4)) {
						if (var0.anInt1916 * 711326345 != -1) {
							var0.anInt1932 = var0.anInt1916 * 1701193055;
						} else {
							var0.anInt1932 = var0.anInt1918 * -2133647945;
						}
					}
				} else {
					var0.anInt1937 += 1080073435 * var0.orientation;
					var4 = true;
					if (var5 < 1361576967 * var0.orientation || var5 > 2048 - var0.orientation * 1361576967) {
						var0.anInt1937 = var0.anInt1953 * -2141141433;
						var4 = false;
					}

					if (370127001 * var0.anInt1959 == 57983255 * var0.anInt1932
							&& (-1440192347 * var0.anInt1922 > 25 || var4)) {
						if (var0.anInt1917 * -1575295679 != -1) {
							var0.anInt1932 = var0.anInt1917 * 1969722215;
						} else {
							var0.anInt1932 = -2133647945 * var0.anInt1918;
						}
					}
				}

				var0.anInt1937 = (-2031663291 * var0.anInt1937 & 2047) * 518992781;
			} else {
				var0.anInt1922 = 0;
			}

		}
	}

	public static void method711() {
		ItemDefinition.aClass106_1620.method429();
	}
}
