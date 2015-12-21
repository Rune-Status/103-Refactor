
public class RuneScript extends DualNode {

	int[] opcodes;
	int intArgCount;
	String[] stringOperands;
	public static Class13 aClass13_1721;
	int stringArgCount;
	int intStackCount;
	static int anInt1722;
	int[] intOperands;
	static CacheIndex aClass87_Sub1_1723;
	static int[] anIntArray1724;
	static Sprite minimapSprite;
	static Class106 aClass106_1725 = new Class106(128);
	int stringStackCount;

	public static void method872(Class42 var0) {
		Class120.aClass42_806 = var0;
	}

	static final void prcoessSceneFrame() {
		int var0;
		int var1;
		int var2;
		int var3;
		GroundItem var29;
		if (793368497 * Client.frameId == 36) {
			var0 = Client.inBuffer.getULEShort();
			var1 = Client.inBuffer.getUByteA();
			var2 = 1413480759 * InterfaceNode.anInt1400 + (var1 >> 4 & 7);
			var3 = (var1 & 7) + Player.anInt1988 * 40472155;
			if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
				Deque var30 = Client.groundItemDeque[InterfaceNode.floorLevel * -747958745][var2][var3];
				if (var30 != null) {
					for (var29 = (GroundItem) var30.method471(); var29 != null; var29 = (GroundItem) var30
							.method473()) {
						if ((var0 & 32767) == -848428919 * var29.anInt1842) {
							var29.unlink();
							break;
						}
					}

					if (var30.method471() == null) {
						Client.groundItemDeque[InterfaceNode.floorLevel * -747958745][var2][var3] = null;
					}

					Class32.method195(var2, var3);
				}
			}

		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var9;
			if (793368497 * Client.frameId == 15) {
				var0 = Client.inBuffer.getUByte();
				var1 = 1413480759 * InterfaceNode.anInt1400 + (var0 >> 4 & 7);
				var2 = Player.anInt1988 * 40472155 + (var0 & 7);
				var3 = Client.inBuffer.getUShort();
				var4 = Client.inBuffer.getUByte();
				var5 = var4 >> 4 & 15;
				var6 = var4 & 7;
				var9 = Client.inBuffer.getUByte();
				if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
					var7 = var5 + 1;
					if (Class68.myPlayer.anIntArray1945[0] >= var1 - var7
							&& Class68.myPlayer.anIntArray1945[0] <= var1 + var7
							&& Class68.myPlayer.anIntArray1955[0] >= var2 - var7
							&& Class68.myPlayer.anIntArray1955[0] <= var7 + var2 && Client.anInt2205 * 873913835 != 0
							&& var6 > 0 && 2079336095 * Client.audioEffectCount < 50) {
						Client.anIntArray2206[Client.audioEffectCount * 2079336095] = var3;
						Client.anIntArray2073[2079336095 * Client.audioEffectCount] = var6;
						Client.anIntArray2029[2079336095 * Client.audioEffectCount] = var9;
						Client.aClass14Array2210[2079336095 * Client.audioEffectCount] = null;
						Client.anIntArray2209[2079336095 * Client.audioEffectCount] = var5 + (var1 << 16) + (var2 << 8);
						Client.audioEffectCount += -857377441;
					}
				}
			}

			if (Client.frameId * 793368497 == 220) {
				var0 = Client.inBuffer.getUByte();
				var1 = 1413480759 * InterfaceNode.anInt1400 + (var0 >> 4 & 7);
				var2 = (var0 & 7) + Player.anInt1988 * 40472155;
				var3 = Client.inBuffer.getUShort();
				var4 = Client.inBuffer.getUShort();
				var5 = Client.inBuffer.getUShort();
				if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
					Deque var33 = Client.groundItemDeque[-747958745 * InterfaceNode.floorLevel][var1][var2];
					if (var33 != null) {
						for (GroundItem var39 = (GroundItem) var33
								.method471(); var39 != null; var39 = (GroundItem) var33.method473()) {
							if ((var3 & 32767) == -848428919 * var39.anInt1842 && var4 == 1308808435 * var39.quantity) {
								var39.quantity = var5 * 1605264443;
								break;
							}
						}

						Class32.method195(var1, var2);
					}
				}

			} else {
				int var40;
				if (793368497 * Client.frameId == 25) {
					var0 = Client.inBuffer.getUByte();
					var1 = var0 >> 2;
					var2 = var0 & 3;
					var3 = Client.anIntArray2056[var1];
					var4 = Client.inBuffer.getUByte();
					var5 = InterfaceNode.anInt1400 * 1413480759 + (var4 >> 4 & 7);
					var6 = 40472155 * Player.anInt1988 + (var4 & 7);
					var9 = Client.inBuffer.getUShort();
					if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
						if (var3 == 0) {
							BoundaryStub var32 = InterfaceNode.landscape.method21(InterfaceNode.floorLevel * -747958745,
									var5, var6);
							if (var32 != null) {
								var40 = var32.anInt277 * 785572969 >> 14 & 32767;
								if (var1 == 2) {
									var32.entityA = new DynamicObject(var40, 2, var2 + 4,
											InterfaceNode.floorLevel * -747958745, var5, var6, var9, false,
											var32.entityA);
									var32.entityB = new DynamicObject(var40, 2, var2 + 1 & 3,
											InterfaceNode.floorLevel * -747958745, var5, var6, var9, false,
											var32.entityB);
								} else {
									var32.entityA = new DynamicObject(var40, var1, var2,
											-747958745 * InterfaceNode.floorLevel, var5, var6, var9, false,
											var32.entityA);
								}
							}
						}

						if (var3 == 1) {
							BoundaryDecorationStub var34 = InterfaceNode.landscape
									.method29(InterfaceNode.floorLevel * -747958745, var5, var6);
							if (var34 != null) {
								var40 = var34.anInt218 * 1286385391 >> 14 & 32767;
								if (var1 != 4 && var1 != 5) {
									if (var1 == 6) {
										var34.entityA = new DynamicObject(var40, 4, 4 + var2,
												InterfaceNode.floorLevel * -747958745, var5, var6, var9, false,
												var34.entityA);
									} else if (var1 == 7) {
										var34.entityA = new DynamicObject(var40, 4, (var2 + 2 & 3) + 4,
												InterfaceNode.floorLevel * -747958745, var5, var6, var9, false,
												var34.entityA);
									} else if (var1 == 8) {
										var34.entityA = new DynamicObject(var40, 4, 4 + var2,
												-747958745 * InterfaceNode.floorLevel, var5, var6, var9, false,
												var34.entityA);
										var34.entityB = new DynamicObject(var40, 4, 4 + (var2 + 2 & 3),
												-747958745 * InterfaceNode.floorLevel, var5, var6, var9, false,
												var34.entityB);
									}
								} else {
									var34.entityA = new DynamicObject(var40, 4, var2,
											-747958745 * InterfaceNode.floorLevel, var5, var6, var9, false,
											var34.entityA);
								}
							}
						}

						if (var3 == 2) {
							EntityMarker var35 = InterfaceNode.landscape.method30(-747958745 * InterfaceNode.floorLevel,
									var5, var6);
							if (var1 == 11) {
								var1 = 10;
							}

							if (var35 != null) {
								var35.entity = new DynamicObject(714123667 * var35.anInt269 >> 14 & 32767, var1, var2,
										-747958745 * InterfaceNode.floorLevel, var5, var6, var9, false, var35.entity);
							}
						}

						if (var3 == 3) {
							TileDecorationStub var36 = InterfaceNode.landscape
									.method59(InterfaceNode.floorLevel * -747958745, var5, var6);
							if (var36 != null) {
								var36.entity = new DynamicObject(827739875 * var36.anInt839 >> 14 & 32767, 22, var2,
										-747958745 * InterfaceNode.floorLevel, var5, var6, var9, false, var36.entity);
							}
						}
					}

				} else if (Client.frameId * 793368497 == 147) {
					var0 = Client.inBuffer.getUByteA();
					var1 = 1413480759 * InterfaceNode.anInt1400 + (var0 >> 4 & 7);
					var2 = (var0 & 7) + 40472155 * Player.anInt1988;
					var3 = Client.inBuffer.getUShortA();
					var4 = Client.inBuffer.getUShortA();
					if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
						var29 = new GroundItem();
						var29.anInt1842 = -1402243655 * var3;
						var29.quantity = 1605264443 * var4;
						if (Client.groundItemDeque[-747958745 * InterfaceNode.floorLevel][var1][var2] == null) {
							Client.groundItemDeque[InterfaceNode.floorLevel * -747958745][var1][var2] = new Deque();
						}

						Client.groundItemDeque[InterfaceNode.floorLevel * -747958745][var1][var2].method475(var29);
						Class32.method195(var1, var2);
					}

				} else if (793368497 * Client.frameId == 182) {
					var0 = Client.inBuffer.getUByteS();
					var1 = (var0 >> 4 & 7) + InterfaceNode.anInt1400 * 1413480759;
					var2 = 40472155 * Player.anInt1988 + (var0 & 7);
					var3 = Client.inBuffer.getUByte();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = Client.anIntArray2056[var4];
					if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
						NpcDefinition.method805(InterfaceNode.floorLevel * -747958745, var1, var2, var6, -1, var4, var5,
								0, -1);
					}

				} else if (Client.frameId * 793368497 == 231) {
					var0 = Client.inBuffer.getUByte();
					var1 = (var0 >> 4 & 7) + InterfaceNode.anInt1400 * 1413480759;
					var2 = 40472155 * Player.anInt1988 + (var0 & 7);
					var3 = Client.inBuffer.getUShort();
					var4 = Client.inBuffer.getUByte();
					var5 = Client.inBuffer.getUShort();
					if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
						var1 = var1 * 128 + 64;
						var2 = 128 * var2 + 64;
						GraphicsStub var31 = new GraphicsStub(var3, InterfaceNode.floorLevel * -747958745, var1, var2,
								NpcDefinition.method802(var1, var2, -747958745 * InterfaceNode.floorLevel) - var4, var5,
								Client.engineCycle * -1040073859);
						Client.graphicsObjectDeque.method475(var31);
					}

				} else {
					int var8;
					int var23;
					if (Client.frameId * 793368497 == 108) {
						var0 = Client.inBuffer.getUByte();
						var1 = (var0 >> 4 & 7) + 1413480759 * InterfaceNode.anInt1400;
						var2 = (var0 & 7) + 40472155 * Player.anInt1988;
						var3 = var1 + Client.inBuffer.getByte();
						var4 = var2 + Client.inBuffer.getByte();
						var5 = Client.inBuffer.getShort();
						var6 = Client.inBuffer.getUShort();
						var9 = Client.inBuffer.getUByte() * 4;
						var7 = Client.inBuffer.getUByte() * 4;
						var40 = Client.inBuffer.getUShort();
						int var41 = Client.inBuffer.getUShort();
						var23 = Client.inBuffer.getUByte();
						var8 = Client.inBuffer.getUByte();
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104
								&& var4 < 104 && var6 != '\uffff') {
							var1 = 128 * var1 + 64;
							var2 = 128 * var2 + 64;
							var3 = var3 * 128 + 64;
							var4 = 64 + 128 * var4;
							Projectile var38 = new Projectile(var6, InterfaceNode.floorLevel * -747958745, var1, var2,
									NpcDefinition.method802(var1, var2, InterfaceNode.floorLevel * -747958745) - var9,
									-1040073859 * Client.engineCycle + var40, var41 + Client.engineCycle * -1040073859,
									var23, var8, var5, var7);
							var38.method992(var3, var4,
									NpcDefinition.method802(var3, var4, InterfaceNode.floorLevel * -747958745) - var7,
									Client.engineCycle * -1040073859 + var40);
							Client.projectileDeque.method475(var38);
						}

					} else {
						if (Client.frameId * 793368497 == 5) {
							var0 = Client.inBuffer.getUByteC();
							var1 = var0 >> 2;
							var2 = var0 & 3;
							var3 = Client.anIntArray2056[var1];
							var4 = Client.inBuffer.getUByte();
							var5 = (var4 >> 4 & 7) + InterfaceNode.anInt1400 * 1413480759;
							var6 = (var4 & 7) + 40472155 * Player.anInt1988;
							byte var37 = Client.inBuffer.getByteA();
							var7 = Client.inBuffer.getULEShort();
							byte var11 = Client.inBuffer.getByteA();
							byte var22 = Client.inBuffer.getByteA();
							var23 = Client.inBuffer.getUShort();
							var8 = Client.inBuffer.getUShort();
							int var10 = Client.inBuffer.getULEShortA();
							byte var21 = Client.inBuffer.getByteS();
							Player var12;
							if (var8 == Client.myPlayerIndex * 1467227105) {
								var12 = Class68.myPlayer;
							} else {
								var12 = Client.playerArray[var8];
							}

							if (var12 != null) {
								ObjectDefinition var16 = Class37.getObjectDefinition(var10);
								int var13;
								int var24;
								if (var2 != 1 && var2 != 3) {
									var24 = var16.sizeX * 1162660975;
									var13 = -1976023901 * var16.sizeY;
								} else {
									var24 = -1976023901 * var16.sizeY;
									var13 = var16.sizeX * 1162660975;
								}

								int var25 = var5 + (var24 >> 1);
								int var26 = var5 + (var24 + 1 >> 1);
								int var27 = var6 + (var13 >> 1);
								int var28 = var6 + (1 + var13 >> 1);
								int[][] var17 = Class39.tileHeights[-747958745 * InterfaceNode.floorLevel];
								int var19 = var17[var25][var28] + var17[var25][var27] + var17[var26][var27]
										+ var17[var26][var28] >> 2;
								int var18 = (var24 << 6) + (var5 << 7);
								int var20 = (var13 << 6) + (var6 << 7);
								Model var15 = var16.method861(var1, var2, var17, var18, var19, var20);
								if (var15 != null) {
									NpcDefinition.method805(-747958745 * InterfaceNode.floorLevel, var5, var6, var3, -1,
											0, 0, var7 + 1, 1 + var23);
									var12.anInt1989 = (-1040073859 * Client.engineCycle + var7) * -1231551829;
									var12.anInt1990 = -802785219 * (var23 + Client.engineCycle * -1040073859);
									var12.aModel2001 = var15;
									var12.anInt1991 = 1203867520 * var5 + var24 * 601933760;
									var12.anInt1993 = 1790041472 * var6 + var13 * -1252462912;
									var12.anInt1992 = 1977780761 * var19;
									byte var14;
									if (var21 > var37) {
										var14 = var21;
										var21 = var37;
										var37 = var14;
									}

									if (var22 > var11) {
										var14 = var22;
										var22 = var11;
										var11 = var14;
									}

									var12.anInt1994 = -1149163057 * (var5 + var21);
									var12.anInt1987 = (var37 + var5) * 52718651;
									var12.anInt1995 = (var6 + var22) * 1085487497;
									var12.anInt1985 = -1263411125 * (var6 + var11);
								}
							}
						}

						if (Client.frameId * 793368497 == 189) {
							var0 = Client.inBuffer.getUByteA();
							var1 = (var0 >> 4 & 7) + 1413480759 * InterfaceNode.anInt1400;
							var2 = (var0 & 7) + Player.anInt1988 * 40472155;
							var3 = Client.inBuffer.getUByte();
							var4 = var3 >> 2;
							var5 = var3 & 3;
							var6 = Client.anIntArray2056[var4];
							var9 = Client.inBuffer.getUShort();
							if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
								NpcDefinition.method805(InterfaceNode.floorLevel * -747958745, var1, var2, var6, var9,
										var4, var5, 0, -1);
							}

						}
					}
				}
			}
		}
	}

}
