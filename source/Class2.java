public class Class2 {

	static CacheIndex fontMetricsIndex;
	static Sprite[] aDualNode_Sub13_Sub2Array77;
	static Sprite[] aDualNode_Sub13_Sub2Array78;
	static CacheIndex midiTrack1Index;
	public static char aChar80;

	public static void method60(AbstractIndex var0, AbstractIndex var1) {
		Class84.npc_ref = var0;
		NpcType.aClass87_1596 = var1;
	}

	Class2() throws Throwable {
		throw new Error();
	}

	protected static final void method61() {
		Class90.timer.method321();

		int var0;
		for (var0 = 0; var0 < 32; var0++) {
			GameEngine.aLongArray1975[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; var0++) {
			GameEngine.aLongArray1977[var0] = 0L;
		}

		Node_Sub8.anInt1301 = 0;
	}

	static final void tileToScreen(int x, int y, int height) {
		if (x >= 128 && y >= 128 && x <= 13056 && y <= 13056) {
			int z = NpcType.getTileHeight(x, y, InterfaceNode.floorLevel * -1331355705) - height;

			x -= Projectile.cameraX;
			z -= FriendedPlayer.cameraZ;
			y -= Class72.cameraY;

			int sinCurveY = TexturedGraphic.SIN_TABLE[Class67.cameraPitch];
			int cosCurveY = TexturedGraphic.COS_TABLE[Class67.cameraPitch];
			int sinCurveX = TexturedGraphic.SIN_TABLE[Class65.cameraYaw];
			int cosCurveX = TexturedGraphic.COS_TABLE[Class65.cameraYaw];

			int calculation = x * cosCurveX + y * sinCurveX >> 16;
			y = cosCurveX * y - x * sinCurveX >> 16;
			x = calculation;

			calculation = cosCurveY * z - sinCurveY * y >> 16;
			y = sinCurveY * z + y * cosCurveY >> 16;

			if (y >= 50) {
				Client.screenY = Client.screenHeight / 2 + Client.screenZoom * x / y;
				Client.screenX = Client.screenZoom * calculation / y + Client.screenWidth / 2;
			} else {
				Client.screenY = -1;
				Client.screenX = -1;
			}
		} else {
			Client.screenY = -1;
			Client.screenX = -1;
		}

	}

}
