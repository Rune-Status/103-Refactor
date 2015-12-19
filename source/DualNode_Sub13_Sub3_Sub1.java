
public final class DualNode_Sub13_Sub3_Sub1 extends DualNode_Sub13_Sub3 {

	public DualNode_Sub13_Sub3_Sub1(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6,
			byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public DualNode_Sub13_Sub3_Sub1(byte[] var1) {
		super(var1);
	}

	final void method989(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * anInt1575;
		int var8 = anInt1575 - var4;
		int var10 = 0;
		int var11 = 0;
		int var9;
		if (var3 < anInt1573) {
			var9 = anInt1573 - var3;
			var5 -= var9;
			var3 = anInt1573;
			var11 += var9 * var4;
			var7 += var9 * anInt1575;
		}

		if (var3 + var5 > anInt1574) {
			var5 -= var3 + var5 - anInt1574;
		}

		if (var2 < anInt1572) {
			var9 = anInt1572 - var2;
			var4 -= var9;
			var2 = anInt1572;
			var11 += var9;
			var7 += var9;
			var10 += var9;
			var8 += var9;
		}

		if (var2 + var4 > anInt1576) {
			var9 = var2 + var4 - anInt1576;
			var4 -= var9;
			var10 += var9;
			var8 += var9;
		}

		if (var4 > 0 && var5 > 0) {
			method987(anIntArray1571, var1, var6, var11, var7, var4, var5, var8, var10);
		}
	}

	final void method988(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * anInt1575;
		int var12 = anInt1575 - var4;
		int var9 = 0;
		int var11 = 0;
		int var10;
		if (var3 < anInt1573) {
			var10 = anInt1573 - var3;
			var5 -= var10;
			var3 = anInt1573;
			var11 += var10 * var4;
			var8 += var10 * anInt1575;
		}

		if (var3 + var5 > anInt1574) {
			var5 -= var3 + var5 - anInt1574;
		}

		if (var2 < anInt1572) {
			var10 = anInt1572 - var2;
			var4 -= var10;
			var2 = anInt1572;
			var11 += var10;
			var8 += var10;
			var9 += var10;
			var12 += var10;
		}

		if (var2 + var4 > anInt1576) {
			var10 = var2 + var4 - anInt1576;
			var4 -= var10;
			var9 += var10;
			var12 += var10;
		}

		if (var4 > 0 && var5 > 0) {
			method979(anIntArray1571, var1, var6, var11, var8, var4, var5, var12, var9, var7);
		}
	}
}
