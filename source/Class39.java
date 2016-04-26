public final class Class39 {

	public static CacheFile[] cacheIndexFiles;
	static byte[][][] overlayIds;
	static byte[][][] aByteArrayArrayArray430;
	static int[] anIntArray432;
	static int[][][] anIntArrayArrayArray433;
	static int[][] anIntArrayArray441;
	static Picture[] aSpriteArray442;
	static int[] anIntArray427 = new int[] { 1, 0, -1, 0 };
	static int anInt431 = (int) (Math.random() * 17.0D) - 8;
	static int[] anIntArray434 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray435 = new int[] { 16, 32, 64, 128 };
	static byte[][][] renderRules = new byte[4][104][104];
	static int[][][] tileHeights = new int[4][105][105];
	static int[] anIntArray436 = new int[] { 0, -1, 0, 1 };
	static int[] anIntArray437 = new int[] { -1, -1, 1, 1 };
	static int anInt438 = 99;
	static int anInt439 = (int) (Math.random() * 33.0D) - 16;
	static int[] anIntArray440 = new int[] { 1, -1, -1, 1 };

	static final void method215(Character character, int var1, int var2, int var3, int var4, int var5) {
		if (character != null && character.hasConfig()) {
			if (character instanceof Npc) {
				NpcType var10 = ((Npc) character).type;
				if (var10.transformIds != null) {
					var10 = var10.transform();
				}

				if (var10 == null) {
					return;
				}
			}

			int var101 = GPI.localPlayerCount;
			int[] var6 = GPI.localPlayerIndices;
			int var8;
			NpcType var13;
			if (var1 < var101) {
				var8 = 30;
				Player var11 = (Player) character;
				if (var11.hidden) {
					return;
				}

				if (var11.skullIcon != -1 || var11.prayerIcon != -1) {
					SkeletonSet.characterToScreen(character, character.height + 15);
					if (Client.screenY > -1) {
						if (var11.skullIcon != -1) {
							VarBitType.aSpriteArray1728[var11.skullIcon].method946(Client.screenY + var2 - 12,
									Client.screenX + var3 - var8);
							var8 += 25;
						}

						if (var11.prayerIcon != -1) {
							ItemType.aSpriteArray1619[var11.prayerIcon].method946(Client.screenY + var2 - 12,
									Client.screenX + var3 - var8);
							var8 += 25;
						}
					}
				}

				if (var1 >= 0 && Client.anInt2075 == 10 && Client.anInt2158 == var6[var1]) {
					SkeletonSet.characterToScreen(character, character.height + 15);
					if (Client.screenY > -1) {
						aSpriteArray442[1].method946(Client.screenY + var2 - 12, Client.screenX + var3 - var8);
					}
				}
			} else {
				var13 = ((Npc) character).type;
				if (var13.transformIds != null) {
					var13 = var13.transform();
				}

				if (var13.anInt1577 >= 0 && var13.anInt1577 < ItemType.aSpriteArray1619.length) {
					SkeletonSet.characterToScreen(character, character.height + 15);
					if (Client.screenY > -1) {
						ItemType.aSpriteArray1619[var13.anInt1577].method946(Client.screenY + var2 - 12,
								Client.screenX + var3 - 30);
					}
				}

				if (Client.anInt2075 == 1 && Client.npcIndices[var1 - var101] == Client.anInt2021
						&& Client.engineCycle % 20 < 10) {
					SkeletonSet.characterToScreen(character, character.height + 15);
					if (Client.screenY > -1) {
						aSpriteArray442[0].method946(Client.screenY + var2 - 12, Client.screenX + var3 - 28);
					}
				}
			}

			if (character.overheadText != null && (var1 >= var101 || !character.aBool1923
					&& (Client.anInt2110 == 4 || !character.aBool1946 && (Client.anInt2110 == 0 || Client.anInt2110 == 3
							|| Client.anInt2110 == 1 && AnimationSkin.isFriended(((Player) character).name, false))))) {
				SkeletonSet.characterToScreen(character, character.height);
				if (Client.screenY > -1 && Client.anInt2082 < Client.anInt2083) {
					Client.anIntArray2087[Client.anInt2082] = Class35.b12_full.method967(character.overheadText) / 2;
					Client.anIntArray2086[Client.anInt2082] = Class35.b12_full.anInt1824;
					Client.anIntArray2084[Client.anInt2082] = Client.screenY;
					Client.anIntArray2085[Client.anInt2082] = Client.screenX;
					Client.anIntArray2088[Client.anInt2082] = character.anInt1942;
					Client.anIntArray2089[Client.anInt2082] = character.anInt1926;
					Client.anIntArray2132[Client.anInt2082] = character.anInt1927;
					Client.aStringArray2090[Client.anInt2082] = character.overheadText;
					++Client.anInt2082;
				}
			}

			if (character.healthBarCycle > Client.engineCycle) {
				SkeletonSet.characterToScreen(character, character.height + 15);
				if (Client.screenY > -1) {
					if (var1 < var101) {
						var8 = 30;
					} else {
						var13 = ((Npc) character).type;
						var8 = var13.anInt1604;
					}

					int var12 = character.hitpoints * var8 / character.maxHitpoints;
					if (var12 > var8) {
						var12 = var8;
					} else if (var12 == 0 && character.hitpoints > 0) {
						var12 = 1;
					}

					RSGraphics.method793(Client.screenY + var2 - var8 / 2, Client.screenX + var3 - 3, var12, 5,
							'\uff00');
					RSGraphics.method793(Client.screenY + var2 - var8 / 2 + var12, Client.screenX + var3 - 3,
							var8 - var12, 5, 16711680);
				}
			}

			for (var8 = 0; var8 < 4; var8++) {
				if (character.hitsplatCycles[var8] > Client.engineCycle) {
					SkeletonSet.characterToScreen(character, character.height / 2);
					if (Client.screenY > -1) {
						if (var8 == 1) {
							Client.screenX -= 20;
						}

						if (var8 == 2) {
							Client.screenY -= 15;
							Client.screenX -= 10;
						}

						if (var8 == 3) {
							Client.screenY += 15;
							Client.screenX -= 10;
						}

						Class96_Sub1.aSpriteArray1204[character.hitsplatDamages[var8]]
								.method946(Client.screenY + var2 - 12, Client.screenX + var3 - 12);
						ConsumingImageProducer.p11_full.method982(Integer.toString(character.hitsplatTypes[var8]),
								Client.screenY + var2 - 1, Client.screenX + var3 + 3, 16777215, 0);
					}
				}
			}
		}

	}

	static char method216(char var0) {
		switch (var0) {
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00df':
			return 'b';
		case '\u00ff':
		case '\u0178':
			return 'y';
		default:
			return java.lang.Character.toLowerCase(var0);
		}
	}

	static final boolean method217(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		} else {
			return false;
		}
	}

	public static int method218(int var0, int var1, int var2, Class48 var3, CollisionMap var4, boolean var5, int[] var6,
			int[] var7) {
		int var12;
		for (int var9 = 0; var9 < 128; var9++) {
			for (var12 = 0; var12 < 128; var12++) {
				Class58.anIntArrayArray543[var9][var12] = 0;
				Class58.anIntArrayArray546[var9][var12] = 99999999;
			}
		}

		int var10;
		int var11;
		byte var13;
		int var14;
		int var15;
		int var16;
		byte var17;
		int[][] var18;
		int var19;
		int var20;
		int var21;
		boolean var27;
		int var28;
		boolean var29;
		int var30;
		int var32;
		byte var331;
		if (var2 == 1) {
			var14 = var0;
			var11 = var1;
			var331 = 64;
			var13 = 64;
			var10 = var0 - var331;
			var16 = var1 - var13;
			Class58.anIntArrayArray543[var331][var13] = 99;
			Class58.anIntArrayArray546[var331][var13] = 0;
			var17 = 0;
			var21 = 0;
			Class58.anIntArray544[var17] = var0;
			var32 = var17 + 1;
			Class58.anIntArray547[var17] = var1;
			var18 = var4.flags;

			label340: {
				while (var32 != var21) {
					var14 = Class58.anIntArray544[var21];
					var11 = Class58.anIntArray547[var21];
					var21 = var21 + 1 & 0xfff;
					var28 = var14 - var10;
					var30 = var11 - var16;
					var19 = var14 - var4.anInt505;
					var20 = var11 - var4.anInt506;
					if (var3.method245(1, var14, var11, var4, -1909538051)) {
						Class58.anInt545 = var14;
						Class48_Sub1.anInt1298 = var11;
						var29 = true;
						break label340;
					}

					var15 = Class58.anIntArrayArray546[var28][var30] + 1;
					if (var28 > 0 && Class58.anIntArrayArray543[var28 - 1][var30] == 0
							&& (var18[var19 - 1][var20] & 0x1240108) == 0) {
						Class58.anIntArray544[var32] = var14 - 1;
						Class58.anIntArray547[var32] = var11;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 - 1][var30] = 2;
						Class58.anIntArrayArray546[var28 - 1][var30] = var15;
					}

					if (var28 < 127 && Class58.anIntArrayArray543[var28 + 1][var30] == 0
							&& (var18[var19 + 1][var20] & 0x1240180) == 0) {
						Class58.anIntArray544[var32] = var14 + 1;
						Class58.anIntArray547[var32] = var11;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 + 1][var30] = 8;
						Class58.anIntArrayArray546[var28 + 1][var30] = var15;
					}

					if (var30 > 0 && Class58.anIntArrayArray543[var28][var30 - 1] == 0
							&& (var18[var19][var20 - 1] & 0x1240102) == 0) {
						Class58.anIntArray544[var32] = var14;
						Class58.anIntArray547[var32] = var11 - 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28][var30 - 1] = 1;
						Class58.anIntArrayArray546[var28][var30 - 1] = var15;
					}

					if (var30 < 127 && Class58.anIntArrayArray543[var28][var30 + 1] == 0
							&& (var18[var19][var20 + 1] & 0x1240120) == 0) {
						Class58.anIntArray544[var32] = var14;
						Class58.anIntArray547[var32] = var11 + 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28][var30 + 1] = 4;
						Class58.anIntArrayArray546[var28][var30 + 1] = var15;
					}

					if (var28 > 0 && var30 > 0 && Class58.anIntArrayArray543[var28 - 1][var30 - 1] == 0
							&& (var18[var19 - 1][var20 - 1] & 0x124010e) == 0
							&& (var18[var19 - 1][var20] & 0x1240108) == 0
							&& (var18[var19][var20 - 1] & 0x1240102) == 0) {
						Class58.anIntArray544[var32] = var14 - 1;
						Class58.anIntArray547[var32] = var11 - 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 - 1][var30 - 1] = 3;
						Class58.anIntArrayArray546[var28 - 1][var30 - 1] = var15;
					}

					if (var28 < 127 && var30 > 0 && Class58.anIntArrayArray543[var28 + 1][var30 - 1] == 0
							&& (var18[var19 + 1][var20 - 1] & 0x1240183) == 0
							&& (var18[var19 + 1][var20] & 0x1240180) == 0
							&& (var18[var19][var20 - 1] & 0x1240102) == 0) {
						Class58.anIntArray544[var32] = var14 + 1;
						Class58.anIntArray547[var32] = var11 - 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 + 1][var30 - 1] = 9;
						Class58.anIntArrayArray546[var28 + 1][var30 - 1] = var15;
					}

					if (var28 > 0 && var30 < 127 && Class58.anIntArrayArray543[var28 - 1][var30 + 1] == 0
							&& (var18[var19 - 1][var20 + 1] & 0x1240138) == 0
							&& (var18[var19 - 1][var20] & 0x1240108) == 0
							&& (var18[var19][var20 + 1] & 0x1240120) == 0) {
						Class58.anIntArray544[var32] = var14 - 1;
						Class58.anIntArray547[var32] = var11 + 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 - 1][var30 + 1] = 6;
						Class58.anIntArrayArray546[var28 - 1][var30 + 1] = var15;
					}

					if (var28 < 127 && var30 < 127 && Class58.anIntArrayArray543[var28 + 1][var30 + 1] == 0
							&& (var18[var19 + 1][var20 + 1] & 0x12401e0) == 0
							&& (var18[var19 + 1][var20] & 0x1240180) == 0
							&& (var18[var19][var20 + 1] & 0x1240120) == 0) {
						Class58.anIntArray544[var32] = var14 + 1;
						Class58.anIntArray547[var32] = var11 + 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 + 1][var30 + 1] = 12;
						Class58.anIntArrayArray546[var28 + 1][var30 + 1] = var15;
					}
				}

				Class58.anInt545 = var14;
				Class48_Sub1.anInt1298 = var11;
				var29 = false;
			}

			var27 = var29;
		} else if (var2 == 2) {
			var14 = var0;
			var11 = var1;
			var331 = 64;
			var13 = 64;
			var10 = var0 - var331;
			var16 = var1 - var13;
			Class58.anIntArrayArray543[var331][var13] = 99;
			Class58.anIntArrayArray546[var331][var13] = 0;
			var17 = 0;
			var21 = 0;
			Class58.anIntArray544[var17] = var0;
			var32 = var17 + 1;
			Class58.anIntArray547[var17] = var1;
			var18 = var4.flags;

			label329: {
				while (var21 != var32) {
					var14 = Class58.anIntArray544[var21];
					var11 = Class58.anIntArray547[var21];
					var21 = var21 + 1 & 0xfff;
					var28 = var14 - var10;
					var30 = var11 - var16;
					var19 = var14 - var4.anInt505;
					var20 = var11 - var4.anInt506;
					if (var3.method245(2, var14, var11, var4, -1833137502)) {
						Class58.anInt545 = var14;
						Class48_Sub1.anInt1298 = var11;
						var29 = true;
						break label329;
					}

					var15 = Class58.anIntArrayArray546[var28][var30] + 1;
					if (var28 > 0 && Class58.anIntArrayArray543[var28 - 1][var30] == 0
							&& (var18[var19 - 1][var20] & 0x124010e) == 0
							&& (var18[var19 - 1][var20 + 1] & 0x1240138) == 0) {
						Class58.anIntArray544[var32] = var14 - 1;
						Class58.anIntArray547[var32] = var11;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 - 1][var30] = 2;
						Class58.anIntArrayArray546[var28 - 1][var30] = var15;
					}

					if (var28 < 126 && Class58.anIntArrayArray543[var28 + 1][var30] == 0
							&& (var18[var19 + 2][var20] & 0x1240183) == 0
							&& (var18[var19 + 2][var20 + 1] & 0x12401e0) == 0) {
						Class58.anIntArray544[var32] = var14 + 1;
						Class58.anIntArray547[var32] = var11;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 + 1][var30] = 8;
						Class58.anIntArrayArray546[var28 + 1][var30] = var15;
					}

					if (var30 > 0 && Class58.anIntArrayArray543[var28][var30 - 1] == 0
							&& (var18[var19][var20 - 1] & 0x124010e) == 0
							&& (var18[var19 + 1][var20 - 1] & 0x1240183) == 0) {
						Class58.anIntArray544[var32] = var14;
						Class58.anIntArray547[var32] = var11 - 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28][var30 - 1] = 1;
						Class58.anIntArrayArray546[var28][var30 - 1] = var15;
					}

					if (var30 < 126 && Class58.anIntArrayArray543[var28][var30 + 1] == 0
							&& (var18[var19][var20 + 2] & 0x1240138) == 0
							&& (var18[var19 + 1][var20 + 2] & 0x12401e0) == 0) {
						Class58.anIntArray544[var32] = var14;
						Class58.anIntArray547[var32] = var11 + 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28][var30 + 1] = 4;
						Class58.anIntArrayArray546[var28][var30 + 1] = var15;
					}

					if (var28 > 0 && var30 > 0 && Class58.anIntArrayArray543[var28 - 1][var30 - 1] == 0
							&& (var18[var19 - 1][var20] & 0x124013e) == 0
							&& (var18[var19 - 1][var20 - 1] & 0x124010e) == 0
							&& (var18[var19][var20 - 1] & 0x124018f) == 0) {
						Class58.anIntArray544[var32] = var14 - 1;
						Class58.anIntArray547[var32] = var11 - 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 - 1][var30 - 1] = 3;
						Class58.anIntArrayArray546[var28 - 1][var30 - 1] = var15;
					}

					if (var28 < 126 && var30 > 0 && Class58.anIntArrayArray543[var28 + 1][var30 - 1] == 0
							&& (var18[var19 + 1][var20 - 1] & 0x124018f) == 0
							&& (var18[var19 + 2][var20 - 1] & 0x1240183) == 0
							&& (var18[var19 + 2][var20] & 0x12401e3) == 0) {
						Class58.anIntArray544[var32] = var14 + 1;
						Class58.anIntArray547[var32] = var11 - 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 + 1][var30 - 1] = 9;
						Class58.anIntArrayArray546[var28 + 1][var30 - 1] = var15;
					}

					if (var28 > 0 && var30 < 126 && Class58.anIntArrayArray543[var28 - 1][var30 + 1] == 0
							&& (var18[var19 - 1][var20 + 1] & 0x124013e) == 0
							&& (var18[var19 - 1][var20 + 2] & 0x1240138) == 0
							&& (var18[var19][var20 + 2] & 0x12401f8) == 0) {
						Class58.anIntArray544[var32] = var14 - 1;
						Class58.anIntArray547[var32] = var11 + 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 - 1][var30 + 1] = 6;
						Class58.anIntArrayArray546[var28 - 1][var30 + 1] = var15;
					}

					if (var28 < 126 && var30 < 126 && Class58.anIntArrayArray543[var28 + 1][var30 + 1] == 0
							&& (var18[var19 + 1][var20 + 2] & 0x12401f8) == 0
							&& (var18[var19 + 2][var20 + 2] & 0x12401e0) == 0
							&& (var18[var19 + 2][var20 + 1] & 0x12401e3) == 0) {
						Class58.anIntArray544[var32] = var14 + 1;
						Class58.anIntArray547[var32] = var11 + 1;
						var32 = var32 + 1 & 0xfff;
						Class58.anIntArrayArray543[var28 + 1][var30 + 1] = 12;
						Class58.anIntArrayArray546[var28 + 1][var30 + 1] = var15;
					}
				}

				Class58.anInt545 = var14;
				Class48_Sub1.anInt1298 = var11;
				var29 = false;
			}

			var27 = var29;
		} else {
			var27 = ConsumingImageProducer.method512(var0, var1, var2, var3, var4);
		}

		var12 = var0 - 64;
		var14 = var1 - 64;
		var11 = Class58.anInt545;
		var28 = Class48_Sub1.anInt1298;
		if (!var27) {
			if (!var5) {
				return -1;
			}

			var30 = Integer.MAX_VALUE;
			var10 = Integer.MAX_VALUE;
			byte var31 = 10;
			var32 = var3.anInt511;
			var21 = var3.anInt509;
			int var33 = var3.anInt512;
			var19 = var3.anInt510;

			for (var20 = var32 - var31; var20 <= var31 + var32; var20++) {
				for (var15 = var21 - var31; var15 <= var21 + var31; var15++) {
					int var26 = var20 - var12;
					int var22 = var15 - var14;
					if (var26 >= 0 && var22 >= 0 && var26 < 128 && var22 < 128
							&& Class58.anIntArrayArray546[var26][var22] < 100) {
						int var24 = 0;
						if (var20 < var32) {
							var24 = var32 - var20;
						} else if (var20 > var32 + var33 - 1) {
							var24 = var20 - (var32 + var33 - 1);
						}

						int var23 = 0;
						if (var15 < var21) {
							var23 = var21 - var15;
						} else if (var15 > var19 + var21 - 1) {
							var23 = var15 - (var19 + var21 - 1);
						}

						int var25 = var23 * var23 + var24 * var24;
						if (var25 < var30 || var25 == var30 && Class58.anIntArrayArray546[var26][var22] < var10) {
							var30 = var25;
							var10 = Class58.anIntArrayArray546[var26][var22];
							var11 = var20;
							var28 = var15;
						}
					}
				}
			}

			if (var30 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var11 && var28 == var1) {
			return 0;
		} else {
			var13 = 0;
			Class58.anIntArray544[var13] = var11;
			var30 = var13 + 1;
			Class58.anIntArray547[var13] = var28;

			for (var10 = var16 = Class58.anIntArrayArray543[var11 - var12][var28 - var14]; var11 != var0
					|| var1 != var28; var10 = Class58.anIntArrayArray543[var11 - var12][var28 - var14]) {
				if (var10 != var16) {
					var16 = var10;
					Class58.anIntArray544[var30] = var11;
					Class58.anIntArray547[var30++] = var28;
				}

				if ((var10 & 0x2) != 0) {
					++var11;
				} else if ((var10 & 0x8) != 0) {
					--var11;
				}

				if ((var10 & 0x1) != 0) {
					++var28;
				} else if ((var10 & 0x4) != 0) {
					--var28;
				}
			}

			var32 = 0;

			while (var30-- > 0) {
				var6[var32] = Class58.anIntArray544[var30];
				var7[var32++] = Class58.anIntArray547[var30];
				if (var32 >= var6.length) {
					break;
				}
			}

			return var32;
		}
	}

	static final void method219(NpcType var0, int var1, int var2, int var3) {
		if (Client.menuItemCount < 400) {
			if (var0.transformIds != null) {
				var0 = var0.transform();
			}

			if (var0 != null && var0.aBool1602 && (!var0.aBool1603 || Client.anInt2136 == var1)) {
				String var6 = var0.name;
				if (var0.combatLevel != 0) {
					var6 = var6 + Class56.method285(var0.combatLevel, Class68.myPlayer.combatLevel) + " "
							+ Class35.aString389 + "level-" + var0.combatLevel + Class35.aString392;
				}

				if (Client.itemSelectionStatus == 1) {
					FriendedPlayer.addMenuRow("Use", Client.selectedItemName + " " + Class35.aString391 + " "
							+ Class48_Sub1.method545(16776960) + var6, 7, var1, var2, var3);
				} else if (Client.spellSelected) {
					if ((Class31.currentSpellTargets & 0x2) == 2) {
						FriendedPlayer.addMenuRow(Client.menuActionPrefix, Client.selectedSpellName + " "
								+ Class35.aString391 + " " + Class48_Sub1.method545(16776960) + var6, 8, var1, var2,
								var3);
					}
				} else {
					String[] var4 = var0.actions;
					if (Client.aBool2139) {
						var4 = GameCanvas.method885(var4);
					}

					int var5;
					if (var4 != null) {
						for (var5 = 4; var5 >= 0; --var5) {
							if (var4[var5] != null && !var4[var5].equalsIgnoreCase("Attack")) {
								byte var9 = 0;
								if (var5 == 0) {
									var9 = 9;
								}

								if (var5 == 1) {
									var9 = 10;
								}

								if (var5 == 2) {
									var9 = 11;
								}

								if (var5 == 3) {
									var9 = 12;
								}

								if (var5 == 4) {
									var9 = 13;
								}

								FriendedPlayer.addMenuRow(var4[var5], Class48_Sub1.method545(16776960) + var6, var9,
										var1, var2, var3);
							}
						}
					}

					if (var4 != null) {
						for (var5 = 4; var5 >= 0; --var5) {
							if (var4[var5] != null && var4[var5].equalsIgnoreCase("Attack")) {
								short var91 = 0;
								if (Class36.aClass36_399 != Client.aClass36_2199) {
									if (Client.aClass36_2199 == Class36.aClass36_398
											|| Class36.aClass36_403 == Client.aClass36_2199
													&& var0.combatLevel > Class68.myPlayer.combatLevel) {
										var91 = 2000;
									}

									int var8 = 0;
									if (var5 == 0) {
										var8 = var91 + 9;
									}

									if (var5 == 1) {
										var8 = var91 + 10;
									}

									if (var5 == 2) {
										var8 = var91 + 11;
									}

									if (var5 == 3) {
										var8 = var91 + 12;
									}

									if (var5 == 4) {
										var8 = var91 + 13;
									}

									FriendedPlayer.addMenuRow(var4[var5], Class48_Sub1.method545(16776960) + var6, var8,
											var1, var2, var3);
								}
							}
						}
					}

					FriendedPlayer.addMenuRow("Examine", Class48_Sub1.method545(16776960) + var6, 1003, var1, var2,
							var3);
				}
			}
		}

	}

	Class39() throws Throwable {
		throw new Error();
	}

	static void method220() {
		for (Node_Sub6 var0 = (Node_Sub6) Node_Sub6.aDeque1279
				.getFront(); var0 != null; var0 = (Node_Sub6) Node_Sub6.aDeque1279.getNext()) {
			if (var0.anObjectDefinition1283 != null) {
				var0.method536(-61806771);
			}
		}

	}

	static void method221(CacheIndex index, int type, int file, int crc, byte padding, boolean priority) {
		long hash = (long) ((type << 16) + file);
		FileRequest request = (FileRequest) Class81.aNodeTable685.get(hash);
		if (request == null) {
			request = (FileRequest) Class81.aNodeTable682.get(hash);
			if (request == null) {
				request = (FileRequest) Class81.aNodeTable673.get(hash);
				if (request != null) {
					if (priority) {
						request.unlinkDual();
						Class81.aNodeTable685.put(request, hash);
						--Class81.anInt674;
						++Class81.anInt670;
					}
				} else {
					if (!priority) {
						request = (FileRequest) Class81.aNodeTable675.get(hash);
						if (request != null) {
							return;
						}
					}

					request = new FileRequest();
					request.index = index;
					request.crc = crc;
					request.padding = padding;
					if (priority) {
						Class81.aNodeTable685.put(request, hash);
						++Class81.anInt670;
					} else {
						Class81.aNodeQueue_672.method425(request);
						Class81.aNodeTable673.put(request, hash);
						++Class81.anInt674;
					}
				}
			}
		}

	}

	static RuneScript getRuneScript(int var0) {
		RuneScript script = (RuneScript) RuneScript.aClass106_1725.get((long) var0);
		if (script != null) {
			return script;
		} else {
			byte[] bytes = InvType.clientScriptsIndex.getFile(var0, 0);
			if (bytes == null) {
				return null;
			} else {
				script = new RuneScript();
				ByteBuf buf = new ByteBuf(bytes);
				buf.position = buf.payload.length - 12;
				int count = buf.getInt();
				script.intArgCount = buf.getUShort();
				script.stringArgCount = buf.getUShort();
				script.intStackCount = buf.getUShort();
				script.stringStackCount = buf.getUShort();
				buf.position = 0;
				buf.getNullString();
				script.opcodes = new int[count];
				script.intOperands = new int[count];
				script.stringOperands = new String[count];

				int opcode;
				for (int pos = 0; buf.position < buf.payload.length - 12; script.opcodes[pos++] = opcode) {
					opcode = buf.getUShort();
					if (opcode == 3) {
						script.stringOperands[pos] = buf.getString();
					} else if (opcode < 100 && opcode != 21 && opcode != 38 && opcode != 39) {
						script.intOperands[pos] = buf.getInt();
					} else {
						script.intOperands[pos] = buf.getUByte();
					}
				}

				RuneScript.aClass106_1725.put(script, (long) var0);
				return script;
			}
		}
	}

}
