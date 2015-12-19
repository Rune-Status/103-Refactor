
public abstract class Character extends Entity {

	int queueSize = 0;
	int strictY;
	int anInt1913 = -505909337;
	int anInt1914 = 0;
	int anInt1915 = 99722873;
	int[] hitsplatCycles = new int[4];
	int anInt1916 = 176841799;
	int anInt1917 = -1652337345;
	int anInt1918 = 929243503;
	int animation = 1587034171;
	boolean aBool1919 = false;
	int anInt1920;
	int anInt1921 = -71707737;
	String overheadText = null;
	int anInt1922 = 0;
	boolean aBool1923 = false;
	int anInt1924;
	int anInt1925 = 0;
	int anInt1926 = 0;
	int[] hitsplatTypes = new int[4];
	int anInt1927 = -569035212;
	int anInt1928;
	int healthBarCycle = 1981456616;
	int hitpoints;
	int maxHitpoints;
	int targetIndex = -1611414733;
	boolean aBool1930 = false;
	int anInt1931 = 316267887;
	int anInt1932 = -517768871;
	int[] hitsplatDamages = new int[4];
	int anInt1933 = 0;
	int strictX;
	int anInt1934 = 0;
	int anInt1935 = 0;
	int anInt1936 = 0;
	int anInt1937;
	int anInt1938 = 1738418729;
	int anInt1939 = -1473487651;
	int anInt1940 = 0;
	int anInt1941;
	int anInt1942 = 0;
	int anInt1943;
	int anInt1944;
	int[] anIntArray1945 = new int[10];
	boolean aBool1946;
	int anInt1947;
	int anInt1948;
	int anInt1949 = 0;
	int anInt1950 = 331928664;
	byte[] aByteArray1951 = new byte[10];
	int anInt1952 = 951990375;
	int orientation = -939182368;
	int anInt1953;
	int anInt1954;
	int[] anIntArray1955 = new int[10];
	int anInt1956 = 0;
	int anInt1957 = 0;
	int anInt1958 = 0;
	int anInt1959 = 592731223;

	final void method1016() {
		this.queueSize = 0;
		this.anInt1957 = 0;
	}

	boolean method1017(byte var1) {
		return false;
	}

	final void method1018(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < 4; ++var4) {
			if (this.hitsplatCycles[var4] <= var3) {
				this.hitsplatTypes[var4] = var1;
				this.hitsplatDamages[var4] = var2;
				this.hitsplatCycles[var4] = 70 + var3;
				return;
			}
		}

	}

	public static String method1019(byte[] var0) {
		int var1 = var0.length;
		StringBuilder var2 = new StringBuilder();

		for (int var5 = 0; var5 < var1 + 0; var5 += 3) {
			int var4 = var0[var5] & 255;
			var2.append(Class88.aCharArray711[var4 >>> 2]);
			if (var5 < var1 - 1) {
				int var3 = var0[1 + var5] & 255;
				var2.append(Class88.aCharArray711[(var4 & 3) << 4 | var3 >>> 4]);
				if (var5 < var1 - 2) {
					int var6 = var0[var5 + 2] & 255;
					var2.append(Class88.aCharArray711[(var3 & 15) << 2 | var6 >>> 6])
							.append(Class88.aCharArray711[var6 & 63]);
				} else {
					var2.append(Class88.aCharArray711[(var3 & 15) << 2]).append("=");
				}
			} else {
				var2.append(Class88.aCharArray711[(var4 & 3) << 4]).append("==");
			}
		}

		String var7 = var2.toString();
		return var7;
	}

	static final int method1020(int var0, int var1) {
		int var2 = Widget.method494(var0 + '\ub135', var1 + 91923, 4) - 128
				+ (Widget.method494(10294 + var0, var1 + '\u93bd', 2) - 128 >> 1)
				+ (Widget.method494(var0, var1, 1) - 128 >> 2);
		var2 = 35 + (int) ((double) var2 * 0.3D);
		if (var2 >= 10) {
			if (var2 > 60) {
				var2 = 60;
			}
		} else {
			var2 = 10;
		}

		return var2;
	}

	public static int method1021(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 - (var3 - 1) : (var2 != 2 ? var0 : 7 - var1 - (var4 - 1)));
	}
}
