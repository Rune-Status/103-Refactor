import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public class Class58 {

	static int[][] anIntArrayArray543 = new int[128][128];
	static int[] anIntArray544 = new int[4096];
	static int anInt545;
	static int[][] anIntArrayArray546 = new int[128][128];
	static int[] anIntArray547 = new int[4096];

	public static String method288(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var5 = new StringBuilder(var1);

		for (int var4 = 0; var4 < var1; ++var4) {
			char var2 = var0.charAt(var4);
			if ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 46
					&& var2 != 45 && var2 != 42 && var2 != 95) {
				if (var2 == 32) {
					var5.append('+');
				} else {
					byte var3 = IgnoredPlayer.method414(var2);
					var5.append('%');
					int var6 = var3 >> 4 & 15;
					if (var6 >= 10) {
						var5.append((char) (55 + var6));
					} else {
						var5.append((char) (48 + var6));
					}

					var6 = var3 & 15;
					if (var6 >= 10) {
						var5.append((char) (var6 + 55));
					} else {
						var5.append((char) (var6 + 48));
					}
				}
			} else {
				var5.append(var2);
			}
		}

		return var5.toString();
	}

	public static final boolean method289(int var0) {
		Class71 var1 = Class71.aClass71_603;
		synchronized (var1) {
			if (-103725771 * Class71.anInt599 == Class71.anInt600 * -831835767) {
				return false;
			} else {
				Class5.anInt112 = -1084221539 * Class71.anIntArray598[-103725771 * Class71.anInt599];
				Class2.aChar80 = Class71.aCharArray597[-103725771 * Class71.anInt599];
				Class71.anInt599 = (1 + -103725771 * Class71.anInt599 & 127) * 821077277;
				return true;
			}
		}
	}

	public static int getCrc(byte[] bytes, int offset, int length) {
		int val = -1;

		for (int index = offset; index < length; ++index) {
			val = val >>> 8 ^ ByteBuf.crc32Table[(val ^ bytes[index]) & 255];
		}

		val = ~val;
		return val;
	}

	static final void processLogin() {
		try {
			if (Client.connectionState * -1250195825 == 0) {
				if (Class31.gameConnection != null) {
					Class31.gameConnection.shutdown();
					Class31.gameConnection = null;
				}

				Class71.aClass61_589 = null;
				Client.aBool2102 = false;
				Client.anInt2180 = 0;
				Client.connectionState = 1066981487;
			}

			if (Client.connectionState * -1250195825 == 1) {
				if (Class71.aClass61_589 == null) {
					Class71.aClass61_589 = IsaacRandom.aClass63_102.method311(World.myWorldDomain,
							Class24.anInt299 * 2028673991);
				}

				if (Class71.aClass61_589.anInt563 == 2) {
					throw new IOException();
				}

				if (Class71.aClass61_589.anInt563 == 1) {
					Class31.gameConnection = new Connection((Socket) Class71.aClass61_589.anObject566,
							IsaacRandom.aClass63_102);
					Class71.aClass61_589 = null;
					Client.connectionState = 2133962974;
				}
			}

			if (-1250195825 * Client.connectionState == 2) {
				Client.outBuffer.position = 0;
				Client.outBuffer.putByte(14);
				Class31.gameConnection.write(Client.outBuffer.payload, 0, 1);
				Client.inBuffer.position = 0;
				Client.connectionState = -1094022835;
			}

			int var0;
			if (Client.connectionState * -1250195825 == 3) {
				if (DualNode_Sub14.aClass8_1644 != null) {
					DualNode_Sub14.aClass8_1644.method92();
				}

				if (Class30.aClass8_341 != null) {
					Class30.aClass8_341.method92();
				}

				var0 = Class31.gameConnection.method299();
				if (DualNode_Sub14.aClass8_1644 != null) {
					DualNode_Sub14.aClass8_1644.method92();
				}

				if (Class30.aClass8_341 != null) {
					Class30.aClass8_341.method92();
				}

				if (var0 != 0) {
					ObjectType.method869(var0);
					return;
				}

				Client.inBuffer.position = 0;
				Client.connectionState = 1039940139;
			}

			int varStart;
			int xteaStart;
			if (Client.connectionState * -1250195825 == 5) {
				int[] xteaKeys = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				Client.outBuffer.position = 0;
				Client.outBuffer.putByte(1);
				Client.outBuffer.putByte(Class6.aClass92_119.method11(-1757328916));
				Client.outBuffer.putInt(xteaKeys[0]);
				Client.outBuffer.putInt(xteaKeys[1]);
				Client.outBuffer.putInt(xteaKeys[2]);
				Client.outBuffer.putInt(xteaKeys[3]);
				switch (Class6.aClass92_119.anInt728 * -1271929127) {
				case 0:
					Client.outBuffer.position += -1473404712;
					break;
				case 1:
					Client.outBuffer.putInt(((Integer) Node_Sub5.aClass24_1265.aLinkedHashMap301
							.get(Integer.valueOf(Class91.method400(Class6.aString136)))).intValue());
					Client.outBuffer.position += -736702356;
					break;
				case 2:
				case 3:
					Client.outBuffer.putMedium(-898452655 * Class114.anInt795);
					Client.outBuffer.position += -920877945;
				}

				Client.outBuffer.putString(Class6.aString123);
				Client.outBuffer.encryptRSA(Class40.loginExponent, Class40.loginModulus);
				Client.aPacketBuffer2115.position = 0;
				if (Client.anInt2113 * 846055547 == 40) {
					Client.aPacketBuffer2115.putByte(18);
				} else {
					Client.aPacketBuffer2115.putByte(16);
				}

				Client.aPacketBuffer2115.putShort(0);
				varStart = Client.aPacketBuffer2115.position * 314639891;
				Client.aPacketBuffer2115.putInt(103);
				Client.aPacketBuffer2115.putBytes(Client.outBuffer.payload, 0, 314639891 * Client.outBuffer.position);
				xteaStart = 314639891 * Client.aPacketBuffer2115.position;
				Client.aPacketBuffer2115.putString(Class6.aString136);
				Client.aPacketBuffer2115.putByte((Client.resizable ? 1 : 0) << 1 | (Client.aBool2010 ? 1 : 0));
				Client.aPacketBuffer2115.putShort(-452716157 * Class34.gameWidth);
				Client.aPacketBuffer2115.putShort(Node_Sub9.gameHeight * 674167779);
				BitBuf var3 = Client.aPacketBuffer2115;
				byte[] var4 = new byte[24];

				int var5;
				try {
					Class75.randomDat.seek(0L);
					Class75.randomDat.read(var4);

					for (var5 = 0; var5 < 24 && var4[var5] == 0; ++var5) {
						;
					}

					if (var5 >= 24) {
						throw new IOException();
					}
				} catch (Exception var9) {
					for (int var6 = 0; var6 < 24; ++var6) {
						var4[var6] = -1;
					}
				}

				var3.putBytes(var4, 0, 24);
				Client.aPacketBuffer2115.putString(Client.aString2013);
				Client.aPacketBuffer2115.putInt(-1929163163 * InterfaceNode.anInt1399);
				ByteBuf var19 = new ByteBuf(IdentKitType.aNode_Sub10_1467.method567());
				IdentKitType.aNode_Sub10_1467.method566(var19);
				Client.aPacketBuffer2115.putBytes(var19.payload, 0, var19.payload.length);
				Client.aPacketBuffer2115.putByte(Class29.anInt335 * -1296445677);
				Client.aPacketBuffer2115.putInt(Class34.skeletonsIndex.anInt695 * 1153748675);
				Client.aPacketBuffer2115.putInt(Client.meshesIndex.anInt695 * 1153748675);
				Client.aPacketBuffer2115.putInt(1153748675 * Client.configsIndex.anInt695);
				Client.aPacketBuffer2115.putInt(1153748675 * RuneScript.interfaceIndex.anInt695);
				Client.aPacketBuffer2115.putInt(1153748675 * VarClientType.sfxIndex.anInt695);
				Client.aPacketBuffer2115.putInt(Class48_Sub1.landscapesIndex.anInt695 * 1153748675);
				Client.aPacketBuffer2115.putInt(1153748675 * Class2.midiTrack1Index.anInt695);
				Client.aPacketBuffer2115.putInt(1153748675 * Class3.modelsIndex.anInt695);
				Client.aPacketBuffer2115.putInt(Node_Sub5.spritesIndex.anInt695 * 1153748675);
				Client.aPacketBuffer2115.putInt(1153748675 * Class1.texturesIndex.anInt695);
				Client.aPacketBuffer2115.putInt(Class40.binaryIndex.anInt695 * 1153748675);
				Client.aPacketBuffer2115.putInt(PlayerConfig.midiTack2Index.anInt695 * 1153748675);
				Client.aPacketBuffer2115.putInt(1153748675 * InvType.clientScriptsIndex.anInt695);
				Client.aPacketBuffer2115.putInt(Class2.fontMetricsIndex.anInt695 * 1153748675);
				Client.aPacketBuffer2115.putInt(1153748675 * Class26.vorbisIndex.anInt695);
				Client.aPacketBuffer2115.putInt(1153748675 * Class59.midiInstrumentsIndex.anInt695);
				Client.aPacketBuffer2115.encryptXTEA(xteaKeys, xteaStart,
						314639891 * Client.aPacketBuffer2115.position);
				Client.aPacketBuffer2115.putVarShort(Client.aPacketBuffer2115.position * 314639891 - varStart);
				Class31.gameConnection.write(Client.aPacketBuffer2115.payload, 0,
						Client.aPacketBuffer2115.position * 314639891);
				Client.outBuffer.setRandom(xteaKeys);

				for (var5 = 0; var5 < 4; ++var5) {
					xteaKeys[var5] += 50;
				}

				Client.inBuffer.setRandom(xteaKeys);
				Client.connectionState = 2106921626;
			}

			if (-1250195825 * Client.connectionState == 6 && Class31.gameConnection.avail() > 0) {
				var0 = Class31.gameConnection.method299();
				if (var0 == 21 && Client.anInt2113 * 846055547 == 20) {
					Client.connectionState = -1121064183;
				} else if (var0 == 2) {
					Client.connectionState = 1012898791;
				} else if (var0 == 15 && Client.anInt2113 * 846055547 == 40) {
					Client.frameSize = -260863215;
					Client.connectionState = 985857443;
				} else if (var0 == 23 && Client.anInt2037 * 288795893 < 1) {
					Client.anInt2037 += -260333731;
					Client.connectionState = 0;
				} else {
					if (var0 != 29) {
						ObjectType.method869(var0);
						return;
					}

					Client.connectionState = -1148105531;
				}
			}

			if (Client.connectionState * -1250195825 == 7 && Class31.gameConnection.avail() > 0) {
				Client.anInt2034 = (Class31.gameConnection.method299() + 3) * -1985668988;
				Client.connectionState = -54082696;
			}

			if (Client.connectionState * -1250195825 == 8) {
				Client.anInt2180 = 0;
				GPI.method230(GameStrings.aString879, GameStrings.aString880,
						Client.anInt2034 * -119005137 / 60 + GameStrings.aString1078);
				if ((Client.anInt2034 -= -534174001) * -119005137 <= 0) {
					Client.connectionState = 0;
				}

			} else {
				if (-1250195825 * Client.connectionState == 9 && Class31.gameConnection.avail() >= 13) {
					boolean var12 = Class31.gameConnection.method299() == 1;
					Class31.gameConnection.read(Client.inBuffer.payload, 0, 4);
					Client.inBuffer.position = 0;
					boolean var13 = false;
					if (var12) {
						varStart = Client.inBuffer.getHeader() << 24;
						varStart |= Client.inBuffer.getHeader() << 16;
						varStart |= Client.inBuffer.getHeader() << 8;
						varStart |= Client.inBuffer.getHeader();
						xteaStart = Class91.method400(Class6.aString136);
						if (Node_Sub5.aClass24_1265.aLinkedHashMap301.size() >= 10
								&& !Node_Sub5.aClass24_1265.aLinkedHashMap301.containsKey(Integer.valueOf(xteaStart))) {
							Iterator var17 = Node_Sub5.aClass24_1265.aLinkedHashMap301.entrySet().iterator();
							var17.next();
							var17.remove();
						}

						Node_Sub5.aClass24_1265.aLinkedHashMap301.put(Integer.valueOf(xteaStart),
								Integer.valueOf(varStart));
						Class75.method335();
					}

					Client.myRights = Class31.gameConnection.method299() * -753281333;
					Client.aBool2179 = Class31.gameConnection.method299() == 1;
					Client.myPlayerIndex = Class31.gameConnection.method299() * -313169887;
					Client.myPlayerIndex = -313169887 * (Client.myPlayerIndex * 1467227105 << 8);
					Client.myPlayerIndex += Class31.gameConnection.method299() * -313169887;
					Client.anInt2106 = Class31.gameConnection.method299() * 1163065535;
					Class31.gameConnection.read(Client.inBuffer.payload, 0, 1);
					Client.inBuffer.position = 0;
					Client.frameId = Client.inBuffer.getHeader() * 726667601;
					Class31.gameConnection.read(Client.inBuffer.payload, 0, 2);
					Client.inBuffer.position = 0;
					Client.frameSize = Client.inBuffer.getUShort() * 260863215;
					Client var15;
					if (-905152705 * Client.anInt2106 == 1) {
						try {
							var15 = Client.aClient2005;
							JSObject.getWindow(var15).call("zap", (Object[]) null);
						} catch (Throwable var8) {
							;
						}
					} else {
						try {
							var15 = Client.aClient2005;
							JSObject.getWindow(var15).call("unzap", (Object[]) null);
						} catch (Throwable var7) {
							;
						}
					}

					Client.connectionState = 2079880278;
				}

				if (Client.connectionState * -1250195825 == 10) {
					if (Class31.gameConnection.avail() >= Client.frameSize * 371800591) {
						Client.inBuffer.position = 0;
						Class31.gameConnection.read(Client.inBuffer.payload, 0, Client.frameSize * 371800591);
						Class76.clearCache();
						ItemTable.method649(Client.inBuffer);
						TileDecorationStub.anInt840 = -1071803165;
						Class7.decodeMapRegion(false);
						Client.frameId = -726667601;
					}

				} else {
					if (-1250195825 * Client.connectionState == 11 && Class31.gameConnection.avail() >= 2) {
						Client.inBuffer.position = 0;
						Class31.gameConnection.read(Client.inBuffer.payload, 0, 2);
						Client.inBuffer.position = 0;
						Class31.anInt352 = Client.inBuffer.getUShort() * 542937605;
						Client.connectionState = -81124044;
					}

					if (-1250195825 * Client.connectionState == 12
							&& Class31.gameConnection.avail() >= Class31.anInt352 * 1528130253) {
						Client.inBuffer.position = 0;
						Class31.gameConnection.read(Client.inBuffer.payload, 0, Class31.anInt352 * 1528130253);
						Client.inBuffer.position = 0;
						String var14 = Client.inBuffer.getString();
						String var16 = Client.inBuffer.getString();
						String var18 = Client.inBuffer.getString();
						GPI.method230(var14, var16, var18);
						Node_Sub8.method550(10);
					}

					if (-1250195825 * Client.connectionState == 13) {
						if (371800591 * Client.frameSize == -1) {
							if (Class31.gameConnection.avail() < 2) {
								return;
							}

							Class31.gameConnection.read(Client.inBuffer.payload, 0, 2);
							Client.inBuffer.position = 0;
							Client.frameSize = Client.inBuffer.getUShort() * 260863215;
						}

						if (Class31.gameConnection.avail() >= 371800591 * Client.frameSize) {
							Class31.gameConnection.read(Client.inBuffer.payload, 0, Client.frameSize * 371800591);
							Client.inBuffer.position = 0;
							var0 = 371800591 * Client.frameSize;
							Class37.method214();
							ItemTable.method649(Client.inBuffer);
							if (var0 != Client.inBuffer.position * 314639891) {
								throw new RuntimeException();
							}
						}
					} else {
						Client.anInt2180 += 995944239;
						if (Client.anInt2180 * 766230479 > 2000) {
							if (288795893 * Client.anInt2037 < 1) {
								if (Class24.anInt299 * 2028673991 == Class82.anInt686 * 809635993) {
									Class24.anInt299 = 715804305 * Class41.anInt446;
								} else {
									Class24.anInt299 = Class82.anInt686 * 1439019167;
								}

								Client.anInt2037 += -260333731;
								Client.connectionState = 0;
							} else {
								ObjectType.method869(-3);
							}
						}
					}
				}
			}
		} catch (IOException var10) {
			if (288795893 * Client.anInt2037 < 1) {
				if (2028673991 * Class24.anInt299 == 809635993 * Class82.anInt686) {
					Class24.anInt299 = 715804305 * Class41.anInt446;
				} else {
					Class24.anInt299 = 1439019167 * Class82.anInt686;
				}

				Client.anInt2037 += -260333731;
				Client.connectionState = 0;
			} else {
				ObjectType.method869(-2);
			}
		}
	}

	public static boolean method291(int var0) {
		return (var0 >> 29 & 1) != 0;
	}

	Class58() throws Throwable {
		throw new Error();
	}
}
