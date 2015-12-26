
public class UnderlayType extends DualNode {

	static Class106 underlays = new Class106(64);
	int anInt1510 = 0;
	static AbstractIndex underlay_ref;
	public int anInt1512;
	public int anInt1513;
	public int anInt1514;
	public int anInt1515;

	void post() {
		this.method703(this.anInt1510 * -1160088629);
	}

	void decode(ByteBuf var1, int var2) {
		while (true) {
			int var3 = var1.getUByte();
			if (var3 == 0) {
				return;
			}

			this.method706(var1, var3, var2);
		}
	}

	void method703(int var1) {
		double var2 = (double) (var1 >> 16 & 255) / 256.0D;
		double var10 = (double) (var1 >> 8 & 255) / 256.0D;
		double var6 = (double) (var1 & 255) / 256.0D;
		double var8 = var2;
		if (var10 < var2) {
			var8 = var10;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var12 = var2;
		if (var10 > var2) {
			var12 = var10;
		}

		if (var6 > var12) {
			var12 = var6;
		}

		double var14 = 0.0D;
		double var4 = 0.0D;
		double var16 = (var8 + var12) / 2.0D;
		if (var12 != var8) {
			if (var16 < 0.5D) {
				var4 = (var12 - var8) / (var12 + var8);
			}

			if (var16 >= 0.5D) {
				var4 = (var12 - var8) / (2.0D - var12 - var8);
			}

			if (var12 == var2) {
				var14 = (var10 - var6) / (var12 - var8);
			} else if (var12 == var10) {
				var14 = (var6 - var2) / (var12 - var8) + 2.0D;
			} else if (var12 == var6) {
				var14 = 4.0D + (var2 - var10) / (var12 - var8);
			}
		}

		var14 /= 6.0D;
		this.anInt1514 = (int) (256.0D * var4) * 203308565;
		this.anInt1513 = -2128615975 * (int) (256.0D * var16);
		if (this.anInt1514 * 1757454653 < 0) {
			this.anInt1514 = 0;
		} else if (1757454653 * this.anInt1514 > 255) {
			this.anInt1514 = 304076523;
		}

		if (this.anInt1513 * 789203561 < 0) {
			this.anInt1513 = 0;
		} else if (this.anInt1513 * 789203561 > 255) {
			this.anInt1513 = -1631194329;
		}

		if (var16 > 0.5D) {
			this.anInt1515 = 1720480603 * (int) ((1.0D - var16) * var4 * 512.0D);
		} else {
			this.anInt1515 = (int) (512.0D * var4 * var16) * 1720480603;
		}

		if (this.anInt1515 * 837190867 < 1) {
			this.anInt1515 = 1720480603;
		}

		this.anInt1512 = -1336121361 * (int) (var14 * (double) (837190867 * this.anInt1515));
	}

	static void method704(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var4 = new int[4];
		var2[0] = var0;
		var4[0] = var1;
		int var5 = 1;

		for (int var3 = 0; var3 < 4; ++var3) {
			if (World.anIntArray1118[var3] != var0) {
				var2[var5] = World.anIntArray1118[var3];
				var4[var5] = World.anIntArray1119[var3];
				++var5;
			}
		}

		World.anIntArray1118 = var2;
		World.anIntArray1119 = var4;
		Class73.method331(World.worlds, 0, World.worlds.length - 1, World.anIntArray1118, World.anIntArray1119);
	}

	static void method705() {
		for (int var0 = 0; var0 < 1768430155 * Client.menuItemCount; ++var0) {
			if (Class33.method199(Client.menuOpcodes[var0])) {
				if (var0 < 1768430155 * Client.menuItemCount - 1) {
					for (int var1 = var0; var1 < 1768430155 * Client.menuItemCount - 1; ++var1) {
						Client.menuActions[var1] = Client.menuActions[var1 + 1];
						Client.menuNouns[var1] = Client.menuNouns[var1 + 1];
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
						Client.menuArg0[var1] = Client.menuArg0[var1 + 1];
						Client.menuArg1[var1] = Client.menuArg1[1 + var1];
						Client.menuArg2[var1] = Client.menuArg2[var1 + 1];
					}
				}

				Client.menuItemCount -= 1937006435;
			}
		}

	}

	void method706(ByteBuf var1, int var2, int var3) {
		if (var2 == 1) {
			this.anInt1510 = var1.getMedium() * -161113629;
		}

	}

	static final byte[] method707(byte[] var0) {
		ByteBuf var1 = new ByteBuf(var0);
		int var4 = var1.getUByte();
		int var3 = var1.getInt();
		if (var3 >= 0 && (-1150359653 * AbstractIndex.anInt710 == 0 || var3 <= -1150359653 * AbstractIndex.anInt710)) {
			if (var4 == 0) {
				byte[] var6 = new byte[var3];
				var1.getBytes(var6, 0, var3);
				return var6;
			} else {
				int var2 = var1.getInt();
				if (var2 >= 0 && (-1150359653 * AbstractIndex.anInt710 == 0 || var2 <= AbstractIndex.anInt710 * -1150359653)) {
					byte[] var5 = new byte[var2];
					if (var4 == 1) {
						Class55.method276(var5, var2, var0, var3, 9);
					} else {
						AbstractIndex.aClass49_699.method248(var1, var5);
					}

					return var5;
				} else {
					throw new RuntimeException();
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
