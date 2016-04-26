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

	static final void loadTerrain(ByteBuf buf, int plane, int x, int y, int chunkX, int chunkY, int shapeOffset) {
		int attribute;
		if (x >= 0 && x < 104 && y >= 0 && y < 104) {
			Class39.renderRules[plane][x][y] = 0;

			while (true) {
				attribute = buf.getUByte();
				if (attribute == 0) {
					if (plane == 0) {
						Class39.tileHeights[0][x][y] = -Character.calculateTileHeight(chunkX + 932731 + x,
								chunkY + 556238 + y) * 8;
					} else {
						Class39.tileHeights[plane][x][y] = Class39.tileHeights[plane - 1][x][y] - 240;
					}
					break;
				}

				if (attribute == 1) {
					int height = buf.getUByte();
					if (height == 1) {
						height = 0;
					}

					if (plane == 0) {
						Class39.tileHeights[0][x][y] = -height * 8;
					} else {
						Class39.tileHeights[plane][x][y] = Class39.tileHeights[plane - 1][x][y] - height * 8;
					}
					break;
				}

				if (attribute <= 49) {
					Class39.overlayIds[plane][x][y] = buf.getByte();
					VarClientStringType.overlayPaths[plane][x][y] = (byte) ((attribute - 2) / 4);
					GZipDecompressor.overlayRotations[plane][x][y] = (byte) (attribute - 2 + shapeOffset & 0x3);
				} else if (attribute <= 81) {
					Class39.renderRules[plane][x][y] = (byte) (attribute - 49);
				} else {
					Class118.underlayIds[plane][x][y] = (byte) (attribute - 81);
				}
			}
		} else {
			while (true) {
				attribute = buf.getUByte();
				if (attribute == 0) {
					break;
				}

				if (attribute == 1) {
					buf.getUByte();
					break;
				}

				if (attribute <= 49) {
					buf.getUByte();
				}
			}
		}

	}

}
