
public class Class48_Sub1 extends Class48 {

	static CacheIndex landscapesIndex;
	static Picture aSprite1296;
	static Class124 aClass124_1297;
	static int anInt1298;
	static int anInt1299;

	protected boolean method245(int var1, int var2, int var3, CollisionMap var4, int var5) {
		return 2014068737 * this.anInt511 == var2 && this.anInt509 * -1876894601 == var3;
	}

	static final int method544() {
		if (AnimationSkin.settings.hideRoofs) {
			return -747958745 * InterfaceNode.floorLevel;
		} else {
			int var0 = NpcType.method802(282154897 * Projectile.cameraX, -324676025 * Class72.cameraY,
					InterfaceNode.floorLevel * -747958745);
			return var0 - 1447873857 * FriendedPlayer.cameraZ < 800 && (Class39.renderRules[InterfaceNode.floorLevel
					* -747958745][Projectile.cameraX * 282154897 >> 7][Class72.cameraY * -324676025 >> 7] & 4) != 0
							? InterfaceNode.floorLevel * -747958745 : 3;
		}
	}

	static String method545(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
