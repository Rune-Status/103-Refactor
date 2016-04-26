public class Residue {

	int type = Node_Sub3.getInt(16);
	int begin = Node_Sub3.getInt(24);
	int end = Node_Sub3.getInt(24);
	int partitionSize = Node_Sub3.getInt(24) + 1;
	int classification = Node_Sub3.getInt(6) + 1;
	int classBook = Node_Sub3.getInt(8);
	int[] anIntArray180;

	void decodeResidue(float[] var1, int var2, boolean decoded) {
		int classvalsPerCodeword;
		for (classvalsPerCodeword = 0; classvalsPerCodeword < var2; classvalsPerCodeword++) {
			var1[classvalsPerCodeword] = 0.0F;
		}

		if (!decoded) {
			classvalsPerCodeword = Node_Sub3.codeBooks[this.classBook].dimensions;
			int nToRead = this.end - this.begin;
			int partitionsToRead = nToRead / this.partitionSize;
			int[] var13 = new int[partitionsToRead];

			for (int var10 = 0; var10 < 8; var10++) {
				int var5 = 0;

				while (var5 < partitionsToRead) {
					int var11;
					int var12;
					if (var10 == 0) {
						var11 = Node_Sub3.codeBooks[this.classBook].getHuffmanRoot();

						for (var12 = classvalsPerCodeword - 1; var12 >= 0; --var12) {
							if (var5 + var12 < partitionsToRead) {
								var13[var5 + var12] = var11 % this.classification;
							}

							var11 /= this.classification;
						}
					}

					for (var11 = 0; var11 < classvalsPerCodeword; var11++) {
						var12 = var13[var5];
						int var15 = this.anIntArray180[var12 * 8 + var10];
						if (var15 >= 0) {
							int var16 = this.begin + this.partitionSize * var5;
							CodeBook var8 = Node_Sub3.codeBooks[var15];
							int var14;
							if (this.type == 0) {
								var14 = this.partitionSize / var8.dimensions;

								for (int var19 = 0; var19 < var14; var19++) {
									float[] var20 = var8.method112();

									for (int var17 = 0; var17 < var8.dimensions; var17++) {
										var1[var16 + var19 + var17 * var14] += var20[var17];
									}
								}
							} else {
								var14 = 0;

								while (var14 < this.partitionSize) {
									float[] var9 = var8.method112();

									for (int var18 = 0; var18 < var8.dimensions; var18++) {
										var1[var16 + var14] += var9[var18];
										++var14;
									}
								}
							}
						}

						++var5;
						if (var5 >= partitionsToRead) {
							break;
						}
					}
				}
			}
		}

	}

	Residue() {
		int[] var2 = new int[this.classification];

		int var1;
		for (var1 = 0; var1 < this.classification; var1++) {
			int var5 = 0;
			int var3 = Node_Sub3.getInt(3);
			boolean var4 = Node_Sub3.getBit() != 0;
			if (var4) {
				var5 = Node_Sub3.getInt(5);
			}

			var2[var1] = var5 << 3 | var3;
		}

		this.anIntArray180 = new int[this.classification * 8];

		for (var1 = 0; var1 < this.classification * 8; var1++) {
			this.anIntArray180[var1] = (var2[var1 >> 3] & 1 << (var1 & 0x7)) != 0 ? Node_Sub3.getInt(8) : -1;
		}

	}

}
