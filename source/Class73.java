
public class Class73 implements Interface5 {

	static int[] anIntArray605;
	public int anInt606;
	public static Class73 aClass73_607 = new Class73(1, 0, true, true, true);
	public static Class73 aClass73_608 = new Class73(3, 2, false, false, true);
	public static Class73 aClass73_609 = new Class73(4, 3, false, false, true);
	int anInt610;
	public boolean aBool611;
	public static Class73 aClass73_612 = new Class73(0, -1, true, false, true);
	public static Class73 aClass73_613 = new Class73(2, 1, true, true, false);
	static int[] anIntArray614;
	public boolean aBool615;

	public int method11(int var1) {
		return this.anInt610 * -463554219;
	}

	Class73(int var1, int var2, boolean var3, boolean var4, boolean var5) {
		this.anInt610 = var1 * -1040483331;
		this.anInt606 = var2 * -87121341;
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
