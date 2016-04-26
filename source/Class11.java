public class Class11 {

	int[][][] anIntArrayArrayArray208 = new int[2][2][4];
	int[][][] anIntArrayArrayArray209 = new int[2][2][4];
	int[] anIntArray210 = new int[2];
	int[] anIntArray215 = new int[2];
	static float aFloat213;
	static int anInt214;
	static float[][] aFloatArrayArray211 = new float[2][8];
	static int[][] anIntArrayArray212 = new int[2][8];

	int method101(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float) this.anIntArray210[0] + (float) (this.anIntArray210[1] - this.anIntArray210[0]) * var2;
			var3 *= 0.0030517578F;
			aFloat213 = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
			anInt214 = (int) (aFloat213 * 65536.0F);
		}

		if (this.anIntArray215[var1] == 0) {
			return 0;
		} else {
			var3 = this.method102(var1, 0, var2);
			aFloatArrayArray211[var1][0] = var3 * -2.0F * (float) Math.cos((double) this.method105(var1, 0, var2));
			aFloatArrayArray211[var1][1] = var3 * var3;

			int var4;
			for (var4 = 1; var4 < this.anIntArray215[var1]; var4++) {
				var3 = this.method102(var1, var4, var2);
				float var6 = var3 * -2.0F * (float) Math.cos((double) this.method105(var1, var4, var2));
				float var7 = var3 * var3;
				aFloatArrayArray211[var1][var4 * 2 + 1] = aFloatArrayArray211[var1][var4 * 2 - 1] * var7;
				aFloatArrayArray211[var1][var4 * 2] = aFloatArrayArray211[var1][var4 * 2 - 1] * var6
						+ aFloatArrayArray211[var1][var4 * 2 - 2] * var7;

				for (int var5 = var4 * 2 - 1; var5 >= 2; --var5) {
					aFloatArrayArray211[var1][var5] += aFloatArrayArray211[var1][var5 - 1] * var6
							+ aFloatArrayArray211[var1][var5 - 2] * var7;
				}

				aFloatArrayArray211[var1][1] += aFloatArrayArray211[var1][0] * var6 + var7;
				aFloatArrayArray211[var1][0] += var6;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.anIntArray215[0] * 2; var4++) {
					aFloatArrayArray211[0][var4] *= aFloat213;
				}
			}

			for (var4 = 0; var4 < this.anIntArray215[var1] * 2; var4++) {
				anIntArrayArray212[var1][var4] = (int) (aFloatArrayArray211[var1][var4] * 65536.0F);
			}

			return this.anIntArray215[var1] * 2;
		}
	}

	float method102(int var1, int var2, float var3) {
		float var4 = (float) this.anIntArrayArrayArray209[var1][0][var2]
				+ (float) (this.anIntArrayArrayArray209[var1][1][var2] - this.anIntArrayArrayArray209[var1][0][var2])
						* var3;
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
	}

	static float method103(float var0) {
		float var1 = (float) Math.pow(2.0D, (double) var0) * 32.703197F;
		return var1 * 3.1415927F / 11025.0F;
	}

	final void method104(ByteBuf var1, MidiSequence var2) {
		int var3 = var1.getUByte();
		this.anIntArray215[0] = var3 >> 4;
		this.anIntArray215[1] = var3 & 0xf;
		if (var3 != 0) {
			this.anIntArray210[0] = var1.getUShort();
			this.anIntArray210[1] = var1.getUShort();
			int var7 = var1.getUByte();

			int var4;
			int var5;
			for (var4 = 0; var4 < 2; var4++) {
				for (var5 = 0; var5 < this.anIntArray215[var4]; var5++) {
					this.anIntArrayArrayArray208[var4][0][var5] = var1.getUShort();
					this.anIntArrayArrayArray209[var4][0][var5] = var1.getUShort();
				}
			}

			for (var4 = 0; var4 < 2; var4++) {
				for (var5 = 0; var5 < this.anIntArray215[var4]; var5++) {
					if ((1 << var4 * 4 << var5 & var7) != 0) {
						this.anIntArrayArrayArray208[var4][1][var5] = var1.getUShort();
						this.anIntArrayArrayArray209[var4][1][var5] = var1.getUShort();
					} else {
						this.anIntArrayArrayArray208[var4][1][var5] = this.anIntArrayArrayArray208[var4][0][var5];
						this.anIntArrayArrayArray209[var4][1][var5] = this.anIntArrayArrayArray209[var4][0][var5];
					}
				}
			}

			if (var7 != 0 || this.anIntArray210[1] != this.anIntArray210[0]) {
				var2.method126(var1);
			}
		} else {
			int[] var71 = this.anIntArray210;
			this.anIntArray210[1] = 0;
			var71[0] = 0;
		}

	}

	float method105(int var1, int var2, float var3) {
		float var4 = (float) this.anIntArrayArrayArray208[var1][0][var2]
				+ (float) (this.anIntArrayArrayArray208[var1][1][var2] - this.anIntArrayArrayArray208[var1][0][var2])
						* var3;
		var4 *= 1.2207031E-4F;
		return method103(var4);
	}

}
