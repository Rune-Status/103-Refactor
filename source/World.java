
public class World {

	String activity;
	static World[] worlds;
	int index;
	static int[] anIntArray1118 = new int[] { 0, 1, 2, 3 };
	static int worldCount = 0;
	int flags;
	int population;
	String domain;
	static int[] anIntArray1119 = new int[] { 1, 1, 1, 1 };
	int location;
	static String myWorldDomain;
	static int anInt1121 = 0;
	int id;

	boolean method477() {
		return (1 & this.flags * -1784645245) != 0;
	}

	boolean method478() {
		return (2 & this.flags * -1784645245) != 0;
	}

	boolean method479() {
		return (4 & this.flags * -1784645245) != 0;
	}

	boolean method480() {
		return (8 & -1784645245 * this.flags) != 0;
	}

	boolean method481() {
		return (536870912 & this.flags * -1784645245) != 0;
	}

	public static int method482(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return 1 + var0;
	}

	static final void decodeLocationUpdates(BitBuf buf) {
		int skipCount = 0;
		buf.bitAccess();

		int playerIndex;
		int index;
		int update;
		for (index = 0; index < -334270159 * GPI.localPlayerCount; ++index) {
			playerIndex = GPI.localPlayerIndices[index];
			if ((GPI.skipFlags[playerIndex] & 1) == 0) {
				if (skipCount > 0) {
					--skipCount;
					GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
				} else {
					update = buf.getBits(1);
					if (update == 0) {
						skipCount = DualNode_Sub10.decodeSkipCount(buf);
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

			for (index = 0; index < GPI.localPlayerCount * -334270159; ++index) {
				playerIndex = GPI.localPlayerIndices[index];
				if ((GPI.skipFlags[playerIndex] & 1) != 0) {
					if (skipCount > 0) {
						--skipCount;
						GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
					} else {
						update = buf.getBits(1);
						if (update == 0) {
							skipCount = DualNode_Sub10.decodeSkipCount(buf);
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

				for (index = 0; index < 1824807037 * GPI.globalPlayerCount; ++index) {
					playerIndex = GPI.globalPlayerIndices[index];
					if ((GPI.skipFlags[playerIndex] & 1) != 0) {
						if (skipCount > 0) {
							--skipCount;
							GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
						} else {
							update = buf.getBits(1);
							if (update == 0) {
								skipCount = DualNode_Sub10.decodeSkipCount(buf);
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

					for (index = 0; index < 1824807037 * GPI.globalPlayerCount; ++index) {
						playerIndex = GPI.globalPlayerIndices[index];
						if ((GPI.skipFlags[playerIndex] & 1) == 0) {
							if (skipCount > 0) {
								--skipCount;
								GPI.skipFlags[playerIndex] = (byte) (GPI.skipFlags[playerIndex] | 2);
							} else {
								update = buf.getBits(1);
								if (update == 0) {
									skipCount = DualNode_Sub10.decodeSkipCount(buf);
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

						for (index = 1; index < 2048; ++index) {
							GPI.skipFlags[index] = (byte) (GPI.skipFlags[index] >> 1);
							Player var5 = Client.playerArray[index];
							if (var5 != null) {
								GPI.localPlayerIndices[(GPI.localPlayerCount += -864270383) * -334270159 - 1] = index;
							} else {
								GPI.globalPlayerIndices[(GPI.globalPlayerCount += 2065293525) * 1824807037 - 1] = index;
							}
						}

					}
				}
			}
		}
	}

	static final void method484(int var0) {
		ByteBuf.method644();
		Class39.method220();
		int var2 = Class37.method209(var0).anInt1546 * -189310937;
		if (var2 != 0) {
			int var1 = Class94.tempVars[var0];
			if (var2 == 1) {
				if (var1 == 1) {
					DualNode_Sub13_Sub1.method913(0.9D);
					((Class29) DualNode_Sub13_Sub1.anInterface3_1796).method185(0.9D);
				}

				if (var1 == 2) {
					DualNode_Sub13_Sub1.method913(0.8D);
					((Class29) DualNode_Sub13_Sub1.anInterface3_1796).method185(0.8D);
				}

				if (var1 == 3) {
					DualNode_Sub13_Sub1.method913(0.7D);
					((Class29) DualNode_Sub13_Sub1.anInterface3_1796).method185(0.7D);
				}

				if (var1 == 4) {
					DualNode_Sub13_Sub1.method913(0.6D);
					((Class29) DualNode_Sub13_Sub1.anInterface3_1796).method185(0.6D);
				}

				DualNode_Sub8.method711();
			}

			if (var2 == 3) {
				short var3 = 0;
				if (var1 == 0) {
					var3 = 255;
				}

				if (var1 == 1) {
					var3 = 192;
				}

				if (var1 == 2) {
					var3 = 128;
				}

				if (var1 == 3) {
					var3 = 64;
				}

				if (var1 == 4) {
					var3 = 0;
				}

				if (var3 != Client.anInt2201 * -1994948003) {
					if (-1994948003 * Client.anInt2201 == 0 && Client.anInt2202 * 850867613 != -1) {
						Class69.method328(Class2.aClass87_Sub1_79, 850867613 * Client.anInt2202, 0, var3, false);
						Client.aBool2191 = false;
					} else if (var3 == 0) {
						Class110.aNode_Sub4_Sub4_784.method856();
						Class110.anInt782 = 325298615;
						Class110.aClass87_783 = null;
						Client.aBool2191 = false;
					} else {
						Class56.method286(var3);
					}

					Client.anInt2201 = -1999150603 * var3;
				}
			}

			if (var2 == 4) {
				if (var1 == 0) {
					Client.anInt2204 = 1632484343;
				}

				if (var1 == 1) {
					Client.anInt2204 = -1133300896;
				}

				if (var1 == 2) {
					Client.anInt2204 = 2107777600;
				}

				if (var1 == 3) {
					Client.anInt2204 = 1053888800;
				}

				if (var1 == 4) {
					Client.anInt2204 = 0;
				}
			}

			if (var2 == 5) {
				Client.anInt2144 = var1 * 1049853945;
			}

			if (var2 == 6) {
				Client.anInt2133 = var1 * -1829432231;
			}

			if (var2 == 9) {
				Client.anInt2134 = -171810537 * var1;
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
				Client.anInt2136 = (var1 & '\uffff') * 218906203;
			}

			Class36[] var4;
			if (var2 == 18) {
				var4 = new Class36[] { Class36.aClass36_397, Class36.aClass36_399, Class36.aClass36_403,
						Class36.aClass36_398 };
				Client.aClass36_2170 = (Class36) Class30.method189(var4, var1);
				if (Client.aClass36_2170 == null) {
					Client.aClass36_2170 = Class36.aClass36_403;
				}
			}

			if (var2 == 19) {
				if (var1 == -1) {
					Client.anInt2111 = 1929362559;
				} else {
					Client.anInt2111 = -1929362559 * (var1 & 2047);
				}
			}

			if (var2 == 22) {
				var4 = new Class36[] { Class36.aClass36_397, Class36.aClass36_399, Class36.aClass36_403,
						Class36.aClass36_398 };
				Client.aClass36_2199 = (Class36) Class30.method189(var4, var1);
				if (Client.aClass36_2199 == null) {
					Client.aClass36_2199 = Class36.aClass36_403;
				}
			}

		}
	}

	static boolean method485(String var0) {
		if (var0 == null) {
			return false;
		} else {
			String var2 = DualNode_Sub11.method728(var0, Class48_Sub1.aClass124_1297);

			for (int var1 = 0; var1 < 1820302153 * Client.anInt2229; ++var1) {
				IgnoredPlayer var3 = Client.ignoredPlayers[var1];
				if (var2.equalsIgnoreCase(DualNode_Sub11.method728(var3.displayName, Class48_Sub1.aClass124_1297))) {
					return true;
				}

				if (var2.equalsIgnoreCase(DualNode_Sub11.method728(var3.previousName, Class48_Sub1.aClass124_1297))) {
					return true;
				}
			}

			return false;
		}
	}
}
