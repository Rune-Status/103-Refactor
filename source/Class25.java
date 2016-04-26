public class Class25 {

	static String method165(int var0) {
		return Client.menuNouns[var0].length() <= 0 ? Client.menuActions[var0]
				: Client.menuActions[var0] + " " + Client.menuNouns[var0];
	}

	static void resetMapInfo() {
		Class118.underlayIds = (byte[][][]) ((byte[][][]) null);
		Class39.overlayIds = (byte[][][]) ((byte[][][]) null);
		VarClientStringType.overlayPaths = (byte[][][]) ((byte[][][]) null);
		GZipDecompressor.overlayRotations = (byte[][][]) ((byte[][][]) null);
		Class39.anIntArrayArrayArray433 = (int[][][]) ((int[][][]) null);
		Class39.aByteArrayArrayArray430 = (byte[][][]) ((byte[][][]) null);
		Class39.anIntArrayArray441 = (int[][]) ((int[][]) null);
		Permission.anIntArray614 = null;
		Class51.anIntArray526 = null;
		Class39.anIntArray432 = null;
		Class89.anIntArray715 = null;
		RuneScript.anIntArray1724 = null;
	}

}
