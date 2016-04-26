import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class Class96_Sub1 extends Class96 {

	static Picture[] aSpriteArray1204;
	static AbstractIndex aClass87_1207;
	static Task socket;
	int anInt1206 = (int) (AnimationSkin.currentTimeMs() / 1000L);
	String aString1203;
	short aShort1205;

	public static void method498(AbstractIndex var0, AbstractIndex var1, boolean var2) {
		ObjectType.objects_ref = var0;
		ObjectType.aClass87_1683 = var1;
		ObjectType.aBool1696 = var2;
	}

	public static SpotAnimType getSpotAnimType(int id) {
		SpotAnimType type = (SpotAnimType) SpotAnimType.spotanims.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = SpotAnimType.anim_ref.getFile(13, id);
			type = new SpotAnimType();
			type.id = id;
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			SpotAnimType.spotanims.put(type, (long) id);
			return type;
		}
	}

	public static final void sleep(long millis) {
		if (millis > 0L) {
			if (millis % 10L == 0L) {
				long actual = millis - 1L;

				try {
					Thread.sleep(actual);
				} catch (InterruptedException var7) {
					;
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var6) {
					;
				}
			} else {
				try {
					Thread.sleep(millis);
				} catch (InterruptedException var5) {
					;
				}
			}
		}

	}

	public static void method501() {
		if (TaskManager.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyFocusListener.keyCodes[186] = 57;
			KeyFocusListener.keyCodes[187] = 27;
			KeyFocusListener.keyCodes[188] = 71;
			KeyFocusListener.keyCodes[189] = 26;
			KeyFocusListener.keyCodes[190] = 72;
			KeyFocusListener.keyCodes[191] = 73;
			KeyFocusListener.keyCodes[192] = 58;
			KeyFocusListener.keyCodes[219] = 42;
			KeyFocusListener.keyCodes[220] = 74;
			KeyFocusListener.keyCodes[221] = 43;
			KeyFocusListener.keyCodes[222] = 59;
			KeyFocusListener.keyCodes[223] = 28;
		} else {
			KeyFocusListener.keyCodes[44] = 71;
			KeyFocusListener.keyCodes[45] = 26;
			KeyFocusListener.keyCodes[46] = 72;
			KeyFocusListener.keyCodes[47] = 73;
			KeyFocusListener.keyCodes[59] = 57;
			KeyFocusListener.keyCodes[61] = 27;
			KeyFocusListener.keyCodes[91] = 42;
			KeyFocusListener.keyCodes[92] = 74;
			KeyFocusListener.keyCodes[93] = 43;
			KeyFocusListener.keyCodes[192] = 28;
			KeyFocusListener.keyCodes[222] = 58;
			KeyFocusListener.keyCodes[520] = 59;
		}

	}

	public static int method502(CharSequence var0, CharSequence var1, int var2) {
		int var3 = var0.length();
		int var11 = var1.length();
		int var9 = 0;
		int var10 = 0;
		byte var7 = 0;
		byte var8 = 0;

		char var14;
		while (var9 - var7 < var3 || var10 - var8 < var11) {
			if (var9 - var7 >= var3) {
				return -1;
			}

			if (var10 - var8 >= var11) {
				return 1;
			}

			char var19;
			if (var7 != 0) {
				var19 = (char) var7;
				boolean var17 = false;
			} else {
				var19 = var0.charAt(var9++);
			}

			if (var8 != 0) {
				var14 = (char) var8;
				boolean var20 = false;
			} else {
				var14 = var1.charAt(var10++);
			}

			byte var16;
			if (var19 == 198) {
				var16 = 69;
			} else if (var19 == 230) {
				var16 = 101;
			} else if (var19 == 223) {
				var16 = 115;
			} else if (var19 != 338) {
				if (var19 == 339) {
					var16 = 101;
				} else {
					var16 = 0;
				}
			} else {
				var16 = 69;
			}

			var7 = var16;
			byte var15;
			if (var14 == 198) {
				var15 = 69;
			} else if (var14 != 230) {
				if (var14 == 223) {
					var15 = 115;
				} else if (var14 != 338) {
					if (var14 == 339) {
						var15 = 101;
					} else {
						var15 = 0;
					}
				} else {
					var15 = 69;
				}
			} else {
				var15 = 101;
			}

			var8 = var15;
			var19 = InvType.method695(var19, var2);
			var14 = InvType.method695(var14, var2);
			if (var14 != var19 && java.lang.Character.toUpperCase(var19) != java.lang.Character.toUpperCase(var14)) {
				var19 = java.lang.Character.toLowerCase(var19);
				var14 = java.lang.Character.toLowerCase(var14);
				if (var19 != var14) {
					return ObjectType.method864(var19, var2) - ObjectType.method864(var14, var2);
				}
			}
		}

		int var151 = Math.min(var3, var11);

		int var171;
		for (var171 = 0; var171 < var151; var171++) {
			char var18 = var0.charAt(var171);
			var14 = var1.charAt(var171);
			if (var18 != var14 && java.lang.Character.toUpperCase(var18) != java.lang.Character.toUpperCase(var14)) {
				var18 = java.lang.Character.toLowerCase(var18);
				var14 = java.lang.Character.toLowerCase(var14);
				if (var14 != var18) {
					return ObjectType.method864(var18, var2) - ObjectType.method864(var14, var2);
				}
			}
		}

		var171 = var3 - var11;
		if (var171 != 0) {
			return var171;
		} else {
			for (int var191 = 0; var191 < var151; var191++) {
				var14 = var0.charAt(var191);
				char var5 = var1.charAt(var191);
				if (var14 != var5) {
					return ObjectType.method864(var14, var2) - ObjectType.method864(var5, var2);
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

	static void execute(ScriptEvent var0) {
		AbstractByteBuffer.execute(var0, 200000);
	}

	Class96_Sub1(String var1, int var2) {
		this.aString1203 = var1;
		this.aShort1205 = (short) var2;
	}

	static final void method505(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; var8++) {
			Widget var13 = var0[var8];
			if (var13 != null
					&& (!var13.interactable || var13.type == 0 || var13.aBool1169 || Class30.getWidgetConfig(var13) != 0
							|| Client.aWidget2142 == var13 || var13.contentType == 1338)
					&& var13.parentId == var1 && (!var13.interactable || !IsaacRandom.method68(var13))) {
				int var20 = var13.relativeX + var6;
				int var15 = var13.relativeY + var7;
				int var11;
				int var12;
				int var16;
				int var17;
				int var21;
				int var22;
				int var23;
				int var25;
				if (var13.type == 2) {
					var23 = var2;
					var25 = var3;
					var16 = var4;
					var17 = var5;
				} else if (var13.type == 9) {
					var21 = var20;
					var22 = var15;
					var12 = var13.width + var20;
					var11 = var13.height * 1227800423 + var15;
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
					var21 = var13.width + var20;
					var22 = var13.height * 1227800423 + var15;
					var23 = var20 > var2 ? var20 : var2;
					var25 = var15 > var3 ? var15 : var3;
					var16 = var21 < var4 ? var21 : var4;
					var17 = var22 < var5 ? var22 : var5;
				}

				if (Client.aWidget2141 == var13) {
					Client.aBool2148 = true;
					Client.anInt2050 = var20;
					Client.anInt2149 = var15;
				}

				if (!var13.interactable || var23 < var16 && var25 < var17) {
					var21 = Class74.anInt621;
					var22 = Class74.anInt622;
					if (Class74.anInt627 != 0) {
						var21 = Class74.anInt628;
						var22 = Class74.anInt629;
					}

					if (var13.contentType == 1337) {
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
						if (var13.contentType == 1338) {
							if ((Client.anInt2200 == 0 || Client.anInt2200 == 3)
									&& (Class74.anInt627 == 1 || !ClanMate.aBool1221 && Class74.anInt627 == 4)) {
								DualNode_Sub14 var401 = var13.method491(true);
								if (var401 != null) {
									var11 = Class74.anInt628 - var20;
									var46 = Class74.anInt629 - var15;
									if (var401.method823(var11, var46)) {
										var11 -= var401.anInt1647 / 2;
										var46 -= var401.anInt1648 / 2;
										var10 = Client.minimapScale + Client.minimapRotation & 0x7ff;
										var24 = TexturedGraphic.SIN_TABLE[var10];
										var26 = TexturedGraphic.COS_TABLE[var10];
										var24 = (Client.viewRotation + 256) * var24 >> 8;
										var26 = (Client.viewRotation + 256) * var26 >> 8;
										var27 = var11 * var26 + var24 * var46 >> 11;
										int var44 = var26 * var46 - var11 * var24 >> 11;
										int var491 = Class68.myPlayer.strictX + var27 >> 7;
										var18 = Class68.myPlayer.strictY - var44 >> 7;
										Client.outBuffer.putHeader(239);
										Client.outBuffer.putByte(18);
										Client.outBuffer.putByteC(KeyFocusListener.aBoolArray593[82]
												? (KeyFocusListener.aBoolArray593[81] ? 2 : 1) : 0);
										Client.outBuffer.putLEShortA(Node_Sub10.chunkLeftX + var491);
										Client.outBuffer.putLEShort(VarClientHub.chunkLeftY + var18);
										Client.outBuffer.putByte(var11);
										Client.outBuffer.putByte(var46);
										Client.outBuffer.putShort(Client.minimapRotation);
										Client.outBuffer.putByte(57);
										Client.outBuffer.putByte(Client.minimapScale);
										Client.outBuffer.putByte(Client.viewRotation);
										Client.outBuffer.putByte(89);
										Client.outBuffer.putShort(Class68.myPlayer.strictX);
										Client.outBuffer.putShort(Class68.myPlayer.strictY);
										Client.outBuffer.putByte(63);
										Client.destinationX = var491;
										Client.destinationY = var18;
									}
								}
							}
						} else {
							boolean var47;
							boolean var40;
							if (!Client.menuOpen && var21 >= var23 && var22 >= var25 && var21 < var16
									&& var22 < var17) {
								var12 = var21 - var20;
								var11 = var22 - var15;
								if (var13.anInt1195 == 1) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 24, 0, 0, var13.hash);
								}

								String var42;
								if (var13.anInt1195 == 2 && !Client.spellSelected) {
									var42 = Class26.method168(var13);
									if (var42 != null) {
										FriendedPlayer.addMenuRow(var42,
												Class48_Sub1.method545('\uff00') + var13.aString1125, 25, 0, -1,
												var13.hash);
									}
								}

								if (var13.anInt1195 == 3) {
									FriendedPlayer.addMenuRow("Close", "", 26, 0, 0, var13.hash);
								}

								if (var13.anInt1195 == 4) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 28, 0, 0, var13.hash);
								}

								if (var13.anInt1195 == 5) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 29, 0, 0, var13.hash);
								}

								if (var13.anInt1195 == 6 && Client.aWidget2135 == null) {
									FriendedPlayer.addMenuRow(var13.tooltip, "", 30, 0, -1, var13.hash);
								}

								if (var13.type == 2) {
									var46 = 0;

									for (var10 = 0; var10 < var13.height * 1227800423; var10++) {
										for (var24 = 0; var24 < var13.width; var24++) {
											var26 = (var13.columnPadding + 32) * var24;
											var27 = (var13.rowPadding + 32) * var10;
											if (var46 < 20) {
												var26 += var13.xSprites[var46];
												var27 += var13.anIntArray1163[var46];
											}

											if (var12 >= var26 && var11 >= var27 && var12 < var26 + 32
													&& var11 < var27 + 32) {
												Client.anInt2124 = var46;
												TileDecorationStub.aWidget838 = var13;
												if (var13.itemIds[var46] > 0) {
													label976: {
														ItemType var43 = FriendedPlayer
																.getItemType(var13.itemIds[var46] - 1);
														if (Client.itemSelectionStatus == 1) {
															var18 = Class30.getWidgetConfig(var13);
															var40 = (var18 >> 30 & 0x1) != 0;
															if (var40) {
																if (Class22.anInt286 != var13.hash
																		|| Class40.selectedItemIndex != var46) {
																	FriendedPlayer.addMenuRow("Use",
																			Client.selectedItemName + " "
																					+ Class35.aString391 + " "
																					+ Class48_Sub1.method545(16748608)
																					+ var43.name,
																			31, var43.id, var46, var13.hash);
																}
																break label976;
															}
														}

														if (Client.spellSelected) {
															var18 = Class30.getWidgetConfig(var13);
															var40 = (var18 >> 30 & 0x1) != 0;
															if (var40) {
																if ((Class31.currentSpellTargets & 0x10) == 16) {
																	FriendedPlayer.addMenuRow(Client.menuActionPrefix,
																			Client.selectedSpellName + " "
																					+ Class35.aString391 + " "
																					+ Class48_Sub1.method545(16748608)
																					+ var43.name,
																			32, var43.id, var46, var13.hash);
																}
																break label976;
															}
														}

														String[] var38 = var43.actions;
														if (Client.aBool2139) {
															var38 = GameCanvas.method885(var38);
														}

														int var50 = Class30.getWidgetConfig(var13);
														boolean var49 = (var50 >> 30 & 0x1) != 0;
														int var54;
														if (var49) {
															for (var54 = 4; var54 >= 3; --var54) {
																if (var38 != null && var38[var54] != null) {
																	byte var35;
																	if (var54 == 3) {
																		var35 = 36;
																	} else {
																		var35 = 37;
																	}

																	FriendedPlayer.addMenuRow(var38[var54],
																			Class48_Sub1.method545(16748608)
																					+ var43.name,
																			var35, var43.id, var46, var13.hash);
																} else if (var54 == 4) {
																	FriendedPlayer.addMenuRow("Drop",
																			Class48_Sub1.method545(16748608)
																					+ var43.name,
																			37, var43.id, var46, var13.hash);
																}
															}
														}

														var54 = Class30.getWidgetConfig(var13);
														boolean var51 = (var54 >> 31 & 0x1) != 0;
														if (var51) {
															FriendedPlayer.addMenuRow("Use",
																	Class48_Sub1.method545(16748608) + var43.name, 38,
																	var43.id, var46, var13.hash);
														}

														int var34 = Class30.getWidgetConfig(var13);
														boolean var31 = (var34 >> 30 & 0x1) != 0;
														byte var14;
														int var30;
														if (var31 && var38 != null) {
															for (var30 = 2; var30 >= 0; --var30) {
																if (var38[var30] != null) {
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

																	FriendedPlayer.addMenuRow(var38[var30],
																			Class48_Sub1.method545(16748608)
																					+ var43.name,
																			var14, var43.id, var46, var13.hash);
																}
															}
														}

														var38 = var13.tableActions;
														if (Client.aBool2139) {
															var38 = GameCanvas.method885(var38);
														}

														if (var38 != null) {
															for (var30 = 4; var30 >= 0; --var30) {
																if (var38[var30] != null) {
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

																	FriendedPlayer.addMenuRow(var38[var30],
																			Class48_Sub1.method545(16748608)
																					+ var43.name,
																			var14, var43.id, var46, var13.hash);
																}
															}
														}

														FriendedPlayer.addMenuRow("Examine",
																Class48_Sub1.method545(16748608) + var43.name, 1005,
																var43.id, var46, var13.hash);
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
										var47 = (var10 >> 21 & 0x1) != 0;
										if (var47 && (Class31.currentSpellTargets & 0x20) == 32) {
											FriendedPlayer.addMenuRow(
													Client.menuActionPrefix, Client.selectedSpellName + " "
															+ Class35.aString391 + " " + var13.name,
													58, 0, var13.index, var13.hash);
										}
									} else {
										String var421;
										for (var46 = 9; var46 >= 5; --var46) {
											var421 = Player.method1049(var13, var46);
											if (var421 != null) {
												FriendedPlayer.addMenuRow(var421, var13.name, 1007, var46 + 1,
														var13.index, var13.hash);
											}
										}

										var42 = Class26.method168(var13);
										if (var42 != null) {
											FriendedPlayer.addMenuRow(var42, var13.name, 25, 0, var13.index,
													var13.hash);
										}

										for (var10 = 4; var10 >= 0; --var10) {
											var421 = Player.method1049(var13, var10);
											if (var421 != null) {
												FriendedPlayer.addMenuRow(var421, var13.name, 57, var10 + 1,
														var13.index, var13.hash);
											}
										}

										if (Class7.method78(Class30.getWidgetConfig(var13))) {
											FriendedPlayer.addMenuRow("Continue", "", 30, 0, var13.index, var13.hash);
										}
									}
								}
							}

							if (var13.type == 0) {
								if (!var13.interactable && IsaacRandom.method68(var13)
										&& ObjectType.aWidget1719 != var13) {
									continue;
								}

								method505(var0, var13.hash, var23, var25, var16, var17, var20 - var13.insetX,
										var15 - var13.insetY);
								if (var13.children != null) {
									method505(var13.children, var13.hash, var23, var25, var16, var17,
											var20 - var13.insetX, var15 - var13.insetY);
								}

								InterfaceNode var39 = (InterfaceNode) Client.interfaceNodes.get((long) var13.hash);
								if (var39 != null) {
									if (var39.owner == 0 && Class74.anInt621 >= var23 && Class74.anInt622 >= var25
											&& Class74.anInt621 < var16 && Class74.anInt622 < var17 && !Client.menuOpen
											&& !Client.aBool2024) {
										for (ScriptEvent var431 = (ScriptEvent) Client.aDeque2164
												.getFront(); var431 != null; var431 = (ScriptEvent) Client.aDeque2164
														.getNext()) {
											if (var431.aBool1432) {
												var431.unlink();
												var431.widget.aBool1165 = false;
											}
										}

										if (FriendedPlayer.anInt739 == 0) {
											Client.aWidget2141 = null;
											Client.aWidget2142 = null;
										}

										if (!Client.menuOpen) {
											Client.menuActions[0] = "Cancel";
											Client.menuNouns[0] = "";
											Client.menuOpcodes[0] = 1006;
											Client.menuItemCount = 1;
										}
									}

									Class40.method222(var39.type, var23, var25, var16, var17, var20, var15);
								}
							}

							if (var13.interactable) {
								ScriptEvent var41;
								if (!var13.aBool1201) {
									if (var13.aBool1175 && Class74.anInt621 >= var23 && Class74.anInt622 >= var25
											&& Class74.anInt621 < var16 && Class74.anInt622 < var17) {
										for (var41 = (ScriptEvent) Client.aDeque2164
												.getFront(); var41 != null; var41 = (ScriptEvent) Client.aDeque2164
														.getNext()) {
											if (var41.aBool1432 && var41.args == var41.widget.scrollListener) {
												var41.unlink();
											}
										}
									}
								} else if (Class74.anInt621 >= var23 && Class74.anInt622 >= var25
										&& Class74.anInt621 < var16 && Class74.anInt622 < var17) {
									for (var41 = (ScriptEvent) Client.aDeque2164
											.getFront(); var41 != null; var41 = (ScriptEvent) Client.aDeque2164
													.getNext()) {
										if (var41.aBool1432) {
											var41.unlink();
											var41.widget.aBool1165 = false;
										}
									}

									if (FriendedPlayer.anInt739 == 0) {
										Client.aWidget2141 = null;
										Client.aWidget2142 = null;
									}

									if (!Client.menuOpen) {
										Client.menuActions[0] = "Cancel";
										Client.menuNouns[0] = "";
										Client.menuOpcodes[0] = 1006;
										Client.menuItemCount = 1;
									}
								}

								boolean var45;
								if (Class74.anInt621 >= var23 && Class74.anInt622 >= var25 && Class74.anInt621 < var16
										&& Class74.anInt622 < var17) {
									var45 = true;
								} else {
									var45 = false;
								}

								var40 = false;
								if ((Class74.anInt624 == 1 || !ClanMate.aBool1221 && Class74.anInt624 == 4) && var45) {
									var40 = true;
								}

								var47 = false;
								if ((Class74.anInt627 == 1 || !ClanMate.aBool1221 && Class74.anInt627 == 4)
										&& Class74.anInt628 >= var23 && Class74.anInt629 >= var25
										&& Class74.anInt628 < var16 && Class74.anInt629 < var17) {
									var47 = true;
								}

								if (var47) {
									Class68.method327(var13, Class74.anInt628 - var20, Class74.anInt629 - var15);
								}

								if (Client.aWidget2141 != null && Client.aWidget2141 != var13 && var45) {
									var24 = Class30.getWidgetConfig(var13);
									boolean var471 = (var24 >> 20 & 0x1) != 0;
									if (var471) {
										Client.aWidget2009 = var13;
									}
								}

								if (Client.aWidget2142 == var13) {
									Client.aBool2145 = true;
									Client.anInt2146 = var20;
									Client.anInt2147 = var15;
								}

								if (var13.aBool1169) {
									ScriptEvent var501;
									if (var45 && Client.anInt2163 != 0 && var13.scrollListener != null) {
										var501 = new ScriptEvent();
										var501.aBool1432 = true;
										var501.widget = var13;
										var501.anInt1431 = Client.anInt2163;
										var501.args = var13.scrollListener;
										Client.aDeque2164.method475(var501);
									}

									if (Client.aWidget2141 != null || SpotAnimType.aWidget1446 != null
											|| Client.menuOpen) {
										var47 = false;
										var40 = false;
										var45 = false;
									}

									if (!var13.aBool1145 && var47) {
										var13.aBool1145 = true;
										if (var13.anObjectArray1171 != null) {
											var501 = new ScriptEvent();
											var501.aBool1432 = true;
											var501.widget = var13;
											var501.anInt1438 = Class74.anInt628 - var20;
											var501.anInt1431 = Class74.anInt629 - var15;
											var501.args = var13.anObjectArray1171;
											Client.aDeque2164.method475(var501);
										}
									}

									if (var13.aBool1145 && var40 && var13.anObjectArray1172 != null) {
										var501 = new ScriptEvent();
										var501.aBool1432 = true;
										var501.widget = var13;
										var501.anInt1438 = Class74.anInt621 - var20;
										var501.anInt1431 = Class74.anInt622 - var15;
										var501.args = var13.anObjectArray1172;
										Client.aDeque2164.method475(var501);
									}

									if (var13.aBool1145 && !var40) {
										var13.aBool1145 = false;
										if (var13.anObjectArray1173 != null) {
											var501 = new ScriptEvent();
											var501.aBool1432 = true;
											var501.widget = var13;
											var501.anInt1438 = Class74.anInt621 - var20;
											var501.anInt1431 = Class74.anInt622 - var15;
											var501.args = var13.anObjectArray1173;
											Client.aDeque2166.method475(var501);
										}
									}

									if (var40 && var13.anObjectArray1174 != null) {
										var501 = new ScriptEvent();
										var501.aBool1432 = true;
										var501.widget = var13;
										var501.anInt1438 = Class74.anInt621 - var20;
										var501.anInt1431 = Class74.anInt622 - var15;
										var501.args = var13.anObjectArray1174;
										Client.aDeque2164.method475(var501);
									}

									if (!var13.aBool1165 && var45) {
										var13.aBool1165 = true;
										if (var13.mouseEnterListener != null) {
											var501 = new ScriptEvent();
											var501.aBool1432 = true;
											var501.widget = var13;
											var501.anInt1438 = Class74.anInt621 - var20;
											var501.anInt1431 = Class74.anInt622 - var15;
											var501.args = var13.mouseEnterListener;
											Client.aDeque2164.method475(var501);
										}
									}

									if (var13.aBool1165 && var45 && var13.mouseHoverListener != null) {
										var501 = new ScriptEvent();
										var501.aBool1432 = true;
										var501.widget = var13;
										var501.anInt1438 = Class74.anInt621 - var20;
										var501.anInt1431 = Class74.anInt622 - var15;
										var501.args = var13.mouseHoverListener;
										Client.aDeque2164.method475(var501);
									}

									if (var13.aBool1165 && !var45) {
										var13.aBool1165 = false;
										if (var13.mouseExitListener != null) {
											var501 = new ScriptEvent();
											var501.aBool1432 = true;
											var501.widget = var13;
											var501.anInt1438 = Class74.anInt621 - var20;
											var501.anInt1431 = Class74.anInt622 - var15;
											var501.args = var13.mouseExitListener;
											Client.aDeque2166.method475(var501);
										}
									}

									if (var13.renderListener != null) {
										var501 = new ScriptEvent();
										var501.widget = var13;
										var501.args = var13.renderListener;
										Client.aDeque2165.method475(var501);
									}

									ScriptEvent var461;
									if (var13.configListenerArgs != null && Client.anInt2153 > var13.anInt1197) {
										if (var13.configTriggers != null && Client.anInt2153 - var13.anInt1197 <= 32) {
											label681: for (var10 = var13.anInt1197; var10 < Client.anInt2153; var10++) {
												var24 = Client.anIntArray2152[var10 & 0x1f];

												for (var26 = 0; var26 < var13.configTriggers.length; var26++) {
													if (var13.configTriggers[var26] == var24) {
														var461 = new ScriptEvent();
														var461.widget = var13;
														var461.args = var13.configListenerArgs;
														Client.aDeque2164.method475(var461);
														break label681;
													}
												}
											}
										} else {
											var501 = new ScriptEvent();
											var501.widget = var13;
											var501.args = var13.configListenerArgs;
											Client.aDeque2164.method475(var501);
										}

										var13.anInt1197 = Client.anInt2153;
									}

									if (var13.tableListenerArgs != null && Client.anInt2079 > var13.anInt1200) {
										if (var13.tableModTriggers != null
												&& Client.anInt2079 - var13.anInt1200 <= 32) {
											label657: for (var10 = var13.anInt1200; var10 < Client.anInt2079; var10++) {
												var24 = Client.anIntArray2154[var10 & 0x1f];

												for (var26 = 0; var26 < var13.tableModTriggers.length; var26++) {
													if (var13.tableModTriggers[var26] == var24) {
														var461 = new ScriptEvent();
														var461.widget = var13;
														var461.args = var13.tableListenerArgs;
														Client.aDeque2164.method475(var461);
														break label657;
													}
												}
											}
										} else {
											var501 = new ScriptEvent();
											var501.widget = var13;
											var501.args = var13.tableListenerArgs;
											Client.aDeque2164.method475(var501);
										}

										var13.anInt1200 = Client.anInt2079;
									}

									if (var13.skillListenerArgs != null && Client.anInt2157 > var13.anInt1199) {
										if (var13.skillTriggers != null && Client.anInt2157 - var13.anInt1199 <= 32) {
											label633: for (var10 = var13.anInt1199; var10 < Client.anInt2157; var10++) {
												var24 = Client.anIntArray2156[var10 & 0x1f];

												for (var26 = 0; var26 < var13.skillTriggers.length; var26++) {
													if (var13.skillTriggers[var26] == var24) {
														var461 = new ScriptEvent();
														var461.widget = var13;
														var461.args = var13.skillListenerArgs;
														Client.aDeque2164.method475(var461);
														break label633;
													}
												}
											}
										} else {
											var501 = new ScriptEvent();
											var501.widget = var13;
											var501.args = var13.skillListenerArgs;
											Client.aDeque2164.method475(var501);
										}

										var13.anInt1199 = Client.anInt2157;
									}

									if (Client.anInt2078 > var13.anInt1196 && var13.anObjectArray1181 != null) {
										var501 = new ScriptEvent();
										var501.widget = var13;
										var501.args = var13.anObjectArray1181;
										Client.aDeque2164.method475(var501);
									}

									if (Client.anInt2114 > var13.anInt1196 && var13.anObjectArray1183 != null) {
										var501 = new ScriptEvent();
										var501.widget = var13;
										var501.args = var13.anObjectArray1183;
										Client.aDeque2164.method475(var501);
									}

									if (Client.anInt2159 > var13.anInt1196 && var13.anObjectArray1184 != null) {
										var501 = new ScriptEvent();
										var501.widget = var13;
										var501.args = var13.anObjectArray1184;
										Client.aDeque2164.method475(var501);
									}

									if (Client.anInt2160 > var13.anInt1196 && var13.anObjectArray1189 != null) {
										var501 = new ScriptEvent();
										var501.widget = var13;
										var501.args = var13.anObjectArray1189;
										Client.aDeque2164.method475(var501);
									}

									if (Client.anInt2161 > var13.anInt1196 && var13.anObjectArray1190 != null) {
										var501 = new ScriptEvent();
										var501.widget = var13;
										var501.args = var13.anObjectArray1190;
										Client.aDeque2164.method475(var501);
									}

									if (Client.anInt2155 > var13.anInt1196 && var13.anObjectArray1156 != null) {
										var501 = new ScriptEvent();
										var501.widget = var13;
										var501.args = var13.anObjectArray1156;
										Client.aDeque2164.method475(var501);
									}

									var13.anInt1196 = Client.anInt2151;
									if (var13.anObjectArray1182 != null) {
										for (var10 = 0; var10 < Client.anInt2188; var10++) {
											ScriptEvent var48 = new ScriptEvent();
											var48.widget = var13;
											var48.anInt1434 = Client.anIntArray2190[var10];
											var48.anInt1435 = Client.anIntArray2162[var10];
											var48.args = var13.anObjectArray1182;
											Client.aDeque2164.method475(var48);
										}
									}
								}
							}

							if (!var13.interactable && Client.aWidget2141 == null && SpotAnimType.aWidget1446 == null
									&& !Client.menuOpen) {
								if ((var13.anInt1153 >= 0 || var13.anInt1140 != 0) && Class74.anInt621 >= var23
										&& Class74.anInt622 >= var25 && Class74.anInt621 < var16
										&& Class74.anInt622 < var17) {
									if (var13.anInt1153 >= 0) {
										ObjectType.aWidget1719 = var0[var13.anInt1153];
									} else {
										ObjectType.aWidget1719 = var13;
									}
								}

								if (var13.type == 8 && Class74.anInt621 >= var23 && Class74.anInt622 >= var25
										&& Class74.anInt621 < var16 && Class74.anInt622 < var17) {
									ScriptEvent.aWidget1437 = var13;
								}

								if (var13.viewportHeight > var13.height * 1227800423) {
									Class35.method205(var13, var13.width + var20, var15, var13.height * 1227800423,
											var13.viewportHeight, Class74.anInt621, Class74.anInt622);
								}
							}
						}
					}
				}
			}
		}

	}

}
