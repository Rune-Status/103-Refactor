public class Rasterizer extends Entity {

	int anInt1864 = 0;
	int anInt1900 = 0;
	int anInt1878 = 0;
	int[] verticesX;
	int[] verticesZ;
	int[] anIntArray1867;
	int[] anIntArray1868;
	int[] anIntArray1869;
	int[] anIntArray1870;
	int[] anIntArray1871;
	int[] anIntArray1872;
	byte[] aByteArray1888;
	byte[] aByteArray1874;
	byte[] aByteArray1875;
	short[] aShortArray1860;
	byte aByte1884 = 0;
	int[] anIntArray1879;
	int[] anIntArray1880;
	int[] anIntArray1906;
	int[][] anIntArrayArray1881;
	int[][] anIntArrayArray1873;
	public boolean allowClickBounds = false;
	int[] verticesY;
	int anInt1866;
	static byte[] aByteArray1861 = new byte[1];
	static byte[] aByteArray1863 = new byte[1];
	int anInt1912;
	int XYZMag;
	int anInt1885;
	int anInt1897;
	static int anInt1895;
	static int anInt1883;
	static int anInt1903;
	public static int onCursorCount = 0;
	static Rasterizer aModel1862 = new Rasterizer();
	static int[] anIntArray1865 = new int[12];
	static int[][] anIntArrayArray1876 = new int[1600][512];
	static int[] anIntArray1877 = new int[2000];
	static int[] anIntArray1882 = new int[10];
	static Rasterizer aModel1886 = new Rasterizer();
	static boolean[] aBoolArray1887 = new boolean[4096];
	static int[] anIntArray1889 = new int[4096];
	static int[] anIntArray1890 = new int[4096];
	static int[] anIntArray1891 = new int[4096];
	static int[] yViewportBuffer = new int[4096];
	static int[] anIntArray1892 = new int[4096];
	static int[] anIntArray1893 = new int[4096];
	public static int[] onCursorUids = new int[1000];
	static int[] anIntArray1894 = new int[1600];
	static int[] anIntArray1896 = new int[12];
	static int[] anIntArray1898 = new int[2000];
	static int[] anIntArray1899 = new int[10];
	static int[] xViewportBuffer = new int[10];
	static int[][] anIntArrayArray1901 = new int[12][2000];
	static boolean[] aBoolArray1902 = new boolean[4096];
	public static boolean aBool1904 = false;
	public static int anInt1905 = 0;
	static int[] anIntArray1907;
	static int[] SIN_TABLE;
	static int[] COS_TABLE;
	public static int anInt1910;
	static int[] anIntArray1911;

	public Rasterizer method994(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method998();
		int var15 = var2 - this.XYZMag;
		int var11 = this.XYZMag + var2;
		int var16 = var4 - this.XYZMag;
		int var14 = this.XYZMag + var4;
		if (var15 >= 0 && var11 + 128 >> 7 < var1.length && var16 >= 0 && var14 + 128 >> 7 < var1[0].length) {
			var15 >>= 7;
			var11 = var11 + 127 >> 7;
			var16 >>= 7;
			var14 = var14 + 127 >> 7;
			if (var1[var15][var16] == var3 && var1[var11][var16] == var3 && var1[var15][var14] == var3
					&& var1[var11][var14] == var3) {
				return this;
			} else {
				Rasterizer var17;
				if (var5) {
					var17 = new Rasterizer();
					var17.anInt1864 = this.anInt1864;
					var17.anInt1900 = this.anInt1900;
					var17.anInt1878 = this.anInt1878;
					var17.verticesX = this.verticesX;
					var17.verticesZ = this.verticesZ;
					var17.anIntArray1867 = this.anIntArray1867;
					var17.anIntArray1868 = this.anIntArray1868;
					var17.anIntArray1869 = this.anIntArray1869;
					var17.anIntArray1870 = this.anIntArray1870;
					var17.anIntArray1871 = this.anIntArray1871;
					var17.anIntArray1872 = this.anIntArray1872;
					var17.aByteArray1888 = this.aByteArray1888;
					var17.aByteArray1874 = this.aByteArray1874;
					var17.aByteArray1875 = this.aByteArray1875;
					var17.aShortArray1860 = this.aShortArray1860;
					var17.aByte1884 = this.aByte1884;
					var17.anIntArray1879 = this.anIntArray1879;
					var17.anIntArray1880 = this.anIntArray1880;
					var17.anIntArray1906 = this.anIntArray1906;
					var17.anIntArrayArray1881 = this.anIntArrayArray1881;
					var17.anIntArrayArray1873 = this.anIntArrayArray1873;
					var17.allowClickBounds = this.allowClickBounds;
					var17.verticesY = new int[var17.anInt1864];
				} else {
					var17 = this;
				}

				int var7;
				int var8;
				int var9;
				int var10;
				int var12;
				int var13;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var17.anInt1864; var12++) {
						var13 = this.verticesX[var12] + var2;
						var18 = this.verticesZ[var12] + var4;
						var20 = var13 & 0x7f;
						var9 = var18 & 0x7f;
						var19 = var13 >> 7;
						var7 = var18 >> 7;
						var8 = var1[var19][var7] * (128 - var20) + var1[var19 + 1][var7] * var20 >> 7;
						var10 = var1[var19][var7 + 1] * (128 - var20) + var1[var19 + 1][var7 + 1] * var20 >> 7;
						var21 = (128 - var9) * var8 + var10 * var9 >> 7;
						var17.verticesY[var12] = this.verticesY[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var17.anInt1864; var12++) {
						var13 = (-this.verticesY[var12] << 16) / (this.modelHeight * 1812947537);
						if (var13 < var6) {
							var18 = this.verticesX[var12] + var2;
							var20 = this.verticesZ[var12] + var4;
							var9 = var18 & 0x7f;
							var19 = var20 & 0x7f;
							var7 = var18 >> 7;
							var8 = var20 >> 7;
							var10 = var1[var7][var8] * (128 - var9) + var1[var7 + 1][var8] * var9 >> 7;
							var21 = var1[var7][var8 + 1] * (128 - var9) + var1[var7 + 1][var8 + 1] * var9 >> 7;
							int var22 = (128 - var19) * var10 + var21 * var19 >> 7;
							var17.verticesY[var12] = this.verticesY[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var17.anInt1866 = 0;
				return var17;
			}
		} else {
			return this;
		}
	}

	public Rasterizer method995(boolean var1) {
		if (!var1 && aByteArray1861.length < this.anInt1900) {
			aByteArray1861 = new byte[this.anInt1900 + 100];
		}

		return this.method997(var1, aModel1886, aByteArray1861);
	}

	public Rasterizer method996(boolean var1) {
		if (!var1 && aByteArray1863.length < this.anInt1900) {
			aByteArray1863 = new byte[this.anInt1900 + 100];
		}

		return this.method997(var1, aModel1862, aByteArray1863);
	}

	Rasterizer method997(boolean var1, Rasterizer var2, byte[] var3) {
		var2.anInt1864 = this.anInt1864;
		var2.anInt1900 = this.anInt1900;
		var2.anInt1878 = this.anInt1878;
		if (var2.verticesX == null || var2.verticesX.length < this.anInt1864) {
			var2.verticesX = new int[this.anInt1864 + 100];
			var2.verticesY = new int[this.anInt1864 + 100];
			var2.verticesZ = new int[this.anInt1864 + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.anInt1864; var4++) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.aByteArray1874 = this.aByteArray1874;
		} else {
			var2.aByteArray1874 = var3;
			if (this.aByteArray1874 == null) {
				for (var4 = 0; var4 < this.anInt1900; var4++) {
					var2.aByteArray1874[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.anInt1900; var4++) {
					var2.aByteArray1874[var4] = this.aByteArray1874[var4];
				}
			}
		}

		var2.anIntArray1867 = this.anIntArray1867;
		var2.anIntArray1868 = this.anIntArray1868;
		var2.anIntArray1869 = this.anIntArray1869;
		var2.anIntArray1870 = this.anIntArray1870;
		var2.anIntArray1871 = this.anIntArray1871;
		var2.anIntArray1872 = this.anIntArray1872;
		var2.aByteArray1888 = this.aByteArray1888;
		var2.aByteArray1875 = this.aByteArray1875;
		var2.aShortArray1860 = this.aShortArray1860;
		var2.aByte1884 = this.aByte1884;
		var2.anIntArray1879 = this.anIntArray1879;
		var2.anIntArray1880 = this.anIntArray1880;
		var2.anIntArray1906 = this.anIntArray1906;
		var2.anIntArrayArray1881 = this.anIntArrayArray1881;
		var2.anIntArrayArray1873 = this.anIntArrayArray1873;
		var2.allowClickBounds = this.allowClickBounds;
		var2.anInt1866 = 0;
		return var2;
	}

	public void method998() {
		if (this.anInt1866 != 1) {
			this.anInt1866 = 1;
			this.modelHeight = 0;
			this.anInt1912 = 0;
			this.XYZMag = 0;

			for (int var1 = 0; var1 < this.anInt1864; var1++) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > this.modelHeight * 1812947537) {
					this.modelHeight = -var3 * -969595215;
				}

				if (var3 > this.anInt1912) {
					this.anInt1912 = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.XYZMag) {
					this.XYZMag = var5;
				}
			}

			this.XYZMag = (int) (Math.sqrt((double) this.XYZMag) + 0.99D);
			this.anInt1885 = (int) (Math.sqrt((double) (this.XYZMag * this.XYZMag
					+ this.modelHeight * 1812947537 * this.modelHeight * 1812947537)) + 0.99D);
			this.anInt1897 = this.anInt1885
					+ (int) (Math.sqrt((double) (this.XYZMag * this.XYZMag + this.anInt1912 * this.anInt1912)) + 0.99D);
		}

	}

	void method999() {
		if (this.anInt1866 != 2) {
			this.anInt1866 = 2;
			this.XYZMag = 0;

			for (int var2 = 0; var2 < this.anInt1864; var2++) {
				int var3 = this.verticesX[var2];
				int var4 = this.verticesY[var2];
				int var5 = this.verticesZ[var2];
				int var1 = var3 * var3 + var5 * var5 + var4 * var4;
				if (var1 > this.XYZMag) {
					this.XYZMag = var1;
				}
			}

			this.XYZMag = (int) (Math.sqrt((double) this.XYZMag) + 0.99D);
			this.anInt1885 = this.XYZMag;
			this.anInt1897 = this.XYZMag + this.XYZMag;
		}

	}

	public int method1000() {
		this.method998();
		return this.XYZMag;
	}

	public void method1001(SkeletonSet var1, int var2) {
		if (this.anIntArrayArray1881 != null && var2 != -1) {
			AnimationSkeleton var4 = var1.skeletons[var2];
			AnimationSkin var5 = var4.skin;
			anInt1895 = 0;
			anInt1883 = 0;
			anInt1903 = 0;

			for (int var3 = 0; var3 < var4.anInt292; var3++) {
				int var6 = var4.anIntArray293[var3];
				this.method1002(var5.types[var6], var5.list[var6], var4.anIntArray288[var3],
						var4.anIntArray295[var3], var4.anIntArray296[var3]);
			}

			this.anInt1866 = 0;
		}

	}

	void method1002(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var9;
		int var10;
		int var11;
		int var13;
		int var12;
		int[] var14;
		if (var1 == 0) {
			var9 = 0;
			anInt1895 = 0;
			anInt1883 = 0;
			anInt1903 = 0;

			for (var10 = 0; var10 < var6; var10++) {
				var12 = var2[var10];
				if (var12 < this.anIntArrayArray1881.length) {
					var14 = this.anIntArrayArray1881[var12];

					for (var13 = 0; var13 < var14.length; var13++) {
						var11 = var14[var13];
						anInt1895 += this.verticesX[var11];
						anInt1883 += this.verticesY[var11];
						anInt1903 += this.verticesZ[var11];
						++var9;
					}
				}
			}

			if (var9 > 0) {
				anInt1895 = anInt1895 / var9 + var3;
				anInt1883 = anInt1883 / var9 + var4;
				anInt1903 = anInt1903 / var9 + var5;
			} else {
				anInt1895 = var3;
				anInt1883 = var4;
				anInt1903 = var5;
			}
		} else if (var1 == 1) {
			for (var9 = 0; var9 < var6; var9++) {
				var10 = var2[var9];
				if (var10 < this.anIntArrayArray1881.length) {
					var14 = this.anIntArrayArray1881[var10];

					for (var12 = 0; var12 < var14.length; var12++) {
						var13 = var14[var12];
						this.verticesX[var13] += var3;
						this.verticesY[var13] += var4;
						this.verticesZ[var13] += var5;
					}
				}
			}
		} else if (var1 == 2) {
			for (var9 = 0; var9 < var6; var9++) {
				var10 = var2[var9];
				if (var10 < this.anIntArrayArray1881.length) {
					var14 = this.anIntArrayArray1881[var10];

					for (var12 = 0; var12 < var14.length; var12++) {
						var13 = var14[var12];
						this.verticesX[var13] -= anInt1895;
						this.verticesY[var13] -= anInt1883;
						this.verticesZ[var13] -= anInt1903;
						var11 = (var3 & 0xff) * 8;
						int var7 = (var4 & 0xff) * 8;
						int var17 = (var5 & 0xff) * 8;
						int var8;
						int var15;
						int var16;
						if (var17 != 0) {
							var16 = SIN_TABLE[var17];
							var8 = COS_TABLE[var17];
							var15 = this.verticesY[var13] * var16 + this.verticesX[var13] * var8 >> 16;
							this.verticesY[var13] = this.verticesY[var13] * var8 - this.verticesX[var13] * var16 >> 16;
							this.verticesX[var13] = var15;
						}

						if (var11 != 0) {
							var16 = SIN_TABLE[var11];
							var8 = COS_TABLE[var11];
							var15 = this.verticesY[var13] * var8 - this.verticesZ[var13] * var16 >> 16;
							this.verticesZ[var13] = this.verticesY[var13] * var16 + this.verticesZ[var13] * var8 >> 16;
							this.verticesY[var13] = var15;
						}

						if (var7 != 0) {
							var16 = SIN_TABLE[var7];
							var8 = COS_TABLE[var7];
							var15 = this.verticesZ[var13] * var16 + this.verticesX[var13] * var8 >> 16;
							this.verticesZ[var13] = this.verticesZ[var13] * var8 - this.verticesX[var13] * var16 >> 16;
							this.verticesX[var13] = var15;
						}

						this.verticesX[var13] += anInt1895;
						this.verticesY[var13] += anInt1883;
						this.verticesZ[var13] += anInt1903;
					}
				}
			}
		} else if (var1 == 3) {
			for (var9 = 0; var9 < var6; var9++) {
				var10 = var2[var9];
				if (var10 < this.anIntArrayArray1881.length) {
					var14 = this.anIntArrayArray1881[var10];

					for (var12 = 0; var12 < var14.length; var12++) {
						var13 = var14[var12];
						this.verticesX[var13] -= anInt1895;
						this.verticesY[var13] -= anInt1883;
						this.verticesZ[var13] -= anInt1903;
						this.verticesX[var13] = this.verticesX[var13] * var3 / 128;
						this.verticesY[var13] = this.verticesY[var13] * var4 / 128;
						this.verticesZ[var13] = this.verticesZ[var13] * var5 / 128;
						this.verticesX[var13] += anInt1895;
						this.verticesY[var13] += anInt1883;
						this.verticesZ[var13] += anInt1903;
					}
				}
			}
		} else if (var1 == 5 && this.anIntArrayArray1873 != null && this.aByteArray1874 != null) {
			for (var9 = 0; var9 < var6; var9++) {
				var10 = var2[var9];
				if (var10 < this.anIntArrayArray1873.length) {
					var14 = this.anIntArrayArray1873[var10];

					for (var12 = 0; var12 < var14.length; var12++) {
						var13 = var14[var12];
						var11 = (this.aByteArray1874[var13] & 0xff) + var3 * 8;
						if (var11 < 0) {
							var11 = 0;
						} else if (var11 > 255) {
							var11 = 255;
						}

						this.aByteArray1874[var13] = (byte) var11;
					}
				}
			}
		}

	}

	public void method1003() {
		for (int var1 = 0; var1 < this.anInt1864; var1++) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.anInt1866 = 0;
	}

	public void method1004() {
		for (int var1 = 0; var1 < this.anInt1864; var1++) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.anInt1866 = 0;
	}

	public void method1005(int var1) {
		int var2 = SIN_TABLE[var1];
		int var4 = COS_TABLE[var1];

		for (int var3 = 0; var3 < this.anInt1864; var3++) {
			int var5 = this.verticesY[var3] * var4 - this.verticesZ[var3] * var2 >> 16;
			this.verticesZ[var3] = this.verticesY[var3] * var2 + this.verticesZ[var3] * var4 >> 16;
			this.verticesY[var3] = var5;
		}

		this.anInt1866 = 0;
	}

	public void method1006(SkeletonSet var1, int var2, SkeletonSet var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				AnimationSkeleton var9 = var1.skeletons[var2];
				AnimationSkeleton var6 = var3.skeletons[var4];
				AnimationSkin var12 = var9.skin;
				anInt1895 = 0;
				anInt1883 = 0;
				anInt1903 = 0;
				byte var7 = 0;
				int var13 = var7 + 1;
				int var8 = var5[var7];

				int var10;
				int var11;
				for (var11 = 0; var11 < var9.anInt292; var11++) {
					for (var10 = var9.anIntArray293[var11]; var10 > var8; var8 = var5[var13++]) {
						;
					}

					if (var10 != var8 || var12.types[var10] == 0) {
						this.method1002(var12.types[var10], var12.list[var10],
								var9.anIntArray288[var11], var9.anIntArray295[var11], var9.anIntArray296[var11]);
					}
				}

				anInt1895 = 0;
				anInt1883 = 0;
				anInt1903 = 0;
				var7 = 0;
				var13 = var7 + 1;
				var8 = var5[var7];

				for (var11 = 0; var11 < var6.anInt292; var11++) {
					for (var10 = var6.anIntArray293[var11]; var10 > var8; var8 = var5[var13++]) {
						;
					}

					if (var10 == var8 || var12.types[var10] == 0) {
						this.method1002(var12.types[var10], var12.list[var10],
								var6.anIntArray288[var11], var6.anIntArray295[var11], var6.anIntArray296[var11]);
					}
				}

				this.anInt1866 = 0;
			} else {
				this.method1001(var1, var2);
			}
		}

	}

	public void method1007(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.anInt1864; var4++) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = this.verticesY[var4] * var2 / 128;
			this.verticesZ[var4] = this.verticesZ[var4] * var3 / 128;
		}

		this.anInt1866 = 0;
	}

	public Rasterizer(Rasterizer[] var1, int var2) {
		boolean var5 = false;
		boolean var6 = false;
		boolean var9 = false;
		boolean var8 = false;
		this.anInt1864 = 0;
		this.anInt1900 = 0;
		this.anInt1878 = 0;
		this.aByte1884 = -1;

		Rasterizer var3;
		int var7;
		for (var7 = 0; var7 < var2; var7++) {
			var3 = var1[var7];
			if (var3 != null) {
				this.anInt1864 += var3.anInt1864;
				this.anInt1900 += var3.anInt1900;
				this.anInt1878 += var3.anInt1878;
				if (var3.aByteArray1888 != null) {
					var5 = true;
				} else {
					if (this.aByte1884 == -1) {
						this.aByte1884 = var3.aByte1884;
					}

					if (this.aByte1884 != var3.aByte1884) {
						var5 = true;
					}
				}

				var6 |= var3.aByteArray1874 != null;
				var9 |= var3.aShortArray1860 != null;
				var8 |= var3.aByteArray1875 != null;
			}
		}

		this.verticesX = new int[this.anInt1864];
		this.verticesY = new int[this.anInt1864];
		this.verticesZ = new int[this.anInt1864];
		this.anIntArray1867 = new int[this.anInt1900];
		this.anIntArray1868 = new int[this.anInt1900];
		this.anIntArray1869 = new int[this.anInt1900];
		this.anIntArray1870 = new int[this.anInt1900];
		this.anIntArray1871 = new int[this.anInt1900];
		this.anIntArray1872 = new int[this.anInt1900];
		if (var5) {
			this.aByteArray1888 = new byte[this.anInt1900];
		}

		if (var6) {
			this.aByteArray1874 = new byte[this.anInt1900];
		}

		if (var9) {
			this.aShortArray1860 = new short[this.anInt1900];
		}

		if (var8) {
			this.aByteArray1875 = new byte[this.anInt1900];
		}

		if (this.anInt1878 > 0) {
			this.anIntArray1879 = new int[this.anInt1878];
			this.anIntArray1880 = new int[this.anInt1878];
			this.anIntArray1906 = new int[this.anInt1878];
		}

		this.anInt1864 = 0;
		this.anInt1900 = 0;
		this.anInt1878 = 0;

		for (var7 = 0; var7 < var2; var7++) {
			var3 = var1[var7];
			if (var3 != null) {
				int var4;
				for (var4 = 0; var4 < var3.anInt1900; var4++) {
					this.anIntArray1867[this.anInt1900] = var3.anIntArray1867[var4] + this.anInt1864;
					this.anIntArray1868[this.anInt1900] = var3.anIntArray1868[var4] + this.anInt1864;
					this.anIntArray1869[this.anInt1900] = var3.anIntArray1869[var4] + this.anInt1864;
					this.anIntArray1870[this.anInt1900] = var3.anIntArray1870[var4];
					this.anIntArray1871[this.anInt1900] = var3.anIntArray1871[var4];
					this.anIntArray1872[this.anInt1900] = var3.anIntArray1872[var4];
					if (var5) {
						if (var3.aByteArray1888 != null) {
							this.aByteArray1888[this.anInt1900] = var3.aByteArray1888[var4];
						} else {
							this.aByteArray1888[this.anInt1900] = var3.aByte1884;
						}
					}

					if (var6 && var3.aByteArray1874 != null) {
						this.aByteArray1874[this.anInt1900] = var3.aByteArray1874[var4];
					}

					if (var9) {
						if (var3.aShortArray1860 != null) {
							this.aShortArray1860[this.anInt1900] = var3.aShortArray1860[var4];
						} else {
							this.aShortArray1860[this.anInt1900] = -1;
						}
					}

					if (var8) {
						if (var3.aByteArray1875 != null && var3.aByteArray1875[var4] != -1) {
							this.aByteArray1875[this.anInt1900] = (byte) (var3.aByteArray1875[var4] + this.anInt1878);
						} else {
							this.aByteArray1875[this.anInt1900] = -1;
						}
					}

					++this.anInt1900;
				}

				for (var4 = 0; var4 < var3.anInt1878; var4++) {
					this.anIntArray1879[this.anInt1878] = var3.anIntArray1879[var4] + this.anInt1864;
					this.anIntArray1880[this.anInt1878] = var3.anIntArray1880[var4] + this.anInt1864;
					this.anIntArray1906[this.anInt1878] = var3.anIntArray1906[var4] + this.anInt1864;
					++this.anInt1878;
				}

				for (var4 = 0; var4 < var3.anInt1864; var4++) {
					this.verticesX[this.anInt1864] = var3.verticesX[var4];
					this.verticesY[this.anInt1864] = var3.verticesY[var4];
					this.verticesZ[this.anInt1864] = var3.verticesZ[var4];
					++this.anInt1864;
				}
			}
		}

	}

	public void method1008(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.anInt1864; var4++) {
			this.verticesX[var4] += var1;
			this.verticesY[var4] += var2;
			this.verticesZ[var4] += var3;
		}

		this.anInt1866 = 0;
	}

	void method653(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		anIntArray1894[0] = -1;
		if (this.anInt1866 != 1) {
			this.method998();
		}

		int var10 = var8 * var5 - var6 * var4 >> 16;
		int var11 = var7 * var2 + var10 * var3 >> 16;
		int var12 = this.XYZMag * var3 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = var8 * var4 + var6 * var5 >> 16;
			int var15 = (var14 - this.XYZMag) * TexturedGraphic.anInt1784;
			if (var15 / var13 < TexturedGraphic.anInt1777) {
				int var16 = (this.XYZMag + var14) * TexturedGraphic.anInt1784;
				if (var16 / var13 > TexturedGraphic.anInt1789) {
					int var17 = var7 * var3 - var10 * var2 >> 16;
					int var18 = this.XYZMag * var2 >> 16;
					int var19 = (var17 + var18) * TexturedGraphic.anInt1784;
					if (var19 / var13 > TexturedGraphic.anInt1797) {
						int var20 = (this.modelHeight * 1812947537 * var3 >> 16) + var18;
						int var21 = (var17 - var20) * TexturedGraphic.anInt1784;
						if (var21 / var13 < TexturedGraphic.anInt1783) {
							int var22 = (this.modelHeight * 1812947537 * var2 >> 16) + var12;
							boolean var23 = false;
							boolean var24 = false;
							if (var11 - var22 <= 50) {
								var24 = true;
							}

							boolean var25 = var24 || this.anInt1878 > 0;
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if (var9 > 0 && aBool1904) {
								var27 = var11 - var12;
								if (var27 <= 50) {
									var27 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = anInt1905 - TexturedGraphic.anInt1785;
								var29 = anInt1910 - TexturedGraphic.anInt1786;
								if (var28 > var15 && var28 < var16 && var29 > var21 && var29 < var19) {
									if (this.allowClickBounds) {
										onCursorUids[onCursorCount++] = var9;
									} else {
										var26 = true;
									}
								}
							}

							var27 = TexturedGraphic.anInt1785;
							var28 = TexturedGraphic.anInt1786;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = SIN_TABLE[var1];
								var30 = COS_TABLE[var1];
							}

							for (int var31 = 0; var31 < this.anInt1864; var31++) {
								int var32 = this.verticesX[var31];
								int var33 = this.verticesY[var31];
								int var34 = this.verticesZ[var31];
								int var35;
								if (var1 != 0) {
									var35 = var34 * var29 + var32 * var30 >> 16;
									var34 = var34 * var30 - var32 * var29 >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = var34 * var4 + var32 * var5 >> 16;
								var34 = var34 * var5 - var32 * var4 >> 16;
								var32 = var35;
								var35 = var33 * var3 - var34 * var2 >> 16;
								var34 = var33 * var2 + var34 * var3 >> 16;
								anIntArray1891[var31] = var34 - var11;
								if (var34 >= 50) {
									anIntArray1889[var31] = TexturedGraphic.anInt1784 * var32 / var34 + var27;
									anIntArray1890[var31] = TexturedGraphic.anInt1784 * var35 / var34 + var28;
								} else {
									anIntArray1889[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									yViewportBuffer[var31] = var32;
									anIntArray1892[var31] = var35;
									anIntArray1893[var31] = var34;
								}
							}

							try {
								this.method1015(var23, var26, var9);
							} catch (Exception var36) {
								;
							}
						}
					}
				}
			}
		}

	}

	final boolean method1009(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		return var2 < var3 && var2 < var4 && var2 < var5 ? false
				: (var2 > var3 && var2 > var4 && var2 > var5 ? false
						: (var1 < var6 && var1 < var7 && var1 < var8 ? false
								: var1 <= var6 || var1 <= var7 || var1 <= var8));
	}

	final void method1010(int var1) {
		int var2 = TexturedGraphic.anInt1785;
		int var20 = TexturedGraphic.anInt1786;
		int var15 = 0;
		int var12 = this.anIntArray1867[var1];
		int var19 = this.anIntArray1868[var1];
		int var13 = this.anIntArray1869[var1];
		int var17 = anIntArray1893[var12];
		int var18 = anIntArray1893[var19];
		int var16 = anIntArray1893[var13];
		if (this.aByteArray1874 == null) {
			TexturedGraphic.anInt1781 = 0;
		} else {
			TexturedGraphic.anInt1781 = this.aByteArray1874[var1] & 0xff;
		}

		int var3;
		int var6;
		int var7;
		int var8;
		if (var17 >= 50) {
			anIntArray1899[var15] = anIntArray1889[var12];
			anIntArray1882[var15] = anIntArray1890[var12];
			xViewportBuffer[var15++] = this.anIntArray1870[var1];
		} else {
			var6 = yViewportBuffer[var12];
			var7 = anIntArray1892[var12];
			var8 = this.anIntArray1870[var1];
			if (var16 >= 50) {
				var3 = (50 - var17) * anIntArray1911[var16 - var17];
				anIntArray1899[var15] = (((yViewportBuffer[var13] - var6) * var3 >> 16) + var6)
						* TexturedGraphic.anInt1784 / 50 + var2;
				anIntArray1882[var15] = (((anIntArray1892[var13] - var7) * var3 >> 16) + var7)
						* TexturedGraphic.anInt1784 / 50 + var20;
				xViewportBuffer[var15++] = ((this.anIntArray1872[var1] - var8) * var3 >> 16) + var8;
			}

			if (var18 >= 50) {
				var3 = (50 - var17) * anIntArray1911[var18 - var17];
				anIntArray1899[var15] = (((yViewportBuffer[var19] - var6) * var3 >> 16) + var6)
						* TexturedGraphic.anInt1784 / 50 + var2;
				anIntArray1882[var15] = (((anIntArray1892[var19] - var7) * var3 >> 16) + var7)
						* TexturedGraphic.anInt1784 / 50 + var20;
				xViewportBuffer[var15++] = ((this.anIntArray1871[var1] - var8) * var3 >> 16) + var8;
			}
		}

		if (var18 >= 50) {
			anIntArray1899[var15] = anIntArray1889[var19];
			anIntArray1882[var15] = anIntArray1890[var19];
			xViewportBuffer[var15++] = this.anIntArray1871[var1];
		} else {
			var6 = yViewportBuffer[var19];
			var7 = anIntArray1892[var19];
			var8 = this.anIntArray1871[var1];
			if (var17 >= 50) {
				var3 = (50 - var18) * anIntArray1911[var17 - var18];
				anIntArray1899[var15] = (((yViewportBuffer[var12] - var6) * var3 >> 16) + var6)
						* TexturedGraphic.anInt1784 / 50 + var2;
				anIntArray1882[var15] = (((anIntArray1892[var12] - var7) * var3 >> 16) + var7)
						* TexturedGraphic.anInt1784 / 50 + var20;
				xViewportBuffer[var15++] = ((this.anIntArray1870[var1] - var8) * var3 >> 16) + var8;
			}

			if (var16 >= 50) {
				var3 = (50 - var18) * anIntArray1911[var16 - var18];
				anIntArray1899[var15] = (((yViewportBuffer[var13] - var6) * var3 >> 16) + var6)
						* TexturedGraphic.anInt1784 / 50 + var2;
				anIntArray1882[var15] = (((anIntArray1892[var13] - var7) * var3 >> 16) + var7)
						* TexturedGraphic.anInt1784 / 50 + var20;
				xViewportBuffer[var15++] = ((this.anIntArray1872[var1] - var8) * var3 >> 16) + var8;
			}
		}

		if (var16 >= 50) {
			anIntArray1899[var15] = anIntArray1889[var13];
			anIntArray1882[var15] = anIntArray1890[var13];
			xViewportBuffer[var15++] = this.anIntArray1872[var1];
		} else {
			var6 = yViewportBuffer[var13];
			var7 = anIntArray1892[var13];
			var8 = this.anIntArray1872[var1];
			if (var18 >= 50) {
				var3 = (50 - var16) * anIntArray1911[var18 - var16];
				anIntArray1899[var15] = (((yViewportBuffer[var19] - var6) * var3 >> 16) + var6)
						* TexturedGraphic.anInt1784 / 50 + var2;
				anIntArray1882[var15] = (((anIntArray1892[var19] - var7) * var3 >> 16) + var7)
						* TexturedGraphic.anInt1784 / 50 + var20;
				xViewportBuffer[var15++] = ((this.anIntArray1871[var1] - var8) * var3 >> 16) + var8;
			}

			if (var17 >= 50) {
				var3 = (50 - var16) * anIntArray1911[var17 - var16];
				anIntArray1899[var15] = (((yViewportBuffer[var12] - var6) * var3 >> 16) + var6)
						* TexturedGraphic.anInt1784 / 50 + var2;
				anIntArray1882[var15] = (((anIntArray1892[var12] - var7) * var3 >> 16) + var7)
						* TexturedGraphic.anInt1784 / 50 + var20;
				xViewportBuffer[var15++] = ((this.anIntArray1870[var1] - var8) * var3 >> 16) + var8;
			}
		}

		var6 = anIntArray1899[0];
		var7 = anIntArray1899[1];
		var8 = anIntArray1899[2];
		var3 = anIntArray1882[0];
		int var4 = anIntArray1882[1];
		int var5 = anIntArray1882[2];
		TexturedGraphic.aBool1782 = false;
		int var9;
		int var10;
		int var11;
		int var14;
		if (var15 == 3) {
			if (var6 < 0 || var7 < 0 || var8 < 0 || var6 > TexturedGraphic.anInt1791 || var7 > TexturedGraphic.anInt1791
					|| var8 > TexturedGraphic.anInt1791) {
				TexturedGraphic.aBool1782 = true;
			}

			if (this.aShortArray1860 != null && this.aShortArray1860[var1] != -1) {
				if (this.aByteArray1875 != null && this.aByteArray1875[var1] != -1) {
					var14 = this.aByteArray1875[var1] & 0xff;
					var9 = this.anIntArray1879[var14];
					var10 = this.anIntArray1880[var14];
					var11 = this.anIntArray1906[var14];
				} else {
					var9 = var12;
					var10 = var19;
					var11 = var13;
				}

				if (this.anIntArray1872[var1] == -1) {
					TexturedGraphic.method912(var3, var4, var5, var6, var7, var8, this.anIntArray1870[var1],
							this.anIntArray1870[var1], this.anIntArray1870[var1], yViewportBuffer[var9],
							yViewportBuffer[var10], yViewportBuffer[var11], anIntArray1892[var9], anIntArray1892[var10],
							anIntArray1892[var11], anIntArray1893[var9], anIntArray1893[var10], anIntArray1893[var11],
							this.aShortArray1860[var1]);
				} else {
					TexturedGraphic.method912(var3, var4, var5, var6, var7, var8, xViewportBuffer[0],
							xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[var9], yViewportBuffer[var10],
							yViewportBuffer[var11], anIntArray1892[var9], anIntArray1892[var10], anIntArray1892[var11],
							anIntArray1893[var9], anIntArray1893[var10], anIntArray1893[var11],
							this.aShortArray1860[var1]);
				}
			} else if (this.anIntArray1872[var1] == -1) {
				TexturedGraphic.method917(var3, var4, var5, var6, var7, var8,
						anIntArray1907[this.anIntArray1870[var1]]);
			} else {
				TexturedGraphic.method922(var3, var4, var5, var6, var7, var8, xViewportBuffer[0], xViewportBuffer[1],
						xViewportBuffer[2]);
			}
		}

		if (var15 == 4) {
			if (var6 < 0 || var7 < 0 || var8 < 0 || var6 > TexturedGraphic.anInt1791 || var7 > TexturedGraphic.anInt1791
					|| var8 > TexturedGraphic.anInt1791 || anIntArray1899[3] < 0
					|| anIntArray1899[3] > TexturedGraphic.anInt1791) {
				TexturedGraphic.aBool1782 = true;
			}

			if (this.aShortArray1860 != null && this.aShortArray1860[var1] != -1) {
				if (this.aByteArray1875 != null && this.aByteArray1875[var1] != -1) {
					var14 = this.aByteArray1875[var1] & 0xff;
					var9 = this.anIntArray1879[var14];
					var10 = this.anIntArray1880[var14];
					var11 = this.anIntArray1906[var14];
				} else {
					var9 = var12;
					var10 = var19;
					var11 = var13;
				}

				short var21 = this.aShortArray1860[var1];
				if (this.anIntArray1872[var1] == -1) {
					TexturedGraphic.method912(var3, var4, var5, var6, var7, var8, this.anIntArray1870[var1],
							this.anIntArray1870[var1], this.anIntArray1870[var1], yViewportBuffer[var9],
							yViewportBuffer[var10], yViewportBuffer[var11], anIntArray1892[var9], anIntArray1892[var10],
							anIntArray1892[var11], anIntArray1893[var9], anIntArray1893[var10], anIntArray1893[var11],
							var21);
					TexturedGraphic.method912(var3, var5, anIntArray1882[3], var6, var8, anIntArray1899[3],
							this.anIntArray1870[var1], this.anIntArray1870[var1], this.anIntArray1870[var1],
							yViewportBuffer[var9], yViewportBuffer[var10], yViewportBuffer[var11], anIntArray1892[var9],
							anIntArray1892[var10], anIntArray1892[var11], anIntArray1893[var9], anIntArray1893[var10],
							anIntArray1893[var11], var21);
				} else {
					TexturedGraphic.method912(var3, var4, var5, var6, var7, var8, xViewportBuffer[0],
							xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[var9], yViewportBuffer[var10],
							yViewportBuffer[var11], anIntArray1892[var9], anIntArray1892[var10], anIntArray1892[var11],
							anIntArray1893[var9], anIntArray1893[var10], anIntArray1893[var11], var21);
					TexturedGraphic.method912(var3, var5, anIntArray1882[3], var6, var8, anIntArray1899[3],
							xViewportBuffer[0], xViewportBuffer[2], xViewportBuffer[3], yViewportBuffer[var9],
							yViewportBuffer[var10], yViewportBuffer[var11], anIntArray1892[var9], anIntArray1892[var10],
							anIntArray1892[var11], anIntArray1893[var9], anIntArray1893[var10], anIntArray1893[var11],
							var21);
				}
			} else if (this.anIntArray1872[var1] == -1) {
				var9 = anIntArray1907[this.anIntArray1870[var1]];
				TexturedGraphic.method917(var3, var4, var5, var6, var7, var8, var9);
				TexturedGraphic.method917(var3, var5, anIntArray1882[3], var6, var8, anIntArray1899[3], var9);
			} else {
				TexturedGraphic.method922(var3, var4, var5, var6, var7, var8, xViewportBuffer[0], xViewportBuffer[1],
						xViewportBuffer[2]);
				TexturedGraphic.method922(var3, var5, anIntArray1882[3], var6, var8, anIntArray1899[3],
						xViewportBuffer[0], xViewportBuffer[2], xViewportBuffer[3]);
			}
		}

	}

	final void method1011(int var1) {
		if (aBoolArray1902[var1]) {
			this.method1010(var1);
		} else {
			int var8 = this.anIntArray1867[var1];
			int var4 = this.anIntArray1868[var1];
			int var2 = this.anIntArray1869[var1];
			TexturedGraphic.aBool1782 = aBoolArray1887[var1];
			if (this.aByteArray1874 == null) {
				TexturedGraphic.anInt1781 = 0;
			} else {
				TexturedGraphic.anInt1781 = this.aByteArray1874[var1] & 0xff;
			}

			if (this.aShortArray1860 != null && this.aShortArray1860[var1] != -1) {
				int var3;
				int var5;
				int var7;
				if (this.aByteArray1875 != null && this.aByteArray1875[var1] != -1) {
					int var6 = this.aByteArray1875[var1] & 0xff;
					var7 = this.anIntArray1879[var6];
					var5 = this.anIntArray1880[var6];
					var3 = this.anIntArray1906[var6];
				} else {
					var7 = var8;
					var5 = var4;
					var3 = var2;
				}

				if (this.anIntArray1872[var1] == -1) {
					TexturedGraphic.method912(anIntArray1890[var8], anIntArray1890[var4], anIntArray1890[var2],
							anIntArray1889[var8], anIntArray1889[var4], anIntArray1889[var2], this.anIntArray1870[var1],
							this.anIntArray1870[var1], this.anIntArray1870[var1], yViewportBuffer[var7],
							yViewportBuffer[var5], yViewportBuffer[var3], anIntArray1892[var7], anIntArray1892[var5],
							anIntArray1892[var3], anIntArray1893[var7], anIntArray1893[var5], anIntArray1893[var3],
							this.aShortArray1860[var1]);
				} else {
					TexturedGraphic.method912(anIntArray1890[var8], anIntArray1890[var4], anIntArray1890[var2],
							anIntArray1889[var8], anIntArray1889[var4], anIntArray1889[var2], this.anIntArray1870[var1],
							this.anIntArray1871[var1], this.anIntArray1872[var1], yViewportBuffer[var7],
							yViewportBuffer[var5], yViewportBuffer[var3], anIntArray1892[var7], anIntArray1892[var5],
							anIntArray1892[var3], anIntArray1893[var7], anIntArray1893[var5], anIntArray1893[var3],
							this.aShortArray1860[var1]);
				}
			} else if (this.anIntArray1872[var1] == -1) {
				TexturedGraphic.method917(anIntArray1890[var8], anIntArray1890[var4], anIntArray1890[var2],
						anIntArray1889[var8], anIntArray1889[var4], anIntArray1889[var2],
						anIntArray1907[this.anIntArray1870[var1]]);
			} else {
				TexturedGraphic.method922(anIntArray1890[var8], anIntArray1890[var4], anIntArray1890[var2],
						anIntArray1889[var8], anIntArray1889[var4], anIntArray1889[var2], this.anIntArray1870[var1],
						this.anIntArray1871[var1], this.anIntArray1872[var1]);
			}
		}

	}

	public final void method1012(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		anIntArray1894[0] = -1;
		if (this.anInt1866 != 2 && this.anInt1866 != 1) {
			this.method999();
		}

		int var8 = TexturedGraphic.anInt1785;
		int var9 = TexturedGraphic.anInt1786;
		int var10 = SIN_TABLE[var1];
		int var11 = COS_TABLE[var1];
		int var12 = SIN_TABLE[var2];
		int var13 = COS_TABLE[var2];
		int var14 = SIN_TABLE[var3];
		int var15 = COS_TABLE[var3];
		int var16 = SIN_TABLE[var4];
		int var17 = COS_TABLE[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < this.anInt1864; var19++) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			anIntArray1891[var19] = var22 - var18;
			anIntArray1889[var19] = TexturedGraphic.anInt1784 * var20 / var22 + var8;
			anIntArray1890[var19] = TexturedGraphic.anInt1784 * var23 / var22 + var9;
			if (this.anInt1878 > 0) {
				yViewportBuffer[var19] = var20;
				anIntArray1892[var19] = var23;
				anIntArray1893[var19] = var22;
			}
		}

		try {
			this.method1015(false, false, 0);
		} catch (Exception var24) {
			;
		}

	}

	public void method1013() {
		for (int var1 = 0; var1 < this.anInt1864; var1++) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.anInt1866 = 0;
	}

	Rasterizer() {
	}

	public final void method1014(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		anIntArray1894[0] = -1;
		if (this.anInt1866 != 2 && this.anInt1866 != 1) {
			this.method999();
		}

		int var9 = TexturedGraphic.anInt1785;
		int var10 = TexturedGraphic.anInt1786;
		int var11 = SIN_TABLE[var1];
		int var12 = COS_TABLE[var1];
		int var13 = SIN_TABLE[var2];
		int var14 = COS_TABLE[var2];
		int var15 = SIN_TABLE[var3];
		int var16 = COS_TABLE[var3];
		int var17 = SIN_TABLE[var4];
		int var18 = COS_TABLE[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.anInt1864; var20++) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			anIntArray1891[var20] = var23 - var19;
			anIntArray1889[var20] = TexturedGraphic.anInt1784 * var21 / var8 + var9;
			anIntArray1890[var20] = TexturedGraphic.anInt1784 * var24 / var8 + var10;
			if (this.anInt1878 > 0) {
				yViewportBuffer[var20] = var21;
				anIntArray1892[var20] = var24;
				anIntArray1893[var20] = var23;
			}
		}

		try {
			this.method1015(false, false, 0);
		} catch (Exception var25) {
			;
		}

	}

	final void method1015(boolean var1, boolean var2, int var3) {
		if (this.anInt1897 < 1600) {
			int var9;
			for (var9 = 0; var9 < this.anInt1897; var9++) {
				anIntArray1894[var9] = 0;
			}

			int var5;
			int var6;
			int var7;
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			for (var9 = 0; var9 < this.anInt1900; var9++) {
				if (this.anIntArray1872[var9] != -2) {
					var7 = this.anIntArray1867[var9];
					var11 = this.anIntArray1868[var9];
					var6 = this.anIntArray1869[var9];
					var5 = anIntArray1889[var7];
					var10 = anIntArray1889[var11];
					var12 = anIntArray1889[var6];
					int var27;
					if (!var1 || var5 != -5000 && var10 != -5000 && var12 != -5000) {
						if (var2 && this.method1009(anInt1905, anInt1910, anIntArray1890[var7], anIntArray1890[var11],
								anIntArray1890[var6], var5, var10, var12)) {
							onCursorUids[onCursorCount++] = var3;
							var2 = false;
						}

						if ((var5 - var10) * (anIntArray1890[var6] - anIntArray1890[var11])
								- (anIntArray1890[var7] - anIntArray1890[var11]) * (var12 - var10) > 0) {
							aBoolArray1902[var9] = false;
							if (var5 >= 0 && var10 >= 0 && var12 >= 0 && var5 <= TexturedGraphic.anInt1791
									&& var10 <= TexturedGraphic.anInt1791 && var12 <= TexturedGraphic.anInt1791) {
								aBoolArray1887[var9] = false;
							} else {
								aBoolArray1887[var9] = true;
							}

							var27 = (anIntArray1891[var7] + anIntArray1891[var11] + anIntArray1891[var6]) / 3
									+ this.anInt1885;
							anIntArrayArray1876[var27][anIntArray1894[var27]++] = var9;
						}
					} else {
						var27 = yViewportBuffer[var7];
						var13 = yViewportBuffer[var11];
						var14 = yViewportBuffer[var6];
						int var28 = anIntArray1892[var7];
						var15 = anIntArray1892[var11];
						int var24 = anIntArray1892[var6];
						int var25 = anIntArray1893[var7];
						int var19 = anIntArray1893[var11];
						int var18 = anIntArray1893[var6];
						var27 -= var13;
						var14 -= var13;
						var28 -= var15;
						var24 -= var15;
						var25 -= var19;
						var18 -= var19;
						int var21 = var28 * var18 - var25 * var24;
						int var22 = var25 * var14 - var27 * var18;
						int var23 = var27 * var24 - var28 * var14;
						if (var13 * var21 + var15 * var22 + var19 * var23 > 0) {
							aBoolArray1902[var9] = true;
							int var20 = (anIntArray1891[var7] + anIntArray1891[var11] + anIntArray1891[var6]) / 3
									+ this.anInt1885;
							anIntArrayArray1876[var20][anIntArray1894[var20]++] = var9;
						}
					}
				}
			}

			int[] var241;
			if (this.aByteArray1888 == null) {
				for (var9 = this.anInt1897 - 1; var9 >= 0; --var9) {
					var7 = anIntArray1894[var9];
					if (var7 > 0) {
						var241 = anIntArrayArray1876[var9];

						for (var6 = 0; var6 < var7; var6++) {
							this.method1011(var241[var6]);
						}
					}
				}
			} else {
				for (var9 = 0; var9 < 12; var9++) {
					anIntArray1896[var9] = 0;
					anIntArray1865[var9] = 0;
				}

				for (var9 = this.anInt1897 - 1; var9 >= 0; --var9) {
					var7 = anIntArray1894[var9];
					if (var7 > 0) {
						var241 = anIntArrayArray1876[var9];

						for (var6 = 0; var6 < var7; var6++) {
							var5 = var241[var6];
							byte var251 = this.aByteArray1888[var5];
							var12 = anIntArray1896[var251]++;
							anIntArrayArray1901[var251][var12] = var5;
							if (var251 < 10) {
								anIntArray1865[var251] += var9;
							} else if (var251 == 10) {
								anIntArray1877[var12] = var9;
							} else {
								anIntArray1898[var12] = var9;
							}
						}
					}
				}

				var9 = 0;
				if (anIntArray1896[1] > 0 || anIntArray1896[2] > 0) {
					var9 = (anIntArray1865[1] + anIntArray1865[2]) / (anIntArray1896[1] + anIntArray1896[2]);
				}

				var7 = 0;
				if (anIntArray1896[3] > 0 || anIntArray1896[4] > 0) {
					var7 = (anIntArray1865[3] + anIntArray1865[4]) / (anIntArray1896[3] + anIntArray1896[4]);
				}

				var11 = 0;
				if (anIntArray1896[6] > 0 || anIntArray1896[8] > 0) {
					var11 = (anIntArray1865[6] + anIntArray1865[8]) / (anIntArray1896[6] + anIntArray1896[8]);
				}

				var5 = 0;
				var10 = anIntArray1896[10];
				int[] var26 = anIntArrayArray1901[10];
				int[] var271 = anIntArray1877;
				if (var5 == var10) {
					var5 = 0;
					var10 = anIntArray1896[11];
					var26 = anIntArrayArray1901[11];
					var271 = anIntArray1898;
				}

				if (var5 < var10) {
					var6 = var271[var5];
				} else {
					var6 = -1000;
				}

				for (var13 = 0; var13 < 10; var13++) {
					while (var13 == 0 && var6 > var9) {
						this.method1011(var26[var5++]);
						if (var5 == var10 && anIntArrayArray1901[11] != var26) {
							var5 = 0;
							var10 = anIntArray1896[11];
							var26 = anIntArrayArray1901[11];
							var271 = anIntArray1898;
						}

						if (var5 < var10) {
							var6 = var271[var5];
						} else {
							var6 = -1000;
						}
					}

					while (var13 == 3 && var6 > var7) {
						this.method1011(var26[var5++]);
						if (var5 == var10 && anIntArrayArray1901[11] != var26) {
							var5 = 0;
							var10 = anIntArray1896[11];
							var26 = anIntArrayArray1901[11];
							var271 = anIntArray1898;
						}

						if (var5 < var10) {
							var6 = var271[var5];
						} else {
							var6 = -1000;
						}
					}

					while (var13 == 5 && var6 > var11) {
						this.method1011(var26[var5++]);
						if (var5 == var10 && anIntArrayArray1901[11] != var26) {
							var5 = 0;
							var10 = anIntArray1896[11];
							var26 = anIntArrayArray1901[11];
							var271 = anIntArray1898;
						}

						if (var5 < var10) {
							var6 = var271[var5];
						} else {
							var6 = -1000;
						}
					}

					var14 = anIntArray1896[var13];
					int[] var281 = anIntArrayArray1901[var13];

					for (var15 = 0; var15 < var14; var15++) {
						this.method1011(var281[var15]);
					}
				}

				while (var6 != -1000) {
					this.method1011(var26[var5++]);
					if (var5 == var10 && anIntArrayArray1901[11] != var26) {
						var5 = 0;
						var26 = anIntArrayArray1901[11];
						var10 = anIntArray1896[11];
						var271 = anIntArray1898;
					}

					if (var5 < var10) {
						var6 = var271[var5];
					} else {
						var6 = -1000;
					}
				}
			}
		}

	}

	static {
		anIntArray1907 = TexturedGraphic.anIntArray1793;
		SIN_TABLE = TexturedGraphic.SIN_TABLE;
		COS_TABLE = TexturedGraphic.COS_TABLE;
		anInt1910 = 0;
		anIntArray1911 = TexturedGraphic.anIntArray1795;
	}

}
