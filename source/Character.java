public abstract class Character extends Entity {

	int strictY;
	int graphicsHeight;
	int anInt1924;
	int anInt1928;
	int hitpoints;
	int maxHitpoints;
	int strictX;
	int anInt1937;
	int graphicsDelay;
	int anInt1943;
	int anInt1944;
	boolean aBool1946;
	int anInt1947;
	int anInt1948;
	int anInt1953;
	int anInt1954;
	int queueSize = 0;
	int anInt1913 = -1;
	int anInt1914 = 0;
	int anInt1915 = 1;
	int[] hitsplatCycles = new int[4];
	int anInt1916 = -1;
	int anInt1917 = -517768871;
	int anInt1918 = -1;
	int animationId = -1;
	boolean aBool1919 = false;
	int anInt1921 = -1;
	String overheadText = null;
	int anInt1922 = 0;
	boolean aBool1923 = false;
	int anInt1925 = 0;
	int anInt1926 = 0;
	int[] hitsplatTypes = new int[4];
	int anInt1927 = 100;
	int healthBarCycle = -1000;
	int targetIndex = -1;
	boolean aBool1930 = false;
	int anInt1931 = -1;
	int anInt1932 = -1;
	int[] hitsplatDamages = new int[4];
	int anInt1933 = 0;
	int anInt1934 = 0;
	int anInt1935 = 0;
	int animationDelay = 0;
	int graphicsId = -1;
	int anInt1939 = -1;
	int anInt1940 = 0;
	int anInt1942 = 0;
	int[] anIntArray1945 = new int[10];
	int anInt1949 = 0;
	int height = 200;
	byte[] aByteArray1951 = new byte[10];
	int anInt1952 = -1;
	int orientation = -572100192;
	int[] anIntArray1955 = new int[10];
	int anInt1956 = 0;
	int anInt1957 = 0;
	int anInt1958 = 0;
	int anInt1959 = -1;

	final void method1016() {
		this.queueSize = 0;
		this.anInt1957 = 0;
	}

	boolean hasConfig() {
		return false;
	}

	final void method1018(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (this.hitsplatCycles[var4] <= var3) {
				this.hitsplatTypes[var4] = var1;
				this.hitsplatDamages[var4] = var2;
				this.hitsplatCycles[var4] = var3 + 70;
				return;
			}
		}

	}

	public static String method1019(byte[] var0) {
		int var1 = var0.length;
		StringBuilder var2 = new StringBuilder();

		for (int var7 = 0; var7 < var1 + 0; var7 += 3) {
			int var4 = var0[var7] & 0xff;
			var2.append(Class88.aCharArray711[var4 >>> 2]);
			if (var7 < var1 - 1) {
				int var3 = var0[var7 + 1] & 0xff;
				var2.append(Class88.aCharArray711[(var4 & 0x3) << 4 | var3 >>> 4]);
				if (var7 < var1 - 2) {
					int var6 = var0[var7 + 2] & 0xff;
					var2.append(Class88.aCharArray711[(var3 & 0xf) << 2 | var6 >>> 6])
							.append(Class88.aCharArray711[var6 & 0x3f]);
				} else {
					var2.append(Class88.aCharArray711[(var3 & 0xf) << 2]).append("=");
				}
			} else {
				var2.append(Class88.aCharArray711[(var4 & 0x3) << 4]).append("==");
			}
		}

		String var71 = var2.toString();
		return var71;
	}

	static final int calculateTileHeight(int var0, int var1) {
		int var2 = Widget.method494(var0 + '\ub135', var1 + 91923, 4) - 128
				+ (Widget.method494(var0 + 10294, var1 + '\u93bd', 2) - 128 >> 1)
				+ (Widget.method494(var0, var1, 1) - 128 >> 2);
		var2 = (int) ((double) var2 * 0.3D) + 35;
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
		if ((var5 & 0x1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 - (var3 - 1) : (var2 != 2 ? var0 : 7 - var1 - (var4 - 1)));
	}

}
