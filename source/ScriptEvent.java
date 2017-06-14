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

	static final void addObject(int level, int tileX, int tileY, int objId, int orientation, int type, Landscape landscape,
			CollisionMap collision) {
		if (!Client.lowMemory || (Scene.renderFlags[0][tileX][tileY] & 0x2) != 0
				|| (Scene.renderFlags[level][tileX][tileY] & 0x10) == 0) {
			if (level < Scene.level) {
				Scene.level = level;
			}

			ObjectType objType = Class37.getObjectType(objId);
			int sizeX;
			int sizeY;
			if (orientation != 1 && orientation != 3) {
				sizeX = objType.sizeX;
				sizeY = objType.sizeY;
			} else {
				sizeX = objType.sizeY;
				sizeY = objType.sizeX;
			}

			int x;
			int x1;
			if (sizeX + tileX <= 104) {
				x = (sizeX >> 1) + tileX;
				x1 = (sizeX + 1 >> 1) + tileX;
			} else {
				x = tileX;
				x1 = tileX + 1;
			}

			int y1;
			int y;
			if (tileY + sizeY <= 104) {
				y1 = (sizeY >> 1) + tileY;
				y = (sizeY + 1 >> 1) + tileY;
			} else {
				y1 = tileY;
				y = tileY + 1;
			}

			int[][] heightMap = Scene.tileHeights[level];
			int averageY = heightMap[x][y] + heightMap[x1][y1] + heightMap[x][y1] + heightMap[x1][y] >> 2;
			int var12 = (sizeX << 6) + (tileX << 7);
			int var14 = (tileY << 7) + (sizeY << 6);
			int bitset = (objId << 14) + 1073741824 + (tileY << 7) + tileX;
			if (objType.anInt1692 == 0) {
				bitset -= Integer.MIN_VALUE;
			}

			int info = (orientation << 6) + type;
			if (objType.anInt1713 == 1) {
				info += 256;
			}

			int var10;
			int var24;
			if (objType.method865()) {
				Node_Sub6 var27 = new Node_Sub6();
				var27.anInt1270 = level;
				var27.anInt1271 = tileX * 128;
				var27.anInt1272 = tileY * 128;
				var10 = objType.sizeX;
				var24 = objType.sizeY;
				if (orientation == 1 || orientation == 3) {
					var10 = objType.sizeY;
					var24 = objType.sizeX;
				}

				var27.anInt1269 = (var10 + tileX) * 128;
				var27.anInt1275 = (tileY + var24) * 128;
				var27.anInt1281 = objType.anInt1715;
				var27.anInt1282 = objType.anInt1716 * 1545946752;
				var27.anInt1277 = objType.anInt1687 * -1875457101;
				var27.anInt1278 = objType.anInt1717;
				var27.anIntArray1273 = objType.anIntArray1697;
				if (objType.transformIds != null) {
					var27.anObjectDefinition1283 = objType;
					var27.method536(424061730);
				}

				Node_Sub6.aDeque1279.addFront(var27);
				if (var27.anIntArray1273 != null) {
					var27.anInt1274 = var27.anInt1277
							+ (int) (Math.random() * (double) (var27.anInt1278 - var27.anInt1277));
				}
			}

			Object model;
			if (type == 22) {
				if (!Client.lowMemory || objType.anInt1692 != 0 || objType.interactType == 1 || objType.aBool1711) {
					if (objType.anInt1698 == -1 && objType.transformIds == null) {
						model = objType.getModel(22, orientation, heightMap, var12, averageY, var14);
					} else {
						model = new DynamicObject(objId, 22, orientation, level, tileX, tileY, objType.anInt1698, true,
								(Entity) null);
					}

					landscape.addTileDecoration(level, tileX, tileY, averageY, (Entity) model, bitset, info);
					if (objType.interactType == 1 && collision != null) {
						collision.block(tileX, tileY);
					}
				}
			} else {
				int var20;
				if (type != 10 && type != 11) {
					if (type >= 12) {
						if (objType.anInt1698 == -1 && objType.transformIds == null) {
							model = objType.getModel(type, orientation, heightMap, var12, averageY, var14);
						} else {
							model = new DynamicObject(objId, type, orientation, level, tileX, tileY, objType.anInt1698, true,
									(Entity) null);
						}

						landscape.method18(level, tileX, tileY, averageY, 1, 1, (Entity) model, 0, bitset, info);
						if (type >= 12 && type <= 17 && type != 13 && level > 0) {
							Scene.occludeFlags[level][tileX][tileY] |= 2340;
						}

						if (objType.interactType != 0 && collision != null) {
							collision.addObject(tileX, tileY, sizeX, sizeY, objType.aBool1714);
						}
					} else if (type == 0) {
						if (objType.anInt1698 == -1 && objType.transformIds == null) {
							model = objType.getModel(0, orientation, heightMap, var12, averageY, var14);
						} else {
							model = new DynamicObject(objId, 0, orientation, level, tileX, tileY, objType.anInt1698, true,
									(Entity) null);
						}

						landscape.addBoundary(level, tileX, tileY, averageY, (Entity) model, (Entity) null,
								Scene.WALL_ROTATION_TYPE1[orientation], 0, bitset, info);
						if (orientation == 0) {
							if (objType.clipped) {
								Scene.shadowMap[level][tileX][tileY] = 50;
								Scene.shadowMap[level][tileX][tileY + 1] = 50;
							}

							if (objType.modelClipped) {
								Scene.occludeFlags[level][tileX][tileY] |= 585;
							}
						} else if (orientation == 1) {
							if (objType.clipped) {
								Scene.shadowMap[level][tileX][tileY + 1] = 50;
								Scene.shadowMap[level][tileX + 1][tileY + 1] = 50;
							}

							if (objType.modelClipped) {
								Scene.occludeFlags[level][tileX][tileY + 1] |= 1170;
							}
						} else if (orientation == 2) {
							if (objType.clipped) {
								Scene.shadowMap[level][tileX + 1][tileY] = 50;
								Scene.shadowMap[level][tileX + 1][tileY + 1] = 50;
							}

							if (objType.modelClipped) {
								Scene.occludeFlags[level][tileX + 1][tileY] |= 585;
							}
						} else if (orientation == 3) {
							if (objType.clipped) {
								Scene.shadowMap[level][tileX][tileY] = 50;
								Scene.shadowMap[level][tileX + 1][tileY] = 50;
							}

							if (objType.modelClipped) {
								Scene.occludeFlags[level][tileX][tileY] |= 1170;
							}
						}

						if (objType.interactType != 0 && collision != null) {
							collision.addWall(tileX, tileY, type, orientation, objType.aBool1714);
						}

						if (objType.anInt1699 != 16) {
							landscape.method24(level, tileX, tileY, objType.anInt1699);
						}
					} else if (type == 1) {
						if (objType.anInt1698 == -1 && objType.transformIds == null) {
							model = objType.getModel(1, orientation, heightMap, var12, averageY, var14);
						} else {
							model = new DynamicObject(objId, 1, orientation, level, tileX, tileY, objType.anInt1698, true,
									(Entity) null);
						}

						landscape.addBoundary(level, tileX, tileY, averageY, (Entity) model, (Entity) null,
								Scene.WALL_ROTATION_TYPE2[orientation], 0, bitset, info);
						if (objType.clipped) {
							if (orientation == 0) {
								Scene.shadowMap[level][tileX][tileY + 1] = 50;
							} else if (orientation == 1) {
								Scene.shadowMap[level][tileX + 1][tileY + 1] = 50;
							} else if (orientation == 2) {
								Scene.shadowMap[level][tileX + 1][tileY] = 50;
							} else if (orientation == 3) {
								Scene.shadowMap[level][tileX][tileY] = 50;
							}
						}

						if (objType.interactType != 0 && collision != null) {
							collision.addWall(tileX, tileY, type, orientation, objType.aBool1714);
						}
					} else {
						Object model2;
						if (type == 2) {
							int nextOrientation = orientation + 1 & 0x3;
							Object model1;
							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model1 = objType.getModel(2, orientation + 4, heightMap, var12, averageY, var14);
								model2 = objType.getModel(2, nextOrientation, heightMap, var12, averageY, var14);
							} else {
								model1 = new DynamicObject(objId, 2, orientation + 4, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
								model2 = new DynamicObject(objId, 2, nextOrientation, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.addBoundary(level, tileX, tileY, averageY, (Entity) model1, (Entity) model2,
									Scene.WALL_ROTATION_TYPE1[orientation], Scene.WALL_ROTATION_TYPE1[nextOrientation], bitset, info);
							if (objType.modelClipped) {
								if (orientation == 0) {
									Scene.occludeFlags[level][tileX][tileY] |= 585;
									Scene.occludeFlags[level][tileX][tileY + 1] |= 1170;
								} else if (orientation == 1) {
									Scene.occludeFlags[level][tileX][tileY + 1] |= 1170;
									Scene.occludeFlags[level][tileX + 1][tileY] |= 585;
								} else if (orientation == 2) {
									Scene.occludeFlags[level][tileX + 1][tileY] |= 585;
									Scene.occludeFlags[level][tileX][tileY] |= 1170;
								} else if (orientation == 3) {
									Scene.occludeFlags[level][tileX][tileY] |= 1170;
									Scene.occludeFlags[level][tileX][tileY] |= 585;
								}
							}

							if (objType.interactType != 0 && collision != null) {
								collision.addWall(tileX, tileY, type, orientation, objType.aBool1714);
							}

							if (objType.anInt1699 != 16) {
								landscape.method24(level, tileX, tileY, objType.anInt1699);
							}
						} else if (type == 3) {
							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model = objType.getModel(3, orientation, heightMap, var12, averageY, var14);
							} else {
								model = new DynamicObject(objId, 3, orientation, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.addBoundary(level, tileX, tileY, averageY, (Entity) model, (Entity) null,
									Scene.WALL_ROTATION_TYPE2[orientation], 0, bitset, info);
							if (objType.clipped) {
								if (orientation == 0) {
									Scene.shadowMap[level][tileX][tileY + 1] = 50;
								} else if (orientation == 1) {
									Scene.shadowMap[level][tileX + 1][tileY + 1] = 50;
								} else if (orientation == 2) {
									Scene.shadowMap[level][tileX + 1][tileY] = 50;
								} else if (orientation == 3) {
									Scene.shadowMap[level][tileX][tileY] = 50;
								}
							}

							if (objType.interactType != 0 && collision != null) {
								collision.addWall(tileX, tileY, type, orientation, objType.aBool1714);
							}
						} else if (type == 9) {
							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model = objType.getModel(type, orientation, heightMap, var12, averageY, var14);
							} else {
								model = new DynamicObject(objId, type, orientation, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.method18(level, tileX, tileY, averageY, 1, 1, (Entity) model, 0, bitset, info);
							if (objType.interactType != 0 && collision != null) {
								collision.addObject(tileX, tileY, sizeX, sizeY, objType.aBool1714);
							}

							if (objType.anInt1699 != 16) {
								landscape.method24(level, tileX, tileY, objType.anInt1699);
							}
						} else if (type == 4) {
							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model = objType.getModel(4, orientation, heightMap, var12, averageY, var14);
							} else {
								model = new DynamicObject(objId, 4, orientation, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.addBoundaryDecoration(level, tileX, tileY, averageY, (Entity) model, (Entity) null,
									Scene.WALL_ROTATION_TYPE1[orientation], 0, 0, 0, bitset, info);
						} else if (type == 5) {
							var20 = 16;
							var10 = landscape.method53(level, tileX, tileY);
							if (var10 != 0) {
								var20 = Class37.getObjectType(var10 >> 14 & 0x7fff).anInt1699;
							}

							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model2 = objType.getModel(4, orientation, heightMap, var12, averageY, var14);
							} else {
								model2 = new DynamicObject(objId, 4, orientation, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.addBoundaryDecoration(level, tileX, tileY, averageY, (Entity) model2, (Entity) null,
									Scene.WALL_ROTATION_TYPE1[orientation], 0, Scene.WALL_DECO_ROT_SIZE_X_DIR[orientation] * var20,
									Scene.WALL_DECO_ROT_SIZE_Y_DIR[orientation] * var20, bitset, info);
						} else if (type == 6) {
							var20 = 8;
							var10 = landscape.method53(level, tileX, tileY);
							if (var10 != 0) {
								var20 = Class37.getObjectType(var10 >> 14 & 0x7fff).anInt1699 / 2;
							}

							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model2 = objType.getModel(4, orientation + 4, heightMap, var12, averageY, var14);
							} else {
								model2 = new DynamicObject(objId, 4, orientation + 4, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.addBoundaryDecoration(level, tileX, tileY, averageY, (Entity) model2, (Entity) null, 256,
									orientation, Scene.SEQ_DECO_ROT_SIZE_X_DIR[orientation] * var20, Scene.SEQ_DECO_ROT_SIZE_Y_DIR[orientation] * var20,
									bitset, info);
						} else if (type == 7) {
							var10 = orientation + 2 & 0x3;
							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model = objType.getModel(4, var10 + 4, heightMap, var12, averageY, var14);
							} else {
								model = new DynamicObject(objId, 4, var10 + 4, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.addBoundaryDecoration(level, tileX, tileY, averageY, (Entity) model, (Entity) null, 256,
									var10, 0, 0, bitset, info);
						} else if (type == 8) {
							var20 = 8;
							var10 = landscape.method53(level, tileX, tileY);
							if (var10 != 0) {
								var20 = Class37.getObjectType(var10 >> 14 & 0x7fff).anInt1699 / 2;
							}

							int nnextOrientation = orientation + 2 & 0x3;
							Object model3;
							if (objType.anInt1698 == -1 && objType.transformIds == null) {
								model2 = objType.getModel(4, orientation + 4, heightMap, var12, averageY, var14);
								model3 = objType.getModel(4, nnextOrientation + 4, heightMap, var12, averageY, var14);
							} else {
								model2 = new DynamicObject(objId, 4, orientation + 4, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
								model3 = new DynamicObject(objId, 4, nnextOrientation + 4, level, tileX, tileY, objType.anInt1698, true,
										(Entity) null);
							}

							landscape.addBoundaryDecoration(level, tileX, tileY, averageY, (Entity) model2, (Entity) model3, 256,
									orientation, Scene.SEQ_DECO_ROT_SIZE_X_DIR[orientation] * var20, Scene.SEQ_DECO_ROT_SIZE_Y_DIR[orientation] * var20,
									bitset, info);
						}
					}
				} else {
					if (objType.anInt1698 == -1 && objType.transformIds == null) {
						model = objType.getModel(10, orientation, heightMap, var12, averageY, var14);
					} else {
						model = new DynamicObject(objId, 10, orientation, level, tileX, tileY, objType.anInt1698, true,
								(Entity) null);
					}

					if (model != null && landscape.method18(level, tileX, tileY, averageY, sizeX, sizeY, (Entity) model,
							type == 11 ? 256 : 0, bitset, info) && objType.clipped) {
						var10 = 15;
						if (model instanceof Model) {
							var10 = ((Model) model).method1000() / 4;
							if (var10 > 30) {
								var10 = 30;
							}
						}

						for (var24 = 0; var24 <= sizeX; var24++) {
							for (var20 = 0; var20 <= sizeY; var20++) {
								if (var10 > Scene.shadowMap[level][var24 + tileX][var20 + tileY]) {
									Scene.shadowMap[level][tileX + var24][tileY + var20] = (byte) var10;
								}
							}
						}
					}

					if (objType.interactType != 0 && collision != null) {
						collision.addObject(tileX, tileY, sizeX, sizeY, objType.aBool1714);
					}
				}
			}
		}

	}

	public static final AbstractSoundSystem createSystem(TaskManager task, Component canvas, int systemId, int var3) {
		if (AbstractSoundSystem.sampleRate == 0) {
			throw new IllegalStateException();
		} else if (systemId >= 0 && systemId < 2) {
			try {
				SourceDataSoundSystem syste = new SourceDataSoundSystem();
				syste.samples = new int[(AbstractSoundSystem.highMemory ? 2 : 1) * 256];
				syste.anInt165 = var3;
				syste.create(canvas);
				syste.offset = (var3 & 0xfffffc00) + 1024;
				if (syste.offset > 16384) {
					syste.offset = 16384;
				}

				syste.create(syste.offset);
				if (AbstractSoundSystem.priority > 0 && AbstractSoundSystem.task == null) {
					AbstractSoundSystem.task = new SoundTask();
					AbstractSoundSystem.task.manager = task;
					task.createRunnable(AbstractSoundSystem.task, AbstractSoundSystem.priority);
				}

				if (AbstractSoundSystem.task != null) {
					if (AbstractSoundSystem.task.systems[systemId] != null) {
						throw new IllegalArgumentException();
					}

					AbstractSoundSystem.task.systems[systemId] = syste;
				}

				return syste;
			} catch (Throwable var7) {
				try {
					ImplSoundSystem system = new ImplSoundSystem(task, systemId);
					system.samples = new int[256 * (AbstractSoundSystem.highMemory ? 2 : 1)];
					system.anInt165 = var3;
					system.create(canvas);
					system.offset = 16384;
					system.create(system.offset);
					if (AbstractSoundSystem.priority > 0 && AbstractSoundSystem.task == null) {
						AbstractSoundSystem.task = new SoundTask();
						AbstractSoundSystem.task.manager = task;
						task.createRunnable(AbstractSoundSystem.task, AbstractSoundSystem.priority);
					}

					if (AbstractSoundSystem.task != null) {
						if (AbstractSoundSystem.task.systems[systemId] != null) {
							throw new IllegalArgumentException();
						}

						AbstractSoundSystem.task.systems[systemId] = system;
					}

					return system;
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
