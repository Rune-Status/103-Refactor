public class World {

	String activity;
	static World[] worlds;
	int index;
	int flags;
	int population;
	String domain;
	int location;
	static String myWorldDomain;
	int id;
	static int[] anIntArray1118 = new int[] { 0, 1, 2, 3 };
	static int worldCount = 0;
	static int[] anIntArray1119 = new int[] { 1, 1, 1, 1 };
	static int anInt1121 = 0;

	boolean method477() {
		return (this.flags & 0x1) != 0;
	}

	boolean method478() {
		return (this.flags & 0x2) != 0;
	}

	boolean method479() {
		return (this.flags & 0x4) != 0;
	}

	boolean method480() {
		return (this.flags & 0x8) != 0;
	}

	boolean method481() {
		return (this.flags & 0x20000000) != 0;
	}

	public static int method482(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	static final void decodeLocationUpdates(BitBuf buf) {
		int skipCount = 0;
		buf.bitAccess();

		int playerIndex;
		int index;
		int update;
		for (index = 0; index < GPI.localPlayerCount; index++) {
			playerIndex = GPI.localPlayerIndices[index];
			if ((GPI.skipFlags[playerIndex] & 0x1) == 0) {
				if (skipCount > 0) {
					--skipCount;
					GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
				} else {
					update = buf.getBits(1);
					if (update == 0) {
						skipCount = VarClientType.decodeSkipCount(buf);
						System.out.println("Count: " + skipCount);
						GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
					} else {
						Player.decodeMovement(buf, playerIndex);
					}
				}
			}
		}

		buf.byteAccess();
		if (skipCount != 0) {
			throw new RuntimeException();
		} else {
			buf.bitAccess();

			for (index = 0; index < GPI.localPlayerCount; index++) {
				playerIndex = GPI.localPlayerIndices[index];
				if ((GPI.skipFlags[playerIndex] & 0x1) != 0) {
					if (skipCount > 0) {
						--skipCount;
						GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
					} else {
						update = buf.getBits(1);
						if (update == 0) {
							skipCount = VarClientType.decodeSkipCount(buf);
							GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
						} else {
							Player.decodeMovement(buf, playerIndex);
						}
					}
				}
			}

			buf.byteAccess();
			if (skipCount != 0) {
				throw new RuntimeException();
			} else {
				buf.bitAccess();

				for (index = 0; index < GPI.globalPlayerCount; index++) {
					playerIndex = GPI.globalPlayerIndices[index];
					if ((GPI.skipFlags[playerIndex] & 0x1) != 0) {
						if (skipCount > 0) {
							--skipCount;
							GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
						} else {
							update = buf.getBits(1);
							if (update == 0) {
								skipCount = VarClientType.decodeSkipCount(buf);
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else if (Class4.decodeRegionHash(buf, playerIndex)) {
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							}
						}
					}
				}

				buf.byteAccess();
				if (skipCount != 0) {
					throw new RuntimeException();
				} else {
					buf.bitAccess();

					for (index = 0; index < GPI.globalPlayerCount; index++) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 0x1) == 0) {
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								update = buf.getBits(1);
								if (update == 0) {
									skipCount = VarClientType.decodeSkipCount(buf);
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								} else if (Class4.decodeRegionHash(buf, playerIndex)) {
									GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
								}
							}
						}
					}

					buf.byteAccess();
					if (skipCount != 0) {
						throw new RuntimeException();
					} else {
						GPI.localPlayerCount = 0;
						GPI.globalPlayerCount = 0;

						for (index = 1; index < 2048; index++) {
							GPI.skipFlags[index] = (byte) (GPI.skipFlags[index] >> 1);
							Player var5 = Client.playerArray[index];
							if (var5 != null) {
								GPI.localPlayerIndices[++GPI.localPlayerCount - 1] = index;
							} else {
								GPI.globalPlayerIndices[++GPI.globalPlayerCount - 1] = index;
							}
						}

					}
				}
			}
		}
	}

	static final void method484(int var0) {
		ByteBuf.method644();
		Scene.method220();
		int var2 = Class37.getVarPlayerType(var0).anInt1546;
		if (var2 != 0) {
			int var1 = Class94.tempVars[var0];
			if (var2 == 1) {
				if (var1 == 1) {
					Graphics3D.setBrightness(0.9D);
					((TextureLoader) Graphics3D.textureLoader).brightness(0.9D);
				}

				if (var1 == 2) {
					Graphics3D.setBrightness(0.8D);
					((TextureLoader) Graphics3D.textureLoader).brightness(0.8D);
				}

				if (var1 == 3) {
					Graphics3D.setBrightness(0.7D);
					((TextureLoader) Graphics3D.textureLoader).brightness(0.7D);
				}

				if (var1 == 4) {
					Graphics3D.setBrightness(0.6D);
					((TextureLoader) Graphics3D.textureLoader).brightness(0.6D);
				}

				ChatMessage.method711();
			}

			if (var2 == 3) {
				short var4 = 0;
				if (var1 == 0) {
					var4 = 255;
				}

				if (var1 == 1) {
					var4 = 192;
				}

				if (var1 == 2) {
					var4 = 128;
				}

				if (var1 == 3) {
					var4 = 64;
				}

				if (var1 == 4) {
					var4 = 0;
				}

				if (Client.anInt2201 != var4) {
					if (Client.anInt2201 == 0 && Client.anInt2202 != -1) {
						Class69.method328(Class2.midiTrack1Index, Client.anInt2202, 0, var4, false);
						Client.aBool2191 = false;
					} else if (var4 == 0) {
						Class110.aNode_Sub4_Sub4_784.method856();
						Class110.anInt782 = 1;
						Class110.aClass87_783 = null;
						Client.aBool2191 = false;
					} else {
						Class56.method286(var4);
					}

					Client.anInt2201 = var4;
				}
			}

			if (var2 == 4) {
				if (var1 == 0) {
					Client.anInt2204 = 127;
				}

				if (var1 == 1) {
					Client.anInt2204 = 96;
				}

				if (var1 == 2) {
					Client.anInt2204 = 64;
				}

				if (var1 == 3) {
					Client.anInt2204 = 32;
				}

				if (var1 == 4) {
					Client.anInt2204 = 0;
				}
			}

			if (var2 == 5) {
				Client.anInt2144 = var1;
			}

			if (var2 == 6) {
				Client.anInt2133 = var1;
			}

			if (var2 == 9) {
				Client.anInt2134 = var1;
			}

			if (var2 == 10) {
				if (var1 == 0) {
					Client.anInt2205 = 1108213437;
				}

				if (var1 == 1) {
					Client.anInt2205 = -582678240;
				}

				if (var1 == 2) {
					Client.anInt2205 = -388452160;
				}

				if (var1 == 3) {
					Client.anInt2205 = -194226080;
				}

				if (var1 == 4) {
					Client.anInt2205 = 0;
				}
			}

			if (var2 == 17) {
				Client.anInt2136 = var1 & 0xffff;
			}

			Class36[] var41;
			if (var2 == 18) {
				var41 = new Class36[] { Class36.aClass36_397, Class36.aClass36_399, Class36.aClass36_403,
						Class36.aClass36_398 };
				Client.aClass36_2170 = (Class36) Class30.forOrdinal(var41, var1);
				if (Client.aClass36_2170 == null) {
					Client.aClass36_2170 = Class36.aClass36_403;
				}
			}

			if (var2 == 19) {
				if (var1 == -1) {
					Client.anInt2111 = -1;
				} else {
					Client.anInt2111 = var1 & 0x7ff;
				}
			}

			if (var2 == 22) {
				var41 = new Class36[] { Class36.aClass36_397, Class36.aClass36_399, Class36.aClass36_403,
						Class36.aClass36_398 };
				Client.aClass36_2199 = (Class36) Class30.forOrdinal(var41, var1);
				if (Client.aClass36_2199 == null) {
					Client.aClass36_2199 = Class36.aClass36_403;
				}
			}
		}

	}

	static boolean isIgnored(String var0) {
		if (var0 == null) {
			return false;
		} else {
			String var2 = VarPlayerType.method728(var0, Class48_Sub1.aClass124_1297);

			for (int var1 = 0; var1 < Client.anInt2229; var1++) {
				IgnoredPlayer var3 = Client.ignoredPlayers[var1];
				if (var2.equalsIgnoreCase(VarPlayerType.method728(var3.displayName, Class48_Sub1.aClass124_1297))) {
					return true;
				}

				if (var2.equalsIgnoreCase(VarPlayerType.method728(var3.previousName, Class48_Sub1.aClass124_1297))) {
					return true;
				}
			}

			return false;
		}
	}

}
