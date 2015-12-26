
public class Class29 implements Interface3 {

	int anInt327 = 1123596160;
	Deque aDeque328 = new Deque();
	int anInt329;
	int anInt330 = 0;
	double aDouble331 = 1.0D;
	Node_Sub7[] aNode_Sub7Array332;
	AbstractIndex aClass87_333;
	static int anInt334;
	static int anInt335;

	public void method185(double var1) {
		this.aDouble331 = var1;
		this.method187();
	}

	public int[] method10(int var1, int var2) {
		Node_Sub7 var3 = this.aNode_Sub7Array332[var1];
		if (var3 != null) {
			if (var3.anIntArray1292 != null) {
				this.aDeque328.method474(var3);
				var3.aBool1293 = true;
				return var3.anIntArray1292;
			}

			boolean var4 = var3.method543(this.aDouble331, 403475855 * this.anInt327, this.aClass87_333);
			if (var4) {
				if (this.anInt330 * -1517992811 == 0) {
					Node_Sub7 var5 = (Node_Sub7) this.aDeque328.method470();
					var5.method541();
				} else {
					this.anInt330 -= 1927636669;
				}

				this.aDeque328.method474(var3);
				var3.aBool1293 = true;
				return var3.anIntArray1292;
			}
		}

		return null;
	}

	public boolean method8(int var1, byte var2) {
		return this.aNode_Sub7Array332[var1].aBool1285;
	}

	public boolean method9(int var1, byte var2) {
		return 403475855 * this.anInt327 == 64;
	}

	public Class29(AbstractIndex var1, AbstractIndex var2, int var3, double var4, int var6) {
		this.aClass87_333 = var2;
		this.anInt329 = -393029919 * var3;
		this.anInt330 = this.anInt329 * 1019426653;
		this.aDouble331 = var4;
		this.anInt327 = 1787162991 * var6;
		int[] var7 = var1.method394(0);
		int var8 = var7.length;
		this.aNode_Sub7Array332 = new Node_Sub7[var1.fileCount(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			ByteBuf var10 = new ByteBuf(var1.getFile(0, var7[var9]));
			this.aNode_Sub7Array332[var7[var9]] = new Node_Sub7(var10);
		}

	}

	public void method186(int var1) {
		for (int var2 = 0; var2 < this.aNode_Sub7Array332.length; ++var2) {
			Node_Sub7 var3 = this.aNode_Sub7Array332[var2];
			if (var3 != null && var3.anInt1294 != 0 && var3.aBool1293) {
				var3.method542(var1);
				var3.aBool1293 = false;
			}
		}

	}

	public int method7(int var1, int var2) {
		return this.aNode_Sub7Array332[var1] != null ? this.aNode_Sub7Array332[var1].anInt1286 : 0;
	}

	public void method187() {
		for (int var1 = 0; var1 < this.aNode_Sub7Array332.length; ++var1) {
			if (this.aNode_Sub7Array332[var1] != null) {
				this.aNode_Sub7Array332[var1].method541();
			}
		}

		this.aDeque328 = new Deque();
		this.anInt330 = this.anInt329 * 1019426653;
	}
}
