
public class ItemTable extends Node {

	static NodeTable itemTables = new NodeTable(32);
	int[] quantities = new int[] { 0 };
	int[] ids = new int[] { -1 };

	public static final boolean method646(String var0, String var1, String var2, String var3) {
		return var0 != null && var2 != null
				? (!var0.startsWith("#") && !var2.startsWith("#") ? var1.equals(var3) : var0.equals(var2)) : false;
	}

	static final void method647(boolean var0) {
		FriendedPlayer.method409(-1074177723 * Client.anInt2226, -452716157 * Class34.gameWidth,
				674167779 * Node_Sub9.gameHeight, var0);
	}

	public static void method648(AbstractIndex var0) {
		EnumType.enum_ref = var0;
	}

	static final void method649(BitBuf var0) {
		var0.bitAccess();
		int var1 = 1467227105 * Client.myPlayerIndex;
		Player var2 = Class68.myPlayer = Client.playerArray[var1] = new Player();
		var2.anInt2000 = -1055985261 * var1;
		int var3 = var0.getBits(30);
		byte var7 = (byte) (var3 >> 28);
		int var4 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.anIntArray1945[0] = var4 - 1426698711 * Node_Sub10.regionBaseX;
		var2.strictX = ((var2.anIntArray1945[0] << 7) + (var2.method1046() << 6)) * 1705682711;
		var2.anIntArray1955[0] = var6 - VarClientHub.regionBaseY * 714823515;
		var2.strictY = ((var2.anIntArray1955[0] << 7) + (var2.method1046() << 6)) * 1421914369;
		InterfaceNode.floorLevel = (var2.anInt2004 = var7 * -1668953739) * -1941196453;
		if (GPI.cachedAppearances[var1] != null) {
			var2.decodeApperance(GPI.cachedAppearances[var1]);
		}

		GPI.localPlayerCount = 0;
		GPI.localPlayerIndices[(GPI.localPlayerCount += -864270383) * -334270159 - 1] = var1;
		GPI.skipFlags[var1] = 0;
		GPI.globalPlayerCount = 0;

		for (int var5 = 1; var5 < 2048; ++var5) {
			if (var5 != var1) {
				int var8 = var0.getBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 255;
				int var11 = var8 & 255;
				GPI.cachedRegions[var5] = (var9 << 28) + (var10 << 14) + var11;
				GPI.cachedDirections[var5] = 0;
				GPI.cachedIndices[var5] = -1;
				GPI.globalPlayerIndices[(GPI.globalPlayerCount += 2065293525) * 1824807037 - 1] = var5;
				GPI.skipFlags[var5] = 0;
			}
		}

		var0.byteAccess();
	}
}
