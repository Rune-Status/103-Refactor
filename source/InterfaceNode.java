public class InterfaceNode extends Node {

	static long aLong1397;
	static int anInt1399;
	static Landscape landscape;
	static int anInt1400;
	static int floorLevel;
	static ClanMate[] clanMates;
	boolean aBool1398 = false;
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

	static final int getCosineLerp(int a, int b, int ft, int frac) {
		int f = 65536 - Graphics3D.COS_TABLE[ft * 1024 / frac] >> 1;
		return (f * b >> 16) + ((65536 - f) * a >> 16);
	}

	static final InterfaceNode method579(int var0, int var1, int var2) {
		InterfaceNode var3 = new InterfaceNode();
		var3.type = var1;
		var3.owner = var2;
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
		ClientSettings.method160(var1);
		if (Client.anInt2226 != -1) {
			Class65.method319(Client.anInt2226, 1);
		}

		return var3;
	}

}
