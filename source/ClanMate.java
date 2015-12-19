
public class ClanMate extends Node {

	int world;
	byte rank;
	static boolean aBool1221;
	protected static int anInt1222;
	String aString1223;
	String displayName;

	public static DualNode_Sub6 method514(int var0) {
		DualNode_Sub6 var1 = (DualNode_Sub6) DualNode_Sub6.aClass106_1504.method427((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DualNode_Sub6.aClass87_1506.method391(15, var0);
			var1 = new DualNode_Sub6();
			if (var2 != null) {
				var1.method696(new ByteBuf(var2));
			}

			DualNode_Sub6.aClass106_1504.method428(var1, (long) var0);
			return var1;
		}
	}
}
