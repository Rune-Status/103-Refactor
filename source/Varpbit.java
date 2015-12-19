import java.awt.Component;

public class Varpbit extends DualNode {

	public int lowBit;
	static Class106 aClass106_1726 = new Class106(64);
	public int varp;
	public static Class87 aClass87_1727;
	static Sprite[] aSpriteArray1728;
	public int highBit;

	void method874(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method875(var1, var2);
		}
	}

	void method875(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.varp = var1.getUShort() * 115382813;
			this.lowBit = var1.getUByte() * 1344997181;
			this.highBit = var1.getUByte() * 2051968657;
		}

	}

	public static void method876(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(Class71.aClass71_603);
		var0.addFocusListener(Class71.aClass71_603);
	}

	static final void method877(DualNode_Sub13_Sub2 var0) {
		short var1 = 256;

		int var5;
		for (var5 = 0; var5 < Class33.anIntArray365.length; ++var5) {
			Class33.anIntArray365[var5] = 0;
		}

		int var2;
		for (var5 = 0; var5 < 5000; ++var5) {
			var2 = (int) (Math.random() * 128.0D * (double) var1);
			Class33.anIntArray365[var2] = (int) (Math.random() * 256.0D);
		}

		int var3;
		int var4;
		for (var5 = 0; var5 < 20; ++var5) {
			for (var2 = 1; var2 < var1 - 1; ++var2) {
				for (var3 = 1; var3 < 127; ++var3) {
					var4 = (var2 << 7) + var3;
					Class73.anIntArray605[var4] = (Class33.anIntArray365[var4 + 128] + Class33.anIntArray365[var4 - 128]
							+ Class33.anIntArray365[1 + var4] + Class33.anIntArray365[var4 - 1]) / 4;
				}
			}

			int[] var8 = Class33.anIntArray365;
			Class33.anIntArray365 = Class73.anIntArray605;
			Class73.anIntArray605 = var8;
		}

		if (var0 != null) {
			var5 = 0;

			for (var2 = 0; var2 < var0.anInt1801; ++var2) {
				for (var3 = 0; var3 < var0.anInt1800; ++var3) {
					if (var0.aByteArray1799[var5++] != 0) {
						var4 = var0.anInt1803 + 16 + var3;
						int var6 = var2 + 16 + var0.anInt1802;
						int var7 = var4 + (var6 << 7);
						Class33.anIntArray365[var7] = 0;
					}
				}
			}
		}

	}

	static char method878(char var0) {
		return var0 != 181 && var0 != 402 ? java.lang.Character.toTitleCase(var0) : var0;
	}
}
