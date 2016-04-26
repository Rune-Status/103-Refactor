public class Permission implements IOrdinal {

	static int[] anIntArray605;
	static int[] anIntArray614;
	int rights;
	public int sprite;
	public boolean aBool611;
	public boolean aBool615;
	public static Permission PLAYER_MOD = new Permission(1, 0, true, true, true);
	public static Permission IRONMAN = new Permission(3, 2, false, false, true);
	public static Permission HARDCORE_IRONMAN = new Permission(4, 3, false, false, true);
	public static Permission PLAYER = new Permission(0, -1, true, false, true);
	public static Permission JAGEX_MOD = new Permission(2, 1, true, true, false);

	public int ordinal() {
		return this.rights;
	}

	Permission(int var1, int var2, boolean var3, boolean var4, boolean var5) {
		this.rights = var1;
		this.sprite = var2;
		this.aBool611 = var4;
		this.aBool615 = var5;
	}

	static void method331(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var12 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var1 + var2) / 2;
			World var5 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var5;

			while (var12 < var7) {
				boolean var10 = true;

				int var11;
				int var6;
				int var9;
				do {
					--var7;

					for (var11 = 0; var11 < 4; var11++) {
						if (var3[var11] == 2) {
							var9 = var0[var7].index;
							var6 = var5.index;
						} else if (var3[var11] == 1) {
							var9 = var0[var7].population;
							var6 = var5.population;
							if (var9 == -1 && var4[var11] == 1) {
								var9 = 2001;
							}

							if (var6 == -1 && var4[var11] == 1) {
								var6 = 2001;
							}
						} else if (var3[var11] == 3) {
							var9 = var0[var7].method477() ? 1 : 0;
							var6 = !var5.method477() ? 0 : 1;
						} else {
							var9 = var0[var7].id;
							var6 = var5.id;
						}

						if (var6 != var9) {
							if ((var4[var11] != 1 || var9 <= var6) && (var4[var11] != 0 || var9 >= var6)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while (var10);

				var10 = true;

				do {
					++var12;

					for (var11 = 0; var11 < 4; var11++) {
						if (var3[var11] == 2) {
							var9 = var0[var12].index;
							var6 = var5.index;
						} else if (var3[var11] == 1) {
							var9 = var0[var12].population;
							var6 = var5.population;
							if (var9 == -1 && var4[var11] == 1) {
								var9 = 2001;
							}

							if (var6 == -1 && var4[var11] == 1) {
								var6 = 2001;
							}
						} else if (var3[var11] == 3) {
							var9 = var0[var12].method477() ? 1 : 0;
							var6 = var5.method477() ? 1 : 0;
						} else {
							var9 = var0[var12].id;
							var6 = var5.id;
						}

						if (var9 != var6) {
							if ((var4[var11] != 1 || var9 >= var6) && (var4[var11] != 0 || var9 <= var6)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while (var10);

				if (var12 < var7) {
					World var13 = var0[var12];
					var0[var12] = var0[var7];
					var0[var7] = var13;
				}
			}

			method331(var0, var1, var7, var3, var4);
			method331(var0, var7 + 1, var2, var3, var4);
		}

	}

}
