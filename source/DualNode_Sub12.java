
public class DualNode_Sub12 extends DualNode {

	Class23[] aClass23Array1568;
	static int[][] regionXTEAs;

	public boolean method776(int var1, byte var2) {
		return this.aClass23Array1568[var1].aBool297;
	}

	public DualNode_Sub12(Class87 var1, Class87 var2, int var3, boolean var4) {
		Deque var5 = new Deque();
		int var6 = var1.fileCount(var3);
		this.aClass23Array1568 = new Class23[var6];
		int[] var7 = var1.method394(var3);
		int var8 = 0;

		while (var8 < var7.length) {
			byte[] var9 = var1.getFile(var3, var7[var8]);
			Node_Sub5 var10 = null;
			int var12 = (var9[0] & 255) << 8 | var9[1] & 255;
			Node_Sub5 var11 = (Node_Sub5) var5.method471();

			while (true) {
				if (var11 != null) {
					if (var12 != -207314411 * var11.anInt1263) {
						var11 = (Node_Sub5) var5.method473();
						continue;
					}

					var10 = var11;
				}

				if (var10 == null) {
					byte[] var13;
					if (var4) {
						var13 = var2.method390(0, var12);
					} else {
						var13 = var2.method390(var12, 0);
					}

					var10 = new Node_Sub5(var12, var13);
					var5.method475(var10);
				}

				this.aClass23Array1568[var7[var8]] = new Class23(var9, var10);
				++var8;
				break;
			}
		}

	}

	static final void method777(Character var0, int var1) {
		Class2.method62(1272643751 * var0.strictX, -1801433343 * var0.strictY, var1);
	}

	static Class66 method778(int var0) {
		try {
			return new Class66_Sub1();
		} catch (Throwable var2) {
			return new Class66_Sub2();
		}
	}
}
