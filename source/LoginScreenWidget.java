import java.awt.Graphics;

public class LoginScreenWidget {

	static int clanChatSize;
	public static MusicFile aNode_Sub11_693;

	static final void method365(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; var2++) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						method365(var3.children, var1);
					}

					InterfaceNode var5 = (InterfaceNode) Client.interfaceNodes.get((long) var3.hash);
					if (var5 != null) {
						Class65.method319(var5.type, var1);
					}
				}

				ScriptEvent var61;
				if (var1 == 0 && var3.anObjectArray1186 != null) {
					var61 = new ScriptEvent();
					var61.widget = var3;
					var61.args = var3.anObjectArray1186;
					Class96_Sub1.execute(var61);
				}

				if (var1 == 1 && var3.anObjectArray1187 != null) {
					if (var3.index >= 0) {
						Widget var6 = Class94.getWidget(var3.hash);
						if (var6 == null || var6.children == null || var3.index >= var6.children.length
								|| var6.children[var3.index] != var3) {
							continue;
						}
					}

					var61 = new ScriptEvent();
					var61.widget = var3;
					var61.args = var3.anObjectArray1187;
					Class96_Sub1.execute(var61);
				}
			}
		}

	}

	static final int method366(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 0x7f) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 0xff80) + var1;
		}
	}

	LoginScreenWidget() throws Throwable {
		throw new Error();
	}

	static void method367(DualNode_Sub13_Sub3_Sub1 var0, DualNode_Sub13_Sub3_Sub1 var1, DualNode_Sub13_Sub3_Sub1 var2,
			boolean var3) {
		if (var3) {
			Class6.anInt132 = (Class34.gameWidth - Client.anInt2233) / 2;
			Class6.anInt126 = Class6.anInt132 + 202;
		}

		int var5;
		int var7;
		int var12;
		int var14;
		int var28;
		byte var31;
		int var36;
		int var39;
		int var40;
		if (Class6.loadedWorlds) {
			if (Class93.aSpriteArray733 == null) {
				Class93.aSpriteArray733 = DynamicObject.method1023(AnimationSkin.spritesIndex, "sl_back", "");
			}

			if (Class2.aDualNode_Sub13_Sub2Array78 == null) {
				Class2.aDualNode_Sub13_Sub2Array78 = ObjectType.method868(AnimationSkin.spritesIndex, "sl_flags", "");
			}

			if (Class32.aDualNode_Sub13_Sub2Array357 == null) {
				Class32.aDualNode_Sub13_Sub2Array357 = ObjectType.method868(AnimationSkin.spritesIndex, "sl_arrows",
						"");
			}

			if (Node_Sub8.aDualNode_Sub13_Sub2Array1314 == null) {
				Node_Sub8.aDualNode_Sub13_Sub2Array1314 = ObjectType.method868(AnimationSkin.spritesIndex, "sl_stars",
						"");
			}

			RSGraphics.method793(Class6.anInt132, 23, 765, 480, 0);
			RSGraphics.method786(Class6.anInt132, 0, 125, 23, 12425273, 9135624);
			RSGraphics.method786(Class6.anInt132 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method982("Select a world", Class6.anInt132 + 62, 15, 0, -1);
			if (Node_Sub8.aDualNode_Sub13_Sub2Array1314 != null) {
				Node_Sub8.aDualNode_Sub13_Sub2Array1314[1].method929(Class6.anInt132 + 140, 1);
				var1.method980("Members only world", Class6.anInt132 + 152, 10, 16777215, -1);
				Node_Sub8.aDualNode_Sub13_Sub2Array1314[0].method929(Class6.anInt132 + 140, 12);
				var1.method980("Free world", Class6.anInt132 + 152, 21, 16777215, -1);
			}

			int var6;
			if (Class32.aDualNode_Sub13_Sub2Array357 != null) {
				var28 = Class6.anInt132 + 280;
				if (World.anIntArray1118[0] == 0 && World.anIntArray1119[0] == 0) {
					Class32.aDualNode_Sub13_Sub2Array357[2].method929(var28, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[0].method929(var28, 4);
				}

				if (World.anIntArray1118[0] == 0 && World.anIntArray1119[0] == 1) {
					Class32.aDualNode_Sub13_Sub2Array357[3].method929(var28 + 15, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[1].method929(var28 + 15, 4);
				}

				var0.method980("World", var28 + 32, 17, 16777215, -1);
				var5 = Class6.anInt132 + 390;
				if (World.anIntArray1118[0] == 1 && World.anIntArray1119[0] == 0) {
					Class32.aDualNode_Sub13_Sub2Array357[2].method929(var5, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[0].method929(var5, 4);
				}

				if (World.anIntArray1118[0] == 1 && World.anIntArray1119[0] == 1) {
					Class32.aDualNode_Sub13_Sub2Array357[3].method929(var5 + 15, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[1].method929(var5 + 15, 4);
				}

				var0.method980("Players", var5 + 32, 17, 16777215, -1);
				var6 = Class6.anInt132 + 500;
				if (World.anIntArray1118[0] == 2 && World.anIntArray1119[0] == 0) {
					Class32.aDualNode_Sub13_Sub2Array357[2].method929(var6, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[0].method929(var6, 4);
				}

				if (World.anIntArray1118[0] == 2 && World.anIntArray1119[0] == 1) {
					Class32.aDualNode_Sub13_Sub2Array357[3].method929(var6 + 15, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[1].method929(var6 + 15, 4);
				}

				var0.method980("Location", var6 + 32, 17, 16777215, -1);
				var7 = Class6.anInt132 + 610;
				if (World.anIntArray1118[0] == 3 && World.anIntArray1119[0] == 0) {
					Class32.aDualNode_Sub13_Sub2Array357[2].method929(var7, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[0].method929(var7, 4);
				}

				if (World.anIntArray1118[0] == 3 && World.anIntArray1119[0] == 1) {
					Class32.aDualNode_Sub13_Sub2Array357[3].method929(var7 + 15, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[1].method929(var7 + 15, 4);
				}

				var0.method980("Type", var7 + 32, 17, 16777215, -1);
			}

			RSGraphics.method793(Class6.anInt132 + 708, 4, 50, 16, 0);
			var1.method982("Cancel", Class6.anInt132 + 25 + 708, 16, 16777215, -1);
			var28 = 0;
			var5 = 33554432;
			var6 = Client.myWorldFlags & var5;

			for (var7 = 0; var7 < World.worldCount; var7++) {
				World var8 = World.worlds[var7];
				if ((var8.flags & var5) == var6 || (var8.flags & var5) == 0) {
					++var28;
				}
			}

			Class6.anInt144 = -1;
			if (Class93.aSpriteArray733 != null) {
				var31 = 88;
				byte var30 = 19;
				var36 = 765 / (var31 + 1);
				var39 = 480 / (var30 + 1);

				while (true) {
					var40 = var39;
					var12 = var36;
					if ((var36 - 1) * var39 >= var28) {
						--var36;
					}

					if ((var39 - 1) * var36 >= var28) {
						--var39;
					}

					if ((var39 - 1) * var36 >= var28) {
						--var39;
					}

					if (var40 == var39 && var36 == var12) {
						var40 = (765 - var36 * var31) / (var36 + 1);
						if (var40 > 5) {
							var40 = 5;
						}

						var12 = (480 - var30 * var39) / (var39 + 1);
						if (var12 > 5) {
							var12 = 5;
						}

						int var10 = (765 - var36 * var31 - (var36 - 1) * var40) / 2;
						var14 = (480 - var30 * var39 - (var39 - 1) * var12) / 2;
						int var11 = var14 + 23;
						int var13 = Class6.anInt132 + var10;
						int var27 = 0;
						boolean var29 = false;

						int var26;
						for (var26 = 0; var26 < World.worldCount; var26++) {
							World var32 = World.worlds[var26];
							if ((var32.flags & var5) == var6 || (var32.flags & var5) == 0) {
								boolean var9 = true;
								String var43 = Integer.toString(var32.population);
								if (var32.population == -1) {
									var43 = "OFF";
									var9 = false;
								} else if (var32.population > 1980) {
									var43 = "FULL";
									var9 = false;
								}

								int var44 = 0;
								byte var24;
								if (var32.method481()) {
									var44 = 16711680;
									if (var32.method477()) {
										var24 = 5;
									} else {
										var24 = 4;
									}
								} else if (var32.method479()) {
									if (var32.method477()) {
										var24 = 3;
									} else {
										var24 = 2;
									}
								} else if (var32.method477()) {
									var24 = 1;
								} else {
									var24 = 0;
								}

								if (MouseInput.anInt621 >= var13 && MouseInput.anInt622 >= var11
										&& MouseInput.anInt621 < var31 + var13 && MouseInput.anInt622 < var11 + var30
										&& var9) {
									Class6.anInt144 = var26;
									Class93.aSpriteArray733[var24].method950(var13, var11, 128, 16777215);
									var29 = true;
								} else {
									Class93.aSpriteArray733[var24].method958(var13, var11);
								}

								if (Class2.aDualNode_Sub13_Sub2Array78 != null) {
									Class2.aDualNode_Sub13_Sub2Array78[(var32.method477() ? 8 : 0) + var32.location]
											.method929(var13 + 29, var11);
								}

								var0.method982(Integer.toString(var32.id), var13 + 15, var11 + 5 + var30 / 2, var44,
										-1);
								var1.method982(var43, var13 + 60, var30 / 2 + 5 + var11, 268435455, -1);
								var11 += var12 + var30;
								++var27;
								if (var27 >= var39) {
									var11 = var14 + 23;
									var13 += var31 + var40;
									var27 = 0;
								}
							}
						}

						if (var29) {
							var26 = var1.method967(World.worlds[Class6.anInt144].activity) + 6;
							int var391 = var1.anInt1824 + 8;
							RSGraphics.method793(MouseInput.anInt621 - var26 / 2, MouseInput.anInt622 + 5 + 20, var26, var391,
									16777120);
							RSGraphics.drawRectangle(MouseInput.anInt621 - var26 / 2, MouseInput.anInt622 + 20 + 5, var26,
									var391, 0);
							var1.method982(World.worlds[Class6.anInt144].activity, MouseInput.anInt621,
									MouseInput.anInt622 + 25 + var1.anInt1824 + 4, 0, -1);
						}
						break;
					}
				}
			}

			try {
				Graphics var311 = LandscapeTile.gameCanvas.getGraphics();
				IndexTable.imageProducer.drawImage(var311, 0, 0);
			} catch (Exception var271) {
				LandscapeTile.gameCanvas.repaint();
			}
		} else {
			if (var3) {
				Class56.aSprite542.method958(Class6.anInt132, 0);
				Class6.aSprite137.method958(Class6.anInt132 + 382, 0);
				IgnoredPlayer.logoSprite.method929(Class6.anInt132 + 382 - IgnoredPlayer.logoSprite.subWidth / 2, 18);
			}

			if (Client.anInt2113 == 0 || Client.anInt2113 == 5) {
				byte var281 = 20;
				var0.method982("RuneScape is loading - please wait...", Class6.anInt126 + 180, 245 - var281, 16777215,
						-1);
				var5 = 253 - var281;
				RSGraphics.drawRectangle(Class6.anInt126 + 180 - 152, var5, 304, 34, 9179409);
				RSGraphics.drawRectangle(Class6.anInt126 + 180 - 151, var5 + 1, 302, 32, 0);
				RSGraphics.method793(Class6.anInt126 + 180 - 150, var5 + 2, Class6.anInt122 * 3, 30, 9179409);
				RSGraphics.method793(Class6.anInt122 * 3 + (Class6.anInt126 + 180 - 150), var5 + 2,
						300 - Class6.anInt122 * 3, 30, 0);
				var0.method982(Class6.bootMessage, Class6.anInt126 + 180, 276 - var281, 16777215, -1);
			}

			String var291;
			String var321;
			String var33;
			String var34;
			char[] var35;
			short var361;
			short var37;
			if (Client.anInt2113 == 20) {
				Class6.titleboxSprite.method929(Class6.anInt126 + 180 - Class6.titleboxSprite.subWidth / 2,
						271 - Class6.titleboxSprite.subHeight / 2);
				var361 = 211;
				var0.method982(Class6.aString133, Class6.anInt126 + 180, var361, 16776960, 0);
				var28 = var361 + 15;
				var0.method982(Class6.aString134, Class6.anInt126 + 180, var28, 16776960, 0);
				var28 += 15;
				var0.method982(Class6.aString135, Class6.anInt126 + 180, var28, 16776960, 0);
				var28 += 15;
				var28 += 10;
				if (Class6.anInt116 != 4) {
					var0.method980("Login: ", Class6.anInt126 + 180 - 110, var28, 16777215, 0);
					var37 = 200;

					for (var291 = Class6.username; var0.method967(var291) > var37; var291 = var291.substring(0,
							var291.length() - 1)) {
						;
					}

					var0.method980(DualNode_Sub13_Sub3.appendTags(var291), Class6.anInt126 + 180 - 70, var28, 16777215,
							0);
					var28 += 15;
					var321 = "Password: ";
					var33 = Class6.password;
					var12 = var33.length();
					var35 = new char[var12];

					for (var14 = 0; var14 < var12; var14++) {
						var35[var14] = 42;
					}

					var34 = new String(var35);
					var0.method980(var321 + var34, Class6.anInt126 + 180 - 108, var28, 16777215, 0);
					var28 += 15;
				}
			}

			if (Client.anInt2113 == 10 || Client.anInt2113 == 11) {
				Class6.titleboxSprite.method929(Class6.anInt126, 171);
				short var38;
				if (Class6.anInt116 == 0) {
					var361 = 251;
					var0.method982("Welcome to OSRS Deob #0", Class6.anInt126 + 180, var361, 16776960, 0);
					var28 = var361 + 30;
					var5 = Class6.anInt126 + 180 - 80;
					var38 = 291;
					Class6.titlebuttonSprite.method929(var5 - 73, var38 - 20);
					var0.method990("New User", var5 - 73, var38 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = Class6.anInt126 + 80 + 180;
					Class6.titlebuttonSprite.method929(var5 - 73, var38 - 20);
					var0.method990("Existing User", var5 - 73, var38 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class6.anInt116 == 1) {
					var0.method982("Warning!", Class6.anInt126 + 180, 211, 16776960, 0);
					var361 = 236;
					var0.method982(Class6.aString133, Class6.anInt126 + 180, var361, 16777215, 0);
					var28 = var361 + 15;
					var0.method982(Class6.aString134, Class6.anInt126 + 180, var28, 16777215, 0);
					var28 += 15;
					var0.method982(Class6.aString135, Class6.anInt126 + 180, var28, 16777215, 0);
					var28 += 15;
					var5 = Class6.anInt126 + 180 - 80;
					var38 = 321;
					Class6.titlebuttonSprite.method929(var5 - 73, var38 - 20);
					var0.method982("Continue", var5, var38 + 5, 16777215, 0);
					var5 = Class6.anInt126 + 80 + 180;
					Class6.titlebuttonSprite.method929(var5 - 73, var38 - 20);
					var0.method982("Cancel", var5, var38 + 5, 16777215, 0);
				} else {
					short var401;
					if (Class6.anInt116 == 2) {
						var361 = 211;
						var0.method982(Class6.aString133, Class6.anInt126 + 180, var361, 16776960, 0);
						var28 = var361 + 15;
						var0.method982(Class6.aString134, Class6.anInt126 + 180, var28, 16776960, 0);
						var28 += 15;
						var0.method982(Class6.aString135, Class6.anInt126 + 180, var28, 16776960, 0);
						var28 += 15;
						var28 += 10;
						var0.method980("Login: ", Class6.anInt126 + 180 - 110, var28, 16777215, 0);
						var37 = 200;

						for (var291 = Class6.username; var0.method967(var291) > var37; var291 = var291.substring(1)) {
							;
						}

						var0.method980(
								DualNode_Sub13_Sub3.appendTags(var291)
										+ (Class6.anInt115 == 0 & Client.engineCycle % 40 < 20
												? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
								Class6.anInt126 + 180 - 70, var28, 16777215, 0);
						var28 += 15;
						var321 = "Password: ";
						var33 = Class6.password;
						var12 = var33.length();
						var35 = new char[var12];

						for (var14 = 0; var14 < var12; var14++) {
							var35[var14] = 42;
						}

						var34 = new String(var35);
						var0.method980(
								var321 + var34
										+ (Class6.anInt115 == 1 & Client.engineCycle % 40 < 20
												? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
								Class6.anInt126 + 180 - 108, var28, 16777215, 0);
						var28 += 15;
						var40 = Class6.anInt126 + 180 - 80;
						var401 = 321;
						Class6.titlebuttonSprite.method929(var40 - 73, var401 - 20);
						var0.method982("Login", var40, var401 + 5, 16777215, 0);
						var40 = Class6.anInt126 + 80 + 180;
						Class6.titlebuttonSprite.method929(var40 - 73, var401 - 20);
						var0.method982("Cancel", var40, var401 + 5, 16777215, 0);
						var361 = 357;
						var1.method982("Forgotten your password? <col=ffffff>Click here.", Class6.anInt126 + 180,
								var361, 16776960, 0);
					} else if (Class6.anInt116 == 4) {
						var0.method982("Authenticator", Class6.anInt126 + 180, 211, 16776960, 0);
						var361 = 236;
						var0.method982(Class6.aString133, Class6.anInt126 + 180, var361, 16777215, 0);
						var28 = var361 + 15;
						var0.method982(Class6.aString134, Class6.anInt126 + 180, var28, 16777215, 0);
						var28 += 15;
						var0.method982(Class6.aString135, Class6.anInt126 + 180, var28, 16777215, 0);
						var28 += 15;
						var291 = "PIN: ";
						var321 = Class37.pinText;
						var39 = var321.length();
						char[] var42 = new char[var39];

						for (var12 = 0; var12 < var39; var12++) {
							var42[var12] = 42;
						}

						String var441 = new String(var42);
						var0.method980(
								var291 + var441
										+ (Client.engineCycle % 40 < 20
												? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
								Class6.anInt126 + 180 - 108, var28, 16777215, 0);
						var28 -= 8;
						var0.method980("Trust this computer", Class6.anInt126 + 180 - 9, var28, 16776960, 0);
						var28 += 15;
						var0.method980("for 30 days: ", Class6.anInt126 + 180 - 9, var28, 16776960, 0);
						var36 = Class6.anInt126 + 180 - 9 + var0.method967("for 30 days: ") + 15;
						var39 = var28 - var0.anInt1824;
						Sprite var45;
						if (Class6.trust) {
							var45 = Class6.radioButtons2Sprite;
						} else {
							var45 = Class6.radioButtons0Sprite;
						}

						var45.method929(var36, var39);
						var28 += 15;
						var12 = Class6.anInt126 + 180 - 80;
						short var46 = 321;
						Class6.titlebuttonSprite.method929(var12 - 73, var46 - 20);
						var0.method982("Continue", var12, var46 + 5, 16777215, 0);
						var12 = Class6.anInt126 + 80 + 180;
						Class6.titlebuttonSprite.method929(var12 - 73, var46 - 20);
						var0.method982("Cancel", var12, var46 + 5, 16777215, 0);
						var1.method982("<u=ff>Can\'t Log In?</u>", Class6.anInt126 + 180, var46 + 36, 255, 0);
					} else if (Class6.anInt116 != 5) {
						if (Class6.anInt116 == 6) {
							var361 = 211;
							var0.method982(Class6.aString133, Class6.anInt126 + 180, var361, 16776960, 0);
							var28 = var361 + 15;
							var0.method982(Class6.aString134, Class6.anInt126 + 180, var28, 16776960, 0);
							var28 += 15;
							var0.method982(Class6.aString135, Class6.anInt126 + 180, var28, 16776960, 0);
							var28 += 15;
							var5 = Class6.anInt126 + 180;
							var38 = 321;
							Class6.titlebuttonSprite.method929(var5 - 73, var38 - 20);
							var0.method982("Back", var5, var38 + 5, 16777215, 0);
						}
					} else {
						var0.method982("Forgotten your password?", Class6.anInt126 + 180, 201, 16776960, 0);
						var361 = 221;
						var2.method982(Class6.aString133, Class6.anInt126 + 180, var361, 16776960, 0);
						var28 = var361 + 15;
						var2.method982(Class6.aString134, Class6.anInt126 + 180, var28, 16776960, 0);
						var28 += 15;
						var2.method982(Class6.aString135, Class6.anInt126 + 180, var28, 16776960, 0);
						var28 += 15;
						var28 += 14;
						var0.method980("Username/email: ", Class6.anInt126 + 180 - 145, var28, 16777215, 0);
						var37 = 174;

						for (var291 = Class6.username; var0.method967(var291) > var37; var291 = var291.substring(1)) {
							;
						}

						var0.method980(
								DualNode_Sub13_Sub3.appendTags(var291) + (Client.engineCycle % 40 < 20
										? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
								Class6.anInt126 + 180 - 34, var28, 16777215, 0);
						var28 += 15;
						var7 = Class6.anInt126 + 180 - 80;
						var401 = 321;
						Class6.titlebuttonSprite.method929(var7 - 73, var401 - 20);
						var0.method982("Recover", var7, var401 + 5, 16777215, 0);
						var7 = Class6.anInt126 + 260;
						Class6.titlebuttonSprite.method929(var7 - 73, var401 - 20);
						var0.method982("Back", var7, var401 + 5, 16777215, 0);
					}
				}
			}

			if (Class6.anInt140 > 0) {
				Class1.method14(Class6.anInt140);
				Class6.anInt140 = 0;
			}

			Class13.method117();
			FriendedPlayer.titlemuteSprite[AnimationSkin.settings.muted ? 1 : 0].method929(Class6.anInt132 + 765 - 40,
					463);
			if (Client.anInt2113 > 5 && Client.anInt2011 == 0) {
				if (GroundItem.aDualNode_Sub13_Sub2_1841 != null) {
					var28 = Class6.anInt132 + 5;
					var37 = 463;
					byte var41 = 100;
					var31 = 35;
					GroundItem.aDualNode_Sub13_Sub2_1841.method929(var28, var37);
					var0.method982("World" + " " + Client.myWorld, var41 / 2 + var28, var31 / 2 + var37 - 2, 16777215,
							0);
					if (BuildType.aClass26_644 != null) {
						var1.method982("Loading...", var41 / 2 + var28, var31 / 2 + 12 + var37, 16777215, 0);
					} else {
						var1.method982("Click to switch", var41 / 2 + var28, var31 / 2 + var37 + 12, 16777215, 0);
					}
				} else {
					GroundItem.aDualNode_Sub13_Sub2_1841 = SequenceType.getSprite(AnimationSkin.spritesIndex,
							"sl_button", "");
				}
			}

			try {
				Graphics var431 = LandscapeTile.gameCanvas.getGraphics();
				IndexTable.imageProducer.drawImage(var431, 0, 0);
			} catch (Exception var261) {
				LandscapeTile.gameCanvas.repaint();
			}
		}

	}

}
