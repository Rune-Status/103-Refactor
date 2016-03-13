
public final class GroundItem extends Entity {

	int quantity;
	static int anInt1840;
	static Sprite aDualNode_Sub13_Sub2_1841;
	int anInt1842;

	public static byte[] toByteArray(Object obj, boolean copy) {
		if (obj == null) {
			return null;
		} else if (obj instanceof byte[]) {
			byte[] bytes = (byte[]) obj;
			return copy ? Class44.arrayCopy(bytes) : bytes;
		} else if (obj instanceof AbstractByteBuffer) {
			AbstractByteBuffer buffer = (AbstractByteBuffer) obj;
			return buffer.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	protected final Model method654(byte var1) {
		return FriendedPlayer.getItemType(this.anInt1842 * -848428919).method811(1308808435 * this.quantity);
	}
}
