import java.awt.Component;
import java.io.IOException;

public class ScriptEvent extends Node {

	int anInt1429;
	Widget widget;
	Object[] args;
	int anInt1431;
	boolean aBool1432;
	Widget aWidget1433;
	int anInt1434;
	int anInt1435;
	String opbase;
	int anInt1436;
	static Widget aWidget1437;
	int anInt1438;

	static final void method650(int var0, int var1, int var2, int var3, int var4, int var5, Landscape var6,
			CollisionMap var7) {
		if (!Client.lowMemory || (Class39.renderRules[0][var1][var2] & 0x2) != 0
				|| (Class39.renderRules[var0][var1][var2] & 0x10) == 0) {
			if (var0 < Class39.anInt438) {
				Class39.anInt438 = var0;
			}

			ObjectType var8 = Class37.getObjectType(var3);
			int var9;
			int var16;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var16 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var16 = var8.sizeX;
			}

			int var17;
			int var18;
			if (var9 + var1 <= 104) {
				var17 = (var9 >> 1) + var1;
				var18 = (var9 + 1 >> 1) + var1;
			} else {
				var17 = var1;
				var18 = var1 + 1;
			}

			int var21;
			int var25;
			if (var2 + var16 <= 104) {
				var21 = (var16 >> 1) + var2;
				var25 = (var16 + 1 >> 1) + var2;
			} else {
				var21 = var2;
				var25 = var2 + 1;
			}

			int[][] var11 = Class39.tileHeights[var0];
			int var13 = var11[var17][var25] + var11[var18][var21] + var11[var17][var21] + var11[var18][var25] >> 2;
			int var12 = (var9 << 6) + (var1 << 7);
			int var14 = (var2 << 7) + (var16 << 6);
			int var22 = (var3 << 14) + 1073741824 + (var2 << 7) + var1;
			if (var8.anInt1692 == 0) {
				var22 -= Integer.MIN_VALUE;
			}

			int var23 = (var4 << 6) + var5;
			if (var8.anInt1713 == 1) {
				var23 += 256;
			}

			int var10;
			int var24;
			if (var8.method865()) {
				Node_Sub6 var27 = new Node_Sub6();
				var27.anInt1270 = var0;
				var27.anInt1271 = var1 * 128;
				var27.anInt1272 = var2 * 128;
				var10 = var8.sizeX;
				var24 = var8.sizeY;
				if (var4 == 1 || var4 == 3) {
					var10 = var8.sizeY;
					var24 = var8.sizeX;
				}

				var27.anInt1269 = (var10 + var1) * 128;
				var27.anInt1275 = (var2 + var24) * 128;
				var27.anInt1281 = var8.anInt1715;
				var27.anInt1282 = var8.anInt1716 * 1545946752;
				var27.anInt1277 = var8.anInt1687 * -1875457101;
				var27.anInt1278 = var8.anInt1717;
				var27.anIntArray1273 = var8.anIntArray1697;
				if (var8.transformIds != null) {
					var27.anObjectDefinition1283 = var8;
					var27.method536(424061730);
				}

				Node_Sub6.aDeque1279.method475(var27);
				if (var27.anIntArray1273 != null) {
					var27.anInt1274 = var27.anInt1277
							+ (int) (Math.random() * (double) (var27.anInt1278 - var27.anInt1277));
				}
			}

			Object var28;
			if (var5 == 22) {
				if (!Client.lowMemory || var8.anInt1692 != 0 || var8.anInt1690 == 1 || var8.aBool1711) {
					if (var8.anInt1698 == -1 && var8.transformIds == null) {
						var28 = var8.method860(22, var4, var11, var12, var13, var14);
					} else {
						var28 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.anInt1698, true,
								(Entity) null);
					}

					var6.addTileDecoration(var0, var1, var2, var13, (Entity) var28, var22, var23);
					if (var8.anInt1690 == 1 && var7 != null) {
						var7.method236(var1, var2);
					}
				}
			} else {
				int var20;
				if (var5 != 10 && var5 != 11) {
					if (var5 >= 12) {
						if (var8.anInt1698 == -1 && var8.transformIds == null) {
							var28 = var8.method860(var5, var4, var11, var12, var13, var14);
						} else {
							var28 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.anInt1698, true,
									(Entity) null);
						}

						var6.method18(var0, var1, var2, var13, 1, 1, (Entity) var28, 0, var22, var23);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							Class39.anIntArrayArrayArray433[var0][var1][var2] |= 2340;
						}

						if (var8.anInt1690 != 0 && var7 != null) {
							var7.method234(var1, var2, var9, var16, var8.aBool1714);
						}
					} else if (var5 == 0) {
						if (var8.anInt1698 == -1 && var8.transformIds == null) {
							var28 = var8.method860(0, var4, var11, var12, var13, var14);
						} else {
							var28 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.anInt1698, true,
									(Entity) null);
						}

						var6.addBoundary(var0, var1, var2, var13, (Entity) var28, (Entity) null,
								Class39.anIntArray434[var4], 0, var22, var23);
						if (var4 == 0) {
							if (var8.clipped) {
								Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
								Class39.aByteArrayArrayArray430[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								Class39.anIntArrayArrayArray433[var0][var1][var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								Class39.aByteArrayArrayArray430[var0][var1][var2 + 1] = 50;
								Class39.aByteArrayArrayArray430[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								Class39.anIntArrayArrayArray433[var0][var1][var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								Class39.aByteArrayArrayArray430[var0][var1 + 1][var2] = 50;
								Class39.aByteArrayArrayArray430[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								Class39.anIntArrayArrayArray433[var0][var1 + 1][var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
								Class39.aByteArrayArrayArray430[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								Class39.anIntArrayArrayArray433[var0][var1][var2] |= 1170;
							}
						}

						if (var8.anInt1690 != 0 && var7 != null) {
							var7.method242(var1, var2, var5, var4, var8.aBool1714);
						}

						if (var8.anInt1699 != 16) {
							var6.method24(var0, var1, var2, var8.anInt1699);
						}
					} else if (var5 == 1) {
						if (var8.anInt1698 == -1 && var8.transformIds == null) {
							var28 = var8.method860(1, var4, var11, var12, var13, var14);
						} else {
							var28 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.anInt1698, true,
									(Entity) null);
						}

						var6.addBoundary(var0, var1, var2, var13, (Entity) var28, (Entity) null,
								Class39.anIntArray435[var4], 0, var22, var23);
						if (var8.clipped) {
							if (var4 == 0) {
								Class39.aByteArrayArrayArray430[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								Class39.aByteArrayArrayArray430[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								Class39.aByteArrayArrayArray430[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
							}
						}

						if (var8.anInt1690 != 0 && var7 != null) {
							var7.method242(var1, var2, var5, var4, var8.aBool1714);
						}
					} else {
						Object var30;
						if (var5 == 2) {
							var20 = var4 + 1 & 0x3;
							Object var19;
							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var19 = var8.method860(2, var4 + 4, var11, var12, var13, var14);
								var30 = var8.method860(2, var20, var11, var12, var13, var14);
							} else {
								var19 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
								var30 = new DynamicObject(var3, 2, var20, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.addBoundary(var0, var1, var2, var13, (Entity) var19, (Entity) var30,
									Class39.anIntArray434[var4], Class39.anIntArray434[var20], var22, var23);
							if (var8.modelClipped) {
								if (var4 == 0) {
									Class39.anIntArrayArrayArray433[var0][var1][var2] |= 585;
									Class39.anIntArrayArrayArray433[var0][var1][var2 + 1] |= 1170;
								} else if (var4 == 1) {
									Class39.anIntArrayArrayArray433[var0][var1][var2 + 1] |= 1170;
									Class39.anIntArrayArrayArray433[var0][var1 + 1][var2] |= 585;
								} else if (var4 == 2) {
									Class39.anIntArrayArrayArray433[var0][var1 + 1][var2] |= 585;
									Class39.anIntArrayArrayArray433[var0][var1][var2] |= 1170;
								} else if (var4 == 3) {
									Class39.anIntArrayArrayArray433[var0][var1][var2] |= 1170;
									Class39.anIntArrayArrayArray433[var0][var1][var2] |= 585;
								}
							}

							if (var8.anInt1690 != 0 && var7 != null) {
								var7.method242(var1, var2, var5, var4, var8.aBool1714);
							}

							if (var8.anInt1699 != 16) {
								var6.method24(var0, var1, var2, var8.anInt1699);
							}
						} else if (var5 == 3) {
							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var28 = var8.method860(3, var4, var11, var12, var13, var14);
							} else {
								var28 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.addBoundary(var0, var1, var2, var13, (Entity) var28, (Entity) null,
									Class39.anIntArray435[var4], 0, var22, var23);
							if (var8.clipped) {
								if (var4 == 0) {
									Class39.aByteArrayArrayArray430[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									Class39.aByteArrayArrayArray430[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									Class39.aByteArrayArrayArray430[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
								}
							}

							if (var8.anInt1690 != 0 && var7 != null) {
								var7.method242(var1, var2, var5, var4, var8.aBool1714);
							}
						} else if (var5 == 9) {
							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var28 = var8.method860(var5, var4, var11, var12, var13, var14);
							} else {
								var28 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.method18(var0, var1, var2, var13, 1, 1, (Entity) var28, 0, var22, var23);
							if (var8.anInt1690 != 0 && var7 != null) {
								var7.method234(var1, var2, var9, var16, var8.aBool1714);
							}

							if (var8.anInt1699 != 16) {
								var6.method24(var0, var1, var2, var8.anInt1699);
							}
						} else if (var5 == 4) {
							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var28 = var8.method860(4, var4, var11, var12, var13, var14);
							} else {
								var28 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var28, (Entity) null,
									Class39.anIntArray434[var4], 0, 0, 0, var22, var23);
						} else if (var5 == 5) {
							var20 = 16;
							var10 = var6.method53(var0, var1, var2);
							if (var10 != 0) {
								var20 = Class37.getObjectType(var10 >> 14 & 0x7fff).anInt1699;
							}

							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var30 = var8.method860(4, var4, var11, var12, var13, var14);
							} else {
								var30 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var30, (Entity) null,
									Class39.anIntArray434[var4], 0, Class39.anIntArray427[var4] * var20,
									Class39.anIntArray436[var4] * var20, var22, var23);
						} else if (var5 == 6) {
							var20 = 8;
							var10 = var6.method53(var0, var1, var2);
							if (var10 != 0) {
								var20 = Class37.getObjectType(var10 >> 14 & 0x7fff).anInt1699 / 2;
							}

							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var30 = var8.method860(4, var4 + 4, var11, var12, var13, var14);
							} else {
								var30 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var30, (Entity) null, 256,
									var4, Class39.anIntArray440[var4] * var20, Class39.anIntArray437[var4] * var20,
									var22, var23);
						} else if (var5 == 7) {
							var10 = var4 + 2 & 0x3;
							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var28 = var8.method860(4, var10 + 4, var11, var12, var13, var14);
							} else {
								var28 = new DynamicObject(var3, 4, var10 + 4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var28, (Entity) null, 256,
									var10, 0, 0, var22, var23);
						} else if (var5 == 8) {
							var20 = 8;
							var10 = var6.method53(var0, var1, var2);
							if (var10 != 0) {
								var20 = Class37.getObjectType(var10 >> 14 & 0x7fff).anInt1699 / 2;
							}

							int var291 = var4 + 2 & 0x3;
							Object var29;
							if (var8.anInt1698 == -1 && var8.transformIds == null) {
								var30 = var8.method860(4, var4 + 4, var11, var12, var13, var14);
								var29 = var8.method860(4, var291 + 4, var11, var12, var13, var14);
							} else {
								var30 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
								var29 = new DynamicObject(var3, 4, var291 + 4, var0, var1, var2, var8.anInt1698, true,
										(Entity) null);
							}

							var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var30, (Entity) var29, 256,
									var4, Class39.anIntArray440[var4] * var20, Class39.anIntArray437[var4] * var20,
									var22, var23);
						}
					}
				} else {
					if (var8.anInt1698 == -1 && var8.transformIds == null) {
						var28 = var8.method860(10, var4, var11, var12, var13, var14);
					} else {
						var28 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.anInt1698, true,
								(Entity) null);
					}

					if (var28 != null && var6.method18(var0, var1, var2, var13, var9, var16, (Entity) var28,
							var5 == 11 ? 256 : 0, var22, var23) && var8.clipped) {
						var10 = 15;
						if (var28 instanceof Rasterizer) {
							var10 = ((Rasterizer) var28).method1000() / 4;
							if (var10 > 30) {
								var10 = 30;
							}
						}

						for (var24 = 0; var24 <= var9; var24++) {
							for (var20 = 0; var20 <= var16; var20++) {
								if (var10 > Class39.aByteArrayArrayArray430[var0][var24 + var1][var20 + var2]) {
									Class39.aByteArrayArrayArray430[var0][var1 + var24][var2 + var20] = (byte) var10;
								}
							}
						}
					}

					if (var8.anInt1690 != 0 && var7 != null) {
						var7.method234(var1, var2, var9, var16, var8.aBool1714);
					}
				}
			}
		}

	}

	public static final AbstractSoundSystem method651(TaskManager var0, Component var1, int var2, int var3) {
		if (AbstractSoundSystem.sampleRate == 0) {
			throw new IllegalStateException();
		} else if (var2 >= 0 && var2 < 2) {
			try {
				SourceDataSoundSystem var6 = new SourceDataSoundSystem();
				var6.anIntArray160 = new int[(AbstractSoundSystem.highMemory ? 2 : 1) * 256];
				var6.anInt165 = var3;
				var6.create(var1);
				var6.anInt164 = (var3 & 0xfffffc00) + 1024;
				if (var6.anInt164 > 16384) {
					var6.anInt164 = 16384;
				}

				var6.create(var6.anInt164);
				if (AbstractSoundSystem.anInt172 > 0 && AbstractSoundSystem.aClass19_156 == null) {
					AbstractSoundSystem.aClass19_156 = new Class19();
					AbstractSoundSystem.aClass19_156.aClass63_263 = var0;
					var0.createRunnable(AbstractSoundSystem.aClass19_156, AbstractSoundSystem.anInt172);
				}

				if (AbstractSoundSystem.aClass19_156 != null) {
					if (AbstractSoundSystem.aClass19_156.aClass8Array264[var2] != null) {
						throw new IllegalArgumentException();
					}

					AbstractSoundSystem.aClass19_156.aClass8Array264[var2] = var6;
				}

				return var6;
			} catch (Throwable var7) {
				try {
					ImplSoundSystem var5 = new ImplSoundSystem(var0, var2);
					var5.anIntArray160 = new int[256 * (AbstractSoundSystem.highMemory ? 2 : 1)];
					var5.anInt165 = var3;
					var5.create(var1);
					var5.anInt164 = 16384;
					var5.create(var5.anInt164);
					if (AbstractSoundSystem.anInt172 > 0 && AbstractSoundSystem.aClass19_156 == null) {
						AbstractSoundSystem.aClass19_156 = new Class19();
						AbstractSoundSystem.aClass19_156.aClass63_263 = var0;
						var0.createRunnable(AbstractSoundSystem.aClass19_156, AbstractSoundSystem.anInt172);
					}

					if (AbstractSoundSystem.aClass19_156 != null) {
						if (AbstractSoundSystem.aClass19_156.aClass8Array264[var2] != null) {
							throw new IllegalArgumentException();
						}

						AbstractSoundSystem.aClass19_156.aClass8Array264[var2] = var5;
					}

					return var5;
				} catch (Throwable var61) {
					return new AbstractSoundSystem();
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static void sendConInfo(boolean loggedIn) {
		if (Class81.js5Con != null) {
			try {
				ByteBuf var4 = new ByteBuf(4);
				var4.putByte(loggedIn ? 2 : 3);
				var4.putMedium(0);
				Class81.js5Con.write(var4.payload, 0, 4);
			} catch (IOException var41) {
				try {
					Class81.js5Con.shutdown();
				} catch (Exception var3) {
					;
				}

				++Class81.anInt684;
				Class81.js5Con = null;
			}
		}

	}

}
