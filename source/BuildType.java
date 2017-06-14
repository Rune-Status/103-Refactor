public class BuildType {

	static Class26 aClass26_644;
	public String identifier;
	public int ordinal;
	static BuildType RC = new BuildType("RC", 1);
	static BuildType WIP = new BuildType("WIP", 2);
	static BuildType LIVE = new BuildType("LIVE", 0);
	static BuildType BUILD_LIVE = new BuildType("BUILDLIVE", 3);

	static void clearCache() {
		Client.aLong2016 = -1L;
		Client.anInt2019 = -1;
		Npc.aClass30_1968.anInt338 = 0;
		Entity.aBool1439 = true;
		Client.aBool2020 = true;
		Client.aLong2030 = -1L;
		Class119.aClass103_804 = new Class103();
		Client.outBuffer.position = 0;
		Client.inBuffer.position = 0;
		Client.frameId = -1;
		Client.lastFrameId = -1;
		Client.secondLastFrameId = -1;
		Client.thridLastFrameId = -1;
		Client.anInt2041 = 0;
		Client.anInt2189 = 0;
		Client.anInt2045 = 0;
		Client.anInt2075 = 0;
		Client.menuItemCount = 0;
		Client.menuOpen = false;
		MouseInput.anInt617 = 0;
		Node_Sub9.method564();
		Client.itemSelectionStatus = 0;
		Client.spellSelected = false;
		Client.audioEffectCount = 0;
		Client.anInt2220 = (int) (Math.random() * 100.0D) - 50;
		Client.anInt2058 = (int) (Math.random() * 110.0D) - 55;
		Client.anInt2060 = (int) (Math.random() * 80.0D) - 40;
		Client.minimapScale = (int) (Math.random() * 120.0D) - 60;
		Client.viewRotation = (int) (Math.random() * 30.0D) - 20;
		Client.minimapRotation = (int) (Math.random() * 20.0D) - 10 & 0x7ff;
		Client.anInt2200 = 0;
		Client.anInt2194 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.aClass36_2170 = Class36.aClass36_399;
		Client.aClass36_2199 = Class36.aClass36_399;
		Client.anInt2225 = 0;
		GPI.localPlayerCount = 0;

		int var0;
		for (var0 = 0; var0 < 2048; var0++) {
			GPI.cachedAppearances[var0] = null;
			GPI.movementTypes[var0] = 1;
		}

		for (var0 = 0; var0 < 2048; var0++) {
			Client.playerArray[var0] = null;
		}

		for (var0 = 0; var0 < '\u8000'; var0++) {
			Client.npcArray[var0] = null;
		}

		Client.anInt2111 = -1;
		Client.projectileDeque.clear();
		Client.graphicsObjectDeque.clear();

		int var1;
		for (var0 = 0; var0 < 4; var0++) {
			for (var1 = 0; var1 < 104; var1++) {
				for (int var5 = 0; var5 < 104; var5++) {
					Client.groundItemDeque[var0][var1][var5] = null;
				}
			}
		}

		Client.aDeque2193 = new Deque();
		Client.friendListSize = 0;
		Client.anInt2184 = 0;
		Client.anInt2229 = 0;

		for (var0 = 0; var0 < VarPlayerType.anInt1547; var0++) {
			VarPlayerType var3 = Class37.getVarPlayerType(var0);
			if (var3 != null) {
				Class94.engineVars[var0] = 0;
				Class94.tempVars[var0] = 0;
			}
		}

		CalledScript.aClass28_364.reset();
		Client.anInt2136 = -1;
		if (Client.anInt2226 != -1) {
			Class53.method275(Client.anInt2226);
		}

		for (InterfaceNode var4 = (InterfaceNode) Client.interfaceNodes
				.method150(); var4 != null; var4 = (InterfaceNode) Client.interfaceNodes.method151()) {
			EnumType.method691(var4, true);
		}

		Client.anInt2226 = -1;
		Client.interfaceNodes = new NodeTable(8);
		Client.aWidget2135 = null;
		Client.menuOpen = false;
		Client.menuItemCount = 0;
		Client.aPlayerConfig2138.method262((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

		for (var0 = 0; var0 < 8; var0++) {
			Client.playerActions[var0] = null;
			Client.aBoolArray2109[var0] = false;
		}

		Colors.method461();
		Client.aBool2214 = true;

		for (var0 = 0; var0 < 100; var0++) {
			Client.aBoolArray2118[var0] = true;
		}

		Client.outBuffer.putHeader(23);
		BitBuf var51 = Client.outBuffer;
		var1 = Client.resizable ? 2 : 1;
		var51.putByte(var1);
		Client.outBuffer.putShort(Occluder.gameWidth);
		Client.outBuffer.putShort(Node_Sub9.gameHeight);
		Client.clanChatOwner = null;
		Class86.clanChatSize = 0;
		InterfaceNode.clanMates = null;

		for (var0 = 0; var0 < 8; var0++) {
			Client.localExchangeOffers[var0] = new ExchangeOffer();
		}

		Class70.aClass114_588 = null;
	}

	BuildType(String var1, int var2) {
		this.identifier = var1;
		this.ordinal = var2;
	}

}
