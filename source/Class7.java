import java.awt.Font;

public class Class7 {

	public static int anInt148;
	public static int[] anIntArray149;
	public static int[] anIntArray150;
	public static int[] anIntArray151;
	static byte[][] aByteArrayArray152;
	protected static Font aFont153;
	static int anInt154;
	static int menuX;
	public static int anInt155;

	static final void decodeMapRegion(boolean dyn) {
		Client.dynamicRegion = dyn;
		int var1;
		int var2;
		int var3;
		int region_count;
		int index;
		int plane;
		int var9;
		if (!Client.dynamicRegion) {
			var2 = Client.inBuffer.getUShortA();
			var3 = Client.inBuffer.getULEShort();
			region_count = Client.inBuffer.getUShort();
			DualNode_Sub12.regionXTEAs = new int[region_count][4]; 

			for (index = 0; index < region_count; ++index) {
				for (plane = 0; plane < 4; ++plane) {
					DualNode_Sub12.regionXTEAs[index][plane] = Client.inBuffer.getInt();
					System.out.println("region plane: " + index + "," + plane);
				}
			}
			//System.out.println("ChunkX: " + var3 + ", ChunkY: " + var2 + ", Count: " + var5 + ", (" + (var3 << 3) + ", " + (var2 << 3) + ")");

			Client.regionIds = new int[region_count];
			Class69.mapRegionFileIds = new int[region_count];
			DualNode_Sub5.landRegionFielIds = new int[region_count];
			aByteArrayArray152 = new byte[region_count][];
			LandscapeTile.aByteArrayArray1406 = new byte[region_count][];
			boolean var13 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
				var13 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var13 = true;
			}

			region_count = 0;

			for (plane = (var3 - 6) / 8; plane <= (6 + var3) / 8; ++plane) {
				for (var1 = (var2 - 6) / 8; var1 <= (6 + var2) / 8; ++var1) {
					var9 = var1 + (plane << 8);
					if (!var13
							|| var1 != 49 && var1 != 149 && var1 != 147 && plane != 50 && (plane != 49 || var1 != 47)) {
						
					
						
						GameClient.dumpMap(var9, DualNode_Sub12.regionXTEAs[region_count]);
						Client.regionIds[region_count] = var9;
						System.out.println("blahhh:" + Client.regionIds[region_count] + "," + var9);
						Class69.mapRegionFileIds[region_count] = Class48_Sub1.aClass87_Sub1_1295
								.method383("m" + plane + "_" + var1);
						DualNode_Sub5.landRegionFielIds[region_count] = Class48_Sub1.aClass87_Sub1_1295
								.method383("l" + plane + "_" + var1);
						++region_count;
					}
				}
			}
			System.out.println("MapRegion: " + var3 + "," + var2);
			Node_Sub8.method546(var3, var2);
		} else {
			var2 = Client.inBuffer.getUShort();
			var3 = Client.inBuffer.getULEShortA();
			region_count = Client.inBuffer.getUShort();
			Client.inBuffer.bitAccess();

			for (index = 0; index < 4; ++index) {
				for (plane = 0; plane < 13; ++plane) {
					for (var1 = 0; var1 < 13; ++var1) {
						var9 = Client.inBuffer.getBits(1);
						if (var9 == 1) {
							Client.anIntArrayArrayArray2055[index][plane][var1] = Client.inBuffer.getBits(26);
						} else {
							Client.anIntArrayArrayArray2055[index][plane][var1] = -1;
						}
					}
				}
			}

			Client.inBuffer.byteAccess();
			DualNode_Sub12.regionXTEAs = new int[region_count][4];

			for (index = 0; index < region_count; ++index) {
				for (plane = 0; plane < 4; ++plane) {
					DualNode_Sub12.regionXTEAs[index][plane] = Client.inBuffer.getInt();
				}
			}

			Client.regionIds = new int[region_count];
			Class69.mapRegionFileIds = new int[region_count];
			DualNode_Sub5.landRegionFielIds = new int[region_count];
			aByteArrayArray152 = new byte[region_count][];
			LandscapeTile.aByteArrayArray1406 = new byte[region_count][];
			region_count = 0;

			for (index = 0; index < 4; ++index) {
				for (plane = 0; plane < 13; ++plane) {
					for (var1 = 0; var1 < 13; ++var1) {
						var9 = Client.anIntArrayArrayArray2055[index][plane][var1];
						if (var9 != -1) {
							int var11 = var9 >> 14 & 1023;
							int var12 = var9 >> 3 & 2047;
							int var8 = (var11 / 8 << 8) + var12 / 8;

							int var4;
							for (var4 = 0; var4 < region_count; ++var4) {
								if (Client.regionIds[var4] == var8) {
									var8 = -1;
									break;
								}
							}

							if (var8 != -1) {
								Client.regionIds[region_count] = var8;
								var4 = var8 >> 8 & 255;
								int var10 = var8 & 255;
								Class69.mapRegionFileIds[region_count] = Class48_Sub1.aClass87_Sub1_1295
										.method383("m" + var4 + "_" + var10);
								DualNode_Sub5.landRegionFielIds[region_count] = Class48_Sub1.aClass87_Sub1_1295
										.method383("l" + var4 + "_" + var10);
								++region_count;
							}
						}
					}
				}
			}

			Node_Sub8.method546(var2, var3);
		}

	}

	Class7() throws Throwable {
		throw new Error();
	}

	public static int encodeCESU8(byte[] bytes, int position, CharSequence sequence) {
		int length = sequence.length();
		int offset = position;

		for (int var4 = 0; var4 < length; ++var4) {
			char c = sequence.charAt(var4);
			if (c <= 127) {
				bytes[offset++] = (byte) c;
			} else if (c <= 2047) {
				bytes[offset++] = (byte) (192 | c >> 6);
				bytes[offset++] = (byte) (128 | c & 63);
			} else {
				bytes[offset++] = (byte) (224 | c >> 12);
				bytes[offset++] = (byte) (128 | c >> 6 & 63);
				bytes[offset++] = (byte) (128 | c & 63);
			}
		}

		return offset - position;
	}

	static final void method77(int var0, int var1, int var2, int var3, Sprite var4, DualNode_Sub14 var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var10 = Client.minimapRotation * -1916997753 + Client.minimapScale * -1718342721 & 2047;
			int var12 = DualNode_Sub13_Sub1.SIN_TABLE[var10];
			int var11 = DualNode_Sub13_Sub1.COS_TABLE[var10];
			var12 = 256 * var12 / (256 + -806982331 * Client.viewRotation);
			var11 = 256 * var11 / (256 + Client.viewRotation * -806982331);
			int var13 = var11 * var2 + var3 * var12 >> 16;
			int var14 = var11 * var3 - var2 * var12 >> 16;
			double var7 = Math.atan2((double) var13, (double) var14);
			int var15 = (int) (Math.sin(var7) * 63.0D);
			int var9 = (int) (Math.cos(var7) * 57.0D);
			Npc.aSprite1965.method955(4 + var0 + 94 + var15 - 10, 83 + var1 - var9 - 20, 20, 20, 15, 15, var7, 256);
		} else {
			Class51.method256(var0, var1, var2, var3, var4, var5);
		}

	}

	public static boolean method78(int var0) {
		return (var0 & 1) != 0;
	}

	static final void decodeNpcUpdate(boolean largeScene) {
		Client.anInt2105 = 0;
		Client.pendingNpcFlagsCount = 0;
		Client.inBuffer.bitAccess();
		int var1 = Client.inBuffer.getBits(8);
		int var4;
		if (var1 < 727116725 * Client.anInt2225) {
			for (var4 = var1; var4 < Client.anInt2225 * 727116725; ++var4) {
				Client.anIntArray2107[(Client.anInt2105 += 1545207887) * 1457329839 - 1] = Client.npcIndices[var4];
			}
		}

		if (var1 > Client.anInt2225 * 727116725) {
			throw new RuntimeException("");
		} else {
			Client.anInt2225 = 0;

			int var2;
			int var3;
			int var7;
			int var8;
			for (var4 = 0; var4 < var1; ++var4) {
				int var5 = Client.npcIndices[var4];
				Npc var6 = Client.npcArray[var5];
				var2 = Client.inBuffer.getBits(1);
				if (var2 == 0) {
					Client.npcIndices[(Client.anInt2225 += -368645475) * 727116725 - 1] = var5;
					var6.anInt1949 = Client.engineCycle * 1050068427;
				} else {
					var3 = Client.inBuffer.getBits(2);
					if (var3 == 0) {
						Client.npcIndices[(Client.anInt2225 += -368645475) * 727116725 - 1] = var5;
						var6.anInt1949 = 1050068427 * Client.engineCycle;
						Client.pendingNpcFlagsIndices[(Client.pendingNpcFlagsCount += 2121422091) * -143667549 - 1] = var5;
					} else if (var3 == 1) {
						Client.npcIndices[(Client.anInt2225 += -368645475) * 727116725 - 1] = var5;
						var6.anInt1949 = Client.engineCycle * 1050068427;
						var7 = Client.inBuffer.getBits(3);
						var6.method1024(var7, (byte) 1);
						var8 = Client.inBuffer.getBits(1);
						if (var8 == 1) {
							Client.pendingNpcFlagsIndices[(Client.pendingNpcFlagsCount += 2121422091) * -143667549 - 1] = var5;
						}
					} else if (var3 == 2) {
						Client.npcIndices[(Client.anInt2225 += -368645475) * 727116725 - 1] = var5;
						var6.anInt1949 = 1050068427 * Client.engineCycle;
						var7 = Client.inBuffer.getBits(3);
						var6.method1024(var7, (byte) 2);
						var8 = Client.inBuffer.getBits(3);
						var6.method1024(var8, (byte) 2);
						int var9 = Client.inBuffer.getBits(1);
						if (var9 == 1) {
							Client.pendingNpcFlagsIndices[(Client.pendingNpcFlagsCount += 2121422091) * -143667549 - 1] = var5;
						}
					} else if (var3 == 3) {
						Client.anIntArray2107[(Client.anInt2105 += 1545207887) * 1457329839 - 1] = var5;
					}
				}
			}

			while (Client.inBuffer.bitsAvail(Client.frameSize * 371800591) >= 27) {
				var1 = Client.inBuffer.getBits(15);
				if (var1 == 32767) {
					break;
				}

				boolean var10 = false;
				if (Client.npcArray[var1] == null) {
					Client.npcArray[var1] = new Npc();
					var10 = true;
				}

				Npc var11 = Client.npcArray[var1];
				Client.npcIndices[(Client.anInt2225 += -368645475) * 727116725 - 1] = var1;
				var11.anInt1949 = Client.engineCycle * 1050068427;
				int var12;
				if (largeScene) {
					var12 = Client.inBuffer.getBits(8);
					if (var12 > 127) {
						var12 -= 256;
					}
				} else {
					var12 = Client.inBuffer.getBits(5);
					if (var12 > 15) {
						var12 -= 32;
					}
				}

				if (largeScene) {
					var2 = Client.inBuffer.getBits(8);
					if (var2 > 127) {
						var2 -= 256;
					}
				} else {
					var2 = Client.inBuffer.getBits(5);
					if (var2 > 15) {
						var2 -= 32;
					}
				}

				var11.definition = DualNode_Sub11.getNpcDefinition(Client.inBuffer.getBits(14));
				var3 = Client.directionAngles[Client.inBuffer.getBits(3)];
				if (var10) {
					var11.anInt1953 = (var11.anInt1937 = var3 * 518992781) * -1253637257;
				}

				var7 = Client.inBuffer.getBits(1);
				var8 = Client.inBuffer.getBits(1);
				if (var8 == 1) {
					Client.pendingNpcFlagsIndices[(Client.pendingNpcFlagsCount += 2121422091) * -143667549 - 1] = var1;
				}

				var11.anInt1915 = 1447916577 * var11.definition.anInt1589;
				var11.orientation = 506128019 * var11.definition.anInt1599;
				if (var11.orientation * 1361576967 == 0) {
					var11.anInt1937 = 0;
				}

				var11.anInt1918 = var11.definition.anInt1585 * -147360311;
				var11.anInt1952 = var11.definition.anInt1584 * 404950129;
				var11.anInt1913 = var11.definition.anInt1587 * 1055000573;
				var11.anInt1939 = 985741173 * var11.definition.anInt1588;
				var11.anInt1959 = 1706784279 * var11.definition.anInt1601;
				var11.anInt1916 = var11.definition.anInt1583 * -1634865443;
				var11.anInt1917 = var11.definition.anInt1591 * 118379263;
				var11.method1025(var2 + Class68.myPlayer.anIntArray1945[0], var12 + Class68.myPlayer.anIntArray1955[0],
						var7 == 1);
			}

			Client.inBuffer.byteAccess();
			DualNode_Sub2.decodeNpcFlags();

			for (var1 = 0; var1 < Client.anInt2105 * 1457329839; ++var1) {
				var4 = Client.anIntArray2107[var1];
				if (Client.npcArray[var4].anInt1949 * -494855465 != -1040073859 * Client.engineCycle) {
					Client.npcArray[var4].definition = null;
					Client.npcArray[var4] = null;
				}
			}

			if (371800591 * Client.frameSize != 314639891 * Client.inBuffer.position) {
				throw new RuntimeException(
						314639891 * Client.inBuffer.position + Class35.aString387 + Client.frameSize * 371800591);
			} else {
				for (var1 = 0; var1 < 727116725 * Client.anInt2225; ++var1) {
					if (Client.npcArray[Client.npcIndices[var1]] == null) {
						throw new RuntimeException(var1 + Class35.aString387 + 727116725 * Client.anInt2225);
					}
				}

			}
		}
	}
}
