public class Class25 {

	static String method165(int var0) {
		return Client.menuNouns[var0].length() <= 0 ? Client.menuActions[var0]
				: Client.menuActions[var0] + " " + Client.menuNouns[var0];
	}

	static void resetMapInfo() {
		Class118.underlayIds = (byte[][][]) ((byte[][][]) null);
		Scene.overlayIds = (byte[][][]) ((byte[][][]) null);
		VarClientStringType.overlayPaths = (byte[][][]) ((byte[][][]) null);
		GZipDecompressor.overlayRotations = (byte[][][]) ((byte[][][]) null);
		Scene.occludeFlags = (int[][][]) ((int[][][]) null);
		Scene.shadowMap = (byte[][][]) ((byte[][][]) null);
		Scene.lightMap = (int[][]) ((int[][]) null);
		Permission.blendedHue = null;
		Class51.blendedSaturation = null;
		Scene.blendedLightness = null;
		Class89.blendedHueMultiplier = null;
		RuneScript.blendedDirectionTracker = null;
	}

}
