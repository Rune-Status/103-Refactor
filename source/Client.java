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

	
	public Client() {
		
	}
	
	static int minimapRotation = 0;
	static Client aClient2005;
	static boolean aBool2006 = true;
	static int[] menuArg2 = new int[500];
	static int myWorldFlags = 0;
	static int anInt2008 = -2027276566;
	static Widget aWidget2009 = null;
	static boolean membersWorld = false;
	static boolean aBool2010 = false;
	static int anInt2011 = 0;
	static String aString2012;
	static String aString2013;
	static short aShort2014 = 320;
	static int anInt2015 = 0;
	static int engineCycle = 0;
	static long aLong2016 = -5938907264350207555L;
	static int anInt2017 = 834705573;
	static int anInt2018 = 0;
	static int anInt2019 = -1669020249;
	static boolean aBool2020 = true;
	static boolean displayFps = false;
	static int hintArrowY = 0;
	static int[] experiences = new int[25];
	static int anInt2021 = 0;
	static int[] levels = new int[25];
	static int hintArrowX = 0;
	static CacheIndex aClass87_Sub1_2022;
	static int[] anIntArray2023 = new int[] { 16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215 };
	static boolean aBool2024 = false;
	static int anInt2025 = 0;
	static int[] directionAngles = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	static int anInt2027 = 550236941;
	static int bootState = 0;
	static int anInt2028 = 0;
	static int[] anIntArray2029 = new int[50];
	static byte clanChatRank;
	static long aLong2030 = 8084475441026814739L;
	static int anInt2031 = 0;
	static int anInt2032 = 0;
	static String selectedSpellName = null;
	static boolean[] aBoolArray2033 = new boolean[5];
	static int anInt2034 = 0;
	static Npc[] npcArray = new Npc['\u8000'];
	static Deque graphicsObjectDeque = new Deque();
	static int[] npcIndices = new int['\u8000'];
	static long aLong2035 = 0L;
	static int[] pendingNpcFlagsIndices = new int[250];
	static BitBuf outBuffer = new BitBuf(5000);
	static int anInt2037 = 0;
	static BitBuf inBuffer = new BitBuf(15000);
	static int frameSize = 0;
	static int frameId = 0;
	static int anInt2041 = 0;
	static int anInt2042 = 0;
	static int lastFrameId = 0;
	static String aString2044 = "";
	static int screenWidth = 0;
	static int anInt2045 = 0;
	static boolean aBool2046 = false;
	static DualNode_Sub13_Sub3_Sub1 aDualNode_Sub13_Sub3_Sub1_2047;
	static int anInt2048 = 0;
	static int itemSelectionStatus = 0;
	static int anInt2049 = 0;
	static int anInt2050 = 693748815;
	static int anInt2051 = -943887744;
	static int[] regionIds;
	static CollisionMap[] collisionMaps = new CollisionMap[4];
	static boolean dynamicRegion = false;
	static int[][][] anIntArrayArrayArray2055 = new int[4][13][13];
	static int[] anIntArray2056 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static int anInt2057 = 1609074786;
	static int anInt2058 = 0;
	static int anInt2059 = 975522870;
	static int anInt2060 = 0;
	static int anInt2061 = 804940911;
	static int anInt2062 = 0;
	static int minimapScale = 0;
	static int anInt2063 = 1760620982;
	static int viewRotation = 0;
	static int anInt2064 = -2064007701;
	static int pendingNpcFlagsCount = 0;
	static int anInt2066 = 0;
	static int anInt2067 = -1838575403;
	static int anInt2068 = 414781363;
	static int anInt2069 = 1653772723;
	static int anInt2070 = 1704404612;
	static boolean aBool2071 = false;
	static int anInt2072 = 0;
	static int[] anIntArray2073 = new int[50];
	static int anInt2074 = 0;
	static int anInt2075 = 0;
	static int anInt2076 = 0;
	static int anInt2077 = -2049146891;
	static int anInt2078 = 0;
	static int anInt2079 = 0;
	static int anInt2080 = 0;
	static boolean aBool2081 = false;
	static Deque projectileDeque = new Deque();
	static int anInt2082 = 0;
	static int anInt2083 = -2042425390;
	static int[] anIntArray2084 = new int[-475281231 * anInt2083];
	static int[] anIntArray2085 = new int[anInt2083 * -475281231];
	static int[] anIntArray2086 = new int[anInt2083 * -475281231];
	static int[] anIntArray2087 = new int[-475281231 * anInt2083];
	static int[] anIntArray2088 = new int[-475281231 * anInt2083];
	static int[] anIntArray2089 = new int[-475281231 * anInt2083];
	static int[] menuOpcodes = new int[500];
	static String[] aStringArray2090 = new String[-475281231 * anInt2083];
	static Class77 aClass77_2091;
	static int anInt2092 = 0;
	static int anInt2093 = -1776163475;
	static int anInt2094 = 192643311;
	static int anInt2095 = 0;
	static int anInt2096 = 0;
	static int anInt2097 = 0;
	static int cursorState = 0;
	static int anInt2098 = 0;
	static int anInt2099 = 0;
	static int anInt2100 = 0;
	static String clanChatOwner = null;
	static int anInt2101 = 0;
	static boolean aBool2102 = false;
	static boolean aBool2103 = false;
	static CacheIndex aClass87_Sub1_2104;
	static int anInt2105 = 0;
	static Player[] playerArray = new Player[2048];
	static int myPlayerIndex = 313169887;
	static int anInt2106 = 0;
	static int screenZoom = 0;
	static int[] anIntArray2107 = new int[1000];
	static int[] anIntArray2108 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
	static String[] playerActions = new String[8];
	static boolean[] aBoolArray2109 = new boolean[8];
	static int anInt2110 = 0;
	static int anInt2111 = 1929362559;
	static int secondLastFrameId = 0;
	static int anInt2113 = 0;
	static int anInt2114 = 0;
	static BitBuf aPacketBuffer2115 = new BitBuf(5000);
	static int anInt2116 = 0;
	static Deque[][][] groundItemDeque = new Deque[4][104][104];
	static int anInt2117 = 0;
	static boolean[] aBoolArray2118 = new boolean[100];
	static boolean menuOpen = false;
	static int menuItemCount = 0;
	static int[] menuArg1 = new int[500];
	static int anInt2119 = 0;
	static int anInt2120 = 0;
	static int[] menuArg0 = new int[500];
	static String[] menuActions = new String[500];
	static int[][] anIntArrayArray2121 = new int[104][104];
	static int anInt2122 = 247064981;
	static int anInt2123 = 630066539;
	static int anInt2124 = 0;
	static short aShort2125 = 32767;
	static long aLong2126 = -3199879388585765537L;
	static int anInt2127 = 0;
	static boolean spellSelected = false;
	static int anInt2128 = -1188249893;
	static int anInt2129 = -461597295;
	static int anInt2130 = 0;
	static int anInt2131 = 0;
	static int[] anIntArray2132 = new int[anInt2083 * -475281231];
	static NodeTable interfaceNodes = new NodeTable(8);
	static int anInt2133 = 0;
	static int anInt2134 = 0;
	static Widget aWidget2135 = null;
	static int energy = 0;
	static int weight = 0;
	static int myRights = 0;
	static int anInt2136 = -218906203;
	static boolean[] aBoolArray2137 = new boolean[100];
	static PlayerConfig aPlayerConfig2138 = new PlayerConfig();
	static boolean aBool2139 = false;
	static int anInt2140 = 1739605141;
	static Widget aWidget2141 = null;
	static Widget aWidget2142 = null;
	static int[] currentLevels = new int[25];
	static int anInt2143 = 0;
	static int anInt2144 = 0;
	static boolean aBool2145 = false;
	static int anInt2146 = 548999593;
	static int anInt2147 = 553751249;
	static boolean aBool2148 = false;
	static int myWorld = 1829549817;
	static int anInt2149 = -740381373;
	static boolean aBool2150 = false;
	static int anInt2151 = 44844977;
	static int[] anIntArray2152 = new int[32];
	static int anInt2153 = 0;
	static int[] anIntArray2154 = new int[32];
	static int anInt2155 = 0;
	static int[] anIntArray2156 = new int[32];
	static int anInt2157 = 0;
	static int anInt2158 = 0;
	static int screenHeight = 0;
	static int anInt2159 = 0;
	static int anInt2160 = 0;
	static int anInt2161 = 0;
	static int[] anIntArray2162 = new int[128];
	static int anInt2163 = 0;
	static Deque aDeque2164 = new Deque();
	static Deque aDeque2165 = new Deque();
	static Deque aDeque2166 = new Deque();
	static NodeTable widgetConfigs = new NodeTable(512);
	static int anInt2168 = 0;
	static int anInt2169 = 0;
	static Class36 aClass36_2170 = Class36.aClass36_399;
	static boolean[] aBoolArray2171 = new boolean[100];
	static boolean resizable = true;
	static int[] anIntArray2173 = new int[100];
	static int[] anIntArray2174 = new int[100];
	static int[] anIntArray2175 = new int[100];
	static int[] anIntArray2176 = new int[100];
	static int anInt2177 = 0;
	static short aShort2178 = 256;
	static boolean aBool2179 = false;
	static int anInt2180 = 0;
	static int anInt2181 = -1238773265;
	static int anInt2182 = 0;
	static int anInt2183 = 0;
	static int anInt2184 = 0;
	static int anInt2185 = 416103202;
	static long[] aLongArray2186 = new long[100];
	static int anInt2187 = 0;
	static int anInt2188 = 0;
	static int anInt2189 = 0;
	static int[] anIntArray2190 = new int[128];
	static boolean aBool2191 = false;
	static int anInt2192 = -233464314;
	static String clanChatName = null;
	static Deque aDeque2193 = new Deque();
	static int anInt2194 = -1008529911;
	static int anInt2195 = 0;
	static int[] anIntArray2196 = new int[1000];
	static int[] anIntArray2197 = new int[1000];
	static Sprite[] aSpriteArray2198 = new Sprite[1000];
	static int destinationX = 0;
	static Class36 aClass36_2199 = Class36.aClass36_399;
	static int anInt2200 = 0;
	static int anInt2201 = 1317704459;
	static int anInt2202 = 277612363;
	static int thridLastFrameId = 0;
	static int anInt2204 = 1632484343;
	static int anInt2205 = 1108213437;
	static int audioEffectCount = 0;
	static int[] anIntArray2206 = new int[50];
	static int anInt2207 = 0;
	static int anInt2208 = 0;
	static int[] anIntArray2209 = new int[50];
	static Class14[] aClass14Array2210 = new Class14[50];
	static int connectionState = 0;
	static int anInt2211;
	static String[] menuNouns = new String[500];
	static int[] anIntArray2212 = new int[5];
	static int[] anIntArray2213 = new int[5];
	static boolean aBool2214 = true;
	static int[] anIntArray2215 = new int[5];
	static int[] anIntArray2216 = new int[5];
	static short aShort2217 = 205;
	static short aShort2218 = 256;
	static String menuActionPrefix = null;
	static short aShort2219 = 1;
	static int anInt2220 = 0;
	static short aShort2221 = 1;
	static short aShort2222 = 32767;
	static int anInt2223 = 0;
	static int anInt2224 = 0;
	static int anInt2225 = 0;
	static int anInt2226 = 605073011;
	static String selectedItemName = null;
	static int anInt2227 = 1955793445;
	static int friendListSize = 0;
	static FriendedPlayer[] friendedPlayers = new FriendedPlayer[400];
	static Class102 aClass102_2228 = new Class102();
	static int anInt2229 = 0;
	static IgnoredPlayer[] ignoredPlayers = new IgnoredPlayer[400];
	static int destinationY = 0;
	static int anInt2230 = 1984302057;
	static Widget aWidget2231 = null;
	static ExchangeOffer[] localExchangeOffers = new ExchangeOffer[8];
	static long aLong2232 = -2086566510266153657L;
	static int anInt2233 = -719576605;
	static Class48_Sub1 aClass48_Sub1_2234 = new Class48_Sub1();
	static int[] anIntArray2235 = new int[50];
	static int[] anIntArray2236 = new int[50];

	public final void init() {
		if (this.method1028()) {
			Parameters[] var1 = new Parameters[] { Parameters.aParameters74, Parameters.aParameters63,
					Parameters.aParameters73, Parameters.aParameters64, Parameters.aParameters61,
					Parameters.aParameters65, Parameters.aParameters62, Parameters.aParameters66,
					Parameters.aParameters71, Parameters.aParameters72, Parameters.aParameters75,
					Parameters.aParameters70, Parameters.aParameters60, Parameters.aParameters67,
					Parameters.aParameters68 };
			Parameters[] var2 = var1;

			for (int var3 = 0; var3 < var2.length; ++var3) {
				Parameters var4 = var2[var3];
				String var5 = this.getParameter(var4.key);
				if (var5 != null) {
					switch (Integer.parseInt(var4.key)) {
					case 1:
						InterfaceNode.anInt1399 = Integer.parseInt(var5) * -1162103955;
						break;
					case 2:
						anInt2011 = Integer.parseInt(var5) * 2086765149;
						break;
					case 3:
						int var6 = Integer.parseInt(var5);
						Class76[] var7 = Player.method1051();
						int var8 = 0;

						Class76 var10;
						while (true) {
							if (var8 >= var7.length) {
								var10 = null;
								break;
							}

							Class76 var9 = var7[var8];
							if (1156151357 * var9.anInt643 == var6) {
								var10 = var9;
								break;
							}

							++var8;
						}

						Class22.aClass76_285 = var10;
						break;
					case 4:
						aString2012 = var5;
					case 5:
					case 9:
					default:
						break;
					case 6:
						myWorld = Integer.parseInt(var5) * 1829549817;
						break;
					case 7:
						if (var5.equalsIgnoreCase(Class35.aString396)) {
							;
						}
						break;
					case 8:
						Class29.anInt335 = Integer.parseInt(var5) * -1960029413;
						break;
					case 10:
						anInt2074 = Integer.parseInt(var5) * -231061311;
						break;
					case 11:
						aClass77_2091 = (Class77) Class30.method189(Connection.method300(545495947),
								Integer.parseInt(var5));
						if (Class77.aClass77_651 == aClass77_2091) {
							Class48_Sub1.aClass124_1297 = Class124.aClass124_820;
						} else {
							Class48_Sub1.aClass124_1297 = Class124.aClass124_827;
						}
						break;
					case 12:
						if (var5.equalsIgnoreCase(Class35.aString396)) {
							membersWorld = true;
						} else {
							membersWorld = false;
						}
						break;
					case 13:
						aString2013 = var5;
						break;
					case 14:
						myWorldFlags = Integer.parseInt(var5) * -580042991;
					}
				}
			}

			GameStrings.method466();
			World.myWorldDomain = this.getCodeBase().getHost();
			String var12 = Class22.aClass76_285.aString642;
			byte var13 = 0;

			try {
				Node_Sub6.method539("oldschool", var12, var13, 16);
			} catch (Exception var11) {
				Class79.method345((String) null, var11);
			}

			aClient2005 = this;
			this.method1036(765, 503, 103);
		}
	}

	protected final void processLogic() {
		engineCycle += 1724962261;
		this.processJS5Connection();
		DualNode_Sub6.method698();

		int var2;
		try {
			if (-1587772409 * Class110.anInt782 == 1) {
				var2 = Class110.aNode_Sub4_Sub4_784.method828();
				if (var2 > 0 && Class110.aNode_Sub4_Sub4_784.method831()) {
					var2 -= Class110.anInt785 * -621410389;
					if (var2 < 0) {
						var2 = 0;
					}

					Class110.aNode_Sub4_Sub4_784.method827(var2);
				} else {
					Class110.aNode_Sub4_Sub4_784.method856();
					Class110.aNode_Sub4_Sub4_784.method844();
					if (Class110.aClass87_783 != null) {
						Class110.anInt782 = 650597230;
					} else {
						Class110.anInt782 = 0;
					}

					Class86.aNode_Sub11_693 = null;
					RuneScript.aClass13_1721 = null;
				}
			}
		} catch (Exception var80) {
			var80.printStackTrace();
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
			Class74.anInt624 = -1824690371 * Class74.anInt626;
			Class74.anInt621 = 52838135 * Class74.anInt625;
			Class74.anInt622 = 2128944719 * Class74.anInt619;
			Class74.anInt627 = Class74.anInt623 * 389487305;
			Class74.anInt628 = 1773102805 * Class74.anInt631;
			Class74.anInt629 = Class74.anInt620 * 1659422169;
			Class74.aLong630 = -1772624683215344831L * Class74.aLong616;
			Class74.anInt623 = 0;
		}

		if (Class26.aClass78_313 != null) {
			var2 = Class26.aClass78_313.method341(1367062203);
			anInt2163 = 2085925489 * var2;
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
		if (846055547 * anInt2113 == 0) {
			BoundaryDecorationStub.bootClient();
			Class2.method61();
		} else if (anInt2113 * 846055547 == 5) {
			Class16.method127(this);
			BoundaryDecorationStub.bootClient();
			Class2.method61();
		} else if (846055547 * anInt2113 != 10 && 846055547 * anInt2113 != 11) {
			if (846055547 * anInt2113 == 20) {
				Class16.method127(this);
				Class58.processLogin();
			} else if (846055547 * anInt2113 == 25) {
				Class74.method333(false);
				anInt2120 = 0;
				boolean var82 = true;

				for (var3 = 0; var3 < Class7.aByteArrayArray152.length; ++var3) {
					if (Class69.mapRegionFileIds[var3] != -1 && Class7.aByteArrayArray152[var3] == null) {
						Class7.aByteArrayArray152[var3] = Class48_Sub1.aClass87_Sub1_1295
								.getFile(Class69.mapRegionFileIds[var3], 0);
						if (Class7.aByteArrayArray152[var3] == null) {
							var82 = false;
							anInt2120 += 1643775755;
						}
					}

					if (DualNode_Sub5.landRegionFielIds[var3] != -1
							&& LandscapeTile.aByteArrayArray1406[var3] == null) {
						LandscapeTile.aByteArrayArray1406[var3] = Class48_Sub1.aClass87_Sub1_1295
								.method375(DualNode_Sub5.landRegionFielIds[var3], 0, DualNode_Sub12.regionXTEAs[var3]);
						if (LandscapeTile.aByteArrayArray1406[var3] == null) {
							var82 = false;
							anInt2120 += 1643775755;
						}
					}
				}

				if (!var82) {
					anInt2130 = 2127768527;
				} else {
					anInt2049 = 0;
					var82 = true;

					for (var3 = 0; var3 < Class7.aByteArrayArray152.length; ++var3) {
						byte[] var4 = LandscapeTile.aByteArrayArray1406[var3];
						if (var4 != null) {
							var5 = 64 * (regionIds[var3] >> 8) - Node_Sub10.regionBaseX * 1426698711;
							var6 = 64 * (regionIds[var3] & 255) - Class28.regionBaseY * 714823515;
							if (dynamicRegion) {
								var5 = 10;
								var6 = 10;
							}

							var82 &= Class21.method155(var4, var5, var6);
						}
					}

					if (!var82) {
						anInt2130 = -39430242;
					} else {
						if (anInt2130 * 252312367 != 0) {
							Class82.method363(GameStrings.aString852 + Class35.aString390 + Class35.aString389 + 100
									+ "%" + Class35.aString392, true);
						}

						Class34.method201();
						Class66.method325();
						Class34.method201();
						InterfaceNode.landscape.method15();
						Class34.method201();
						System.gc();

						for (var3 = 0; var3 < 4; ++var3) {
							collisionMaps[var3].method244();
						}

						for (var3 = 0; var3 < 4; ++var3) {
							for (var83 = 0; var83 < 104; ++var83) {
								for (var5 = 0; var5 < 104; ++var5) {
									Class39.renderRules[var3][var83][var5] = 0;
								}
							}
						}

						Class34.method201();
						Class39.anInt438 = 1869228033;
						Class118.aByteArrayArrayArray802 = new byte[4][104][104];
						Class39.aByteArrayArrayArray429 = new byte[4][104][104];
						DualNode_Sub6.aByteArrayArrayArray1507 = new byte[4][104][104];
						Class49.aByteArrayArrayArray514 = new byte[4][104][104];
						Class39.anIntArrayArrayArray433 = new int[4][105][105];
						Class39.aByteArrayArrayArray430 = new byte[4][105][105];
						Class39.anIntArrayArray441 = new int[105][105];
						Class73.anIntArray614 = new int[104];
						Class51.anIntArray526 = new int[104];
						Class39.anIntArray432 = new int[104];
						Class89.anIntArray715 = new int[104];
						RuneScript.anIntArray1724 = new int[104];
						var3 = Class7.aByteArrayArray152.length;

						for (Node_Sub6 var84 = (Node_Sub6) Node_Sub6.aDeque1279
								.method471(); var84 != null; var84 = (Node_Sub6) Node_Sub6.aDeque1279.method473()) {
							if (var84.aNode_Sub4_Sub2_1276 != null) {
								FriendedPlayer.aNode_Sub4_Sub1_740.method730(var84.aNode_Sub4_Sub2_1276);
								var84.aNode_Sub4_Sub2_1276 = null;
							}

							if (var84.aNode_Sub4_Sub2_1280 != null) {
								FriendedPlayer.aNode_Sub4_Sub1_740.method730(var84.aNode_Sub4_Sub2_1280);
								var84.aNode_Sub4_Sub2_1280 = null;
							}
						}

						Node_Sub6.aDeque1279.method467();
						Class74.method333(true);
						if (!dynamicRegion) {
							byte[] var7;
							for (var83 = 0; var83 < var3; ++var83) {
								var5 = (regionIds[var83] >> 8) * 64 - 1426698711 * Node_Sub10.regionBaseX;
								var6 = 64 * (regionIds[var83] & 255) - Class28.regionBaseY * 714823515;
								var7 = Class7.aByteArrayArray152[var83];
								if (var7 != null) {
									Class34.method201();
									Class93.method404(var7, var5, var6, 1990031784 * TileDecorationStub.anInt840 - 48,
											1403298904 * Class90.anInt722 - 48, collisionMaps);
								}
							}

							for (var83 = 0; var83 < var3; ++var83) {
								var5 = (regionIds[var83] >> 8) * 64 - 1426698711 * Node_Sub10.regionBaseX;
								var6 = 64 * (regionIds[var83] & 255) - Class28.regionBaseY * 714823515;
								var7 = Class7.aByteArrayArray152[var83];
								if (var7 == null && 1249154187 * Class90.anInt722 < 800) {
									Class34.method201();
									Class28.method182(var5, var6, 64, 64);
								}
							}

							Class74.method333(true);

							for (var83 = 0; var83 < var3; ++var83) {
								byte[] var87 = LandscapeTile.aByteArrayArray1406[var83];
								if (var87 != null) {
									var6 = 64 * (regionIds[var83] >> 8) - Node_Sub10.regionBaseX * 1426698711;
									var89 = 64 * (regionIds[var83] & 255) - 714823515 * Class28.regionBaseY;
									Class34.method201();
									BoundaryDecorationStub.method106(var87, var6, var89, InterfaceNode.landscape,
											collisionMaps);
								}
							}
						}

						int var19;
						int var21;
						int var22;
						int var23;
						int var24;
						int var27;
						int var29;
						int var30;
						int var31;
						int var32;
						if (dynamicRegion) {
							for (var83 = 0; var83 < 4; ++var83) {
								Class34.method201();

								for (var5 = 0; var5 < 13; ++var5) {
									for (var6 = 0; var6 < 13; ++var6) {
										boolean var90 = false;
										var8 = anIntArrayArrayArray2055[var83][var5][var6];
										if (var8 != -1) {
											var9 = var8 >> 24 & 3;
											var10 = var8 >> 1 & 3;
											var11 = var8 >> 14 & 1023;
											var12 = var8 >> 3 & 2047;
											var13 = (var11 / 8 << 8) + var12 / 8;

											for (var14 = 0; var14 < regionIds.length; ++var14) {
												if (regionIds[var14] == var13
														&& Class7.aByteArrayArray152[var14] != null) {
													byte[] var15 = Class7.aByteArrayArray152[var14];
													var16 = var5 * 8;
													var17 = 8 * var6;
													var18 = 8 * (var11 & 7);
													var19 = (var12 & 7) * 8;
													CollisionMap[] var20 = collisionMaps;

													for (var21 = 0; var21 < 8; ++var21) {
														for (var22 = 0; var22 < 8; ++var22) {
															if (var16 + var21 > 0 && var16 + var21 < 103
																	&& var22 + var17 > 0 && var22 + var17 < 103) {
																var20[var83].flags[var21 + var16][var22
																		+ var17] &= -16777217;
															}
														}
													}

													ByteBuf var150 = new ByteBuf(var15);

													for (var22 = 0; var22 < 4; ++var22) {
														for (var23 = 0; var23 < 64; ++var23) {
															for (var24 = 0; var24 < 64; ++var24) {
																if (var9 == var22 && var23 >= var18 && var23 < 8 + var18
																		&& var24 >= var19 && var24 < 8 + var19) {
																	var27 = var16 + DualNode_Sub2.method670(var23 & 7,
																			var24 & 7, var10);
																	var29 = var23 & 7;
																	var30 = var24 & 7;
																	var31 = var10 & 3;
																	if (var31 == 0) {
																		var32 = var30;
																	} else if (var31 == 1) {
																		var32 = 7 - var29;
																	} else if (var31 == 2) {
																		var32 = 7 - var30;
																	} else {
																		var32 = var29;
																	}

																	Class122.method452(var150, var83, var27,
																			var17 + var32, 0, 0, var10);
																} else {
																	Class122.method452(var150, 0, -1, -1, 0, 0, 0);
																}
															}
														}
													}

													var90 = true;
													break;
												}
											}
										}

										if (!var90) {
											Class20_Sub1.method513(var83, var5 * 8, var6 * 8);
										}
									}
								}
							}

							for (var83 = 0; var83 < 13; ++var83) {
								for (var5 = 0; var5 < 13; ++var5) {
									var6 = anIntArrayArrayArray2055[0][var83][var5];
									if (var6 == -1) {
										Class28.method182(8 * var83, 8 * var5, 8, 8);
									}
								}
							}

							Class74.method333(true);

							for (var83 = 0; var83 < 4; ++var83) {
								Class34.method201();

								for (var5 = 0; var5 < 13; ++var5) {
									for (var6 = 0; var6 < 13; ++var6) {
										var89 = anIntArrayArrayArray2055[var83][var5][var6];
										if (var89 != -1) {
											var8 = var89 >> 24 & 3;
											var9 = var89 >> 1 & 3;
											var10 = var89 >> 14 & 1023;
											var11 = var89 >> 3 & 2047;
											var12 = var11 / 8 + (var10 / 8 << 8);

											for (var13 = 0; var13 < regionIds.length; ++var13) {
												if (var12 == regionIds[var13]
														&& LandscapeTile.aByteArrayArray1406[var13] != null) {
													Class94.method405(LandscapeTile.aByteArrayArray1406[var13], var83,
															var5 * 8, 8 * var6, var8, 8 * (var10 & 7), (var11 & 7) * 8,
															var9, InterfaceNode.landscape, collisionMaps);
													break;
												}
											}
										}
									}
								}
							}
						}

						Class74.method333(true);
						Class66.method325();
						Class34.method201();
						Landscape var92 = InterfaceNode.landscape;
						CollisionMap[] var93 = collisionMaps;

						for (var6 = 0; var6 < 4; ++var6) {
							for (var89 = 0; var89 < 104; ++var89) {
								for (var8 = 0; var8 < 104; ++var8) {
									if ((Class39.renderRules[var6][var89][var8] & 1) == 1) {
										var9 = var6;
										if ((Class39.renderRules[1][var89][var8] & 2) == 2) {
											var9 = var6 - 1;
										}

										if (var9 >= 0) {
											var93[var9].method235(var89, var8);
										}
									}
								}
							}
						}

						Class39.anInt431 += ((int) (Math.random() * 5.0D) - 2) * 1676696543;
						if (Class39.anInt431 * -1833492449 < -8) {
							Class39.anInt431 = -528670456;
						}

						if (-1833492449 * Class39.anInt431 > 8) {
							Class39.anInt431 = 528670456;
						}

						Class39.anInt439 += ((int) (Math.random() * 5.0D) - 2) * 916560105;
						if (1969012569 * Class39.anInt439 < -16) {
							Class39.anInt439 = -1780059792;
						}

						if (1969012569 * Class39.anInt439 > 16) {
							Class39.anInt439 = 1780059792;
						}

						for (var6 = 0; var6 < 4; ++var6) {
							byte[][] var95 = Class39.aByteArrayArrayArray430[var6];
							var13 = (int) Math.sqrt(5100.0D);
							var14 = var13 * 768 >> 8;

							for (var114 = 1; var114 < 103; ++var114) {
								for (var16 = 1; var16 < 103; ++var16) {
									var17 = Class39.tileHeights[var6][1 + var16][var114]
											- Class39.tileHeights[var6][var16 - 1][var114];
									var18 = Class39.tileHeights[var6][var16][1 + var114]
											- Class39.tileHeights[var6][var16][var114 - 1];
									var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
									var145 = (var17 << 8) / var19;
									var21 = 65536 / var19;
									var22 = (var18 << 8) / var19;
									var23 = 96 + (var145 * -50 + var21 * -10 + -50 * var22) / var14;
									var24 = (var95[var16][var114 - 1] >> 2) + (var95[var16 - 1][var114] >> 2)
											+ (var95[var16 + 1][var114] >> 3) + (var95[var16][1 + var114] >> 3)
											+ (var95[var16][var114] >> 1);
									Class39.anIntArrayArray441[var16][var114] = var23 - var24;
								}
							}

							for (var114 = 0; var114 < 104; ++var114) {
								Class73.anIntArray614[var114] = 0;
								Class51.anIntArray526[var114] = 0;
								Class39.anIntArray432[var114] = 0;
								Class89.anIntArray715[var114] = 0;
								RuneScript.anIntArray1724[var114] = 0;
							}

							for (var114 = -5; var114 < 109; ++var114) {
								for (var16 = 0; var16 < 104; ++var16) {
									var17 = 5 + var114;
									if (var17 >= 0 && var17 < 104) {
										var18 = Class118.aByteArrayArrayArray802[var6][var17][var16] & 255;
										if (var18 > 0) {
											DualNode_Sub7 var143 = InterfaceNode.method577(var18 - 1);
											Class73.anIntArray614[var16] += var143.anInt1512 * -389568753;
											Class51.anIntArray526[var16] += 1757454653 * var143.anInt1514;
											Class39.anIntArray432[var16] += var143.anInt1513 * 789203561;
											Class89.anIntArray715[var16] += var143.anInt1515 * 837190867;
											++RuneScript.anIntArray1724[var16];
										}
									}

									var18 = var114 - 5;
									if (var18 >= 0 && var18 < 104) {
										var19 = Class118.aByteArrayArrayArray802[var6][var18][var16] & 255;
										if (var19 > 0) {
											DualNode_Sub7 var146 = InterfaceNode.method577(var19 - 1);
											Class73.anIntArray614[var16] -= var146.anInt1512 * -389568753;
											Class51.anIntArray526[var16] -= var146.anInt1514 * 1757454653;
											Class39.anIntArray432[var16] -= 789203561 * var146.anInt1513;
											Class89.anIntArray715[var16] -= 837190867 * var146.anInt1515;
											--RuneScript.anIntArray1724[var16];
										}
									}
								}

								if (var114 >= 1 && var114 < 103) {
									var16 = 0;
									var17 = 0;
									var18 = 0;
									var19 = 0;
									var145 = 0;

									for (var21 = -5; var21 < 109; ++var21) {
										var22 = 5 + var21;
										if (var22 >= 0 && var22 < 104) {
											var16 += Class73.anIntArray614[var22];
											var17 += Class51.anIntArray526[var22];
											var18 += Class39.anIntArray432[var22];
											var19 += Class89.anIntArray715[var22];
											var145 += RuneScript.anIntArray1724[var22];
										}

										var23 = var21 - 5;
										if (var23 >= 0 && var23 < 104) {
											var16 -= Class73.anIntArray614[var23];
											var17 -= Class51.anIntArray526[var23];
											var18 -= Class39.anIntArray432[var23];
											var19 -= Class89.anIntArray715[var23];
											var145 -= RuneScript.anIntArray1724[var23];
										}

										if (var21 >= 1 && var21 < 103
												&& (!aBool2010 || (Class39.renderRules[0][var114][var21] & 2) != 0
														|| (Class39.renderRules[var6][var114][var21] & 16) == 0)) {
											if (var6 < Class39.anInt438 * -1263368093) {
												Class39.anInt438 = var6 * -241419957;
											}

											var24 = Class118.aByteArrayArrayArray802[var6][var114][var21] & 255;
											int var25 = Class39.aByteArrayArrayArray429[var6][var114][var21] & 255;
											if (var24 > 0 || var25 > 0) {
												int var26 = Class39.tileHeights[var6][var114][var21];
												var27 = Class39.tileHeights[var6][var114 + 1][var21];
												int var28 = Class39.tileHeights[var6][var114 + 1][var21 + 1];
												var32 = Class39.tileHeights[var6][var114][var21 + 1];
												var29 = Class39.anIntArrayArray441[var114][var21];
												var30 = Class39.anIntArrayArray441[1 + var114][var21];
												var31 = Class39.anIntArrayArray441[1 + var114][var21 + 1];
												int var33 = Class39.anIntArrayArray441[var114][1 + var21];
												int var34 = -1;
												int var35 = -1;
												int var36;
												int var37;
												if (var24 > 0) {
													var36 = 256 * var16 / var19;
													var37 = var17 / var145;
													int var38 = var18 / var145;
													var34 = IndexTable.method304(var36, var37, var38);
													var36 = var36 + Class39.anInt431 * -1833492449 & 255;
													var38 += 1969012569 * Class39.anInt439;
													if (var38 < 0) {
														var38 = 0;
													} else if (var38 > 255) {
														var38 = 255;
													}

													var35 = IndexTable.method304(var36, var37, var38);
												}

												if (var6 > 0) {
													boolean var179 = true;
													if (var24 == 0
															&& DualNode_Sub6.aByteArrayArrayArray1507[var6][var114][var21] != 0) {
														var179 = false;
													}

													if (var25 > 0 && !Class8.method95(var25 - 1).aBool1529) {
														var179 = false;
													}

													if (var179 && var26 == var27 && var26 == var28 && var26 == var32) {
														Class39.anIntArrayArrayArray433[var6][var114][var21] |= 2340;
													}
												}

												var36 = 0;
												if (var35 != -1) {
													var36 = DualNode_Sub13_Sub1.anIntArray1793[Class86.method366(var35,
															96)];
												}

												if (var25 == 0) {
													var92.method17(var6, var114, var21, 0, 0, -1, var26, var27, var28,
															var32, Class86.method366(var34, var29),
															Class86.method366(var34, var30),
															Class86.method366(var34, var31),
															Class86.method366(var34, var33), 0, 0, 0, 0, var36, 0);
												} else {
													var37 = 1
															+ DualNode_Sub6.aByteArrayArrayArray1507[var6][var114][var21];
													byte var180 = Class49.aByteArrayArrayArray514[var6][var114][var21];
													DualNode_Sub9 var39 = Class8.method95(var25 - 1);
													int var40 = var39.anInt1522 * 1261368579;
													int var41;
													int var42;
													int var43;
													int var44;
													if (var40 >= 0) {
														var41 = DualNode_Sub13_Sub1.anInterface3_1796.method7(var40,
																-1299505992);
														var42 = -1;
													} else if (var39.anInt1526 * 2024508145 == 16711935) {
														var42 = -2;
														var40 = -1;
														var41 = -2;
													} else {
														var42 = IndexTable.method304(-491020635 * var39.anInt1531,
																var39.anInt1524 * -958248725,
																1921798311 * var39.anInt1530);
														var43 = Class39.anInt431 * -1833492449
																+ -491020635 * var39.anInt1531 & 255;
														var44 = Class39.anInt439 * 1969012569
																+ var39.anInt1530 * 1921798311;
														if (var44 < 0) {
															var44 = 0;
														} else if (var44 > 255) {
															var44 = 255;
														}

														var41 = IndexTable.method304(var43, -958248725 * var39.anInt1524,
																var44);
													}

													var43 = 0;
													if (var41 != -2) {
														var43 = DualNode_Sub13_Sub1.anIntArray1793[Class33
																.method200(var41, 96)];
													}

													if (-105977311 * var39.anInt1527 != -1) {
														var44 = var39.anInt1525 * -478500885
																+ -1833492449 * Class39.anInt431 & 255;
														int var45 = Class39.anInt439 * 1969012569
																+ var39.anInt1528 * 1172182871;
														if (var45 < 0) {
															var45 = 0;
														} else if (var45 > 255) {
															var45 = 255;
														}

														var41 = IndexTable.method304(var44, -285023507 * var39.anInt1532,
																var45);
														var43 = DualNode_Sub13_Sub1.anIntArray1793[Class33
																.method200(var41, 96)];
													}

													var92.method17(var6, var114, var21, var37, var180, var40, var26,
															var27, var28, var32, Class86.method366(var34, var29),
															Class86.method366(var34, var30),
															Class86.method366(var34, var31),
															Class86.method366(var34, var33),
															Class33.method200(var42, var29),
															Class33.method200(var42, var30),
															Class33.method200(var42, var31),
															Class33.method200(var42, var33), var36, var43);
												}
											}
										}
									}
								}
							}

							for (var114 = 1; var114 < 103; ++var114) {
								for (var16 = 1; var16 < 103; ++var16) {
									var92.method52(var6, var16, var114,
											RuntimeException_Sub1.method931(var6, var16, var114));
								}
							}

							Class118.aByteArrayArrayArray802[var6] = (byte[][]) null;
							Class39.aByteArrayArrayArray429[var6] = (byte[][]) null;
							DualNode_Sub6.aByteArrayArrayArray1507[var6] = (byte[][]) null;
							Class49.aByteArrayArrayArray514[var6] = (byte[][]) null;
							Class39.aByteArrayArrayArray430[var6] = (byte[][]) null;
						}

						var92.method55(-50, -10, -50);

						for (var6 = 0; var6 < 104; ++var6) {
							for (var89 = 0; var89 < 104; ++var89) {
								if ((Class39.renderRules[1][var6][var89] & 2) == 2) {
									var92.method35(var6, var89);
								}
							}
						}

						var6 = 1;
						var89 = 2;
						var8 = 4;

						for (var9 = 0; var9 < 4; ++var9) {
							if (var9 > 0) {
								var6 <<= 3;
								var89 <<= 3;
								var8 <<= 3;
							}

							for (var10 = 0; var10 <= var9; ++var10) {
								for (var11 = 0; var11 <= 104; ++var11) {
									for (var12 = 0; var12 <= 104; ++var12) {
										short var147;
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

											label3175: while (var114 > 0) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if ((Class39.anIntArrayArrayArray433[var114 - 1][var12][var17]
															& var6) == 0) {
														break label3175;
													}
												}

												--var114;
											}

											label3186: while (var16 < var9) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if ((Class39.anIntArrayArrayArray433[1 + var16][var12][var17]
															& var6) == 0) {
														break label3186;
													}
												}

												++var16;
											}

											var17 = (var16 + 1 - var114) * (var14 - var13 + 1);
											if (var17 >= 8) {
												var147 = 240;
												var19 = Class39.tileHeights[var16][var12][var13] - var147;
												var145 = Class39.tileHeights[var114][var12][var13];
												Landscape.method49(var9, 1, 128 * var12, 128 * var12, var13 * 128,
														128 + 128 * var14, var19, var145);

												for (var21 = var114; var21 <= var16; ++var21) {
													for (var22 = var13; var22 <= var14; ++var22) {
														Class39.anIntArrayArrayArray433[var21][var12][var22] &= ~var6;
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

											label3224: while (var114 > 0) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if ((Class39.anIntArrayArrayArray433[var114 - 1][var17][var11]
															& var89) == 0) {
														break label3224;
													}
												}

												--var114;
											}

											label3235: while (var16 < var9) {
												for (var17 = var13; var17 <= var14; ++var17) {
													if ((Class39.anIntArrayArrayArray433[1 + var16][var17][var11]
															& var89) == 0) {
														break label3235;
													}
												}

												++var16;
											}

											var17 = (1 + var16 - var114) * (var14 - var13 + 1);
											if (var17 >= 8) {
												var147 = 240;
												var19 = Class39.tileHeights[var16][var13][var11] - var147;
												var145 = Class39.tileHeights[var114][var13][var11];
												Landscape.method49(var9, 2, 128 * var13, var14 * 128 + 128, 128 * var11,
														var11 * 128, var19, var145);

												for (var21 = var114; var21 <= var16; ++var21) {
													for (var22 = var13; var22 <= var14; ++var22) {
														Class39.anIntArrayArrayArray433[var21][var22][var11] &= ~var89;
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

											label3274: while (var13 > 0) {
												for (var17 = var114; var17 <= var16; ++var17) {
													if ((Class39.anIntArrayArrayArray433[var10][var13 - 1][var17]
															& var8) == 0) {
														break label3274;
													}
												}

												--var13;
											}

											label3285: while (var14 < 104) {
												for (var17 = var114; var17 <= var16; ++var17) {
													if ((Class39.anIntArrayArrayArray433[var10][var14 + 1][var17]
															& var8) == 0) {
														break label3285;
													}
												}

												++var14;
											}

											if ((1 + (var14 - var13)) * (1 + (var16 - var114)) >= 4) {
												var17 = Class39.tileHeights[var10][var13][var114];
												Landscape.method49(var9, 4, 128 * var13, 128 * var14 + 128,
														var114 * 128, 128 + 128 * var16, var17, var17);

												for (var18 = var13; var18 <= var14; ++var18) {
													for (var19 = var114; var19 <= var16; ++var19) {
														Class39.anIntArrayArrayArray433[var10][var18][var19] &= ~var8;
													}
												}
											}
										}
									}
								}
							}
						}

						Class74.method333(true);
						var6 = Class39.anInt438 * -1263368093;
						if (var6 > -747958745 * InterfaceNode.floorLevel) {
							var6 = -747958745 * InterfaceNode.floorLevel;
						}

						if (var6 < InterfaceNode.floorLevel * -747958745 - 1) {
							var6 = -747958745 * InterfaceNode.floorLevel - 1;
						}

						if (aBool2010) {
							InterfaceNode.landscape.method16(Class39.anInt438 * -1263368093);
						} else {
							InterfaceNode.landscape.method16(0);
						}

						for (var89 = 0; var89 < 104; ++var89) {
							for (var8 = 0; var8 < 104; ++var8) {
								Class32.method195(var89, var8);
							}
						}

						Class34.method201();

						for (Node_Sub8 var99 = (Node_Sub8) aDeque2193
								.method471(); var99 != null; var99 = (Node_Sub8) aDeque2193.method473()) {
							if (var99.anInt1311 * 1030491605 == -1) {
								var99.anInt1310 = 0;
								Class41.method226(var99);
							} else {
								var99.unlink();
							}
						}

						ObjectDefinition.aClass106_1684.method429();
						if (DualNode_Sub10.aFrame1538 != null) {
							outBuffer.putHeader(245);
							outBuffer.putInt(1057001181);
						}

						if (!dynamicRegion) {
							var89 = (-1361858763 * TileDecorationStub.anInt840 - 6) / 8;
							var8 = (6 + -1361858763 * TileDecorationStub.anInt840) / 8;
							var9 = (Class90.anInt722 * 1249154187 - 6) / 8;
							var10 = (6 + 1249154187 * Class90.anInt722) / 8;

							for (var11 = var89 - 1; var11 <= var8 + 1; ++var11) {
								for (var12 = var9 - 1; var12 <= 1 + var10; ++var12) {
									if (var11 < var89 || var11 > var8 || var12 < var9 || var12 > var10) {
										Class48_Sub1.aClass87_Sub1_1295.method387("m" + var11 + "_" + var12);
										Class48_Sub1.aClass87_Sub1_1295.method387("l" + var11 + "_" + var12);
									}
								}
							}
						}

						Node_Sub8.method550(30);
						Class34.method201();
						Class25.method166();
						outBuffer.putHeader(179);
						Class2.method61();
					}
				}
			}
		} else {
			Class16.method127(this);
		}

		if (anInt2113 * 846055547 == 30) {
			if (anInt2189 * 210138957 > 1) {
				anInt2189 -= -1900832379;
			}

			if (1121410397 * anInt2045 > 0) {
				anInt2045 -= 2094128885;
			}

			if (aBool2102) {
				aBool2102 = false;
				Class81.method361();
			} else {
				if (!menuOpen) {
					menuActions[0] = GameStrings.aString1079;
					menuNouns[0] = "";
					menuOpcodes[0] = 1006;
					menuItemCount = 1937006435;
				}

				long var50;
				boolean var85;
				String var94;
				Widget var121;
				for (var2 = 0; var2 < 100; ++var2) {
					if (Class31.gameConnection == null) {
						var85 = false;
					} else {
						label3092: {
							try {
								var83 = Class31.gameConnection.avail();
								if (var83 == 0) {
									var85 = false;
									break label3092;
								}

								if (793368497 * frameId == -1) {
									Class31.gameConnection.read(inBuffer.payload, 0, 1);
									inBuffer.position = 0;
									frameId = inBuffer.getHeader() * 726667601;
									frameSize = 260863215 * Class100.frameSizes[frameId * 793368497];
									--var83;
								}

								if (frameSize * 371800591 == -1) {
									if (var83 <= 0) {
										var85 = false;
										break label3092;
									}

									Class31.gameConnection.read(inBuffer.payload, 0, 1);
									frameSize = 260863215 * (inBuffer.payload[0] & 255);
									--var83;
								}

								if (371800591 * frameSize == -2) {
									if (var83 <= 1) {
										var85 = false;
										break label3092;
									}

									Class31.gameConnection.read(inBuffer.payload, 0, 2);
									inBuffer.position = 0;
									frameSize = inBuffer.getUShort() * 260863215;
									var83 -= 2;
								}

								if (var83 < frameSize * 371800591) {
									var85 = false;
									break label3092;
								}

								inBuffer.position = 0;
								Class31.gameConnection.read(inBuffer.payload, 0, frameSize * 371800591);
								anInt2041 = 0;
								thridLastFrameId = 470278475 * secondLastFrameId;
								secondLastFrameId = lastFrameId * -633837397;
								lastFrameId = frameId * -874887809;

								// TODO
								// System.out.println("Incomming Frame: ( " + (793368497 * frameId) + ", " + (371800591 * frameSize) + " (" + Class100.frameSizes[frameId * 793368497] + ") )");

								if (793368497 * frameId == 120) {
									var5 = inBuffer.getIMEInt();
									var6 = inBuffer.getULEShortA();
									var89 = var6 >> 10 & 31;
									var8 = var6 >> 5 & 31;
									var9 = var6 & 31;
									var10 = (var9 << 3) + (var8 << 11) + (var89 << 19);
									Widget var142 = Class94.getWidget(var5);
									if (var142.textColor * 1384750979 != var10) {
										var142.textColor = 1053943595 * var10;
										Class68.method326(var142);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 98) {
									GPI.localPlayerCount = 0;

									for (var5 = 0; var5 < 2048; ++var5) {
										GPI.cachedAppearances[var5] = null;
										GPI.movementTypes[var5] = 1;
									}

									for (var5 = 0; var5 < 2048; ++var5) {
										playerArray[var5] = null;
									}

									ItemTable.method649(inBuffer);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								InterfaceNode var163;
								if (frameId * 793368497 == 158) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getLEInt();
									var89 = inBuffer.getUByteS();
									var163 = (InterfaceNode) interfaceNodes.get((long) var6);
									if (var163 != null) {
										DualNode_Sub4.method691(var163, var163.type * 226793949 != var5);
									}

									InterfaceNode.method579(var6, var5, var89);

									if (GameClient.dump) System.out.println("sendInterface(" + (var6 >> 0x10) + ", " + (var6 & 0xFFFF) + ", "
											+ var5 + ", " + (var89 == 1) + ");");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 77) {
									anInt2189 = inBuffer.getUShortA() * -1190396522;
									anInt2155 = anInt2151 * 434653173;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								Widget var105;
								if (793368497 * frameId == 152) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getInt();
									var89 = inBuffer.getULEShortA();
									if (var89 == '\uffff') {
										var89 = -1;
									}

									System.out.println("sendInterfaceModel(" + (var6 >> 0x10) + ", " + (var6 & 0xFFFF) + ", " + var89 + ", " + var5 + ");");
									
									var105 = Class94.getWidget(var6);
									ItemDefinition var149;
									if (!var105.interactable) {
										if (var89 == -1) {
											var105.modelType = 0;
											frameId = -726667601;
											var85 = true;
											break label3092;
										}

										var149 = FriendedPlayer.getItemDefinition(var89);
										var105.modelType = -1505842828;
										var105.modelId = var89 * -541123263;
										var105.rotationX = var149.anInt1612 * 1778672027;
										var105.rotationZ = var149.anInt1613 * -438177483;
										var105.modelZoom = -438091779 * (1568478228 * var149.anInt1637 / var5);
										Class68.method326(var105);
									} else {
										var105.itemId = var89 * -444483265;
										var105.itemQuantity = var5 * 1567728457;
										var149 = FriendedPlayer.getItemDefinition(var89);
										var105.rotationX = 1778672027 * var149.anInt1612;
										var105.rotationZ = -438177483 * var149.anInt1613;
										var105.rotationY = 292702103 * var149.anInt1634;
										var105.anInt1198 = 889655743 * var149.anInt1642;
										var105.anInt1151 = var149.anInt1616 * -738298705;
										var105.modelZoom = -1079397735 * var149.anInt1637;
										if (var149.stackable * 1303294175 == 1) {
											var105.anInt1155 = -1548696853;
										} else {
											var105.anInt1155 = 1197573590;
										}

										if (var105.anInt1160 * 1501804265 > 0) {
											var105.modelZoom = -438091779
													* (126003872 * var105.modelZoom / (var105.anInt1160 * 1501804265));
										} else if (var105.anInt1135 * 124195285 > 0) {
											var105.modelZoom = -438091779
													* (var105.modelZoom * 126003872 / (124195285 * var105.anInt1135));
										}

										Class68.method326(var105);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 187) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getUByte();
									var89 = inBuffer.getUShort();
									EntityMarker.method139(var5, var6, var89);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								boolean var126;
								if (frameId * 793368497 == 161) {
									var126 = inBuffer.getUByte() == 1;
									if (var126) {
										Huffman.aLong449 = (Node_Sub5.currentTimeMs() - inBuffer.getLong())
												* 3889566144197309745L;
										Class70.aClass114_588 = new Class114(inBuffer, true);
									} else {
										Class70.aClass114_588 = null;
									}

									anInt2161 = 263290095 * anInt2151;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 176) {
									destinationX = inBuffer.getUByte() * -1943900347;
									if (destinationX * -1712731251 == 255) {
										destinationX = 0;
									}

									destinationY = inBuffer.getUByte() * 317027045;
									if (-691143955 * destinationY == 255) {
										destinationY = 0;
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 171) {
									var5 = 314639891 * inBuffer.position + 371800591 * frameSize;
									var6 = inBuffer.getUShort();
									var89 = inBuffer.getUShort();
									if (var6 != anInt2226 * -1074177723) {
										anInt2226 = var6 * -605073011;
										ItemTable.method647(false);
										Class28.method173(anInt2226 * -1074177723);
										Class24.method160(-1074177723 * anInt2226);

										for (var8 = 0; var8 < 100; ++var8) {
											aBoolArray2118[var8] = true;
										}
									}

									InterfaceNode var131;
									for (; var89-- > 0; var131.aBool1398 = true) {
										var8 = inBuffer.getInt();
										var9 = inBuffer.getUShort();
										var10 = inBuffer.getUByte();
										var131 = (InterfaceNode) interfaceNodes.get((long) var8);
										if (var131 != null && 226793949 * var131.type != var9) {
											DualNode_Sub4.method691(var131, true);
											var131 = null;
										}

										if (var131 == null) {
											var131 = InterfaceNode.method579(var8, var9, var10);
										}
									}

									for (var163 = (InterfaceNode) interfaceNodes
											.method150(); var163 != null; var163 = (InterfaceNode) interfaceNodes
													.method151()) {
										if (var163.aBool1398) {
											var163.aBool1398 = false;
										} else {
											DualNode_Sub4.method691(var163, true);
										}
									}

									widgetConfigs = new NodeTable(512);

									while (inBuffer.position * 314639891 < var5) {
										var8 = inBuffer.getInt();
										var9 = inBuffer.getUShort();
										var10 = inBuffer.getUShort();
										var11 = inBuffer.getInt();

										for (var12 = var9; var12 <= var10; ++var12) {
											long var46 = ((long) var8 << 32) + (long) var12;
											widgetConfigs.put(new WidgetConfig(var11), var46);
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								long var48;
								if (793368497 * frameId == 196) {
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

									for (var9 = var89; var9 <= var5; ++var9) {
										var48 = (long) var9 + ((long) var6 << 32);
										Node var123 = widgetConfigs.get(var48);
										if (var123 != null) {
											var123.unlink();
										}

										widgetConfigs.put(new WidgetConfig(var8), var48);
									}

									if (GameClient.dump) System.out.println("sendInterfaceSettings(" + (var6 >> 0x10) + ", "
											+ (var6 & 0xFFFF) + ", " + var89 + ", " + var5 + ", " + var8 + ");");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 201) {
									byte var173 = inBuffer.getByteA();
									var6 = inBuffer.getUShortA();
									Class94.engineVars[var6] = var173;
									if (Class94.tempVars[var6] != var173) {
										Class94.tempVars[var6] = var173;
									}

									if (GameClient.dump) System.out.println("sendVarp(" + var6 + ", " + var173 + ");");

									World.method484(var6);
									anIntArray2152[(anInt2153 += 1551596873) * -729938695 - 1 & 31] = var6;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 192) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getULEShort();
									Class94.engineVars[var6] = var5;
									if (var5 != Class94.tempVars[var6]) {
										Class94.tempVars[var6] = var5;
									}

									if (GameClient.dump) System.out.println("sendVarp(" + var6 + ", " + var5 + ");");

									World.method484(var6);
									anIntArray2152[(anInt2153 += 1551596873) * -729938695 - 1 & 31] = var6;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 218) {
									var5 = inBuffer.getUByte();
									if (inBuffer.getUByte() == 0) {
										localExchangeOffers[var5] = new ExchangeOffer();
										inBuffer.position += 979806694;
									} else {
										inBuffer.position -= -184175589;
										localExchangeOffers[var5] = new ExchangeOffer(inBuffer, false);
									}

									anInt2160 = anInt2151 * -929632705;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 247) {
									var5 = inBuffer.getULEShortA();
									Class33.method198(var5);
									anIntArray2154[(anInt2079 += -1121866621) * -1512766933 - 1 & 31] = var5 & 32767;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								long var52;
								long var54;
								if (frameId * 793368497 == 1) {
									var94 = inBuffer.getString();
									var50 = (long) inBuffer.getUShort();
									var52 = (long) inBuffer.getMedium();
									Class73[] var132 = new Class73[] { Class73.aClass73_612, Class73.aClass73_607,
											Class73.aClass73_613, Class73.aClass73_608, Class73.aClass73_609 };
									Class73 var127 = (Class73) Class30.method189(var132, inBuffer.getUByte());
									var54 = (var50 << 32) + var52;
									boolean var137 = false;

									for (var114 = 0; var114 < 100; ++var114) {
										if (aLongArray2186[var114] == var54) {
											var137 = true;
											break;
										}
									}

									if (World.method485(var94)) {
										var137 = true;
									}

									if (!var137 && anInt2183 * 198136383 == 0) {
										aLongArray2186[anInt2187 * 1926465309] = var54;
										anInt2187 = (1 + anInt2187 * 1926465309) % 100 * -1205898443;
										BitBuf var162 = inBuffer;

										String var167;
										try {
											var18 = var162.getUSmart();
											if (var18 > 32767) {
												var18 = 32767;
											}

											byte[] var166 = new byte[var18];
											var162.position += Class120.huffman.decompress(var162.payload,
													314639891 * var162.position, var166, 0, var18) * -184175589;
											String var165 = LandscapeTile.getString(var166, 0, var18);
											var167 = var165;
										} catch (Exception var74) {
											var167 = "Cabbage";
										}

										var167 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var167));
										byte var161;
										if (var127.aBool611) {
											var161 = 7;
										} else {
											var161 = 3;
										}

										if (var127.anInt606 * -2127218069 != -1) {
											Class75.method334(var161,
													Class41.method223(-2127218069 * var127.anInt606, (short) -9483)
															+ var94,
													var167);
										} else {
											Class75.method334(var161, var94, var167);
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								Widget var109;
								if (793368497 * frameId == 225) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getMEInt();
									var109 = Class94.getWidget(var6);
									if (var109 != null && var109.type * -1305917269 == 0) {
										if (var5 > 177405235 * var109.viewportHeight - 1227800423 * var109.height) {
											var5 = 177405235 * var109.viewportHeight - 1227800423 * var109.height;
										}

										if (var5 < 0) {
											var5 = 0;
										}

										if (var5 != -1602694527 * var109.insetY) {
											var109.insetY = var5 * -1459786367;
											Class68.method326(var109);
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 236) {
									InterfaceNode.anInt1400 = inBuffer.getUByteA() * -958823289;
									Player.anInt1988 = inBuffer.getUByte() * 1689579987;

									while (inBuffer.position * 314639891 < frameSize * 371800591) {
										frameId = inBuffer.getUByte() * 726667601;
										RuneScript.prcoessSceneFrame();
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 80) {
									var94 = inBuffer.getString();
									Object[] var172 = new Object[var94.length() + 1];

									for (var89 = var94.length() - 1; var89 >= 0; --var89) {
										if (var94.charAt(var89) == 115) {
											var172[1 + var89] = inBuffer.getString();
										} else {
											var172[var89 + 1] = new Integer(inBuffer.getInt());
										}
									}

									var172[0] = new Integer(inBuffer.getInt());
									ScriptEvent var171 = new ScriptEvent();
									var171.args = var172;
									Class96_Sub1.method504(var171);

									GameClient.dumpCS2Scripts(var172);

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 212) {
									anInt2110 = inBuffer.getUByte() * -677280985;
									anInt2182 = inBuffer.getUByte() * -1946178403;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 15 || 793368497 * frameId == 220 || 793368497 * frameId == 5
										|| frameId * 793368497 == 231 || 793368497 * frameId == 108
										|| frameId * 793368497 == 36 || frameId * 793368497 == 147
										|| 793368497 * frameId == 25 || 793368497 * frameId == 182
										|| 793368497 * frameId == 189) {
									RuneScript.prcoessSceneFrame();
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 190) {
									aBool2046 = true;
									Class48_Sub1.anInt1299 = inBuffer.getUByte() * 182040463;
									anInt2211 = inBuffer.getUByte() * 1904595561;
									GraphicsStub.anInt1813 = inBuffer.getUShort() * 1696668619;
									Class36.anInt402 = inBuffer.getUByte() * 1081596097;
									Class29.anInt334 = inBuffer.getUByte() * 1511028371;
									if (549132187 * Class29.anInt334 >= 100) {
										var5 = 64 + 1908651904 * Class48_Sub1.anInt1299;
										var6 = 64 + 107932800 * anInt2211;
										var89 = NpcDefinition.method802(var5, var6,
												-747958745 * InterfaceNode.floorLevel)
												- GraphicsStub.anInt1813 * 715633123;
										var8 = var5 - Projectile.cameraX * 282154897;
										var9 = var89 - FriendedPlayer.cameraZ * 1447873857;
										var10 = var6 - Class72.cameraY * -324676025;
										var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
										Class67.cameraPitch = ((int) (Math.atan2((double) var9, (double) var11)
												* 325.949D) & 2047) * 1852239419;
										Class65.cameraYaw = ((int) (Math.atan2((double) var8, (double) var10)
												* -325.949D) & 2047) * 531969645;
										if (Class67.cameraPitch * 1162853107 < 128) {
											Class67.cameraPitch = 863444352;
										}

										if (Class67.cameraPitch * 1162853107 > 383) {
											Class67.cameraPitch = 738093637;
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 31) {
									Class7.decodeNpcUpdate(false);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 96) {
									var5 = inBuffer.getLEShort();
									var6 = inBuffer.getLEInt();
									var109 = Class94.getWidget(var6);
									if (var5 != var109.anInt1162 * 467073769 || var5 == -1) {
										var109.anInt1162 = var5 * 1986493785;
										var109.anInt1194 = 0;
										var109.anInt1126 = 0;
										Class68.method326(var109);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								Widget var141;
								if (793368497 * frameId == 126) {
									var5 = inBuffer.getLEInt();
									var6 = inBuffer.getMEInt();
									InterfaceNode var169 = (InterfaceNode) interfaceNodes.get((long) var6);
									var163 = (InterfaceNode) interfaceNodes.get((long) var5);
									if (var163 != null) {
										DualNode_Sub4.method691(var163,
												var169 == null || var163.type * 226793949 != var169.type * 226793949);
									}

									if (var169 != null) {
										var169.unlink();
										interfaceNodes.put(var169, (long) var5);
									}

									var141 = Class94.getWidget(var6);
									if (var141 != null) {
										Class68.method326(var141);
									}

									var141 = Class94.getWidget(var5);
									if (var141 != null) {
										Class68.method326(var141);
										ObjectDefinition.method870(
												Widget.interfaces[var141.anInt1129 * -1536575275 >>> 16], var141, true);
									}

									if (anInt2226 * -1074177723 != -1) {
										Class65.method319(anInt2226 * -1074177723, 1);
									}

									if (GameClient.dump) System.out.println("sendInterfaceTransform(" + (var6 >> 0x10) + ", "
											+ (var6 & 0xFFFF) + ", " + (var5 >> 0x10) + ", " + (var5 & 0xFFFF) + ");");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 144) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getUShort();
									var89 = inBuffer.getInt();
									var8 = inBuffer.getUShort();
									var141 = Class94.getWidget(var89);
									if (var5 != var141.rotationX * 175924351 || 745334365 * var141.rotationZ != var8
											|| var141.modelZoom * -1472457387 != var6) {
										var141.rotationX = var5 * 1055873919;
										var141.rotationZ = -478470667 * var8;
										var141.modelZoom = var6 * -438091779;
										Class68.method326(var141);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								long var56;
								if (frameId * 793368497 == 214) {
									var94 = inBuffer.getString();
									var50 = inBuffer.getLong();
									var52 = (long) inBuffer.getUShort();
									var48 = (long) inBuffer.getMedium();
									Class73[] var118 = new Class73[] { Class73.aClass73_612, Class73.aClass73_607,
											Class73.aClass73_613, Class73.aClass73_608, Class73.aClass73_609 };
									Class73 var136 = (Class73) Class30.method189(var118, inBuffer.getUByte());
									var56 = (var52 << 32) + var48;
									boolean var156 = false;

									for (var17 = 0; var17 < 100; ++var17) {
										if (aLongArray2186[var17] == var56) {
											var156 = true;
											break;
										}
									}

									if (var136.aBool615 && World.method485(var94)) {
										var156 = true;
									}

									if (!var156 && 198136383 * anInt2183 == 0) {
										aLongArray2186[1926465309 * anInt2187] = var56;
										anInt2187 = -1205898443 * ((1 + anInt2187 * 1926465309) % 100);
										BitBuf var155 = inBuffer;

										String var158;
										try {
											var145 = var155.getUSmart();
											if (var145 > 32767) {
												var145 = 32767;
											}

											byte[] var164 = new byte[var145];
											var155.position += Class120.huffman.decompress(var155.payload,
													314639891 * var155.position, var164, 0, var145) * -184175589;
											String var168 = LandscapeTile.getString(var164, 0, var145);
											var158 = var168;
										} catch (Exception var73) {
											var158 = "Cabbage";
										}

										var158 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var158));
										if (var136.anInt606 * -2127218069 != -1) {
											DualNode_Sub1
													.method658(9,
															Class41.method223(-2127218069 * var136.anInt606,
																	(short) -12678) + var94,
															var158, DualNode_Sub9.method716(var50));
										} else {
											DualNode_Sub1.method658(9, var94, var158, DualNode_Sub9.method716(var50));
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 90) {
									ByteBuf.method644();
									weight = inBuffer.getShort() * 135408337;
									anInt2155 = anInt2151 * 434653173;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 180) {
									anInt2075 = inBuffer.getUByte() * -2000049339;
									if (anInt2075 * 314519437 == 1) {
										anInt2021 = inBuffer.getUShort() * 1604167195;
									}

									if (anInt2075 * 314519437 >= 2 && 314519437 * anInt2075 <= 6) {
										if (anInt2075 * 314519437 == 2) {
											anInt2116 = 578314048;
											anInt2025 = -340788800;
										}

										if (314519437 * anInt2075 == 3) {
											anInt2116 = 0;
											anInt2025 = -340788800;
										}

										if (314519437 * anInt2075 == 4) {
											anInt2116 = 1156628096;
											anInt2025 = -340788800;
										}

										if (314519437 * anInt2075 == 5) {
											anInt2116 = 578314048;
											anInt2025 = 0;
										}

										if (314519437 * anInt2075 == 6) {
											anInt2116 = 578314048;
											anInt2025 = -681577600;
										}

										anInt2075 = 294868618;
										hintArrowX = inBuffer.getUShort() * -918335991;
										hintArrowY = inBuffer.getUShort() * -1217004367;
										anInt2032 = inBuffer.getUByte() * -537897385;
									}

									if (anInt2075 * 314519437 == 10) {
										anInt2158 = inBuffer.getUShort() * 136867453;
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 183) {
									friendListSize = -593871665;
									anInt2114 = -712636309 * anInt2151;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 237) {
									ByteBuf.method644();
									var5 = inBuffer.getInt();
									var6 = inBuffer.getUByteS();
									var89 = inBuffer.getUByteC();
									currentLevels[var89] = var5;
									levels[var89] = var6;
									experiences[var89] = 1;

									for (var8 = 0; var8 < 98; ++var8) {
										if (var5 >= Class65.anIntArray582[var8]) {
											experiences[var89] = var8 + 2;
										}
									}

									if (GameClient.dump) System.out.println("sendSkills(" + var89 + ", " + var6 + ", " + var5 + ");");

									anIntArray2156[(anInt2157 += -245523573) * -549276637 - 1 & 31] = var89;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								String var135;
								if (793368497 * frameId == 110) {
									var5 = inBuffer.getInt();
									var135 = inBuffer.getString();
									var109 = Class94.getWidget(var5);
									if (!var135.equals(var109.text)) {
										var109.text = var135;
										Class68.method326(var109);
									}

									if (GameClient.dump) System.out.println("sendInterfaceText(" + (var5 >> 0x10) + ", " + (var5 & 0xFFFF)
											+ ", \"" + var135 + "\");");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								String var113;
								boolean var124;
								String var138;
								if (frameId * 793368497 == 107) {
									while (inBuffer.position * 314639891 < 371800591 * frameSize) {
										var5 = inBuffer.getUByte();
										var124 = (var5 & 1) == 1;
										var113 = inBuffer.getString();
										var138 = inBuffer.getString();
										inBuffer.getString();

										for (var9 = 0; var9 < 1820302153 * anInt2229; ++var9) {
											IgnoredPlayer var125 = ignoredPlayers[var9];
											if (var124) {
												if (var138.equals(var125.displayName)) {
													var125.displayName = var113;
													var125.previousName = var138;
													var113 = null;
													break;
												}
											} else if (var113.equals(var125.displayName)) {
												var125.displayName = var113;
												var125.previousName = var138;
												var113 = null;
												break;
											}
										}

										if (var113 != null && anInt2229 * 1820302153 < 400) {
											IgnoredPlayer var140 = new IgnoredPlayer();
											ignoredPlayers[anInt2229 * 1820302153] = var140;
											var140.displayName = var113;
											var140.previousName = var138;
											anInt2229 += -334739719;
										}
									}

									anInt2114 = anInt2151 * -712636309;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 242) {
									DualNode_Sub2.decodeClassVerifier(inBuffer, frameSize * 371800591, -1457674298);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 87) {
									var5 = inBuffer.getULEShortA();
									var6 = inBuffer.getIMEInt();
									var109 = Class94.getWidget(var6);
									if (var109.modelType * -768837131 != 1 || var5 != 686060225 * var109.modelId) {
										var109.modelType = -376460707;
										var109.modelId = var5 * -541123263;
										Class68.method326(var109);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 217) {
									var6 = inBuffer.getUByte();
									Class51[] var159 = Class41.method225(94483834);
									var8 = 0;

									Class51 var170;
									while (true) {
										if (var8 >= var159.length) {
											var170 = null;
											break;
										}

										Class51 var133 = var159[var8];
										if (var133.anInt525 * -1916029001 == var6) {
											var170 = var133;
											break;
										}

										++var8;
									}

									Class28.aClass51_320 = var170;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 103) {
									var5 = inBuffer.getULEShortA();
									if (var5 == '\uffff') {
										var5 = -1;
									}

									Class22.method158(var5);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 135) {
									var5 = inBuffer.getUShortA();
									if (var5 == '\uffff') {
										var5 = -1;
									}

									var6 = inBuffer.getMEMedium();
									if (anInt2201 * -1994948003 != 0 && var5 != -1) {
										Class69.method328(PlayerConfig.aClass87_Sub1_535, var5, 0,
												anInt2201 * -1994948003, false);
										aBool2191 = true;
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 239) {
									Class7.decodeMapRegion(false);
									inBuffer.getHeader();
									var5 = inBuffer.getUShort();
									Class26.decodePlayerUpdate(inBuffer, var5);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 143) {
									var5 = inBuffer.getInt();
									Class20_Sub1.aClass61_1215 = IsaacRandom.aClass63_102.method308(var5);

									if (GameClient.dump) System.out.println("sendIP(\"" + Class63.method315(var5) + "\");");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								boolean var108;
								if (793368497 * frameId == 84) {
									anInt2159 = anInt2151 * -942030581;
									if (371800591 * frameSize == 0) {
										clanChatOwner = null;
										clanChatName = null;
										Class86.clanChatSize = 0;
										InterfaceNode.clanMates = null;
										frameId = -726667601;
										var85 = true;
									} else {
										clanChatName = inBuffer.getString();
										long var58 = inBuffer.getLong();
										var52 = var58;
										if (var58 > 0L && var58 < 6582952005840035281L) {
											if (0L == var58 % 37L) {
												var113 = null;
											} else {
												var10 = 0;

												for (long var60 = var58; 0L != var60; var60 /= 37L) {
													++var10;
												}

												StringBuilder var130 = new StringBuilder(var10);

												while (0L != var52) {
													var56 = var52;
													var52 /= 37L;
													var130.append(Class91.aCharArray723[(int) (var56 - 37L * var52)]);
												}

												var113 = var130.reverse().toString();
											}
										} else {
											var113 = null;
										}

										clanChatOwner = var113;
										Class43.aByte451 = inBuffer.getByte();
										var10 = inBuffer.getUByte();
										if (var10 == 255) {
											frameId = -726667601;
											var85 = true;
										} else {
											Class86.clanChatSize = -1124093015 * var10;
											ClanMate[] var122 = new ClanMate[100];

											for (var12 = 0; var12 < -1304125287 * Class86.clanChatSize; ++var12) {
												var122[var12] = new ClanMate();
												var122[var12].displayName = inBuffer.getString();
												var122[var12].aString1223 = DualNode_Sub11.method728(
														var122[var12].displayName, Class48_Sub1.aClass124_1297);
												var122[var12].world = inBuffer.getUShort() * 967496063;
												var122[var12].rank = inBuffer.getByte();
												inBuffer.getString();
												if (var122[var12].displayName.equals(Class68.myPlayer.name)) {
													clanChatRank = var122[var12].rank;
												}
											}

											var108 = false;
											var14 = Class86.clanChatSize * -1304125287;

											while (var14 > 0) {
												var108 = true;
												--var14;

												for (var114 = 0; var114 < var14; ++var114) {
													if (var122[var114].aString1223
															.compareTo(var122[var114 + 1].aString1223) > 0) {
														ClanMate var134 = var122[var114];
														var122[var114] = var122[1 + var114];
														var122[var114 + 1] = var134;
														var108 = false;
													}
												}

												if (var108) {
													break;
												}
											}

											InterfaceNode.clanMates = var122;
											frameId = -726667601;
											var85 = true;
										}
									}
									break label3092;
								}

								if (frameId * 793368497 == 208) {
									var5 = inBuffer.getULEShort();
									anInt2226 = -605073011 * var5;
									ItemTable.method647(false);
									Class28.method173(var5);
									Class24.method160(-1074177723 * anInt2226);

									for (var6 = 0; var6 < 100; ++var6) {
										aBoolArray2118[var6] = true;
									}

									if (GameClient.dump) System.out.println("sendRootInterface(" + var5 + ");");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 132) {
									Player.anInt1988 = inBuffer.getUByteS() * 1689579987;
									InterfaceNode.anInt1400 = inBuffer.getUByte() * -958823289;

									for (var5 = 1413480759
											* InterfaceNode.anInt1400; var5 < InterfaceNode.anInt1400 * 1413480759
													+ 8; ++var5) {
										for (var6 = 40472155 * Player.anInt1988; var6 < Player.anInt1988 * 40472155
												+ 8; ++var6) {
											if (groundItemDeque[-747958745
													* InterfaceNode.floorLevel][var5][var6] != null) {
												groundItemDeque[InterfaceNode.floorLevel
														* -747958745][var5][var6] = null;
												Class32.method195(var5, var6);
											}
										}
									}

									for (Node_Sub8 var157 = (Node_Sub8) aDeque2193
											.method471(); var157 != null; var157 = (Node_Sub8) aDeque2193.method473()) {
										if (var157.anInt1300 * -1096801001 >= 1413480759 * InterfaceNode.anInt1400
												&& -1096801001 * var157.anInt1300 < 8
														+ InterfaceNode.anInt1400 * 1413480759
												&& -127960105 * var157.anInt1312 >= 40472155 * Player.anInt1988
												&& -127960105 * var157.anInt1312 < Player.anInt1988 * 40472155 + 8
												&& InterfaceNode.floorLevel * -747958745 == var157.anInt1302
														* 584375567) {
											var157.anInt1311 = 0;
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 151) {
									Class81.logout();
									frameId = -726667601;
									var85 = false;
									break label3092;
								}

								if (793368497 * frameId == 199) {
									var94 = inBuffer.getString();
									BitBuf var152 = inBuffer;

									try {
										var9 = var152.getUSmart();
										if (var9 > 32767) {
											var9 = 32767;
										}

										byte[] var116 = new byte[var9];
										var152.position += Class120.huffman.decompress(var152.payload,
												var152.position * 314639891, var116, 0, var9) * -184175589;
										String var119 = LandscapeTile.getString(var116, 0, var9);
										var138 = var119;
									} catch (Exception var72) {
										var138 = "Cabbage";
									}

									var138 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var138));
									Class75.method334(6, var94, var138);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 142) {
									var5 = inBuffer.getLEInt();
									var124 = inBuffer.getUByteA() == 1;
									var109 = Class94.getWidget(var5);
									if (var109.hidden != var124) {
										var109.hidden = var124;
										Class68.method326(var109);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 29) {
									var5 = inBuffer.getMEInt();
									var121 = Class94.getWidget(var5);
									var121.modelType = -1129382121;
									var121.modelId = Class68.myPlayer.config.method269() * -541123263;
									Class68.method326(var121);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 244) {
									var5 = inBuffer.getInt();
									InterfaceNode var160 = (InterfaceNode) interfaceNodes.get((long) var5);
									if (var160 != null) {
										DualNode_Sub4.method691(var160, true);
									}

									if (aWidget2135 != null) {
										Class68.method326(aWidget2135);
										aWidget2135 = null;
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 216) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getUShort();
									if (var5 < -70000) {
										var6 += '\u8000';
									}

									if (var5 >= 0) {
										var109 = Class94.getWidget(var5);
									} else {
										var109 = null;
									}

									for (; 314639891 * inBuffer.position < 371800591 * frameSize; ItemDefinition
											.method820(var6, var8, var9 - 1, var10)) {
										var8 = inBuffer.getUSmart();
										var9 = inBuffer.getUShort();
										var10 = 0;
										if (var9 != 0) {
											var10 = inBuffer.getUByte();
											if (var10 == 255) {
												var10 = inBuffer.getInt();
											}
										}

										if (var109 != null && var8 >= 0 && var8 < var109.itemIds.length) {
											var109.itemIds[var8] = var9;
											var109.itemQuantities[var8] = var10;
										}
									}

									if (var109 != null) {
										Class68.method326(var109);
									}

									ByteBuf.method644();
									anIntArray2154[(anInt2079 += -1121866621) * -1512766933 - 1 & 31] = var6 & 32767;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 41) {
									Player.anInt1988 = inBuffer.getUByteC() * 1689579987;
									InterfaceNode.anInt1400 = inBuffer.getUByteC() * -958823289;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 82) {
									var94 = inBuffer.getString();
									var6 = inBuffer.getUByteA();
									var89 = inBuffer.getUByteC();
									if (var89 >= 1 && var89 <= 8) {
										if (var94.equalsIgnoreCase("null")) {
											var94 = null;
										}

										playerActions[var89 - 1] = var94;
										aBoolArray2109[var89 - 1] = var6 == 0;
									}

									if (GameClient.dump) System.out.println("sendPlayerAction(" + var89 + ", \"" + var94 + "\", " + (var89 == 0) + ");");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 137) {
									for (var5 = 0; var5 < -1248800389 * DualNode_Sub11.anInt1547; ++var5) {
										DualNode_Sub11 var148 = Class37.method209(var5);
										if (var148 != null) {
											Class94.engineVars[var5] = 0;
											Class94.tempVars[var5] = 0;
										}
									}

									if (GameClient.dump) System.out.println("sendVarpReset();");

									ByteBuf.method644();
									anInt2153 += -1888507616;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 202) {
									if (-1074177723 * anInt2226 != -1) {
										Class65.method319(-1074177723 * anInt2226, 0);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 160) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getUShort();
									if (var5 < -70000) {
										var6 += '\u8000';
									}

									if (var5 >= 0) {
										var109 = Class94.getWidget(var5);
									} else {
										var109 = null;
									}

									if (var109 != null) {
										for (var8 = 0; var8 < var109.itemIds.length; ++var8) {
											var109.itemIds[var8] = 0;
											var109.itemQuantities[var8] = 0;
										}
									}

									GameCanvas.method884(var6);
									var8 = inBuffer.getUShort();

									for (var9 = 0; var9 < var8; ++var9) {
										var10 = inBuffer.getULEShortA();
										var11 = inBuffer.getUByte();
										if (var11 == 255) {
											var11 = inBuffer.getMEInt();
										}

										if (var109 != null && var9 < var109.itemIds.length) {
											var109.itemIds[var9] = var10;
											var109.itemQuantities[var9] = var11;
										}

										ItemDefinition.method820(var6, var9, var10 - 1, var11);
									}

									if (var109 != null) {
										Class68.method326(var109);
									}

									ByteBuf.method644();
									anIntArray2154[(anInt2079 += -1121866621) * -1512766933 - 1 & 31] = var6 & 32767;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 9) {
									var94 = inBuffer.getString();
									aString2013 = var94;

									try {
										var135 = aClient2005.getParameter(Parameters.aParameters60.key);
										var113 = aClient2005.getParameter(Parameters.aParameters73.key);
										var138 = var135 + "settings=" + var94 + "; version=1; path=/; domain=" + var113;
										if (var94.length() == 0) {
											var138 = var138 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
										} else {
											var138 = var138 + "; Expires="
													+ Class51.method255(Node_Sub5.currentTimeMs() + 94608000000L)
													+ "; Max-Age=" + 94608000L;
										}

										Client var117 = aClient2005;
										String var102 = "document.cookie=\"" + var138 + "\"";
										JSObject.getWindow(var117).eval(var102);
									} catch (Throwable var71) {
										;
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 117) {
									aBool2046 = true;
									BoundaryDecorationStub.anInt216 = inBuffer.getUByte() * -1737876805;
									Class26.anInt310 = inBuffer.getUByte() * -1608345747;
									Class3.anInt94 = inBuffer.getUShort() * 1185326837;
									ObjectDefinition.anInt1695 = inBuffer.getUByte() * 1146873531;
									RuneScript.anInt1722 = inBuffer.getUByte() * -714496409;
									if (-2101471913 * RuneScript.anInt1722 >= 100) {
										Projectile.cameraX = -910433920 * BoundaryDecorationStub.anInt216 + -401449920;
										Class72.cameraY = -1084622464 * Class26.anInt310 + 1463606720;
										FriendedPlayer.cameraZ = (NpcDefinition.method802(
												Projectile.cameraX * 282154897, -324676025 * Class72.cameraY,
												InterfaceNode.floorLevel * -747958745) - 3036509 * Class3.anInt94)
												* -1022442815;
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 43) {
									var5 = inBuffer.getUByte();
									var6 = inBuffer.getUByte();
									var89 = inBuffer.getUByte();
									var8 = inBuffer.getUByte();
									aBoolArray2033[var5] = true;
									anIntArray2212[var5] = var6;
									anIntArray2213[var5] = var89;
									anIntArray2216[var5] = var8;
									anIntArray2215[var5] = 0;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								boolean var97;
								if (793368497 * frameId == 165) {
									while (inBuffer.position * 314639891 < frameSize * 371800591) {
										var126 = inBuffer.getUByte() == 1;
										var135 = inBuffer.getString();
										var113 = inBuffer.getString();
										var8 = inBuffer.getUShort();
										var9 = inBuffer.getUByte();
										var10 = inBuffer.getUByte();
										boolean var107 = (var10 & 2) != 0;
										var108 = (var10 & 1) != 0;
										if (var8 > 0) {
											inBuffer.getString();
											inBuffer.getUByte();
											inBuffer.getInt();
										}

										inBuffer.getString();

										for (var13 = 0; var13 < -1616775607 * anInt2184; ++var13) {
											FriendedPlayer var128 = friendedPlayers[var13];
											if (!var126) {
												if (var135.equals(var128.displayName)) {
													if (-698428043 * var128.world != var8) {
														boolean var144 = true;

														for (Class96_Sub1 var153 = (Class96_Sub1) aClass102_2228
																.method416(); var153 != null; var153 = (Class96_Sub1) aClass102_2228
																		.method418()) {
															if (var153.aString1203.equals(var135)) {
																if (var8 != 0 && var153.aShort1205 == 0) {
																	var153.method411();
																	var144 = false;
																} else if (var8 == 0 && var153.aShort1205 != 0) {
																	var153.method411();
																	var144 = false;
																}
															}
														}

														if (var144) {
															aClass102_2228.method417(new Class96_Sub1(var135, var8));
														}

														var128.world = 590451421 * var8;
													}

													var128.previousName = var113;
													var128.anInt737 = var9 * 882807583;
													var128.aBool736 = var107;
													var128.aBool738 = var108;
													var135 = null;
													break;
												}
											} else if (var113.equals(var128.displayName)) {
												var128.displayName = var135;
												var128.previousName = var113;
												var135 = null;
												break;
											}
										}

										if (var135 != null && anInt2184 * -1616775607 < 400) {
											FriendedPlayer var129 = new FriendedPlayer();
											friendedPlayers[anInt2184 * -1616775607] = var129;
											var129.displayName = var135;
											var129.previousName = var113;
											var129.world = var8 * 590451421;
											var129.anInt737 = var9 * 882807583;
											var129.aBool736 = var107;
											var129.aBool738 = var108;
											anInt2184 += -1013982215;
										}
									}

									friendListSize = -1187743330;
									anInt2114 = -712636309 * anInt2151;
									var126 = false;
									var6 = -1616775607 * anInt2184;

									while (var6 > 0) {
										var126 = true;
										--var6;

										for (var89 = 0; var89 < var6; ++var89) {
											var97 = false;
											FriendedPlayer var112 = friendedPlayers[var89];
											FriendedPlayer var100 = friendedPlayers[var89 + 1];
											if (var112.world * -698428043 != myWorld * -1631311031
													&& -698428043 * var100.world == -1631311031 * myWorld) {
												var97 = true;
											}

											if (!var97 && -698428043 * var112.world == 0
													&& -698428043 * var100.world != 0) {
												var97 = true;
											}

											if (!var97 && !var112.aBool736 && var100.aBool736) {
												var97 = true;
											}

											if (!var97 && !var112.aBool738 && var100.aBool738) {
												var97 = true;
											}

											if (var97) {
												FriendedPlayer var111 = friendedPlayers[var89];
												friendedPlayers[var89] = friendedPlayers[var89 + 1];
												friendedPlayers[var89 + 1] = var111;
												var126 = false;
											}
										}

										if (var126) {
											break;
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 0) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getUShort();
									var89 = inBuffer.getInt();
									var105 = Class94.getWidget(var89);
									var105.anInt1149 = -103301195 * (var6 + (var5 << 16));
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 153) {
									anInt2200 = inBuffer.getUByte() * 583418197;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 122) {
									var5 = inBuffer.getIMEInt();
									var6 = inBuffer.getShortA();
									var89 = inBuffer.getLEShortA();
									var105 = Class94.getWidget(var5);
									if (-459849887 * var105.anInt1134 != var6 || var89 != 538516377 * var105.anInt1185
											|| var105.anInt1132 * -1186475957 != 0
											|| -306698303 * var105.anInt1122 != 0) {
										var105.anInt1134 = 10986657 * var6;
										var105.anInt1185 = -720369495 * var89;
										var105.anInt1132 = 0;
										var105.anInt1122 = 0;
										Class68.method326(var105);
										Player.method1048(var105);
										if (-1305917269 * var105.type == 0) {
											ObjectDefinition.method870(Widget.interfaces[var5 >> 16], var105, false);
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 177) {
									ByteBuf.method644();
									energy = inBuffer.getUByte() * -84367693;
									anInt2155 = anInt2151 * 434653173;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 116) {
									var94 = inBuffer.getString();
									var6 = inBuffer.getUShort();
									byte var120 = inBuffer.getByte();
									var97 = false;
									if (var120 == -128) {
										var97 = true;
									}

									if (var97) {
										if (-1304125287 * Class86.clanChatSize == 0) {
											frameId = -726667601;
											var85 = true;
											break label3092;
										}

										boolean var103 = false;

										for (var9 = 0; var9 < Class86.clanChatSize * -1304125287
												&& (!InterfaceNode.clanMates[var9].displayName.equals(var94)
														|| var6 != InterfaceNode.clanMates[var9].world
																* 1300426367); ++var9) {
											;
										}

										if (var9 < Class86.clanChatSize * -1304125287) {
											while (var9 < -1304125287 * Class86.clanChatSize - 1) {
												InterfaceNode.clanMates[var9] = InterfaceNode.clanMates[1 + var9];
												++var9;
											}

											Class86.clanChatSize -= -1124093015;
											InterfaceNode.clanMates[Class86.clanChatSize * -1304125287] = null;
										}
									} else {
										inBuffer.getString();
										ClanMate var110 = new ClanMate();
										var110.displayName = var94;
										var110.aString1223 = DualNode_Sub11.method728(var110.displayName,
												Class48_Sub1.aClass124_1297);
										var110.world = 967496063 * var6;
										var110.rank = var120;

										for (var10 = Class86.clanChatSize * -1304125287 - 1; var10 >= 0; --var10) {
											var11 = InterfaceNode.clanMates[var10].aString1223
													.compareTo(var110.aString1223);
											if (var11 == 0) {
												InterfaceNode.clanMates[var10].world = 967496063 * var6;
												InterfaceNode.clanMates[var10].rank = var120;
												if (var94.equals(Class68.myPlayer.name)) {
													clanChatRank = var120;
												}

												anInt2159 = -942030581 * anInt2151;
												frameId = -726667601;
												var85 = true;
												break label3092;
											}

											if (var11 < 0) {
												break;
											}
										}

										if (-1304125287 * Class86.clanChatSize >= InterfaceNode.clanMates.length) {
											frameId = -726667601;
											var85 = true;
											break label3092;
										}

										for (var11 = Class86.clanChatSize * -1304125287 - 1; var11 > var10; --var11) {
											InterfaceNode.clanMates[var11 + 1] = InterfaceNode.clanMates[var11];
										}

										if (-1304125287 * Class86.clanChatSize == 0) {
											InterfaceNode.clanMates = new ClanMate[100];
										}

										InterfaceNode.clanMates[1 + var10] = var110;
										Class86.clanChatSize += -1124093015;
										if (var94.equals(Class68.myPlayer.name)) {
											clanChatRank = var120;
										}
									}

									anInt2159 = -942030581 * anInt2151;
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 156) {
									aBool2046 = false;

									for (var5 = 0; var5 < 5; ++var5) {
										aBoolArray2033[var5] = false;
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 19) {
									for (var5 = 0; var5 < Class94.tempVars.length; ++var5) {
										if (Class94.tempVars[var5] != Class94.engineVars[var5]) {
											Class94.tempVars[var5] = Class94.engineVars[var5];
											World.method484(var5);
											anIntArray2152[(anInt2153 += 1551596873) * -729938695 - 1 & 31] = var5;
										}
									}

									if (GameClient.dump) System.out.println("sendVarpRecache();");

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 145) {
									var5 = inBuffer.getUSmart();
									var124 = inBuffer.getUByte() == 1;
									var113 = "";
									var97 = false;
									if (var124) {
										var113 = inBuffer.getString();
										if (World.method485(var113)) {
											var97 = true;
										}
									}

									String var101 = inBuffer.getString();
									if (!var97) {
										Class75.method334(var5, var113, var101);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 185) {
									var5 = inBuffer.getInt();
									var121 = Class94.getWidget(var5);

									for (var89 = 0; var89 < var121.itemIds.length; ++var89) {
										var121.itemIds[var89] = -1;
										var121.itemIds[var89] = 0;
									}

									Class68.method326(var121);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 62) {
									World var104 = new World();
									var104.domain = inBuffer.getString();
									var104.id = inBuffer.getUShort() * -430891615;
									var6 = inBuffer.getInt();
									var104.flags = 1825398059 * var6;
									Node_Sub8.method550(45);
									Class31.gameConnection.shutdown();
									Class31.gameConnection = null;
									Class88.setWorld(var104);
									frameId = -726667601;
									var85 = false;
									break label3092;
								}

								if (793368497 * frameId == 35) {
									Class7.decodeMapRegion(true);
									inBuffer.getHeader();
									var5 = inBuffer.getUShort();
									Class26.decodePlayerUpdate(inBuffer, var5);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 181) {
									Class7.decodeNpcUpdate(true);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 172) {
									var5 = inBuffer.getUShort();
									var6 = inBuffer.getInt();
									var109 = Class94.getWidget(var6);
									if (var109.modelType * -768837131 != 2 || var5 != var109.modelId * 686060225) {
										var109.modelType = -752921414;
										var109.modelId = -541123263 * var5;
										Class68.method326(var109);
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 169) {
									Class26.decodePlayerUpdate(inBuffer, 371800591 * frameSize);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 4) {
									inBuffer.position += -861949196;
									if (inBuffer.checkCrc()) {
										BitBuf var98 = inBuffer;
										var6 = inBuffer.position * 314639891 - 28;
										if (Class75.randomDat != null) {
											try {
												Class75.randomDat.seek(0L);
												Class75.randomDat.write(var98.payload, var6, 24);
											} catch (Exception var70) {
												;
											}
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (793368497 * frameId == 222) {
									for (var5 = 0; var5 < playerArray.length; ++var5) {
										if (playerArray[var5] != null) {
											playerArray[var5].animation = 1587034171;
										}
									}

									for (var5 = 0; var5 < npcArray.length; ++var5) {
										if (npcArray[var5] != null) {
											npcArray[var5].animation = 1587034171;
										}
									}

									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								if (frameId * 793368497 == 68) {
									var5 = inBuffer.getInt();
									var6 = inBuffer.getInt();
									if (Class36.aGarbageCollectorMXBean400 == null
											|| !Class36.aGarbageCollectorMXBean400.isValid()) {
										try {
											Iterator var106 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

											while (var106.hasNext()) {
												GarbageCollectorMXBean var96 = (GarbageCollectorMXBean) var106.next();
												if (var96.isValid()) {
													Class36.aGarbageCollectorMXBean400 = var96;
													aLong2126 = -3199879388585765537L;
													aLong2232 = -2086566510266153657L;
												}
											}
										} catch (Throwable var77) {
											;
										}
									}

									long var62 = Node_Sub5.currentTimeMs();
									var9 = -1;
									if (Class36.aGarbageCollectorMXBean400 != null) {
										var48 = Class36.aGarbageCollectorMXBean400.getCollectionTime();
										if (-1L != 229038749475924873L * aLong2232) {
											var54 = var48 - 229038749475924873L * aLong2232;
											var56 = var62 - aLong2126 * 6918662072055282017L;
											if (var56 != 0L) {
												var9 = (int) (100L * var54 / var56);
											}
										}

										aLong2232 = 2086566510266153657L * var48;
										aLong2126 = var62 * 3199879388585765537L;
									}

									outBuffer.putHeader(230);
									outBuffer.putByteC(anInt1976 * 305420995);
									outBuffer.putByteC(var9);
									outBuffer.putLEInt(var5);
									outBuffer.putMEInt(var6);
									frameId = -726667601;
									var85 = true;
									break label3092;
								}

								Class79.method345("" + frameId * 793368497 + Class35.aString387
										+ secondLastFrameId * -1475322259 + Class35.aString387
										+ thridLastFrameId * 385590311 + Class35.aString387 + frameSize * 371800591,
										(Throwable) null);
								Class81.logout();
							} catch (IOException var78) {
								Class81.method361();
							} catch (Exception var79) {
								var94 = "" + 793368497 * frameId + Class35.aString387 + secondLastFrameId * -1475322259
										+ Class35.aString387 + 385590311 * thridLastFrameId + Class35.aString387
										+ frameSize * 371800591 + Class35.aString387
										+ (Class68.myPlayer.anIntArray1945[0] + Node_Sub10.regionBaseX * 1426698711)
										+ Class35.aString387
										+ (714823515 * Class28.regionBaseY + Class68.myPlayer.anIntArray1955[0])
										+ Class35.aString387;

								for (var6 = 0; var6 < 371800591 * frameSize && var6 < 50; ++var6) {
									var94 = var94 + inBuffer.payload[var6] + Class35.aString387;
								}

								Class79.method345(var94, var79);
								Class81.logout();
							}

							var85 = true;
						}
					}

					if (!var85) {
						break;
					}
				}

				if (846055547 * anInt2113 == 30) {
					while (GraphicsStub.method936(-504055230)) {
						outBuffer.putHeader(54);
						outBuffer.putByte(0);
						var2 = outBuffer.position * 314639891;
						BitBuf.encodeClassVerifier(outBuffer);
						outBuffer.putVarByte(outBuffer.position * 314639891 - var2);
					}

					Object var86 = Npc.aClass30_1968.anObject342;
					synchronized (var86) {
						if (aBool2006) {
							if (Class74.anInt627 * 823601801 != 0 || 598524519 * Npc.aClass30_1968.anInt338 >= 40) {
								outBuffer.putHeader(157);
								outBuffer.putByte(0);
								var3 = outBuffer.position * 314639891;
								var83 = 0;

								for (var5 = 0; var5 < Npc.aClass30_1968.anInt338 * 598524519
										&& 314639891 * outBuffer.position - var3 < 240; ++var5) {
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

									var8 = var89 + var6 * 765;
									if (Npc.aClass30_1968.anIntArray340[var5] == -1
											&& Npc.aClass30_1968.anIntArray337[var5] == -1) {
										var89 = -1;
										var6 = -1;
										var8 = 524287;
									}

									if (443707603 * anInt2017 == var89 && var6 == -2142765485 * anInt2227) {
										if (anInt2019 * 1157656041 < 2047) {
											anInt2019 += 1669020249;
										}
									} else {
										var9 = var89 - anInt2017 * 443707603;
										anInt2017 = var89 * -834705573;
										var10 = var6 - anInt2227 * -2142765485;
										anInt2227 = var6 * -1955793445;
										if (anInt2019 * 1157656041 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32
												&& var10 <= 31) {
											var9 += 32;
											var10 += 32;
											outBuffer.putShort(var10 + (var9 << 6) + (anInt2019 * 1157656041 << 12));
											anInt2019 = 0;
										} else if (1157656041 * anInt2019 < 8) {
											outBuffer.putMedium(var8 + (1157656041 * anInt2019 << 19) + 8388608);
											anInt2019 = 0;
										} else {
											outBuffer.putInt(-1073741824 + (anInt2019 * 1157656041 << 19) + var8);
											anInt2019 = 0;
										}
									}
								}

								outBuffer.putVarByte(314639891 * outBuffer.position - var3);
								if (var83 >= Npc.aClass30_1968.anInt338 * 598524519) {
									Npc.aClass30_1968.anInt338 = 0;
								} else {
									Npc.aClass30_1968.anInt338 -= var83 * -396936873;

									for (var5 = 0; var5 < Npc.aClass30_1968.anInt338 * 598524519; ++var5) {
										Npc.aClass30_1968.anIntArray337[var5] = Npc.aClass30_1968.anIntArray337[var5
												+ var83];
										Npc.aClass30_1968.anIntArray340[var5] = Npc.aClass30_1968.anIntArray340[var5
												+ var83];
									}
								}
							}
						} else {
							Npc.aClass30_1968.anInt338 = 0;
						}
					}

					if (Class74.anInt627 * 823601801 == 1 || !ClanMate.aBool1221 && Class74.anInt627 * 823601801 == 4
							|| Class74.anInt627 * 823601801 == 2) {
						long var65 = (Class74.aLong630 * -3096940007801216539L - aLong2016 * -5594866611567002005L)
								/ 50L;
						if (var65 > 4095L) {
							var65 = 4095L;
						}

						aLong2016 = -6014946799255235345L * Class74.aLong630;
						var83 = 2090526775 * Class74.anInt629;
						if (var83 < 0) {
							var83 = 0;
						} else if (var83 > 674167779 * Node_Sub9.gameHeight) {
							var83 = Node_Sub9.gameHeight * 674167779;
						}

						var5 = Class74.anInt628 * -2040065729;
						if (var5 < 0) {
							var5 = 0;
						} else if (var5 > Class34.gameWidth * -452716157) {
							var5 = -452716157 * Class34.gameWidth;
						}

						var6 = (int) var65;
						outBuffer.putHeader(253);
						outBuffer.putShort((var6 << 1) + (823601801 * Class74.anInt627 == 2 ? 1 : 0));
						outBuffer.putShort(var5);
						outBuffer.putShort(var83);
					}

					if (Class71.anInt602 * 1701596051 > 0) {
						outBuffer.putHeader(251);
						outBuffer.putShort(0);
						var2 = outBuffer.position * 314639891;
						long var67 = Node_Sub5.currentTimeMs();

						for (var5 = 0; var5 < 1701596051 * Class71.anInt602; ++var5) {
							var50 = var67 - aLong2030 * -7993424411696623387L;
							if (var50 > 16777215L) {
								var50 = 16777215L;
							}

							aLong2030 = -8084475441026814739L * var67;
							outBuffer.putMEMedium((int) var50);
							outBuffer.putByteC(Class71.anIntArray592[var5]);
						}

						outBuffer.putVarShort(314639891 * outBuffer.position - var2);
					}

					if (1957286053 * anInt2080 > 0) {
						anInt2080 -= 716281645;
					}

					if (Class71.aBoolArray593[96] || Class71.aBoolArray593[97] || Class71.aBoolArray593[98]
							|| Class71.aBoolArray593[99]) {
						aBool2081 = true;
					}

					if (aBool2081 && anInt2080 * 1957286053 <= 0) {
						anInt2080 = 1440731012;
						aBool2081 = false;
						outBuffer.putHeader(153);
						outBuffer.putLEShortA(anInt2051 * -1992036739);
						outBuffer.putLEShort(minimapRotation * -1916997753);
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

					if (InterfaceNode.floorLevel * -747958745 != anInt2194 * -1331355705) {
						anInt2194 = 1960926881 * InterfaceNode.floorLevel;
						var2 = InterfaceNode.floorLevel * -747958745;
						int[] var174 = RuneScript.minimapSprite.pixels;
						var83 = var174.length;

						for (var5 = 0; var5 < var83; ++var5) {
							var174[var5] = 0;
						}

						for (var5 = 1; var5 < 103; ++var5) {
							var6 = (103 - var5) * 2048 + 24628;

							for (var89 = 1; var89 < 103; ++var89) {
								if ((Class39.renderRules[var2][var89][var5] & 24) == 0) {
									InterfaceNode.landscape.method36(var174, var6, 512, var2, var89, var5);
								}

								if (var2 < 3 && (Class39.renderRules[1 + var2][var89][var5] & 8) != 0) {
									InterfaceNode.landscape.method36(var174, var6, 512, 1 + var2, var89, var5);
								}

								var6 += 4;
							}
						}

						var5 = (238 + (int) (Math.random() * 20.0D) - 10 << 16)
								+ (238 + (int) (Math.random() * 20.0D) - 10 << 8)
								+ (238 + (int) (Math.random() * 20.0D) - 10);
						var6 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
						RuneScript.minimapSprite.method939();

						for (var89 = 1; var89 < 103; ++var89) {
							for (var8 = 1; var8 < 103; ++var8) {
								if ((Class39.renderRules[var2][var8][var89] & 24) == 0) {
									method1055(var2, var8, var89, var5, var6);
								}

								if (var2 < 3 && (Class39.renderRules[var2 + 1][var8][var89] & 8) != 0) {
									method1055(1 + var2, var8, var89, var5, var6);
								}
							}
						}

						anInt2195 = 0;

						for (var89 = 0; var89 < 104; ++var89) {
							for (var8 = 0; var8 < 104; ++var8) {
								var9 = InterfaceNode.landscape.method33(InterfaceNode.floorLevel * -747958745, var89,
										var8);
								if (var9 != 0) {
									var9 = var9 >> 14 & 32767;
									var10 = Class37.getObjectDefinition(var9).mapFunction * 1951420693;
									if (var10 >= 0) {
										var11 = var89;
										var12 = var8;
										if (var10 != 22 && var10 != 29 && var10 != 34 && var10 != 36 && var10 != 46
												&& var10 != 47 && var10 != 48) {
											int[][] var154 = collisionMaps[-747958745
													* InterfaceNode.floorLevel].flags;

											for (var16 = 0; var16 < 10; ++var16) {
												var17 = (int) (Math.random() * 4.0D);
												if (var17 == 0 && var11 > 0 && var11 > var89 - 3
														&& (var154[var11 - 1][var12] & 19136776) == 0) {
													--var11;
												}

												if (var17 == 1 && var11 < 103 && var11 < 3 + var89
														&& (var154[var11 + 1][var12] & 19136896) == 0) {
													++var11;
												}

												if (var17 == 2 && var12 > 0 && var12 > var8 - 3
														&& (var154[var11][var12 - 1] & 19136770) == 0) {
													--var12;
												}

												if (var17 == 3 && var12 < 103 && var12 < var8 + 3
														&& (var154[var11][1 + var12] & 19136800) == 0) {
													++var12;
												}
											}
										}

										aSpriteArray2198[-706898549 * anInt2195] = Node_Sub8.aSpriteArray1309[var10];
										anIntArray2196[-706898549 * anInt2195] = var11;
										anIntArray2197[anInt2195 * -706898549] = var12;
										anInt2195 += -1686410717;
									}
								}
							}
						}

						IndexTable.aClass20_570.method142();
					}

					if (846055547 * anInt2113 == 30) {
						for (Node_Sub8 var88 = (Node_Sub8) aDeque2193
								.method471(); var88 != null; var88 = (Node_Sub8) aDeque2193.method473()) {
							if (var88.anInt1311 * 1030491605 > 0) {
								var88.anInt1311 -= -622541955;
							}

							ObjectDefinition var175;
							if (1030491605 * var88.anInt1311 == 0) {
								if (-1525381273 * var88.anInt1304 >= 0) {
									var83 = var88.anInt1304 * -1525381273;
									var5 = -2072747651 * var88.anInt1313;
									var175 = Class37.getObjectDefinition(var83);
									if (var5 == 11) {
										var5 = 10;
									}

									if (var5 >= 5 && var5 <= 8) {
										var5 = 4;
									}

									var85 = var175.method866(var5);
									if (!var85) {
										continue;
									}
								}

								ItemPile.method454(var88.anInt1302 * 584375567, var88.anInt1303 * -1976125003,
										var88.anInt1300 * -1096801001, var88.anInt1312 * -127960105,
										var88.anInt1304 * -1525381273, var88.anInt1306 * 1621871539,
										-2072747651 * var88.anInt1313);
								var88.unlink();
							} else {
								if (var88.anInt1310 * -896271613 > 0) {
									var88.anInt1310 -= -900151381;
								}

								if (var88.anInt1310 * -896271613 == 0 && var88.anInt1300 * -1096801001 >= 1
										&& var88.anInt1312 * -127960105 >= 1 && -1096801001 * var88.anInt1300 <= 102
										&& -127960105 * var88.anInt1312 <= 102) {
									if (-1987202069 * var88.anInt1307 >= 0) {
										var83 = var88.anInt1307 * -1987202069;
										var5 = -227757021 * var88.anInt1305;
										var175 = Class37.getObjectDefinition(var83);
										if (var5 == 11) {
											var5 = 10;
										}

										if (var5 >= 5 && var5 <= 8) {
											var5 = 4;
										}

										var85 = var175.method866(var5);
										if (!var85) {
											continue;
										}
									}

									ItemPile.method454(584375567 * var88.anInt1302, var88.anInt1303 * -1976125003,
											-1096801001 * var88.anInt1300, -127960105 * var88.anInt1312,
											var88.anInt1307 * -1987202069, var88.anInt1308 * 339689559,
											var88.anInt1305 * -227757021);
									var88.anInt1310 = 900151381;
									if (-1987202069 * var88.anInt1307 == var88.anInt1304 * -1525381273
											&& -1525381273 * var88.anInt1304 == -1) {
										var88.unlink();
									} else if (-1525381273 * var88.anInt1304 == var88.anInt1307 * -1987202069
											&& 1621871539 * var88.anInt1306 == 339689559 * var88.anInt1308
											&& -2072747651 * var88.anInt1313 == var88.anInt1305 * -227757021) {
										var88.unlink();
									}
								}
							}
						}

						Class78.method344();
						anInt2041 += 1497043651;
						if (anInt2041 * -955732501 > 750) {
							Class81.method361();
						} else {
							Class83.method364();
							FriendedPlayer.method407();
							Class59.method293();
							anInt2066 += -437029491;
							if (2051359659 * cursorState != 0) {
								anInt2097 += -1836351588;
								if (179229491 * anInt2097 >= 400) {
									cursorState = 0;
								}
							}

							if (Class30.aWidget339 != null) {
								anInt2098 += 479812137;
								if (-1044454887 * anInt2098 >= 15) {
									Class68.method326(Class30.aWidget339);
									Class30.aWidget339 = null;
								}
							}

							Widget var91 = ObjectDefinition.aWidget1719;
							Widget var176 = ScriptEvent.aWidget1437;
							ObjectDefinition.aWidget1719 = null;
							ScriptEvent.aWidget1437 = null;
							aWidget2009 = null;
							aBool2148 = false;
							aBool2145 = false;
							anInt2188 = 0;

							while (Class58.method289(2023348341) && -703165807 * anInt2188 < 128) {
								if (myRights * 1520983779 >= 2 && Class71.aBoolArray593[82]
										&& Class5.anInt112 * -1989794123 == 66) {
									var94 = "";

									DualNode_Sub8 var178;
									for (Iterator var177 = Class32.aClass107_355.iterator(); var177
											.hasNext(); var94 = var94 + var178.aString1521 + ':' + var178.aString1520
													+ '\n') {
										var178 = (DualNode_Sub8) var177.next();
									}

									CacheIndex.aClipboard1329.setContents(new StringSelection(var94),
											(ClipboardOwner) null);
								} else {
									anIntArray2190[-703165807 * anInt2188] = Class5.anInt112 * -1989794123;
									anIntArray2162[-703165807 * anInt2188] = Class2.aChar80;
									anInt2188 += -1538361743;
								}
							}

							if (anInt2226 * -1074177723 != -1) {
								Class40.method222(-1074177723 * anInt2226, 0, 0, Class34.gameWidth * -452716157,
										Node_Sub9.gameHeight * 674167779, 0, 0);
							}

							anInt2151 += 44844977;

							while (true) {
								ScriptEvent var115 = (ScriptEvent) aDeque2165.method469();
								Widget var182;
								if (var115 == null) {
									while (true) {
										var115 = (ScriptEvent) aDeque2166.method469();
										if (var115 == null) {
											while (true) {
												var115 = (ScriptEvent) aDeque2164.method469();
												if (var115 == null) {
													Connection.method301();
													if (aWidget2141 != null) {
														Class68.method326(aWidget2141);
														FriendedPlayer.anInt739 += -95915169;
														if (aBool2148 && aBool2145) {
															var83 = Class74.anInt621 * -453286219;
															var5 = Class74.anInt622 * 103771565;
															var83 -= anInt2127 * -725471655;
															var5 -= 702495857 * anInt2143;
															if (var83 < anInt2146 * 1272175975) {
																var83 = anInt2146 * 1272175975;
															}

															if (var83 + aWidget2141.width
																	* 1645211541 > aWidget2142.width * 1645211541
																			+ anInt2146 * 1272175975) {
																var83 = anInt2146 * 1272175975
																		+ aWidget2142.width * 1645211541
																		- aWidget2141.width * 1645211541;
															}

															if (var5 < -765593137 * anInt2147) {
																var5 = -765593137 * anInt2147;
															}

															if (var5 + aWidget2141.height * 1227800423 > -765593137
																	* anInt2147 + aWidget2142.height * 1227800423) {
																var5 = anInt2147 * -765593137
																		+ aWidget2142.height * 1227800423
																		- 1227800423 * aWidget2141.height;
															}

															var6 = var83 - anInt2050 * -625398447;
															var89 = var5 - 1566554261 * anInt2149;
															var8 = -345684957 * aWidget2141.anInt1166;
															if (1559668895
																	* FriendedPlayer.anInt739 > aWidget2141.anInt1146
																			* 464917361
																	&& (var6 > var8 || var6 < -var8 || var89 > var8
																			|| var89 < -var8)) {
																aBool2150 = true;
															}

															var9 = -352661099 * aWidget2142.insetX
																	+ (var83 - 1272175975 * anInt2146);
															var10 = aWidget2142.insetY * -1602694527
																	+ (var5 - anInt2147 * -765593137);
															ScriptEvent var151;
															if (aWidget2141.anObjectArray1176 != null && aBool2150) {
																var151 = new ScriptEvent();
																var151.aWidget1430 = aWidget2141;
																var151.anInt1438 = var9 * 1833150263;
																var151.anInt1431 = var10 * 1385195697;
																var151.args = aWidget2141.anObjectArray1176;
																Class96_Sub1.method504(var151);
															}

															if (Class74.anInt624 * -562612321 == 0) {
																if (aBool2150) {
																	if (aWidget2141.anObjectArray1177 != null) {
																		var151 = new ScriptEvent();
																		var151.aWidget1430 = aWidget2141;
																		var151.anInt1438 = var9 * 1833150263;
																		var151.anInt1431 = 1385195697 * var10;
																		var151.aWidget1433 = aWidget2009;
																		var151.args = aWidget2141.anObjectArray1177;
																		Class96_Sub1.method504(var151);
																	}

																	if (aWidget2009 != null && DualNode_Sub11
																			.method725(aWidget2141) != null) {
																		outBuffer.putHeader(216);
																		outBuffer.putShort(
																				813479615 * aWidget2009.itemId);
																		outBuffer.putInt(
																				-1536575275 * aWidget2009.anInt1129);
																		outBuffer.putLEShortA(
																				aWidget2009.index * 2021294259);
																		outBuffer.putShortA(
																				813479615 * aWidget2141.itemId);
																		outBuffer.putMEInt(
																				-1536575275 * aWidget2141.anInt1129);
																		outBuffer.putLEShortA(
																				aWidget2141.index * 2021294259);
																	}
																} else if ((anInt2144 * 1052316233 == 1 || Class39
																		.method217(1768430155 * menuItemCount - 1))
																		&& 1768430155 * menuItemCount > 2) {
																	Class66_Sub2.method554(
																			anInt2127 * -725471655
																					+ -625398447 * anInt2050,
																			anInt2149 * 1566554261
																					+ 702495857 * anInt2143);
																} else if (menuItemCount * 1768430155 > 0) {
																	var11 = -725471655 * anInt2127
																			+ -625398447 * anInt2050;
																	var12 = 1566554261 * anInt2149
																			+ anInt2143 * 702495857;
																	Node_Sub9.method563(CacheIndex.aClass4_1333,
																			var11, var12);
																	CacheIndex.aClass4_1333 = null;
																}

																aWidget2141 = null;
															}
														} else if (FriendedPlayer.anInt739 * 1559668895 > 1) {
															aWidget2141 = null;
														}
													}

													if (DualNode_Sub1.aWidget1446 != null) {
														Class68.method326(DualNode_Sub1.aWidget1446);
														anInt2092 += -1664677949;
														if (-562612321 * Class74.anInt624 == 0) {
															if (aBool2103) {
																if (DualNode_Sub1.aWidget1446 == TileDecorationStub.aWidget838
																		&& anInt2100 * 1979905201 != anInt2124
																				* -408071259) {
																	Widget var139 = DualNode_Sub1.aWidget1446;
																	byte var183 = 0;
																	if (anInt2134 * -137828697 == 1
																			&& -179718399 * var139.contentType == 206) {
																		var183 = 1;
																	}

																	if (var139.itemIds[-408071259 * anInt2124] <= 0) {
																		var183 = 0;
																	}

																	if (Class58.method291(
																			Class30.getWidgetConfig(var139),
																			(byte) 4)) {
																		var6 = anInt2100 * 1979905201;
																		var89 = anInt2124 * -408071259;
																		var139.itemIds[var89] = var139.itemIds[var6];
																		var139.itemQuantities[var89] = var139.itemQuantities[var6];
																		var139.itemIds[var6] = -1;
																		var139.itemQuantities[var6] = 0;
																	} else if (var183 == 1) {
																		var6 = anInt2100 * 1979905201;
																		var89 = anInt2124 * -408071259;

																		while (var6 != var89) {
																			if (var6 > var89) {
																				var139.method497(var6 - 1, var6);
																				--var6;
																			} else if (var6 < var89) {
																				var139.method497(1 + var6, var6);
																				++var6;
																			}
																		}
																	} else {
																		var139.method497(anInt2124 * -408071259,
																				1979905201 * anInt2100);
																	}

																	outBuffer.putHeader(219);
																	outBuffer.putShort(anInt2124 * -408071259);
																	outBuffer.putByteC(var183);
																	outBuffer.putShortA(anInt2100 * 1979905201);
																	outBuffer.putIMEInt(
																			DualNode_Sub1.aWidget1446.anInt1129
																					* -1536575275);
																}
															} else if ((anInt2144 * 1052316233 == 1 || Class39
																	.method217(menuItemCount * 1768430155 - 1))
																	&& 1768430155 * menuItemCount > 2) {
																Class66_Sub2.method554(anInt2131 * -827759387,
																		45845103 * anInt2101);
															} else if (menuItemCount * 1768430155 > 0) {
																var83 = -827759387 * anInt2131;
																var5 = anInt2101 * 45845103;
																Node_Sub9.method563(CacheIndex.aClass4_1333, var83,
																		var5);
																CacheIndex.aClass4_1333 = null;
															}

															anInt2098 = 503154074;
															Class74.anInt627 = 0;
															DualNode_Sub1.aWidget1446 = null;
														} else if (950444267 * anInt2092 >= 5 && (-453286219
																* Class74.anInt621 > -827759387 * anInt2131 + 5
																|| Class74.anInt621
																		* -453286219 < anInt2131 * -827759387 - 5
																|| Class74.anInt622 * 103771565 > 5
																		+ 45845103 * anInt2101
																|| Class74.anInt622 * 103771565 < anInt2101 * 45845103
																		- 5)) {
															aBool2103 = true;
														}
													}

													if (Landscape.anInt53 != -1) {
														var83 = Landscape.anInt53;
														var5 = Landscape.anInt58;
														outBuffer.putHeader(12);
														outBuffer.putByte(5);
														outBuffer.putByteC(Class71.aBoolArray593[82]
																? (Class71.aBoolArray593[81] ? 2 : 1) : 0);
														outBuffer.putLEShortA(
																Node_Sub10.regionBaseX * 1426698711 + var83);
														outBuffer.putLEShort(Class28.regionBaseY * 714823515 + var5);
														Landscape.anInt53 = -1;
														anInt2095 = Class74.anInt628 * -1489075687;
														anInt2096 = -250191479 * Class74.anInt629;
														cursorState = 461086467;
														anInt2097 = 0;
														destinationX = -1943900347 * var83;
														destinationY = var5 * 317027045;
													}

													if (var91 != ObjectDefinition.aWidget1719) {
														if (var91 != null) {
															Class68.method326(var91);
														}

														if (ObjectDefinition.aWidget1719 != null) {
															Class68.method326(ObjectDefinition.aWidget1719);
														}
													}

													if (ScriptEvent.aWidget1437 != var176
															&& 1149981077 * anInt2008 == 1046829805 * anInt2117) {
														if (var176 != null) {
															Class68.method326(var176);
														}

														if (ScriptEvent.aWidget1437 != null) {
															Class68.method326(ScriptEvent.aWidget1437);
														}
													}

													if (ScriptEvent.aWidget1437 != null) {
														if (1046829805 * anInt2117 < 1149981077 * anInt2008) {
															anInt2117 += 1335169765;
															if (anInt2117 * 1046829805 == anInt2008 * 1149981077) {
																Class68.method326(ScriptEvent.aWidget1437);
															}
														}
													} else if (anInt2117 * 1046829805 > 0) {
														anInt2117 -= 1335169765;
													}

													var83 = Class68.myPlayer.strictX * 1272643751
															+ anInt2220 * 1311998203;
													var5 = -896118313 * anInt2058
															+ -1801433343 * Class68.myPlayer.strictY;
													if (-2122646045 * GPI.anInt461 - var83 < -500
															|| GPI.anInt461 * -2122646045 - var83 > 500
															|| DualNode_Sub3.anInt1476 * 1406199355 - var5 < -500
															|| 1406199355 * DualNode_Sub3.anInt1476 - var5 > 500) {
														GPI.anInt461 = var83 * -1133236277;
														DualNode_Sub3.anInt1476 = 959120115 * var5;
													}

													if (-2122646045 * GPI.anInt461 != var83) {
														GPI.anInt461 += -1133236277
																* ((var83 - GPI.anInt461 * -2122646045) / 16);
													}

													if (1406199355 * DualNode_Sub3.anInt1476 != var5) {
														DualNode_Sub3.anInt1476 += (var5
																- 1406199355 * DualNode_Sub3.anInt1476) / 16
																* 959120115;
													}

													if (Class74.anInt624 * -562612321 == 4 && ClanMate.aBool1221) {
														var6 = 103771565 * Class74.anInt622 - -1174998117 * anInt2048;
														anInt2076 = var6 * 1215960858;
														anInt2048 = 1184053907 * (var6 != -1 && var6 != 1
																? (103771565 * Class74.anInt622
																		+ -1174998117 * anInt2048) / 2
																: 103771565 * Class74.anInt622);
														var89 = 371877991 * anInt2015 - Class74.anInt621 * -453286219;
														anInt2207 = var89 * -1440533622;
														anInt2015 = (var89 != -1 && var89 != 1
																? (Class74.anInt621 * -453286219
																		+ 371877991 * anInt2015) / 2
																: -453286219 * Class74.anInt621) * -559533225;
													} else {
														if (Class71.aBoolArray593[96]) {
															anInt2207 += (-24 - anInt2207 * 206470413) / 2 * 1427216837;
														} else if (Class71.aBoolArray593[97]) {
															anInt2207 += (24 - anInt2207 * 206470413) / 2 * 1427216837;
														} else {
															anInt2207 = 1427216837 * (206470413 * anInt2207 / 2);
														}

														if (Class71.aBoolArray593[98]) {
															anInt2076 += 607980429
																	* ((12 - -1100927163 * anInt2076) / 2);
														} else if (Class71.aBoolArray593[99]) {
															anInt2076 += 607980429
																	* ((-12 - anInt2076 * -1100927163) / 2);
														} else {
															anInt2076 = 607980429 * (anInt2076 * -1100927163 / 2);
														}

														anInt2048 = Class74.anInt622 * -1804850089;
														anInt2015 = 1984165507 * Class74.anInt621;
													}

													minimapRotation = (minimapRotation * -1916997753
															+ 206470413 * anInt2207 / 2 & 2047) * -571365833;
													anInt2051 += -1100927163 * anInt2076 / 2 * 1871674069;
													if (anInt2051 * -1992036739 < 128) {
														anInt2051 = -943887744;
													}

													if (anInt2051 * -1992036739 > 383) {
														anInt2051 = -408370005;
													}

													var6 = GPI.anInt461 * -2122646045 >> 7;
													var89 = 1406199355 * DualNode_Sub3.anInt1476 >> 7;
													var8 = NpcDefinition.method802(-2122646045 * GPI.anInt461,
															DualNode_Sub3.anInt1476 * 1406199355,
															-747958745 * InterfaceNode.floorLevel);
													var9 = 0;
													if (var6 > 3 && var89 > 3 && var6 < 100 && var89 < 100) {
														for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
															for (var11 = var89 - 4; var11 <= 4 + var89; ++var11) {
																var12 = InterfaceNode.floorLevel * -747958745;
																if (var12 < 3 && (Class39.renderRules[1][var10][var11]
																		& 2) == 2) {
																	++var12;
																}

																var13 = var8 - Class39.tileHeights[var12][var10][var11];
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

													if (var10 > 137595259 * anInt2119) {
														anInt2119 += (var10 - anInt2119 * 137595259) / 24 * 34663859;
													} else if (var10 < 137595259 * anInt2119) {
														anInt2119 += 34663859 * ((var10 - anInt2119 * 137595259) / 80);
													}

													if (aBool2046) {
														var83 = BoundaryDecorationStub.anInt216 * 915224960 + 64;
														var5 = Class26.anInt310 * 402993792 + 64;
														var6 = NpcDefinition.method802(var83, var5,
																-747958745 * InterfaceNode.floorLevel)
																- Class3.anInt94 * 3036509;
														if (282154897 * Projectile.cameraX < var83) {
															Projectile.cameraX += 933251441
																	* ((var83 - Projectile.cameraX * 282154897)
																			* -2101471913 * RuneScript.anInt1722 / 1000
																			+ ObjectDefinition.anInt1695 * -2096533901);
															if (282154897 * Projectile.cameraX > var83) {
																Projectile.cameraX = var83 * 933251441;
															}
														}

														if (282154897 * Projectile.cameraX > var83) {
															Projectile.cameraX -= 933251441
																	* ((Projectile.cameraX * 282154897 - var83)
																			* RuneScript.anInt1722 * -2101471913 / 1000
																			+ ObjectDefinition.anInt1695 * -2096533901);
															if (282154897 * Projectile.cameraX < var83) {
																Projectile.cameraX = 933251441 * var83;
															}
														}

														if (FriendedPlayer.cameraZ * 1447873857 < var6) {
															FriendedPlayer.cameraZ += (ObjectDefinition.anInt1695
																	* -2096533901
																	+ RuneScript.anInt1722 * -2101471913 * (var6
																			- FriendedPlayer.cameraZ * 1447873857)
																			/ 1000)
																	* -1022442815;
															if (1447873857 * FriendedPlayer.cameraZ > var6) {
																FriendedPlayer.cameraZ = var6 * -1022442815;
															}
														}

														if (1447873857 * FriendedPlayer.cameraZ > var6) {
															FriendedPlayer.cameraZ -= -1022442815 * (-2096533901
																	* ObjectDefinition.anInt1695
																	+ (1447873857 * FriendedPlayer.cameraZ - var6)
																			* RuneScript.anInt1722 * -2101471913
																			/ 1000);
															if (1447873857 * FriendedPlayer.cameraZ < var6) {
																FriendedPlayer.cameraZ = -1022442815 * var6;
															}
														}

														if (-324676025 * Class72.cameraY < var5) {
															Class72.cameraY += 1432154999
																	* (-2096533901 * ObjectDefinition.anInt1695
																			+ (var5 - -324676025 * Class72.cameraY)
																					* RuneScript.anInt1722 * -2101471913
																					/ 1000);
															if (Class72.cameraY * -324676025 > var5) {
																Class72.cameraY = 1432154999 * var5;
															}
														}

														if (Class72.cameraY * -324676025 > var5) {
															Class72.cameraY -= (RuneScript.anInt1722 * -2101471913
																	* (-324676025 * Class72.cameraY - var5) / 1000
																	+ ObjectDefinition.anInt1695 * -2096533901)
																	* 1432154999;
															if (-324676025 * Class72.cameraY < var5) {
																Class72.cameraY = 1432154999 * var5;
															}
														}

														var83 = 64 + Class48_Sub1.anInt1299 * 1908651904;
														var5 = anInt2211 * 107932800 + 64;
														var6 = NpcDefinition.method802(var83, var5,
																-747958745 * InterfaceNode.floorLevel)
																- GraphicsStub.anInt1813 * 715633123;
														var89 = var83 - Projectile.cameraX * 282154897;
														var8 = var6 - 1447873857 * FriendedPlayer.cameraZ;
														var9 = var5 - -324676025 * Class72.cameraY;
														var10 = (int) Math.sqrt((double) (var89 * var89 + var9 * var9));
														var11 = (int) (Math.atan2((double) var8, (double) var10)
																* 325.949D) & 2047;
														var12 = (int) (Math.atan2((double) var89, (double) var9)
																* -325.949D) & 2047;
														if (var11 < 128) {
															var11 = 128;
														}

														if (var11 > 383) {
															var11 = 383;
														}

														if (Class67.cameraPitch * 1162853107 < var11) {
															Class67.cameraPitch += (Class29.anInt334 * 549132187
																	* (var11 - 1162853107 * Class67.cameraPitch) / 1000
																	+ -1113540799 * Class36.anInt402) * 1852239419;
															if (1162853107 * Class67.cameraPitch > var11) {
																Class67.cameraPitch = var11 * 1852239419;
															}
														}

														if (Class67.cameraPitch * 1162853107 > var11) {
															Class67.cameraPitch -= ((Class67.cameraPitch * 1162853107
																	- var11) * Class29.anInt334 * 549132187 / 1000
																	+ -1113540799 * Class36.anInt402) * 1852239419;
															if (1162853107 * Class67.cameraPitch < var11) {
																Class67.cameraPitch = 1852239419 * var11;
															}
														}

														var13 = var12 - -210812059 * Class65.cameraYaw;
														if (var13 > 1024) {
															var13 -= 2048;
														}

														if (var13 < -1024) {
															var13 += 2048;
														}

														if (var13 > 0) {
															Class65.cameraYaw += (-1113540799 * Class36.anInt402
																	+ var13 * Class29.anInt334 * 549132187 / 1000)
																	* 531969645;
															Class65.cameraYaw = (-210812059 * Class65.cameraYaw & 2047)
																	* 531969645;
														}

														if (var13 < 0) {
															Class65.cameraYaw -= (-1113540799 * Class36.anInt402
																	+ 549132187 * Class29.anInt334 * -var13 / 1000)
																	* 531969645;
															Class65.cameraYaw = (-210812059 * Class65.cameraYaw & 2047)
																	* 531969645;
														}

														var14 = var12 - -210812059 * Class65.cameraYaw;
														if (var14 > 1024) {
															var14 -= 2048;
														}

														if (var14 < -1024) {
															var14 += 2048;
														}

														if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
															Class65.cameraYaw = 531969645 * var12;
														}
													}

													for (var83 = 0; var83 < 5; ++var83) {
														++anIntArray2215[var83];
													}

													Class33.aClass28_364.method176();
													var83 = DualNode_Sub10.method719();
													var5 = 689796811 * Class71.anInt601;
													if (var83 > 15000 && var5 > 15000) {
														anInt2045 = -453788862;
														Class74.anInt617 = -1867429308;
														outBuffer.putHeader(182);
													}

													anInt2062 += -1363846693;
													if (-2137195949 * anInt2062 > 500) {
														anInt2062 = 0;
														var89 = (int) (Math.random() * 8.0D);
														if ((var89 & 1) == 1) {
															anInt2220 += 741363619 * anInt2057;
														}

														if ((var89 & 2) == 2) {
															anInt2058 += -330854363 * anInt2059;
														}

														if ((var89 & 4) == 4) {
															anInt2060 += anInt2061 * -1044167141;
														}
													}

													if (1311998203 * anInt2220 < -50) {
														anInt2057 = 1609074786;
													}

													if (anInt2220 * 1311998203 > 50) {
														anInt2057 = -1609074786;
													}

													if (-896118313 * anInt2058 < -55) {
														anInt2059 = 975522870;
													}

													if (-896118313 * anInt2058 > 55) {
														anInt2059 = -975522870;
													}

													if (-1913217891 * anInt2060 < -40) {
														anInt2061 = 804940911;
													}

													if (-1913217891 * anInt2060 > 40) {
														anInt2061 = -804940911;
													}

													anInt2018 += 745733717;
													if (1420431101 * anInt2018 > 500) {
														anInt2018 = 0;
														var89 = (int) (Math.random() * 8.0D);
														if ((var89 & 1) == 1) {
															minimapScale += -1297834643 * anInt2063;
														}

														if ((var89 & 2) == 2) {
															viewRotation += anInt2064 * -2091901849;
														}
													}

													if (minimapScale * -1718342721 < -60) {
														anInt2063 = 1760620982;
													}

													if (minimapScale * -1718342721 > 60) {
														anInt2063 = -1760620982;
													}

													if (viewRotation * -806982331 < -20) {
														anInt2064 = -2064007701;
													}

													if (-806982331 * viewRotation > 10) {
														anInt2064 = 2064007701;
													}

													for (Class96_Sub1 var181 = (Class96_Sub1) aClass102_2228
															.method416(); var181 != null; var181 = (Class96_Sub1) aClass102_2228
																	.method418()) {
														if ((long) (var181.anInt1206 * -1725912957) < Node_Sub5
																.currentTimeMs() / 1000L - 5L) {
															if (var181.aShort1205 > 0) {
																Class75.method334(5, "",
																		var181.aString1203 + GameStrings.aString911);
															}

															if (var181.aShort1205 == 0) {
																Class75.method334(5, "",
																		var181.aString1203 + GameStrings.aString991);
															}

															var181.method411();
														}
													}

													anInt2042 += 530378793;
													if (anInt2042 * 736734233 > 50) {
														outBuffer.putHeader(126);
													}

													try {
														if (Class31.gameConnection != null
																&& 314639891 * outBuffer.position > 0) {
															Class31.gameConnection.write(outBuffer.payload, 0,
																	314639891 * outBuffer.position);
															outBuffer.position = 0;
															anInt2042 = 0;
															return;
														}
													} catch (IOException var69) {
														Class81.method361();
													}

													return;
												}

												var182 = var115.aWidget1430;
												if (2021294259 * var182.index >= 0) {
													var121 = Class94.getWidget(var182.parentId * -1652479707);
													if (var121 == null || var121.children == null
															|| 2021294259 * var182.index >= var121.children.length
															|| var121.children[var182.index * 2021294259] != var182) {
														continue;
													}
												}

												Class96_Sub1.method504(var115);
											}
										}

										var182 = var115.aWidget1430;
										if (2021294259 * var182.index >= 0) {
											var121 = Class94.getWidget(var182.parentId * -1652479707);
											if (var121 == null || var121.children == null
													|| 2021294259 * var182.index >= var121.children.length
													|| var121.children[2021294259 * var182.index] != var182) {
												continue;
											}
										}

										Class96_Sub1.method504(var115);
									}
								}

								var182 = var115.aWidget1430;
								if (var182.index * 2021294259 >= 0) {
									var121 = Class94.getWidget(-1652479707 * var182.parentId);
									if (var121 == null || var121.children == null
											|| 2021294259 * var182.index >= var121.children.length
											|| var121.children[2021294259 * var182.index] != var182) {
										continue;
									}
								}

								Class96_Sub1.method504(var115);
							}
						}
					}
				}
			}
		} else if (846055547 * anInt2113 == 40 || 846055547 * anInt2113 == 45) {
			Class58.processLogin();
		}

	}

	void processJS5Connection() {
		if (anInt2113 * 846055547 != 1000) {
			long var1 = Node_Sub5.currentTimeMs();
			int var3 = (int) (var1 - Class81.aLong668 * -7519494246777129627L);
			Class81.aLong668 = 8420123348744189037L * var1;
			if (var3 > 200) {
				var3 = 200;
			}

			Class81.anInt667 += 272638619 * var3;
			boolean var4;
			if (Class81.anInt669 * -1358134653 == 0 && 1721465631 * Class81.anInt679 == 0
					&& Class81.anInt674 * 1714437309 == 0 && 1018165549 * Class81.anInt670 == 0) {
				var4 = true;
			} else if (Class81.aClass60_666 == null) {
				var4 = false;
			} else {
				try {
					if (-156634221 * Class81.anInt667 > 30000) {
						throw new IOException();
					}

					DualNode_Sub15 var5;
					ByteBuf var6;
					while (Class81.anInt679 * 1721465631 < 20 && 1018165549 * Class81.anInt670 > 0) {
						var5 = (DualNode_Sub15) Class81.aNodeTable685.method150();
						var6 = new ByteBuf(4);
						var6.putByte(1);
						var6.putMedium((int) var5.key);
						Class81.aClass60_666.write(var6.payload, 0, 4);
						Class81.aNodeTable682.put(var5, var5.key);
						Class81.anInt670 -= -1554399579;
						Class81.anInt679 += 255344863;
					}

					while (-1358134653 * Class81.anInt669 < 20 && 1714437309 * Class81.anInt674 > 0) {
						var5 = (DualNode_Sub15) Class81.aClass105_672.method424();
						var6 = new ByteBuf(4);
						var6.putByte(0);
						var6.putMedium((int) var5.key);
						Class81.aClass60_666.write(var6.payload, 0, 4);
						var5.unlinkDual();
						Class81.aNodeTable675.put(var5, var5.key);
						Class81.anInt674 -= 556834453;
						Class81.anInt669 += 30759979;
					}

					int var22 = 0;

					while (true) {
						if (var22 < 100) {
							int var23 = Class81.aClass60_666.avail();
							if (var23 < 0) {
								throw new IOException();
							}

							if (var23 != 0) {
								label205: {
									Class81.anInt667 = 0;
									byte var7 = 0;
									if (Class1.aDualNode_Sub15_5 == null) {
										var7 = 8;
									} else if (-1986173707 * Class81.anInt676 == 0) {
										var7 = 1;
									}

									int var8;
									int var9;
									int var10;
									int var12;
									if (var7 > 0) {
										var8 = var7 - 314639891 * Class81.aBuffer677.position;
										if (var8 > var23) {
											var8 = var23;
										}

										Class81.aClass60_666.read(Class81.aBuffer677.payload,
												Class81.aBuffer677.position * 314639891, var8);
										if (Class81.aByte671 != 0) {
											for (var9 = 0; var9 < var8; ++var9) {
												Class81.aBuffer677.payload[Class81.aBuffer677.position * 314639891
														+ var9] ^= Class81.aByte671;
											}
										}

										Class81.aBuffer677.position += -184175589 * var8;
										if (Class81.aBuffer677.position * 314639891 < var7) {
											break label205;
										}

										if (Class1.aDualNode_Sub15_5 == null) {
											Class81.aBuffer677.position = 0;
											var9 = Class81.aBuffer677.getUByte();
											var10 = Class81.aBuffer677.getUShort();
											int var11 = Class81.aBuffer677.getUByte();
											var12 = Class81.aBuffer677.getInt();
											long var13 = (long) ((var9 << 16) + var10);
											DualNode_Sub15 var15 = (DualNode_Sub15) Class81.aNodeTable682.get(var13);
											Class92.aBool725 = true;
											if (var15 == null) {
												var15 = (DualNode_Sub15) Class81.aNodeTable675.get(var13);
												Class92.aBool725 = false;
											}

											if (var15 == null) {
												throw new IOException();
											}

											int var16 = var11 == 0 ? 5 : 9;
											Class1.aDualNode_Sub15_5 = var15;
											Class81.aBuffer678 = new ByteBuf(
													var16 + var12 + Class1.aDualNode_Sub15_5.aByte1650);
											Class81.aBuffer678.putByte(var11);
											Class81.aBuffer678.putInt(var12);
											Class81.anInt676 = 1483291368;
											Class81.aBuffer677.position = 0;
										} else if (-1986173707 * Class81.anInt676 == 0) {
											if (Class81.aBuffer677.payload[0] == -1) {
												Class81.anInt676 = -351459491;
												Class81.aBuffer677.position = 0;
											} else {
												Class1.aDualNode_Sub15_5 = null;
											}
										}
									} else {
										var8 = Class81.aBuffer678.payload.length - Class1.aDualNode_Sub15_5.aByte1650;
										var9 = 512 - Class81.anInt676 * -1986173707;
										if (var9 > var8 - 314639891 * Class81.aBuffer678.position) {
											var9 = var8 - 314639891 * Class81.aBuffer678.position;
										}

										if (var9 > var23) {
											var9 = var23;
										}

										Class81.aClass60_666.read(Class81.aBuffer678.payload,
												314639891 * Class81.aBuffer678.position, var9);
										if (Class81.aByte671 != 0) {
											for (var10 = 0; var10 < var9; ++var10) {
												Class81.aBuffer678.payload[Class81.aBuffer678.position * 314639891
														+ var10] ^= Class81.aByte671;
											}
										}

										Class81.aBuffer678.position += -184175589 * var9;
										Class81.anInt676 += var9 * -351459491;
										if (Class81.aBuffer678.position * 314639891 == var8) {
											if (Class1.aDualNode_Sub15_5.key == 16711935L) {
												Class93.aBuffer731 = Class81.aBuffer678;

												for (var10 = 0; var10 < 256; ++var10) {
													CacheIndex var24 = Class81.aClass87_Sub1Array681[var10];
													if (var24 != null) {
														Class93.aBuffer731.position = -920877945 + var10 * -1473404712;
														var12 = Class93.aBuffer731.getInt();
														int var17 = Class93.aBuffer731.getInt();
														var24.setInformation(var12, var17);
													}
												}
											} else {
												Class81.aCRC32_680.reset();
												Class81.aCRC32_680.update(Class81.aBuffer678.payload, 0, var8);
												var10 = (int) Class81.aCRC32_680.getValue();
												if (Class1.aDualNode_Sub15_5.anInt1651 * -2143112411 != var10) {
													try {
														Class81.aClass60_666.shutdown();
													} catch (Exception var20) {
														;
													}

													Class81.anInt683 += 1983812729;
													Class81.aClass60_666 = null;
													Class81.aByte671 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
													var4 = false;
													break;
												}

												Class81.anInt683 = 0;
												Class81.anInt684 = 0;
												Class1.aDualNode_Sub15_5.aClass87_Sub1_1649.method557(
														(int) (Class1.aDualNode_Sub15_5.key & 65535L),
														Class81.aBuffer678.payload,
														16711680L == (Class1.aDualNode_Sub15_5.key & 16711680L),
														Class92.aBool725);
											}

											Class1.aDualNode_Sub15_5.unlink();
											if (Class92.aBool725) {
												Class81.anInt679 -= 255344863;
											} else {
												Class81.anInt669 -= 30759979;
											}

											Class81.anInt676 = 0;
											Class1.aDualNode_Sub15_5 = null;
											Class81.aBuffer678 = null;
										} else {
											if (-1986173707 * Class81.anInt676 != 512) {
												break label205;
											}

											Class81.anInt676 = 0;
										}
									}

									++var22;
									continue;
								}
							}
						}

						var4 = true;
						break;
					}
				} catch (IOException var21) {
					try {
						Class81.aClass60_666.shutdown();
					} catch (Exception var19) {
						;
					}

					Class81.anInt684 += -1096754175;
					Class81.aClass60_666 = null;
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
		if (-448031287 * Class81.anInt683 >= 4) {
			this.method1032("js5crc");
			anInt2113 = 295086904;
		} else {
			if (Class81.anInt684 * 1047471105 >= 4) {
				if (anInt2113 * 846055547 <= 5) {
					this.method1032("js5io");
					anInt2113 = 295086904;
					return;
				}

				anInt2169 = 1244563592;
				Class81.anInt684 = 1004704771;
			}

			if ((anInt2169 -= 1071293367) * 1042459143 + 1 <= 0) {
				try {
					if (anInt2028 * 871661897 == 0) {
						Class96_Sub1.aClass61_1208 = IsaacRandom.aClass63_102.method311(World.myWorldDomain,
								Class24.anInt299 * 2028673991);
						anInt2028 += 2080129273;
					}

					if (871661897 * anInt2028 == 1) {
						if (Class96_Sub1.aClass61_1208.anInt563 == 2) {
							this.method1054(-1);
							return;
						}

						if (Class96_Sub1.aClass61_1208.anInt563 == 1) {
							anInt2028 += 2080129273;
						}
					}

					if (871661897 * anInt2028 == 2) {
						Class49.aClass60_513 = new Connection((Socket) Class96_Sub1.aClass61_1208.anObject566,
								IsaacRandom.aClass63_102);
						ByteBuf var1 = new ByteBuf(5);
						var1.putByte(15);
						var1.putInt(103);
						Class49.aClass60_513.write(var1.payload, 0, 5);
						anInt2028 += 2080129273;
						InterfaceNode.aLong1397 = Node_Sub5.currentTimeMs() * 438338058587165431L;
					}

					if (871661897 * anInt2028 == 3) {
						if (anInt2113 * 846055547 > 5 && Class49.aClass60_513.avail() <= 0) {
							if (Node_Sub5.currentTimeMs() - InterfaceNode.aLong1397 * 6665081146797919943L > 30000L) {
								this.method1054(-2);
								return;
							}
						} else {
							int var3 = Class49.aClass60_513.method299();
							if (var3 != 0) {
								this.method1054(var3);
								return;
							}

							anInt2028 += 2080129273;
						}
					}

					if (anInt2028 * 871661897 == 4) {
						Class30.method188(Class49.aClass60_513, anInt2113 * 846055547 > 20);
						Class96_Sub1.aClass61_1208 = null;
						Class49.aClass60_513 = null;
						anInt2028 = 0;
						anInt2031 = 0;
					}
				} catch (IOException var2) {
					this.method1054(-3);
				}

			}
		}
	}

	void method1054(int var1) {
		Class96_Sub1.aClass61_1208 = null;
		Class49.aClass60_513 = null;
		anInt2028 = 0;
		if (Class82.anInt686 * 809635993 == 2028673991 * Class24.anInt299) {
			Class24.anInt299 = Class41.anInt446 * 715804305;
		} else {
			Class24.anInt299 = 1439019167 * Class82.anInt686;
		}

		anInt2031 += -1173968285;
		if (anInt2031 * -608360629 >= 2 && (var1 == 7 || var1 == 9)) {
			if (846055547 * anInt2113 <= 5) {
				this.method1032("js5connect_full");
				anInt2113 = 295086904;
			} else {
				anInt2169 = 1244563592;
			}
		} else if (-608360629 * anInt2031 >= 2 && var1 == 6) {
			this.method1032("js5connect_outofdate");
			anInt2113 = 295086904;
		} else if (-608360629 * anInt2031 >= 4) {
			if (anInt2113 * 846055547 <= 5) {
				this.method1032("js5connect");
				anInt2113 = 295086904;
			} else {
				anInt2169 = 1244563592;
			}
		}

	}

	protected final void method1038(int var1) {
		if (Class33.aClass28_364.method177()) {
			Class33.aClass28_364.method174();
		}

		if (Npc.aClass30_1968 != null) {
			Npc.aClass30_1968.aBool336 = false;
		}

		Npc.aClass30_1968 = null;
		if (Class31.gameConnection != null) {
			Class31.gameConnection.shutdown();
			Class31.gameConnection = null;
		}

		if (Class71.aClass71_603 != null) {
			Class71 var2 = Class71.aClass71_603;
			synchronized (var2) {
				Class71.aClass71_603 = null;
			}
		}

		if (Class74.aClass74_618 != null) {
			Class74 var10 = Class74.aClass74_618;
			synchronized (var10) {
				Class74.aClass74_618 = null;
			}
		}

		Class26.aClass78_313 = null;
		if (DualNode_Sub14.aClass8_1644 != null) {
			DualNode_Sub14.aClass8_1644.method84();
		}

		if (Class30.aClass8_341 != null) {
			Class30.aClass8_341.method84();
		}

		if (Class81.aClass60_666 != null) {
			Class81.aClass60_666.shutdown();
		}

		Object var11 = Class90.anObject720;
		synchronized (var11) {
			if (Class90.anInt719 * 1638013353 != 0) {
				Class90.anInt719 = 9935513;

				try {
					Class90.anObject720.wait();
				} catch (InterruptedException var6) {
					;
				}
			}
		}

		Class32.method194();
	}

	protected final void method1031(int var1) {
		Class82.anInt686 = (anInt2074 * 1082541889 == 0 ? '\uaa4a' : '\u9c40' + -1631311031 * myWorld) * -767343703;
		Class41.anInt446 = (1082541889 * anInt2074 == 0 ? 443 : myWorld * -1631311031 + '\uc350') * 701960199;
		Class24.anInt299 = Class82.anInt686 * 1439019167;
		PlayerConfig.aShortArray530 = Colors.colorsToFind;
		PlayerConfig.aShortArrayArray529 = Colors.colorsToReplace;
		Colors.aShortArray837 = Colors.colorsToFind1;
		Class85.aShortArrayArray691 = Colors.colorsToReplace1;
		Class96_Sub1.method501(83176752);
		Varpbit.method876(LandscapeTile.aCanvas1417);
		Canvas var2 = LandscapeTile.aCanvas1417;
		var2.addMouseListener(Class74.aClass74_618);
		var2.addMouseMotionListener(Class74.aClass74_618);
		var2.addFocusListener(Class74.aClass74_618);

		Class78_Sub1 var3;
		try {
			var3 = new Class78_Sub1();
		} catch (Throwable var7) {
			var3 = null;
		}

		Class26.aClass78_313 = var3;
		if (Class26.aClass78_313 != null) {
			Class26.aClass78_313.method340(LandscapeTile.aCanvas1417, (short) 17146);
		}

		Class3.aClass62_92 = new IndexTable(255, Class75.cacheDataFile, Class75.aClass121_636, 500000);
		Node_Sub5.aClass24_1265 = ItemDefinition.method821();
		CacheIndex.aClipboard1329 = this.getToolkit().getSystemClipboard();
		Class52.method260(this, Class31.aString349);
		if (anInt2074 * 1082541889 != 0) {
			displayFps = true;
		}

		int var4 = -1207115777 * Node_Sub5.aClass24_1265.anInt300;
		aLong2035 = 0L;
		if (var4 >= 2) {
			resizable = true;
		} else {
			resizable = false;
		}

		Node_Sub5.method534();
		if (846055547 * anInt2113 >= 25) {
			outBuffer.putHeader(23);
			BitBuf var5 = outBuffer;
			int var6 = resizable ? 2 : 1;
			var5.putByte(var6);
			outBuffer.putShort(Class34.gameWidth * -452716157);
			outBuffer.putShort(674167779 * Node_Sub9.gameHeight);
		}

		aBool1979 = true;
	}

	protected final void method1037(short var1) {
		boolean var2;
		label202: {
			try {
				if (-1587772409 * Class110.anInt782 == 2) {
					if (Class86.aNode_Sub11_693 == null) {
						Class86.aNode_Sub11_693 = Node_Sub11.method572(Class110.aClass87_783,
								Class98.anInt748 * 729981213, -664270353 * Class111.anInt788);
						if (Class86.aNode_Sub11_693 == null) {
							var2 = false;
							break label202;
						}
					}

					if (RuneScript.aClass13_1721 == null) {
						RuneScript.aClass13_1721 = new Class13(Class110.aClass87_781, Class110.aClass87_786);
					}

					if (Class110.aNode_Sub4_Sub4_784.method829(Class86.aNode_Sub11_693, Class89.aClass87_716,
							RuneScript.aClass13_1721, 22050)) {
						Class110.aNode_Sub4_Sub4_784.method830();
						Class110.aNode_Sub4_Sub4_784.method827(1705221873 * Class110.anInt787);
						Class110.aNode_Sub4_Sub4_784.method855(Class86.aNode_Sub11_693, Class44.aBool464);
						Class110.anInt782 = 0;
						Class86.aNode_Sub11_693 = null;
						RuneScript.aClass13_1721 = null;
						Class110.aClass87_783 = null;
						var2 = true;
						break label202;
					}
				}
			} catch (Exception var17) {
				var17.printStackTrace();
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
		if (anInt2113 * 846055547 == 10 || anInt2113 * 846055547 == 20 || anInt2113 * 846055547 == 30) {
			if (0L != aLong2035 * 203608972292936527L && Node_Sub5.currentTimeMs() > 203608972292936527L * aLong2035) {
				int var4 = resizable ? 2 : 1;
				aLong2035 = 0L;
				if (var4 >= 2) {
					resizable = true;
				} else {
					resizable = false;
				}

				Node_Sub5.method534();
				if (846055547 * anInt2113 >= 25) {
					outBuffer.putHeader(23);
					BitBuf var5 = outBuffer;
					var6 = resizable ? 2 : 1;
					var5.putByte(var6);
					outBuffer.putShort(-452716157 * Class34.gameWidth);
					outBuffer.putShort(674167779 * Node_Sub9.gameHeight);
				}

				aBool1979 = true;
			} else if (aBool1982) {
				ItemDefinition.method810();
			}
		}

		Dimension var18 = this.method1034();
		if (var18.width != -1830553327 * DualNode_Sub6.anInt1505 || var18.height != Class21.anInt281 * 2045896553
				|| aBool1981) {
			Node_Sub5.method534();
			aLong2035 = (Node_Sub5.currentTimeMs() + 500L) * 276652985331671983L;
			aBool1981 = false;
		}

		boolean var19 = false;
		if (aBool1979) {
			aBool1979 = false;
			var19 = true;

			for (var6 = 0; var6 < 100; ++var6) {
				aBoolArray2118[var6] = true;
			}
		}

		if (var19) {
			DualNode_Sub1.method659();
		}

		if (846055547 * anInt2113 == 0) {
			var6 = -1478431965 * Class6.anInt122;
			String var7 = Class6.aString131;
			Color var8 = null;

			try {
				Graphics var9 = LandscapeTile.aCanvas1417.getGraphics();
				if (Class7.aFont153 == null) {
					Class7.aFont153 = new Font("Helvetica", 1, 13);
					IsaacRandom.aFontMetrics98 = LandscapeTile.aCanvas1417.getFontMetrics(Class7.aFont153);
				}

				if (var19) {
					var9.setColor(Color.black);
					var9.fillRect(0, 0, Class34.gameWidth * -452716157, 674167779 * Node_Sub9.gameHeight);
				}

				if (var8 == null) {
					var8 = new Color(140, 17, 17);
				}

				try {
					if (IndexTable.anImage572 == null) {
						IndexTable.anImage572 = LandscapeTile.aCanvas1417.createImage(304, 34);
					}

					Graphics var10 = IndexTable.anImage572.getGraphics();
					var10.setColor(var8);
					var10.drawRect(0, 0, 303, 33);
					var10.fillRect(2, 2, 3 * var6, 30);
					var10.setColor(Color.black);
					var10.drawRect(1, 1, 301, 31);
					var10.fillRect(2 + 3 * var6, 2, 300 - var6 * 3, 30);
					var10.setFont(Class7.aFont153);
					var10.setColor(Color.white);
					var10.drawString(var7, (304 - IsaacRandom.aFontMetrics98.stringWidth(var7)) / 2, 22);
					var9.drawImage(IndexTable.anImage572, Class34.gameWidth * -452716157 / 2 - 152,
							Node_Sub9.gameHeight * 674167779 / 2 - 18, (ImageObserver) null);
				} catch (Exception var13) {
					int var11 = -452716157 * Class34.gameWidth / 2 - 152;
					int var12 = 674167779 * Node_Sub9.gameHeight / 2 - 18;
					var9.setColor(var8);
					var9.drawRect(var11, var12, 303, 33);
					var9.fillRect(var11 + 2, 2 + var12, 3 * var6, 30);
					var9.setColor(Color.black);
					var9.drawRect(var11 + 1, var12 + 1, 301, 31);
					var9.fillRect(var6 * 3 + 2 + var11, 2 + var12, 300 - var6 * 3, 30);
					var9.setFont(Class7.aFont153);
					var9.setColor(Color.white);
					var9.drawString(var7, var11 + (304 - IsaacRandom.aFontMetrics98.stringWidth(var7)) / 2, 22 + var12);
				}
			} catch (Exception var14) {
				LandscapeTile.aCanvas1417.repaint();
			}
		} else if (846055547 * anInt2113 == 5) {
			Class86.method367(Class35.aDualNode_Sub13_Sub3_Sub1_386, Class20_Sub1.aDualNode_Sub13_Sub3_Sub1_1214,
					aDualNode_Sub13_Sub3_Sub1_2047, var19);
		} else if (846055547 * anInt2113 != 10 && 846055547 * anInt2113 != 11) {
			if (846055547 * anInt2113 == 20) {
				Class86.method367(Class35.aDualNode_Sub13_Sub3_Sub1_386, Class20_Sub1.aDualNode_Sub13_Sub3_Sub1_1214,
						aDualNode_Sub13_Sub3_Sub1_2047, var19);
			} else if (846055547 * anInt2113 == 25) {
				if (anInt2130 * 252312367 == 1) {
					if (anInt2120 * -938799965 > anInt2140 * -52271427) {
						anInt2140 = -1562794273 * anInt2120;
					}

					var6 = (1681395946 * anInt2140 - anInt2120 * 304642006) / (-52271427 * anInt2140);
					Class82.method363(GameStrings.aString852 + Class35.aString390 + Class35.aString389 + var6 + "%"
							+ Class35.aString392, false);
				} else if (anInt2130 * 252312367 == 2) {
					if (434687465 * anInt2049 > 1863586757 * anInt2027) {
						anInt2027 = -1274437675 * anInt2049;
					}

					var6 = (-1309942662 * anInt2027 - 259536770 * anInt2049) / (anInt2027 * 1863586757) + 50;
					Class82.method363(GameStrings.aString852 + Class35.aString390 + Class35.aString389 + var6 + "%"
							+ Class35.aString392, false);
				} else {
					Class82.method363(GameStrings.aString852, false);
				}
			} else if (846055547 * anInt2113 == 30) {
				Class50.method254();
			} else if (anInt2113 * 846055547 == 40) {
				Class82.method363(GameStrings.aString853 + Class35.aString390 + GameStrings.aString854, false);
			} else if (anInt2113 * 846055547 == 45) {
				Class82.method363(GameStrings.aString945, false);
			}
		} else {
			Class86.method367(Class35.aDualNode_Sub13_Sub3_Sub1_386, Class20_Sub1.aDualNode_Sub13_Sub3_Sub1_1214,
					aDualNode_Sub13_Sub3_Sub1_2047, var19);
		}

		int var20;
		Graphics var21;
		if (anInt2113 * 846055547 == 30 && 1685649351 * anInt2177 == 0 && !var19) {
			try {
				var21 = LandscapeTile.aCanvas1417.getGraphics();

				for (var20 = 0; var20 < anInt2168 * -580551879; ++var20) {
					if (aBoolArray2171[var20]) {
						IndexTable.aClass20_570.method141(var21, anIntArray2173[var20], anIntArray2174[var20],
								anIntArray2175[var20], anIntArray2176[var20], (short) 271);
						aBoolArray2171[var20] = false;
					}
				}
			} catch (Exception var16) {
				LandscapeTile.aCanvas1417.repaint();
			}
		} else if (anInt2113 * 846055547 > 0) {
			try {
				var21 = LandscapeTile.aCanvas1417.getGraphics();
				IndexTable.aClass20_570.method144(var21, 0, 0, -819332484);

				for (var20 = 0; var20 < anInt2168 * -580551879; ++var20) {
					aBoolArray2171[var20] = false;
				}
			} catch (Exception var15) {
				LandscapeTile.aCanvas1417.repaint();
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
		if (var5 != 0) {
			var7 = InterfaceNode.landscape.method34(var0, var1, var2, var5);
			var14 = var7 >> 6 & 3;
			var8 = var7 & 31;
			var10 = var3;
			if (var5 > 0) {
				var10 = var4;
			}

			int[] var9 = RuneScript.minimapSprite.pixels;
			var6 = 4 * var1 + 24624 + 2048 * (103 - var2);
			var11 = var5 >> 14 & 32767;
			ObjectDefinition var12 = Class37.getObjectDefinition(var11);
			if (var12.anInt1703 * -1798686461 != -1) {
				DualNode_Sub13_Sub2 var13 = Class2.aDualNode_Sub13_Sub2Array77[var12.anInt1703 * -1798686461];
				if (var13 != null) {
					int var15 = (var12.sizeX * 355676604 - var13.anInt1800) / 2;
					int var16 = (685838988 * var12.sizeY - var13.anInt1801) / 2;
					var13.method929(4 * var1 + 48 + var15, 4 * (104 - var2 - var12.sizeY * -1976023901) + 48 + var16);
				}
			} else {
				if (var8 == 0 || var8 == 2) {
					if (var14 == 0) {
						var9[var6] = var10;
						var9[512 + var6] = var10;
						var9[var6 + 1024] = var10;
						var9[var6 + 1536] = var10;
					} else if (var14 == 1) {
						var9[var6] = var10;
						var9[1 + var6] = var10;
						var9[2 + var6] = var10;
						var9[3 + var6] = var10;
					} else if (var14 == 2) {
						var9[var6 + 3] = var10;
						var9[512 + 3 + var6] = var10;
						var9[1024 + 3 + var6] = var10;
						var9[1536 + var6 + 3] = var10;
					} else if (var14 == 3) {
						var9[var6 + 1536] = var10;
						var9[var6 + 1536 + 1] = var10;
						var9[1536 + var6 + 2] = var10;
						var9[var6 + 1536 + 3] = var10;
					}
				}

				if (var8 == 3) {
					if (var14 == 0) {
						var9[var6] = var10;
					} else if (var14 == 1) {
						var9[3 + var6] = var10;
					} else if (var14 == 2) {
						var9[var6 + 3 + 1536] = var10;
					} else if (var14 == 3) {
						var9[1536 + var6] = var10;
					}
				}

				if (var8 == 2) {
					if (var14 == 3) {
						var9[var6] = var10;
						var9[var6 + 512] = var10;
						var9[var6 + 1024] = var10;
						var9[1536 + var6] = var10;
					} else if (var14 == 0) {
						var9[var6] = var10;
						var9[1 + var6] = var10;
						var9[2 + var6] = var10;
						var9[3 + var6] = var10;
					} else if (var14 == 1) {
						var9[3 + var6] = var10;
						var9[512 + var6 + 3] = var10;
						var9[1024 + var6 + 3] = var10;
						var9[1536 + var6 + 3] = var10;
					} else if (var14 == 2) {
						var9[var6 + 1536] = var10;
						var9[1 + 1536 + var6] = var10;
						var9[2 + var6 + 1536] = var10;
						var9[var6 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = InterfaceNode.landscape.method32(var0, var1, var2);
		if (var5 != 0) {
			var7 = InterfaceNode.landscape.method34(var0, var1, var2, var5);
			var14 = var7 >> 6 & 3;
			var8 = var7 & 31;
			var10 = var5 >> 14 & 32767;
			ObjectDefinition var19 = Class37.getObjectDefinition(var10);
			int var22;
			if (var19.anInt1703 * -1798686461 != -1) {
				DualNode_Sub13_Sub2 var17 = Class2.aDualNode_Sub13_Sub2Array77[-1798686461 * var19.anInt1703];
				if (var17 != null) {
					var11 = (355676604 * var19.sizeX - var17.anInt1800) / 2;
					var22 = (685838988 * var19.sizeY - var17.anInt1801) / 2;
					var17.method929(var1 * 4 + 48 + var11, 48 + (104 - var2 - -1976023901 * var19.sizeY) * 4 + var22);
				}
			} else if (var8 == 9) {
				var6 = 15658734;
				if (var5 > 0) {
					var6 = 15597568;
				}

				int[] var21 = RuneScript.minimapSprite.pixels;
				var22 = var1 * 4 + 24624 + 2048 * (103 - var2);
				if (var14 != 0 && var14 != 2) {
					var21[var22] = var6;
					var21[1 + 512 + var22] = var6;
					var21[var22 + 1024 + 2] = var6;
					var21[3 + var22 + 1536] = var6;
				} else {
					var21[1536 + var22] = var6;
					var21[1024 + var22 + 1] = var6;
					var21[2 + 512 + var22] = var6;
					var21[var22 + 3] = var6;
				}
			}
		}

		var5 = InterfaceNode.landscape.method33(var0, var1, var2);
		if (var5 != 0) {
			var7 = var5 >> 14 & 32767;
			ObjectDefinition var23 = Class37.getObjectDefinition(var7);
			if (var23.anInt1703 * -1798686461 != -1) {
				DualNode_Sub13_Sub2 var18 = Class2.aDualNode_Sub13_Sub2Array77[var23.anInt1703 * -1798686461];
				if (var18 != null) {
					var10 = (var23.sizeX * 355676604 - var18.anInt1800) / 2;
					int var20 = (685838988 * var23.sizeY - var18.anInt1801) / 2;
					var18.method929(48 + var1 * 4 + var10, var20 + (104 - var2 - -1976023901 * var23.sizeY) * 4 + 48);
				}
			}
		}

	}

	public static int method1056(ByteBuf var0, String var1) {
		int var2 = var0.position * 314639891;
		byte[] var3 = Class53.method273(var1);
		var0.putUSmart(var3.length);
		var0.position += Class120.huffman.method228(var3, 0, var3.length, var0.payload, 314639891 * var0.position)
				* -184175589;
		return var0.position * 314639891 - var2;
	}
}
