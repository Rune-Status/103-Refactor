
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

	public static UnderlayType getUnderlayType(int id) {
		UnderlayType type = (UnderlayType) UnderlayType.underlays.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = UnderlayType.underlay_ref.getFile(1, id);
			type = new UnderlayType();
			if (bytes != null) {
				type.decode(new ByteBuf(bytes), id);
			}

			type.post();
			UnderlayType.underlays.put(type, (long) id);
			return type;
		}
	}

	static final int method578(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - TexturedGraphic.COS_TABLE[1024 * var2 / var3] >> 1;
		return (var4 * var1 >> 16) + (var0 * (65536 - var4) >> 16);
	}

	static final InterfaceNode method579(int var0, int var1, int var2) {
		InterfaceNode var3 = new InterfaceNode();
		var3.type = -1987279243 * var1;
		var3.owner = 296579435 * var2;
		Client.interfaceNodes.put(var3, (long) var0);
		VarClientHub.method173(var1);
		Widget var4 = Class94.getWidget(var0);
		Class68.method326(var4);
		if (Client.aWidget2135 != null) {
			Class68.method326(Client.aWidget2135);
			Client.aWidget2135 = null;
		}

		UnderlayType.method705();
		ObjectType.method870(Widget.interfaces[var0 >> 16], var4, false);
		Class24.method160(var1);
		if (-1074177723 * Client.anInt2226 != -1) {
			Class65.method319(Client.anInt2226 * -1074177723, 1);
		}

		return var3;
	}

}
