
public class Class12 {

	float[][] aFloatArrayArray219;
	int anInt220;
	int[] anIntArray221;
	int[] anIntArray222;
	int[] anIntArray223;
	int anInt224;

	int method109() {
		int var1;
		for (var1 = 0; this.anIntArray223[var1] >= 0; var1 = Node_Sub3.method515() != 0 ? this.anIntArray223[var1]
				: var1 + 1) {
			;
		}

		return ~this.anIntArray223[var1];
	}

	Class12() {
		Node_Sub3.method517(24);
		this.anInt224 = Node_Sub3.method517(16);
		this.anInt220 = Node_Sub3.method517(24);
		this.anIntArray221 = new int[this.anInt220];
		boolean var3 = Node_Sub3.method515() != 0;
		int var5;
		int var7;
		int var8;
		if (var3) {
			var7 = 0;

			for (var5 = Node_Sub3.method517(5) + 1; var7 < this.anInt220; ++var5) {
				int var10 = Node_Sub3.method517(DualNode_Sub8.method709(this.anInt220 - var7));

				for (var8 = 0; var8 < var10; ++var8) {
					this.anIntArray221[var7++] = var5;
				}
			}
		} else {
			boolean var15 = Node_Sub3.method515() != 0;

			for (var5 = 0; var5 < this.anInt220; ++var5) {
				if (var15 && Node_Sub3.method515() == 0) {
					this.anIntArray221[var5] = 0;
				} else {
					this.anIntArray221[var5] = Node_Sub3.method517(5) + 1;
				}
			}
		}

		this.method111();
		var7 = Node_Sub3.method517(4);
		if (var7 > 0) {
			float var14 = Node_Sub3.method524(Node_Sub3.method517(32));
			float var17 = Node_Sub3.method524(Node_Sub3.method517(32));
			var8 = Node_Sub3.method517(4) + 1;
			boolean var6 = Node_Sub3.method515() != 0;
			int var12;
			if (var7 == 1) {
				var12 = method110(this.anInt220, this.anInt224);
			} else {
				var12 = this.anInt220 * this.anInt224;
			}

			this.anIntArray222 = new int[var12];

			int var1;
			for (var1 = 0; var1 < var12; ++var1) {
				this.anIntArray222[var1] = Node_Sub3.method517(var8);
			}

			this.aFloatArrayArray219 = new float[this.anInt220][this.anInt224];
			int var2;
			float var4;
			int var13;
			if (var7 == 1) {
				for (var1 = 0; var1 < this.anInt220; ++var1) {
					var4 = 0.0F;
					var2 = 1;

					for (var13 = 0; var13 < this.anInt224; ++var13) {
						int var9 = var1 / var2 % var12;
						float var11 = (float) this.anIntArray222[var9] * var17 + var14 + var4;
						this.aFloatArrayArray219[var1][var13] = var11;
						if (var6) {
							var4 = var11;
						}

						var2 *= var12;
					}
				}
			} else {
				for (var1 = 0; var1 < this.anInt220; ++var1) {
					var4 = 0.0F;
					var2 = var1 * this.anInt224;

					for (var13 = 0; var13 < this.anInt224; ++var13) {
						float var16 = (float) this.anIntArray222[var2] * var17 + var14 + var4;
						this.aFloatArrayArray219[var1][var13] = var16;
						if (var6) {
							var4 = var16;
						}

						++var2;
					}
				}
			}
		}

	}

	static int method110(int var0, int var1) {
		int var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1;

		while (true) {
			int var5 = var2;
			int var6 = var1;

			int var3;
			for (var3 = 1; var6 > 1; var6 >>= 1) {
				if ((var6 & 1) != 0) {
					var3 *= var5;
				}

				var5 *= var5;
			}

			int var4;
			if (var6 == 1) {
				var4 = var5 * var3;
			} else {
				var4 = var3;
			}

			if (var4 <= var0) {
				return var2;
			}

			--var2;
		}
	}

	void method111() {
		int[] var1 = new int[this.anInt220];
		int[] var2 = new int[33];

		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 0; var6 < this.anInt220; ++var6) {
			var8 = this.anIntArray221[var6];
			if (var8 != 0) {
				var9 = 1 << 32 - var8;
				var7 = var2[var8];
				var1[var6] = var7;
				int var4;
				if ((var7 & var9) != 0) {
					var10 = var2[var8 - 1];
				} else {
					var10 = var7 | var9;

					for (var3 = var8 - 1; var3 >= 1; --var3) {
						var4 = var2[var3];
						if (var4 != var7) {
							break;
						}

						var5 = 1 << 32 - var3;
						if ((var4 & var5) != 0) {
							var2[var3] = var2[var3 - 1];
							break;
						}

						var2[var3] = var4 | var5;
					}
				}

				var2[var8] = var10;

				for (var3 = var8 + 1; var3 <= 32; ++var3) {
					var4 = var2[var3];
					if (var4 == var7) {
						var2[var3] = var10;
					}
				}
			}
		}

		this.anIntArray223 = new int[8];
		int var11 = 0;

		for (var6 = 0; var6 < this.anInt220; ++var6) {
			var8 = this.anIntArray221[var6];
			if (var8 != 0) {
				var9 = var1[var6];
				var7 = 0;

				for (var10 = 0; var10 < var8; ++var10) {
					var3 = Integer.MIN_VALUE >>> var10;
					if ((var9 & var3) != 0) {
						if (this.anIntArray223[var7] == 0) {
							this.anIntArray223[var7] = var11;
						}

						var7 = this.anIntArray223[var7];
					} else {
						++var7;
					}

					if (var7 >= this.anIntArray223.length) {
						int[] var12 = new int[this.anIntArray223.length * 2];

						for (var5 = 0; var5 < this.anIntArray223.length; ++var5) {
							var12[var5] = this.anIntArray223[var5];
						}

						this.anIntArray223 = var12;
					}

					var3 >>>= 1;
				}

				this.anIntArray223[var7] = ~var6;
				if (var7 >= var11) {
					var11 = var7 + 1;
				}
			}
		}

	}

	float[] method112() {
		return this.aFloatArrayArray219[this.method109()];
	}
}
