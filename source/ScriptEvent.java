import java.awt.Component;
import java.io.IOException;

public class ScriptEvent extends Node {

	int anInt1429;
	Widget aWidget1430;
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
		if (!Client.aBool2010 || (Class39.renderRules[0][var1][var2] & 2) != 0
				|| (Class39.renderRules[var0][var1][var2] & 16) == 0) {
			if (var0 < Class39.anInt438 * -1263368093) {
				Class39.anInt438 = var0 * -241419957;
			}

			ObjectType var8 = Class37.getObjectType(var3);
			int var9;
			int var16;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX * 1162660975;
				var16 = -1976023901 * var8.sizeY;
			} else {
				var9 = -1976023901 * var8.sizeY;
				var16 = var8.sizeX * 1162660975;
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
				var21 = var2 + (var16 >> 1);
				var25 = (var16 + 1 >> 1) + var2;
			} else {
				var21 = var2;
				var25 = var2 + 1;
			}

			int[][] var11 = Class39.tileHeights[var0];
			int var13 = var11[var17][var25] + var11[var18][var21] + var11[var17][var21] + var11[var18][var25] >> 2;
			int var12 = (var9 << 6) + (var1 << 7);
			int var14 = (var2 << 7) + (var16 << 6);
			int var22 = 1073741824 + (var3 << 14) + (var2 << 7) + var1;
			if (var8.anInt1692 * -839074197 == 0) {
				var22 -= Integer.MIN_VALUE;
			}

			int var23 = var5 + (var4 << 6);
			if (547466771 * var8.anInt1713 == 1) {
				var23 += 256;
			}

			int var10;
			int var24;
			if (var8.method865()) {
				Node_Sub6 var15 = new Node_Sub6();
				var15.anInt1270 = var0 * 246258815;
				var15.anInt1271 = var1 * -1791242624;
				var15.anInt1272 = 620267648 * var2;
				var10 = 1162660975 * var8.sizeX;
				var24 = -1976023901 * var8.sizeY;
				if (var4 == 1 || var4 == 3) {
					var10 = -1976023901 * var8.sizeY;
					var24 = var8.sizeX * 1162660975;
				}

				var15.anInt1269 = (var10 + var1) * -1461530240;
				var15.anInt1275 = (var2 + var24) * 1218256512;
				var15.anInt1281 = 802663847 * var8.anInt1715;
				var15.anInt1282 = var8.anInt1716 * 401668736;
				var15.anInt1277 = 428311197 * var8.anInt1687;
				var15.anInt1278 = 1108507363 * var8.anInt1717;
				var15.anIntArray1273 = var8.anIntArray1697;
				if (var8.transformIds != null) {
					var15.anObjectDefinition1283 = var8;
					var15.method536(424061730);
				}

				Node_Sub6.aDeque1279.method475(var15);
				if (var15.anIntArray1273 != null) {
					var15.anInt1274 = (-1875457101 * var15.anInt1277 + (int) (Math.random()
							* (double) (var15.anInt1278 * -1201579529 - var15.anInt1277 * -1875457101))) * -2049360189;
				}
			}

			Object var27;
			if (var5 == 22) {
				if (!Client.aBool2010 || var8.anInt1692 * -839074197 != 0 || -1030255905 * var8.anInt1690 == 1
						|| var8.aBool1711) {
					if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
						var27 = var8.method860(22, var4, var11, var12, var13, var14);
					} else {
						var27 = new DynamicObject(var3, 22, var4, var0, var1, var2, -100857069 * var8.anInt1698, true,
								(Entity) null);
					}

					var6.addTileDecoration(var0, var1, var2, var13, (Entity) var27, var22, var23);
					if (-1030255905 * var8.anInt1690 == 1 && var7 != null) {
						var7.method236(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) {
				if (var5 >= 12) {
					if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
						var27 = var8.method860(var5, var4, var11, var12, var13, var14);
					} else {
						var27 = new DynamicObject(var3, var5, var4, var0, var1, var2, -100857069 * var8.anInt1698, true,
								(Entity) null);
					}

					var6.method18(var0, var1, var2, var13, 1, 1, (Entity) var27, 0, var22, var23);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						Class39.anIntArrayArrayArray433[var0][var1][var2] |= 2340;
					}

					if (-1030255905 * var8.anInt1690 != 0 && var7 != null) {
						var7.method234(var1, var2, var9, var16, var8.aBool1714);
					}

				} else if (var5 == 0) {
					if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
						var27 = var8.method860(0, var4, var11, var12, var13, var14);
					} else {
						var27 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.anInt1698 * -100857069, true,
								(Entity) null);
					}

					var6.addBoundary(var0, var1, var2, var13, (Entity) var27, (Entity) null,
							Class39.anIntArray434[var4], 0, var22, var23);
					if (var4 == 0) {
						if (var8.clipped) {
							Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
							Class39.aByteArrayArrayArray430[var0][var1][1 + var2] = 50;
						}

						if (var8.modelClipped) {
							Class39.anIntArrayArrayArray433[var0][var1][var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							Class39.aByteArrayArrayArray430[var0][var1][1 + var2] = 50;
							Class39.aByteArrayArrayArray430[var0][1 + var1][1 + var2] = 50;
						}

						if (var8.modelClipped) {
							Class39.anIntArrayArrayArray433[var0][var1][var2 + 1] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							Class39.aByteArrayArrayArray430[var0][1 + var1][var2] = 50;
							Class39.aByteArrayArrayArray430[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							Class39.anIntArrayArrayArray433[var0][1 + var1][var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
							Class39.aByteArrayArrayArray430[var0][1 + var1][var2] = 50;
						}

						if (var8.modelClipped) {
							Class39.anIntArrayArrayArray433[var0][var1][var2] |= 1170;
						}
					}

					if (-1030255905 * var8.anInt1690 != 0 && var7 != null) {
						var7.method242(var1, var2, var5, var4, var8.aBool1714);
					}

					if (var8.anInt1699 * 1063235335 != 16) {
						var6.method24(var0, var1, var2, 1063235335 * var8.anInt1699);
					}

				} else if (var5 == 1) {
					if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
						var27 = var8.method860(1, var4, var11, var12, var13, var14);
					} else {
						var27 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.anInt1698 * -100857069, true,
								(Entity) null);
					}

					var6.addBoundary(var0, var1, var2, var13, (Entity) var27, (Entity) null,
							Class39.anIntArray435[var4], 0, var22, var23);
					if (var8.clipped) {
						if (var4 == 0) {
							Class39.aByteArrayArrayArray430[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							Class39.aByteArrayArrayArray430[var0][var1 + 1][1 + var2] = 50;
						} else if (var4 == 2) {
							Class39.aByteArrayArrayArray430[var0][1 + var1][var2] = 50;
						} else if (var4 == 3) {
							Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
						}
					}

					if (var8.anInt1690 * -1030255905 != 0 && var7 != null) {
						var7.method242(var1, var2, var5, var4, var8.aBool1714);
					}

				} else {
					int var28;
					Object var30;
					if (var5 == 2) {
						var28 = var4 + 1 & 3;
						Object var26;
						if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
							var26 = var8.method860(2, 4 + var4, var11, var12, var13, var14);
							var30 = var8.method860(2, var28, var11, var12, var13, var14);
						} else {
							var26 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.anInt1698 * -100857069,
									true, (Entity) null);
							var30 = new DynamicObject(var3, 2, var28, var0, var1, var2, -100857069 * var8.anInt1698,
									true, (Entity) null);
						}

						var6.addBoundary(var0, var1, var2, var13, (Entity) var26, (Entity) var30,
								Class39.anIntArray434[var4], Class39.anIntArray434[var28], var22, var23);
						if (var8.modelClipped) {
							if (var4 == 0) {
								Class39.anIntArrayArrayArray433[var0][var1][var2] |= 585;
								Class39.anIntArrayArrayArray433[var0][var1][var2 + 1] |= 1170;
							} else if (var4 == 1) {
								Class39.anIntArrayArrayArray433[var0][var1][var2 + 1] |= 1170;
								Class39.anIntArrayArrayArray433[var0][1 + var1][var2] |= 585;
							} else if (var4 == 2) {
								Class39.anIntArrayArrayArray433[var0][var1 + 1][var2] |= 585;
								Class39.anIntArrayArrayArray433[var0][var1][var2] |= 1170;
							} else if (var4 == 3) {
								Class39.anIntArrayArrayArray433[var0][var1][var2] |= 1170;
								Class39.anIntArrayArrayArray433[var0][var1][var2] |= 585;
							}
						}

						if (var8.anInt1690 * -1030255905 != 0 && var7 != null) {
							var7.method242(var1, var2, var5, var4, var8.aBool1714);
						}

						if (var8.anInt1699 * 1063235335 != 16) {
							var6.method24(var0, var1, var2, 1063235335 * var8.anInt1699);
						}

					} else if (var5 == 3) {
						if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
							var27 = var8.method860(3, var4, var11, var12, var13, var14);
						} else {
							var27 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.anInt1698 * -100857069,
									true, (Entity) null);
						}

						var6.addBoundary(var0, var1, var2, var13, (Entity) var27, (Entity) null,
								Class39.anIntArray435[var4], 0, var22, var23);
						if (var8.clipped) {
							if (var4 == 0) {
								Class39.aByteArrayArrayArray430[var0][var1][1 + var2] = 50;
							} else if (var4 == 1) {
								Class39.aByteArrayArrayArray430[var0][1 + var1][var2 + 1] = 50;
							} else if (var4 == 2) {
								Class39.aByteArrayArrayArray430[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Class39.aByteArrayArrayArray430[var0][var1][var2] = 50;
							}
						}

						if (-1030255905 * var8.anInt1690 != 0 && var7 != null) {
							var7.method242(var1, var2, var5, var4, var8.aBool1714);
						}

					} else if (var5 == 9) {
						if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
							var27 = var8.method860(var5, var4, var11, var12, var13, var14);
						} else {
							var27 = new DynamicObject(var3, var5, var4, var0, var1, var2, -100857069 * var8.anInt1698,
									true, (Entity) null);
						}

						var6.method18(var0, var1, var2, var13, 1, 1, (Entity) var27, 0, var22, var23);
						if (-1030255905 * var8.anInt1690 != 0 && var7 != null) {
							var7.method234(var1, var2, var9, var16, var8.aBool1714);
						}

						if (1063235335 * var8.anInt1699 != 16) {
							var6.method24(var0, var1, var2, var8.anInt1699 * 1063235335);
						}

					} else if (var5 == 4) {
						if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
							var27 = var8.method860(4, var4, var11, var12, var13, var14);
						} else {
							var27 = new DynamicObject(var3, 4, var4, var0, var1, var2, -100857069 * var8.anInt1698,
									true, (Entity) null);
						}

						var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var27, (Entity) null,
								Class39.anIntArray434[var4], 0, 0, 0, var22, var23);
					} else if (var5 == 5) {
						var28 = 16;
						var10 = var6.method53(var0, var1, var2);
						if (var10 != 0) {
							var28 = Class37.getObjectType(var10 >> 14 & 32767).anInt1699 * 1063235335;
						}

						if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
							var30 = var8.method860(4, var4, var11, var12, var13, var14);
						} else {
							var30 = new DynamicObject(var3, 4, var4, var0, var1, var2, -100857069 * var8.anInt1698,
									true, (Entity) null);
						}

						var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var30, (Entity) null,
								Class39.anIntArray434[var4], 0, Class39.anIntArray427[var4] * var28,
								Class39.anIntArray436[var4] * var28, var22, var23);
					} else if (var5 == 6) {
						var28 = 8;
						var10 = var6.method53(var0, var1, var2);
						if (var10 != 0) {
							var28 = Class37.getObjectType(var10 >> 14 & 32767).anInt1699 * 1063235335 / 2;
						}

						if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
							var30 = var8.method860(4, var4 + 4, var11, var12, var13, var14);
						} else {
							var30 = new DynamicObject(var3, 4, 4 + var4, var0, var1, var2, -100857069 * var8.anInt1698,
									true, (Entity) null);
						}

						var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var30, (Entity) null, 256, var4,
								var28 * Class39.anIntArray440[var4], var28 * Class39.anIntArray437[var4], var22, var23);
					} else if (var5 == 7) {
						var10 = 2 + var4 & 3;
						if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
							var27 = var8.method860(4, 4 + var10, var11, var12, var13, var14);
						} else {
							var27 = new DynamicObject(var3, 4, 4 + var10, var0, var1, var2, var8.anInt1698 * -100857069,
									true, (Entity) null);
						}

						var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var27, (Entity) null, 256, var10,
								0, 0, var22, var23);
					} else if (var5 == 8) {
						var28 = 8;
						var10 = var6.method53(var0, var1, var2);
						if (var10 != 0) {
							var28 = Class37.getObjectType(var10 >> 14 & 32767).anInt1699 * 1063235335 / 2;
						}

						int var19 = var4 + 2 & 3;
						Object var29;
						if (var8.anInt1698 * -100857069 == -1 && var8.transformIds == null) {
							var30 = var8.method860(4, 4 + var4, var11, var12, var13, var14);
							var29 = var8.method860(4, var19 + 4, var11, var12, var13, var14);
						} else {
							var30 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, -100857069 * var8.anInt1698,
									true, (Entity) null);
							var29 = new DynamicObject(var3, 4, 4 + var19, var0, var1, var2, -100857069 * var8.anInt1698,
									true, (Entity) null);
						}

						var6.addBoundaryDecoration(var0, var1, var2, var13, (Entity) var30, (Entity) var29, 256, var4,
								Class39.anIntArray440[var4] * var28, var28 * Class39.anIntArray437[var4], var22, var23);
					}
				}
			} else {
				if (-100857069 * var8.anInt1698 == -1 && var8.transformIds == null) {
					var27 = var8.method860(10, var4, var11, var12, var13, var14);
				} else {
					var27 = new DynamicObject(var3, 10, var4, var0, var1, var2, -100857069 * var8.anInt1698, true,
							(Entity) null);
				}

				if (var27 != null && var6.method18(var0, var1, var2, var13, var9, var16, (Entity) var27,
						var5 == 11 ? 256 : 0, var22, var23) && var8.clipped) {
					var10 = 15;
					if (var27 instanceof Model) {
						var10 = ((Model) var27).method1000() / 4;
						if (var10 > 30) {
							var10 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var20 = 0; var20 <= var16; ++var20) {
							if (var10 > Class39.aByteArrayArrayArray430[var0][var24 + var1][var20 + var2]) {
								Class39.aByteArrayArrayArray430[var0][var1 + var24][var2 + var20] = (byte) var10;
							}
						}
					}
				}

				if (var8.anInt1690 * -1030255905 != 0 && var7 != null) {
					var7.method234(var1, var2, var9, var16, var8.aBool1714);
				}

			}
		}
	}

	public static final Class8 method651(Class63 var0, Component var1, int var2, int var3) {
		if (-954458055 * Class8.anInt157 == 0) {
			throw new IllegalStateException();
		} else if (var2 >= 0 && var2 < 2) {
			if (var3 < 256) {
				var3 = 256;
			}

			try {
				Class8_Sub2 var7 = new Class8_Sub2();
				var7.anIntArray160 = new int[(Class8.aBool166 ? 2 : 1) * 256];
				var7.anInt165 = var3 * -256373011;
				var7.method87(var1);
				var7.anInt164 = ((var3 & -1024) + 1024) * 505031113;
				if (-105889671 * var7.anInt164 > 16384) {
					var7.anInt164 = -1972224000;
				}

				var7.method88(-105889671 * var7.anInt164);
				if (-2110982975 * Class8.anInt172 > 0 && Class8.aClass19_156 == null) {
					Class8.aClass19_156 = new Class19();
					Class8.aClass19_156.aClass63_263 = var0;
					var0.method313(Class8.aClass19_156, Class8.anInt172 * -2110982975);
				}

				if (Class8.aClass19_156 != null) {
					if (Class8.aClass19_156.aClass8Array264[var2] != null) {
						throw new IllegalArgumentException();
					}

					Class8.aClass19_156.aClass8Array264[var2] = var7;
				}

				return var7;
			} catch (Throwable var6) {
				try {
					Class8_Sub1 var4 = new Class8_Sub1(var0, var2);
					var4.anIntArray160 = new int[256 * (Class8.aBool166 ? 2 : 1)];
					var4.anInt165 = -256373011 * var3;
					var4.method87(var1);
					var4.anInt164 = -1972224000;
					var4.method88(-105889671 * var4.anInt164);
					if (-2110982975 * Class8.anInt172 > 0 && Class8.aClass19_156 == null) {
						Class8.aClass19_156 = new Class19();
						Class8.aClass19_156.aClass63_263 = var0;
						var0.method313(Class8.aClass19_156, -2110982975 * Class8.anInt172);
					}

					if (Class8.aClass19_156 != null) {
						if (Class8.aClass19_156.aClass8Array264[var2] != null) {
							throw new IllegalArgumentException();
						}

						Class8.aClass19_156.aClass8Array264[var2] = var4;
					}

					return var4;
				} catch (Throwable var5) {
					return new Class8();
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static void method652(boolean var0) {
		if (Class81.aClass60_666 != null) {
			try {
				ByteBuf var1 = new ByteBuf(4);
				var1.putByte(var0 ? 2 : 3);
				var1.putMedium(0);
				Class81.aClass60_666.write(var1.payload, 0, 4);
			} catch (IOException var4) {
				try {
					Class81.aClass60_666.shutdown();
				} catch (Exception var3) {
					;
				}

				Class81.anInt684 += -1096754175;
				Class81.aClass60_666 = null;
			}

		}
	}
}
