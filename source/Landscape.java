public class Landscape {

	int anInt56 = 0;
	int anInt40 = 0;
	EntityMarker[] tempEntityMarkers = new EntityMarker[5000];
	int[][] anIntArrayArray50 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int[][] anIntArrayArray51 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	int maxZ;
	int maxX;
	int maxY;
	LandscapeTile[][][] tiles;
	int[][][] anIntArrayArrayArray14;
	int[][][] tileHeights;
	static int anInt19;
	static int anInt26;
	static int anInt27;
	static int anInt28;
	static int anInt29;
	static boolean[][] aBoolArrayArray13;
	static int anInt15;
	static int anInt7;
	static int anInt34;
	static int screenCenterY;
	static int anInt24;
	static int anInt41;
	static int anInt45;
	static int anInt18;
	static int anInt21;
	static int anInt23;
	static int anInt17 = 0;
	static boolean aBool30 = false;
	public static int anInt53;
	public static int anInt58;
	static int anInt42;
	static int anInt33;
	static int anInt57;
	static int anInt35;
	static int anInt59;
	static int anInt54;
	static int anInt55;
	static int anInt31 = 0;
	static int anInt36 = 0;
	static int anInt32 = 0;
	static int[] anIntArray8 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	static Class34[] aClass34Array10 = new Class34[500];
	static Deque aDeque12 = new Deque();
	static EntityMarker[] anEntityMarkerArray20 = new EntityMarker[100];
	public static boolean aBool22 = true;
	static int anInt37 = 4;
	static int[] anIntArray38;
	static Class34[][] aClass34ArrayArray39;
	static int[] anIntArray43;
	static int[] anIntArray44;
	static int[] anIntArray46;
	static int[] anIntArray47;
	static int[] anIntArray48;
	static int[] anIntArray49;
	static boolean[][][][] aBoolArrayArrayArrayArray52;

	public void method15() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.maxZ; var1++) {
			for (var2 = 0; var2 < this.maxX; var2++) {
				for (int var3 = 0; var3 < this.maxY; var3++) {
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < anInt37; var1++) {
			for (var2 = 0; var2 < anIntArray38[var1]; var2++) {
				aClass34ArrayArray39[var1][var2] = null;
			}

			anIntArray38[var1] = 0;
		}

		for (var1 = 0; var1 < this.anInt56; var1++) {
			this.tempEntityMarkers[var1] = null;
		}

		this.anInt56 = 0;

		for (var1 = 0; var1 < anEntityMarkerArray20.length; var1++) {
			anEntityMarkerArray20[var1] = null;
		}

	}

	public void method16(int var1) {
		this.anInt40 = var1;

		for (int var2 = 0; var2 < this.maxX; var2++) {
			for (int var3 = 0; var3 < this.maxY; var3++) {
				if (this.tiles[var1][var2][var3] == null) {
					this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
				}
			}
		}

	}

	public Landscape(int p, int x, int y, int[][][] th) {
		this.maxZ = p;
		this.maxX = x;
		this.maxY = y;
		this.tiles = new LandscapeTile[p][x][y];
		this.anIntArrayArrayArray14 = new int[p][x + 1][y + 1];
		this.tileHeights = th;
		this.method15();
	}

	public void method17(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9,
			int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18,
			int var19, int var20) {
		int var21;
		Class31 var22;
		if (var4 == 0) {
			var22 = new Class31(var11, var12, var13, var14, -1, var19, false);

			for (var21 = var1; var21 >= 0; --var21) {
				if (this.tiles[var21][var2][var3] == null) {
					this.tiles[var21][var2][var3] = new LandscapeTile(var21, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].aClass31_1404 = var22;
		} else if (var4 != 1) {
			Class38 var23 = new Class38(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13,
					var14, var15, var16, var17, var18, var19, var20);

			for (var21 = var1; var21 >= 0; --var21) {
				if (this.tiles[var21][var2][var3] == null) {
					this.tiles[var21][var2][var3] = new LandscapeTile(var21, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].aClass38_1405 = var23;
		} else {
			var22 = new Class31(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var21 = var1; var21 >= 0; --var21) {
				if (this.tiles[var21][var2][var3] == null) {
					this.tiles[var21][var2][var3] = new LandscapeTile(var21, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].aClass31_1404 = var22;
		}

	}

	public void addTileDecoration(int var1, int var2, int var3, int var4, Entity var5, int var6, int var7) {
		if (var5 != null) {
			TileDecorationStub var8 = new TileDecorationStub();
			var8.entity = var5;
			var8.strictX = var2 * 128 + 64;
			var8.strictY = var3 * 128 + 64;
			var8.height = var4;
			var8.anInt839 = var6;
			var8.config = var7;
			if (this.tiles[var1][var2][var3] == null) {
				this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].tileDecorationStub = var8;
		}

	}

	public void addItemPile(int var1, int var2, int var3, int var4, Entity var5, int var6, Entity var7, Entity var8) {
		ItemPile var9 = new ItemPile();
		var9.bottom = var5;
		var9.regionX = var2 * 128 + 64;
		var9.regionY = var3 * 128 + 64;
		var9.counterHeight = var4;
		var9.anInt831 = var6;
		var9.middle = var7;
		var9.anEntity832 = var8;
		int var13 = 0;
		LandscapeTile var10 = this.tiles[var1][var2][var3];
		if (var10 != null) {
			for (int var11 = 0; var11 < var10.anInt1407; var11++) {
				if ((var10.entityMarkers[var11].config & 0x100) == 256
						&& var10.entityMarkers[var11].entity instanceof Rasterizer) {
					Rasterizer var12 = (Rasterizer) var10.entityMarkers[var11].entity;
					var12.method998();
					if (var12.modelHeight * 1812947537 > var13) {
						var13 = var12.modelHeight * 1812947537;
					}
				}
			}
		}

		var9.height = var13;
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
		}

		this.tiles[var1][var2][var3].itemPile = var9;
	}

	public void addBoundary(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8,
			int var9, int var10) {
		if (var5 != null || var6 != null) {
			BoundaryStub var12 = new BoundaryStub();
			var12.anInt277 = var9;
			var12.config = var10;
			var12.strictX = var2 * 128 + 64;
			var12.strictY = var3 * 128 + 64;
			var12.floorLevel = var4;
			var12.entityA = var5;
			var12.entityB = var6;
			var12.orientationA = var7;
			var12.orientationB = var8;

			for (int var11 = var1; var11 >= 0; --var11) {
				if (this.tiles[var11][var2][var3] == null) {
					this.tiles[var11][var2][var3] = new LandscapeTile(var11, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].boundaryStub = var12;
		}

	}

	public void addBoundaryDecoration(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7,
			int var8, int var9, int var10, int var11, int var12) {
		if (var5 != null) {
			BoundaryDecorationStub var13 = new BoundaryDecorationStub();
			var13.anInt218 = var11;
			var13.config = var12;
			var13.regionX = var2 * 128 + 64;
			var13.regionY = var3 * 128 + 64;
			var13.height = var4;
			var13.entityA = var5;
			var13.entityB = var6;
			var13.orientationA = var7;
			var13.orientationB = var8;
			var13.insetX = var9;
			var13.insetY = var10;

			for (int var14 = var1; var14 >= 0; --var14) {
				if (this.tiles[var14][var2][var3] == null) {
					this.tiles[var14][var2][var3] = new LandscapeTile(var14, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].boundaryDecorationStub = var13;
		}

	}

	public boolean method18(int var1, int var2, int var3, int var4, int var5, int var6, Entity var7, int var8, int var9,
			int var10) {
		if (var7 == null) {
			return true;
		} else {
			int var11 = var2 * 128 + var5 * 64;
			int var12 = var3 * 128 + var6 * 64;
			return this.addEntityMarker(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9,
					var10);
		}
	}

	public boolean method19(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, int var8,
			boolean var9) {
		if (var6 == null) {
			return true;
		} else {
			int var10 = var2 - var5;
			int var11 = var3 - var5;
			int var12 = var2 + var5;
			int var13 = var3 + var5;
			if (var9) {
				if (var7 > 640 && var7 < 1408) {
					var13 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var12 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var11 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var10 -= 128;
				}
			}

			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			return this.addEntityMarker(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4,
					var6, var7, true, var8, 0);
		}
	}

	public boolean method20(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, int var8, int var9,
			int var10, int var11, int var12) {
		return var6 == null ? true
				: this.addEntityMarker(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6,
						var7, true, var8, 0);
	}

	public BoundaryStub method21(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.boundaryStub;
	}

	static final int method22(int var0, int var1) {
		var1 = (var0 & 0x7f) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 0xff80) + var1;
	}

	void method23(EntityMarker var1) {
		for (int var2 = var1.regionX; var2 <= var1.sizeX; var2++) {
			for (int var4 = var1.regionY; var4 <= var1.sizeY; var4++) {
				LandscapeTile var5 = this.tiles[var1.floorLevel][var2][var4];
				if (var5 != null) {
					int var3;
					for (var3 = 0; var3 < var5.anInt1407; var3++) {
						if (var5.entityMarkers[var3] == var1) {
							--var5.anInt1407;

							for (int var6 = var3; var6 < var5.anInt1407; var6++) {
								var5.entityMarkers[var6] = var5.entityMarkers[var6 + 1];
								var5.anIntArray1408[var6] = var5.anIntArray1408[var6 + 1];
							}

							var5.entityMarkers[var5.anInt1407] = null;
							break;
						}
					}

					var5.anInt1401 = 0;

					for (var3 = 0; var3 < var5.anInt1407; var3++) {
						var5.anInt1401 |= var5.anIntArray1408[var3];
					}
				}
			}
		}

	}

	public void method24(int var1, int var2, int var3, int var4) {
		LandscapeTile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			BoundaryDecorationStub var6 = var5.boundaryDecorationStub;
			if (var6 != null) {
				var6.insetX = var6.insetX * var4 / 16;
				var6.insetY = var6.insetY * var4 / 16;
			}
		}

	}

	public void method25(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.boundaryDecorationStub = null;
		}

	}

	public void method26(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			for (int var6 = 0; var6 < var4.anInt1407; var6++) {
				EntityMarker var5 = var4.entityMarkers[var6];
				if ((var5.anInt269 >> 29 & 0x3) == 2 && var5.regionX == var2 && var5.regionY == var3) {
					this.method23(var5);
					return;
				}
			}
		}

	}

	public void method27(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.tileDecorationStub = null;
		}

	}

	public void method28(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.itemPile = null;
		}

	}

	public BoundaryDecorationStub method29(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null ? var4.boundaryDecorationStub : null;
	}

	public EntityMarker method30(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.anInt1407; var5++) {
				EntityMarker var6 = var4.entityMarkers[var5];
				if ((var6.anInt269 >> 29 & 0x3) == 2 && var6.regionX == var2 && var6.regionY == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public int method31(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryDecorationStub != null ? var4.boundaryDecorationStub.anInt218 : 0;
	}

	public int method32(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0;
		} else {
			for (int var6 = 0; var6 < var4.anInt1407; var6++) {
				EntityMarker var5 = var4.entityMarkers[var6];
				if ((var5.anInt269 >> 29 & 0x3) == 2 && var5.regionX == var2 && var5.regionY == var3) {
					return var5.anInt269;
				}
			}

			return 0;
		}
	}

	public int method33(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.tileDecorationStub != null ? var4.tileDecorationStub.anInt839 : 0;
	}

	public int method34(int var1, int var2, int var3, int var4) {
		LandscapeTile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			if (var5.boundaryStub != null && var5.boundaryStub.anInt277 == var4) {
				return var5.boundaryStub.config & 0xff;
			} else if (var5.boundaryDecorationStub != null && var5.boundaryDecorationStub.anInt218 == var4) {
				return var5.boundaryDecorationStub.config & 0xff;
			} else if (var5.tileDecorationStub != null && var5.tileDecorationStub.anInt839 == var4) {
				return var5.tileDecorationStub.config & 0xff;
			} else {
				for (int var6 = 0; var6 < var5.anInt1407; var6++) {
					if (var5.entityMarkers[var6].anInt269 == var4) {
						return var5.entityMarkers[var6].config & 0xff;
					}
				}

				return -1;
			}
		} else {
			return -1;
		}
	}

	public void method35(int var1, int var2) {
		LandscapeTile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; var4++) {
			LandscapeTile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.floorLevel;

				for (int var6 = 0; var6 < var5.anInt1407; var6++) {
					EntityMarker var7 = var5.entityMarkers[var6];
					if ((var7.anInt269 >> 29 & 0x3) == 2 && var7.regionX == var1 && var7.regionY == var2) {
						--var7.floorLevel;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) {
			this.tiles[0][var1][var2] = new LandscapeTile(0, var1, var2);
		}

		this.tiles[0][var1][var2].aLandscapeTile1415 = var3;
		this.tiles[3][var1][var2] = null;
	}

	public void method36(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		LandscapeTile var7 = this.tiles[var4][var5][var6];
		if (var7 != null) {
			Class31 var9 = var7.aClass31_1404;
			int var11;
			if (var9 != null) {
				int var10 = var9.anInt348;
				if (var10 != 0) {
					for (var11 = 0; var11 < 4; var11++) {
						var1[var2] = var10;
						var1[var2 + 1] = var10;
						var1[var2 + 2] = var10;
						var1[var2 + 3] = var10;
						var2 += var3;
					}
				}
			} else {
				Class38 var18 = var7.aClass38_1405;
				if (var18 != null) {
					var11 = var18.anInt416;
					int var13 = var18.anInt422;
					int var12 = var18.anInt418;
					int var8 = var18.anInt419;
					int[] var15 = this.anIntArrayArray50[var11];
					int[] var14 = this.anIntArrayArray51[var13];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; var17++) {
							var1[var2] = var15[var14[var16++]] == 0 ? var12 : var8;
							var1[var2 + 1] = var15[var14[var16++]] == 0 ? var12 : var8;
							var1[var2 + 2] = var15[var14[var16++]] == 0 ? var12 : var8;
							var1[var2 + 3] = var15[var14[var16++]] == 0 ? var12 : var8;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; var17++) {
							if (var15[var14[var16++]] != 0) {
								var1[var2] = var8;
							}

							if (var15[var14[var16++]] != 0) {
								var1[var2 + 1] = var8;
							}

							if (var15[var14[var16++]] != 0) {
								var1[var2 + 2] = var8;
							}

							if (var15[var14[var16++]] != 0) {
								var1[var2 + 3] = var8;
							}

							var2 += var3;
						}
					}
				}
			}
		}

	}

	void method37(Model var1, int var2, int var3, int var4) {
		LandscapeTile var5;
		Model var6;
		if (var3 < this.maxX) {
			var5 = this.tiles[var2][var3 + 1][var4];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof Model) {
				var6 = (Model) var5.tileDecorationStub.entity;
				Model.method893(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < this.maxX) {
			var5 = this.tiles[var2][var3][var4 + 1];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof Model) {
				var6 = (Model) var5.tileDecorationStub.entity;
				Model.method893(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < this.maxX && var4 < this.maxY) {
			var5 = this.tiles[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof Model) {
				var6 = (Model) var5.tileDecorationStub.entity;
				Model.method893(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < this.maxX && var4 > 0) {
			var5 = this.tiles[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof Model) {
				var6 = (Model) var5.tileDecorationStub.entity;
				Model.method893(var1, var6, 128, 0, -128, true);
			}
		}

	}

	static boolean method38(int var0, int var1, int var2) {
		int var3 = anInt28 * var2 + anInt29 * var0 >> 16;
		int var4 = anInt29 * var2 - anInt28 * var0 >> 16;
		int var5 = anInt26 * var1 + anInt27 * var4 >> 16;
		int var7 = anInt27 * var1 - anInt26 * var4 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var6 = anInt54 + TexturedGraphic.anInt1784 * var3 / var5;
			int var8 = anInt55 + TexturedGraphic.anInt1784 * var7 / var5;
			return var6 >= anInt33 && var6 <= anInt35 && var8 >= anInt57 && var8 <= anInt59;
		} else {
			return false;
		}
	}

	public void method39(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.maxX * 128) {
			var1 = this.maxX * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.maxY * 128) {
			var3 = this.maxY * 128 - 1;
		}

		++anInt19;
		anInt26 = TexturedGraphic.SIN_TABLE[var4];
		anInt27 = TexturedGraphic.COS_TABLE[var4];
		anInt28 = TexturedGraphic.SIN_TABLE[var5];
		anInt29 = TexturedGraphic.COS_TABLE[var5];
		aBoolArrayArray13 = aBoolArrayArrayArrayArray52[(var4 - 128) / 32][var5 / 64];
		anInt15 = var1;
		anInt7 = var2;
		anInt34 = var3;
		screenCenterY = var1 / 128;
		anInt24 = var3 / 128;
		anInt41 = var6;
		anInt45 = screenCenterY - 25;
		if (anInt45 < 0) {
			anInt45 = 0;
		}

		anInt18 = anInt24 - 25;
		if (anInt18 < 0) {
			anInt18 = 0;
		}

		anInt21 = screenCenterY + 25;
		if (anInt21 > this.maxX) {
			anInt21 = this.maxX;
		}

		anInt23 = anInt24 + 25;
		if (anInt23 > this.maxY) {
			anInt23 = this.maxY;
		}

		this.method43();
		anInt17 = 0;

		int var8;
		LandscapeTile[][] var9;
		int var12;
		int var13;
		LandscapeTile var7;
		for (var8 = this.anInt40; var8 < this.maxZ; var8++) {
			var9 = this.tiles[var8];

			for (var12 = anInt45; var12 < anInt21; var12++) {
				for (var13 = anInt18; var13 < anInt23; var13++) {
					var7 = var9[var12][var13];
					if (var7 != null) {
						if (var7.anInt1410 > var6
								|| !aBoolArrayArray13[var12 - screenCenterY + 25][var13 - anInt24 + 25]
										&& this.tileHeights[var8][var12][var13] - var2 < 2000) {
							var7.aBool1411 = false;
							var7.aBool1412 = false;
							var7.anInt1409 = 0;
						} else {
							var7.aBool1411 = true;
							var7.aBool1412 = true;
							if (var7.anInt1407 > 0) {
								var7.aBool1402 = true;
							} else {
								var7.aBool1402 = false;
							}

							++anInt17;
						}
					}
				}
			}
		}

		int var11;
		int var14;
		int var15;
		int var16;
		for (var8 = this.anInt40; var8 < this.maxZ; var8++) {
			var9 = this.tiles[var8];

			for (var12 = -25; var12 <= 0; var12++) {
				var13 = screenCenterY + var12;
				var16 = screenCenterY - var12;
				if (var13 >= anInt45 || var16 < anInt21) {
					for (var11 = -25; var11 <= 0; var11++) {
						var15 = anInt24 + var11;
						var14 = anInt24 - var11;
						if (var13 >= anInt45) {
							if (var15 >= anInt18) {
								var7 = var9[var13][var15];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, true);
								}
							}

							if (var14 < anInt23) {
								var7 = var9[var13][var14];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, true);
								}
							}
						}

						if (var16 < anInt21) {
							if (var15 >= anInt18) {
								var7 = var9[var16][var15];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, true);
								}
							}

							if (var14 < anInt23) {
								var7 = var9[var16][var14];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, true);
								}
							}
						}

						if (anInt17 == 0) {
							aBool30 = false;
							return;
						}
					}
				}
			}
		}

		for (var8 = this.anInt40; var8 < this.maxZ; var8++) {
			var9 = this.tiles[var8];

			for (var12 = -25; var12 <= 0; var12++) {
				var13 = screenCenterY + var12;
				var16 = screenCenterY - var12;
				if (var13 >= anInt45 || var16 < anInt21) {
					for (var11 = -25; var11 <= 0; var11++) {
						var15 = anInt24 + var11;
						var14 = anInt24 - var11;
						if (var13 >= anInt45) {
							if (var15 >= anInt18) {
								var7 = var9[var13][var15];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, false);
								}
							}

							if (var14 < anInt23) {
								var7 = var9[var13][var14];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, false);
								}
							}
						}

						if (var16 < anInt21) {
							if (var15 >= anInt18) {
								var7 = var9[var16][var15];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, false);
								}
							}

							if (var14 < anInt23) {
								var7 = var9[var16][var14];
								if (var7 != null && var7.aBool1411) {
									this.method40(var7, false);
								}
							}
						}

						if (anInt17 == 0) {
							aBool30 = false;
							return;
						}
					}
				}
			}
		}

		aBool30 = false;
	}

	void method40(LandscapeTile var1, boolean var2) {
		aDeque12.method475(var1);

		while (true) {
			LandscapeTile var3;
			int var4;
			int var5;
			int var6;
			int var7;
			LandscapeTile[][] var8;
			LandscapeTile var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var27;
			int var281;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										BoundaryStub var10;
										EntityMarker var12;
										int var17;
										int var18;
										int var21;
										boolean var22;
										LandscapeTile var33;
										int var29;
										while (true) {
											do {
												var3 = (LandscapeTile) aDeque12.method469();
												if (var3 == null) {
													return;
												}
											} while (!var3.aBool1412);

											var4 = var3.regionX;
											var5 = var3.regionY;
											var6 = var3.floorLevel;
											var7 = var3.anInt1416;
											var8 = this.tiles[var6];
											if (!var3.aBool1411) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = this.tiles[var6 - 1][var4][var5];
													if (var9 != null && var9.aBool1412) {
														continue;
													}
												}

												if (var4 <= screenCenterY && var4 > anInt45) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.aBool1412
															&& (var9.aBool1411 || (var3.anInt1401 & 0x1) == 0)) {
														continue;
													}
												}

												if (var4 >= screenCenterY && var4 < anInt21 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.aBool1412
															&& (var9.aBool1411 || (var3.anInt1401 & 0x4) == 0)) {
														continue;
													}
												}

												if (var5 <= anInt24 && var5 > anInt18) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.aBool1412
															&& (var9.aBool1411 || (var3.anInt1401 & 0x8) == 0)) {
														continue;
													}
												}

												if (var5 >= anInt24 && var5 < anInt23 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.aBool1412
															&& (var9.aBool1411 || (var3.anInt1401 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.aBool1411 = false;
											if (var3.aLandscapeTile1415 != null) {
												var9 = var3.aLandscapeTile1415;
												if (var9.aClass31_1404 != null) {
													if (!this.method44(0, var4, var5)) {
														this.method54(var9.aClass31_1404, 0, anInt26, anInt27, anInt28,
																anInt29, var4, var5);
													}
												} else if (var9.aClass38_1405 != null
														&& !this.method44(0, var4, var5)) {
													this.method41(var9.aClass38_1405, anInt26, anInt27, anInt28,
															anInt29, var4, var5);
												}

												var10 = var9.boundaryStub;
												if (var10 != null) {
													var10.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
															var10.strictX - anInt15, var10.floorLevel - anInt7,
															var10.strictY - anInt34, var10.anInt277);
												}

												for (var11 = 0; var11 < var9.anInt1407; var11++) {
													var12 = var9.entityMarkers[var11];
													if (var12 != null) {
														var12.entity.method653(var12.orientation, anInt26, anInt27,
																anInt28, anInt29, var12.strictX - anInt15,
																var12.height - anInt7, var12.strictY - anInt34,
																var12.anInt269);
													}
												}
											}

											var22 = false;
											if (var3.aClass31_1404 != null) {
												if (!this.method44(var7, var4, var5)) {
													var22 = true;
													if (var3.aClass31_1404.anInt344 != 12345678
															|| aBool30 && var6 <= anInt31) {
														this.method54(var3.aClass31_1404, var7, anInt26, anInt27,
																anInt28, anInt29, var4, var5);
													}
												}
											} else if (var3.aClass38_1405 != null && !this.method44(var7, var4, var5)) {
												var22 = true;
												this.method41(var3.aClass38_1405, anInt26, anInt27, anInt28, anInt29,
														var4, var5);
											}

											var21 = 0;
											var11 = 0;
											BoundaryStub var24 = var3.boundaryStub;
											BoundaryDecorationStub var26 = var3.boundaryDecorationStub;
											if (var24 != null || var26 != null) {
												if (screenCenterY == var4) {
													++var21;
												} else if (screenCenterY < var4) {
													var21 += 2;
												}

												if (anInt24 == var5) {
													var21 += 3;
												} else if (anInt24 > var5) {
													var21 += 6;
												}

												var11 = anIntArray43[var21];
												var3.anInt1414 = anIntArray8[var21];
											}

											if (var24 != null) {
												if ((var24.orientationA & anIntArray44[var21]) != 0) {
													if (var24.orientationA == 16) {
														var3.anInt1409 = 3;
														var3.anInt1403 = anIntArray46[var21];
														var3.anInt1413 = -395327125 - var3.anInt1403 * 1299880057;
													} else if (var24.orientationA == 32) {
														var3.anInt1409 = 6;
														var3.anInt1403 = anIntArray47[var21];
														var3.anInt1413 = -790654250 - var3.anInt1403 * 1299880057;
													} else if (var24.orientationA == 64) {
														var3.anInt1409 = 12;
														var3.anInt1403 = anIntArray48[var21];
														var3.anInt1413 = -1581308500 - var3.anInt1403 * 1299880057;
													} else {
														var3.anInt1409 = 9;
														var3.anInt1403 = anIntArray49[var21];
														var3.anInt1413 = -1185981375 - var3.anInt1403 * 1299880057;
													}
												} else {
													var3.anInt1409 = 0;
												}

												if ((var24.orientationA & var11) != 0
														&& !this.method45(var7, var4, var5, var24.orientationA)) {
													var24.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
															var24.strictX - anInt15, var24.floorLevel - anInt7,
															var24.strictY - anInt34, var24.anInt277);
												}

												if ((var24.orientationB & var11) != 0
														&& !this.method45(var7, var4, var5, var24.orientationB)) {
													var24.entityB.method653(0, anInt26, anInt27, anInt28, anInt29,
															var24.strictX - anInt15, var24.floorLevel - anInt7,
															var24.strictY - anInt34, var24.anInt277);
												}
											}

											if (var26 != null && !this.method46(var7, var4, var5,
													var26.entityA.modelHeight * 1812947537)) {
												if ((var26.orientationA & var11) != 0) {
													var26.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
															var26.regionX - anInt15 + var26.insetX,
															var26.height - anInt7,
															var26.regionY - anInt34 + var26.insetY, var26.anInt218);
												} else if (var26.orientationA == 256) {
													var14 = var26.regionX - anInt15;
													var15 = var26.height - anInt7;
													var16 = var26.regionY - anInt34;
													var17 = var26.orientationB;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													if (var17 != 2 && var17 != 3) {
														var29 = var16;
													} else {
														var29 = -var16;
													}

													if (var29 < var18) {
														var26.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
																var26.insetX + var14, var15, var26.insetY + var16,
																var26.anInt218);
													} else if (var26.entityB != null) {
														var26.entityB.method653(0, anInt26, anInt27, anInt28, anInt29,
																var14, var15, var16, var26.anInt218);
													}
												}
											}

											if (var22) {
												TileDecorationStub var291 = var3.tileDecorationStub;
												if (var291 != null) {
													var291.entity.method653(0, anInt26, anInt27, anInt28, anInt29,
															var291.strictX - anInt15, var291.height - anInt7,
															var291.strictY - anInt34, var291.anInt839);
												}

												ItemPile var32 = var3.itemPile;
												if (var32 != null && var32.height == 0) {
													if (var32.middle != null) {
														var32.middle.method653(0, anInt26, anInt27, anInt28, anInt29,
																var32.regionX - anInt15, var32.counterHeight - anInt7,
																var32.regionY - anInt34, var32.anInt831);
													}

													if (var32.anEntity832 != null) {
														var32.anEntity832.method653(0, anInt26, anInt27, anInt28,
																anInt29, var32.regionX - anInt15,
																var32.counterHeight - anInt7, var32.regionY - anInt34,
																var32.anInt831);
													}

													if (var32.bottom != null) {
														var32.bottom.method653(0, anInt26, anInt27, anInt28, anInt29,
																var32.regionX - anInt15, var32.counterHeight - anInt7,
																var32.regionY - anInt34, var32.anInt831);
													}
												}
											}

											var14 = var3.anInt1401;
											if (var14 != 0) {
												if (var4 < screenCenterY && (var14 & 0x4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.aBool1412) {
														aDeque12.method475(var33);
													}
												}

												if (var5 < anInt24 && (var14 & 0x2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.aBool1412) {
														aDeque12.method475(var33);
													}
												}

												if (var4 > screenCenterY && (var14 & 0x1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.aBool1412) {
														aDeque12.method475(var33);
													}
												}

												if (var5 > anInt24 && (var14 & 0x8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.aBool1412) {
														aDeque12.method475(var33);
													}
												}
											}
											break;
										}

										if (var3.anInt1409 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var3.anInt1407; var21++) {
												if (var3.entityMarkers[var21].anInt268 != anInt19
														&& (var3.anIntArray1408[var21]
																& var3.anInt1409) == var3.anInt1403) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var10 = var3.boundaryStub;
												if (!this.method45(var7, var4, var5, var10.orientationA)) {
													var10.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
															var10.strictX - anInt15, var10.floorLevel - anInt7,
															var10.strictY - anInt34, var10.anInt277);
												}

												var3.anInt1409 = 0;
											}
										}

										if (!var3.aBool1402) {
											break;
										}

										try {
											var29 = var3.anInt1407;
											var3.aBool1402 = false;
											var21 = 0;

											label560: for (var11 = 0; var11 < var29; var11++) {
												var12 = var3.entityMarkers[var11];
												if (var12.anInt268 != anInt19) {
													for (var281 = var12.regionX; var281 <= var12.sizeX; var281++) {
														for (var14 = var12.regionY; var14 <= var12.sizeY; var14++) {
															var33 = var8[var281][var14];
															if (var33.aBool1411) {
																var3.aBool1402 = true;
																continue label560;
															}

															if (var33.anInt1409 != 0) {
																var16 = 0;
																if (var281 > var12.regionX) {
																	++var16;
																}

																if (var281 < var12.sizeX) {
																	var16 += 4;
																}

																if (var14 > var12.regionY) {
																	var16 += 8;
																}

																if (var14 < var12.sizeY) {
																	var16 += 2;
																}

																if ((var33.anInt1409 & var16) == var3.anInt1413
																		* 1149260233) {
																	var3.aBool1402 = true;
																	continue label560;
																}
															}
														}
													}

													anEntityMarkerArray20[var21++] = var12;
													var281 = screenCenterY - var12.regionX;
													var14 = var12.sizeX - screenCenterY;
													if (var14 > var281) {
														var281 = var14;
													}

													var15 = anInt24 - var12.regionY;
													var16 = var12.sizeY - anInt24;
													if (var16 > var15) {
														var12.anInt267 = var281 + var16;
													} else {
														var12.anInt267 = var281 + var15;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var27 = -1;

												EntityMarker var30;
												for (var281 = 0; var281 < var21; var281++) {
													var30 = anEntityMarkerArray20[var281];
													if (var30.anInt268 != anInt19) {
														if (var30.anInt267 > var11) {
															var11 = var30.anInt267;
															var27 = var281;
														} else if (var30.anInt267 == var11) {
															var15 = var30.strictX - anInt15;
															var16 = var30.strictY - anInt34;
															var17 = anEntityMarkerArray20[var27].strictX - anInt15;
															var18 = anEntityMarkerArray20[var27].strictY - anInt34;
															if (var15 * var15 + var16 * var16 > var17 * var17
																	+ var18 * var18) {
																var27 = var281;
															}
														}
													}
												}

												if (var27 == -1) {
													break;
												}

												var30 = anEntityMarkerArray20[var27];
												var30.anInt268 = anInt19;
												if (!this.method47(var7, var30.regionX, var30.sizeX, var30.regionY,
														var30.sizeY, var30.entity.modelHeight * 1812947537)) {
													var30.entity.method653(var30.orientation, anInt26, anInt27, anInt28,
															anInt29, var30.strictX - anInt15, var30.height - anInt7,
															var30.strictY - anInt34, var30.anInt269);
												}

												for (var14 = var30.regionX; var14 <= var30.sizeX; var14++) {
													for (var15 = var30.regionY; var15 <= var30.sizeY; var15++) {
														LandscapeTile var28 = var8[var14][var15];
														if (var28.anInt1409 != 0) {
															aDeque12.method475(var28);
														} else if ((var14 != var4 || var15 != var5)
																&& var28.aBool1412) {
															aDeque12.method475(var28);
														}
													}
												}
											}

											if (!var3.aBool1402) {
												break;
											}
										} catch (Exception var261) {
											var3.aBool1402 = false;
											break;
										}
									}
								} while (!var3.aBool1412);
							} while (var3.anInt1409 != 0);

							if (var4 > screenCenterY || var4 <= anInt45) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while (var9 != null && var9.aBool1412);

						if (var4 < screenCenterY || var4 >= anInt21 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while (var9 != null && var9.aBool1412);

					if (var5 > anInt24 || var5 <= anInt18) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while (var9 != null && var9.aBool1412);

				if (var5 < anInt24 || var5 >= anInt23 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while (var9 != null && var9.aBool1412);

			var3.aBool1412 = false;
			--anInt17;
			ItemPile var31 = var3.itemPile;
			if (var31 != null && var31.height != 0) {
				if (var31.middle != null) {
					var31.middle.method653(0, anInt26, anInt27, anInt28, anInt29, var31.regionX - anInt15,
							var31.counterHeight - anInt7 - var31.height, var31.regionY - anInt34, var31.anInt831);
				}

				if (var31.anEntity832 != null) {
					var31.anEntity832.method653(0, anInt26, anInt27, anInt28, anInt29, var31.regionX - anInt15,
							var31.counterHeight - anInt7 - var31.height, var31.regionY - anInt34, var31.anInt831);
				}

				if (var31.bottom != null) {
					var31.bottom.method653(0, anInt26, anInt27, anInt28, anInt29, var31.regionX - anInt15,
							var31.counterHeight - anInt7 - var31.height, var31.regionY - anInt34, var31.anInt831);
				}
			}

			if (var3.anInt1414 != 0) {
				BoundaryDecorationStub var321 = var3.boundaryDecorationStub;
				if (var321 != null && !this.method46(var7, var4, var5, var321.entityA.modelHeight * 1812947537)) {
					if ((var321.orientationA & var3.anInt1414) != 0) {
						var321.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
								var321.regionX - anInt15 + var321.insetX, var321.height - anInt7,
								var321.regionY - anInt34 + var321.insetY, var321.anInt218);
					} else if (var321.orientationA == 256) {
						var11 = var321.regionX - anInt15;
						var27 = var321.height - anInt7;
						var281 = var321.regionY - anInt34;
						var14 = var321.orientationB;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var281;
						} else {
							var16 = -var281;
						}

						if (var16 >= var15) {
							var321.entityA.method653(0, anInt26, anInt27, anInt28, anInt29, var321.insetX + var11,
									var27, var321.insetY + var281, var321.anInt218);
						} else if (var321.entityB != null) {
							var321.entityB.method653(0, anInt26, anInt27, anInt28, anInt29, var11, var27, var281,
									var321.anInt218);
						}
					}
				}

				BoundaryStub var331 = var3.boundaryStub;
				if (var331 != null) {
					if ((var331.orientationB & var3.anInt1414) != 0
							&& !this.method45(var7, var4, var5, var331.orientationB)) {
						var331.entityB.method653(0, anInt26, anInt27, anInt28, anInt29, var331.strictX - anInt15,
								var331.floorLevel - anInt7, var331.strictY - anInt34, var331.anInt277);
					}

					if ((var331.orientationA & var3.anInt1414) != 0
							&& !this.method45(var7, var4, var5, var331.orientationA)) {
						var331.entityA.method653(0, anInt26, anInt27, anInt28, anInt29, var331.strictX - anInt15,
								var331.floorLevel - anInt7, var331.strictY - anInt34, var331.anInt277);
					}
				}
			}

			LandscapeTile var34;
			if (var6 < this.maxZ - 1) {
				var34 = this.tiles[var6 + 1][var4][var5];
				if (var34 != null && var34.aBool1412) {
					aDeque12.method475(var34);
				}
			}

			if (var4 < screenCenterY) {
				var34 = var8[var4 + 1][var5];
				if (var34 != null && var34.aBool1412) {
					aDeque12.method475(var34);
				}
			}

			if (var5 < anInt24) {
				var34 = var8[var4][var5 + 1];
				if (var34 != null && var34.aBool1412) {
					aDeque12.method475(var34);
				}
			}

			if (var4 > screenCenterY) {
				var34 = var8[var4 - 1][var5];
				if (var34 != null && var34.aBool1412) {
					aDeque12.method475(var34);
				}
			}

			if (var5 > anInt24) {
				var34 = var8[var4][var5 - 1];
				if (var34 != null && var34.aBool1412) {
					aDeque12.method475(var34);
				}
			}
		}
	}

	void method41(Class38 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.anIntArray424.length;

		int var9;
		int var10;
		int var11;
		int var17;
		int var18;
		for (var9 = 0; var9 < var8; var9++) {
			var10 = var1.anIntArray424[var9] - anInt15;
			var17 = var1.anIntArray425[var9] - anInt7;
			var18 = var1.anIntArray407[var9] - anInt34;
			var11 = var18 * var4 + var10 * var5 >> 16;
			var18 = var18 * var5 - var10 * var4 >> 16;
			var10 = var11;
			var11 = var17 * var3 - var18 * var2 >> 16;
			var18 = var17 * var2 + var18 * var3 >> 16;
			if (var18 < 50) {
				return;
			}

			if (var1.anIntArray414 != null) {
				Class38.anIntArray412[var9] = var10;
				Class38.anIntArray405[var9] = var11;
				Class38.anIntArray408[var9] = var18;
			}

			Class38.anIntArray420[var9] = TexturedGraphic.anInt1785 + TexturedGraphic.anInt1784 * var10 / var18;
			Class38.anIntArray421[var9] = TexturedGraphic.anInt1786 + TexturedGraphic.anInt1784 * var11 / var18;
		}

		TexturedGraphic.anInt1781 = 0;
		var8 = var1.anIntArray411.length;

		for (var9 = 0; var9 < var8; var9++) {
			var10 = var1.anIntArray411[var9];
			var17 = var1.anIntArray426[var9];
			var18 = var1.anIntArray413[var9];
			var11 = Class38.anIntArray420[var10];
			int var12 = Class38.anIntArray420[var17];
			int var16 = Class38.anIntArray420[var18];
			int var15 = Class38.anIntArray421[var10];
			int var14 = Class38.anIntArray421[var17];
			int var13 = Class38.anIntArray421[var18];
			if ((var11 - var12) * (var13 - var14) - (var15 - var14) * (var16 - var12) > 0) {
				TexturedGraphic.aBool1782 = false;
				if (var11 < 0 || var12 < 0 || var16 < 0 || var11 > TexturedGraphic.anInt1791
						|| var12 > TexturedGraphic.anInt1791 || var16 > TexturedGraphic.anInt1791) {
					TexturedGraphic.aBool1782 = true;
				}

				if (aBool30 && this.method42(anInt36, anInt32, var15, var14, var13, var11, var12, var16)) {
					anInt53 = var6;
					anInt58 = var7;
				}

				if (var1.anIntArray414 != null && var1.anIntArray414[var9] != -1) {
					if (!aBool22) {
						if (var1.aBool415) {
							TexturedGraphic.method926(var15, var14, var13, var11, var12, var16,
									var1.anIntArray417[var9], var1.anIntArray409[var9], var1.anIntArray410[var9],
									Class38.anIntArray412[0], Class38.anIntArray412[1], Class38.anIntArray412[3],
									Class38.anIntArray405[0], Class38.anIntArray405[1], Class38.anIntArray405[3],
									Class38.anIntArray408[0], Class38.anIntArray408[1], Class38.anIntArray408[3],
									var1.anIntArray414[var9]);
						} else {
							TexturedGraphic.method926(var15, var14, var13, var11, var12, var16,
									var1.anIntArray417[var9], var1.anIntArray409[var9], var1.anIntArray410[var9],
									Class38.anIntArray412[var10], Class38.anIntArray412[var17],
									Class38.anIntArray412[var18], Class38.anIntArray405[var10],
									Class38.anIntArray405[var17], Class38.anIntArray405[var18],
									Class38.anIntArray408[var10], Class38.anIntArray408[var17],
									Class38.anIntArray408[var18], var1.anIntArray414[var9]);
						}
					} else {
						int var19 = TexturedGraphic.textureLoader.method7(var1.anIntArray414[var9]);
						TexturedGraphic.method922(var15, var14, var13, var11, var12, var16,
								method22(var19, var1.anIntArray417[var9]), method22(var19, var1.anIntArray409[var9]),
								method22(var19, var1.anIntArray410[var9]));
					}
				} else if (var1.anIntArray417[var9] != 12345678) {
					TexturedGraphic.method922(var15, var14, var13, var11, var12, var16, var1.anIntArray417[var9],
							var1.anIntArray409[var9], var1.anIntArray410[var9]);
				}
			}
		}

	}

	boolean method42(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 < var3 && var2 < var4 && var2 < var5) {
			return false;
		} else if (var2 > var3 && var2 > var4 && var2 > var5) {
			return false;
		} else if (var1 < var6 && var1 < var7 && var1 < var8) {
			return false;
		} else if (var1 > var6 && var1 > var7 && var1 > var8) {
			return false;
		} else {
			int var11 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
			int var10 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
			int var9 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
			return var11 * var9 > 0 && var9 * var10 > 0;
		}
	}

	void method43() {
		int var1 = anIntArray38[anInt41];
		Class34[] var11 = aClass34ArrayArray39[anInt41];
		anInt42 = 0;

		for (int var9 = 0; var9 < var1; var9++) {
			Class34 var5 = var11[var9];
			boolean var3;
			int var6;
			int var7;
			int var8;
			int var10;
			if (var5.anInt370 == 1) {
				var6 = var5.anInt384 - screenCenterY + 25;
				if (var6 >= 0 && var6 <= 50) {
					var7 = var5.anInt368 - anInt24 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt376 - anInt24 + 25;
					if (var8 > 50) {
						var8 = 50;
					}

					var3 = false;

					while (var7 <= var8) {
						if (aBoolArrayArray13[var6][var7++]) {
							var3 = true;
							break;
						}
					}

					if (var3) {
						var10 = anInt15 - var5.anInt371;
						if (var10 > 32) {
							var5.anInt374 = 1;
						} else {
							if (var10 >= -32) {
								continue;
							}

							var5.anInt374 = 2;
							var10 = -var10;
						}

						var5.anInt369 = (var5.anInt373 - anInt34 << 8) / var10;
						var5.anInt380 = (var5.anInt366 - anInt34 << 8) / var10;
						var5.anInt383 = (var5.anInt378 - anInt7 << 8) / var10;
						var5.anInt382 = (var5.anInt375 - anInt7 << 8) / var10;
						aClass34Array10[anInt42++] = var5;
					}
				}
			} else if (var5.anInt370 == 2) {
				var6 = var5.anInt368 - anInt24 + 25;
				if (var6 >= 0 && var6 <= 50) {
					var7 = var5.anInt384 - screenCenterY + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt367 - screenCenterY + 25;
					if (var8 > 50) {
						var8 = 50;
					}

					var3 = false;

					while (var7 <= var8) {
						if (aBoolArrayArray13[var7++][var6]) {
							var3 = true;
							break;
						}
					}

					if (var3) {
						var10 = anInt34 - var5.anInt373;
						if (var10 > 32) {
							var5.anInt374 = 3;
						} else {
							if (var10 >= -32) {
								continue;
							}

							var5.anInt374 = 4;
							var10 = -var10;
						}

						var5.anInt377 = (var5.anInt371 - anInt15 << 8) / var10;
						var5.anInt379 = (var5.anInt372 - anInt15 << 8) / var10;
						var5.anInt383 = (var5.anInt378 - anInt7 << 8) / var10;
						var5.anInt382 = (var5.anInt375 - anInt7 << 8) / var10;
						aClass34Array10[anInt42++] = var5;
					}
				}
			} else if (var5.anInt370 == 4) {
				var6 = var5.anInt378 - anInt7;
				if (var6 > 128) {
					var7 = var5.anInt368 - anInt24 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt376 - anInt24 + 25;
					if (var8 > 50) {
						var8 = 50;
					}

					if (var7 <= var8) {
						int var13 = var5.anInt384 - screenCenterY + 25;
						if (var13 < 0) {
							var13 = 0;
						}

						var10 = var5.anInt367 - screenCenterY + 25;
						if (var10 > 50) {
							var10 = 50;
						}

						boolean var12 = false;

						label140: for (int var2 = var13; var2 <= var10; var2++) {
							for (int var4 = var7; var4 <= var8; var4++) {
								if (aBoolArrayArray13[var2][var4]) {
									var12 = true;
									break label140;
								}
							}
						}

						if (var12) {
							var5.anInt374 = 5;
							var5.anInt377 = (var5.anInt371 - anInt15 << 8) / var6;
							var5.anInt379 = (var5.anInt372 - anInt15 << 8) / var6;
							var5.anInt369 = (var5.anInt373 - anInt34 << 8) / var6;
							var5.anInt380 = (var5.anInt366 - anInt34 << 8) / var6;
							aClass34Array10[anInt42++] = var5;
						}
					}
				}
			}
		}

	}

	boolean method44(int var1, int var2, int var3) {
		int var4 = this.anIntArrayArrayArray14[var1][var2][var3];
		if (-anInt19 == var4) {
			return false;
		} else if (anInt19 == var4) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method48(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1)
					&& this.method48(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1)
					&& this.method48(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1)
					&& this.method48(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.anIntArrayArrayArray14[var1][var2][var3] = anInt19;
				return true;
			} else {
				this.anIntArrayArrayArray14[var1][var2][var3] = -anInt19;
				return false;
			}
		}
	}

	boolean method45(int var1, int var2, int var3, int var4) {
		if (!this.method44(var1, var2, var3)) {
			return false;
		} else {
			int var9 = var2 << 7;
			int var5 = var3 << 7;
			int var6 = this.tileHeights[var1][var2][var3] - 1;
			int var7 = var6 - 120;
			int var10 = var6 - 230;
			int var8 = var6 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var9 > anInt15) {
						if (!this.method48(var9, var6, var5)) {
							return false;
						}

						if (!this.method48(var9, var6, var5 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method48(var9, var7, var5)) {
							return false;
						}

						if (!this.method48(var9, var7, var5 + 128)) {
							return false;
						}
					}

					if (!this.method48(var9, var10, var5)) {
						return false;
					}

					if (!this.method48(var9, var10, var5 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var5 < anInt34) {
						if (!this.method48(var9, var6, var5 + 128)) {
							return false;
						}

						if (!this.method48(var9 + 128, var6, var5 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method48(var9, var7, var5 + 128)) {
							return false;
						}

						if (!this.method48(var9 + 128, var7, var5 + 128)) {
							return false;
						}
					}

					if (!this.method48(var9, var10, var5 + 128)) {
						return false;
					}

					if (!this.method48(var9 + 128, var10, var5 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var9 < anInt15) {
						if (!this.method48(var9 + 128, var6, var5)) {
							return false;
						}

						if (!this.method48(var9 + 128, var6, var5 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method48(var9 + 128, var7, var5)) {
							return false;
						}

						if (!this.method48(var9 + 128, var7, var5 + 128)) {
							return false;
						}
					}

					if (!this.method48(var9 + 128, var10, var5)) {
						return false;
					}

					if (!this.method48(var9 + 128, var10, var5 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var5 > anInt34) {
						if (!this.method48(var9, var6, var5)) {
							return false;
						}

						if (!this.method48(var9 + 128, var6, var5)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method48(var9, var7, var5)) {
							return false;
						}

						if (!this.method48(var9 + 128, var7, var5)) {
							return false;
						}
					}

					if (!this.method48(var9, var10, var5)) {
						return false;
					}

					if (!this.method48(var9 + 128, var10, var5)) {
						return false;
					}

					return true;
				}
			}

			return !this.method48(var9 + 64, var8, var5 + 64) ? false
					: (var4 == 16 ? this.method48(var9, var10, var5 + 128)
							: (var4 == 32 ? this.method48(var9 + 128, var10, var5 + 128)
									: (var4 == 64 ? this.method48(var9 + 128, var10, var5)
											: (var4 == 128 ? this.method48(var9, var10, var5) : true))));
		}
	}

	boolean method46(int var1, int var2, int var3, int var4) {
		if (!this.method44(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method48(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1)
					&& this.method48(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1)
					&& this.method48(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1)
					&& this.method48(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean method47(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!this.method44(var1, var2, var4)) {
				return false;
			} else {
				var8 = var2 << 7;
				var7 = var4 << 7;
				return this.method48(var8 + 1, this.tileHeights[var1][var2][var4] - var6, var7 + 1)
						&& this.method48(var8 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var7 + 1)
						&& this.method48(var8 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6,
								var7 + 128 - 1)
						&& this.method48(var8 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var7 + 128 - 1);
			}
		} else {
			for (var8 = var2; var8 <= var3; var8++) {
				for (var7 = var4; var7 <= var5; var7++) {
					if (this.anIntArrayArrayArray14[var1][var8][var7] == -anInt19) {
						return false;
					}
				}
			}

			var8 = (var2 << 7) + 1;
			var7 = (var4 << 7) + 2;
			int var10 = this.tileHeights[var1][var2][var4] - var6;
			if (!this.method48(var8, var10, var7)) {
				return false;
			} else {
				int var9 = (var3 << 7) - 1;
				if (!this.method48(var9, var10, var7)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method48(var8, var10, var11)) {
						return false;
					} else if (!this.method48(var9, var10, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean method48(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt42; var4++) {
			Class34 var6 = aClass34Array10[var4];
			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var6.anInt374 == 1) {
				var5 = var6.anInt371 - var1;
				if (var5 > 0) {
					var10 = var6.anInt373 + (var6.anInt369 * var5 >> 8);
					var8 = var6.anInt366 + (var6.anInt380 * var5 >> 8);
					var9 = var6.anInt378 + (var6.anInt383 * var5 >> 8);
					var7 = var6.anInt375 + (var6.anInt382 * var5 >> 8);
					if (var3 >= var10 && var3 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 == 2) {
				var5 = var1 - var6.anInt371;
				if (var5 > 0) {
					var10 = var6.anInt373 + (var6.anInt369 * var5 >> 8);
					var8 = var6.anInt366 + (var6.anInt380 * var5 >> 8);
					var9 = var6.anInt378 + (var6.anInt383 * var5 >> 8);
					var7 = var6.anInt375 + (var6.anInt382 * var5 >> 8);
					if (var3 >= var10 && var3 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 == 3) {
				var5 = var6.anInt373 - var3;
				if (var5 > 0) {
					var10 = var6.anInt371 + (var6.anInt377 * var5 >> 8);
					var8 = var6.anInt372 + (var6.anInt379 * var5 >> 8);
					var9 = var6.anInt378 + (var6.anInt383 * var5 >> 8);
					var7 = var6.anInt375 + (var6.anInt382 * var5 >> 8);
					if (var1 >= var10 && var1 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 == 4) {
				var5 = var3 - var6.anInt373;
				if (var5 > 0) {
					var10 = var6.anInt371 + (var6.anInt377 * var5 >> 8);
					var8 = var6.anInt372 + (var6.anInt379 * var5 >> 8);
					var9 = var6.anInt378 + (var6.anInt383 * var5 >> 8);
					var7 = var6.anInt375 + (var6.anInt382 * var5 >> 8);
					if (var1 >= var10 && var1 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 == 5) {
				var5 = var2 - var6.anInt378;
				if (var5 > 0) {
					var10 = var6.anInt371 + (var6.anInt377 * var5 >> 8);
					var8 = var6.anInt372 + (var6.anInt379 * var5 >> 8);
					var9 = var6.anInt373 + (var6.anInt369 * var5 >> 8);
					var7 = var6.anInt366 + (var6.anInt380 * var5 >> 8);
					if (var1 >= var10 && var1 <= var8 && var3 >= var9 && var3 <= var7) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public static void method49(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Class34 var8 = new Class34();
		var8.anInt384 = var2 / 128;
		var8.anInt367 = var3 / 128;
		var8.anInt368 = var4 / 128;
		var8.anInt376 = var5 / 128;
		var8.anInt370 = var1;
		var8.anInt371 = var2;
		var8.anInt372 = var3;
		var8.anInt373 = var4;
		var8.anInt366 = var5;
		var8.anInt378 = var6;
		var8.anInt375 = var7;
		aClass34ArrayArray39[var0][anIntArray38[var0]++] = var8;
	}

	public void method50() {
		for (int var1 = 0; var1 < this.anInt56; var1++) {
			EntityMarker var2 = this.tempEntityMarkers[var1];
			this.method23(var2);
			this.tempEntityMarkers[var1] = null;
		}

		this.anInt56 = 0;
	}

	public static void method51(int[] var0, int var1, int var2, int var3, int var4) {
		anInt33 = 0;
		anInt57 = 0;
		anInt35 = var3;
		anInt59 = var4;
		anInt54 = var3 / 2;
		anInt55 = var4 / 2;
		boolean[][][][] var6 = new boolean[9][32][53][53];

		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		for (var8 = 128; var8 <= 384; var8 += 32) {
			for (var9 = 0; var9 < 2048; var9 += 64) {
				anInt26 = TexturedGraphic.SIN_TABLE[var8];
				anInt27 = TexturedGraphic.COS_TABLE[var8];
				anInt28 = TexturedGraphic.SIN_TABLE[var9];
				anInt29 = TexturedGraphic.COS_TABLE[var9];
				var10 = (var8 - 128) / 32;
				var11 = var9 / 64;

				for (int var16 = -26; var16 <= 26; var16++) {
					for (var7 = -26; var7 <= 26; var7++) {
						var12 = var16 * 128;
						int var14 = var7 * 128;
						boolean var15 = false;

						for (int var5 = -var1; var5 <= var2; var5 += 128) {
							if (method38(var12, var0[var10] + var5, var14)) {
								var15 = true;
								break;
							}
						}

						var6[var10][var11][var16 + 25 + 1][var7 + 25 + 1] = var15;
					}
				}
			}
		}

		for (var8 = 0; var8 < 8; var8++) {
			for (var9 = 0; var9 < 32; var9++) {
				for (var10 = -25; var10 < 25; var10++) {
					for (var11 = -25; var11 < 25; var11++) {
						boolean var161 = false;

						label78: for (var7 = -1; var7 <= 1; var7++) {
							for (var12 = -1; var12 <= 1; var12++) {
								if (var6[var8][var9][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label78;
								}

								if (var6[var8][(var9 + 1) % 31][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label78;
								}

								if (var6[var8 + 1][var9][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label78;
								}

								if (var6[var8 + 1][(var9 + 1) % 31][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
									var161 = true;
									break label78;
								}
							}
						}

						aBoolArrayArrayArrayArray52[var8][var9][var10 + 25][var11 + 25] = var161;
					}
				}
			}
		}

	}

	public void method52(int var1, int var2, int var3, int var4) {
		LandscapeTile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].anInt1410 = var4;
		}

	}

	public int method53(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryStub != null ? var4.boundaryStub.anInt277 : 0;
	}

	boolean addEntityMarker(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9,
			int var10, boolean var11, int var12, int var13) {
		int var16;
		for (int var20 = var2; var20 < var2 + var4; var20++) {
			for (var16 = var3; var16 < var3 + var5; var16++) {
				if (var20 < 0 || var16 < 0 || var20 >= this.maxX || var16 >= this.maxY) {
					return false;
				}

				LandscapeTile var21 = this.tiles[var1][var20][var16];
				if (var21 != null && var21.anInt1407 >= 5) {
					return false;
				}
			}
		}

		EntityMarker var19 = new EntityMarker();
		var19.anInt269 = var12;
		var19.config = var13;
		var19.floorLevel = var1;
		var19.strictX = var6;
		var19.strictY = var7;
		var19.height = var8;
		var19.entity = var9;
		var19.orientation = var10;
		var19.regionX = var2;
		var19.regionY = var3;
		var19.sizeX = var2 + var4 - 1;
		var19.sizeY = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; var16++) {
			for (int var201 = var3; var201 < var3 + var5; var201++) {
				int var17 = 0;
				if (var16 > var2) {
					++var17;
				}

				if (var16 < var2 + var4 - 1) {
					var17 += 4;
				}

				if (var201 > var3) {
					var17 += 8;
				}

				if (var201 < var3 + var5 - 1) {
					var17 += 2;
				}

				for (int var22 = var1; var22 >= 0; --var22) {
					if (this.tiles[var22][var16][var201] == null) {
						this.tiles[var22][var16][var201] = new LandscapeTile(var22, var16, var201);
					}
				}

				LandscapeTile var211 = this.tiles[var1][var16][var201];
				var211.entityMarkers[var211.anInt1407] = var19;
				var211.anIntArray1408[var211.anInt1407] = var17;
				var211.anInt1401 |= var17;
				++var211.anInt1407;
			}
		}

		if (var11) {
			this.tempEntityMarkers[this.anInt56++] = var19;
		}

		return true;
	}

	void method54(Class31 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - anInt15;
		int var27;
		int var20 = var27 = (var8 << 7) - anInt34;
		int var12;
		int var13 = var12 = var10 + 128;
		int var17;
		int var19 = var17 = var20 + 128;
		int var15 = this.tileHeights[var2][var7][var8] - anInt7;
		int var11 = this.tileHeights[var2][var7 + 1][var8] - anInt7;
		int var16 = this.tileHeights[var2][var7 + 1][var8 + 1] - anInt7;
		int var28 = this.tileHeights[var2][var7][var8 + 1] - anInt7;
		int var18 = var20 * var5 + var10 * var6 >> 16;
		var20 = var20 * var6 - var10 * var5 >> 16;
		var10 = var18;
		var18 = var15 * var4 - var20 * var3 >> 16;
		var20 = var15 * var3 + var20 * var4 >> 16;
		var15 = var18;
		if (var20 >= 50) {
			var18 = var27 * var5 + var13 * var6 >> 16;
			var27 = var27 * var6 - var13 * var5 >> 16;
			var13 = var18;
			var18 = var11 * var4 - var27 * var3 >> 16;
			var27 = var11 * var3 + var27 * var4 >> 16;
			var11 = var18;
			if (var27 >= 50) {
				var18 = var19 * var5 + var12 * var6 >> 16;
				var19 = var19 * var6 - var12 * var5 >> 16;
				var12 = var18;
				var18 = var16 * var4 - var19 * var3 >> 16;
				var19 = var16 * var3 + var19 * var4 >> 16;
				var16 = var18;
				if (var19 >= 50) {
					var18 = var17 * var5 + var9 * var6 >> 16;
					var17 = var17 * var6 - var9 * var5 >> 16;
					var9 = var18;
					var18 = var28 * var4 - var17 * var3 >> 16;
					var17 = var28 * var3 + var17 * var4 >> 16;
					if (var17 >= 50) {
						int var24 = TexturedGraphic.anInt1785 + TexturedGraphic.anInt1784 * var10 / var20;
						int var21 = TexturedGraphic.anInt1786 + TexturedGraphic.anInt1784 * var15 / var20;
						int var25 = TexturedGraphic.anInt1785 + TexturedGraphic.anInt1784 * var13 / var27;
						int var22 = TexturedGraphic.anInt1786 + TexturedGraphic.anInt1784 * var11 / var27;
						int var29 = TexturedGraphic.anInt1785 + TexturedGraphic.anInt1784 * var12 / var19;
						int var30 = TexturedGraphic.anInt1786 + TexturedGraphic.anInt1784 * var16 / var19;
						int var26 = TexturedGraphic.anInt1785 + TexturedGraphic.anInt1784 * var9 / var17;
						int var23 = TexturedGraphic.anInt1786 + TexturedGraphic.anInt1784 * var18 / var17;
						TexturedGraphic.anInt1781 = 0;
						int var14;
						if ((var29 - var26) * (var22 - var23) - (var30 - var23) * (var25 - var26) > 0) {
							TexturedGraphic.aBool1782 = false;
							if (var29 < 0 || var26 < 0 || var25 < 0 || var29 > TexturedGraphic.anInt1791
									|| var26 > TexturedGraphic.anInt1791 || var25 > TexturedGraphic.anInt1791) {
								TexturedGraphic.aBool1782 = true;
							}

							if (aBool30 && this.method42(anInt36, anInt32, var30, var23, var22, var29, var26, var25)) {
								anInt53 = var7;
								anInt58 = var8;
							}

							if (var1.anInt346 == -1) {
								if (var1.anInt344 != 12345678) {
									TexturedGraphic.method922(var30, var23, var22, var29, var26, var25, var1.anInt344,
											var1.anInt345, var1.anInt353);
								}
							} else if (!aBool22) {
								if (var1.aBool343) {
									TexturedGraphic.method926(var30, var23, var22, var29, var26, var25, var1.anInt344,
											var1.anInt345, var1.anInt353, var10, var13, var9, var15, var11, var18,
											var20, var27, var17, var1.anInt346);
								} else {
									TexturedGraphic.method926(var30, var23, var22, var29, var26, var25, var1.anInt344,
											var1.anInt345, var1.anInt353, var12, var9, var13, var16, var18, var11,
											var19, var17, var27, var1.anInt346);
								}
							} else {
								var14 = TexturedGraphic.textureLoader.method7(var1.anInt346);
								TexturedGraphic.method922(var30, var23, var22, var29, var26, var25,
										method22(var14, var1.anInt344), method22(var14, var1.anInt345),
										method22(var14, var1.anInt353));
							}
						}

						if ((var24 - var25) * (var23 - var22) - (var21 - var22) * (var26 - var25) > 0) {
							TexturedGraphic.aBool1782 = false;
							if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > TexturedGraphic.anInt1791
									|| var25 > TexturedGraphic.anInt1791 || var26 > TexturedGraphic.anInt1791) {
								TexturedGraphic.aBool1782 = true;
							}

							if (aBool30 && this.method42(anInt36, anInt32, var21, var22, var23, var24, var25, var26)) {
								anInt53 = var7;
								anInt58 = var8;
							}

							if (var1.anInt346 == -1) {
								if (var1.anInt347 != 12345678) {
									TexturedGraphic.method922(var21, var22, var23, var24, var25, var26, var1.anInt347,
											var1.anInt353, var1.anInt345);
								}
							} else if (!aBool22) {
								TexturedGraphic.method926(var21, var22, var23, var24, var25, var26, var1.anInt347,
										var1.anInt353, var1.anInt345, var10, var13, var9, var15, var11, var18, var20,
										var27, var17, var1.anInt346);
							} else {
								var14 = TexturedGraphic.textureLoader.method7(var1.anInt346);
								TexturedGraphic.method922(var21, var22, var23, var24, var25, var26,
										method22(var14, var1.anInt347), method22(var14, var1.anInt353),
										method22(var14, var1.anInt345));
							}
						}
					}
				}
			}
		}

	}

	public void method55(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.maxZ; var4++) {
			for (int var6 = 0; var6 < this.maxX; var6++) {
				for (int var7 = 0; var7 < this.maxY; var7++) {
					LandscapeTile var9 = this.tiles[var4][var6][var7];
					if (var9 != null) {
						BoundaryStub var5 = var9.boundaryStub;
						Model var8;
						if (var5 != null && var5.entityA instanceof Model) {
							Model var14 = (Model) var5.entityA;
							this.method57(var14, var4, var6, var7, 1, 1);
							if (var5.entityB instanceof Model) {
								var8 = (Model) var5.entityB;
								this.method57(var8, var4, var6, var7, 1, 1);
								Model.method893(var14, var8, 0, 0, 0, false);
								var5.entityB = var8.method902(var8.aShort1764, var8.aShort1766, var1, var2, var3);
							}

							var5.entityA = var14.method902(var14.aShort1764, var14.aShort1766, var1, var2, var3);
						}

						for (int var13 = 0; var13 < var9.anInt1407; var13++) {
							EntityMarker var12 = var9.entityMarkers[var13];
							if (var12 != null && var12.entity instanceof Model) {
								Model var11 = (Model) var12.entity;
								this.method57(var11, var4, var6, var7, var12.sizeX - var12.regionX + 1,
										var12.sizeY - var12.regionY + 1);
								var12.entity = var11.method902(var11.aShort1764, var11.aShort1766, var1, var2, var3);
							}
						}

						TileDecorationStub var141 = var9.tileDecorationStub;
						if (var141 != null && var141.entity instanceof Model) {
							var8 = (Model) var141.entity;
							this.method37(var8, var4, var6, var7);
							var141.entity = var8.method902(var8.aShort1764, var8.aShort1766, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	public void method56(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.boundaryStub = null;
		}

	}

	void method57(Model var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var15 = var3;
		int var12 = var3 + var5;
		int var13 = var4 - 1;
		int var17 = var4 + var6;

		for (int var8 = var2; var8 <= var2 + 1; var8++) {
			if (this.maxZ != var8) {
				for (int var9 = var15; var9 <= var12; var9++) {
					if (var9 >= 0 && var9 < this.maxX) {
						for (int var10 = var13; var10 <= var17; var10++) {
							if (var10 >= 0 && var10 < this.maxY
									&& (!var7 || var9 >= var12 || var10 >= var17 || var10 < var4 && var9 != var3)) {
								LandscapeTile var18 = this.tiles[var8][var9][var10];
								if (var18 != null) {
									int var11 = (this.tileHeights[var8][var9][var10]
											+ this.tileHeights[var8][var9 + 1][var10]
											+ this.tileHeights[var8][var9][var10 + 1]
											+ this.tileHeights[var8][var9 + 1][var10 + 1]) / 4
											- (this.tileHeights[var2][var3][var4]
													+ this.tileHeights[var2][var3 + 1][var4]
													+ this.tileHeights[var2][var3][var4 + 1]
													+ this.tileHeights[var2][var3 + 1][var4 + 1]) / 4;
									BoundaryStub var16 = var18.boundaryStub;
									if (var16 != null) {
										Model var23;
										if (var16.entityA instanceof Model) {
											var23 = (Model) var16.entityA;
											Model.method893(var1, var23, (var9 - var3) * 128 + (1 - var5) * 64, var11,
													(var10 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var16.entityB instanceof Model) {
											var23 = (Model) var16.entityB;
											Model.method893(var1, var23, (var9 - var3) * 128 + (1 - var5) * 64, var11,
													(var10 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var231 = 0; var231 < var18.anInt1407; var231++) {
										EntityMarker var19 = var18.entityMarkers[var231];
										if (var19 != null && var19.entity instanceof Model) {
											Model var20 = (Model) var19.entity;
											int var21 = var19.sizeX - var19.regionX + 1;
											int var22 = var19.sizeY - var19.regionY + 1;
											Model.method893(var1, var20,
													(var19.regionX - var3) * 128 + (var21 - var5) * 64, var11,
													(var19.regionY - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var15;
				var7 = false;
			}
		}

	}

	public void method58(int var1, int var2, int var3) {
		aBool30 = true;
		anInt31 = var1;
		anInt36 = var2;
		anInt32 = var3;
		anInt53 = -1;
		anInt58 = -1;
	}

	public TileDecorationStub method59(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.tileDecorationStub != null ? var4.tileDecorationStub : null;
	}

	static {
		anIntArray38 = new int[anInt37];
		aClass34ArrayArray39 = new Class34[anInt37][500];
		anInt41 = 0;
		anInt42 = 0;
		anIntArray43 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray44 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		anIntArray46 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray47 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		anIntArray48 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray49 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		aBoolArrayArrayArrayArray52 = new boolean[8][32][51][51];
		anInt53 = -1;
		anInt58 = -1;
	}

}
