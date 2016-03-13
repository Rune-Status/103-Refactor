
public class Class93 {

	public static ByteBuf aBuffer731;
	static int[] anIntArray732;
	static Picture[] aSpriteArray733;

	Class93() throws Throwable {
		throw new Error();
	}

	static final void method404(byte[] bytes, int baseX, int baseY, int xOffset, int yOffset, CollisionMap[] maps) {
		for (int plane = 0; plane < 4; ++plane) {
			for (int x = 0; x < 64; ++x) {
				for (int y = 0; y < 64; ++y) {
					if (baseX + x > 0 && x + baseX < 103 && baseY + y > 0 && y + baseY < 103) {
						maps[plane].flags[x + baseX][y + baseY] &= -16777217;
					}
				}
			}
		}

		ByteBuf buf = new ByteBuf(bytes);

		for (int plane = 0; plane < 4; ++plane) {
			for (int x = 0; x < 64; ++x) {
				for (int y = 0; y < 64; ++y) {
					Class122.method452(buf, plane, baseX + x, baseY + y, xOffset, yOffset, 0);
				}
			}
		}

	}
}
