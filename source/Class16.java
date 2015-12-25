
public class Class16 {

	int[][] anIntArrayArray244;
	int anInt245;
	int anInt246;

	public Class16(int var1, int var2) {
		if (var2 != var1) {
			int var7 = Class31.method191(var1, var2);
			var1 /= var7;
			var2 /= var7;
			this.anInt246 = var1 * 253720335;
			this.anInt245 = var2 * 1723015537;
			this.anIntArrayArray244 = new int[var1][14];

			for (int var8 = 0; var8 < var1; ++var8) {
				int[] var3 = this.anIntArrayArray244[var8];
				double var11 = (double) var8 / (double) var1 + 6.0D;
				int var4 = (int) Math.floor(var11 - 7.0D + 1.0D);
				if (var4 < 0) {
					var4 = 0;
				}

				int var13 = (int) Math.ceil(var11 + 7.0D);
				if (var13 > 14) {
					var13 = 14;
				}

				for (double var9 = (double) var2 / (double) var1; var4 < var13; ++var4) {
					double var14 = 3.141592653589793D * ((double) var4 - var11);
					double var5 = var9;
					if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
						var5 = var9 * (Math.sin(var14) / var14);
					}

					var5 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double) var4 - var11));
					var3[var4] = (int) Math.floor(65536.0D * var5 + 0.5D);
				}
			}

		}
	}

	static void method127(GameEngine var0) {
		if (Class6.loadedWorlds) {
			BoundaryDecorationStub.method107(var0);
		} else {
			if ((823601801 * Class74.anInt627 == 1 || !ClanMate.aBool1221 && 823601801 * Class74.anInt627 == 4)
					&& Class74.anInt628 * -2040065729 >= Class6.anInt132 * 1933284923 + 765 - 50
					&& Class74.anInt629 * 2090526775 >= 453) {
				Node_Sub5.aClass24_1265.aBool303 = !Node_Sub5.aClass24_1265.aBool303;
				Class75.method335();
				if (!Node_Sub5.aClass24_1265.aBool303) {
					PlayerConfig.method271(Class2.aClass87_Sub1_79, "scape main", "", 255, false);
				} else {
					Class110.aNode_Sub4_Sub4_784.method856();
					Class110.anInt782 = 325298615;
					Class110.aClass87_783 = null;
				}
			}

			if (846055547 * Client.anInt2113 != 5) {
				Class6.anInt140 += 1860184029;
				if (846055547 * Client.anInt2113 == 10 || Client.anInt2113 * 846055547 == 11) {
					int var6;
					if (-1025678859 * Client.anInt2011 == 0) {
						if (823601801 * Class74.anInt627 == 1
								|| !ClanMate.aBool1221 && Class74.anInt627 * 823601801 == 4) {
							var6 = 1933284923 * Class6.anInt132 + 5;
							short var1 = 463;
							byte var4 = 100;
							byte var2 = 35;
							if (-2040065729 * Class74.anInt628 >= var6 && -2040065729 * Class74.anInt628 <= var6 + var4
									&& Class74.anInt629 * 2090526775 >= var1
									&& 2090526775 * Class74.anInt629 <= var2 + var1) {
								if (Class30.loadWorlds()) {
									Class6.loadedWorlds = true;
								}

								return;
							}
						}

						if (Class76.aClass26_644 != null && Class30.loadWorlds()) {
							Class6.loadedWorlds = true;
						}
					}

					var6 = Class74.anInt627 * 823601801;
					int var9 = Class74.anInt628 * -2040065729;
					int var14 = 2090526775 * Class74.anInt629;
					if (!ClanMate.aBool1221 && var6 == 4) {
						var6 = 1;
					}

					String var3;
					short var5;
					int var10;
					if (-1168104433 * Class6.anInt116 == 0) {
						var10 = 180 + 1744540627 * Class6.anInt126 - 80;
						var5 = 291;
						if (var6 == 1 && var9 >= var10 - 75 && var9 <= var10 + 75 && var14 >= var5 - 20
								&& var14 <= var5 + 20) {
							var3 = Class37.method212("secure", true)
									+ "m=account-creation/g=oldscape/create_account_funnel.ws";
							Class96_Sub1.method503(var3, true, "openjs", false);
						}

						var10 = 80 + 1744540627 * Class6.anInt126 + 180;
						if (var6 == 1 && var9 >= var10 - 75 && var9 <= var10 + 75 && var14 >= var5 - 20
								&& var14 <= var5 + 20) {
							if ((Client.myWorldFlags * 1115656689 & 4) != 0) {
								if ((1115656689 * Client.myWorldFlags & 1024) != 0) {
									Class6.aString133 = GameStrings.aString924;
									Class6.aString134 = GameStrings.aString1065;
									Class6.aString135 = GameStrings.aString1066;
								} else {
									Class6.aString133 = GameStrings.aString1058;
									Class6.aString134 = GameStrings.aString1059;
									Class6.aString135 = GameStrings.aString939;
								}

								Class6.anInt116 = -217167121;
								Class6.anInt115 = 0;
							} else if ((Client.myWorldFlags * 1115656689 & 1024) != 0) {
								Class6.aString133 = GameStrings.aString1060;
								Class6.aString134 = GameStrings.aString1062;
								Class6.aString135 = GameStrings.aString1063;
								Class6.anInt116 = -217167121;
								Class6.anInt115 = 0;
							} else {
								Class6.aString133 = GameStrings.aString842;
								Class6.aString134 = GameStrings.aString1055;
								Class6.aString135 = GameStrings.aString917;
								Class6.anInt116 = -434334242;
								Class6.anInt115 = 0;
							}
						}
					} else if (-1168104433 * Class6.anInt116 == 1) {
						while (Class58.method289(2102970548)) {
							if (Class5.anInt112 * -1989794123 == 84) {
								Class6.aString133 = GameStrings.aString842;
								Class6.aString134 = GameStrings.aString1055;
								Class6.aString135 = GameStrings.aString917;
								Class6.anInt116 = -434334242;
								Class6.anInt115 = 0;
							} else if (Class5.anInt112 * -1989794123 == 13) {
								Class6.anInt116 = 0;
							}
						}

						var10 = 1744540627 * Class6.anInt126 + 180 - 80;
						var5 = 321;
						if (var6 == 1 && var9 >= var10 - 75 && var9 <= 75 + var10 && var14 >= var5 - 20
								&& var14 <= var5 + 20) {
							Class6.aString133 = GameStrings.aString842;
							Class6.aString134 = GameStrings.aString1055;
							Class6.aString135 = GameStrings.aString917;
							Class6.anInt116 = -434334242;
							Class6.anInt115 = 0;
						}

						var10 = 180 + 1744540627 * Class6.anInt126 + 80;
						if (var6 == 1 && var9 >= var10 - 75 && var9 <= var10 + 75 && var14 >= var5 - 20
								&& var14 <= 20 + var5) {
							Class6.anInt116 = 0;
						}
					} else {
						short var12;
						if (-1168104433 * Class6.anInt116 == 2) {
							var12 = 231;
							var10 = var12 + 30;
							if (var6 == 1 && var14 >= var10 - 15 && var14 < var10) {
								Class6.anInt115 = 0;
							}

							var10 += 15;
							if (var6 == 1 && var14 >= var10 - 15 && var14 < var10) {
								Class6.anInt115 = 586349535;
							}

							var10 += 15;
							var12 = 361;
							if (var6 == 1 && var14 >= var12 - 15 && var14 < var12) {
								GPI.method230(GameStrings.aString1085, GameStrings.aString1086,
										GameStrings.aString1087);
								Class6.anInt116 = -1085835605;
								return;
							}

							int var15 = Class6.anInt126 * 1744540627 + 180 - 80;
							short var11 = 321;
							if (var6 == 1 && var9 >= var15 - 75 && var9 <= 75 + var15 && var14 >= var11 - 20
									&& var14 <= var11 + 20) {
								Class6.aString136 = Class6.aString136.trim();
								if (Class6.aString136.length() == 0) {
									GPI.method230(GameStrings.aString990, GameStrings.aString1102,
											GameStrings.aString962);
									return;
								}

								if (Class6.aString123.length() == 0) {
									GPI.method230(GameStrings.aString963, GameStrings.aString881,
											GameStrings.aString965);
									return;
								}

								GPI.method230(GameStrings.aString1069, GameStrings.aString1070,
										GameStrings.aString1071);
								Class6.aClass92_119 = Node_Sub5.aClass24_1265.aLinkedHashMap301
										.containsKey(Integer.valueOf(Class91.method400(Class6.aString136)))
												? Class92.aClass92_724 : Class92.aClass92_726;
								Node_Sub8.method550(20);
								return;
							}

							var15 = 80 + Class6.anInt126 * 1744540627 + 180;
							if (var6 == 1 && var9 >= var15 - 75 && var9 <= 75 + var15 && var14 >= var11 - 20
									&& var14 <= var11 + 20) {
								Class6.anInt116 = 0;
								Class6.aString136 = "";
								Class6.aString123 = "";
								Class114.anInt795 = 0;
								Class37.aString404 = "";
								Class6.aBool139 = true;
							}

							while (Class58.method289(1859574103)) {
								boolean var7 = false;

								for (int var8 = 0; var8 < Class6.aString141.length(); ++var8) {
									if (Class2.aChar80 == Class6.aString141.charAt(var8)) {
										var7 = true;
										break;
									}
								}

								if (Class5.anInt112 * -1989794123 == 13) {
									Class6.anInt116 = 0;
									Class6.aString136 = "";
									Class6.aString123 = "";
									Class114.anInt795 = 0;
									Class37.aString404 = "";
									Class6.aBool139 = true;
								} else if (Class6.anInt115 * -1914929121 == 0) {
									if (-1989794123 * Class5.anInt112 == 85 && Class6.aString136.length() > 0) {
										Class6.aString136 = Class6.aString136.substring(0,
												Class6.aString136.length() - 1);
									}

									if (-1989794123 * Class5.anInt112 == 84 || -1989794123 * Class5.anInt112 == 80) {
										Class6.anInt115 = 586349535;
									}

									if (var7 && Class6.aString136.length() < 320) {
										Class6.aString136 = Class6.aString136 + Class2.aChar80;
									}
								} else if (-1914929121 * Class6.anInt115 == 1) {
									if (-1989794123 * Class5.anInt112 == 85 && Class6.aString123.length() > 0) {
										Class6.aString123 = Class6.aString123.substring(0,
												Class6.aString123.length() - 1);
									}

									if (Class5.anInt112 * -1989794123 == 84 || -1989794123 * Class5.anInt112 == 80) {
										Class6.anInt115 = 0;
									}

									if (Class5.anInt112 * -1989794123 == 84) {
										Class6.aString136 = Class6.aString136.trim();
										if (Class6.aString136.length() == 0) {
											GPI.method230(GameStrings.aString990, GameStrings.aString1102,
													GameStrings.aString962);
											return;
										}

										if (Class6.aString123.length() == 0) {
											GPI.method230(GameStrings.aString963, GameStrings.aString881,
													GameStrings.aString965);
											return;
										}

										GPI.method230(GameStrings.aString1069, GameStrings.aString1070,
												GameStrings.aString1071);
										Class6.aClass92_119 = Node_Sub5.aClass24_1265.aLinkedHashMap301
												.containsKey(Integer.valueOf(Class91.method400(Class6.aString136)))
														? Class92.aClass92_724 : Class92.aClass92_726;
										Node_Sub8.method550(20);
										return;
									}

									if (var7 && Class6.aString123.length() < 20) {
										Class6.aString123 = Class6.aString123 + Class2.aChar80;
									}
								}
							}
						} else {
							boolean var13;
							int var16;
							if (-1168104433 * Class6.anInt116 == 4) {
								var10 = 180 + 1744540627 * Class6.anInt126 - 80;
								var5 = 321;
								if (var6 == 1 && var9 >= var10 - 75 && var9 <= var10 + 75 && var14 >= var5 - 20
										&& var14 <= 20 + var5) {
									Class37.aString404.trim();
									if (Class37.aString404.length() != 6) {
										GPI.method230(GameStrings.aString914, GameStrings.aString877,
												GameStrings.aString1021);
										return;
									}

									Class114.anInt795 = Integer.parseInt(Class37.aString404) * -748784207;
									Class37.aString404 = "";
									Class6.aClass92_119 = Class6.aBool139 ? Class92.aClass92_729 : Class92.aClass92_727;
									GPI.method230(GameStrings.aString1069, GameStrings.aString1070,
											GameStrings.aString1071);
									Node_Sub8.method550(20);
									return;
								}

								if (var6 == 1 && var9 >= Class6.anInt126 * 1744540627 + 180 - 9
										&& var9 <= 130 + 1744540627 * Class6.anInt126 + 180 && var14 >= 263
										&& var14 <= 296) {
									Class6.aBool139 = !Class6.aBool139;
								}

								if (var6 == 1 && var9 >= 1744540627 * Class6.anInt126 + 180 - 34
										&& var9 <= 34 + 1744540627 * Class6.anInt126 + 180 && var14 >= 351
										&& var14 <= 363) {
									var3 = Class37.method212("secure", true)
											+ "m=totp-authenticator/disableTOTPRequest";
									Class96_Sub1.method503(var3, true, "openjs", false);
								}

								var10 = Class6.anInt126 * 1744540627 + 180 + 80;
								if (var6 == 1 && var9 >= var10 - 75 && var9 <= var10 + 75 && var14 >= var5 - 20
										&& var14 <= var5 + 20) {
									Class6.anInt116 = 0;
									Class6.aString136 = "";
									Class6.aString123 = "";
									Class114.anInt795 = 0;
									Class37.aString404 = "";
								}

								while (Class58.method289(1935265234)) {
									var13 = false;

									for (var16 = 0; var16 < Class6.aString128.length(); ++var16) {
										if (Class2.aChar80 == Class6.aString128.charAt(var16)) {
											var13 = true;
											break;
										}
									}

									if (Class5.anInt112 * -1989794123 == 13) {
										Class6.anInt116 = 0;
										Class6.aString136 = "";
										Class6.aString123 = "";
										Class114.anInt795 = 0;
										Class37.aString404 = "";
									} else {
										if (-1989794123 * Class5.anInt112 == 85 && Class37.aString404.length() > 0) {
											Class37.aString404 = Class37.aString404.substring(0,
													Class37.aString404.length() - 1);
										}

										if (-1989794123 * Class5.anInt112 == 84) {
											Class37.aString404.trim();
											if (Class37.aString404.length() != 6) {
												GPI.method230(GameStrings.aString914, GameStrings.aString877,
														GameStrings.aString1021);
												return;
											}

											Class114.anInt795 = Integer.parseInt(Class37.aString404) * -748784207;
											Class37.aString404 = "";
											Class6.aClass92_119 = Class6.aBool139 ? Class92.aClass92_729
													: Class92.aClass92_727;
											GPI.method230(GameStrings.aString1069, GameStrings.aString1070,
													GameStrings.aString1071);
											Node_Sub8.method550(20);
											return;
										}

										if (var13 && Class37.aString404.length() < 6) {
											Class37.aString404 = Class37.aString404 + Class2.aChar80;
										}
									}
								}
							} else if (Class6.anInt116 * -1168104433 == 5) {
								var10 = 180 + Class6.anInt126 * 1744540627 - 80;
								var5 = 321;
								if (var6 == 1 && var9 >= var10 - 75 && var9 <= 75 + var10 && var14 >= var5 - 20
										&& var14 <= 20 + var5) {
									Class41.method224();
									return;
								}

								var10 = 180 + Class6.anInt126 * 1744540627 + 80;
								if (var6 == 1 && var9 >= var10 - 75 && var9 <= var10 + 75 && var14 >= var5 - 20
										&& var14 <= 20 + var5) {
									Class6.aString133 = GameStrings.aString842;
									Class6.aString134 = GameStrings.aString1055;
									Class6.aString135 = GameStrings.aString917;
									Class6.anInt116 = -434334242;
									Class6.anInt115 = 0;
									Class6.aString123 = "";
								}

								while (Class58.method289(1912057832)) {
									var13 = false;

									for (var16 = 0; var16 < Class6.aString141.length(); ++var16) {
										if (Class2.aChar80 == Class6.aString141.charAt(var16)) {
											var13 = true;
											break;
										}
									}

									if (Class5.anInt112 * -1989794123 == 13) {
										Class6.aString133 = GameStrings.aString842;
										Class6.aString134 = GameStrings.aString1055;
										Class6.aString135 = GameStrings.aString917;
										Class6.anInt116 = -434334242;
										Class6.anInt115 = 0;
										Class6.aString123 = "";
									} else {
										if (Class5.anInt112 * -1989794123 == 85 && Class6.aString136.length() > 0) {
											Class6.aString136 = Class6.aString136.substring(0,
													Class6.aString136.length() - 1);
										}

										if (-1989794123 * Class5.anInt112 == 84) {
											Class41.method224();
											return;
										}

										if (var13 && Class6.aString136.length() < 320) {
											Class6.aString136 = Class6.aString136 + Class2.aChar80;
										}
									}
								}
							} else if (Class6.anInt116 * -1168104433 == 6) {
								while (Class58.method289(1992890020)) {
									if (-1989794123 * Class5.anInt112 == 84 || -1989794123 * Class5.anInt112 == 13) {
										Class6.aString133 = GameStrings.aString842;
										Class6.aString134 = GameStrings.aString1055;
										Class6.aString135 = GameStrings.aString917;
										Class6.anInt116 = -434334242;
										Class6.anInt115 = 0;
										Class6.aString123 = "";
									}
								}

								var12 = 321;
								if (var6 == 1 && var14 >= var12 - 20 && var14 <= 20 + var12) {
									Class6.aString133 = GameStrings.aString842;
									Class6.aString134 = GameStrings.aString1055;
									Class6.aString135 = GameStrings.aString917;
									Class6.anInt116 = -434334242;
									Class6.anInt115 = 0;
									Class6.aString123 = "";
								}
							}
						}
					}

				}
			}
		}
	}

	int method128(int var1) {
		if (this.anIntArrayArray244 != null) {
			var1 = (int) ((long) (this.anInt245 * 1822654353) * (long) var1 / (long) (this.anInt246 * 389715951));
		}

		return var1;
	}

	byte[] method129(byte[] var1) {
		if (this.anIntArrayArray244 != null) {
			int var9 = (int) ((long) var1.length * (long) (this.anInt245 * 1822654353)
					/ (long) (389715951 * this.anInt246)) + 14;
			int[] var8 = new int[var9];
			int var2 = 0;
			int var4 = 0;

			int var5;
			for (var5 = 0; var5 < var1.length; ++var5) {
				byte var6 = var1[var5];
				int[] var7 = this.anIntArrayArray244[var4];

				int var3;
				for (var3 = 0; var3 < 14; ++var3) {
					var8[var2 + var3] += var7[var3] * var6;
				}

				var4 += 1822654353 * this.anInt245;
				var3 = var4 / (389715951 * this.anInt246);
				var2 += var3;
				var4 -= 389715951 * this.anInt246 * var3;
			}

			var1 = new byte[var9];

			for (var5 = 0; var5 < var9; ++var5) {
				int var10 = '\u8000' + var8[var5] >> 16;
				if (var10 < -128) {
					var1[var5] = -128;
				} else if (var10 > 127) {
					var1[var5] = 127;
				} else {
					var1[var5] = (byte) var10;
				}
			}
		}

		return var1;
	}

	protected static final void method130() {
		IndexTable.anImage572 = null;
		Class7.aFont153 = null;
		IsaacRandom.aFontMetrics98 = null;
	}

	int method131(int var1) {
		if (this.anIntArrayArray244 != null) {
			var1 = 6 + (int) ((long) (1822654353 * this.anInt245) * (long) var1 / (long) (this.anInt246 * 389715951));
		}

		return var1;
	}
}
