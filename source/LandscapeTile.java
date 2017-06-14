import java.awt.Canvas;

public final class LandscapeTile extends Node {

	boolean drawEntities;
	int wallUncullDirection;
	TileUnderlay underlay;
	TileOverlay overlay;
	BoundaryStub wall;
	static byte[][] aByteArrayArray1406;
	TileDecorationStub tileDecorationStub;
	ItemPile itemPile;
	int entityCount;
	int wallCullDirection;
	int physicalLevel;
	boolean draw;
	boolean visible;
	BoundaryDecorationStub boundaryDecorationStub;
	int wallCullOppositeDirection;
	int wallDrawFlags;
	LandscapeTile bridge;
	public static Canvas gameCanvas;
	int flags = 0;
	EntityMarker[] entityMarkers = new EntityMarker[5];
	int[] entityFlags = new int[5];
	int level;
	int renderLevel;
	int regionX;
	int regionY;

	public static String appendStrings(CharSequence[] stack, int stringIndex, int count) {
		if (count == 0) {
			return "";
		} else if (count == 1) {
			CharSequence seq = stack[stringIndex];
			return seq == null ? "null" : seq.toString();
		} else {
			int endIndex = stringIndex + count;
			int length = 0;

			for (int index = stringIndex; index < endIndex; index++) {
				CharSequence seq = stack[index];
				if (seq == null) {
					length += 4;
				} else {
					length += seq.length();
				}
			}

			StringBuilder bldr = new StringBuilder(length);

			for (int index = stringIndex; index < endIndex; index++) {
				CharSequence seq = stack[index];
				if (seq == null) {
					bldr.append("null");
				} else {
					bldr.append(seq);
				}
			}

			return bldr.toString();
		}
	}

	public static boolean method581(char var0) {
		return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
	}

	LandscapeTile(int var1, int var2, int var3) {
		this.renderLevel = this.level = var1;
		this.regionX = var2;
		this.regionY = var3;
	}

	public static String getString(byte[] bytes, int offset, int length) {
		char[] chars = new char[length];
		int count = 0;

		for (int var6 = 0; var6 < length; var6++) {
			int val = bytes[offset + var6] & 0xff;
			if (val != 0) {
				if (val >= 128 && val < 160) {
					char c = Class85.characters[val - 128];
					if (c == 0) {
						c = 63;
					}

					val = c;
				}

				chars[count++] = (char) val;
			}
		}

		return new String(chars, 0, count);
	}

}
