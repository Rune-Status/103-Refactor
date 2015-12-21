import java.io.File;
import java.io.IOException;

public final class BoundaryStub {

	static int anInt276;
	int strictY;
	int floorLevel;
	int orientationB;
	public Entity entityA;
	public Entity entityB;
	int orientationA;
	int config = 0;
	int strictX;
	public int anInt277 = 0;

	static DualNode_Sub13_Sub2 method153() {
		DualNode_Sub13_Sub2 var0 = new DualNode_Sub13_Sub2();
		var0.anInt1804 = Class7.anInt148 * -749860951;
		var0.anInt1805 = -1945497809 * Class7.anInt155;
		var0.anInt1803 = Class7.anIntArray149[0];
		var0.anInt1802 = DualNode_Sub11.anIntArray1544[0];
		var0.anInt1800 = Class7.anIntArray150[0];
		var0.anInt1801 = Class7.anIntArray151[0];
		var0.anIntArray1798 = Class85.anIntArray690;
		var0.aByteArray1799 = Npc.aByteArrayArray1966[0];
		Class65.method318();
		return var0;
	}

	public static CacheFileAccessor method154(String var0, String var1, boolean var2) {
		File var3 = new File(Class75.cacheLocation, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				CacheFileAccessor var10 = new CacheFileAccessor(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
				;
			}
		}

		String var4 = "";
		if (1502918311 * Class75.anInt635 == 33) {
			var4 = "_rc";
		} else if (1502918311 * Class75.anInt635 == 34) {
			var4 = "_wip";
		}

		File var5 = new File(BitBuf.aString1729, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		CacheFileAccessor var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new CacheFileAccessor(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
				;
			}
		}

		try {
			var6 = new CacheFileAccessor(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}
}
