import java.util.Calendar;
import java.util.TimeZone;

public class Class53 {

	static Calendar aCalendar536;
	static String[] aStringArray537 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static String[][] aStringArrayArray538 = new String[][] {
			{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
			{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" } };

	Class53() throws Throwable {
		throw new Error();
	}

	static {
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		aCalendar536 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	static final void method272(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		RSGraphics.setDrawRegion(var2, var3, var4, var5);
		DualNode_Sub13_Sub1.method909();

		for (int var14 = 0; var14 < var0.length; ++var14) {
			Widget var15 = var0[var14];
			if (var15 != null
					&& (var1 == -1652479707 * var15.parentId || var1 == -1412584499 && Client.aWidget2141 == var15)) {
				int var18;
				if (var8 == -1) {
					Client.anIntArray2173[Client.anInt2168 * -580551879] = var6 + 332168295 * var15.relativeX;
					Client.anIntArray2174[-580551879 * Client.anInt2168] = var7 + var15.relativeY * 1492425953;
					Client.anIntArray2175[-580551879 * Client.anInt2168] = 1645211541 * var15.width;
					Client.anIntArray2176[-580551879 * Client.anInt2168] = var15.height * 1227800423;
					var18 = (Client.anInt2168 += 904200969) * -580551879 - 1;
				} else {
					var18 = var8;
				}

				var15.boundsIndex = var18 * -2140330043;
				var15.loopCycle = Client.engineCycle * -672967433;
				if (!var15.interactable || !IsaacRandom.method68(var15)) {
					if (var15.contentType * -179718399 > 0) {
						TileDecorationStub.method463(var15);
					}

					int var10 = var6 + 332168295 * var15.relativeX;
					int var11 = var7 + 1492425953 * var15.relativeY;
					int var19 = -1508397471 * var15.alpha;
					int var22;
					int var23;
					if (Client.aWidget2141 == var15) {
						if (var1 != -1412584499 && !var15.aBool1179) {
							Class6.aWidgetArray146 = var0;
							BoundaryStub.anInt276 = 959363241 * var6;
							Class75.anInt637 = 1028642145 * var7;
							continue;
						}

						if (Client.aBool2150 && Client.aBool2145) {
							var22 = -453286219 * Class74.anInt621;
							var23 = Class74.anInt622 * 103771565;
							var22 -= Client.anInt2127 * -725471655;
							var23 -= 702495857 * Client.anInt2143;
							if (var22 < 1272175975 * Client.anInt2146) {
								var22 = 1272175975 * Client.anInt2146;
							}

							if (1645211541 * var15.width + var22 > Client.aWidget2142.width * 1645211541
									+ Client.anInt2146 * 1272175975) {
								var22 = 1272175975 * Client.anInt2146 + Client.aWidget2142.width * 1645211541
										- var15.width * 1645211541;
							}

							if (var23 < Client.anInt2147 * -765593137) {
								var23 = -765593137 * Client.anInt2147;
							}

							if (var23 + var15.height * 1227800423 > 1227800423 * Client.aWidget2142.height
									+ -765593137 * Client.anInt2147) {
								var23 = -765593137 * Client.anInt2147 + 1227800423 * Client.aWidget2142.height
										- var15.height * 1227800423;
							}

							var10 = var22;
							var11 = var23;
						}

						if (!var15.aBool1179) {
							var19 = 128;
						}
					}

					int var9;
					int var13;
					int var16;
					int var28;
					int var29;
					int var31;
					if (var15.type * -1305917269 == 2) {
						var22 = var2;
						var23 = var3;
						var28 = var4;
						var29 = var5;
					} else if (var15.type * -1305917269 == 9) {
						var9 = var10;
						var16 = var11;
						var13 = var15.width * 1645211541 + var10;
						var31 = var15.height * 1227800423 + var11;
						if (var13 < var10) {
							var9 = var13;
							var13 = var10;
						}

						if (var31 < var11) {
							var16 = var31;
							var31 = var11;
						}

						++var13;
						++var31;
						var22 = var9 > var2 ? var9 : var2;
						var23 = var16 > var3 ? var16 : var3;
						var28 = var13 < var4 ? var13 : var4;
						var29 = var31 < var5 ? var31 : var5;
					} else {
						var9 = var15.width * 1645211541 + var10;
						var16 = 1227800423 * var15.height + var11;
						var22 = var10 > var2 ? var10 : var2;
						var23 = var11 > var3 ? var11 : var3;
						var28 = var9 < var4 ? var9 : var4;
						var29 = var16 < var5 ? var16 : var5;
					}

					if (!var15.interactable || var22 < var28 && var23 < var29) {
						int var24;
						int var25;
						int var26;
						int var27;
						int var30;
						int var34;
						int var35;
						int var36;
						int var37;
						int var38;
						int var39;
						int var40;
						if (-179718399 * var15.contentType != 0) {
							if (var15.contentType * -179718399 == 1336) {
								if (Client.displayFps) {
									var11 += 15;
									Client.aDualNode_Sub13_Sub3_Sub1_2047.method972(
											"Fps:" + Client.anInt1976 * 305420995, var10 + 1645211541 * var15.width,
											var11, 16776960, -1);
									var11 += 15;
									Runtime var56 = Runtime.getRuntime();
									var16 = (int) ((var56.totalMemory() - var56.freeMemory()) / 1024L);
									var13 = 16776960;
									if (var16 > '\u8000' && Client.aBool2010) {
										var13 = 16711680;
									}

									if (var16 > 65536 && !Client.aBool2010) {
										var13 = 16711680;
									}

									Client.aDualNode_Sub13_Sub3_Sub1_2047.method972("Mem:" + var16 + "k",
											var10 + 1645211541 * var15.width, var11, var13, -1);
									var11 += 15;
								}
								continue;
							}

							if (-179718399 * var15.contentType == 1337) {
								Client.anInt2122 = -247064981 * var10;
								Client.anInt2123 = -630066539 * var11;
								var13 = 1645211541 * var15.width;
								var31 = var15.height * 1227800423;
								Client.anInt2208 += -1632613309;
								EntityMarker.method140(Class1.aClass1_3);
								boolean var59 = false;
								if (971766913 * Client.anInt2111 >= 0) {
									var30 = -334270159 * GPI.localPlayerCount;
									int[] var72 = GPI.localPlayerIndices;

									for (var24 = 0; var24 < var30; ++var24) {
										if (971766913 * Client.anInt2111 == var72[var24]) {
											var59 = true;
											break;
										}
									}
								}

								if (var59) {
									EntityMarker.method140(Class1.aClass1_1);
								}

								Class49.method249(true);
								EntityMarker.method140(var59 ? Class1.aClass1_6 : Class1.aClass1_2);
								Class49.method249(false);
								Class28.method184();
								Class24.method162();
								Class13.method118(var10, var11, var13, var31, true);
								var9 = 1146064501 * Client.anInt2223;
								var16 = Client.anInt2224 * -990874927;
								var13 = 2112468213 * Client.screenHeight;
								var31 = -336695531 * Client.screenWidth;
								RSGraphics.setDrawRegion(var9, var16, var9 + var13, var31 + var16);
								DualNode_Sub13_Sub1.method909();
								int var20;
								if (!Client.aBool2046) {
									var30 = -1992036739 * Client.anInt2051;
									if (Client.anInt2119 * 137595259 / 256 > var30) {
										var30 = 137595259 * Client.anInt2119 / 256;
									}

									if (Client.aBoolArray2033[4] && Client.anIntArray2213[4] + 128 > var30) {
										var30 = 128 + Client.anIntArray2213[4];
									}

									var38 = Client.anInt2060 * -1913217891 + Client.minimapRotation * -1916997753
											& 2047;
									var24 = -2122646045 * GPI.anInt461;
									var40 = NpcDefinition.method802(1272643751 * Class68.myPlayer.strictX,
											Class68.myPlayer.strictY * -1801433343,
											-747958745 * InterfaceNode.floorLevel) - Client.anInt2185 * -868608503;
									var25 = 1406199355 * DualNode_Sub3.anInt1476;
									var26 = 3 * var30 + 600;
									var27 = 2048 - var30 & 2047;
									var37 = 2048 - var38 & 2047;
									var39 = 0;
									var34 = 0;
									var36 = var26;
									int var33;
									if (var27 != 0) {
										var35 = DualNode_Sub13_Sub1.SIN_TABLE[var27];
										var33 = DualNode_Sub13_Sub1.COS_TABLE[var27];
										var20 = var33 * var34 - var35 * var26 >> 16;
										var36 = var33 * var26 + var35 * var34 >> 16;
										var34 = var20;
									}

									if (var37 != 0) {
										var35 = DualNode_Sub13_Sub1.SIN_TABLE[var37];
										var33 = DualNode_Sub13_Sub1.COS_TABLE[var37];
										var20 = var33 * var39 + var35 * var36 >> 16;
										var36 = var33 * var36 - var39 * var35 >> 16;
										var39 = var20;
									}

									Projectile.cameraX = (var24 - var39) * 933251441;
									FriendedPlayer.cameraZ = (var40 - var34) * -1022442815;
									Class72.cameraY = (var25 - var36) * 1432154999;
									Class67.cameraPitch = 1852239419 * var30;
									Class65.cameraYaw = 531969645 * var38;
								}

								if (!Client.aBool2046) {
									var30 = Class56.method287();
								} else {
									var30 = Class48_Sub1.method544();
								}

								var38 = 282154897 * Projectile.cameraX;
								var24 = FriendedPlayer.cameraZ * 1447873857;
								var40 = -324676025 * Class72.cameraY;
								var25 = Class67.cameraPitch * 1162853107;
								var26 = Class65.cameraYaw * -210812059;

								for (var27 = 0; var27 < 5; ++var27) {
									if (Client.aBoolArray2033[var27]) {
										var37 = (int) (Math.random() * (double) (1 + Client.anIntArray2212[var27] * 2)
												- (double) Client.anIntArray2212[var27]
												+ Math.sin((double) Client.anIntArray2215[var27]
														* ((double) Client.anIntArray2216[var27] / 100.0D))
														* (double) Client.anIntArray2213[var27]);
										if (var27 == 0) {
											Projectile.cameraX += var37 * 933251441;
										}

										if (var27 == 1) {
											FriendedPlayer.cameraZ += var37 * -1022442815;
										}

										if (var27 == 2) {
											Class72.cameraY += var37 * 1432154999;
										}

										if (var27 == 3) {
											Class65.cameraYaw = 531969645
													* (Class65.cameraYaw * -210812059 + var37 & 2047);
										}

										if (var27 == 4) {
											Class67.cameraPitch += var37 * 1852239419;
											if (1162853107 * Class67.cameraPitch < 128) {
												Class67.cameraPitch = 863444352;
											}

											if (Class67.cameraPitch * 1162853107 > 383) {
												Class67.cameraPitch = 738093637;
											}
										}
									}
								}

								var27 = -453286219 * Class74.anInt621;
								var37 = Class74.anInt622 * 103771565;
								if (Class74.anInt627 * 823601801 != 0) {
									var27 = -2040065729 * Class74.anInt628;
									var37 = 2090526775 * Class74.anInt629;
								}

								if (var27 >= var9 && var27 < var9 + var13 && var37 >= var16 && var37 < var31 + var16) {
									Model.aBool1904 = true;
									Model.onCursorCount = 0;
									Model.anInt1905 = var27 - var9;
									Model.anInt1910 = var37 - var16;
								} else {
									Model.aBool1904 = false;
									Model.onCursorCount = 0;
								}

								Class34.method201();
								RSGraphics.method793(var9, var16, var13, var31, 0);
								Class34.method201();
								var39 = DualNode_Sub13_Sub1.anInt1784;
								DualNode_Sub13_Sub1.anInt1784 = -478819715 * Client.screenZoom;
								InterfaceNode.landscape.method39(Projectile.cameraX * 282154897,
										1447873857 * FriendedPlayer.cameraZ, -324676025 * Class72.cameraY,
										Class67.cameraPitch * 1162853107, Class65.cameraYaw * -210812059, var30);
								DualNode_Sub13_Sub1.anInt1784 = var39;
								Class34.method201();
								InterfaceNode.landscape.method50();
								Client.anInt2082 = 0;
								boolean var65 = false;
								var36 = -1;
								var35 = GPI.localPlayerCount * -334270159;
								int[] var63 = GPI.localPlayerIndices;

								for (var20 = 0; var20 < var35 + Client.anInt2225 * 727116725; ++var20) {
									Object var43;
									if (var20 < var35) {
										var43 = Client.playerArray[var63[var20]];
										if (971766913 * Client.anInt2111 == var63[var20]) {
											var65 = true;
											var36 = var20;
											continue;
										}
									} else {
										var43 = Client.npcArray[Client.npcIndices[var20 - var35]];
									}

									Class39.method215((Character) var43, var20, var9, var16, var13, var31);
								}

								if (var65) {
									Class39.method215(Client.playerArray[971766913 * Client.anInt2111], var36, var9,
											var16, var13, var31);
								}

								for (var20 = 0; var20 < -1673918139 * Client.anInt2082; ++var20) {
									int var73 = Client.anIntArray2084[var20];
									int var44 = Client.anIntArray2085[var20];
									int var45 = Client.anIntArray2087[var20];
									int var21 = Client.anIntArray2086[var20];
									boolean var46 = true;

									while (var46) {
										var46 = false;

										for (int var41 = 0; var41 < var20; ++var41) {
											if (2 + var44 > Client.anIntArray2085[var41] - Client.anIntArray2086[var41]
													&& var44 - var21 < Client.anIntArray2085[var41] + 2
													&& var73 - var45 < Client.anIntArray2084[var41]
															+ Client.anIntArray2087[var41]
													&& var73 + var45 > Client.anIntArray2084[var41]
															- Client.anIntArray2087[var41]
													&& Client.anIntArray2085[var41]
															- Client.anIntArray2086[var41] < var44) {
												var44 = Client.anIntArray2085[var41] - Client.anIntArray2086[var41];
												var46 = true;
											}
										}
									}

									Client.anInt2093 = Client.anIntArray2084[var20] * 1776163475;
									Client.anInt2094 = (Client.anIntArray2085[var20] = var44) * -192643311;
									String var71 = Client.aStringArray2090[var20];
									if (1839264745 * Client.anInt2133 == 0) {
										int var12 = 16776960;
										if (Client.anIntArray2088[var20] < 6) {
											var12 = Client.anIntArray2023[Client.anIntArray2088[var20]];
										}

										if (Client.anIntArray2088[var20] == 6) {
											var12 = -1317183381 * Client.anInt2208 % 20 < 10 ? 16711680 : 16776960;
										}

										if (Client.anIntArray2088[var20] == 7) {
											var12 = Client.anInt2208 * -1317183381 % 20 < 10 ? 255 : '\uffff';
										}

										if (Client.anIntArray2088[var20] == 8) {
											var12 = Client.anInt2208 * -1317183381 % 20 < 10 ? '\ub000' : 8454016;
										}

										int var32;
										if (Client.anIntArray2088[var20] == 9) {
											var32 = 150 - Client.anIntArray2132[var20];
											if (var32 < 50) {
												var12 = 1280 * var32 + 16711680;
											} else if (var32 < 100) {
												var12 = 16776960 - (var32 - 50) * 327680;
											} else if (var32 < 150) {
												var12 = 5 * (var32 - 100) + '\uff00';
											}
										}

										if (Client.anIntArray2088[var20] == 10) {
											var32 = 150 - Client.anIntArray2132[var20];
											if (var32 < 50) {
												var12 = var32 * 5 + 16711680;
											} else if (var32 < 100) {
												var12 = 16711935 - (var32 - 50) * 327680;
											} else if (var32 < 150) {
												var12 = 327680 * (var32 - 100) + 255 - 5 * (var32 - 100);
											}
										}

										if (Client.anIntArray2088[var20] == 11) {
											var32 = 150 - Client.anIntArray2132[var20];
											if (var32 < 50) {
												var12 = 16777215 - var32 * 327685;
											} else if (var32 < 100) {
												var12 = '\uff00' + (var32 - 50) * 327685;
											} else if (var32 < 150) {
												var12 = 16777215 - 327680 * (var32 - 100);
											}
										}

										if (Client.anIntArray2089[var20] == 0) {
											Class35.aDualNode_Sub13_Sub3_Sub1_386.method982(var71,
													Client.anInt2093 * -94432357 + var9,
													Client.anInt2094 * -770682383 + var16, var12, 0);
										}

										if (Client.anIntArray2089[var20] == 1) {
											Class35.aDualNode_Sub13_Sub3_Sub1_386.method964(var71,
													var9 + Client.anInt2093 * -94432357,
													Client.anInt2094 * -770682383 + var16, var12, 0,
													Client.anInt2208 * -1317183381);
										}

										if (Client.anIntArray2089[var20] == 2) {
											Class35.aDualNode_Sub13_Sub3_Sub1_386.method973(var71,
													var9 + -94432357 * Client.anInt2093,
													var16 + Client.anInt2094 * -770682383, var12, 0,
													-1317183381 * Client.anInt2208);
										}

										if (Client.anIntArray2089[var20] == 3) {
											Class35.aDualNode_Sub13_Sub3_Sub1_386.method974(var71,
													var9 + -94432357 * Client.anInt2093,
													var16 + -770682383 * Client.anInt2094, var12, 0,
													-1317183381 * Client.anInt2208, 150 - Client.anIntArray2132[var20]);
										}

										if (Client.anIntArray2089[var20] == 4) {
											var32 = (150 - Client.anIntArray2132[var20])
													* (Class35.aDualNode_Sub13_Sub3_Sub1_386.method967(var71) + 100)
													/ 150;
											RSGraphics.setInnerDrawRegion(Client.anInt2093 * -94432357 + var9 - 50, var16,
													var9 + Client.anInt2093 * -94432357 + 50, var16 + var31);
											Class35.aDualNode_Sub13_Sub3_Sub1_386.method980(var71,
													-94432357 * Client.anInt2093 + var9 + 50 - var32,
													var16 + -770682383 * Client.anInt2094, var12, 0);
											RSGraphics.setDrawRegion(var9, var16, var9 + var13, var16 + var31);
										}

										if (Client.anIntArray2089[var20] == 5) {
											var32 = 150 - Client.anIntArray2132[var20];
											int var42 = 0;
											if (var32 < 25) {
												var42 = var32 - 25;
											} else if (var32 > 125) {
												var42 = var32 - 125;
											}

											RSGraphics.setInnerDrawRegion(var9,
													-770682383 * Client.anInt2094 + var16
															- Class35.aDualNode_Sub13_Sub3_Sub1_386.anInt1824 - 1,
													var13 + var9, 5 + var16 + -770682383 * Client.anInt2094);
											Class35.aDualNode_Sub13_Sub3_Sub1_386.method982(var71,
													var9 + Client.anInt2093 * -94432357,
													Client.anInt2094 * -770682383 + var16 + var42, var12, 0);
											RSGraphics.setDrawRegion(var9, var16, var13 + var9, var31 + var16);
										}
									} else {
										Class35.aDualNode_Sub13_Sub3_Sub1_386.method982(var71,
												var9 + Client.anInt2093 * -94432357,
												-770682383 * Client.anInt2094 + var16, 16776960, 0);
									}
								}

								if (314519437 * Client.anInt2075 == 2) {
									Class2.method62(
											Client.anInt2116 * -1809686571 + (-1261526983 * Client.hintArrowX
													- 1426698711 * Node_Sub10.regionBaseX << 7),
											(Client.hintArrowY * -1901147055 - Class28.regionBaseY * 714823515 << 7)
													+ -1460280361 * Client.anInt2025,
											1818880718 * Client.anInt2032);
									if (-94432357 * Client.anInt2093 > -1
											&& Client.engineCycle * -1040073859 % 20 < 10) {
										Class39.aSpriteArray442[0].method946(-94432357 * Client.anInt2093 + var9 - 12,
												-770682383 * Client.anInt2094 + var16 - 28);
									}
								}

								((Class29) DualNode_Sub13_Sub1.anInterface3_1796)
										.method186(-1163930299 * Client.anInt2066);
								Class5.method71(var9, var16, var13, var31);
								Projectile.cameraX = 933251441 * var38;
								FriendedPlayer.cameraZ = var24 * -1022442815;
								Class72.cameraY = 1432154999 * var40;
								Class67.cameraPitch = var25 * 1852239419;
								Class65.cameraYaw = var26 * 531969645;
								if (Client.aBool2214) {
									byte var67 = 0;
									var36 = var67 + 1721465631 * Class81.anInt679 + 1018165549 * Class81.anInt670;
									if (var36 == 0) {
										Client.aBool2214 = false;
									}
								}

								if (Client.aBool2214) {
									RSGraphics.method793(var9, var16, var13, var31, 0);
									Class82.method363(GameStrings.aString852, false);
								}

								Client.aBoolArray2118[var15.boundsIndex * 1983233805] = true;
								RSGraphics.setDrawRegion(var2, var3, var4, var5);
								continue;
							}

							if (var15.contentType * -179718399 == 1338) {
								Node_Sub8.method547(var15, var10, var11, var18);
								RSGraphics.setDrawRegion(var2, var3, var4, var5);
								continue;
							}

							if (var15.contentType * -179718399 == 1339) {
								DualNode_Sub14 var55 = var15.method491(false);
								if (var55 != null) {
									if (-1797803011 * Client.anInt2200 < 3) {
										Class48_Sub1.aSprite1296.method957(var10, var11, var55.anInt1647 * 662480183,
												-988977157 * var55.anInt1648, 25, 25,
												Client.minimapRotation * -1916997753, 256, var55.anIntArray1646,
												var55.anIntArray1645);
									} else {
										RSGraphics.method792(var10, var11, 0, var55.anIntArray1646,
												var55.anIntArray1645);
									}
								}

								RSGraphics.setDrawRegion(var2, var3, var4, var5);
								continue;
							}
						}

						if (var15.type * -1305917269 == 0) {
							if (!var15.interactable && IsaacRandom.method68(var15)
									&& ObjectDefinition.aWidget1719 != var15) {
								continue;
							}

							if (!var15.interactable) {
								if (-1602694527 * var15.insetY > var15.viewportHeight * 177405235
										- var15.height * 1227800423) {
									var15.insetY = var15.viewportHeight * -1656271437 - var15.height * -1999090201;
								}

								if (-1602694527 * var15.insetY < 0) {
									var15.insetY = 0;
								}
							}

							method272(var0, var15.anInt1129 * -1536575275, var22, var23, var28, var29,
									var10 - -352661099 * var15.insetX, var11 - var15.insetY * -1602694527, var18);
							if (var15.children != null) {
								method272(var15.children, var15.anInt1129 * -1536575275, var22, var23, var28, var29,
										var10 - var15.insetX * -352661099, var11 - var15.insetY * -1602694527, var18);
							}

							InterfaceNode var47 = (InterfaceNode) Client.interfaceNodes
									.get((long) (-1536575275 * var15.anInt1129));
							if (var47 != null) {
								Class24.method164(226793949 * var47.type, var22, var23, var28, var29, var10, var11,
										var18);
							}

							RSGraphics.setDrawRegion(var2, var3, var4, var5);
							DualNode_Sub13_Sub1.method909();
						}

						if (Client.resizable || Client.aBoolArray2137[var18] || 1685649351 * Client.anInt2177 > 1) {
							int var17;
							if (-1305917269 * var15.type == 0 && !var15.interactable
									&& 177405235 * var15.viewportHeight > 1227800423 * var15.height) {
								var9 = var15.width * 1645211541 + var10;
								var16 = -1602694527 * var15.insetY;
								var13 = 1227800423 * var15.height;
								var31 = 177405235 * var15.viewportHeight;
								Class35.aDualNode_Sub13_Sub2Array395[0].method929(var9, var11);
								Class35.aDualNode_Sub13_Sub2Array395[1].method929(var9, var13 + var11 - 16);
								RSGraphics.method793(var9, var11 + 16, 16, var13 - 32, 15197487 * Client.anInt2067);
								var17 = (var13 - 32) * var13 / var31;
								if (var17 < 8) {
									var17 = 8;
								}

								var30 = var16 * (var13 - 32 - var17) / (var31 - var13);
								RSGraphics.method793(var9, var30 + 16 + var11, 16, var17,
										403555201 * Client.anInt2068);
								RSGraphics.method784(var9, var30 + var11 + 16, var17, 439456629 * Client.anInt2070);
								RSGraphics.method784(var9 + 1, 16 + var11 + var30, var17,
										439456629 * Client.anInt2070);
								RSGraphics.method796(var9, var30 + 16 + var11, 16, Client.anInt2070 * 439456629);
								RSGraphics.method796(var9, var11 + 17 + var30, 16, Client.anInt2070 * 439456629);
								RSGraphics.method784(var9 + 15, var11 + 16 + var30, var17,
										1001974215 * Client.anInt2069);
								RSGraphics.method784(14 + var9, var30 + 17 + var11, var17 - 1,
										Client.anInt2069 * 1001974215);
								RSGraphics.method796(var9, var17 + var30 + var11 + 15, 16,
										1001974215 * Client.anInt2069);
								RSGraphics.method796(var9 + 1, var11 + 14 + var30 + var17, 15,
										Client.anInt2069 * 1001974215);
							}

							if (var15.type * -1305917269 != 1) {
								if (var15.type * -1305917269 == 2) {
									var9 = 0;

									for (var16 = 0; var16 < 507570867 * var15.anInt1136; ++var16) {
										for (var13 = 0; var13 < var15.anInt1135 * 124195285; ++var13) {
											var31 = (1918789959 * var15.columnPadding + 32) * var13 + var10;
											var17 = var11 + (var15.rowPadding * -1195323371 + 32) * var16;
											if (var9 < 20) {
												var31 += var15.xSprites[var9];
												var17 += var15.anIntArray1163[var9];
											}

											if (var15.itemIds[var9] > 0) {
												boolean var64 = false;
												boolean var69 = false;
												var24 = var15.itemIds[var9] - 1;
												if (var31 + 32 > var2 && var31 < var4 && var17 + 32 > var3
														&& var17 < var5
														|| var15 == DualNode_Sub1.aWidget1446
																&& 1979905201 * Client.anInt2100 == var9) {
													Sprite var70;
													if (Client.itemSelectionStatus * -1110581093 == 1
															&& var9 == 543565821 * Class40.selectedItemIndex
															&& -1536575275 * var15.anInt1129 == Class22.anInt286
																	* -47339353) {
														var70 = Entity.getItemSprite(var24, var15.itemQuantities[var9],
																2, 0, 2, false);
													} else {
														var70 = Entity.getItemSprite(var24, var15.itemQuantities[var9],
																1, 3153952, 2, false);
													}

													if (var70 != null) {
														if (DualNode_Sub1.aWidget1446 == var15
																&& Client.anInt2100 * 1979905201 == var9) {
															var30 = Class74.anInt621 * -453286219
																	- Client.anInt2131 * -827759387;
															var38 = Class74.anInt622 * 103771565
																	- Client.anInt2101 * 45845103;
															if (var30 < 5 && var30 > -5) {
																var30 = 0;
															}

															if (var38 < 5 && var38 > -5) {
																var38 = 0;
															}

															if (950444267 * Client.anInt2092 < 5) {
																var30 = 0;
																var38 = 0;
															}

															var70.method951(var31 + var30, var17 + var38, 128);
															if (var1 != -1) {
																Widget var60 = var0[var1 & '\uffff'];
																if (var38 + var17 < RSGraphics.draw_region_y
																		&& var60.insetY * -1602694527 > 0) {
																	var26 = -1163930299 * Client.anInt2066
																			* (RSGraphics.draw_region_y - var17 - var38)
																			/ 3;
																	if (var26 > Client.anInt2066 * 1245598898) {
																		var26 = Client.anInt2066 * 1245598898;
																	}

																	if (var26 > -1602694527 * var60.insetY) {
																		var26 = -1602694527 * var60.insetY;
																	}

																	var60.insetY -= -1459786367 * var26;
																	Client.anInt2101 += 249762959 * var26;
																	Class68.method326(var60);
																}

																if (var38 + var17 + 32 > RSGraphics.draw_region_max_y
																		&& -1602694527
																				* var60.insetY < var60.viewportHeight
																						* 177405235
																						- var60.height * 1227800423) {
																	var26 = Client.anInt2066 * -1163930299 * (32 + var38
																			+ var17 - RSGraphics.draw_region_max_y) / 3;
																	if (var26 > 1245598898 * Client.anInt2066) {
																		var26 = Client.anInt2066 * 1245598898;
																	}

																	if (var26 > var60.viewportHeight * 177405235
																			- var60.height * 1227800423
																			- var60.insetY * -1602694527) {
																		var26 = 177405235 * var60.viewportHeight
																				- var60.height * 1227800423
																				- var60.insetY * -1602694527;
																	}

																	var60.insetY += -1459786367 * var26;
																	Client.anInt2101 -= 249762959 * var26;
																	Class68.method326(var60);
																}
															}
														} else if (Class30.aWidget339 == var15
																&& Client.anInt2099 * -387716201 == var9) {
															var70.method951(var31, var17, 128);
														} else {
															var70.method946(var31, var17);
														}
													} else {
														Class68.method326(var15);
													}
												}
											} else if (var15.anIntArray1164 != null && var9 < 20) {
												Sprite var66 = var15.method488(var9);
												if (var66 != null) {
													var66.method946(var31, var17);
												} else if (Widget.aBool1128) {
													Class68.method326(var15);
												}
											}

											++var9;
										}
									}
								} else if (-1305917269 * var15.type == 3) {
									if (RuntimeException_Sub1.method932(var15)) {
										var9 = 2125719227 * var15.anInt1139;
										if (ObjectDefinition.aWidget1719 == var15
												&& var15.anInt1141 * -528196075 != 0) {
											var9 = -528196075 * var15.anInt1141;
										}
									} else {
										var9 = 1384750979 * var15.textColor;
										if (ObjectDefinition.aWidget1719 == var15 && var15.anInt1140 * 301172361 != 0) {
											var9 = var15.anInt1140 * 301172361;
										}
									}

									if (var19 == 0) {
										if (var15.aBool1161) {
											RSGraphics.method793(var10, var11, 1645211541 * var15.width,
													1227800423 * var15.height, var9);
										} else {
											RSGraphics.drawRectangle(var10, var11, var15.width * 1645211541,
													1227800423 * var15.height, var9);
										}
									} else if (var15.aBool1161) {
										RSGraphics.fillRectangle(var10, var11, var15.width * 1645211541,
												1227800423 * var15.height, var9, 256 - (var19 & 255));
									} else {
										RSGraphics.method794(var10, var11, 1645211541 * var15.width,
												var15.height * 1227800423, var9, 256 - (var19 & 255));
									}
								} else {
									DualNode_Sub13_Sub3_Sub1 var48;
									if (-1305917269 * var15.type == 4) {
										var48 = var15.method490();
										if (var48 == null) {
											if (Widget.aBool1128) {
												Class68.method326(var15);
											}
										} else {
											String var57 = var15.text;
											if (RuntimeException_Sub1.method932(var15)) {
												var16 = var15.anInt1139 * 2125719227;
												if (ObjectDefinition.aWidget1719 == var15
														&& var15.anInt1141 * -528196075 != 0) {
													var16 = -528196075 * var15.anInt1141;
												}

												if (var15.aString1157.length() > 0) {
													var57 = var15.aString1157;
												}
											} else {
												var16 = 1384750979 * var15.textColor;
												if (var15 == ObjectDefinition.aWidget1719
														&& 301172361 * var15.anInt1140 != 0) {
													var16 = 301172361 * var15.anInt1140;
												}
											}

											if (var15.interactable && var15.itemId * 813479615 != -1) {
												ItemDefinition var68 = FriendedPlayer
														.getItemDefinition(var15.itemId * 813479615);
												var57 = var68.name;
												if (var57 == null) {
													var57 = "null";
												}

												if ((var68.stackable * 1303294175 == 1
														|| var15.itemQuantity * 1393082105 != 1)
														&& 1393082105 * var15.itemQuantity != -1) {
													var57 = Class48_Sub1.method545(16748608) + var57
															+ Class35.aString393 + " " + 'x'
															+ DualNode_Sub4.method690(var15.itemQuantity * 1393082105);
												}
											}

											if (var15 == Client.aWidget2135) {
												GameStrings var10000 = (GameStrings) null;
												var57 = GameStrings.aString945;
												var16 = var15.textColor * 1384750979;
											}

											if (!var15.interactable) {
												var57 = Node_Sub8.method551(var57, var15);
											}

											var48.method990(var57, var10, var11, var15.width * 1645211541,
													1227800423 * var15.height, var16, var15.textShadowed ? 0 : -1,
													-1662187929 * var15.anInt1159, var15.anInt1138 * 1549920313,
													var15.anInt1158 * -525493285);
										}
									} else if (-1305917269 * var15.type == 5) {
										Sprite var50;
										if (!var15.interactable) {
											var50 = var15.method489(RuntimeException_Sub1.method932(var15));
											if (var50 != null) {
												var50.method946(var10, var11);
											} else if (Widget.aBool1128) {
												Class68.method326(var15);
											}
										} else {
											if (813479615 * var15.itemId != -1) {
												var50 = Entity.getItemSprite(var15.itemId * 813479615,
														var15.itemQuantity * 1393082105,
														-357503007 * var15.borderThickness,
														2139159057 * var15.shadowColor, -1559571005 * var15.anInt1155,
														false);
											} else {
												var50 = var15.method489(false);
											}

											if (var50 == null) {
												if (Widget.aBool1128) {
													Class68.method326(var15);
												}
											} else {
												var16 = var50.anInt1815;
												var13 = var50.anInt1816;
												if (!var15.aBool1144) {
													var31 = var15.width * -17215488 / var16;
													if (var15.spriteId * -1749435731 != 0) {
														var50.method945(1645211541 * var15.width / 2 + var10,
																var11 + 1227800423 * var15.height / 2,
																-1749435731 * var15.spriteId, var31);
													} else if (var19 != 0) {
														var50.method953(var10, var11, var15.width * 1645211541,
																1227800423 * var15.height, 256 - (var19 & 255));
													} else if (var16 == 1645211541 * var15.width
															&& var15.height * 1227800423 == var13) {
														var50.method946(var10, var11);
													} else {
														var50.method944(var10, var11, 1645211541 * var15.width,
																1227800423 * var15.height);
													}
												} else {
													RSGraphics.setInnerDrawRegion(var10, var11,
															var15.width * 1645211541 + var10,
															1227800423 * var15.height + var11);
													var31 = (1645211541 * var15.width + (var16 - 1)) / var16;
													var17 = (var15.height * 1227800423 + (var13 - 1)) / var13;

													for (var30 = 0; var30 < var31; ++var30) {
														for (var38 = 0; var38 < var17; ++var38) {
															if (var15.spriteId * -1749435731 != 0) {
																var50.method945(var16 * var30 + var10 + var16 / 2,
																		var11 + var13 * var38 + var13 / 2,
																		var15.spriteId * -1749435731, 4096);
															} else if (var19 != 0) {
																var50.method951(var10 + var16 * var30,
																		var11 + var13 * var38, 256 - (var19 & 255));
															} else {
																var50.method946(var16 * var30 + var10,
																		var38 * var13 + var11);
															}
														}
													}

													RSGraphics.setDrawRegion(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemDefinition var53;
										if (var15.type * -1305917269 == 6) {
											boolean var49 = RuntimeException_Sub1.method932(var15);
											if (var49) {
												var16 = -213715327 * var15.anInt1150;
											} else {
												var16 = var15.anInt1162 * 467073769;
											}

											Model var52 = null;
											var31 = 0;
											if (var15.itemId * 813479615 != -1) {
												var53 = FriendedPlayer.getItemDefinition(813479615 * var15.itemId);
												if (var53 != null) {
													var53 = var53.method812(var15.itemQuantity * 1393082105);
													var52 = var53.method811(1);
													if (var52 != null) {
														var52.method998();
														var31 = 1812947537 * var52.modelHeight / 2;
													} else {
														Class68.method326(var15);
													}
												}
											} else if (var15.modelType * -768837131 == 5) {
												if (686060225 * var15.modelId == 0) {
													var52 = Client.aPlayerConfig2138.method268((DualNode_Sub3) null, -1,
															(DualNode_Sub3) null, -1);
												} else {
													var52 = Class68.myPlayer.method654((byte) 13);
												}
											} else if (var16 == -1) {
												var52 = var15.method492((DualNode_Sub3) null, -1, var49,
														Class68.myPlayer.config);
												if (var52 == null && Widget.aBool1128) {
													Class68.method326(var15);
												}
											} else {
												DualNode_Sub3 var58 = Node_Sub6.method540(var16, -1992589394);
												var52 = var15.method492(var58, var15.anInt1194 * 627142311, var49,
														Class68.myPlayer.config);
												if (var52 == null && Widget.aBool1128) {
													Class68.method326(var15);
												}
											}

											DualNode_Sub13_Sub1.method911(var15.width * 1645211541 / 2 + var10,
													1227800423 * var15.height / 2 + var11);
											var17 = var15.modelZoom * -1472457387
													* DualNode_Sub13_Sub1.SIN_TABLE[175924351
															* var15.rotationX] >> 16;
											var30 = -1472457387 * var15.modelZoom
													* DualNode_Sub13_Sub1.COS_TABLE[175924351
															* var15.rotationX] >> 16;
											if (var52 != null) {
												if (!var15.interactable) {
													var52.method1012(0, 745334365 * var15.rotationZ, 0,
															175924351 * var15.rotationX, 0, var17, var30);
												} else {
													var52.method998();
													if (var15.aBool1154) {
														var52.method1014(0, var15.rotationZ * 745334365,
																681145387 * var15.rotationY,
																var15.rotationX * 175924351,
																-505327979 * var15.anInt1198,
																var17 + var31 + 2110500971 * var15.anInt1151,
																2110500971 * var15.anInt1151 + var30,
																var15.modelZoom * -1472457387);
													} else {
														var52.method1012(0, 745334365 * var15.rotationZ,
																681145387 * var15.rotationY,
																var15.rotationX * 175924351,
																-505327979 * var15.anInt1198,
																2110500971 * var15.anInt1151 + var17 + var31,
																var15.anInt1151 * 2110500971 + var30);
													}
												}
											}

											DualNode_Sub13_Sub1.method910();
										} else {
											if (var15.type * -1305917269 == 7) {
												var48 = var15.method490();
												if (var48 == null) {
													if (Widget.aBool1128) {
														Class68.method326(var15);
													}
													continue;
												}

												var16 = 0;

												for (var13 = 0; var13 < 507570867 * var15.anInt1136; ++var13) {
													for (var31 = 0; var31 < 124195285 * var15.anInt1135; ++var31) {
														if (var15.itemIds[var16] > 0) {
															var53 = FriendedPlayer
																	.getItemDefinition(var15.itemIds[var16] - 1);
															String var61;
															if (1303294175 * var53.stackable != 1
																	&& var15.itemQuantities[var16] == 1) {
																var61 = Class48_Sub1.method545(16748608) + var53.name
																		+ Class35.aString393;
															} else {
																var61 = Class48_Sub1.method545(16748608) + var53.name
																		+ Class35.aString393 + " " + 'x' + DualNode_Sub4
																				.method690(var15.itemQuantities[var16]);
															}

															var38 = var10
																	+ (var15.columnPadding * 1918789959 + 115) * var31;
															var24 = (12 + -1195323371 * var15.rowPadding) * var13
																	+ var11;
															if (var15.anInt1159 * -1662187929 == 0) {
																var48.method980(var61, var38, var24,
																		1384750979 * var15.textColor,
																		var15.textShadowed ? 0 : -1);
															} else if (-1662187929 * var15.anInt1159 == 1) {
																var48.method982(var61,
																		var15.width * 1645211541 / 2 + var38, var24,
																		1384750979 * var15.textColor,
																		var15.textShadowed ? 0 : -1);
															} else {
																var48.method972(var61,
																		var38 + var15.width * 1645211541 - 1, var24,
																		1384750979 * var15.textColor,
																		var15.textShadowed ? 0 : -1);
															}
														}

														++var16;
													}
												}
											}

											if (-1305917269 * var15.type == 8 && var15 == ScriptEvent.aWidget1437
													&& Client.anInt2008 * 1149981077 == 1046829805 * Client.anInt2117) {
												var9 = 0;
												var16 = 0;
												DualNode_Sub13_Sub3_Sub1 var51 = Client.aDualNode_Sub13_Sub3_Sub1_2047;
												String var62 = var15.text;

												String var54;
												for (var62 = Node_Sub8.method551(var62, var15); var62
														.length() > 0; var16 += 1 + var51.anInt1824) {
													var30 = var62.indexOf(Class35.aString390);
													if (var30 != -1) {
														var54 = var62.substring(0, var30);
														var62 = var62.substring(var30 + 4);
													} else {
														var54 = var62;
														var62 = "";
													}

													var38 = var51.method967(var54);
													if (var38 > var9) {
														var9 = var38;
													}
												}

												var9 += 6;
												var16 += 7;
												var30 = var15.width * 1645211541 + var10 - 5 - var9;
												var38 = 5 + var15.height * 1227800423 + var11;
												if (var30 < 5 + var10) {
													var30 = 5 + var10;
												}

												if (var9 + var30 > var4) {
													var30 = var4 - var9;
												}

												if (var38 + var16 > var5) {
													var38 = var5 - var16;
												}

												RSGraphics.method793(var30, var38, var9, var16, 16777120);
												RSGraphics.drawRectangle(var30, var38, var9, var16, 0);
												var62 = var15.text;
												var24 = var38 + var51.anInt1824 + 2;

												for (var62 = Node_Sub8.method551(var62, var15); var62
														.length() > 0; var24 += 1 + var51.anInt1824) {
													var40 = var62.indexOf(Class35.aString390);
													if (var40 != -1) {
														var54 = var62.substring(0, var40);
														var62 = var62.substring(var40 + 4);
													} else {
														var54 = var62;
														var62 = "";
													}

													var51.method980(var54, 3 + var30, var24, 0, -1);
												}
											}

											if (var15.type * -1305917269 == 9) {
												if (562385183 * var15.anInt1137 == 1) {
													if (var15.aBool1142) {
														var9 = var10;
														var16 = var15.height * 1227800423 + var11;
														var13 = 1645211541 * var15.width + var10;
														var31 = var11;
													} else {
														var9 = var10;
														var16 = var11;
														var13 = var10 + var15.width * 1645211541;
														var31 = var15.height * 1227800423 + var11;
													}

													RSGraphics.drawLine(var9, var16, var13, var31,
															1384750979 * var15.textColor);
												} else {
													var9 = 1645211541 * var15.width >= 0 ? var15.width * 1645211541
															: -(var15.width * 1645211541);
													var16 = var15.height * 1227800423 >= 0 ? 1227800423 * var15.height
															: -(var15.height * 1227800423);
													var13 = var9;
													if (var9 < var16) {
														var13 = var16;
													}

													if (var13 != 0) {
														var31 = (var15.width * 1645211541 << 16) / var13;
														var17 = (var15.height * 1227800423 << 16) / var13;
														if (var17 <= var31) {
															var31 = -var31;
														} else {
															var17 = -var17;
														}

														var30 = var15.anInt1137 * 562385183 * var17 >> 17;
														var38 = 1 + 562385183 * var15.anInt1137 * var17 >> 17;
														var24 = var31 * 562385183 * var15.anInt1137 >> 17;
														var40 = 1 + var15.anInt1137 * 562385183 * var31 >> 17;
														var25 = var10 + var30;
														var26 = var10 - var38;
														var27 = var10 + 1645211541 * var15.width - var38;
														var37 = var30 + var10 + 1645211541 * var15.width;
														var39 = var24 + var11;
														var34 = var11 - var40;
														var36 = var15.height * 1227800423 + var11 - var40;
														var35 = var24 + var11 + var15.height * 1227800423;
														DualNode_Sub13_Sub1.method916(var25, var26, var27);
														DualNode_Sub13_Sub1.method917(var39, var34, var36, var25, var26,
																var27, 1384750979 * var15.textColor);
														DualNode_Sub13_Sub1.method916(var25, var27, var37);
														DualNode_Sub13_Sub1.method917(var39, var36, var35, var25, var27,
																var37, var15.textColor * 1384750979);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static byte[] method273(CharSequence var0) {
		int var1 = var0.length();
		byte[] var4 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var2 = var0.charAt(var3);
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				if (var2 == 8364) {
					var4[var3] = -128;
				} else if (var2 == 8218) {
					var4[var3] = -126;
				} else if (var2 == 402) {
					var4[var3] = -125;
				} else if (var2 == 8222) {
					var4[var3] = -124;
				} else if (var2 == 8230) {
					var4[var3] = -123;
				} else if (var2 == 8224) {
					var4[var3] = -122;
				} else if (var2 == 8225) {
					var4[var3] = -121;
				} else if (var2 == 710) {
					var4[var3] = -120;
				} else if (var2 == 8240) {
					var4[var3] = -119;
				} else if (var2 == 352) {
					var4[var3] = -118;
				} else if (var2 == 8249) {
					var4[var3] = -117;
				} else if (var2 == 338) {
					var4[var3] = -116;
				} else if (var2 == 381) {
					var4[var3] = -114;
				} else if (var2 == 8216) {
					var4[var3] = -111;
				} else if (var2 == 8217) {
					var4[var3] = -110;
				} else if (var2 == 8220) {
					var4[var3] = -109;
				} else if (var2 == 8221) {
					var4[var3] = -108;
				} else if (var2 == 8226) {
					var4[var3] = -107;
				} else if (var2 == 8211) {
					var4[var3] = -106;
				} else if (var2 == 8212) {
					var4[var3] = -105;
				} else if (var2 == 732) {
					var4[var3] = -104;
				} else if (var2 == 8482) {
					var4[var3] = -103;
				} else if (var2 == 353) {
					var4[var3] = -102;
				} else if (var2 == 8250) {
					var4[var3] = -101;
				} else if (var2 == 339) {
					var4[var3] = -100;
				} else if (var2 == 382) {
					var4[var3] = -98;
				} else if (var2 == 376) {
					var4[var3] = -97;
				} else {
					var4[var3] = 63;
				}
			} else {
				var4[var3] = (byte) var2;
			}
		}

		return var4;
	}

	public static int putJagString(CharSequence sequence, int offset, int length, byte[] bytes, int position) {
		int size = length - offset;

		for (int index = 0; index < size; ++index) {
			char c = sequence.charAt(offset + index);
			if ((c <= 0 || c >= 128) && (c < 160 || c > 255)) {
				if (c == 8364) {
					bytes[position + index] = -128;
				} else if (c == 8218) {
					bytes[position + index] = -126;
				} else if (c == 402) {
					bytes[position + index] = -125;
				} else if (c == 8222) {
					bytes[position + index] = -124;
				} else if (c == 8230) {
					bytes[position + index] = -123;
				} else if (c == 8224) {
					bytes[index + position] = -122;
				} else if (c == 8225) {
					bytes[position + index] = -121;
				} else if (c == 710) {
					bytes[position + index] = -120;
				} else if (c == 8240) {
					bytes[index + position] = -119;
				} else if (c == 352) {
					bytes[index + position] = -118;
				} else if (c == 8249) {
					bytes[position + index] = -117;
				} else if (c == 338) {
					bytes[index + position] = -116;
				} else if (c == 381) {
					bytes[index + position] = -114;
				} else if (c == 8216) {
					bytes[index + position] = -111;
				} else if (c == 8217) {
					bytes[index + position] = -110;
				} else if (c == 8220) {
					bytes[index + position] = -109;
				} else if (c == 8221) {
					bytes[position + index] = -108;
				} else if (c == 8226) {
					bytes[position + index] = -107;
				} else if (c == 8211) {
					bytes[position + index] = -106;
				} else if (c == 8212) {
					bytes[index + position] = -105;
				} else if (c == 732) {
					bytes[position + index] = -104;
				} else if (c == 8482) {
					bytes[index + position] = -103;
				} else if (c == 353) {
					bytes[index + position] = -102;
				} else if (c == 8250) {
					bytes[index + position] = -101;
				} else if (c == 339) {
					bytes[index + position] = -100;
				} else if (c == 382) {
					bytes[index + position] = -98;
				} else if (c == 376) {
					bytes[index + position] = -97;
				} else {
					bytes[index + position] = 63;
				}
			} else {
				bytes[position + index] = (byte) c;
			}
		}

		return size;
	}

	public static void method275(int var0) {
		if (var0 != -1) {
			if (Widget.aBoolArray1123[var0]) {
				Widget.aClass87_1124.method396(var0);
				if (Widget.interfaces[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < Widget.interfaces[var0].length; ++var2) {
						if (Widget.interfaces[var0][var2] != null) {
							if (-1305917269 * Widget.interfaces[var0][var2].type != 2) {
								Widget.interfaces[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						Widget.interfaces[var0] = null;
					}

					Widget.aBoolArray1123[var0] = false;
				}
			}
		}
	}
}
