public final class IndexedSprite extends Raster {

	public int[] palette;
	public int width;
	public int height;
	public byte[] pixels;
	public int subWidth;
	public int subHeight;
	public int offsetX;
	public int offsetY;

	public void method927(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.palette.length; var4++) {
			int var5 = this.palette[var4] >> 16 & 0xff;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var7 = this.palette[var4] >> 8 & 0xff;
			var7 += var2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			int var6 = this.palette[var4] & 0xff;
			var6 += var3;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			this.palette[var4] = (var5 << 16) + (var7 << 8) + var6;
		}

	}

	static void method928(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 0x3);

		for (int var10 = -var6; var10 < 0; var10++) {
			byte var11;
			int var12;
			for (var12 = var9; var12 < 0; var12++) {
				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 0xff];
				} else {
					++var4;
				}

				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 0xff];
				} else {
					++var4;
				}

				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 0xff];
				} else {
					++var4;
				}

				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 0xff];
				} else {
					++var4;
				}
			}

			for (var12 = var5; var12 < 0; var12++) {
				var11 = var1[var3++];
				if (var11 != 0) {
					var0[var4++] = var2[var11 & 0xff];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method929(int var1, int var2) {
		var1 += this.offsetX;
		var2 += this.offsetY;
		int var4 = raster_width * var2 + var1;
		int var9 = 0;
		int var3 = this.subHeight;
		int var5 = this.subWidth;
		int var7 = raster_width - var5;
		int var8 = 0;
		int var6;
		if (var2 < draw_region_y) {
			var6 = draw_region_y - var2;
			var3 -= var6;
			var2 = draw_region_y;
			var9 += var6 * var5;
			var4 += raster_width * var6;
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
			method928(raster, this.pixels, this.palette, var9, var4, var5, var3, var7, var8);
		}

	}

	public void method930() {
		if (this.subWidth != this.width || this.subHeight != this.height) {
			byte[] var3 = new byte[this.width * this.height];
			int var4 = 0;

			for (int var1 = 0; var1 < this.subHeight; var1++) {
				for (int var2 = 0; var2 < this.subWidth; var2++) {
					var3[this.offsetX + var2 + (this.offsetY + var1) * this.width] = this.pixels[var4++];
				}
			}

			this.pixels = var3;
			this.subWidth = this.width;
			this.subHeight = this.height;
			this.offsetX = 0;
			this.offsetY = 0;
		}

	}

}
