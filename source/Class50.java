
public class Class50 {

	static int anInt517 = 0;
	static int anInt518 = 0;
	static byte[][] aByteArrayArray519 = new byte[1000][];
	static byte[][] aByteArrayArray520 = new byte[250][];
	static int anInt521 = 0;
	static byte[][] aByteArrayArray522 = new byte[50][];

	public static void method251() {
		DualNode_Sub2.aClass106_1458.method429();
	}

	static synchronized byte[] unpooled(int var0) {
		byte[] var1;
		if (var0 == 100 && anInt521 * -1055263231 > 0) {
			var1 = aByteArrayArray519[(anInt521 -= 524945921) * -1055263231];
			aByteArrayArray519[anInt521 * -1055263231] = null;
			return var1;
		} else if (var0 == 5000 && anInt517 * -499712511 > 0) {
			var1 = aByteArrayArray520[(anInt517 -= 1238172161) * -499712511];
			aByteArrayArray520[anInt517 * -499712511] = null;
			return var1;
		} else if (var0 == 30000 && 1654292617 * anInt518 > 0) {
			var1 = aByteArrayArray522[(anInt518 -= 623310265) * 1654292617];
			aByteArrayArray522[1654292617 * anInt518] = null;
			return var1;
		} else {
			return new byte[var0];
		}
	}

	Class50() throws Throwable {
		throw new Error();
	}

	static int method253() {
		return 9;
	}

	static final void method254() {
		int var1;
		if (-1074177723 * Client.anInt2226 != -1) {
			var1 = Client.anInt2226 * -1074177723;
			if (DualNode_Sub2.method666(var1)) {
				Class77.method338(Widget.interfaces[var1], -1);
			}
		}

		for (var1 = 0; var1 < -580551879 * Client.anInt2168; ++var1) {
			if (Client.aBoolArray2118[var1]) {
				Client.aBoolArray2171[var1] = true;
			}

			Client.aBoolArray2137[var1] = Client.aBoolArray2118[var1];
			Client.aBoolArray2118[var1] = false;
		}

		Client.anInt2192 = 1803467401 * Client.engineCycle;
		Client.anInt2122 = 247064981;
		Client.anInt2123 = 630066539;
		TileDecorationStub.aWidget838 = null;
		if (Client.anInt2226 * -1074177723 != -1) {
			Client.anInt2168 = 0;
			Class24.method164(Client.anInt2226 * -1074177723, 0, 0, -452716157 * Class34.anInt381,
					Node_Sub9.anInt1339 * 674167779, 0, 0, -1);
		}

		DualNode_Sub13.method780();
		int var7;
		if (!Client.menuOpen) {
			if (Client.anInt2122 * -527636925 != -1) {
				var1 = -527636925 * Client.anInt2122;
				var7 = Client.anInt2123 * -477214531;
				if (1768430155 * Client.menuItemCount >= 2 || -1110581093 * Client.itemSelectionStatus != 0
						|| Client.spellSelected) {
					String var5;
					if (-1110581093 * Client.itemSelectionStatus == 1 && 1768430155 * Client.menuItemCount < 2) {
						var5 = GameStrings.aString993 + GameStrings.aString1003 + Client.selectedItemName + " "
								+ Class35.aString391;
					} else if (Client.spellSelected && Client.menuItemCount * 1768430155 < 2) {
						var5 = Client.menuActionPrefix + GameStrings.aString1003 + Client.selectedSpellName + " "
								+ Class35.aString391;
					} else {
						var5 = Class25.method165(1768430155 * Client.menuItemCount - 1);
					}

					if (Client.menuItemCount * 1768430155 > 2) {
						var5 = var5 + Class48_Sub1.method545(16777215) + " " + '/' + " "
								+ (Client.menuItemCount * 1768430155 - 2) + GameStrings.aString1051;
					}

					Class35.aDualNode_Sub13_Sub3_Sub1_386.method966(var5, var1 + 4, var7 + 15, 16777215, 0,
							Client.engineCycle * -1040073859 / 1000);
				}
			}
		} else {
			Class36.method207();
		}

		if (Client.anInt2177 * 1685649351 == 3) {
			for (var1 = 0; var1 < -580551879 * Client.anInt2168; ++var1) {
				if (Client.aBoolArray2137[var1]) {
					DualNode_Sub13.method785(Client.anIntArray2173[var1], Client.anIntArray2174[var1],
							Client.anIntArray2175[var1], Client.anIntArray2176[var1], 16711935, 128);
				} else if (Client.aBoolArray2171[var1]) {
					DualNode_Sub13.method785(Client.anIntArray2173[var1], Client.anIntArray2174[var1],
							Client.anIntArray2175[var1], Client.anIntArray2176[var1], 16711680, 128);
				}
			}
		}

		var1 = -747958745 * InterfaceNode.floorLevel;
		var7 = 1272643751 * Class68.myPlayer.strictX;
		int var13 = Class68.myPlayer.strictY * -1801433343;
		int var8 = Client.anInt2066 * -1163930299;

		for (Node_Sub6 var2 = (Node_Sub6) Node_Sub6.aDeque1279
				.method471(); var2 != null; var2 = (Node_Sub6) Node_Sub6.aDeque1279.method473()) {
			if (-1177973365 * var2.anInt1281 != -1 || var2.anIntArray1273 != null) {
				int var4 = 0;
				if (var7 > var2.anInt1269 * -159017461) {
					var4 += var7 - -159017461 * var2.anInt1269;
				} else if (var7 < var2.anInt1271 * 1701758645) {
					var4 += var2.anInt1271 * 1701758645 - var7;
				}

				if (var13 > var2.anInt1275 * -279466731) {
					var4 += var13 - -279466731 * var2.anInt1275;
				} else if (var13 < var2.anInt1272 * 1359159281) {
					var4 += 1359159281 * var2.anInt1272 - var13;
				}

				if (var4 - 64 <= var2.anInt1282 * -1167642823 && Client.anInt2205 * 873913835 != 0
						&& var2.anInt1270 * 1871061887 == var1) {
					var4 -= 64;
					if (var4 < 0) {
						var4 = 0;
					}

					int var10 = (-1167642823 * var2.anInt1282 - var4) * Client.anInt2205 * 873913835
							/ (-1167642823 * var2.anInt1282);
					Class14 var10000;
					if (var2.aNode_Sub4_Sub2_1276 == null) {
						if (var2.anInt1281 * -1177973365 >= 0) {
							var10000 = (Class14) null;
							Class14 var3 = Class14.method119(DualNode_Sub10.aClass87_Sub1_1537,
									-1177973365 * var2.anInt1281, 0);
							if (var3 != null) {
								Node_Sub2_Sub1 var9 = var3.method122().method722(Class59.aClass16_548);
								Node_Sub4_Sub2 var6 = Node_Sub4_Sub2.method771(var9, 100, var10);
								var6.method740(-1);
								FriendedPlayer.aNode_Sub4_Sub1_740.method729(var6);
								var2.aNode_Sub4_Sub2_1276 = var6;
							}
						}
					} else {
						var2.aNode_Sub4_Sub2_1276.method741(var10);
					}

					if (var2.aNode_Sub4_Sub2_1280 == null) {
						if (var2.anIntArray1273 != null && (var2.anInt1274 -= var8 * -2049360189) * -2041650709 <= 0) {
							int var11 = (int) (Math.random() * (double) var2.anIntArray1273.length);
							var10000 = (Class14) null;
							Class14 var14 = Class14.method119(DualNode_Sub10.aClass87_Sub1_1537,
									var2.anIntArray1273[var11], 0);
							if (var14 != null) {
								Node_Sub2_Sub1 var12 = var14.method122().method722(Class59.aClass16_548);
								Node_Sub4_Sub2 var0 = Node_Sub4_Sub2.method771(var12, 100, var10);
								var0.method740(0);
								FriendedPlayer.aNode_Sub4_Sub1_740.method729(var0);
								var2.aNode_Sub4_Sub2_1280 = var0;
								var2.anInt1274 = (var2.anInt1277 * -1875457101 + (int) (Math.random()
										* (double) (var2.anInt1278 * -1201579529 - -1875457101 * var2.anInt1277)))
										* -2049360189;
							}
						}
					} else {
						var2.aNode_Sub4_Sub2_1280.method741(var10);
						if (!var2.aNode_Sub4_Sub2_1280.method12()) {
							var2.aNode_Sub4_Sub2_1280 = null;
						}
					}
				} else {
					if (var2.aNode_Sub4_Sub2_1276 != null) {
						FriendedPlayer.aNode_Sub4_Sub1_740.method730(var2.aNode_Sub4_Sub2_1276);
						var2.aNode_Sub4_Sub2_1276 = null;
					}

					if (var2.aNode_Sub4_Sub2_1280 != null) {
						FriendedPlayer.aNode_Sub4_Sub1_740.method730(var2.aNode_Sub4_Sub2_1280);
						var2.aNode_Sub4_Sub2_1280 = null;
					}
				}
			}
		}

		Client.anInt2066 = 0;
	}
}
