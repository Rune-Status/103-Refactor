
public class Class77 implements Interface5 {

	public String aString646;
	static Class77 aClass77_647 = new Class77("stellardawn", "Stellar Dawn", 1);
	static Class77 aClass77_648 = new Class77("game3", "Game 3", 2);
	static Class77 aClass77_649 = new Class77("game4", "Game 4", 3);
	static Class77 aClass77_650 = new Class77("game5", "Game 5", 4);
	public static Class77 aClass77_651 = new Class77("oldscape", "RuneScape 2007", 5);
	static Class77 aClass77_652 = new Class77("runescape", "RuneScape", 0);
	int anInt653;

	public int method11(int var1) {
		return 1118824193 * this.anInt653;
	}

	static final void method338(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var5 = var0[var2];
			if (var5 != null && var5.parentId * -1652479707 == var1
					&& (!var5.interactable || !IsaacRandom.method68(var5))) {
				int var4;
				if (var5.type * -1305917269 == 0) {
					if (!var5.interactable && IsaacRandom.method68(var5) && ObjectType.aWidget1719 != var5) {
						continue;
					}

					method338(var0, -1536575275 * var5.anInt1129);
					if (var5.children != null) {
						method338(var5.children, var5.anInt1129 * -1536575275);
					}

					InterfaceNode var3 = (InterfaceNode) Client.interfaceNodes
							.get((long) (-1536575275 * var5.anInt1129));
					if (var3 != null) {
						var4 = 226793949 * var3.type;
						if (IdentKitType.loadWidget(var4)) {
							method338(Widget.interfaces[var4], -1);
						}
					}
				}

				if (var5.type * -1305917269 == 6) {
					if (var5.anInt1162 * 467073769 != -1 || -213715327 * var5.anInt1150 != -1) {
						boolean var7 = RuntimeException_Sub1.method932(var5);
						if (var7) {
							var4 = var5.anInt1150 * -213715327;
						} else {
							var4 = 467073769 * var5.anInt1162;
						}

						if (var4 != -1) {
							SequenceType var6 = Node_Sub6.getSequenceType(var4);

							for (var5.anInt1126 += Client.anInt2066 * -1534081229; -688156249
									* var5.anInt1126 > var6.anIntArray1481[627142311 * var5.anInt1194]; Class68
											.method326(var5)) {
								var5.anInt1126 -= var6.anIntArray1481[627142311 * var5.anInt1194] * 228853271;
								var5.anInt1194 += -589211369;
								if (627142311 * var5.anInt1194 >= var6.anIntArray1474.length) {
									var5.anInt1194 -= var6.anInt1477 * 1846825653;
									if (var5.anInt1194 * 627142311 < 0
											|| 627142311 * var5.anInt1194 >= var6.anIntArray1474.length) {
										var5.anInt1194 = 0;
									}
								}
							}
						}
					}

					if (var5.anInt1149 * -2109049187 != 0 && !var5.interactable) {
						int var8 = var5.anInt1149 * -2109049187 >> 16;
						var4 = -2109049187 * var5.anInt1149 << 16 >> 16;
						var8 *= -1163930299 * Client.anInt2066;
						var4 *= Client.anInt2066 * -1163930299;
						var5.rotationX = (175924351 * var5.rotationX + var8 & 2047) * 1055873919;
						var5.rotationZ = -478470667 * (var4 + 745334365 * var5.rotationZ & 2047);
						Class68.method326(var5);
					}
				}
			}
		}

	}

	Class77(String var1, String var2, int var3) {
		this.aString646 = var1;
		this.anInt653 = 1757485313 * var3;
	}

	static final void method339() {
		Client.anInt2183 = 0;
		int var1 = (1272643751 * Class68.myPlayer.strictX >> 7) + Node_Sub10.regionBaseX * 1426698711;
		int var0 = (Class68.myPlayer.strictY * -1801433343 >> 7) + VarClientHub.regionBaseY * 714823515;
		if (var1 >= 3053 && var1 <= 3156 && var0 >= 3056 && var0 <= 3136) {
			Client.anInt2183 = 450862527;
		}

		if (var1 >= 3072 && var1 <= 3118 && var0 >= 9492 && var0 <= 9535) {
			Client.anInt2183 = 450862527;
		}

		if (Client.anInt2183 * 198136383 == 1 && var1 >= 3139 && var1 <= 3199 && var0 >= 3008 && var0 <= 3062) {
			Client.anInt2183 = 0;
		}

	}
}
