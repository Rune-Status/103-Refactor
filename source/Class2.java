
public class Class2 {

	static CacheIndex fontMetricsIndex;
	static DualNode_Sub13_Sub2[] aDualNode_Sub13_Sub2Array77;
	static DualNode_Sub13_Sub2[] aDualNode_Sub13_Sub2Array78;
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
		Class90.aClass66_721.method321();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.aLongArray1975[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.aLongArray1977[var0] = 0L;
		}

		Node_Sub8.anInt1301 = 0;
	}

	static final void method62(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = NpcType.method802(var0, var1, -747958745 * InterfaceNode.floorLevel) - var2;
			var0 -= 282154897 * Projectile.cameraX;
			var4 -= 1447873857 * FriendedPlayer.cameraZ;
			var1 -= -324676025 * Class72.cameraY;
			int var8 = DualNode_Sub13_Sub1.SIN_TABLE[1162853107 * Class67.cameraPitch];
			int var6 = DualNode_Sub13_Sub1.COS_TABLE[1162853107 * Class67.cameraPitch];
			int var3 = DualNode_Sub13_Sub1.SIN_TABLE[Class65.cameraYaw * -210812059];
			int var7 = DualNode_Sub13_Sub1.COS_TABLE[Class65.cameraYaw * -210812059];
			int var5 = var0 * var7 + var1 * var3 >> 16;
			var1 = var7 * var1 - var0 * var3 >> 16;
			var0 = var5;
			var5 = var6 * var4 - var8 * var1 >> 16;
			var1 = var8 * var4 + var1 * var6 >> 16;
			if (var1 >= 50) {
				Client.anInt2093 = (2112468213 * Client.screenHeight / 2 + var0 * Client.screenZoom * -478819715 / var1)
						* 1776163475;
				Client.anInt2094 = -192643311
						* (-478819715 * Client.screenZoom * var5 / var1 + -336695531 * Client.screenWidth / 2);
			} else {
				Client.anInt2093 = -1776163475;
				Client.anInt2094 = 192643311;
			}

		} else {
			Client.anInt2093 = -1776163475;
			Client.anInt2094 = 192643311;
		}
	}
}
