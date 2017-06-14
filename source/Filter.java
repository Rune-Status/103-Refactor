public class Filter {

	int[][][] phases = new int[2][2][4];
	int[][][] magnitudes = new int[2][2][4];
	int[] unity = new int[2];
	int[] pairs = new int[2];
	static float fowardMinimisedCoefficientMultiplier;
	static int fowardMultiplier;
	static float[][] minimisedCoefficients = new float[2][8];
	static int[][] coefficients = new int[2][8];

	int compute(int direction, float step) {
		float var3;
		if (direction == 0) {
			var3 = (float) this.unity[0] + (float) (this.unity[1] - this.unity[0]) * step;
			var3 *= 0.0030517578F;
			fowardMinimisedCoefficientMultiplier = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
			fowardMultiplier = (int) (fowardMinimisedCoefficientMultiplier * 65536.0F);
		}

		if (this.pairs[direction] == 0) {
			return 0;
		} else {
			var3 = this.interpolateMagniture(direction, 0, step);
			minimisedCoefficients[direction][0] = var3 * -2.0F * (float) Math.cos((double) this.interpolatePhase(direction, 0, step));
			minimisedCoefficients[direction][1] = var3 * var3;

			int var4;
			for (var4 = 1; var4 < this.pairs[direction]; var4++) {
				var3 = this.interpolateMagniture(direction, var4, step);
				float var6 = var3 * -2.0F * (float) Math.cos((double) this.interpolatePhase(direction, var4, step));
				float var7 = var3 * var3;
				minimisedCoefficients[direction][var4 * 2 + 1] = minimisedCoefficients[direction][var4 * 2 - 1] * var7;
				minimisedCoefficients[direction][var4 * 2] = minimisedCoefficients[direction][var4 * 2 - 1] * var6
						+ minimisedCoefficients[direction][var4 * 2 - 2] * var7;

				for (int var5 = var4 * 2 - 1; var5 >= 2; --var5) {
					minimisedCoefficients[direction][var5] += minimisedCoefficients[direction][var5 - 1] * var6
							+ minimisedCoefficients[direction][var5 - 2] * var7;
				}

				minimisedCoefficients[direction][1] += minimisedCoefficients[direction][0] * var6 + var7;
				minimisedCoefficients[direction][0] += var6;
			}

			if (direction == 0) {
				for (var4 = 0; var4 < this.pairs[0] * 2; var4++) {
					minimisedCoefficients[0][var4] *= fowardMinimisedCoefficientMultiplier;
				}
			}

			for (var4 = 0; var4 < this.pairs[direction] * 2; var4++) {
				coefficients[direction][var4] = (int) (minimisedCoefficients[direction][var4] * 65536.0F);
			}

			return this.pairs[direction] * 2;
		}
	}

	float interpolateMagniture(int var1, int var2, float var3) {
		float var4 = (float) this.magnitudes[var1][0][var2]
				+ (float) (this.magnitudes[var1][1][var2] - this.magnitudes[var1][0][var2])
						* var3;
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
	}

	static float normalise(float var0) {
		float var1 = (float) Math.pow(2.0D, (double) var0) * 32.703197F;
		return var1 * 3.1415927F / 11025.0F;
	}

	final void decode(ByteBuf buf, Envelope envelope) {
		int count = buf.getUByte();
		this.pairs[0] = count >> 4;
		this.pairs[1] = count & 0xf;
		if (count != 0) {
			this.unity[0] = buf.getUShort();
			this.unity[1] = buf.getUShort();
			int migration = buf.getUByte();

			int i;
			int j;
			for (i = 0; i < 2; i++) {
				for (j = 0; j < this.pairs[i]; j++) {
					this.phases[i][0][j] = buf.getUShort();
					this.magnitudes[i][0][j] = buf.getUShort();
				}
			}

			for (i = 0; i < 2; i++) {
				for (j = 0; j < this.pairs[i]; j++) {
					if ((1 << i * 4 << j & migration) != 0) {
						this.phases[i][1][j] = buf.getUShort();
						this.magnitudes[i][1][j] = buf.getUShort();
					} else {
						this.phases[i][1][j] = this.phases[i][0][j];
						this.magnitudes[i][1][j] = this.magnitudes[i][0][j];
					}
				}
			}

			if (migration != 0 || this.unity[1] != this.unity[0]) {
				envelope.decodeSegments(buf);
			}
		} else {
			unity[0] = unity[1] = 0;
		}

	}

	float interpolatePhase(int var1, int var2, float var3) {
		float var4 = (float) this.phases[var1][0][var2]
				+ (float) (this.phases[var1][1][var2] - this.phases[var1][0][var2])
						* var3;
		var4 *= 1.2207031E-4F;
		return normalise(var4);
	}

}
