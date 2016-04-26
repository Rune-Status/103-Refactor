import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class Client extends GameEngine {

	static CacheIndex meshesIndex;
	static DualNode_Sub13_Sub3_Sub1 p12_full;
	static int[] regionIds;
	static CacheIndex configsIndex;
	static int anInt2011 = 0;
	static String worldListURL;
	static int myWorld;
	static int socketType = 0;
	static GameType gameType;
	static String sessionToken;
	static int myWorldFlags = 0;
	static Client clientInstance;
	static boolean membersWorld = false;
	static int engineCycle = 0;
	static int anInt2163;
	static int anInt2189;
	static int anInt2045 = 0;
	static int anInt2120;
	static boolean aBool2102;
	static int menuItemCount;
	static int anInt2049 = 0;
	static int anInt2130;
	static int frameId = 0;
	static int frameSize = 0;
	static int anInt2041 = 0;
	static int thridLastFrameId;
	static int secondLastFrameId;
	static int lastFrameId = 0;
	static long aLong2016 = -1L;
	static int anInt2080 = 0;
	static boolean aBool2081 = false;
	static int anInt2155;
	static long aLong2030 = -1L;
	static int anInt2017 = -1;
	static int anInt2227;
	static boolean aBool2020 = true;
	static int anInt2019 = -1;
	static int destinationX;
	static int anInt2194;
	static int destinationY;
	static int anInt2226;
	static int anInt2161;
	static int anInt2066 = 0;
	static NodeTable widgetConfigs;
	static int anInt2153;
	static int anInt2097;
	static int anInt2079 = 0;
	static int cursorState;
	static int anInt2098;
	static Widget aWidget2009 = null;
	static boolean aBool2148;
	static boolean aBool2145;
	static int anInt2188;
	static int anInt2195;
	static int anInt2160;
	static int anInt2151;
	static int anInt2110;
	static int anInt2182;
	static int anInt2187;
	static int anInt2092;
	static Widget aWidget2141;
	static boolean aBool2103;
	static int anInt2095;
	static int anInt2096;
	static int anInt2117;
	static boolean aBool2046 = false;
	static int anInt2211;
	static boolean aBool2150;
	static int anInt2076 = 0;
	static int anInt2207;
	static int weight;
	static int anInt2048 = 0;
	static int anInt2075 = 0;
	static int anInt2015 = 0;
	static int anInt2021 = 0;
	static int friendListSize;
	static int anInt2114;
	static int minimapRotation = 0;
	static int anInt2051 = 128;
	static int anInt2158;
	static int anInt2116;
	static int anInt2025 = 0;
	static int anInt2157;
	static int anInt2119;
	static int hintArrowX = 0;
	static int hintArrowY = 0;
	static int anInt2032 = 0;
	static int anInt2229;
	static boolean aBool2191;
	static int anInt2159;
	static int anInt2062 = 0;
	static String clanChatOwner;
	static String clanChatName;
	static int anInt2220;
	static int anInt2057 = 1032131686;
	static int anInt2058 = 0;
	static int anInt2060 = 0;
	static int anInt2059 = 2;
	static int anInt2061 = 1;
	static byte clanChatRank;
	static int anInt2018 = 0;
	static Widget aWidget2135;
	static int minimapScale = 0;
	static int anInt2063 = 2;
	static int viewRotation = 0;
	static int anInt2064 = 1;
	static int anInt2042 = 0;
	static int anInt2200;
	static int energy;
	static int anInt2184;
	static long aLong2232;
	static long aLong2126;
	static int anInt2113;
	static int anInt2169;
	static int anInt2028 = 0;
	static int anInt2031 = 0;
	static boolean displayFps = false;
	static long aLong2035 = 0L;
	static boolean resizable;
	static int anInt2140;
	static int anInt2027 = 1;
	static boolean aBool2006 = true;
	static int[] menuArg2 = new int[500];
	static int anInt2008 = 50;
	static boolean lowMemory = false;
	static short aShort2014 = 320;
	static int[] experiences = new int[25];
	static int[] levels = new int[25];
	static int[] anIntArray2023 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
	static boolean aBool2024 = false;
	static int[] directionAngles = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	static int bootState = 0;
	static int[] anIntArray2029 = new int[50];
	static String selectedSpellName = null;
	static boolean[] aBoolArray2033 = new boolean[5];
	static int transferTime = 0;
	static Npc[] npcArray = new Npc['\u8000'];
	static Deque graphicsObjectDeque = new Deque();
	static int[] npcIndices = new int['\u8000'];
	static int[] pendingNpcFlagsIndices = new int[250];
	static BitBuf outBuffer = new BitBuf(5000);
	static int anInt2037 = 0;
	static BitBuf inBuffer = new BitBuf(15000);
	static String aString2044 = "";
	static int screenWidth = 0;
	static int itemSelectionStatus = 0;
	static int anInt2050 = -1;
	static CollisionMap[] collisionMaps = new CollisionMap[4];
	static boolean dynamicRegion = false;
	static int[][][] anIntArrayArrayArray2055 = new int[4][13][13];
	static int[] anIntArray2056 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static int pendingNpcFlagsCount = 0;
	static int anInt2067 = 2301979;
	static int anInt2068 = 5063219;
	static int anInt2069 = 3353893;
	static int anInt2070 = 7759444;
	static boolean aBool2071 = false;
	static int anInt2072 = 0;
	static int[] anIntArray2073 = new int[50];
	static int anInt2077 = -8452631;
	static int anInt2078 = 0;
	static Deque projectileDeque = new Deque();
	static int anInt2082 = 0;
	static int anInt2083 = 50;
	static int[] anIntArray2084;
	static int[] anIntArray2085;
	static int[] anIntArray2086;
	static int[] anIntArray2087;
	static int[] anIntArray2088;
	static int[] anIntArray2089;
	static int[] menuOpcodes;
	static String[] aStringArray2090;
	static int screenY;
	static int screenX;
	static int anInt2099;
	static int anInt2100;
	static int anInt2101;
	static int anInt2105;
	static Player[] playerArray;
	static int myPlayerIndex;
	static int anInt2106;
	static int screenZoom;
	static int[] anIntArray2107;
	static int[] anIntArray2108;
	static String[] playerActions;
	static boolean[] aBoolArray2109;
	static int anInt2111;
	static BitBuf loginBuffer;
	static Deque[][][] groundItemDeque;
	static boolean[] aBoolArray2118;
	static boolean menuOpen;
	static int[] menuArg1;
	static int[] menuArg0;
	static String[] menuActions;
	static int[][] anIntArrayArray2121;
	static int anInt2122;
	static int anInt2123;
	static int anInt2124;
	static short aShort2125;
	static int anInt2127;
	static boolean spellSelected;
	static int anInt2128;
	static int anInt2129;
	static int anInt2131;
	static int[] anIntArray2132;
	static NodeTable interfaceNodes;
	static int anInt2133;
	static int anInt2134;
	static int myRights;
	static int anInt2136;
	static boolean[] aBoolArray2137;
	static PlayerConfig aPlayerConfig2138;
	static boolean aBool2139;
	static Widget aWidget2142;
	static int[] currentLevels;
	static int anInt2143;
	static int anInt2144;
	static int anInt2146;
	static int anInt2147;
	static int anInt2149;
	static int[] anIntArray2152;
	static int[] anIntArray2154;
	static int[] anIntArray2156;
	static int screenHeight;
	static int[] anIntArray2162;
	static Deque aDeque2164;
	static Deque aDeque2165;
	static Deque aDeque2166;
	static int anInt2168;
	static Class36 aClass36_2170;
	static boolean[] aBoolArray2171;
	static int[] anIntArray2173;
	static int[] anIntArray2174;
	static int[] anIntArray2175;
	static int[] anIntArray2176;
	static int anInt2177;
	static short aShort2178;
	static boolean aBool2179;
	static int anInt2180;
	static int anInt2181;
	static int anInt2183;
	static int anInt2185;
	static long[] aLongArray2186;
	static int[] anIntArray2190;
	static int anInt2192;
	static Deque aDeque2193;
	static int[] anIntArray2196;
	static int[] anIntArray2197;
	static Picture[] aSpriteArray2198;
	static Class36 aClass36_2199;
	static int anInt2201;
	static int anInt2202;
	static int anInt2204;
	static int anInt2205;
	static int audioEffectCount;
	static int[] anIntArray2206;
	static int anInt2208;
	static int[] anIntArray2209;
	static Class14[] aClass14Array2210;
	static int connectionState;
	static String[] menuNouns;
	static int[] anIntArray2212;
	static int[] anIntArray2213;
	static boolean aBool2214;
	static int[] anIntArray2215;
	static int[] anIntArray2216;
	static short aShort2217;
	static short aShort2218;
	static String menuActionPrefix;
	static short aShort2219;
	static short aShort2221;
	static short aShort2222;
	static int anInt2223;
	static int anInt2224;
	static int anInt2225;
	static String selectedItemName;
	static FriendedPlayer[] friendedPlayers;
	static Class102 aClass102_2228;
	static IgnoredPlayer[] ignoredPlayers;
	static int anInt2230;
	static Widget aWidget2231;
	static ExchangeOffer[] localExchangeOffers;
	static int anInt2233;
	static Class48_Sub1 aClass48_Sub1_2234;
	static int[] anIntArray2235;
	static int[] anIntArray2236;

	public final void init() {
		if (this.isValidHost()) {
			Parameters[] params = new Parameters[] { Parameters.aParameters74, Parameters.aParameters63,
					Parameters.aParameters73, Parameters.aParameters64, Parameters.aParameters61,
					Parameters.aParameters65, Parameters.aParameters62, Parameters.aParameters66,
					Parameters.aParameters71, Parameters.aParameters72, Parameters.aParameters75,
					Parameters.aParameters70, Parameters.aParameters60, Parameters.aParameters67,
					Parameters.aParameters68 };

			for (int identifier = 0; identifier < params.length; identifier++) {
				Parameters var11 = params[identifier];
				String value = this.getParameter(var11.key);
				if (value != null) {
					switch (Integer.parseInt(var11.key)) {
					case 1:
						InterfaceNode.anInt1399 = Integer.parseInt(value);
						break;
					case 2:
						anInt2011 = Integer.parseInt(value);
						break;
					case 3:
						int ordinal = Integer.parseInt(value);
						BuildType[] types = Player.buildTypes();
						int index = 0;

						BuildType type;
						while (true) {
							if (index >= types.length) {
								type = null;
								break;
							}

							BuildType typ = types[index];
							if (typ.ordinal == ordinal) {
								type = typ;
								break;
							}

							++index;
						}

						Class22.buildType = type;
						break;
					case 4:
						worldListURL = value;
					case 5:
					case 9:
					default:
						break;
					case 6:
						myWorld = Integer.parseInt(value);
						break;
					case 7:
						if (value.equalsIgnoreCase(Class35.aString396)) {
							;
						}
						break;
					case 8:
						TextureLoader.sessionId = Integer.parseInt(value);
						break;
					case 10:
						socketType = Integer.parseInt(value);
						break;
					case 11:
						gameType = (GameType) Class30.forOrdinal(Connection.gameTypes(), Integer.parseInt(value));
						if (GameType.OLDSCAPE == gameType) {
							Class48_Sub1.aClass124_1297 = Class124.aClass124_820;
						} else {
							Class48_Sub1.aClass124_1297 = Class124.aClass124_827;
						}
						break;
					case 12:
						if (value.equalsIgnoreCase(Class35.aString396)) {
							membersWorld = true;
						} else {
							membersWorld = false;
						}
						break;
					case 13:
						sessionToken = value;
						break;
					case 14:
						myWorldFlags = Integer.parseInt(value);
					}
				}
			}

			GameStrings.method466();
			World.myWorldDomain = this.getCodeBase().getHost();
			String var111 = Class22.buildType.identifier;

			try {
				Node_Sub6.initialize("oldschool", var111, 0, 16);
			} catch (Exception var10) {
				Class79.error((String) null, var10);
			}

			clientInstance = this;
			this.initialize(765, 503, 103);
		}

	}

	protected final void processLogic() {
		++engineCycle;
		this.processJS5Connection();
		VarClientStringType.method698();

		int var2;
		try {
			if (Class110.anInt782 == 1) {
				var2 = Class110.aNode_Sub4_Sub4_784.method828();
				if (var2 > 0 && Class110.aNode_Sub4_Sub4_784.method831()) {
					var2 -= Class110.anInt785;
					if (var2 < 0) {
						var2 = 0;
					}

					Class110.aNode_Sub4_Sub4_784.method827(var2);
				} else {
					Class110.aNode_Sub4_Sub4_784.method856();
					Class110.aNode_Sub4_Sub4_784.method844();
					if (Class110.aClass87_783 != null) {
						Class110.anInt782 = 2;
					} else {
						Class110.anInt782 = 0;
					}

					Class86.aNode_Sub11_693 = null;
					RuneScript.aClass13_1721 = null;
				}
			}
		} catch (Exception var621) {
			var621.printStackTrace();
			Class110.aNode_Sub4_Sub4_784.method856();
			Class110.anInt782 = 0;
			Class86.aNode_Sub11_693 = null;
			RuneScript.aClass13_1721 = null;
			Class110.aClass87_783 = null;
		}

		Class34.method201();
		Class31.method192();
		Class74 var81 = Class74.aClass74_618;
		synchronized (var81) {
			Class74.anInt624 = Class74.anInt626 * -562612321;
			Class74.anInt621 = Class74.anInt625 * -453286219;
			Class74.anInt622 = Class74.anInt619;
			Class74.anInt627 = Class74.anInt623;
			Class74.anInt628 = Class74.anInt631;
			Class74.anInt629 = Class74.anInt620;
			Class74.aLong630 = Class74.aLong616;
			Class74.anInt623 = 0;
		}

		if (Class26.wheelListener != null) {
			var2 = Class26.wheelListener.getRotation();
			anInt2163 = var2;
		}

		int var3;
		int var5;
		int var6;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var16;
		int var17;
		int var18;
		int var83;
		int var89;
		int var114;
		int var145;
		boolean var120;
		if (anInt2113 == 0) {
			BoundaryDecorationStub.bootClient();
			Class2.method61();
		} else if (anInt2113 == 5) {
			Class16.method127(this);
			BoundaryDecorationStub.bootClient();
			Class2.method61();
		} else if (anInt2113 != 10 && anInt2113 != 11) {
			if (anInt2113 == 20) {
				Class16.method127(this);
				Class58.processLogin();
			} else if (anInt2113 == 25) {
				Class74.method333(false);
				anInt2120 = 0;
				boolean var50 = true;

				for (var3 = 0; var3 < Class7.aByteArrayArray152.length; var3++) {
					if (Class69.mapRegionFileIds[var3] != -1 && Class7.aByteArrayArray152[var3] == null) {
						Class7.aByteArrayArray152[var3] = Class48_Sub1.landscapesIndex
								.getFile(Class69.mapRegionFileIds[var3], 0);
						if (Class7.aByteArrayArray152[var3] == null) {
							var50 = false;
							++anInt2120;
						}
					}

					if (InvType.landRegionFielIds[var3] != -1 && LandscapeTile.aByteArrayArray1406[var3] == null) {
						LandscapeTile.aByteArrayArray1406[var3] = Class48_Sub1.landscapesIndex
								.method375(InvType.landRegionFielIds[var3], 0, SkeletonSet.regionXTEAs[var3]);
						if (LandscapeTile.aByteArrayArray1406[var3] == null) {
							var50 = false;
							++anInt2120;
						}
					}
				}

				if (!var50) {
					anInt2130 = 1;
				} else {
					anInt2049 = 0;
					var50 = true;

					byte[] var19;
					for (var3 = 0; var3 < Class7.aByteArrayArray152.length; var3++) {
						var19 = LandscapeTile.aByteArrayArray1406[var3];
						if (var19 != null) {
							var5 = (regionIds[var3] >> 8) * 64 - Node_Sub10.chunkLeftX;
							var6 = (regionIds[var3] & 0xff) * 64 - VarClientHub.chunkLeftY;
							if (dynamicRegion) {
								var5 = 10;
								var6 = 10;
							}

							var50 &= Class21.method155(var19, var5, var6);
						}
					}

					if (!var50) {
						anInt2130 = 2;
					} else {
						if (anInt2130 != 0) {
							Class82.method363("Loading - please wait." + Class35.aString390 + Class35.aString389 + 100
									+ "%" + Class35.aString392, true);
						}

						Class34.method201();
						Timer.method325();
						Class34.method201();
						InterfaceNode.landscape.method15();
						Class34.method201();
						System.gc();

						for (var3 = 0; var3 < 4; var3++) {
							collisionMaps[var3].method244();
						}

						for (var3 = 0; var3 < 4; var3++) {
							for (var83 = 0; var83 < 104; var83++) {
								for (var5 = 0; var5 < 104; var5++) {
									Class39.renderRules[var3][var83][var5] = 0;
								}
							}
						}

						Class34.method201();
						Class39.anInt438 = 99;
						Class118.underlayIds = new byte[4][104][104];
						Class39.overlayIds = new byte[4][104][104];
						VarClientStringType.overlayPaths = new byte[4][104][104];
						GZipDecompressor.overlayRotations = new byte[4][104][104];
						Class39.anIntArrayArrayArray433 = new int[4][105][105];
						Class39.aByteArrayArrayArray430 = new byte[4][105][105];
						Class39.anIntArrayArray441 = new int[105][105];
						Permission.anIntArray614 = new int[104];
						Class51.anIntArray526 = new int[104];
						Class39.anIntArray432 = new int[104];
						Class89.anIntArray715 = new int[104];
						RuneScript.anIntArray1724 = new int[104];
						var3 = Class7.aByteArrayArray152.length;

						for (Node_Sub6 var63 = (Node_Sub6) Node_Sub6.aDeque1279
								.getFront(); var63 != null; var63 = (Node_Sub6) Node_Sub6.aDeque1279.getNext()) {
							if (var63.aNode_Sub4_Sub2_1276 != null) {
								FriendedPlayer.aNode_Sub4_Sub1_740.method730(var63.aNode_Sub4_Sub2_1276);
								var63.aNode_Sub4_Sub2_1276 = null;
							}

							if (var63.aNode_Sub4_Sub2_1280 != null) {
								FriendedPlayer.aNode_Sub4_Sub1_740.method730(var63.aNode_Sub4_Sub2_1280);
								var63.aNode_Sub4_Sub2_1280 = null;
							}
						}

						Node_Sub6.aDeque1279.method467();
						Class74.method333(true);
						if (!dynamicRegion) {
							for (var83 = 0; var83 < var3; var83++) {
								var5 = (regionIds[var83] >> 8) * 64 - Node_Sub10.chunkLeftX;
								var6 = (regionIds[var83] & 0xff) * 64 - VarClientHub.chunkLeftY;
								var19 = Class7.aByteArrayArray152[var83];
								if (var19 != null) {
									Class34.method201();
									Class93.loadTerrain(var19, var5, var6, TileDecorationStub.chunkBaseX * 8 - 48,
											Class90.chunkBaseY * 8 - 48, collisionMaps);
								}
							}

							for (var83 = 0; var83 < var3; var83++) {
								var5 = (regionIds[var83] >> 8) * 64 - Node_Sub10.chunkLeftX;
								var6 = (regionIds[var83] & 0xff) * 64 - VarClientHub.chunkLeftY;
								var19 = Class7.aByteArrayArray152[var83];
								if (var19 == null && Class90.chunkBaseY < 800) {
									Class34.method201();
									VarClientHub.method182(var5, var6, 64, 64);
								}
							}

							Class74.method333(true);

							for (var83 = 0; var83 < var3; var83++) {
								byte[] var85 = LandscapeTile.aByteArrayArray1406[var83];
								if (var85 != null) {
									var6 = (regionIds[var83] >> 8) * 64 - Node_Sub10.chunkLeftX;
									var89 = (regionIds[var83] & 0xff) * 64 - VarClientHub.chunkLeftY;
									Class34.method201();
									BoundaryDecorationStub.loadLocations(var85, var6, var89, InterfaceNode.landscape,
											collisionMaps);
								}
							}
						}

						int var94;
						int var121;
						int var86;
						int var91;
						int var176;
						int var115;
						int var182;
						int var69;
						int var65;
						int var66;
						if (dynamicRegion) {
							var83 = 0;

							label3948: while (true) {
								if (var83 >= 4) {
									for (var83 = 0; var83 < 13; var83++) {
										for (var5 = 0; var5 < 13; var5++) {
											var6 = anIntArrayArrayArray2055[0][var83][var5];
											if (var6 == -1) {
												VarClientHub.method182(var83 * 8, var5 * 8, 8, 8);
											}
										}
									}

									Class74.method333(true);
									var83 = 0;

									while (true) {
										if (var83 >= 4) {
											break label3948;
										}

										Class34.method201();

										for (var5 = 0; var5 < 13; var5++) {
											for (var6 = 0; var6 < 13; var6++) {
												var89 = anIntArrayArrayArray2055[var83][var5][var6];
												if (var89 != -1) {
													var8 = var89 >> 24 & 0x3;
													var9 = var89 >> 1 & 0x3;
													var10 = var89 >> 14 & 0x3ff;
													var11 = var89 >> 3 & 0x7ff;
													var12 = var11 / 8 + (var10 / 8 << 8);

													for (var13 = 0; var13 < regionIds.length; var13++) {
														if (regionIds[var13] == var12
																&& LandscapeTile.aByteArrayArray1406[var13] != null) {
															Class94.method405(LandscapeTile.aByteArrayArray1406[var13],
																	var83, var5 * 8, var6 * 8, var8, (var10 & 0x7) * 8,
																	(var11 & 0x7) * 8, var9, InterfaceNode.landscape,
																	collisionMaps);
															break;
														}
													}
												}
											}
										}

										++var83;
									}
								}

								Class34.method201();

								for (var5 = 0; var5 < 13; var5++) {
									for (var6 = 0; var6 < 13; var6++) {
										boolean var183 = false;
										var8 = anIntArrayArrayArray2055[var83][var5][var6];
										if (var8 != -1) {
											var9 = var8 >> 24 & 0x3;
											var10 = var8 >> 1 & 0x3;
											var11 = var8 >> 14 & 0x3ff;
											var12 = var8 >> 3 & 0x7ff;
											var13 = (var11 / 8 << 8) + var12 / 8;

											for (var14 = 0; var14 < regionIds.length; var14++) {
												if (regionIds[var14] == var13
														&& Class7.aByteArrayArray152[var14] != null) {
													byte[] var54 = Class7.aByteArrayArray152[var14];
													var16 = var5 * 8;
													var17 = var6 * 8;
													var18 = (var11 & 0x7) * 8;
													var66 = (var12 & 0x7) * 8;
													CollisionMap[] var99 = collisionMaps;

													for (var65 = 0; var65 < 8; var65++) {
														for (var94 = 0; var94 < 8; var94++) {
															if (var16 + var65 > 0 && var16 + var65 < 103
																	&& var94 + var17 > 0 && var94 + var17 < 103) {
																var99[var83].flags[var65 + var16][var94
																		+ var17] &= -16777217;
															}
														}
													}

													ByteBuf var109 = new ByteBuf(var54);

													for (var94 = 0; var94 < 4; var94++) {
														for (var121 = 0; var121 < 64; var121++) {
															for (var86 = 0; var86 < 64; var86++) {
																if (var9 == var94 && var121 >= var18
																		&& var121 < var18 + 8 && var86 >= var66
																		&& var86 < var66 + 8) {
																	var91 = IdentKitType.method670(var121 & 0x7,
																			var86 & 0x7, var10) + var16;
																	var176 = var121 & 0x7;
																	var115 = var86 & 0x7;
																	var182 = var10 & 0x3;
																	if (var182 == 0) {
																		var69 = var115;
																	} else if (var182 == 1) {
																		var69 = 7 - var176;
																	} else if (var182 == 2) {
																		var69 = 7 - var115;
																	} else {
																		var69 = var176;
																	}

																	Class122.loadTerrain(var109, var83, var91,
																			var17 + var69, 0, 0, var10);
																} else {
																	Class122.loadTerrain(var109, 0, -1, -1, 0, 0, 0);
																}
															}
														}
													}

													var183 = true;
													break;
												}
											}
										}

										if (!var183) {
											ConsumingImageProducer.method513(var83, var5 * 8, var6 * 8);
										}
									}
								}

								++var83;
							}
						}

						Class74.method333(true);
						Timer.method325();
						Class34.method201();
						Landscape var891 = InterfaceNode.landscape;
						CollisionMap[] var911 = collisionMaps;

						for (var6 = 0; var6 < 4; var6++) {
							for (var89 = 0; var89 < 104; var89++) {
								for (var8 = 0; var8 < 104; var8++) {
									if ((Class39.renderRules[var6][var89][var8] & 0x1) == 1) {
										var9 = var6;
										if ((Class39.renderRules[1][var89][var8] & 0x2) == 2) {
											var9 = var6 - 1;
										}

										if (var9 >= 0) {
											var911[var9].method235(var89, var8);
										}
									}
								}
							}
						}

						Class39.anInt431 += (int) (Math.random() * 5.0D) - 2;
						if (Class39.anInt431 < -8) {
							Class39.anInt431 = -8;
						}

						if (Class39.anInt431 > 8) {
							Class39.anInt431 = 8;
						}

						Class39.anInt439 += (int) (Math.random() * 5.0D) - 2;
						if (Class39.anInt439 < -16) {
							Class39.anInt439 = -16;
						}

						if (Class39.anInt439 > 16) {
							Class39.anInt439 = 16;
						}

						for (var6 = 0; var6 < 4; var6++) {
							byte[][] var941 = Class39.aByteArrayArrayArray430[var6];
							var13 = (int) Math.sqrt(5100.0D);
							var14 = var13 * 768 >> 8;

							for (var114 = 1; var114 < 103; var114++) {
								for (var16 = 1; var16 < 103; var16++) {
									var17 = Class39.tileHeights[var6][var16 + 1][var114]
											- Class39.tileHeights[var6][var16 - 1][var114];
									var18 = Class39.tileHeights[var6][var16][var114 + 1]
											- Class39.tileHeights[var6][var16][var114 - 1];
									var66 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
									var145 = (var17 << 8) / var66;
									var65 = 65536 / var66;
									var94 = (var18 << 8) / var66;
									var121 = (var145 * -50 + var65 * -10 + var94 * -50) / var14 + 96;
									var86 = (var941[var16][var114 - 1] >> 2) + (var941[var16 - 1][var114] >> 2)
											+ (var941[var16 + 1][var114] >> 3) + (var941[var16][var114 + 1] >> 3)
											+ (var941[var16][var114] >> 1);
									Class39.anIntArrayArray441[var16][var114] = var121 - var86;
								}
							}

							for (var114 = 0; var114 < 104; var114++) {
								Permission.anIntArray614[var114] = 0;
								Class51.anIntArray526[var114] = 0;
								Class39.anIntArray432[var114] = 0;
								Class89.anIntArray715[var114] = 0;
								RuneScript.anIntArray1724[var114] = 0;
							}

							for (var114 = -5; var114 < 109; var114++) {
								for (var16 = 0; var16 < 104; var16++) {
									var17 = var114 + 5;
									UnderlayType var100;
									if (var17 >= 0 && var17 < 104) {
										var18 = Class118.underlayIds[var6][var17][var16] & 0xff;
										if (var18 > 0) {
											var100 = InterfaceNode.getUnderlayType(var18 - 1);
											Permission.anIntArray614[var16] += var100.hue;
											Class51.anIntArray526[var16] += var100.saturation;
											Class39.anIntArray432[var16] += var100.lightness;
											Class89.anIntArray715[var16] += var100.pCDivider;
											++RuneScript.anIntArray1724[var16];
										}
									}

									var18 = var114 - 5;
									if (var18 >= 0 && var18 < 104) {
										var66 = Class118.underlayIds[var6][var18][var16] & 0xff;
										if (var66 > 0) {
											var100 = InterfaceNode.getUnderlayType(var66 - 1);
											Permission.anIntArray614[var16] -= var100.hue;
											Class51.anIntArray526[var16] -= var100.saturation;
											Class39.anIntArray432[var16] -= var100.lightness;
											Class89.anIntArray715[var16] -= var100.pCDivider;
											--RuneScript.anIntArray1724[var16];
										}
									}
								}

								if (var114 >= 1 && var114 < 103) {
									var16 = 0;
									var17 = 0;
									var18 = 0;
									var66 = 0;
									var145 = 0;

									for (var65 = -5; var65 < 109; var65++) {
										var94 = var65 + 5;
										if (var94 >= 0 && var94 < 104) {
											var16 += Permission.anIntArray614[var94];
											var17 += Class51.anIntArray526[var94];
											var18 += Class39.anIntArray432[var94];
											var66 += Class89.anIntArray715[var94];
											var145 += RuneScript.anIntArray1724[var94];
										}

										var121 = var65 - 5;
										if (var121 >= 0 && var121 < 104) {
											var16 -= Permission.anIntArray614[var121];
											var17 -= Class51.anIntArray526[var121];
											var18 -= Class39.anIntArray432[var121];
											var66 -= Class89.anIntArray715[var121];
											var145 -= RuneScript.anIntArray1724[var121];
										}

										if (var65 >= 1 && var65 < 103
												&& (!lowMemory || (Class39.renderRules[0][var114][var65] & 0x2) != 0
														|| (Class39.renderRules[var6][var114][var65] & 0x10) == 0)) {
											if (var6 < Class39.anInt438) {
												Class39.anInt438 = var6;
											}

											var86 = Class118.underlayIds[var6][var114][var65] & 0xff;
											int var102 = Class39.overlayIds[var6][var114][var65] & 0xff;
											if (var86 > 0 || var102 > 0) {
												int var141 = Class39.tileHeights[var6][var114][var65];
												var91 = Class39.tileHeights[var6][var114 + 1][var65];
												int var56 = Class39.tileHeights[var6][var114 + 1][var65 + 1];
												var69 = Class39.tileHeights[var6][var114][var65 + 1];
												var176 = Class39.anIntArrayArray441[var114][var65];
												var115 = Class39.anIntArrayArray441[var114 + 1][var65];
												var182 = Class39.anIntArrayArray441[var114 + 1][var65 + 1];
												int var162 = Class39.anIntArrayArray441[var114][var65 + 1];
												int var135 = -1;
												int var113 = -1;
												int var124;
												int var138;
												if (var86 > 0) {
													var124 = var16 * 256 / var66;
													var138 = var17 / var145;
													int var108 = var18 / var145;
													var135 = IndexTable.method304(var124, var138, var108);
													var124 = Class39.anInt431 + var124 & 0xff;
													var108 += Class39.anInt439;
													if (var108 < 0) {
														var108 = 0;
													} else if (var108 > 255) {
														var108 = 255;
													}

													var113 = IndexTable.method304(var124, var138, var108);
												}

												if (var6 > 0) {
													var120 = true;
													if (var86 == 0
															&& VarClientStringType.overlayPaths[var6][var114][var65] != 0) {
														var120 = false;
													}

													if (var102 > 0 && !AbstractSoundSystem
															.getOverlayType(var102 - 1).hideUnderlay) {
														var120 = false;
													}

													if (var120 && var141 == var91 && var141 == var56
															&& var141 == var69) {
														Class39.anIntArrayArrayArray433[var6][var114][var65] |= 2340;
													}
												}

												var124 = 0;
												if (var113 != -1) {
													var124 = TexturedGraphic.anIntArray1793[Class86.method366(var113,
															96)];
												}

												if (var102 == 0) {
													var891.method17(var6, var114, var65, 0, 0, -1, var141, var91, var56,
															var69, Class86.method366(var135, var176),
															Class86.method366(var135, var115),
															Class86.method366(var135, var182),
															Class86.method366(var135, var162), 0, 0, 0, 0, var124, 0);
												} else {
													var138 = VarClientStringType.overlayPaths[var6][var114][var65] + 1;
													byte var126 = GZipDecompressor.overlayRotations[var6][var114][var65];
													OverlayType var97 = AbstractSoundSystem.getOverlayType(var102 - 1);
													int var62 = var97.texture;
													int var96;
													int var111;
													int var153;
													int var44;
													if (var62 >= 0) {
														var96 = TexturedGraphic.textureLoader.method7(var62);
														var111 = -1;
													} else if (var97.rgbColor == 16711935) {
														var111 = -2;
														var62 = -1;
														var96 = -2;
													} else {
														var111 = IndexTable.method304(var97.hue, var97.saturation,
																var97.lightness);
														var153 = Class39.anInt431 + var97.hue & 0xff;
														var44 = Class39.anInt439 + var97.lightness;
														if (var44 < 0) {
															var44 = 0;
														} else if (var44 > 255) {
															var44 = 255;
														}

														var96 = IndexTable.method304(var153, var97.saturation, var44);
													}

													var153 = 0;
													if (var96 != -2) {
														var153 = TexturedGraphic.anIntArray1793[Class33.method200(var96,
																96)];
													}

													if (var97.otherRgbColor != -1) {
														var44 = var97.otherHue + Class39.anInt431 & 0xff;
														int var45 = Class39.anInt439 + var97.otherLightness;
														if (var45 < 0) {
															var45 = 0;
														} else if (var45 > 255) {
															var45 = 255;
														}

														var96 = IndexTable.method304(var44, var97.otherSaturation,
																var45);
														var153 = TexturedGraphic.anIntArray1793[Class33.method200(var96,
																96)];
													}

													var891.method17(var6, var114, var65, var138, var126, var62, var141,
															var91, var56, var69, Class86.method366(var135, var176),
															Class86.method366(var135, var115),
															Class86.method366(var135, var182),
															Class86.method366(var135, var162),
															Class33.method200(var111, var176),
															Class33.method200(var111, var115),
															Class33.method200(var111, var182),
															Class33.method200(var111, var162), var124, var153);
												}
											}
										}
									}
								}
							}

							for (var114 = 1; var114 < 103; var114++) {
								for (var16 = 1; var16 < 103; var16++) {
									var891.method52(var6, var16, var114,
											RuntimeException_Sub1.method931(var6, var16, var114));
								}
							}

							Class118.underlayIds[var6] = (byte[][]) ((byte[][]) null);
							Class39.overlayIds[var6] = (byte[][]) ((byte[][]) null);
							VarClientStringType.overlayPaths[var6] = (byte[][]) ((byte[][]) null);
							GZipDecompressor.overlayRotations[var6] = (byte[][]) ((byte[][]) null);
							Class39.aByteArrayArrayArray430[var6] = (byte[][]) ((byte[][]) null);
						}

						var891.method55(-50, -10, -50);

						for (var6 = 0; var6 < 104; var6++) {
							for (var89 = 0; var89 < 104; var89++) {
								if ((Class39.renderRules[1][var6][var89] & 0x2) == 2) {
									var891.method35(var6, var89);
								}
							}
						}

						var6 = 1;
						var89 = 2;
						var8 = 4;

						for (var9 = 0; var9 < 4; var9++) {
							if (var9 > 0) {
								var6 <<= 3;
								var89 <<= 3;
								var8 <<= 3;
							}

							for (var10 = 0; var10 <= var9; var10++) {
								for (var11 = 0; var11 <= 104; var11++) {
									for (var12 = 0; var12 <= 104; var12++) {
										short var971;
										if ((Class39.anIntArrayArrayArray433[var10][var12][var11] & var6) != 0) {
											var13 = var11;
											var14 = var11;
											var114 = var10;

											for (var16 = var10; var13 > 0
													&& (Class39.anIntArrayArrayArray433[var10][var12][var13 - 1]
															& var6) != 0; --var13) {
												;
											}

											while (var14 < 104
													&& (Class39.anIntArrayArrayArray433[var10][var12][var14 + 1]
															& var6) != 0) {
												++var14;
											}

											label3606: while (var114 > 0) {
												for (var17 = var13; var17 <= var14; var17++) {
													if ((Class39.anIntArrayArrayArray433[var114 - 1][var12][var17]
															& var6) == 0) {
														break label3606;
													}
												}

												--var114;
											}

											label3595: while (var16 < var9) {
												for (var17 = var13; var17 <= var14; var17++) {
													if ((Class39.anIntArrayArrayArray433[var16 + 1][var12][var17]
															& var6) == 0) {
														break label3595;
													}
												}

												++var16;
											}

											var17 = (var16 + 1 - var114) * (var14 - var13 + 1);
											if (var17 >= 8) {
												var971 = 240;
												var66 = Class39.tileHeights[var16][var12][var13] - var971;
												var145 = Class39.tileHeights[var114][var12][var13];
												Landscape.method49(var9, 1, var12 * 128, var12 * 128, var13 * 128,
														var14 * 128 + 128, var66, var145);

												for (var65 = var114; var65 <= var16; var65++) {
													for (var94 = var13; var94 <= var14; var94++) {
														Class39.anIntArrayArrayArray433[var65][var12][var94] &= ~var6;
													}
												}
											}
										}

										if ((Class39.anIntArrayArrayArray433[var10][var12][var11] & var89) != 0) {
											var13 = var12;
											var14 = var12;
											var114 = var10;

											for (var16 = var10; var13 > 0
													&& (Class39.anIntArrayArrayArray433[var10][var13 - 1][var11]
															& var89) != 0; --var13) {
												;
											}

											while (var14 < 104
													&& (Class39.anIntArrayArrayArray433[var10][var14 + 1][var11]
															& var89) != 0) {
												++var14;
											}

											label3659: while (var114 > 0) {
												for (var17 = var13; var17 <= var14; var17++) {
													if ((Class39.anIntArrayArrayArray433[var114 - 1][var17][var11]
															& var89) == 0) {
														break label3659;
													}
												}

												--var114;
											}

											label3648: while (var16 < var9) {
												for (var17 = var13; var17 <= var14; var17++) {
													if ((Class39.anIntArrayArrayArray433[var16 + 1][var17][var11]
															& var89) == 0) {
														break label3648;
													}
												}

												++var16;
											}

											var17 = (var16 + 1 - var114) * (var14 - var13 + 1);
											if (var17 >= 8) {
												var971 = 240;
												var66 = Class39.tileHeights[var16][var13][var11] - var971;
												var145 = Class39.tileHeights[var114][var13][var11];
												Landscape.method49(var9, 2, var13 * 128, var14 * 128 + 128, var11 * 128,
														var11 * 128, var66, var145);

												for (var65 = var114; var65 <= var16; var65++) {
													for (var94 = var13; var94 <= var14; var94++) {
														Class39.anIntArrayArrayArray433[var65][var94][var11] &= ~var89;
													}
												}
											}
										}

										if ((Class39.anIntArrayArrayArray433[var10][var12][var11] & var8) != 0) {
											var13 = var12;
											var14 = var12;
											var114 = var11;

											for (var16 = var11; var114 > 0
													&& (Class39.anIntArrayArrayArray433[var10][var12][var114 - 1]
															& var8) != 0; --var114) {
												;
											}

											while (var16 < 104
													&& (Class39.anIntArrayArrayArray433[var10][var12][var16 + 1]
															& var8) != 0) {
												++var16;
											}

											label3712: while (var13 > 0) {
												for (var17 = var114; var17 <= var16; var17++) {
													if ((Class39.anIntArrayArrayArray433[var10][var13 - 1][var17]
															& var8) == 0) {
														break label3712;
													}
												}

												--var13;
											}

											label3701: while (var14 < 104) {
												for (var17 = var114; var17 <= var16; var17++) {
													if ((Class39.anIntArrayArrayArray433[var10][var14 + 1][var17]
															& var8) == 0) {
														break label3701;
													}
												}

												++var14;
											}

											if ((var14 - var13 + 1) * (var16 - var114 + 1) >= 4) {
												var17 = Class39.tileHeights[var10][var13][var114];
												Landscape.method49(var9, 4, var13 * 128, var14 * 128 + 128,
														var114 * 128, var16 * 128 + 128, var17, var17);

												for (var18 = var13; var18 <= var14; var18++) {
													for (var66 = var114; var66 <= var16; var66++) {
														Class39.anIntArrayArrayArray433[var10][var18][var66] &= ~var8;
													}
												}
											}
										}
									}
								}
							}
						}

						Class74.method333(true);
						var6 = Class39.anInt438;
						if (var6 > InterfaceNode.floorLevel * -1331355705) {
							var6 = InterfaceNode.floorLevel * -1331355705;
						}

						if (var6 < InterfaceNode.floorLevel * -1331355705 - 1) {
							var6 = InterfaceNode.floorLevel * -1331355705 - 1;
						}

						if (lowMemory) {
							InterfaceNode.landscape.method16(Class39.anInt438);
						} else {
							InterfaceNode.landscape.method16(0);
						}

						for (var89 = 0; var89 < 104; var89++) {
							for (var8 = 0; var8 < 104; var8++) {
								Class32.method195(var89, var8);
							}
						}

						Class34.method201();

						for (Node_Sub8 var991 = (Node_Sub8) aDeque2193
								.getFront(); var991 != null; var991 = (Node_Sub8) aDeque2193.getNext()) {
							if (var991.anInt1311 == -1) {
								var991.anInt1310 = 0;
								Class41.method226(var991);
							} else {
								var991.unlink();
							}
						}

						ObjectType.aClass106_1684.method429();
						if (VarClientType.gameFrame != null) {
							outBuffer.putHeader(245);
							outBuffer.putInt(1057001181);
						}

						if (!dynamicRegion) {
							var89 = (TileDecorationStub.chunkBaseX - 6) / 8;
							var8 = (TileDecorationStub.chunkBaseX + 6) / 8;
							var9 = (Class90.chunkBaseY - 6) / 8;
							var10 = (Class90.chunkBaseY + 6) / 8;

							for (var11 = var89 - 1; var11 <= var8 + 1; var11++) {
								for (var12 = var9 - 1; var12 <= var10 + 1; var12++) {
									if (var11 < var89 || var11 > var8 || var12 < var9 || var12 > var10) {
										Class48_Sub1.landscapesIndex.method387("m" + var11 + "_" + var12);
										Class48_Sub1.landscapesIndex.method387("l" + var11 + "_" + var12);
									}
								}
							}
						}

						Node_Sub8.method550(30);
						Class34.method201();
						Class25.resetMapInfo();
						outBuffer.putHeader(179);
						Class2.method61();
					}
				}
			}
		} else {
			Class16.method127(this);
		}

		if (anInt2113 == 30) {
			if (anInt2189 > 1) {
				--anInt2189;
			}

			if (anInt2045 > 0) {
				--anInt2045;
			}

			if (aBool2102) {
				aBool2102 = false;
				Class81.method361();
			} else {
				if (!menuOpen) {
					menuActions[0] = "Cancel";
					menuNouns[0] = "";
					menuOpcodes[0] = 1006;
					menuItemCount = 1;
				}

				long var64;
				boolean var67;
				Widget var68;
				String var691;
				Widget var71;
				for (var2 = 0; var2 < 100; var2++) {
					if (Class31.gameConnection == null) {
						var67 = false;
					} else {
						label4260: {
							try {
								var83 = Class31.gameConnection.avail();
								if (var83 == 0) {
									var67 = false;
									break label4260;
								}

								if (frameId == -1) {
									Class31.gameConnection.read(inBuffer.payload, 0, 1);
									inBuffer.position = 0;
									frameId = inBuffer.getHeader();
									frameSize = Class100.frameSizes[frameId];
									--var83;
								}

								if (frameSize == -1) {
									if (var83 <= 0) {
										var67 = false;
										break label4260;
									}

									Class31.gameConnection.read(inBuffer.payload, 0, 1);
									frameSize = inBuffer.payload[0] & 0xff;
									--var83;
								}

								if (frameSize == -2) {
									if (var83 <= 1) {
										var67 = false;
										break label4260;
									}

									Class31.gameConnection.read(inBuffer.payload, 0, 2);
									inBuffer.position = 0;
									frameSize = inBuffer.getUShort();
									var83 -= 2;
								}

								if (var83 < frameSize) {
									var67 = false;
									break label4260;
								}

								inBuffer.position = 0;
								Class31.gameConnection.read(inBuffer.payload, 0, frameSize);
								anInt2041 = 0;
								thridLastFrameId = secondLastFrameId;
								secondLastFrameId = lastFrameId;
								lastFrameId = frameId;
								if (frameId != 158 && frameId != 152 && frameId != 196 && frameId != 201
										&& frameId != 192 && frameId != 126 && frameId != 237 && frameId != 110
										&& frameId != 143 && frameId != 208 && frameId != 82 && frameId != 137
										&& frameId != 19 && frameId != 158 && frameId != 151 && frameId != 80
										&& frameId != 31 && frameId != 169 && frameId != 242 && frameId != 244
										&& frameId != 236 && frameId != 15 && frameId != 220 && frameId != 5
										&& frameId != 231 && frameId != 108 && frameId != 36 && frameId != 147
										&& frameId != 25 && frameId != 182 && frameId != 189) {
									System.out.println("Incomming Frame: ( " + frameId + ", " + frameSize + " ("
											+ Class100.frameSizes[frameId] + ") )");
								}

								if (frameId == 120) {
									var5 = inBuffer.getIMEInt();
									var6 = inBuffer.getULEShortA();
									var89 = var6 >> 10 & 0x1f;
									var8 = var6 >> 5 & 0x1f;
									var9 = var6 & 0x1f;
									var10 = (var9 << 3) + (var8 << 11) + (var89 << 19);
									Widget var73 = Class94.getWidget(var5);
									if (var73.textColor != var10) {
										var73.textColor = var10;
										Class68.method326(var73);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 98) {
									GPI.localPlayerCount = 0;

									for (var5 = 0; var5 < 2048; var5++) {
										GPI.cachedAppearances[var5] = null;
										GPI.movementTypes[var5] = 1;
									}

									for (var5 = 0; var5 < 2048; var5++) {
										playerArray[var5] = null;
									}

									ItemTable.initializeGPI(inBuffer);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								InterfaceNode var70;
								if (frameId == 158) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getLEInt();
									var89 = inBuffer.getUByteS();
									var70 = (InterfaceNode) interfaceNodes.get((long) var6);
									if (var70 != null) {
										EnumType.method691(var70, var70.type != var5);
									}

									InterfaceNode.method579(var6, var5, var89);
									if (GameClient.dump) {
										System.out.println("sendInterface(" + (var6 >> 16) + ", " + (var6 & 0xffff)
												+ ", " + var5 + ", " + (var89 == 1) + ");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 77) {
									anInt2189 = inBuffer.getUShortA() * 30;
									anInt2155 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 152) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getInt();
									var89 = inBuffer.getULEShortA();
									if (var89 == '\uffff') {
										var89 = -1;
									}

									if (GameClient.dump) {
										System.out.println("sendInterfaceModel(" + (var6 >> 16) + ", " + (var6 & 0xffff)
												+ ", " + var89 + ", " + var5 + ");");
									}

									var71 = Class94.getWidget(var6);
									ItemType var79;
									if (!var71.interactable) {
										if (var89 == -1) {
											var71.modelType = 0;
											frameId = -1;
											var67 = true;
											break label4260;
										}

										var79 = FriendedPlayer.getItemType(var89);
										var71.modelType = 4;
										var71.modelId = var89;
										var71.rotationX = var79.anInt1612;
										var71.rotationZ = var79.anInt1613;
										var71.modelZoom = var79.anInt1637 * 100 / var5;
										Class68.method326(var71);
									} else {
										var71.itemId = var89;
										var71.itemQuantity = var5;
										var79 = FriendedPlayer.getItemType(var89);
										var71.rotationX = var79.anInt1612;
										var71.rotationZ = var79.anInt1613;
										var71.rotationY = var79.anInt1634;
										var71.anInt1198 = var79.anInt1642;
										var71.anInt1151 = var79.anInt1616;
										var71.modelZoom = var79.anInt1637;
										if (var79.stackable == 1) {
											var71.anInt1155 = 1;
										} else {
											var71.anInt1155 = 2;
										}

										if (var71.anInt1160 > 0) {
											var71.modelZoom = var71.modelZoom * 32 / var71.anInt1160;
										} else if (var71.anInt1135 * 124195285 > 0) {
											var71.modelZoom = var71.modelZoom * 32 / (var71.anInt1135 * 124195285);
										}

										Class68.method326(var71);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 187) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getUByte();
									var89 = inBuffer.getUShort();
									EntityMarker.method139(var5, var6, var89);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								boolean var74;
								if (frameId == 161) {
									var74 = inBuffer.getUByte() == 1;
									if (var74) {
										Huffman.aLong449 = AnimationSkin.currentTimeMs() - inBuffer.getLong();
										Class70.aClass114_588 = new Class114(inBuffer, true);
									} else {
										Class70.aClass114_588 = null;
									}

									anInt2161 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 176) {
									destinationX = inBuffer.getUByte();
									if (destinationX == 255) {
										destinationX = 0;
									}

									destinationY = inBuffer.getUByte();
									if (destinationY == 255) {
										destinationY = 0;
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 171) {
									var5 = inBuffer.position + frameSize;
									var6 = inBuffer.getUShort();
									var89 = inBuffer.getUShort();
									if (anInt2226 != var6) {
										anInt2226 = var6;
										ItemTable.method647(false);
										VarClientHub.method173(anInt2226);
										ClientSettings.method160(anInt2226);

										for (var8 = 0; var8 < 100; var8++) {
											aBoolArray2118[var8] = true;
										}
									}

									InterfaceNode var80;
									for (; var89-- > 0; var80.aBool1398 = true) {
										var8 = inBuffer.getInt();
										var9 = inBuffer.getUShort();
										var10 = inBuffer.getUByte();
										var80 = (InterfaceNode) interfaceNodes.get((long) var8);
										if (var80 != null && var80.type != var9) {
											EnumType.method691(var80, true);
											var80 = null;
										}

										if (var80 == null) {
											var80 = InterfaceNode.method579(var8, var9, var10);
										}
									}

									for (var70 = (InterfaceNode) interfaceNodes
											.method150(); var70 != null; var70 = (InterfaceNode) interfaceNodes
													.method151()) {
										if (var70.aBool1398) {
											var70.aBool1398 = false;
										} else {
											EnumType.method691(var70, true);
										}
									}

									widgetConfigs = new NodeTable(512);

									while (inBuffer.position < var5) {
										var8 = inBuffer.getInt();
										var9 = inBuffer.getUShort();
										var10 = inBuffer.getUShort();
										var11 = inBuffer.getInt();

										for (var12 = var9; var12 <= var10; var12++) {
											long var811 = ((long) var8 << 32) + (long) var12;
											widgetConfigs.put(new WidgetConfig(var11), var811);
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								long var76;
								if (frameId == 196) {
									var5 = inBuffer.getUShortA();
									if (var5 == '\uffff') {
										var5 = -1;
									}

									var6 = inBuffer.getLEInt();
									var89 = inBuffer.getULEShort();
									if (var89 == '\uffff') {
										var89 = -1;
									}

									var8 = inBuffer.getInt();

									for (var9 = var89; var9 <= var5; var9++) {
										var76 = (long) var9 + ((long) var6 << 32);
										Node var961 = widgetConfigs.get(var76);
										if (var961 != null) {
											var961.unlink();
										}

										widgetConfigs.put(new WidgetConfig(var8), var76);
									}

									if (GameClient.dump) {
										System.out.println("sendInterfaceSettings(" + (var6 >> 16) + ", "
												+ (var6 & 0xffff) + ", " + var89 + ", " + var5 + ", " + var8 + ");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 201) {
									byte var95 = inBuffer.getByteA();
									var6 = inBuffer.getUShortA();
									Class94.engineVars[var6] = var95;
									if (Class94.tempVars[var6] != var95) {
										Class94.tempVars[var6] = var95;
									}

									if (GameClient.dump) {
										System.out.println("sendVarp(" + var6 + ", " + var95 + ");");
									}

									World.method484(var6);
									anIntArray2152[++anInt2153 - 1 & 0x1f] = var6;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 192) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getULEShort();
									Class94.engineVars[var6] = var5;
									if (Class94.tempVars[var6] != var5) {
										Class94.tempVars[var6] = var5;
									}

									if (GameClient.dump) {
										System.out.println("sendVarp(" + var6 + ", " + var5 + ");");
									}

									World.method484(var6);
									anIntArray2152[++anInt2153 - 1 & 0x1f] = var6;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 218) {
									var5 = inBuffer.getUByte();
									if (inBuffer.getUByte() == 0) {
										localExchangeOffers[var5] = new ExchangeOffer();
										inBuffer.position += 18;
									} else {
										--inBuffer.position;
										localExchangeOffers[var5] = new ExchangeOffer(inBuffer, false);
									}

									anInt2160 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 247) {
									var5 = inBuffer.getULEShortA();
									Class33.method198(var5);
									anIntArray2154[++anInt2079 - 1 & 0x1f] = var5 & 0x7fff;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								long var90;
								long var93;
								String var1131;
								if (frameId == 1) {
									var691 = inBuffer.getString();
									var64 = (long) inBuffer.getUShort();
									var90 = (long) inBuffer.getMedium();
									Permission[] var1141 = new Permission[] { Permission.PLAYER, Permission.PLAYER_MOD,
											Permission.JAGEX_MOD, Permission.IRONMAN, Permission.HARDCORE_IRONMAN };
									Permission var1081 = (Permission) Class30.forOrdinal(var1141, inBuffer.getUByte());
									var93 = (var64 << 32) + var90;
									boolean var112 = false;

									for (var114 = 0; var114 < 100; var114++) {
										if (aLongArray2186[var114] == var93) {
											var112 = true;
											break;
										}
									}

									if (World.method485(var691)) {
										var112 = true;
									}

									if (!var112 && anInt2183 == 0) {
										aLongArray2186[anInt2187] = var93;
										anInt2187 = (anInt2187 + 1) % 100;
										BitBuf var1091 = inBuffer;

										try {
											var18 = var1091.getUSmart();
											if (var18 > 32767) {
												var18 = 32767;
											}

											byte[] var123 = new byte[var18];
											var1091.position += Class120.huffman.decompress(var1091.payload,
													var1091.position, var123, 0, var18);
											String var1211 = LandscapeTile.getString(var123, 0, var18);
											var1131 = var1211;
										} catch (Exception var561) {
											var1131 = "Cabbage";
										}

										var1131 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var1131));
										byte var125;
										if (var1081.aBool611) {
											var125 = 7;
										} else {
											var125 = 3;
										}

										if (var1081.sprite != -1) {
											Class75.method334(var125, Class41.method223(var1081.sprite) + var691,
													var1131);
										} else {
											Class75.method334(var125, var691, var1131);
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								Widget var105;
								if (frameId == 225) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getMEInt();
									var105 = Class94.getWidget(var6);
									if (var105 != null && var105.type == 0) {
										if (var5 > var105.viewportHeight - var105.height * 1227800423) {
											var5 = var105.viewportHeight - var105.height * 1227800423;
										}

										if (var5 < 0) {
											var5 = 0;
										}

										if (var105.insetY != var5) {
											var105.insetY = var5;
											Class68.method326(var105);
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 236) {
									InterfaceNode.anInt1400 = inBuffer.getUByteA();
									Player.anInt1988 = inBuffer.getUByte();

									while (inBuffer.position < frameSize) {
										frameId = inBuffer.getUByte();
										RuneScript.prcoessSceneFrame();
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 80) {
									var691 = inBuffer.getString();
									Object[] var106 = new Object[var691.length() + 1];

									for (var89 = var691.length() - 1; var89 >= 0; --var89) {
										if (var691.charAt(var89) == 115) {
											var106[var89 + 1] = inBuffer.getString();
										} else {
											var106[var89 + 1] = new Integer(inBuffer.getInt());
										}
									}

									var106[0] = new Integer(inBuffer.getInt());
									ScriptEvent var1111 = new ScriptEvent();
									var1111.args = var106;
									Class96_Sub1.execute(var1111);

									StringBuilder builder = new StringBuilder();
									for (int i = 1; i < var106.length; i++) {
										Object obj = var106[i];
										if (obj instanceof String) {
											builder.append("\"" + ((String) obj) + "\""
													+ ((i == var106.length - 1) ? "" : ", "));
										} else {
											builder.append(
													"" + ((Integer) obj) + "" + ((i == var106.length - 1) ? "" : ", "));
										}
									}
									System.out.println("sendCS2Script(" + var106[0] + ", new Object[] { "
											+ builder.toString() + " });");

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 212) {
									anInt2110 = inBuffer.getUByte();
									anInt2182 = inBuffer.getUByte();
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 15 || frameId == 220 || frameId == 5 || frameId == 231 || frameId == 108
										|| frameId == 36 || frameId == 147 || frameId == 25 || frameId == 182
										|| frameId == 189) {
									RuneScript.prcoessSceneFrame();
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 190) {
									aBool2046 = true;
									Class48_Sub1.anInt1299 = inBuffer.getUByte();
									anInt2211 = inBuffer.getUByte();
									GraphicsStub.anInt1813 = inBuffer.getUShort();
									Class36.anInt402 = inBuffer.getUByte();
									TextureLoader.anInt334 = inBuffer.getUByte();
									if (TextureLoader.anInt334 >= 100) {
										var5 = Class48_Sub1.anInt1299 + 64;
										var6 = anInt2211 + 64;
										var89 = NpcType.method802(var5, var6, InterfaceNode.floorLevel * -1331355705)
												- GraphicsStub.anInt1813;
										var8 = var5 - Projectile.cameraX;
										var9 = var89 - FriendedPlayer.cameraZ;
										var10 = var6 - Class72.cameraY;
										var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
										Class67.cameraPitch = (int) (Math.atan2((double) var9, (double) var11)
												* 325.949D) & 0x7ff;
										Class65.cameraYaw = (int) (Math.atan2((double) var8, (double) var10)
												* -325.949D) & 0x7ff;
										if (Class67.cameraPitch < 128) {
											Class67.cameraPitch = 128;
										}

										if (Class67.cameraPitch > 383) {
											Class67.cameraPitch = 383;
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 31) {
									Class7.decodeNpcUpdate(false);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 96) {
									var5 = inBuffer.getLEShort();
									var6 = inBuffer.getLEInt();
									var105 = Class94.getWidget(var6);
									if (var105.anInt1162 != var5 || var5 == -1) {
										var105.anInt1162 = var5;
										var105.anInt1194 = 0;
										var105.anInt1126 = 0;
										Class68.method326(var105);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								Widget var104;
								if (frameId == 126) {
									var5 = inBuffer.getLEInt();
									var6 = inBuffer.getMEInt();
									InterfaceNode var110 = (InterfaceNode) interfaceNodes.get((long) var6);
									var70 = (InterfaceNode) interfaceNodes.get((long) var5);
									if (var70 != null) {
										EnumType.method691(var70, var110 == null || var70.type != var110.type);
									}

									if (var110 != null) {
										var110.unlink();
										interfaceNodes.put(var110, (long) var5);
									}

									var104 = Class94.getWidget(var6);
									if (var104 != null) {
										Class68.method326(var104);
									}

									var104 = Class94.getWidget(var5);
									if (var104 != null) {
										Class68.method326(var104);
										ObjectType.method870(Widget.interfaces[var104.hash >>> 16], var104, true);
									}

									if (anInt2226 != -1) {
										Class65.method319(anInt2226, 1);
									}

									if (GameClient.dump) {
										System.out.println(
												"sendInterfaceTransform(" + (var6 >> 16) + ", " + (var6 & 0xffff) + ", "
														+ (var5 >> 16) + ", " + (var5 & 0xffff) + ");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 144) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getUShort();
									var89 = inBuffer.getInt();
									var8 = inBuffer.getUShort();
									var104 = Class94.getWidget(var89);
									if (var104.rotationX != var5 || var104.rotationZ != var8
											|| var104.modelZoom != var6) {
										var104.rotationX = var5;
										var104.rotationZ = var8;
										var104.modelZoom = var6;
										Class68.method326(var104);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								long var107;
								boolean var118;
								String var131;
								if (frameId == 214) {
									var691 = inBuffer.getString();
									var64 = inBuffer.getLong();
									var90 = (long) inBuffer.getUShort();
									var76 = (long) inBuffer.getMedium();
									Permission[] var116 = new Permission[] { Permission.PLAYER, Permission.PLAYER_MOD,
											Permission.JAGEX_MOD, Permission.IRONMAN, Permission.HARDCORE_IRONMAN };
									Permission var122 = (Permission) Class30.forOrdinal(var116, inBuffer.getUByte());
									var107 = (var90 << 32) + var76;
									var118 = false;

									for (var17 = 0; var17 < 100; var17++) {
										if (aLongArray2186[var17] == var107) {
											var118 = true;
											break;
										}
									}

									if (var122.aBool615 && World.method485(var691)) {
										var118 = true;
									}

									if (!var118 && anInt2183 == 0) {
										aLongArray2186[anInt2187] = var107;
										anInt2187 = (anInt2187 + 1) % 100;
										BitBuf var1241 = inBuffer;

										String var1411;
										try {
											var145 = var1241.getUSmart();
											if (var145 > 32767) {
												var145 = 32767;
											}

											byte[] var159 = new byte[var145];
											var1241.position += Class120.huffman.decompress(var1241.payload,
													var1241.position, var159, 0, var145);
											var131 = LandscapeTile.getString(var159, 0, var145);
											var1411 = var131;
										} catch (Exception var55) {
											var1411 = "Cabbage";
										}

										var1411 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var1411));
										if (var122.sprite != -1) {
											SpotAnimType.method658(9, Class41.method223(var122.sprite) + var691,
													var1411, OverlayType.method716(var64));
										} else {
											SpotAnimType.method658(9, var691, var1411, OverlayType.method716(var64));
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 90) {
									ByteBuf.method644();
									weight = inBuffer.getShort();
									anInt2155 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 180) {
									anInt2075 = inBuffer.getUByte();
									if (anInt2075 == 1) {
										anInt2021 = inBuffer.getUShort();
									}

									if (anInt2075 >= 2 && anInt2075 <= 6) {
										if (anInt2075 == 2) {
											anInt2116 = 64;
											anInt2025 = 64;
										}

										if (anInt2075 == 3) {
											anInt2116 = 0;
											anInt2025 = 64;
										}

										if (anInt2075 == 4) {
											anInt2116 = 128;
											anInt2025 = 64;
										}

										if (anInt2075 == 5) {
											anInt2116 = 64;
											anInt2025 = 0;
										}

										if (anInt2075 == 6) {
											anInt2116 = 64;
											anInt2025 = 128;
										}

										anInt2075 = 2;
										hintArrowX = inBuffer.getUShort();
										hintArrowY = inBuffer.getUShort();
										anInt2032 = inBuffer.getUByte() * -537897385;
									}

									if (anInt2075 == 10) {
										anInt2158 = inBuffer.getUShort();
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 183) {
									friendListSize = 1;
									anInt2114 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 237) {
									ByteBuf.method644();
									var5 = inBuffer.getInt();
									var6 = inBuffer.getUByteS();
									var89 = inBuffer.getUByteC();
									currentLevels[var89] = var5;
									levels[var89] = var6;
									experiences[var89] = 1;

									for (var8 = 0; var8 < 98; var8++) {
										if (var5 >= Class65.anIntArray582[var8]) {
											experiences[var89] = var8 + 2;
										}
									}

									if (GameClient.dump) {
										System.out.println("sendSkills(" + var89 + ", " + var6 + ", " + var5 + ");");
									}

									anIntArray2156[++anInt2157 - 1 & 0x1f] = var89;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 110) {
									var5 = inBuffer.getInt();
									var1131 = inBuffer.getString();
									var105 = Class94.getWidget(var5);
									if (!var1131.equals(var105.text)) {
										var105.text = var1131;
										Class68.method326(var105);
									}

									if (GameClient.dump) {
										System.out.println("sendInterfaceText(" + (var5 >> 16) + ", " + (var5 & 0xffff)
												+ ", \"" + var1131 + "\");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								String var1151;
								String var117;
								if (frameId == 107) {
									while (inBuffer.position < frameSize) {
										var5 = inBuffer.getUByte();
										var118 = (var5 & 0x1) == 1;
										var1151 = inBuffer.getString();
										var117 = inBuffer.getString();
										inBuffer.getString();

										IgnoredPlayer var1351;
										for (var9 = 0; var9 < anInt2229; var9++) {
											var1351 = ignoredPlayers[var9];
											if (var118) {
												if (var117.equals(var1351.displayName)) {
													var1351.displayName = var1151;
													var1351.previousName = var117;
													var1151 = null;
													break;
												}
											} else if (var1151.equals(var1351.displayName)) {
												var1351.displayName = var1151;
												var1351.previousName = var117;
												var1151 = null;
												break;
											}
										}

										if (var1151 != null && anInt2229 < 400) {
											var1351 = new IgnoredPlayer();
											ignoredPlayers[anInt2229] = var1351;
											var1351.displayName = var1151;
											var1351.previousName = var117;
											++anInt2229;
										}
									}

									anInt2114 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 242) {
									IdentKitType.decodeClassVerifier(inBuffer, frameSize, -1457674298);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 87) {
									var5 = inBuffer.getULEShortA();
									var6 = inBuffer.getIMEInt();
									var105 = Class94.getWidget(var6);
									if (var105.modelType != 1 || var105.modelId != var5) {
										var105.modelType = 1;
										var105.modelId = var5;
										Class68.method326(var105);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 217) {
									var6 = inBuffer.getUByte();
									Class51[] var132 = Class41.method225(94483834);
									var8 = 0;

									Class51 var158;
									while (true) {
										if (var8 >= var132.length) {
											var158 = null;
											break;
										}

										Class51 var144 = var132[var8];
										if (var144.anInt525 == var6) {
											var158 = var144;
											break;
										}

										++var8;
									}

									VarClientHub.aClass51_320 = var158;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 103) {
									var5 = inBuffer.getULEShortA();
									if (var5 == '\uffff') {
										var5 = -1;
									}

									Class22.method158(var5);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 135) {
									var5 = inBuffer.getUShortA();
									if (var5 == '\uffff') {
										var5 = -1;
									}

									var6 = inBuffer.getMEMedium();
									if (anInt2201 != 0 && var5 != -1) {
										Class69.method328(PlayerConfig.midiTack2Index, var5, 0, anInt2201, false);
										aBool2191 = true;
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 239) {
									Class7.decodeMapRegion(false);
									inBuffer.getHeader();
									var5 = inBuffer.getUShort();
									Class26.decodePlayerUpdate(inBuffer, var5);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 143) {
									var5 = inBuffer.getInt();
									ConsumingImageProducer.aClass61_1215 = IsaacRandom.taskManager.createHost(var5);
									if (GameClient.dump) {
										System.out.println("sendIP(\"" + TaskManager.method315(var5) + "\");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 84) {
									anInt2159 = anInt2151;
									if (frameSize == 0) {
										clanChatOwner = null;
										clanChatName = null;
										Class86.clanChatSize = 0;
										InterfaceNode.clanMates = null;
										frameId = -1;
										var67 = true;
										break label4260;
									}

									clanChatName = inBuffer.getString();
									long var157 = inBuffer.getLong();
									var90 = var157;
									if (var157 > 0L && var157 < 6582952005840035281L) {
										if (var157 % 37L == 0L) {
											var1151 = null;
										} else {
											var10 = 0;

											for (long var151 = var157; var151 != 0L; var151 /= 37L) {
												++var10;
											}

											StringBuilder var155 = new StringBuilder(var10);

											while (var90 != 0L) {
												var107 = var90;
												var90 /= 37L;
												var155.append(Class91.aCharArray723[(int) (var107 - var90 * 37L)]);
											}

											var1151 = var155.reverse().toString();
										}
									} else {
										var1151 = null;
									}

									clanChatOwner = var1151;
									Class43.aByte451 = inBuffer.getByte();
									var10 = inBuffer.getUByte();
									if (var10 == 255) {
										frameId = -1;
										var67 = true;
										break label4260;
									}

									Class86.clanChatSize = var10;
									ClanMate[] var156 = new ClanMate[100];

									for (var12 = 0; var12 < Class86.clanChatSize; var12++) {
										var156[var12] = new ClanMate();
										var156[var12].displayName = inBuffer.getString();
										var156[var12].aString1223 = VarPlayerType.method728(var156[var12].displayName,
												Class48_Sub1.aClass124_1297);
										var156[var12].world = inBuffer.getUShort();
										var156[var12].rank = inBuffer.getByte();
										inBuffer.getString();
										if (var156[var12].displayName.equals(Class68.myPlayer.name)) {
											clanChatRank = var156[var12].rank;
										}
									}

									var120 = false;
									var14 = Class86.clanChatSize;

									while (var14 > 0) {
										var120 = true;
										--var14;

										for (var114 = 0; var114 < var14; var114++) {
											if (var156[var114].aString1223
													.compareTo(var156[var114 + 1].aString1223) > 0) {
												ClanMate var148 = var156[var114];
												var156[var114] = var156[var114 + 1];
												var156[var114 + 1] = var148;
												var120 = false;
											}
										}

										if (var120) {
											break;
										}
									}

									InterfaceNode.clanMates = var156;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 208) {
									var5 = inBuffer.getULEShort();
									anInt2226 = var5;
									ItemTable.method647(false);
									VarClientHub.method173(var5);
									ClientSettings.method160(anInt2226);

									for (var6 = 0; var6 < 100; var6++) {
										aBoolArray2118[var6] = true;
									}

									if (GameClient.dump) {
										System.out.println("sendRootInterface(" + var5 + ");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 132) {
									Player.anInt1988 = inBuffer.getUByteS();
									InterfaceNode.anInt1400 = inBuffer.getUByte();

									for (var5 = InterfaceNode.anInt1400; var5 < InterfaceNode.anInt1400 + 8; var5++) {
										for (var6 = Player.anInt1988; var6 < Player.anInt1988 + 8; var6++) {
											if (groundItemDeque[InterfaceNode.floorLevel
													* -1331355705][var5][var6] != null) {
												groundItemDeque[InterfaceNode.floorLevel
														* -1331355705][var5][var6] = null;
												Class32.method195(var5, var6);
											}
										}
									}

									for (Node_Sub8 var154 = (Node_Sub8) aDeque2193
											.getFront(); var154 != null; var154 = (Node_Sub8) aDeque2193.getNext()) {
										if (var154.anInt1300 >= InterfaceNode.anInt1400
												&& var154.anInt1300 < InterfaceNode.anInt1400 + 8
												&& var154.anInt1312 >= Player.anInt1988
												&& var154.anInt1312 < Player.anInt1988 + 8
												&& InterfaceNode.floorLevel * -1331355705 == var154.anInt1302) {
											var154.anInt1311 = 0;
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 151) {
									Class81.logout();
									frameId = -1;
									var67 = false;
									break label4260;
								}

								if (frameId == 199) {
									var691 = inBuffer.getString();
									BitBuf var1531 = inBuffer;

									try {
										var9 = var1531.getUSmart();
										if (var9 > 32767) {
											var9 = 32767;
										}

										byte[] var143 = new byte[var9];
										var1531.position += Class120.huffman.decompress(var1531.payload,
												var1531.position, var143, 0, var9);
										String var147 = LandscapeTile.getString(var143, 0, var9);
										var117 = var147;
									} catch (Exception var541) {
										var117 = "Cabbage";
									}

									var117 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var117));
									Class75.method334(6, var691, var117);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 142) {
									var5 = inBuffer.getLEInt();
									var118 = inBuffer.getUByteA() == 1;
									var105 = Class94.getWidget(var5);
									if (var105.hidden != var118) {
										var105.hidden = var118;
										Class68.method326(var105);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 29) {
									var5 = inBuffer.getMEInt();
									var68 = Class94.getWidget(var5);
									var68.modelType = 3;
									var68.modelId = Class68.myPlayer.config.method269();
									Class68.method326(var68);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 244) {
									var5 = inBuffer.getInt();
									InterfaceNode var152 = (InterfaceNode) interfaceNodes.get((long) var5);
									if (var152 != null) {
										EnumType.method691(var152, true);
									}

									if (aWidget2135 != null) {
										Class68.method326(aWidget2135);
										aWidget2135 = null;
									}

									if (GameClient.dump) {
										System.out.println(
												"sendInterfaceClose(" + (var5 >> 16) + ", " + (var5 & 0xffff) + ");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 216) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getUShort();
									if (var5 < -70000) {
										var6 += '\u8000';
									}

									System.out.println("sendSlottedItems(" + (var5 >> 16) + ", " + (var5 & 0xffff)
											+ ", " + var6 + ");");
									if (var5 >= 0) {
										var105 = Class94.getWidget(var5);
									} else {
										var105 = null;
									}

									for (; inBuffer.position < frameSize; ItemType.setItemTableSlot(var6, var8,
											var9 - 1, var10)) {
										var8 = inBuffer.getUSmart();
										var9 = inBuffer.getUShort();
										var10 = 0;
										if (var9 != 0) {
											var10 = inBuffer.getUByte();
											if (var10 == 255) {
												var10 = inBuffer.getInt();
											}
										}

										if (var105 != null && var8 >= 0 && var8 < var105.itemIds.length) {
											var105.itemIds[var8] = var9;
											var105.itemQuantities[var8] = var10;
										}
									}

									if (var105 != null) {
										Class68.method326(var105);
									}

									ByteBuf.method644();
									anIntArray2154[++anInt2079 - 1 & 0x1f] = var6 & 0x7fff;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 41) {
									Player.anInt1988 = inBuffer.getUByteC();
									InterfaceNode.anInt1400 = inBuffer.getUByteC();
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 82) {
									var691 = inBuffer.getString();
									var6 = inBuffer.getUByteA();
									var89 = inBuffer.getUByteC();
									if (var89 >= 1 && var89 <= 8) {
										if (var691.equalsIgnoreCase("null")) {
											var691 = null;
										}

										playerActions[var89 - 1] = var691;
										aBoolArray2109[var89 - 1] = var6 == 0;
									}

									if (GameClient.dump) {
										System.out.println("sendPlayerAction(" + var89 + ", \"" + var691 + "\", "
												+ (var89 == 0) + ");");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 137) {
									for (var5 = 0; var5 < VarPlayerType.anInt1547; var5++) {
										VarPlayerType var149 = Class37.getVarPlayerType(var5);
										if (var149 != null) {
											Class94.engineVars[var5] = 0;
											Class94.tempVars[var5] = 0;
										}
									}

									if (GameClient.dump) {
										System.out.println("sendVarpReset();");
									}

									ByteBuf.method644();
									anInt2153 += 32;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 202) {
									if (anInt2226 != -1) {
										Class65.method319(anInt2226, 0);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 160) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getUShort();
									if (var5 < -70000) {
										var6 += '\u8000';
									}

									System.out.println(
											"sendItems(" + (var5 >> 16) + ", " + (var5 & 0xffff) + ", " + var6 + ");");
									if (var5 >= 0) {
										var105 = Class94.getWidget(var5);
									} else {
										var105 = null;
									}

									if (var105 != null) {
										for (var8 = 0; var8 < var105.itemIds.length; var8++) {
											var105.itemIds[var8] = 0;
											var105.itemQuantities[var8] = 0;
										}
									}

									GameCanvas.resetItemTable(var6);
									var8 = inBuffer.getUShort();

									for (var9 = 0; var9 < var8; var9++) {
										var10 = inBuffer.getULEShortA();
										var11 = inBuffer.getUByte();
										if (var11 == 255) {
											var11 = inBuffer.getMEInt();
										}

										if (var105 != null && var9 < var105.itemIds.length) {
											var105.itemIds[var9] = var10;
											var105.itemQuantities[var9] = var11;
										}

										ItemType.setItemTableSlot(var6, var9, var10 - 1, var11);
									}

									if (var105 != null) {
										Class68.method326(var105);
									}

									ByteBuf.method644();
									anIntArray2154[++anInt2079 - 1 & 0x1f] = var6 & 0x7fff;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 9) {
									var691 = inBuffer.getString();
									sessionToken = var691;

									try {
										var1131 = clientInstance.getParameter(Parameters.aParameters60.key);
										var1151 = clientInstance.getParameter(Parameters.aParameters73.key);
										var117 = var1131 + "settings=" + var691 + "; version=1; path=/; domain="
												+ var1151;
										if (var691.length() == 0) {
											var117 = var117 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
										} else {
											var117 = var117 + "; Expires="
													+ Class51.method255(AnimationSkin.currentTimeMs() + 94608000000L)
													+ "; Max-Age=" + 94608000L;
										}

										Client var1451 = clientInstance;
										var131 = "document.cookie=\"" + var117 + "\"";
										JSObject.getWindow(var1451).eval(var131);
									} catch (Throwable var53) {
										;
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 117) {
									aBool2046 = true;
									BoundaryDecorationStub.anInt216 = inBuffer.getUByte() * -1737876805;
									Class26.anInt310 = inBuffer.getUByte() * -1608345747;
									Class3.anInt94 = inBuffer.getUShort();
									ObjectType.anInt1695 = inBuffer.getUByte();
									RuneScript.anInt1722 = inBuffer.getUByte() * -714496409;
									if (RuneScript.anInt1722 * -2101471913 >= 100) {
										Projectile.cameraX = BoundaryDecorationStub.anInt216 * 915224960 + 64;
										Class72.cameraY = Class26.anInt310 * 402993792 + 64;
										FriendedPlayer.cameraZ = NpcType.method802(Projectile.cameraX, Class72.cameraY,
												InterfaceNode.floorLevel * -1331355705) - Class3.anInt94;
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 43) {
									var5 = inBuffer.getUByte();
									var6 = inBuffer.getUByte();
									var89 = inBuffer.getUByte();
									var8 = inBuffer.getUByte();
									aBoolArray2033[var5] = true;
									anIntArray2212[var5] = var6;
									anIntArray2213[var5] = var89;
									anIntArray2216[var5] = var8;
									anIntArray2215[var5] = 0;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								boolean var119;
								if (frameId == 165) {
									FriendedPlayer var142;
									while (inBuffer.position < frameSize) {
										var74 = inBuffer.getUByte() == 1;
										var1131 = inBuffer.getString();
										var1151 = inBuffer.getString();
										var8 = inBuffer.getUShort();
										var9 = inBuffer.getUByte();
										var10 = inBuffer.getUByte();
										boolean var136 = (var10 & 0x2) != 0;
										var120 = (var10 & 0x1) != 0;
										if (var8 > 0) {
											inBuffer.getString();
											inBuffer.getUByte();
											inBuffer.getInt();
										}

										inBuffer.getString();

										for (var13 = 0; var13 < anInt2184; var13++) {
											var142 = friendedPlayers[var13];
											if (!var74) {
												if (var1131.equals(var142.displayName)) {
													if (var142.world != var8) {
														boolean var139 = true;

														for (Class96_Sub1 var150 = (Class96_Sub1) aClass102_2228
																.method416(); var150 != null; var150 = (Class96_Sub1) aClass102_2228
																		.method418()) {
															if (var150.aString1203.equals(var1131)) {
																if (var8 != 0 && var150.aShort1205 == 0) {
																	var150.method411();
																	var139 = false;
																} else if (var8 == 0 && var150.aShort1205 != 0) {
																	var150.method411();
																	var139 = false;
																}
															}
														}

														if (var139) {
															aClass102_2228.method417(new Class96_Sub1(var1131, var8));
														}

														var142.world = var8;
													}

													var142.previousName = var1151;
													var142.anInt737 = var9;
													var142.aBool736 = var136;
													var142.aBool738 = var120;
													var1131 = null;
													break;
												}
											} else if (var1151.equals(var142.displayName)) {
												var142.displayName = var1131;
												var142.previousName = var1151;
												var1131 = null;
												break;
											}
										}

										if (var1131 != null && anInt2184 < 400) {
											var142 = new FriendedPlayer();
											friendedPlayers[anInt2184] = var142;
											var142.displayName = var1131;
											var142.previousName = var1151;
											var142.world = var8;
											var142.anInt737 = var9;
											var142.aBool736 = var136;
											var142.aBool738 = var120;
											++anInt2184;
										}
									}

									friendListSize = 2;
									anInt2114 = anInt2151;
									var74 = false;
									var6 = anInt2184;

									while (var6 > 0) {
										var74 = true;
										--var6;

										for (var89 = 0; var89 < var6; var89++) {
											var119 = false;
											FriendedPlayer var1381 = friendedPlayers[var89];
											var142 = friendedPlayers[var89 + 1];
											if (var1381.world != myWorld && var142.world == myWorld) {
												var119 = true;
											}

											if (!var119 && var1381.world == 0 && var142.world != 0) {
												var119 = true;
											}

											if (!var119 && !var1381.aBool736 && var142.aBool736) {
												var119 = true;
											}

											if (!var119 && !var1381.aBool738 && var142.aBool738) {
												var119 = true;
											}

											if (var119) {
												FriendedPlayer var146 = friendedPlayers[var89];
												friendedPlayers[var89] = friendedPlayers[var89 + 1];
												friendedPlayers[var89 + 1] = var146;
												var74 = false;
											}
										}

										if (var74) {
											break;
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 0) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getUShort();
									var89 = inBuffer.getInt();
									var71 = Class94.getWidget(var89);
									var71.anInt1149 = (var5 << 16) + var6;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 153) {
									anInt2200 = inBuffer.getUByte();
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 122) {
									var5 = inBuffer.getIMEInt();
									var6 = inBuffer.getShortA();
									var89 = inBuffer.getLEShortA();
									var71 = Class94.getWidget(var5);
									if (var71.anInt1134 * -459849887 != var6 || var71.anInt1185 * 538516377 != var89
											|| var71.anInt1132 != 0 || var71.anInt1122 != 0) {
										var71.anInt1134 = var6 * 10986657;
										var71.anInt1185 = var89 * -720369495;
										var71.anInt1132 = 0;
										var71.anInt1122 = 0;
										Class68.method326(var71);
										Player.method1048(var71);
										if (var71.type == 0) {
											ObjectType.method870(Widget.interfaces[var5 >> 16], var71, false);
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 177) {
									ByteBuf.method644();
									energy = inBuffer.getUByte();
									anInt2155 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 116) {
									var691 = inBuffer.getString();
									var6 = inBuffer.getUShort();
									byte var133 = inBuffer.getByte();
									var119 = false;
									if (var133 == -128) {
										var119 = true;
									}

									if (var119) {
										if (Class86.clanChatSize == 0) {
											frameId = -1;
											var67 = true;
											break label4260;
										}

										boolean var140 = false;

										for (var9 = 0; var9 < Class86.clanChatSize
												&& (!InterfaceNode.clanMates[var9].displayName.equals(var691)
														|| InterfaceNode.clanMates[var9].world != var6); var9++) {
											;
										}

										if (var9 < Class86.clanChatSize) {
											while (var9 < Class86.clanChatSize - 1) {
												InterfaceNode.clanMates[var9] = InterfaceNode.clanMates[var9 + 1];
												++var9;
											}

											--Class86.clanChatSize;
											InterfaceNode.clanMates[Class86.clanChatSize] = null;
										}
									} else {
										inBuffer.getString();
										ClanMate var137 = new ClanMate();
										var137.displayName = var691;
										var137.aString1223 = VarPlayerType.method728(var137.displayName,
												Class48_Sub1.aClass124_1297);
										var137.world = var6;
										var137.rank = var133;

										for (var10 = Class86.clanChatSize - 1; var10 >= 0; --var10) {
											var11 = InterfaceNode.clanMates[var10].aString1223
													.compareTo(var137.aString1223);
											if (var11 == 0) {
												InterfaceNode.clanMates[var10].world = var6;
												InterfaceNode.clanMates[var10].rank = var133;
												if (var691.equals(Class68.myPlayer.name)) {
													clanChatRank = var133;
												}

												anInt2159 = anInt2151;
												frameId = -1;
												var67 = true;
												break label4260;
											}

											if (var11 < 0) {
												break;
											}
										}

										if (Class86.clanChatSize >= InterfaceNode.clanMates.length) {
											frameId = -1;
											var67 = true;
											break label4260;
										}

										for (var11 = Class86.clanChatSize - 1; var11 > var10; --var11) {
											InterfaceNode.clanMates[var11 + 1] = InterfaceNode.clanMates[var11];
										}

										if (Class86.clanChatSize == 0) {
											InterfaceNode.clanMates = new ClanMate[100];
										}

										InterfaceNode.clanMates[var10 + 1] = var137;
										++Class86.clanChatSize;
										if (var691.equals(Class68.myPlayer.name)) {
											clanChatRank = var133;
										}
									}

									anInt2159 = anInt2151;
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 156) {
									aBool2046 = false;

									for (var5 = 0; var5 < 5; var5++) {
										aBoolArray2033[var5] = false;
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 19) {
									for (var5 = 0; var5 < Class94.tempVars.length; var5++) {
										if (Class94.tempVars[var5] != Class94.engineVars[var5]) {
											Class94.tempVars[var5] = Class94.engineVars[var5];
											World.method484(var5);
											anIntArray2152[++anInt2153 - 1 & 0x1f] = var5;
										}
									}

									if (GameClient.dump) {
										System.out.println("sendVarpRecache();");
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 145) {
									var5 = inBuffer.getUSmart();
									var118 = inBuffer.getUByte() == 1;
									var1151 = "";
									var119 = false;
									if (var118) {
										var1151 = inBuffer.getString();
										if (World.method485(var1151)) {
											var119 = true;
										}
									}

									var131 = inBuffer.getString();
									if (!var119) {
										Class75.method334(var5, var1151, var131);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 185) {
									var5 = inBuffer.getInt();
									var68 = Class94.getWidget(var5);

									for (var89 = 0; var89 < var68.itemIds.length; var89++) {
										var68.itemIds[var89] = -1;
										var68.itemIds[var89] = 0;
									}

									Class68.method326(var68);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 62) {
									World var130 = new World();
									var130.domain = inBuffer.getString();
									var130.id = inBuffer.getUShort();
									var6 = inBuffer.getInt();
									var130.flags = var6;
									Node_Sub8.method550(45);
									Class31.gameConnection.shutdown();
									Class31.gameConnection = null;
									Class88.setWorld(var130);
									frameId = -1;
									var67 = false;
									break label4260;
								}

								if (frameId == 35) {
									Class7.decodeMapRegion(true);
									inBuffer.getHeader();
									var5 = inBuffer.getUShort();
									Class26.decodePlayerUpdate(inBuffer, var5);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 181) {
									Class7.decodeNpcUpdate(true);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 172) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getInt();
									var105 = Class94.getWidget(var6);
									if (var105.modelType != 2 || var105.modelId != var5) {
										var105.modelType = 2;
										var105.modelId = var5;
										Class68.method326(var105);
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 169) {
									Class26.decodePlayerUpdate(inBuffer, frameSize);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 4) {
									inBuffer.position += 28;
									if (inBuffer.checkCrc()) {
										BitBuf var129 = inBuffer;
										var6 = inBuffer.position - 28;
										if (Class75.randomDat != null) {
											try {
												Class75.randomDat.seek(0L);
												Class75.randomDat.write(var129.payload, var6, 24);
											} catch (Exception var52) {
												;
											}
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 222) {
									for (var5 = 0; var5 < playerArray.length; var5++) {
										if (playerArray[var5] != null) {
											playerArray[var5].animation = -1;
										}
									}

									for (var5 = 0; var5 < npcArray.length; var5++) {
										if (npcArray[var5] != null) {
											npcArray[var5].animation = -1;
										}
									}

									frameId = -1;
									var67 = true;
									break label4260;
								}

								if (frameId == 68) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getInt();
									if (Class36.aGarbageCollectorMXBean400 == null
											|| !Class36.aGarbageCollectorMXBean400.isValid()) {
										try {
											Iterator var127 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

											while (var127.hasNext()) {
												GarbageCollectorMXBean var134 = (GarbageCollectorMXBean) var127.next();
												if (var134.isValid()) {
													Class36.aGarbageCollectorMXBean400 = var134;
													aLong2126 = -1L;
													aLong2232 = -1L;
												}
											}
										} catch (Throwable var59) {
											;
										}
									}

									long var128 = AnimationSkin.currentTimeMs();
									var9 = -1;
									if (Class36.aGarbageCollectorMXBean400 != null) {
										var76 = Class36.aGarbageCollectorMXBean400.getCollectionTime();
										if (aLong2232 != -1L) {
											var93 = var76 - aLong2232;
											var107 = var128 - aLong2126;
											if (var107 != 0L) {
												var9 = (int) (var93 * 100L / var107);
											}
										}

										aLong2232 = var76;
										aLong2126 = var128;
									}

									outBuffer.putHeader(230);
									outBuffer.putByteC(fps);
									outBuffer.putByteC(var9);
									outBuffer.putLEInt(var5);
									outBuffer.putMEInt(var6);
									frameId = -1;
									var67 = true;
									break label4260;
								}

								Class79.error("" + frameId + Class35.aString387 + secondLastFrameId + Class35.aString387
										+ thridLastFrameId + Class35.aString387 + frameSize, (Throwable) null);
								Class81.logout();
							} catch (IOException var60) {
								Class81.method361();
							} catch (Exception var61) {
								var691 = "" + frameId + Class35.aString387 + secondLastFrameId + Class35.aString387
										+ thridLastFrameId + Class35.aString387 + frameSize + Class35.aString387
										+ (Class68.myPlayer.anIntArray1945[0] + Node_Sub10.chunkLeftX)
										+ Class35.aString387
										+ (VarClientHub.chunkLeftY + Class68.myPlayer.anIntArray1955[0])
										+ Class35.aString387;

								for (var6 = 0; var6 < frameSize && var6 < 50; var6++) {
									var691 = var691 + inBuffer.payload[var6] + Class35.aString387;
								}

								Class79.error(var691, var61);
								Class81.logout();
							}

							var67 = true;
						}
					}

					if (!var67) {
						break;
					}
				}

				if (anInt2113 == 30) {
					while (GraphicsStub.method936(-504055230)) {
						outBuffer.putHeader(54);
						outBuffer.putByte(0);
						var2 = outBuffer.position;
						BitBuf.encodeClassVerifier(outBuffer);
						outBuffer.putVarByte(outBuffer.position - var2);
					}

					Object var75 = Npc.aClass30_1968.anObject342;
					synchronized (var75) {
						if (!aBool2006) {
							Npc.aClass30_1968.anInt338 = 0;
						} else if (Class74.anInt627 != 0 || Npc.aClass30_1968.anInt338 >= 40) {
							outBuffer.putHeader(157);
							outBuffer.putByte(0);
							var3 = outBuffer.position;
							var83 = 0;

							for (var5 = 0; var5 < Npc.aClass30_1968.anInt338
									&& outBuffer.position - var3 < 240; var5++) {
								++var83;
								var6 = Npc.aClass30_1968.anIntArray340[var5];
								if (var6 < 0) {
									var6 = 0;
								} else if (var6 > 502) {
									var6 = 502;
								}

								var89 = Npc.aClass30_1968.anIntArray337[var5];
								if (var89 < 0) {
									var89 = 0;
								} else if (var89 > 764) {
									var89 = 764;
								}

								var8 = var6 * 765 + var89;
								if (Npc.aClass30_1968.anIntArray340[var5] == -1
										&& Npc.aClass30_1968.anIntArray337[var5] == -1) {
									var89 = -1;
									var6 = -1;
									var8 = 524287;
								}

								if (anInt2017 == var89 && anInt2227 == var6) {
									if (anInt2019 < 2047) {
										++anInt2019;
									}
								} else {
									var9 = var89 - anInt2017;
									anInt2017 = var89;
									var10 = var6 - anInt2227;
									anInt2227 = var6;
									if (anInt2019 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
										var9 += 32;
										var10 += 32;
										outBuffer.putShort((var9 << 6) + var10 + (anInt2019 << 12));
										anInt2019 = 0;
									} else if (anInt2019 < 8) {
										outBuffer.putMedium((anInt2019 << 19) + var8 + 8388608);
										anInt2019 = 0;
									} else {
										outBuffer.putInt((anInt2019 << 19) + -1073741824 + var8);
										anInt2019 = 0;
									}
								}
							}

							outBuffer.putVarByte(outBuffer.position - var3);
							if (var83 >= Npc.aClass30_1968.anInt338) {
								Npc.aClass30_1968.anInt338 = 0;
							} else {
								Npc.aClass30_1968.anInt338 -= var83;

								for (var5 = 0; var5 < Npc.aClass30_1968.anInt338; var5++) {
									Npc.aClass30_1968.anIntArray337[var5] = Npc.aClass30_1968.anIntArray337[var5
											+ var83];
									Npc.aClass30_1968.anIntArray340[var5] = Npc.aClass30_1968.anIntArray340[var5
											+ var83];
								}
							}
						}
					}

					long var72;
					if (Class74.anInt627 == 1 || !ClanMate.aBool1221 && Class74.anInt627 == 4
							|| Class74.anInt627 == 2) {
						var72 = (Class74.aLong630 - aLong2016) / 50L;
						if (var72 > 4095L) {
							var72 = 4095L;
						}

						aLong2016 = Class74.aLong630;
						var83 = Class74.anInt629;
						if (var83 < 0) {
							var83 = 0;
						} else if (var83 > Node_Sub9.gameHeight) {
							var83 = Node_Sub9.gameHeight;
						}

						var5 = Class74.anInt628;
						if (var5 < 0) {
							var5 = 0;
						} else if (var5 > Class34.gameWidth) {
							var5 = Class34.gameWidth;
						}

						var6 = (int) var72;
						outBuffer.putHeader(253);
						outBuffer.putShort((var6 << 1) + (Class74.anInt627 == 2 ? 1 : 0));
						outBuffer.putShort(var5);
						outBuffer.putShort(var83);
					}

					if (KeyFocusListener.anInt602 > 0) {
						outBuffer.putHeader(251);
						outBuffer.putShort(0);
						var2 = outBuffer.position;
						var72 = AnimationSkin.currentTimeMs();

						for (var5 = 0; var5 < KeyFocusListener.anInt602; var5++) {
							var64 = var72 - aLong2030;
							if (var64 > 16777215L) {
								var64 = 16777215L;
							}

							aLong2030 = var72;
							outBuffer.putMEMedium((int) var64);
							outBuffer.putByteC(KeyFocusListener.anIntArray592[var5]);
						}

						outBuffer.putVarShort(outBuffer.position - var2);
					}

					if (anInt2080 > 0) {
						--anInt2080;
					}

					if (KeyFocusListener.aBoolArray593[96] || KeyFocusListener.aBoolArray593[97]
							|| KeyFocusListener.aBoolArray593[98] || KeyFocusListener.aBoolArray593[99]) {
						aBool2081 = true;
					}

					if (aBool2081 && anInt2080 <= 0) {
						anInt2080 = 20;
						aBool2081 = false;
						outBuffer.putHeader(153);
						outBuffer.putLEShortA(anInt2051);
						outBuffer.putLEShort(minimapRotation);
					}

					if (Entity.aBool1439 && !aBool2020) {
						aBool2020 = true;
						outBuffer.putHeader(188);
						outBuffer.putByte(1);
					}

					if (!Entity.aBool1439 && aBool2020) {
						aBool2020 = false;
						outBuffer.putHeader(188);
						outBuffer.putByte(0);
					}

					if (InterfaceNode.floorLevel * -1331355705 != anInt2194) {
						anInt2194 = InterfaceNode.floorLevel * -1331355705;
						var2 = InterfaceNode.floorLevel * -1331355705;
						int[] var77 = RuneScript.minimapSprite.pixels;
						var83 = var77.length;

						for (var5 = 0; var5 < var83; var5++) {
							var77[var5] = 0;
						}

						var5 = 1;

						while (true) {
							if (var5 >= 103) {
								var5 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16)
										+ (238 + (int) (Math.random() * 20.0D) - 10 << 8)
										+ (238 + (int) (Math.random() * 20.0D) - 10);
								var6 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
								RuneScript.minimapSprite.method939();

								for (var89 = 1; var89 < 103; var89++) {
									for (var8 = 1; var8 < 103; var8++) {
										if ((Class39.renderRules[var2][var8][var89] & 0x18) == 0) {
											method1055(var2, var8, var89, var5, var6);
										}

										if (var2 < 3 && (Class39.renderRules[var2 + 1][var8][var89] & 0x8) != 0) {
											method1055(var2 + 1, var8, var89, var5, var6);
										}
									}
								}

								anInt2195 = 0;

								for (var89 = 0; var89 < 104; var89++) {
									for (var8 = 0; var8 < 104; var8++) {
										var9 = InterfaceNode.landscape.method33(InterfaceNode.floorLevel * -1331355705,
												var89, var8);
										if (var9 != 0) {
											var9 = var9 >> 14 & 0x7fff;
											var10 = Class37.getObjectType(var9).mapFunction;
											if (var10 >= 0) {
												var11 = var89;
												var12 = var8;
												if (var10 != 22 && var10 != 29 && var10 != 34 && var10 != 36
														&& var10 != 46 && var10 != 47 && var10 != 48) {
													int[][] var831 = collisionMaps[InterfaceNode.floorLevel
															* -1331355705].flags;

													for (var16 = 0; var16 < 10; var16++) {
														var17 = (int) (Math.random() * 4.0D);
														if (var17 == 0 && var11 > 0 && var11 > var89 - 3
																&& (var831[var11 - 1][var12] & 0x1240108) == 0) {
															--var11;
														}

														if (var17 == 1 && var11 < 103 && var11 < var89 + 3
																&& (var831[var11 + 1][var12] & 0x1240180) == 0) {
															++var11;
														}

														if (var17 == 2 && var12 > 0 && var12 > var8 - 3
																&& (var831[var11][var12 - 1] & 0x1240102) == 0) {
															--var12;
														}

														if (var17 == 3 && var12 < 103 && var12 < var8 + 3
																&& (var831[var11][var12 + 1] & 0x1240120) == 0) {
															++var12;
														}
													}
												}

												aSpriteArray2198[anInt2195] = Node_Sub8.aSpriteArray1309[var10];
												anIntArray2196[anInt2195] = var11;
												anIntArray2197[anInt2195] = var12;
												++anInt2195;
											}
										}
									}
								}

								IndexTable.imageProducer.setRaster();
								break;
							}

							var6 = (103 - var5) * 2048 + 24628;

							for (var89 = 1; var89 < 103; var89++) {
								if ((Class39.renderRules[var2][var89][var5] & 0x18) == 0) {
									InterfaceNode.landscape.method36(var77, var6, 512, var2, var89, var5);
								}

								if (var2 < 3 && (Class39.renderRules[var2 + 1][var89][var5] & 0x8) != 0) {
									InterfaceNode.landscape.method36(var77, var6, 512, var2 + 1, var89, var5);
								}

								var6 += 4;
							}

							++var5;
						}
					}

					if (anInt2113 == 30) {
						for (Node_Sub8 var78 = (Node_Sub8) aDeque2193
								.getFront(); var78 != null; var78 = (Node_Sub8) aDeque2193.getNext()) {
							if (var78.anInt1311 > 0) {
								--var78.anInt1311;
							}

							ObjectType var84;
							if (var78.anInt1311 == 0) {
								if (var78.anInt1304 >= 0) {
									var83 = var78.anInt1304;
									var5 = var78.anInt1313;
									var84 = Class37.getObjectType(var83);
									if (var5 == 11) {
										var5 = 10;
									}

									if (var5 >= 5 && var5 <= 8) {
										var5 = 4;
									}

									var67 = var84.method866(var5);
									if (!var67) {
										continue;
									}
								}

								ItemPile.method454(var78.anInt1302, var78.anInt1303, var78.anInt1300, var78.anInt1312,
										var78.anInt1304, var78.anInt1306, var78.anInt1313);
								var78.unlink();
							} else {
								if (var78.anInt1310 > 0) {
									--var78.anInt1310;
								}

								if (var78.anInt1310 == 0 && var78.anInt1300 >= 1 && var78.anInt1312 >= 1
										&& var78.anInt1300 <= 102 && var78.anInt1312 <= 102) {
									if (var78.anInt1307 >= 0) {
										var83 = var78.anInt1307;
										var5 = var78.anInt1305;
										var84 = Class37.getObjectType(var83);
										if (var5 == 11) {
											var5 = 10;
										}

										if (var5 >= 5 && var5 <= 8) {
											var5 = 4;
										}

										var67 = var84.method866(var5);
										if (!var67) {
											continue;
										}
									}

									ItemPile.method454(var78.anInt1302, var78.anInt1303, var78.anInt1300,
											var78.anInt1312, var78.anInt1307, var78.anInt1308, var78.anInt1305);
									var78.anInt1310 = -1;
									if (var78.anInt1307 == var78.anInt1304 && var78.anInt1304 == -1) {
										var78.unlink();
									} else if (var78.anInt1304 == var78.anInt1307 && var78.anInt1306 == var78.anInt1308
											&& var78.anInt1313 == var78.anInt1305) {
										var78.unlink();
									}
								}
							}
						}

						AbstractWheelListener.method344();
						++anInt2041;
						if (anInt2041 <= 750) {
							Class83.method364();
							FriendedPlayer.method407();
							Class59.method293();
							++anInt2066;
							if (cursorState != 0) {
								anInt2097 += 20;
								if (anInt2097 >= 400) {
									cursorState = 0;
								}
							}

							if (Class30.aWidget339 != null) {
								++anInt2098;
								if (anInt2098 >= 15) {
									Class68.method326(Class30.aWidget339);
									Class30.aWidget339 = null;
								}
							}

							var71 = ObjectType.aWidget1719;
							Widget var861 = ScriptEvent.aWidget1437;
							ObjectType.aWidget1719 = null;
							ScriptEvent.aWidget1437 = null;
							aWidget2009 = null;
							aBool2148 = false;
							aBool2145 = false;
							anInt2188 = 0;

							while (Class58.method289(2023348341) && anInt2188 < 128) {
								if (myRights >= 2 && KeyFocusListener.aBoolArray593[82] && Class5.anInt112 == 66) {
									var691 = "";

									DualNode_Sub8 var87;
									for (Iterator var82 = Class32.aClass107_355.iterator(); var82
											.hasNext(); var691 = var691 + var87.aString1521 + ':' + var87.aString1520
													+ '\n') {
										var87 = (DualNode_Sub8) var82.next();
									}

									CacheIndex.sysClipboard.setContents(new StringSelection(var691),
											(ClipboardOwner) null);
								} else {
									anIntArray2190[anInt2188] = Class5.anInt112;
									anIntArray2162[anInt2188] = Class2.aChar80;
									++anInt2188;
								}
							}

							if (anInt2226 != -1) {
								Class40.method222(anInt2226, 0, 0, Class34.gameWidth, Node_Sub9.gameHeight, 0, 0);
							}

							++anInt2151;

							while (true) {
								Widget var851;
								ScriptEvent var88;
								do {
									var88 = (ScriptEvent) aDeque2165.method469();
									if (var88 == null) {
										while (true) {
											do {
												var88 = (ScriptEvent) aDeque2166.method469();
												if (var88 == null) {
													while (true) {
														do {
															var88 = (ScriptEvent) aDeque2164.method469();
															if (var88 == null) {
																Connection.method301();
																if (aWidget2141 != null) {
																	Class68.method326(aWidget2141);
																	++FriendedPlayer.anInt739;
																	if (aBool2148 && aBool2145) {
																		var83 = Class74.anInt621;
																		var5 = Class74.anInt622;
																		var83 -= anInt2127;
																		var5 -= anInt2143;
																		if (var83 < anInt2146) {
																			var83 = anInt2146;
																		}

																		if (aWidget2141.width
																				+ var83 > aWidget2142.width
																						+ anInt2146) {
																			var83 = anInt2146 + aWidget2142.width
																					- aWidget2141.width;
																		}

																		if (var5 < anInt2147) {
																			var5 = anInt2147;
																		}

																		if (aWidget2141.height * 1227800423
																				+ var5 > anInt2147 + aWidget2142.height
																						* 1227800423) {
																			var5 = anInt2147
																					+ aWidget2142.height * 1227800423
																					- aWidget2141.height * 1227800423;
																		}

																		var6 = var83 - anInt2050;
																		var89 = var5 - anInt2149;
																		var8 = aWidget2141.anInt1166;
																		if (FriendedPlayer.anInt739 > aWidget2141.anInt1146
																				&& (var6 > var8 || var6 < -var8
																						|| var89 > var8
																						|| var89 < -var8)) {
																			aBool2150 = true;
																		}

																		var9 = aWidget2142.insetX + (var83 - anInt2146);
																		var10 = aWidget2142.insetY + (var5 - anInt2147);
																		ScriptEvent var98;
																		if (aWidget2141.anObjectArray1176 != null
																				&& aBool2150) {
																			var98 = new ScriptEvent();
																			var98.widget = aWidget2141;
																			var98.anInt1438 = var9;
																			var98.anInt1431 = var10;
																			var98.args = aWidget2141.anObjectArray1176;
																			Class96_Sub1.execute(var98);
																		}

																		if (Class74.anInt624 == 0) {
																			if (aBool2150) {
																				if (aWidget2141.anObjectArray1177 != null) {
																					var98 = new ScriptEvent();
																					var98.widget = aWidget2141;
																					var98.anInt1438 = var9;
																					var98.anInt1431 = var10;
																					var98.aWidget1433 = aWidget2009;
																					var98.args = aWidget2141.anObjectArray1177;
																					Class96_Sub1.execute(var98);
																				}

																				if (aWidget2009 != null
																						&& VarPlayerType.method725(
																								aWidget2141) != null) {
																					outBuffer.putHeader(216);
																					outBuffer.putShort(
																							aWidget2009.itemId);
																					outBuffer.putInt(aWidget2009.hash);
																					outBuffer.putLEShortA(
																							aWidget2009.index);
																					outBuffer.putShortA(
																							aWidget2141.itemId);
																					outBuffer
																							.putMEInt(aWidget2141.hash);
																					outBuffer.putLEShortA(
																							aWidget2141.index);
																				}
																			} else if ((anInt2144 == 1 || Class39
																					.method217(menuItemCount - 1))
																					&& menuItemCount > 2) {
																				MilliTimer.method554(
																						anInt2127 + anInt2050,
																						anInt2149 + anInt2143);
																			} else if (menuItemCount > 0) {
																				var11 = anInt2127 + anInt2050;
																				var12 = anInt2149 + anInt2143;
																				Node_Sub9.method563(
																						CacheIndex.aClass4_1333, var11,
																						var12);
																				CacheIndex.aClass4_1333 = null;
																			}

																			aWidget2141 = null;
																		}
																	} else if (FriendedPlayer.anInt739 > 1) {
																		aWidget2141 = null;
																	}
																}

																if (SpotAnimType.aWidget1446 != null) {
																	Class68.method326(SpotAnimType.aWidget1446);
																	++anInt2092;
																	if (Class74.anInt624 == 0) {
																		if (aBool2103) {
																			if (SpotAnimType.aWidget1446 == TileDecorationStub.aWidget838
																					&& anInt2100 != anInt2124) {
																				Widget var101 = SpotAnimType.aWidget1446;
																				byte var92 = 0;
																				if (anInt2134 == 1
																						&& var101.contentType == 206) {
																					var92 = 1;
																				}

																				if (var101.itemIds[anInt2124] <= 0) {
																					var92 = 0;
																				}

																				if (Class58.method291(Class30
																						.getWidgetConfig(var101))) {
																					var6 = anInt2100;
																					var89 = anInt2124;
																					var101.itemIds[var89] = var101.itemIds[var6];
																					var101.itemQuantities[var89] = var101.itemQuantities[var6];
																					var101.itemIds[var6] = -1;
																					var101.itemQuantities[var6] = 0;
																				} else if (var92 == 1) {
																					var6 = anInt2100;
																					var89 = anInt2124;

																					while (var6 != var89) {
																						if (var6 > var89) {
																							var101.method497(var6 - 1,
																									var6);
																							--var6;
																						} else if (var6 < var89) {
																							var101.method497(var6 + 1,
																									var6);
																							++var6;
																						}
																					}
																				} else {
																					var101.method497(anInt2124,
																							anInt2100);
																				}

																				outBuffer.putHeader(219);
																				outBuffer.putShort(anInt2124);
																				outBuffer.putByteC(var92);
																				outBuffer.putShortA(anInt2100);
																				outBuffer.putIMEInt(
																						SpotAnimType.aWidget1446.hash);
																			}
																		} else if ((anInt2144 == 1
																				|| Class39.method217(menuItemCount - 1))
																				&& menuItemCount > 2) {
																			MilliTimer.method554(anInt2131, anInt2101);
																		} else if (menuItemCount > 0) {
																			var83 = anInt2131;
																			var5 = anInt2101;
																			Node_Sub9.method563(CacheIndex.aClass4_1333,
																					var83, var5);
																			CacheIndex.aClass4_1333 = null;
																		}

																		anInt2098 = 10;
																		Class74.anInt627 = 0;
																		SpotAnimType.aWidget1446 = null;
																	} else if (anInt2092 >= 5
																			&& (Class74.anInt621 > anInt2131 + 5
																					|| Class74.anInt621 < anInt2131 - 5
																					|| Class74.anInt622 > anInt2101 + 5
																					|| Class74.anInt622 < anInt2101
																							- 5)) {
																		aBool2103 = true;
																	}
																}

																if (Landscape.anInt53 != -1) {
																	var83 = Landscape.anInt53;
																	var5 = Landscape.anInt58;
																	outBuffer.putHeader(12);
																	outBuffer.putByte(5);
																	outBuffer
																			.putByteC(KeyFocusListener.aBoolArray593[82]
																					? (KeyFocusListener.aBoolArray593[81]
																							? 2 : 1)
																					: 0);
																	outBuffer
																			.putLEShortA(Node_Sub10.chunkLeftX + var83);
																	outBuffer
																			.putLEShort(VarClientHub.chunkLeftY + var5);
																	Landscape.anInt53 = -1;
																	anInt2095 = Class74.anInt628;
																	anInt2096 = Class74.anInt629;
																	cursorState = 1;
																	anInt2097 = 0;
																	destinationX = var83;
																	destinationY = var5;
																}

																if (ObjectType.aWidget1719 != var71) {
																	if (var71 != null) {
																		Class68.method326(var71);
																	}

																	if (ObjectType.aWidget1719 != null) {
																		Class68.method326(ObjectType.aWidget1719);
																	}
																}

																if (ScriptEvent.aWidget1437 != var861
																		&& anInt2008 == anInt2117) {
																	if (var861 != null) {
																		Class68.method326(var861);
																	}

																	if (ScriptEvent.aWidget1437 != null) {
																		Class68.method326(ScriptEvent.aWidget1437);
																	}
																}

																if (ScriptEvent.aWidget1437 != null) {
																	if (anInt2117 < anInt2008) {
																		++anInt2117;
																		if (anInt2117 == anInt2008) {
																			Class68.method326(ScriptEvent.aWidget1437);
																		}
																	}
																} else if (anInt2117 > 0) {
																	--anInt2117;
																}

																var83 = Class68.myPlayer.strictX + anInt2220;
																var5 = anInt2058 + Class68.myPlayer.strictY;
																if (GPI.anInt461 - var83 < -500
																		|| GPI.anInt461 - var83 > 500
																		|| SequenceType.anInt1476 - var5 < -500
																		|| SequenceType.anInt1476 - var5 > 500) {
																	GPI.anInt461 = var83;
																	SequenceType.anInt1476 = var5;
																}

																if (GPI.anInt461 != var83) {
																	GPI.anInt461 += (var83 - GPI.anInt461) / 16;
																}

																if (SequenceType.anInt1476 != var5) {
																	SequenceType.anInt1476 += (var5
																			- SequenceType.anInt1476) / 16;
																}

																if (Class74.anInt624 == 4 && ClanMate.aBool1221) {
																	var6 = Class74.anInt622 - anInt2048;
																	anInt2076 = var6 * 2;
																	anInt2048 = var6 != -1 && var6 != 1
																			? (Class74.anInt622 + anInt2048) / 2
																			: Class74.anInt622;
																	var89 = anInt2015 - Class74.anInt621;
																	anInt2207 = var89 * 2;
																	anInt2015 = var89 != -1 && var89 != 1
																			? (Class74.anInt621 + anInt2015) / 2
																			: Class74.anInt621;
																} else {
																	if (KeyFocusListener.aBoolArray593[96]) {
																		anInt2207 += (-24 - anInt2207) / 2;
																	} else if (KeyFocusListener.aBoolArray593[97]) {
																		anInt2207 += (24 - anInt2207) / 2;
																	} else {
																		anInt2207 /= 2;
																	}

																	if (KeyFocusListener.aBoolArray593[98]) {
																		anInt2076 += (12 - anInt2076) / 2;
																	} else if (KeyFocusListener.aBoolArray593[99]) {
																		anInt2076 += (-12 - anInt2076) / 2;
																	} else {
																		anInt2076 /= 2;
																	}

																	anInt2048 = Class74.anInt622;
																	anInt2015 = Class74.anInt621;
																}

																minimapRotation = minimapRotation + anInt2207 / 2
																		& 0x7ff;
																anInt2051 += anInt2076 / 2;
																if (anInt2051 < 128) {
																	anInt2051 = 128;
																}

																if (anInt2051 > 383) {
																	anInt2051 = 383;
																}

																var6 = GPI.anInt461 >> 7;
																var89 = SequenceType.anInt1476 >> 7;
																var8 = NpcType.method802(GPI.anInt461,
																		SequenceType.anInt1476,
																		InterfaceNode.floorLevel * -1331355705);
																var9 = 0;
																if (var6 > 3 && var89 > 3 && var6 < 100
																		&& var89 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; var10++) {
																		for (var11 = var89 - 4; var11 <= var89
																				+ 4; var11++) {
																			var12 = InterfaceNode.floorLevel
																					* -1331355705;
																			if (var12 < 3
																					&& (Class39.renderRules[1][var10][var11]
																							& 0x2) == 2) {
																				++var12;
																			}

																			var13 = var8
																					- Class39.tileHeights[var12][var10][var11];
																			if (var13 > var9) {
																				var9 = var13;
																			}
																		}
																	}
																}

																var10 = var9 * 192;
																if (var10 > 98048) {
																	var10 = 98048;
																}

																if (var10 < '\u8000') {
																	var10 = '\u8000';
																}

																if (var10 > anInt2119) {
																	anInt2119 += (var10 - anInt2119) / 24;
																} else if (var10 < anInt2119) {
																	anInt2119 += (var10 - anInt2119) / 80;
																}

																if (aBool2046) {
																	var83 = BoundaryDecorationStub.anInt216 * 915224960
																			+ 64;
																	var5 = Class26.anInt310 * 402993792 + 64;
																	var6 = NpcType.method802(var83, var5,
																			InterfaceNode.floorLevel * -1331355705)
																			- Class3.anInt94;
																	if (Projectile.cameraX < var83) {
																		Projectile.cameraX += (var83
																				- Projectile.cameraX) * -2101471913
																				* RuneScript.anInt1722 / 1000
																				+ ObjectType.anInt1695;
																		if (Projectile.cameraX > var83) {
																			Projectile.cameraX = var83;
																		}
																	}

																	if (Projectile.cameraX > var83) {
																		Projectile.cameraX -= (Projectile.cameraX
																				- var83) * RuneScript.anInt1722
																				* -2101471913 / 1000
																				+ ObjectType.anInt1695;
																		if (Projectile.cameraX < var83) {
																			Projectile.cameraX = var83;
																		}
																	}

																	if (FriendedPlayer.cameraZ < var6) {
																		FriendedPlayer.cameraZ += ObjectType.anInt1695
																				+ RuneScript.anInt1722 * -2101471913
																						* (var6 - FriendedPlayer.cameraZ)
																						/ 1000;
																		if (FriendedPlayer.cameraZ > var6) {
																			FriendedPlayer.cameraZ = var6;
																		}
																	}

																	if (FriendedPlayer.cameraZ > var6) {
																		FriendedPlayer.cameraZ -= ObjectType.anInt1695
																				+ (FriendedPlayer.cameraZ - var6)
																						* RuneScript.anInt1722
																						* -2101471913 / 1000;
																		if (FriendedPlayer.cameraZ < var6) {
																			FriendedPlayer.cameraZ = var6;
																		}
																	}

																	if (Class72.cameraY < var5) {
																		Class72.cameraY += ObjectType.anInt1695
																				+ (var5 - Class72.cameraY)
																						* RuneScript.anInt1722
																						* -2101471913 / 1000;
																		if (Class72.cameraY > var5) {
																			Class72.cameraY = var5;
																		}
																	}

																	if (Class72.cameraY > var5) {
																		Class72.cameraY -= RuneScript.anInt1722
																				* -2101471913 * (Class72.cameraY - var5)
																				/ 1000 + ObjectType.anInt1695;
																		if (Class72.cameraY < var5) {
																			Class72.cameraY = var5;
																		}
																	}

																	var83 = Class48_Sub1.anInt1299 + 64;
																	var5 = anInt2211 + 64;
																	var6 = NpcType.method802(var83, var5,
																			InterfaceNode.floorLevel * -1331355705)
																			- GraphicsStub.anInt1813;
																	var89 = var83 - Projectile.cameraX;
																	var8 = var6 - FriendedPlayer.cameraZ;
																	var9 = var5 - Class72.cameraY;
																	var10 = (int) Math.sqrt(
																			(double) (var89 * var89 + var9 * var9));
																	var11 = (int) (Math.atan2((double) var8,
																			(double) var10) * 325.949D) & 0x7ff;
																	var12 = (int) (Math.atan2((double) var89,
																			(double) var9) * -325.949D) & 0x7ff;
																	if (var11 < 128) {
																		var11 = 128;
																	}

																	if (var11 > 383) {
																		var11 = 383;
																	}

																	if (Class67.cameraPitch < var11) {
																		Class67.cameraPitch += TextureLoader.anInt334
																				* (var11 - Class67.cameraPitch) / 1000
																				+ Class36.anInt402;
																		if (Class67.cameraPitch > var11) {
																			Class67.cameraPitch = var11;
																		}
																	}

																	if (Class67.cameraPitch > var11) {
																		Class67.cameraPitch -= (Class67.cameraPitch
																				- var11) * TextureLoader.anInt334 / 1000
																				+ Class36.anInt402;
																		if (Class67.cameraPitch < var11) {
																			Class67.cameraPitch = var11;
																		}
																	}

																	var13 = var12 - Class65.cameraYaw;
																	if (var13 > 1024) {
																		var13 -= 2048;
																	}

																	if (var13 < -1024) {
																		var13 += 2048;
																	}

																	if (var13 > 0) {
																		Class65.cameraYaw += Class36.anInt402
																				+ TextureLoader.anInt334 * var13 / 1000;
																		Class65.cameraYaw &= 2047;
																	}

																	if (var13 < 0) {
																		Class65.cameraYaw -= Class36.anInt402
																				+ TextureLoader.anInt334 * -var13
																						/ 1000;
																		Class65.cameraYaw &= 2047;
																	}

																	var14 = var12 - Class65.cameraYaw;
																	if (var14 > 1024) {
																		var14 -= 2048;
																	}

																	if (var14 < -1024) {
																		var14 += 2048;
																	}

																	if (var14 < 0 && var13 > 0
																			|| var14 > 0 && var13 < 0) {
																		Class65.cameraYaw = var12;
																	}
																}

																for (var83 = 0; var83 < 5; var83++) {
																	++anIntArray2215[var83];
																}

																Class33.aClass28_364.process();
																var83 = VarClientType.method719();
																var5 = KeyFocusListener.anInt601;
																if (var83 > 15000 && var5 > 15000) {
																	anInt2045 = 250;
																	Class74.anInt617 = 14500;
																	outBuffer.putHeader(182);
																}

																++anInt2062;
																if (anInt2062 > 500) {
																	anInt2062 = 0;
																	var89 = (int) (Math.random() * 8.0D);
																	if ((var89 & 0x1) == 1) {
																		anInt2220 += anInt2057 * 1311998203;
																	}

																	if ((var89 & 0x2) == 2) {
																		anInt2058 += anInt2059;
																	}

																	if ((var89 & 0x4) == 4) {
																		anInt2060 += anInt2061;
																	}
																}

																if (anInt2220 < -50) {
																	anInt2057 = 1032131686;
																}

																if (anInt2220 > 50) {
																	anInt2057 = -1032131686;
																}

																if (anInt2058 < -55) {
																	anInt2059 = 2;
																}

																if (anInt2058 > 55) {
																	anInt2059 = -2;
																}

																if (anInt2060 < -40) {
																	anInt2061 = 1;
																}

																if (anInt2060 > 40) {
																	anInt2061 = -1;
																}

																++anInt2018;
																if (anInt2018 > 500) {
																	anInt2018 = 0;
																	var89 = (int) (Math.random() * 8.0D);
																	if ((var89 & 0x1) == 1) {
																		minimapScale += anInt2063;
																	}

																	if ((var89 & 0x2) == 2) {
																		viewRotation += anInt2064;
																	}
																}

																if (minimapScale < -60) {
																	anInt2063 = 2;
																}

																if (minimapScale > 60) {
																	anInt2063 = -2;
																}

																if (viewRotation < -20) {
																	anInt2064 = 1;
																}

																if (viewRotation > 10) {
																	anInt2064 = -1;
																}

																for (Class96_Sub1 var103 = (Class96_Sub1) aClass102_2228
																		.method416(); var103 != null; var103 = (Class96_Sub1) aClass102_2228
																				.method418()) {
																	if ((long) var103.anInt1206 < AnimationSkin
																			.currentTimeMs() / 1000L - 5L) {
																		if (var103.aShort1205 > 0) {
																			Class75.method334(5, "", var103.aString1203
																					+ " has logged in.");
																		}

																		if (var103.aShort1205 == 0) {
																			Class75.method334(5, "", var103.aString1203
																					+ " has logged out.");
																		}

																		var103.method411();
																	}
																}

																++anInt2042;
																if (anInt2042 > 50) {
																	outBuffer.putHeader(126);
																}

																try {
																	if (Class31.gameConnection != null
																			&& outBuffer.position > 0) {
																		Class31.gameConnection.write(outBuffer.payload,
																				0, outBuffer.position);
																		outBuffer.position = 0;
																		anInt2042 = 0;
																		return;
																	}
																} catch (IOException var51) {
																	Class81.method361();
																}

																return;
															}

															var851 = var88.widget;
															if (var851.index < 0) {
																break;
															}

															var68 = Class94.getWidget(var851.parentId);
														} while (var68 == null || var68.children == null
																|| var851.index >= var68.children.length
																|| var68.children[var851.index] != var851);

														Class96_Sub1.execute(var88);
													}
												}

												var851 = var88.widget;
												if (var851.index < 0) {
													break;
												}

												var68 = Class94.getWidget(var851.parentId);
											} while (var68 == null || var68.children == null
													|| var851.index >= var68.children.length
													|| var68.children[var851.index] != var851);

											Class96_Sub1.execute(var88);
										}
									}

									var851 = var88.widget;
									if (var851.index < 0) {
										break;
									}

									var68 = Class94.getWidget(var851.parentId);
								} while (var68 == null || var68.children == null
										|| var851.index >= var68.children.length
										|| var68.children[var851.index] != var851);

								Class96_Sub1.execute(var88);
							}
						}

						Class81.method361();
					}
				}
			}
		} else if (anInt2113 == 40 || anInt2113 == 45) {
			Class58.processLogin();
		}

	}

	void processJS5Connection() {
		if (anInt2113 != 1000) {
			long var1 = AnimationSkin.currentTimeMs();
			int var3 = (int) (var1 - Class81.aLong668);
			Class81.aLong668 = var1;
			if (var3 > 200) {
				var3 = 200;
			}

			Class81.anInt667 += var3;
			boolean var4;
			if (Class81.anInt669 == 0 && Class81.anInt679 == 0 && Class81.anInt674 == 0 && Class81.anInt670 == 0) {
				var4 = true;
			} else if (Class81.js5Con == null) {
				var4 = false;
			} else {
				try {
					label204: {
						if (Class81.anInt667 > 30000) {
							throw new IOException();
						}

						FileRequest var21;
						ByteBuf var6;
						while (Class81.anInt679 < 20 && Class81.anInt670 > 0) {
							var21 = (FileRequest) Class81.aNodeTable685.method150();
							var6 = new ByteBuf(4);
							var6.putByte(1);
							var6.putMedium((int) var21.key);
							Class81.js5Con.write(var6.payload, 0, 4);
							Class81.aNodeTable682.put(var21, var21.key);
							--Class81.anInt670;
							++Class81.anInt679;
						}

						while (Class81.anInt669 < 20 && Class81.anInt674 > 0) {
							var21 = (FileRequest) Class81.aNodeQueue_672.method424();
							var6 = new ByteBuf(4);
							var6.putByte(0);
							var6.putMedium((int) var21.key);
							Class81.js5Con.write(var6.payload, 0, 4);
							var21.unlinkDual();
							Class81.aNodeTable675.put(var21, var21.key);
							--Class81.anInt674;
							++Class81.anInt669;
						}

						for (int var22 = 0; var22 < 100; var22++) {
							int avail = Class81.js5Con.avail();
							if (avail < 0) {
								throw new IOException();
							}

							if (avail == 0) {
								break;
							}

							Class81.anInt667 = 0;
							byte needed = 0;
							if (Class1.currentRequest == null) {
								needed = 8;
							} else if (Class81.currentPosition == 0) {
								needed = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							if (needed > 0) {
								var8 = needed - Class81.aBuffer677.position;
								if (var8 > avail) {
									var8 = avail;
								}

								Class81.js5Con.read(Class81.aBuffer677.payload, Class81.aBuffer677.position, var8);
								if (Class81.xorKey != 0) {
									for (var9 = 0; var9 < var8; var9++) {
										Class81.aBuffer677.payload[Class81.aBuffer677.position
												+ var9] ^= Class81.xorKey;
									}
								}

								Class81.aBuffer677.position += var8;
								if (Class81.aBuffer677.position < needed) {
									break;
								}

								if (Class1.currentRequest == null) {
									Class81.aBuffer677.position = 0;
									var9 = Class81.aBuffer677.getUByte();
									var10 = Class81.aBuffer677.getUShort();
									int var24 = Class81.aBuffer677.getUByte();
									var12 = Class81.aBuffer677.getInt();
									long var17 = (long) ((var9 << 16) + var10);
									FileRequest var15 = (FileRequest) Class81.aNodeTable682.get(var17);
									BlockType.aBool725 = true;
									if (var15 == null) {
										var15 = (FileRequest) Class81.aNodeTable675.get(var17);
										BlockType.aBool725 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int size = var24 == 0 ? 5 : 9;
									Class1.currentRequest = var15;
									Class81.currentBuffer = new ByteBuf(size + var12 + Class1.currentRequest.padding);
									Class81.currentBuffer.putByte(var24);
									Class81.currentBuffer.putInt(var12);
									Class81.currentPosition = 8;
									Class81.aBuffer677.position = 0;
								} else if (Class81.currentPosition == 0) {
									if (Class81.aBuffer677.payload[0] == -1) {
										Class81.currentPosition = 1;
										Class81.aBuffer677.position = 0;
									} else {
										Class1.currentRequest = null;
									}
								}
							} else {
								var8 = Class81.currentBuffer.payload.length - Class1.currentRequest.padding;
								var9 = 512 - Class81.currentPosition;
								if (var9 > var8 - Class81.currentBuffer.position) {
									var9 = var8 - Class81.currentBuffer.position;
								}

								if (var9 > avail) {
									var9 = avail;
								}

								Class81.js5Con.read(Class81.currentBuffer.payload, Class81.currentBuffer.position,
										var9);
								if (Class81.xorKey != 0) {
									for (var10 = 0; var10 < var9; var10++) {
										Class81.currentBuffer.payload[Class81.currentBuffer.position
												+ var10] ^= Class81.xorKey;
									}
								}

								Class81.currentBuffer.position += var9;
								Class81.currentPosition += var9;
								if (Class81.currentBuffer.position == var8) {
									if (Class1.currentRequest.key == 16711935L) {
										Class93.aBuffer731 = Class81.currentBuffer;

										for (var10 = 0; var10 < 256; var10++) {
											CacheIndex var221 = Class81.aClass87_Sub1Array681[var10];
											if (var221 != null) {
												Class93.aBuffer731.position = var10 * 8 + 5;
												var12 = Class93.aBuffer731.getInt();
												int var23 = Class93.aBuffer731.getInt();
												var221.setInformation(var12, var23);
											}
										}
									} else {
										Class81.aCRC32_680.reset();
										Class81.aCRC32_680.update(Class81.currentBuffer.payload, 0, var8);
										var10 = (int) Class81.aCRC32_680.getValue();
										if (Class1.currentRequest.crc != var10) {
											try {
												Class81.js5Con.shutdown();
											} catch (Exception var20) {
												;
											}

											++Class81.anInt683;
											Class81.js5Con = null;
											Class81.xorKey = (byte) ((int) (Math.random() * 255.0D + 1.0D));
											var4 = false;
											break label204;
										}

										Class81.anInt683 = 0;
										Class81.anInt684 = 0;
										Class1.currentRequest.index.method557(
												(int) (Class1.currentRequest.key & 0xffff),
												Class81.currentBuffer.payload,
												(Class1.currentRequest.key & 0xff0000) == 16711680L,
												BlockType.aBool725);
									}

									Class1.currentRequest.unlink();
									if (BlockType.aBool725) {
										--Class81.anInt679;
									} else {
										--Class81.anInt669;
									}

									Class81.currentPosition = 0;
									Class1.currentRequest = null;
									Class81.currentBuffer = null;
								} else {
									if (Class81.currentPosition != 512) {
										break;
									}

									Class81.currentPosition = 0;
								}
							}
						}

						var4 = true;
					}
				} catch (IOException var211) {
					try {
						Class81.js5Con.shutdown();
					} catch (Exception var19) {
						;
					}

					++Class81.anInt684;
					Class81.js5Con = null;
					var4 = false;
				}
			}

			if (!var4) {
				this.method1053();
			}
		}

	}

	protected final void method1035(byte var1) {
	}

	void method1053() {
		if (Class81.anInt683 >= 4) {
			this.error("js5crc");
			anInt2113 = 1000;
		} else {
			if (Class81.anInt684 >= 4) {
				if (anInt2113 <= 5) {
					this.error("js5io");
					anInt2113 = 1000;
					return;
				}

				anInt2169 = 3000;
				Class81.anInt684 = 3;
			}

			if (--anInt2169 + 1 <= 0) {
				try {
					if (anInt2028 == 0) {
						Class96_Sub1.socket = IsaacRandom.taskManager.createSocket(World.myWorldDomain, '\uaa4a');
						++anInt2028;
					}

					if (anInt2028 == 1) {
						if (Class96_Sub1.socket.status == 2) {
							this.error(-1);
							return;
						}

						if (Class96_Sub1.socket.status == 1) {
							++anInt2028;
						}
					}

					if (anInt2028 == 2) {
						GZipDecompressor.js5Connection = new Connection((Socket) Class96_Sub1.socket.value,
								IsaacRandom.taskManager);
						ByteBuf var2 = new ByteBuf(5);
						var2.putByte(15);
						var2.putInt(103);
						GZipDecompressor.js5Connection.write(var2.payload, 0, 5);
						++anInt2028;
						InterfaceNode.aLong1397 = AnimationSkin.currentTimeMs();
					}

					if (anInt2028 == 3) {
						if (anInt2113 > 5 && GZipDecompressor.js5Connection.avail() <= 0) {
							if (AnimationSkin.currentTimeMs() - InterfaceNode.aLong1397 > 30000L) {
								this.error(-2);
								return;
							}
						} else {
							int var3 = GZipDecompressor.js5Connection.read();
							if (var3 != 0) {
								this.error(var3);
								return;
							}

							++anInt2028;
						}
					}

					if (anInt2028 == 4) {
						Class30.method188(GZipDecompressor.js5Connection, anInt2113 > 20);
						Class96_Sub1.socket = null;
						GZipDecompressor.js5Connection = null;
						anInt2028 = 0;
						anInt2031 = 0;
					}
				} catch (IOException var21) {
					this.error(-3);
				}
			}
		}

	}

	void error(int var1) {
		Class96_Sub1.socket = null;
		GZipDecompressor.js5Connection = null;
		anInt2028 = 0;
		if (Class82.mainPort == ClientSettings.myWorldPort) {
			ClientSettings.myWorldPort = Class41.subPort;
		} else {
			ClientSettings.myWorldPort = Class82.mainPort;
		}

		++anInt2031;
		if (anInt2031 >= 2 && var1 == 7) {
			if (anInt2113 <= 5) {
				this.error("js5connect_full");
				anInt2113 = 1000;
			} else {
				anInt2169 = 3000;
			}
		} else {
			if (anInt2031 >= 2) {
				;
			}

			if (anInt2031 >= 4) {
				if (anInt2113 <= 5) {
					this.error("js5connect");
					anInt2113 = 1000;
				} else {
					anInt2169 = 3000;
				}
			}
		}

	}

	protected final void method1038(int var1) {
		if (Class33.aClass28_364.changed()) {
			Class33.aClass28_364.serialize();
		}

		if (Npc.aClass30_1968 != null) {
			Npc.aClass30_1968.aBool336 = false;
		}

		Npc.aClass30_1968 = null;
		if (Class31.gameConnection != null) {
			Class31.gameConnection.shutdown();
			Class31.gameConnection = null;
		}

		if (KeyFocusListener.kfListener != null) {
			KeyFocusListener var11 = KeyFocusListener.kfListener;
			synchronized (var11) {
				KeyFocusListener.kfListener = null;
			}
		}

		if (Class74.aClass74_618 != null) {
			Class74 var111 = Class74.aClass74_618;
			synchronized (var111) {
				Class74.aClass74_618 = null;
			}
		}

		Class26.wheelListener = null;
		if (DualNode_Sub14.aClass8_1644 != null) {
			DualNode_Sub14.aClass8_1644.method84();
		}

		if (Class30.aClass8_341 != null) {
			Class30.aClass8_341.method84();
		}

		if (Class81.js5Con != null) {
			Class81.js5Con.shutdown();
		}

		Object var112 = Class90.anObject720;
		synchronized (var112) {
			if (Class90.anInt719 != 0) {
				Class90.anInt719 = 1;

				try {
					Class90.anObject720.wait();
				} catch (InterruptedException var7) {
					;
				}
			}
		}

		Class32.method194();
	}

	protected final void method1031(int var1) {
		Class82.mainPort = socketType == 0 ? '\uaa4a' : myWorld + '\u9c40';
		Class41.subPort = socketType == 0 ? 443 : myWorld + '\uc350';
		ClientSettings.myWorldPort = Class82.mainPort;
		PlayerConfig.colorsToFind = Colors.colorsToFind;
		PlayerConfig.colorsToReplace = Colors.colorsToReplace;
		Colors.colorToFind1 = Colors.colorsToFind1;
		Class85.colorsToReplace1 = Colors.colorsToReplace1;
		Class96_Sub1.method501();
		VarBitType.setKeyFocusListener(LandscapeTile.gameCanvas);
		Canvas canvas = LandscapeTile.gameCanvas;
		canvas.addMouseListener(Class74.aClass74_618);
		canvas.addMouseMotionListener(Class74.aClass74_618);
		canvas.addFocusListener(Class74.aClass74_618);
		Class26.wheelListener = new RotationWheelListener();
		if (Class26.wheelListener != null) {
			Class26.wheelListener.setWheelListener(LandscapeTile.gameCanvas);
		}

		Class3.refIndexTable = new IndexTable(255, Class75.cacheDataFile, Class75.referenceFile, 500000);
		AnimationSkin.settings = ItemType.desrializeSettings();
		CacheIndex.sysClipboard = this.getToolkit().getSystemClipboard();
		AbstractByteBuffer.method260(this, Class31.aString349);
		if (socketType != 0) {
			displayFps = true;
		}

		int type = AnimationSkin.settings.screenType;
		aLong2035 = 0L;
		if (type >= 2) {
			resizable = true;
		} else {
			resizable = false;
		}

		AnimationSkin.method534();
		if (anInt2113 >= 25) {
			outBuffer.putHeader(23);
			BitBuf var5 = outBuffer;
			int var6 = resizable ? 2 : 1;
			var5.putByte(var6);
			outBuffer.putShort(Class34.gameWidth);
			outBuffer.putShort(Node_Sub9.gameHeight);
		}

		aBool1979 = true;
	}

	protected final void method1037() {
		boolean var2;
		label210: {
			try {
				if (Class110.anInt782 == 2) {
					if (Class86.aNode_Sub11_693 == null) {
						Class86.aNode_Sub11_693 = MusicFile.getMusicFile(Class110.aClass87_783, Class98.musicId,
								Class111.anInt788);
						if (Class86.aNode_Sub11_693 == null) {
							var2 = false;
							break label210;
						}
					}

					if (RuneScript.aClass13_1721 == null) {
						RuneScript.aClass13_1721 = new Class13(Class110.sfx_ref, Class110.vorbis_ref);
					}

					if (Class110.aNode_Sub4_Sub4_784.method829(Class86.aNode_Sub11_693, Class89.midiInstruments_ref,
							RuneScript.aClass13_1721, 22050)) {
						Class110.aNode_Sub4_Sub4_784.method830();
						Class110.aNode_Sub4_Sub4_784.method827(Class110.anInt787);
						Class110.aNode_Sub4_Sub4_784.method855(Class86.aNode_Sub11_693, Class44.aBool464);
						Class110.anInt782 = 0;
						Class86.aNode_Sub11_693 = null;
						RuneScript.aClass13_1721 = null;
						Class110.aClass87_783 = null;
						var2 = true;
						break label210;
					}
				}
			} catch (Exception var151) {
				var151.printStackTrace();
				Class110.aNode_Sub4_Sub4_784.method856();
				Class110.anInt782 = 0;
				Class86.aNode_Sub11_693 = null;
				RuneScript.aClass13_1721 = null;
				Class110.aClass87_783 = null;
			}

			var2 = false;
		}

		if (var2 && aBool2191 && DualNode_Sub14.aClass8_1644 != null) {
			DualNode_Sub14.aClass8_1644.method83();
		}

		int var6;
		if (anInt2113 == 10 || anInt2113 == 20 || anInt2113 == 30) {
			if (aLong2035 != 0L && AnimationSkin.currentTimeMs() > aLong2035) {
				int var18 = resizable ? 2 : 1;
				aLong2035 = 0L;
				if (var18 >= 2) {
					resizable = true;
				} else {
					resizable = false;
				}

				AnimationSkin.method534();
				if (anInt2113 >= 25) {
					outBuffer.putHeader(23);
					BitBuf var19 = outBuffer;
					var6 = resizable ? 2 : 1;
					var19.putByte(var6);
					outBuffer.putShort(Class34.gameWidth);
					outBuffer.putShort(Node_Sub9.gameHeight);
				}

				aBool1979 = true;
			} else if (aBool1982) {
				ItemType.method810();
			}
		}

		Dimension var16 = this.method1034();
		if (var16.width != VarClientStringType.anInt1505 || var16.height != Class21.anInt281 || aBool1981) {
			AnimationSkin.method534();
			aLong2035 = AnimationSkin.currentTimeMs() + 500L;
			aBool1981 = false;
		}

		boolean var17 = false;
		if (aBool1979) {
			aBool1979 = false;
			var17 = true;

			for (var6 = 0; var6 < 100; var6++) {
				aBoolArray2118[var6] = true;
			}
		}

		if (var17) {
			SpotAnimType.method659();
		}

		if (anInt2113 == 0) {
			var6 = Class6.anInt122;
			String message = Class6.bootMessage;
			Color color = null;

			try {
				Graphics g = LandscapeTile.gameCanvas.getGraphics();
				if (Class7.helveticaFont == null) {
					Class7.helveticaFont = new Font("Helvetica", 1, 13);
					IsaacRandom.helveticaMetrics = LandscapeTile.gameCanvas.getFontMetrics(Class7.helveticaFont);
				}

				if (var17) {
					g.setColor(Color.black);
					g.fillRect(0, 0, Class34.gameWidth, Node_Sub9.gameHeight);
				}

				if (color == null) {
					color = new Color(140, 17, 17);
				}

				try {
					if (IndexTable.dbImage == null) {
						IndexTable.dbImage = LandscapeTile.gameCanvas.createImage(304, 34);
					}

					Graphics ig = IndexTable.dbImage.getGraphics();
					ig.setColor(color);
					ig.drawRect(0, 0, 303, 33);
					ig.fillRect(2, 2, var6 * 3, 30);
					ig.setColor(Color.black);
					ig.drawRect(1, 1, 301, 31);
					ig.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
					ig.setFont(Class7.helveticaFont);
					ig.setColor(Color.white);
					ig.drawString(message, (304 - IsaacRandom.helveticaMetrics.stringWidth(message)) / 2, 22);
					g.drawImage(IndexTable.dbImage, Class34.gameWidth / 2 - 152, Node_Sub9.gameHeight / 2 - 18,
							(ImageObserver) null);
				} catch (Exception var111) {
					int w = Class34.gameWidth / 2 - 152;
					int h = Node_Sub9.gameHeight / 2 - 18;
					g.setColor(color);
					g.drawRect(w, h, 303, 33);
					g.fillRect(w + 2, h + 2, var6 * 3, 30);
					g.setColor(Color.black);
					g.drawRect(w + 1, h + 1, 301, 31);
					g.fillRect(var6 * 3 + 2 + w, h + 2, 300 - var6 * 3, 30);
					g.setFont(Class7.helveticaFont);
					g.setColor(Color.white);
					g.drawString(message, (304 - IsaacRandom.helveticaMetrics.stringWidth(message)) / 2 + w, h + 22);
				}
			} catch (Exception var121) {
				LandscapeTile.gameCanvas.repaint();
			}
		} else if (anInt2113 == 5) {
			Class86.method367(Class35.b12_full, ConsumingImageProducer.p11_full, p12_full, var17);
		} else if (anInt2113 != 10 && anInt2113 != 11) {
			if (anInt2113 == 20) {
				Class86.method367(Class35.b12_full, ConsumingImageProducer.p11_full, p12_full, var17);
			} else if (anInt2113 == 25) {
				if (anInt2130 == 1) {
					if (anInt2120 > anInt2140) {
						anInt2140 = anInt2120;
					}

					var6 = (anInt2140 * 50 - anInt2120 * 50) / anInt2140;
					Class82.method363("Loading - please wait." + Class35.aString390 + Class35.aString389 + var6 + "%"
							+ Class35.aString392, false);
				} else if (anInt2130 == 2) {
					if (anInt2049 > anInt2027) {
						anInt2027 = anInt2049;
					}

					var6 = (anInt2027 * 50 - anInt2049 * 50) / anInt2027 + 50;
					Class82.method363("Loading - please wait." + Class35.aString390 + Class35.aString389 + var6 + "%"
							+ Class35.aString392, false);
				} else {
					Class82.method363("Loading - please wait.", false);
				}
			} else if (anInt2113 == 30) {
				Class50.method254();
			} else if (anInt2113 == 40) {
				Class82.method363("Connection lost" + Class35.aString390 + "Please wait - attempting to reestablish",
						false);
			} else if (anInt2113 == 45) {
				Class82.method363("Please wait...", false);
			}
		} else {
			Class86.method367(Class35.b12_full, ConsumingImageProducer.p11_full, p12_full, var17);
		}

		int var181;
		Graphics var191;
		if (anInt2113 == 30 && anInt2177 == 0 && !var17) {
			try {
				var191 = LandscapeTile.gameCanvas.getGraphics();

				for (var181 = 0; var181 < anInt2168; var181++) {
					if (aBoolArray2171[var181]) {
						IndexTable.imageProducer.drawImageClip(var191, anIntArray2173[var181], anIntArray2174[var181],
								anIntArray2175[var181], anIntArray2176[var181]);
						aBoolArray2171[var181] = false;
					}
				}
			} catch (Exception var14) {
				LandscapeTile.gameCanvas.repaint();
			}
		} else if (anInt2113 > 0) {
			try {
				var191 = LandscapeTile.gameCanvas.getGraphics();
				IndexTable.imageProducer.drawImage(var191, 0, 0);

				for (var181 = 0; var181 < anInt2168; var181++) {
					aBoolArray2171[var181] = false;
				}
			} catch (Exception var131) {
				LandscapeTile.gameCanvas.repaint();
			}
		}

	}

	static final void method1055(int var0, int var1, int var2, int var3, int var4) {
		int var5 = InterfaceNode.landscape.method53(var0, var1, var2);
		int var6;
		int var7;
		int var8;
		int var10;
		int var11;
		int var14;
		Sprite var20;
		if (var5 != 0) {
			var7 = InterfaceNode.landscape.method34(var0, var1, var2, var5);
			var14 = var7 >> 6 & 0x3;
			var8 = var7 & 0x1f;
			var10 = var3;
			if (var5 > 0) {
				var10 = var4;
			}

			int[] var23 = RuneScript.minimapSprite.pixels;
			var6 = var1 * 4 + 24624 + (103 - var2) * 2048;
			var11 = var5 >> 14 & 0x7fff;
			ObjectType var18 = Class37.getObjectType(var11);
			if (var18.anInt1703 != -1) {
				var20 = Class2.aDualNode_Sub13_Sub2Array77[var18.anInt1703];
				if (var20 != null) {
					int var15 = (var18.sizeX * 4 - var20.subWidth) / 2;
					int var16 = (var18.sizeY * 4 - var20.subHeight) / 2;
					var20.method929(var1 * 4 + 48 + var15, (104 - var2 - var18.sizeY) * 4 + 48 + var16);
				}
			} else {
				if (var8 == 0 || var8 == 2) {
					if (var14 == 0) {
						var23[var6] = var10;
						var23[var6 + 512] = var10;
						var23[var6 + 1024] = var10;
						var23[var6 + 1536] = var10;
					} else if (var14 == 1) {
						var23[var6] = var10;
						var23[var6 + 1] = var10;
						var23[var6 + 2] = var10;
						var23[var6 + 3] = var10;
					} else if (var14 == 2) {
						var23[var6 + 3] = var10;
						var23[var6 + 515] = var10;
						var23[var6 + 1027] = var10;
						var23[var6 + 1536 + 3] = var10;
					} else if (var14 == 3) {
						var23[var6 + 1536] = var10;
						var23[var6 + 1536 + 1] = var10;
						var23[var6 + 1536 + 2] = var10;
						var23[var6 + 1536 + 3] = var10;
					}
				}

				if (var8 == 3) {
					if (var14 == 0) {
						var23[var6] = var10;
					} else if (var14 == 1) {
						var23[var6 + 3] = var10;
					} else if (var14 == 2) {
						var23[var6 + 3 + 1536] = var10;
					} else if (var14 == 3) {
						var23[var6 + 1536] = var10;
					}
				}

				if (var8 == 2) {
					if (var14 == 3) {
						var23[var6] = var10;
						var23[var6 + 512] = var10;
						var23[var6 + 1024] = var10;
						var23[var6 + 1536] = var10;
					} else if (var14 == 0) {
						var23[var6] = var10;
						var23[var6 + 1] = var10;
						var23[var6 + 2] = var10;
						var23[var6 + 3] = var10;
					} else if (var14 == 1) {
						var23[var6 + 3] = var10;
						var23[var6 + 512 + 3] = var10;
						var23[var6 + 1024 + 3] = var10;
						var23[var6 + 1536 + 3] = var10;
					} else if (var14 == 2) {
						var23[var6 + 1536] = var10;
						var23[var6 + 1537] = var10;
						var23[var6 + 2 + 1536] = var10;
						var23[var6 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = InterfaceNode.landscape.method32(var0, var1, var2);
		ObjectType var231;
		if (var5 != 0) {
			var7 = InterfaceNode.landscape.method34(var0, var1, var2, var5);
			var14 = var7 >> 6 & 0x3;
			var8 = var7 & 0x1f;
			var10 = var5 >> 14 & 0x7fff;
			var231 = Class37.getObjectType(var10);
			int var181;
			if (var231.anInt1703 != -1) {
				var20 = Class2.aDualNode_Sub13_Sub2Array77[var231.anInt1703];
				if (var20 != null) {
					var11 = (var231.sizeX * 4 - var20.subWidth) / 2;
					var181 = (var231.sizeY * 4 - var20.subHeight) / 2;
					var20.method929(var1 * 4 + 48 + var11, (104 - var2 - var231.sizeY) * 4 + 48 + var181);
				}
			} else if (var8 == 9) {
				var6 = 15658734;
				if (var5 > 0) {
					var6 = 15597568;
				}

				int[] var201 = RuneScript.minimapSprite.pixels;
				var181 = var1 * 4 + 24624 + (103 - var2) * 2048;
				if (var14 != 0 && var14 != 2) {
					var201[var181] = var6;
					var201[var181 + 513] = var6;
					var201[var181 + 1024 + 2] = var6;
					var201[var181 + 3 + 1536] = var6;
				} else {
					var201[var181 + 1536] = var6;
					var201[var181 + 1024 + 1] = var6;
					var201[var181 + 514] = var6;
					var201[var181 + 3] = var6;
				}
			}
		}

		var5 = InterfaceNode.landscape.method33(var0, var1, var2);
		if (var5 != 0) {
			var7 = var5 >> 14 & 0x7fff;
			var231 = Class37.getObjectType(var7);
			if (var231.anInt1703 != -1) {
				Sprite var182 = Class2.aDualNode_Sub13_Sub2Array77[var231.anInt1703];
				if (var182 != null) {
					var10 = (var231.sizeX * 4 - var182.subWidth) / 2;
					int var202 = (var231.sizeY * 4 - var182.subHeight) / 2;
					var182.method929(var1 * 4 + 48 + var10, (104 - var2 - var231.sizeY) * 4 + var202 + 48);
				}
			}
		}

	}

	public static int method1056(ByteBuf var0, String var1) {
		int var2 = var0.position;
		byte[] var3 = Class53.method273(var1);
		var0.putUSmart(var3.length);
		var0.position += Class120.huffman.compress(var3, 0, var3.length, var0.payload, var0.position);
		return var0.position - var2;
	}

	static {
		anIntArray2084 = new int[anInt2083];
		anIntArray2085 = new int[anInt2083];
		anIntArray2086 = new int[anInt2083];
		anIntArray2087 = new int[anInt2083];
		anIntArray2088 = new int[anInt2083];
		anIntArray2089 = new int[anInt2083];
		menuOpcodes = new int[500];
		aStringArray2090 = new String[anInt2083];
		anInt2092 = 0;
		screenY = -1;
		screenX = -1;
		anInt2095 = 0;
		anInt2096 = 0;
		anInt2097 = 0;
		cursorState = 0;
		anInt2098 = 0;
		anInt2099 = 0;
		anInt2100 = 0;
		clanChatOwner = null;
		anInt2101 = 0;
		aBool2102 = false;
		aBool2103 = false;
		anInt2105 = 0;
		playerArray = new Player[2048];
		myPlayerIndex = -1;
		anInt2106 = 0;
		screenZoom = 0;
		anIntArray2107 = new int[1000];
		anIntArray2108 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		playerActions = new String[8];
		aBoolArray2109 = new boolean[8];
		anInt2110 = 0;
		anInt2111 = -1;
		secondLastFrameId = 0;
		anInt2113 = 0;
		anInt2114 = 0;
		loginBuffer = new BitBuf(5000);
		anInt2116 = 0;
		groundItemDeque = new Deque[4][104][104];
		anInt2117 = 0;
		aBoolArray2118 = new boolean[100];
		menuOpen = false;
		menuItemCount = 0;
		menuArg1 = new int[500];
		anInt2119 = 0;
		anInt2120 = 0;
		menuArg0 = new int[500];
		menuActions = new String[500];
		anIntArrayArray2121 = new int[104][104];
		anInt2122 = -1;
		anInt2123 = -1;
		anInt2124 = 0;
		aShort2125 = 32767;
		aLong2126 = -1L;
		anInt2127 = 0;
		spellSelected = false;
		anInt2128 = -1;
		anInt2129 = -1;
		anInt2130 = 0;
		anInt2131 = 0;
		anIntArray2132 = new int[anInt2083];
		interfaceNodes = new NodeTable(8);
		anInt2133 = 0;
		anInt2134 = 0;
		aWidget2135 = null;
		energy = 0;
		weight = 0;
		myRights = 0;
		anInt2136 = -1;
		aBoolArray2137 = new boolean[100];
		aPlayerConfig2138 = new PlayerConfig();
		aBool2139 = false;
		anInt2140 = 1;
		aWidget2141 = null;
		aWidget2142 = null;
		currentLevels = new int[25];
		anInt2143 = 0;
		anInt2144 = 0;
		aBool2145 = false;
		anInt2146 = -1;
		anInt2147 = -1;
		aBool2148 = false;
		myWorld = 1;
		anInt2149 = -1;
		aBool2150 = false;
		anInt2151 = 1;
		anIntArray2152 = new int[32];
		anInt2153 = 0;
		anIntArray2154 = new int[32];
		anInt2155 = 0;
		anIntArray2156 = new int[32];
		anInt2157 = 0;
		anInt2158 = 0;
		screenHeight = 0;
		anInt2159 = 0;
		anInt2160 = 0;
		anInt2161 = 0;
		anIntArray2162 = new int[128];
		anInt2163 = 0;
		aDeque2164 = new Deque();
		aDeque2165 = new Deque();
		aDeque2166 = new Deque();
		widgetConfigs = new NodeTable(512);
		anInt2168 = 0;
		anInt2169 = 0;
		aClass36_2170 = Class36.aClass36_399;
		aBoolArray2171 = new boolean[100];
		resizable = true;
		anIntArray2173 = new int[100];
		anIntArray2174 = new int[100];
		anIntArray2175 = new int[100];
		anIntArray2176 = new int[100];
		anInt2177 = 0;
		aShort2178 = 256;
		aBool2179 = false;
		anInt2180 = 0;
		anInt2181 = 514876893;
		anInt2182 = 0;
		anInt2183 = 0;
		anInt2184 = 0;
		anInt2185 = 50;
		aLongArray2186 = new long[100];
		anInt2187 = 0;
		anInt2188 = 0;
		anInt2189 = 0;
		anIntArray2190 = new int[128];
		aBool2191 = false;
		anInt2192 = -2;
		clanChatName = null;
		aDeque2193 = new Deque();
		anInt2194 = -1;
		anInt2195 = 0;
		anIntArray2196 = new int[1000];
		anIntArray2197 = new int[1000];
		aSpriteArray2198 = new Picture[1000];
		destinationX = 0;
		aClass36_2199 = Class36.aClass36_399;
		anInt2200 = 0;
		anInt2201 = 255;
		anInt2202 = -1;
		thridLastFrameId = 0;
		anInt2204 = 127;
		anInt2205 = 1108213437;
		audioEffectCount = 0;
		anIntArray2206 = new int[50];
		anInt2207 = 0;
		anInt2208 = 0;
		anIntArray2209 = new int[50];
		aClass14Array2210 = new Class14[50];
		connectionState = 0;
		menuNouns = new String[500];
		anIntArray2212 = new int[5];
		anIntArray2213 = new int[5];
		aBool2214 = true;
		anIntArray2215 = new int[5];
		anIntArray2216 = new int[5];
		aShort2217 = 205;
		aShort2218 = 256;
		menuActionPrefix = null;
		aShort2219 = 1;
		anInt2220 = 0;
		aShort2221 = 1;
		aShort2222 = 32767;
		anInt2223 = 0;
		anInt2224 = 0;
		anInt2225 = 0;
		anInt2226 = -1;
		selectedItemName = null;
		anInt2227 = -1;
		friendListSize = 0;
		friendedPlayers = new FriendedPlayer[400];
		aClass102_2228 = new Class102();
		anInt2229 = 0;
		ignoredPlayers = new IgnoredPlayer[400];
		destinationY = 0;
		anInt2230 = -1;
		aWidget2231 = null;
		localExchangeOffers = new ExchangeOffer[8];
		aLong2232 = -1L;
		anInt2233 = 765;
		aClass48_Sub1_2234 = new Class48_Sub1();
		anIntArray2235 = new int[50];
		anIntArray2236 = new int[50];
	}

}
