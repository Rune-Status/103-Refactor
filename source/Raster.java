public class Raster extends DualNode {

	public static int[] raster;
	public static int raster_width;
	public static int raster_height;
	protected static int draw_region_x = 0;
	public static int draw_region_y = 0;
	protected static int draw_region_max_x = 0;
	public static int draw_region_max_y = 0;

	public static void setRaster(int[] raster_object, int width, int height) {
		raster = raster_object;
		raster_width = width;
		raster_height = height;
		setDrawRegion(0, 0, width, height);
	}

	public static void noClip() {
		draw_region_x = 0;
		draw_region_y = 0;
		draw_region_max_x = raster_width;
		draw_region_max_y = raster_height;
	}

	public static void setInnerDrawRegion(int var0, int var1, int var2, int var3) {
		if (draw_region_x < var0) {
			draw_region_x = var0;
		}

		if (draw_region_y < var1) {
			draw_region_y = var1;
		}

		if (draw_region_max_x > var2) {
			draw_region_max_x = var2;
		}

		if (draw_region_max_y > var3) {
			draw_region_max_y = var3;
		}

	}

	public static void copyDrawRegion(int[] var0) {
		var0[0] = draw_region_x;
		var0[1] = draw_region_y;
		var0[2] = draw_region_max_x;
		var0[3] = draw_region_max_y;
	}

	public static void setDrawRegion(int[] var0) {
		draw_region_x = var0[0];
		draw_region_y = var0[1];
		draw_region_max_x = var0[2];
		draw_region_max_y = var0[3];
	}

	public static void method784(int var0, int var1, int var2, int var3) {
		if (var0 >= draw_region_x && var0 < draw_region_max_x) {
			if (var1 < draw_region_y) {
				var2 -= draw_region_y - var1;
				var1 = draw_region_y;
			}

			if (var1 + var2 > draw_region_max_y) {
				var2 = draw_region_max_y - var1;
			}

			int var5 = raster_width * var1 + var0;

			for (int var4 = 0; var4 < var2; var4++) {
				raster[raster_width * var4 + var5] = var3;
			}
		}

	}

	public static void fillRectangle(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < draw_region_x) {
			var2 -= draw_region_x - var0;
			var0 = draw_region_x;
		}

		if (var1 < draw_region_y) {
			var3 -= draw_region_y - var1;
			var1 = draw_region_y;
		}

		if (var0 + var2 > draw_region_max_x) {
			var2 = draw_region_max_x - var0;
		}

		if (var1 + var3 > draw_region_max_y) {
			var3 = draw_region_max_y - var1;
		}

		var4 = ((var4 & 0xff00ff) * var5 >> 8 & 0xff00ff) + ((var4 & 0xff00) * var5 >> 8 & 0xff00);
		int var9 = 256 - var5;
		int var10 = raster_width - var2;
		int var6 = raster_width * var1 + var0;

		for (int var11 = 0; var11 < var3; var11++) {
			for (int var8 = -var2; var8 < 0; var8++) {
				int var7 = raster[var6];
				var7 = ((var7 & 0xff00ff) * var9 >> 8 & 0xff00ff) + ((var7 & 0xff00) * var9 >> 8 & 0xff00);
				raster[var6++] = var4 + var7;
			}

			var6 += var10;
		}

	}

	public static void method786(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var10 = 65536 / var3;
		if (var0 < draw_region_x) {
			var2 -= draw_region_x - var0;
			var0 = draw_region_x;
		}

		if (var1 < draw_region_y) {
			var6 += (draw_region_y - var1) * var10;
			var3 -= draw_region_y - var1;
			var1 = draw_region_y;
		}

		if (var0 + var2 > draw_region_max_x) {
			var2 = draw_region_max_x - var0;
		}

		if (var1 + var3 > draw_region_max_y) {
			var3 = draw_region_max_y - var1;
		}

		int var14 = raster_width - var2;
		int var7 = raster_width * var1 + var0;

		for (int var9 = -var3; var9 < 0; var9++) {
			int var11 = 65536 - var6 >> 8;
			int var12 = var6 >> 8;
			int var8 = ((var4 & 0xff00ff) * var11 + (var5 & 0xff00ff) * var12 & 0xff00ff00)
					+ ((var4 & 0xff00) * var11 + (var5 & 0xff00) * var12 & 0xff0000) >>> 8;

			for (int var13 = -var2; var13 < 0; var13++) {
				raster[var7++] = var8;
			}

			var7 += var14;
			var6 += var10;
		}

	}

	public static void drawRectangle(int var0, int var1, int var2, int var3, int var4) {
		drawHorizontal(var0, var1, var2, var4);
		drawHorizontal(var0, var1 + var3 - 1, var2, var4);
		method784(var0, var1, var3, var4);
		method784(var0 + var2 - 1, var1, var3, var4);
	}

	static void method788(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= draw_region_y && var1 < draw_region_max_y) {
			if (var0 < draw_region_x) {
				var2 -= draw_region_x - var0;
				var0 = draw_region_x;
			}

			if (var0 + var2 > draw_region_max_x) {
				var2 = draw_region_max_x - var0;
			}

			int var6 = 256 - var4;
			int var8 = (var3 >> 16 & 0xff) * var4;
			int var10 = (var3 >> 8 & 0xff) * var4;
			int var11 = (var3 & 0xff) * var4;
			int var5 = raster_width * var1 + var0;

			for (int var14 = 0; var14 < var2; var14++) {
				int var9 = (raster[var5] >> 16 & 0xff) * var6;
				int var7 = (raster[var5] >> 8 & 0xff) * var6;
				int var12 = (raster[var5] & 0xff) * var6;
				int var13 = (var8 + var9 >> 8 << 16) + (var10 + var7 >> 8 << 8) + (var11 + var12 >> 8);
				raster[var5++] = var13;
			}
		}

	}

	public static void setDrawRegion(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > raster_width) {
			var2 = raster_width;
		}

		if (var3 > raster_height) {
			var3 = raster_height;
		}

		draw_region_x = var0;
		draw_region_y = var1;
		draw_region_max_x = var2;
		draw_region_max_y = var3;
	}

	static void method790(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= draw_region_x && var0 < draw_region_max_x) {
			if (var1 < draw_region_y) {
				var2 -= draw_region_y - var1;
				var1 = draw_region_y;
			}

			if (var1 + var2 > draw_region_max_y) {
				var2 = draw_region_max_y - var1;
			}

			int var5 = 256 - var4;
			int var14 = (var3 >> 16 & 0xff) * var4;
			int var7 = (var3 >> 8 & 0xff) * var4;
			int var8 = (var3 & 0xff) * var4;
			int var6 = raster_width * var1 + var0;

			for (int var9 = 0; var9 < var2; var9++) {
				int var10 = (raster[var6] >> 16 & 0xff) * var5;
				int var11 = (raster[var6] >> 8 & 0xff) * var5;
				int var12 = (raster[var6] & 0xff) * var5;
				int var13 = (var14 + var10 >> 8 << 16) + (var7 + var11 >> 8 << 8) + (var8 + var12 >> 8);
				raster[var6] = var13;
				var6 += raster_width;
			}
		}

	}

	public static void drawLine(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				drawHorizontal(var0, var1, var2 + 1, var4);
			} else {
				drawHorizontal(var0 + var2, var1, -var2 + 1, var4);
			}
		} else if (var2 == 0) {
			if (var3 >= 0) {
				method784(var0, var1, var3 + 1, var4);
			} else {
				method784(var0, var1 + var3, -var3 + 1, var4);
			}
		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '\u8000';
				var3 <<= 16;
				var6 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < draw_region_x) {
					var1 += (draw_region_x - var0) * var6;
					var0 = draw_region_x;
				}

				if (var2 >= draw_region_max_x) {
					var2 = draw_region_max_x - 1;
				}

				while (var0 <= var2) {
					var5 = var1 >> 16;
					if (var5 >= draw_region_y && var5 < draw_region_max_y) {
						raster[raster_width * var5 + var0] = var4;
					}

					var1 += var6;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += '\u8000';
				var2 <<= 16;
				var6 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < draw_region_y) {
					var0 += (draw_region_y - var1) * var6;
					var1 = draw_region_y;
				}

				if (var3 >= draw_region_max_y) {
					var3 = draw_region_max_y - 1;
				}

				while (var1 <= var3) {
					var5 = var0 >> 16;
					if (var5 >= draw_region_x && var5 < draw_region_max_x) {
						raster[raster_width * var1 + var5] = var4;
					}

					var0 += var6;
					++var1;
				}
			}
		}

	}

	public static void method792(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = raster_width * var1 + var0;

		for (var1 = 0; var1 < var3.length; var1++) {
			int var6 = var3[var1] + var5;

			for (var0 = -var4[var1]; var0 < 0; var0++) {
				raster[var6++] = var2;
			}

			var5 += raster_width;
		}

	}

	public static void method793(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < draw_region_x) {
			var2 -= draw_region_x - var0;
			var0 = draw_region_x;
		}

		if (var1 < draw_region_y) {
			var3 -= draw_region_y - var1;
			var1 = draw_region_y;
		}

		if (var0 + var2 > draw_region_max_x) {
			var2 = draw_region_max_x - var0;
		}

		if (var1 + var3 > draw_region_max_y) {
			var3 = draw_region_max_y - var1;
		}

		int var8 = raster_width - var2;
		int var6 = raster_width * var1 + var0;

		for (int var5 = -var3; var5 < 0; var5++) {
			for (int var7 = -var2; var7 < 0; var7++) {
				raster[var6++] = var4;
			}

			var6 += var8;
		}

	}

	public static void method794(int var0, int var1, int var2, int var3, int var4, int var5) {
		method788(var0, var1, var2, var4, var5);
		method788(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method790(var0, var1 + 1, var3 - 2, var4, var5);
			method790(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	public static void reset() {
		int var0 = 0;

		int var1;
		for (var1 = raster_width * raster_height - 7; var0 < var1; raster[var0++] = 0) {
			raster[var0++] = 0;
			raster[var0++] = 0;
			raster[var0++] = 0;
			raster[var0++] = 0;
			raster[var0++] = 0;
			raster[var0++] = 0;
			raster[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; raster[var0++] = 0) {
			;
		}

	}

	public static void drawHorizontal(int var0, int var1, int var2, int var3) {
		if (var1 >= draw_region_y && var1 < draw_region_max_y) {
			if (var0 < draw_region_x) {
				var2 -= draw_region_x - var0;
				var0 = draw_region_x;
			}

			if (var0 + var2 > draw_region_max_x) {
				var2 = draw_region_max_x - var0;
			}

			int var4 = raster_width * var1 + var0;

			for (int var5 = 0; var5 < var2; var5++) {
				raster[var4 + var5] = var3;
			}
		}

	}

}
