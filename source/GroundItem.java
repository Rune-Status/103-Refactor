
public final class GroundItem extends Entity {

	int quantity;
	static int anInt1840;
	static DualNode_Sub13_Sub2 aDualNode_Sub13_Sub2_1841;
	int anInt1842;

	public static byte[] method991(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[]) ((byte[]) var0);
			return var1 ? Class44.method231(var3) : var3;
		} else if (var0 instanceof Class52) {
			Class52 var2 = (Class52) var0;
			return var2.method258(1130068802);
		} else {
			throw new IllegalArgumentException();
		}
	}

	protected final Model method654(byte var1) {
		return FriendedPlayer.getItemType(this.anInt1842 * -848428919).method811(1308808435 * this.quantity);
	}
}
