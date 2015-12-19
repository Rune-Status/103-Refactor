
public class Class9 {

	int anInt176 = Node_Sub3.method517(24) + 1;
	int anInt177 = Node_Sub3.method517(24);
	int anInt178 = Node_Sub3.method517(24);
	int anInt179 = Node_Sub3.method517(6) + 1;
	int[] anIntArray180;
	int anInt181 = Node_Sub3.method517(16);
	int anInt182 = Node_Sub3.method517(8);

	void method97(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = Node_Sub3.aClass12Array1243[this.anInt182].anInt224;
			int var7 = this.anInt178 - this.anInt177;
			int var6 = var7 / this.anInt176;
			int[] var13 = new int[var6];

			for (int var10 = 0; var10 < 8; ++var10) {
				int var5 = 0;

				while (var5 < var6) {
					int var11;
					int var12;
					if (var10 == 0) {
						var11 = Node_Sub3.aClass12Array1243[this.anInt182].method109();

						for (var12 = var4 - 1; var12 >= 0; --var12) {
							if (var5 + var12 < var6) {
								var13[var5 + var12] = var11 % this.anInt179;
							}

							var11 /= this.anInt179;
						}
					}

					for (var11 = 0; var11 < var4; ++var11) {
						var12 = var13[var5];
						int var15 = this.anIntArray180[var12 * 8 + var10];
						if (var15 >= 0) {
							int var16 = this.anInt177 + var5 * this.anInt176;
							Class12 var8 = Node_Sub3.aClass12Array1243[var15];
							int var14;
							if (this.anInt181 == 0) {
								var14 = this.anInt176 / var8.anInt224;

								for (int var19 = 0; var19 < var14; ++var19) {
									float[] var20 = var8.method112();

									for (int var17 = 0; var17 < var8.anInt224; ++var17) {
										var1[var16 + var19 + var17 * var14] += var20[var17];
									}
								}
							} else {
								var14 = 0;

								while (var14 < this.anInt176) {
									float[] var9 = var8.method112();

									for (int var18 = 0; var18 < var8.anInt224; ++var18) {
										var1[var16 + var14] += var9[var18];
										++var14;
									}
								}
							}
						}

						++var5;
						if (var5 >= var6) {
							break;
						}
					}
				}
			}

		}
	}

	Class9() {
		int[] var2 = new int[this.anInt179];

		int var1;
		for (var1 = 0; var1 < this.anInt179; ++var1) {
			int var5 = 0;
			int var3 = Node_Sub3.method517(3);
			boolean var4 = Node_Sub3.method515() != 0;
			if (var4) {
				var5 = Node_Sub3.method517(5);
			}

			var2[var1] = var5 << 3 | var3;
		}

		this.anIntArray180 = new int[this.anInt179 * 8];

		for (var1 = 0; var1 < this.anInt179 * 8; ++var1) {
			this.anIntArray180[var1] = (var2[var1 >> 3] & 1 << (var1 & 7)) != 0 ? Node_Sub3.method517(8) : -1;
		}

	}
}
