import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public class LoginHandler {

	static int anInt545;
	static int[][] anIntArrayArray543 = new int[128][128];
	static int[] anIntArray544 = new int[4096];
	static int[][] anIntArrayArray546 = new int[128][128];
	static int[] anIntArray547 = new int[4096];

	public static String method288(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var5 = new StringBuilder(var1);

		for (int var4 = 0; var4 < var1; var4++) {
			char var2 = var0.charAt(var4);
			if ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 46
					&& var2 != 45 && var2 != 42 && var2 != 95) {
				if (var2 == 32) {
					var5.append('+');
				} else {
					byte var3 = IgnoredPlayer.method414(var2);
					var5.append('%');
					int var6 = var3 >> 4 & 0xf;
					if (var6 >= 10) {
						var5.append((char) (var6 + 55));
					} else {
						var5.append((char) (var6 + 48));
					}

					var6 = var3 & 0xf;
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
		KeyFocusListener var1 = KeyFocusListener.kfListener;
		synchronized (var1) {
			if (KeyFocusListener.anInt599 == KeyFocusListener.anInt600) {
				return false;
			} else {
				Class5.anInt112 = KeyFocusListener.anIntArray598[KeyFocusListener.anInt599];
				Class2.aChar80 = KeyFocusListener.aCharArray597[KeyFocusListener.anInt599];
				KeyFocusListener.anInt599 = KeyFocusListener.anInt599 + 1 & 0x7f;
				return true;
			}
		}
	}

	public static int getCrc(byte[] bytes, int offset, int length) {
		int val = -1;

		for (int index = offset; index < length; index++) {
			val = val >>> 8 ^ ByteBuf.crc32Table[(bytes[index] ^ val) & 0xff];
		}

		val = ~val;
		return val;
	}

	static final void processLogin() {
		try {
			if (Client.connectionState == 0) {
				if (Class31.gameConnection != null) {
					Class31.gameConnection.shutdown();
					Class31.gameConnection = null;
				}

				KeyFocusListener.socket = null;
				Client.socketError = false;
				Client.anInt2180 = 0;
				Client.connectionState = 1;
			}

			if (Client.connectionState == 1) {
				if (KeyFocusListener.socket == null) {
					KeyFocusListener.socket = IsaacRandom.taskManager.createSocket(World.myWorldDomain,
							ClientSettings.myWorldPort);
				}

				if (KeyFocusListener.socket.status == 2) {
					throw new IOException();
				}

				if (KeyFocusListener.socket.status == 1) {
					Class31.gameConnection = new Connection((Socket) KeyFocusListener.socket.value,
							IsaacRandom.taskManager);
					KeyFocusListener.socket = null;
					Client.connectionState = 2;
				}
			}

			if (Client.connectionState == 2) {
				Client.outBuffer.position = 0;
				Client.outBuffer.putByte(14);
				Class31.gameConnection.write(Client.outBuffer.payload, 0, 1);
				Client.inBuffer.position = 0;
				Client.connectionState = 3;
			}

			int var10;
			if (Client.connectionState == 3) {
				if (DualNode_Sub14.aClass8_1644 != null) {
					DualNode_Sub14.aClass8_1644.method92();
				}

				if (Class30.aClass8_341 != null) {
					Class30.aClass8_341.method92();
				}

				var10 = Class31.gameConnection.read();
				if (DualNode_Sub14.aClass8_1644 != null) {
					DualNode_Sub14.aClass8_1644.method92();
				}

				if (Class30.aClass8_341 != null) {
					Class30.aClass8_341.method92();
				}

				if (var10 != 0) {
					ObjectType.method869(var10);
					return;
				}

				Client.inBuffer.position = 0;
				Client.connectionState = 5;
			}

			int varStart;
			int xteaStart;
			if (Client.connectionState == 5) {
				int[] var14 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				Client.outBuffer.position = 0;
				Client.outBuffer.putByte(1);
				Client.outBuffer.putByte(PlayerLoginDetails.blockType.ordinal());
				Client.outBuffer.putInt(var14[0]);
				Client.outBuffer.putInt(var14[1]);
				Client.outBuffer.putInt(var14[2]);
				Client.outBuffer.putInt(var14[3]);
				switch (PlayerLoginDetails.blockType.type) {
				case 0:
					Client.outBuffer.position += 8;
					break;
				case 1:
					Client.outBuffer.putInt(((Integer) AnimationSkin.settings.trustList
							.get(Integer.valueOf(Class91.bkdrHash(PlayerLoginDetails.username)))).intValue());
					Client.outBuffer.position += 4;
					break;
				case 2:
				case 3:
					Client.outBuffer.putMedium(Class114.pin);
					Client.outBuffer.position += 5;
				}

				Client.outBuffer.putString(PlayerLoginDetails.password);
				Client.outBuffer.encryptRSA(Class40.loginExponent, Class40.loginModulus);
				Client.loginBuffer.position = 0;
				if (Client.clientState == 40) {
					Client.loginBuffer.putByte(18);
				} else {
					Client.loginBuffer.putByte(16);
				}

				Client.loginBuffer.putShort(0);
				varStart = Client.loginBuffer.position;
				Client.loginBuffer.putInt(103);
				Client.loginBuffer.putBytes(Client.outBuffer.payload, 0, Client.outBuffer.position);
				xteaStart = Client.loginBuffer.position;
				Client.loginBuffer.putString(PlayerLoginDetails.username);
				Client.loginBuffer.putByte((Client.resizable ? 1 : 0) << 1 | (Client.lowMemory ? 1 : 0));
				Client.loginBuffer.putShort(Class34.gameWidth);
				Client.loginBuffer.putShort(Node_Sub9.gameHeight);
				BitBuf var16 = Client.loginBuffer;
				byte[] var18 = new byte[24];

				int var5;
				try {
					Class75.randomDat.seek(0L);
					Class75.randomDat.read(var18);

					for (var5 = 0; var5 < 24 && var18[var5] == 0; var5++) {
						;
					}

					if (var5 >= 24) {
						throw new IOException();
					}
				} catch (Exception var11) {
					for (int var6 = 0; var6 < 24; var6++) {
						var18[var6] = -1;
					}
				}

				var16.putBytes(var18, 0, 24);
				Client.loginBuffer.putString(Client.sessionToken);
				Client.loginBuffer.putInt(InterfaceNode.anInt1399);
				ByteBuf var19 = new ByteBuf(IdentKitType.aNode_Sub10_1467.method567());
				IdentKitType.aNode_Sub10_1467.method566(var19);
				Client.loginBuffer.putBytes(var19.payload, 0, var19.payload.length);
				Client.loginBuffer.putByte(TextureLoader.sessionId);
				Client.loginBuffer.putInt(Class34.skeletonsIndex.crc);
				Client.loginBuffer.putInt(Client.meshesIndex.crc);
				Client.loginBuffer.putInt(Client.configsIndex.crc);
				Client.loginBuffer.putInt(RuneScript.interfaceIndex.crc);
				Client.loginBuffer.putInt(VarClientType.sfxIndex.crc);
				Client.loginBuffer.putInt(Class48_Sub1.landscapesIndex.crc);
				Client.loginBuffer.putInt(Class2.midiTrack1Index.crc);
				Client.loginBuffer.putInt(Class3.modelsIndex.crc);
				Client.loginBuffer.putInt(AnimationSkin.spritesIndex.crc);
				Client.loginBuffer.putInt(Class1.texturesIndex.crc);
				Client.loginBuffer.putInt(Class40.binaryIndex.crc);
				Client.loginBuffer.putInt(PlayerConfig.midiTack2Index.crc);
				Client.loginBuffer.putInt(InvType.clientScriptsIndex.crc);
				Client.loginBuffer.putInt(Class2.fontMetricsIndex.crc);
				Client.loginBuffer.putInt(Class26.vorbisIndex.crc);
				Client.loginBuffer.putInt(Class59.midiInstrumentsIndex.crc);
				Client.loginBuffer.encryptXTEA(var14, xteaStart, Client.loginBuffer.position);
				Client.loginBuffer.putVarShort(Client.loginBuffer.position - varStart);
				Class31.gameConnection.write(Client.loginBuffer.payload, 0, Client.loginBuffer.position);
				Client.outBuffer.setRandom(var14);

				for (var5 = 0; var5 < 4; var5++) {
					var14[var5] += 50;
				}

				Client.inBuffer.setRandom(var14);
				Client.connectionState = 6;
			}

			if (Client.connectionState == 6 && Class31.gameConnection.avail() > 0) {
				var10 = Class31.gameConnection.read();
				if (var10 == 21 && Client.clientState == 20) {
					Client.connectionState = 7;
				} else if (var10 == 2) {
					Client.connectionState = 9;
				} else if (var10 == 15 && Client.clientState == 40) {
					Client.frameSize = -1;
					Client.connectionState = 13;
				} else if (var10 == 23 && Client.anInt2037 < 1) {
					++Client.anInt2037;
					Client.connectionState = 0;
				} else {
					if (var10 != 29) {
						ObjectType.method869(var10);
						return;
					}

					Client.connectionState = 11;
				}
			}

			if (Client.connectionState == 7 && Class31.gameConnection.avail() > 0) {
				Client.transferTime = (Class31.gameConnection.read() + 3) * 60;
				Client.connectionState = 8;
			}

			if (Client.connectionState == 8) {
				Client.anInt2180 = 0;
				GPI.method230("You have only just left another world.", "Your profile will be transferred in:",
						Client.transferTime / 60 + " seconds.");
				if (--Client.transferTime <= 0) {
					Client.connectionState = 0;
				}
			} else {
				if (Client.connectionState == 9 && Class31.gameConnection.avail() >= 13) {
					boolean var13 = Class31.gameConnection.read() == 1;
					Class31.gameConnection.read(Client.inBuffer.payload, 0, 4);
					Client.inBuffer.position = 0;
					if (var13) {
						varStart = Client.inBuffer.getHeader() << 24;
						varStart |= Client.inBuffer.getHeader() << 16;
						varStart |= Client.inBuffer.getHeader() << 8;
						varStart |= Client.inBuffer.getHeader();
						xteaStart = Class91.bkdrHash(PlayerLoginDetails.username);
						if (AnimationSkin.settings.trustList.size() >= 10
								&& !AnimationSkin.settings.trustList.containsKey(Integer.valueOf(xteaStart))) {
							Iterator var15 = AnimationSkin.settings.trustList.entrySet().iterator();
							var15.next();
							var15.remove();
						}

						AnimationSkin.settings.trustList.put(Integer.valueOf(xteaStart), Integer.valueOf(varStart));
						Class75.serializeSettings();
					}

					Client.myRights = Class31.gameConnection.read();
					Client.aBool2179 = Class31.gameConnection.read() == 1;
					Client.myPlayerIndex = Class31.gameConnection.read();
					Client.myPlayerIndex <<= 8;
					Client.myPlayerIndex += Class31.gameConnection.read();
					Client.anInt2106 = Class31.gameConnection.read();
					Class31.gameConnection.read(Client.inBuffer.payload, 0, 1);
					Client.inBuffer.position = 0;
					Client.frameId = Client.inBuffer.getHeader();
					Class31.gameConnection.read(Client.inBuffer.payload, 0, 2);
					Client.inBuffer.position = 0;
					Client.frameSize = Client.inBuffer.getUShort();
					Client var161;
					if (Client.anInt2106 == 1) {
						try {
							var161 = Client.clientInstance;
							JSObject.getWindow(var161).call("zap", (Object[]) null);
						} catch (Throwable var101) {
							;
						}
					} else {
						try {
							var161 = Client.clientInstance;
							JSObject.getWindow(var161).call("unzap", (Object[]) null);
						} catch (Throwable var9) {
							;
						}
					}

					Client.connectionState = 10;
				}

				if (Client.connectionState == 10) {
					if (Class31.gameConnection.avail() >= Client.frameSize) {
						Client.inBuffer.position = 0;
						Class31.gameConnection.read(Client.inBuffer.payload, 0, Client.frameSize);
						BuildType.clearCache();
						ItemTable.initializeGPI(Client.inBuffer);
						TileDecorationStub.chunkBaseX = -1;
						Class7.decodeMapRegion(false);
						Client.frameId = -1;
					}
				} else {
					if (Client.connectionState == 11 && Class31.gameConnection.avail() >= 2) {
						Client.inBuffer.position = 0;
						Class31.gameConnection.read(Client.inBuffer.payload, 0, 2);
						Client.inBuffer.position = 0;
						Class31.anInt352 = Client.inBuffer.getUShort();
						Client.connectionState = 12;
					}

					if (Client.connectionState == 12 && Class31.gameConnection.avail() >= Class31.anInt352) {
						Client.inBuffer.position = 0;
						Class31.gameConnection.read(Client.inBuffer.payload, 0, Class31.anInt352);
						Client.inBuffer.position = 0;
						String var141 = Client.inBuffer.getString();
						String var17 = Client.inBuffer.getString();
						String var181 = Client.inBuffer.getString();
						GPI.method230(var141, var17, var181);
						Node_Sub8.setClientState(10);
					}

					if (Client.connectionState == 13) {
						if (Client.frameSize == -1) {
							if (Class31.gameConnection.avail() < 2) {
								return;
							}

							Class31.gameConnection.read(Client.inBuffer.payload, 0, 2);
							Client.inBuffer.position = 0;
							Client.frameSize = Client.inBuffer.getUShort();
						}

						if (Class31.gameConnection.avail() >= Client.frameSize) {
							Class31.gameConnection.read(Client.inBuffer.payload, 0, Client.frameSize);
							Client.inBuffer.position = 0;
							var10 = Client.frameSize;
							Class37.method214();
							ItemTable.initializeGPI(Client.inBuffer);
							if (Client.inBuffer.position != var10) {
								throw new RuntimeException();
							}
						}
					} else {
						++Client.anInt2180;
						if (Client.anInt2180 > 2000) {
							if (Client.anInt2037 < 1) {
								if (ClientSettings.myWorldPort == Class82.mainPort) {
									ClientSettings.myWorldPort = Class41.subPort;
								} else {
									ClientSettings.myWorldPort = Class82.mainPort;
								}

								++Client.anInt2037;
								Client.connectionState = 0;
							} else {
								ObjectType.method869(-3);
							}
						}
					}
				}
			}
		} catch (IOException var12) {
			if (Client.anInt2037 < 1) {
				if (ClientSettings.myWorldPort == Class82.mainPort) {
					ClientSettings.myWorldPort = Class41.subPort;
				} else {
					ClientSettings.myWorldPort = Class82.mainPort;
				}

				++Client.anInt2037;
				Client.connectionState = 0;
			} else {
				ObjectType.method869(-2);
			}
		}

	}

	public static boolean method291(int var0) {
		return (var0 >> 29 & 0x1) != 0;
	}

	LoginHandler() throws Throwable {
		throw new Error();
	}

}
