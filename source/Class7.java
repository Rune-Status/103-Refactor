import java.awt.Font;

public class Class7 {

	public static int width;
	public static int[] offsetsX;
	public static int[] subWidths;
	public static int[] subHeights;
	protected static Font helveticaFont;
	static int size;
	static int menuX;
	public static int height;
	static byte[][] aByteArrayArray152;

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
			SkeletonSet.regionXTEAs = new int[region_count][4];

			for (index = 0; index < region_count; index++) {
				for (plane = 0; plane < 4; plane++) {
					SkeletonSet.regionXTEAs[index][plane] = Client.inBuffer.getInt();
				}
			}

			Client.regionIds = new int[region_count];
			Class69.mapRegionFileIds = new int[region_count];
			InvType.landRegionFielIds = new int[region_count];
			aByteArrayArray152 = new byte[region_count][];
			LandscapeTile.aByteArrayArray1406 = new byte[region_count][];
			boolean var11 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
				var11 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var11 = true;
			}

			region_count = 0;

			for (plane = (var3 - 6) / 8; plane <= (var3 + 6) / 8; plane++) {
				for (var1 = (var2 - 6) / 8; var1 <= (var2 + 6) / 8; var1++) {
					var9 = (plane << 8) + var1;
					if (!var11
							|| var1 != 49 && var1 != 149 && var1 != 147 && plane != 50 && (plane != 49 || var1 != 47)) {
						Client.regionIds[region_count] = var9;
						Class69.mapRegionFileIds[region_count] = Class48_Sub1.landscapesIndex
								.getFile("m" + plane + "_" + var1);
						InvType.landRegionFielIds[region_count] = Class48_Sub1.landscapesIndex
								.getFile("l" + plane + "_" + var1);
						++region_count;
					}
				}
			}

			Node_Sub8.method546(var3, var2);
		} else {
			var2 = Client.inBuffer.getUShort();
			var3 = Client.inBuffer.getULEShortA();
			region_count = Client.inBuffer.getUShort();
			Client.inBuffer.bitAccess();

			for (index = 0; index < 4; index++) {
				for (plane = 0; plane < 13; plane++) {
					for (var1 = 0; var1 < 13; var1++) {
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
			SkeletonSet.regionXTEAs = new int[region_count][4];

			for (index = 0; index < region_count; index++) {
				for (plane = 0; plane < 4; plane++) {
					SkeletonSet.regionXTEAs[index][plane] = Client.inBuffer.getInt();
				}
			}

			Client.regionIds = new int[region_count];
			Class69.mapRegionFileIds = new int[region_count];
			InvType.landRegionFielIds = new int[region_count];
			aByteArrayArray152 = new byte[region_count][];
			LandscapeTile.aByteArrayArray1406 = new byte[region_count][];
			region_count = 0;

			for (index = 0; index < 4; index++) {
				for (plane = 0; plane < 13; plane++) {
					for (var1 = 0; var1 < 13; var1++) {
						var9 = Client.anIntArrayArrayArray2055[index][plane][var1];
						if (var9 != -1) {
							int var13 = var9 >> 14 & 0x3ff;
							int var12 = var9 >> 3 & 0x7ff;
							int var8 = (var13 / 8 << 8) + var12 / 8;

							int var4;
							for (var4 = 0; var4 < region_count; var4++) {
								if (Client.regionIds[var4] == var8) {
									var8 = -1;
									break;
								}
							}

							if (var8 != -1) {
								Client.regionIds[region_count] = var8;
								var4 = var8 >> 8 & 0xff;
								int var10 = var8 & 0xff;
								Class69.mapRegionFileIds[region_count] = Class48_Sub1.landscapesIndex
										.getFile("m" + var4 + "_" + var10);
								InvType.landRegionFielIds[region_count] = Class48_Sub1.landscapesIndex
										.getFile("l" + var4 + "_" + var10);
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

		for (int var4 = 0; var4 < length; var4++) {
			char c = sequence.charAt(var4);
			if (c <= 127) {
				bytes[offset++] = (byte) c;
			} else if (c <= 2047) {
				bytes[offset++] = (byte) (c >> 6 | 192);
				bytes[offset++] = (byte) (c & 0x3f | 128);
			} else {
				bytes[offset++] = (byte) (c >> 12 | 224);
				bytes[offset++] = (byte) (c >> 6 & 0x3f | 128);
				bytes[offset++] = (byte) (c & 0x3f | 128);
			}
		}

		return offset - position;
	}

	static final void method77(int var0, int var1, int var2, int var3, Picture var4, DualNode_Sub14 var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var10 = Client.minimapRotation + Client.minimapScale & 0x7ff;
			int var12 = TexturedGraphic.SIN_TABLE[var10];
			int var11 = TexturedGraphic.COS_TABLE[var10];
			var12 = var12 * 256 / (Client.viewRotation + 256);
			var11 = var11 * 256 / (Client.viewRotation + 256);
			int var13 = var11 * var2 + var3 * var12 >> 16;
			int var14 = var11 * var3 - var2 * var12 >> 16;
			double var7 = Math.atan2((double) var13, (double) var14);
			int var15 = (int) (Math.sin(var7) * 63.0D);
			int var9 = (int) (Math.cos(var7) * 57.0D);
			Npc.mapedge.method955(var0 + 4 + 94 + var15 - 10, var1 + 83 - var9 - 20, 20, 20, 15, 15, var7, 256);
		} else {
			Class51.drawDot(var0, var1, var2, var3, var4, var5);
		}

	}

	public static boolean method78(int var0) {
		return (var0 & 0x1) != 0;
	}

	static final void decodeNpcUpdate(boolean largeScene) {
		Client.anInt2105 = 0;
		Client.pendingNpcFlagsCount = 0;
		Client.inBuffer.bitAccess();
		int var1 = Client.inBuffer.getBits(8);
		int var4;
		if (var1 < Client.anInt2225) {
			for (var4 = var1; var4 < Client.anInt2225; var4++) {
				Client.anIntArray2107[++Client.anInt2105 - 1] = Client.npcIndices[var4];
			}
		}

		if (var1 > Client.anInt2225) {
			throw new RuntimeException("");
		} else {
			Client.anInt2225 = 0;

			int var2;
			int var3;
			int var7;
			int var8;
			Npc var11;
			int var12;
			for (var4 = 0; var4 < var1; var4++) {
				int var10 = Client.npcIndices[var4];
				var11 = Client.npcArray[var10];
				var2 = Client.inBuffer.getBits(1);
				if (var2 == 0) {
					Client.npcIndices[++Client.anInt2225 - 1] = var10;
					var11.anInt1949 = Client.engineCycle;
				} else {
					var3 = Client.inBuffer.getBits(2);
					if (var3 == 0) {
						Client.npcIndices[++Client.anInt2225 - 1] = var10;
						var11.anInt1949 = Client.engineCycle;
						Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var10;
					} else if (var3 == 1) {
						Client.npcIndices[++Client.anInt2225 - 1] = var10;
						var11.anInt1949 = Client.engineCycle;
						var7 = Client.inBuffer.getBits(3);
						var11.method1024(var7, (byte) 1);
						var8 = Client.inBuffer.getBits(1);
						if (var8 == 1) {
							Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var10;
						}
					} else if (var3 == 2) {
						Client.npcIndices[++Client.anInt2225 - 1] = var10;
						var11.anInt1949 = Client.engineCycle;
						var7 = Client.inBuffer.getBits(3);
						var11.method1024(var7, (byte) 2);
						var8 = Client.inBuffer.getBits(3);
						var11.method1024(var8, (byte) 2);
						var12 = Client.inBuffer.getBits(1);
						if (var12 == 1) {
							Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var10;
						}
					} else if (var3 == 3) {
						Client.anIntArray2107[++Client.anInt2105 - 1] = var10;
					}
				}
			}

			while (Client.inBuffer.bitsAvail(Client.frameSize) >= 27) {
				var1 = Client.inBuffer.getBits(15);
				if (var1 == 32767) {
					break;
				}

				boolean var101 = false;
				if (Client.npcArray[var1] == null) {
					Client.npcArray[var1] = new Npc();
					var101 = true;
				}

				var11 = Client.npcArray[var1];
				Client.npcIndices[++Client.anInt2225 - 1] = var1;
				var11.anInt1949 = Client.engineCycle;
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

				var11.type = VarPlayerType.getNpcType(Client.inBuffer.getBits(14));
				var3 = Client.directionAngles[Client.inBuffer.getBits(3)];
				if (var101) {
					var11.anInt1953 = var11.anInt1937 = var3 * 736533899;
				}

				var7 = Client.inBuffer.getBits(1);
				var8 = Client.inBuffer.getBits(1);
				if (var8 == 1) {
					Client.pendingNpcFlagsIndices[++Client.pendingNpcFlagsCount - 1] = var1;
				}

				var11.anInt1915 = var11.type.anInt1589;
				var11.orientation = var11.type.anInt1599 * 1080073435;
				if (var11.orientation * -2031663291 == 0) {
					var11.anInt1937 = 0;
				}

				var11.anInt1918 = var11.type.anInt1585 * 1481286257;
				var11.anInt1952 = var11.type.anInt1584 * -826106711;
				var11.anInt1913 = var11.type.anInt1587 * -897665047;
				var11.anInt1939 = var11.type.anInt1588 * -1453546357;
				var11.anInt1959 = var11.type.anInt1601 * 370127001;
				var11.anInt1916 = var11.type.anInt1583 * 711326345;
				var11.anInt1917 = var11.type.anInt1591 * 1969722215;
				var11.method1025(Class68.myPlayer.anIntArray1945[0] + var2, Class68.myPlayer.anIntArray1955[0] + var12,
						var7 == 1);
			}

			Client.inBuffer.byteAccess();
			IdentKitType.decodeNpcFlags();

			for (var1 = 0; var1 < Client.anInt2105; var1++) {
				var4 = Client.anIntArray2107[var1];
				if (Client.npcArray[var4].anInt1949 != Client.engineCycle) {
					Client.npcArray[var4].type = null;
					Client.npcArray[var4] = null;
				}
			}

			if (Client.frameSize != Client.inBuffer.position) {
				throw new RuntimeException(Client.inBuffer.position + Class35.aString387 + Client.frameSize);
			} else {
				for (var1 = 0; var1 < Client.anInt2225; var1++) {
					if (Client.npcArray[Client.npcIndices[var1]] == null) {
						throw new RuntimeException(var1 + Class35.aString387 + Client.anInt2225);
					}
				}

			}
		}
	}

}
