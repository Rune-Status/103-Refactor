public final class GroundItem extends Entity {

	int quantity;
	static int anInt1840;
	static IndexedSprite aDualNode_Sub13_Sub2_1841;
	int anInt1842;

	public static byte[] toByteArray(Object obj, boolean copy) {
		if (obj == null) {
			return null;
		} else if (obj instanceof byte[]) {
			byte[] buffer1 = (byte[]) ((byte[]) obj);
			return copy ? Class44.arrayCopy(buffer1) : buffer1;
		} else if (obj instanceof AbstractByteBuffer) {
			AbstractByteBuffer buffer = (AbstractByteBuffer) obj;
			return buffer.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	protected final Model getModel(byte var1) {
		return FriendedPlayer.getItemType(this.anInt1842).method811(this.quantity);
	}

}
