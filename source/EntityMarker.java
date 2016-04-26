public final class EntityMarker {

	public Entity entity;
	int anInt267;
	int strictX;
	int strictY;
	int orientation;
	int floorLevel;
	int sizeX;
	int regionY;
	int sizeY;
	int anInt268;
	int height;
	int regionX;
	int config = 0;
	public int anInt269 = 0;

	static void method139(int var0, int var1, int var2) {
		if (Client.anInt2204 != 0 && var1 != 0 && Client.audioEffectCount < 50) {
			Client.anIntArray2206[Client.audioEffectCount] = var0;
			Client.anIntArray2073[Client.audioEffectCount] = var1;
			Client.anIntArray2029[Client.audioEffectCount] = var2;
			Client.aClass14Array2210[Client.audioEffectCount] = null;
			Client.anIntArray2209[Client.audioEffectCount] = 0;
			++Client.audioEffectCount;
		}

	}

	static final void method140(Class1 var0) {
		if (Class68.myPlayer.strictX >> 7 == Client.destinationX
				&& Class68.myPlayer.strictY >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		int var2 = GPI.localPlayerCount;
		int[] var6 = GPI.localPlayerIndices;
		int var3 = var2;
		if (Class1.aClass1_3 == var0 || Class1.aClass1_1 == var0) {
			var3 = 1;
		}

		for (int var5 = 0; var5 < var3; var5++) {
			Player var1;
			int var4;
			if (Class1.aClass1_3 == var0) {
				var1 = Class68.myPlayer;
				var4 = Class68.myPlayer.anInt2000 << 14;
			} else if (Class1.aClass1_1 == var0) {
				var1 = Client.playerArray[Client.anInt2111];
				var4 = Client.anInt2111 << 14;
			} else {
				var1 = Client.playerArray[var6[var5]];
				var4 = var6[var5] << 14;
				if (Class1.aClass1_6 == var0 && var6[var5] == Client.anInt2111) {
					continue;
				}
			}

			if (var1 != null && var1.hasConfig() && !var1.hidden) {
				var1.aBool1996 = false;
				if ((Client.lowMemory && var2 > 50 || var2 > 200) && Class1.aClass1_3 != var0
						&& var1.anInt1932 == var1.anInt1959) {
					var1.aBool1996 = true;
				}

				int var7 = var1.strictX >> 7;
				int var8 = var1.strictY >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var1.aModel2001 != null && Client.engineCycle >= var1.anInt1989
							&& Client.engineCycle < var1.anInt1990) {
						var1.aBool1996 = false;
						var1.anInt1997 = NpcType.method802(var1.strictX, var1.strictY,
								InterfaceNode.floorLevel * -1331355705);
						InterfaceNode.landscape.method20(InterfaceNode.floorLevel * -1331355705, var1.strictX,
								var1.strictY, var1.anInt1997, 60, var1, var1.anInt1937 * -2061229533, var4,
								var1.anInt1994, var1.anInt1995, var1.anInt1987, var1.anInt1985);
					} else {
						if ((var1.strictX & 0x7f) == 64 && (var1.strictY & 0x7f) == 64) {
							if (Client.anInt2208 == Client.anIntArrayArray2121[var7][var8]) {
								continue;
							}

							Client.anIntArrayArray2121[var7][var8] = Client.anInt2208;
						}

						var1.anInt1997 = NpcType.method802(var1.strictX, var1.strictY,
								InterfaceNode.floorLevel * -1331355705);
						InterfaceNode.landscape.method19(InterfaceNode.floorLevel * -1331355705, var1.strictX,
								var1.strictY, var1.anInt1997, 60, var1, var1.anInt1937 * -2061229533, var4,
								var1.aBool1919);
					}
				}
			}
		}

	}

}
