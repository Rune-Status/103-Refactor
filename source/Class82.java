import java.awt.Graphics;

public final class Class82 {

	static int anInt686;

	Class82() throws Throwable {
		throw new Error();
	}

	static final void method363(String var0, boolean var1) {
		byte var2 = 4;
		int var3 = 6 + var2;
		int var4 = var2 + 6;
		int var5 = Client.aDualNode_Sub13_Sub3_Sub1_2047.method969(var0, 250);
		int var6 = Client.aDualNode_Sub13_Sub3_Sub1_2047.method970(var0, 250) * 13;
		RSGraphics.method793(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
		RSGraphics.drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 16777215);
		Client.aDualNode_Sub13_Sub3_Sub1_2047.method990(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		DualNode_Sub2.method668(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6);
		if (var1) {
			try {
				Graphics var7 = LandscapeTile.aCanvas1417.getGraphics();
				IndexTable.aClass20_570.method144(var7, 0, 0, -819332484);
			} catch (Exception var12) {
				LandscapeTile.aCanvas1417.repaint();
			}
		} else {
			int var13 = var3;
			int var8 = var4;
			int var9 = var5;
			int var10 = var6;

			for (int var11 = 0; var11 < -580551879 * Client.anInt2168; ++var11) {
				if (Client.anIntArray2173[var11] + Client.anIntArray2175[var11] > var13
						&& Client.anIntArray2173[var11] < var9 + var13
						&& Client.anIntArray2176[var11] + Client.anIntArray2174[var11] > var8
						&& Client.anIntArray2174[var11] < var10 + var8) {
					Client.aBoolArray2171[var11] = true;
				}
			}
		}

	}
}
