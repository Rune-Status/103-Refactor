
public class Huffman {

	byte[] aByteArray447;
	int[] anIntArray448;
	static long aLong449;
	int[] anIntArray450;

	public Huffman(byte[] var1) {
		int var4 = var1.length;
		this.anIntArray450 = new int[var4];
		this.aByteArray447 = var1;
		int[] var5 = new int[33];
		this.anIntArray448 = new int[8];
		int var7 = 0;

		for (int var8 = 0; var8 < var4; ++var8) {
			byte var6 = var1[var8];
			if (var6 != 0) {
				int var11 = 1 << 32 - var6;
				int var9 = var5[var6];
				this.anIntArray450[var8] = var9;
				int var2;
				int var3;
				int var12;
				int var13;
				if ((var9 & var11) != 0) {
					var12 = var5[var6 - 1];
				} else {
					var12 = var9 | var11;

					for (var2 = var6 - 1; var2 >= 1; --var2) {
						var13 = var5[var2];
						if (var13 != var9) {
							break;
						}

						var3 = 1 << 32 - var2;
						if ((var13 & var3) != 0) {
							var5[var2] = var5[var2 - 1];
							break;
						}

						var5[var2] = var13 | var3;
					}
				}

				var5[var6] = var12;

				for (var2 = var6 + 1; var2 <= 32; ++var2) {
					if (var9 == var5[var2]) {
						var5[var2] = var12;
					}
				}

				var2 = 0;

				for (var13 = 0; var13 < var6; ++var13) {
					var3 = Integer.MIN_VALUE >>> var13;
					if ((var9 & var3) != 0) {
						if (this.anIntArray448[var2] == 0) {
							this.anIntArray448[var2] = var7;
						}

						var2 = this.anIntArray448[var2];
					} else {
						++var2;
					}

					if (var2 >= this.anIntArray448.length) {
						int[] var10 = new int[this.anIntArray448.length * 2];

						for (int var14 = 0; var14 < this.anIntArray448.length; ++var14) {
							var10[var14] = this.anIntArray448[var14];
						}

						this.anIntArray448 = var10;
					}

					var3 >>>= 1;
				}

				this.anIntArray448[var2] = ~var8;
				if (var2 >= var7) {
					var7 = var2 + 1;
				}
			}
		}

	}

	public int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) {
			return 0;
		} else {
			int var7 = 0;
			var5 += var4;
			int var8 = var2;

			while (true) {
				byte var9 = var1[var8];
				if (var9 < 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				int var6;
				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 64) != 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 32) != 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 16) != 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 8) != 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 4) != 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 2) != 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				if ((var9 & 1) != 0) {
					var7 = this.anIntArray448[var7];
				} else {
					++var7;
				}

				if ((var6 = this.anIntArray448[var7]) < 0) {
					var3[var4++] = (byte) (~var6);
					if (var4 >= var5) {
						break;
					}

					var7 = 0;
				}

				++var8;
			}

			return 1 + var8 - var2;
		}
	}

	public int method228(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var13 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			int var10 = var1[var2] & 255;
			int var11 = this.anIntArray450[var10];
			byte var12 = this.aByteArray447[var10];
			if (var12 == 0) {
				throw new RuntimeException("");
			}

			int var7 = var13 >> 3;
			int var9 = var13 & 7;
			var6 &= -var9 >> 31;
			int var8 = (var12 + var9 - 1 >> 3) + var7;
			var9 += 24;
			var4[var7] = (byte) (var6 |= var11 >>> var9);
			if (var7 < var8) {
				++var7;
				var9 -= 8;
				var4[var7] = (byte) (var6 = var11 >>> var9);
				if (var7 < var8) {
					++var7;
					var9 -= 8;
					var4[var7] = (byte) (var6 = var11 >>> var9);
					if (var7 < var8) {
						++var7;
						var9 -= 8;
						var4[var7] = (byte) (var6 = var11 >>> var9);
						if (var7 < var8) {
							++var7;
							var9 -= 8;
							var4[var7] = (byte) (var6 = var11 << -var9);
						}
					}
				}
			}

			var13 += var12;
		}

		return (7 + var13 >> 3) - var5;
	}
}
