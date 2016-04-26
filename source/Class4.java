public class Class4 {

	int anInt105;
	int anInt106;
	int anInt107;
	String aString108;
	static int menuHeight;
	static int menuWidth;
	int anInt109;
	static int[] anIntArray110;

	static boolean decodeRegionHash(BitBuf var0, int var1) {
		int var2 = var0.getBits(2);
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		int var10;
		if (var2 == 0) {
			if (var0.getBits(1) != 0) {
				decodeRegionHash(var0, var1);
			}

			var4 = var0.getBits(6);
			var7 = var0.getBits(6);
			boolean var11 = var0.getBits(1) == 1;
			if (var11) {
				GPI.pendingFlagsIndices[++GPI.pendingFlagsCount - 1] = var1;
			}

			if (Client.playerArray[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var12 = Client.playerArray[var1] = new Player();
				var12.anInt2000 = var1;
				if (GPI.cachedAppearances[var1] != null) {
					var12.decodeApperance(GPI.cachedAppearances[var1]);
				}

				var12.anInt1953 = GPI.cachedDirections[var1] * 736533899;
				var12.targetIndex = GPI.cachedIndices[var1];
				var10 = GPI.cachedRegions[var1];
				var3 = var10 >> 28;
				var6 = var10 >> 14 & 0xff;
				var8 = var10 & 0xff;
				var12.aByteArray1951[0] = GPI.movementTypes[var1];
				var12.anInt2004 = (byte) var3;
				var12.method1043((var6 << 6) + var4 - Node_Sub10.chunkLeftX,
						(var8 << 6) + var7 - VarClientHub.chunkLeftY);
				var12.aBool1999 = false;
				return true;
			}
		} else if (var2 == 1) {
			var4 = var0.getBits(2);
			var7 = GPI.cachedRegions[var1];
			GPI.cachedRegions[var1] = (var7 & 0xfffffff) + (((var7 >> 28) + var4 & 0x3) << 28);
			return false;
		} else {
			int var5;
			int var9;
			if (var2 == 2) {
				var4 = var0.getBits(5);
				var7 = var4 >> 3;
				var9 = var4 & 0x7;
				var5 = GPI.cachedRegions[var1];
				var10 = (var5 >> 28) + var7 & 0x3;
				var3 = var5 >> 14 & 0xff;
				var6 = var5 & 0xff;
				if (var9 == 0) {
					--var3;
					--var6;
				}

				if (var9 == 1) {
					--var6;
				}

				if (var9 == 2) {
					++var3;
					--var6;
				}

				if (var9 == 3) {
					--var3;
				}

				if (var9 == 4) {
					++var3;
				}

				if (var9 == 5) {
					--var3;
					++var6;
				}

				if (var9 == 6) {
					++var6;
				}

				if (var9 == 7) {
					++var3;
					++var6;
				}

				GPI.cachedRegions[var1] = (var3 << 14) + (var10 << 28) + var6;
				return false;
			} else {
				var4 = var0.getBits(18);
				var7 = var4 >> 16;
				var9 = var4 >> 8 & 0xff;
				var5 = var4 & 0xff;
				var10 = GPI.cachedRegions[var1];
				var3 = (var10 >> 28) + var7 & 0x3;
				var6 = (var10 >> 14) + var9 & 0xff;
				var8 = var5 + var10 & 0xff;
				GPI.cachedRegions[var1] = (var6 << 14) + var8 + (var3 << 28);
				return false;
			}
		}
	}

	static void method70(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; var5++) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				VarClientHub.method183(var6, var2, var3, var4);
				SequenceType.method682(var6, var2, var3);
				if (var6.insetX > var6.viewportWidth - var6.width) {
					var6.insetX = var6.viewportWidth - var6.width;
				}

				if (var6.insetX < 0) {
					var6.insetX = 0;
				}

				if (var6.insetY > var6.viewportHeight - var6.height * 1227800423) {
					var6.insetY = var6.viewportHeight - var6.height * 1227800423;
				}

				if (var6.insetY < 0) {
					var6.insetY = 0;
				}

				if (var6.type == 0) {
					ObjectType.method870(var0, var6, var4);
				}
			}
		}

	}

}
