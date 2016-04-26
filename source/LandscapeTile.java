import java.awt.Canvas;

public final class LandscapeTile extends Node {

	boolean aBool1402;
	int anInt1403;
	Class31 aClass31_1404;
	Class38 aClass38_1405;
	BoundaryStub boundaryStub;
	static byte[][] aByteArrayArray1406;
	TileDecorationStub tileDecorationStub;
	ItemPile itemPile;
	int anInt1407;
	int anInt1409;
	int anInt1410;
	boolean aBool1411;
	boolean aBool1412;
	BoundaryDecorationStub boundaryDecorationStub;
	int anInt1413;
	int anInt1414;
	LandscapeTile aLandscapeTile1415;
	public static Canvas gameCanvas;
	int anInt1401 = 0;
	EntityMarker[] entityMarkers = new EntityMarker[5];
	int[] anIntArray1408 = new int[5];
	int floorLevel;
	int anInt1416;
	int regionX;
	int regionY;

	public static String method580(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var8 = var0[var1];
			return var8 == null ? "null" : var8.toString();
		} else {
			int var4 = var1 + var2;
			int var3 = 0;

			for (int var9 = var1; var9 < var4; var9++) {
				CharSequence var10 = var0[var9];
				if (var10 == null) {
					var3 += 4;
				} else {
					var3 += var10.length();
				}
			}

			StringBuilder var91 = new StringBuilder(var3);

			for (int var101 = var1; var101 < var4; var101++) {
				CharSequence var6 = var0[var101];
				if (var6 == null) {
					var91.append("null");
				} else {
					var91.append(var6);
				}
			}

			return var91.toString();
		}
	}

	public static boolean method581(char var0) {
		return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
	}

	LandscapeTile(int var1, int var2, int var3) {
		this.anInt1416 = this.floorLevel = var1;
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
