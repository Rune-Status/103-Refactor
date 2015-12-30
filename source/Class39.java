
public final class Class39 {

	static int[] anIntArray427 = new int[] { 1, 0, -1, 0 };
	public static CacheFile[] cacheIndexFiles;
	static byte[][][] aByteArrayArrayArray429;
	static byte[][][] aByteArrayArrayArray430;
	static int anInt431 = ((int) (Math.random() * 17.0D) - 8) * 1676696543;
	static int[] anIntArray432;
	static int[][][] anIntArrayArrayArray433;
	static int[] anIntArray434 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray435 = new int[] { 16, 32, 64, 128 };
	static byte[][][] renderRules = new byte[4][104][104];
	static int[][][] tileHeights = new int[4][105][105];
	static int[] anIntArray436 = new int[] { 0, -1, 0, 1 };
	static int[] anIntArray437 = new int[] { -1, -1, 1, 1 };
	static int anInt438 = 1869228033;
	static int anInt439 = ((int) (Math.random() * 33.0D) - 16) * 916560105;
	static int[] anIntArray440 = new int[] { 1, -1, -1, 1 };
	static int[][] anIntArrayArray441;
	static Sprite[] aSpriteArray442;

	static final void method215(Character var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.method1017((byte) 60)) {
			if (var0 instanceof Npc) {
				NpcType var7 = ((Npc) var0).definition;
				if (var7.transformIds != null) {
					var7 = var7.transform();
				}

				if (var7 == null) {
					return;
				}
			}

			int var10 = GPI.localPlayerCount * -334270159;
			int[] var6 = GPI.localPlayerIndices;
			int var8;
			if (var1 < var10) {
				var8 = 30;
				Player var9 = (Player) var0;
				if (var9.aBool1998) {
					return;
				}

				if (var9.skullIcon * 1744423653 != -1 || var9.prayerIcon * 266784541 != -1) {
					DualNode_Sub12.method777(var0, 15 + var0.anInt1950 * 1688909931);
					if (-94432357 * Client.anInt2093 > -1) {
						if (var9.skullIcon * 1744423653 != -1) {
							VarBitType.aSpriteArray1728[1744423653 * var9.skullIcon].method946(
									var2 + Client.anInt2093 * -94432357 - 12,
									var3 + -770682383 * Client.anInt2094 - var8);
							var8 += 25;
						}

						if (var9.prayerIcon * 266784541 != -1) {
							ItemType.aSpriteArray1619[var9.prayerIcon * 266784541].method946(
									-94432357 * Client.anInt2093 + var2 - 12,
									var3 + -770682383 * Client.anInt2094 - var8);
							var8 += 25;
						}
					}
				}

				if (var1 >= 0 && 314519437 * Client.anInt2075 == 10 && 1613691605 * Client.anInt2158 == var6[var1]) {
					DualNode_Sub12.method777(var0, 15 + var0.anInt1950 * 1688909931);
					if (-94432357 * Client.anInt2093 > -1) {
						aSpriteArray442[1].method946(Client.anInt2093 * -94432357 + var2 - 12,
								var3 + Client.anInt2094 * -770682383 - var8);
					}
				}
			} else {
				NpcType var12 = ((Npc) var0).definition;
				if (var12.transformIds != null) {
					var12 = var12.transform();
				}

				if (1855378703 * var12.anInt1577 >= 0
						&& 1855378703 * var12.anInt1577 < ItemType.aSpriteArray1619.length) {
					DualNode_Sub12.method777(var0, var0.anInt1950 * 1688909931 + 15);
					if (-94432357 * Client.anInt2093 > -1) {
						ItemType.aSpriteArray1619[var12.anInt1577 * 1855378703].method946(
								-94432357 * Client.anInt2093 + var2 - 12, -770682383 * Client.anInt2094 + var3 - 30);
					}
				}

				if (314519437 * Client.anInt2075 == 1
						&& Client.npcIndices[var1 - var10] == 1583399955 * Client.anInt2021
						&& Client.engineCycle * -1040073859 % 20 < 10) {
					DualNode_Sub12.method777(var0, 15 + var0.anInt1950 * 1688909931);
					if (-94432357 * Client.anInt2093 > -1) {
						aSpriteArray442[0].method946(var2 + -94432357 * Client.anInt2093 - 12,
								-770682383 * Client.anInt2094 + var3 - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var10 || !var0.aBool1923
					&& (Client.anInt2110 * -400704361 == 4 || !var0.aBool1946 && (Client.anInt2110 * -400704361 == 0
							|| -400704361 * Client.anInt2110 == 3 || -400704361 * Client.anInt2110 == 1
									&& Node_Sub5.method533(((Player) var0).name, false))))) {
				DualNode_Sub12.method777(var0, var0.anInt1950 * 1688909931);
				if (Client.anInt2093 * -94432357 > -1
						&& -1673918139 * Client.anInt2082 < Client.anInt2083 * -475281231) {
					Client.anIntArray2087[Client.anInt2082 * -1673918139] = Class35.b12_full
							.method967(var0.overheadText) / 2;
					Client.anIntArray2086[Client.anInt2082
							* -1673918139] = Class35.b12_full.anInt1824;
					Client.anIntArray2084[Client.anInt2082 * -1673918139] = -94432357 * Client.anInt2093;
					Client.anIntArray2085[-1673918139 * Client.anInt2082] = -770682383 * Client.anInt2094;
					Client.anIntArray2088[Client.anInt2082 * -1673918139] = var0.anInt1942 * 621976643;
					Client.anIntArray2089[-1673918139 * Client.anInt2082] = -1331068759 * var0.anInt1926;
					Client.anIntArray2132[Client.anInt2082 * -1673918139] = -346063939 * var0.anInt1927;
					Client.aStringArray2090[-1673918139 * Client.anInt2082] = var0.overheadText;
					Client.anInt2082 += 1164648845;
				}
			}

			if (var0.healthBarCycle * -1144844257 > Client.engineCycle * -1040073859) {
				DualNode_Sub12.method777(var0, 15 + var0.anInt1950 * 1688909931);
				if (Client.anInt2093 * -94432357 > -1) {
					if (var1 < var10) {
						var8 = 30;
					} else {
						NpcType var11 = ((Npc) var0).definition;
						var8 = -55339821 * var11.anInt1604;
					}

					int var13 = -1476598189 * var0.hitpoints * var8 / (var0.maxHitpoints * -1324479051);
					if (var13 > var8) {
						var13 = var8;
					} else if (var13 == 0 && -1476598189 * var0.hitpoints > 0) {
						var13 = 1;
					}

					RSGraphics.method793(Client.anInt2093 * -94432357 + var2 - var8 / 2,
							Client.anInt2094 * -770682383 + var3 - 3, var13, 5, '\uff00');
					RSGraphics.method793(-94432357 * Client.anInt2093 + var2 - var8 / 2 + var13,
							-770682383 * Client.anInt2094 + var3 - 3, var8 - var13, 5, 16711680);
				}
			}

			for (var8 = 0; var8 < 4; ++var8) {
				if (var0.hitsplatCycles[var8] > -1040073859 * Client.engineCycle) {
					DualNode_Sub12.method777(var0, 1688909931 * var0.anInt1950 / 2);
					if (Client.anInt2093 * -94432357 > -1) {
						if (var8 == 1) {
							Client.anInt2094 -= 442101076;
						}

						if (var8 == 2) {
							Client.anInt2093 -= 872648349;
							Client.anInt2094 -= -1926433110;
						}

						if (var8 == 3) {
							Client.anInt2093 += 872648349;
							Client.anInt2094 -= -1926433110;
						}

						Class96_Sub1.aSpriteArray1204[var0.hitsplatDamages[var8]].method946(
								-94432357 * Client.anInt2093 + var2 - 12, -770682383 * Client.anInt2094 + var3 - 12);
						Class20_Sub1.p11_full.method982(
								Integer.toString(var0.hitsplatTypes[var8]), var2 + -94432357 * Client.anInt2093 - 1,
								var3 + -770682383 * Client.anInt2094 + 3, 16777215, 0);
					}
				}
			}

		}
	}

	static char method216(char var0) {
		switch (var0) {
		case 32:
		case 45:
		case 95:
		case 160:
			return '_';
		case 35:
		case 91:
		case 93:
			return var0;
		case 192:
		case 193:
		case 194:
		case 195:
		case 196:
		case 224:
		case 225:
		case 226:
		case 227:
		case 228:
			return 'a';
		case 199:
		case 231:
			return 'c';
		case 200:
		case 201:
		case 202:
		case 203:
		case 232:
		case 233:
		case 234:
		case 235:
			return 'e';
		case 205:
		case 206:
		case 207:
		case 237:
		case 238:
		case 239:
			return 'i';
		case 209:
		case 241:
			return 'n';
		case 210:
		case 211:
		case 212:
		case 213:
		case 214:
		case 242:
		case 243:
		case 244:
		case 245:
		case 246:
			return 'o';
		case 217:
		case 218:
		case 219:
		case 220:
		case 249:
		case 250:
		case 251:
		case 252:
			return 'u';
		case 223:
			return 'b';
		case 255:
		case 376:
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
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var12 = 0; var12 < 128; ++var12) {
				Class58.anIntArrayArray543[var8][var12] = 0;
				Class58.anIntArrayArray546[var8][var12] = 99999999;
			}
		}

		byte var9;
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
		if (var2 == 1) {
			var14 = var0;
			var11 = var1;
			var9 = 64;
			var13 = 64;
			var10 = var0 - var9;
			var16 = var1 - var13;
			Class58.anIntArrayArray543[var9][var13] = 99;
			Class58.anIntArrayArray546[var9][var13] = 0;
			var17 = 0;
			var21 = 0;
			Class58.anIntArray544[var17] = var0;
			var32 = var17 + 1;
			Class58.anIntArray547[var17] = var1;
			var18 = var4.flags;

			while (true) {
				if (var32 == var21) {
					Class58.anInt545 = var14 * -1685050181;
					Class48_Sub1.anInt1298 = -1194986937 * var11;
					var29 = false;
					break;
				}

				var14 = Class58.anIntArray544[var21];
				var11 = Class58.anIntArray547[var21];
				var21 = 1 + var21 & 4095;
				var28 = var14 - var10;
				var30 = var11 - var16;
				var19 = var14 - 1676632637 * var4.anInt505;
				var20 = var11 - var4.anInt506 * 291084413;
				if (var3.method245(1, var14, var11, var4, -1909538051)) {
					Class58.anInt545 = var14 * -1685050181;
					Class48_Sub1.anInt1298 = var11 * -1194986937;
					var29 = true;
					break;
				}

				var15 = Class58.anIntArrayArray546[var28][var30] + 1;
				if (var28 > 0 && Class58.anIntArrayArray543[var28 - 1][var30] == 0
						&& (var18[var19 - 1][var20] & 19136776) == 0) {
					Class58.anIntArray544[var32] = var14 - 1;
					Class58.anIntArray547[var32] = var11;
					var32 = 1 + var32 & 4095;
					Class58.anIntArrayArray543[var28 - 1][var30] = 2;
					Class58.anIntArrayArray546[var28 - 1][var30] = var15;
				}

				if (var28 < 127 && Class58.anIntArrayArray543[var28 + 1][var30] == 0
						&& (var18[var19 + 1][var20] & 19136896) == 0) {
					Class58.anIntArray544[var32] = var14 + 1;
					Class58.anIntArray547[var32] = var11;
					var32 = 1 + var32 & 4095;
					Class58.anIntArrayArray543[1 + var28][var30] = 8;
					Class58.anIntArrayArray546[var28 + 1][var30] = var15;
				}

				if (var30 > 0 && Class58.anIntArrayArray543[var28][var30 - 1] == 0
						&& (var18[var19][var20 - 1] & 19136770) == 0) {
					Class58.anIntArray544[var32] = var14;
					Class58.anIntArray547[var32] = var11 - 1;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[var28][var30 - 1] = 1;
					Class58.anIntArrayArray546[var28][var30 - 1] = var15;
				}

				if (var30 < 127 && Class58.anIntArrayArray543[var28][1 + var30] == 0
						&& (var18[var19][1 + var20] & 19136800) == 0) {
					Class58.anIntArray544[var32] = var14;
					Class58.anIntArray547[var32] = 1 + var11;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[var28][1 + var30] = 4;
					Class58.anIntArrayArray546[var28][var30 + 1] = var15;
				}

				if (var28 > 0 && var30 > 0 && Class58.anIntArrayArray543[var28 - 1][var30 - 1] == 0
						&& (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19 - 1][var20] & 19136776) == 0
						&& (var18[var19][var20 - 1] & 19136770) == 0) {
					Class58.anIntArray544[var32] = var14 - 1;
					Class58.anIntArray547[var32] = var11 - 1;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[var28 - 1][var30 - 1] = 3;
					Class58.anIntArrayArray546[var28 - 1][var30 - 1] = var15;
				}

				if (var28 < 127 && var30 > 0 && Class58.anIntArrayArray543[1 + var28][var30 - 1] == 0
						&& (var18[1 + var19][var20 - 1] & 19136899) == 0 && (var18[1 + var19][var20] & 19136896) == 0
						&& (var18[var19][var20 - 1] & 19136770) == 0) {
					Class58.anIntArray544[var32] = 1 + var14;
					Class58.anIntArray547[var32] = var11 - 1;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[1 + var28][var30 - 1] = 9;
					Class58.anIntArrayArray546[var28 + 1][var30 - 1] = var15;
				}

				if (var28 > 0 && var30 < 127 && Class58.anIntArrayArray543[var28 - 1][1 + var30] == 0
						&& (var18[var19 - 1][1 + var20] & 19136824) == 0 && (var18[var19 - 1][var20] & 19136776) == 0
						&& (var18[var19][var20 + 1] & 19136800) == 0) {
					Class58.anIntArray544[var32] = var14 - 1;
					Class58.anIntArray547[var32] = var11 + 1;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[var28 - 1][var30 + 1] = 6;
					Class58.anIntArrayArray546[var28 - 1][var30 + 1] = var15;
				}

				if (var28 < 127 && var30 < 127 && Class58.anIntArrayArray543[var28 + 1][var30 + 1] == 0
						&& (var18[1 + var19][var20 + 1] & 19136992) == 0 && (var18[var19 + 1][var20] & 19136896) == 0
						&& (var18[var19][var20 + 1] & 19136800) == 0) {
					Class58.anIntArray544[var32] = 1 + var14;
					Class58.anIntArray547[var32] = var11 + 1;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[1 + var28][1 + var30] = 12;
					Class58.anIntArrayArray546[var28 + 1][1 + var30] = var15;
				}
			}

			var27 = var29;
		} else if (var2 == 2) {
			var14 = var0;
			var11 = var1;
			var9 = 64;
			var13 = 64;
			var10 = var0 - var9;
			var16 = var1 - var13;
			Class58.anIntArrayArray543[var9][var13] = 99;
			Class58.anIntArrayArray546[var9][var13] = 0;
			var17 = 0;
			var21 = 0;
			Class58.anIntArray544[var17] = var0;
			var32 = var17 + 1;
			Class58.anIntArray547[var17] = var1;
			var18 = var4.flags;

			while (true) {
				if (var21 == var32) {
					Class58.anInt545 = -1685050181 * var14;
					Class48_Sub1.anInt1298 = -1194986937 * var11;
					var29 = false;
					break;
				}

				var14 = Class58.anIntArray544[var21];
				var11 = Class58.anIntArray547[var21];
				var21 = 1 + var21 & 4095;
				var28 = var14 - var10;
				var30 = var11 - var16;
				var19 = var14 - 1676632637 * var4.anInt505;
				var20 = var11 - 291084413 * var4.anInt506;
				if (var3.method245(2, var14, var11, var4, -1833137502)) {
					Class58.anInt545 = var14 * -1685050181;
					Class48_Sub1.anInt1298 = -1194986937 * var11;
					var29 = true;
					break;
				}

				var15 = Class58.anIntArrayArray546[var28][var30] + 1;
				if (var28 > 0 && Class58.anIntArrayArray543[var28 - 1][var30] == 0
						&& (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][1 + var20] & 19136824) == 0) {
					Class58.anIntArray544[var32] = var14 - 1;
					Class58.anIntArray547[var32] = var11;
					var32 = 1 + var32 & 4095;
					Class58.anIntArrayArray543[var28 - 1][var30] = 2;
					Class58.anIntArrayArray546[var28 - 1][var30] = var15;
				}

				if (var28 < 126 && Class58.anIntArrayArray543[1 + var28][var30] == 0
						&& (var18[var19 + 2][var20] & 19136899) == 0 && (var18[2 + var19][var20 + 1] & 19136992) == 0) {
					Class58.anIntArray544[var32] = var14 + 1;
					Class58.anIntArray547[var32] = var11;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[1 + var28][var30] = 8;
					Class58.anIntArrayArray546[var28 + 1][var30] = var15;
				}

				if (var30 > 0 && Class58.anIntArrayArray543[var28][var30 - 1] == 0
						&& (var18[var19][var20 - 1] & 19136782) == 0 && (var18[1 + var19][var20 - 1] & 19136899) == 0) {
					Class58.anIntArray544[var32] = var14;
					Class58.anIntArray547[var32] = var11 - 1;
					var32 = 1 + var32 & 4095;
					Class58.anIntArrayArray543[var28][var30 - 1] = 1;
					Class58.anIntArrayArray546[var28][var30 - 1] = var15;
				}

				if (var30 < 126 && Class58.anIntArrayArray543[var28][1 + var30] == 0
						&& (var18[var19][2 + var20] & 19136824) == 0 && (var18[1 + var19][var20 + 2] & 19136992) == 0) {
					Class58.anIntArray544[var32] = var14;
					Class58.anIntArray547[var32] = 1 + var11;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[var28][var30 + 1] = 4;
					Class58.anIntArrayArray546[var28][var30 + 1] = var15;
				}

				if (var28 > 0 && var30 > 0 && Class58.anIntArrayArray543[var28 - 1][var30 - 1] == 0
						&& (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0
						&& (var18[var19][var20 - 1] & 19136911) == 0) {
					Class58.anIntArray544[var32] = var14 - 1;
					Class58.anIntArray547[var32] = var11 - 1;
					var32 = var32 + 1 & 4095;
					Class58.anIntArrayArray543[var28 - 1][var30 - 1] = 3;
					Class58.anIntArrayArray546[var28 - 1][var30 - 1] = var15;
				}

				if (var28 < 126 && var30 > 0 && Class58.anIntArrayArray543[1 + var28][var30 - 1] == 0
						&& (var18[var19 + 1][var20 - 1] & 19136911) == 0
						&& (var18[2 + var19][var20 - 1] & 19136899) == 0 && (var18[2 + var19][var20] & 19136995) == 0) {
					Class58.anIntArray544[var32] = var14 + 1;
					Class58.anIntArray547[var32] = var11 - 1;
					var32 = 1 + var32 & 4095;
					Class58.anIntArrayArray543[var28 + 1][var30 - 1] = 9;
					Class58.anIntArrayArray546[1 + var28][var30 - 1] = var15;
				}

				if (var28 > 0 && var30 < 126 && Class58.anIntArrayArray543[var28 - 1][1 + var30] == 0
						&& (var18[var19 - 1][1 + var20] & 19136830) == 0
						&& (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) {
					Class58.anIntArray544[var32] = var14 - 1;
					Class58.anIntArray547[var32] = var11 + 1;
					var32 = 1 + var32 & 4095;
					Class58.anIntArrayArray543[var28 - 1][var30 + 1] = 6;
					Class58.anIntArrayArray546[var28 - 1][var30 + 1] = var15;
				}

				if (var28 < 126 && var30 < 126 && Class58.anIntArrayArray543[var28 + 1][1 + var30] == 0
						&& (var18[1 + var19][var20 + 2] & 19137016) == 0
						&& (var18[var19 + 2][var20 + 2] & 19136992) == 0
						&& (var18[var19 + 2][var20 + 1] & 19136995) == 0) {
					Class58.anIntArray544[var32] = var14 + 1;
					Class58.anIntArray547[var32] = var11 + 1;
					var32 = 1 + var32 & 4095;
					Class58.anIntArrayArray543[var28 + 1][1 + var30] = 12;
					Class58.anIntArrayArray546[1 + var28][1 + var30] = var15;
				}
			}

			var27 = var29;
		} else {
			var27 = Class20_Sub1.method512(var0, var1, var2, var3, var4);
		}

		var12 = var0 - 64;
		var14 = var1 - 64;
		var11 = Class58.anInt545 * -676775821;
		var28 = -1224206473 * Class48_Sub1.anInt1298;
		if (!var27) {
			if (!var5) {
				return -1;
			}

			var30 = Integer.MAX_VALUE;
			var10 = Integer.MAX_VALUE;
			byte var31 = 10;
			var32 = var3.anInt511 * 2014068737;
			var21 = -1876894601 * var3.anInt509;
			int var33 = var3.anInt512 * 1842929661;
			var19 = -564046377 * var3.anInt510;

			for (var20 = var32 - var31; var20 <= var31 + var32; ++var20) {
				for (var15 = var21 - var31; var15 <= var21 + var31; ++var15) {
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

				if ((var10 & 2) != 0) {
					++var11;
				} else if ((var10 & 8) != 0) {
					--var11;
				}

				if ((var10 & 1) != 0) {
					++var28;
				} else if ((var10 & 4) != 0) {
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
		if (Client.menuItemCount * 1768430155 < 400) {
			if (var0.transformIds != null) {
				var0 = var0.transform();
			}

			if (var0 != null) {
				if (var0.aBool1602) {
					if (!var0.aBool1603 || -1668103725 * Client.anInt2136 == var1) {
						String var6 = var0.name;
						if (802957015 * var0.combatLevel != 0) {
							var6 = var6
									+ Class56.method285(802957015 * var0.combatLevel,
											1614853309 * Class68.myPlayer.combatLevel)
									+ " " + Class35.aString389 + GameStrings.aString999 + var0.combatLevel * 802957015
									+ Class35.aString392;
						}

						if (Client.itemSelectionStatus * -1110581093 == 1) {
							FriendedPlayer
									.addMenuRow(
											GameStrings.aString993, Client.selectedItemName + " " + Class35.aString391
													+ " " + Class48_Sub1.method545(16776960) + var6,
											7, var1, var2, var3);
						} else if (Client.spellSelected) {
							if ((Class31.currentSpellTargets * 2016481409 & 2) == 2) {
								FriendedPlayer.addMenuRow(Client.menuActionPrefix, Client.selectedSpellName + " "
										+ Class35.aString391 + " " + Class48_Sub1.method545(16776960) + var6, 8, var1,
										var2, var3);
							}
						} else {
							String[] var4 = var0.actions;
							if (Client.aBool2139) {
								var4 = GameCanvas.method885(var4);
							}

							int var5;
							if (var4 != null) {
								for (var5 = 4; var5 >= 0; --var5) {
									if (var4[var5] != null && !var4[var5].equalsIgnoreCase(GameStrings.aString1112)) {
										byte var7 = 0;
										if (var5 == 0) {
											var7 = 9;
										}

										if (var5 == 1) {
											var7 = 10;
										}

										if (var5 == 2) {
											var7 = 11;
										}

										if (var5 == 3) {
											var7 = 12;
										}

										if (var5 == 4) {
											var7 = 13;
										}

										FriendedPlayer.addMenuRow(var4[var5], Class48_Sub1.method545(16776960) + var6,
												var7, var1, var2, var3);
									}
								}
							}

							if (var4 != null) {
								for (var5 = 4; var5 >= 0; --var5) {
									if (var4[var5] != null && var4[var5].equalsIgnoreCase(GameStrings.aString1112)) {
										short var9 = 0;
										if (Class36.aClass36_399 != Client.aClass36_2199) {
											if (Client.aClass36_2199 == Class36.aClass36_398
													|| Class36.aClass36_403 == Client.aClass36_2199 && var0.combatLevel
															* 802957015 > Class68.myPlayer.combatLevel * 1614853309) {
												var9 = 2000;
											}

											int var8 = 0;
											if (var5 == 0) {
												var8 = 9 + var9;
											}

											if (var5 == 1) {
												var8 = var9 + 10;
											}

											if (var5 == 2) {
												var8 = var9 + 11;
											}

											if (var5 == 3) {
												var8 = 12 + var9;
											}

											if (var5 == 4) {
												var8 = var9 + 13;
											}

											FriendedPlayer.addMenuRow(var4[var5],
													Class48_Sub1.method545(16776960) + var6, var8, var1, var2, var3);
										}
									}
								}
							}

							FriendedPlayer.addMenuRow(GameStrings.aString994, Class48_Sub1.method545(16776960) + var6,
									1003, var1, var2, var3);
						}

					}
				}
			}
		}
	}

	Class39() throws Throwable {
		throw new Error();
	}

	static void method220() {
		for (Node_Sub6 var0 = (Node_Sub6) Node_Sub6.aDeque1279
				.method471(); var0 != null; var0 = (Node_Sub6) Node_Sub6.aDeque1279.method473()) {
			if (var0.anObjectDefinition1283 != null) {
				var0.method536(-61806771);
			}
		}

	}

	static void method221(CacheIndex index, int type, int file, int crc, byte padding, boolean priority) {
		long hash = (long) (file + (type << 16));
		FileRequest request = (FileRequest) Class81.aNodeTable685.get(hash);
		if (request == null) {
			request = (FileRequest) Class81.aNodeTable682.get(hash);
			if (request == null) {
				request = (FileRequest) Class81.aNodeTable673.get(hash);
				if (request != null) {
					if (priority) {
						request.unlinkDual();
						Class81.aNodeTable685.put(request, hash);
						Class81.anInt674 -= 556834453;
						Class81.anInt670 += -1554399579;
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
					request.crc = -1759629139 * crc;
					request.padding = padding;
					if (priority) {
						Class81.aNodeTable685.put(request, hash);
						Class81.anInt670 += -1554399579;
					} else {
						Class81.aClass105_672.method425(request);
						Class81.aNodeTable673.put(request, hash);
						Class81.anInt674 += 556834453;
					}

				}
			}
		}
	}

	static RuneScript getRuneScript(int var0) {
		RuneScript var1 = (RuneScript) RuneScript.aClass106_1725.get((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var4 = InvType.clientScriptsIndex.getFile(var0, 0);
			if (var4 == null) {
				return null;
			} else {
				var1 = new RuneScript();
				ByteBuf var2 = new ByteBuf(var4);
				var2.position = -184175589 * (var2.payload.length - 12);
				int var6 = var2.getInt();
				var1.intArgCount = var2.getUShort() * 2055457427;
				var1.stringArgCount = var2.getUShort() * 1720774461;
				var1.intStackCount = var2.getUShort() * -1455792945;
				var1.stringStackCount = var2.getUShort() * -144149209;
				var2.position = 0;
				var2.method599();
				var1.opcodes = new int[var6];
				var1.intOperands = new int[var6];
				var1.stringOperands = new String[var6];

				int var3;
				for (int var5 = 0; var2.position * 314639891 < var2.payload.length - 12; var1.opcodes[var5++] = var3) {
					var3 = var2.getUShort();
					if (var3 == 3) {
						var1.stringOperands[var5] = var2.getString();
					} else if (var3 < 100 && var3 != 21 && var3 != 38 && var3 != 39) {
						var1.intOperands[var5] = var2.getInt();
					} else {
						var1.intOperands[var5] = var2.getUByte();
					}
				}

				RuneScript.aClass106_1725.put(var1, (long) var0);
				return var1;
			}
		}
	}
}
