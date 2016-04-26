public class Class16 {

	int anInt246;
	int anInt245;
	int[][] anIntArrayArray244;

	public Class16(int var1, int var2) {
		if (var2 != var1) {
			int var7 = Class31.method191(var1, var2);
			var1 /= var7;
			var2 /= var7;
			this.anInt246 = var1;
			this.anInt245 = var2;
			this.anIntArrayArray244 = new int[var1][14];

			for (int var8 = 0; var8 < var1; var8++) {
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

				for (double var9 = (double) var2 / (double) var1; var4 < var13; var4++) {
					double var14 = ((double) var4 - var11) * 3.141592653589793D;
					double var5 = var9;
					if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
						var5 = Math.sin(var14) / var14 * var9;
					}

					var5 = (Math.cos(((double) var4 - var11) * 0.2243994752564138D) * 0.46D + 0.54D) * var5;
					var3[var4] = (int) Math.floor(var5 * 65536.0D + 0.5D);
				}
			}
		}

	}

	static void method127(GameEngine var0) {
		if (Class6.loadedWorlds) {
			BoundaryDecorationStub.method107(var0);
		} else {
			if ((Class74.anInt627 == 1 || !ClanMate.aBool1221 && Class74.anInt627 == 4)
					&& Class74.anInt628 >= Class6.anInt132 + 765 - 50 && Class74.anInt629 >= 453) {
				AnimationSkin.settings.muted = !AnimationSkin.settings.muted;
				Class75.serializeSettings();
				if (!AnimationSkin.settings.muted) {
					PlayerConfig.method271(Class2.midiTrack1Index, "scape main", "", 255, false);
				} else {
					Class110.aNode_Sub4_Sub4_784.method856();
					Class110.anInt782 = 1;
					Class110.aClass87_783 = null;
				}
			}

			if (Client.anInt2113 != 5) {
				++Class6.anInt140;
				if (Client.anInt2113 == 10 || Client.anInt2113 == 11) {
					int var6;
					if (Client.anInt2011 == 0) {
						if (Class74.anInt627 == 1 || !ClanMate.aBool1221 && Class74.anInt627 == 4) {
							var6 = Class6.anInt132 + 5;
							short var9 = 463;
							byte var14 = 100;
							byte var3 = 35;
							if (Class74.anInt628 >= var6 && Class74.anInt628 <= var6 + var14 && Class74.anInt629 >= var9
									&& Class74.anInt629 <= var3 + var9) {
								if (Class30.loadWorlds()) {
									Class6.loadedWorlds = true;
								}

								return;
							}
						}

						if (BuildType.aClass26_644 != null && Class30.loadWorlds()) {
							Class6.loadedWorlds = true;
						}
					}

					var6 = Class74.anInt627;
					int var121 = Class74.anInt628;
					int var131 = Class74.anInt629;
					if (!ClanMate.aBool1221 && var6 == 4) {
						var6 = 1;
					}

					short var5;
					int var10;
					String var141;
					if (Class6.anInt116 == 0) {
						var10 = Class6.anInt126 + 180 - 80;
						var5 = 291;
						if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
								&& var131 <= var5 + 20) {
							var141 = Class37.method212("secure", true)
									+ "m=account-creation/g=oldscape/create_account_funnel.ws";
							Class96_Sub1.method503(var141, true, "openjs", false);
						}

						var10 = Class6.anInt126 + 80 + 180;
						if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
								&& var131 <= var5 + 20) {
							if ((Client.myWorldFlags & 0x4) != 0) {
								if ((Client.myWorldFlags & 0x400) != 0) {
									Class6.aString133 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Class6.aString134 = "Players can attack each other almost everywhere";
									Class6.aString135 = "and the Protect Item prayer won\'t work.";
								} else {
									Class6.aString133 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Class6.aString134 = "Players can attack each other";
									Class6.aString135 = "almost everywhere.";
								}

								Class6.anInt116 = 1;
								Class6.anInt115 = 0;
							} else if ((Client.myWorldFlags & 0x400) != 0) {
								Class6.aString133 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Class6.aString134 = "The Protect Item prayer will";
								Class6.aString135 = "not work on this world.";
								Class6.anInt116 = 1;
								Class6.anInt115 = 0;
							} else {
								Class6.aString133 = "";
								Class6.aString134 = "Enter your username/email & password.";
								Class6.aString135 = "";
								Class6.anInt116 = 2;
								Class6.anInt115 = 0;
							}
						}
					} else if (Class6.anInt116 != 1) {
						short var12;
						if (Class6.anInt116 == 2) {
							var12 = 231;
							var10 = var12 + 30;
							if (var6 == 1 && var131 >= var10 - 15 && var131 < var10) {
								Class6.anInt115 = 0;
							}

							var10 += 15;
							if (var6 == 1 && var131 >= var10 - 15 && var131 < var10) {
								Class6.anInt115 = 1;
							}

							var10 += 15;
							var12 = 361;
							if (var6 == 1 && var131 >= var12 - 15 && var131 < var12) {
								GPI.method230("Please enter your username.",
										"If you created your account after November",
										"2010, this will be the creation email address.");
								Class6.anInt116 = 5;
								return;
							}

							int var13 = Class6.anInt126 + 180 - 80;
							short var16 = 321;
							if (var6 == 1 && var121 >= var13 - 75 && var121 <= var13 + 75 && var131 >= var16 - 20
									&& var131 <= var16 + 20) {
								Class6.username = Class6.username.trim();
								if (Class6.username.length() == 0) {
									GPI.method230("", "Please enter your username/email address.", "");
									return;
								}

								if (Class6.password.length() == 0) {
									GPI.method230("", "Please enter your password.", "");
									return;
								}

								GPI.method230("", "Connecting to server...", "");
								Class6.blockType = AnimationSkin.settings.trustList
										.containsKey(Integer.valueOf(Class91.bkdrHash(Class6.username)))
												? BlockType.TRUST : BlockType.NORMAL;
								Node_Sub8.method550(20);
								return;
							}

							var13 = Class6.anInt126 + 80 + 180;
							if (var6 == 1 && var121 >= var13 - 75 && var121 <= var13 + 75 && var131 >= var16 - 20
									&& var131 <= var16 + 20) {
								Class6.anInt116 = 0;
								Class6.username = "";
								Class6.password = "";
								Class114.pin = 0;
								Class37.pinText = "";
								Class6.trust = true;
							}

							while (true) {
								while (Class58.method289(1859574103)) {
									boolean var7 = false;

									for (int var8 = 0; var8 < Class6.aString141.length(); var8++) {
										if (Class2.aChar80 == Class6.aString141.charAt(var8)) {
											var7 = true;
											break;
										}
									}

									if (Class5.anInt112 == 13) {
										Class6.anInt116 = 0;
										Class6.username = "";
										Class6.password = "";
										Class114.pin = 0;
										Class37.pinText = "";
										Class6.trust = true;
									} else if (Class6.anInt115 == 0) {
										if (Class5.anInt112 == 85 && Class6.username.length() > 0) {
											Class6.username = Class6.username.substring(0,
													Class6.username.length() - 1);
										}

										if (Class5.anInt112 == 84 || Class5.anInt112 == 80) {
											Class6.anInt115 = 1;
										}

										if (var7 && Class6.username.length() < 320) {
											Class6.username = Class6.username + Class2.aChar80;
										}
									} else if (Class6.anInt115 == 1) {
										if (Class5.anInt112 == 85 && Class6.password.length() > 0) {
											Class6.password = Class6.password.substring(0,
													Class6.password.length() - 1);
										}

										if (Class5.anInt112 == 84 || Class5.anInt112 == 80) {
											Class6.anInt115 = 0;
										}

										if (Class5.anInt112 == 84) {
											Class6.username = Class6.username.trim();
											if (Class6.username.length() == 0) {
												GPI.method230("", "Please enter your username/email address.", "");
												return;
											}

											if (Class6.password.length() == 0) {
												GPI.method230("", "Please enter your password.", "");
												return;
											}

											GPI.method230("", "Connecting to server...", "");
											Class6.blockType = AnimationSkin.settings.trustList
													.containsKey(Integer.valueOf(Class91.bkdrHash(Class6.username)))
															? BlockType.TRUST : BlockType.NORMAL;
											Node_Sub8.method550(20);
											return;
										}

										if (var7 && Class6.password.length() < 20) {
											Class6.password = Class6.password + Class2.aChar80;
										}
									}
								}

								return;
							}
						} else {
							boolean var15;
							int var161;
							if (Class6.anInt116 == 4) {
								var10 = Class6.anInt126 + 180 - 80;
								var5 = 321;
								if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
										&& var131 <= var5 + 20) {
									Class37.pinText.trim();
									if (Class37.pinText.length() != 6) {
										GPI.method230("", "Please enter a 6-digin PIN.", "");
										return;
									}

									Class114.pin = Integer.parseInt(Class37.pinText);
									Class37.pinText = "";
									Class6.blockType = Class6.trust ? BlockType.PIN_TRUST : BlockType.PIN;
									GPI.method230("", "Connecting to server...", "");
									Node_Sub8.method550(20);
									return;
								}

								if (var6 == 1 && var121 >= Class6.anInt126 + 180 - 9
										&& var121 <= Class6.anInt126 + 130 + 180 && var131 >= 263 && var131 <= 296) {
									Class6.trust = !Class6.trust;
								}

								if (var6 == 1 && var121 >= Class6.anInt126 + 180 - 34
										&& var121 <= Class6.anInt126 + 34 + 180 && var131 >= 351 && var131 <= 363) {
									var141 = Class37.method212("secure", true)
											+ "m=totp-authenticator/disableTOTPRequest";
									Class96_Sub1.method503(var141, true, "openjs", false);
								}

								var10 = Class6.anInt126 + 180 + 80;
								if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
										&& var131 <= var5 + 20) {
									Class6.anInt116 = 0;
									Class6.username = "";
									Class6.password = "";
									Class114.pin = 0;
									Class37.pinText = "";
								}

								while (Class58.method289(1935265234)) {
									var15 = false;

									for (var161 = 0; var161 < Class6.aString128.length(); var161++) {
										if (Class2.aChar80 == Class6.aString128.charAt(var161)) {
											var15 = true;
											break;
										}
									}

									if (Class5.anInt112 == 13) {
										Class6.anInt116 = 0;
										Class6.username = "";
										Class6.password = "";
										Class114.pin = 0;
										Class37.pinText = "";
									} else {
										if (Class5.anInt112 == 85 && Class37.pinText.length() > 0) {
											Class37.pinText = Class37.pinText.substring(0,
													Class37.pinText.length() - 1);
										}

										if (Class5.anInt112 == 84) {
											Class37.pinText.trim();
											if (Class37.pinText.length() != 6) {
												GPI.method230("", "Please enter a 6-digin PIN.", "");
												return;
											}

											Class114.pin = Integer.parseInt(Class37.pinText);
											Class37.pinText = "";
											Class6.blockType = Class6.trust ? BlockType.PIN_TRUST : BlockType.PIN;
											GPI.method230("", "Connecting to server...", "");
											Node_Sub8.method550(20);
											return;
										}

										if (var15 && Class37.pinText.length() < 6) {
											Class37.pinText = Class37.pinText + Class2.aChar80;
										}
									}
								}
							} else if (Class6.anInt116 == 5) {
								var10 = Class6.anInt126 + 180 - 80;
								var5 = 321;
								if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
										&& var131 <= var5 + 20) {
									Class41.method224();
									return;
								}

								var10 = Class6.anInt126 + 180 + 80;
								if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
										&& var131 <= var5 + 20) {
									Class6.aString133 = "";
									Class6.aString134 = "Enter your username/email & password.";
									Class6.aString135 = "";
									Class6.anInt116 = 2;
									Class6.anInt115 = 0;
									Class6.password = "";
								}

								while (Class58.method289(1912057832)) {
									var15 = false;

									for (var161 = 0; var161 < Class6.aString141.length(); var161++) {
										if (Class2.aChar80 == Class6.aString141.charAt(var161)) {
											var15 = true;
											break;
										}
									}

									if (Class5.anInt112 == 13) {
										Class6.aString133 = "";
										Class6.aString134 = "Enter your username/email & password.";
										Class6.aString135 = "";
										Class6.anInt116 = 2;
										Class6.anInt115 = 0;
										Class6.password = "";
									} else {
										if (Class5.anInt112 == 85 && Class6.username.length() > 0) {
											Class6.username = Class6.username.substring(0,
													Class6.username.length() - 1);
										}

										if (Class5.anInt112 == 84) {
											Class41.method224();
											return;
										}

										if (var15 && Class6.username.length() < 320) {
											Class6.username = Class6.username + Class2.aChar80;
										}
									}
								}
							} else if (Class6.anInt116 == 6) {
								while (true) {
									do {
										if (!Class58.method289(1992890020)) {
											var12 = 321;
											if (var6 == 1 && var131 >= var12 - 20 && var131 <= var12 + 20) {
												Class6.aString133 = "";
												Class6.aString134 = "Enter your username/email & password.";
												Class6.aString135 = "";
												Class6.anInt116 = 2;
												Class6.anInt115 = 0;
												Class6.password = "";
											}

											return;
										}
									} while (Class5.anInt112 != 84 && Class5.anInt112 != 13);

									Class6.aString133 = "";
									Class6.aString134 = "Enter your username/email & password.";
									Class6.aString135 = "";
									Class6.anInt116 = 2;
									Class6.anInt115 = 0;
									Class6.password = "";
								}
							}
						}
					} else {
						while (Class58.method289(2102970548)) {
							if (Class5.anInt112 == 84) {
								Class6.aString133 = "";
								Class6.aString134 = "Enter your username/email & password.";
								Class6.aString135 = "";
								Class6.anInt116 = 2;
								Class6.anInt115 = 0;
							} else if (Class5.anInt112 == 13) {
								Class6.anInt116 = 0;
							}
						}

						var10 = Class6.anInt126 + 180 - 80;
						var5 = 321;
						if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
								&& var131 <= var5 + 20) {
							Class6.aString133 = "";
							Class6.aString134 = "Enter your username/email & password.";
							Class6.aString135 = "";
							Class6.anInt116 = 2;
							Class6.anInt115 = 0;
						}

						var10 = Class6.anInt126 + 180 + 80;
						if (var6 == 1 && var121 >= var10 - 75 && var121 <= var10 + 75 && var131 >= var5 - 20
								&& var131 <= var5 + 20) {
							Class6.anInt116 = 0;
						}
					}
				}
			}
		}

	}

	int method128(int var1) {
		if (this.anIntArrayArray244 != null) {
			var1 = (int) ((long) this.anInt245 * (long) var1 / (long) this.anInt246);
		}

		return var1;
	}

	byte[] method129(byte[] var1) {
		if (this.anIntArrayArray244 != null) {
			int var9 = (int) ((long) var1.length * (long) this.anInt245 / (long) this.anInt246) + 14;
			int[] var8 = new int[var9];
			int var2 = 0;
			int var4 = 0;

			int var5;
			for (var5 = 0; var5 < var1.length; var5++) {
				byte var10 = var1[var5];
				int[] var7 = this.anIntArrayArray244[var4];

				int var3;
				for (var3 = 0; var3 < 14; var3++) {
					var8[var2 + var3] += var7[var3] * var10;
				}

				var4 += this.anInt245;
				var3 = var4 / this.anInt246;
				var2 += var3;
				var4 -= this.anInt246 * var3;
			}

			var1 = new byte[var9];

			for (var5 = 0; var5 < var9; var5++) {
				int var101 = var8[var5] + '\u8000' >> 16;
				if (var101 < -128) {
					var1[var5] = -128;
				} else if (var101 > 127) {
					var1[var5] = 127;
				} else {
					var1[var5] = (byte) var101;
				}
			}
		}

		return var1;
	}

	protected static final void method130() {
		IndexTable.dbImage = null;
		Class7.helveticaFont = null;
		IsaacRandom.helveticaMetrics = null;
	}

	int method131(int var1) {
		if (this.anIntArrayArray244 != null) {
			var1 = (int) ((long) this.anInt245 * (long) var1 / (long) this.anInt246) + 6;
		}

		return var1;
	}

}
