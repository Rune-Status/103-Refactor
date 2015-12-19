
public class Landscape {

	static int anInt7;
	static int[] anIntArray8 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	int anInt9;
	static Class34[] aClass34Array10 = new Class34[500];
	int[][][] anIntArrayArrayArray11;
	LandscapeTile[][][] tiles;
	static Deque aDeque12 = new Deque();
	static boolean[][] aBoolArrayArray13;
	EntityMarker[] tempEntityMarkers = new EntityMarker[5000];
	int[][][] anIntArrayArrayArray14;
	static int anInt15;
	int anInt16;
	static int anInt17 = 0;
	static int anInt18;
	static int anInt19;
	static EntityMarker[] anEntityMarkerArray20 = new EntityMarker[100];
	static int anInt21;
	public static boolean aBool22 = true;
	static int anInt23;
	static int screenCenterY;
	static int anInt24;
	int anInt25;
	static int anInt26;
	static int anInt27;
	static int anInt28;
	static int anInt29;
	static boolean aBool30 = false;
	static int anInt31 = 0;
	static int anInt32 = 0;
	static int anInt33;
	static int anInt34;
	static int anInt35;
	static int anInt36 = 0;
	static int anInt37 = 4;
	static int[] anIntArray38 = new int[anInt37];
	static Class34[][] aClass34ArrayArray39 = new Class34[anInt37][500];
	int anInt40 = 0;
	static int anInt41 = 0;
	static int anInt42 = 0;
	static int[] anIntArray43 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	static int[] anIntArray44 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	static int anInt45;
	static int[] anIntArray46 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	static int[] anIntArray47 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	static int[] anIntArray48 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static int[] anIntArray49 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
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
	static boolean[][][][] aBoolArrayArrayArrayArray52 = new boolean[8][32][51][51];
	public static int anInt53 = -1;
	static int anInt54;
	static int anInt55;
	int anInt56 = 0;
	static int anInt57;
	public static int anInt58 = -1;
	static int anInt59;

	public void method15() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.anInt25; ++var1) {
			for (var2 = 0; var2 < this.anInt9; ++var2) {
				for (int var3 = 0; var3 < this.anInt16; ++var3) {
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < anInt37; ++var1) {
			for (var2 = 0; var2 < anIntArray38[var1]; ++var2) {
				aClass34ArrayArray39[var1][var2] = null;
			}

			anIntArray38[var1] = 0;
		}

		for (var1 = 0; var1 < this.anInt56; ++var1) {
			this.tempEntityMarkers[var1] = null;
		}

		this.anInt56 = 0;

		for (var1 = 0; var1 < anEntityMarkerArray20.length; ++var1) {
			anEntityMarkerArray20[var1] = null;
		}

	}

	public void method16(int var1) {
		this.anInt40 = var1;

		for (int var2 = 0; var2 < this.anInt9; ++var2) {
			for (int var3 = 0; var3 < this.anInt16; ++var3) {
				if (this.tiles[var1][var2][var3] == null) {
					this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
				}
			}
		}

	}

	public Landscape(int var1, int var2, int var3, int[][][] var4) {
		this.anInt25 = var1;
		this.anInt9 = var2;
		this.anInt16 = var3;
		this.tiles = new LandscapeTile[var1][var2][var3];
		this.anIntArrayArrayArray14 = new int[var1][var2 + 1][var3 + 1];
		this.anIntArrayArrayArray11 = var4;
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
			var8.strictX = var2 * -1635206272 + -817603136;
			var8.strictY = var3 * 1413997440 + 706998720;
			var8.height = var4 * -722872229;
			var8.anInt839 = var6 * 1596679883;
			var8.config = var7 * -1848142489;
			if (this.tiles[var1][var2][var3] == null) {
				this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].tileDecorationStub = var8;
		}
	}

	public void addItemPile(int var1, int var2, int var3, int var4, Entity var5, int var6, Entity var7, Entity var8) {
		ItemPile var9 = new ItemPile();
		var9.bottom = var5;
		var9.regionX = var2 * 1850014080 + 925007040;
		var9.regionY = var3 * 1219018624 + -1537974336;
		var9.counterHeight = var4 * -1534262867;
		var9.anInt831 = var6 * -1373929709;
		var9.middle = var7;
		var9.anEntity832 = var8;
		int var13 = 0;
		LandscapeTile var10 = this.tiles[var1][var2][var3];
		if (var10 != null) {
			for (int var11 = 0; var11 < var10.anInt1407 * 1758491173; ++var11) {
				if ((var10.entityMarkers[var11].config * 1464542121 & 256) == 256
						&& var10.entityMarkers[var11].entity instanceof Model) {
					Model var12 = (Model) var10.entityMarkers[var11].entity;
					var12.method998();
					if (var12.modelHeight * 1812947537 > var13) {
						var13 = var12.modelHeight * 1812947537;
					}
				}
			}
		}

		var9.height = var13 * -834286085;
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new LandscapeTile(var1, var2, var3);
		}

		this.tiles[var1][var2][var3].itemPile = var9;
	}

	public void addBoundary(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8,
			int var9, int var10) {
		if (var5 != null || var6 != null) {
			BoundaryStub var12 = new BoundaryStub();
			var12.anInt277 = var9 * -921637927;
			var12.config = var10 * -1866632771;
			var12.strictX = var2 * -302331008 + -151165504;
			var12.strictY = var3 * 1110186624 + -1592390336;
			var12.floorLevel = var4 * -76068125;
			var12.entityA = var5;
			var12.entityB = var6;
			var12.orientationA = var7 * 1314298519;
			var12.orientationB = var8 * -504980947;

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
			var13.anInt218 = var11 * -1942339569;
			var13.config = var12 * -2073928615;
			var13.regionX = var2 * 1100218240 + 550109120;
			var13.regionY = var3 * -132751488 + -66375744;
			var13.height = var4 * 1113740717;
			var13.entityA = var5;
			var13.entityB = var6;
			var13.orientationA = var7 * -417666467;
			var13.orientationB = var8 * -1361458483;
			var13.insetX = var9 * -770621867;
			var13.insetY = var10 * -1437928113;

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
			int var11 = var2 * 128 + 64 * var5;
			int var12 = var3 * 128 + 64 * var6;
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
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & '\uff80') + var1;
	}

	void method23(EntityMarker var1) {
		for (int var2 = var1.regionX * 1249542337; var2 <= var1.sizeX * 525183875; ++var2) {
			for (int var4 = var1.regionY * -1236081819; var4 <= var1.sizeY * 1111111519; ++var4) {
				LandscapeTile var5 = this.tiles[var1.floorLevel * -599017285][var2][var4];
				if (var5 != null) {
					int var3;
					for (var3 = 0; var3 < var5.anInt1407 * 1758491173; ++var3) {
						if (var5.entityMarkers[var3] == var1) {
							var5.anInt1407 -= -1721476691;

							for (int var6 = var3; var6 < var5.anInt1407 * 1758491173; ++var6) {
								var5.entityMarkers[var6] = var5.entityMarkers[var6 + 1];
								var5.anIntArray1408[var6] = var5.anIntArray1408[var6 + 1];
							}

							var5.entityMarkers[var5.anInt1407 * 1758491173] = null;
							break;
						}
					}

					var5.anInt1401 = 0;

					for (var3 = 0; var3 < var5.anInt1407 * 1758491173; ++var3) {
						var5.anInt1401 = (var5.anInt1401 * -1372682459 | var5.anIntArray1408[var3]) * -893764435;
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
				var6.insetX = var6.insetX * 882495229 * var4 / 16 * -770621867;
				var6.insetY = var6.insetY * -1641872977 * var4 / 16 * -1437928113;
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
			for (int var6 = 0; var6 < var4.anInt1407 * 1758491173; ++var6) {
				EntityMarker var5 = var4.entityMarkers[var6];
				if ((var5.anInt269 * 714123667 >> 29 & 3) == 2 && var5.regionX * 1249542337 == var2
						&& var5.regionY * -1236081819 == var3) {
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
			for (int var5 = 0; var5 < var4.anInt1407 * 1758491173; ++var5) {
				EntityMarker var6 = var4.entityMarkers[var5];
				if ((var6.anInt269 * 714123667 >> 29 & 3) == 2 && var6.regionX * 1249542337 == var2
						&& var6.regionY * -1236081819 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public int method31(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryDecorationStub != null ? var4.boundaryDecorationStub.anInt218 * 1286385391
				: 0;
	}

	public int method32(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0;
		} else {
			for (int var6 = 0; var6 < var4.anInt1407 * 1758491173; ++var6) {
				EntityMarker var5 = var4.entityMarkers[var6];
				if ((var5.anInt269 * 714123667 >> 29 & 3) == 2 && var5.regionX * 1249542337 == var2
						&& var5.regionY * -1236081819 == var3) {
					return var5.anInt269 * 714123667;
				}
			}

			return 0;
		}
	}

	public int method33(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.tileDecorationStub != null ? var4.tileDecorationStub.anInt839 * 827739875 : 0;
	}

	public int method34(int var1, int var2, int var3, int var4) {
		LandscapeTile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			if (var5.boundaryStub != null && var5.boundaryStub.anInt277 * 785572969 == var4) {
				return var5.boundaryStub.config * 1069568405 & 255;
			} else if (var5.boundaryDecorationStub != null
					&& var5.boundaryDecorationStub.anInt218 * 1286385391 == var4) {
				return var5.boundaryDecorationStub.config * -1177605143 & 255;
			} else if (var5.tileDecorationStub != null && var5.tileDecorationStub.anInt839 * 827739875 == var4) {
				return var5.tileDecorationStub.config * 1479784023 & 255;
			} else {
				for (int var6 = 0; var6 < var5.anInt1407 * 1758491173; ++var6) {
					if (var5.entityMarkers[var6].anInt269 * 714123667 == var4) {
						return var5.entityMarkers[var6].config * 1464542121 & 255;
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

		for (int var4 = 0; var4 < 3; ++var4) {
			LandscapeTile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				var5.floorLevel -= 1947863287;

				for (int var6 = 0; var6 < var5.anInt1407 * 1758491173; ++var6) {
					EntityMarker var7 = var5.entityMarkers[var6];
					if ((var7.anInt269 * 714123667 >> 29 & 3) == 2 && var7.regionX * 1249542337 == var1
							&& var7.regionY * -1236081819 == var2) {
						var7.floorLevel -= -479867789;
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
				int var18 = var9.anInt348 * 803093675;
				if (var18 != 0) {
					for (var11 = 0; var11 < 4; ++var11) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				Class38 var10 = var7.aClass38_1405;
				if (var10 != null) {
					var11 = var10.anInt416;
					int var13 = var10.anInt422;
					int var12 = var10.anInt418;
					int var8 = var10.anInt419;
					int[] var15 = this.anIntArrayArray50[var11];
					int[] var14 = this.anIntArrayArray51[var13];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var15[var14[var16++]] == 0 ? var12 : var8;
							var1[var2 + 1] = var15[var14[var16++]] == 0 ? var12 : var8;
							var1[var2 + 2] = var15[var14[var16++]] == 0 ? var12 : var8;
							var1[var2 + 3] = var15[var14[var16++]] == 0 ? var12 : var8;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
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

	void method37(Entity_Sub1 var1, int var2, int var3, int var4) {
		LandscapeTile var5;
		Entity_Sub1 var6;
		if (var3 < this.anInt9) {
			var5 = this.tiles[var2][var3 + 1][var4];
			if (var5 != null && var5.tileDecorationStub != null
					&& var5.tileDecorationStub.entity instanceof Entity_Sub1) {
				var6 = (Entity_Sub1) var5.tileDecorationStub.entity;
				Entity_Sub1.method893(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < this.anInt9) {
			var5 = this.tiles[var2][var3][var4 + 1];
			if (var5 != null && var5.tileDecorationStub != null
					&& var5.tileDecorationStub.entity instanceof Entity_Sub1) {
				var6 = (Entity_Sub1) var5.tileDecorationStub.entity;
				Entity_Sub1.method893(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < this.anInt9 && var4 < this.anInt16) {
			var5 = this.tiles[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.tileDecorationStub != null
					&& var5.tileDecorationStub.entity instanceof Entity_Sub1) {
				var6 = (Entity_Sub1) var5.tileDecorationStub.entity;
				Entity_Sub1.method893(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < this.anInt9 && var4 > 0) {
			var5 = this.tiles[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.tileDecorationStub != null
					&& var5.tileDecorationStub.entity instanceof Entity_Sub1) {
				var6 = (Entity_Sub1) var5.tileDecorationStub.entity;
				Entity_Sub1.method893(var1, var6, 128, 0, -128, true);
			}
		}

	}

	static boolean method38(int var0, int var1, int var2) {
		int var3 = var2 * anInt28 + var0 * anInt29 >> 16;
		int var4 = var2 * anInt29 - var0 * anInt28 >> 16;
		int var5 = var1 * anInt26 + var4 * anInt27 >> 16;
		int var7 = var1 * anInt27 - var4 * anInt26 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var6 = anInt54 + var3 * DualNode_Sub13_Sub1.anInt1784 / var5;
			int var8 = anInt55 + var7 * DualNode_Sub13_Sub1.anInt1784 / var5;
			return var6 >= anInt33 && var6 <= anInt35 && var8 >= anInt57 && var8 <= anInt59;
		} else {
			return false;
		}
	}

	public void method39(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.anInt9 * 128) {
			var1 = this.anInt9 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.anInt16 * 128) {
			var3 = this.anInt16 * 128 - 1;
		}

		++anInt19;
		anInt26 = DualNode_Sub13_Sub1.anIntArray1788[var4];
		anInt27 = DualNode_Sub13_Sub1.anIntArray1792[var4];
		anInt28 = DualNode_Sub13_Sub1.anIntArray1788[var5];
		anInt29 = DualNode_Sub13_Sub1.anIntArray1792[var5];
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
		if (anInt21 > this.anInt9) {
			anInt21 = this.anInt9;
		}

		anInt23 = anInt24 + 25;
		if (anInt23 > this.anInt16) {
			anInt23 = this.anInt16;
		}

		this.method43();
		anInt17 = 0;

		int var8;
		LandscapeTile[][] var9;
		int var12;
		int var13;
		for (var8 = this.anInt40; var8 < this.anInt25; ++var8) {
			var9 = this.tiles[var8];

			for (var12 = anInt45; var12 < anInt21; ++var12) {
				for (var13 = anInt18; var13 < anInt23; ++var13) {
					LandscapeTile var10 = var9[var12][var13];
					if (var10 != null) {
						if (var10.anInt1410 * 643122391 <= var6
								&& (aBoolArrayArray13[var12 - screenCenterY + 25][var13 - anInt24 + 25]
										|| this.anIntArrayArrayArray11[var8][var12][var13] - var2 >= 2000)) {
							var10.aBool1411 = true;
							var10.aBool1412 = true;
							if (var10.anInt1407 * 1758491173 > 0) {
								var10.aBool1402 = true;
							} else {
								var10.aBool1402 = false;
							}

							++anInt17;
						} else {
							var10.aBool1411 = false;
							var10.aBool1412 = false;
							var10.anInt1409 = 0;
						}
					}
				}
			}
		}

		LandscapeTile var7;
		int var11;
		int var14;
		int var15;
		int var16;
		for (var8 = this.anInt40; var8 < this.anInt25; ++var8) {
			var9 = this.tiles[var8];

			for (var12 = -25; var12 <= 0; ++var12) {
				var13 = screenCenterY + var12;
				var16 = screenCenterY - var12;
				if (var13 >= anInt45 || var16 < anInt21) {
					for (var11 = -25; var11 <= 0; ++var11) {
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

		for (var8 = this.anInt40; var8 < this.anInt25; ++var8) {
			var9 = this.tiles[var8];

			for (var12 = -25; var12 <= 0; ++var12) {
				var13 = screenCenterY + var12;
				var16 = screenCenterY - var12;
				if (var13 >= anInt45 || var16 < anInt21) {
					for (var11 = -25; var11 <= 0; ++var11) {
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
			LandscapeTile var3 = (LandscapeTile) aDeque12.method469();
			if (var3 == null) {
				return;
			}

			if (var3.aBool1412) {
				int var4 = var3.regionX * 1489288579;
				int var5 = var3.regionY * -648052847;
				int var6 = var3.floorLevel * -1839515449;
				int var7 = var3.anInt1416 * 100529371;
				LandscapeTile[][] var8 = this.tiles[var6];
				LandscapeTile var9;
				BoundaryStub var10;
				int var11;
				EntityMarker var12;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var21;
				boolean var22;
				LandscapeTile var33;
				if (var3.aBool1411) {
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
									&& (var9.aBool1411 || (var3.anInt1401 * -1372682459 & 1) == 0)) {
								continue;
							}
						}

						if (var4 >= screenCenterY && var4 < anInt21 - 1) {
							var9 = var8[var4 + 1][var5];
							if (var9 != null && var9.aBool1412
									&& (var9.aBool1411 || (var3.anInt1401 * -1372682459 & 4) == 0)) {
								continue;
							}
						}

						if (var5 <= anInt24 && var5 > anInt18) {
							var9 = var8[var4][var5 - 1];
							if (var9 != null && var9.aBool1412
									&& (var9.aBool1411 || (var3.anInt1401 * -1372682459 & 8) == 0)) {
								continue;
							}
						}

						if (var5 >= anInt24 && var5 < anInt23 - 1) {
							var9 = var8[var4][var5 + 1];
							if (var9 != null && var9.aBool1412
									&& (var9.aBool1411 || (var3.anInt1401 * -1372682459 & 2) == 0)) {
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
								this.method54(var9.aClass31_1404, 0, anInt26, anInt27, anInt28, anInt29, var4, var5);
							}
						} else if (var9.aClass38_1405 != null && !this.method44(0, var4, var5)) {
							this.method41(var9.aClass38_1405, anInt26, anInt27, anInt28, anInt29, var4, var5);
						}

						var10 = var9.boundaryStub;
						if (var10 != null) {
							var10.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
									var10.strictX * 702405159 - anInt15, var10.floorLevel * -506049845 - anInt7,
									var10.strictY * -1481754083 - anInt34, var10.anInt277 * 785572969);
						}

						for (var11 = 0; var11 < var9.anInt1407 * 1758491173; ++var11) {
							var12 = var9.entityMarkers[var11];
							if (var12 != null) {
								var12.entity.method653(var12.orientation * -1981858225, anInt26, anInt27, anInt28,
										anInt29, var12.strictX * -501472545 - anInt15,
										var12.height * -712455821 - anInt7, var12.strictY * 20674077 - anInt34,
										var12.anInt269 * 714123667);
							}
						}
					}

					var22 = false;
					if (var3.aClass31_1404 != null) {
						if (!this.method44(var7, var4, var5)) {
							var22 = true;
							if (var3.aClass31_1404.anInt344 * 457420757 != 12345678 || aBool30 && var6 <= anInt31) {
								this.method54(var3.aClass31_1404, var7, anInt26, anInt27, anInt28, anInt29, var4, var5);
							}
						}
					} else if (var3.aClass38_1405 != null && !this.method44(var7, var4, var5)) {
						var22 = true;
						this.method41(var3.aClass38_1405, anInt26, anInt27, anInt28, anInt29, var4, var5);
					}

					var21 = 0;
					var11 = 0;
					BoundaryStub var23 = var3.boundaryStub;
					BoundaryDecorationStub var13 = var3.boundaryDecorationStub;
					if (var23 != null || var13 != null) {
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
						var3.anInt1414 = anIntArray8[var21] * 152382137;
					}

					if (var23 != null) {
						if ((var23.orientationA * 1194493223 & anIntArray44[var21]) != 0) {
							if (var23.orientationA * 1194493223 == 16) {
								var3.anInt1409 = 1225511745;
								var3.anInt1403 = anIntArray46[var21] * -1457668737;
								var3.anInt1413 = -395327125 - var3.anInt1403 * 1415484935;
							} else if (var23.orientationA * 1194493223 == 32) {
								var3.anInt1409 = -1843943806;
								var3.anInt1403 = anIntArray47[var21] * -1457668737;
								var3.anInt1413 = -790654250 - var3.anInt1403 * 1415484935;
							} else if (var23.orientationA * 1194493223 == 64) {
								var3.anInt1409 = 607079684;
								var3.anInt1403 = anIntArray48[var21] * -1457668737;
								var3.anInt1413 = -1581308500 - var3.anInt1403 * 1415484935;
							} else {
								var3.anInt1409 = -618432061;
								var3.anInt1403 = anIntArray49[var21] * -1457668737;
								var3.anInt1413 = -1185981375 - var3.anInt1403 * 1415484935;
							}
						} else {
							var3.anInt1409 = 0;
						}

						if ((var23.orientationA * 1194493223 & var11) != 0
								&& !this.method45(var7, var4, var5, var23.orientationA * 1194493223)) {
							var23.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
									var23.strictX * 702405159 - anInt15, var23.floorLevel * -506049845 - anInt7,
									var23.strictY * -1481754083 - anInt34, var23.anInt277 * 785572969);
						}

						if ((var23.orientationB * -287128155 & var11) != 0
								&& !this.method45(var7, var4, var5, var23.orientationB * -287128155)) {
							var23.entityB.method653(0, anInt26, anInt27, anInt28, anInt29,
									var23.strictX * 702405159 - anInt15, var23.floorLevel * -506049845 - anInt7,
									var23.strictY * -1481754083 - anInt34, var23.anInt277 * 785572969);
						}
					}

					if (var13 != null && !this.method46(var7, var4, var5, var13.entityA.modelHeight * 1812947537)) {
						if ((var13.orientationA * 1046166005 & var11) != 0) {
							var13.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
									var13.regionX * -1321412609 - anInt15 + var13.insetX * 882495229,
									var13.height * 2084034085 - anInt7,
									var13.regionY * -2070854849 - anInt34 + var13.insetY * -1641872977,
									var13.anInt218 * 1286385391);
						} else if (var13.orientationA * 1046166005 == 256) {
							var14 = var13.regionX * -1321412609 - anInt15;
							var15 = var13.height * 2084034085 - anInt7;
							var16 = var13.regionY * -2070854849 - anInt34;
							var17 = var13.orientationB * 313471493;
							if (var17 != 1 && var17 != 2) {
								var18 = var14;
							} else {
								var18 = -var14;
							}

							int var19;
							if (var17 != 2 && var17 != 3) {
								var19 = var16;
							} else {
								var19 = -var16;
							}

							if (var19 < var18) {
								var13.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
										var14 + var13.insetX * 882495229, var15, var16 + var13.insetY * -1641872977,
										var13.anInt218 * 1286385391);
							} else if (var13.entityB != null) {
								var13.entityB.method653(0, anInt26, anInt27, anInt28, anInt29, var14, var15, var16,
										var13.anInt218 * 1286385391);
							}
						}
					}

					if (var22) {
						TileDecorationStub var27 = var3.tileDecorationStub;
						if (var27 != null) {
							var27.entity.method653(0, anInt26, anInt27, anInt28, anInt29,
									var27.strictX * -1707403193 - anInt15, var27.height * -687892525 - anInt7,
									var27.strictY * -1882816009 - anInt34, var27.anInt839 * 827739875);
						}

						ItemPile var31 = var3.itemPile;
						if (var31 != null && var31.height * 32060723 == 0) {
							if (var31.middle != null) {
								var31.middle.method653(0, anInt26, anInt27, anInt28, anInt29,
										var31.regionX * 865285947 - anInt15, var31.counterHeight * -913962459 - anInt7,
										var31.regionY * -1659081089 - anInt34, var31.anInt831 * 564011803);
							}

							if (var31.anEntity832 != null) {
								var31.anEntity832.method653(0, anInt26, anInt27, anInt28, anInt29,
										var31.regionX * 865285947 - anInt15, var31.counterHeight * -913962459 - anInt7,
										var31.regionY * -1659081089 - anInt34, var31.anInt831 * 564011803);
							}

							if (var31.bottom != null) {
								var31.bottom.method653(0, anInt26, anInt27, anInt28, anInt29,
										var31.regionX * 865285947 - anInt15, var31.counterHeight * -913962459 - anInt7,
										var31.regionY * -1659081089 - anInt34, var31.anInt831 * 564011803);
							}
						}
					}

					var14 = var3.anInt1401 * -1372682459;
					if (var14 != 0) {
						if (var4 < screenCenterY && (var14 & 4) != 0) {
							var33 = var8[var4 + 1][var5];
							if (var33 != null && var33.aBool1412) {
								aDeque12.method475(var33);
							}
						}

						if (var5 < anInt24 && (var14 & 2) != 0) {
							var33 = var8[var4][var5 + 1];
							if (var33 != null && var33.aBool1412) {
								aDeque12.method475(var33);
							}
						}

						if (var4 > screenCenterY && (var14 & 1) != 0) {
							var33 = var8[var4 - 1][var5];
							if (var33 != null && var33.aBool1412) {
								aDeque12.method475(var33);
							}
						}

						if (var5 > anInt24 && (var14 & 8) != 0) {
							var33 = var8[var4][var5 - 1];
							if (var33 != null && var33.aBool1412) {
								aDeque12.method475(var33);
							}
						}
					}
				}

				if (var3.anInt1409 * -2057816509 != 0) {
					var22 = true;

					for (var21 = 0; var21 < var3.anInt1407 * 1758491173; ++var21) {
						if (var3.entityMarkers[var21].anInt268 * -1820256133 != anInt19
								&& (var3.anIntArray1408[var21] & var3.anInt1409 * -2057816509) == var3.anInt1403
										* 188482175) {
							var22 = false;
							break;
						}
					}

					if (var22) {
						var10 = var3.boundaryStub;
						if (!this.method45(var7, var4, var5, var10.orientationA * 1194493223)) {
							var10.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
									var10.strictX * 702405159 - anInt15, var10.floorLevel * -506049845 - anInt7,
									var10.strictY * -1481754083 - anInt34, var10.anInt277 * 785572969);
						}

						var3.anInt1409 = 0;
					}
				}

				int var24;
				int var26;
				if (var3.aBool1402) {
					try {
						int var25 = var3.anInt1407 * 1758491173;
						var3.aBool1402 = false;
						var21 = 0;

						label542: for (var11 = 0; var11 < var25; ++var11) {
							var12 = var3.entityMarkers[var11];
							if (var12.anInt268 * -1820256133 != anInt19) {
								for (var26 = var12.regionX * 1249542337; var26 <= var12.sizeX * 525183875; ++var26) {
									for (var14 = var12.regionY * -1236081819; var14 <= var12.sizeY
											* 1111111519; ++var14) {
										var33 = var8[var26][var14];
										if (var33.aBool1411) {
											var3.aBool1402 = true;
											continue label542;
										}

										if (var33.anInt1409 * -2057816509 != 0) {
											var16 = 0;
											if (var26 > var12.regionX * 1249542337) {
												++var16;
											}

											if (var26 < var12.sizeX * 525183875) {
												var16 += 4;
											}

											if (var14 > var12.regionY * -1236081819) {
												var16 += 8;
											}

											if (var14 < var12.sizeY * 1111111519) {
												var16 += 2;
											}

											if ((var16 & var33.anInt1409 * -2057816509) == var3.anInt1413
													* 1149260233) {
												var3.aBool1402 = true;
												continue label542;
											}
										}
									}
								}

								anEntityMarkerArray20[var21++] = var12;
								var26 = screenCenterY - var12.regionX * 1249542337;
								var14 = var12.sizeX * 525183875 - screenCenterY;
								if (var14 > var26) {
									var26 = var14;
								}

								var15 = anInt24 - var12.regionY * -1236081819;
								var16 = var12.sizeY * 1111111519 - anInt24;
								if (var16 > var15) {
									var12.anInt267 = (var26 + var16) * -940806893;
								} else {
									var12.anInt267 = (var26 + var15) * -940806893;
								}
							}
						}

						while (var21 > 0) {
							var11 = -50;
							var24 = -1;

							for (var26 = 0; var26 < var21; ++var26) {
								EntityMarker var34 = anEntityMarkerArray20[var26];
								if (var34.anInt268 * -1820256133 != anInt19) {
									if (var34.anInt267 * 1507353883 > var11) {
										var11 = var34.anInt267 * 1507353883;
										var24 = var26;
									} else if (var34.anInt267 * 1507353883 == var11) {
										var15 = var34.strictX * -501472545 - anInt15;
										var16 = var34.strictY * 20674077 - anInt34;
										var17 = anEntityMarkerArray20[var24].strictX * -501472545 - anInt15;
										var18 = anEntityMarkerArray20[var24].strictY * 20674077 - anInt34;
										if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
											var24 = var26;
										}
									}
								}
							}

							if (var24 == -1) {
								break;
							}

							EntityMarker var35 = anEntityMarkerArray20[var24];
							var35.anInt268 = anInt19 * -1263860045;
							if (!this.method47(var7, var35.regionX * 1249542337, var35.sizeX * 525183875,
									var35.regionY * -1236081819, var35.sizeY * 1111111519,
									var35.entity.modelHeight * 1812947537)) {
								var35.entity.method653(var35.orientation * -1981858225, anInt26, anInt27, anInt28,
										anInt29, var35.strictX * -501472545 - anInt15,
										var35.height * -712455821 - anInt7, var35.strictY * 20674077 - anInt34,
										var35.anInt269 * 714123667);
							}

							for (var14 = var35.regionX * 1249542337; var14 <= var35.sizeX * 525183875; ++var14) {
								for (var15 = var35.regionY * -1236081819; var15 <= var35.sizeY * 1111111519; ++var15) {
									LandscapeTile var36 = var8[var14][var15];
									if (var36.anInt1409 * -2057816509 != 0) {
										aDeque12.method475(var36);
									} else if ((var14 != var4 || var15 != var5) && var36.aBool1412) {
										aDeque12.method475(var36);
									}
								}
							}
						}

						if (var3.aBool1402) {
							continue;
						}
					} catch (Exception var20) {
						var3.aBool1402 = false;
					}
				}

				if (var3.aBool1412 && var3.anInt1409 * -2057816509 == 0) {
					if (var4 <= screenCenterY && var4 > anInt45) {
						var9 = var8[var4 - 1][var5];
						if (var9 != null && var9.aBool1412) {
							continue;
						}
					}

					if (var4 >= screenCenterY && var4 < anInt21 - 1) {
						var9 = var8[var4 + 1][var5];
						if (var9 != null && var9.aBool1412) {
							continue;
						}
					}

					if (var5 <= anInt24 && var5 > anInt18) {
						var9 = var8[var4][var5 - 1];
						if (var9 != null && var9.aBool1412) {
							continue;
						}
					}

					if (var5 >= anInt24 && var5 < anInt23 - 1) {
						var9 = var8[var4][var5 + 1];
						if (var9 != null && var9.aBool1412) {
							continue;
						}
					}

					var3.aBool1412 = false;
					--anInt17;
					ItemPile var29 = var3.itemPile;
					if (var29 != null && var29.height * 32060723 != 0) {
						if (var29.middle != null) {
							var29.middle.method653(0, anInt26, anInt27, anInt28, anInt29,
									var29.regionX * 865285947 - anInt15,
									var29.counterHeight * -913962459 - anInt7 - var29.height * 32060723,
									var29.regionY * -1659081089 - anInt34, var29.anInt831 * 564011803);
						}

						if (var29.anEntity832 != null) {
							var29.anEntity832.method653(0, anInt26, anInt27, anInt28, anInt29,
									var29.regionX * 865285947 - anInt15,
									var29.counterHeight * -913962459 - anInt7 - var29.height * 32060723,
									var29.regionY * -1659081089 - anInt34, var29.anInt831 * 564011803);
						}

						if (var29.bottom != null) {
							var29.bottom.method653(0, anInt26, anInt27, anInt28, anInt29,
									var29.regionX * 865285947 - anInt15,
									var29.counterHeight * -913962459 - anInt7 - var29.height * 32060723,
									var29.regionY * -1659081089 - anInt34, var29.anInt831 * 564011803);
						}
					}

					if (var3.anInt1414 * -1045447799 != 0) {
						BoundaryDecorationStub var30 = var3.boundaryDecorationStub;
						if (var30 != null && !this.method46(var7, var4, var5, var30.entityA.modelHeight * 1812947537)) {
							if ((var30.orientationA * 1046166005 & var3.anInt1414 * -1045447799) != 0) {
								var30.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
										var30.regionX * -1321412609 - anInt15 + var30.insetX * 882495229,
										var30.height * 2084034085 - anInt7,
										var30.regionY * -2070854849 - anInt34 + var30.insetY * -1641872977,
										var30.anInt218 * 1286385391);
							} else if (var30.orientationA * 1046166005 == 256) {
								var11 = var30.regionX * -1321412609 - anInt15;
								var24 = var30.height * 2084034085 - anInt7;
								var26 = var30.regionY * -2070854849 - anInt34;
								var14 = var30.orientationB * 313471493;
								if (var14 != 1 && var14 != 2) {
									var15 = var11;
								} else {
									var15 = -var11;
								}

								if (var14 != 2 && var14 != 3) {
									var16 = var26;
								} else {
									var16 = -var26;
								}

								if (var16 >= var15) {
									var30.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
											var11 + var30.insetX * 882495229, var24, var26 + var30.insetY * -1641872977,
											var30.anInt218 * 1286385391);
								} else if (var30.entityB != null) {
									var30.entityB.method653(0, anInt26, anInt27, anInt28, anInt29, var11, var24, var26,
											var30.anInt218 * 1286385391);
								}
							}
						}

						BoundaryStub var28 = var3.boundaryStub;
						if (var28 != null) {
							if ((var28.orientationB * -287128155 & var3.anInt1414 * -1045447799) != 0
									&& !this.method45(var7, var4, var5, var28.orientationB * -287128155)) {
								var28.entityB.method653(0, anInt26, anInt27, anInt28, anInt29,
										var28.strictX * 702405159 - anInt15, var28.floorLevel * -506049845 - anInt7,
										var28.strictY * -1481754083 - anInt34, var28.anInt277 * 785572969);
							}

							if ((var28.orientationA * 1194493223 & var3.anInt1414 * -1045447799) != 0
									&& !this.method45(var7, var4, var5, var28.orientationA * 1194493223)) {
								var28.entityA.method653(0, anInt26, anInt27, anInt28, anInt29,
										var28.strictX * 702405159 - anInt15, var28.floorLevel * -506049845 - anInt7,
										var28.strictY * -1481754083 - anInt34, var28.anInt277 * 785572969);
							}
						}
					}

					LandscapeTile var32;
					if (var6 < this.anInt25 - 1) {
						var32 = this.tiles[var6 + 1][var4][var5];
						if (var32 != null && var32.aBool1412) {
							aDeque12.method475(var32);
						}
					}

					if (var4 < screenCenterY) {
						var32 = var8[var4 + 1][var5];
						if (var32 != null && var32.aBool1412) {
							aDeque12.method475(var32);
						}
					}

					if (var5 < anInt24) {
						var32 = var8[var4][var5 + 1];
						if (var32 != null && var32.aBool1412) {
							aDeque12.method475(var32);
						}
					}

					if (var4 > screenCenterY) {
						var32 = var8[var4 - 1][var5];
						if (var32 != null && var32.aBool1412) {
							aDeque12.method475(var32);
						}
					}

					if (var5 > anInt24) {
						var32 = var8[var4][var5 - 1];
						if (var32 != null && var32.aBool1412) {
							aDeque12.method475(var32);
						}
					}
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
		for (var9 = 0; var9 < var8; ++var9) {
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

			Class38.anIntArray420[var9] = DualNode_Sub13_Sub1.anInt1785 + var10 * DualNode_Sub13_Sub1.anInt1784 / var18;
			Class38.anIntArray421[var9] = DualNode_Sub13_Sub1.anInt1786 + var11 * DualNode_Sub13_Sub1.anInt1784 / var18;
		}

		DualNode_Sub13_Sub1.anInt1781 = 0;
		var8 = var1.anIntArray411.length;

		for (var9 = 0; var9 < var8; ++var9) {
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
				DualNode_Sub13_Sub1.aBool1782 = false;
				if (var11 < 0 || var12 < 0 || var16 < 0 || var11 > DualNode_Sub13_Sub1.anInt1791
						|| var12 > DualNode_Sub13_Sub1.anInt1791 || var16 > DualNode_Sub13_Sub1.anInt1791) {
					DualNode_Sub13_Sub1.aBool1782 = true;
				}

				if (aBool30 && this.method42(anInt36, anInt32, var15, var14, var13, var11, var12, var16)) {
					anInt53 = var6;
					anInt58 = var7;
				}

				if (var1.anIntArray414 != null && var1.anIntArray414[var9] != -1) {
					if (!aBool22) {
						if (var1.aBool415) {
							DualNode_Sub13_Sub1.method926(var15, var14, var13, var11, var12, var16,
									var1.anIntArray417[var9], var1.anIntArray409[var9], var1.anIntArray410[var9],
									Class38.anIntArray412[0], Class38.anIntArray412[1], Class38.anIntArray412[3],
									Class38.anIntArray405[0], Class38.anIntArray405[1], Class38.anIntArray405[3],
									Class38.anIntArray408[0], Class38.anIntArray408[1], Class38.anIntArray408[3],
									var1.anIntArray414[var9]);
						} else {
							DualNode_Sub13_Sub1.method926(var15, var14, var13, var11, var12, var16,
									var1.anIntArray417[var9], var1.anIntArray409[var9], var1.anIntArray410[var9],
									Class38.anIntArray412[var10], Class38.anIntArray412[var17],
									Class38.anIntArray412[var18], Class38.anIntArray405[var10],
									Class38.anIntArray405[var17], Class38.anIntArray405[var18],
									Class38.anIntArray408[var10], Class38.anIntArray408[var17],
									Class38.anIntArray408[var18], var1.anIntArray414[var9]);
						}
					} else {
						int var19 = DualNode_Sub13_Sub1.anInterface3_1796.method7(var1.anIntArray414[var9],
								-1275367594);
						DualNode_Sub13_Sub1.method922(var15, var14, var13, var11, var12, var16,
								method22(var19, var1.anIntArray417[var9]), method22(var19, var1.anIntArray409[var9]),
								method22(var19, var1.anIntArray410[var9]));
					}
				} else if (var1.anIntArray417[var9] != 12345678) {
					DualNode_Sub13_Sub1.method922(var15, var14, var13, var11, var12, var16, var1.anIntArray417[var9],
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

		for (int var9 = 0; var9 < var1; ++var9) {
			Class34 var5 = var11[var9];
			boolean var3;
			int var6;
			int var7;
			int var8;
			int var10;
			if (var5.anInt370 * -881222499 == 1) {
				var6 = var5.anInt384 * -209310663 - screenCenterY + 25;
				if (var6 >= 0 && var6 <= 50) {
					var7 = var5.anInt368 * 1501564945 - anInt24 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt376 * -1639430109 - anInt24 + 25;
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
						var10 = anInt15 - var5.anInt371 * 1375633411;
						if (var10 > 32) {
							var5.anInt374 = -1024523365;
						} else {
							if (var10 >= -32) {
								continue;
							}

							var5.anInt374 = -2049046730;
							var10 = -var10;
						}

						var5.anInt369 = (var5.anInt373 * -732285699 - anInt34 << 8) / var10 * -1271422745;
						var5.anInt380 = (var5.anInt366 * -1407244941 - anInt34 << 8) / var10 * 1219929915;
						var5.anInt383 = (var5.anInt378 * -2134622617 - anInt7 << 8) / var10 * 303221777;
						var5.anInt382 = (var5.anInt375 * -204626027 - anInt7 << 8) / var10 * -1356797911;
						aClass34Array10[anInt42++] = var5;
					}
				}
			} else if (var5.anInt370 * -881222499 == 2) {
				var6 = var5.anInt368 * 1501564945 - anInt24 + 25;
				if (var6 >= 0 && var6 <= 50) {
					var7 = var5.anInt384 * -209310663 - screenCenterY + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt367 * -2135912995 - screenCenterY + 25;
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
						var10 = anInt34 - var5.anInt373 * -732285699;
						if (var10 > 32) {
							var5.anInt374 = 1221397201;
						} else {
							if (var10 >= -32) {
								continue;
							}

							var5.anInt374 = 196873836;
							var10 = -var10;
						}

						var5.anInt377 = (var5.anInt371 * 1375633411 - anInt15 << 8) / var10 * -1890844241;
						var5.anInt379 = (var5.anInt372 * 2081657663 - anInt15 << 8) / var10 * -1087396065;
						var5.anInt383 = (var5.anInt378 * -2134622617 - anInt7 << 8) / var10 * 303221777;
						var5.anInt382 = (var5.anInt375 * -204626027 - anInt7 << 8) / var10 * -1356797911;
						aClass34Array10[anInt42++] = var5;
					}
				}
			} else if (var5.anInt370 * -881222499 == 4) {
				var6 = var5.anInt378 * -2134622617 - anInt7;
				if (var6 > 128) {
					var7 = var5.anInt368 * 1501564945 - anInt24 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt376 * -1639430109 - anInt24 + 25;
					if (var8 > 50) {
						var8 = 50;
					}

					if (var7 <= var8) {
						int var13 = var5.anInt384 * -209310663 - screenCenterY + 25;
						if (var13 < 0) {
							var13 = 0;
						}

						var10 = var5.anInt367 * -2135912995 - screenCenterY + 25;
						if (var10 > 50) {
							var10 = 50;
						}

						boolean var12 = false;

						label150: for (int var2 = var13; var2 <= var10; ++var2) {
							for (int var4 = var7; var4 <= var8; ++var4) {
								if (aBoolArrayArray13[var2][var4]) {
									var12 = true;
									break label150;
								}
							}
						}

						if (var12) {
							var5.anInt374 = -827649529;
							var5.anInt377 = (var5.anInt371 * 1375633411 - anInt15 << 8) / var6 * -1890844241;
							var5.anInt379 = (var5.anInt372 * 2081657663 - anInt15 << 8) / var6 * -1087396065;
							var5.anInt369 = (var5.anInt373 * -732285699 - anInt34 << 8) / var6 * -1271422745;
							var5.anInt380 = (var5.anInt366 * -1407244941 - anInt34 << 8) / var6 * 1219929915;
							aClass34Array10[anInt42++] = var5;
						}
					}
				}
			}
		}

	}

	boolean method44(int var1, int var2, int var3) {
		int var4 = this.anIntArrayArrayArray14[var1][var2][var3];
		if (var4 == -anInt19) {
			return false;
		} else if (var4 == anInt19) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method48(var5 + 1, this.anIntArrayArrayArray11[var1][var2][var3], var6 + 1)
					&& this.method48(var5 + 128 - 1, this.anIntArrayArrayArray11[var1][var2 + 1][var3], var6 + 1)
					&& this.method48(var5 + 128 - 1, this.anIntArrayArrayArray11[var1][var2 + 1][var3 + 1],
							var6 + 128 - 1)
					&& this.method48(var5 + 1, this.anIntArrayArrayArray11[var1][var2][var3 + 1], var6 + 128 - 1)) {
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
			int var6 = this.anIntArrayArrayArray11[var1][var2][var3] - 1;
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

			return !this.method48(var9 + 64,
					var8, var5
							+ 64) ? false
									: (var4 == 16 ? this.method48(var9, var10, var5 + 128)
											: (var4 == 32 ? this.method48(var9 + 128, var10, var5 + 128)
													: (var4 == 64 ? this.method48(var9 + 128, var10, var5)
															: (var4 == 128 ? this.method48(var9, var10, var5)
																	: true))));
		}
	}

	boolean method46(int var1, int var2, int var3, int var4) {
		if (!this.method44(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method48(var5 + 1, this.anIntArrayArrayArray11[var1][var2][var3] - var4, var6 + 1)
					&& this.method48(var5 + 128 - 1, this.anIntArrayArrayArray11[var1][var2 + 1][var3] - var4, var6 + 1)
					&& this.method48(var5 + 128 - 1, this.anIntArrayArrayArray11[var1][var2 + 1][var3 + 1] - var4,
							var6 + 128 - 1)
					&& this.method48(var5 + 1, this.anIntArrayArrayArray11[var1][var2][var3 + 1] - var4,
							var6 + 128 - 1);
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
				return this.method48(var8 + 1, this.anIntArrayArrayArray11[var1][var2][var4] - var6, var7 + 1)
						&& this.method48(var8 + 128 - 1, this.anIntArrayArrayArray11[var1][var2 + 1][var4] - var6,
								var7 + 1)
						&& this.method48(var8 + 128 - 1, this.anIntArrayArrayArray11[var1][var2 + 1][var4 + 1] - var6,
								var7 + 128 - 1)
						&& this.method48(var8 + 1, this.anIntArrayArrayArray11[var1][var2][var4 + 1] - var6,
								var7 + 128 - 1);
			}
		} else {
			for (var8 = var2; var8 <= var3; ++var8) {
				for (var7 = var4; var7 <= var5; ++var7) {
					if (this.anIntArrayArrayArray14[var1][var8][var7] == -anInt19) {
						return false;
					}
				}
			}

			var8 = (var2 << 7) + 1;
			var7 = (var4 << 7) + 2;
			int var10 = this.anIntArrayArrayArray11[var1][var2][var4] - var6;
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
		for (int var4 = 0; var4 < anInt42; ++var4) {
			Class34 var6 = aClass34Array10[var4];
			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var6.anInt374 * -724260205 == 1) {
				var5 = var6.anInt371 * 1375633411 - var1;
				if (var5 > 0) {
					var10 = var6.anInt373 * -732285699 + (var6.anInt369 * -2110295337 * var5 >> 8);
					var8 = var6.anInt366 * -1407244941 + (var6.anInt380 * 2033687027 * var5 >> 8);
					var9 = var6.anInt378 * -2134622617 + (var6.anInt383 * -1755077391 * var5 >> 8);
					var7 = var6.anInt375 * -204626027 + (var6.anInt382 * 163132441 * var5 >> 8);
					if (var3 >= var10 && var3 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 * -724260205 == 2) {
				var5 = var1 - var6.anInt371 * 1375633411;
				if (var5 > 0) {
					var10 = var6.anInt373 * -732285699 + (var6.anInt369 * -2110295337 * var5 >> 8);
					var8 = var6.anInt366 * -1407244941 + (var6.anInt380 * 2033687027 * var5 >> 8);
					var9 = var6.anInt378 * -2134622617 + (var6.anInt383 * -1755077391 * var5 >> 8);
					var7 = var6.anInt375 * -204626027 + (var6.anInt382 * 163132441 * var5 >> 8);
					if (var3 >= var10 && var3 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 * -724260205 == 3) {
				var5 = var6.anInt373 * -732285699 - var3;
				if (var5 > 0) {
					var10 = var6.anInt371 * 1375633411 + (var6.anInt377 * -876481201 * var5 >> 8);
					var8 = var6.anInt372 * 2081657663 + (var6.anInt379 * -793701153 * var5 >> 8);
					var9 = var6.anInt378 * -2134622617 + (var6.anInt383 * -1755077391 * var5 >> 8);
					var7 = var6.anInt375 * -204626027 + (var6.anInt382 * 163132441 * var5 >> 8);
					if (var1 >= var10 && var1 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 * -724260205 == 4) {
				var5 = var3 - var6.anInt373 * -732285699;
				if (var5 > 0) {
					var10 = var6.anInt371 * 1375633411 + (var6.anInt377 * -876481201 * var5 >> 8);
					var8 = var6.anInt372 * 2081657663 + (var6.anInt379 * -793701153 * var5 >> 8);
					var9 = var6.anInt378 * -2134622617 + (var6.anInt383 * -1755077391 * var5 >> 8);
					var7 = var6.anInt375 * -204626027 + (var6.anInt382 * 163132441 * var5 >> 8);
					if (var1 >= var10 && var1 <= var8 && var2 >= var9 && var2 <= var7) {
						return true;
					}
				}
			} else if (var6.anInt374 * -724260205 == 5) {
				var5 = var2 - var6.anInt378 * -2134622617;
				if (var5 > 0) {
					var10 = var6.anInt371 * 1375633411 + (var6.anInt377 * -876481201 * var5 >> 8);
					var8 = var6.anInt372 * 2081657663 + (var6.anInt379 * -793701153 * var5 >> 8);
					var9 = var6.anInt373 * -732285699 + (var6.anInt369 * -2110295337 * var5 >> 8);
					var7 = var6.anInt366 * -1407244941 + (var6.anInt380 * 2033687027 * var5 >> 8);
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
		var8.anInt384 = var2 / 128 * 1668284937;
		var8.anInt367 = var3 / 128 * 694301301;
		var8.anInt368 = var4 / 128 * -868032271;
		var8.anInt376 = var5 / 128 * -341399669;
		var8.anInt370 = var1 * 1362217397;
		var8.anInt371 = var2 * 2113940139;
		var8.anInt372 = var3 * -1117397825;
		var8.anInt373 = var4 * -1587640235;
		var8.anInt366 = var5 * -1518303301;
		var8.anInt378 = var6 * -882508457;
		var8.anInt375 = var7 * 1403022269;
		aClass34ArrayArray39[var0][anIntArray38[var0]++] = var8;
	}

	public void method50() {
		for (int var1 = 0; var1 < this.anInt56; ++var1) {
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
				anInt26 = DualNode_Sub13_Sub1.anIntArray1788[var8];
				anInt27 = DualNode_Sub13_Sub1.anIntArray1792[var8];
				anInt28 = DualNode_Sub13_Sub1.anIntArray1788[var9];
				anInt29 = DualNode_Sub13_Sub1.anIntArray1792[var9];
				var10 = (var8 - 128) / 32;
				var11 = var9 / 64;

				for (int var13 = -26; var13 <= 26; ++var13) {
					var7 = -26;

					while (var7 <= 26) {
						var12 = var13 * 128;
						int var14 = var7 * 128;
						boolean var15 = false;
						int var5 = -var1;

						while (true) {
							if (var5 <= var2) {
								if (!method38(var12, var0[var10] + var5, var14)) {
									var5 += 128;
									continue;
								}

								var15 = true;
							}

							var6[var10][var11][var13 + 25 + 1][var7 + 25 + 1] = var15;
							++var7;
							break;
						}
					}
				}
			}
		}

		for (var8 = 0; var8 < 8; ++var8) {
			for (var9 = 0; var9 < 32; ++var9) {
				for (var10 = -25; var10 < 25; ++var10) {
					var11 = -25;

					while (var11 < 25) {
						boolean var16 = false;
						var7 = -1;

						label91: while (true) {
							if (var7 <= 1) {
								var12 = -1;

								while (true) {
									if (var12 > 1) {
										++var7;
										continue label91;
									}

									if (var6[var8][var9][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
										var16 = true;
										break;
									}

									if (var6[var8][(var9 + 1) % 31][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
										var16 = true;
										break;
									}

									if (var6[var8 + 1][var9][var10 + var7 + 25 + 1][var11 + var12 + 25 + 1]) {
										var16 = true;
										break;
									}

									if (var6[var8 + 1][(var9 + 1) % 31][var10 + var7 + 25 + 1][var11 + var12 + 25
											+ 1]) {
										var16 = true;
										break;
									}

									++var12;
								}
							}

							aBoolArrayArrayArrayArray52[var8][var9][var10 + 25][var11 + 25] = var16;
							++var11;
							break;
						}
					}
				}
			}
		}

	}

	public void method52(int var1, int var2, int var3, int var4) {
		LandscapeTile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].anInt1410 = var4 * -1802899737;
		}
	}

	public int method53(int var1, int var2, int var3) {
		LandscapeTile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryStub != null ? var4.boundaryStub.anInt277 * 785572969 : 0;
	}

	boolean addEntityMarker(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9,
			int var10, boolean var11, int var12, int var13) {
		int var16;
		for (int var14 = var2; var14 < var2 + var4; ++var14) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var14 < 0 || var16 < 0 || var14 >= this.anInt9 || var16 >= this.anInt16) {
					return false;
				}

				LandscapeTile var15 = this.tiles[var1][var14][var16];
				if (var15 != null && var15.anInt1407 * 1758491173 >= 5) {
					return false;
				}
			}
		}

		EntityMarker var20 = new EntityMarker();
		var20.anInt269 = var12 * 1173740699;
		var20.config = var13 * -1289211751;
		var20.floorLevel = var1 * -479867789;
		var20.strictX = var6 * -1227876065;
		var20.strictY = var7 * -1805845451;
		var20.height = var8 * -565869637;
		var20.entity = var9;
		var20.orientation = var10 * 644028591;
		var20.regionX = var2 * -2049306815;
		var20.regionY = var3 * -870803859;
		var20.sizeX = (var2 + var4 - 1) * 1313815339;
		var20.sizeY = (var3 + var5 - 1) * 198829215;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var21 = var3; var21 < var3 + var5; ++var21) {
				int var17 = 0;
				if (var16 > var2) {
					++var17;
				}

				if (var16 < var2 + var4 - 1) {
					var17 += 4;
				}

				if (var21 > var3) {
					var17 += 8;
				}

				if (var21 < var3 + var5 - 1) {
					var17 += 2;
				}

				for (int var18 = var1; var18 >= 0; --var18) {
					if (this.tiles[var18][var16][var21] == null) {
						this.tiles[var18][var16][var21] = new LandscapeTile(var18, var16, var21);
					}
				}

				LandscapeTile var22 = this.tiles[var1][var16][var21];
				var22.entityMarkers[var22.anInt1407 * 1758491173] = var20;
				var22.anIntArray1408[var22.anInt1407 * 1758491173] = var17;
				var22.anInt1401 = (var22.anInt1401 * -1372682459 | var17) * -893764435;
				var22.anInt1407 += -1721476691;
			}
		}

		if (var11) {
			this.tempEntityMarkers[this.anInt56++] = var20;
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
		int var15 = this.anIntArrayArrayArray11[var2][var7][var8] - anInt7;
		int var11 = this.anIntArrayArrayArray11[var2][var7 + 1][var8] - anInt7;
		int var16 = this.anIntArrayArrayArray11[var2][var7 + 1][var8 + 1] - anInt7;
		int var28 = this.anIntArrayArrayArray11[var2][var7][var8 + 1] - anInt7;
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
						int var24 = DualNode_Sub13_Sub1.anInt1785 + var10 * DualNode_Sub13_Sub1.anInt1784 / var20;
						int var21 = DualNode_Sub13_Sub1.anInt1786 + var15 * DualNode_Sub13_Sub1.anInt1784 / var20;
						int var25 = DualNode_Sub13_Sub1.anInt1785 + var13 * DualNode_Sub13_Sub1.anInt1784 / var27;
						int var22 = DualNode_Sub13_Sub1.anInt1786 + var11 * DualNode_Sub13_Sub1.anInt1784 / var27;
						int var29 = DualNode_Sub13_Sub1.anInt1785 + var12 * DualNode_Sub13_Sub1.anInt1784 / var19;
						int var30 = DualNode_Sub13_Sub1.anInt1786 + var16 * DualNode_Sub13_Sub1.anInt1784 / var19;
						int var26 = DualNode_Sub13_Sub1.anInt1785 + var9 * DualNode_Sub13_Sub1.anInt1784 / var17;
						int var23 = DualNode_Sub13_Sub1.anInt1786 + var18 * DualNode_Sub13_Sub1.anInt1784 / var17;
						DualNode_Sub13_Sub1.anInt1781 = 0;
						int var14;
						if ((var29 - var26) * (var22 - var23) - (var30 - var23) * (var25 - var26) > 0) {
							DualNode_Sub13_Sub1.aBool1782 = false;
							if (var29 < 0 || var26 < 0 || var25 < 0 || var29 > DualNode_Sub13_Sub1.anInt1791
									|| var26 > DualNode_Sub13_Sub1.anInt1791 || var25 > DualNode_Sub13_Sub1.anInt1791) {
								DualNode_Sub13_Sub1.aBool1782 = true;
							}

							if (aBool30 && this.method42(anInt36, anInt32, var30, var23, var22, var29, var26, var25)) {
								anInt53 = var7;
								anInt58 = var8;
							}

							if (var1.anInt346 * 1798787571 == -1) {
								if (var1.anInt344 * 457420757 != 12345678) {
									DualNode_Sub13_Sub1.method922(var30, var23, var22, var29, var26, var25,
											var1.anInt344 * 457420757, var1.anInt345 * 2026532237,
											var1.anInt353 * 2017637797);
								}
							} else if (!aBool22) {
								if (var1.aBool343) {
									DualNode_Sub13_Sub1.method926(var30, var23, var22, var29, var26, var25,
											var1.anInt344 * 457420757, var1.anInt345 * 2026532237,
											var1.anInt353 * 2017637797, var10, var13, var9, var15, var11, var18, var20,
											var27, var17, var1.anInt346 * 1798787571);
								} else {
									DualNode_Sub13_Sub1.method926(var30, var23, var22, var29, var26, var25,
											var1.anInt344 * 457420757, var1.anInt345 * 2026532237,
											var1.anInt353 * 2017637797, var12, var9, var13, var16, var18, var11, var19,
											var17, var27, var1.anInt346 * 1798787571);
								}
							} else {
								var14 = DualNode_Sub13_Sub1.anInterface3_1796.method7(var1.anInt346 * 1798787571,
										2091687573);
								DualNode_Sub13_Sub1.method922(var30, var23, var22, var29, var26, var25,
										method22(var14, var1.anInt344 * 457420757),
										method22(var14, var1.anInt345 * 2026532237),
										method22(var14, var1.anInt353 * 2017637797));
							}
						}

						if ((var24 - var25) * (var23 - var22) - (var21 - var22) * (var26 - var25) > 0) {
							DualNode_Sub13_Sub1.aBool1782 = false;
							if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > DualNode_Sub13_Sub1.anInt1791
									|| var25 > DualNode_Sub13_Sub1.anInt1791 || var26 > DualNode_Sub13_Sub1.anInt1791) {
								DualNode_Sub13_Sub1.aBool1782 = true;
							}

							if (aBool30 && this.method42(anInt36, anInt32, var21, var22, var23, var24, var25, var26)) {
								anInt53 = var7;
								anInt58 = var8;
							}

							if (var1.anInt346 * 1798787571 == -1) {
								if (var1.anInt347 * -527486671 != 12345678) {
									DualNode_Sub13_Sub1.method922(var21, var22, var23, var24, var25, var26,
											var1.anInt347 * -527486671, var1.anInt353 * 2017637797,
											var1.anInt345 * 2026532237);
								}
							} else if (!aBool22) {
								DualNode_Sub13_Sub1.method926(var21, var22, var23, var24, var25, var26,
										var1.anInt347 * -527486671, var1.anInt353 * 2017637797,
										var1.anInt345 * 2026532237, var10, var13, var9, var15, var11, var18, var20,
										var27, var17, var1.anInt346 * 1798787571);
							} else {
								var14 = DualNode_Sub13_Sub1.anInterface3_1796.method7(var1.anInt346 * 1798787571,
										1488423271);
								DualNode_Sub13_Sub1.method922(var21, var22, var23, var24, var25, var26,
										method22(var14, var1.anInt347 * -527486671),
										method22(var14, var1.anInt353 * 2017637797),
										method22(var14, var1.anInt345 * 2026532237));
							}
						}

					}
				}
			}
		}
	}

	public void method55(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.anInt25; ++var4) {
			for (int var6 = 0; var6 < this.anInt9; ++var6) {
				for (int var7 = 0; var7 < this.anInt16; ++var7) {
					LandscapeTile var9 = this.tiles[var4][var6][var7];
					if (var9 != null) {
						BoundaryStub var5 = var9.boundaryStub;
						Entity_Sub1 var8;
						if (var5 != null && var5.entityA instanceof Entity_Sub1) {
							Entity_Sub1 var10 = (Entity_Sub1) var5.entityA;
							this.method57(var10, var4, var6, var7, 1, 1);
							if (var5.entityB instanceof Entity_Sub1) {
								var8 = (Entity_Sub1) var5.entityB;
								this.method57(var8, var4, var6, var7, 1, 1);
								Entity_Sub1.method893(var10, var8, 0, 0, 0, false);
								var5.entityB = var8.method902(var8.aShort1764, var8.aShort1766, var1, var2, var3);
							}

							var5.entityA = var10.method902(var10.aShort1764, var10.aShort1766, var1, var2, var3);
						}

						for (int var13 = 0; var13 < var9.anInt1407 * 1758491173; ++var13) {
							EntityMarker var12 = var9.entityMarkers[var13];
							if (var12 != null && var12.entity instanceof Entity_Sub1) {
								Entity_Sub1 var11 = (Entity_Sub1) var12.entity;
								this.method57(var11, var4, var6, var7,
										var12.sizeX * 525183875 - var12.regionX * 1249542337 + 1,
										var12.sizeY * 1111111519 - var12.regionY * -1236081819 + 1);
								var12.entity = var11.method902(var11.aShort1764, var11.aShort1766, var1, var2, var3);
							}
						}

						TileDecorationStub var14 = var9.tileDecorationStub;
						if (var14 != null && var14.entity instanceof Entity_Sub1) {
							var8 = (Entity_Sub1) var14.entity;
							this.method37(var8, var4, var6, var7);
							var14.entity = var8.method902(var8.aShort1764, var8.aShort1766, var1, var2, var3);
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

	void method57(Entity_Sub1 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var15 = var3;
		int var12 = var3 + var5;
		int var13 = var4 - 1;
		int var17 = var4 + var6;

		for (int var8 = var2; var8 <= var2 + 1; ++var8) {
			if (var8 != this.anInt25) {
				for (int var9 = var15; var9 <= var12; ++var9) {
					if (var9 >= 0 && var9 < this.anInt9) {
						for (int var10 = var13; var10 <= var17; ++var10) {
							if (var10 >= 0 && var10 < this.anInt16
									&& (!var7 || var9 >= var12 || var10 >= var17 || var10 < var4 && var9 != var3)) {
								LandscapeTile var18 = this.tiles[var8][var9][var10];
								if (var18 != null) {
									int var11 = (this.anIntArrayArrayArray11[var8][var9][var10]
											+ this.anIntArrayArrayArray11[var8][var9 + 1][var10]
											+ this.anIntArrayArrayArray11[var8][var9][var10 + 1]
											+ this.anIntArrayArrayArray11[var8][var9 + 1][var10 + 1]) / 4
											- (this.anIntArrayArrayArray11[var2][var3][var4]
													+ this.anIntArrayArrayArray11[var2][var3 + 1][var4]
													+ this.anIntArrayArrayArray11[var2][var3][var4 + 1]
													+ this.anIntArrayArrayArray11[var2][var3 + 1][var4 + 1]) / 4;
									BoundaryStub var16 = var18.boundaryStub;
									if (var16 != null) {
										Entity_Sub1 var14;
										if (var16.entityA instanceof Entity_Sub1) {
											var14 = (Entity_Sub1) var16.entityA;
											Entity_Sub1.method893(var1, var14, (var9 - var3) * 128 + (1 - var5) * 64,
													var11, (var10 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var16.entityB instanceof Entity_Sub1) {
											var14 = (Entity_Sub1) var16.entityB;
											Entity_Sub1.method893(var1, var14, (var9 - var3) * 128 + (1 - var5) * 64,
													var11, (var10 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var18.anInt1407 * 1758491173; ++var23) {
										EntityMarker var19 = var18.entityMarkers[var23];
										if (var19 != null && var19.entity instanceof Entity_Sub1) {
											Entity_Sub1 var20 = (Entity_Sub1) var19.entity;
											int var21 = var19.sizeX * 525183875 - var19.regionX * 1249542337 + 1;
											int var22 = var19.sizeY * 1111111519 - var19.regionY * -1236081819 + 1;
											Entity_Sub1.method893(var1, var20,
													(var19.regionX * 1249542337 - var3) * 128 + (var21 - var5) * 64,
													var11,
													(var19.regionY * -1236081819 - var4) * 128 + (var22 - var6) * 64,
													var7);
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
}
