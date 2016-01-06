import java.awt.Graphics;

public class Class86 {

	static int clanChatSize;
	public static MusicFile aNode_Sub11_693;

	static final void method365(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type * -1305917269 == 0) {
					if (var3.children != null) {
						method365(var3.children, var1);
					}

					InterfaceNode var4 = (InterfaceNode) Client.interfaceNodes
							.get((long) (-1536575275 * var3.hash));
					if (var4 != null) {
						Class65.method319(226793949 * var4.type, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.anObjectArray1186 != null) {
					var5 = new ScriptEvent();
					var5.aWidget1430 = var3;
					var5.args = var3.anObjectArray1186;
					Class96_Sub1.method504(var5);
				}

				if (var1 == 1 && var3.anObjectArray1187 != null) {
					if (2021294259 * var3.index >= 0) {
						Widget var6 = Class94.getWidget(var3.hash * -1536575275);
						if (var6 == null || var6.children == null || 2021294259 * var3.index >= var6.children.length
								|| var6.children[var3.index * 2021294259] != var3) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.aWidget1430 = var3;
					var5.args = var3.anObjectArray1187;
					Class96_Sub1.method504(var5);
				}
			}
		}

	}

	static final int method366(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & '\uff80');
		}
	}

	Class86() throws Throwable {
		throw new Error();
	}

	static void method367(DualNode_Sub13_Sub3_Sub1 var0, DualNode_Sub13_Sub3_Sub1 var1, DualNode_Sub13_Sub3_Sub1 var2,
			boolean var3) {
		if (var3) {
			Class6.anInt132 = 1079825139 * ((-452716157 * Class34.gameWidth - Client.anInt2233 * 1468194207) / 2);
			Class6.anInt126 = Class6.anInt132 * 132725497 + 1843765198;
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
				Class93.aSpriteArray733 = DynamicObject.method1023(Node_Sub5.spritesIndex, "sl_back", "");
			}

			if (Class2.aDualNode_Sub13_Sub2Array78 == null) {
				Class2.aDualNode_Sub13_Sub2Array78 = ObjectType.method868(Node_Sub5.spritesIndex,
						"sl_flags", "");
			}

			if (Class32.aDualNode_Sub13_Sub2Array357 == null) {
				Class32.aDualNode_Sub13_Sub2Array357 = ObjectType.method868(Node_Sub5.spritesIndex,
						"sl_arrows", "");
			}

			if (Node_Sub8.aDualNode_Sub13_Sub2Array1314 == null) {
				Node_Sub8.aDualNode_Sub13_Sub2Array1314 = ObjectType.method868(Node_Sub5.spritesIndex,
						"sl_stars", "");
			}

			RSGraphics.method793(1933284923 * Class6.anInt132, 23, 765, 480, 0);
			RSGraphics.method786(1933284923 * Class6.anInt132, 0, 125, 23, 12425273, 9135624);
			RSGraphics.method786(Class6.anInt132 * 1933284923 + 125, 0, 640, 23, 5197647, 2697513);
			var0.method982(GameStrings.aString1106, 62 + Class6.anInt132 * 1933284923, 15, 0, -1);
			if (Node_Sub8.aDualNode_Sub13_Sub2Array1314 != null) {
				Node_Sub8.aDualNode_Sub13_Sub2Array1314[1].method929(1933284923 * Class6.anInt132 + 140, 1);
				var1.method980(GameStrings.aString913, 1933284923 * Class6.anInt132 + 152, 10, 16777215, -1);
				Node_Sub8.aDualNode_Sub13_Sub2Array1314[0].method929(1933284923 * Class6.anInt132 + 140, 12);
				var1.method980(GameStrings.aString1030, 1933284923 * Class6.anInt132 + 152, 21, 16777215, -1);
			}

			int var38;
			if (Class32.aDualNode_Sub13_Sub2Array357 != null) {
				var28 = Class6.anInt132 * 1933284923 + 280;
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

				var0.method980(GameStrings.aString858, var28 + 32, 17, 16777215, -1);
				var5 = 1933284923 * Class6.anInt132 + 390;
				if (World.anIntArray1118[0] == 1 && World.anIntArray1119[0] == 0) {
					Class32.aDualNode_Sub13_Sub2Array357[2].method929(var5, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[0].method929(var5, 4);
				}

				if (World.anIntArray1118[0] == 1 && World.anIntArray1119[0] == 1) {
					Class32.aDualNode_Sub13_Sub2Array357[3].method929(var5 + 15, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[1].method929(15 + var5, 4);
				}

				var0.method980(GameStrings.aString885, var5 + 32, 17, 16777215, -1);
				var38 = 500 + 1933284923 * Class6.anInt132;
				if (World.anIntArray1118[0] == 2 && World.anIntArray1119[0] == 0) {
					Class32.aDualNode_Sub13_Sub2Array357[2].method929(var38, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[0].method929(var38, 4);
				}

				if (World.anIntArray1118[0] == 2 && World.anIntArray1119[0] == 1) {
					Class32.aDualNode_Sub13_Sub2Array357[3].method929(var38 + 15, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[1].method929(15 + var38, 4);
				}

				var0.method980(GameStrings.aString1111, 32 + var38, 17, 16777215, -1);
				var7 = 1933284923 * Class6.anInt132 + 610;
				if (World.anIntArray1118[0] == 3 && World.anIntArray1119[0] == 0) {
					Class32.aDualNode_Sub13_Sub2Array357[2].method929(var7, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[0].method929(var7, 4);
				}

				if (World.anIntArray1118[0] == 3 && World.anIntArray1119[0] == 1) {
					Class32.aDualNode_Sub13_Sub2Array357[3].method929(var7 + 15, 4);
				} else {
					Class32.aDualNode_Sub13_Sub2Array357[1].method929(15 + var7, 4);
				}

				var0.method980(GameStrings.aString1072, 32 + var7, 17, 16777215, -1);
			}

			RSGraphics.method793(Class6.anInt132 * 1933284923 + 708, 4, 50, 16, 0);
			var1.method982(GameStrings.aString1079, 25 + 1933284923 * Class6.anInt132 + 708, 16, 16777215, -1);
			var28 = 0;
			var5 = 33554432;
			var38 = 1115656689 * Client.myWorldFlags & var5;

			for (var7 = 0; var7 < World.worldCount * -1946617791; ++var7) {
				World var34 = World.worlds[var7];
				if ((-1784645245 * var34.flags & var5) == var38 || (var34.flags * -1784645245 & var5) == 0) {
					++var28;
				}
			}

			Class6.anInt144 = -2121360341;
			if (Class93.aSpriteArray733 != null) {
				var31 = 88;
				byte var37 = 19;
				var36 = 765 / (1 + var31);
				var39 = 480 / (var37 + 1);

				do {
					do {
						var40 = var39;
						var12 = var36;
						if ((var36 - 1) * var39 >= var28) {
							--var36;
						}

						if ((var39 - 1) * var36 >= var28) {
							--var39;
						}

						if (var36 * (var39 - 1) >= var28) {
							--var39;
						}
					} while (var40 != var39);
				} while (var36 != var12);

				var40 = (765 - var36 * var31) / (var36 + 1);
				if (var40 > 5) {
					var40 = 5;
				}

				var12 = (480 - var37 * var39) / (1 + var39);
				if (var12 > 5) {
					var12 = 5;
				}

				int var45 = (765 - var36 * var31 - var40 * (var36 - 1)) / 2;
				var14 = (480 - var37 * var39 - var12 * (var39 - 1)) / 2;
				int var15 = var14 + 23;
				int var16 = Class6.anInt132 * 1933284923 + var45;
				int var17 = 0;
				boolean var18 = false;

				int var19;
				for (var19 = 0; var19 < -1946617791 * World.worldCount; ++var19) {
					World var20 = World.worlds[var19];
					if (var38 == (-1784645245 * var20.flags & var5) || (-1784645245 * var20.flags & var5) == 0) {
						boolean var21 = true;
						String var22 = Integer.toString(215269871 * var20.population);
						if (215269871 * var20.population == -1) {
							var22 = GameStrings.aString1113;
							var21 = false;
						} else if (215269871 * var20.population > 1980) {
							var22 = GameStrings.aString1114;
							var21 = false;
						}

						int var23 = 0;
						byte var24;
						if (var20.method481()) {
							var23 = 16711680;
							if (var20.method477()) {
								var24 = 5;
							} else {
								var24 = 4;
							}
						} else if (var20.method479()) {
							if (var20.method477()) {
								var24 = 3;
							} else {
								var24 = 2;
							}
						} else if (var20.method477()) {
							var24 = 1;
						} else {
							var24 = 0;
						}

						if (Class74.anInt621 * -453286219 >= var16 && 103771565 * Class74.anInt622 >= var15
								&& Class74.anInt621 * -453286219 < var31 + var16
								&& 103771565 * Class74.anInt622 < var15 + var37 && var21) {
							Class6.anInt144 = var19 * 2121360341;
							Class93.aSpriteArray733[var24].method950(var16, var15, 128, 16777215);
							var18 = true;
						} else {
							Class93.aSpriteArray733[var24].method958(var16, var15);
						}

						if (Class2.aDualNode_Sub13_Sub2Array78 != null) {
							Class2.aDualNode_Sub13_Sub2Array78[(var20.method477() ? 8 : 0)
									+ var20.location * -1854937097].method929(29 + var16, var15);
						}

						var0.method982(Integer.toString(var20.id * -145619359), 15 + var16, 5 + var15 + var37 / 2,
								var23, -1);
						var1.method982(var22, var16 + 60, 5 + var37 / 2 + var15, 268435455, -1);
						var15 += var12 + var37;
						++var17;
						if (var17 >= var39) {
							var15 = var14 + 23;
							var16 += var31 + var40;
							var17 = 0;
						}
					}
				}

				if (var18) {
					var19 = var1.method967(World.worlds[Class6.anInt144 * 154582397].activity) + 6;
					int var47 = var1.anInt1824 + 8;
					RSGraphics.method793(Class74.anInt621 * -453286219 - var19 / 2,
							5 + 103771565 * Class74.anInt622 + 20, var19, var47, 16777120);
					RSGraphics.drawRectangle(-453286219 * Class74.anInt621 - var19 / 2,
							103771565 * Class74.anInt622 + 20 + 5, var19, var47, 0);
					var1.method982(World.worlds[Class6.anInt144 * 154582397].activity, Class74.anInt621 * -453286219,
							5 + 20 + 103771565 * Class74.anInt622 + var1.anInt1824 + 4, 0, -1);
				}
			}

			try {
				Graphics var35 = LandscapeTile.gameCanvas.getGraphics();
				IndexTable.imageProducer.drawImage(var35, 0, 0);
			} catch (Exception var25) {
				LandscapeTile.gameCanvas.repaint();
			}

		} else {
			if (var3) {
				Class56.aSprite542.method958(1933284923 * Class6.anInt132, 0);
				Class6.aSprite137.method958(Class6.anInt132 * 1933284923 + 382, 0);
				IgnoredPlayer.aDualNode_Sub13_Sub2_754.method929(
						1933284923 * Class6.anInt132 + 382 - IgnoredPlayer.aDualNode_Sub13_Sub2_754.anInt1800 / 2, 18);
			}

			if (Client.anInt2113 * 846055547 == 0 || 846055547 * Client.anInt2113 == 5) {
				byte var4 = 20;
				var0.method982(GameStrings.aString861, 1744540627 * Class6.anInt126 + 180, 245 - var4, 16777215, -1);
				var5 = 253 - var4;
				RSGraphics.drawRectangle(Class6.anInt126 * 1744540627 + 180 - 152, var5, 304, 34, 9179409);
				RSGraphics.drawRectangle(Class6.anInt126 * 1744540627 + 180 - 151, var5 + 1, 302, 32, 0);
				RSGraphics.method793(180 + 1744540627 * Class6.anInt126 - 150, var5 + 2,
						-140328599 * Class6.anInt122, 30, 9179409);
				RSGraphics.method793(-140328599 * Class6.anInt122 + (1744540627 * Class6.anInt126 + 180 - 150),
						var5 + 2, 300 - -140328599 * Class6.anInt122, 30, 0);
				var0.method982(Class6.bootMessage, 180 + 1744540627 * Class6.anInt126, 276 - var4, 16777215, -1);
			}

			String var6;
			String var8;
			String var10;
			String var11;
			char[] var13;
			short var27;
			short var29;
			if (846055547 * Client.anInt2113 == 20) {
				Class6.aDualNode_Sub13_Sub2_147.method929(
						Class6.anInt126 * 1744540627 + 180 - Class6.aDualNode_Sub13_Sub2_147.anInt1800 / 2,
						271 - Class6.aDualNode_Sub13_Sub2_147.anInt1801 / 2);
				var27 = 211;
				var0.method982(Class6.aString133, Class6.anInt126 * 1744540627 + 180, var27, 16776960, 0);
				var28 = var27 + 15;
				var0.method982(Class6.aString134, 1744540627 * Class6.anInt126 + 180, var28, 16776960, 0);
				var28 += 15;
				var0.method982(Class6.aString135, 180 + Class6.anInt126 * 1744540627, var28, 16776960, 0);
				var28 += 15;
				var28 += 10;
				if (-1168104433 * Class6.anInt116 != 4) {
					var0.method980(GameStrings.aString876, 1744540627 * Class6.anInt126 + 180 - 110, var28, 16777215,
							0);
					var29 = 200;

					for (var6 = Class6.aString136; var0.method967(var6) > var29; var6 = var6.substring(0,
							var6.length() - 1)) {
						;
					}

					var0.method980(DualNode_Sub13_Sub3.appendTags(var6), 180 + 1744540627 * Class6.anInt126 - 70, var28,
							16777215, 0);
					var28 += 15;
					var8 = GameStrings.aString1052;
					var10 = Class6.aString123;
					var12 = var10.length();
					var13 = new char[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var13[var14] = 42;
					}

					var11 = new String(var13);
					var0.method980(var8 + var11, 180 + Class6.anInt126 * 1744540627 - 108, var28, 16777215, 0);
					var28 += 15;
				}
			}

			if (Client.anInt2113 * 846055547 == 10 || 846055547 * Client.anInt2113 == 11) {
				Class6.aDualNode_Sub13_Sub2_147.method929(Class6.anInt126 * 1744540627, 171);
				short var30;
				if (-1168104433 * Class6.anInt116 == 0) {
					var27 = 251;
					var0.method982(GameStrings.aString1075, 1744540627 * Class6.anInt126 + 180, var27, 16776960, 0);
					var28 = var27 + 30;
					var5 = Class6.anInt126 * 1744540627 + 180 - 80;
					var30 = 291;
					Class6.aDualNode_Sub13_Sub2_117.method929(var5 - 73, var30 - 20);
					var0.method990(GameStrings.aString1076, var5 - 73, var30 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 80 + Class6.anInt126 * 1744540627 + 180;
					Class6.aDualNode_Sub13_Sub2_117.method929(var5 - 73, var30 - 20);
					var0.method990(GameStrings.aString1077, var5 - 73, var30 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class6.anInt116 * -1168104433 == 1) {
					var0.method982(GameStrings.aString946, 180 + 1744540627 * Class6.anInt126, 211, 16776960, 0);
					var27 = 236;
					var0.method982(Class6.aString133, Class6.anInt126 * 1744540627 + 180, var27, 16777215, 0);
					var28 = var27 + 15;
					var0.method982(Class6.aString134, 1744540627 * Class6.anInt126 + 180, var28, 16777215, 0);
					var28 += 15;
					var0.method982(Class6.aString135, 180 + 1744540627 * Class6.anInt126, var28, 16777215, 0);
					var28 += 15;
					var5 = 180 + Class6.anInt126 * 1744540627 - 80;
					var30 = 321;
					Class6.aDualNode_Sub13_Sub2_117.method929(var5 - 73, var30 - 20);
					var0.method982(GameStrings.aString848, var5, var30 + 5, 16777215, 0);
					var5 = 80 + 1744540627 * Class6.anInt126 + 180;
					Class6.aDualNode_Sub13_Sub2_117.method929(var5 - 73, var30 - 20);
					var0.method982(GameStrings.aString1079, var5, 5 + var30, 16777215, 0);
				} else if (Class6.anInt116 * -1168104433 == 2) {
					var27 = 211;
					var0.method982(Class6.aString133, 180 + 1744540627 * Class6.anInt126, var27, 16776960, 0);
					var28 = var27 + 15;
					var0.method982(Class6.aString134, 180 + Class6.anInt126 * 1744540627, var28, 16776960, 0);
					var28 += 15;
					var0.method982(Class6.aString135, 180 + 1744540627 * Class6.anInt126, var28, 16776960, 0);
					var28 += 15;
					var28 += 10;
					var0.method980(GameStrings.aString876, 1744540627 * Class6.anInt126 + 180 - 110, var28, 16777215,
							0);
					var29 = 200;

					for (var6 = Class6.aString136; var0.method967(var6) > var29; var6 = var6.substring(1)) {
						;
					}

					var0.method980(
							DualNode_Sub13_Sub3.appendTags(var6)
									+ (Class6.anInt115 * -1914929121 == 0 & Client.engineCycle * -1040073859 % 40 < 20
											? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
							Class6.anInt126 * 1744540627 + 180 - 70, var28, 16777215, 0);
					var28 += 15;
					var8 = GameStrings.aString1052;
					var10 = Class6.aString123;
					var12 = var10.length();
					var13 = new char[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var13[var14] = 42;
					}

					var11 = new String(var13);
					var0.method980(
							var8 + var11
									+ (Class6.anInt115 * -1914929121 == 1 & -1040073859 * Client.engineCycle % 40 < 20
											? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
							Class6.anInt126 * 1744540627 + 180 - 108, var28, 16777215, 0);
					var28 += 15;
					var40 = 1744540627 * Class6.anInt126 + 180 - 80;
					short var42 = 321;
					Class6.aDualNode_Sub13_Sub2_117.method929(var40 - 73, var42 - 20);
					var0.method982(GameStrings.aString1067, var40, 5 + var42, 16777215, 0);
					var40 = 80 + Class6.anInt126 * 1744540627 + 180;
					Class6.aDualNode_Sub13_Sub2_117.method929(var40 - 73, var42 - 20);
					var0.method982(GameStrings.aString1079, var40, 5 + var42, 16777215, 0);
					var27 = 357;
					var1.method982(GameStrings.aString1080, Class6.anInt126 * 1744540627 + 180, var27, 16776960, 0);
				} else if (Class6.anInt116 * -1168104433 == 4) {
					var0.method982(GameStrings.aString1116, 180 + 1744540627 * Class6.anInt126, 211, 16776960, 0);
					var27 = 236;
					var0.method982(Class6.aString133, 180 + Class6.anInt126 * 1744540627, var27, 16777215, 0);
					var28 = var27 + 15;
					var0.method982(Class6.aString134, Class6.anInt126 * 1744540627 + 180, var28, 16777215, 0);
					var28 += 15;
					var0.method982(Class6.aString135, 180 + Class6.anInt126 * 1744540627, var28, 16777215, 0);
					var28 += 15;
					var6 = GameStrings.aString1074;
					var8 = Class37.aString404;
					var39 = var8.length();
					char[] var41 = new char[var39];

					for (var12 = 0; var12 < var39; ++var12) {
						var41[var12] = 42;
					}

					String var9 = new String(var41);
					var0.method980(
							var6 + var9
									+ (-1040073859 * Client.engineCycle % 40 < 20
											? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
							Class6.anInt126 * 1744540627 + 180 - 108, var28, 16777215, 0);
					var28 -= 8;
					var0.method980(GameStrings.aString1027, 180 + Class6.anInt126 * 1744540627 - 9, var28, 16776960, 0);
					var28 += 15;
					var0.method980(GameStrings.aString927, Class6.anInt126 * 1744540627 + 180 - 9, var28, 16776960, 0);
					var36 = 180 + Class6.anInt126 * 1744540627 - 9 + var0.method967(GameStrings.aString927) + 15;
					var39 = var28 - var0.anInt1824;
					DualNode_Sub13_Sub2 var43;
					if (Class6.aBool139) {
						var43 = Class6.aDualNode_Sub13_Sub2_121;
					} else {
						var43 = Class6.aDualNode_Sub13_Sub2_120;
					}

					var43.method929(var36, var39);
					var28 += 15;
					var12 = 180 + 1744540627 * Class6.anInt126 - 80;
					short var44 = 321;
					Class6.aDualNode_Sub13_Sub2_117.method929(var12 - 73, var44 - 20);
					var0.method982(GameStrings.aString848, var12, var44 + 5, 16777215, 0);
					var12 = 80 + 1744540627 * Class6.anInt126 + 180;
					Class6.aDualNode_Sub13_Sub2_117.method929(var12 - 73, var44 - 20);
					var0.method982(GameStrings.aString1079, var12, 5 + var44, 16777215, 0);
					var1.method982(GameStrings.aString1068, 180 + 1744540627 * Class6.anInt126, var44 + 36, 255, 0);
				} else if (-1168104433 * Class6.anInt116 == 5) {
					var0.method982(GameStrings.aString1081, 180 + Class6.anInt126 * 1744540627, 201, 16776960, 0);
					var27 = 221;
					var2.method982(Class6.aString133, 180 + Class6.anInt126 * 1744540627, var27, 16776960, 0);
					var28 = var27 + 15;
					var2.method982(Class6.aString134, 180 + Class6.anInt126 * 1744540627, var28, 16776960, 0);
					var28 += 15;
					var2.method982(Class6.aString135, 1744540627 * Class6.anInt126 + 180, var28, 16776960, 0);
					var28 += 15;
					var28 += 14;
					var0.method980(GameStrings.aString1082, 1744540627 * Class6.anInt126 + 180 - 145, var28, 16777215,
							0);
					var29 = 174;

					for (var6 = Class6.aString136; var0.method967(var6) > var29; var6 = var6.substring(1)) {
						;
					}

					var0.method980(
							DualNode_Sub13_Sub3.appendTags(var6) + (-1040073859 * Client.engineCycle % 40 < 20
									? Class48_Sub1.method545(16776960) + Class35.aString388 : ""),
							1744540627 * Class6.anInt126 + 180 - 34, var28, 16777215, 0);
					var28 += 15;
					var7 = 180 + Class6.anInt126 * 1744540627 - 80;
					short var32 = 321;
					Class6.aDualNode_Sub13_Sub2_117.method929(var7 - 73, var32 - 20);
					var0.method982(GameStrings.aString1083, var7, 5 + var32, 16777215, 0);
					var7 = 80 + 180 + Class6.anInt126 * 1744540627;
					Class6.aDualNode_Sub13_Sub2_117.method929(var7 - 73, var32 - 20);
					var0.method982(GameStrings.aString995, var7, var32 + 5, 16777215, 0);
				} else if (Class6.anInt116 * -1168104433 == 6) {
					var27 = 211;
					var0.method982(Class6.aString133, Class6.anInt126 * 1744540627 + 180, var27, 16776960, 0);
					var28 = var27 + 15;
					var0.method982(Class6.aString134, 180 + 1744540627 * Class6.anInt126, var28, 16776960, 0);
					var28 += 15;
					var0.method982(Class6.aString135, 180 + Class6.anInt126 * 1744540627, var28, 16776960, 0);
					var28 += 15;
					var5 = Class6.anInt126 * 1744540627 + 180;
					var30 = 321;
					Class6.aDualNode_Sub13_Sub2_117.method929(var5 - 73, var30 - 20);
					var0.method982(GameStrings.aString995, var5, var30 + 5, 16777215, 0);
				}
			}

			if (688679029 * Class6.anInt140 > 0) {
				Class1.method14(Class6.anInt140 * 688679029);
				Class6.anInt140 = 0;
			}

			Class13.method117();
			FriendedPlayer.aDualNode_Sub13_Sub2Array741[Node_Sub5.aClass24_1265.aBool303 ? 1 : 0]
					.method929(Class6.anInt132 * 1933284923 + 765 - 40, 463);
			if (846055547 * Client.anInt2113 > 5 && -1025678859 * Client.anInt2011 == 0) {
				if (GroundItem.aDualNode_Sub13_Sub2_1841 != null) {
					var28 = 5 + Class6.anInt132 * 1933284923;
					var29 = 463;
					byte var33 = 100;
					var31 = 35;
					GroundItem.aDualNode_Sub13_Sub2_1841.method929(var28, var29);
					var0.method982(GameStrings.aString1008 + " " + -1631311031 * Client.myWorld, var33 / 2 + var28,
							var29 + var31 / 2 - 2, 16777215, 0);
					if (Class76.aClass26_644 != null) {
						var1.method982(GameStrings.aString1115, var33 / 2 + var28, 12 + var31 / 2 + var29, 16777215, 0);
					} else {
						var1.method982(GameStrings.aString929, var28 + var33 / 2, var29 + var31 / 2 + 12, 16777215, 0);
					}
				} else {
					GroundItem.aDualNode_Sub13_Sub2_1841 = SequenceType.method680(Node_Sub5.spritesIndex,
							"sl_button", "");
				}
			}

			try {
				Graphics var46 = LandscapeTile.gameCanvas.getGraphics();
				IndexTable.imageProducer.drawImage(var46, 0, 0);
			} catch (Exception var26) {
				LandscapeTile.gameCanvas.repaint();
			}

		}
	}
}
