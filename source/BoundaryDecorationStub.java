
public final class BoundaryDecorationStub {

	int orientationB;
	int height;
	int regionY;
	public Entity entityA;
	public Entity entityB;
	int insetX;
	int insetY;
	static int anInt216;
	static String[] aStringArray217;
	public int anInt218 = 0;
	int regionX;
	int config = 0;
	int orientationA;

	static final void method106(byte[] var0, int var1, int var2, Landscape var3, CollisionMap[] var4) {
		ByteBuf var5 = new ByteBuf(var0);
		int var9 = -1;

		while (true) {
			int var7 = var5.getUSmart();
			if (var7 == 0) {
				return;
			}

			var9 += var7;
			int var10 = 0;

			while (true) {
				int var12 = var5.getUSmart();
				if (var12 == 0) {
					break;
				}

				var10 += var12 - 1;
				int var15 = var10 & 63;
				int var17 = var10 >> 6 & 63;
				int var18 = var10 >> 12;
				int var13 = var5.getUByte();
				int var14 = var13 >> 2;
				int var16 = var13 & 3;
				int var8 = var17 + var1;
				int var11 = var2 + var15;
				if (var8 > 0 && var11 > 0 && var8 < 103 && var11 < 103) {
					int var19 = var18;
					if ((Class39.renderRules[1][var8][var11] & 2) == 2) {
						var19 = var18 - 1;
					}

					CollisionMap var6 = null;
					if (var19 >= 0) {
						var6 = var4[var19];
					}

					ScriptEvent.method650(var18, var8, var11, var9, var16, var14, var3, var6);
				}
			}
		}
	}

	static void method107(GameEngine var0) {
		if (823601801 * Class74.anInt627 == 1 || !ClanMate.aBool1221 && 823601801 * Class74.anInt627 == 4) {
			int var2 = 280 + 1933284923 * Class6.anInt132;
			if (-2040065729 * Class74.anInt628 >= var2 && -2040065729 * Class74.anInt628 <= var2 + 14
					&& Class74.anInt629 * 2090526775 >= 4 && 2090526775 * Class74.anInt629 <= 18) {
				UnderlayType.method704(0, 0);
				return;
			}

			if (-2040065729 * Class74.anInt628 >= var2 + 15 && Class74.anInt628 * -2040065729 <= 80 + var2
					&& Class74.anInt629 * 2090526775 >= 4 && 2090526775 * Class74.anInt629 <= 18) {
				UnderlayType.method704(0, 1);
				return;
			}

			int var3 = Class6.anInt132 * 1933284923 + 390;
			if (-2040065729 * Class74.anInt628 >= var3 && -2040065729 * Class74.anInt628 <= var3 + 14
					&& 2090526775 * Class74.anInt629 >= 4 && Class74.anInt629 * 2090526775 <= 18) {
				UnderlayType.method704(1, 0);
				return;
			}

			if (Class74.anInt628 * -2040065729 >= 15 + var3 && Class74.anInt628 * -2040065729 <= var3 + 80
					&& 2090526775 * Class74.anInt629 >= 4 && Class74.anInt629 * 2090526775 <= 18) {
				UnderlayType.method704(1, 1);
				return;
			}

			int var1 = 1933284923 * Class6.anInt132 + 500;
			if (Class74.anInt628 * -2040065729 >= var1 && Class74.anInt628 * -2040065729 <= 14 + var1
					&& 2090526775 * Class74.anInt629 >= 4 && Class74.anInt629 * 2090526775 <= 18) {
				UnderlayType.method704(2, 0);
				return;
			}

			if (Class74.anInt628 * -2040065729 >= 15 + var1 && -2040065729 * Class74.anInt628 <= 80 + var1
					&& 2090526775 * Class74.anInt629 >= 4 && Class74.anInt629 * 2090526775 <= 18) {
				UnderlayType.method704(2, 1);
				return;
			}

			int var4 = Class6.anInt132 * 1933284923 + 610;
			if (Class74.anInt628 * -2040065729 >= var4 && Class74.anInt628 * -2040065729 <= var4 + 14
					&& Class74.anInt629 * 2090526775 >= 4 && 2090526775 * Class74.anInt629 <= 18) {
				UnderlayType.method704(3, 0);
				return;
			}

			if (Class74.anInt628 * -2040065729 >= 15 + var4 && -2040065729 * Class74.anInt628 <= 80 + var4
					&& Class74.anInt629 * 2090526775 >= 4 && Class74.anInt629 * 2090526775 <= 18) {
				UnderlayType.method704(3, 1);
				return;
			}

			if (Class74.anInt628 * -2040065729 >= Class6.anInt132 * 1933284923 + 708
					&& Class74.anInt629 * 2090526775 >= 4
					&& Class74.anInt628 * -2040065729 <= 708 + 1933284923 * Class6.anInt132 + 50
					&& 2090526775 * Class74.anInt629 <= 20) {
				Class6.loadedWorlds = false;
				Class56.aSprite542.method958(Class6.anInt132 * 1933284923, 0);
				Class6.aSprite137.method958(Class6.anInt132 * 1933284923 + 382, 0);
				IgnoredPlayer.aDualNode_Sub13_Sub2_754.method929(
						382 + 1933284923 * Class6.anInt132 - IgnoredPlayer.aDualNode_Sub13_Sub2_754.anInt1800 / 2, 18);
				return;
			}

			if (Class6.anInt144 * 154582397 != -1) {
				World var5 = World.worlds[154582397 * Class6.anInt144];
				Class88.setWorld(var5);
				Class6.loadedWorlds = false;
				Class56.aSprite542.method958(1933284923 * Class6.anInt132, 0);
				Class6.aSprite137.method958(382 + Class6.anInt132 * 1933284923, 0);
				IgnoredPlayer.aDualNode_Sub13_Sub2_754.method929(
						1933284923 * Class6.anInt132 + 382 - IgnoredPlayer.aDualNode_Sub13_Sub2_754.anInt1800 / 2, 18);
				return;
			}
		}

	}

	static void bootClient() {
		int var0;
		if (Client.bootState * -773857325 == 0) {
			InterfaceNode.landscape = new Landscape(4, 104, 104, Class39.tileHeights);

			for (var0 = 0; var0 < 4; ++var0) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			RuneScript.minimapSprite = new Sprite(512, 512);
			Class6.bootMessage = GameStrings.aString855;
			Class6.anInt122 = 1559498423;
			Client.bootState = -472889572;
		} else {
			int var1;
			int var2;
			int var3;
			int var4;
			if (Client.bootState * -773857325 == 20) {
				int[] var22 = new int[9];

				for (var1 = 0; var1 < 9; ++var1) {
					var2 = 128 + 32 * var1 + 15;
					var4 = var2 * 3 + 600;
					var3 = DualNode_Sub13_Sub1.SIN_TABLE[var2];
					var22[var1] = var4 * var3 >> 16;
				}

				Landscape.method51(var22, 500, 800, 512, 334);
				Class6.bootMessage = GameStrings.aString856;
				Class6.anInt122 = -1175970450;
				Client.bootState = 1438149290;
			} else if (Client.bootState * -773857325 == 30) {
				Class34.skeletonsIndex = NpcType.openCacheIndex(0, false, true, true);
				Client.meshesIndex = NpcType.openCacheIndex(1, false, true, true);
				Client.configsIndex = NpcType.openCacheIndex(2, true, false, true);
				RuneScript.interfaceIndex = NpcType.openCacheIndex(3, false, true, true);
				VarClientType.sfxIndex = NpcType.openCacheIndex(4, false, true, true);
				Class48_Sub1.landscapesIndex = NpcType.openCacheIndex(5, true, true, true);
				Class2.midiTrack1Index = NpcType.openCacheIndex(6, true, true, false);
				Class3.modelsIndex = NpcType.openCacheIndex(7, false, true, true);
				Node_Sub5.spritesIndex = NpcType.openCacheIndex(8, false, true, true);
				Class1.texturesIndex = NpcType.openCacheIndex(9, false, true, true);
				Class40.binaryIndex = NpcType.openCacheIndex(10, false, true, true);
				PlayerConfig.midiTack2Index = NpcType.openCacheIndex(11, false, true, true);
				InvType.clientScriptsIndex = NpcType.openCacheIndex(12, false, true, true);
				Class2.fontMetricsIndex = NpcType.openCacheIndex(13, true, false, true);
				Class26.vorbisIndex = NpcType.openCacheIndex(14, false, true, false);
				Class59.midiInstrumentsIndex = NpcType.openCacheIndex(15, false, true, true);
				Class6.bootMessage = GameStrings.aString857;
				Class6.anInt122 = 1943026396;
				Client.bootState = -945779144;
			} else if (Client.bootState * -773857325 == 40) {
				byte var21 = 0;
				var0 = var21 + Class34.skeletonsIndex.percentage() * 4 / 100;
				var0 += Client.meshesIndex.percentage() * 4 / 100;
				var0 += Client.configsIndex.percentage() * 2 / 100;
				var0 += RuneScript.interfaceIndex.percentage() * 2 / 100;
				var0 += VarClientType.sfxIndex.percentage() * 6 / 100;
				var0 += Class48_Sub1.landscapesIndex.percentage() * 4 / 100;
				var0 += Class2.midiTrack1Index.percentage() * 2 / 100;
				var0 += Class3.modelsIndex.percentage() * 60 / 100;
				var0 += Node_Sub5.spritesIndex.percentage() * 2 / 100;
				var0 += Class1.texturesIndex.percentage() * 2 / 100;
				var0 += Class40.binaryIndex.percentage() * 2 / 100;
				var0 += PlayerConfig.midiTack2Index.percentage() * 2 / 100;
				var0 += InvType.clientScriptsIndex.percentage() * 2 / 100;
				var0 += Class2.fontMetricsIndex.percentage() * 2 / 100;
				var0 += Class26.vorbisIndex.percentage() * 2 / 100;
				var0 += Class59.midiInstrumentsIndex.percentage() * 2 / 100;
				if (var0 != 100) {
					if (var0 != 0) {
						Class6.bootMessage = GameStrings.aString1017 + var0 + "%";
					}

					Class6.anInt122 = 767055946;
				} else {
					Class6.bootMessage = GameStrings.aString859;
					Class6.anInt122 = 767055946;
					Client.bootState = -2137743361;
				}
			} else {
				CacheIndex var11;
				if (Client.bootState * -773857325 == 45) {
					boolean var20 = !Client.aBool2010;
					Class8.anInt157 = -999529678;
					Class8.aBool166 = var20;
					Class8.anInt172 = -179620222;
					Node_Sub4_Sub4 var10 = new Node_Sub4_Sub4();
					var10.method832(9, 128);
					DualNode_Sub14.aClass8_1644 = ScriptEvent.method651(IsaacRandom.aClass63_102,
							LandscapeTile.aCanvas1417, 0, 22050);
					DualNode_Sub14.aClass8_1644.method91(var10);
					var11 = Class59.midiInstrumentsIndex;
					CacheIndex var15 = Class26.vorbisIndex;
					CacheIndex var13 = VarClientType.sfxIndex;
					Class89.midiInstruments_ref = var11;
					Class110.vorbis_ref = var15;
					Class110.sfx_ref = var13;
					Class110.aNode_Sub4_Sub4_784 = var10;
					Class30.aClass8_341 = ScriptEvent.method651(IsaacRandom.aClass63_102, LandscapeTile.aCanvas1417, 1,
							2048);
					FriendedPlayer.aNode_Sub4_Sub1_740 = new Node_Sub4_Sub1();
					Class30.aClass8_341.method91(FriendedPlayer.aNode_Sub4_Sub1_740);
					Class59.aClass16_548 = new Class16(22050, Class8.anInt157 * -954458055);
					Class6.bootMessage = GameStrings.aString860;
					Class6.anInt122 = -1968412927;
					Client.bootState = 965259718;
				} else if (Client.bootState * -773857325 == 50) {
					var0 = 0;
					if (Class20_Sub1.p11_full == null) {
						Class20_Sub1.p11_full = Class24.method163(Node_Sub5.spritesIndex,
								Class2.fontMetricsIndex, "p11_full", "");
					} else {
						++var0;
					}

					if (Client.p12_full == null) {
						Client.p12_full = Class24.method163(Node_Sub5.spritesIndex,
								Class2.fontMetricsIndex, "p12_full", "");
					} else {
						++var0;
					}

					if (Class35.b12_full == null) {
						Class35.b12_full = Class24.method163(Node_Sub5.spritesIndex,
								Class2.fontMetricsIndex, "b12_full", "");
					} else {
						++var0;
					}

					if (var0 < 3) {
						Class6.bootMessage = GameStrings.aString1057 + 100 * var0 / 3 + "%";
						Class6.anInt122 = -408914504;
					} else {
						IdentKitType.aNode_Sub10_1467 = new Node_Sub10(true);
						Class6.bootMessage = GameStrings.aString862;
						Class6.anInt122 = -408914504;
						Client.bootState = -1418668716;
					}
				} else if (-773857325 * Client.bootState == 60) {
					var0 = Node_Sub8.method548(Class40.binaryIndex, Node_Sub5.spritesIndex);
					var1 = Class50.method253();
					if (var0 < var1) {
						Class6.bootMessage = GameStrings.aString967 + var0 * 100 / var1 + "%";
						Class6.anInt122 = -1584884954;
					} else {
						Class6.bootMessage = GameStrings.aString984;
						Class6.anInt122 = -1584884954;
						Node_Sub8.method550(5);
						Client.bootState = 492370146;
					}
				} else if (Client.bootState * -773857325 == 70) {
					if (!Client.configsIndex.method377()) {
						Class6.bootMessage = GameStrings.aString865 + Client.configsIndex.method559() + "%";
						Class6.anInt122 = 1534111892;
					} else {
						CacheIndex var19 = Client.configsIndex;
						OverlayType.overlay_ref = var19;
						Class26.method170(Client.configsIndex);
						Class35.method203(Client.configsIndex, Class3.modelsIndex);
						Class96_Sub1.method498(Client.configsIndex, Class3.modelsIndex, Client.aBool2010);
						Class2.method60(Client.configsIndex, Class3.modelsIndex);
						CacheIndex var9 = Client.configsIndex;
						var11 = Class3.modelsIndex;
						boolean var14 = Client.membersWorld;
						DualNode_Sub13_Sub3_Sub1 var12 = Class20_Sub1.p11_full;
						ItemType.item_ref = var9;
						Class49.aClass87_516 = var11;
						Class94.aBool735 = var14;
						Class13.itemsSize = ItemType.item_ref.fileCount(10) * -1384530971;
						Class31.aDualNode_Sub13_Sub3_Sub1_350 = var12;
						VarClientStringType.method699(Client.configsIndex, Class34.skeletonsIndex,
								Client.meshesIndex);
						CacheIndex var16 = Client.configsIndex;
						CacheIndex var8 = Class3.modelsIndex;
						SpotAnimType.anim_ref = var16;
						SpotAnimType.aClass87_1440 = var8;
						CacheIndex var7 = Client.configsIndex;
						VarBitType.varbit_ref = var7;
						Node_Sub8.method549(Client.configsIndex);
						Class32.method193(RuneScript.interfaceIndex, Class3.modelsIndex,
								Node_Sub5.spritesIndex, Class2.fontMetricsIndex);
						Class31.method190(Client.configsIndex);
						ItemTable.method648(Client.configsIndex);
						Class32.method196(Client.configsIndex);
						CacheIndex var6 = Client.configsIndex;
						VarClientStringType.varclientstring_ref = var6;
						Class33.aClass28_364 = new VarClientHub();
						Class6.bootMessage = GameStrings.aString866;
						Class6.anInt122 = 1534111892;
						Client.bootState = -1891558288;
					}
				} else if (Client.bootState * -773857325 != 80) {
					if (Client.bootState * -773857325 == 90) {
						if (!Class1.texturesIndex.method377()) {
							Class6.bootMessage = GameStrings.aString869 + Class1.texturesIndex.method559() + "%";
							Class6.anInt122 = -1993799458;
						} else {
							Class29 var18 = new Class29(Class1.texturesIndex, Node_Sub5.spritesIndex, 20, 0.8D,
									Client.aBool2010 ? 64 : 128);
							DualNode_Sub13_Sub1.method925(var18);
							DualNode_Sub13_Sub1.method913(0.8D);
							Class6.bootMessage = GameStrings.aString976;
							Class6.anInt122 = -1993799458;
							Client.bootState = -453408998;
						}
					} else if (-773857325 * Client.bootState == 110) {
						Npc.aClass30_1968 = new Class30();
						IsaacRandom.aClass63_102.method313(Npc.aClass30_1968, 10);
						Class6.bootMessage = GameStrings.aString871;
						Class6.anInt122 = 1830779658;
						Client.bootState = 1457629864;
					} else if (Client.bootState * -773857325 == 120) {
						if (!Class40.binaryIndex.method385("huffman", "")) {
							Class6.bootMessage = GameStrings.aString1035 + 0 + "%";
							Class6.anInt122 = 1595585568;
						} else {
							Huffman var17 = new Huffman(Class40.binaryIndex.method389("huffman", ""));
							RuneScript.setHuffman(var17);
							Class6.bootMessage = GameStrings.aString873;
							Class6.anInt122 = 1595585568;
							Client.bootState = -926298570;
						}
					} else if (Client.bootState * -773857325 == 130) {
						if (!RuneScript.interfaceIndex.method377()) {
							Class6.bootMessage = GameStrings.aString874
									+ RuneScript.interfaceIndex.method559() * 4 / 5 + "%";
							Class6.anInt122 = 1125197388;
						} else if (!InvType.clientScriptsIndex.method377()) {
							Class6.bootMessage = GameStrings.aString874
									+ (80 + InvType.clientScriptsIndex.method559() / 6) + "%";
							Class6.anInt122 = 1125197388;
						} else if (!Class2.fontMetricsIndex.method377()) {
							Class6.bootMessage = GameStrings.aString874 + (96 + Class2.fontMetricsIndex.method559() / 20)
									+ "%";
							Class6.anInt122 = 1125197388;
						} else {
							Class6.bootMessage = GameStrings.aString875;
							Class6.anInt122 = 1125197388;
							Client.bootState = 984740292;
						}
					} else if (Client.bootState * -773857325 == 140) {
						Node_Sub8.method550(10);
					}
				} else {
					var0 = 0;
					if (Class48_Sub1.aSprite1296 == null) {
						Class48_Sub1.aSprite1296 = Class52.method257(Node_Sub5.spritesIndex, "compass", "");
					} else {
						++var0;
					}

					if (Npc.aSprite1965 == null) {
						Npc.aSprite1965 = Class52.method257(Node_Sub5.spritesIndex, "mapedge", "");
					} else {
						++var0;
					}

					if (Class2.aDualNode_Sub13_Sub2Array77 == null) {
						Class2.aDualNode_Sub13_Sub2Array77 = ObjectType.method868(Node_Sub5.spritesIndex,
								"mapscene", "");
					} else {
						++var0;
					}

					if (Node_Sub8.aSpriteArray1309 == null) {
						Node_Sub8.aSpriteArray1309 = DynamicObject.method1023(Node_Sub5.spritesIndex,
								"mapfunction", "");
					} else {
						++var0;
					}

					if (Class96_Sub1.aSpriteArray1204 == null) {
						Class96_Sub1.aSpriteArray1204 = DynamicObject.method1023(Node_Sub5.spritesIndex,
								"hitmarks", "");
					} else {
						++var0;
					}

					if (VarBitType.aSpriteArray1728 == null) {
						VarBitType.aSpriteArray1728 = DynamicObject.method1023(Node_Sub5.spritesIndex,
								"headicons_pk", "");
					} else {
						++var0;
					}

					if (ItemType.aSpriteArray1619 == null) {
						ItemType.aSpriteArray1619 = DynamicObject.method1023(Node_Sub5.spritesIndex,
								"headicons_prayer", "");
					} else {
						++var0;
					}

					if (Class39.aSpriteArray442 == null) {
						Class39.aSpriteArray442 = DynamicObject.method1023(Node_Sub5.spritesIndex,
								"headicons_hint", "");
					} else {
						++var0;
					}

					if (Class72.aSpriteArray604 == null) {
						Class72.aSpriteArray604 = DynamicObject.method1023(Node_Sub5.spritesIndex, "mapmarker",
								"");
					} else {
						++var0;
					}

					if (Class88.aSpriteArray712 == null) {
						Class88.aSpriteArray712 = DynamicObject.method1023(Node_Sub5.spritesIndex, "cross", "");
					} else {
						++var0;
					}

					if (Parameters.aSpriteArray69 == null) {
						Parameters.aSpriteArray69 = DynamicObject.method1023(Node_Sub5.spritesIndex, "mapdots",
								"");
					} else {
						++var0;
					}

					if (Class35.aDualNode_Sub13_Sub2Array395 == null) {
						Class35.aDualNode_Sub13_Sub2Array395 = ObjectType.method868(Node_Sub5.spritesIndex,
								"scrollbar", "");
					} else {
						++var0;
					}

					if (IgnoredPlayer.aDualNode_Sub13_Sub2Array755 == null) {
						IgnoredPlayer.aDualNode_Sub13_Sub2Array755 = ObjectType
								.method868(Node_Sub5.spritesIndex, "mod_icons", "");
					} else {
						++var0;
					}

					if (var0 < 13) {
						Class6.bootMessage = GameStrings.aString843 + var0 * 100 / 13 + "%";
						Class6.anInt122 = 358141442;
					} else {
						DualNode_Sub13_Sub3.aDualNode_Sub13_Sub2Array1827 = IgnoredPlayer.aDualNode_Sub13_Sub2Array755;
						Npc.aSprite1965.method948();
						var1 = (int) (Math.random() * 21.0D) - 10;
						var2 = (int) (Math.random() * 21.0D) - 10;
						var4 = (int) (Math.random() * 21.0D) - 10;
						var3 = (int) (Math.random() * 41.0D) - 20;

						for (int var5 = 0; var5 < Node_Sub8.aSpriteArray1309.length; ++var5) {
							Node_Sub8.aSpriteArray1309[var5].method960(var1 + var3, var2 + var3, var3 + var4);
						}

						Class2.aDualNode_Sub13_Sub2Array77[0].method927(var3 + var1, var3 + var2, var4 + var3);
						Class6.bootMessage = GameStrings.aString868;
						Class6.anInt122 = 358141442;
						Client.bootState = 19480574;
					}
				}
			}
		}
	}

}
