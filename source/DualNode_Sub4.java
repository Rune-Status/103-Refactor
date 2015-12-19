
public class DualNode_Sub4 extends DualNode {

	public int anInt1490 = 0;
	static Class106 aClass106_1491 = new Class106(64);
	static Class87 aClass87_1492;
	public char aChar1493;
	public char aChar1494;
	public int anInt1495;
	public int[] anIntArray1496;
	public int[] anIntArray1497;
	public String[] aStringArray1498;
	public String aString1499 = "null";

	void method686(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method687(var1, var2);
		}
	}

	void method687(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.aChar1494 = (char) var1.getUByte();
		} else if (var2 == 2) {
			this.aChar1493 = (char) var1.getUByte();
		} else if (var2 != 3) {
			if (var2 == 4) {
				this.anInt1495 = var1.getInt() * 1683814079;
			} else {
				int var3;
				if (var2 == 5) {
					this.anInt1490 = var1.getUShort() * 1451173443;
					this.anIntArray1496 = new int[this.anInt1490 * 557176427];
					this.aStringArray1498 = new String[this.anInt1490 * 557176427];

					for (var3 = 0; var3 < this.anInt1490 * 557176427; ++var3) {
						this.anIntArray1496[var3] = var1.getInt();
						this.aStringArray1498[var3] = var1.getString();
					}
				} else if (var2 == 6) {
					this.anInt1490 = var1.getUShort() * 1451173443;
					this.anIntArray1496 = new int[this.anInt1490 * 557176427];
					this.anIntArray1497 = new int[557176427 * this.anInt1490];

					for (var3 = 0; var3 < this.anInt1490 * 557176427; ++var3) {
						this.anIntArray1496[var3] = var1.getInt();
						this.anIntArray1497[var3] = var1.getInt();
					}
				}
			}
		} else {
			this.aString1499 = var1.getString();
		}

	}

	static final boolean method688(char var0) {
		return var0 == 160 || var0 == 32 || var0 == 95 || var0 == 45;
	}

	public static void method689() {
		DualNode_Sub1.aClass106_1445.method429();
		DualNode_Sub1.aClass106_1442.method429();
	}

	static final String method690(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + Class35.aString387 + var1.substring(var2);
		}

		return var1.length() > 9 ? " " + Class48_Sub1.method545('\uff80') + var1.substring(0, var1.length() - 8)
				+ GameStrings.aString1004 + " " + Class35.aString389 + var1 + Class35.aString392 + Class35.aString393
				: (var1.length() > 6
						? " " + Class48_Sub1.method545(16777215) + var1.substring(0, var1.length() - 4)
								+ GameStrings.aString1064 + " " + Class35.aString389 + var1 + Class35.aString392
								+ Class35.aString393
						: " " + Class48_Sub1.method545(16776960) + var1 + Class35.aString393);
	}

	static final void method691(InterfaceNode var0, boolean var1) {
		int var2 = 226793949 * var0.type;
		int var3 = (int) var0.key;
		var0.unlink();
		if (var1) {
			Class53.method275(var2);
		}

		for (WidgetConfig var4 = (WidgetConfig) Client.widgetConfigs
				.method150(); var4 != null; var4 = (WidgetConfig) Client.widgetConfigs.method151()) {
			if ((var4.key >> 48 & 65535L) == (long) var2) {
				var4.unlink();
			}
		}

		Widget var5 = Class94.method406(var3);
		if (var5 != null) {
			Class68.method326(var5);
		}

		DualNode_Sub7.method705();
		if (-1074177723 * Client.anInt2226 != -1) {
			Class65.method319(-1074177723 * Client.anInt2226, 1);
		}

	}
}
