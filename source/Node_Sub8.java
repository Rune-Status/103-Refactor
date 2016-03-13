
public final class Node_Sub8 extends Node {

	int anInt1300;
	static int anInt1301;
	int anInt1302;
	int anInt1303;
	int anInt1304;
	int anInt1305;
	int anInt1306;
	int anInt1307;
	int anInt1308;
	static Picture[] aSpriteArray1309;
	int anInt1310 = 0;
	int anInt1311 = 622541955;
	int anInt1312;
	int anInt1313;
	static Sprite[] aDualNode_Sub13_Sub2Array1314;

	static final void method546(int var0, int var1) {
		if (-1361858763 * TileDecorationStub.chunkBaseX != var0 || var1 != Class90.chunkBaseY * 1249154187) {
			TileDecorationStub.chunkBaseX = var0 * 1071803165;
			Class90.chunkBaseY = var1 * -1066912989;
			method550(25);
			Class82.method363(GameStrings.aString852, true);
			int lastChunkX = 1426698711 * Node_Sub10.chunkLeftX;
			int lastChunkY = 714823515 * VarClientHub.chunkLeftY;
			Node_Sub10.chunkLeftX = (var0 - 6) * -1551462600;
			VarClientHub.chunkLeftY = (var1 - 6) * -190314856;
			int offsetX = 1426698711 * Node_Sub10.chunkLeftX - lastChunkX;
			int offsetY = 714823515 * VarClientHub.chunkLeftY - lastChunkY;
			lastChunkX = Node_Sub10.chunkLeftX * 1426698711;
			lastChunkY = 714823515 * VarClientHub.chunkLeftY;

			int var10;
			int var11;
			for (var10 = 0; var10 < '\u8000'; ++var10) {
				Npc var8 = Client.npcArray[var10];
				if (var8 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var8.anIntArray1945[var11] -= offsetX;
						var8.anIntArray1955[var11] -= offsetY;
					}

					var8.strictX -= offsetX * -715945088;
					var8.strictY -= offsetY * 1616412800;
				}
			}

			for (var10 = 0; var10 < 2048; ++var10) {
				Player var18 = Client.playerArray[var10];
				if (var18 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var18.anIntArray1945[var11] -= offsetX;
						var18.anIntArray1955[var11] -= offsetY;
					}

					var18.strictX -= offsetX * -715945088;
					var18.strictY -= 1616412800 * offsetY;
				}
			}

			byte var20 = 0;
			byte var19 = 104;
			byte var21 = 1;
			if (offsetX < 0) {
				var20 = 103;
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
			for (int var6 = var20; var19 != var6; var6 += var21) {
				for (var13 = var12; var15 != var13; var13 += var2) {
					int var4 = offsetX + var6;
					int var14 = offsetY + var13;

					for (int var16 = 0; var16 < 4; ++var16) {
						if (var4 >= 0 && var14 >= 0 && var4 < 104 && var14 < 104) {
							Client.groundItemDeque[var16][var6][var13] = Client.groundItemDeque[var16][var4][var14];
						} else {
							Client.groundItemDeque[var16][var6][var13] = null;
						}
					}
				}
			}

			for (Node_Sub8 var17 = (Node_Sub8) Client.aDeque2193
					.getFront(); var17 != null; var17 = (Node_Sub8) Client.aDeque2193.getNext()) {
				var17.anInt1300 -= offsetX * -2106367321;
				var17.anInt1312 -= offsetY * 1453500391;
				if (-1096801001 * var17.anInt1300 < 0 || var17.anInt1312 * -127960105 < 0
						|| var17.anInt1300 * -1096801001 >= 104 || var17.anInt1312 * -127960105 >= 104) {
					var17.unlink();
				}
			}

			if (Client.destinationX * -1712731251 != 0) {
				Client.destinationX -= offsetX * -1943900347;
				Client.destinationY -= 317027045 * offsetY;
			}

			Client.audioEffectCount = 0;
			Client.aBool2046 = false;
			Client.anInt2194 = -1008529911;
			Client.graphicsObjectDeque.method467();
			Client.projectileDeque.method467();

			for (var13 = 0; var13 < 4; ++var13) {
				Client.collisionMaps[var13].method244();
			}

		}
	}

	static final void method547(Widget widget, int var1, int var2, int var3) {
		Class34.method201();
		DualNode_Sub14 var6 = widget.method491(false);
		if (var6 != null) {
			RSGraphics.setDrawRegion(var1, var2, var1 + var6.anInt1647 * 662480183, var6.anInt1648 * -988977157 + var2);
			if (Client.anInt2200 * -1797803011 != 2 && Client.anInt2200 * -1797803011 != 5) {
				int var8 = -1916997753 * Client.minimapRotation + Client.minimapScale * -1718342721 & 2047;
				int var7 = 48 + 1272643751 * Class68.myPlayer.strictX / 32;
				int var14 = 464 - -1801433343 * Class68.myPlayer.strictY / 32;
				RuneScript.minimapSprite.method957(var1, var2, var6.anInt1647 * 662480183, var6.anInt1648 * -988977157,
						var7, var14, var8, -806982331 * Client.viewRotation + 256, var6.anIntArray1646,
						var6.anIntArray1645);

				int var4;
				int var9;
				int var10;
				for (var10 = 0; var10 < Client.anInt2195 * -706898549; ++var10) {
					var9 = 2 + Client.anIntArray2196[var10] * 4 - Class68.myPlayer.strictX * 1272643751 / 32;
					var4 = Client.anIntArray2197[var10] * 4 + 2 - -1801433343 * Class68.myPlayer.strictY / 32;
					Class51.drawDot(var1, var2, var9, var4, Client.aSpriteArray2198[var10], var6);
				}

				int var5;
				int var11;
				for (var10 = 0; var10 < 104; ++var10) {
					for (var9 = 0; var9 < 104; ++var9) {
						Deque deque = Client.groundItemDeque[InterfaceNode.floorLevel * -747958745][var10][var9];
						if (deque != null) {
							var5 = 4 * var10 + 2 - Class68.myPlayer.strictX * 1272643751 / 32;
							var11 = 2 + var9 * 4 - Class68.myPlayer.strictY * -1801433343 / 32;
							Class51.drawDot(var1, var2, var5, var11, Parameters.mapDots[0], var6);
						}
					}
				}

				for (var10 = 0; var10 < Client.anInt2225 * 727116725; ++var10) {
					Npc npc = Client.npcArray[Client.npcIndices[var10]];
					if (npc != null && npc.hasConfig()) {
						NpcType type = npc.type;
						if (type != null && type.transformIds != null) {
							type = type.transform();
						}

						if (type != null && type.aBool1593 && type.aBool1602) {
							var5 = npc.strictX * 1272643751 / 32 - Class68.myPlayer.strictX * 1272643751 / 32;
							var11 = -1801433343 * npc.strictY / 32 - -1801433343 * Class68.myPlayer.strictY / 32;
							Class51.drawDot(var1, var2, var5, var11, Parameters.mapDots[1], var6);
						}
					}
				}

				var10 = -334270159 * GPI.localPlayerCount;
				int[] var23 = GPI.localPlayerIndices;

				for (var4 = 0; var4 < var10; ++var4) {
					Player player = Client.playerArray[var23[var4]];
					if (player != null && player.hasConfig() && !player.hidden && player != Class68.myPlayer) {
						var11 = 1272643751 * player.strictX / 32 - 1272643751 * Class68.myPlayer.strictX / 32;
						int var16 = -1801433343 * player.strictY / 32 - -1801433343 * Class68.myPlayer.strictY / 32;

						boolean isFriend = false;
						if (AnimationSkin.isFriended(player.name, true)) {
							isFriend = true;
						}

						boolean isClanMate = false;
						for (int var13 = 0; var13 < -1304125287 * Class86.clanChatSize; ++var13) {
							if (player.name.equals(InterfaceNode.clanMates[var13].displayName)) {
								isClanMate = true;
								break;
							}
						}

						boolean isTeam = false;
						if (-103629189 * Class68.myPlayer.team != 0 && player.team * -103629189 != 0
								&& player.team * -103629189 == -103629189 * Class68.myPlayer.team) {
							isTeam = true;
						}

						if (isFriend) {
							Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[3], var6);
						} else if (isTeam) {
							Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[4], var6);
						} else if (isClanMate) {
							Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[5], var6);
						} else {
							Class51.drawDot(var1, var2, var11, var16, Parameters.mapDots[2], var6);
						}
					}
				}

				if (Client.anInt2075 * 314519437 != 0 && -1040073859 * Client.engineCycle % 20 < 10) {
					if (314519437 * Client.anInt2075 == 1 && Client.anInt2021 * 1583399955 >= 0
							&& 1583399955 * Client.anInt2021 < Client.npcArray.length) {
						Npc var20 = Client.npcArray[Client.anInt2021 * 1583399955];
						if (var20 != null) {
							var5 = 1272643751 * var20.strictX / 32 - 1272643751 * Class68.myPlayer.strictX / 32;
							var11 = -1801433343 * var20.strictY / 32 - Class68.myPlayer.strictY * -1801433343 / 32;
							Class7.method77(var1, var2, var5, var11, Class72.aSpriteArray604[1], var6);
						}
					}

					if (314519437 * Client.anInt2075 == 2) {
						var4 = 2 + (-751140636 * Client.hintArrowX - 1411827548 * Node_Sub10.chunkLeftX)
								- 1272643751 * Class68.myPlayer.strictX / 32;
						var5 = 2 + (Client.hintArrowY * 985346372 - VarClientHub.chunkLeftY * -1435673236)
								- Class68.myPlayer.strictY * -1801433343 / 32;
						Class7.method77(var1, var2, var4, var5, Class72.aSpriteArray604[1], var6);
					}

					if (Client.anInt2075 * 314519437 == 10 && Client.anInt2158 * 1613691605 >= 0
							&& Client.anInt2158 * 1613691605 < Client.playerArray.length) {
						Player var21 = Client.playerArray[Client.anInt2158 * 1613691605];
						if (var21 != null) {
							var5 = var21.strictX * 1272643751 / 32 - Class68.myPlayer.strictX * 1272643751 / 32;
							var11 = -1801433343 * var21.strictY / 32 - -1801433343 * Class68.myPlayer.strictY / 32;
							Class7.method77(var1, var2, var5, var11, Class72.aSpriteArray604[1], var6);
						}
					}
				}

				if (Client.destinationX * -1712731251 != 0) {
					var4 = 2 + 1739009588 * Client.destinationX - 1272643751 * Class68.myPlayer.strictX / 32;
					var5 = 2 + 1530391476 * Client.destinationY - Class68.myPlayer.strictY * -1801433343 / 32;
					Class51.drawDot(var1, var2, var4, var5, Class72.aSpriteArray604[0], var6);
				}

				if (!Class68.myPlayer.hidden) {
					RSGraphics.method793(var6.anInt1647 * 662480183 / 2 + var1 - 1,
							var2 + -988977157 * var6.anInt1648 / 2 - 1, 3, 3, 16777215);
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
		VarPlayerType.anInt1547 = VarPlayerType.varplayer_ref.fileCount(16) * 1942513075;
	}

	static void method550(int var0) {
		if (846055547 * Client.anInt2113 != var0) {
			if (846055547 * Client.anInt2113 == 0) {
				Class16.method130();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.connectionState = 0;
				Client.anInt2180 = 0;
				Client.anInt2037 = 0;
			}

			if (var0 != 20 && var0 != 40 && Class35.aClass60_394 != null) {
				Class35.aClass60_394.shutdown();
				Class35.aClass60_394 = null;
			}

			if (Client.anInt2113 * 846055547 == 25) {
				Client.anInt2130 = 0;
				Client.anInt2120 = 0;
				Client.anInt2140 = 1739605141;
				Client.anInt2049 = 0;
				Client.anInt2027 = 550236941;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					DynamicObject.method1022(LandscapeTile.gameCanvas, Class40.binaryIndex, AnimationSkin.spritesIndex,
							true, 846055547 * Client.anInt2113 == 11 ? 4 : 0);
				} else if (var0 == 11) {
					DynamicObject.method1022(LandscapeTile.gameCanvas, Class40.binaryIndex, AnimationSkin.spritesIndex,
							false, 4);
				} else if (Class6.aBool142) {
					Class6.titleboxSprite = null;
					Class6.titlebuttonSprite = null;
					Class6.runesSprite = null;
					Class56.aSprite542 = null;
					Class6.aSprite137 = null;
					IgnoredPlayer.logoSprite = null;
					FriendedPlayer.titlemuteSprite = null;
					Class6.radioButtons0Sprite = null;
					Class6.radioButtons2Sprite = null;
					Class93.aSpriteArray733 = null;
					Class2.aDualNode_Sub13_Sub2Array78 = null;
					Class32.aDualNode_Sub13_Sub2Array357 = null;
					aDualNode_Sub13_Sub2Array1314 = null;
					GroundItem.aDualNode_Sub13_Sub2_1841 = null;
					TileDecorationStub.anIntArray841 = null;
					Class118.anIntArray803 = null;
					Class6.anIntArray125 = null;
					Class6.anIntArray124 = null;
					Class33.anIntArray365 = null;
					Permission.anIntArray605 = null;
					Class122.anIntArray818 = null;
					Class4.anIntArray110 = null;
					Class65.method320(2);
					ScriptEvent.sendConInfo(true);
					Class6.aBool142 = false;
				}
			} else {
				DynamicObject.method1022(LandscapeTile.gameCanvas, Class40.binaryIndex, AnimationSkin.spritesIndex, true,
						0);
			}

			Client.anInt2113 = -317532493 * var0;
		}
	}

	static String method551(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			int var2;
			for (var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var6 = var0.substring(0, var3);
					int var4 = Class117.method442(var1, var2 - 1);
					String var5;
					if (var4 >= 999999999) {
						var5 = "*";
					} else {
						var5 = Integer.toString(var4);
					}

					var0 = var6 + var5 + var0.substring(2 + var3);
				}
			}

			while (true) {
				var2 = var0.indexOf("%dns");
				if (var2 == -1) {
					break;
				}

				String var7 = "";
				if (ConsumingImageProducer.aClass61_1215 != null) {
					var7 = TaskManager.method315(ConsumingImageProducer.aClass61_1215.stack);
					if (ConsumingImageProducer.aClass61_1215.value != null) {
						var7 = (String) ConsumingImageProducer.aClass61_1215.value;
					}
				}

				var0 = var0.substring(0, var2) + var7 + var0.substring(var2 + 4);
			}
		}

		return var0;
	}
}
