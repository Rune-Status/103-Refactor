import java.io.File;

public class Class75 {

	static File cacheLocation;
	static File aFile632;
	public static CacheFile randomDat = null;
	public static CacheFile cacheDataFile = null;
	static int buildOrdinal;
	public static CacheFile referenceFile = null;
	static int anInt637;
	static int indexCount;

	static void method334(int var0, String var1, String var2) {
		SpotAnimType.method658(var0, var1, var2, (String) null);
	}

	static void serializeSettings() {
		CacheFileAccessor accessor = null;

		try {
			accessor = BoundaryStub.getPreferences("", Client.gameType.identifier, true);
			ByteBuf buf = AnimationSkin.settings.serialize();
			accessor.write(buf.payload, 0, buf.position * 314639891);
		} catch (Exception var3) {
			;
		}

		try {
			if (accessor != null) {
				accessor.close();
			}
		} catch (Exception var2) {
			;
		}

	}

	Class75() throws Throwable {
		throw new Error();
	}

	public static void method336(int var0, int var1) {
		VarBitType var2 = CacheIndex.getVarBitType(var0);
		int var6 = 12908597 * var2.varp;
		int var5 = -585070571 * var2.lowBit;
		int var3 = var2.highBit * 984543857;
		int var4 = Class94.anIntArray734[var3 - var5];
		if (var1 < 0 || var1 > var4) {
			var1 = 0;
		}

		var4 <<= var5;
		Class94.tempVars[var6] = Class94.tempVars[var6] & ~var4 | var1 << var5 & var4;
	}
}
