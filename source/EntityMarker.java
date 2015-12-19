
public final class EntityMarker {

	public Entity entity;
	int anInt267;
	int strictX;
	int strictY;
	int config = 0;
	int orientation;
	int floorLevel;
	int sizeX;
	int regionY;
	int sizeY;
	int anInt268;
	int height;
	public int anInt269 = 0;
	int regionX;

	static void method139(int var0, int var1, int var2) {
		if (Client.anInt2204 * 936209849 != 0 && var1 != 0 && Client.audioEffectCount * 2079336095 < 50) {
			Client.anIntArray2206[Client.audioEffectCount * 2079336095] = var0;
			Client.anIntArray2073[2079336095 * Client.audioEffectCount] = var1;
			Client.anIntArray2029[Client.audioEffectCount * 2079336095] = var2;
			Client.aClass14Array2210[Client.audioEffectCount * 2079336095] = null;
			Client.anIntArray2209[Client.audioEffectCount * 2079336095] = 0;
			Client.audioEffectCount += -857377441;
		}

	}

	static final void method140(Class1 var0) {
		if (1272643751 * Class68.myPlayer.strictX >> 7 == -1712731251 * Client.destinationX
				&& -1801433343 * Class68.myPlayer.strictY >> 7 == Client.destinationY * -691143955) {
			Client.destinationX = 0;
		}

		int var2 = -334270159 * GPI.localPlayerCount;
		int[] var6 = GPI.localPlayerIndices;
		int var3 = var2;
		if (var0 == Class1.aClass1_3 || var0 == Class1.aClass1_1) {
			var3 = 1;
		}

		for (int var5 = 0; var5 < var3; ++var5) {
			Player var1;
			int var4;
			if (Class1.aClass1_3 == var0) {
				var1 = Class68.myPlayer;
				var4 = 1011012763 * Class68.myPlayer.anInt2000 << 14;
			} else if (var0 == Class1.aClass1_1) {
				var1 = Client.playerArray[971766913 * Client.anInt2111];
				var4 = 971766913 * Client.anInt2111 << 14;
			} else {
				var1 = Client.playerArray[var6[var5]];
				var4 = var6[var5] << 14;
				if (var0 == Class1.aClass1_6 && var6[var5] == 971766913 * Client.anInt2111) {
					continue;
				}
			}

			if (var1 != null && var1.method1017((byte) 60) && !var1.aBool1998) {
				var1.aBool1996 = false;
				if ((Client.aBool2010 && var2 > 50 || var2 > 200) && var0 != Class1.aClass1_3
						&& var1.anInt1932 * 57983255 == var1.anInt1959 * 370127001) {
					var1.aBool1996 = true;
				}

				int var7 = var1.strictX * 1272643751 >> 7;
				int var8 = -1801433343 * var1.strictY >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var1.aModel2001 != null && Client.engineCycle * -1040073859 >= 359131139 * var1.anInt1989
							&& Client.engineCycle * -1040073859 < var1.anInt1990 * 959962901) {
						var1.aBool1996 = false;
						var1.anInt1997 = NpcDefinition.method802(var1.strictX * 1272643751, -1801433343 * var1.strictY,
								-747958745 * InterfaceNode.floorLevel) * 1126652769;
						InterfaceNode.landscape.method20(-747958745 * InterfaceNode.floorLevel,
								1272643751 * var1.strictX, -1801433343 * var1.strictY, var1.anInt1997 * -868972383, 60,
								var1, var1.anInt1937 * -2031663291, var4, 1245527343 * var1.anInt1994,
								var1.anInt1995 * 1547766969, var1.anInt1987 * 1357352179, var1.anInt1985 * -688461469);
					} else {
						if ((1272643751 * var1.strictX & 127) == 64 && (var1.strictY * -1801433343 & 127) == 64) {
							if (-1317183381 * Client.anInt2208 == Client.anIntArrayArray2121[var7][var8]) {
								continue;
							}

							Client.anIntArrayArray2121[var7][var8] = -1317183381 * Client.anInt2208;
						}

						var1.anInt1997 = NpcDefinition.method802(1272643751 * var1.strictX, var1.strictY * -1801433343,
								InterfaceNode.floorLevel * -747958745) * 1126652769;
						InterfaceNode.landscape.method19(-747958745 * InterfaceNode.floorLevel,
								1272643751 * var1.strictX, -1801433343 * var1.strictY, var1.anInt1997 * -868972383, 60,
								var1, var1.anInt1937 * -2031663291, var4, var1.aBool1919);
					}
				}
			}
		}

	}
}
