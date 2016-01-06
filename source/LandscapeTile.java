import java.awt.Canvas;

public final class LandscapeTile extends Node {

	int anInt1401 = 0;
	boolean aBool1402;
	EntityMarker[] entityMarkers = new EntityMarker[5];
	int anInt1403;
	Class31 aClass31_1404;
	Class38 aClass38_1405;
	BoundaryStub boundaryStub;
	static byte[][] aByteArrayArray1406;
	TileDecorationStub tileDecorationStub;
	ItemPile itemPile;
	int anInt1407;
	int regionX;
	int[] anIntArray1408 = new int[5];
	int anInt1409;
	int anInt1410;
	boolean aBool1411;
	boolean aBool1412;
	BoundaryDecorationStub boundaryDecorationStub;
	int regionY;
	int floorLevel;
	int anInt1413;
	int anInt1414;
	LandscapeTile aLandscapeTile1415;
	int anInt1416;
	public static Canvas gameCanvas;

	public static String method580(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var8 = var0[var1];
			return var8 == null ? "null" : var8.toString();
		} else {
			int var4 = var1 + var2;
			int var3 = 0;

			for (int var5 = var1; var5 < var4; ++var5) {
				CharSequence var7 = var0[var5];
				if (var7 == null) {
					var3 += 4;
				} else {
					var3 += var7.length();
				}
			}

			StringBuilder var9 = new StringBuilder(var3);

			for (int var10 = var1; var10 < var4; ++var10) {
				CharSequence var6 = var0[var10];
				if (var6 == null) {
					var9.append("null");
				} else {
					var9.append(var6);
				}
			}

			return var9.toString();
		}
	}

	public static boolean method581(char var0) {
		return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
	}

	LandscapeTile(int var1, int var2, int var3) {
		this.anInt1416 = (this.floorLevel = var1 * 1947863287) * -1721304699;
		this.regionX = 1788229931 * var2;
		this.regionY = -512286351 * var3;
	}

	public static String getString(byte[] bytes, int offset, int length) {
		char[] chars = new char[length];
		int count = 0;

		for (int var6 = 0; var6 < length; ++var6) {
			int val = bytes[offset + var6] & 255;
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
