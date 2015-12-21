import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Node_Sub6 extends Node {

	int anInt1269;
	int anInt1270;
	int anInt1271;
	int anInt1272;
	int[] anIntArray1273;
	int anInt1274;
	int anInt1275;
	Node_Sub4_Sub2 aNode_Sub4_Sub2_1276;
	int anInt1277;
	int anInt1278;
	static Deque aDeque1279 = new Deque();
	Node_Sub4_Sub2 aNode_Sub4_Sub2_1280;
	int anInt1281;
	int anInt1282;
	ObjectDefinition anObjectDefinition1283;

	void method536(int var1) {
		int var2 = this.anInt1281 * -1177973365;
		ObjectDefinition var3 = this.anObjectDefinition1283.transform();
		if (var3 != null) {
			this.anInt1281 = var3.anInt1715 * 802663847;
			this.anInt1282 = var3.anInt1716 * 401668736;
			this.anInt1277 = 428311197 * var3.anInt1687;
			this.anInt1278 = var3.anInt1717 * 1108507363;
			this.anIntArray1273 = var3.anIntArray1697;
		} else {
			this.anInt1281 = 571100637;
			this.anInt1282 = 0;
			this.anInt1277 = 0;
			this.anInt1278 = 0;
			this.anIntArray1273 = null;
		}

		if (this.anInt1281 * -1177973365 != var2 && this.aNode_Sub4_Sub2_1276 != null) {
			FriendedPlayer.aNode_Sub4_Sub1_740.method730(this.aNode_Sub4_Sub2_1276);
			this.aNode_Sub4_Sub2_1276 = null;
		}

	}

	public static void method537() {
		DualNode_Sub7.aClass106_1509.method429();
	}

	public static Object method538(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else {
			if (var0.length > 136 && !Class52.aBool528) {
				try {
					Class52_Sub1 var2 = new Class52_Sub1();
					var2.method259(var0, 1668635019);
					return var2;
				} catch (Throwable var3) {
					Class52.aBool528 = true;
				}
			}

			return var1 ? Class44.method231(var0) : var0;
		}
	}

	public static void method539(String var0, String var1, int var2, int var3) throws IOException {
		Class75.anInt638 = -1882193397 * var3;
		Class75.anInt635 = 725192983 * var2;

		try {
			Class115.aString801 = System.getProperty("os.name");
		} catch (Exception var11) {
			Class115.aString801 = "Unknown";
		}

		DynamicObject.aString1964 = Class115.aString801.toLowerCase();

		try {
			BitBuf.aString1729 = System.getProperty("user.home");
			if (BitBuf.aString1729 != null) {
				BitBuf.aString1729 = BitBuf.aString1729 + "/";
			}
		} catch (Exception var10) {
			;
		}

		try {
			if (DynamicObject.aString1964.startsWith("win")) {
				if (BitBuf.aString1729 == null) {
					BitBuf.aString1729 = System.getenv("USERPROFILE");
				}
			} else if (BitBuf.aString1729 == null) {
				BitBuf.aString1729 = System.getenv("HOME");
			}

			if (BitBuf.aString1729 != null) {
				BitBuf.aString1729 = BitBuf.aString1729 + "/";
			}
		} catch (Exception var9) {
			;
		}

		if (BitBuf.aString1729 == null) {
			BitBuf.aString1729 = "~/";
		}

		BoundaryDecorationStub.aStringArray217 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/",
				"c:/", BitBuf.aString1729, "/tmp/", "" };
		Class67.aStringArray584 = new String[] { ".jagex_cache_" + Class75.anInt635 * 1502918311,
				".file_store_" + 1502918311 * Class75.anInt635 };
		int var4 = 0;

		label107: while (var4 < 4) {
			Class75.cacheLocation = GraphicsStub.method933(var0, var1, var4);
			if (!Class75.cacheLocation.exists()) {
				Class75.cacheLocation.mkdirs();
			}

			File[] var5 = Class75.cacheLocation.listFiles();
			if (var5 == null) {
				break;
			}

			File[] var6 = var5;
			int var7 = 0;

			while (true) {
				if (var7 >= var6.length) {
					break label107;
				}

				File var8 = var6[var7];
				if (!Class87.method393(var8, false)) {
					++var4;
					break;
				}

				++var7;
			}
		}

		Class66.setCacheDirectory(Class75.cacheLocation);

		try {
			File var13 = new File(BitBuf.aString1729, "random.dat");
			int var16;
			if (var13.exists()) {
				Class75.randomDat = new CacheFile(new CacheFileAccessor(var13, "rw", 25L), 24, 0);
			} else {
				label88: for (int var14 = 0; var14 < Class67.aStringArray584.length; ++var14) {
					for (var16 = 0; var16 < BoundaryDecorationStub.aStringArray217.length; ++var16) {
						File var17 = new File(BoundaryDecorationStub.aStringArray217[var16]
								+ Class67.aStringArray584[var14] + File.separatorChar + "random.dat");
						if (var17.exists()) {
							Class75.randomDat = new CacheFile(new CacheFileAccessor(var17, "rw", 25L), 24, 0);
							break label88;
						}
					}
				}
			}

			if (Class75.randomDat == null) {
				RandomAccessFile var15 = new RandomAccessFile(var13, "rw");
				var16 = var15.read();
				var15.seek(0L);
				var15.write(var16);
				var15.seek(0L);
				var15.close();
				Class75.randomDat = new CacheFile(new CacheFileAccessor(var13, "rw", 25L), 24, 0);
			}
		} catch (IOException var12) {
			;
		}

		Class75.cacheDataFile = new CacheFile(
				new CacheFileAccessor(DualNode_Sub6.method700("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		Class75.aClass121_636 = new CacheFile(
				new CacheFileAccessor(DualNode_Sub6.method700("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Class39.cacheIndexFiles = new CacheFile[Class75.anInt638 * 855046563];

		for (var4 = 0; var4 < Class75.anInt638 * 855046563; ++var4) {
			Class39.cacheIndexFiles[var4] = new CacheFile(
					new CacheFileAccessor(DualNode_Sub6.method700("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0);
		}

	}

	public static DualNode_Sub3 method540(int var0, int var1) {
		DualNode_Sub3 var2 = (DualNode_Sub3) DualNode_Sub3.aClass106_1472.method427((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = DualNode_Sub3.aClass87_1489.method391(12, var0);
			var2 = new DualNode_Sub3();
			if (var3 != null) {
				var2.method673(new ByteBuf(var3));
			}

			var2.method675();
			DualNode_Sub3.aClass106_1472.method428(var2, (long) var0);
			return var2;
		}
	}
}
