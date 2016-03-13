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
	ObjectType anObjectDefinition1283;

	void method536(int var1) {
		int var2 = this.anInt1281 * -1177973365;
		ObjectType var3 = this.anObjectDefinition1283.transform();
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
		UnderlayType.underlays.method429();
	}

	public static Object method538(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else {
			if (var0.length > 136 && !AbstractByteBuffer.aBool528) {
				try {
					DirectByteBuffer var2 = new DirectByteBuffer();
					var2.put(var0);
					return var2;
				} catch (Throwable var3) {
					AbstractByteBuffer.aBool528 = true;
				}
			}

			return var1 ? Class44.arrayCopy(var0) : var0;
		}
	}

	public static void initialize(String var0, String var1, int var2, int var3) throws IOException {
		Class75.indexCount = -1882193397 * var3;
		Class75.buildOrdinal = 725192983 * var2;

		try {
			Class115.osName = System.getProperty("os.name");
		} catch (Exception var11) {
			Class115.osName = "Unknown";
		}

		DynamicObject.osNameLC = Class115.osName.toLowerCase();

		try {
			BitBuf.userHome = System.getProperty("user.home");
			if (BitBuf.userHome != null) {
				BitBuf.userHome = BitBuf.userHome + "/";
			}
		} catch (Exception var10) {
			;
		}

		try {
			if (DynamicObject.osNameLC.startsWith("win")) {
				if (BitBuf.userHome == null) {
					BitBuf.userHome = System.getenv("USERPROFILE");
				}
			} else if (BitBuf.userHome == null) {
				BitBuf.userHome = System.getenv("HOME");
			}

			if (BitBuf.userHome != null) {
				BitBuf.userHome = BitBuf.userHome + "/";
			}
		} catch (Exception var9) {
			;
		}

		if (BitBuf.userHome == null) {
			BitBuf.userHome = "~/";
		}

		BoundaryDecorationStub.cacheLocations = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/",
				"c:/", BitBuf.userHome, "/tmp/", "" };
		Class67.historicLocations = new String[] { ".jagex_cache_" + Class75.buildOrdinal * 1502918311,
				".file_store_" + 1502918311 * Class75.buildOrdinal };
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
				if (!AbstractIndex.method393(var8, false)) {
					++var4;
					break;
				}

				++var7;
			}
		}

		Timer.setCacheDirectory(Class75.cacheLocation);

		try {
			File var13 = new File(BitBuf.userHome, "random.dat");
			int var16;
			if (var13.exists()) {
				Class75.randomDat = new CacheFile(new CacheFileAccessor(var13, "rw", 25L), 24, 0);
			} else {
				label88: for (int var14 = 0; var14 < Class67.historicLocations.length; ++var14) {
					for (var16 = 0; var16 < BoundaryDecorationStub.cacheLocations.length; ++var16) {
						File var17 = new File(BoundaryDecorationStub.cacheLocations[var16]
								+ Class67.historicLocations[var14] + File.separatorChar + "random.dat");
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
				new CacheFileAccessor(VarClientStringType.method700("main_file_cache.dat2"), "rw", 1048576000L), 5200,
				0);
		Class75.referenceFile = new CacheFile(
				new CacheFileAccessor(VarClientStringType.method700("main_file_cache.idx255"), "rw", 1048576L), 6000,
				0);
		Class39.cacheIndexFiles = new CacheFile[Class75.indexCount * 855046563];

		for (var4 = 0; var4 < Class75.indexCount * 855046563; ++var4) {
			Class39.cacheIndexFiles[var4] = new CacheFile(
					new CacheFileAccessor(VarClientStringType.method700("main_file_cache.idx" + var4), "rw", 1048576L),
					6000, 0);
		}

	}

	public static SequenceType getSequenceType(int id) {
		SequenceType type = (SequenceType) SequenceType.sequences.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = SequenceType.seq_ref.getFile(12, id);
			type = new SequenceType();
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			type.post();
			SequenceType.sequences.put(type, (long) id);
			return type;
		}
	}
}
