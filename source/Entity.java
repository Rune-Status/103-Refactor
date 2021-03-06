public abstract class Entity extends DualNode {

	protected static boolean aBool1439;
	public int height = 1067393896;

	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		Model var10 = this.getModel((byte) 13);
		if (var10 != null) {
			this.height = var10.height;
			var10.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	protected Model getModel(byte var1) {
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
			int var20 = -1;

			for (int var19 = 0; var19 < 10; var19++) {
				if (var1 >= var7.anIntArray1632[var19] && var7.anIntArray1632[var19] != 0) {
					var20 = var7.anIntArray1631[var19];
				}
			}

			if (var20 != -1) {
				var7 = FriendedPlayer.getItemType(var20);
			}
		}

		Model var191 = var7.method811(1);
		if (var191 == null) {
			return null;
		} else {
			Sprite var201 = null;
			if (var7.anInt1633 != -1) {
				var201 = getItemSprite(var7.anInt1640, 10, 1, 0, 0, true);
				if (var201 == null) {
					return null;
				}
			} else if (var7.notedId != -1) {
				var201 = getItemSprite(var7.unnotedId, var1, var2, var3, 0, false);
				if (var201 == null) {
					return null;
				}
			}

			int[] var15 = Raster.raster;
			int var16 = Raster.raster_width;
			int var17 = Raster.raster_height;
			int[] var12 = new int[4];
			Raster.copyDrawRegion(var12);
			var6 = new Sprite(36, 32);
			Raster.setRaster(var6.pixels, 36, 32);
			Raster.reset();
			Graphics3D.method909();
			Graphics3D.method911(16, 16);
			Graphics3D.aBool1780 = false;
			int var13 = var7.anInt1637;
			if (var5) {
				var13 = (int) ((double) var13 * 1.5D);
			} else if (var2 == 2) {
				var13 = (int) ((double) var13 * 1.04D);
			}

			int var18 = Graphics3D.SIN_TABLE[var7.anInt1612] * var13 >> 16;
			int var14 = Graphics3D.COS_TABLE[var7.anInt1612] * var13 >> 16;
			var191.method998();
			var191.method1012(0, var7.anInt1613, var7.anInt1634, var7.anInt1612, var7.anInt1642,
					var7.anInt1616 + var18 + var191.height * 1812947537 / 2, var7.anInt1616 + var14);
			if (var7.notedId != -1) {
				var201.method946(0, 0);
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

			Raster.setRaster(var6.pixels, 36, 32);
			if (var7.anInt1633 != -1) {
				var201.method946(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var7.stackable == 1) {
				TileUnderlay.aDualNode_Sub13_Sub3_Sub1_350.method980(Class1.method13(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemType.aClass106_1620.put(var6, var9);
			}

			Raster.setRaster(var15, var16, var17);
			Raster.setDrawRegion(var12);
			Graphics3D.method909();
			Graphics3D.aBool1780 = true;
			return var6;
		}
	}

}
