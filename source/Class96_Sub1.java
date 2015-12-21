import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class Class96_Sub1 extends Class96 {

	String aString1203;
	static Sprite[] aSpriteArray1204;
	short aShort1205;
	int anInt1206 = (int) (Node_Sub5.currentTimeMs() / 1000L) * 1225451051;
	static Class87 aClass87_1207;
	static Class61 aClass61_1208;

	public static void method498(Class87 var0, Class87 var1, boolean var2) {
		ObjectDefinition.aClass87_1682 = var0;
		ObjectDefinition.aClass87_1683 = var1;
		ObjectDefinition.aBool1696 = var2;
	}

	public static DualNode_Sub1 method499(int var0, byte var1) {
		DualNode_Sub1 var2 = (DualNode_Sub1) DualNode_Sub1.aClass106_1445.method427((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = DualNode_Sub1.aClass87_1456.method391(13, var0);
			var2 = new DualNode_Sub1();
			var2.anInt1443 = var0 * -892199181;
			if (var3 != null) {
				var2.method655(new ByteBuf(var3));
			}

			DualNode_Sub1.aClass106_1445.method428(var2, (long) var0);
			return var2;
		}
	}

	public static final void method500(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
					;
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
					;
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
					;
				}
			}

		}
	}

	public static void method501(int var0) {
		if (Class63.aString579.toLowerCase().indexOf("microsoft") != -1) {
			Class71.anIntArray590[186] = 57;
			Class71.anIntArray590[187] = 27;
			Class71.anIntArray590[188] = 71;
			Class71.anIntArray590[189] = 26;
			Class71.anIntArray590[190] = 72;
			Class71.anIntArray590[191] = 73;
			Class71.anIntArray590[192] = 58;
			Class71.anIntArray590[219] = 42;
			Class71.anIntArray590[220] = 74;
			Class71.anIntArray590[221] = 43;
			Class71.anIntArray590[222] = 59;
			Class71.anIntArray590[223] = 28;
		} else {
			Class71.anIntArray590[44] = 71;
			Class71.anIntArray590[45] = 26;
			Class71.anIntArray590[46] = 72;
			Class71.anIntArray590[47] = 73;
			Class71.anIntArray590[59] = 57;
			Class71.anIntArray590[61] = 27;
			Class71.anIntArray590[91] = 42;
			Class71.anIntArray590[92] = 74;
			Class71.anIntArray590[93] = 43;
			Class71.anIntArray590[192] = 28;
			Class71.anIntArray590[222] = 58;
			Class71.anIntArray590[520] = 59;
		}

	}

	public static int method502(CharSequence var0, CharSequence var1, int var2) {
		int var3 = var0.length();
		int var11 = var1.length();
		int var9 = 0;
		int var10 = 0;
		byte var7 = 0;
		byte var8 = 0;

		while (var9 - var7 < var3 || var10 - var8 < var11) {
			if (var9 - var7 >= var3) {
				return -1;
			}

			if (var10 - var8 >= var11) {
				return 1;
			}

			char var12;
			if (var7 != 0) {
				var12 = (char) var7;
				boolean var16 = false;
			} else {
				var12 = var0.charAt(var9++);
			}

			char var13;
			if (var8 != 0) {
				var13 = (char) var8;
				boolean var18 = false;
			} else {
				var13 = var1.charAt(var10++);
			}

			byte var4;
			if (var12 == 198) {
				var4 = 69;
			} else if (var12 == 230) {
				var4 = 101;
			} else if (var12 == 223) {
				var4 = 115;
			} else if (var12 != 338) {
				if (var12 == 339) {
					var4 = 101;
				} else {
					var4 = 0;
				}
			} else {
				var4 = 69;
			}

			var7 = var4;
			byte var6;
			if (var13 == 198) {
				var6 = 69;
			} else if (var13 != 230) {
				if (var13 == 223) {
					var6 = 115;
				} else if (var13 != 338) {
					if (var13 == 339) {
						var6 = 101;
					} else {
						var6 = 0;
					}
				} else {
					var6 = 69;
				}
			} else {
				var6 = 101;
			}

			var8 = var6;
			var12 = DualNode_Sub5.method695(var12, var2);
			var13 = DualNode_Sub5.method695(var13, var2);
			if (var13 != var12 && java.lang.Character.toUpperCase(var12) != java.lang.Character.toUpperCase(var13)) {
				var12 = java.lang.Character.toLowerCase(var12);
				var13 = java.lang.Character.toLowerCase(var13);
				if (var12 != var13) {
					return ObjectDefinition.method864(var12, var2) - ObjectDefinition.method864(var13, var2);
				}
			}
		}

		int var19 = Math.min(var3, var11);

		char var17;
		int var20;
		for (var20 = 0; var20 < var19; ++var20) {
			char var14 = var0.charAt(var20);
			var17 = var1.charAt(var20);
			if (var14 != var17 && java.lang.Character.toUpperCase(var14) != java.lang.Character.toUpperCase(var17)) {
				var14 = java.lang.Character.toLowerCase(var14);
				var17 = java.lang.Character.toLowerCase(var17);
				if (var17 != var14) {
					return ObjectDefinition.method864(var14, var2) - ObjectDefinition.method864(var17, var2);
				}
			}
		}

		var20 = var3 - var11;
		if (var20 != 0) {
			return var20;
		} else {
			for (int var15 = 0; var15 < var19; ++var15) {
				var17 = var0.charAt(var15);
				char var5 = var1.charAt(var15);
				if (var17 != var5) {
					return ObjectDefinition.method864(var17, var2) - ObjectDefinition.method864(var5, var2);
				}
			}

			return 0;
		}
	}

	public static void method503(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
					;
				}
			}

			if (Class70.aString586.startsWith("win") && !var3) {
				Player.method1050(var0, 0, "openjs");
				return;
			}

			if (Class70.aString586.startsWith("mac")) {
				Player.method1050(var0, 1, var2);
				return;
			}

			Player.method1050(var0, 2, "openjs");
		} else {
			Player.method1050(var0, 3, "openjs");
		}

	}

	static void method504(ScriptEvent var0) {
		Class52.method261(var0, 200000);
	}

	Class96_Sub1(String var1, int var2) {
		this.aString1203 = var1;
		this.aShort1205 = (short) var2;
	}

	static final void method505(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var13 = var0[var8];
			if (var13 != null
					&& (!var13.interactable || var13.type * -1305917269 == 0 || var13.aBool1169
							|| Class30.getWidgetConfig(var13) != 0 || var13 == Client.aWidget2142
							|| -179718399 * var13.contentType == 1338)
					&& var1 == var13.parentId * -1652479707 && (!var13.interactable || !IsaacRandom.method68(var13))) {
				int var20 = var6 + 332168295 * var13.relativeX;
				int var15 = 1492425953 * var13.relativeY + var7;
				int var11;
				int var12;
				int var16;
				int var17;
				int var21;
				int var22;
				int var23;
				int var25;
				if (-1305917269 * var13.type == 2) {
					var23 = var2;
					var25 = var3;
					var16 = var4;
					var17 = var5;
				} else if (var13.type * -1305917269 == 9) {
					var21 = var20;
					var22 = var15;
					var12 = var13.width * 1645211541 + var20;
					var11 = var15 + 1227800423 * var13.height;
					if (var12 < var20) {
						var21 = var12;
						var12 = var20;
					}

					if (var11 < var15) {
						var22 = var11;
						var11 = var15;
					}

					++var12;
					++var11;
					var23 = var21 > var2 ? var21 : var2;
					var25 = var22 > var3 ? var22 : var3;
					var16 = var12 < var4 ? var12 : var4;
					var17 = var11 < var5 ? var11 : var5;
				} else {
					var21 = var20 + 1645211541 * var13.width;
					var22 = var15 + 1227800423 * var13.height;
					var23 = var20 > var2 ? var20 : var2;
					var25 = var15 > var3 ? var15 : var3;
					var16 = var21 < var4 ? var21 : var4;
					var17 = var22 < var5 ? var22 : var5;
				}

				if (Client.aWidget2141 == var13) {
					Client.aBool2148 = true;
					Client.anInt2050 = -693748815 * var20;
					Client.anInt2149 = 740381373 * var15;
				}

				if (!var13.interactable || var23 < var16 && var25 < var17) {
					var21 = -453286219 * Class74.anInt621;
					var22 = Class74.anInt622 * 103771565;
					if (823601801 * Class74.anInt627 != 0) {
						var21 = -2040065729 * Class74.anInt628;
						var22 = Class74.anInt629 * 2090526775;
					}

					if (-179718399 * var13.contentType == 1337) {
						if (!Client.aBool2214 && !Client.menuOpen && var21 >= var23 && var22 >= var25 && var21 < var16
								&& var22 < var17) {
							TileDecorationStub.method462(var21, var22, var23, var25);
						}
					} else {
						int var10;
						int var18;
						int var24;
						int var26;
						int var27;
						int var46;
						if (var13.contentType * -179718399 == 1338) {
							if ((-1797803011 * Client.anInt2200 == 0 || Client.anInt2200 * -1797803011 == 3)
									&& (Class74.anInt627 * 823601801 == 1
											|| !ClanMate.aBool1221 && Class74.anInt627 * 823601801 == 4)) {
								DualNode_Sub14 var44 = var13.method491(true);
								if (var44 != null) {
									var11 = Class74.anInt628 * -2040065729 - var20;
									var46 = Class74.anInt629 * 2090526775 - var15;
									if (var44.method823(var11, var46)) {
										var11 -= var44.anInt1647 * 662480183 / 2;
										var46 -= var44.anInt1648 * -988977157 / 2;
										var10 = -1718342721 * Client.minimapScale + Client.minimapRotation * -1916997753
												& 2047;
										var24 = DualNode_Sub13_Sub1.SIN_TABLE[var10];
										var26 = DualNode_Sub13_Sub1.COS_TABLE[var10];
										var24 = var24 * (256 + Client.viewRotation * -806982331) >> 8;
										var26 = var26 * (-806982331 * Client.viewRotation + 256) >> 8;
										var27 = var11 * var26 + var24 * var46 >> 11;
										int var52 = var26 * var46 - var11 * var24 >> 11;
										int var53 = var27 + 1272643751 * Class68.myPlayer.strictX >> 7;
										var18 = Class68.myPlayer.strictY * -1801433343 - var52 >> 7;
										Client.outBuffer.putHeader(239);
										Client.outBuffer.putByte(18);
										Client.outBuffer.putByteC(
												Class71.aBoolArray593[82] ? (Class71.aBoolArray593[81] ? 2 : 1) : 0);
										Client.outBuffer.putLEShortA(Node_Sub10.regionBaseX * 1426698711 + var53);
										Client.outBuffer.putLEShort(Class28.regionBaseY * 714823515 + var18);
										Client.outBuffer.putByte(var11);
										Client.outBuffer.putByte(var46);
										Client.outBuffer.putShort(-1916997753 * Client.minimapRotation);
										Client.outBuffer.putByte(57);
										Client.outBuffer.putByte(Client.minimapScale * -1718342721);
										Client.outBuffer.putByte(-806982331 * Client.viewRotation);
										Client.outBuffer.putByte(89);
										Client.outBuffer.putShort(1272643751 * Class68.myPlayer.strictX);
										Client.outBuffer.putShort(-1801433343 * Class68.myPlayer.strictY);
										Client.outBuffer.putByte(63);
										Client.destinationX = var53 * -1943900347;
										Client.destinationY = 317027045 * var18;
									}
								}
							}
						} else {
							boolean var47;
							if (!Client.menuOpen && var21 >= var23 && var22 >= var25 && var21 < var16
									&& var22 < var17) {
								var12 = var21 - var20;
								var11 = var22 - var15;
								if (-1300193677 * var13.anInt1195 == 1) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 24, 0, 0,
											-1536575275 * var13.anInt1129);
								}

								String var19;
								if (-1300193677 * var13.anInt1195 == 2 && !Client.spellSelected) {
									var19 = Class26.method168(var13);
									if (var19 != null) {
										FriendedPlayer.addMenuRow(var19,
												Class48_Sub1.method545('\uff00') + var13.aString1125, 25, 0, -1,
												-1536575275 * var13.anInt1129);
									}
								}

								if (var13.anInt1195 * -1300193677 == 3) {
									FriendedPlayer.addMenuRow(GameStrings.aString1007, "", 26, 0, 0,
											var13.anInt1129 * -1536575275);
								}

								if (var13.anInt1195 * -1300193677 == 4) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 28, 0, 0,
											-1536575275 * var13.anInt1129);
								}

								if (-1300193677 * var13.anInt1195 == 5) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 29, 0, 0,
											var13.anInt1129 * -1536575275);
								}

								if (-1300193677 * var13.anInt1195 == 6 && Client.aWidget2135 == null) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 30, 0, -1,
											var13.anInt1129 * -1536575275);
								}

								if (-1305917269 * var13.type == 2) {
									var46 = 0;

									for (var10 = 0; var10 < 1227800423 * var13.height; ++var10) {
										for (var24 = 0; var24 < 1645211541 * var13.width; ++var24) {
											var26 = (var13.columnPadding * 1918789959 + 32) * var24;
											var27 = (32 + var13.rowPadding * -1195323371) * var10;
											if (var46 < 20) {
												var26 += var13.xSprites[var46];
												var27 += var13.anIntArray1163[var46];
											}

											if (var12 >= var26 && var11 >= var27 && var12 < var26 + 32
													&& var11 < 32 + var27) {
												Client.anInt2124 = -582656979 * var46;
												TileDecorationStub.aWidget838 = var13;
												if (var13.itemIds[var46] > 0) {
													label1179: {
														ItemDefinition var29 = FriendedPlayer
																.getItemDefinition(var13.itemIds[var46] - 1);
														boolean var28;
														if (Client.itemSelectionStatus * -1110581093 == 1) {
															var18 = Class30.getWidgetConfig(var13);
															var28 = (var18 >> 30 & 1) != 0;
															if (var28) {
																if (-47339353 * Class22.anInt286 != -1536575275
																		* var13.anInt1129
																		|| 543565821
																				* Class40.selectedItemIndex != var46) {
																	FriendedPlayer.addMenuRow(GameStrings.aString993,
																			Client.selectedItemName + " "
																					+ Class35.aString391 + " "
																					+ Class48_Sub1.method545(16748608)
																					+ var29.name,
																			31, 1548676283 * var29.anInt1609, var46,
																			var13.anInt1129 * -1536575275);
																}
																break label1179;
															}
														}

														if (Client.spellSelected) {
															var18 = Class30.getWidgetConfig(var13);
															var28 = (var18 >> 30 & 1) != 0;
															if (var28) {
																if ((2016481409 * Class31.currentSpellTargets
																		& 16) == 16) {
																	FriendedPlayer.addMenuRow(Client.menuActionPrefix,
																			Client.selectedSpellName + " "
																					+ Class35.aString391 + " "
																					+ Class48_Sub1.method545(16748608)
																					+ var29.name,
																			32, 1548676283 * var29.anInt1609, var46,
																			var13.anInt1129 * -1536575275);
																}
																break label1179;
															}
														}

														String[] var51 = var29.actions;
														if (Client.aBool2139) {
															var51 = GameCanvas.method885(var51);
														}

														int var32 = Class30.getWidgetConfig(var13);
														boolean var45 = (var32 >> 30 & 1) != 0;
														if (var45) {
															for (int var9 = 4; var9 >= 3; --var9) {
																if (var51 != null && var51[var9] != null) {
																	byte var33;
																	if (var9 == 3) {
																		var33 = 36;
																	} else {
																		var33 = 37;
																	}

																	FriendedPlayer.addMenuRow(var51[var9],
																			Class48_Sub1.method545(16748608)
																					+ var29.name,
																			var33, 1548676283 * var29.anInt1609, var46,
																			var13.anInt1129 * -1536575275);
																} else if (var9 == 4) {
																	FriendedPlayer.addMenuRow(GameStrings.aString844,
																			Class48_Sub1.method545(16748608)
																					+ var29.name,
																			37, var29.anInt1609 * 1548676283, var46,
																			var13.anInt1129 * -1536575275);
																}
															}
														}

														int var54 = Class30.getWidgetConfig(var13);
														boolean var35 = (var54 >> 31 & 1) != 0;
														if (var35) {
															FriendedPlayer.addMenuRow(GameStrings.aString993,
																	Class48_Sub1.method545(16748608) + var29.name, 38,
																	var29.anInt1609 * 1548676283, var46,
																	var13.anInt1129 * -1536575275);
														}

														int var34 = Class30.getWidgetConfig(var13);
														boolean var31 = (var34 >> 30 & 1) != 0;
														byte var14;
														int var30;
														if (var31 && var51 != null) {
															for (var30 = 2; var30 >= 0; --var30) {
																if (var51[var30] != null) {
																	var14 = 0;
																	if (var30 == 0) {
																		var14 = 33;
																	}

																	if (var30 == 1) {
																		var14 = 34;
																	}

																	if (var30 == 2) {
																		var14 = 35;
																	}

																	FriendedPlayer.addMenuRow(var51[var30],
																			Class48_Sub1.method545(16748608)
																					+ var29.name,
																			var14, 1548676283 * var29.anInt1609, var46,
																			-1536575275 * var13.anInt1129);
																}
															}
														}

														var51 = var13.tableActions;
														if (Client.aBool2139) {
															var51 = GameCanvas.method885(var51);
														}

														if (var51 != null) {
															for (var30 = 4; var30 >= 0; --var30) {
																if (var51[var30] != null) {
																	var14 = 0;
																	if (var30 == 0) {
																		var14 = 39;
																	}

																	if (var30 == 1) {
																		var14 = 40;
																	}

																	if (var30 == 2) {
																		var14 = 41;
																	}

																	if (var30 == 3) {
																		var14 = 42;
																	}

																	if (var30 == 4) {
																		var14 = 43;
																	}

																	FriendedPlayer.addMenuRow(var51[var30],
																			Class48_Sub1.method545(16748608)
																					+ var29.name,
																			var14, var29.anInt1609 * 1548676283, var46,
																			-1536575275 * var13.anInt1129);
																}
															}
														}

														FriendedPlayer.addMenuRow(GameStrings.aString994,
																Class48_Sub1.method545(16748608) + var29.name, 1005,
																1548676283 * var29.anInt1609, var46,
																-1536575275 * var13.anInt1129);
													}
												}
											}

											++var46;
										}
									}
								}

								if (var13.interactable) {
									if (Client.spellSelected) {
										var10 = Class30.getWidgetConfig(var13);
										var47 = (var10 >> 21 & 1) != 0;
										if (var47 && (2016481409 * Class31.currentSpellTargets & 32) == 32) {
											FriendedPlayer.addMenuRow(Client.menuActionPrefix,
													Client.selectedSpellName + " " + Class35.aString391 + " "
															+ var13.name,
													58, 0, 2021294259 * var13.index, var13.anInt1129 * -1536575275);
										}
									} else {
										for (var46 = 9; var46 >= 5; --var46) {
											String var36 = Player.method1049(var13, var46);
											if (var36 != null) {
												FriendedPlayer.addMenuRow(var36, var13.name, 1007, var46 + 1,
														var13.index * 2021294259, -1536575275 * var13.anInt1129);
											}
										}

										var19 = Class26.method168(var13);
										if (var19 != null) {
											FriendedPlayer.addMenuRow(var19, var13.name, 25, 0,
													2021294259 * var13.index, var13.anInt1129 * -1536575275);
										}

										for (var10 = 4; var10 >= 0; --var10) {
											String var48 = Player.method1049(var13, var10);
											if (var48 != null) {
												FriendedPlayer.addMenuRow(var48, var13.name, 57, var10 + 1,
														2021294259 * var13.index, -1536575275 * var13.anInt1129);
											}
										}

										if (Class7.method78(Class30.getWidgetConfig(var13))) {
											FriendedPlayer.addMenuRow(GameStrings.aString848, "", 30, 0,
													2021294259 * var13.index, var13.anInt1129 * -1536575275);
										}
									}
								}
							}

							if (-1305917269 * var13.type == 0) {
								if (!var13.interactable && IsaacRandom.method68(var13)
										&& ObjectDefinition.aWidget1719 != var13) {
									continue;
								}

								method505(var0, -1536575275 * var13.anInt1129, var23, var25, var16, var17,
										var20 - var13.insetX * -352661099, var15 - -1602694527 * var13.insetY);
								if (var13.children != null) {
									method505(var13.children, -1536575275 * var13.anInt1129, var23, var25, var16, var17,
											var20 - var13.insetX * -352661099, var15 - var13.insetY * -1602694527);
								}

								InterfaceNode var41 = (InterfaceNode) Client.interfaceNodes
										.get((long) (-1536575275 * var13.anInt1129));
								if (var41 != null) {
									if (var41.owner * -1882639549 == 0 && Class74.anInt621 * -453286219 >= var23
											&& 103771565 * Class74.anInt622 >= var25
											&& -453286219 * Class74.anInt621 < var16
											&& Class74.anInt622 * 103771565 < var17 && !Client.menuOpen
											&& !Client.aBool2024) {
										for (ScriptEvent var39 = (ScriptEvent) Client.aDeque2164
												.method471(); var39 != null; var39 = (ScriptEvent) Client.aDeque2164
														.method473()) {
											if (var39.aBool1432) {
												var39.unlink();
												var39.aWidget1430.aBool1165 = false;
											}
										}

										if (FriendedPlayer.anInt739 * 1559668895 == 0) {
											Client.aWidget2141 = null;
											Client.aWidget2142 = null;
										}

										if (!Client.menuOpen) {
											Client.menuActions[0] = GameStrings.aString1079;
											Client.menuNouns[0] = "";
											Client.menuOpcodes[0] = 1006;
											Client.menuItemCount = 1937006435;
										}
									}

									Class40.method222(226793949 * var41.type, var23, var25, var16, var17, var20, var15);
								}
							}

							if (var13.interactable) {
								ScriptEvent var42;
								if (var13.aBool1201) {
									if (-453286219 * Class74.anInt621 >= var23 && 103771565 * Class74.anInt622 >= var25
											&& Class74.anInt621 * -453286219 < var16
											&& 103771565 * Class74.anInt622 < var17) {
										for (var42 = (ScriptEvent) Client.aDeque2164
												.method471(); var42 != null; var42 = (ScriptEvent) Client.aDeque2164
														.method473()) {
											if (var42.aBool1432) {
												var42.unlink();
												var42.aWidget1430.aBool1165 = false;
											}
										}

										if (FriendedPlayer.anInt739 * 1559668895 == 0) {
											Client.aWidget2141 = null;
											Client.aWidget2142 = null;
										}

										if (!Client.menuOpen) {
											Client.menuActions[0] = GameStrings.aString1079;
											Client.menuNouns[0] = "";
											Client.menuOpcodes[0] = 1006;
											Client.menuItemCount = 1937006435;
										}
									}
								} else if (var13.aBool1175 && -453286219 * Class74.anInt621 >= var23
										&& Class74.anInt622 * 103771565 >= var25
										&& -453286219 * Class74.anInt621 < var16
										&& Class74.anInt622 * 103771565 < var17) {
									for (var42 = (ScriptEvent) Client.aDeque2164
											.method471(); var42 != null; var42 = (ScriptEvent) Client.aDeque2164
													.method473()) {
										if (var42.aBool1432 && var42.args == var42.aWidget1430.scrollListener) {
											var42.unlink();
										}
									}
								}

								boolean var43;
								if (-453286219 * Class74.anInt621 >= var23 && Class74.anInt622 * 103771565 >= var25
										&& Class74.anInt621 * -453286219 < var16
										&& 103771565 * Class74.anInt622 < var17) {
									var43 = true;
								} else {
									var43 = false;
								}

								boolean var40 = false;
								if ((-562612321 * Class74.anInt624 == 1
										|| !ClanMate.aBool1221 && Class74.anInt624 * -562612321 == 4) && var43) {
									var40 = true;
								}

								var47 = false;
								if ((823601801 * Class74.anInt627 == 1
										|| !ClanMate.aBool1221 && 823601801 * Class74.anInt627 == 4)
										&& -2040065729 * Class74.anInt628 >= var23
										&& Class74.anInt629 * 2090526775 >= var25
										&& Class74.anInt628 * -2040065729 < var16
										&& Class74.anInt629 * 2090526775 < var17) {
									var47 = true;
								}

								if (var47) {
									Class68.method327(var13, Class74.anInt628 * -2040065729 - var20,
											Class74.anInt629 * 2090526775 - var15);
								}

								if (Client.aWidget2141 != null && var13 != Client.aWidget2141 && var43) {
									var24 = Class30.getWidgetConfig(var13);
									boolean var37 = (var24 >> 20 & 1) != 0;
									if (var37) {
										Client.aWidget2009 = var13;
									}
								}

								if (Client.aWidget2142 == var13) {
									Client.aBool2145 = true;
									Client.anInt2146 = var20 * -548999593;
									Client.anInt2147 = -553751249 * var15;
								}

								if (var13.aBool1169) {
									ScriptEvent var38;
									if (var43 && -1955541359 * Client.anInt2163 != 0 && var13.scrollListener != null) {
										var38 = new ScriptEvent();
										var38.aBool1432 = true;
										var38.aWidget1430 = var13;
										var38.anInt1431 = Client.anInt2163 * -528893375;
										var38.args = var13.scrollListener;
										Client.aDeque2164.method475(var38);
									}

									if (Client.aWidget2141 != null || DualNode_Sub1.aWidget1446 != null
											|| Client.menuOpen) {
										var47 = false;
										var40 = false;
										var43 = false;
									}

									if (!var13.aBool1145 && var47) {
										var13.aBool1145 = true;
										if (var13.anObjectArray1171 != null) {
											var38 = new ScriptEvent();
											var38.aBool1432 = true;
											var38.aWidget1430 = var13;
											var38.anInt1438 = (Class74.anInt628 * -2040065729 - var20) * 1833150263;
											var38.anInt1431 = 1385195697 * (2090526775 * Class74.anInt629 - var15);
											var38.args = var13.anObjectArray1171;
											Client.aDeque2164.method475(var38);
										}
									}

									if (var13.aBool1145 && var40 && var13.anObjectArray1172 != null) {
										var38 = new ScriptEvent();
										var38.aBool1432 = true;
										var38.aWidget1430 = var13;
										var38.anInt1438 = (Class74.anInt621 * -453286219 - var20) * 1833150263;
										var38.anInt1431 = (103771565 * Class74.anInt622 - var15) * 1385195697;
										var38.args = var13.anObjectArray1172;
										Client.aDeque2164.method475(var38);
									}

									if (var13.aBool1145 && !var40) {
										var13.aBool1145 = false;
										if (var13.anObjectArray1173 != null) {
											var38 = new ScriptEvent();
											var38.aBool1432 = true;
											var38.aWidget1430 = var13;
											var38.anInt1438 = (-453286219 * Class74.anInt621 - var20) * 1833150263;
											var38.anInt1431 = (103771565 * Class74.anInt622 - var15) * 1385195697;
											var38.args = var13.anObjectArray1173;
											Client.aDeque2166.method475(var38);
										}
									}

									if (var40 && var13.anObjectArray1174 != null) {
										var38 = new ScriptEvent();
										var38.aBool1432 = true;
										var38.aWidget1430 = var13;
										var38.anInt1438 = (-453286219 * Class74.anInt621 - var20) * 1833150263;
										var38.anInt1431 = (Class74.anInt622 * 103771565 - var15) * 1385195697;
										var38.args = var13.anObjectArray1174;
										Client.aDeque2164.method475(var38);
									}

									if (!var13.aBool1165 && var43) {
										var13.aBool1165 = true;
										if (var13.mouseEnterListener != null) {
											var38 = new ScriptEvent();
											var38.aBool1432 = true;
											var38.aWidget1430 = var13;
											var38.anInt1438 = 1833150263 * (Class74.anInt621 * -453286219 - var20);
											var38.anInt1431 = (Class74.anInt622 * 103771565 - var15) * 1385195697;
											var38.args = var13.mouseEnterListener;
											Client.aDeque2164.method475(var38);
										}
									}

									if (var13.aBool1165 && var43 && var13.mouseHoverListener != null) {
										var38 = new ScriptEvent();
										var38.aBool1432 = true;
										var38.aWidget1430 = var13;
										var38.anInt1438 = (-453286219 * Class74.anInt621 - var20) * 1833150263;
										var38.anInt1431 = 1385195697 * (Class74.anInt622 * 103771565 - var15);
										var38.args = var13.mouseHoverListener;
										Client.aDeque2164.method475(var38);
									}

									if (var13.aBool1165 && !var43) {
										var13.aBool1165 = false;
										if (var13.mouseExitListener != null) {
											var38 = new ScriptEvent();
											var38.aBool1432 = true;
											var38.aWidget1430 = var13;
											var38.anInt1438 = 1833150263 * (-453286219 * Class74.anInt621 - var20);
											var38.anInt1431 = (Class74.anInt622 * 103771565 - var15) * 1385195697;
											var38.args = var13.mouseExitListener;
											Client.aDeque2166.method475(var38);
										}
									}

									if (var13.renderListener != null) {
										var38 = new ScriptEvent();
										var38.aWidget1430 = var13;
										var38.args = var13.renderListener;
										Client.aDeque2165.method475(var38);
									}

									ScriptEvent var50;
									if (var13.configListenerArgs != null
											&& Client.anInt2153 * -729938695 > var13.anInt1197 * -1243107947) {
										if (var13.configTriggers != null && Client.anInt2153 * -729938695
												- var13.anInt1197 * -1243107947 <= 32) {
											label957: for (var10 = -1243107947
													* var13.anInt1197; var10 < Client.anInt2153 * -729938695; ++var10) {
												var24 = Client.anIntArray2152[var10 & 31];

												for (var26 = 0; var26 < var13.configTriggers.length; ++var26) {
													if (var24 == var13.configTriggers[var26]) {
														var50 = new ScriptEvent();
														var50.aWidget1430 = var13;
														var50.args = var13.configListenerArgs;
														Client.aDeque2164.method475(var50);
														break label957;
													}
												}
											}
										} else {
											var38 = new ScriptEvent();
											var38.aWidget1430 = var13;
											var38.args = var13.configListenerArgs;
											Client.aDeque2164.method475(var38);
										}

										var13.anInt1197 = Client.anInt2153 * 1429878997;
									}

									if (var13.tableListenerArgs != null
											&& -1512766933 * Client.anInt2079 > -1925975647 * var13.anInt1200) {
										if (var13.tableModTriggers != null && -1512766933 * Client.anInt2079
												- -1925975647 * var13.anInt1200 <= 32) {
											label938: for (var10 = var13.anInt1200 * -1925975647; var10 < -1512766933
													* Client.anInt2079; ++var10) {
												var24 = Client.anIntArray2154[var10 & 31];

												for (var26 = 0; var26 < var13.tableModTriggers.length; ++var26) {
													if (var13.tableModTriggers[var26] == var24) {
														var50 = new ScriptEvent();
														var50.aWidget1430 = var13;
														var50.args = var13.tableListenerArgs;
														Client.aDeque2164.method475(var50);
														break label938;
													}
												}
											}
										} else {
											var38 = new ScriptEvent();
											var38.aWidget1430 = var13;
											var38.args = var13.tableListenerArgs;
											Client.aDeque2164.method475(var38);
										}

										var13.anInt1200 = -679331765 * Client.anInt2079;
									}

									if (var13.skillListenerArgs != null
											&& -549276637 * Client.anInt2157 > 415543593 * var13.anInt1199) {
										if (var13.skillTriggers != null
												&& -549276637 * Client.anInt2157 - var13.anInt1199 * 415543593 <= 32) {
											label919: for (var10 = 415543593 * var13.anInt1199; var10 < -549276637
													* Client.anInt2157; ++var10) {
												var24 = Client.anIntArray2156[var10 & 31];

												for (var26 = 0; var26 < var13.skillTriggers.length; ++var26) {
													if (var13.skillTriggers[var26] == var24) {
														var50 = new ScriptEvent();
														var50.aWidget1430 = var13;
														var50.args = var13.skillListenerArgs;
														Client.aDeque2164.method475(var50);
														break label919;
													}
												}
											}
										} else {
											var38 = new ScriptEvent();
											var38.aWidget1430 = var13;
											var38.args = var13.skillListenerArgs;
											Client.aDeque2164.method475(var38);
										}

										var13.anInt1199 = -218863509 * Client.anInt2157;
									}

									if (Client.anInt2078 * -2089342185 > 1565124835 * var13.anInt1196
											&& var13.anObjectArray1181 != null) {
										var38 = new ScriptEvent();
										var38.aWidget1430 = var13;
										var38.args = var13.anObjectArray1181;
										Client.aDeque2164.method475(var38);
									}

									if (Client.anInt2114 * -537338829 > 1565124835 * var13.anInt1196
											&& var13.anObjectArray1183 != null) {
										var38 = new ScriptEvent();
										var38.aWidget1430 = var13;
										var38.args = var13.anObjectArray1183;
										Client.aDeque2164.method475(var38);
									}

									if (Client.anInt2159 * -1898555245 > var13.anInt1196 * 1565124835
											&& var13.anObjectArray1184 != null) {
										var38 = new ScriptEvent();
										var38.aWidget1430 = var13;
										var38.args = var13.anObjectArray1184;
										Client.aDeque2164.method475(var38);
									}

									if (Client.anInt2160 * 1861004399 > var13.anInt1196 * 1565124835
											&& var13.anObjectArray1189 != null) {
										var38 = new ScriptEvent();
										var38.aWidget1430 = var13;
										var38.args = var13.anObjectArray1189;
										Client.aDeque2164.method475(var38);
									}

									if (Client.anInt2161 * -596556353 > 1565124835 * var13.anInt1196
											&& var13.anObjectArray1190 != null) {
										var38 = new ScriptEvent();
										var38.aWidget1430 = var13;
										var38.args = var13.anObjectArray1190;
										Client.aDeque2164.method475(var38);
									}

									if (Client.anInt2155 * -747354515 > 1565124835 * var13.anInt1196
											&& var13.anObjectArray1156 != null) {
										var38 = new ScriptEvent();
										var38.aWidget1430 = var13;
										var38.args = var13.anObjectArray1156;
										Client.aDeque2164.method475(var38);
									}

									var13.anInt1196 = Client.anInt2151 * -1951905989;
									if (var13.anObjectArray1182 != null) {
										for (var10 = 0; var10 < Client.anInt2188 * -703165807; ++var10) {
											ScriptEvent var49 = new ScriptEvent();
											var49.aWidget1430 = var13;
											var49.anInt1434 = -411848293 * Client.anIntArray2190[var10];
											var49.anInt1435 = Client.anIntArray2162[var10] * -784457691;
											var49.args = var13.anObjectArray1182;
											Client.aDeque2164.method475(var49);
										}
									}
								}
							}

							if (!var13.interactable && Client.aWidget2141 == null && DualNode_Sub1.aWidget1446 == null
									&& !Client.menuOpen) {
								if ((var13.anInt1153 * -700429819 >= 0 || 301172361 * var13.anInt1140 != 0)
										&& -453286219 * Class74.anInt621 >= var23
										&& 103771565 * Class74.anInt622 >= var25
										&& Class74.anInt621 * -453286219 < var16
										&& Class74.anInt622 * 103771565 < var17) {
									if (-700429819 * var13.anInt1153 >= 0) {
										ObjectDefinition.aWidget1719 = var0[var13.anInt1153 * -700429819];
									} else {
										ObjectDefinition.aWidget1719 = var13;
									}
								}

								if (-1305917269 * var13.type == 8 && Class74.anInt621 * -453286219 >= var23
										&& 103771565 * Class74.anInt622 >= var25
										&& Class74.anInt621 * -453286219 < var16
										&& Class74.anInt622 * 103771565 < var17) {
									ScriptEvent.aWidget1437 = var13;
								}

								if (var13.viewportHeight * 177405235 > var13.height * 1227800423) {
									Class35.method205(var13, var13.width * 1645211541 + var20, var15,
											1227800423 * var13.height, 177405235 * var13.viewportHeight,
											-453286219 * Class74.anInt621, Class74.anInt622 * 103771565);
								}
							}
						}
					}
				}
			}
		}

	}
}
