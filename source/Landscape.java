public class Landscape {

	int entityCount = 0;
	int minLevel = 0;
	EntityMarker[] entities = new EntityMarker[5000];
	int[][] TILE_MASK_2D = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int[][] TILE_ROTATION_2D = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	int maxY;
	int maxX;
	int maxZ;
	LandscapeTile[][][] tiles;
	int[][][] tileCycles;
	int[][][] tileHeights;
	static int cycle;
	static int pitchSin;
	static int pitchCos;
	static int yawSin;
	static int yawCos;
	static boolean[][] visibilityMap;
	static int cameraX;
	static int cameraY;
	static int cameraZ;
	static int screenCenterX;
	static int screenCenterZ;
	static int activeLevel;
	static int minTileX;
	static int minTileZ;
	static int maxTileX;
	static int maxTileZ;
	static int tileUpdateCount = 0;
	static boolean checkClick = false;
	public static int clickedTileX;
	public static int clickedTileZ;
	static int activeOccluderCount;
	static int anInt33;
	static int anInt57;
	static int anInt35;
	static int anInt59;
	static int anInt54;
	static int anInt55;
	static int anInt31 = 0;
	static int mouseX = 0;
	static int mouseY = 0;
	static int[] TILE_WALL_DRAW_FLAGS_1 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	static Occluder[] activeOccluders = new Occluder[500];
	static Deque tileDeque = new Deque();
	static EntityMarker[] entityBuffer = new EntityMarker[100];
	public static boolean lowMemory = true;
	static int MAX_OCCLUDER_LEVELS = 4;
	static int[] levelOccluderCount;
	static Occluder[][] levelOccluders;
	static int[] TILE_WALL_DRAW_FLAGS_0;
	static int[] WALL_DRAW_FLAGS;
	static int[] WALL_UNCULL_FLAGS_0;
	static int[] WALL_UNCULL_FLAGS_1;
	static int[] WALL_UNCULL_FLAGS_2;
	static int[] WALL_UNCULL_FLAGS_3;
	static boolean[][][][] visibilityMaps;

	public void reset() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.maxY; var1++) {
			for (var2 = 0; var2 < this.maxX; var2++) {
				for (int var3 = 0; var3 < this.maxZ; var3++) {
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < MAX_OCCLUDER_LEVELS; var1++) {
			for (var2 = 0; var2 < levelOccluderCount[var1]; var2++) {
				levelOccluders[var1][var2] = null;
			}

			levelOccluderCount[var1] = 0;
		}

		for (var1 = 0; var1 < this.entityCount; var1++) {
			this.entities[var1] = null;
		}

		this.entityCount = 0;

		for (var1 = 0; var1 < entityBuffer.length; var1++) {
			entityBuffer[var1] = null;
		}

	}

	public void setup(int var1) {
		this.minLevel = var1;

		for (int var2 = 0; var2 < this.maxX; var2++) {
			for (int var3 = 0; var3 < this.maxZ; var3++) {
				if (this.tiles[var1][var2][var3] == null) {
					this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
				}
			}
		}

	}

	public Landscape(int p, int x, int y, int[][][] th) {
		this.maxY = p;
		this.maxX = x;
		this.maxZ = y;
		this.tiles = new LandscapeTile[p][x][y];
		this.tileCycles = new int[p][x + 1][y + 1];
		this.tileHeights = th;
		this.reset();
	}

	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9,
			int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18,
			int var19, int var20) {
		int var21;
		TileUnderlay var22;
		if (var4 == 0) {
			var22 = new TileUnderlay(var11, var12, var13, var14, -1, var19, false);

			for (var21 = var1; var21 >= 0; --var21) {
				if (this.tiles[var21][var2][var3] == null) {
					this.tiles[var21][var2][var3] = new LandscapeTile(var21, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].underlay = var22;
		} else if (var4 != 1) {
			TileOverlay var23 = new TileOverlay(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13,
					var14, var15, var16, var17, var18, var19, var20);

			for (var21 = var1; var21 >= 0; --var21) {
				if (this.tiles[var21][var2][var3] == null) {
					this.tiles[var21][var2][var3] = new LandscapeTile(var21, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].overlay = var23;
		} else {
			var22 = new TileUnderlay(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var21 = var1; var21 >= 0; --var21) {
				if (this.tiles[var21][var2][var3] == null) {
					this.tiles[var21][var2][var3] = new LandscapeTile(var21, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].underlay = var22;
		}

	}

	public void addTileDecoration(int var1, int var2, int var3, int var4, Entity var5, int var6, int var7) {
		if (var5 != null) {
			TileDecorationStub var8 = new TileDecorationStub();
			var8.entity = var5;
			var8.strictX = var2 * 128 + 64;
			var8.strictY = var3 * 128 + 64;
			var8.height = var4;
			var8.bitset = var6;
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
		var9.bitset = var6;
		var9.middle = var7;
		var9.anEntity832 = var8;
		int var13 = 0;
		LandscapeTile var10 = this.tiles[var1][var2][var3];
		if (var10 != null) {
			for (int var11 = 0; var11 < var10.entityCount; var11++) {
				if ((var10.entityMarkers[var11].config & 0x100) == 256
						&& var10.entityMarkers[var11].entity instanceof Model) {
					Model var12 = (Model) var10.entityMarkers[var11].entity;
					var12.method998();
					if (var12.height * 1812947537 > var13) {
						var13 = var12.height * 1812947537;
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
			var12.bitset = var9;
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

			this.tiles[var1][var2][var3].wall = var12;
		}

	}

	public void addBoundaryDecoration(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7,
			int var8, int var9, int var10, int var11, int var12) {
		if (var5 != null) {
			BoundaryDecorationStub var13 = new BoundaryDecorationStub();
			var13.bitset = var11;
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
		return var4 == null ? null : var4.wall;
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

	void removeEntity(EntityMarker var1) {
		for (int var2 = var1.regionX; var2 <= var1.sizeX; var2++) {
			for (int var4 = var1.regionY; var4 <= var1.sizeY; var4++) {
				LandscapeTile t = this.tiles[var1.floorLevel][var2][var4];
				if (t != null) {
					int var3;
					for (var3 = 0; var3 < t.entityCount; var3++) {
						if (t.entityMarkers[var3] == var1) {
							--t.entityCount;

							for (int var6 = var3; var6 < t.entityCount; var6++) {
								t.entityMarkers[var6] = t.entityMarkers[var6 + 1];
								t.entityFlags[var6] = t.entityFlags[var6 + 1];
							}

							t.entityMarkers[t.entityCount] = null;
							break;
						}
					}

					t.flags = 0;

					for (var3 = 0; var3 < t.entityCount; var3++) {
						t.flags |= t.entityFlags[var3];
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
			for (int var6 = 0; var6 < var4.entityCount; var6++) {
				EntityMarker var5 = var4.entityMarkers[var6];
				if ((var5.nitset >> 29 & 0x3) == 2 && var5.regionX == var2 && var5.regionY == var3) {
					this.removeEntity(var5);
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
			for (int var5 = 0; var5 < var4.entityCount; var5++) {
				EntityMarker var6 = var4.entityMarkers[var5];
				if ((var6.nitset >> 29 & 0x3) == 2 && var6.regionX == var2 && var6.regionY == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public int method31(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryDecorationStub != null ? var4.boundaryDecorationStub.bitset : 0;
	}

	public int method32(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0;
		} else {
			for (int var6 = 0; var6 < var4.entityCount; var6++) {
				EntityMarker var5 = var4.entityMarkers[var6];
				if ((var5.nitset >> 29 & 0x3) == 2 && var5.regionX == var2 && var5.regionY == var3) {
					return var5.nitset;
				}
			}

			return 0;
		}
	}

	public int method33(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.tileDecorationStub != null ? var4.tileDecorationStub.bitset : 0;
	}

	public int method34(int var1, int var2, int var3, int var4) {
		LandscapeTile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			if (var5.wall != null && var5.wall.bitset == var4) {
				return var5.wall.config & 0xff;
			} else if (var5.boundaryDecorationStub != null && var5.boundaryDecorationStub.bitset == var4) {
				return var5.boundaryDecorationStub.config & 0xff;
			} else if (var5.tileDecorationStub != null && var5.tileDecorationStub.bitset == var4) {
				return var5.tileDecorationStub.config & 0xff;
			} else {
				for (int var6 = 0; var6 < var5.entityCount; var6++) {
					if (var5.entityMarkers[var6].nitset == var4) {
						return var5.entityMarkers[var6].config & 0xff;
					}
				}

				return -1;
			}
		} else {
			return -1;
		}
	}

	public void setBridge(int var1, int var2) {
		LandscapeTile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; var4++) {
			LandscapeTile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.level;

				for (int var6 = 0; var6 < var5.entityCount; var6++) {
					EntityMarker var7 = var5.entityMarkers[var6];
					if ((var7.nitset >> 29 & 0x3) == 2 && var7.regionX == var1 && var7.regionY == var2) {
						--var7.floorLevel;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) {
			this.tiles[0][var1][var2] = new LandscapeTile(0, var1, var2);
		}

		this.tiles[0][var1][var2].bridge = var3;
		this.tiles[3][var1][var2] = null;
	}

	public void method36(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		LandscapeTile var7 = this.tiles[var4][var5][var6];
		if (var7 != null) {
			TileUnderlay var9 = var7.underlay;
			int var11;
			if (var9 != null) {
				int var10 = var9.rgb;
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
				TileOverlay var18 = var7.overlay;
				if (var18 != null) {
					var11 = var18.shape;
					int var13 = var18.rotation;
					int var12 = var18.underlayRGB;
					int var8 = var18.overlayRGB;
					int[] var15 = this.TILE_MASK_2D[var11];
					int[] var14 = this.TILE_ROTATION_2D[var13];
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

	void method37(RSModel var1, int var2, int var3, int var4) {
		LandscapeTile var5;
		RSModel var6;
		if (var3 < this.maxX) {
			var5 = this.tiles[var2][var3 + 1][var4];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof RSModel) {
				var6 = (RSModel) var5.tileDecorationStub.entity;
				RSModel.method893(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < this.maxX) {
			var5 = this.tiles[var2][var3][var4 + 1];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof RSModel) {
				var6 = (RSModel) var5.tileDecorationStub.entity;
				RSModel.method893(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < this.maxX && var4 < this.maxZ) {
			var5 = this.tiles[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof RSModel) {
				var6 = (RSModel) var5.tileDecorationStub.entity;
				RSModel.method893(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < this.maxX && var4 > 0) {
			var5 = this.tiles[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.tileDecorationStub != null && var5.tileDecorationStub.entity instanceof RSModel) {
				var6 = (RSModel) var5.tileDecorationStub.entity;
				RSModel.method893(var1, var6, 128, 0, -128, true);
			}
		}

	}

	static boolean method38(int var0, int var1, int var2) {
		int var3 = yawSin * var2 + yawCos * var0 >> 16;
		int var4 = yawCos * var2 - yawSin * var0 >> 16;
		int var5 = pitchSin * var1 + pitchCos * var4 >> 16;
		int var7 = pitchCos * var1 - pitchSin * var4 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var6 = anInt54 + Graphics3D.viewportWidth * var3 / var5;
			int var8 = anInt55 + Graphics3D.viewportWidth * var7 / var5;
			return var6 >= anInt33 && var6 <= anInt35 && var8 >= anInt57 && var8 <= anInt59;
		} else {
			return false;
		}
	}

	public void draw(int camX, int camY, int camZ, int pitch, int yaw, int topLevel) {
		if (camX < 0) {
			camX = 0;
		} else if (camX >= this.maxX * 128) {
			camX = this.maxX * 128 - 1;
		}

		if (camZ < 0) {
			camZ = 0;
		} else if (camZ >= this.maxZ * 128) {
			camZ = this.maxZ * 128 - 1;
		}

		++cycle;
		pitchSin = Graphics3D.SIN_TABLE[pitch];
		pitchCos = Graphics3D.COS_TABLE[pitch];
		yawSin = Graphics3D.SIN_TABLE[yaw];
		yawCos = Graphics3D.COS_TABLE[yaw];
		visibilityMap = visibilityMaps[(pitch - 128) / 32][yaw / 64];
		cameraX = camX;
		cameraY = camY;
		cameraZ = camZ;
		screenCenterX = camX / 128;
		screenCenterZ = camZ / 128;
		activeLevel = topLevel;
		minTileX = screenCenterX - 25;
		if (minTileX < 0) {
			minTileX = 0;
		}

		minTileZ = screenCenterZ - 25;
		if (minTileZ < 0) {
			minTileZ = 0;
		}

		maxTileX = screenCenterX + 25;
		if (maxTileX > this.maxX) {
			maxTileX = this.maxX;
		}

		maxTileZ = screenCenterZ + 25;
		if (maxTileZ > this.maxZ) {
			maxTileZ = this.maxZ;
		}

		this.updateOccluders();
		tileUpdateCount = 0;

		int var8;
		LandscapeTile[][] tiles;
		int x;
		int x0;
		LandscapeTile tile;
		for (var8 = this.minLevel; var8 < this.maxY; var8++) {
			tiles = this.tiles[var8];

			for (x = minTileX; x < maxTileX; x++) {
				for (x0 = minTileZ; x0 < maxTileZ; x0++) {
					tile = tiles[x][x0];
					if (tile != null) {
						if (tile.physicalLevel > topLevel
								|| !visibilityMap[x - screenCenterX + 25][x0 - screenCenterZ + 25]
										&& this.tileHeights[var8][x][x0] - camY < 2000) {
							tile.draw = false;
							tile.visible = false;
						} else {
							tile.draw = true;
							tile.visible = true;
							if (tile.entityCount > 0) {
								tile.drawEntities = true;
							} else {
								tile.drawEntities = false;
							}

							++tileUpdateCount;
						}
					}
				}
			}
		}

		int var11;
		int z1;
		int z0;
		int x1;
		for (var8 = this.minLevel; var8 < this.maxY; var8++) {
			tiles = this.tiles[var8];

			for (x = -25; x <= 0; x++) {
				x0 = screenCenterX + x;
				x1 = screenCenterX - x;
				if (x0 >= minTileX || x1 < maxTileX) {
					for (var11 = -25; var11 <= 0; var11++) {
						z0 = screenCenterZ + var11;
						z1 = screenCenterZ - var11;
						if (x0 >= minTileX) {
							if (z0 >= minTileZ) {
								tile = tiles[x0][z0];
								if (tile != null && tile.draw) {
									this.draw(tile, true);
								}
							}

							if (z1 < maxTileZ) {
								tile = tiles[x0][z1];
								if (tile != null && tile.draw) {
									this.draw(tile, true);
								}
							}
						}

						if (x1 < maxTileX) {
							if (z0 >= minTileZ) {
								tile = tiles[x1][z0];
								if (tile != null && tile.draw) {
									this.draw(tile, true);
								}
							}

							if (z1 < maxTileZ) {
								tile = tiles[x1][z1];
								if (tile != null && tile.draw) {
									this.draw(tile, true);
								}
							}
						}

						if (tileUpdateCount == 0) {
							checkClick = false;
							return;
						}
					}
				}
			}
		}

		for (var8 = this.minLevel; var8 < this.maxY; var8++) {
			tiles = this.tiles[var8];

			for (x = -25; x <= 0; x++) {
				x0 = screenCenterX + x;
				x1 = screenCenterX - x;
				if (x0 >= minTileX || x1 < maxTileX) {
					for (var11 = -25; var11 <= 0; var11++) {
						z0 = screenCenterZ + var11;
						z1 = screenCenterZ - var11;
						if (x0 >= minTileX) {
							if (z0 >= minTileZ) {
								tile = tiles[x0][z0];
								if (tile != null && tile.draw) {
									this.draw(tile, false);
								}
							}

							if (z1 < maxTileZ) {
								tile = tiles[x0][z1];
								if (tile != null && tile.draw) {
									this.draw(tile, false);
								}
							}
						}

						if (x1 < maxTileX) {
							if (z0 >= minTileZ) {
								tile = tiles[x1][z0];
								if (tile != null && tile.draw) {
									this.draw(tile, false);
								}
							}

							if (z1 < maxTileZ) {
								tile = tiles[x1][z1];
								if (tile != null && tile.draw) {
									this.draw(tile, false);
								}
							}
						}

						if (tileUpdateCount == 0) {
							checkClick = false;
							return;
						}
					}
				}
			}
		}

		checkClick = false;
	}

	void draw(LandscapeTile tile, boolean var2) {
		tileDeque.addFront(tile);

		while (true) {
			LandscapeTile t;
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
												t = (LandscapeTile) tileDeque.popFront();
												if (t == null) {
													return;
												}
											} while (!t.visible);

											var4 = t.regionX;
											var5 = t.regionY;
											var6 = t.level;
											var7 = t.renderLevel;
											var8 = this.tiles[var6];
											if (!t.draw) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = this.tiles[var6 - 1][var4][var5];
													if (var9 != null && var9.visible) {
														continue;
													}
												}

												if (var4 <= screenCenterX && var4 > minTileX) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.visible
															&& (var9.draw || (t.flags & 0x1) == 0)) {
														continue;
													}
												}

												if (var4 >= screenCenterX && var4 < maxTileX - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.visible
															&& (var9.draw || (t.flags & 0x4) == 0)) {
														continue;
													}
												}

												if (var5 <= screenCenterZ && var5 > minTileZ) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.visible
															&& (var9.draw || (t.flags & 0x8) == 0)) {
														continue;
													}
												}

												if (var5 >= screenCenterZ && var5 < maxTileZ - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.visible
															&& (var9.draw || (t.flags & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											t.draw = false;
											if (t.bridge != null) {
												var9 = t.bridge;
												if (var9.underlay != null) {
													if (!this.isTileOccluded(0, var4, var5)) {
														this.drawTileUnderlay(var9.underlay, 0, pitchSin, pitchCos, yawSin,
																yawCos, var4, var5);
													}
												} else if (var9.overlay != null
														&& !this.isTileOccluded(0, var4, var5)) {
													this.drawTileOverlay(var9.overlay, pitchSin, pitchCos, yawSin,
															yawCos, var4, var5);
												}

												var10 = var9.wall;
												if (var10 != null) {
													var10.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos,
															var10.strictX - cameraX, var10.floorLevel - cameraY,
															var10.strictY - cameraZ, var10.bitset);
												}

												for (var11 = 0; var11 < var9.entityCount; var11++) {
													var12 = var9.entityMarkers[var11];
													if (var12 != null) {
														var12.entity.draw(var12.orientation, pitchSin, pitchCos,
																yawSin, yawCos, var12.strictX - cameraX,
																var12.height - cameraY, var12.strictY - cameraZ,
																var12.nitset);
													}
												}
											}

											var22 = false;
											if (t.underlay != null) {
												if (!this.isTileOccluded(var7, var4, var5)) {
													var22 = true;
													if (t.underlay.neColor != 12345678
															|| checkClick && var6 <= anInt31) {
														this.drawTileUnderlay(t.underlay, var7, pitchSin, pitchCos,
																yawSin, yawCos, var4, var5);
													}
												}
											} else if (t.overlay != null && !this.isTileOccluded(var7, var4, var5)) {
												var22 = true;
												this.drawTileOverlay(t.overlay, pitchSin, pitchCos, yawSin, yawCos,
														var4, var5);
											}

											var21 = 0;
											var11 = 0;
											BoundaryStub var24 = t.wall;
											BoundaryDecorationStub var26 = t.boundaryDecorationStub;
											if (var24 != null || var26 != null) {
												if (screenCenterX == var4) {
													++var21;
												} else if (screenCenterX < var4) {
													var21 += 2;
												}

												if (screenCenterZ == var5) {
													var21 += 3;
												} else if (screenCenterZ > var5) {
													var21 += 6;
												}

												var11 = TILE_WALL_DRAW_FLAGS_0[var21];
												t.wallDrawFlags = TILE_WALL_DRAW_FLAGS_1[var21];
											}

											if (var24 != null) {
												if ((var24.orientationA & WALL_DRAW_FLAGS[var21]) != 0) {
													if (var24.orientationA == 16) {
														t.wallCullDirection = 3;
														t.wallUncullDirection = WALL_UNCULL_FLAGS_0[var21];
														t.wallCullOppositeDirection = 3 - t.wallUncullDirection;
													} else if (var24.orientationA == 32) {
														t.wallCullDirection = 6;
														t.wallUncullDirection = WALL_UNCULL_FLAGS_1[var21];
														t.wallCullOppositeDirection = 6 - t.wallUncullDirection;
													} else if (var24.orientationA == 64) {
														t.wallCullDirection = 12;
														t.wallUncullDirection = WALL_UNCULL_FLAGS_2[var21];
														t.wallCullOppositeDirection = 12 - t.wallUncullDirection;
													} else {
														t.wallCullDirection = 9;
														t.wallUncullDirection = WALL_UNCULL_FLAGS_3[var21];
														t.wallCullOppositeDirection = 9 - t.wallUncullDirection;
													}
												} else {
													t.wallCullDirection = 0;
												}

												if ((var24.orientationA & var11) != 0
														&& !this.isWallOccluded(var7, var4, var5, var24.orientationA)) {
													var24.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos,
															var24.strictX - cameraX, var24.floorLevel - cameraY,
															var24.strictY - cameraZ, var24.bitset);
												}

												if ((var24.orientationB & var11) != 0
														&& !this.isWallOccluded(var7, var4, var5, var24.orientationB)) {
													var24.entityB.draw(0, pitchSin, pitchCos, yawSin, yawCos,
															var24.strictX - cameraX, var24.floorLevel - cameraY,
															var24.strictY - cameraZ, var24.bitset);
												}
											}

											if (var26 != null && !this.isOccluded(var7, var4, var5,
													var26.entityA.height * 1812947537)) {
												if ((var26.orientationA & var11) != 0) {
													var26.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos,
															var26.regionX - cameraX + var26.insetX,
															var26.height - cameraY,
															var26.regionY - cameraZ + var26.insetY, var26.bitset);
												} else if (var26.orientationA == 256) {
													var14 = var26.regionX - cameraX;
													var15 = var26.height - cameraY;
													var16 = var26.regionY - cameraZ;
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
														var26.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos,
																var26.insetX + var14, var15, var26.insetY + var16,
																var26.bitset);
													} else if (var26.entityB != null) {
														var26.entityB.draw(0, pitchSin, pitchCos, yawSin, yawCos,
																var14, var15, var16, var26.bitset);
													}
												}
											}

											if (var22) {
												TileDecorationStub var291 = t.tileDecorationStub;
												if (var291 != null) {
													var291.entity.draw(0, pitchSin, pitchCos, yawSin, yawCos,
															var291.strictX - cameraX, var291.height - cameraY,
															var291.strictY - cameraZ, var291.bitset);
												}

												ItemPile var32 = t.itemPile;
												if (var32 != null && var32.height == 0) {
													if (var32.middle != null) {
														var32.middle.draw(0, pitchSin, pitchCos, yawSin, yawCos,
																var32.regionX - cameraX, var32.counterHeight - cameraY,
																var32.regionY - cameraZ, var32.bitset);
													}

													if (var32.anEntity832 != null) {
														var32.anEntity832.draw(0, pitchSin, pitchCos, yawSin,
																yawCos, var32.regionX - cameraX,
																var32.counterHeight - cameraY, var32.regionY - cameraZ,
																var32.bitset);
													}

													if (var32.bottom != null) {
														var32.bottom.draw(0, pitchSin, pitchCos, yawSin, yawCos,
																var32.regionX - cameraX, var32.counterHeight - cameraY,
																var32.regionY - cameraZ, var32.bitset);
													}
												}
											}

											var14 = t.flags;
											if (var14 != 0) {
												if (var4 < screenCenterX && (var14 & 0x4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.visible) {
														tileDeque.addFront(var33);
													}
												}

												if (var5 < screenCenterZ && (var14 & 0x2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.visible) {
														tileDeque.addFront(var33);
													}
												}

												if (var4 > screenCenterX && (var14 & 0x1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.visible) {
														tileDeque.addFront(var33);
													}
												}

												if (var5 > screenCenterZ && (var14 & 0x8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.visible) {
														tileDeque.addFront(var33);
													}
												}
											}
											break;
										}

										if (t.wallCullDirection != 0) {
											var22 = true;

											for (var21 = 0; var21 < t.entityCount; var21++) {
												if (t.entityMarkers[var21].cycle != cycle
														&& (t.entityFlags[var21]
																& t.wallCullDirection) == t.wallUncullDirection) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var10 = t.wall;
												if (!this.isWallOccluded(var7, var4, var5, var10.orientationA)) {
													var10.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos,
															var10.strictX - cameraX, var10.floorLevel - cameraY,
															var10.strictY - cameraZ, var10.bitset);
												}

												t.wallCullDirection = 0;
											}
										}

										if (!t.drawEntities) {
											break;
										}

										try {
											var29 = t.entityCount;
											t.drawEntities = false;
											var21 = 0;

											entityLoop: for (var11 = 0; var11 < var29; var11++) {
												var12 = t.entityMarkers[var11];
												if (var12.cycle != cycle) {
													for (var281 = var12.regionX; var281 <= var12.sizeX; var281++) {
														for (var14 = var12.regionY; var14 <= var12.sizeY; var14++) {
															var33 = var8[var281][var14];
															if (var33.draw) {
																t.drawEntities = true;
																continue entityLoop;
															}

															if (var33.wallCullDirection != 0) {
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

																if ((var33.wallCullDirection & var16) == t.wallCullOppositeDirection) {
																	t.drawEntities = true;
																	continue entityLoop;
																}
															}
														}
													}

													entityBuffer[var21++] = var12;
													var281 = screenCenterX - var12.regionX;
													var14 = var12.sizeX - screenCenterX;
													if (var14 > var281) {
														var281 = var14;
													}

													var15 = screenCenterZ - var12.regionY;
													var16 = var12.sizeY - screenCenterZ;
													if (var16 > var15) {
														var12.drawPriority = var281 + var16;
													} else {
														var12.drawPriority = var281 + var15;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var27 = -1;

												EntityMarker var30;
												for (var281 = 0; var281 < var21; var281++) {
													var30 = entityBuffer[var281];
													if (var30.cycle != cycle) {
														if (var30.drawPriority > var11) {
															var11 = var30.drawPriority;
															var27 = var281;
														} else if (var30.drawPriority == var11) {
															var15 = var30.strictX - cameraX;
															var16 = var30.strictY - cameraZ;
															var17 = entityBuffer[var27].strictX - cameraX;
															var18 = entityBuffer[var27].strictY - cameraZ;
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

												var30 = entityBuffer[var27];
												var30.cycle = cycle;
												if (!this.isAreaOccluded(var7, var30.regionX, var30.sizeX, var30.regionY,
														var30.sizeY, var30.entity.height * 1812947537)) {
													var30.entity.draw(var30.orientation, pitchSin, pitchCos, yawSin,
															yawCos, var30.strictX - cameraX, var30.height - cameraY,
															var30.strictY - cameraZ, var30.nitset);
												}

												for (var14 = var30.regionX; var14 <= var30.sizeX; var14++) {
													for (var15 = var30.regionY; var15 <= var30.sizeY; var15++) {
														LandscapeTile var28 = var8[var14][var15];
														if (var28.wallCullDirection != 0) {
															tileDeque.addFront(var28);
														} else if ((var14 != var4 || var15 != var5)
																&& var28.visible) {
															tileDeque.addFront(var28);
														}
													}
												}
											}

											if (!t.drawEntities) {
												break;
											}
										} catch (Exception var261) {
											t.drawEntities = false;
											break;
										}
									}
								} while (!t.visible);
							} while (t.wallCullDirection != 0);

							if (var4 > screenCenterX || var4 <= minTileX) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while (var9 != null && var9.visible);

						if (var4 < screenCenterX || var4 >= maxTileX - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while (var9 != null && var9.visible);

					if (var5 > screenCenterZ || var5 <= minTileZ) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while (var9 != null && var9.visible);

				if (var5 < screenCenterZ || var5 >= maxTileZ - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while (var9 != null && var9.visible);

			t.visible = false;
			--tileUpdateCount;
			ItemPile var31 = t.itemPile;
			if (var31 != null && var31.height != 0) {
				if (var31.middle != null) {
					var31.middle.draw(0, pitchSin, pitchCos, yawSin, yawCos, var31.regionX - cameraX,
							var31.counterHeight - cameraY - var31.height, var31.regionY - cameraZ, var31.bitset);
				}

				if (var31.anEntity832 != null) {
					var31.anEntity832.draw(0, pitchSin, pitchCos, yawSin, yawCos, var31.regionX - cameraX,
							var31.counterHeight - cameraY - var31.height, var31.regionY - cameraZ, var31.bitset);
				}

				if (var31.bottom != null) {
					var31.bottom.draw(0, pitchSin, pitchCos, yawSin, yawCos, var31.regionX - cameraX,
							var31.counterHeight - cameraY - var31.height, var31.regionY - cameraZ, var31.bitset);
				}
			}

			if (t.wallDrawFlags != 0) {
				BoundaryDecorationStub var321 = t.boundaryDecorationStub;
				if (var321 != null && !this.isOccluded(var7, var4, var5, var321.entityA.height * 1812947537)) {
					if ((var321.orientationA & t.wallDrawFlags) != 0) {
						var321.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos,
								var321.regionX - cameraX + var321.insetX, var321.height - cameraY,
								var321.regionY - cameraZ + var321.insetY, var321.bitset);
					} else if (var321.orientationA == 256) {
						var11 = var321.regionX - cameraX;
						var27 = var321.height - cameraY;
						var281 = var321.regionY - cameraZ;
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
							var321.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos, var321.insetX + var11,
									var27, var321.insetY + var281, var321.bitset);
						} else if (var321.entityB != null) {
							var321.entityB.draw(0, pitchSin, pitchCos, yawSin, yawCos, var11, var27, var281,
									var321.bitset);
						}
					}
				}

				BoundaryStub var331 = t.wall;
				if (var331 != null) {
					if ((var331.orientationB & t.wallDrawFlags) != 0
							&& !this.isWallOccluded(var7, var4, var5, var331.orientationB)) {
						var331.entityB.draw(0, pitchSin, pitchCos, yawSin, yawCos, var331.strictX - cameraX,
								var331.floorLevel - cameraY, var331.strictY - cameraZ, var331.bitset);
					}

					if ((var331.orientationA & t.wallDrawFlags) != 0
							&& !this.isWallOccluded(var7, var4, var5, var331.orientationA)) {
						var331.entityA.draw(0, pitchSin, pitchCos, yawSin, yawCos, var331.strictX - cameraX,
								var331.floorLevel - cameraY, var331.strictY - cameraZ, var331.bitset);
					}
				}
			}

			LandscapeTile var34;
			if (var6 < this.maxY - 1) {
				var34 = this.tiles[var6 + 1][var4][var5];
				if (var34 != null && var34.visible) {
					tileDeque.addFront(var34);
				}
			}

			if (var4 < screenCenterX) {
				var34 = var8[var4 + 1][var5];
				if (var34 != null && var34.visible) {
					tileDeque.addFront(var34);
				}
			}

			if (var5 < screenCenterZ) {
				var34 = var8[var4][var5 + 1];
				if (var34 != null && var34.visible) {
					tileDeque.addFront(var34);
				}
			}

			if (var4 > screenCenterX) {
				var34 = var8[var4 - 1][var5];
				if (var34 != null && var34.visible) {
					tileDeque.addFront(var34);
				}
			}

			if (var5 > screenCenterZ) {
				var34 = var8[var4][var5 - 1];
				if (var34 != null && var34.visible) {
					tileDeque.addFront(var34);
				}
			}
		}
	}

	void drawTileOverlay(TileOverlay overlay, int var2, int var3, int var4, int var5, int var6, int var7) {
		int count = overlay.vertexX.length;

		int var9;
		int sceneX;
		int w;
		int sceneY;
		int sceneZ;
		for (var9 = 0; var9 < count; var9++) {
			sceneX = overlay.vertexX[var9] - cameraX;
			sceneY = overlay.vertexY[var9] - cameraY;
			sceneZ = overlay.vertexZ[var9] - cameraZ;
			w = sceneZ * var4 + sceneX * var5 >> 16;
			sceneZ = sceneZ * var5 - sceneX * var4 >> 16;
			sceneX = w;
			w = sceneY * var3 - sceneZ * var2 >> 16;
			sceneZ = sceneY * var2 + sceneZ * var3 >> 16;
			if (sceneZ < 50) {
				return;
			}

			if (overlay.triangleTextureId != null) {
				TileOverlay.vertexSceneX[var9] = sceneX;
				TileOverlay.vertexSceneY[var9] = w;
				TileOverlay.vertexSceneZ[var9] = sceneZ;
			}

			TileOverlay.tmpScreenX[var9] = Graphics3D.centerX + Graphics3D.viewportWidth * sceneX / sceneZ;
			TileOverlay.tmpScreenY[var9] = Graphics3D.centerY + Graphics3D.viewportWidth * w / sceneZ;
		}

		Graphics3D.alpha = 0;
		count = overlay.triangleVertexA.length;

		for (var9 = 0; var9 < count; var9++) {
			sceneX = overlay.triangleVertexA[var9];
			sceneY = overlay.triangleVertexB[var9];
			sceneZ = overlay.triangleVertexC[var9];
			w = TileOverlay.tmpScreenX[sceneX];
			int var12 = TileOverlay.tmpScreenX[sceneY];
			int var16 = TileOverlay.tmpScreenX[sceneZ];
			int var15 = TileOverlay.tmpScreenY[sceneX];
			int var14 = TileOverlay.tmpScreenY[sceneY];
			int var13 = TileOverlay.tmpScreenY[sceneZ];
			if ((w - var12) * (var13 - var14) - (var15 - var14) * (var16 - var12) > 0) {
				Graphics3D.textX = false;
				if (w < 0 || var12 < 0 || var16 < 0 || w > Graphics3D.rightX
						|| var12 > Graphics3D.rightX || var16 > Graphics3D.rightX) {
					Graphics3D.textX = true;
				}

				if (checkClick && this.withinTriangle(mouseX, mouseY, var15, var14, var13, w, var12, var16)) {
					clickedTileX = var6;
					clickedTileZ = var7;
				}

				if (overlay.triangleTextureId != null && overlay.triangleTextureId[var9] != -1) {
					if (!lowMemory) {
						if (overlay.flat) {
							Graphics3D.fillTexturedTriangle(var15, var14, var13, w, var12, var16,
									overlay.triangleColorA[var9], overlay.triangleColorB[var9], overlay.triangleColorC[var9],
									TileOverlay.vertexSceneX[0], TileOverlay.vertexSceneX[1], TileOverlay.vertexSceneX[3],
									TileOverlay.vertexSceneY[0], TileOverlay.vertexSceneY[1], TileOverlay.vertexSceneY[3],
									TileOverlay.vertexSceneZ[0], TileOverlay.vertexSceneZ[1], TileOverlay.vertexSceneZ[3],
									overlay.triangleTextureId[var9]);
						} else {
							Graphics3D.fillTexturedTriangle(var15, var14, var13, w, var12, var16,
									overlay.triangleColorA[var9], overlay.triangleColorB[var9], overlay.triangleColorC[var9],
									TileOverlay.vertexSceneX[sceneX], TileOverlay.vertexSceneX[sceneY],
									TileOverlay.vertexSceneX[sceneZ], TileOverlay.vertexSceneY[sceneX],
									TileOverlay.vertexSceneY[sceneY], TileOverlay.vertexSceneY[sceneZ],
									TileOverlay.vertexSceneZ[sceneX], TileOverlay.vertexSceneZ[sceneY],
									TileOverlay.vertexSceneZ[sceneZ], overlay.triangleTextureId[var9]);
						}
					} else {
						int var19 = Graphics3D.textureLoader.getAverageTextureRGB(overlay.triangleTextureId[var9]);
						Graphics3D.fillShadedTriangle(var15, var14, var13, w, var12, var16,
								method22(var19, overlay.triangleColorA[var9]), method22(var19, overlay.triangleColorB[var9]),
								method22(var19, overlay.triangleColorC[var9]));
					}
				} else if (overlay.triangleColorA[var9] != 12345678) {
					Graphics3D.fillShadedTriangle(var15, var14, var13, w, var12, var16, overlay.triangleColorA[var9],
							overlay.triangleColorB[var9], overlay.triangleColorC[var9]);
				}
			}
		}

	}

	boolean withinTriangle(int x, int y, int y0, int y1, int y2, int x1, int x2, int x3) {
		if (y < y0 && y < y1 && y < y2) {
			return false;
		} else if (y > y0 && y > y1 && y > y2) {
			return false;
		} else if (x < x1 && x < x2 && x < x3) {
			return false;
		} else if (x > x1 && x > x2 && x > x3) {
			return false;
		} else {
			int a = (y - y0) * (x2 - x1) - (x - x1) * (y1 - y0);
			int b = (y - y2) * (x1 - x3) - (x - x3) * (y0 - y2);
			int c = (y - y1) * (x3 - x2) - (x - x2) * (y2 - y1);
			return a * c > 0 && c * b > 0;
		}
	}

	void updateOccluders() {
		int occluderCount = levelOccluderCount[activeLevel];
		Occluder[] occluders = levelOccluders[activeLevel];
		activeOccluderCount = 0;

		for (int i = 0; i < occluderCount; i++) {
			Occluder o = occluders[i];
			boolean visible;
			int var6;
			int minZ;
			int maxZ;
			int maxX;
			if (o.type == 1) {
				var6 = o.minTileX - screenCenterX + 25;
				if (var6 >= 0 && var6 <= 50) {
					minZ = o.minTileZ - screenCenterZ + 25;
					if (minZ < 0) {
						minZ = 0;
					}

					maxZ = o.maxTileZ - screenCenterZ + 25;
					if (maxZ > 50) {
						maxZ = 50;
					}

					visible = false;

					while (minZ <= maxZ) {
						if (visibilityMap[var6][minZ++]) {
							visible = true;
							break;
						}
					}

					if (visible) {
						maxX = cameraX - o.minX;
						if (maxX > 32) {
							o.testDirection = 1;
						} else {
							if (maxX >= -32) {
								continue;
							}

							o.testDirection = 2;
							maxX = -maxX;
						}

						o.minNormalX = (o.minZ - cameraZ << 8) / maxX;
						o.maxNormalX = (o.maxZ - cameraZ << 8) / maxX;
						o.minNormalY = (o.minY - cameraY << 8) / maxX;
						o.maxNormalY = (o.maxY - cameraY << 8) / maxX;
						activeOccluders[activeOccluderCount++] = o;
					}
				}
			} else if (o.type == 2) {
				var6 = o.minTileZ - screenCenterZ + 25;
				if (var6 >= 0 && var6 <= 50) {
					minZ = o.minTileX - screenCenterX + 25;
					if (minZ < 0) {
						minZ = 0;
					}

					maxZ = o.maxTIleX - screenCenterX + 25;
					if (maxZ > 50) {
						maxZ = 50;
					}

					visible = false;

					while (minZ <= maxZ) {
						if (visibilityMap[minZ++][var6]) {
							visible = true;
							break;
						}
					}

					if (visible) {
						maxX = cameraZ - o.minZ;
						if (maxX > 32) {
							o.testDirection = 3;
						} else {
							if (maxX >= -32) {
								continue;
							}

							o.testDirection = 4;
							maxX = -maxX;
						}

						o.anInt377 = (o.minX - cameraX << 8) / maxX;
						o.anInt379 = (o.maxX - cameraX << 8) / maxX;
						o.minNormalY = (o.minY - cameraY << 8) / maxX;
						o.maxNormalY = (o.maxY - cameraY << 8) / maxX;
						activeOccluders[activeOccluderCount++] = o;
					}
				}
			} else if (o.type == 4) {
				var6 = o.minY - cameraY;
				if (var6 > 128) {
					minZ = o.minTileZ - screenCenterZ + 25;
					if (minZ < 0) {
						minZ = 0;
					}

					maxZ = o.maxTileZ - screenCenterZ + 25;
					if (maxZ > 50) {
						maxZ = 50;
					}

					if (minZ <= maxZ) {
						int minX = o.minTileX - screenCenterX + 25;
						if (minX < 0) {
							minX = 0;
						}

						maxX = o.maxTIleX - screenCenterX + 25;
						if (maxX > 50) {
							maxX = 50;
						}

						visible = false;

						visibilityCheck: for (int x = minX; x <= maxX; x++) {
							for (int z = minZ; z <= maxZ; z++) {
								if (visibilityMap[x][z]) {
									visible = true;
									break visibilityCheck;
								}
							}
						}

						if (visible) {
							o.testDirection = 5;
							o.anInt377 = (o.minX - cameraX << 8) / var6;
							o.anInt379 = (o.maxX - cameraX << 8) / var6;
							o.minNormalX = (o.minZ - cameraZ << 8) / var6;
							o.maxNormalX = (o.maxZ - cameraZ << 8) / var6;
							activeOccluders[activeOccluderCount++] = o;
						}
					}
				}
			}
		}

	}

	boolean isTileOccluded(int level, int tileX, int tileZ) {
		int cyc = this.tileCycles[level][tileX][tileZ];
		if (-cycle == cyc) {
			return false;
		} else if (cycle == cyc) {
			return true;
		} else {
			int sceneX = tileX << 7;
			int sceneZ = tileZ << 7;
			if (this.isOccluded(sceneX + 1, this.tileHeights[level][tileX][tileZ], sceneZ + 1)
					&& this.isOccluded(sceneX + 128 - 1, this.tileHeights[level][tileX + 1][tileZ], sceneZ + 1)
					&& this.isOccluded(sceneX + 128 - 1, this.tileHeights[level][tileX + 1][tileZ + 1], sceneZ + 128 - 1)
					&& this.isOccluded(sceneX + 1, this.tileHeights[level][tileX][tileZ + 1], sceneZ + 128 - 1)) {
				this.tileCycles[level][tileX][tileZ] = cycle;
				return true;
			} else {
				this.tileCycles[level][tileX][tileZ] = -cycle;
				return false;
			}
		}
	}

	boolean isWallOccluded(int level, int tileX, int tileZ, int type) {
		if (!this.isTileOccluded(level, tileX, tileZ)) {
			return false;
		} else {
			int x = tileX << 7;
			int z = tileZ << 7;
			int y = this.tileHeights[level][tileX][tileZ] - 1;
			int ly0 = y - 120;
			int ly1 = y - 230;
			int ly2 = y - 238;
			if (type < 16) {
				if (type == 1) {
					if (x > cameraX) {
						if (!this.isOccluded(x, y, z)) {
							return false;
						}

						if (!this.isOccluded(x, y, z + 128)) {
							return false;
						}
					}

					if (level > 0) {
						if (!this.isOccluded(x, ly0, z)) {
							return false;
						}

						if (!this.isOccluded(x, ly0, z + 128)) {
							return false;
						}
					}

					if (!this.isOccluded(x, ly1, z)) {
						return false;
					}

					if (!this.isOccluded(x, ly1, z + 128)) {
						return false;
					}

					return true;
				}

				if (type == 2) {
					if (z < cameraZ) {
						if (!this.isOccluded(x, y, z + 128)) {
							return false;
						}

						if (!this.isOccluded(x + 128, y, z + 128)) {
							return false;
						}
					}

					if (level > 0) {
						if (!this.isOccluded(x, ly0, z + 128)) {
							return false;
						}

						if (!this.isOccluded(x + 128, ly0, z + 128)) {
							return false;
						}
					}

					if (!this.isOccluded(x, ly1, z + 128)) {
						return false;
					}

					if (!this.isOccluded(x + 128, ly1, z + 128)) {
						return false;
					}

					return true;
				}

				if (type == 4) {
					if (x < cameraX) {
						if (!this.isOccluded(x + 128, y, z)) {
							return false;
						}

						if (!this.isOccluded(x + 128, y, z + 128)) {
							return false;
						}
					}

					if (level > 0) {
						if (!this.isOccluded(x + 128, ly0, z)) {
							return false;
						}

						if (!this.isOccluded(x + 128, ly0, z + 128)) {
							return false;
						}
					}

					if (!this.isOccluded(x + 128, ly1, z)) {
						return false;
					}

					if (!this.isOccluded(x + 128, ly1, z + 128)) {
						return false;
					}

					return true;
				}

				if (type == 8) {
					if (z > cameraZ) {
						if (!this.isOccluded(x, y, z)) {
							return false;
						}

						if (!this.isOccluded(x + 128, y, z)) {
							return false;
						}
					}

					if (level > 0) {
						if (!this.isOccluded(x, ly0, z)) {
							return false;
						}

						if (!this.isOccluded(x + 128, ly0, z)) {
							return false;
						}
					}

					if (!this.isOccluded(x, ly1, z)) {
						return false;
					}

					if (!this.isOccluded(x + 128, ly1, z)) {
						return false;
					}

					return true;
				}
			}

			return !this.isOccluded(x + 64, ly2, z + 64) ? false
					: (type == 16 ? this.isOccluded(x, ly1, z + 128)
							: (type == 32 ? this.isOccluded(x + 128, ly1, z + 128)
									: (type == 64 ? this.isOccluded(x + 128, ly1, z)
											: (type == 128 ? this.isOccluded(x, ly1, z) : true))));
		}
	}

	boolean isOccluded(int level, int tileX, int tileZ, int height) {
		if (!this.isTileOccluded(level, tileX, tileZ)) {
			return false;
		} else {
			int var5 = tileX << 7;
			int var6 = tileZ << 7;
			return this.isOccluded(var5 + 1, this.tileHeights[level][tileX][tileZ] - height, var6 + 1)
					&& this.isOccluded(var5 + 128 - 1, this.tileHeights[level][tileX + 1][tileZ] - height, var6 + 1)
					&& this.isOccluded(var5 + 128 - 1, this.tileHeights[level][tileX + 1][tileZ + 1] - height, var6 + 128 - 1)
					&& this.isOccluded(var5 + 1, this.tileHeights[level][tileX][tileZ + 1] - height, var6 + 128 - 1);
		}
	}

	boolean isAreaOccluded(int level, int minTileX, int maxTileX, int minTileZ, int maxTileZ, int height) {
		int z;
		int x;
		if (minTileX == maxTileX && minTileZ == maxTileZ) {
			if (!this.isTileOccluded(level, minTileX, minTileZ)) {
				return false;
			} else {
				x = minTileX << 7;
				z = minTileZ << 7;
				return this.isOccluded(x + 1, this.tileHeights[level][minTileX][minTileZ] - height, z + 1)
						&& this.isOccluded(x + 128 - 1, this.tileHeights[level][minTileX + 1][minTileZ] - height, z + 1)
						&& this.isOccluded(x + 128 - 1, this.tileHeights[level][minTileX + 1][minTileZ + 1] - height,
								z + 128 - 1)
						&& this.isOccluded(x + 1, this.tileHeights[level][minTileX][minTileZ + 1] - height, z + 128 - 1);
			}
		} else {
			for (x = minTileX; x <= maxTileX; x++) {
				for (z = minTileZ; z <= maxTileZ; z++) {
					if (this.tileCycles[level][x][z] == -cycle) {
						return false;
					}
				}
			}

			x = (minTileX << 7) + 1;
			z = (minTileZ << 7) + 2;
			int minY = this.tileHeights[level][minTileX][minTileZ] - height;
			if (!this.isOccluded(x, minY, z)) {
				return false;
			} else {
				int maxX = (maxTileX << 7) - 1;
				if (!this.isOccluded(maxX, minY, z)) {
					return false;
				} else {
					int maxZ = (maxTileZ << 7) - 1;
					if (!this.isOccluded(x, minY, maxZ)) {
						return false;
					} else if (!this.isOccluded(maxX, minY, maxZ)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean isOccluded(int x, int y, int z) {
		for (int i = 0; i < activeOccluderCount; i++) {
			Occluder o = activeOccluders[i];
			int dz;
			int maxY;
			int maxZ;
			int minY;
			int minZ;
			if (o.testDirection == 1) {
				dz = o.minX - x;
				if (dz > 0) {
					minZ = o.minZ + (o.minNormalX * dz >> 8);
					maxZ = o.maxZ + (o.maxNormalX * dz >> 8);
					minY = o.minY + (o.minNormalY * dz >> 8);
					maxY = o.maxY + (o.maxNormalY * dz >> 8);
					if (z >= minZ && z <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (o.testDirection == 2) {
				dz = x - o.minX;
				if (dz > 0) {
					minZ = o.minZ + (o.minNormalX * dz >> 8);
					maxZ = o.maxZ + (o.maxNormalX * dz >> 8);
					minY = o.minY + (o.minNormalY * dz >> 8);
					maxY = o.maxY + (o.maxNormalY * dz >> 8);
					if (z >= minZ && z <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (o.testDirection == 3) {
				dz = o.minZ - z;
				if (dz > 0) {
					minZ = o.minX + (o.anInt377 * dz >> 8);
					maxZ = o.maxX + (o.anInt379 * dz >> 8);
					minY = o.minY + (o.minNormalY * dz >> 8);
					maxY = o.maxY + (o.maxNormalY * dz >> 8);
					if (x >= minZ && x <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (o.testDirection == 4) {
				dz = z - o.minZ;
				if (dz > 0) {
					minZ = o.minX + (o.anInt377 * dz >> 8);
					maxZ = o.maxX + (o.anInt379 * dz >> 8);
					minY = o.minY + (o.minNormalY * dz >> 8);
					maxY = o.maxY + (o.maxNormalY * dz >> 8);
					if (x >= minZ && x <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (o.testDirection == 5) {
				dz = y - o.minY;
				if (dz > 0) {
					minZ = o.minX + (o.anInt377 * dz >> 8);
					maxZ = o.maxX + (o.anInt379 * dz >> 8);
					minY = o.minZ + (o.minNormalX * dz >> 8);
					maxY = o.maxZ + (o.maxNormalX * dz >> 8);
					if (x >= minZ && x <= maxZ && z >= minY && z <= maxY) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public static void addOcclude(int level, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder o = new Occluder();
		o.minTileX = var2 / 128;
		o.maxTIleX = var3 / 128;
		o.minTileZ = var4 / 128;
		o.maxTileZ = var5 / 128;
		o.type = var1;
		o.minX = var2;
		o.maxX = var3;
		o.minZ = var4;
		o.maxZ = var5;
		o.minY = var6;
		o.maxY = var7;
		levelOccluders[level][levelOccluderCount[level]++] = o;
	}

	public void clearEntities() {
		for (int i = 0; i < this.entityCount; i++) {
			EntityMarker e = this.entities[i];
			this.removeEntity(e);
			this.entities[i] = null;
		}

		this.entityCount = 0;
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
				pitchSin = Graphics3D.SIN_TABLE[var8];
				pitchCos = Graphics3D.COS_TABLE[var8];
				yawSin = Graphics3D.SIN_TABLE[var9];
				yawCos = Graphics3D.COS_TABLE[var9];
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

						visibilityMaps[var8][var9][var10 + 25][var11 + 25] = var161;
					}
				}
			}
		}

	}

	public void setPhysicalLevel(int var1, int var2, int var3, int var4) {
		LandscapeTile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].physicalLevel = var4;
		}

	}

	public int method53(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.wall != null ? var4.wall.bitset : 0;
	}

	boolean addEntityMarker(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9,
			int var10, boolean var11, int var12, int var13) {
		int var16;
		for (int var20 = var2; var20 < var2 + var4; var20++) {
			for (var16 = var3; var16 < var3 + var5; var16++) {
				if (var20 < 0 || var16 < 0 || var20 >= this.maxX || var16 >= this.maxZ) {
					return false;
				}

				LandscapeTile var21 = this.tiles[var1][var20][var16];
				if (var21 != null && var21.entityCount >= 5) {
					return false;
				}
			}
		}

		EntityMarker var19 = new EntityMarker();
		var19.nitset = var12;
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
				var211.entityMarkers[var211.entityCount] = var19;
				var211.entityFlags[var211.entityCount] = var17;
				var211.flags |= var17;
				++var211.entityCount;
			}
		}

		if (var11) {
			this.entities[this.entityCount++] = var19;
		}

		return true;
	}

	void drawTileUnderlay(TileUnderlay var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - cameraX;
		int var27;
		int var20 = var27 = (var8 << 7) - cameraZ;
		int var12;
		int var13 = var12 = var10 + 128;
		int var17;
		int var19 = var17 = var20 + 128;
		int var15 = this.tileHeights[var2][var7][var8] - cameraY;
		int var11 = this.tileHeights[var2][var7 + 1][var8] - cameraY;
		int var16 = this.tileHeights[var2][var7 + 1][var8 + 1] - cameraY;
		int var28 = this.tileHeights[var2][var7][var8 + 1] - cameraY;
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
						int var24 = Graphics3D.centerX + Graphics3D.viewportWidth * var10 / var20;
						int var21 = Graphics3D.centerY + Graphics3D.viewportWidth * var15 / var20;
						int var25 = Graphics3D.centerX + Graphics3D.viewportWidth * var13 / var27;
						int var22 = Graphics3D.centerY + Graphics3D.viewportWidth * var11 / var27;
						int var29 = Graphics3D.centerX + Graphics3D.viewportWidth * var12 / var19;
						int var30 = Graphics3D.centerY + Graphics3D.viewportWidth * var16 / var19;
						int var26 = Graphics3D.centerX + Graphics3D.viewportWidth * var9 / var17;
						int var23 = Graphics3D.centerY + Graphics3D.viewportWidth * var18 / var17;
						Graphics3D.alpha = 0;
						int var14;
						if ((var29 - var26) * (var22 - var23) - (var30 - var23) * (var25 - var26) > 0) {
							Graphics3D.textX = false;
							if (var29 < 0 || var26 < 0 || var25 < 0 || var29 > Graphics3D.rightX
									|| var26 > Graphics3D.rightX || var25 > Graphics3D.rightX) {
								Graphics3D.textX = true;
							}

							if (checkClick && this.withinTriangle(mouseX, mouseY, var30, var23, var22, var29, var26, var25)) {
								clickedTileX = var7;
								clickedTileZ = var8;
							}

							if (var1.tectureId == -1) {
								if (var1.neColor != 12345678) {
									Graphics3D.fillShadedTriangle(var30, var23, var22, var29, var26, var25, var1.neColor,
											var1.nwColor, var1.seColor);
								}
							} else if (!lowMemory) {
								if (var1.flat) {
									Graphics3D.fillTexturedTriangle(var30, var23, var22, var29, var26, var25, var1.neColor,
											var1.nwColor, var1.seColor, var10, var13, var9, var15, var11, var18,
											var20, var27, var17, var1.tectureId);
								} else {
									Graphics3D.fillTexturedTriangle(var30, var23, var22, var29, var26, var25, var1.neColor,
											var1.nwColor, var1.seColor, var12, var9, var13, var16, var18, var11,
											var19, var17, var27, var1.tectureId);
								}
							} else {
								var14 = Graphics3D.textureLoader.getAverageTextureRGB(var1.tectureId);
								Graphics3D.fillShadedTriangle(var30, var23, var22, var29, var26, var25,
										method22(var14, var1.neColor), method22(var14, var1.nwColor),
										method22(var14, var1.seColor));
							}
						}

						if ((var24 - var25) * (var23 - var22) - (var21 - var22) * (var26 - var25) > 0) {
							Graphics3D.textX = false;
							if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > Graphics3D.rightX
									|| var25 > Graphics3D.rightX || var26 > Graphics3D.rightX) {
								Graphics3D.textX = true;
							}

							if (checkClick && this.withinTriangle(mouseX, mouseY, var21, var22, var23, var24, var25, var26)) {
								clickedTileX = var7;
								clickedTileZ = var8;
							}

							if (var1.tectureId == -1) {
								if (var1.swColor != 12345678) {
									Graphics3D.fillShadedTriangle(var21, var22, var23, var24, var25, var26, var1.swColor,
											var1.seColor, var1.nwColor);
								}
							} else if (!lowMemory) {
								Graphics3D.fillTexturedTriangle(var21, var22, var23, var24, var25, var26, var1.swColor,
										var1.seColor, var1.nwColor, var10, var13, var9, var15, var11, var18, var20,
										var27, var17, var1.tectureId);
							} else {
								var14 = Graphics3D.textureLoader.getAverageTextureRGB(var1.tectureId);
								Graphics3D.fillShadedTriangle(var21, var22, var23, var24, var25, var26,
										method22(var14, var1.swColor), method22(var14, var1.seColor),
										method22(var14, var1.nwColor));
							}
						}
					}
				}
			}
		}

	}

	public void applyLighting(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.maxY; var4++) {
			for (int var6 = 0; var6 < this.maxX; var6++) {
				for (int var7 = 0; var7 < this.maxZ; var7++) {
					LandscapeTile var9 = this.tiles[var4][var6][var7];
					if (var9 != null) {
						BoundaryStub var5 = var9.wall;
						RSModel var8;
						if (var5 != null && var5.entityA instanceof RSModel) {
							RSModel var14 = (RSModel) var5.entityA;
							this.method57(var14, var4, var6, var7, 1, 1);
							if (var5.entityB instanceof RSModel) {
								var8 = (RSModel) var5.entityB;
								this.method57(var8, var4, var6, var7, 1, 1);
								RSModel.method893(var14, var8, 0, 0, 0, false);
								var5.entityB = var8.method902(var8.ambient, var8.contrast, var1, var2, var3);
							}

							var5.entityA = var14.method902(var14.ambient, var14.contrast, var1, var2, var3);
						}

						for (int var13 = 0; var13 < var9.entityCount; var13++) {
							EntityMarker var12 = var9.entityMarkers[var13];
							if (var12 != null && var12.entity instanceof RSModel) {
								RSModel var11 = (RSModel) var12.entity;
								this.method57(var11, var4, var6, var7, var12.sizeX - var12.regionX + 1,
										var12.sizeY - var12.regionY + 1);
								var12.entity = var11.method902(var11.ambient, var11.contrast, var1, var2, var3);
							}
						}

						TileDecorationStub var141 = var9.tileDecorationStub;
						if (var141 != null && var141.entity instanceof RSModel) {
							var8 = (RSModel) var141.entity;
							this.method37(var8, var4, var6, var7);
							var141.entity = var8.method902(var8.ambient, var8.contrast, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	public void method56(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.wall = null;
		}

	}

	void method57(RSModel var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var15 = var3;
		int var12 = var3 + var5;
		int var13 = var4 - 1;
		int var17 = var4 + var6;

		for (int var8 = var2; var8 <= var2 + 1; var8++) {
			if (this.maxY != var8) {
				for (int var9 = var15; var9 <= var12; var9++) {
					if (var9 >= 0 && var9 < this.maxX) {
						for (int var10 = var13; var10 <= var17; var10++) {
							if (var10 >= 0 && var10 < this.maxZ
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
									BoundaryStub var16 = var18.wall;
									if (var16 != null) {
										RSModel var23;
										if (var16.entityA instanceof RSModel) {
											var23 = (RSModel) var16.entityA;
											RSModel.method893(var1, var23, (var9 - var3) * 128 + (1 - var5) * 64, var11,
													(var10 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var16.entityB instanceof RSModel) {
											var23 = (RSModel) var16.entityB;
											RSModel.method893(var1, var23, (var9 - var3) * 128 + (1 - var5) * 64, var11,
													(var10 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var231 = 0; var231 < var18.entityCount; var231++) {
										EntityMarker var19 = var18.entityMarkers[var231];
										if (var19 != null && var19.entity instanceof RSModel) {
											RSModel var20 = (RSModel) var19.entity;
											int var21 = var19.sizeX - var19.regionX + 1;
											int var22 = var19.sizeY - var19.regionY + 1;
											RSModel.method893(var1, var20,
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
		checkClick = true;
		anInt31 = var1;
		mouseX = var2;
		mouseY = var3;
		clickedTileX = -1;
		clickedTileZ = -1;
	}

	public TileDecorationStub method59(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.tileDecorationStub != null ? var4.tileDecorationStub : null;
	}

	static {
		levelOccluderCount = new int[MAX_OCCLUDER_LEVELS];
		levelOccluders = new Occluder[MAX_OCCLUDER_LEVELS][500];
		activeLevel = 0;
		activeOccluderCount = 0;
		TILE_WALL_DRAW_FLAGS_0 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		WALL_DRAW_FLAGS = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		WALL_UNCULL_FLAGS_0 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		WALL_UNCULL_FLAGS_1 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		WALL_UNCULL_FLAGS_2 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		WALL_UNCULL_FLAGS_3 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		visibilityMaps = new boolean[8][32][51][51];
		clickedTileX = -1;
		clickedTileZ = -1;
	}

}
