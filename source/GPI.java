public class GPI {

	static int anInt461;
	static int[] cachedIndices = new int[2048];
	static int[] cachedDirections = new int[2048];
	static byte[] skipFlags = new byte[2048];
	static byte[] movementTypes = new byte[2048];
	static ByteBuf[] cachedAppearances = new ByteBuf[2048];
	static int localPlayerCount = 0;
	static int[] localPlayerIndices = new int[2048];
	static int globalPlayerCount = 0;
	static int[] globalPlayerIndices = new int[2048];
	static int[] cachedRegions = new int[2048];
	static ByteBuf chatBuffer = new ByteBuf(new byte[5000]);
	static int pendingFlagsCount = 0;
	static int[] pendingFlagsIndices = new int[2048];

	GPI() throws Throwable {
		throw new Error();
	}

	static void method230(String var0, String var1, String var2) {
		PlayerLoginDetails.aString133 = var0;
		PlayerLoginDetails.aString134 = var1;
		PlayerLoginDetails.aString135 = var2;
	}

}
