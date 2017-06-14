public final class ItemPile {

	Entity bottom;
	int regionX;
	int regionY;
	Entity middle;
	int counterHeight;
	int bitset;
	int height;
	Entity anEntity832;

	static final void method454(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.lowMemory && InterfaceNode.floorLevel * -1331355705 != var0) {
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
				int var36 = var7 >> 14 & 0x7fff;
				int var21 = var14 & 0x1f;
				int var8 = var14 >> 6 & 0x3;
				ObjectType var12;
				if (var1 == 0) {
					InterfaceNode.landscape.method56(var0, var2, var3);
					var12 = Class37.getObjectType(var36);
					if (var12.interactType != 0) {
						Client.collisionMaps[var0].removeWall(var2, var3, var21, var8, var12.aBool1714);
					}
				}

				if (var1 == 1) {
					InterfaceNode.landscape.method25(var0, var2, var3);
				}

				if (var1 == 2) {
					InterfaceNode.landscape.method26(var0, var2, var3);
					var12 = Class37.getObjectType(var36);
					if (var12.sizeX + var2 > 103 || var12.sizeX + var3 > 103 || var12.sizeY + var2 > 103
							|| var12.sizeY + var3 > 103) {
						return;
					}

					if (var12.interactType != 0) {
						Client.collisionMaps[var0].removeObject(var2, var3, var12.sizeX, var12.sizeY, var8,
								var12.aBool1714);
					}
				}

				if (var1 == 3) {
					InterfaceNode.landscape.method27(var0, var2, var3);
					var12 = Class37.getObjectType(var36);
					if (var12.interactType == 1) {
						Client.collisionMaps[var0].unblock(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var14 = var0;
				if (var0 < 3 && (Scene.renderFlags[1][var2][var3] & 0x2) == 2) {
					var14 = var0 + 1;
				}

				Landscape var361 = InterfaceNode.landscape;
				CollisionMap var211 = Client.collisionMaps[var0];
				ObjectType var81 = Class37.getObjectType(var4);
				int var27;
				int var121;
				if (var5 != 1 && var5 != 3) {
					var121 = var81.sizeX;
					var27 = var81.sizeY;
				} else {
					var121 = var81.sizeY;
					var27 = var81.sizeX;
				}

				int var28;
				int var29;
				if (var2 + var121 <= 104) {
					var28 = (var121 >> 1) + var2;
					var29 = (var121 + 1 >> 1) + var2;
				} else {
					var28 = var2;
					var29 = var2 + 1;
				}

				int var30;
				int var31;
				if (var27 + var3 <= 104) {
					var31 = (var27 >> 1) + var3;
					var30 = (var27 + 1 >> 1) + var3;
				} else {
					var31 = var3;
					var30 = var3 + 1;
				}

				int[][] var17 = Scene.tileHeights[var14];
				int var18 = var17[var29][var30] + var17[var29][var31] + var17[var28][var31] + var17[var28][var30] >> 2;
				int var13 = (var2 << 7) + (var121 << 6);
				int var19 = (var27 << 6) + (var3 << 7);
				int var22 = (var4 << 14) + var2 + (var3 << 7) + 1073741824;
				if (var81.anInt1692 == 0) {
					var22 -= Integer.MIN_VALUE;
				}

				int var23 = (var5 << 6) + var6;
				if (var81.anInt1713 == 1) {
					var23 += 256;
				}

				Object var20;
				if (var6 == 22) {
					if (var81.anInt1698 == -1 && var81.transformIds == null) {
						var20 = var81.method861(22, var5, var17, var13, var18, var19);
					} else {
						var20 = new DynamicObject(var4, 22, var5, var14, var2, var3, var81.anInt1698, true,
								(Entity) null);
					}

					var361.addTileDecoration(var0, var2, var3, var18, (Entity) var20, var22, var23);
					if (var81.interactType == 1) {
						var211.block(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var81.anInt1698 == -1 && var81.transformIds == null) {
							var20 = var81.method861(var6, var5, var17, var13, var18, var19);
						} else {
							var20 = new DynamicObject(var4, var6, var5, var14, var2, var3, var81.anInt1698, true,
									(Entity) null);
						}

						var361.method18(var0, var2, var3, var18, 1, 1, (Entity) var20, 0, var22, var23);
						if (var81.interactType != 0) {
							var211.addObject(var2, var3, var121, var27, var81.aBool1714);
						}
					} else if (var6 == 0) {
						if (var81.anInt1698 == -1 && var81.transformIds == null) {
							var20 = var81.method861(0, var5, var17, var13, var18, var19);
						} else {
							var20 = new DynamicObject(var4, 0, var5, var14, var2, var3, var81.anInt1698, true,
									(Entity) null);
						}

						var361.addBoundary(var0, var2, var3, var18, (Entity) var20, (Entity) null,
								Scene.WALL_ROTATION_TYPE1[var5], 0, var22, var23);
						if (var81.interactType != 0) {
							var211.addWall(var2, var3, var6, var5, var81.aBool1714);
						}
					} else if (var6 == 1) {
						if (var81.anInt1698 == -1 && var81.transformIds == null) {
							var20 = var81.method861(1, var5, var17, var13, var18, var19);
						} else {
							var20 = new DynamicObject(var4, 1, var5, var14, var2, var3, var81.anInt1698, true,
									(Entity) null);
						}

						var361.addBoundary(var0, var2, var3, var18, (Entity) var20, (Entity) null,
								Scene.WALL_ROTATION_TYPE2[var5], 0, var22, var23);
						if (var81.interactType != 0) {
							var211.addWall(var2, var3, var6, var5, var81.aBool1714);
						}
					} else {
						Object var24;
						int var37;
						if (var6 == 2) {
							var37 = var5 + 1 & 0x3;
							Object var35;
							if (var81.anInt1698 == -1 && var81.transformIds == null) {
								var35 = var81.method861(2, var5 + 4, var17, var13, var18, var19);
								var24 = var81.method861(2, var37, var17, var13, var18, var19);
							} else {
								var35 = new DynamicObject(var4, 2, var5 + 4, var14, var2, var3, var81.anInt1698, true,
										(Entity) null);
								var24 = new DynamicObject(var4, 2, var37, var14, var2, var3, var81.anInt1698, true,
										(Entity) null);
							}

							var361.addBoundary(var0, var2, var3, var18, (Entity) var35, (Entity) var24,
									Scene.WALL_ROTATION_TYPE1[var5], Scene.WALL_ROTATION_TYPE1[var37], var22, var23);
							if (var81.interactType != 0) {
								var211.addWall(var2, var3, var6, var5, var81.aBool1714);
							}
						} else if (var6 == 3) {
							if (var81.anInt1698 == -1 && var81.transformIds == null) {
								var20 = var81.method861(3, var5, var17, var13, var18, var19);
							} else {
								var20 = new DynamicObject(var4, 3, var5, var14, var2, var3, var81.anInt1698, true,
										(Entity) null);
							}

							var361.addBoundary(var0, var2, var3, var18, (Entity) var20, (Entity) null,
									Scene.WALL_ROTATION_TYPE2[var5], 0, var22, var23);
							if (var81.interactType != 0) {
								var211.addWall(var2, var3, var6, var5, var81.aBool1714);
							}
						} else if (var6 == 9) {
							if (var81.anInt1698 == -1 && var81.transformIds == null) {
								var20 = var81.method861(var6, var5, var17, var13, var18, var19);
							} else {
								var20 = new DynamicObject(var4, var6, var5, var14, var2, var3, var81.anInt1698, true,
										(Entity) null);
							}

							var361.method18(var0, var2, var3, var18, 1, 1, (Entity) var20, 0, var22, var23);
							if (var81.interactType != 0) {
								var211.addObject(var2, var3, var121, var27, var81.aBool1714);
							}
						} else if (var6 == 4) {
							if (var81.anInt1698 == -1 && var81.transformIds == null) {
								var20 = var81.method861(4, var5, var17, var13, var18, var19);
							} else {
								var20 = new DynamicObject(var4, 4, var5, var14, var2, var3, var81.anInt1698, true,
										(Entity) null);
							}

							var361.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var20, (Entity) null,
									Scene.WALL_ROTATION_TYPE1[var5], 0, 0, 0, var22, var23);
						} else {
							int var351;
							if (var6 == 5) {
								var37 = 16;
								var351 = var361.method53(var0, var2, var3);
								if (var351 != 0) {
									var37 = Class37.getObjectType(var351 >> 14 & 0x7fff).anInt1699;
								}

								if (var81.anInt1698 == -1 && var81.transformIds == null) {
									var24 = var81.method861(4, var5, var17, var13, var18, var19);
								} else {
									var24 = new DynamicObject(var4, 4, var5, var14, var2, var3, var81.anInt1698, true,
											(Entity) null);
								}

								var361.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var24, (Entity) null,
										Scene.WALL_ROTATION_TYPE1[var5], 0, Scene.WALL_DECO_ROT_SIZE_X_DIR[var5] * var37,
										Scene.WALL_DECO_ROT_SIZE_Y_DIR[var5] * var37, var22, var23);
							} else if (var6 == 6) {
								var37 = 8;
								var351 = var361.method53(var0, var2, var3);
								if (var351 != 0) {
									var37 = Class37.getObjectType(var351 >> 14 & 0x7fff).anInt1699 / 2;
								}

								if (var81.anInt1698 == -1 && var81.transformIds == null) {
									var24 = var81.method861(4, var5 + 4, var17, var13, var18, var19);
								} else {
									var24 = new DynamicObject(var4, 4, var5 + 4, var14, var2, var3, var81.anInt1698,
											true, (Entity) null);
								}

								var361.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var24, (Entity) null,
										256, var5, Scene.SEQ_DECO_ROT_SIZE_X_DIR[var5] * var37,
										Scene.SEQ_DECO_ROT_SIZE_Y_DIR[var5] * var37, var22, var23);
							} else if (var6 == 7) {
								var351 = var5 + 2 & 0x3;
								if (var81.anInt1698 == -1 && var81.transformIds == null) {
									var20 = var81.method861(4, var351 + 4, var17, var13, var18, var19);
								} else {
									var20 = new DynamicObject(var4, 4, var351 + 4, var14, var2, var3, var81.anInt1698,
											true, (Entity) null);
								}

								var361.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var20, (Entity) null,
										256, var351, 0, 0, var22, var23);
							} else if (var6 == 8) {
								var37 = 8;
								var351 = var361.method53(var0, var2, var3);
								if (var351 != 0) {
									var37 = Class37.getObjectType(var351 >> 14 & 0x7fff).anInt1699 / 2;
								}

								int var25 = var5 + 2 & 0x3;
								Object var26;
								if (var81.anInt1698 == -1 && var81.transformIds == null) {
									var24 = var81.method861(4, var5 + 4, var17, var13, var18, var19);
									var26 = var81.method861(4, var25 + 4, var17, var13, var18, var19);
								} else {
									var24 = new DynamicObject(var4, 4, var5 + 4, var14, var2, var3, var81.anInt1698,
											true, (Entity) null);
									var26 = new DynamicObject(var4, 4, var25 + 4, var14, var2, var3, var81.anInt1698,
											true, (Entity) null);
								}

								var361.addBoundaryDecoration(var0, var2, var3, var18, (Entity) var24, (Entity) var26,
										256, var5, Scene.SEQ_DECO_ROT_SIZE_X_DIR[var5] * var37,
										Scene.SEQ_DECO_ROT_SIZE_Y_DIR[var5] * var37, var22, var23);
							}
						}
					}
				} else {
					if (var81.anInt1698 == -1 && var81.transformIds == null) {
						var20 = var81.method861(10, var5, var17, var13, var18, var19);
					} else {
						var20 = new DynamicObject(var4, 10, var5, var14, var2, var3, var81.anInt1698, true,
								(Entity) null);
					}

					if (var20 != null) {
						var361.method18(var0, var2, var3, var18, var121, var27, (Entity) var20, var6 == 11 ? 256 : 0,
								var22, var23);
					}

					if (var81.interactType != 0) {
						var211.addObject(var2, var3, var121, var27, var81.aBool1714);
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

			for (int var4 = var2; var4 < var3; var4++) {
				if (var7 == null || var0[var4] != null && var0[var4].compareTo(var7) < (var4 & 0x1)) {
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
