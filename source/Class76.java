
public class Class76 {

	static Class76 RC = new Class76("RC", 1);
	static Class76 WIP = new Class76("WIP", 2);
	static Class76 LIVE = new Class76("LIVE", 0);
	public String aString642;
	public int anInt643;
	static Class26 aClass26_644;
	static Class76 BUILD_LIVE = new Class76("BUILDLIVE", 3);

	/**
	 * Clear cache
	 */
	static void clearCache() {
		Client.aLong2016 = -5938907264350207555L;
		Client.anInt2019 = -1669020249;
		Npc.aClass30_1968.anInt338 = 0;
		Entity.aBool1439 = true;
		Client.aBool2020 = true;
		Client.aLong2030 = 8084475441026814739L;
		Class119.aClass103_804 = new Class103();
		Client.outBuffer.position = 0;
		Client.inBuffer.position = 0;
		Client.frameId = -726667601;
		Client.lastFrameId = -190671919;
		Client.secondLastFrameId = -1000495973;
		Client.thridLastFrameId = 1230533737;
		Client.anInt2041 = 0;
		Client.anInt2189 = 0;
		Client.anInt2045 = 0;
		Client.anInt2075 = 0;
		Client.menuItemCount = 0;
		Client.menuOpen = false;
		Class74.anInt617 = 0;
		Node_Sub9.method564();
		Client.itemSelectionStatus = 0;
		Client.spellSelected = false;
		Client.audioEffectCount = 0;
		Client.anInt2220 = ((int) (Math.random() * 100.0D) - 50) * -1631417805;
		Client.anInt2058 = ((int) (Math.random() * 110.0D) - 55) * 647901671;
		Client.anInt2060 = ((int) (Math.random() * 80.0D) - 40) * -795031115;
		Client.minimapScale = ((int) (Math.random() * 120.0D) - 60) * 1807074367;
		Client.viewRotation = ((int) (Math.random() * 30.0D) - 20) * 1806769549;
		Client.minimapRotation = ((int) (Math.random() * 20.0D) - 10 & 2047) * -571365833;
		Client.anInt2200 = 0;
		Client.anInt2194 = -1008529911;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.aClass36_2170 = Class36.aClass36_399;
		Client.aClass36_2199 = Class36.aClass36_399;
		Client.anInt2225 = 0;
		GPI.localPlayerCount = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			GPI.cachedAppearances[var0] = null;
			GPI.movementTypes[var0] = 1;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Client.playerArray[var0] = null;
		}

		for (var0 = 0; var0 < '\u8000'; ++var0) {
			Client.npcArray[var0] = null;
		}

		Client.anInt2111 = 1929362559;
		Client.projectileDeque.method467();
		Client.graphicsObjectDeque.method467();

		int var1;
		for (var0 = 0; var0 < 4; ++var0) {
			for (var1 = 0; var1 < 104; ++var1) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItemDeque[var0][var1][var2] = null;
				}
			}
		}

		Client.aDeque2193 = new Deque();
		Client.friendListSize = 0;
		Client.anInt2184 = 0;
		Client.anInt2229 = 0;

		for (var0 = 0; var0 < -1248800389 * VarPlayerType.anInt1547; ++var0) {
			VarPlayerType var3 = Class37.getVarPlayerType(var0);
			if (var3 != null) {
				Class94.engineVars[var0] = 0;
				Class94.tempVars[var0] = 0;
			}
		}

		Class33.aClass28_364.reset();
		Client.anInt2136 = -218906203;
		if (-1074177723 * Client.anInt2226 != -1) {
			Class53.method275(Client.anInt2226 * -1074177723);
		}

		for (InterfaceNode var4 = (InterfaceNode) Client.interfaceNodes
				.method150(); var4 != null; var4 = (InterfaceNode) Client.interfaceNodes.method151()) {
			EnumType.method691(var4, true);
		}

		Client.anInt2226 = 605073011;
		Client.interfaceNodes = new NodeTable(8);
		Client.aWidget2135 = null;
		Client.menuOpen = false;
		Client.menuItemCount = 0;
		Client.aPlayerConfig2138.method262((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerActions[var0] = null;
			Client.aBoolArray2109[var0] = false;
		}

		Colors.method461();
		Client.aBool2214 = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.aBoolArray2118[var0] = true;
		}

		Client.outBuffer.putHeader(23);
		BitBuf var5 = Client.outBuffer;
		var1 = Client.resizable ? 2 : 1;
		var5.putByte(var1);
		Client.outBuffer.putShort(-452716157 * Class34.gameWidth);
		Client.outBuffer.putShort(674167779 * Node_Sub9.gameHeight);
		Client.clanChatOwner = null;
		Class86.clanChatSize = 0;
		InterfaceNode.clanMates = null;

		for (var0 = 0; var0 < 8; ++var0) {
			Client.localExchangeOffers[var0] = new ExchangeOffer();
		}

		Class70.aClass114_588 = null;
	}

	Class76(String var1, int var2) {
		this.aString642 = var1;
		this.anInt643 = var2 * -749936875;
	}
}
