public final class Node_Sub8 extends Node {

	static int anInt1301;
	int anInt1302;
	int anInt1303;
	int anInt1304;
	int anInt1305;
	int anInt1306;
	int anInt1307;
	int anInt1308;
	static Picture[] mapfunctions;
	int anInt1313;
	int anInt1310 = 0;
	int anInt1311 = -1;
	int anInt1300;
	int anInt1312;
	static Sprite[] aDualNode_Sub13_Sub2Array1314;

	static final void method546(int var0, int var1) {
		if (TileDecorationStub.chunkBaseX != var0 || Class90.chunkBaseY != var1) {
			TileDecorationStub.chunkBaseX = var0;
			Class90.chunkBaseY = var1;
			setClientState(25);
			Class82.method363("Loading - please wait.", true);
			int lastChunkX = MachineInfo.chunkLeftX;
			int lastChunkY = VarClientHub.chunkLeftY;
			MachineInfo.chunkLeftX = (var0 - 6) * 8;
			VarClientHub.chunkLeftY = (var1 - 6) * 8;
			int offsetX = MachineInfo.chunkLeftX - lastChunkX;
			int offsetY = VarClientHub.chunkLeftY - lastChunkY;
			lastChunkX = MachineInfo.chunkLeftX;
			lastChunkY = VarClientHub.chunkLeftY;

			int var10;
			int var11;
			for (var10 = 0; var10 < '\u8000'; var10++) {
				Npc var20 = Client.npcArray[var10];
				if (var20 != null) {
					for (var11 = 0; var11 < 10; var11++) {
						var20.anIntArray1945[var11] -= offsetX;
						var20.anIntArray1955[var11] -= offsetY;
					}

					var20.strictX -= offsetX * 128;
					var20.strictY -= offsetY * 128;
				}
			}

			for (var10 = 0; var10 < 2048; var10++) {
				Player var191 = Client.playerArray[var10];
				if (var191 != null) {
					for (var11 = 0; var11 < 10; var11++) {
						var191.anIntArray1945[var11] -= offsetX;
						var191.anIntArray1955[var11] -= offsetY;
					}

					var191.strictX -= offsetX * 128;
					var191.strictY -= offsetY * 128;
				}
			}

			byte var201 = 0;
			byte var19 = 104;
			byte var21 = 1;
			if (offsetX < 0) {
				var201 = 103;
				var19 = -1;
				var21 = -1;
			}

			byte var12 = 0;
			byte var15 = 104;
			byte var2 = 1;
			if (offsetY < 0) {
				var12 = 103;
				var15 = -1;
				var2 = -1;
			}

			int var13;
			for (int var17 = var201; var19 != var17; var17 += var21) {
				for (var13 = var12; var15 != var13; var13 += var2) {
					int var4 = offsetX + var17;
					int var14 = offsetY + var13;

					for (int var16 = 0; var16 < 4; var16++) {
						if (var4 >= 0 && var14 >= 0 && var4 < 104 && var14 < 104) {
							Client.groundItemDeque[var16][var17][var13] = Client.groundItemDeque[var16][var4][var14];
						} else {
							Client.groundItemDeque[var16][var17][var13] = null;
						}
					}
				}
			}

			for (Node_Sub8 var211 = (Node_Sub8) Client.aDeque2193
					.getFront(); var211 != null; var211 = (Node_Sub8) Client.aDeque2193.getNext()) {
				var211.anInt1300 -= offsetX;
				var211.anInt1312 -= offsetY;
				if (var211.anInt1300 < 0 || var211.anInt1312 < 0 || var211.anInt1300 >= 104
						|| var211.anInt1312 >= 104) {
					var211.unlink();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= offsetX;
				Client.destinationY -= offsetY;
			}

			Client.audioEffectCount = 0;
			Client.aBool2046 = false;
			Client.anInt2194 = -1;
			Client.graphicsObjectDeque.method467();
			Client.projectileDeque.method467();

			for (var13 = 0; var13 < 4; var13++) {
				Client.collisionMaps[var13].method244();
			}
		}

	}

	static final void method547(Widget widget, int var1, int var2, int var3) {
		Class34.method201();
		DualNode_Sub14 var6 = widget.method491(false);
		if (var6 != null) {
			RSGraphics.setDrawRegion(var1, var2, var6.anInt1647 + var1, var6.anInt1648 + var2);
			if (Client.anInt2200 != 2 && Client.anInt2200 != 5) {
				int var8 = Client.minimapRotation + Client.minimapScale & 0x7ff;
				int var7 = Class68.myPlayer.strictX / 32 + 48;
				int var14 = 464 - Class68.myPlayer.strictY / 32;
				RuneScript.minimapSprite.method957(var1, var2, var6.anInt1647, var6.anInt1648, var7, var14, var8,
						Client.viewRotation + 256, var6.anIntArray1646, var6.anIntArray1645);

				int var4;
				int var9;
				int var10;
				for (var10 = 0; var10 < Client.anInt2195; var10++) {
					var9 = Client.anIntArray2196[var10] * 4 + 2 - Class68.myPlayer.strictX / 32;
					var4 = Client.anIntArray2197[var10] * 4 + 2 - Class68.myPlayer.strictY / 32;
					Class51.drawDot(var1, var2, var9, var4, Client.aSpriteArray2198[var10], var6);
				}

				var10 = 0;

				while (true) {
					int var5;
					int var11;
					if (var10 >= 104) {
						for (var10 = 0; var10 < Client.anInt2225; var10++) {
							Npc var19 = Client.npcArray[Client.npcIndices[var10]];
							if (var19 != null && var19.hasConfig()) {
								NpcType var21 = var19.type;
								if (var21 != null && var21.transformIds != null) {
									var21 = var21.transform();
								}

								if (var21 != null && var21.aBool1593 && var21.aBool1602) {
									var5 = var19.strictX / 32 - Class68.myPlayer.strictX / 32;
									var11 = var19.strictY / 32 - Class68.myPlayer.strictY / 32;
									Class51.drawDot(var1, var2, var5, var11, Parameters.mapDots[1], var6);
								}
							}
						}

						var10 = GPI.localPlayerCount;
						int[] var20 = GPI.localPlayerIndices;

						Player var211;
						for (var4 = 0; var4 < var10; var4++) {
							var211 = Client.playerArray[var20[var4]];
							if (var211 != null && var211.hasConfig() && !var211.hidden && Class68.myPlayer != var211) {
								var11 = var211.strictX / 32 - Class68.myPlayer.strictX / 32;
								int var16 = var211.strictY / 32 - Class68.myPlayer.strictY / 32;
								boolean isFriend = false;
								if (AnimationSkin.isFriended(var211.name, true)) {
									isFriend = true;
								}

								boolean isClanMate = false;

								for (int isTeam = 0; isTeam < Class86.clanChatSize; isTeam++) {
									if (var211.name.equals(InterfaceNode.clanMates[isTeam].displayName)) {
										isClanMate = true;
										break;
									}
								}

								boolean var231 = false;
								if (Class68.myPlayer.team != 0 && var211.team != 0
										&& var211.team == Class68.myPlayer.team) {
									var231 = true;
								}

								if (isFriend) {
									Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[3], var6);
								} else if (var231) {
									Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[4], var6);
								} else if (isClanMate) {
									Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[5], var6);
								} else {
									Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[2], var6);
								}
							}
						}

						if (Client.anInt2075 != 0 && Client.engineCycle % 20 < 10) {
							if (Client.anInt2075 == 1 && Client.anInt2021 >= 0
									&& Client.anInt2021 < Client.npcArray.length) {
								Npc var22 = Client.npcArray[Client.anInt2021];
								if (var22 != null) {
									var5 = var22.strictX / 32 - Class68.myPlayer.strictX / 32;
									var11 = var22.strictY / 32 - Class68.myPlayer.strictY / 32;
									Class7.method77(var1, var2, var5, var11, Class72.mapmarker[1], var6);
								}
							}

							if (Client.anInt2075 == 2) {
								var4 = Client.hintArrowX * 4 - MachineInfo.chunkLeftX * 4 + 2
										- Class68.myPlayer.strictX / 32;
								var5 = Client.hintArrowY * 4 - VarClientHub.chunkLeftY * 4 + 2
										- Class68.myPlayer.strictY / 32;
								Class7.method77(var1, var2, var4, var5, Class72.mapmarker[1], var6);
							}

							if (Client.anInt2075 == 10 && Client.anInt2158 >= 0
									&& Client.anInt2158 < Client.playerArray.length) {
								var211 = Client.playerArray[Client.anInt2158];
								if (var211 != null) {
									var5 = var211.strictX / 32 - Class68.myPlayer.strictX / 32;
									var11 = var211.strictY / 32 - Class68.myPlayer.strictY / 32;
									Class7.method77(var1, var2, var5, var11, Class72.mapmarker[1], var6);
								}
							}
						}

						if (Client.destinationX != 0) {
							var4 = Client.destinationX * 4 + 2 - Class68.myPlayer.strictX / 32;
							var5 = Client.destinationY * 4 + 2 - Class68.myPlayer.strictY / 32;
							Class51.drawDot(var1, var2, var4, var5, Class72.mapmarker[0], var6);
						}

						if (!Class68.myPlayer.hidden) {
							RSGraphics.method793(var6.anInt1647 / 2 + var1 - 1, var6.anInt1648 / 2 + var2 - 1, 3, 3,
									16777215);
						}
						break;
					}

					for (var9 = 0; var9 < 104; var9++) {
						Deque var23 = Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var10][var9];
						if (var23 != null) {
							var5 = var10 * 4 + 2 - Class68.myPlayer.strictX / 32;
							var11 = var9 * 4 + 2 - Class68.myPlayer.strictY / 32;
							Class51.drawDot(var1, var2, var5, var11, Parameters.mapDots[0], var6);
						}
					}

					++var10;
				}
			} else {
				RSGraphics.method792(var1, var2, 0, var6.anIntArray1646, var6.anIntArray1645);
			}

			Client.aBoolArray2171[var3] = true;
		}

	}

	static int method548(AbstractIndex var0, AbstractIndex var1) {
		int var2 = 0;
		if (var0.method385("title.jpg", "")) {
			++var2;
		}

		if (var1.method385("logo", "")) {
			++var2;
		}

		if (var1.method385("logo_deadman_mode", "")) {
			++var2;
		}

		if (var1.method385("titlebox", "")) {
			++var2;
		}

		if (var1.method385("titlebutton", "")) {
			++var2;
		}

		if (var1.method385("runes", "")) {
			++var2;
		}

		if (var1.method385("title_mute", "")) {
			++var2;
		}

		if (var1.method386("options_radio_buttons,0")) {
			++var2;
		}

		if (var1.method386("options_radio_buttons,2")) {
			++var2;
		}

		var1.method385("sl_back", "");
		var1.method385("sl_flags", "");
		var1.method385("sl_arrows", "");
		var1.method385("sl_stars", "");
		var1.method385("sl_button", "");
		return var2;
	}

	public static void method549(AbstractIndex var0) {
		VarPlayerType.varplayer_ref = var0;
		VarPlayerType.anInt1547 = VarPlayerType.varplayer_ref.fileCount(16);
	}

	static void setClientState(int state) {
		if (Client.clientState != state) {
			if (Client.clientState == 0) {
				Class16.method130();
			}

			if (state == 20 || state == 40 || state == 45) {
				Client.connectionState = 0;
				Client.anInt2180 = 0;
				Client.anInt2037 = 0;
			}

			if (state != 20 && state != 40 && Class35.aClass60_394 != null) {
				Class35.aClass60_394.shutdown();
				Class35.aClass60_394 = null;
			}

			if (Client.clientState == 25) {
				Client.anInt2130 = 0;
				Client.anInt2120 = 0;
				Client.anInt2140 = 1;
				Client.anInt2049 = 0;
				Client.anInt2027 = 1;
			}

			if (state != 5 && state != 10) {
				if (state == 20) {
					DynamicObject.method1022(LandscapeTile.gameCanvas, Class40.binaryIndex, AnimationSkin.spritesIndex,
							true, Client.clientState == 11 ? 4 : 0);
				} else if (state == 11) {
					DynamicObject.method1022(LandscapeTile.gameCanvas, Class40.binaryIndex, AnimationSkin.spritesIndex,
							false, 4);
				} else if (PlayerLoginDetails.titleScreenState) {
					PlayerLoginDetails.titleboxSprite = null;
					PlayerLoginDetails.titlebuttonSprite = null;
					PlayerLoginDetails.runesSprite = null;
					Class56.aSprite542 = null;
					PlayerLoginDetails.aSprite137 = null;
					IgnoredPlayer.logoSprite = null;
					FriendedPlayer.titlemuteSprite = null;
					PlayerLoginDetails.radioButtons0Sprite = null;
					PlayerLoginDetails.radioButtons2Sprite = null;
					Class93.aSpriteArray733 = null;
					Class2.aDualNode_Sub13_Sub2Array78 = null;
					Class32.aDualNode_Sub13_Sub2Array357 = null;
					aDualNode_Sub13_Sub2Array1314 = null;
					GroundItem.aDualNode_Sub13_Sub2_1841 = null;
					TileDecorationStub.anIntArray841 = null;
					Class118.anIntArray803 = null;
					PlayerLoginDetails.anIntArray125 = null;
					PlayerLoginDetails.anIntArray124 = null;
					CalledScript.anIntArray365 = null;
					Permission.anIntArray605 = null;
					Class122.anIntArray818 = null;
					Class4.anIntArray110 = null;
					Class65.method320(2);
					ScriptEvent.sendConInfo(true);
					PlayerLoginDetails.titleScreenState = false;
				}
			} else {
				DynamicObject.method1022(LandscapeTile.gameCanvas, Class40.binaryIndex, AnimationSkin.spritesIndex,
						true, 0);
			}

			Client.clientState = state;
		}

	}

	static String method551(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			int var2;
			for (var2 = 1; var2 <= 5; var2++) {
				while (true) {
					int var7 = var0.indexOf("%" + var2);
					if (var7 == -1) {
						break;
					}

					String var6 = var0.substring(0, var7);
					int var4 = InterfaceScripts.method442(var1, var2 - 1);
					String var5;
					if (var4 >= 999999999) {
						var5 = "*";
					} else {
						var5 = Integer.toString(var4);
					}

					var0 = var6 + var5 + var0.substring(var7 + 2);
				}
			}

			while (true) {
				var2 = var0.indexOf("%dns");
				if (var2 == -1) {
					break;
				}

				String var71 = "";
				if (ConsumingImageProducer.aClass61_1215 != null) {
					var71 = TaskManager.method315(ConsumingImageProducer.aClass61_1215.stack);
					if (ConsumingImageProducer.aClass61_1215.value != null) {
						var71 = (String) ConsumingImageProducer.aClass61_1215.value;
					}
				}

				var0 = var0.substring(0, var2) + var71 + var0.substring(var2 + 4);
			}
		}

		return var0;
	}

}
