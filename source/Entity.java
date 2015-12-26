
public abstract class Entity extends DualNode {

	public int modelHeight = 1067393896;
	protected static boolean aBool1439;

	void method653(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		Model var10 = this.method654((byte) 13);
		if (var10 != null) {
			this.modelHeight = 1 * var10.modelHeight;
			var10.method653(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	protected Model method654(byte var1) {
		return null;
	}

	public static final Sprite getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var9 = ((long) var3 << 42) + ((long) var2 << 38) + ((long) var1 << 16) + (long) var0 + ((long) var4 << 40);
		Sprite var6;
		if (!var5) {
			var6 = (Sprite) ItemType.aClass106_1620.get(var9);
			if (var6 != null) {
				return var6;
			}
		}

		ItemType var7 = FriendedPlayer.getItemType(var0);
		if (var1 > 1 && var7.anIntArray1631 != null) {
			int var11 = -1;

			for (int var8 = 0; var8 < 10; ++var8) {
				if (var1 >= var7.anIntArray1632[var8] && var7.anIntArray1632[var8] != 0) {
					var11 = var7.anIntArray1631[var8];
				}
			}

			if (var11 != -1) {
				var7 = FriendedPlayer.getItemType(var11);
			}
		}

		Model var20 = var7.method811(1);
		if (var20 == null) {
			return null;
		} else {
			Sprite var19 = null;
			if (-507524473 * var7.anInt1633 != -1) {
				var19 = getItemSprite(var7.anInt1640 * -322771797, 10, 1, 0, 0, true);
				if (var19 == null) {
					return null;
				}
			} else if (125334003 * var7.notedId != -1) {
				var19 = getItemSprite(1428864645 * var7.unnotedId, var1, var2, var3, 0, false);
				if (var19 == null) {
					return null;
				}
			}

			int[] var15 = RSGraphics.raster;
			int var16 = RSGraphics.raster_width;
			int var17 = RSGraphics.raster_height;
			int[] var12 = new int[4];
			RSGraphics.copyDrawRegion(var12);
			var6 = new Sprite(36, 32);
			RSGraphics.setRaster(var6.pixels, 36, 32);
			RSGraphics.reset();
			DualNode_Sub13_Sub1.method909();
			DualNode_Sub13_Sub1.method911(16, 16);
			DualNode_Sub13_Sub1.aBool1780 = false;
			int var13 = -757409331 * var7.anInt1637;
			if (var5) {
				var13 = (int) ((double) var13 * 1.5D);
			} else if (var2 == 2) {
				var13 = (int) (1.04D * (double) var13);
			}

			int var18 = var13 * DualNode_Sub13_Sub1.SIN_TABLE[-1553926171 * var7.anInt1612] >> 16;
			int var14 = var13 * DualNode_Sub13_Sub1.COS_TABLE[-1553926171 * var7.anInt1612] >> 16;
			var20.method998();
			var20.method1012(0, 1613119041 * var7.anInt1613, var7.anInt1634 * 400650845, var7.anInt1612 * -1553926171,
					2086962731 * var7.anInt1642,
					var7.anInt1616 * -2057824987 + var18 + var20.modelHeight * 1812947537 / 2,
					var7.anInt1616 * -2057824987 + var14);
			if (var7.notedId * 125334003 != -1) {
				var19.method946(0, 0);
			}

			if (var2 >= 1) {
				var6.method952(1);
			}

			if (var2 >= 2) {
				var6.method952(16777215);
			}

			if (var3 != 0) {
				var6.method962(var3);
			}

			RSGraphics.setRaster(var6.pixels, 36, 32);
			if (var7.anInt1633 * -507524473 != -1) {
				var19.method946(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var7.stackable * 1303294175 == 1) {
				Class31.aDualNode_Sub13_Sub3_Sub1_350.method980(Class1.method13(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemType.aClass106_1620.put(var6, var9);
			}

			RSGraphics.setRaster(var15, var16, var17);
			RSGraphics.setDrawRegion(var12);
			DualNode_Sub13_Sub1.method909();
			DualNode_Sub13_Sub1.aBool1780 = true;
			return var6;
		}
	}

}
