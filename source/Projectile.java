public final class Projectile extends Entity {

	static int cameraX;
	double aDouble1848;
	double aDouble1849;
	double aDouble1843;
	double aDouble1859;
	double aDouble1851;
	double aDouble1852;
	double aDouble1853;
	double aDouble1854;
	boolean aBool1847 = false;
	int anInt1850;
	int anInt1855;
	int anInt1858 = 0;
	int anInt1857 = 0;
	int anInt1845;
	int anInt1844;
	int strictX;
	int strictY;
	int startHeight;
	int anInt1846;
	int loopCycle;
	int slope;
	int startDistance;
	int targetIndex;
	int endHeight;
	SequenceType aDualNode_Sub3_1856;

	final void method992(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.aBool1847) {
			var5 = (double) (var1 - this.strictX);
			double var7 = (double) (var2 - this.strictY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.aDouble1848 = (double) this.startDistance * var5 / var9 + (double) this.strictX;
			this.aDouble1849 = (double) this.strictY + (double) this.startDistance * var7 / var9;
			this.aDouble1843 = (double) this.startHeight;
		}

		var5 = (double) (this.loopCycle + 1 - var4);
		this.aDouble1859 = ((double) var1 - this.aDouble1848) / var5;
		this.aDouble1851 = ((double) var2 - this.aDouble1849) / var5;
		this.aDouble1852 = Math.sqrt(this.aDouble1859 * this.aDouble1859 + this.aDouble1851 * this.aDouble1851);
		if (!this.aBool1847) {
			this.aDouble1853 = -this.aDouble1852 * Math.tan((double) this.slope * 0.02454369D);
		}

		this.aDouble1854 = ((double) var3 - this.aDouble1843 - this.aDouble1853 * var5) * 2.0D / (var5 * var5);
	}

	final void method993(int var1) {
		this.aBool1847 = true;
		this.aDouble1848 += this.aDouble1859 * (double) var1;
		this.aDouble1849 += (double) var1 * this.aDouble1851;
		this.aDouble1843 += (double) var1 * (double) var1 * 0.5D * this.aDouble1854 + (double) var1 * this.aDouble1853;
		this.aDouble1853 += this.aDouble1854 * (double) var1;
		this.anInt1850 = (int) (Math.atan2(this.aDouble1859, this.aDouble1851) * 325.949D) + 1024 & 0x7ff;
		this.anInt1855 = (int) (Math.atan2(this.aDouble1853, this.aDouble1852) * 325.949D) & 0x7ff;
		if (this.aDualNode_Sub3_1856 != null) {
			this.anInt1858 += var1;

			while (true) {
				do {
					do {
						if (this.anInt1858 <= this.aDualNode_Sub3_1856.anIntArray1481[this.anInt1857]) {
							return;
						}

						this.anInt1858 -= this.aDualNode_Sub3_1856.anIntArray1481[this.anInt1857];
						++this.anInt1857;
					} while (this.anInt1857 < this.aDualNode_Sub3_1856.anIntArray1474.length);

					this.anInt1857 -= this.aDualNode_Sub3_1856.anInt1477;
				} while (this.anInt1857 >= 0 && this.anInt1857 < this.aDualNode_Sub3_1856.anIntArray1474.length);

				this.anInt1857 = 0;
			}
		}
	}

	protected final Model getModel(byte var1) {
		SpotAnimType var2 = Class96_Sub1.getSpotAnimType(this.anInt1845);
		Model var3 = var2.method656(this.anInt1857);
		if (var3 == null) {
			return null;
		} else {
			var3.method1005(this.anInt1855);
			return var3;
		}
	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10,
			int var11) {
		this.anInt1845 = var1;
		this.anInt1844 = var2;
		this.strictX = var3;
		this.strictY = var4;
		this.startHeight = var5;
		this.anInt1846 = var6;
		this.loopCycle = var7;
		this.slope = var8;
		this.startDistance = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.aBool1847 = false;
		int var12 = Class96_Sub1.getSpotAnimType(this.anInt1845).anInt1441;
		if (var12 != -1) {
			this.aDualNode_Sub3_1856 = Node_Sub6.getSequenceType(var12);
		} else {
			this.aDualNode_Sub3_1856 = null;
		}

	}

}
