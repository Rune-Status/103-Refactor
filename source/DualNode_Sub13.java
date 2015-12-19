
public class DualNode_Sub13 extends DualNode {

	public static int anInt1570;
	public static int[] anIntArray1571;
	protected static int anInt1572 = 0;
	public static int anInt1573 = 0;
	public static int anInt1574 = 0;
	public static int anInt1575;
	protected static int anInt1576 = 0;

	public static void method779(int[] var0, int var1, int var2) {
		anIntArray1571 = var0;
		anInt1575 = var1;
		anInt1570 = var2;
		method789(0, 0, var1, var2);
	}

	public static void method780() {
		anInt1572 = 0;
		anInt1573 = 0;
		anInt1576 = anInt1575;
		anInt1574 = anInt1570;
	}

	public static void method781(int var0, int var1, int var2, int var3) {
		if (anInt1572 < var0) {
			anInt1572 = var0;
		}

		if (anInt1573 < var1) {
			anInt1573 = var1;
		}

		if (anInt1576 > var2) {
			anInt1576 = var2;
		}

		if (anInt1574 > var3) {
			anInt1574 = var3;
		}

	}

	public static void method782(int[] var0) {
		var0[0] = anInt1572;
		var0[1] = anInt1573;
		var0[2] = anInt1576;
		var0[3] = anInt1574;
	}

	public static void method783(int[] var0) {
		anInt1572 = var0[0];
		anInt1573 = var0[1];
		anInt1576 = var0[2];
		anInt1574 = var0[3];
	}

	public static void method784(int var0, int var1, int var2, int var3) {
		if (var0 >= anInt1572 && var0 < anInt1576) {
			if (var1 < anInt1573) {
				var2 -= anInt1573 - var1;
				var1 = anInt1573;
			}

			if (var1 + var2 > anInt1574) {
				var2 = anInt1574 - var1;
			}

			int var5 = var0 + var1 * anInt1575;

			for (int var4 = 0; var4 < var2; ++var4) {
				anIntArray1571[var5 + var4 * anInt1575] = var3;
			}

		}
	}

	public static void method785(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < anInt1572) {
			var2 -= anInt1572 - var0;
			var0 = anInt1572;
		}

		if (var1 < anInt1573) {
			var3 -= anInt1573 - var1;
			var1 = anInt1573;
		}

		if (var0 + var2 > anInt1576) {
			var2 = anInt1576 - var0;
		}

		if (var1 + var3 > anInt1574) {
			var3 = anInt1574 - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
		int var9 = 256 - var5;
		int var10 = anInt1575 - var2;
		int var6 = var0 + var1 * anInt1575;

		for (int var11 = 0; var11 < var3; ++var11) {
			for (int var8 = -var2; var8 < 0; ++var8) {
				int var7 = anIntArray1571[var6];
				var7 = ((var7 & 16711935) * var9 >> 8 & 16711935) + ((var7 & '\uff00') * var9 >> 8 & '\uff00');
				anIntArray1571[var6++] = var4 + var7;
			}

			var6 += var10;
		}

	}

	public static void method786(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var10 = 65536 / var3;
		if (var0 < anInt1572) {
			var2 -= anInt1572 - var0;
			var0 = anInt1572;
		}

		if (var1 < anInt1573) {
			var6 += (anInt1573 - var1) * var10;
			var3 -= anInt1573 - var1;
			var1 = anInt1573;
		}

		if (var0 + var2 > anInt1576) {
			var2 = anInt1576 - var0;
		}

		if (var1 + var3 > anInt1574) {
			var3 = anInt1574 - var1;
		}

		int var14 = anInt1575 - var2;
		int var7 = var0 + var1 * anInt1575;

		for (int var9 = -var3; var9 < 0; ++var9) {
			int var11 = 65536 - var6 >> 8;
			int var12 = var6 >> 8;
			int var8 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936)
					+ ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

			for (int var13 = -var2; var13 < 0; ++var13) {
				anIntArray1571[var7++] = var8;
			}

			var7 += var14;
			var6 += var10;
		}

	}

	public static void method787(int var0, int var1, int var2, int var3, int var4) {
		method796(var0, var1, var2, var4);
		method796(var0, var1 + var3 - 1, var2, var4);
		method784(var0, var1, var3, var4);
		method784(var0 + var2 - 1, var1, var3, var4);
	}

	static void method788(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= anInt1573 && var1 < anInt1574) {
			if (var0 < anInt1572) {
				var2 -= anInt1572 - var0;
				var0 = anInt1572;
			}

			if (var0 + var2 > anInt1576) {
				var2 = anInt1576 - var0;
			}

			int var6 = 256 - var4;
			int var8 = (var3 >> 16 & 255) * var4;
			int var10 = (var3 >> 8 & 255) * var4;
			int var11 = (var3 & 255) * var4;
			int var5 = var0 + var1 * anInt1575;

			for (int var14 = 0; var14 < var2; ++var14) {
				int var9 = (anIntArray1571[var5] >> 16 & 255) * var6;
				int var7 = (anIntArray1571[var5] >> 8 & 255) * var6;
				int var12 = (anIntArray1571[var5] & 255) * var6;
				int var13 = (var8 + var9 >> 8 << 16) + (var10 + var7 >> 8 << 8) + (var11 + var12 >> 8);
				anIntArray1571[var5++] = var13;
			}

		}
	}

	public static void method789(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > anInt1575) {
			var2 = anInt1575;
		}

		if (var3 > anInt1570) {
			var3 = anInt1570;
		}

		anInt1572 = var0;
		anInt1573 = var1;
		anInt1576 = var2;
		anInt1574 = var3;
	}

	static void method790(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= anInt1572 && var0 < anInt1576) {
			if (var1 < anInt1573) {
				var2 -= anInt1573 - var1;
				var1 = anInt1573;
			}

			if (var1 + var2 > anInt1574) {
				var2 = anInt1574 - var1;
			}

			int var5 = 256 - var4;
			int var14 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var6 = var0 + var1 * anInt1575;

			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = (anIntArray1571[var6] >> 16 & 255) * var5;
				int var11 = (anIntArray1571[var6] >> 8 & 255) * var5;
				int var12 = (anIntArray1571[var6] & 255) * var5;
				int var13 = (var14 + var10 >> 8 << 16) + (var7 + var11 >> 8 << 8) + (var8 + var12 >> 8);
				anIntArray1571[var6] = var13;
				var6 += anInt1575;
			}

		}
	}

	public static void method791(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				method796(var0, var1, var2 + 1, var4);
			} else {
				method796(var0 + var2, var1, -var2 + 1, var4);
			}

		} else if (var2 == 0) {
			if (var3 >= 0) {
				method784(var0, var1, var3 + 1, var4);
			} else {
				method784(var0, var1 + var3, -var3 + 1, var4);
			}

		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '\u8000';
				var3 <<= 16;
				var6 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < anInt1572) {
					var1 += var6 * (anInt1572 - var0);
					var0 = anInt1572;
				}

				if (var2 >= anInt1576) {
					var2 = anInt1576 - 1;
				}

				while (var0 <= var2) {
					var5 = var1 >> 16;
					if (var5 >= anInt1573 && var5 < anInt1574) {
						anIntArray1571[var0 + var5 * anInt1575] = var4;
					}

					var1 += var6;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += '\u8000';
				var2 <<= 16;
				var6 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < anInt1573) {
					var0 += var6 * (anInt1573 - var1);
					var1 = anInt1573;
				}

				if (var3 >= anInt1574) {
					var3 = anInt1574 - 1;
				}

				while (var1 <= var3) {
					var5 = var0 >> 16;
					if (var5 >= anInt1572 && var5 < anInt1576) {
						anIntArray1571[var5 + var1 * anInt1575] = var4;
					}

					var0 += var6;
					++var1;
				}
			}

		}
	}

	public static void method792(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * anInt1575;

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0) {
				anIntArray1571[var6++] = var2;
			}

			var5 += anInt1575;
		}

	}

	public static void method793(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < anInt1572) {
			var2 -= anInt1572 - var0;
			var0 = anInt1572;
		}

		if (var1 < anInt1573) {
			var3 -= anInt1573 - var1;
			var1 = anInt1573;
		}

		if (var0 + var2 > anInt1576) {
			var2 = anInt1576 - var0;
		}

		if (var1 + var3 > anInt1574) {
			var3 = anInt1574 - var1;
		}

		int var8 = anInt1575 - var2;
		int var6 = var0 + var1 * anInt1575;

		for (int var5 = -var3; var5 < 0; ++var5) {
			for (int var7 = -var2; var7 < 0; ++var7) {
				anIntArray1571[var6++] = var4;
			}

			var6 += var8;
		}

	}

	public static void method794(int var0, int var1, int var2, int var3, int var4, int var5) {
		method788(var0, var1, var2, var4, var5);
		method788(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method790(var0, var1 + 1, var3 - 2, var4, var5);
			method790(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	public static void method795() {
		int var0 = 0;

		int var1;
		for (var1 = anInt1575 * anInt1570 - 7; var0 < var1; anIntArray1571[var0++] = 0) {
			anIntArray1571[var0++] = 0;
			anIntArray1571[var0++] = 0;
			anIntArray1571[var0++] = 0;
			anIntArray1571[var0++] = 0;
			anIntArray1571[var0++] = 0;
			anIntArray1571[var0++] = 0;
			anIntArray1571[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; anIntArray1571[var0++] = 0) {
			;
		}

	}

	public static void method796(int var0, int var1, int var2, int var3) {
		if (var1 >= anInt1573 && var1 < anInt1574) {
			if (var0 < anInt1572) {
				var2 -= anInt1572 - var0;
				var0 = anInt1572;
			}

			if (var0 + var2 > anInt1576) {
				var2 = anInt1576 - var0;
			}

			int var4 = var0 + var1 * anInt1575;

			for (int var5 = 0; var5 < var2; ++var5) {
				anIntArray1571[var4 + var5] = var3;
			}

		}
	}
}
