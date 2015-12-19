
public class Class13 {

	Class87 aClass87_225;
	NodeTable aNodeTable226 = new NodeTable(256);
	NodeTable aNodeTable227 = new NodeTable(256);
	Class87 aClass87_228;
	public static int anInt229;

	public Node_Sub2_Sub1 method113(int var1, int[] var2) {
		if (this.aClass87_228.method397() == 1) {
			return this.method116(0, var1, var2);
		} else if (this.aClass87_228.method380(var1) == 1) {
			return this.method116(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	Node_Sub2_Sub1 method114(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
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
				var7 = Node_Sub3.method522(this.aClass87_225, var1, var2);
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
		if (this.aClass87_225.method397() != 1) {
			if (this.aClass87_225.method380(var1) == 1) {
				return this.method114(var1, 0, var2);
			} else {
				throw new RuntimeException();
			}
		} else {
			return this.method114(0, var1, var2);
		}
	}

	Node_Sub2_Sub1 method116(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long) var4;
		Node_Sub2_Sub1 var7 = (Node_Sub2_Sub1) this.aNodeTable227.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class14 var8 = Class14.method119(this.aClass87_228, var1, var2);
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

	public Class13(Class87 var1, Class87 var2) {
		this.aClass87_228 = var1;
		this.aClass87_225 = var2;
	}

	static final void method117() {
		short var0 = 256;
		int var1;
		if (-1468156361 * Class6.anInt138 > 0) {
			for (var1 = 0; var1 < 256; ++var1) {
				if (Class6.anInt138 * -1468156361 > 768) {
					Class6.anIntArray124[var1] = ByteBuf.method637(TileDecorationStub.anIntArray841[var1],
							Class118.anIntArray803[var1], 1024 - Class6.anInt138 * -1468156361);
				} else if (Class6.anInt138 * -1468156361 <= 256) {
					Class6.anIntArray124[var1] = ByteBuf.method637(Class118.anIntArray803[var1],
							TileDecorationStub.anIntArray841[var1], 256 - -1468156361 * Class6.anInt138);
				} else {
					Class6.anIntArray124[var1] = Class118.anIntArray803[var1];
				}
			}
		} else if (Class6.anInt127 * 560977075 > 0) {
			for (var1 = 0; var1 < 256; ++var1) {
				if (Class6.anInt127 * 560977075 > 768) {
					Class6.anIntArray124[var1] = ByteBuf.method637(TileDecorationStub.anIntArray841[var1],
							Class6.anIntArray125[var1], 1024 - Class6.anInt127 * 560977075);
				} else if (560977075 * Class6.anInt127 > 256) {
					Class6.anIntArray124[var1] = Class6.anIntArray125[var1];
				} else {
					Class6.anIntArray124[var1] = ByteBuf.method637(Class6.anIntArray125[var1],
							TileDecorationStub.anIntArray841[var1], 256 - Class6.anInt127 * 560977075);
				}
			}
		} else {
			for (var1 = 0; var1 < 256; ++var1) {
				Class6.anIntArray124[var1] = TileDecorationStub.anIntArray841[var1];
			}
		}

		DualNode_Sub13.method789(Class6.anInt132 * 1933284923, 9, 128 + 1933284923 * Class6.anInt132, var0 + 7);
		Class56.aSprite542.method958(Class6.anInt132 * 1933284923, 0);
		DualNode_Sub13.method780();
		var1 = 0;
		int var2 = Class62.aClass20_570.anInt270 * 1802935495 + 1933284923 * Class6.anInt132;

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var5 = 1; var5 < var0 - 1; ++var5) {
			var7 = Class6.anIntArray145[var5] * (var0 - var5) / var0;
			var4 = var7 + 22;
			if (var4 < 0) {
				var4 = 0;
			}

			var1 += var4;

			for (var6 = var4; var6 < 128; ++var6) {
				var3 = Class122.anIntArray818[var1++];
				if (var3 != 0) {
					var10 = var3;
					var8 = 256 - var3;
					var3 = Class6.anIntArray124[var3];
					var9 = Class62.aClass20_570.anIntArray271[var2];
					Class62.aClass20_570.anIntArray271[var2++] = (var8 * (var9 & 16711935) + var10 * (var3 & 16711935)
							& -16711936) + ((var9 & '\uff00') * var8 + var10 * (var3 & '\uff00') & 16711680) >> 8;
				} else {
					++var2;
				}
			}

			var2 += var4 + 1154763343 * Class62.aClass20_570.anInt270 - 128;
		}

		DualNode_Sub13.method789(1933284923 * Class6.anInt132 + 765 - 128, 9, 1933284923 * Class6.anInt132 + 765,
				var0 + 7);
		Class6.aSprite137.method958(382 + 1933284923 * Class6.anInt132, 0);
		DualNode_Sub13.method780();
		var1 = 0;
		var2 = 637 + 24 + 1802935495 * Class62.aClass20_570.anInt270 + Class6.anInt132 * 1933284923;

		for (var5 = 1; var5 < var0 - 1; ++var5) {
			var7 = Class6.anIntArray145[var5] * (var0 - var5) / var0;
			var4 = 103 - var7;
			var2 += var7;

			for (var6 = 0; var6 < var4; ++var6) {
				var3 = Class122.anIntArray818[var1++];
				if (var3 != 0) {
					var10 = var3;
					var8 = 256 - var3;
					var3 = Class6.anIntArray124[var3];
					var9 = Class62.aClass20_570.anIntArray271[var2];
					Class62.aClass20_570.anIntArray271[var2++] = (var10 * (var3 & '\uff00') + var8 * (var9 & '\uff00')
							& 16711680) + ((var3 & 16711935) * var10 + var8 * (var9 & 16711935) & -16711936) >> 8;
				} else {
					++var2;
				}
			}

			var1 += 128 - var4;
			var2 += Class62.aClass20_570.anInt270 * 1154763343 - var4 - var7;
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

		int var8 = var5 * (Client.aShort2217 - Client.aShort2178) / 100 + Client.aShort2178;
		int var7 = var3 * var8 * 512 / (var2 * 334);
		int var6;
		int var12;
		short var15;
		if (var7 < Client.aShort2221) {
			var15 = Client.aShort2221;
			var8 = var2 * var15 * 334 / (512 * var3);
			if (var8 > Client.aShort2125) {
				var8 = Client.aShort2125;
				var12 = 512 * var8 * var3 / (334 * var15);
				var6 = (var2 - var12) / 2;
				if (var4) {
					DualNode_Sub13.method780();
					DualNode_Sub13.method793(var0, var1, var6, var3, -16777216);
					DualNode_Sub13.method793(var0 + var2 - var6, var1, var6, var3, -16777216);
				}

				var0 += var6;
				var2 -= var6 * 2;
			}
		} else if (var7 > Client.aShort2222) {
			var15 = Client.aShort2222;
			var8 = 334 * var2 * var15 / (512 * var3);
			if (var8 < Client.aShort2219) {
				var8 = Client.aShort2219;
				var12 = var2 * var15 * 334 / (512 * var8);
				var6 = (var3 - var12) / 2;
				if (var4) {
					DualNode_Sub13.method780();
					DualNode_Sub13.method793(var0, var1, var2, var6, -16777216);
					DualNode_Sub13.method793(var0, var3 + var1 - var6, var2, var6, -16777216);
				}

				var1 += var6;
				var3 -= 2 * var6;
			}
		}

		var12 = (Client.aShort2014 - Client.aShort2218) * var5 / 100 + Client.aShort2218;
		Client.screenZoom = 96042709 * (var3 * var8 * var12 / 85504 << 1);
		if (2112468213 * Client.screenHeight != var2 || Client.screenWidth * -336695531 != var3) {
			int[] var14 = new int[9];

			for (int var9 = 0; var9 < 9; ++var9) {
				int var13 = var9 * 32 + 128 + 15;
				int var11 = 3 * var13 + 600;
				int var10 = DualNode_Sub13_Sub1.anIntArray1788[var13];
				var14[var9] = var10 * var11 >> 16;
			}

			Landscape.method51(var14, 500, 800, var2, var3);
		}

		Client.anInt2223 = var0 * 878924253;
		Client.anInt2224 = var1 * -2084624847;
		Client.screenHeight = -286107811 * var2;
		Client.screenWidth = var3 * 445868093;
	}
}
