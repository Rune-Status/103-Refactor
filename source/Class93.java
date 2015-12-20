
public class Class93 {

	public static ByteBuf aBuffer731;
	static int[] anIntArray732;
	static Sprite[] aSpriteArray733;

	Class93() throws Throwable {
		throw new Error();
	}

	static final void method404(byte[] var0, int var1, int var2, int var3, int var4, CollionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < 64; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					if (var1 + var7 > 0 && var7 + var1 < 103 && var2 + var8 > 0 && var8 + var2 < 103) {
						var5[var6].flags[var7 + var1][var8 + var2] &= -16777217;
					}
				}
			}
		}

		ByteBuf var10 = new ByteBuf(var0);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					Class122.method452(var10, var7, var1 + var8, var2 + var9, var3, var4, 0);
				}
			}
		}

	}
}
