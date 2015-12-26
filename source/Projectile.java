
public final class Projectile extends Entity {

	double aDouble1843;
	int anInt1844;
	int strictX;
	int strictY;
	int anInt1845;
	int endHeight;
	int anInt1846;
	int loopCycle;
	static int cameraX;
	int startDistance;
	int targetIndex;
	boolean aBool1847 = false;
	double aDouble1848;
	double aDouble1849;
	int anInt1850;
	int startHeight;
	double aDouble1851;
	double aDouble1852;
	double aDouble1853;
	double aDouble1854;
	int anInt1855;
	SequenceType aDualNode_Sub3_1856;
	int anInt1857 = 0;
	int anInt1858 = 0;
	int slope;
	double aDouble1859;

	final void method992(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.aBool1847) {
			var5 = (double) (var1 - -415849877 * this.strictX);
			double var7 = (double) (var2 - -825953097 * this.strictY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.aDouble1848 = var5 * (double) (this.startDistance * 1165100081) / var9
					+ (double) (this.strictX * -415849877);
			this.aDouble1849 = (double) (-825953097 * this.strictY)
					+ var7 * (double) (1165100081 * this.startDistance) / var9;
			this.aDouble1843 = (double) (-360825719 * this.startHeight);
		}

		var5 = (double) (1 + -2082473613 * this.loopCycle - var4);
		this.aDouble1859 = ((double) var1 - this.aDouble1848) / var5;
		this.aDouble1851 = ((double) var2 - this.aDouble1849) / var5;
		this.aDouble1852 = Math.sqrt(this.aDouble1859 * this.aDouble1859 + this.aDouble1851 * this.aDouble1851);
		if (!this.aBool1847) {
			this.aDouble1853 = -this.aDouble1852 * Math.tan((double) (this.slope * -100582033) * 0.02454369D);
		}

		this.aDouble1854 = 2.0D * ((double) var3 - this.aDouble1843 - var5 * this.aDouble1853) / (var5 * var5);
	}

	final void method993(int var1) {
		this.aBool1847 = true;
		this.aDouble1848 += this.aDouble1859 * (double) var1;
		this.aDouble1849 += (double) var1 * this.aDouble1851;
		this.aDouble1843 += (double) var1 * (double) var1 * 0.5D * this.aDouble1854 + (double) var1 * this.aDouble1853;
		this.aDouble1853 += this.aDouble1854 * (double) var1;
		this.anInt1850 = ((int) (Math.atan2(this.aDouble1859, this.aDouble1851) * 325.949D) + 1024 & 2047) * 1482073931;
		this.anInt1855 = ((int) (Math.atan2(this.aDouble1853, this.aDouble1852) * 325.949D) & 2047) * -150783261;
		if (this.aDualNode_Sub3_1856 != null) {
			this.anInt1858 += var1 * 1926871585;

			while (this.anInt1858 * -2037364255 > this.aDualNode_Sub3_1856.anIntArray1481[this.anInt1857 * -46564401]) {
				this.anInt1858 -= 1926871585 * this.aDualNode_Sub3_1856.anIntArray1481[this.anInt1857 * -46564401];
				this.anInt1857 += -602821841;
				if (-46564401 * this.anInt1857 >= this.aDualNode_Sub3_1856.anIntArray1474.length) {
					this.anInt1857 -= 860871293 * this.aDualNode_Sub3_1856.anInt1477;
					if (-46564401 * this.anInt1857 < 0
							|| -46564401 * this.anInt1857 >= this.aDualNode_Sub3_1856.anIntArray1474.length) {
						this.anInt1857 = 0;
					}
				}
			}
		}

	}

	protected final Model method654(byte var1) {
		SpotAnimType var2 = Class96_Sub1.getSpotAnimType(this.anInt1845 * 934846163);
		Model var3 = var2.method656(-46564401 * this.anInt1857);
		if (var3 == null) {
			return null;
		} else {
			var3.method1005(964287179 * this.anInt1855);
			return var3;
		}
	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10,
			int var11) {
		this.anInt1845 = var1 * -268867237;
		this.anInt1844 = -1878577909 * var2;
		this.strictX = 1644558915 * var3;
		this.strictY = -369874681 * var4;
		this.startHeight = -612501063 * var5;
		this.anInt1846 = 748257223 * var6;
		this.loopCycle = var7 * -1790323781;
		this.slope = -1293762161 * var8;
		this.startDistance = 1192416465 * var9;
		this.targetIndex = -206837249 * var10;
		this.endHeight = -970910407 * var11;
		this.aBool1847 = false;
		int var12 = Class96_Sub1.getSpotAnimType(934846163 * this.anInt1845).anInt1441 * -521951217;
		if (var12 != -1) {
			this.aDualNode_Sub3_1856 = Node_Sub6.getSequenceType(var12);
		} else {
			this.aDualNode_Sub3_1856 = null;
		}

	}
}
