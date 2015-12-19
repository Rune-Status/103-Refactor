
public class DualNode_Sub11 extends DualNode {

	public static int[] anIntArray1544;
	static Class106 aClass106_1545 = new Class106(64);
	public int anInt1546 = 0;
	public static int anInt1547;
	static Class87 aClass87_1548;

	void method723(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method726(var1, var2);
		}
	}

	static int method724() {
		return (Class32.anInt358 += -1265413871) * 1518714865 - 1;
	}

	static Widget method725(Widget var0) {
		int var1 = Class87_Sub1.method555(Class30.getWidgetConfig(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = Class94.method406(var0.parentId * -1652479707);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}

	void method726(ByteBuf var1, int var2) {
		if (var2 == 5) {
			this.anInt1546 = var1.getUShort() * -205219945;
		}

	}

	public static void method727() {
		aClass106_1545.method429();
	}

	public static String method728(CharSequence var0, Class124 var1) {
		if (var0 == null) {
			return null;
		} else {
			int var4 = 0;

			int var5;
			for (var5 = var0.length(); var4 < var5 && DualNode_Sub4.method688(var0.charAt(var4)); ++var4) {
				;
			}

			while (var5 > var4 && DualNode_Sub4.method688(var0.charAt(var5 - 1))) {
				--var5;
			}

			int var2 = var5 - var4;
			if (var2 >= 1 && var2 <= DualNode_Sub5.method693(var1)) {
				StringBuilder var3 = new StringBuilder(var2);

				for (int var8 = var4; var8 < var5; ++var8) {
					char var6 = var0.charAt(var8);
					if (Node_Sub10.method565(var6)) {
						char var7 = Class39.method216(var6);
						if (var7 != 0) {
							var3.append(var7);
						}
					}
				}

				if (var3.length() == 0) {
					return null;
				} else {
					return var3.toString();
				}
			} else {
				return null;
			}
		}
	}

	public static NpcDefinition getNpcDefinition(int var0) {
		NpcDefinition var1 = (NpcDefinition) NpcDefinition.aClass106_1580.method427((long) var0);
		if (var1 == null) {
			byte[] var2 = Class84.aClass87_689.method391(9, var0);
			var1 = new NpcDefinition();
			var1.anInt1579 = 95406197 * var0;
			if (var2 != null) {
				var1.method801(new ByteBuf(var2));
			}

			var1.method798();
			NpcDefinition.aClass106_1580.method428(var1, (long) var0);
			return var1;
		} else {
			return var1;
		}
	}
}
