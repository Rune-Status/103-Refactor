import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassVerifier extends Node {

	int count;
	int[] type;
	int[] errorIdentifiers;
	Field[] fields;
	int[] fieldValues;
	Method[] methods;
	byte[][][] methodsBytecodes;
	int anInt1426;

	static final void menuOps(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 21) {
			Client.anInt2095 = var6;
			Client.anInt2096 = var7;
			Client.cursorState = 2;
			Client.anInt2097 = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			Client.outBuffer.putHeader(107);
			Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
			Client.outBuffer.putLEShortA(VarClientHub.chunkLeftY + var1);
			Client.outBuffer.putShortA(Node_Sub10.chunkLeftX + var0);
			Client.outBuffer.putShort(var3);
		}

		if (var2 == 23) {
			InterfaceNode.landscape.method58(InterfaceNode.floorLevel * -1331355705, var0, var1);
		}

		Widget var8;
		if (var2 == 24) {
			var8 = Class94.getWidget(var1);
			boolean var13 = true;
			if (var8.contentType > 0) {
				var13 = IdentKitType.method667(var8);
			}

			if (var13) {
				Client.outBuffer.putHeader(80);
				Client.outBuffer.putInt(var1);
			}
		}

		if (var2 == 43) {
			Client.outBuffer.putHeader(120);
			Client.outBuffer.putInt(var1);
			Client.outBuffer.putShortA(var3);
			Client.outBuffer.putShort(var0);
			Client.anInt2098 = 0;
			Class30.aWidget339 = Class94.getWidget(var1);
			Client.anInt2099 = var0;
		}

		if (var2 == 34) {
			Client.outBuffer.putHeader(115);
			Client.outBuffer.putLEShortA(var0);
			Client.outBuffer.putLEShortA(var3);
			Client.outBuffer.putIMEInt(var1);
			Client.anInt2098 = 0;
			Class30.aWidget339 = Class94.getWidget(var1);
			Client.anInt2099 = var0;
		}

		if (var2 == 42) {
			Client.outBuffer.putHeader(212);
			Client.outBuffer.putShort(var3);
			Client.outBuffer.putLEShort(var0);
			Client.outBuffer.putIMEInt(var1);
			Client.anInt2098 = 0;
			Class30.aWidget339 = Class94.getWidget(var1);
			Client.anInt2099 = var0;
		}

		if (var2 == 1004) {
			Client.anInt2095 = var6;
			Client.anInt2096 = var7;
			Client.cursorState = 2;
			Client.anInt2097 = 0;
			Client.outBuffer.putHeader(158);
			Client.outBuffer.putLEShortA(var3);
		}

		if (var2 == 18) {
			Client.anInt2095 = var6;
			Client.anInt2096 = var7;
			Client.cursorState = 2;
			Client.anInt2097 = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			Client.outBuffer.putHeader(51);
			Client.outBuffer.putByteC(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
			Client.outBuffer.putLEShortA(Node_Sub10.chunkLeftX + var0);
			Client.outBuffer.putLEShortA(var3);
			Client.outBuffer.putLEShortA(VarClientHub.chunkLeftY + var1);
		}

		int var131;
		if (var2 == 57 || var2 == 1007) {
			var8 = AbstractProducer.method146(var1, var0);
			if (var8 != null) {
				var131 = var8.itemId;
				Widget var12 = AbstractProducer.method146(var1, var0);
				if (var12 != null) {
					if (var12.anObjectArray1180 != null) {
						ScriptEvent var14 = new ScriptEvent();
						var14.widget = var12;
						var14.anInt1429 = var3;
						var14.opbase = var5;
						var14.args = var12.anObjectArray1180;
						Class96_Sub1.execute(var14);
					}

					boolean var141 = true;
					if (var12.contentType > 0) {
						var141 = IdentKitType.method667(var12);
					}

					if (var141 && Node_Sub10.method569(Class30.getWidgetConfig(var12), var3 - 1)) {
						if (var3 == 1) {
							Client.outBuffer.putHeader(149);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 2) {
							Client.outBuffer.putHeader(209);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 3) {
							Client.outBuffer.putHeader(143);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 4) {
							Client.outBuffer.putHeader(68);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 5) {
							Client.outBuffer.putHeader(48);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 6) {
							Client.outBuffer.putHeader(148);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 7) {
							Client.outBuffer.putHeader(119);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 8) {
							Client.outBuffer.putHeader(31);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 9) {
							Client.outBuffer.putHeader(0);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}

						if (var3 == 10) {
							Client.outBuffer.putHeader(108);
							Client.outBuffer.putInt(var1);
							Client.outBuffer.putShort(var0);
							Client.outBuffer.putShort(var131);
						}
					}
				}
			}
		}

		if (var2 == 25) {
			var8 = AbstractProducer.method146(var1, var0);
			if (var8 != null) {
				IdentKitType.method672();
				AbstractSoundSystem.method96(var1, var0, TaskManager.method314(Class30.getWidgetConfig(var8)),
						var8.itemId);
				Client.itemSelectionStatus = 0;
				Client.menuActionPrefix = Class26.method168(var8);
				if (Client.menuActionPrefix == null) {
					Client.menuActionPrefix = "Null";
				}

				if (var8.interactable) {
					Client.selectedSpellName = var8.name + Class48_Sub1.method545(16777215);
				} else {
					Client.selectedSpellName = Class48_Sub1.method545('\uff00') + var8.aString1125
							+ Class48_Sub1.method545(16777215);
				}
			}
		} else {
			if (var2 == 16) {
				Client.anInt2095 = var6;
				Client.anInt2096 = var7;
				Client.cursorState = 2;
				Client.anInt2097 = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				Client.outBuffer.putHeader(208);
				Client.outBuffer.putLEShort(Class40.selectedItemIndex);
				Client.outBuffer.putLEShort(Node_Sub10.chunkLeftX + var0);
				Client.outBuffer.putLEShortA(var3);
				Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
				Client.outBuffer.putShort(Class32.anInt356);
				Client.outBuffer.putLEInt(Class22.anInt286);
				Client.outBuffer.putShort(VarClientHub.chunkLeftY + var1);
			}

			if (var2 == 2) {
				Client.anInt2095 = var6;
				Client.anInt2096 = var7;
				Client.cursorState = 2;
				Client.anInt2097 = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				Client.outBuffer.putHeader(49);
				Client.outBuffer.putLEShortA(Node_Sub10.chunkLeftX + var0);
				Client.outBuffer.putLEShortA(Client.anInt2128);
				Client.outBuffer.putByteS(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
				Client.outBuffer.putInt(SequenceType.anInt1488);
				Client.outBuffer.putLEShortA(var3 >> 14 & 0x7fff);
				Client.outBuffer.putLEShortA(VarClientHub.chunkLeftY + var1);
			}

			if (var2 == 6) {
				Client.anInt2095 = var6;
				Client.anInt2096 = var7;
				Client.cursorState = 2;
				Client.anInt2097 = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				Client.outBuffer.putHeader(192);
				Client.outBuffer.putShortA(Node_Sub10.chunkLeftX + var0);
				Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
				Client.outBuffer.putShort(VarClientHub.chunkLeftY + var1);
				Client.outBuffer.putShortA(var3 >> 14 & 0x7fff);
			}

			if (var2 == 28) {
				Client.outBuffer.putHeader(80);
				Client.outBuffer.putInt(var1);
				var8 = Class94.getWidget(var1);
				if (var8.varpOpcodes != null && var8.varpOpcodes[0][0] == 5) {
					var131 = var8.varpOpcodes[0][1];
					Class94.tempVars[var131] = 1 - Class94.tempVars[var131];
					World.method484(var131);
				}
			}

			Npc var121;
			if (var2 == 10) {
				var121 = Client.npcArray[var3];
				if (var121 != null) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(133);
					Client.outBuffer.putByteC(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShort(var3);
				}
			}

			if (var2 == 35) {
				Client.outBuffer.putHeader(6);
				Client.outBuffer.putLEShort(var3);
				Client.outBuffer.putLEInt(var1);
				Client.outBuffer.putLEShort(var0);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 1005) {
				var8 = Class94.getWidget(var1);
				if (var8 != null && var8.itemQuantities[var0] >= 100000) {
					Class75.method334(27, "",
							var8.itemQuantities[var0] + " x " + FriendedPlayer.getItemType(var3).name);
				} else {
					Client.outBuffer.putHeader(158);
					Client.outBuffer.putLEShortA(var3);
				}

				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 8) {
				var121 = Client.npcArray[var3];
				if (var121 != null) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(74);
					Client.outBuffer.putLEShort(var3);
					Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putIMEInt(SequenceType.anInt1488);
					Client.outBuffer.putLEShortA(Client.anInt2128);
				}
			}

			if (var2 == 36) {
				Client.outBuffer.putHeader(72);
				Client.outBuffer.putLEShortA(var0);
				Client.outBuffer.putInt(var1);
				Client.outBuffer.putShortA(var3);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			Player var142;
			if (var2 == 47) {
				var142 = Client.playerArray[var3];
				if (var142 != null) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(83);
					Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShort(var3);
				}
			}

			if (var2 == 31) {
				Client.outBuffer.putHeader(207);
				Client.outBuffer.putLEShortA(var0);
				Client.outBuffer.putMEInt(var1);
				Client.outBuffer.putMEInt(Class22.anInt286);
				Client.outBuffer.putLEShortA(Class40.selectedItemIndex);
				Client.outBuffer.putLEShortA(Class32.anInt356);
				Client.outBuffer.putShort(var3);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 5) {
				Client.anInt2095 = var6;
				Client.anInt2096 = var7;
				Client.cursorState = 2;
				Client.anInt2097 = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				Client.outBuffer.putHeader(197);
				Client.outBuffer.putShortA(VarClientHub.chunkLeftY + var1);
				Client.outBuffer.putLEShortA(Node_Sub10.chunkLeftX + var0);
				Client.outBuffer.putShort(var3 >> 14 & 0x7fff);
				Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
			}

			if (var2 == 40) {
				Client.outBuffer.putHeader(240);
				Client.outBuffer.putLEShort(var3);
				Client.outBuffer.putLEShortA(var0);
				Client.outBuffer.putMEInt(var1);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 1) {
				Client.anInt2095 = var6;
				Client.anInt2096 = var7;
				Client.cursorState = 2;
				Client.anInt2097 = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				Client.outBuffer.putHeader(118);
				Client.outBuffer.putIMEInt(Class22.anInt286);
				Client.outBuffer.putLEShortA(var3 >> 14 & 0x7fff);
				Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
				Client.outBuffer.putLEShortA(Class32.anInt356);
				Client.outBuffer.putShortA(VarClientHub.chunkLeftY + var1);
				Client.outBuffer.putLEShortA(Node_Sub10.chunkLeftX + var0);
				Client.outBuffer.putLEShortA(Class40.selectedItemIndex);
			}

			if (var2 == 30 && Client.aWidget2135 == null) {
				FriendedPlayer.method410(var1, var0);
				Client.aWidget2135 = AbstractProducer.method146(var1, var0);
				Class68.method326(Client.aWidget2135);
			}

			if (var2 == 48) {
				var142 = Client.playerArray[var3];
				if (var142 != null) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(247);
					Client.outBuffer.putShortA(var3);
					Client.outBuffer.putByteS(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
				}
			}

			if (var2 == 37) {
				Client.outBuffer.putHeader(50);
				Client.outBuffer.putShort(var0);
				Client.outBuffer.putShortA(var3);
				Client.outBuffer.putLEInt(var1);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 33) {
				Client.outBuffer.putHeader(187);
				Client.outBuffer.putLEInt(var1);
				Client.outBuffer.putLEShort(var0);
				Client.outBuffer.putShortA(var3);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 7) {
				var121 = Client.npcArray[var3];
				if (var121 != null) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(185);
					Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShort(Class40.selectedItemIndex);
					Client.outBuffer.putMEInt(Class22.anInt286);
					Client.outBuffer.putShortA(var3);
					Client.outBuffer.putShortA(Class32.anInt356);
				}
			}

			if (var2 == 32) {
				Client.outBuffer.putHeader(30);
				Client.outBuffer.putShortA(Client.anInt2128);
				Client.outBuffer.putInt(var1);
				Client.outBuffer.putIMEInt(SequenceType.anInt1488);
				Client.outBuffer.putShort(var3);
				Client.outBuffer.putShortA(var0);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 9) {
				var121 = Client.npcArray[var3];
				if (var121 != null) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(91);
					Client.outBuffer.putByteS(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShort(var3);
				}
			}

			if (var2 == 41) {
				Client.outBuffer.putHeader(110);
				Client.outBuffer.putInt(var1);
				Client.outBuffer.putLEShort(var0);
				Client.outBuffer.putLEShortA(var3);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 51) {
				var142 = Client.playerArray[var3];
				if (var142 != null) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(243);
					Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShort(var3);
				}
			}

			if (var2 == 39) {
				Client.outBuffer.putHeader(92);
				Client.outBuffer.putLEShortA(var0);
				Client.outBuffer.putMEInt(var1);
				Client.outBuffer.putLEShortA(var3);
				Client.anInt2098 = 0;
				Class30.aWidget339 = Class94.getWidget(var1);
				Client.anInt2099 = var0;
			}

			if (var2 == 38) {
				IdentKitType.method672();
				var8 = Class94.getWidget(var1);
				Client.itemSelectionStatus = 1;
				Class40.selectedItemIndex = var0;
				Class22.anInt286 = var1;
				Class32.anInt356 = var3;
				Class68.method326(var8);
				Client.selectedItemName = Class48_Sub1.method545(16748608) + FriendedPlayer.getItemType(var3).name
						+ Class48_Sub1.method545(16777215);
				if (Client.selectedItemName == null) {
					Client.selectedItemName = "null";
				}
			} else {
				if (var2 == 17) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(7);
					Client.outBuffer.putLEShortA(Node_Sub10.chunkLeftX + var0);
					Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putIMEInt(SequenceType.anInt1488);
					Client.outBuffer.putShortA(Client.anInt2128);
					Client.outBuffer.putShort(VarClientHub.chunkLeftY + var1);
					Client.outBuffer.putLEShortA(var3);
				}

				if (var2 == 49) {
					var142 = Client.playerArray[var3];
					if (var142 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(4);
						Client.outBuffer.putByteC(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putShortA(var3);
					}
				}

				if (var2 == 1001) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(195);
					Client.outBuffer.putByteC(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShort(VarClientHub.chunkLeftY + var1);
					Client.outBuffer.putShort(var3 >> 14 & 0x7fff);
					Client.outBuffer.putShortA(Node_Sub10.chunkLeftX + var0);
				}

				if (var2 == 1003) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					var121 = Client.npcArray[var3];
					if (var121 != null) {
						NpcType var15 = var121.type;
						if (var15.transformIds != null) {
							var15 = var15.transform();
						}

						if (var15 != null) {
							Client.outBuffer.putHeader(111);
							Client.outBuffer.putLEShortA(var15.id);
						}
					}
				}

				if (var2 == 11) {
					var121 = Client.npcArray[var3];
					if (var121 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(37);
						Client.outBuffer.putShort(var3);
						Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					}
				}

				if (var2 == 1002) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.outBuffer.putHeader(249);
					Client.outBuffer.putLEShortA(var3 >> 14 & 0x7fff);
				}

				if (var2 == 22) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(109);
					Client.outBuffer.putShortA(Node_Sub10.chunkLeftX + var0);
					Client.outBuffer.putLEShort(VarClientHub.chunkLeftY + var1);
					Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShort(var3);
				}

				if (var2 == 13) {
					var121 = Client.npcArray[var3];
					if (var121 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(100);
						Client.outBuffer.putShort(var3);
						Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					}
				}

				if (var2 == 44) {
					var142 = Client.playerArray[var3];
					if (var142 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(234);
						Client.outBuffer.putByteS(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putShortA(var3);
					}
				}

				if (var2 == 20) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(223);
					Client.outBuffer.putLEShortA(var3);
					Client.outBuffer.putShortA(Node_Sub10.chunkLeftX + var0);
					Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putLEShortA(VarClientHub.chunkLeftY + var1);
				}

				if (var2 == 45) {
					var142 = Client.playerArray[var3];
					if (var142 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(35);
						Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putShort(var3);
					}
				}

				if (var2 == 29) {
					Client.outBuffer.putHeader(80);
					Client.outBuffer.putInt(var1);
					var8 = Class94.getWidget(var1);
					if (var8.varpOpcodes != null && var8.varpOpcodes[0][0] == 5) {
						var131 = var8.varpOpcodes[0][1];
						if (Class94.tempVars[var131] != var8.anIntArray1168[0]) {
							Class94.tempVars[var131] = var8.anIntArray1168[0];
							World.method484(var131);
						}
					}
				}

				if (var2 == 15) {
					var142 = Client.playerArray[var3];
					if (var142 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(8);
						Client.outBuffer.putByteC(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putShortA(Client.anInt2128);
						Client.outBuffer.putShort(var3);
						Client.outBuffer.putInt(SequenceType.anInt1488);
					}
				}

				if (var2 == 50) {
					var142 = Client.playerArray[var3];
					if (var142 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(224);
						Client.outBuffer.putByteS(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putShort(var3);
					}
				}

				if (var2 == 58) {
					var8 = AbstractProducer.method146(var1, var0);
					if (var8 != null) {
						Client.outBuffer.putHeader(61);
						Client.outBuffer.putShort(var0);
						Client.outBuffer.putLEShortA(Client.anInt2129);
						Client.outBuffer.putMEInt(SequenceType.anInt1488);
						Client.outBuffer.putLEInt(var1);
						Client.outBuffer.putShort(var8.itemId);
						Client.outBuffer.putLEShortA(Client.anInt2128);
					}
				}

				if (var2 == 19) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(27);
					Client.outBuffer.putShortA(VarClientHub.chunkLeftY + var1);
					Client.outBuffer.putShort(Node_Sub10.chunkLeftX + var0);
					Client.outBuffer.putLEShortA(var3);
					Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
				}

				if (var2 == 14) {
					var142 = Client.playerArray[var3];
					if (var142 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(106);
						Client.outBuffer.putLEShortA(Class32.anInt356);
						Client.outBuffer.putIMEInt(Class22.anInt286);
						Client.outBuffer.putLEShortA(Class40.selectedItemIndex);
						Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putLEShort(var3);
					}
				}

				if (var2 == 12) {
					var121 = Client.npcArray[var3];
					if (var121 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(218);
						Client.outBuffer.putByteA(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putShortA(var3);
					}
				}

				if (var2 == 4) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(147);
					Client.outBuffer.putLEShort(VarClientHub.chunkLeftY + var1);
					Client.outBuffer.putLEShort(var3 >> 14 & 0x7fff);
					Client.outBuffer.putByteC(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putShortA(Node_Sub10.chunkLeftX + var0);
				}

				if (var2 == 46) {
					var142 = Client.playerArray[var3];
					if (var142 != null) {
						Client.anInt2095 = var6;
						Client.anInt2096 = var7;
						Client.cursorState = 2;
						Client.anInt2097 = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						Client.outBuffer.putHeader(10);
						Client.outBuffer.putByteS(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
						Client.outBuffer.putShort(var3);
					}
				}

				if (var2 == 26) {
					IsaacRandom.method63();
				}

				if (var2 == 3) {
					Client.anInt2095 = var6;
					Client.anInt2096 = var7;
					Client.cursorState = 2;
					Client.anInt2097 = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					Client.outBuffer.putHeader(202);
					Client.outBuffer.putByte(KeyFocusListener.aBoolArray593[82] ? 1 : 0);
					Client.outBuffer.putLEShortA(var3 >> 14 & 0x7fff);
					Client.outBuffer.putShortA(Node_Sub10.chunkLeftX + var0);
					Client.outBuffer.putShort(VarClientHub.chunkLeftY + var1);
				}

				if (Client.itemSelectionStatus != 0) {
					Client.itemSelectionStatus = 0;
					Class68.method326(Class94.getWidget(Class22.anInt286));
				}

				if (Client.spellSelected) {
					IdentKitType.method672();
				}

				if (Class30.aWidget339 != null && Client.anInt2098 == 0) {
					Class68.method326(Class30.aWidget339);
				}
			}
		}

	}

}
