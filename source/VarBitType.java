import java.awt.Component;

public class VarBitType extends DualNode {

	public static AbstractIndex varbit_ref;
	static Picture[] pkIcons;
	public int varp;
	public int lowBit;
	public int highBit;
	static NodeMap varbits = new NodeMap(64);

	void decode(ByteBuf var1) {
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
			this.varp = var1.getUShort();
			this.lowBit = var1.getUByte();
			this.highBit = var1.getUByte();
		}

	}

	public static void setKeyFocusListener(Component comp) {
		comp.setFocusTraversalKeysEnabled(false);
		comp.addKeyListener(KeyFocusListener.kfListener);
		comp.addFocusListener(KeyFocusListener.kfListener);
	}

	static final void method877(Sprite var0) {
		short var1 = 256;

		int var5;
		for (var5 = 0; var5 < CalledScript.anIntArray365.length; var5++) {
			CalledScript.anIntArray365[var5] = 0;
		}

		int var2;
		for (var5 = 0; var5 < 5000; var5++) {
			var2 = (int) (Math.random() * 128.0D * (double) var1);
			CalledScript.anIntArray365[var2] = (int) (Math.random() * 256.0D);
		}

		int var3;
		int var4;
		for (var5 = 0; var5 < 20; var5++) {
			for (var2 = 1; var2 < var1 - 1; var2++) {
				for (var3 = 1; var3 < 127; var3++) {
					var4 = (var2 << 7) + var3;
					Permission.anIntArray605[var4] = (CalledScript.anIntArray365[var4 + 128]
							+ CalledScript.anIntArray365[var4 - 128] + CalledScript.anIntArray365[var4 + 1]
							+ CalledScript.anIntArray365[var4 - 1]) / 4;
				}
			}

			int[] var6 = CalledScript.anIntArray365;
			CalledScript.anIntArray365 = Permission.anIntArray605;
			Permission.anIntArray605 = var6;
		}

		if (var0 != null) {
			var5 = 0;

			for (var2 = 0; var2 < var0.subHeight; var2++) {
				for (var3 = 0; var3 < var0.subWidth; var3++) {
					if (var0.pixels[var5++] != 0) {
						var4 = var0.offsetX + 16 + var3;
						int var8 = var2 + 16 + var0.offsetY;
						int var7 = (var8 << 7) + var4;
						CalledScript.anIntArray365[var7] = 0;
					}
				}
			}
		}

	}

	static char method878(char var0) {
		return var0 != 181 && var0 != 402 ? java.lang.Character.toTitleCase(var0) : var0;
	}

}
