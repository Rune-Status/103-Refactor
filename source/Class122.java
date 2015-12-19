import java.util.Comparator;

final class Class122 implements Comparator {

	static int[] anIntArray818;

	int method451(Class115 var1, Class115 var2) {
		return var1.method440().compareTo(var2.method440());
	}

	public int compare(Object var1, Object var2) {
		return this.method451((Class115) var1, (Class115) var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static final void method452(ByteBuf var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Class39.renderRules[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.getUByte();
				if (var7 == 0) {
					if (var1 == 0) {
						Class39.tileHeights[0][var2][var3] = -Character.method1020(var4 + 932731 + var2,
								var5 + 556238 + var3) * 8;
					} else {
						Class39.tileHeights[var1][var2][var3] = Class39.tileHeights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.getUByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Class39.tileHeights[0][var2][var3] = 8 * -var8;
					} else {
						Class39.tileHeights[var1][var2][var3] = Class39.tileHeights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					Class39.aByteArrayArrayArray429[var1][var2][var3] = var0.getByte();
					DualNode_Sub6.aByteArrayArrayArray1507[var1][var2][var3] = (byte) ((var7 - 2) / 4);
					Class49.aByteArrayArrayArray514[var1][var2][var3] = (byte) (var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Class39.renderRules[var1][var2][var3] = (byte) (var7 - 49);
				} else {
					Class118.aByteArrayArrayArray802[var1][var2][var3] = (byte) (var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.getUByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.getUByte();
					break;
				}

				if (var7 <= 49) {
					var0.getUByte();
				}
			}
		}

	}
}
