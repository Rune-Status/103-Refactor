
public class Permission implements IOrdinal {

	static int[] anIntArray605;
	public int sprite;
	public static Permission PLAYER_MOD = new Permission(1, 0, true, true, true);
	public static Permission IRONMAN = new Permission(3, 2, false, false, true);
	public static Permission HARDCORE_IRONMAN = new Permission(4, 3, false, false, true);
	int rights;
	public boolean aBool611;
	public static Permission PLAYER = new Permission(0, -1, true, false, true);
	public static Permission JAGEX_MOD = new Permission(2, 1, true, true, false);
	static int[] anIntArray614;
	public boolean aBool615;

	public int ordinal() {
		return this.rights * -463554219;
	}

	Permission(int var1, int var2, boolean var3, boolean var4, boolean var5) {
		this.rights = var1 * -1040483331;
		this.sprite = var2 * -87121341;
		this.aBool611 = var4;
		this.aBool615 = var5;
	}

	static void method331(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var12 = var1 - 1;
			int var7 = 1 + var2;
			int var8 = (var1 + var2) / 2;
			World var5 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var5;

			label178: while (var12 < var7) {
				boolean var10 = true;

				while (true) {
					--var7;
					int var11 = 0;

					while (true) {
						int var6;
						int var9;
						if (var11 < 4) {
							if (var3[var11] == 2) {
								var9 = 639259553 * var0[var7].index;
								var6 = 639259553 * var5.index;
							} else if (var3[var11] == 1) {
								var9 = 215269871 * var0[var7].population;
								var6 = 215269871 * var5.population;
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
								var9 = var0[var7].id * -145619359;
								var6 = var5.id * -145619359;
							}

							if (var6 == var9) {
								if (var11 == 3) {
									var10 = false;
								}

								++var11;
								continue;
							}

							if ((var4[var11] != 1 || var9 <= var6) && (var4[var11] != 0 || var9 >= var6)) {
								var10 = false;
							}
						}

						if (!var10) {
							var10 = true;

							while (true) {
								++var12;
								var11 = 0;

								while (true) {
									if (var11 < 4) {
										if (var3[var11] == 2) {
											var9 = 639259553 * var0[var12].index;
											var6 = 639259553 * var5.index;
										} else if (var3[var11] == 1) {
											var9 = 215269871 * var0[var12].population;
											var6 = var5.population * 215269871;
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
											var9 = -145619359 * var0[var12].id;
											var6 = -145619359 * var5.id;
										}

										if (var9 == var6) {
											if (var11 == 3) {
												var10 = false;
											}

											++var11;
											continue;
										}

										if ((var4[var11] != 1 || var9 >= var6) && (var4[var11] != 0 || var9 <= var6)) {
											var10 = false;
										}
									}

									if (!var10) {
										if (var12 < var7) {
											World var13 = var0[var12];
											var0[var12] = var0[var7];
											var0[var7] = var13;
										}
										continue label178;
									}
									break;
								}
							}
						}
						break;
					}
				}
			}

			method331(var0, var1, var7, var3, var4);
			method331(var0, var7 + 1, var2, var3, var4);
		}

	}
}
