public class Texture extends Node {

	int[] pixels;
	static int[] anIntArray1284;
	boolean loaded = false;
	int anInt1286;
	boolean aBool1285;
	int[] fileIds;
	int[] anIntArray1288;
	int[] anIntArray1289;
	int[] anIntArray1290;
	int anInt1294;
	int anInt1291;

	void resetPixels() {
		this.pixels = null;
	}

	void method542(int var1) {
		if (this.pixels != null) {
			int var2;
			short var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.anInt1294 == 1 || this.anInt1294 == 3) {
				if (anIntArray1284 == null || anIntArray1284.length < this.pixels.length) {
					anIntArray1284 = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var6 = this.pixels.length;
				var5 = var3 * var1 * this.anInt1291;
				var7 = var6 - 1;
				if (this.anInt1294 == 1) {
					var5 = -var5;
				}

				for (var4 = 0; var4 < var6; var4++) {
					var2 = var4 + var5 & var7;
					anIntArray1284[var4] = this.pixels[var2];
				}

				var10 = this.pixels;
				this.pixels = anIntArray1284;
				anIntArray1284 = var10;
			}

			if (this.anInt1294 == 2 || this.anInt1294 == 4) {
				if (anIntArray1284 == null || anIntArray1284.length < this.pixels.length) {
					anIntArray1284 = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var6 = this.pixels.length;
				var5 = this.anInt1291 * var1;
				var7 = var3 - 1;
				if (this.anInt1294 == 2) {
					var5 = -var5;
				}

				for (var4 = 0; var4 < var6; var4 += var3) {
					for (var2 = 0; var2 < var3; var2++) {
						int var8 = var4 + var2;
						int var9 = (var2 + var5 & var7) + var4;
						anIntArray1284[var8] = this.pixels[var9];
					}
				}

				var10 = this.pixels;
				this.pixels = anIntArray1284;
				anIntArray1284 = var10;
			}
		}

	}

	Texture(ByteBuf buf) {
		this.anInt1286 = buf.getUShort();
		this.aBool1285 = buf.getUByte() == 1;
		int count = buf.getUByte();
		if (count >= 1 && count <= 4) {
			this.fileIds = new int[count];

			int var2;
			for (var2 = 0; var2 < count; var2++) {
				this.fileIds[var2] = buf.getUShort();
			}

			if (count > 1) {
				this.anIntArray1288 = new int[count - 1];

				for (var2 = 0; var2 < count - 1; var2++) {
					this.anIntArray1288[var2] = buf.getUByte();
				}
			}

			if (count > 1) {
				this.anIntArray1289 = new int[count - 1];

				for (var2 = 0; var2 < count - 1; var2++) {
					this.anIntArray1289[var2] = buf.getUByte();
				}
			}

			this.anIntArray1290 = new int[count];

			for (var2 = 0; var2 < count; var2++) {
				this.anIntArray1290[var2] = buf.getInt();
			}

			this.anInt1294 = buf.getUByte();
			this.anInt1291 = buf.getUByte();
			this.pixels = null;
		} else {
			throw new RuntimeException();
		}
	}

	boolean method543(double brigness, int width, AbstractIndex sprites) {
		int size;
		for (size = 0; size < this.fileIds.length; size++) {
			if (sprites.method392(this.fileIds[size]) == null) {
				return false;
			}
		}

		size = width * width;
		this.pixels = new int[size];

		for (int var7 = 0; var7 < this.fileIds.length; var7++) {
			Sprite var12 = IndexTable.method306(sprites, this.fileIds[var7]);
			var12.method930();
			byte[] var14 = var12.pixels;
			int[] var9 = var12.palette;
			int var13 = this.anIntArray1290[var7];
			if ((var13 & 0xff000000) == 16777216) {
				;
			}

			if ((var13 & 0xff000000) == 33554432) {
				;
			}

			int var6;
			int var8;
			int var10;
			int var11;
			if ((var13 & 0xff000000) == 50331648) {
				var10 = var13 & 0xff00ff;
				var11 = var13 >> 8 & 0xff;

				for (var8 = 0; var8 < var9.length; var8++) {
					var6 = var9[var8];
					if ((var6 & 0xffff) == var6 >> 8) {
						var6 &= 255;
						var9[var8] = var10 * var6 >> 8 & 0xff00ff | var11 * var6 & 0xff00;
					}
				}
			}

			for (var10 = 0; var10 < var9.length; var10++) {
				var9[var10] = TexturedGraphic.adjustRGB(var9[var10], brigness);
			}

			if (var7 == 0) {
				var10 = 0;
			} else {
				var10 = this.anIntArray1288[var7 - 1];
			}

			if (var7 == 0) {
				;
			}

			if (var10 == 0) {
				if (var12.subWidth == width) {
					for (var11 = 0; var11 < size; var11++) {
						this.pixels[var11] = var9[var14[var11] & 0xff];
					}
				} else if (var12.subWidth == 64 && width == 128) {
					var11 = 0;

					for (var8 = 0; var8 < width; var8++) {
						for (var6 = 0; var6 < width; var6++) {
							this.pixels[var11++] = var9[var14[(var6 >> 1) + (var8 >> 1 << 6)] & 0xff];
						}
					}
				} else {
					if (var12.subWidth != 128 || width != 64) {
						throw new RuntimeException();
					}

					var11 = 0;

					for (var8 = 0; var8 < width; var8++) {
						for (var6 = 0; var6 < width; var6++) {
							this.pixels[var11++] = var9[var14[(var6 << 1) + (var8 << 1 << 7)] & 0xff];
						}
					}
				}
			}

			if (var10 == 1) {
				;
			}

			if (var10 == 2) {
				;
			}

			if (var10 == 3) {
				;
			}
		}

		return true;
	}

}
