public final class BoundaryDecorationStub {

	int orientationB;
	int height;
	int regionY;
	public Entity entityA;
	public Entity entityB;
	int insetX;
	int insetY;
	static int anInt216;
	static String[] cacheLocations;
	int regionX;
	int orientationA;
	public int bitset = 0;
	int config = 0;

	static final void loadLocations(byte[] bytes, int x, int y, Landscape land, CollisionMap[] maps) {
		ByteBuf buf = new ByteBuf(bytes);
		int id = -1;

		while (true) {
			int idOffset = buf.getUSmart();
			if (idOffset == 0) {
				return;
			}

			id += idOffset;
			int position = 0;

			while (true) {
				int positionOffset = buf.getUSmart();
				if (positionOffset == 0) {
					break;
				}

				position += positionOffset - 1;
				int localY = position & 0x3f;
				int localX = position >> 6 & 0x3f;
				int height = position >> 12;
				int attributes = buf.getUByte();
				int type = attributes >> 2;
				int orientation = attributes & 0x3;
				int xOffset = localX + x;
				int yOffset = y + localY;
				if (xOffset > 0 && yOffset > 0 && xOffset < 103 && yOffset < 103) {
					int plane = height;
					if ((Scene.renderFlags[1][xOffset][yOffset] & 0x2) == 2) {
						plane = height - 1;
					}

					CollisionMap map = null;
					if (plane >= 0) {
						map = maps[plane];
					}

					ScriptEvent.addObject(height, xOffset, yOffset, id, orientation, type, land, map);
				}
			}
		}
	}

	static void method107(GameEngine var0) {
		if (MouseInput.anInt627 == 1 || !ClanMate.aBool1221 && MouseInput.anInt627 == 4) {
			int var2 = PlayerLoginDetails.anInt132 + 280;
			if (MouseInput.anInt628 >= var2 && MouseInput.anInt628 <= var2 + 14 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(0, 0);
				return;
			}

			if (MouseInput.anInt628 >= var2 + 15 && MouseInput.anInt628 <= var2 + 80 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(0, 1);
				return;
			}

			int var3 = PlayerLoginDetails.anInt132 + 390;
			if (MouseInput.anInt628 >= var3 && MouseInput.anInt628 <= var3 + 14 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(1, 0);
				return;
			}

			if (MouseInput.anInt628 >= var3 + 15 && MouseInput.anInt628 <= var3 + 80 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(1, 1);
				return;
			}

			int var1 = PlayerLoginDetails.anInt132 + 500;
			if (MouseInput.anInt628 >= var1 && MouseInput.anInt628 <= var1 + 14 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(2, 0);
				return;
			}

			if (MouseInput.anInt628 >= var1 + 15 && MouseInput.anInt628 <= var1 + 80 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(2, 1);
				return;
			}

			int var4 = PlayerLoginDetails.anInt132 + 610;
			if (MouseInput.anInt628 >= var4 && MouseInput.anInt628 <= var4 + 14 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(3, 0);
				return;
			}

			if (MouseInput.anInt628 >= var4 + 15 && MouseInput.anInt628 <= var4 + 80 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt629 <= 18) {
				UnderlayType.method704(3, 1);
				return;
			}

			if (MouseInput.anInt628 >= PlayerLoginDetails.anInt132 + 708 && MouseInput.anInt629 >= 4
					&& MouseInput.anInt628 <= PlayerLoginDetails.anInt132 + 708 + 50 && MouseInput.anInt629 <= 20) {
				PlayerLoginDetails.loadedWorlds = false;
				Class56.aSprite542.method958(PlayerLoginDetails.anInt132, 0);
				PlayerLoginDetails.aSprite137.method958(PlayerLoginDetails.anInt132 + 382, 0);
				IgnoredPlayer.logoSprite.method929(PlayerLoginDetails.anInt132 + 382 - IgnoredPlayer.logoSprite.subWidth / 2, 18);
				return;
			}

			if (PlayerLoginDetails.anInt144 != -1) {
				World var5 = World.worlds[PlayerLoginDetails.anInt144];
				Class88.setWorld(var5);
				PlayerLoginDetails.loadedWorlds = false;
				Class56.aSprite542.method958(PlayerLoginDetails.anInt132, 0);
				PlayerLoginDetails.aSprite137.method958(PlayerLoginDetails.anInt132 + 382, 0);
				IgnoredPlayer.logoSprite.method929(PlayerLoginDetails.anInt132 + 382 - IgnoredPlayer.logoSprite.subWidth / 2, 18);
				return;
			}
		}

	}

	static void bootClient() {
		int var0;
		if (Client.bootState == 0) {
			InterfaceNode.landscape = new Landscape(4, 104, 104, Scene.tileHeights);

			for (var0 = 0; var0 < 4; var0++) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			RuneScript.minimapSprite = new Sprite(512, 512);
			PlayerLoginDetails.bootMessage = "Starting game engine...";
			PlayerLoginDetails.loadingPercentage = 5;
			Client.bootState = 20;
		} else {
			int var1;
			int var2;
			int var3;
			int var4;
			if (Client.bootState == 20) {
				int[] var11 = new int[9];

				for (var1 = 0; var1 < 9; var1++) {
					var2 = var1 * 32 + 128 + 15;
					var4 = var2 * 3 + 600;
					var3 = Graphics3D.SIN_TABLE[var2];
					var11[var1] = var4 * var3 >> 16;
				}

				Landscape.method51(var11, 500, 800, 512, 334);
				PlayerLoginDetails.bootMessage = "Prepared visibility map";
				PlayerLoginDetails.loadingPercentage = 10;
				Client.bootState = 30;
			} else if (Client.bootState == 30) {
				Occluder.skeletonsIndex = NpcType.openCacheIndex(0, false, true, true);
				Client.meshesIndex = NpcType.openCacheIndex(1, false, true, true);
				Client.configsIndex = NpcType.openCacheIndex(2, true, false, true);
				RuneScript.interfaceIndex = NpcType.openCacheIndex(3, false, true, true);
				VarClientType.sfxIndex = NpcType.openCacheIndex(4, false, true, true);
				Class48_Sub1.landscapesIndex = NpcType.openCacheIndex(5, true, true, true);
				Class2.midiTrack1Index = NpcType.openCacheIndex(6, true, true, false);
				Class3.modelsIndex = NpcType.openCacheIndex(7, false, true, true);
				AnimationSkin.spritesIndex = NpcType.openCacheIndex(8, false, true, true);
				Class1.texturesIndex = NpcType.openCacheIndex(9, false, true, true);
				Class40.binaryIndex = NpcType.openCacheIndex(10, false, true, true);
				PlayerConfig.midiTack2Index = NpcType.openCacheIndex(11, false, true, true);
				InvType.clientScriptsIndex = NpcType.openCacheIndex(12, false, true, true);
				Class2.fontMetricsIndex = NpcType.openCacheIndex(13, true, false, true);
				Class26.vorbisIndex = NpcType.openCacheIndex(14, false, true, false);
				Class59.midiInstrumentsIndex = NpcType.openCacheIndex(15, false, true, true);
				PlayerLoginDetails.bootMessage = "Connecting to update server";
				PlayerLoginDetails.loadingPercentage = 20;
				Client.bootState = 40;
			} else if (Client.bootState == 40) {
				var0 = Occluder.skeletonsIndex.percentage() * 4 / 100;
				var0 += Client.meshesIndex.percentage() * 4 / 100;
				var0 += Client.configsIndex.percentage() * 2 / 100;
				var0 += RuneScript.interfaceIndex.percentage() * 2 / 100;
				var0 += VarClientType.sfxIndex.percentage() * 6 / 100;
				var0 += Class48_Sub1.landscapesIndex.percentage() * 4 / 100;
				var0 += Class2.midiTrack1Index.percentage() * 2 / 100;
				var0 += Class3.modelsIndex.percentage() * 60 / 100;
				var0 += AnimationSkin.spritesIndex.percentage() * 2 / 100;
				var0 += Class1.texturesIndex.percentage() * 2 / 100;
				var0 += Class40.binaryIndex.percentage() * 2 / 100;
				var0 += PlayerConfig.midiTack2Index.percentage() * 2 / 100;
				var0 += InvType.clientScriptsIndex.percentage() * 2 / 100;
				var0 += Class2.fontMetricsIndex.percentage() * 2 / 100;
				var0 += Class26.vorbisIndex.percentage() * 2 / 100;
				var0 += Class59.midiInstrumentsIndex.percentage() * 2 / 100;
				if (var0 != 100) {
					if (var0 != 0) {
						PlayerLoginDetails.bootMessage = "Checking for updates - " + var0 + "%";
					}

					PlayerLoginDetails.loadingPercentage = 30;
				} else {
					PlayerLoginDetails.bootMessage = "Loaded update list";
					PlayerLoginDetails.loadingPercentage = 30;
					Client.bootState = 45;
				}
			} else {
				CacheIndex var141;
				if (Client.bootState == 45) {
					boolean var5 = !Client.lowMemory;
					AbstractSoundSystem.sampleRate = 22050;
					AbstractSoundSystem.highMemory = var5;
					AbstractSoundSystem.priority = 2;
					Node_Sub4_Sub4 var9 = new Node_Sub4_Sub4();
					var9.method832(9, 128);
					DualNode_Sub14.soundSystem0 = ScriptEvent.createSystem(IsaacRandom.taskManager,
							LandscapeTile.gameCanvas, 0, 22050);
					DualNode_Sub14.soundSystem0.method91(var9);
					var141 = Class59.midiInstrumentsIndex;
					CacheIndex var14 = Class26.vorbisIndex;
					CacheIndex var12 = VarClientType.sfxIndex;
					Class89.midiInstruments_ref = var141;
					Class110.vorbis_ref = var14;
					Class110.sfx_ref = var12;
					Class110.aNode_Sub4_Sub4_784 = var9;
					Class30.soundSystem1 = ScriptEvent.createSystem(IsaacRandom.taskManager, LandscapeTile.gameCanvas, 1,
							2048);
					FriendedPlayer.aNode_Sub4_Sub1_740 = new Node_Sub4_Sub1();
					Class30.soundSystem1.method91(FriendedPlayer.aNode_Sub4_Sub1_740);
					Class59.aClass16_548 = new Class16(22050, AbstractSoundSystem.sampleRate);
					PlayerLoginDetails.bootMessage = "Prepared sound engine";
					PlayerLoginDetails.loadingPercentage = 35;
					Client.bootState = 50;
				} else if (Client.bootState == 50) {
					var0 = 0;
					if (ConsumingImageProducer.p11_full == null) {
						ConsumingImageProducer.p11_full = ClientSettings.method163(AnimationSkin.spritesIndex,
								Class2.fontMetricsIndex, "p11_full", "");
					} else {
						++var0;
					}

					if (Client.p12_full == null) {
						Client.p12_full = ClientSettings.method163(AnimationSkin.spritesIndex, Class2.fontMetricsIndex,
								"p12_full", "");
					} else {
						++var0;
					}

					if (Class35.b12_full == null) {
						Class35.b12_full = ClientSettings.method163(AnimationSkin.spritesIndex, Class2.fontMetricsIndex,
								"b12_full", "");
					} else {
						++var0;
					}

					if (var0 < 3) {
						PlayerLoginDetails.bootMessage = "Loading fonts - " + var0 * 100 / 3 + "%";
						PlayerLoginDetails.loadingPercentage = 40;
					} else {
						IdentKitType.aNode_Sub10_1467 = new MachineInfo(true);
						PlayerLoginDetails.bootMessage = "Loaded fonts";
						PlayerLoginDetails.loadingPercentage = 40;
						Client.bootState = 60;
					}
				} else if (Client.bootState == 60) {
					var0 = Node_Sub8.method548(Class40.binaryIndex, AnimationSkin.spritesIndex);
					var1 = Class50.method253();
					if (var0 < var1) {
						PlayerLoginDetails.bootMessage = "Loading title screen - " + var0 * 100 / var1 + "%";
						PlayerLoginDetails.loadingPercentage = 50;
					} else {
						PlayerLoginDetails.bootMessage = "Loaded title screen";
						PlayerLoginDetails.loadingPercentage = 50;
						Node_Sub8.setClientState(5);
						Client.bootState = 70;
					}
				} else if (Client.bootState == 70) {
					if (!Client.configsIndex.method377()) {
						PlayerLoginDetails.bootMessage = "Loading config - " + Client.configsIndex.method559() + "%";
						PlayerLoginDetails.loadingPercentage = 60;
					} else {
						CacheIndex var15 = Client.configsIndex;
						OverlayType.overlay_ref = var15;
						Class26.method170(Client.configsIndex);
						Class35.method203(Client.configsIndex, Class3.modelsIndex);
						Class96_Sub1.method498(Client.configsIndex, Class3.modelsIndex, Client.lowMemory);
						Class2.method60(Client.configsIndex, Class3.modelsIndex);
						CacheIndex var18 = Client.configsIndex;
						var141 = Class3.modelsIndex;
						boolean var20 = Client.membersWorld;
						IndexedFont var21 = ConsumingImageProducer.p11_full;
						ItemType.item_ref = var18;
						GZipDecompressor.aClass87_516 = var141;
						Class94.aBool735 = var20;
						Class13.itemsSize = ItemType.item_ref.fileCount(10);
						TileUnderlay.aDualNode_Sub13_Sub3_Sub1_350 = var21;
						VarClientStringType.method699(Client.configsIndex, Occluder.skeletonsIndex, Client.meshesIndex);
						CacheIndex var16 = Client.configsIndex;
						CacheIndex var8 = Class3.modelsIndex;
						SpotAnimType.anim_ref = var16;
						SpotAnimType.aClass87_1440 = var8;
						CacheIndex var7 = Client.configsIndex;
						VarBitType.varbit_ref = var7;
						Node_Sub8.method549(Client.configsIndex);
						Class32.method193(RuneScript.interfaceIndex, Class3.modelsIndex, AnimationSkin.spritesIndex,
								Class2.fontMetricsIndex);
						TileUnderlay.method190(Client.configsIndex);
						ItemTable.method648(Client.configsIndex);
						Class32.method196(Client.configsIndex);
						CacheIndex var6 = Client.configsIndex;
						VarClientStringType.varclientstring_ref = var6;
						CalledScript.aClass28_364 = new VarClientHub();
						PlayerLoginDetails.bootMessage = "Loaded config";
						PlayerLoginDetails.loadingPercentage = 60;
						Client.bootState = 80;
					}
				} else if (Client.bootState != 80) {
					if (Client.bootState == 90) {
						if (!Class1.texturesIndex.method377()) {
							PlayerLoginDetails.bootMessage = "Loading textures - " + Class1.texturesIndex.method559() + "%";
							PlayerLoginDetails.loadingPercentage = 90;
						} else {
							TextureLoader var161 = new TextureLoader(Class1.texturesIndex, AnimationSkin.spritesIndex,
									20, 0.8D, Client.lowMemory ? 64 : 128);
							Graphics3D.setTextureLoader(var161);
							Graphics3D.setBrightness(0.8D);
							PlayerLoginDetails.bootMessage = "Loaded textures";
							PlayerLoginDetails.loadingPercentage = 90;
							Client.bootState = 110;
						}
					} else if (Client.bootState == 110) {
						Npc.aClass30_1968 = new Class30();
						IsaacRandom.taskManager.createRunnable(Npc.aClass30_1968, 10);
						PlayerLoginDetails.bootMessage = "Loaded input handler";
						PlayerLoginDetails.loadingPercentage = 94;
						Client.bootState = 120;
					} else if (Client.bootState == 120) {
						if (!Class40.binaryIndex.method385("huffman", "")) {
							PlayerLoginDetails.bootMessage = "Loading wordpack - " + 0 + "%";
							PlayerLoginDetails.loadingPercentage = 96;
						} else {
							Huffman var17 = new Huffman(Class40.binaryIndex.method389("huffman", ""));
							RuneScript.setHuffman(var17);
							PlayerLoginDetails.bootMessage = "Loaded wordpack";
							PlayerLoginDetails.loadingPercentage = 96;
							Client.bootState = 130;
						}
					} else if (Client.bootState == 130) {
						if (!RuneScript.interfaceIndex.method377()) {
							PlayerLoginDetails.bootMessage = "Loading interfaces - " + RuneScript.interfaceIndex.method559() * 4 / 5
									+ "%";
							PlayerLoginDetails.loadingPercentage = 100;
						} else if (!InvType.clientScriptsIndex.method377()) {
							PlayerLoginDetails.bootMessage = "Loading interfaces - "
									+ (InvType.clientScriptsIndex.method559() / 6 + 80) + "%";
							PlayerLoginDetails.loadingPercentage = 100;
						} else if (!Class2.fontMetricsIndex.method377()) {
							PlayerLoginDetails.bootMessage = "Loading interfaces - "
									+ (Class2.fontMetricsIndex.method559() / 20 + 96) + "%";
							PlayerLoginDetails.loadingPercentage = 100;
						} else {
							PlayerLoginDetails.bootMessage = "Loaded interfaces";
							PlayerLoginDetails.loadingPercentage = 100;
							Client.bootState = 140;
						}
					} else if (Client.bootState == 140) {
						Node_Sub8.setClientState(10);
					}
				} else {
					var0 = 0;
					if (Class48_Sub1.compass == null) {
						Class48_Sub1.compass = AbstractByteBuffer.method257(AnimationSkin.spritesIndex, "compass",
								"");
					} else {
						++var0;
					}

					if (Npc.mapedge == null) {
						Npc.mapedge = AbstractByteBuffer.method257(AnimationSkin.spritesIndex, "mapedge", "");
					} else {
						++var0;
					}

					if (Class2.mapscenes == null) {
						Class2.mapscenes = ObjectType.method868(AnimationSkin.spritesIndex,
								"mapscene", "");
					} else {
						++var0;
					}

					if (Node_Sub8.mapfunctions == null) {
						Node_Sub8.mapfunctions = DynamicObject.method1023(AnimationSkin.spritesIndex, "mapfunction",
								"");
					} else {
						++var0;
					}

					if (Class96_Sub1.hitmarks == null) {
						Class96_Sub1.hitmarks = DynamicObject.method1023(AnimationSkin.spritesIndex, "hitmarks",
								"");
					} else {
						++var0;
					}

					if (VarBitType.pkIcons == null) {
						VarBitType.pkIcons = DynamicObject.method1023(AnimationSkin.spritesIndex,
								"headicons_pk", "");
					} else {
						++var0;
					}

					if (ItemType.prayerIcons == null) {
						ItemType.prayerIcons = DynamicObject.method1023(AnimationSkin.spritesIndex,
								"headicons_prayer", "");
					} else {
						++var0;
					}

					if (Scene.hintIcons == null) {
						Scene.hintIcons = DynamicObject.method1023(AnimationSkin.spritesIndex, "headicons_hint",
								"");
					} else {
						++var0;
					}

					if (Class72.mapmarker == null) {
						Class72.mapmarker = DynamicObject.method1023(AnimationSkin.spritesIndex, "mapmarker", "");
					} else {
						++var0;
					}

					if (Class88.cross == null) {
						Class88.cross = DynamicObject.method1023(AnimationSkin.spritesIndex, "cross", "");
					} else {
						++var0;
					}

					if (Parameters.mapDots == null) {
						Parameters.mapDots = DynamicObject.method1023(AnimationSkin.spritesIndex, "mapdots", "");
					} else {
						++var0;
					}

					if (Class35.scrollbar == null) {
						Class35.scrollbar = ObjectType.method868(AnimationSkin.spritesIndex,
								"scrollbar", "");
					} else {
						++var0;
					}

					if (IgnoredPlayer.modIcons == null) {
						IgnoredPlayer.modIcons = ObjectType.method868(AnimationSkin.spritesIndex,
								"mod_icons", "");
					} else {
						++var0;
					}

					if (var0 < 13) {
						PlayerLoginDetails.bootMessage = "Loading sprites - " + var0 * 100 / 13 + "%";
						PlayerLoginDetails.loadingPercentage = 70;
					} else {
						AbstractFont.modSprites = IgnoredPlayer.modIcons;
						Npc.mapedge.method948();
						var1 = (int) (Math.random() * 21.0D) - 10;
						var2 = (int) (Math.random() * 21.0D) - 10;
						var4 = (int) (Math.random() * 21.0D) - 10;
						var3 = (int) (Math.random() * 41.0D) - 20;

						for (int var19 = 0; var19 < Node_Sub8.mapfunctions.length; var19++) {
							Node_Sub8.mapfunctions[var19].method960(var1 + var3, var2 + var3, var3 + var4);
						}

						Class2.mapscenes[0].method927(var3 + var1, var3 + var2, var4 + var3);
						PlayerLoginDetails.bootMessage = "Loaded sprites";
						PlayerLoginDetails.loadingPercentage = 70;
						Client.bootState = 90;
					}
				}
			}
		}

	}

}
