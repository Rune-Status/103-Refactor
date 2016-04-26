public class Class48_Sub1 extends Class48 {

	static CacheIndex landscapesIndex;
	static Picture aSprite1296;
	static Class124 aClass124_1297;
	static int anInt1298;
	static int anInt1299;

	protected boolean method245(int var1, int var2, int var3, CollisionMap var4, int var5) {
		return this.anInt511 == var2 && this.anInt509 == var3;
	}

	static final int method544() {
		if (AnimationSkin.settings.hideRoofs) {
			return InterfaceNode.floorLevel * -1331355705;
		} else {
			int var0 = NpcType.method802(Projectile.cameraX, Class72.cameraY, InterfaceNode.floorLevel * -1331355705);
			return var0 - FriendedPlayer.cameraZ < 800 && (Class39.renderRules[InterfaceNode.floorLevel
					* -1331355705][Projectile.cameraX >> 7][Class72.cameraY >> 7] & 0x4) != 0
							? InterfaceNode.floorLevel * -1331355705 : 3;
		}
	}

	static String method545(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

}
