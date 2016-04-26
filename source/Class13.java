public class Class13 {

	public static int itemsSize;
	NodeTable aNodeTable226 = new NodeTable(256);
	NodeTable aNodeTable227 = new NodeTable(256);
	AbstractIndex sfx_index;
	AbstractIndex vorbis_index;

	public Node_Sub2_Sub1 method113(int var1, int[] var2) {
		if (this.sfx_index.size() == 1) {
			return this.method116(0, var1, var2);
		} else if (this.sfx_index.fileCount(var1) == 1) {
			return this.method116(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	Node_Sub2_Sub1 method114(int var1, int var2, int[] var3) {
		int var4 = (var1 << 4 & 0xffff | var1 >>> 12) ^ var2;
		var4 |= var1 << 16;
		long var5 = (long) var4 ^ 4294967296L;
		Node_Sub2_Sub1 var8 = (Node_Sub2_Sub1) this.aNodeTable227.get(var5);
		if (var8 != null) {
			return var8;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Node_Sub3 var7 = (Node_Sub3) this.aNodeTable226.get(var5);
			if (var7 == null) {
				var7 = Node_Sub3.method522(this.vorbis_index, var1, var2);
				if (var7 == null) {
					return null;
				}

				this.aNodeTable226.put(var7, var5);
			}

			var8 = var7.method519(var3);
			if (var8 == null) {
				return null;
			} else {
				var7.unlink();
				this.aNodeTable227.put(var8, var5);
				return var8;
			}
		}
	}

	public Node_Sub2_Sub1 method115(int var1, int[] var2) {
		if (this.vorbis_index.size() != 1) {
			if (this.vorbis_index.fileCount(var1) == 1) {
				return this.method114(var1, 0, var2);
			} else {
				throw new RuntimeException();
			}
		} else {
			return this.method114(0, var1, var2);
		}
	}

	Node_Sub2_Sub1 method116(int var1, int var2, int[] var3) {
		int var4 = (var1 << 4 & 0xffff | var1 >>> 12) ^ var2;
		var4 |= var1 << 16;
		long var5 = (long) var4;
		Node_Sub2_Sub1 var7 = (Node_Sub2_Sub1) this.aNodeTable227.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class14 var8 = Class14.method119(this.sfx_index, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.method122();
				this.aNodeTable227.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.aByteArray1543.length;
				}

				return var7;
			}
		}
	}

	public Class13(AbstractIndex var1, AbstractIndex var2) {
		this.sfx_index = var1;
		this.vorbis_index = var2;
	}

	static final void method117() {
		short var0 = 256;
		int var1;
		if (Class6.anInt138 > 0) {
			for (var1 = 0; var1 < 256; var1++) {
				if (Class6.anInt138 > 768) {
					Class6.anIntArray124[var1] = ByteBuf.method637(TileDecorationStub.anIntArray841[var1],
							Class118.anIntArray803[var1], 1024 - Class6.anInt138);
				} else if (Class6.anInt138 <= 256) {
					Class6.anIntArray124[var1] = ByteBuf.method637(Class118.anIntArray803[var1],
							TileDecorationStub.anIntArray841[var1], 256 - Class6.anInt138);
				} else {
					Class6.anIntArray124[var1] = Class118.anIntArray803[var1];
				}
			}
		} else if (Class6.anInt127 > 0) {
			for (var1 = 0; var1 < 256; var1++) {
				if (Class6.anInt127 > 768) {
					Class6.anIntArray124[var1] = ByteBuf.method637(TileDecorationStub.anIntArray841[var1],
							Class6.anIntArray125[var1], 1024 - Class6.anInt127);
				} else if (Class6.anInt127 > 256) {
					Class6.anIntArray124[var1] = Class6.anIntArray125[var1];
				} else {
					Class6.anIntArray124[var1] = ByteBuf.method637(Class6.anIntArray125[var1],
							TileDecorationStub.anIntArray841[var1], 256 - Class6.anInt127);
				}
			}
		} else {
			for (var1 = 0; var1 < 256; var1++) {
				Class6.anIntArray124[var1] = TileDecorationStub.anIntArray841[var1];
			}
		}

		RSGraphics.setDrawRegion(Class6.anInt132, 9, Class6.anInt132 + 128, var0 + 7);
		Class56.aSprite542.method958(Class6.anInt132, 0);
		RSGraphics.noClip();
		var1 = 0;
		int var2 = IndexTable.imageProducer.width * 9 + Class6.anInt132;

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var5 = 1; var5 < var0 - 1; var5++) {
			var7 = Class6.anIntArray145[var5] * (var0 - var5) / var0;
			var4 = var7 + 22;
			if (var4 < 0) {
				var4 = 0;
			}

			var1 += var4;

			for (var6 = var4; var6 < 128; var6++) {
				var3 = Class122.anIntArray818[var1++];
				if (var3 != 0) {
					var10 = var3;
					var8 = 256 - var3;
					var3 = Class6.anIntArray124[var3];
					var9 = IndexTable.imageProducer.dataArray[var2];
					IndexTable.imageProducer.dataArray[var2++] = ((var9 & 0xff00ff) * var8 + (var3 & 0xff00ff) * var10
							& 0xff00ff00) + ((var9 & 0xff00) * var8 + (var3 & 0xff00) * var10 & 0xff0000) >> 8;
				} else {
					++var2;
				}
			}

			var2 += IndexTable.imageProducer.width + var4 - 128;
		}

		RSGraphics.setDrawRegion(Class6.anInt132 + 765 - 128, 9, Class6.anInt132 + 765, var0 + 7);
		Class6.aSprite137.method958(Class6.anInt132 + 382, 0);
		RSGraphics.noClip();
		var1 = 0;
		var2 = IndexTable.imageProducer.width * 9 + 661 + Class6.anInt132;

		for (var5 = 1; var5 < var0 - 1; var5++) {
			var7 = Class6.anIntArray145[var5] * (var0 - var5) / var0;
			var4 = 103 - var7;
			var2 += var7;

			for (var6 = 0; var6 < var4; var6++) {
				var3 = Class122.anIntArray818[var1++];
				if (var3 != 0) {
					var10 = var3;
					var8 = 256 - var3;
					var3 = Class6.anIntArray124[var3];
					var9 = IndexTable.imageProducer.dataArray[var2];
					IndexTable.imageProducer.dataArray[var2++] = ((var3 & 0xff00) * var10 + (var9 & 0xff00) * var8
							& 0xff0000) + ((var3 & 0xff00ff) * var10 + (var9 & 0xff00ff) * var8 & 0xff00ff00) >> 8;
				} else {
					++var2;
				}
			}

			var1 += 128 - var4;
			var2 += IndexTable.imageProducer.width - var4 - var7;
		}

	}

	static final void method118(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 > 100) {
			var5 = 100;
		}

		int var8 = (Client.aShort2217 - Client.aShort2178) * var5 / 100 + Client.aShort2178;
		int var7 = var3 * var8 * 512 / (var2 * 334);
		int var6;
		int var12;
		short var15;
		if (var7 < Client.aShort2221) {
			var15 = Client.aShort2221;
			var8 = var2 * var15 * 334 / (var3 * 512);
			if (var8 > Client.aShort2125) {
				var8 = Client.aShort2125;
				var12 = var8 * 512 * var3 / (var15 * 334);
				var6 = (var2 - var12) / 2;
				if (var4) {
					RSGraphics.noClip();
					RSGraphics.method793(var0, var1, var6, var3, -16777216);
					RSGraphics.method793(var0 + var2 - var6, var1, var6, var3, -16777216);
				}

				var0 += var6;
				var2 -= var6 * 2;
			}
		} else if (var7 > Client.aShort2222) {
			var15 = Client.aShort2222;
			var8 = var2 * 334 * var15 / (var3 * 512);
			if (var8 < Client.aShort2219) {
				var8 = Client.aShort2219;
				var12 = var2 * var15 * 334 / (var8 * 512);
				var6 = (var3 - var12) / 2;
				if (var4) {
					RSGraphics.noClip();
					RSGraphics.method793(var0, var1, var2, var6, -16777216);
					RSGraphics.method793(var0, var3 + var1 - var6, var2, var6, -16777216);
				}

				var1 += var6;
				var3 -= var6 * 2;
			}
		}

		var12 = (Client.aShort2014 - Client.aShort2218) * var5 / 100 + Client.aShort2218;
		Client.screenZoom = (var3 * var8 * var12 / 85504 << 1);
		if (Client.screenHeight != var2 || Client.screenWidth != var3) {
			int[] var14 = new int[9];

			for (int var9 = 0; var9 < 9; var9++) {
				int var13 = var9 * 32 + 128 + 15;
				int var11 = var13 * 3 + 600;
				int var10 = TexturedGraphic.SIN_TABLE[var13];
				var14[var9] = var10 * var11 >> 16;
			}

			Landscape.method51(var14, 500, 800, var2, var3);
		}

		Client.anInt2223 = var0;
		Client.anInt2224 = var1;
		Client.screenHeight = var2;
		Client.screenWidth = var3;
	}

}
