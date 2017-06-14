public final class IndexedFont extends AbstractFont {

	public IndexedFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6,
			byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public IndexedFont(byte[] var1) {
		super(var1);
	}

	final void renderRGB(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = raster_width * var3 + var2;
		int var8 = raster_width - var4;
		int var10 = 0;
		int var11 = 0;
		int var9;
		if (var3 < draw_region_y) {
			var9 = draw_region_y - var3;
			var5 -= var9;
			var3 = draw_region_y;
			var11 += var9 * var4;
			var7 += raster_width * var9;
		}

		if (var3 + var5 > draw_region_max_y) {
			var5 -= var3 + var5 - draw_region_max_y;
		}

		if (var2 < draw_region_x) {
			var9 = draw_region_x - var2;
			var4 -= var9;
			var2 = draw_region_x;
			var11 += var9;
			var7 += var9;
			var10 += var9;
			var8 += var9;
		}

		if (var2 + var4 > draw_region_max_x) {
			var9 = var2 + var4 - draw_region_max_x;
			var4 -= var9;
			var10 += var9;
			var8 += var9;
		}

		if (var4 > 0 && var5 > 0) {
			render(raster, var1, var6, var11, var7, var4, var5, var8, var10);
		}

	}

	final void renderRGBA(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = raster_width * var3 + var2;
		int var12 = raster_width - var4;
		int var9 = 0;
		int var11 = 0;
		int var10;
		if (var3 < draw_region_y) {
			var10 = draw_region_y - var3;
			var5 -= var10;
			var3 = draw_region_y;
			var11 += var10 * var4;
			var8 += raster_width * var10;
		}

		if (var3 + var5 > draw_region_max_y) {
			var5 -= var3 + var5 - draw_region_max_y;
		}

		if (var2 < draw_region_x) {
			var10 = draw_region_x - var2;
			var4 -= var10;
			var2 = draw_region_x;
			var11 += var10;
			var8 += var10;
			var9 += var10;
			var12 += var10;
		}

		if (var2 + var4 > draw_region_max_x) {
			var10 = var2 + var4 - draw_region_max_x;
			var4 -= var10;
			var9 += var10;
			var12 += var10;
		}

		if (var4 > 0 && var5 > 0) {
			renderRGBA(raster, var1, var6, var11, var8, var4, var5, var12, var9, var7);
		}

	}

}
