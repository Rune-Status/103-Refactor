public class Class93 {

	public static ByteBuf aBuffer731;
	static int[] anIntArray732;
	static Picture[] aSpriteArray733;

	Class93() throws Throwable {
		throw new Error();
	}

	static final void loadTerrain(byte[] bytes, int baseX, int baseY, int xOffset, int yOffset, CollisionMap[] maps) {
		int plane;
		int x;
		for (int buf = 0; buf < 4; buf++) {
			for (plane = 0; plane < 64; plane++) {
				for (x = 0; x < 64; x++) {
					if (baseX + plane > 0 && plane + baseX < 103 && baseY + x > 0 && x + baseY < 103) {
						maps[buf].flags[plane + baseX][x + baseY] &= -16777217;
					}
				}
			}
		}

		ByteBuf buf = new ByteBuf(bytes);

		for (plane = 0; plane < 4; plane++) {
			for (x = 0; x < 64; x++) {
				for (int y = 0; y < 64; y++) {
					Class122.loadTerrain(buf, plane, baseX + x, baseY + y, xOffset, yOffset, 0);
				}
			}
		}

	}

}
