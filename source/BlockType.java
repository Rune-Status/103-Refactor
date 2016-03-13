
public class BlockType implements IOrdinal {

	public static BlockType TRUST = new BlockType(1, 0);
	public static boolean aBool725;
	public static BlockType NORMAL = new BlockType(0, 2);
	public static BlockType PIN = new BlockType(3, 3);
	public int type;
	public static BlockType PIN_TRUST = new BlockType(2, 1);
	int ordinal;

	public int ordinal() {
		return this.ordinal * -466235689;
	}

	BlockType(int var1, int var2) {
		this.type = var1 * 1830041961;
		this.ordinal = 832636135 * var2;
	}
}
