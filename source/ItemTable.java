public class ItemTable extends Node {

	int[] quantities = new int[] { 0 };
	int[] ids = new int[] { -1 };
	static NodeTable itemTables = new NodeTable(32);

	public static final boolean method646(String var0, String var1, String var2, String var3) {
		return var0 != null && var2 != null
				? (!var0.startsWith("#") && !var2.startsWith("#") ? var1.equals(var3) : var0.equals(var2)) : false;
	}

	static final void method647(boolean var0) {
		FriendedPlayer.method409(Client.anInt2226, Class34.gameWidth, Node_Sub9.gameHeight, var0);
	}

	public static void method648(AbstractIndex var0) {
		EnumType.enum_ref = var0;
	}

	static final void initializeGPI(BitBuf var0) {
		var0.bitAccess();
		int var1 = Client.myPlayerIndex;
		Player var2 = Class68.myPlayer = Client.playerArray[var1] = new Player();
		var2.anInt2000 = var1;
		int var3 = var0.getBits(30);
		byte var7 = (byte) (var3 >> 28);
		int var4 = var3 >> 14 & 0x3fff;
		int var6 = var3 & 0x3fff;
		var2.anIntArray1945[0] = var4 - Node_Sub10.chunkLeftX;
		var2.strictX = (var2.anIntArray1945[0] << 7) + (var2.getSize() << 6);
		var2.anIntArray1955[0] = var6 - VarClientHub.chunkLeftY;
		var2.strictY = (var2.anIntArray1955[0] << 7) + (var2.getSize() << 6);
		InterfaceNode.floorLevel = (var2.anInt2004 = var7) * 1008529911;
		if (GPI.cachedAppearances[var1] != null) {
			var2.decodeApperance(GPI.cachedAppearances[var1]);
		}

		GPI.localPlayerCount = 0;
		GPI.localPlayerIndices[++GPI.localPlayerCount - 1] = var1;
		GPI.skipFlags[var1] = 0;
		GPI.globalPlayerCount = 0;

		for (int var5 = 1; var5 < 2048; var5++) {
			if (var5 != var1) {
				int var8 = var0.getBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 0xff;
				int var11 = var8 & 0xff;
				GPI.cachedRegions[var5] = (var9 << 28) + (var10 << 14) + var11;
				GPI.cachedDirections[var5] = 0;
				GPI.cachedIndices[var5] = -1;
				GPI.globalPlayerIndices[++GPI.globalPlayerCount - 1] = var5;
				GPI.skipFlags[var5] = 0;
			}
		}

		var0.byteAccess();
	}

}
