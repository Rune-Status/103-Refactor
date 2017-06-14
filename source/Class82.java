import java.awt.Graphics;

public final class Class82 {

	static int mainPort;

	Class82() throws Throwable {
		throw new Error();
	}

	static final void method363(String var0, boolean var1) {
		byte var2 = 4;
		int var3 = var2 + 6;
		int var4 = var2 + 6;
		int var5 = Client.p12_full.method969(var0, 250);
		int var6 = Client.p12_full.method970(var0, 250) * 13;
		Raster.method793(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
		Raster.drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 16777215);
		Client.p12_full.method990(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		IdentKitType.method668(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6);
		if (var1) {
			try {
				Graphics var13 = LandscapeTile.gameCanvas.getGraphics();
				IndexTable.imageProducer.drawImage(var13, 0, 0);
			} catch (Exception var12) {
				LandscapeTile.gameCanvas.repaint();
			}
		} else {
			int var131 = var3;
			int var8 = var4;
			int var9 = var5;
			int var10 = var6;

			for (int var11 = 0; var11 < Client.anInt2168; var11++) {
				if (Client.anIntArray2173[var11] + Client.anIntArray2175[var11] > var131
						&& Client.anIntArray2173[var11] < var9 + var131
						&& Client.anIntArray2176[var11] + Client.anIntArray2174[var11] > var8
						&& Client.anIntArray2174[var11] < var10 + var8) {
					Client.aBoolArray2171[var11] = true;
				}
			}
		}

	}

}
