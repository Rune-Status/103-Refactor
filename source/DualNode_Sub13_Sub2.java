
public final class DualNode_Sub13_Sub2 extends RSGraphics {

	public int[] anIntArray1798;
	public byte[] aByteArray1799;
	public int anInt1800;
	public int anInt1801;
	public int anInt1802;
	public int anInt1803;
	public int anInt1804;
	public int anInt1805;

	public void method927(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.anIntArray1798.length; ++var4) {
			int var5 = this.anIntArray1798[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var7 = this.anIntArray1798[var4] >> 8 & 255;
			var7 += var2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			int var6 = this.anIntArray1798[var4] & 255;
			var6 += var3;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			this.anIntArray1798[var4] = (var5 << 16) + (var7 << 8) + var6;
		}

	}

	static void method928(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			byte var11;
			int var12;
			for (var12 = var9; var12 < 0; ++var12) {
				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 255];
				} else {
					++var4;
				}

				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 255];
				} else {
					++var4;
				}

				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 255];
				} else {
					++var4;
				}

				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 255];
				} else {
					++var4;
				}
			}

			for (var12 = var5; var12 < 0; ++var12) {
				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method929(int var1, int var2) {
		var1 += this.anInt1803;
		var2 += this.anInt1802;
		int var4 = var1 + var2 * raster_width;
		int var9 = 0;
		int var3 = this.anInt1801;
		int var5 = this.anInt1800;
		int var7 = raster_width - var5;
		int var8 = 0;
		int var6;
		if (var2 < draw_region_y) {
			var6 = draw_region_y - var2;
			var3 -= var6;
			var2 = draw_region_y;
			var9 += var6 * var5;
			var4 += var6 * raster_width;
		}

		if (var2 + var3 > draw_region_max_y) {
			var3 -= var2 + var3 - draw_region_max_y;
		}

		if (var1 < draw_region_x) {
			var6 = draw_region_x - var1;
			var5 -= var6;
			var1 = draw_region_x;
			var9 += var6;
			var4 += var6;
			var8 += var6;
			var7 += var6;
		}

		if (var1 + var5 > draw_region_max_x) {
			var6 = var1 + var5 - draw_region_max_x;
			var5 -= var6;
			var8 += var6;
			var7 += var6;
		}

		if (var5 > 0 && var3 > 0) {
			method928(raster, this.aByteArray1799, this.anIntArray1798, var9, var4, var5, var3, var7, var8);
		}
	}

	public void method930() {
		if (this.anInt1800 != this.anInt1804 || this.anInt1801 != this.anInt1805) {
			byte[] var3 = new byte[this.anInt1804 * this.anInt1805];
			int var4 = 0;

			for (int var1 = 0; var1 < this.anInt1801; ++var1) {
				for (int var2 = 0; var2 < this.anInt1800; ++var2) {
					var3[var2 + this.anInt1803
							+ (var1 + this.anInt1802) * this.anInt1804] = this.aByteArray1799[var4++];
				}
			}

			this.aByteArray1799 = var3;
			this.anInt1800 = this.anInt1804;
			this.anInt1801 = this.anInt1805;
			this.anInt1803 = 0;
			this.anInt1802 = 0;
		}
	}

}
