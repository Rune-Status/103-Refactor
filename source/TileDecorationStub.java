
public final class TileDecorationStub {

	int strictX;
	static Widget aWidget838;
	int strictY;
	public Entity entity;
	public int anInt839;
	int config;
	int height;
	static int anInt840;
	static int[] anIntArray841;

	static final void method462(int var0, int var1, int var2, int var3) {
		if (-1110581093 * Client.itemSelectionStatus == 0 && !Client.spellSelected) {
			FriendedPlayer.addMenuRow(GameStrings.aString998, "", 23, 0, var0 - var2, var1 - var3);
		}

		int var5 = -1;
		int var4 = -1;

		int var7;
		int var8;
		for (var7 = 0; var7 < Model.onCursorCount; ++var7) {
			var8 = Model.onCursorUids[var7];
			int var9 = var8 & 127;
			int var10 = var8 >> 7 & 127;
			int var16 = var8 >> 29 & 3;
			int var17 = var8 >> 14 & 32767;
			if (var8 != var4) {
				var4 = var8;
				if (var16 == 2 && InterfaceNode.landscape.method34(-747958745 * InterfaceNode.floorLevel, var9, var10,
						var8) >= 0) {
					ObjectDefinition var11 = Class37.getObjectDefinition(var17);
					if (var11.transformIds != null) {
						var11 = var11.transform();
					}

					if (var11 == null) {
						continue;
					}

					if (-1110581093 * Client.itemSelectionStatus == 1) {
						FriendedPlayer.addMenuRow(GameStrings.aString993, Client.selectedItemName + " "
								+ Class35.aString391 + " " + Class48_Sub1.method545('\uffff') + var11.name, 1, var8,
								var9, var10);
					} else if (Client.spellSelected) {
						if ((Class31.currentSpellTargets * 2016481409 & 4) == 4) {
							FriendedPlayer
									.addMenuRow(Client.menuActionPrefix,
											Client.selectedSpellName + " " + Class35.aString391 + " "
													+ Class48_Sub1.method545('\uffff') + var11.name,
											2, var8, var9, var10);
						}
					} else {
						String[] var12 = var11.actions;
						if (Client.aBool2139) {
							var12 = GameCanvas.method885(var12);
						}

						if (var12 != null) {
							for (int var6 = 4; var6 >= 0; --var6) {
								if (var12[var6] != null) {
									short var13 = 0;
									if (var6 == 0) {
										var13 = 3;
									}

									if (var6 == 1) {
										var13 = 4;
									}

									if (var6 == 2) {
										var13 = 5;
									}

									if (var6 == 3) {
										var13 = 6;
									}

									if (var6 == 4) {
										var13 = 1001;
									}

									FriendedPlayer.addMenuRow(var12[var6],
											Class48_Sub1.method545('\uffff') + var11.name, var13, var8, var9, var10);
								}
							}
						}

						FriendedPlayer.addMenuRow(GameStrings.aString994, Class48_Sub1.method545('\uffff') + var11.name,
								1002, var11.anInt1718 * -521826339 << 14, var9, var10);
					}
				}

				Player var15;
				Npc var18;
				int[] var19;
				int var25;
				int var27;
				if (var16 == 1) {
					Npc var22 = Client.npcArray[var17];
					if (var22 == null) {
						continue;
					}

					if (var22.definition.anInt1589 * -691506967 == 1 && (var22.strictX * 1272643751 & 127) == 64
							&& (-1801433343 * var22.strictY & 127) == 64) {
						for (var25 = 0; var25 < Client.anInt2225 * 727116725; ++var25) {
							var18 = Client.npcArray[Client.npcIndices[var25]];
							if (var18 != null && var18 != var22 && -691506967 * var18.definition.anInt1589 == 1
									&& 1272643751 * var22.strictX == 1272643751 * var18.strictX
									&& var18.strictY * -1801433343 == -1801433343 * var22.strictY) {
								Class39.method219(var18.definition, Client.npcIndices[var25], var9, var10);
							}
						}

						var25 = GPI.localPlayerCount * -334270159;
						var19 = GPI.localPlayerIndices;

						for (var27 = 0; var27 < var25; ++var27) {
							var15 = Client.playerArray[var19[var27]];
							if (var15 != null && var22.strictX * 1272643751 == var15.strictX * 1272643751
									&& var22.strictY * -1801433343 == var15.strictY * -1801433343) {
								Class20.method143(var15, var19[var27], var9, var10);
							}
						}
					}

					Class39.method219(var22.definition, var17, var9, var10);
				}

				if (var16 == 0) {
					Player var23 = Client.playerArray[var17];
					if (var23 == null) {
						continue;
					}

					if ((1272643751 * var23.strictX & 127) == 64 && (var23.strictY * -1801433343 & 127) == 64) {
						for (var25 = 0; var25 < 727116725 * Client.anInt2225; ++var25) {
							var18 = Client.npcArray[Client.npcIndices[var25]];
							if (var18 != null && -691506967 * var18.definition.anInt1589 == 1
									&& var23.strictX * 1272643751 == var18.strictX * 1272643751
									&& var23.strictY * -1801433343 == -1801433343 * var18.strictY) {
								Class39.method219(var18.definition, Client.npcIndices[var25], var9, var10);
							}
						}

						var25 = GPI.localPlayerCount * -334270159;
						var19 = GPI.localPlayerIndices;

						for (var27 = 0; var27 < var25; ++var27) {
							var15 = Client.playerArray[var19[var27]];
							if (var15 != null && var23 != var15
									&& 1272643751 * var15.strictX == 1272643751 * var23.strictX
									&& -1801433343 * var15.strictY == var23.strictY * -1801433343) {
								Class20.method143(var15, var19[var27], var9, var10);
							}
						}
					}

					if (var17 != Client.anInt2111 * 971766913) {
						Class20.method143(var23, var17, var9, var10);
					} else {
						var5 = var8;
					}
				}

				if (var16 == 3) {
					Deque var24 = Client.groundItemDeque[-747958745 * InterfaceNode.floorLevel][var9][var10];
					if (var24 != null) {
						for (GroundItem var26 = (GroundItem) var24
								.method472(); var26 != null; var26 = (GroundItem) var24.method476()) {
							ItemDefinition var20 = FriendedPlayer.getItemDefinition(var26.anInt1842 * -848428919);
							if (Client.itemSelectionStatus * -1110581093 == 1) {
								FriendedPlayer.addMenuRow(GameStrings.aString993,
										Client.selectedItemName + " " + Class35.aString391 + " "
												+ Class48_Sub1.method545(16748608) + var20.name,
										16, -848428919 * var26.anInt1842, var9, var10);
							} else if (Client.spellSelected) {
								if ((Class31.currentSpellTargets * 2016481409 & 1) == 1) {
									FriendedPlayer.addMenuRow(Client.menuActionPrefix,
											Client.selectedSpellName + " " + Class35.aString391 + " "
													+ Class48_Sub1.method545(16748608) + var20.name,
											17, var26.anInt1842 * -848428919, var9, var10);
								}
							} else {
								String[] var29 = var20.groundActions;
								if (Client.aBool2139) {
									var29 = GameCanvas.method885(var29);
								}

								for (int var28 = 4; var28 >= 0; --var28) {
									if (var29 != null && var29[var28] != null) {
										byte var14 = 0;
										if (var28 == 0) {
											var14 = 18;
										}

										if (var28 == 1) {
											var14 = 19;
										}

										if (var28 == 2) {
											var14 = 20;
										}

										if (var28 == 3) {
											var14 = 21;
										}

										if (var28 == 4) {
											var14 = 22;
										}

										FriendedPlayer.addMenuRow(var29[var28],
												Class48_Sub1.method545(16748608) + var20.name, var14,
												-848428919 * var26.anInt1842, var9, var10);
									} else if (var28 == 2) {
										FriendedPlayer.addMenuRow(GameStrings.aString1084,
												Class48_Sub1.method545(16748608) + var20.name, 20,
												-848428919 * var26.anInt1842, var9, var10);
									}
								}

								FriendedPlayer.addMenuRow(GameStrings.aString994,
										Class48_Sub1.method545(16748608) + var20.name, 1004,
										var26.anInt1842 * -848428919, var9, var10);
							}
						}
					}
				}
			}
		}

		if (var5 != -1) {
			var7 = var5 & 127;
			var8 = var5 >> 7 & 127;
			Player var21 = Client.playerArray[971766913 * Client.anInt2111];
			Class20.method143(var21, Client.anInt2111 * 971766913, var7, var8);
		}

	}

	static final void method463(Widget var0) {
		int var1 = -179718399 * var0.contentType;
		if (var1 == 324) {
			if (Client.anInt2230 * 986088359 == -1) {
				Client.anInt2230 = var0.textureId * -302180863;
				Client.anInt2077 = -953380781 * var0.anInt1143;
			}

			if (Client.aPlayerConfig2138.female) {
				var0.textureId = -135861759 * Client.anInt2230;
			} else {
				var0.textureId = Client.anInt2077 * 1903638949;
			}

		} else if (var1 != 325) {
			if (var1 == 327) {
				var0.rotationX = -532702102;
				var0.rotationZ = ((int) (Math.sin((double) (-1040073859 * Client.engineCycle) / 40.0D) * 256.0D) & 2047)
						* -478470667;
				var0.modelType = -1882303535;
				var0.modelId = 0;
			} else if (var1 == 328) {
				var0.rotationX = -532702102;
				var0.rotationZ = ((int) (Math.sin((double) (Client.engineCycle * -1040073859) / 40.0D) * 256.0D) & 2047)
						* -478470667;
				var0.modelType = -1882303535;
				var0.modelId = -541123263;
			}
		} else {
			if (Client.anInt2230 * 986088359 == -1) {
				Client.anInt2230 = var0.textureId * -302180863;
				Client.anInt2077 = var0.anInt1143 * -953380781;
			}

			if (Client.aPlayerConfig2138.female) {
				var0.textureId = Client.anInt2077 * 1903638949;
			} else {
				var0.textureId = Client.anInt2230 * -135861759;
			}

		}
	}

	public static int method464(String var0) {
		return var0.length() + 1;
	}

}
