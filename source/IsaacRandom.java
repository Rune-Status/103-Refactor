import java.awt.FontMetrics;

public final class IsaacRandom {

	static int anInt97;
	protected static FontMetrics helveticaMetrics;
	public static TaskManager taskManager;
	int anInt101;
	int anInt100;
	int anInt99;
	int anInt96;
	int[] anIntArray103 = new int[256];
	int[] anIntArray104 = new int[256];

	static final void method63() {
		Client.outBuffer.putHeader(217);

		for (InterfaceNode var0 = (InterfaceNode) Client.interfaceNodes
				.method150(); var0 != null; var0 = (InterfaceNode) Client.interfaceNodes.method151()) {
			if (var0.owner == 0 || var0.owner == 3) {
				EnumType.method691(var0, true);
			}
		}

		if (Client.aWidget2135 != null) {
			Class68.method326(Client.aWidget2135);
			Client.aWidget2135 = null;
		}

	}

	final void method64() {
		this.anInt100 += (this.anInt101 += 1361805117) * -1861103595;

		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.anIntArray103[var1];
			if ((var1 & 0x2) == 0) {
				if ((var1 & 0x1) == 0) {
					this.anInt99 ^= this.anInt99 << 13;
				} else {
					this.anInt99 ^= this.anInt99 >>> 6;
				}
			} else if ((var1 & 0x1) == 0) {
				this.anInt99 ^= this.anInt99 << 2;
			} else {
				this.anInt99 ^= this.anInt99 >>> 16;
			}

			this.anInt99 += this.anIntArray103[var1 + 128 & 0xff];
			int var3;
			this.anIntArray103[var1] = var3 = this.anIntArray103[(var2 & 0x3fc) >> 2] + this.anInt99 + this.anInt100;
			this.anIntArray104[var1] = this.anInt100 = this.anIntArray103[(var3 >> 8 & 0x3fc) >> 2] + var2;
		}

	}

	final void method65() {
		int var1 = -1640531527;
		int var9 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;
		int var5 = -1640531527;
		int var8 = -1640531527;
		int var6 = -1640531527;
		int var7 = -1640531527;

		int var4;
		for (var4 = 0; var4 < 4; var4++) {
			var7 ^= var6 << 11;
			var5 += var7;
			var6 += var8;
			var6 ^= var8 >>> 2;
			var2 += var6;
			var8 += var5;
			var8 ^= var5 << 8;
			var3 += var8;
			var5 += var2;
			var5 ^= var2 >>> 16;
			var9 += var5;
			var2 += var3;
			var2 ^= var3 << 10;
			var1 += var2;
			var3 += var9;
			var3 ^= var9 >>> 4;
			var7 += var3;
			var9 += var1;
			var9 ^= var1 << 8;
			var6 += var9;
			var1 += var7;
			var1 ^= var7 >>> 9;
			var8 += var1;
			var7 += var6;
		}

		for (var4 = 0; var4 < 256; var4 += 8) {
			var7 += this.anIntArray104[var4];
			var6 += this.anIntArray104[var4 + 1];
			var8 += this.anIntArray104[var4 + 2];
			var5 += this.anIntArray104[var4 + 3];
			var2 += this.anIntArray104[var4 + 4];
			var3 += this.anIntArray104[var4 + 5];
			var9 += this.anIntArray104[var4 + 6];
			var1 += this.anIntArray104[var4 + 7];
			var7 ^= var6 << 11;
			var5 += var7;
			var6 += var8;
			var6 ^= var8 >>> 2;
			var2 += var6;
			var8 += var5;
			var8 ^= var5 << 8;
			var3 += var8;
			var5 += var2;
			var5 ^= var2 >>> 16;
			var9 += var5;
			var2 += var3;
			var2 ^= var3 << 10;
			var1 += var2;
			var3 += var9;
			var3 ^= var9 >>> 4;
			var7 += var3;
			var9 += var1;
			var9 ^= var1 << 8;
			var6 += var9;
			var1 += var7;
			var1 ^= var7 >>> 9;
			var8 += var1;
			var7 += var6;
			this.anIntArray103[var4] = var7;
			this.anIntArray103[var4 + 1] = var6;
			this.anIntArray103[var4 + 2] = var8;
			this.anIntArray103[var4 + 3] = var5;
			this.anIntArray103[var4 + 4] = var2;
			this.anIntArray103[var4 + 5] = var3;
			this.anIntArray103[var4 + 6] = var9;
			this.anIntArray103[var4 + 7] = var1;
		}

		for (var4 = 0; var4 < 256; var4 += 8) {
			var7 += this.anIntArray103[var4];
			var6 += this.anIntArray103[var4 + 1];
			var8 += this.anIntArray103[var4 + 2];
			var5 += this.anIntArray103[var4 + 3];
			var2 += this.anIntArray103[var4 + 4];
			var3 += this.anIntArray103[var4 + 5];
			var9 += this.anIntArray103[var4 + 6];
			var1 += this.anIntArray103[var4 + 7];
			var7 ^= var6 << 11;
			var5 += var7;
			var6 += var8;
			var6 ^= var8 >>> 2;
			var2 += var6;
			var8 += var5;
			var8 ^= var5 << 8;
			var3 += var8;
			var5 += var2;
			var5 ^= var2 >>> 16;
			var9 += var5;
			var2 += var3;
			var2 ^= var3 << 10;
			var1 += var2;
			var3 += var9;
			var3 ^= var9 >>> 4;
			var7 += var3;
			var9 += var1;
			var9 ^= var1 << 8;
			var6 += var9;
			var1 += var7;
			var1 ^= var7 >>> 9;
			var8 += var1;
			var7 += var6;
			this.anIntArray103[var4] = var7;
			this.anIntArray103[var4 + 1] = var6;
			this.anIntArray103[var4 + 2] = var8;
			this.anIntArray103[var4 + 3] = var5;
			this.anIntArray103[var4 + 4] = var2;
			this.anIntArray103[var4 + 5] = var3;
			this.anIntArray103[var4 + 6] = var9;
			this.anIntArray103[var4 + 7] = var1;
		}

		this.method64();
		this.anInt96 = 256;
	}

	IsaacRandom(int[] var1) {
		for (int var2 = 0; var2 < var1.length; var2++) {
			this.anIntArray104[var2] = var1[var2];
		}

		this.method65();
	}

	final int val() {
		if (--this.anInt96 + 1 == 0) {
			this.method64();
			this.anInt96 = 255;
		}

		return this.anIntArray104[this.anInt96];
	}

	static final void method67(Node_Sub4 var0) {
		var0.aBool1261 = false;
		if (var0.aNode_Sub2_1258 != null) {
			var0.aNode_Sub2_1258.anInt1212 = 0;
		}

		for (Node_Sub4 var1 = var0.method526(); var1 != null; var1 = var0.method529()) {
			method67(var1);
		}

	}

	static boolean method68(Widget var0) {
		if (Client.aBool2024) {
			if (Class30.getWidgetConfig(var0) != 0) {
				return false;
			}

			if (var0.type == 0) {
				return false;
			}
		}

		return var0.hidden;
	}

}
