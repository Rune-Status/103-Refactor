import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Picture extends RSGraphics {

	public int offsetX;
	public int subWidth;
	public int subHeight;
	public int width;
	public int height;
	public int offsetY;
	public int[] pixels;

	public Picture(int var1, int var2) {
		this.pixels = new int[var1 * var2];
		this.subWidth = this.width = var1;
		this.subHeight = this.height = var2;
		this.offsetY = 0;
		this.offsetX = 0;
	}

	public Picture method937() {
		Picture var1 = new Picture(this.subWidth, this.subHeight);
		var1.width = this.width;
		var1.height = this.height;
		var1.offsetX = this.width - this.subWidth - this.offsetX;
		var1.offsetY = this.offsetY;

		for (int var3 = 0; var3 < this.subHeight; ++var3) {
			for (int var2 = 0; var2 < this.subWidth; ++var2) {
				var1.pixels[var3 * this.subWidth + var2] = this.pixels[var3 * this.subWidth + this.subWidth - 1 - var2];
			}
		}

		return var1;
	}

	public Picture copy() {
		Picture var1 = new Picture(this.width, this.height);

		for (int var3 = 0; var3 < this.subHeight; ++var3) {
			for (int var2 = 0; var2 < this.subWidth; ++var2) {
				var1.pixels[(var3 + this.offsetY) * this.width + var2
						+ this.offsetX] = this.pixels[var3 * this.subWidth + var2];
			}
		}

		return var1;
	}

	public void method939() {
		setRaster(this.pixels, this.subWidth, this.subHeight);
	}

	static void method940(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
				;
			}

			var3 += var6;
			var2 += var7;
		}

	}

	public void method941(int var1) {
		if (this.subWidth != this.width || this.subHeight != this.height) {
			int var5 = var1;
			if (var1 > this.offsetX) {
				var5 = this.offsetX;
			}

			int var6 = var1;
			if (var1 + this.offsetX + this.subWidth > this.width) {
				var6 = this.width - this.offsetX - this.subWidth;
			}

			int var2 = var1;
			if (var1 > this.offsetY) {
				var2 = this.offsetY;
			}

			int var3 = var1;
			if (var1 + this.offsetY + this.subHeight > this.height) {
				var3 = this.height - this.offsetY - this.subHeight;
			}

			int var7 = this.subWidth + var5 + var6;
			int var4 = this.subHeight + var2 + var3;
			int[] var8 = new int[var7 * var4];

			for (int var9 = 0; var9 < this.subHeight; ++var9) {
				for (int var10 = 0; var10 < this.subWidth; ++var10) {
					var8[(var9 + var2) * var7 + var10 + var5] = this.pixels[var9 * this.subWidth + var10];
				}
			}

			this.pixels = var8;
			this.subWidth = var7;
			this.subHeight = var4;
			this.offsetX -= var5;
			this.offsetY -= var2;
		}
	}

	public void method942() {
		int[] var1 = new int[this.subWidth * this.subHeight];
		int var4 = 0;

		for (int var2 = 0; var2 < this.subHeight; ++var2) {
			for (int var3 = this.subWidth - 1; var3 >= 0; --var3) {
				var1[var4++] = this.pixels[var3 + var2 * this.subWidth];
			}
		}

		this.pixels = var1;
		this.offsetX = this.width - this.subWidth - this.offsetX;
	}

	public void method943() {
		int[] var1 = new int[this.subWidth * this.subHeight];
		int var4 = 0;

		for (int var2 = this.subHeight - 1; var2 >= 0; --var2) {
			for (int var3 = 0; var3 < this.subWidth; ++var3) {
				var1[var4++] = this.pixels[var3 + var2 * this.subWidth];
			}
		}

		this.pixels = var1;
		this.offsetY = this.height - this.subHeight - this.offsetY;
	}

	public void method944(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.subWidth;
			int var15 = this.subHeight;
			int var7 = 0;
			int var9 = 0;
			int var12 = this.width;
			int var10 = this.height;
			int var8 = (var12 << 16) / var3;
			int var14 = (var10 << 16) / var4;
			int var13;
			if (this.offsetX > 0) {
				var13 = ((this.offsetX << 16) + var8 - 1) / var8;
				var1 += var13;
				var7 += var13 * var8 - (this.offsetX << 16);
			}

			if (this.offsetY > 0) {
				var13 = ((this.offsetY << 16) + var14 - 1) / var14;
				var2 += var13;
				var9 += var13 * var14 - (this.offsetY << 16);
			}

			if (var6 < var12) {
				var3 = ((var6 << 16) - var7 + var8 - 1) / var8;
			}

			if (var15 < var10) {
				var4 = ((var15 << 16) - var9 + var14 - 1) / var14;
			}

			var13 = var1 + var2 * raster_width;
			int var11 = raster_width - var3;
			if (var2 + var4 > draw_region_max_y) {
				var4 -= var2 + var4 - draw_region_max_y;
			}

			int var5;
			if (var2 < draw_region_y) {
				var5 = draw_region_y - var2;
				var4 -= var5;
				var13 += var5 * raster_width;
				var9 += var14 * var5;
			}

			if (var1 + var3 > draw_region_max_x) {
				var5 = var1 + var3 - draw_region_max_x;
				var3 -= var5;
				var11 += var5;
			}

			if (var1 < draw_region_x) {
				var5 = draw_region_x - var1;
				var3 -= var5;
				var13 += var5;
				var7 += var8 * var5;
				var11 += var5;
			}

			method949(raster, this.pixels, 0, var7, var9, var13, var11, var3, var4, var8, var14, var6);
		}
	}

	public void method945(int var1, int var2, int var3, int var4) {
		this.method956(this.width << 3, this.height << 3, var1 << 4, var2 << 4, var3, var4);
	}

	public void method946(int var1, int var2) {
		var1 += this.offsetX;
		var2 += this.offsetY;
		int var3 = var1 + var2 * raster_width;
		int var5 = 0;
		int var6 = this.subHeight;
		int var7 = this.subWidth;
		int var8 = raster_width - var7;
		int var9 = 0;
		int var4;
		if (var2 < draw_region_y) {
			var4 = draw_region_y - var2;
			var6 -= var4;
			var2 = draw_region_y;
			var5 += var4 * var7;
			var3 += var4 * raster_width;
		}

		if (var2 + var6 > draw_region_max_y) {
			var6 -= var2 + var6 - draw_region_max_y;
		}

		if (var1 < draw_region_x) {
			var4 = draw_region_x - var1;
			var7 -= var4;
			var1 = draw_region_x;
			var5 += var4;
			var3 += var4;
			var9 += var4;
			var8 += var4;
		}

		if (var1 + var7 > draw_region_max_x) {
			var4 = var1 + var7 - draw_region_max_x;
			var7 -= var4;
			var9 += var4;
			var8 += var4;
		}

		if (var7 > 0 && var6 > 0) {
			method959(raster, this.pixels, 0, var5, var3, var7, var6, var8, var9);
		}
	}

	static void method947(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936)
							+ ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method948() {
		if (this.subWidth != this.width || this.subHeight != this.height) {
			int[] var2 = new int[this.width * this.height];

			for (int var3 = 0; var3 < this.subHeight; ++var3) {
				for (int var1 = 0; var1 < this.subWidth; ++var1) {
					var2[(var3 + this.offsetY) * this.width + var1
							+ this.offsetX] = this.pixels[var3 * this.subWidth + var1];
				}
			}

			this.pixels = var2;
			this.subWidth = this.width;
			this.subHeight = this.height;
			this.offsetX = 0;
			this.offsetY = 0;
		}
	}

	static void method949(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, int var11) {
		int var12 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			int var13 = (var4 >> 16) * var11;

			for (int var14 = -var7; var14 < 0; ++var14) {
				var2 = var1[(var3 >> 16) + var13];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	public void method950(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			this.method946(var1, var2);
		} else {
			var1 += this.offsetX;
			var2 += this.offsetY;
			int var7 = var1 + var2 * raster_width;
			int var8 = 0;
			int var5 = this.subHeight;
			int var10 = this.subWidth;
			int var11 = raster_width - var10;
			int var9 = 0;
			int var6;
			if (var2 < draw_region_y) {
				var6 = draw_region_y - var2;
				var5 -= var6;
				var2 = draw_region_y;
				var8 += var6 * var10;
				var7 += var6 * raster_width;
			}

			if (var2 + var5 > draw_region_max_y) {
				var5 -= var2 + var5 - draw_region_max_y;
			}

			if (var1 < draw_region_x) {
				var6 = draw_region_x - var1;
				var10 -= var6;
				var1 = draw_region_x;
				var8 += var6;
				var7 += var6;
				var9 += var6;
				var11 += var6;
			}

			if (var1 + var10 > draw_region_max_x) {
				var6 = var1 + var10 - draw_region_max_x;
				var10 -= var6;
				var9 += var6;
				var11 += var6;
			}

			if (var10 > 0 && var5 > 0) {
				method961(raster, this.pixels, 0, var8, var7, var10, var5, var11, var9, var3, var4);
			}
		}
	}

	public void method951(int var1, int var2, int var3) {
		var1 += this.offsetX;
		var2 += this.offsetY;
		int var6 = var1 + var2 * raster_width;
		int var10 = 0;
		int var7 = this.subHeight;
		int var8 = this.subWidth;
		int var9 = raster_width - var8;
		int var4 = 0;
		int var5;
		if (var2 < draw_region_y) {
			var5 = draw_region_y - var2;
			var7 -= var5;
			var2 = draw_region_y;
			var10 += var5 * var8;
			var6 += var5 * raster_width;
		}

		if (var2 + var7 > draw_region_max_y) {
			var7 -= var2 + var7 - draw_region_max_y;
		}

		if (var1 < draw_region_x) {
			var5 = draw_region_x - var1;
			var8 -= var5;
			var1 = draw_region_x;
			var10 += var5;
			var6 += var5;
			var4 += var5;
			var9 += var5;
		}

		if (var1 + var8 > draw_region_max_x) {
			var5 = var1 + var8 - draw_region_max_x;
			var8 -= var5;
			var4 += var5;
			var9 += var5;
		}

		if (var8 > 0 && var7 > 0) {
			method947(raster, this.pixels, 0, var10, var6, var8, var7, var9, var4, var3);
		}
	}

	public void method952(int var1) {
		int[] var2 = new int[this.subWidth * this.subHeight];
		int var3 = 0;

		for (int var4 = 0; var4 < this.subHeight; ++var4) {
			for (int var6 = 0; var6 < this.subWidth; ++var6) {
				int var5 = this.pixels[var3];
				if (var5 == 0) {
					if (var6 > 0 && this.pixels[var3 - 1] != 0) {
						var5 = var1;
					} else if (var4 > 0 && this.pixels[var3 - this.subWidth] != 0) {
						var5 = var1;
					} else if (var6 < this.subWidth - 1 && this.pixels[var3 + 1] != 0) {
						var5 = var1;
					} else if (var4 < this.subHeight - 1 && this.pixels[var3 + this.subWidth] != 0) {
						var5 = var1;
					}
				}

				var2[var3++] = var5;
			}
		}

		this.pixels = var2;
	}

	public void method953(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var10 = this.subWidth;
			int var16 = this.subHeight;
			int var6 = 0;
			int var11 = 0;
			int var14 = this.width;
			int var15 = this.height;
			int var8 = (var14 << 16) / var3;
			int var13 = (var15 << 16) / var4;
			int var7;
			if (this.offsetX > 0) {
				var7 = ((this.offsetX << 16) + var8 - 1) / var8;
				var1 += var7;
				var6 += var7 * var8 - (this.offsetX << 16);
			}

			if (this.offsetY > 0) {
				var7 = ((this.offsetY << 16) + var13 - 1) / var13;
				var2 += var7;
				var11 += var7 * var13 - (this.offsetY << 16);
			}

			if (var10 < var14) {
				var3 = ((var10 << 16) - var6 + var8 - 1) / var8;
			}

			if (var16 < var15) {
				var4 = ((var16 << 16) - var11 + var13 - 1) / var13;
			}

			var7 = var1 + var2 * raster_width;
			int var12 = raster_width - var3;
			if (var2 + var4 > draw_region_max_y) {
				var4 -= var2 + var4 - draw_region_max_y;
			}

			int var9;
			if (var2 < draw_region_y) {
				var9 = draw_region_y - var2;
				var4 -= var9;
				var7 += var9 * raster_width;
				var11 += var13 * var9;
			}

			if (var1 + var3 > draw_region_max_x) {
				var9 = var1 + var3 - draw_region_max_x;
				var3 -= var9;
				var12 += var9;
			}

			if (var1 < draw_region_x) {
				var9 = draw_region_x - var1;
				var3 -= var9;
				var7 += var9;
				var6 += var8 * var9;
				var12 += var9;
			}

			method963(raster, this.pixels, 0, var6, var11, var7, var12, var3, var4, var8, var13, var10, var5);
		}
	}

	public void method954(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var16 = var2 < 0 ? -var2 : 0;
		int var11 = var2 + this.subHeight > var6 ? var6 - var2 : this.subHeight;
		int var9 = var1 < 0 ? -var1 : 0;
		int var10000;
		if (var1 + this.subWidth <= var5) {
			var10000 = this.subWidth;
		} else {
			var10000 = var5 - var1;
		}

		int var14 = var3 + var1 + var9 + (var4 + var2 + var16) * raster_width;
		int var18 = var2 + var16;

		for (int var17 = var16; var17 < var11; ++var17) {
			int var12 = var7[var18];
			int var19 = var8[var18++];
			int var20 = var14;
			int var10;
			if (var1 < var12) {
				var10 = var12 - var1;
				var20 = var14 + (var10 - var9);
			} else {
				var10 = var9;
			}

			int var13;
			if (var1 + this.subWidth <= var12 + var19) {
				var13 = this.subWidth;
			} else {
				var13 = var12 + var19 - var1;
			}

			for (int var15 = var10; var15 < var13; ++var15) {
				int var21 = this.pixels[var15 + var17 * this.subWidth];
				if (var21 != 0) {
					raster[var20++] = var21;
				} else {
					++var20;
				}
			}

			var14 += raster_width;
		}

	}

	public Picture(byte[] var1, Component var2) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(var1);

			MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.subWidth = var3.getWidth(var2);
			this.subHeight = var3.getHeight(var2);
			this.width = this.subWidth;
			this.height = this.subHeight;
			this.offsetX = 0;
			this.offsetY = 0;
			this.pixels = new int[this.subWidth * this.subHeight];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.subWidth, this.subHeight, this.pixels, 0, this.subWidth);
			var5.grabPixels();
		} catch (InterruptedException var6) {
			;
		}

	}

	public void method955(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * raster_width;

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					int var20 = this.pixels[(var18 >> 16) + (var19 >> 16) * this.subWidth];
					if (var20 != 0) {
						raster[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += raster_width;
			}
		} catch (Exception var21) {
			;
		}

	}

	void method956(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.offsetX << 4;
			var2 -= this.offsetY << 4;
			double var12 = (double) (var5 & 0xFFFF) * 9.587379924285257E-5D;
			int var14 = (int) Math.floor(Math.sin(var12) * (double) var6 + 0.5D);
			int var15 = (int) Math.floor(Math.cos(var12) * (double) var6 + 0.5D);
			int var16 = -var1 * var15 + -var2 * var14;
			int var17 = -(-var1) * var14 + -var2 * var15;
			int var18 = ((this.subWidth << 4) - var1) * var15 + -var2 * var14;
			int var19 = -((this.subWidth << 4) - var1) * var14 + -var2 * var15;
			int var20 = -var1 * var15 + ((this.subHeight << 4) - var2) * var14;
			int var33 = -(-var1) * var14 + ((this.subHeight << 4) - var2) * var15;
			int var29 = ((this.subWidth << 4) - var1) * var15 + ((this.subHeight << 4) - var2) * var14;
			int var23 = -((this.subWidth << 4) - var1) * var14 + ((this.subHeight << 4) - var2) * var15;
			int var28;
			int var30;
			if (var16 < var18) {
				var28 = var16;
				var30 = var18;
			} else {
				var28 = var18;
				var30 = var16;
			}

			if (var20 < var28) {
				var28 = var20;
			}

			if (var29 < var28) {
				var28 = var29;
			}

			if (var20 > var30) {
				var30 = var20;
			}

			if (var29 > var30) {
				var30 = var29;
			}

			int var7;
			int var24;
			if (var17 < var19) {
				var24 = var17;
				var7 = var19;
			} else {
				var24 = var19;
				var7 = var17;
			}

			if (var33 < var24) {
				var24 = var33;
			}

			if (var23 < var24) {
				var24 = var23;
			}

			if (var33 > var7) {
				var7 = var33;
			}

			if (var23 > var7) {
				var7 = var23;
			}

			var28 >>= 12;
			var30 = var30 + 4095 >> 12;
			var24 >>= 12;
			var7 = var7 + 4095 >> 12;
			var28 += var3;
			var30 += var3;
			var24 += var4;
			var7 += var4;
			var28 >>= 4;
			var30 = var30 + 15 >> 4;
			var24 >>= 4;
			var7 = var7 + 15 >> 4;
			if (var28 < draw_region_x) {
				var28 = draw_region_x;
			}

			if (var30 > draw_region_max_x) {
				var30 = draw_region_max_x;
			}

			if (var24 < draw_region_y) {
				var24 = draw_region_y;
			}

			if (var7 > draw_region_max_y) {
				var7 = draw_region_max_y;
			}

			var30 = var28 - var30;
			if (var30 < 0) {
				var7 = var24 - var7;
				if (var7 < 0) {
					int var32 = var24 * raster_width + var28;
					double var35 = 1.6777216E7D / (double) var6;
					int var10 = (int) Math.floor(Math.sin(var12) * var35 + 0.5D);
					int var25 = (int) Math.floor(Math.cos(var12) * var35 + 0.5D);
					int var9 = (var28 << 4) + 8 - var3;
					int var38 = (var24 << 4) + 8 - var4;
					int var37 = (var1 << 8) - (var38 * var10 >> 4);
					int var8 = (var2 << 8) + (var38 * var25 >> 4);
					int var11;
					int var21;
					int var22;
					int var26;
					int var27;
					int var31;
					int var34;
					if (var25 == 0) {
						if (var10 == 0) {
							for (var34 = var7; var34 < 0; var32 += raster_width) {
								var22 = var32;
								var26 = var37;
								var11 = var8;
								var31 = var30;
								if (var37 >= 0 && var8 >= 0 && var37 - (this.subWidth << 12) < 0
										&& var8 - (this.subHeight << 12) < 0) {
									for (; var31 < 0; ++var31) {
										var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
										if (var21 != 0) {
											raster[var22++] = var21;
										} else {
											++var22;
										}
									}
								}

								++var34;
							}
						} else if (var10 < 0) {
							for (var34 = var7; var34 < 0; var32 += raster_width) {
								var22 = var32;
								var26 = var37;
								var11 = var8 + (var9 * var10 >> 4);
								var31 = var30;
								if (var37 >= 0 && var37 - (this.subWidth << 12) < 0) {
									if ((var27 = var11 - (this.subHeight << 12)) >= 0) {
										var27 = (var10 - var27) / var10;
										var31 = var30 + var27;
										var11 += var10 * var27;
										var22 = var32 + var27;
									}

									if ((var27 = (var11 - var10) / var10) > var31) {
										var31 = var27;
									}

									while (var31 < 0) {
										var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
										if (var21 != 0) {
											raster[var22++] = var21;
										} else {
											++var22;
										}

										var11 += var10;
										++var31;
									}
								}

								++var34;
								var37 -= var10;
							}
						} else {
							for (var34 = var7; var34 < 0; var32 += raster_width) {
								var22 = var32;
								var26 = var37;
								var11 = var8 + (var9 * var10 >> 4);
								var31 = var30;
								if (var37 >= 0 && var37 - (this.subWidth << 12) < 0) {
									if (var11 < 0) {
										var27 = (var10 - 1 - var11) / var10;
										var31 = var30 + var27;
										var11 += var10 * var27;
										var22 = var32 + var27;
									}

									if ((var27 = (1 + var11 - (this.subHeight << 12) - var10) / var10) > var31) {
										var31 = var27;
									}

									while (var31 < 0) {
										var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
										if (var21 != 0) {
											raster[var22++] = var21;
										} else {
											++var22;
										}

										var11 += var10;
										++var31;
									}
								}

								++var34;
								var37 -= var10;
							}
						}
					} else if (var25 < 0) {
						if (var10 == 0) {
							for (var34 = var7; var34 < 0; var32 += raster_width) {
								var22 = var32;
								var26 = var37 + (var9 * var25 >> 4);
								var11 = var8;
								var31 = var30;
								if (var8 >= 0 && var8 - (this.subHeight << 12) < 0) {
									if ((var27 = var26 - (this.subWidth << 12)) >= 0) {
										var27 = (var25 - var27) / var25;
										var31 = var30 + var27;
										var26 += var25 * var27;
										var22 = var32 + var27;
									}

									if ((var27 = (var26 - var25) / var25) > var31) {
										var31 = var27;
									}

									while (var31 < 0) {
										var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
										if (var21 != 0) {
											raster[var22++] = var21;
										} else {
											++var22;
										}

										var26 += var25;
										++var31;
									}
								}

								++var34;
								var8 += var25;
							}
						} else if (var10 < 0) {
							for (var34 = var7; var34 < 0; var32 += raster_width) {
								var22 = var32;
								var26 = var37 + (var9 * var25 >> 4);
								var11 = var8 + (var9 * var10 >> 4);
								var31 = var30;
								if ((var27 = var26 - (this.subWidth << 12)) >= 0) {
									var27 = (var25 - var27) / var25;
									var31 = var30 + var27;
									var26 += var25 * var27;
									var11 += var10 * var27;
									var22 = var32 + var27;
								}

								if ((var27 = (var26 - var25) / var25) > var31) {
									var31 = var27;
								}

								if ((var27 = var11 - (this.subHeight << 12)) >= 0) {
									var27 = (var10 - var27) / var10;
									var31 += var27;
									var26 += var25 * var27;
									var11 += var10 * var27;
									var22 += var27;
								}

								if ((var27 = (var11 - var10) / var10) > var31) {
									var31 = var27;
								}

								while (var31 < 0) {
									var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
									if (var21 != 0) {
										raster[var22++] = var21;
									} else {
										++var22;
									}

									var26 += var25;
									var11 += var10;
									++var31;
								}

								++var34;
								var37 -= var10;
								var8 += var25;
							}
						} else {
							for (var34 = var7; var34 < 0; var32 += raster_width) {
								var22 = var32;
								var26 = var37 + (var9 * var25 >> 4);
								var11 = var8 + (var9 * var10 >> 4);
								var31 = var30;
								if ((var27 = var26 - (this.subWidth << 12)) >= 0) {
									var27 = (var25 - var27) / var25;
									var31 = var30 + var27;
									var26 += var25 * var27;
									var11 += var10 * var27;
									var22 = var32 + var27;
								}

								if ((var27 = (var26 - var25) / var25) > var31) {
									var31 = var27;
								}

								if (var11 < 0) {
									var27 = (var10 - 1 - var11) / var10;
									var31 += var27;
									var26 += var25 * var27;
									var11 += var10 * var27;
									var22 += var27;
								}

								if ((var27 = (1 + var11 - (this.subHeight << 12) - var10) / var10) > var31) {
									var31 = var27;
								}

								while (var31 < 0) {
									var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
									if (var21 != 0) {
										raster[var22++] = var21;
									} else {
										++var22;
									}

									var26 += var25;
									var11 += var10;
									++var31;
								}

								++var34;
								var37 -= var10;
								var8 += var25;
							}
						}
					} else if (var10 == 0) {
						for (var34 = var7; var34 < 0; var32 += raster_width) {
							var22 = var32;
							var26 = var37 + (var9 * var25 >> 4);
							var11 = var8;
							var31 = var30;
							if (var8 >= 0 && var8 - (this.subHeight << 12) < 0) {
								if (var26 < 0) {
									var27 = (var25 - 1 - var26) / var25;
									var31 = var30 + var27;
									var26 += var25 * var27;
									var22 = var32 + var27;
								}

								if ((var27 = (1 + var26 - (this.subWidth << 12) - var25) / var25) > var31) {
									var31 = var27;
								}

								while (var31 < 0) {
									var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
									if (var21 != 0) {
										raster[var22++] = var21;
									} else {
										++var22;
									}

									var26 += var25;
									++var31;
								}
							}

							++var34;
							var8 += var25;
						}
					} else if (var10 < 0) {
						for (var34 = var7; var34 < 0; var32 += raster_width) {
							var22 = var32;
							var26 = var37 + (var9 * var25 >> 4);
							var11 = var8 + (var9 * var10 >> 4);
							var31 = var30;
							if (var26 < 0) {
								var27 = (var25 - 1 - var26) / var25;
								var31 = var30 + var27;
								var26 += var25 * var27;
								var11 += var10 * var27;
								var22 = var32 + var27;
							}

							if ((var27 = (1 + var26 - (this.subWidth << 12) - var25) / var25) > var31) {
								var31 = var27;
							}

							if ((var27 = var11 - (this.subHeight << 12)) >= 0) {
								var27 = (var10 - var27) / var10;
								var31 += var27;
								var26 += var25 * var27;
								var11 += var10 * var27;
								var22 += var27;
							}

							if ((var27 = (var11 - var10) / var10) > var31) {
								var31 = var27;
							}

							while (var31 < 0) {
								var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
								if (var21 != 0) {
									raster[var22++] = var21;
								} else {
									++var22;
								}

								var26 += var25;
								var11 += var10;
								++var31;
							}

							++var34;
							var37 -= var10;
							var8 += var25;
						}
					} else {
						for (var34 = var7; var34 < 0; var32 += raster_width) {
							var22 = var32;
							var26 = var37 + (var9 * var25 >> 4);
							var11 = var8 + (var9 * var10 >> 4);
							var31 = var30;
							if (var26 < 0) {
								var27 = (var25 - 1 - var26) / var25;
								var31 = var30 + var27;
								var26 += var25 * var27;
								var11 += var10 * var27;
								var22 = var32 + var27;
							}

							if ((var27 = (1 + var26 - (this.subWidth << 12) - var25) / var25) > var31) {
								var31 = var27;
							}

							if (var11 < 0) {
								var27 = (var10 - 1 - var11) / var10;
								var31 += var27;
								var26 += var25 * var27;
								var11 += var10 * var27;
								var22 += var27;
							}

							if ((var27 = (1 + var11 - (this.subHeight << 12) - var10) / var10) > var31) {
								var31 = var27;
							}

							while (var31 < 0) {
								var21 = this.pixels[(var11 >> 12) * this.subWidth + (var26 >> 12)];
								if (var21 != 0) {
									raster[var22++] = var21;
								} else {
									++var22;
								}

								var26 += var25;
								var11 += var10;
								++var31;
							}

							++var34;
							var37 -= var10;
							var8 += var25;
						}
					}

				}
			}
		}
	}

	public void method957(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9,
			int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * raster_width;

			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					raster[var19++] = this.pixels[(var20 >> 16) + (var21 >> 16) * this.subWidth];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += raster_width;
			}
		} catch (Exception var22) {
			;
		}

	}

	public void method958(int var1, int var2) {
		var1 += this.offsetX;
		var2 += this.offsetY;
		int var5 = var1 + var2 * raster_width;
		int var6 = 0;
		int var7 = this.subHeight;
		int var8 = this.subWidth;
		int var9 = raster_width - var8;
		int var3 = 0;
		int var4;
		if (var2 < draw_region_y) {
			var4 = draw_region_y - var2;
			var7 -= var4;
			var2 = draw_region_y;
			var6 += var4 * var8;
			var5 += var4 * raster_width;
		}

		if (var2 + var7 > draw_region_max_y) {
			var7 -= var2 + var7 - draw_region_max_y;
		}

		if (var1 < draw_region_x) {
			var4 = draw_region_x - var1;
			var8 -= var4;
			var1 = draw_region_x;
			var6 += var4;
			var5 += var4;
			var3 += var4;
			var9 += var4;
		}

		if (var1 + var8 > draw_region_max_x) {
			var4 = var1 + var8 - draw_region_max_x;
			var8 -= var4;
			var3 += var4;
			var9 += var4;
		}

		if (var8 > 0 && var7 > 0) {
			method940(raster, this.pixels, var6, var5, var8, var7, var9, var3);
		}
	}

	static void method959(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; ++var11) {
			int var10;
			for (var10 = var9; var10 < 0; ++var10) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var10 = var5; var10 < 0; ++var10) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public Picture() {
	}

	public void method960(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.pixels.length; ++var4) {
			int var5 = this.pixels[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += var1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var8 = var5 >> 8 & 0xFF;
				var8 += var2;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				int var7 = var5 & 0xFF;
				var7 += var3;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				this.pixels[var4] = (var6 << 16) + (var8 << 8) + var7;
			}
		}

	}

	static void method961(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10) {
		int var11 = 256 - var9;
		int var13 = (var10 & 16711935) * var11 & -16711936;
		int var14 = (var10 & '\uff00') * var11 & 16711680;
		var10 = (var13 | var14) >>> 8;

		for (int var15 = -var6; var15 < 0; ++var15) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var13 = (var2 & 16711935) * var9 & -16711936;
					var14 = (var2 & '\uff00') * var9 & 16711680;
					var0[var4++] = ((var13 | var14) >>> 8) + var10;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method962(int var1) {
		for (int var2 = this.subHeight - 1; var2 > 0; --var2) {
			int var3 = var2 * this.subWidth;

			for (int var4 = this.subWidth - 1; var4 > 0; --var4) {
				if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.subWidth] != 0) {
					this.pixels[var4 + var3] = var1;
				}
			}
		}

	}

	static void method963(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var18 = var3;

		for (int var14 = -var8; var14 < 0; ++var14) {
			int var15 = (var4 >> 16) * var11;

			for (int var16 = -var7; var16 < 0; ++var16) {
				var2 = var1[(var3 >> 16) + var15];
				if (var2 != 0) {
					int var17 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var17 & 16711935) * var13 & -16711936)
							+ ((var2 & '\uff00') * var12 + (var17 & '\uff00') * var13 & 16711680) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var18;
			var5 += var6;
		}

	}
}
