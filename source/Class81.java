import java.util.zip.CRC32;

public class Class81 {

	public static Connection aClass60_666;
	public static int anInt667 = 0;
	public static long aLong668;
	public static int anInt669 = 0;
	public static int anInt670 = 0;
	public static byte aByte671 = 0;
	public static Class105 aClass105_672 = new Class105();
	static NodeTable aNodeTable673 = new NodeTable(4096);
	public static int anInt674 = 0;
	public static NodeTable aNodeTable675 = new NodeTable(4096);
	public static int anInt676 = 0;
	public static ByteBuf aBuffer677 = new ByteBuf(8);
	public static ByteBuf aBuffer678;
	public static int anInt679 = 0;
	public static CRC32 aCRC32_680 = new CRC32();
	public static CacheIndex[] aClass87_Sub1Array681 = new CacheIndex[256];
	public static NodeTable aNodeTable682 = new NodeTable(32);
	public static int anInt683 = 0;
	public static int anInt684 = 0;
	public static NodeTable aNodeTable685 = new NodeTable(4096);

	static final void method361() {
		if (1121410397 * Client.anInt2045 > 0) {
			logout();
		} else {
			Node_Sub8.method550(40);
			Class35.aClass60_394 = Class31.gameConnection;
			Class31.gameConnection = null;
		}
	}

	static final void logout() {
		if (Class31.gameConnection != null) {
			Class31.gameConnection.shutdown();
			Class31.gameConnection = null;
		}

		Class66.method325();
		InterfaceNode.landscape.method15();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].method244();
		}

		System.gc();
		Class65.method320(2);
		Client.anInt2202 = 277612363;
		Client.aBool2191 = false;

		for (Node_Sub6 var1 = (Node_Sub6) Node_Sub6.aDeque1279
				.method471(); var1 != null; var1 = (Node_Sub6) Node_Sub6.aDeque1279.method473()) {
			if (var1.aNode_Sub4_Sub2_1276 != null) {
				FriendedPlayer.aNode_Sub4_Sub1_740.method730(var1.aNode_Sub4_Sub2_1276);
				var1.aNode_Sub4_Sub2_1276 = null;
			}

			if (var1.aNode_Sub4_Sub2_1280 != null) {
				FriendedPlayer.aNode_Sub4_Sub1_740.method730(var1.aNode_Sub4_Sub2_1280);
				var1.aNode_Sub4_Sub2_1280 = null;
			}
		}

		Node_Sub6.aDeque1279.method467();
		Node_Sub8.method550(10);
	}

	Class81() throws Throwable {
		throw new Error();
	}
}
