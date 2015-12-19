
public class InterfaceNode extends Node {

	static long aLong1397;
	boolean aBool1398 = false;
	static int anInt1399;
	static Landscape landscape;
	static int anInt1400;
	static int floorLevel;
	static ClanMate[] clanMates;
	int type;
	int owner;

	public static DualNode_Sub7 method577(int var0) {
		DualNode_Sub7 var1 = (DualNode_Sub7) DualNode_Sub7.aClass106_1509.method427((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DualNode_Sub7.aClass87_1511.method391(1, var0);
			var1 = new DualNode_Sub7();
			if (var2 != null) {
				var1.method702(new ByteBuf(var2), var0);
			}

			var1.method701();
			DualNode_Sub7.aClass106_1509.method428(var1, (long) var0);
			return var1;
		}
	}

	static final int method578(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - DualNode_Sub13_Sub1.anIntArray1792[1024 * var2 / var3] >> 1;
		return (var4 * var1 >> 16) + (var0 * (65536 - var4) >> 16);
	}

	static final InterfaceNode method579(int var0, int var1, int var2) {
		InterfaceNode var3 = new InterfaceNode();
		var3.type = -1987279243 * var1;
		var3.owner = 296579435 * var2;
		Client.interfaceNodes.put(var3, (long) var0);
		Class28.method173(var1);
		Widget var4 = Class94.method406(var0);
		Class68.method326(var4);
		if (Client.aWidget2135 != null) {
			Class68.method326(Client.aWidget2135);
			Client.aWidget2135 = null;
		}

		DualNode_Sub7.method705();
		ObjectDefinition.method870(Widget.interfaces[var0 >> 16], var4, false);
		Class24.method160(var1);
		if (-1074177723 * Client.anInt2226 != -1) {
			Class65.method319(Client.anInt2226 * -1074177723, 1);
		}

		return var3;
	}

}
