
public class Class1 {

	static Class1 aClass1_1 = new Class1();
	static Class1 aClass1_2 = new Class1();
	static Class1 aClass1_3 = new Class1();
	static Class87_Sub1 aClass87_Sub1_4;
	public static DualNode_Sub15 aDualNode_Sub15_5;
	static Class1 aClass1_6 = new Class1();

	static final String method13(int var0) {
		return var0 < 100000 ? "<col=ffff00>" + var0 + "</col>"
				: (var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + GameStrings.aString951 + "</col>"
						: "<col=00ff80>" + var0 / 1000000 + GameStrings.aString1005 + "</col>");
	}

	static final void method14(int var0) {
		short var1 = 256;
		Class6.anInt114 += var0 * -254253952;
		int var2;
		if (-1479972487 * Class6.anInt114 > Class33.anIntArray365.length) {
			Class6.anInt114 -= Class33.anIntArray365.length * 266449097;
			var2 = (int) (Math.random() * 12.0D);
			Varpbit.method877(Class6.aDualNode_Sub13_Sub2Array118[var2]);
		}

		var2 = 0;
		int var4 = var0 * 128;
		int var5 = 128 * (var1 - var0);

		int var3;
		int var7;
		for (var3 = 0; var3 < var5; ++var3) {
			var7 = Class122.anIntArray818[var2 + var4]
					- Class33.anIntArray365[var2 + -1479972487 * Class6.anInt114 & Class33.anIntArray365.length - 1]
							* var0 / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			Class122.anIntArray818[var2++] = var7;
		}

		int var6;
		int var8;
		for (var3 = var1 - var0; var3 < var1; ++var3) {
			var7 = var3 * 128;

			for (var8 = 0; var8 < 128; ++var8) {
				var6 = (int) (Math.random() * 100.0D);
				if (var6 < 50 && var8 > 10 && var8 < 118) {
					Class122.anIntArray818[var8 + var7] = 255;
				} else {
					Class122.anIntArray818[var8 + var7] = 0;
				}
			}
		}

		if (-1468156361 * Class6.anInt138 > 0) {
			Class6.anInt138 -= 2037874204 * var0;
		}

		if (560977075 * Class6.anInt127 > 0) {
			Class6.anInt127 -= 1290529260 * var0;
		}

		if (Class6.anInt138 * -1468156361 == 0 && 560977075 * Class6.anInt127 == 0) {
			var3 = (int) (Math.random() * (double) (2000 / var0));
			if (var3 == 0) {
				Class6.anInt138 = 2004753408;
			}

			if (var3 == 1) {
				Class6.anInt127 = -336991232;
			}
		}

		for (var3 = 0; var3 < var1 - var0; ++var3) {
			Class6.anIntArray145[var3] = Class6.anIntArray145[var3 + var0];
		}

		for (var3 = var1 - var0; var3 < var1; ++var3) {
			Class6.anIntArray145[var3] = (int) (Math.sin((double) (Class6.anInt130 * 364548381) / 14.0D) * 16.0D
					+ Math.sin((double) (364548381 * Class6.anInt130) / 15.0D) * 14.0D
					+ Math.sin((double) (Class6.anInt130 * 364548381) / 16.0D) * 12.0D);
			Class6.anInt130 += -571819723;
		}

		Class6.anInt129 += var0 * -809494109;
		var3 = (var0 + (Client.engineCycle * -1040073859 & 1)) / 2;
		if (var3 > 0) {
			for (var7 = 0; var7 < Class6.anInt129 * 1962167372; ++var7) {
				var8 = (int) (Math.random() * 124.0D) + 2;
				var6 = (int) (Math.random() * 128.0D) + 128;
				Class122.anIntArray818[var8 + (var6 << 7)] = 192;
			}

			Class6.anInt129 = 0;

			int var9;
			for (var7 = 0; var7 < var1; ++var7) {
				var8 = 0;
				var6 = 128 * var7;

				for (var9 = -var3; var9 < 128; ++var9) {
					if (var3 + var9 < 128) {
						var8 += Class122.anIntArray818[var3 + var6 + var9];
					}

					if (var9 - (1 + var3) >= 0) {
						var8 -= Class122.anIntArray818[var6 + var9 - (var3 + 1)];
					}

					if (var9 >= 0) {
						Class4.anIntArray110[var6 + var9] = var8 / (1 + var3 * 2);
					}
				}
			}

			for (var7 = 0; var7 < 128; ++var7) {
				var8 = 0;

				for (var6 = -var3; var6 < var1; ++var6) {
					var9 = var6 * 128;
					if (var6 + var3 < var1) {
						var8 += Class4.anIntArray110[var9 + var7 + 128 * var3];
					}

					if (var6 - (1 + var3) >= 0) {
						var8 -= Class4.anIntArray110[var9 + var7 - (1 + var3) * 128];
					}

					if (var6 >= 0) {
						Class122.anIntArray818[var7 + var9] = var8 / (1 + var3 * 2);
					}
				}
			}
		}

	}

}
