public class GameType implements IOrdinal {

	public String identifier;
	int ordinal;
	static GameType STELLARDAWN = new GameType("stellardawn", "Stellar Dawn", 1);
	static GameType GAME3 = new GameType("game3", "Game 3", 2);
	static GameType GAME4 = new GameType("game4", "Game 4", 3);
	static GameType GAME5 = new GameType("game5", "Game 5", 4);
	public static GameType OLDSCAPE = new GameType("oldscape", "RuneScape 2007", 5);
	static GameType RUNESCAPE = new GameType("runescape", "RuneScape", 0);

	public int ordinal() {
		return this.ordinal;
	}

	static final void method338(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; var2++) {
			Widget var5 = var0[var2];
			if (var5 != null && var5.parentId == var1 && (!var5.interactable || !IsaacRandom.method68(var5))) {
				int var4;
				if (var5.type == 0) {
					if (!var5.interactable && IsaacRandom.method68(var5) && ObjectType.aWidget1719 != var5) {
						continue;
					}

					method338(var0, var5.hash);
					if (var5.children != null) {
						method338(var5.children, var5.hash);
					}

					InterfaceNode var8 = (InterfaceNode) Client.interfaceNodes.get((long) var5.hash);
					if (var8 != null) {
						var4 = var8.type;
						if (IdentKitType.loadWidget(var4)) {
							method338(Widget.interfaces[var4], -1);
						}
					}
				}

				if (var5.type == 6) {
					if (var5.anInt1162 != -1 || var5.anInt1150 != -1) {
						boolean var7 = RuntimeException_Sub1.method932(var5);
						if (var7) {
							var4 = var5.anInt1150;
						} else {
							var4 = var5.anInt1162;
						}

						if (var4 != -1) {
							SequenceType var6 = Node_Sub6.getSequenceType(var4);

							for (var5.anInt1126 += Client.anInt2066; var5.anInt1126 > var6.anIntArray1481[var5.anInt1194]; Class68
									.method326(var5)) {
								var5.anInt1126 -= var6.anIntArray1481[var5.anInt1194];
								++var5.anInt1194;
								if (var5.anInt1194 >= var6.anIntArray1474.length) {
									var5.anInt1194 -= var6.anInt1477;
									if (var5.anInt1194 < 0 || var5.anInt1194 >= var6.anIntArray1474.length) {
										var5.anInt1194 = 0;
									}
								}
							}
						}
					}

					if (var5.anInt1149 != 0 && !var5.interactable) {
						int var81 = var5.anInt1149 >> 16;
						var4 = var5.anInt1149 << 16 >> 16;
						var81 = Client.anInt2066 * var81;
						var4 = Client.anInt2066 * var4;
						var5.rotationX = var5.rotationX + var81 & 0x7ff;
						var5.rotationZ = var5.rotationZ + var4 & 0x7ff;
						Class68.method326(var5);
					}
				}
			}
		}

	}

	GameType(String var1, String var2, int var3) {
		this.identifier = var1;
		this.ordinal = var3;
	}

	static final void method339() {
		Client.anInt2183 = 0;
		int var1 = (Class68.myPlayer.strictX >> 7) + Node_Sub10.chunkLeftX;
		int var0 = (Class68.myPlayer.strictY >> 7) + VarClientHub.chunkLeftY;
		if (var1 >= 3053 && var1 <= 3156 && var0 >= 3056 && var0 <= 3136) {
			Client.anInt2183 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var0 >= 9492 && var0 <= 9535) {
			Client.anInt2183 = 1;
		}

		if (Client.anInt2183 == 1 && var1 >= 3139 && var1 <= 3199 && var0 >= 3008 && var0 <= 3062) {
			Client.anInt2183 = 0;
		}

	}

}
