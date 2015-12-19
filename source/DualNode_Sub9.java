
public class DualNode_Sub9 extends DualNode {

	public int anInt1522 = -978001323;
	public static Class106 aClass106_1523 = new Class106(64);
	public int anInt1524;
	public int anInt1525;
	public int anInt1526 = 0;
	public int anInt1527 = 511239711;
	public int anInt1528;
	public boolean aBool1529 = true;
	public int anInt1530;
	public int anInt1531;
	public int anInt1532;
	public static Class87 aClass87_1533;

	void method712(ByteBuf var1, int var2) {
		while (true) {
			int var3 = var1.getUByte();
			if (var3 == 0) {
				return;
			}

			this.method713(var1, var3, var2);
		}
	}

	void method713(ByteBuf var1, int var2, int var3) {
		if (var2 == 1) {
			this.anInt1526 = var1.getMedium() * 1304176145;
		} else if (var2 == 2) {
			this.anInt1522 = var1.getUByte() * 978001323;
		} else if (var2 == 5) {
			this.aBool1529 = false;
		} else if (var2 == 7) {
			this.anInt1527 = var1.getMedium() * -511239711;
		} else if (var2 == 8) {
			;
		}

	}

	void method714(int var1) {
		double var2 = (double) (var1 >> 16 & 255) / 256.0D;
		double var8 = (double) (var1 >> 8 & 255) / 256.0D;
		double var12 = (double) (var1 & 255) / 256.0D;
		double var4 = var2;
		if (var8 < var2) {
			var4 = var8;
		}

		if (var12 < var4) {
			var4 = var12;
		}

		double var6 = var2;
		if (var8 > var2) {
			var6 = var8;
		}

		if (var12 > var6) {
			var6 = var12;
		}

		double var14 = 0.0D;
		double var10 = 0.0D;
		double var16 = (var6 + var4) / 2.0D;
		if (var4 != var6) {
			if (var16 < 0.5D) {
				var10 = (var6 - var4) / (var4 + var6);
			}

			if (var16 >= 0.5D) {
				var10 = (var6 - var4) / (2.0D - var6 - var4);
			}

			if (var6 == var2) {
				var14 = (var8 - var12) / (var6 - var4);
			} else if (var8 == var6) {
				var14 = 2.0D + (var12 - var2) / (var6 - var4);
			} else if (var6 == var12) {
				var14 = (var2 - var8) / (var6 - var4) + 4.0D;
			}
		}

		var14 /= 6.0D;
		this.anInt1531 = (int) (var14 * 256.0D) * 817568045;
		this.anInt1524 = 1558847427 * (int) (var10 * 256.0D);
		this.anInt1530 = 765744919 * (int) (256.0D * var16);
		if (-958248725 * this.anInt1524 < 0) {
			this.anInt1524 = 0;
		} else if (this.anInt1524 * -958248725 > 255) {
			this.anInt1524 = -1925864643;
		}

		if (this.anInt1530 * 1921798311 < 0) {
			this.anInt1530 = 0;
		} else if (1921798311 * this.anInt1530 > 255) {
			this.anInt1530 = 1991426025;
		}

	}

	void method715() {
		if (this.anInt1527 * -105977311 != -1) {
			this.method714(this.anInt1527 * -105977311);
			this.anInt1525 = 61882287 * this.anInt1531;
			this.anInt1532 = 1723377719 * this.anInt1524;
			this.anInt1528 = this.anInt1530 * 1293569841;
		}

		this.method714(2024508145 * this.anInt1526);
	}

	public static String method716(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var4 = 0;

				for (long var5 = var0; var5 != 0L; var5 /= 37L) {
					++var4;
				}

				StringBuilder var2;
				char var3;
				for (var2 = new StringBuilder(var4); 0L != var0; var2.append(var3)) {
					long var7 = var0;
					var0 /= 37L;
					var3 = Class91.aCharArray723[(int) (var7 - 37L * var0)];
					if (var3 == 95) {
						int var9 = var2.length() - 1;
						var2.setCharAt(var9, java.lang.Character.toUpperCase(var2.charAt(var9)));
						var3 = 160;
					}
				}

				var2.reverse();
				var2.setCharAt(0, java.lang.Character.toUpperCase(var2.charAt(0)));
				return var2.toString();
			}
		} else {
			return null;
		}
	}
}
