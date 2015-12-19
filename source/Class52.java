import java.applet.Applet;
import java.util.Date;

public abstract class Class52 {

	static boolean aBool528 = false;

	public static Sprite method257(Class87 var0, String var1, String var2) {
		int var3 = var0.method383(var1);
		int var5 = var0.method384(var3, var2);
		Sprite var9;
		if (Class35.method202(var0, var3, var5)) {
			Sprite var4 = new Sprite();
			var4.anInt1815 = -749860951 * Class7.anInt148;
			var4.anInt1816 = -1945497809 * Class7.anInt155;
			var4.anInt1814 = Class7.anIntArray149[0];
			var4.anInt1817 = DualNode_Sub11.anIntArray1544[0];
			var4.height = Class7.anIntArray150[0];
			var4.width = Class7.anIntArray151[0];
			int var7 = var4.height * var4.width;
			byte[] var10 = Npc.aByteArrayArray1966[0];
			var4.pixels = new int[var7];

			for (int var6 = 0; var6 < var7; ++var6) {
				var4.pixels[var6] = Class85.anIntArray690[var10[var6] & 255];
			}

			Class65.method318();
			var9 = var4;
		} else {
			var9 = null;
		}

		return var9;
	}

	abstract byte[] method258(int var1);

	abstract void method259(byte[] var1, int var2);

	public static void method260(Applet var0, String var1) {
		Class70.anApplet587 = var0;
		Class70.aString586 = var1;
	}

	static void method261(ScriptEvent var0, int var1) {
		Object[] var2 = var0.args;
		int var3 = ((Integer) var2[0]).intValue();
		RuneScript var4 = Class39.getRuneScript(var3);
		if (var4 != null) {
			int var5 = 0;
			int var6 = 0;
			int var7 = -1;
			int[] var8 = var4.opcodes;
			int[] var9 = var4.intOperands;
			byte var10 = -1;
			Class3.anInt87 = 0;

			int var13;
			try {
				Class3.anIntArray82 = new int[-325262437 * var4.intArgCount];
				int var11 = 0;
				Class3.aStringArray83 = new String[var4.stringArgCount * 1146347541];
				int var32 = 0;

				int var14;
				String var43;
				for (var13 = 1; var13 < var2.length; ++var13) {
					if (var2[var13] instanceof Integer) {
						var14 = ((Integer) var2[var13]).intValue();
						if (var14 == -2147483647) {
							var14 = 1518911111 * var0.anInt1438;
						}

						if (var14 == -2147483646) {
							var14 = var0.anInt1431 * 2096422993;
						}

						if (var14 == -2147483645) {
							var14 = var0.aWidget1430 != null ? -1536575275 * var0.aWidget1430.anInt1129 : -1;
						}

						if (var14 == -2147483644) {
							var14 = -332002479 * var0.anInt1429;
						}

						if (var14 == -2147483643) {
							var14 = var0.aWidget1430 != null ? 2021294259 * var0.aWidget1430.index : -1;
						}

						if (var14 == -2147483642) {
							var14 = var0.aWidget1433 != null ? var0.aWidget1433.anInt1129 * -1536575275 : -1;
						}

						if (var14 == -2147483641) {
							var14 = var0.aWidget1433 != null ? 2021294259 * var0.aWidget1433.index : -1;
						}

						if (var14 == -2147483640) {
							var14 = -59421549 * var0.anInt1434;
						}

						if (var14 == -2147483639) {
							var14 = var0.anInt1435 * 427883437;
						}

						Class3.anIntArray82[var11++] = var14;
					} else if (var2[var13] instanceof String) {
						var43 = (String) var2[var13];
						if (var43.equals("event_opbase")) {
							var43 = var0.opbase;
						}

						Class3.aStringArray83[var32++] = var43;
					}
				}

				var13 = 0;
				Class3.anInt91 = 1375974071 * var0.anInt1436;

				label3080: while (true) {
					++var13;
					if (var13 > var1) {
						throw new RuntimeException();
					}

					++var7;
					int var31 = var8[var7];
					int var16;
					int var33;
					int var45;
					String[] var73;
					String var83;
					int[] var89;
					if (var31 < 100) {
						if (var31 == 0) {
							Class3.anIntArray95[var5++] = var9[var7];
							continue;
						}

						if (var31 == 1) {
							var14 = var9[var7];
							Class3.anIntArray95[var5++] = Class94.tempVars[var14];
							continue;
						}

						if (var31 == 2) {
							var14 = var9[var7];
							--var5;
							Class94.tempVars[var14] = Class3.anIntArray95[var5];
							World.method484(var14);
							continue;
						}

						if (var31 == 3) {
							Class3.aStringArray85[var6++] = var4.stringOperands[var7];
							continue;
						}

						if (var31 == 6) {
							var7 += var9[var7];
							continue;
						}

						if (var31 == 7) {
							var5 -= 2;
							if (Class3.anIntArray95[var5 + 1] != Class3.anIntArray95[var5]) {
								var7 += var9[var7];
							}
							continue;
						}

						if (var31 == 8) {
							var5 -= 2;
							if (Class3.anIntArray95[var5 + 1] == Class3.anIntArray95[var5]) {
								var7 += var9[var7];
							}
							continue;
						}

						if (var31 == 9) {
							var5 -= 2;
							if (Class3.anIntArray95[var5] < Class3.anIntArray95[var5 + 1]) {
								var7 += var9[var7];
							}
							continue;
						}

						if (var31 == 10) {
							var5 -= 2;
							if (Class3.anIntArray95[var5] > Class3.anIntArray95[1 + var5]) {
								var7 += var9[var7];
							}
							continue;
						}

						if (var31 == 21) {
							if (1112721435 * Class3.anInt87 == 0) {
								return;
							}

							Class33 var72 = Class3.aClass33Array86[(Class3.anInt87 -= -1200631277) * 1112721435];
							var4 = var72.aRuneScript361;
							var8 = var4.opcodes;
							var9 = var4.intOperands;
							var7 = var72.anInt363 * -594127079;
							Class3.anIntArray82 = var72.anIntArray362;
							Class3.aStringArray83 = var72.aStringArray360;
							continue;
						}

						if (var31 == 25) {
							var14 = var9[var7];
							Class3.anIntArray95[var5++] = Class91.method401(var14);
							continue;
						}

						if (var31 == 27) {
							var14 = var9[var7];
							--var5;
							Class75.method336(var14, Class3.anIntArray95[var5]);
							continue;
						}

						if (var31 == 31) {
							var5 -= 2;
							if (Class3.anIntArray95[var5] <= Class3.anIntArray95[var5 + 1]) {
								var7 += var9[var7];
							}
							continue;
						}

						if (var31 == 32) {
							var5 -= 2;
							if (Class3.anIntArray95[var5] >= Class3.anIntArray95[1 + var5]) {
								var7 += var9[var7];
							}
							continue;
						}

						if (var31 == 33) {
							Class3.anIntArray95[var5++] = Class3.anIntArray82[var9[var7]];
							continue;
						}

						int var10001;
						if (var31 == 34) {
							var10001 = var9[var7];
							--var5;
							Class3.anIntArray82[var10001] = Class3.anIntArray95[var5];
							continue;
						}

						if (var31 == 35) {
							Class3.aStringArray85[var6++] = Class3.aStringArray83[var9[var7]];
							continue;
						}

						if (var31 == 36) {
							var10001 = var9[var7];
							--var6;
							Class3.aStringArray83[var10001] = Class3.aStringArray85[var6];
							continue;
						}

						if (var31 == 37) {
							var14 = var9[var7];
							var6 -= var14;
							var83 = LandscapeTile.method580(Class3.aStringArray85, var6, var14);
							Class3.aStringArray85[var6++] = var83;
							continue;
						}

						if (var31 == 38) {
							--var5;
							continue;
						}

						if (var31 == 39) {
							--var6;
							continue;
						}

						if (var31 == 40) {
							var14 = var9[var7];
							RuneScript var101 = Class39.getRuneScript(var14);
							var89 = new int[-325262437 * var101.intArgCount];
							var73 = new String[1146347541 * var101.stringArgCount];

							for (var45 = 0; var45 < var101.intStackCount * 767633967; ++var45) {
								var89[var45] = Class3.anIntArray95[var45 + (var5 - 767633967 * var101.intStackCount)];
							}

							for (var45 = 0; var45 < 873573015 * var101.stringStackCount; ++var45) {
								var73[var45] = Class3.aStringArray85[var45
										+ (var6 - 873573015 * var101.stringStackCount)];
							}

							var5 -= 767633967 * var101.intStackCount;
							var6 -= 873573015 * var101.stringStackCount;
							Class33 var96 = new Class33();
							var96.aRuneScript361 = var4;
							var96.anInt363 = var7 * 954144041;
							var96.anIntArray362 = Class3.anIntArray82;
							var96.aStringArray360 = Class3.aStringArray83;
							Class3.aClass33Array86[(Class3.anInt87 += -1200631277) * 1112721435 - 1] = var96;
							var4 = var101;
							var8 = var101.opcodes;
							var9 = var101.intOperands;
							var7 = -1;
							Class3.anIntArray82 = var89;
							Class3.aStringArray83 = var73;
							continue;
						}

						if (var31 == 42) {
							Class3.anIntArray95[var5++] = Class33.aClass28_364.method180(var9[var7]);
							continue;
						}

						if (var31 == 43) {
							var10001 = var9[var7];
							--var5;
							Class33.aClass28_364.method171(var10001, Class3.anIntArray95[var5]);
							continue;
						}

						if (var31 == 44) {
							var14 = var9[var7] >> 16;
							var33 = var9[var7] & '\uffff';
							--var5;
							var16 = Class3.anIntArray95[var5];
							if (var16 >= 0 && var16 <= 5000) {
								Class3.anIntArray81[var14] = var16;
								byte var85 = -1;
								if (var33 == 105) {
									var85 = 0;
								}

								var45 = 0;

								while (true) {
									if (var45 >= var16) {
										continue label3080;
									}

									Class3.anIntArrayArray84[var14][var45] = var85;
									++var45;
								}
							}

							throw new RuntimeException();
						}

						if (var31 == 45) {
							var14 = var9[var7];
							--var5;
							var33 = Class3.anIntArray95[var5];
							if (var33 >= 0 && var33 < Class3.anIntArray81[var14]) {
								Class3.anIntArray95[var5++] = Class3.anIntArrayArray84[var14][var33];
								continue;
							}

							throw new RuntimeException();
						}

						if (var31 == 46) {
							var14 = var9[var7];
							var5 -= 2;
							var33 = Class3.anIntArray95[var5];
							if (var33 >= 0 && var33 < Class3.anIntArray81[var14]) {
								Class3.anIntArrayArray84[var14][var33] = Class3.anIntArray95[1 + var5];
								continue;
							}

							throw new RuntimeException();
						}

						if (var31 == 47) {
							var43 = Class33.aClass28_364.method172(var9[var7]);
							if (var43 == null) {
								var43 = "null";
							}

							Class3.aStringArray85[var6++] = var43;
							continue;
						}

						if (var31 == 48) {
							var10001 = var9[var7];
							--var6;
							Class33.aClass28_364.method181(var10001, Class3.aStringArray85[var6]);
							continue;
						}
					}

					boolean var46;
					if (var9[var7] == 1) {
						var46 = true;
					} else {
						var46 = false;
					}

					Widget var15;
					Widget var17;
					Widget var18;
					int var20;
					Widget var34;
					int var35;
					boolean var41;
					boolean var55;
					if (var31 < 1000) {
						if (var31 == 100) {
							var5 -= 3;
							var33 = Class3.anIntArray95[var5];
							var16 = Class3.anIntArray95[1 + var5];
							var35 = Class3.anIntArray95[var5 + 2];
							if (var16 == 0) {
								throw new RuntimeException();
							}

							var18 = Class94.method406(var33);
							if (var18.children == null) {
								var18.children = new Widget[var35 + 1];
							}

							if (var18.children.length <= var35) {
								Widget[] var19 = new Widget[var35 + 1];

								for (var20 = 0; var20 < var18.children.length; ++var20) {
									var19[var20] = var18.children[var20];
								}

								var18.children = var19;
							}

							if (var35 > 0 && var18.children[var35 - 1] == null) {
								throw new RuntimeException("" + (var35 - 1));
							}

							Widget var40 = new Widget();
							var40.type = var16 * 1702392323;
							var40.parentId = (var40.anInt1129 = 1 * var18.anInt1129) * 1485437425;
							var40.index = var35 * 938225275;
							var40.interactable = true;
							var18.children[var35] = var40;
							if (var46) {
								Class24.aWidget304 = var40;
							} else {
								Class3.aWidget88 = var40;
							}

							Class68.method326(var18);
							continue;
						}

						if (var31 == 101) {
							var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
							var34 = Class94.method406(-1536575275 * var15.anInt1129);
							var34.children[var15.index * 2021294259] = null;
							Class68.method326(var34);
							continue;
						}

						if (var31 == 102) {
							--var5;
							var15 = Class94.method406(Class3.anIntArray95[var5]);
							var15.children = null;
							Class68.method326(var15);
							continue;
						}

						if (var31 == 200) {
							var5 -= 2;
							var33 = Class3.anIntArray95[var5];
							var16 = Class3.anIntArray95[var5 + 1];
							var17 = Class20.method146(var33, var16);
							if (var17 != null && var16 != -1) {
								Class3.anIntArray95[var5++] = 1;
								if (var46) {
									Class24.aWidget304 = var17;
								} else {
									Class3.aWidget88 = var17;
								}
								continue;
							}

							Class3.anIntArray95[var5++] = 0;
							continue;
						}

						if (var31 == 201) {
							--var5;
							var15 = Class94.method406(Class3.anIntArray95[var5]);
							if (var15 != null) {
								Class3.anIntArray95[var5++] = 1;
								if (var46) {
									Class24.aWidget304 = var15;
								} else {
									Class3.aWidget88 = var15;
								}
							} else {
								Class3.anIntArray95[var5++] = 0;
							}
							continue;
						}
					} else {
						boolean var36;
						if ((var31 < 1000 || var31 >= 1100) && (var31 < 2000 || var31 >= 2100)) {
							String var37;
							if ((var31 < 1100 || var31 >= 1200) && (var31 < 2100 || var31 >= 2200)) {
								if ((var31 < 1200 || var31 >= 1300) && (var31 < 2200 || var31 >= 2300)) {
									if ((var31 < 1300 || var31 >= 1400) && (var31 < 2300 || var31 >= 2400)) {
										int[] var44;
										int var49;
										String var54;
										if (var31 >= 1400 && var31 < 1500 || var31 >= 2400 && var31 < 2500) {
											if (var31 >= 2000) {
												var31 -= 1000;
												--var5;
												var15 = Class94.method406(Class3.anIntArray95[var5]);
											} else {
												var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
											}

											--var6;
											var54 = Class3.aStringArray85[var6];
											var44 = null;
											if (var54.length() > 0 && var54.charAt(var54.length() - 1) == 89) {
												--var5;
												var45 = Class3.anIntArray95[var5];
												if (var45 > 0) {
													for (var44 = new int[var45]; var45-- > 0; var44[var45] = Class3.anIntArray95[var5]) {
														--var5;
													}
												}

												var54 = var54.substring(0, var54.length() - 1);
											}

											Object[] var90 = new Object[var54.length() + 1];

											for (var49 = var90.length - 1; var49 >= 1; --var49) {
												if (var54.charAt(var49 - 1) == 115) {
													--var6;
													var90[var49] = Class3.aStringArray85[var6];
												} else {
													--var5;
													Integer var10002 = new Integer(Class3.anIntArray95[var5]);
													var90[var49] = var10002;
												}
											}

											--var5;
											var49 = Class3.anIntArray95[var5];
											if (var49 != -1) {
												var90[0] = new Integer(var49);
											} else {
												var90 = null;
											}

											if (var31 == 1400) {
												var15.anObjectArray1171 = var90;
											}

											if (var31 == 1401) {
												var15.anObjectArray1174 = var90;
											}

											if (var31 == 1402) {
												var15.anObjectArray1173 = var90;
											}

											if (var31 == 1403) {
												var15.mouseEnterListener = var90;
											}

											if (var31 == 1404) {
												var15.mouseExitListener = var90;
											}

											if (var31 == 1405) {
												var15.anObjectArray1176 = var90;
											}

											if (var31 == 1406) {
												var15.anObjectArray1178 = var90;
											}

											if (var31 == 1407) {
												var15.configListenerArgs = var90;
												var15.configTriggers = var44;
											}

											if (var31 == 1408) {
												var15.renderListener = var90;
											}

											if (var31 == 1409) {
												var15.anObjectArray1180 = var90;
											}

											if (var31 == 1410) {
												var15.anObjectArray1177 = var90;
											}

											if (var31 == 1411) {
												var15.anObjectArray1172 = var90;
											}

											if (var31 == 1412) {
												var15.mouseHoverListener = var90;
											}

											if (var31 == 1414) {
												var15.tableListenerArgs = var90;
												var15.tableModTriggers = var44;
											}

											if (var31 == 1415) {
												var15.skillListenerArgs = var90;
												var15.skillTriggers = var44;
											}

											if (var31 == 1416) {
												var15.anObjectArray1130 = var90;
											}

											if (var31 == 1417) {
												var15.scrollListener = var90;
											}

											if (var31 == 1418) {
												var15.anObjectArray1181 = var90;
											}

											if (var31 == 1419) {
												var15.anObjectArray1182 = var90;
											}

											if (var31 == 1420) {
												var15.anObjectArray1183 = var90;
											}

											if (var31 == 1421) {
												var15.anObjectArray1184 = var90;
											}

											if (var31 == 1422) {
												var15.anObjectArray1156 = var90;
											}

											if (var31 == 1423) {
												var15.anObjectArray1186 = var90;
											}

											if (var31 == 1424) {
												var15.anObjectArray1187 = var90;
											}

											if (var31 == 1425) {
												var15.anObjectArray1189 = var90;
											}

											if (var31 == 1426) {
												var15.anObjectArray1190 = var90;
											}

											if (var31 == 1427) {
												var15.anObjectArray1188 = var90;
											}

											var15.aBool1169 = true;
											continue;
										}

										if (var31 < 1600) {
											var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
											if (var31 == 1500) {
												Class3.anIntArray95[var5++] = 332168295 * var15.relativeX;
												continue;
											}

											if (var31 == 1501) {
												Class3.anIntArray95[var5++] = var15.relativeY * 1492425953;
												continue;
											}

											if (var31 == 1502) {
												Class3.anIntArray95[var5++] = var15.width * 1645211541;
												continue;
											}

											if (var31 == 1503) {
												Class3.anIntArray95[var5++] = 1227800423 * var15.height;
												continue;
											}

											if (var31 == 1504) {
												Class3.anIntArray95[var5++] = var15.hidden ? 1 : 0;
												continue;
											}

											if (var31 == 1505) {
												Class3.anIntArray95[var5++] = -1652479707 * var15.parentId;
												continue;
											}
										} else if (var31 < 1700) {
											var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
											if (var31 == 1600) {
												Class3.anIntArray95[var5++] = -352661099 * var15.insetX;
												continue;
											}

											if (var31 == 1601) {
												Class3.anIntArray95[var5++] = -1602694527 * var15.insetY;
												continue;
											}

											if (var31 == 1602) {
												Class3.aStringArray85[var6++] = var15.text;
												continue;
											}

											if (var31 == 1603) {
												Class3.anIntArray95[var5++] = -302755437 * var15.viewportWidth;
												continue;
											}

											if (var31 == 1604) {
												Class3.anIntArray95[var5++] = 177405235 * var15.viewportHeight;
												continue;
											}

											if (var31 == 1605) {
												Class3.anIntArray95[var5++] = var15.modelZoom * -1472457387;
												continue;
											}

											if (var31 == 1606) {
												Class3.anIntArray95[var5++] = var15.rotationX * 175924351;
												continue;
											}

											if (var31 == 1607) {
												Class3.anIntArray95[var5++] = var15.rotationY * 681145387;
												continue;
											}

											if (var31 == 1608) {
												Class3.anIntArray95[var5++] = var15.rotationZ * 745334365;
												continue;
											}

											if (var31 == 1609) {
												Class3.anIntArray95[var5++] = -1508397471 * var15.alpha;
												continue;
											}
										} else if (var31 < 1800) {
											var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
											if (var31 == 1700) {
												Class3.anIntArray95[var5++] = var15.itemId * 813479615;
												continue;
											}

											if (var31 == 1701) {
												if (813479615 * var15.itemId != -1) {
													Class3.anIntArray95[var5++] = var15.itemQuantity * 1393082105;
												} else {
													Class3.anIntArray95[var5++] = 0;
												}
												continue;
											}

											if (var31 == 1702) {
												Class3.anIntArray95[var5++] = var15.index * 2021294259;
												continue;
											}
										} else if (var31 < 1900) {
											var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
											if (var31 == 1800) {
												Class3.anIntArray95[var5++] = Class63
														.method314(Class30.getWidgetConfig(var15));
												continue;
											}

											if (var31 == 1801) {
												--var5;
												var16 = Class3.anIntArray95[var5];
												--var16;
												if (var15.actions != null && var16 < var15.actions.length
														&& var15.actions[var16] != null) {
													Class3.aStringArray85[var6++] = var15.actions[var16];
													continue;
												}

												Class3.aStringArray85[var6++] = "";
												continue;
											}

											if (var31 == 1802) {
												if (var15.name == null) {
													Class3.aStringArray85[var6++] = "";
												} else {
													Class3.aStringArray85[var6++] = var15.name;
												}
												continue;
											}
										} else if ((var31 < 1900 || var31 >= 2000) && (var31 < 2900 || var31 >= 3000)) {
											if (var31 < 2600) {
												--var5;
												var15 = Class94.method406(Class3.anIntArray95[var5]);
												if (var31 == 2500) {
													Class3.anIntArray95[var5++] = var15.relativeX * 332168295;
													continue;
												}

												if (var31 == 2501) {
													Class3.anIntArray95[var5++] = var15.relativeY * 1492425953;
													continue;
												}

												if (var31 == 2502) {
													Class3.anIntArray95[var5++] = var15.width * 1645211541;
													continue;
												}

												if (var31 == 2503) {
													Class3.anIntArray95[var5++] = var15.height * 1227800423;
													continue;
												}

												if (var31 == 2504) {
													Class3.anIntArray95[var5++] = var15.hidden ? 1 : 0;
													continue;
												}

												if (var31 == 2505) {
													Class3.anIntArray95[var5++] = var15.parentId * -1652479707;
													continue;
												}
											} else if (var31 < 2700) {
												--var5;
												var15 = Class94.method406(Class3.anIntArray95[var5]);
												if (var31 == 2600) {
													Class3.anIntArray95[var5++] = -352661099 * var15.insetX;
													continue;
												}

												if (var31 == 2601) {
													Class3.anIntArray95[var5++] = -1602694527 * var15.insetY;
													continue;
												}

												if (var31 == 2602) {
													Class3.aStringArray85[var6++] = var15.text;
													continue;
												}

												if (var31 == 2603) {
													Class3.anIntArray95[var5++] = -302755437 * var15.viewportWidth;
													continue;
												}

												if (var31 == 2604) {
													Class3.anIntArray95[var5++] = var15.viewportHeight * 177405235;
													continue;
												}

												if (var31 == 2605) {
													Class3.anIntArray95[var5++] = -1472457387 * var15.modelZoom;
													continue;
												}

												if (var31 == 2606) {
													Class3.anIntArray95[var5++] = var15.rotationX * 175924351;
													continue;
												}

												if (var31 == 2607) {
													Class3.anIntArray95[var5++] = var15.rotationY * 681145387;
													continue;
												}

												if (var31 == 2608) {
													Class3.anIntArray95[var5++] = 745334365 * var15.rotationZ;
													continue;
												}

												if (var31 == 2609) {
													Class3.anIntArray95[var5++] = -1508397471 * var15.alpha;
													continue;
												}
											} else if (var31 < 2800) {
												if (var31 == 2700) {
													--var5;
													var15 = Class94.method406(Class3.anIntArray95[var5]);
													Class3.anIntArray95[var5++] = var15.itemId * 813479615;
													continue;
												}

												if (var31 == 2701) {
													--var5;
													var15 = Class94.method406(Class3.anIntArray95[var5]);
													if (var15.itemId * 813479615 != -1) {
														Class3.anIntArray95[var5++] = var15.itemQuantity * 1393082105;
													} else {
														Class3.anIntArray95[var5++] = 0;
													}
													continue;
												}

												if (var31 == 2702) {
													--var5;
													var33 = Class3.anIntArray95[var5];
													InterfaceNode var52 = (InterfaceNode) Client.interfaceNodes
															.get((long) var33);
													if (var52 != null) {
														Class3.anIntArray95[var5++] = 1;
													} else {
														Class3.anIntArray95[var5++] = 0;
													}
													continue;
												}

												if (var31 == 2706) {
													Class3.anIntArray95[var5++] = Client.anInt2226 * -1074177723;
													continue;
												}
											} else if (var31 < 2900) {
												--var5;
												var15 = Class94.method406(Class3.anIntArray95[var5]);
												if (var31 == 2800) {
													Class3.anIntArray95[var5++] = Class63
															.method314(Class30.getWidgetConfig(var15));
													continue;
												}

												if (var31 == 2801) {
													--var5;
													var16 = Class3.anIntArray95[var5];
													--var16;
													if (var15.actions != null && var16 < var15.actions.length
															&& var15.actions[var16] != null) {
														Class3.aStringArray85[var6++] = var15.actions[var16];
														continue;
													}

													Class3.aStringArray85[var6++] = "";
													continue;
												}

												if (var31 == 2802) {
													if (var15.name == null) {
														Class3.aStringArray85[var6++] = "";
													} else {
														Class3.aStringArray85[var6++] = var15.name;
													}
													continue;
												}
											} else {
												int var22;
												int var48;
												int var62;
												if (var31 < 3200) {
													if (var31 == 3100) {
														--var6;
														var83 = Class3.aStringArray85[var6];
														Class75.method334(0, "", var83);
														continue;
													}

													if (var31 == 3101) {
														var5 -= 2;
														Class43.method229(Class68.myPlayer, Class3.anIntArray95[var5],
																Class3.anIntArray95[1 + var5]);
														continue;
													}

													if (var31 == 3103) {
														IsaacRandom.method63();
														continue;
													}

													boolean var42;
													if (var31 == 3104) {
														--var6;
														var83 = Class3.aStringArray85[var6];
														var16 = 0;
														var42 = false;
														boolean var47 = false;
														var48 = 0;
														var22 = var83.length();
														int var23 = 0;

														while (true) {
															if (var23 >= var22) {
																var41 = var47;
																break;
															}

															label3352: {
																char var24 = var83.charAt(var23);
																if (var23 == 0) {
																	if (var24 == 45) {
																		var42 = true;
																		break label3352;
																	}

																	if (var24 == 43) {
																		break label3352;
																	}
																}

																if (var24 >= 48 && var24 <= 57) {
																	var62 = var24 - 48;
																} else if (var24 >= 65 && var24 <= 90) {
																	var62 = var24 - 55;
																} else {
																	if (var24 < 97 || var24 > 122) {
																		var41 = false;
																		break;
																	}

																	var62 = var24 - 87;
																}

																if (var62 >= 10) {
																	var41 = false;
																	break;
																}

																if (var42) {
																	var62 = -var62;
																}

																int var25 = var62 + var48 * 10;
																if (var25 / 10 != var48) {
																	var41 = false;
																	break;
																}

																var48 = var25;
																var47 = true;
															}

															++var23;
														}

														if (var41) {
															var45 = Node_Sub5.method535(var83, 10, true);
															var16 = var45;
														}

														Client.outBuffer.putHeader(79);
														Client.outBuffer.putInt(var16);
														continue;
													}

													if (var31 == 3105) {
														--var6;
														var83 = Class3.aStringArray85[var6];
														Client.outBuffer.putHeader(84);
														Client.outBuffer.putByte(var83.length() + 1);
														Client.outBuffer.putString(var83);
														continue;
													}

													if (var31 == 3106) {
														--var6;
														var83 = Class3.aStringArray85[var6];
														Client.outBuffer.putHeader(58);
														Client.outBuffer.putByte(var83.length() + 1);
														Client.outBuffer.putString(var83);
														continue;
													}

													if (var31 == 3107) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														--var6;
														var54 = Class3.aStringArray85[var6];
														var35 = GPI.localPlayerCount * -334270159;
														int[] var39 = GPI.localPlayerIndices;
														var42 = false;

														for (var20 = 0; var20 < var35; ++var20) {
															Player var21 = Client.playerArray[var39[var20]];
															if (var21 != null && var21 != Class68.myPlayer
																	&& var21.name != null
																	&& var21.name.equalsIgnoreCase(var54)) {
																if (var33 == 1) {
																	Client.outBuffer.putHeader(234);
																	Client.outBuffer.putByteS(0);
																	Client.outBuffer.putShortA(var39[var20]);
																} else if (var33 == 4) {
																	Client.outBuffer.putHeader(83);
																	Client.outBuffer.putByte(0);
																	Client.outBuffer.putShort(var39[var20]);
																} else if (var33 == 6) {
																	Client.outBuffer.putHeader(4);
																	Client.outBuffer.putByteC(0);
																	Client.outBuffer.putShortA(var39[var20]);
																} else if (var33 == 7) {
																	Client.outBuffer.putHeader(224);
																	Client.outBuffer.putByteS(0);
																	Client.outBuffer.putShort(var39[var20]);
																}

																var42 = true;
																break;
															}
														}

														if (!var42) {
															Class75.method334(4, "", GameStrings.aString992 + var54);
														}
														continue;
													}

													if (var31 == 3108) {
														var5 -= 3;
														var33 = Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[var5 + 1];
														var35 = Class3.anIntArray95[2 + var5];
														var18 = Class94.method406(var35);
														Class68.method327(var18, var33, var16);
														continue;
													}

													if (var31 == 3109) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[var5 + 1];
														var17 = var46 ? Class24.aWidget304 : Class3.aWidget88;
														Class68.method327(var17, var33, var16);
														continue;
													}

													if (var31 == 3110) {
														--var5;
														ClanMate.aBool1221 = Class3.anIntArray95[var5] == 1;
														continue;
													}

													if (var31 == 3111) {
														Class3.anIntArray95[var5++] = Node_Sub5.aClass24_1265.aBool298
																? 1 : 0;
														continue;
													}

													if (var31 == 3112) {
														--var5;
														Node_Sub5.aClass24_1265.aBool298 = Class3.anIntArray95[var5] == 1;
														Class75.method335();
														continue;
													}

													if (var31 == 3113) {
														--var6;
														var83 = Class3.aStringArray85[var6];
														--var5;
														var55 = Class3.anIntArray95[var5] == 1;
														Class96_Sub1.method503(var83, var55, "openjs", false);
														continue;
													}

													if (var31 == 3115) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Client.outBuffer.putHeader(160);
														Client.outBuffer.putShort(var33);
														continue;
													}

													if (var31 == 3116) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														var6 -= 2;
														var54 = Class3.aStringArray85[var6];
														var37 = Class3.aStringArray85[1 + var6];
														if (var54.length() <= 500 && var37.length() <= 500) {
															Client.outBuffer.putHeader(196);
															Client.outBuffer
																	.putShort(1 + TileDecorationStub.method464(var54)
																			+ TileDecorationStub.method464(var37));
															Client.outBuffer.putString(var37);
															Client.outBuffer.putByteC(var33);
															Client.outBuffer.putString(var54);
														}
														continue;
													}
												} else if (var31 < 3300) {
													if (var31 == 3200) {
														var5 -= 3;
														EntityMarker.method139(Class3.anIntArray95[var5],
																Class3.anIntArray95[var5 + 1],
																Class3.anIntArray95[2 + var5]);
														continue;
													}

													if (var31 == 3201) {
														--var5;
														Class22.method158(Class3.anIntArray95[var5]);
														continue;
													}

													if (var31 == 3202) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5];
														int var10000 = Class3.anIntArray95[1 + var5];
														if (-1994948003 * Client.anInt2201 != 0 && var33 != -1) {
															Class69.method328(PlayerConfig.aClass87_Sub1_535, var33, 0,
																	Client.anInt2201 * -1994948003, false);
															Client.aBool2191 = true;
														}
														continue;
													}
												} else if (var31 < 3400) {
													if (var31 == 3300) {
														Class3.anIntArray95[var5++] = -1040073859 * Client.engineCycle;
														continue;
													}

													ItemTable var51;
													if (var31 == 3301) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[1 + var5];
														var44 = Class3.anIntArray95;
														var45 = var5++;
														var51 = (ItemTable) ItemTable.itemTables.get((long) var33);
														if (var51 == null) {
															var49 = -1;
														} else if (var16 >= 0 && var16 < var51.anIntArray1428.length) {
															var49 = var51.anIntArray1428[var16];
														} else {
															var49 = -1;
														}

														var44[var45] = var49;
														continue;
													}

													if (var31 == 3302) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[1 + var5];
														Class3.anIntArray95[var5++] = Class37.method213(var33, var16);
														continue;
													}

													if (var31 == 3303) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[1 + var5];
														var44 = Class3.anIntArray95;
														var45 = var5++;
														var51 = (ItemTable) ItemTable.itemTables.get((long) var33);
														if (var51 == null) {
															var49 = 0;
														} else if (var16 == -1) {
															var49 = 0;
														} else {
															var48 = 0;

															for (var22 = 0; var22 < var51.quantities.length; ++var22) {
																if (var16 == var51.anIntArray1428[var22]) {
																	var48 += var51.quantities[var22];
																}
															}

															var49 = var48;
														}

														var44[var45] = var49;
														continue;
													}

													if (var31 == 3304) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Class3.anIntArray95[var5++] = Class91.method399(var33).anInt1501
																* -612948537;
														continue;
													}

													if (var31 == 3305) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Class3.anIntArray95[var5++] = Client.levels[var33];
														continue;
													}

													if (var31 == 3306) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Class3.anIntArray95[var5++] = Client.experiences[var33];
														continue;
													}

													if (var31 == 3307) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Class3.anIntArray95[var5++] = Client.currentLevels[var33];
														continue;
													}

													if (var31 == 3308) {
														var33 = InterfaceNode.floorLevel * -747958745;
														var16 = 1426698711 * Node_Sub10.regionBaseX
																+ (1272643751 * Class68.myPlayer.strictX >> 7);
														var35 = (Class68.myPlayer.strictY * -1801433343 >> 7)
																+ Class28.regionBaseY * 714823515;
														Class3.anIntArray95[var5++] = (var16 << 14) + (var33 << 28)
																+ var35;
														continue;
													}

													if (var31 == 3309) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Class3.anIntArray95[var5++] = var33 >> 14 & 16383;
														continue;
													}

													if (var31 == 3310) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Class3.anIntArray95[var5++] = var33 >> 28;
														continue;
													}

													if (var31 == 3311) {
														--var5;
														var33 = Class3.anIntArray95[var5];
														Class3.anIntArray95[var5++] = var33 & 16383;
														continue;
													}

													if (var31 == 3312) {
														Class3.anIntArray95[var5++] = Client.membersWorld ? 1 : 0;
														continue;
													}

													if (var31 == 3313) {
														var5 -= 2;
														var33 = '\u8000' + Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[1 + var5];
														var44 = Class3.anIntArray95;
														var45 = var5++;
														var51 = (ItemTable) ItemTable.itemTables.get((long) var33);
														if (var51 == null) {
															var49 = -1;
														} else if (var16 >= 0 && var16 < var51.anIntArray1428.length) {
															var49 = var51.anIntArray1428[var16];
														} else {
															var49 = -1;
														}

														var44[var45] = var49;
														continue;
													}

													if (var31 == 3314) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5] + '\u8000';
														var16 = Class3.anIntArray95[var5 + 1];
														Class3.anIntArray95[var5++] = Class37.method213(var33, var16);
														continue;
													}

													if (var31 == 3315) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5] + '\u8000';
														var16 = Class3.anIntArray95[var5 + 1];
														var44 = Class3.anIntArray95;
														var45 = var5++;
														var51 = (ItemTable) ItemTable.itemTables.get((long) var33);
														if (var51 == null) {
															var49 = 0;
														} else if (var16 == -1) {
															var49 = 0;
														} else {
															var48 = 0;

															for (var22 = 0; var22 < var51.quantities.length; ++var22) {
																if (var16 == var51.anIntArray1428[var22]) {
																	var48 += var51.quantities[var22];
																}
															}

															var49 = var48;
														}

														var44[var45] = var49;
														continue;
													}

													if (var31 == 3316) {
														if (Client.myRights * 1520983779 >= 2) {
															Class3.anIntArray95[var5++] = Client.myRights * 1520983779;
														} else {
															Class3.anIntArray95[var5++] = 0;
														}
														continue;
													}

													if (var31 == 3317) {
														Class3.anIntArray95[var5++] = Client.anInt2189 * 210138957;
														continue;
													}

													if (var31 == 3318) {
														Class3.anIntArray95[var5++] = -1631311031 * Client.myWorld;
														continue;
													}

													if (var31 == 3321) {
														Class3.anIntArray95[var5++] = Client.energy * -1005815685;
														continue;
													}

													if (var31 == 3322) {
														Class3.anIntArray95[var5++] = -1944031695 * Client.weight;
														continue;
													}

													if (var31 == 3323) {
														if (Client.aBool2179) {
															Class3.anIntArray95[var5++] = 1;
														} else {
															Class3.anIntArray95[var5++] = 0;
														}
														continue;
													}

													if (var31 == 3324) {
														Class3.anIntArray95[var5++] = Client.myWorldFlags * 1115656689;
														continue;
													}
												} else if (var31 < 3500) {
													if (var31 == 3400) {
														var5 -= 2;
														var33 = Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[1 + var5];
														DualNode_Sub4 var53 = ObjectDefinition.method871(var33);
														if (var53.aChar1493 != 115) {
															;
														}

														for (var45 = 0; var45 < var53.anInt1490 * 557176427; ++var45) {
															if (var53.anIntArray1496[var45] == var16) {
																Class3.aStringArray85[var6++] = var53.aStringArray1498[var45];
																var53 = null;
																break;
															}
														}

														if (var53 != null) {
															Class3.aStringArray85[var6++] = var53.aString1499;
														}
														continue;
													}

													if (var31 == 3408) {
														var5 -= 4;
														var33 = Class3.anIntArray95[var5];
														var16 = Class3.anIntArray95[var5 + 1];
														var35 = Class3.anIntArray95[var5 + 2];
														var45 = Class3.anIntArray95[var5 + 3];
														DualNode_Sub4 var66 = ObjectDefinition.method871(var35);
														if (var33 == var66.aChar1494 && var66.aChar1493 == var16) {
															for (var20 = 0; var20 < var66.anInt1490
																	* 557176427; ++var20) {
																if (var45 == var66.anIntArray1496[var20]) {
																	if (var16 == 115) {
																		Class3.aStringArray85[var6++] = var66.aStringArray1498[var20];
																	} else {
																		Class3.anIntArray95[var5++] = var66.anIntArray1497[var20];
																	}

																	var66 = null;
																	break;
																}
															}

															if (var66 != null) {
																if (var16 == 115) {
																	Class3.aStringArray85[var6++] = var66.aString1499;
																} else {
																	Class3.anIntArray95[var5++] = -901678785
																			* var66.anInt1495;
																}
															}
															continue;
														}

														if (var16 == 115) {
															Class3.aStringArray85[var6++] = "null";
														} else {
															Class3.anIntArray95[var5++] = 0;
														}
														continue;
													}
												} else {
													String var60;
													if (var31 < 3700) {
														if (var31 == 3600) {
															if (Client.friendListSize * -923448785 == 0) {
																Class3.anIntArray95[var5++] = -2;
															} else if (Client.friendListSize * -923448785 == 1) {
																Class3.anIntArray95[var5++] = -1;
															} else {
																Class3.anIntArray95[var5++] = Client.anInt2184
																		* -1616775607;
															}
															continue;
														}

														if (var31 == 3601) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (Client.friendListSize * -923448785 == 2
																	&& var33 < -1616775607 * Client.anInt2184) {
																Class3.aStringArray85[var6++] = Client.friendedPlayers[var33].displayName;
																Class3.aStringArray85[var6++] = Client.friendedPlayers[var33].previousName;
																continue;
															}

															Class3.aStringArray85[var6++] = "";
															Class3.aStringArray85[var6++] = "";
															continue;
														}

														if (var31 == 3602) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (Client.friendListSize * -923448785 == 2
																	&& var33 < -1616775607 * Client.anInt2184) {
																Class3.anIntArray95[var5++] = Client.friendedPlayers[var33].world
																		* -698428043;
																continue;
															}

															Class3.anIntArray95[var5++] = 0;
															continue;
														}

														if (var31 == 3603) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (-923448785 * Client.friendListSize == 2
																	&& var33 < -1616775607 * Client.anInt2184) {
																Class3.anIntArray95[var5++] = 1241458911
																		* Client.friendedPlayers[var33].anInt737;
																continue;
															}

															Class3.anIntArray95[var5++] = 0;
															continue;
														}

														if (var31 == 3604) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															--var5;
															var16 = Class3.anIntArray95[var5];
															Client.outBuffer.putHeader(62);
															Client.outBuffer
																	.putByte(TileDecorationStub.method464(var83) + 1);
															Client.outBuffer.putString(var83);
															Client.outBuffer.putByteS(var16);
															continue;
														}

														IgnoredPlayer var63;
														FriendedPlayer var65;
														String var67;
														if (var31 == 3605) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (var83 == null) {
																continue;
															}

															if ((-1616775607 * Client.anInt2184 < 200
																	|| -905152705 * Client.anInt2106 == 1)
																	&& -1616775607 * Client.anInt2184 < 400) {
																var54 = DualNode_Sub11.method728(var83,
																		Class48_Sub1.aClass124_1297);
																if (var54 == null) {
																	continue;
																}

																for (var35 = 0; var35 < Client.anInt2184
																		* -1616775607; ++var35) {
																	var65 = Client.friendedPlayers[var35];
																	var67 = DualNode_Sub11.method728(var65.displayName,
																			Class48_Sub1.aClass124_1297);
																	if (var67 != null && var67.equals(var54)) {
																		Class75.method334(30, "",
																				var83 + GameStrings.aString1010);
																		continue label3080;
																	}

																	if (var65.previousName != null) {
																		var60 = DualNode_Sub11.method728(
																				var65.previousName,
																				Class48_Sub1.aClass124_1297);
																		if (var60 != null && var60.equals(var54)) {
																			Class75.method334(30, "",
																					var83 + GameStrings.aString1010);
																			continue label3080;
																		}
																	}
																}

																for (var35 = 0; var35 < Client.anInt2229
																		* 1820302153; ++var35) {
																	var63 = Client.ignoredPlayers[var35];
																	var67 = DualNode_Sub11.method728(var63.displayName,
																			Class48_Sub1.aClass124_1297);
																	if (var67 != null && var67.equals(var54)) {
																		Class75.method334(30, "",
																				GameStrings.aString1015 + var83
																						+ GameStrings.aString1016);
																		continue label3080;
																	}

																	if (var63.previousName != null) {
																		var60 = DualNode_Sub11.method728(
																				var63.previousName,
																				Class48_Sub1.aClass124_1297);
																		if (var60 != null && var60.equals(var54)) {
																			Class75.method334(30, "",
																					GameStrings.aString1015 + var83
																							+ GameStrings.aString1016);
																			continue label3080;
																		}
																	}
																}

																if (DualNode_Sub11
																		.method728(Class68.myPlayer.name,
																				Class48_Sub1.aClass124_1297)
																		.equals(var54)) {
																	Class75.method334(30, "", GameStrings.aString1023);
																} else {
																	Client.outBuffer.putHeader(164);
																	Client.outBuffer.putByte(
																			TileDecorationStub.method464(var83));
																	Client.outBuffer.putString(var83);
																}
																continue;
															}

															Class75.method334(30, "", GameStrings.aString1009);
															continue;
														}

														if (var31 == 3606) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															DualNode_Sub3.method684(var83);
															continue;
														}

														if (var31 == 3607) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (var83 == null) {
																continue;
															}

															if ((1820302153 * Client.anInt2229 < 100
																	|| Client.anInt2106 * -905152705 == 1)
																	&& Client.anInt2229 * 1820302153 < 400) {
																var54 = DualNode_Sub11.method728(var83,
																		Class48_Sub1.aClass124_1297);
																if (var54 == null) {
																	continue;
																}

																for (var35 = 0; var35 < Client.anInt2229
																		* 1820302153; ++var35) {
																	var63 = Client.ignoredPlayers[var35];
																	var67 = DualNode_Sub11.method728(var63.displayName,
																			Class48_Sub1.aClass124_1297);
																	if (var67 != null && var67.equals(var54)) {
																		Class75.method334(31, "",
																				var83 + GameStrings.aString1012);
																		continue label3080;
																	}

																	if (var63.previousName != null) {
																		var60 = DualNode_Sub11.method728(
																				var63.previousName,
																				Class48_Sub1.aClass124_1297);
																		if (var60 != null && var60.equals(var54)) {
																			Class75.method334(31, "",
																					var83 + GameStrings.aString1012);
																			continue label3080;
																		}
																	}
																}

																for (var35 = 0; var35 < -1616775607
																		* Client.anInt2184; ++var35) {
																	var65 = Client.friendedPlayers[var35];
																	var67 = DualNode_Sub11.method728(var65.displayName,
																			Class48_Sub1.aClass124_1297);
																	if (var67 != null && var67.equals(var54)) {
																		Class75.method334(31, "", GameStrings.aString883
																				+ var83 + GameStrings.aString1018);
																		continue label3080;
																	}

																	if (var65.previousName != null) {
																		var60 = DualNode_Sub11.method728(
																				var65.previousName,
																				Class48_Sub1.aClass124_1297);
																		if (var60 != null && var60.equals(var54)) {
																			Class75.method334(31, "",
																					GameStrings.aString883 + var83
																							+ GameStrings.aString1018);
																			continue label3080;
																		}
																	}
																}

																if (DualNode_Sub11
																		.method728(Class68.myPlayer.name,
																				Class48_Sub1.aClass124_1297)
																		.equals(var54)) {
																	Class75.method334(31, "", GameStrings.aString1014);
																} else {
																	Client.outBuffer.putHeader(178);
																	Client.outBuffer.putByte(
																			TileDecorationStub.method464(var83));
																	Client.outBuffer.putString(var83);
																}
																continue;
															}

															Class75.method334(31, "", GameStrings.aString1011);
															continue;
														}

														if (var31 == 3608) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (var83 == null) {
																continue;
															}

															var54 = DualNode_Sub11.method728(var83,
																	Class48_Sub1.aClass124_1297);
															if (var54 == null) {
																continue;
															}

															var35 = 0;

															while (true) {
																if (var35 >= Client.anInt2229 * 1820302153) {
																	continue label3080;
																}

																var63 = Client.ignoredPlayers[var35];
																var67 = var63.displayName;
																var60 = DualNode_Sub11.method728(var67,
																		Class48_Sub1.aClass124_1297);
																if (ItemTable.method646(var83, var54, var67, var60)) {
																	Client.anInt2229 -= -334739719;

																	for (var48 = var35; var48 < 1820302153
																			* Client.anInt2229; ++var48) {
																		Client.ignoredPlayers[var48] = Client.ignoredPlayers[var48
																				+ 1];
																	}

																	Client.anInt2114 = Client.anInt2151 * -712636309;
																	Client.outBuffer.putHeader(159);
																	Client.outBuffer.putByte(
																			TileDecorationStub.method464(var83));
																	Client.outBuffer.putString(var83);
																	continue label3080;
																}

																++var35;
															}
														}

														if (var31 == 3609) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															Class73[] var69 = new Class73[] { Class73.aClass73_612,
																	Class73.aClass73_607, Class73.aClass73_613,
																	Class73.aClass73_608, Class73.aClass73_609 };
															Class73[] var56 = var69;

															for (var45 = 0; var45 < var56.length; ++var45) {
																Class73 var70 = var56[var45];
																if (var70.anInt606 * -2127218069 != -1
																		&& var83.startsWith(Class41.method223(
																				var70.anInt606 * -2127218069,
																				(short) -2324))) {
																	var83 = var83
																			.substring(
																					6 + Integer
																							.toString(-2127218069
																									* var70.anInt606)
																					.length());
																	break;
																}
															}

															Class3.anIntArray95[var5++] = Node_Sub5.method533(var83,
																	false) ? 1 : 0;
															continue;
														}

														String var59;
														String[] var91;
														if (var31 == 3611) {
															if (Client.clanChatOwner != null) {
																var91 = Class3.aStringArray85;
																var16 = var6++;
																var59 = Client.clanChatOwner;
																var67 = DualNode_Sub9
																		.method716(Class49.method250(var59));
																if (var67 == null) {
																	var67 = "";
																}

																var91[var16] = var67;
															} else {
																Class3.aStringArray85[var6++] = "";
															}
															continue;
														}

														if (var31 == 3612) {
															if (Client.clanChatOwner != null) {
																Class3.anIntArray95[var5++] = -1304125287
																		* Class86.clanChatSize;
															} else {
																Class3.anIntArray95[var5++] = 0;
															}
															continue;
														}

														if (var31 == 3613) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (Client.clanChatOwner != null
																	&& var33 < -1304125287 * Class86.clanChatSize) {
																Class3.aStringArray85[var6++] = InterfaceNode.clanMates[var33].displayName;
																continue;
															}

															Class3.aStringArray85[var6++] = "";
															continue;
														}

														if (var31 == 3614) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (Client.clanChatOwner != null
																	&& var33 < -1304125287 * Class86.clanChatSize) {
																Class3.anIntArray95[var5++] = InterfaceNode.clanMates[var33].world
																		* 1300426367;
																continue;
															}

															Class3.anIntArray95[var5++] = 0;
															continue;
														}

														if (var31 == 3615) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (Client.clanChatOwner != null
																	&& var33 < -1304125287 * Class86.clanChatSize) {
																Class3.anIntArray95[var5++] = InterfaceNode.clanMates[var33].rank;
																continue;
															}

															Class3.anIntArray95[var5++] = 0;
															continue;
														}

														if (var31 == 3616) {
															Class3.anIntArray95[var5++] = Class43.aByte451;
															continue;
														}

														if (var31 == 3617) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (InterfaceNode.clanMates != null) {
																Client.outBuffer.putHeader(166);
																Client.outBuffer
																		.putByte(TileDecorationStub.method464(var83));
																Client.outBuffer.putString(var83);
															}
															continue;
														}

														if (var31 == 3618) {
															Class3.anIntArray95[var5++] = Client.clanChatRank;
															continue;
														}

														if (var31 == 3619) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (!var83.equals("")) {
																Client.outBuffer.putHeader(233);
																Client.outBuffer
																		.putByte(TileDecorationStub.method464(var83));
																Client.outBuffer.putString(var83);
															}
															continue;
														}

														if (var31 == 3620) {
															Client.outBuffer.putHeader(233);
															Client.outBuffer.putByte(0);
															continue;
														}

														if (var31 == 3621) {
															if (Client.friendListSize * -923448785 == 0) {
																Class3.anIntArray95[var5++] = -1;
															} else {
																Class3.anIntArray95[var5++] = Client.anInt2229
																		* 1820302153;
															}
															continue;
														}

														if (var31 == 3622) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (Client.friendListSize * -923448785 != 0
																	&& var33 < Client.anInt2229 * 1820302153) {
																Class3.aStringArray85[var6++] = Client.ignoredPlayers[var33].displayName;
																Class3.aStringArray85[var6++] = Client.ignoredPlayers[var33].previousName;
																continue;
															}

															Class3.aStringArray85[var6++] = "";
															Class3.aStringArray85[var6++] = "";
															continue;
														}

														if (var31 == 3623) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (var83.startsWith(Class41.method223(0, (short) -6393))
																	|| var83.startsWith(
																			Class41.method223(1, (short) -27072))) {
																var83 = var83.substring(7);
															}

															Class3.anIntArray95[var5++] = World.method485(var83) ? 1
																	: 0;
															continue;
														}

														if (var31 == 3624) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															if (InterfaceNode.clanMates != null
																	&& var33 < -1304125287 * Class86.clanChatSize
																	&& InterfaceNode.clanMates[var33].displayName
																			.equalsIgnoreCase(Class68.myPlayer.name)) {
																Class3.anIntArray95[var5++] = 1;
																continue;
															}

															Class3.anIntArray95[var5++] = 0;
															continue;
														}

														if (var31 == 3625) {
															if (Client.clanChatName != null) {
																var91 = Class3.aStringArray85;
																var16 = var6++;
																var59 = Client.clanChatName;
																var67 = DualNode_Sub9
																		.method716(Class49.method250(var59));
																if (var67 == null) {
																	var67 = "";
																}

																var91[var16] = var67;
															} else {
																Class3.aStringArray85[var6++] = "";
															}
															continue;
														}
													} else if (var31 < 4000) {
														if (var31 == 3903) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = Client.localExchangeOffers[var33]
																	.method368();
															continue;
														}

														if (var31 == 3904) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = Client.localExchangeOffers[var33].itemId
																	* 718739463;
															continue;
														}

														if (var31 == 3905) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = Client.localExchangeOffers[var33].price
																	* 861377417;
															continue;
														}

														if (var31 == 3906) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = -794800437
																	* Client.localExchangeOffers[var33].itemQuantity;
															continue;
														}

														if (var31 == 3907) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = -338006479
																	* Client.localExchangeOffers[var33].transferred;
															continue;
														}

														if (var31 == 3908) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = 1791988527
																	* Client.localExchangeOffers[var33].spent;
															continue;
														}

														if (var31 == 3910) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var16 = Client.localExchangeOffers[var33].method372();
															Class3.anIntArray95[var5++] = var16 == 0 ? 1 : 0;
															continue;
														}

														if (var31 == 3911) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var16 = Client.localExchangeOffers[var33].method372();
															Class3.anIntArray95[var5++] = var16 == 2 ? 1 : 0;
															continue;
														}

														if (var31 == 3912) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var16 = Client.localExchangeOffers[var33].method372();
															Class3.anIntArray95[var5++] = var16 == 5 ? 1 : 0;
															continue;
														}

														if (var31 == 3913) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var16 = Client.localExchangeOffers[var33].method372();
															Class3.anIntArray95[var5++] = var16 == 1 ? 1 : 0;
															continue;
														}

														boolean var97;
														if (var31 == 3914) {
															--var5;
															var97 = Class3.anIntArray95[var5] == 1;
															if (Class70.aClass114_588 != null) {
																Class70.aClass114_588.method438(Class114.aComparator792,
																		var97);
															}
															continue;
														}

														if (var31 == 3915) {
															--var5;
															var97 = Class3.anIntArray95[var5] == 1;
															if (Class70.aClass114_588 != null) {
																Class70.aClass114_588.method438(Class114.aComparator791,
																		var97);
															}
															continue;
														}

														if (var31 == 3916) {
															var5 -= 2;
															var97 = Class3.anIntArray95[var5] == 1;
															var55 = Class3.anIntArray95[1 + var5] == 1;
															if (Class70.aClass114_588 != null) {
																Class70.aClass114_588.method438(new Class37(var55),
																		var97);
															}
															continue;
														}

														if (var31 == 3917) {
															--var5;
															var97 = Class3.anIntArray95[var5] == 1;
															if (Class70.aClass114_588 != null) {
																Class70.aClass114_588.method438(Class114.aComparator790,
																		var97);
															}
															continue;
														}

														if (var31 == 3918) {
															--var5;
															var97 = Class3.anIntArray95[var5] == 1;
															if (Class70.aClass114_588 != null) {
																Class70.aClass114_588.method438(Class114.aComparator794,
																		var97);
															}
															continue;
														}

														if (var31 == 3919) {
															Class3.anIntArray95[var5++] = Class70.aClass114_588 == null
																	? 0 : Class70.aClass114_588.aList793.size();
															continue;
														}

														Class115 var75;
														if (var31 == 3920) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var75 = (Class115) Class70.aClass114_588.aList793
																	.get(var33);
															Class3.anIntArray95[var5++] = var75.anInt799 * 752101567;
															continue;
														}

														if (var31 == 3921) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var75 = (Class115) Class70.aClass114_588.aList793
																	.get(var33);
															Class3.aStringArray85[var6++] = var75.method440();
															continue;
														}

														if (var31 == 3922) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var75 = (Class115) Class70.aClass114_588.aList793
																	.get(var33);
															Class3.aStringArray85[var6++] = var75.method439();
															continue;
														}

														if (var31 == 3923) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var75 = (Class115) Class70.aClass114_588.aList793
																	.get(var33);
															long var26 = Node_Sub5.currentTimeMs()
																	- 8991659602621826001L * Class42.aLong449
																	- -3596478625201456337L * var75.aLong797;
															var49 = (int) (var26 / 3600000L);
															var20 = (int) ((var26 - (long) (var49 * 3600000)) / 60000L);
															var48 = (int) ((var26 - (long) (3600000 * var49)
																	- (long) (var20 * '\uea60')) / 1000L);
															String var58 = var49 + ":" + var20 / 10 + var20 % 10 + ":"
																	+ var48 / 10 + var48 % 10;
															Class3.aStringArray85[var6++] = var58;
															continue;
														}

														if (var31 == 3924) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var75 = (Class115) Class70.aClass114_588.aList793
																	.get(var33);
															Class3.anIntArray95[var5++] = var75.anExchangeOffer796.itemQuantity
																	* -794800437;
															continue;
														}

														if (var31 == 3925) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var75 = (Class115) Class70.aClass114_588.aList793
																	.get(var33);
															Class3.anIntArray95[var5++] = var75.anExchangeOffer796.price
																	* 861377417;
															continue;
														}

														if (var31 == 3926) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var75 = (Class115) Class70.aClass114_588.aList793
																	.get(var33);
															Class3.anIntArray95[var5++] = 718739463
																	* var75.anExchangeOffer796.itemId;
															continue;
														}
													} else if (var31 < 4100) {
														if (var31 == 4000) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 + var16;
															continue;
														}

														if (var31 == 4001) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 - var16;
															continue;
														}

														if (var31 == 4002) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 * var16;
															continue;
														}

														if (var31 == 4003) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[1 + var5];
															Class3.anIntArray95[var5++] = var33 / var16;
															continue;
														}

														if (var31 == 4004) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = (int) (Math.random()
																	* (double) var33);
															continue;
														}

														if (var31 == 4005) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = (int) (Math.random()
																	* (double) (var33 + 1));
															continue;
														}

														if (var31 == 4006) {
															var5 -= 5;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															var35 = Class3.anIntArray95[2 + var5];
															var45 = Class3.anIntArray95[3 + var5];
															var49 = Class3.anIntArray95[4 + var5];
															Class3.anIntArray95[var5++] = (var49 - var35)
																	* (var16 - var33) / (var45 - var35) + var33;
															continue;
														}

														if (var31 == 4007) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 * var16 / 100 + var33;
															continue;
														}

														if (var31 == 4008) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 | 1 << var16;
															continue;
														}

														if (var31 == 4009) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 & -1 - (1 << var16);
															continue;
														}

														if (var31 == 4010) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = (var33 & 1 << var16) != 0 ? 1
																	: 0;
															continue;
														}

														if (var31 == 4011) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 % var16;
															continue;
														}

														if (var31 == 4012) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															if (var33 == 0) {
																Class3.anIntArray95[var5++] = 0;
															} else {
																Class3.anIntArray95[var5++] = (int) Math
																		.pow((double) var33, (double) var16);
															}
															continue;
														}

														if (var31 == 4013) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[1 + var5];
															if (var33 == 0) {
																Class3.anIntArray95[var5++] = 0;
															} else if (var16 == 0) {
																Class3.anIntArray95[var5++] = Integer.MAX_VALUE;
															} else {
																Class3.anIntArray95[var5++] = (int) Math
																		.pow((double) var33, 1.0D / (double) var16);
															}
															continue;
														}

														if (var31 == 4014) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 & var16;
															continue;
														}

														if (var31 == 4015) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class3.anIntArray95[var5++] = var33 | var16;
															continue;
														}
													} else if (var31 < 4200) {
														if (var31 == 4100) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															--var5;
															var16 = Class3.anIntArray95[var5];
															Class3.aStringArray85[var6++] = var83 + var16;
															continue;
														}

														if (var31 == 4101) {
															var6 -= 2;
															var83 = Class3.aStringArray85[var6];
															var54 = Class3.aStringArray85[1 + var6];
															Class3.aStringArray85[var6++] = var83 + var54;
															continue;
														}

														if (var31 == 4102) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															--var5;
															var16 = Class3.anIntArray95[var5];
															var73 = Class3.aStringArray85;
															var45 = var6++;
															if (var16 < 0) {
																var60 = Integer.toString(var16);
															} else {
																var60 = Class56.method284(var16, 10, true);
															}

															var73[var45] = var83 + var60;
															continue;
														}

														if (var31 == 4103) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															Class3.aStringArray85[var6++] = var83.toLowerCase();
															continue;
														}

														if (var31 == 4104) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															long var28 = ((long) var33 + 11745L) * 86400000L;
															Class3.aCalendar89.setTime(new Date(var28));
															var45 = Class3.aCalendar89.get(5);
															var49 = Class3.aCalendar89.get(2);
															var20 = Class3.aCalendar89.get(1);
															Class3.aStringArray85[var6++] = var45 + "-"
																	+ Class3.aStringArray90[var49] + "-" + var20;
															continue;
														}

														if (var31 == 4105) {
															var6 -= 2;
															var83 = Class3.aStringArray85[var6];
															var54 = Class3.aStringArray85[1 + var6];
															if (Class68.myPlayer.config != null
																	&& Class68.myPlayer.config.female) {
																Class3.aStringArray85[var6++] = var54;
																continue;
															}

															Class3.aStringArray85[var6++] = var83;
															continue;
														}

														if (var31 == 4106) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.aStringArray85[var6++] = Integer.toString(var33);
															continue;
														}

														if (var31 == 4107) {
															var6 -= 2;
															Class3.anIntArray95[var5++] = ByteBuf.method603(
																	Class96_Sub1.method502(Class3.aStringArray85[var6],
																			Class3.aStringArray85[var6 + 1],
																			-1025678859 * Client.anInt2011));
															continue;
														}

														byte[] var71;
														DualNode_Sub13_Sub3_Sub1 var79;
														if (var31 == 4108) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															var5 -= 2;
															var16 = Class3.anIntArray95[var5];
															var35 = Class3.anIntArray95[var5 + 1];
															var71 = Class2.aClass87_Sub1_76.method391(var35, 0);
															var79 = new DualNode_Sub13_Sub3_Sub1(var71);
															Class3.anIntArray95[var5++] = var79.method970(var83, var16);
															continue;
														}

														if (var31 == 4109) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															var5 -= 2;
															var16 = Class3.anIntArray95[var5];
															var35 = Class3.anIntArray95[var5 + 1];
															var71 = Class2.aClass87_Sub1_76.method391(var35, 0);
															var79 = new DualNode_Sub13_Sub3_Sub1(var71);
															Class3.anIntArray95[var5++] = var79.method969(var83, var16);
															continue;
														}

														if (var31 == 4110) {
															var6 -= 2;
															var83 = Class3.aStringArray85[var6];
															var54 = Class3.aStringArray85[1 + var6];
															--var5;
															if (Class3.anIntArray95[var5] == 1) {
																Class3.aStringArray85[var6++] = var83;
															} else {
																Class3.aStringArray85[var6++] = var54;
															}
															continue;
														}

														if (var31 == 4111) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															Class3.aStringArray85[var6++] = DualNode_Sub13_Sub3
																	.method971(var83);
															continue;
														}

														if (var31 == 4112) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															--var5;
															var16 = Class3.anIntArray95[var5];
															Class3.aStringArray85[var6++] = var83 + (char) var16;
															continue;
														}

														char var78;
														if (var31 == 4113) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var89 = Class3.anIntArray95;
															var35 = var5++;
															var78 = (char) var33;
															if (var78 >= 32 && var78 <= 126) {
																var41 = true;
															} else if (var78 >= 160 && var78 <= 255) {
																var41 = true;
															} else if (var78 != 8364 && var78 != 338 && var78 != 8212
																	&& var78 != 339 && var78 != 376) {
																var41 = false;
															} else {
																var41 = true;
															}

															var89[var35] = var41 ? 1 : 0;
															continue;
														}

														if (var31 == 4114) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var89 = Class3.anIntArray95;
															var35 = var5++;
															var78 = (char) var33;
															var41 = var78 >= 48 && var78 <= 57
																	|| var78 >= 65 && var78 <= 90
																	|| var78 >= 97 && var78 <= 122;
															var89[var35] = var41 ? 1 : 0;
															continue;
														}

														if (var31 == 4115) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = LandscapeTile
																	.method581((char) var33) ? 1 : 0;
															continue;
														}

														if (var31 == 4116) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = Class66_Sub2
																	.method553((char) var33) ? 1 : 0;
															continue;
														}

														if (var31 == 4117) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (var83 != null) {
																Class3.anIntArray95[var5++] = var83.length();
															} else {
																Class3.anIntArray95[var5++] = 0;
															}
															continue;
														}

														if (var31 == 4118) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															var5 -= 2;
															var16 = Class3.anIntArray95[var5];
															var35 = Class3.anIntArray95[1 + var5];
															Class3.aStringArray85[var6++] = var83.substring(var16,
																	var35);
															continue;
														}

														if (var31 == 4119) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															StringBuilder var88 = new StringBuilder(var83.length());
															var36 = false;

															for (var45 = 0; var45 < var83.length(); ++var45) {
																var78 = var83.charAt(var45);
																if (var78 == 60) {
																	var36 = true;
																} else if (var78 == 62) {
																	var36 = false;
																} else if (!var36) {
																	var88.append(var78);
																}
															}

															Class3.aStringArray85[var6++] = var88.toString();
															continue;
														}

														if (var31 == 4120) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															--var5;
															var16 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = var83.indexOf(var16);
															continue;
														}

														if (var31 == 4121) {
															var6 -= 2;
															var83 = Class3.aStringArray85[var6];
															var54 = Class3.aStringArray85[1 + var6];
															--var5;
															var35 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = var83.indexOf(var54, var35);
															continue;
														}
													} else if (var31 < 4300) {
														if (var31 == 4200) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.aStringArray85[var6++] = FriendedPlayer
																	.getItemDefinition(var33).name;
															continue;
														}

														ItemDefinition var74;
														if (var31 == 4201) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[1 + var5];
															var74 = FriendedPlayer.getItemDefinition(var33);
															if (var16 >= 1 && var16 <= 5
																	&& var74.groundActions[var16 - 1] != null) {
																Class3.aStringArray85[var6++] = var74.groundActions[var16
																		- 1];
																continue;
															}

															Class3.aStringArray85[var6++] = "";
															continue;
														}

														if (var31 == 4202) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															var74 = FriendedPlayer.getItemDefinition(var33);
															if (var16 >= 1 && var16 <= 5
																	&& var74.actions[var16 - 1] != null) {
																Class3.aStringArray85[var6++] = var74.actions[var16
																		- 1];
																continue;
															}

															Class3.aStringArray85[var6++] = "";
															continue;
														}

														if (var31 == 4203) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = FriendedPlayer
																	.getItemDefinition(var33).storeValue * 60742695;
															continue;
														}

														if (var31 == 4204) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = FriendedPlayer
																	.getItemDefinition(var33).stackable
																	* 1303294175 == 1 ? 1 : 0;
															continue;
														}

														ItemDefinition var92;
														if (var31 == 4205) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var92 = FriendedPlayer.getItemDefinition(var33);
															if (-507524473 * var92.anInt1633 == -1
																	&& var92.anInt1640 * -322771797 >= 0) {
																Class3.anIntArray95[var5++] = -322771797
																		* var92.anInt1640;
																continue;
															}

															Class3.anIntArray95[var5++] = var33;
															continue;
														}

														if (var31 == 4206) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															var92 = FriendedPlayer.getItemDefinition(var33);
															if (-507524473 * var92.anInt1633 >= 0
																	&& -322771797 * var92.anInt1640 >= 0) {
																Class3.anIntArray95[var5++] = var92.anInt1640
																		* -322771797;
																continue;
															}

															Class3.anIntArray95[var5++] = var33;
															continue;
														}

														if (var31 == 4207) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = FriendedPlayer
																	.getItemDefinition(var33).aBool1618 ? 1 : 0;
															continue;
														}

														if (var31 == 4210) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															--var5;
															var16 = Class3.anIntArray95[var5];
															var41 = var16 == 1;
															var37 = var83.toLowerCase();
															short[] var80 = new short[16];
															var20 = 0;
															var48 = 0;

															while (true) {
																if (var48 >= Class13.anInt229 * -1396045331) {
																	Connection.aShortArray560 = var80;
																	Class24.anInt305 = 0;
																	GroundItem.anInt1840 = var20 * -980225491;
																	String[] var64 = new String[-845664859
																			* GroundItem.anInt1840];

																	for (var22 = 0; var22 < GroundItem.anInt1840
																			* -845664859; ++var22) {
																		var64[var22] = FriendedPlayer
																				.getItemDefinition(var80[var22]).name;
																	}

																	Class65.method317(var64, Connection.aShortArray560);
																	break;
																}

																ItemDefinition var61 = FriendedPlayer
																		.getItemDefinition(var48);
																if ((!var41 || var61.aBool1624)
																		&& -507524473 * var61.anInt1633 == -1
																		&& var61.name.toLowerCase()
																				.indexOf(var37) != -1) {
																	if (var20 >= 250) {
																		GroundItem.anInt1840 = 980225491;
																		Connection.aShortArray560 = null;
																		break;
																	}

																	if (var20 >= var80.length) {
																		short[] var57 = new short[2 * var80.length];

																		for (var62 = 0; var62 < var20; ++var62) {
																			var57[var62] = var80[var62];
																		}

																		var80 = var57;
																	}

																	var80[var20++] = (short) var48;
																}

																++var48;
															}

															Class3.anIntArray95[var5++] = -845664859
																	* GroundItem.anInt1840;
															continue;
														}

														if (var31 == 4211) {
															if (Connection.aShortArray560 != null && Class24.anInt305
																	* -2003486467 < GroundItem.anInt1840 * -845664859) {
																Class3.anIntArray95[var5++] = Connection.aShortArray560[(Class24.anInt305 += -1453677483)
																		* -2003486467 - 1] & '\uffff';
																continue;
															}

															Class3.anIntArray95[var5++] = -1;
															continue;
														}

														if (var31 == 4212) {
															Class24.anInt305 = 0;
															continue;
														}
													} else if (var31 < 5100) {
														if (var31 == 5000) {
															Class3.anIntArray95[var5++] = Client.anInt2110 * -400704361;
															continue;
														}

														if (var31 == 5001) {
															var5 -= 3;
															Client.anInt2110 = -677280985 * Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class51[] var82 = Class41.method225(94483834);
															var45 = 0;

															Class51 var100;
															while (true) {
																if (var45 >= var82.length) {
																	var100 = null;
																	break;
																}

																Class51 var86 = var82[var45];
																if (var16 == -1916029001 * var86.anInt525) {
																	var100 = var86;
																	break;
																}

																++var45;
															}

															Class28.aClass51_320 = var100;
															if (Class28.aClass51_320 == null) {
																Class28.aClass51_320 = Class51.aClass51_524;
															}

															Client.anInt2182 = -1946178403
																	* Class3.anIntArray95[2 + var5];
															Client.outBuffer.putHeader(44);
															Client.outBuffer.putByte(-400704361 * Client.anInt2110);
															Client.outBuffer.putByte(
																	Class28.aClass51_320.anInt525 * -1916029001);
															Client.outBuffer.putByte(-1975764555 * Client.anInt2182);
															continue;
														}

														if (var31 == 5002) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															var5 -= 2;
															var16 = Class3.anIntArray95[var5];
															var35 = Class3.anIntArray95[var5 + 1];
															Client.outBuffer.putHeader(71);
															Client.outBuffer
																	.putByte(TileDecorationStub.method464(var83) + 2);
															Client.outBuffer.putString(var83);
															Client.outBuffer.putByte(var16 - 1);
															Client.outBuffer.putByte(var35);
															continue;
														}

														if (var31 == 5003) {
															var5 -= 2;
															var33 = Class3.anIntArray95[var5];
															var16 = Class3.anIntArray95[var5 + 1];
															Class5 var87 = (Class5) Class32.aMap359
																	.get(Integer.valueOf(var33));
															DualNode_Sub8 var81 = var87.method74(var16);
															if (var81 != null) {
																Class3.anIntArray95[var5++] = -1699577047
																		* var81.anInt1516;
																Class3.anIntArray95[var5++] = var81.anInt1517
																		* -1486341595;
																Class3.aStringArray85[var6++] = var81.aString1521 != null
																		? var81.aString1521 : "";
																Class3.aStringArray85[var6++] = var81.aString1519 != null
																		? var81.aString1519 : "";
																Class3.aStringArray85[var6++] = var81.aString1520 != null
																		? var81.aString1520 : "";
															} else {
																Class3.anIntArray95[var5++] = -1;
																Class3.anIntArray95[var5++] = 0;
																Class3.aStringArray85[var6++] = "";
																Class3.aStringArray85[var6++] = "";
																Class3.aStringArray85[var6++] = "";
															}
															continue;
														}

														if (var31 == 5004) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															DualNode_Sub8 var95 = Class74.method332(var33);
															if (var95 != null) {
																Class3.anIntArray95[var5++] = var95.anInt1518
																		* 555619737;
																Class3.anIntArray95[var5++] = var95.anInt1517
																		* -1486341595;
																Class3.aStringArray85[var6++] = var95.aString1521 != null
																		? var95.aString1521 : "";
																Class3.aStringArray85[var6++] = var95.aString1519 != null
																		? var95.aString1519 : "";
																Class3.aStringArray85[var6++] = var95.aString1520 != null
																		? var95.aString1520 : "";
															} else {
																Class3.anIntArray95[var5++] = -1;
																Class3.anIntArray95[var5++] = 0;
																Class3.aStringArray85[var6++] = "";
																Class3.aStringArray85[var6++] = "";
																Class3.aStringArray85[var6++] = "";
															}
															continue;
														}

														if (var31 == 5005) {
															if (Class28.aClass51_320 == null) {
																Class3.anIntArray95[var5++] = -1;
															} else {
																Class3.anIntArray95[var5++] = Class28.aClass51_320.anInt525
																		* -1916029001;
															}
															continue;
														}

														if (var31 == 5008) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															--var5;
															var16 = Class3.anIntArray95[var5];
															var37 = var83.toLowerCase();
															byte var77 = 0;
															if (var37.startsWith(GameStrings.aString1019)) {
																var77 = 0;
																var83 = var83
																		.substring(GameStrings.aString1019.length());
															} else if (var37.startsWith(GameStrings.aString1098)) {
																var77 = 1;
																var83 = var83
																		.substring(GameStrings.aString1098.length());
															} else if (var37.startsWith(GameStrings.aString1002)) {
																var77 = 2;
																var83 = var83
																		.substring(GameStrings.aString1002.length());
															} else if (var37.startsWith(GameStrings.aString1025)) {
																var77 = 3;
																var83 = var83
																		.substring(GameStrings.aString1025.length());
															} else if (var37.startsWith(GameStrings.aString851)) {
																var77 = 4;
																var83 = var83
																		.substring(GameStrings.aString851.length());
															} else if (var37.startsWith(GameStrings.aString1031)) {
																var77 = 5;
																var83 = var83
																		.substring(GameStrings.aString1031.length());
															} else if (var37.startsWith(GameStrings.aString1042)) {
																var77 = 6;
																var83 = var83
																		.substring(GameStrings.aString1042.length());
															} else if (var37.startsWith(GameStrings.aString1033)) {
																var77 = 7;
																var83 = var83
																		.substring(GameStrings.aString1033.length());
															} else if (var37.startsWith(GameStrings.aString902)) {
																var77 = 8;
																var83 = var83
																		.substring(GameStrings.aString902.length());
															} else if (var37.startsWith(GameStrings.aString1037)) {
																var77 = 9;
																var83 = var83
																		.substring(GameStrings.aString1037.length());
															} else if (var37.startsWith(GameStrings.aString1039)) {
																var77 = 10;
																var83 = var83
																		.substring(GameStrings.aString1039.length());
															} else if (var37.startsWith(GameStrings.aString1041)) {
																var77 = 11;
																var83 = var83
																		.substring(GameStrings.aString1041.length());
															} else if (-1025678859 * Client.anInt2011 != 0) {
																if (var37.startsWith(GameStrings.aString1020)) {
																	var77 = 0;
																	var83 = var83.substring(
																			GameStrings.aString1020.length());
																} else if (var37.startsWith(GameStrings.aString870)) {
																	var77 = 1;
																	var83 = var83
																			.substring(GameStrings.aString870.length());
																} else if (var37.startsWith(GameStrings.aString1024)) {
																	var77 = 2;
																	var83 = var83.substring(
																			GameStrings.aString1024.length());
																} else if (var37.startsWith(GameStrings.aString1026)) {
																	var77 = 3;
																	var83 = var83.substring(
																			GameStrings.aString1026.length());
																} else if (var37.startsWith(GameStrings.aString1028)) {
																	var77 = 4;
																	var83 = var83.substring(
																			GameStrings.aString1028.length());
																} else if (var37.startsWith(GameStrings.aString961)) {
																	var77 = 5;
																	var83 = var83
																			.substring(GameStrings.aString961.length());
																} else if (var37.startsWith(GameStrings.aString1032)) {
																	var77 = 6;
																	var83 = var83.substring(
																			GameStrings.aString1032.length());
																} else if (var37.startsWith(GameStrings.aString1034)) {
																	var77 = 7;
																	var83 = var83.substring(
																			GameStrings.aString1034.length());
																} else if (var37.startsWith(GameStrings.aString1036)) {
																	var77 = 8;
																	var83 = var83.substring(
																			GameStrings.aString1036.length());
																} else if (var37.startsWith(GameStrings.aString1038)) {
																	var77 = 9;
																	var83 = var83.substring(
																			GameStrings.aString1038.length());
																} else if (var37.startsWith(GameStrings.aString850)) {
																	var77 = 10;
																	var83 = var83
																			.substring(GameStrings.aString850.length());
																} else if (var37.startsWith(GameStrings.aString1043)) {
																	var77 = 11;
																	var83 = var83.substring(
																			GameStrings.aString1043.length());
																}
															}

															var37 = var83.toLowerCase();
															byte var84 = 0;
															if (var37.startsWith(GameStrings.aString1096)) {
																var84 = 1;
																var83 = var83
																		.substring(GameStrings.aString1096.length());
															} else if (var37.startsWith(GameStrings.aString1094)) {
																var84 = 2;
																var83 = var83
																		.substring(GameStrings.aString1094.length());
															} else if (var37.startsWith(GameStrings.aString1047)) {
																var84 = 3;
																var83 = var83
																		.substring(GameStrings.aString1047.length());
															} else if (var37.startsWith(GameStrings.aString1049)) {
																var84 = 4;
																var83 = var83
																		.substring(GameStrings.aString1049.length());
															} else if (var37.startsWith(GameStrings.aString1100)) {
																var84 = 5;
																var83 = var83
																		.substring(GameStrings.aString1100.length());
															} else if (-1025678859 * Client.anInt2011 != 0) {
																if (var37.startsWith(GameStrings.aString1044)) {
																	var84 = 1;
																	var83 = var83.substring(
																			GameStrings.aString1044.length());
																} else if (var37.startsWith(GameStrings.aString1046)) {
																	var84 = 2;
																	var83 = var83.substring(
																			GameStrings.aString1046.length());
																} else if (var37.startsWith(GameStrings.aString1048)) {
																	var84 = 3;
																	var83 = var83.substring(
																			GameStrings.aString1048.length());
																} else if (var37.startsWith(GameStrings.aString1050)) {
																	var84 = 4;
																	var83 = var83.substring(
																			GameStrings.aString1050.length());
																} else if (var37.startsWith(GameStrings.aString942)) {
																	var84 = 5;
																	var83 = var83
																			.substring(GameStrings.aString942.length());
																}
															}

															Client.outBuffer.putHeader(87);
															Client.outBuffer.putByte(0);
															var20 = Client.outBuffer.position * 314639891;
															Client.outBuffer.putByte(var16);
															Client.outBuffer.putByte(var77);
															Client.outBuffer.putByte(var84);
															Client.method1056(Client.outBuffer, var83);
															Client.outBuffer.putVarByte(
																	Client.outBuffer.position * 314639891 - var20);
															continue;
														}

														if (var31 == 5009) {
															var6 -= 2;
															var83 = Class3.aStringArray85[var6];
															var54 = Class3.aStringArray85[var6 + 1];
															Client.outBuffer.putHeader(248);
															Client.outBuffer.putShort(0);
															var35 = 314639891 * Client.outBuffer.position;
															Client.outBuffer.putString(var83);
															BitBuf var76 = Client.outBuffer;
															var49 = 314639891 * var76.position;
															byte[] var68 = Class53.method273(var54);
															var76.putUSmart(var68.length);
															var76.position += Class120.aClass42_806.method228(var68, 0,
																	var68.length, var76.payload,
																	var76.position * 314639891) * -184175589;
															Client.outBuffer.putVarShort(
																	314639891 * Client.outBuffer.position - var35);
															continue;
														}

														if (var31 == 5015) {
															if (Class68.myPlayer != null
																	&& Class68.myPlayer.name != null) {
																var83 = Class68.myPlayer.name;
															} else {
																var83 = "";
															}

															Class3.aStringArray85[var6++] = var83;
															continue;
														}

														if (var31 == 5016) {
															Class3.anIntArray95[var5++] = -1975764555
																	* Client.anInt2182;
															continue;
														}

														if (var31 == 5017) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = DualNode_Sub14
																	.method822(var33);
															continue;
														}

														if (var31 == 5018) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = Class91.method403(var33);
															continue;
														}

														if (var31 == 5019) {
															--var5;
															var33 = Class3.anIntArray95[var5];
															Class3.anIntArray95[var5++] = Class21.method157(var33);
															continue;
														}

														if (var31 == 5020) {
															--var6;
															var83 = Class3.aStringArray85[var6];
															if (var83.equalsIgnoreCase("toggleroof")) {
																Node_Sub5.aClass24_1265.aBool298 = !Node_Sub5.aClass24_1265.aBool298;
																Class75.method335();
																if (Node_Sub5.aClass24_1265.aBool298) {
																	Class75.method334(99, "",
																			"Roofs are now all hidden");
																} else {
																	Class75.method334(99, "",
																			"Roofs will only be removed selectively");
																}
															}

															if (var83.equalsIgnoreCase("displayfps")) {
																Client.worldSelectorDisplayed = !Client.worldSelectorDisplayed;
															}

															if (Client.myRights * 1520983779 >= 2) {
																if (var83.equalsIgnoreCase("fpson")) {
																	Client.worldSelectorDisplayed = true;
																}

																if (var83.equalsIgnoreCase("fpsoff")) {
																	Client.worldSelectorDisplayed = false;
																}

																if (var83.equalsIgnoreCase("gc")) {
																	System.gc();
																}

																if (var83.equalsIgnoreCase("clientdrop")) {
																	Class81.method361();
																}

																if (var83.equalsIgnoreCase("errortest")
																		&& 1082541889 * Client.anInt2074 == 2) {
																	throw new RuntimeException();
																}
															}

															Client.outBuffer.putHeader(78);
															Client.outBuffer.putByte(var83.length() + 1);
															Client.outBuffer.putString(var83);
															continue;
														}

														if (var31 == 5021) {
															--var6;
															Client.aString2044 = Class3.aStringArray85[var6]
																	.toLowerCase().trim();
															continue;
														}

														if (var31 == 5022) {
															Class3.aStringArray85[var6++] = Client.aString2044;
															continue;
														}
													}
												}
											}
										} else {
											if (var31 >= 2000) {
												var31 -= 1000;
												--var5;
												var15 = Class94.method406(Class3.anIntArray95[var5]);
											} else {
												var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
											}

											if (var31 == 1927) {
												if (Class3.anInt91 * -1024934675 >= 10) {
													throw new RuntimeException();
												}

												if (var15.anObjectArray1188 == null) {
													return;
												}

												ScriptEvent var50 = new ScriptEvent();
												var50.aWidget1430 = var15;
												var50.args = var15.anObjectArray1188;
												var50.anInt1436 = Class3.anInt91 * 189385479 + 1898945859;
												Client.aDeque2164.method475(var0);
												continue;
											}
										}
									} else {
										if (var31 >= 2000) {
											var31 -= 1000;
											--var5;
											var15 = Class94.method406(Class3.anIntArray95[var5]);
										} else {
											var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
										}

										if (var31 == 1300) {
											--var5;
											var16 = Class3.anIntArray95[var5] - 1;
											if (var16 >= 0 && var16 <= 9) {
												--var6;
												var15.method493(var16, Class3.aStringArray85[var6]);
												continue;
											}

											--var6;
											continue;
										}

										if (var31 == 1301) {
											var5 -= 2;
											var16 = Class3.anIntArray95[var5];
											var35 = Class3.anIntArray95[1 + var5];
											var15.parent = Class20.method146(var16, var35);
											continue;
										}

										if (var31 == 1302) {
											--var5;
											var15.aBool1179 = Class3.anIntArray95[var5] == 1;
											continue;
										}

										if (var31 == 1303) {
											--var5;
											var15.anInt1166 = Class3.anIntArray95[var5] * -172520565;
											continue;
										}

										if (var31 == 1304) {
											--var5;
											var15.anInt1146 = Class3.anIntArray95[var5] * -77181551;
											continue;
										}

										if (var31 == 1305) {
											--var6;
											var15.name = Class3.aStringArray85[var6];
											continue;
										}

										if (var31 == 1306) {
											--var6;
											var15.selectedAction = Class3.aStringArray85[var6];
											continue;
										}

										if (var31 == 1307) {
											var15.actions = null;
											continue;
										}
									}
								} else {
									if (var31 >= 2000) {
										var31 -= 1000;
										--var5;
										var15 = Class94.method406(Class3.anIntArray95[var5]);
									} else {
										var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
									}

									Class68.method326(var15);
									if (var31 == 1200 || var31 == 1205 || var31 == 1212) {
										var5 -= 2;
										var16 = Class3.anIntArray95[var5];
										var35 = Class3.anIntArray95[var5 + 1];
										var15.itemId = -444483265 * var16;
										var15.itemQuantity = var35 * 1567728457;
										ItemDefinition var38 = FriendedPlayer.getItemDefinition(var16);
										var15.rotationX = var38.anInt1612 * 1778672027;
										var15.rotationZ = var38.anInt1613 * -438177483;
										var15.rotationY = 292702103 * var38.anInt1634;
										var15.anInt1198 = var38.anInt1642 * 889655743;
										var15.anInt1151 = -738298705 * var38.anInt1616;
										var15.modelZoom = -1079397735 * var38.anInt1637;
										if (var31 == 1205) {
											var15.anInt1155 = 0;
										} else if (var31 == 1212 | 1303294175 * var38.stackable == 1) {
											var15.anInt1155 = -1548696853;
										} else {
											var15.anInt1155 = 1197573590;
										}

										if (var15.anInt1160 * 1501804265 > 0) {
											var15.modelZoom = -438091779
													* (126003872 * var15.modelZoom / (1501804265 * var15.anInt1160));
										} else if (var15.anInt1135 * 124195285 > 0) {
											var15.modelZoom = 126003872 * var15.modelZoom
													/ (124195285 * var15.anInt1135) * -438091779;
										}
										continue;
									}

									if (var31 == 1201) {
										var15.modelType = -752921414;
										--var5;
										var15.modelId = Class3.anIntArray95[var5] * -541123263;
										continue;
									}

									if (var31 == 1202) {
										var15.modelType = -1129382121;
										var15.modelId = Class68.myPlayer.config.method269() * -541123263;
										continue;
									}
								}
							} else {
								var16 = -1;
								if (var31 >= 2000) {
									var31 -= 1000;
									--var5;
									var16 = Class3.anIntArray95[var5];
									var15 = Class94.method406(var16);
								} else {
									var15 = var46 ? Class24.aWidget304 : Class3.aWidget88;
								}

								if (var31 == 1100) {
									var5 -= 2;
									var15.insetX = 435089853 * Class3.anIntArray95[var5];
									if (-352661099 * var15.insetX > -302755437 * var15.viewportWidth
											- var15.width * 1645211541) {
										var15.insetX = var15.viewportWidth * -539648889 - var15.width * -1344985599;
									}

									if (var15.insetX * -352661099 < 0) {
										var15.insetX = 0;
									}

									var15.insetY = -1459786367 * Class3.anIntArray95[1 + var5];
									if (var15.insetY * -1602694527 > var15.viewportHeight * 177405235
											- var15.height * 1227800423) {
										var15.insetY = -1656271437 * var15.viewportHeight - -1999090201 * var15.height;
									}

									if (-1602694527 * var15.insetY < 0) {
										var15.insetY = 0;
									}

									Class68.method326(var15);
									continue;
								}

								if (var31 == 1101) {
									--var5;
									var15.textColor = Class3.anIntArray95[var5] * 1053943595;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1102) {
									--var5;
									var15.aBool1161 = Class3.anIntArray95[var5] == 1;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1103) {
									--var5;
									var15.alpha = Class3.anIntArray95[var5] * -150375007;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1104) {
									--var5;
									var15.anInt1137 = Class3.anIntArray95[var5] * -532092193;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1105) {
									--var5;
									var15.textureId = Class3.anIntArray95[var5] * 8452631;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1106) {
									--var5;
									var15.spriteId = Class3.anIntArray95[var5] * -2073708251;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1107) {
									--var5;
									var15.aBool1144 = Class3.anIntArray95[var5] == 1;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1108) {
									var15.modelType = -376460707;
									--var5;
									var15.modelId = Class3.anIntArray95[var5] * -541123263;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1109) {
									var5 -= 6;
									var15.anInt1198 = 1821510845 * Class3.anIntArray95[var5];
									var15.anInt1151 = 1509391427 * Class3.anIntArray95[var5 + 1];
									var15.rotationX = Class3.anIntArray95[var5 + 2] * 1055873919;
									var15.rotationZ = -478470667 * Class3.anIntArray95[3 + var5];
									var15.rotationY = Class3.anIntArray95[var5 + 4] * -1820349821;
									var15.modelZoom = -438091779 * Class3.anIntArray95[5 + var5];
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1110) {
									--var5;
									var35 = Class3.anIntArray95[var5];
									if (var35 != 467073769 * var15.anInt1162) {
										var15.anInt1162 = var35 * 1986493785;
										var15.anInt1194 = 0;
										var15.anInt1126 = 0;
										Class68.method326(var15);
									}
									continue;
								}

								if (var31 == 1111) {
									--var5;
									var15.aBool1154 = Class3.anIntArray95[var5] == 1;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1112) {
									--var6;
									var37 = Class3.aStringArray85[var6];
									if (!var37.equals(var15.text)) {
										var15.text = var37;
										Class68.method326(var15);
									}
									continue;
								}

								if (var31 == 1113) {
									--var5;
									var15.fontId = Class3.anIntArray95[var5] * 189801909;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1114) {
									var5 -= 3;
									var15.anInt1159 = Class3.anIntArray95[var5] * 1328854359;
									var15.anInt1138 = 252282377 * Class3.anIntArray95[var5 + 1];
									var15.anInt1158 = -51845037 * Class3.anIntArray95[var5 + 2];
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1115) {
									--var5;
									var15.textShadowed = Class3.anIntArray95[var5] == 1;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1116) {
									--var5;
									var15.borderThickness = Class3.anIntArray95[var5] * -1058827231;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1117) {
									--var5;
									var15.shadowColor = Class3.anIntArray95[var5] * 1485125361;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1118) {
									--var5;
									var15.flippedVertically = Class3.anIntArray95[var5] == 1;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1119) {
									--var5;
									var15.flippedHorizontally = Class3.anIntArray95[var5] == 1;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1120) {
									var5 -= 2;
									var15.viewportWidth = -1460374373 * Class3.anIntArray95[var5];
									var15.viewportHeight = Class3.anIntArray95[var5 + 1] * 2144421371;
									Class68.method326(var15);
									if (var16 != -1 && -1305917269 * var15.type == 0) {
										ObjectDefinition.method870(Widget.interfaces[var16 >> 16], var15, false);
									}
									continue;
								}

								if (var31 == 1121) {
									FriendedPlayer.method410(var15.anInt1129 * -1536575275, var15.index * 2021294259);
									Client.aWidget2135 = var15;
									Class68.method326(var15);
									continue;
								}

								if (var31 == 1122) {
									--var5;
									var15.anInt1143 = Class3.anIntArray95[var5] * -134170007;
									Class68.method326(var15);
									continue;
								}
							}
						} else {
							var33 = -1;
							if (var31 >= 2000) {
								var31 -= 1000;
								--var5;
								var33 = Class3.anIntArray95[var5];
								var34 = Class94.method406(var33);
							} else {
								var34 = var46 ? Class24.aWidget304 : Class3.aWidget88;
							}

							if (var31 == 1000) {
								var5 -= 4;
								var34.anInt1134 = Class3.anIntArray95[var5] * 10986657;
								var34.anInt1185 = -720369495 * Class3.anIntArray95[1 + var5];
								var34.anInt1132 = Class3.anIntArray95[2 + var5] * 821393763;
								var34.anInt1122 = -1510479807 * Class3.anIntArray95[3 + var5];
								Class68.method326(var34);
								Player.method1048(var34);
								if (var33 != -1 && -1305917269 * var34.type == 0) {
									ObjectDefinition.method870(Widget.interfaces[var33 >> 16], var34, false);
								}
								continue;
							}

							if (var31 == 1001) {
								var5 -= 4;
								var34.anInt1135 = Class3.anIntArray95[var5] * 934649725;
								var34.anInt1136 = Class3.anIntArray95[var5 + 1] * -280898437;
								var34.anInt1133 = -1174864481 * Class3.anIntArray95[var5 + 2];
								var34.buttonType = Class3.anIntArray95[3 + var5] * -1361079889;
								Class68.method326(var34);
								Player.method1048(var34);
								if (var33 != -1 && -1305917269 * var34.type == 0) {
									ObjectDefinition.method870(Widget.interfaces[var33 >> 16], var34, false);
								}
								continue;
							}

							if (var31 == 1003) {
								--var5;
								var36 = Class3.anIntArray95[var5] == 1;
								if (var36 != var34.hidden) {
									var34.hidden = var36;
									Class68.method326(var34);
								}
								continue;
							}

							if (var31 == 1005) {
								--var5;
								var34.aBool1201 = Class3.anIntArray95[var5] == 1;
								continue;
							}

							if (var31 == 1006) {
								--var5;
								var34.aBool1175 = Class3.anIntArray95[var5] == 1;
								continue;
							}
						}
					}

					if (var31 < 5400) {
						if (var31 == 5306) {
							int[] var99 = Class3.anIntArray95;
							var16 = var5++;
							var35 = Client.resizable ? 2 : 1;
							var99[var16] = var35;
							continue;
						}

						if (var31 == 5307) {
							--var5;
							var33 = Class3.anIntArray95[var5];
							if (var33 != 1 && var33 != 2) {
								continue;
							}

							Client.aLong2035 = 0L;
							if (var33 >= 2) {
								Client.resizable = true;
							} else {
								Client.resizable = false;
							}

							Node_Sub5.method534();
							if (Client.anInt2113 * 846055547 >= 25) {
								Client.outBuffer.putHeader(23);
								BitBuf var94 = Client.outBuffer;
								var35 = Client.resizable ? 2 : 1;
								var94.putByte(var35);
								Client.outBuffer.putShort(-452716157 * Class34.anInt381);
								Client.outBuffer.putShort(674167779 * Node_Sub9.anInt1339);
							}

							GameEngine.aBool1979 = true;
							continue;
						}

						if (var31 == 5308) {
							Class3.anIntArray95[var5++] = Node_Sub5.aClass24_1265.anInt300 * -1207115777;
							continue;
						}

						if (var31 == 5309) {
							--var5;
							var33 = Class3.anIntArray95[var5];
							if (var33 == 1 || var33 == 2) {
								Node_Sub5.aClass24_1265.anInt300 = -2081218561 * var33;
								Class75.method335();
							}
							continue;
						}
					}

					if (var31 < 5600) {
						if (var31 == 5504) {
							var5 -= 2;
							var33 = Class3.anIntArray95[var5];
							var16 = Class3.anIntArray95[1 + var5];
							if (!Client.aBool2046) {
								Client.anInt2051 = var33 * 1871674069;
								Client.minimapRotation = -571365833 * var16;
							}
							continue;
						}

						if (var31 == 5505) {
							Class3.anIntArray95[var5++] = Client.anInt2051 * -1992036739;
							continue;
						}

						if (var31 == 5506) {
							Class3.anIntArray95[var5++] = -1916997753 * Client.minimapRotation;
							continue;
						}

						if (var31 == 5530) {
							--var5;
							var33 = Class3.anIntArray95[var5];
							if (var33 < 0) {
								var33 = 0;
							}

							Client.anInt2185 = var33 * 1125013561;
							continue;
						}

						if (var31 == 5531) {
							Class3.anIntArray95[var5++] = Client.anInt2185 * -868608503;
							continue;
						}
					}

					if (var31 < 5700 && var31 == 5630) {
						Client.anInt2045 = -453788862;
					} else {
						if (var31 < 6300) {
							if (var31 == 6200) {
								var5 -= 2;
								Client.aShort2178 = (short) Class3.anIntArray95[var5];
								if (Client.aShort2178 <= 0) {
									Client.aShort2178 = 256;
								}

								Client.aShort2217 = (short) Class3.anIntArray95[var5 + 1];
								if (Client.aShort2217 <= 0) {
									Client.aShort2217 = 205;
								}
								continue;
							}

							if (var31 == 6201) {
								var5 -= 2;
								Client.aShort2218 = (short) Class3.anIntArray95[var5];
								if (Client.aShort2218 <= 0) {
									Client.aShort2218 = 256;
								}

								Client.aShort2014 = (short) Class3.anIntArray95[1 + var5];
								if (Client.aShort2014 <= 0) {
									Client.aShort2014 = 320;
								}
								continue;
							}

							if (var31 == 6202) {
								var5 -= 4;
								Client.aShort2219 = (short) Class3.anIntArray95[var5];
								if (Client.aShort2219 <= 0) {
									Client.aShort2219 = 1;
								}

								Client.aShort2125 = (short) Class3.anIntArray95[1 + var5];
								if (Client.aShort2125 <= 0) {
									Client.aShort2125 = 32767;
								} else if (Client.aShort2125 < Client.aShort2219) {
									Client.aShort2125 = Client.aShort2219;
								}

								Client.aShort2221 = (short) Class3.anIntArray95[2 + var5];
								if (Client.aShort2221 <= 0) {
									Client.aShort2221 = 1;
								}

								Client.aShort2222 = (short) Class3.anIntArray95[3 + var5];
								if (Client.aShort2222 <= 0) {
									Client.aShort2222 = 32767;
								} else if (Client.aShort2222 < Client.aShort2221) {
									Client.aShort2222 = Client.aShort2221;
								}
								continue;
							}

							if (var31 == 6203) {
								if (Client.aWidget2231 != null) {
									Class13.method118(0, 0, 1645211541 * Client.aWidget2231.width,
											Client.aWidget2231.height * 1227800423, false);
									Class3.anIntArray95[var5++] = Client.screenHeight * 2112468213;
									Class3.anIntArray95[var5++] = Client.screenWidth * -336695531;
								} else {
									Class3.anIntArray95[var5++] = -1;
									Class3.anIntArray95[var5++] = -1;
								}
								continue;
							}

							if (var31 == 6204) {
								Class3.anIntArray95[var5++] = Client.aShort2218;
								Class3.anIntArray95[var5++] = Client.aShort2014;
								continue;
							}

							if (var31 == 6205) {
								Class3.anIntArray95[var5++] = Client.aShort2178;
								Class3.anIntArray95[var5++] = Client.aShort2217;
								continue;
							}
						}

						if (var31 < 6600) {
							if (var31 == 6500) {
								Class3.anIntArray95[var5++] = Class30.loadWorlds() ? 1 : 0;
								continue;
							}

							World var98;
							if (var31 == 6501) {
								var98 = Npc.method1026((byte) 2);
								if (var98 != null) {
									Class3.anIntArray95[var5++] = -145619359 * var98.id;
									Class3.anIntArray95[var5++] = var98.flags * -1784645245;
									Class3.aStringArray85[var6++] = var98.activity;
									Class3.anIntArray95[var5++] = var98.location * -1854937097;
									Class3.anIntArray95[var5++] = var98.population * 215269871;
									Class3.aStringArray85[var6++] = var98.domain;
								} else {
									Class3.anIntArray95[var5++] = -1;
									Class3.anIntArray95[var5++] = 0;
									Class3.aStringArray85[var6++] = "";
									Class3.anIntArray95[var5++] = 0;
									Class3.anIntArray95[var5++] = 0;
									Class3.aStringArray85[var6++] = "";
								}
								continue;
							}

							if (var31 == 6502) {
								if (World.anInt1121 * -1614070229 < World.worldCount * -1946617791) {
									var98 = World.worlds[(World.anInt1121 += -1416261501) * -1614070229 - 1];
								} else {
									var98 = null;
								}

								if (var98 != null) {
									Class3.anIntArray95[var5++] = var98.id * -145619359;
									Class3.anIntArray95[var5++] = var98.flags * -1784645245;
									Class3.aStringArray85[var6++] = var98.activity;
									Class3.anIntArray95[var5++] = -1854937097 * var98.location;
									Class3.anIntArray95[var5++] = 215269871 * var98.population;
									Class3.aStringArray85[var6++] = var98.domain;
								} else {
									Class3.anIntArray95[var5++] = -1;
									Class3.anIntArray95[var5++] = 0;
									Class3.aStringArray85[var6++] = "";
									Class3.anIntArray95[var5++] = 0;
									Class3.anIntArray95[var5++] = 0;
									Class3.aStringArray85[var6++] = "";
								}
								continue;
							}

							World var93;
							if (var31 == 6506) {
								--var5;
								var33 = Class3.anIntArray95[var5];
								var93 = null;

								for (var35 = 0; var35 < -1946617791 * World.worldCount; ++var35) {
									if (var33 == World.worlds[var35].id * -145619359) {
										var93 = World.worlds[var35];
										break;
									}
								}

								if (var93 != null) {
									Class3.anIntArray95[var5++] = var93.id * -145619359;
									Class3.anIntArray95[var5++] = -1784645245 * var93.flags;
									Class3.aStringArray85[var6++] = var93.activity;
									Class3.anIntArray95[var5++] = var93.location * -1854937097;
									Class3.anIntArray95[var5++] = var93.population * 215269871;
									Class3.aStringArray85[var6++] = var93.domain;
								} else {
									Class3.anIntArray95[var5++] = -1;
									Class3.anIntArray95[var5++] = 0;
									Class3.aStringArray85[var6++] = "";
									Class3.anIntArray95[var5++] = 0;
									Class3.anIntArray95[var5++] = 0;
									Class3.aStringArray85[var6++] = "";
								}
								continue;
							}

							if (var31 == 6507) {
								var5 -= 4;
								var33 = Class3.anIntArray95[var5];
								var55 = Class3.anIntArray95[1 + var5] == 1;
								var35 = Class3.anIntArray95[2 + var5];
								var41 = Class3.anIntArray95[3 + var5] == 1;
								if (World.worlds != null) {
									Class37.method210(0, World.worlds.length - 1, var33, var55, var35, var41);
								}
								continue;
							}

							if (var31 == 6511) {
								--var5;
								var33 = Class3.anIntArray95[var5];
								if (var33 >= 0 && var33 < -1946617791 * World.worldCount) {
									var93 = World.worlds[var33];
									Class3.anIntArray95[var5++] = -145619359 * var93.id;
									Class3.anIntArray95[var5++] = -1784645245 * var93.flags;
									Class3.aStringArray85[var6++] = var93.activity;
									Class3.anIntArray95[var5++] = var93.location * -1854937097;
									Class3.anIntArray95[var5++] = var93.population * 215269871;
									Class3.aStringArray85[var6++] = var93.domain;
									continue;
								}

								Class3.anIntArray95[var5++] = -1;
								Class3.anIntArray95[var5++] = 0;
								Class3.aStringArray85[var6++] = "";
								Class3.anIntArray95[var5++] = 0;
								Class3.anIntArray95[var5++] = 0;
								Class3.aStringArray85[var6++] = "";
								continue;
							}
						}

						throw new IllegalStateException();
					}
				}
			} catch (Exception var30) {
				StringBuilder var12 = new StringBuilder(30);
				var12.append("").append(var4.key).append(" ");

				for (var13 = 1112721435 * Class3.anInt87 - 1; var13 >= 0; --var13) {
					var12.append("").append(Class3.aClass33Array86[var13].aRuneScript361.key).append(" ");
				}

				var12.append("").append(var10);
				Class79.method345(var12.toString(), var30);
			}
		}
	}
}
