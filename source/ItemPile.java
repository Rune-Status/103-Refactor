
public final class ItemPile {

	Entity bottom;
	int regionX;
	int regionY;
	Entity middle;
	int counterHeight;
	int anInt831;
	int height;
	Entity anEntity832;

	static final void method454(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.aBool2010 && InterfaceNode.floorLevel * -747958745 != var0) {
				return;
			}

			int var7 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = InterfaceNode.landscape.method53(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = InterfaceNode.landscape.method31(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = InterfaceNode.landscape.method32(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = InterfaceNode.landscape.method33(var0, var2, var3);
			}

			int var14;
			if (var7 != 0) {
				var14 = InterfaceNode.landscape.method34(var0, var2, var3, var7);
				int var32 = var7 >> 14 & 32767;
				int var33 = var14 & 31;
				int var34 = var14 >> 6 & 3;
				ObjectDefinition var16;
				if (var1 == 0) {
					InterfaceNode.landscape.method56(var0, var2, var3);
					var16 = Class37.getObjectDefinition(var32);
					if (-1030255905 * var16.anInt1690 != 0) {
						Client.collisionMaps[var0].method238(var2, var3, var33, var34, var16.aBool1714);
					}
				}

				if (var1 == 1) {
					InterfaceNode.landscape.method25(var0, var2, var3);
				}

				if (var1 == 2) {
					InterfaceNode.landscape.method26(var0, var2, var3);
					var16 = Class37.getObjectDefinition(var32);
					if (1162660975 * var16.sizeX + var2 > 103 || var3 + 1162660975 * var16.sizeX > 103
							|| var2 + -1976023901 * var16.sizeY > 103 || var16.sizeY * -1976023901 + var3 > 103) {
						return;
					}

					if (var16.anInt1690 * -1030255905 != 0) {
						Client.collisionMaps[var0].method239(var2, var3, 1162660975 * var16.sizeX,
								var16.sizeY * -1976023901, var34, var16.aBool1714);
					}
				}

				if (var1 == 3) {
					InterfaceNode.landscape.method27(var0, var2, var3);
					var16 = Class37.getObjectDefinition(var32);
					if (var16.anInt1690 * -1030255905 == 1) {
						Client.collisionMaps[var0].method241(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var14 = var0;
				if (var0 < 3 && (Class39.renderRules[1][var2][var3] & 2) == 2) {
					var14 = var0 + 1;
				}

				Landscape var36 = InterfaceNode.landscape;
				CollisionMap var21 = Client.collisionMaps[var0];
				ObjectDefinition var8 = Class37.getObjectDefinition(var4);
				int var12;
				int var27;
				if (var5 != 1 && var5 != 3) {
					var12 = 1162660975 * var8.sizeX;
					var27 = var8.sizeY * -1976023901;
				} else {
					var12 = var8.sizeY * -1976023901;
					var27 = 1162660975 * var8.sizeX;
				}

				int var28;
				int var29;
				if (var2 + var12 <= 104) {
					var28 = var2 + (var12 >> 1);
					var29 = var2 + (var12 + 1 >> 1);
				} else {
					var28 = var2;
					var29 = var2 + 1;
				}

				int var30;
				int var31;
				if (var27 + var3 <= 104) {
					var31 = var3 + (var27 >> 1);
					var30 = (1 + var27 >> 1) + var3;
				} else {
					var31 = var3;
					var30 = 1 + var3;
				}

				int[][] var17 = Class39.tileHeights[var14];
				int var18 = var17[var29][var30] + var17[var29][var31] + var17[var28][var31] + var17[var28][var30] >> 2;
				int var13 = (var2 << 7) + (var12 << 6);
				int var19 = (var27 << 6) + (var3 << 7);
				int var22 = (var4 << 14) + var2 + (var3 << 7) + 1073741824;
				if (-839074197 * var8.anInt1692 == 0) {
					var22 -= Integer.MIN_VALUE;
				}

				int var23 = (var5 << 6) + var6;
				if (var8.anInt1713 * 547466771 == 1) {
					var23 += 256;
				}

				Object var20;
				if (var6 == 22) {
					if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
						var20 = var8.method861(22, var5, var17, var13, var18, var19);
					} else {
						var20 = new DynamicObject(var4, 22, var5, var14, var2, var3, var8.anInt1698 * -100857069, true,
								(Entity) null);
					}

					var36.addTileDecoration(var0, var2, var3, var18, (Entity) var20, var22, var23);
					if (var8.anInt1690 * -1030255905 == 1) {
						var21.method236(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
							var20 = var8.method861(var6, var5, var17, var13, var18, var19);
						} else {
							var20 = new DynamicObject(var4, var6, var5, var14, var2, var3, var8.anInt1698 * -100857069,
									true, (Entity) null);
						}

						var36.method18(var0, var2, var3, var18, 1, 1, (Entity) var20, 0, var22, var23);
						if (-1030255905 * var8.anInt1690 != 0) {
							var21.method234(var2, var3, var12, var27, var8.aBool1714);
						}
					} else if (var6 == 0) {
						if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
							var20 = var8.method861(0, var5, var17, var13, var18, var19);
						} else {
							var20 = new DynamicObject(var4, 0, var5, var14, var2, var3, -100857069 * var8.anInt1698,
									true, (Entity) null);
						}

						var36.addBoundary(var0, var2, var3, var18, (Entity) var20, (Entity) null,
								Class39.anIntArray434[var5], 0, var22, var23);
						if (var8.anInt1690 * -1030255905 != 0) {
							var21.method242(var2, var3, var6, var5, var8.aBool1714);
						}
					} else if (var6 == 1) {
						if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
							var20 = var8.method861(1, var5, var17, var13, var18, var19);
						} else {
							var20 = new DynamicObject(var4, 1, var5, var14, var2, var3, var8.anInt1698 * -100857069,
									true, (Entity) null);
						}

						var36.addBoundary(var0, var2, var3, var18, (Entity) var20, (Entity) null,
								Class39.anIntArray435[var5], 0, var22, var23);
						if (var8.anInt1690 * -1030255905 != 0) {
							var21.method242(var2, var3, var6, var5, var8.aBool1714);
						}
					} else {
						Object var24;
						int var37;
						if (var6 == 2) {
							var37 = 1 + var5 & 3;
							Object var15;
							if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
								var15 = var8.method861(2, 4 + var5, var17, var13, var18, var19);
								var24 = var8.method861(2, var37, var17, var13, var18, var19);
							} else {
								var15 = new DynamicObject(var4, 2, var5 + 4, var14, var2, var3,
										-100857069 * var8.anInt1698, true, (Entity) null);
								var24 = new DynamicObject(var4, 2, var37, var14, var2, var3,
										-100857069 * var8.anInt1698, true, (Entity) null);
							}

							var36.addBoundary(var0, var2, var3, var18, (Entity) var15, (Entity) var24,
									Class39.anIntArray434[var5], Class39.anIntArray434[var37], var22, var23);
							if (-1030255905 * var8.anInt1690 != 0) {
								var21.method242(var2, var3, var6, var5, var8.aBool1714);
							}
						} else if (var6 == 3) {
							if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
								var20 = var8.method861(3, var5, var17, var13, var18, var19);
							} else {
								var20 = new DynamicObject(var4, 3, var5, var14, var2, var3, var8.anInt1698 * -100857069,
										true, (Entity) null);
							}

							var36.addBoundary(var0, var2, var3, var18, (Entity) var20, (Entity) null,
									Class39.anIntArray435[var5], 0, var22, var23);
							if (-1030255905 * var8.anInt1690 != 0) {
								var21.method242(var2, var3, var6, var5, var8.aBool1714);
							}
						} else if (var6 == 9) {
							if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
								var20 = var8.method861(var6, var5, var17, var13, var18, var19);
							} else {
								var20 = new DynamicObject(var4, var6, var5, var14, var2, var3,
										-100857069 * var8.anInt1698, true, (Entity) null);
							}

							var36.method18(var0, var2, var3, var18, 1, 1, (Entity) var20, 0, var22, var23);
							if (-1030255905 * var8.anInt1690 != 0) {
								var21.method234(var2, var3, var12, var27, var8.aBool1714);
							}
						} else if (var6 == 4) {
							if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
								var20 = var8.method861(4, var5, var17, var13, var18, var19);
							} else {
								var20 = new DynamicObject(var4, 4, var5, var14, var2, var3, -100857069 * var8.anInt1698,
										true, (Entity) null);
							}

							var36.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var20, (Entity) null,
									Class39.anIntArray434[var5], 0, 0, 0, var22, var23);
						} else {
							int var35;
							if (var6 == 5) {
								var37 = 16;
								var35 = var36.method53(var0, var2, var3);
								if (var35 != 0) {
									var37 = Class37.getObjectDefinition(var35 >> 14 & 32767).anInt1699 * 1063235335;
								}

								if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
									var24 = var8.method861(4, var5, var17, var13, var18, var19);
								} else {
									var24 = new DynamicObject(var4, 4, var5, var14, var2, var3,
											-100857069 * var8.anInt1698, true, (Entity) null);
								}

								var36.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var24, (Entity) null,
										Class39.anIntArray434[var5], 0, Class39.anIntArray427[var5] * var37,
										var37 * Class39.anIntArray436[var5], var22, var23);
							} else if (var6 == 6) {
								var37 = 8;
								var35 = var36.method53(var0, var2, var3);
								if (var35 != 0) {
									var37 = Class37.getObjectDefinition(var35 >> 14 & 32767).anInt1699 * 1063235335 / 2;
								}

								if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
									var24 = var8.method861(4, var5 + 4, var17, var13, var18, var19);
								} else {
									var24 = new DynamicObject(var4, 4, var5 + 4, var14, var2, var3,
											var8.anInt1698 * -100857069, true, (Entity) null);
								}

								var36.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var24, (Entity) null, 256,
										var5, var37 * Class39.anIntArray440[var5], var37 * Class39.anIntArray437[var5],
										var22, var23);
							} else if (var6 == 7) {
								var35 = var5 + 2 & 3;
								if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
									var20 = var8.method861(4, var35 + 4, var17, var13, var18, var19);
								} else {
									var20 = new DynamicObject(var4, 4, var35 + 4, var14, var2, var3,
											-100857069 * var8.anInt1698, true, (Entity) null);
								}

								var36.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var20, (Entity) null, 256,
										var35, 0, 0, var22, var23);
							} else if (var6 == 8) {
								var37 = 8;
								var35 = var36.method53(var0, var2, var3);
								if (var35 != 0) {
									var37 = Class37.getObjectDefinition(var35 >> 14 & 32767).anInt1699 * 1063235335 / 2;
								}

								int var25 = 2 + var5 & 3;
								Object var26;
								if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
									var24 = var8.method861(4, 4 + var5, var17, var13, var18, var19);
									var26 = var8.method861(4, 4 + var25, var17, var13, var18, var19);
								} else {
									var24 = new DynamicObject(var4, 4, 4 + var5, var14, var2, var3,
											var8.anInt1698 * -100857069, true, (Entity) null);
									var26 = new DynamicObject(var4, 4, var25 + 4, var14, var2, var3,
											var8.anInt1698 * -100857069, true, (Entity) null);
								}

								var36.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var24, (Entity) var26,
										256, var5, var37 * Class39.anIntArray440[var5],
										var37 * Class39.anIntArray437[var5], var22, var23);
							}
						}
					}
				} else {
					if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
						var20 = var8.method861(10, var5, var17, var13, var18, var19);
					} else {
						var20 = new DynamicObject(var4, 10, var5, var14, var2, var3, var8.anInt1698 * -100857069, true,
								(Entity) null);
					}

					if (var20 != null) {
						var36.method18(var0, var2, var3, var18, var12, var27, (Entity) var20, var6 == 11 ? 256 : 0,
								var22, var23);
					}

					if (var8.anInt1690 * -1030255905 != 0) {
						var21.method234(var2, var3, var12, var27, var8.aBool1714);
					}
				}
			}
		}

	}

	static void method455(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var6 = (var2 + var3) / 2;
			int var5 = var2;
			String var7 = var0[var6];
			var0[var6] = var0[var3];
			var0[var3] = var7;
			short var8 = var1[var6];
			var1[var6] = var1[var3];
			var1[var3] = var8;

			for (int var4 = var2; var4 < var3; ++var4) {
				if (var7 == null || var0[var4] != null && var0[var4].compareTo(var7) < (var4 & 1)) {
					String var9 = var0[var4];
					var0[var4] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var4];
					var1[var4] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var7;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method455(var0, var1, var2, var5 - 1);
			method455(var0, var1, var5 + 1, var3);
		}

	}
}
