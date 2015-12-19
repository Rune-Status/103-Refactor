
public class Class56 {

	static Sprite aSprite542;

	public static String method284(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var5 = 2;

				for (int var6 = var0 / var1; var6 != 0; ++var5) {
					var6 /= var1;
				}

				char[] var4 = new char[var5];
				var4[0] = 43;

				for (int var3 = var5 - 1; var3 > 0; --var3) {
					int var8 = var0;
					var0 /= var1;
					int var7 = var8 - var0 * var1;
					if (var7 >= 10) {
						var4[var3] = (char) (var7 + 87);
					} else {
						var4[var3] = (char) (48 + var7);
					}
				}

				return new String(var4);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	static final String method285(int var0, int var1) {
		int var2 = var1 - var0;
		return var2 < -9 ? Class48_Sub1.method545(16711680)
				: (var2 < -6 ? Class48_Sub1.method545(16723968)
						: (var2 < -3 ? Class48_Sub1.method545(16740352)
								: (var2 < 0 ? Class48_Sub1.method545(16756736)
										: (var2 > 9 ? Class48_Sub1.method545('\uff00')
												: (var2 > 6 ? Class48_Sub1.method545(4259584)
														: (var2 > 3 ? Class48_Sub1.method545(8453888)
																: (var2 > 0 ? Class48_Sub1.method545(12648192)
																		: Class48_Sub1.method545(16776960))))))));
	}

	Class56() throws Throwable {
		throw new Error();
	}

	public static void method286(int var0) {
		if (Class110.anInt782 * -1587772409 != 0) {
			Class110.anInt787 = var0 * 827167249;
		} else {
			Class110.aNode_Sub4_Sub4_784.method827(var0);
		}

	}

	static final int method287() {
		if (Node_Sub5.aClass24_1265.aBool298) {
			return InterfaceNode.floorLevel * -747958745;
		} else {
			int var4 = 3;
			if (Class67.cameraPitch * 1162853107 < 310) {
				int var2 = 282154897 * Projectile.cameraX >> 7;
				int var1 = Class72.cameraY * -324676025 >> 7;
				int var3 = 1272643751 * Class68.myPlayer.strictX >> 7;
				int var0 = -1801433343 * Class68.myPlayer.strictY >> 7;
				if (var2 < 0 || var1 < 0 || var2 >= 104 || var1 >= 104) {
					return InterfaceNode.floorLevel * -747958745;
				}

				if ((Class39.renderRules[InterfaceNode.floorLevel * -747958745][var2][var1] & 4) != 0) {
					var4 = InterfaceNode.floorLevel * -747958745;
				}

				int var5;
				if (var3 > var2) {
					var5 = var3 - var2;
				} else {
					var5 = var2 - var3;
				}

				int var6;
				if (var0 > var1) {
					var6 = var0 - var1;
				} else {
					var6 = var1 - var0;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = 65536 * var6 / var5;
					var8 = '\u8000';

					while (var2 != var3) {
						if (var2 < var3) {
							++var2;
						} else if (var2 > var3) {
							--var2;
						}

						if ((Class39.renderRules[-747958745 * InterfaceNode.floorLevel][var2][var1] & 4) != 0) {
							var4 = -747958745 * InterfaceNode.floorLevel;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var1 < var0) {
								++var1;
							} else if (var1 > var0) {
								--var1;
							}

							if ((Class39.renderRules[InterfaceNode.floorLevel * -747958745][var2][var1] & 4) != 0) {
								var4 = -747958745 * InterfaceNode.floorLevel;
							}
						}
					}
				} else {
					var7 = 65536 * var5 / var6;
					var8 = '\u8000';

					while (var0 != var1) {
						if (var1 < var0) {
							++var1;
						} else if (var1 > var0) {
							--var1;
						}

						if ((Class39.renderRules[InterfaceNode.floorLevel * -747958745][var2][var1] & 4) != 0) {
							var4 = InterfaceNode.floorLevel * -747958745;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var2 < var3) {
								++var2;
							} else if (var2 > var3) {
								--var2;
							}

							if ((Class39.renderRules[-747958745 * InterfaceNode.floorLevel][var2][var1] & 4) != 0) {
								var4 = -747958745 * InterfaceNode.floorLevel;
							}
						}
					}
				}
			}

			if (1272643751 * Class68.myPlayer.strictX >= 0 && -1801433343 * Class68.myPlayer.strictY >= 0
					&& 1272643751 * Class68.myPlayer.strictX < 13312
					&& -1801433343 * Class68.myPlayer.strictY < 13312) {
				if ((Class39.renderRules[InterfaceNode.floorLevel * -747958745][Class68.myPlayer.strictX
						* 1272643751 >> 7][Class68.myPlayer.strictY * -1801433343 >> 7] & 4) != 0) {
					var4 = InterfaceNode.floorLevel * -747958745;
				}

				return var4;
			} else {
				return -747958745 * InterfaceNode.floorLevel;
			}
		}
	}
}
