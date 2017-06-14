public class Node_Sub3 extends Node {

	static int bitPosition;
	static int position;
	static int blockSize0;
	static int blockSize1;
	static float[] aFloatArray1246;
	static CodeBook[] codeBooks;
	static Floor1[] floors;
	static Residue[] residues;
	static Mapping[] mappings;
	static boolean[] modeBlockFlags;
	static int[] modeMappings;
	static float[] aFloatArray1247;
	static float[] aFloatArray1248;
	static float[] aFloatArray1250;
	static int[] anIntArray1253;
	static float[] aFloatArray1249;
	static float[] aFloatArray1251;
	static float[] aFloatArray1231;
	static int[] anIntArray1254;
	static boolean aBool1241 = false;
	int anInt1225;
	float[] aFloatArray1242;
	byte[] aByteArray1235;
	int anInt1227;
	int anInt1257;
	int anInt1240;
	int anInt1226;
	int anInt1256;
	int anInt1228;
	boolean aBool1229;
	byte[][] aByteArrayArray1255;
	static byte[] payload;
	int anInt1244;
	boolean aBool1245;

	static int getBit() {
		int value = payload[position] >> bitPosition & 0x1;
		++bitPosition;
		position += bitPosition >> 3;
		bitPosition &= 7;
		return value;
	}

	static void method516(byte[] var0) {
		setBytes(var0, 0);
		blockSize0 = 1 << getInt(4);
		blockSize1 = 1 << getInt(4);
		aFloatArray1246 = new float[blockSize1];

		int var1;
		int var2;
		int var3;
		int var6;
		int var7;
		for (var6 = 0; var6 < 2; var6++) {
			var7 = var6 != 0 ? blockSize1 : blockSize0;
			var3 = var7 >> 1;
			var2 = var7 >> 2;
			var1 = var7 >> 3;
			float[] var19 = new float[var3];

			for (int var18 = 0; var18 < var2; var18++) {
				var19[var18 * 2] = (float) Math.cos((double) (var18 * 4) * 3.141592653589793D / (double) var7);
				var19[var18 * 2 + 1] = -((float) Math.sin((double) (var18 * 4) * 3.141592653589793D / (double) var7));
			}

			float[] var16 = new float[var3];

			for (int var20 = 0; var20 < var2; var20++) {
				var16[var20 * 2] = (float) Math
						.cos((double) (var20 * 2 + 1) * 3.141592653589793D / (double) (var7 * 2));
				var16[var20 * 2 + 1] = (float) Math
						.sin((double) (var20 * 2 + 1) * 3.141592653589793D / (double) (var7 * 2));
			}

			float[] var17 = new float[var2];

			for (int var21 = 0; var21 < var1; var21++) {
				var17[var21 * 2] = (float) Math.cos((double) (var21 * 4 + 2) * 3.141592653589793D / (double) var7);
				var17[var21 * 2
						+ 1] = -((float) Math.sin((double) (var21 * 4 + 2) * 3.141592653589793D / (double) var7));
			}

			int[] var181 = new int[var1];
			int var12 = ChatMessage.ilog(var1 - 1);

			for (int var8 = 0; var8 < var1; var8++) {
				int var5 = var8;
				int var13 = var12;

				int var15;
				for (var15 = 0; var13 > 0; --var13) {
					var15 = var15 << 1 | var5 & 0x1;
					var5 >>>= 1;
				}

				var181[var8] = var15;
			}

			if (var6 != 0) {
				aFloatArray1249 = var19;
				aFloatArray1251 = var16;
				aFloatArray1231 = var17;
				anIntArray1254 = var181;
			} else {
				aFloatArray1247 = var19;
				aFloatArray1248 = var16;
				aFloatArray1250 = var17;
				anIntArray1253 = var181;
			}
		}

		var6 = getInt(8) + 1;
		codeBooks = new CodeBook[var6];

		for (var7 = 0; var7 < var6; var7++) {
			codeBooks[var7] = new CodeBook();
		}

		var7 = getInt(6) + 1;

		for (var3 = 0; var3 < var7; var3++) {
			getInt(16);
		}

		var7 = getInt(6) + 1;
		floors = new Floor1[var7];

		for (var3 = 0; var3 < var7; var3++) {
			floors[var3] = new Floor1();
		}

		var3 = getInt(6) + 1;
		residues = new Residue[var3];

		for (var2 = 0; var2 < var3; var2++) {
			residues[var2] = new Residue();
		}

		var2 = getInt(6) + 1;
		mappings = new Mapping[var2];

		for (var1 = 0; var1 < var2; var1++) {
			mappings[var1] = new Mapping();
		}

		var1 = getInt(6) + 1;
		modeBlockFlags = new boolean[var1];
		modeMappings = new int[var1];

		for (int var151 = 0; var151 < var1; var151++) {
			modeBlockFlags[var151] = getBit() != 0;
			getInt(16);
			getInt(16);
			modeMappings[var151] = getInt(8);
		}

	}

	static int getInt(int bits) {
		int value = 0;

		int bitsRead;
		int msb;
		for (bitsRead = 0; bits >= 8 - bitPosition; bits -= msb) {
			msb = 8 - bitPosition;
			int mask = (1 << msb) - 1;
			value += (payload[position] >> bitPosition & mask) << bitsRead;
			bitPosition = 0;
			++position;
			bitsRead += msb;
		}

		if (bits > 0) {
			msb = (1 << bits) - 1;
			value += (payload[position] >> bitPosition & msb) << bitsRead;
			bitPosition += bits;
		}

		return value;
	}

	static boolean method518(AbstractIndex var0) {
		if (!aBool1241) {
			byte[] var1 = var0.getFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method516(var1);
			aBool1241 = true;
		}

		return true;
	}

	Node_Sub2_Sub1 method519(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.aByteArray1235 == null) {
				this.anInt1225 = 0;
				this.aFloatArray1242 = new float[blockSize1];
				this.aByteArray1235 = new byte[this.anInt1226];
				this.anInt1227 = 0;
				this.anInt1257 = 0;
			}

			for (; this.anInt1257 < this.aByteArrayArray1255.length; this.anInt1257++) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var7 = this.method523(this.anInt1257);
				if (var7 != null) {
					int var5 = this.anInt1227;
					int var6 = var7.length;
					if (var6 > this.anInt1226 - var5) {
						var6 = this.anInt1226 - var5;
					}

					for (int var3 = 0; var3 < var6; var3++) {
						int var4 = (int) (var7[var3] * 128.0F + 128.0F);
						if ((var4 & 0xffffff00) != 0) {
							var4 = ~var4 >> 31;
						}

						this.aByteArray1235[var5++] = (byte) (var4 - 128);
					}

					if (var1 != null) {
						var1[0] -= var5 - this.anInt1227;
					}

					this.anInt1227 = var5;
				}
			}

			this.aFloatArray1242 = null;
			byte[] var71 = this.aByteArray1235;
			this.aByteArray1235 = null;
			return new Node_Sub2_Sub1(this.anInt1240, var71, this.anInt1256, this.anInt1228, this.aBool1229);
		}
	}

	void method520(byte[] var1) {
		ByteBuf var2 = new ByteBuf(var1);
		this.anInt1240 = var2.getInt();
		this.anInt1226 = var2.getInt();
		this.anInt1256 = var2.getInt();
		this.anInt1228 = var2.getInt();
		if (this.anInt1228 < 0) {
			this.anInt1228 = ~this.anInt1228;
			this.aBool1229 = true;
		}

		int var5 = var2.getInt();
		this.aByteArrayArray1255 = new byte[var5][];

		for (int var3 = 0; var3 < var5; var3++) {
			int var6 = 0;

			int var4;
			do {
				var4 = var2.getUByte();
				var6 += var4;
			} while (var4 >= 255);

			byte[] var7 = new byte[var6];
			var2.getBytes(var7, 0, var6);
			this.aByteArrayArray1255[var3] = var7;
		}

	}

	static void setBytes(byte[] var0, int var1) {
		payload = var0;
		position = var1;
		bitPosition = 0;
	}

	static Node_Sub3 method522(AbstractIndex var0, int var1, int var2) {
		if (!method518(var0)) {
			var0.method388(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.getFile(var1, var2);
			return var3 == null ? null : new Node_Sub3(var3);
		}
	}

	Node_Sub3(byte[] var1) {
		this.method520(var1);
	}

	float[] method523(int var1) {
		setBytes(this.aByteArrayArray1255[var1], 0);
		getBit();
		int modeNumber = getInt(ChatMessage.ilog(modeMappings.length - 1));
		boolean blockFlag = modeBlockFlags[modeNumber];
		int n = blockFlag ? blockSize1 : blockSize0;
		boolean prevWindowFlag = false;
		boolean nextWindowFlag = false;
		if (blockFlag) {
			prevWindowFlag = getBit() != 0;
			nextWindowFlag = getBit() != 0;
		}

		int windowCenter = n >> 1;
		int leftWindowStart;
		int leftWindowEnd;
		int leftN;
		if (blockFlag && !prevWindowFlag) {
			leftWindowStart = (n >> 2) - (blockSize0 >> 2);
			leftWindowEnd = (n >> 2) + (blockSize0 >> 2);
			leftN = blockSize0 >> 1;
		} else {
			leftWindowStart = 0;
			leftWindowEnd = windowCenter;
			leftN = n >> 1;
		}

		int rightWindowEnd;
		int rightWindowStart;
		int rightN;
		if (blockFlag && !nextWindowFlag) {
			rightWindowStart = n - (n >> 2) - (blockSize0 >> 2);
			rightWindowEnd = n - (n >> 2) + (blockSize0 >> 2);
			rightN = blockSize0 >> 1;
		} else {
			rightWindowStart = windowCenter;
			rightWindowEnd = n;
			rightN = n >> 1;
		}

		Mapping mapping = mappings[modeMappings[modeNumber]];
		int submapNumber = mapping.mux;
		int floorNumber = mapping.submapFloors[submapNumber];
		boolean decoded = !floors[floorNumber].decodedFloor();

		for (floorNumber = 0; floorNumber < mapping.anInt247; floorNumber++) {
			Residue residue = residues[mapping.anIntArray250[floorNumber]];
			float[] fs = aFloatArray1246;
			residue.decodeResidue(fs, n >> 1, decoded);
		}

		int var48;
		if (!decoded) {
			floorNumber = mapping.mux;
			var48 = mapping.submapFloors[floorNumber];
			floors[var48].computeFloor(aFloatArray1246, n >> 1);
		}

		float[] var52;
		int var53;
		int var491;
		if (decoded) {
			for (floorNumber = n >> 1; floorNumber < n; floorNumber++) {
				aFloatArray1246[floorNumber] = 0.0F;
			}
		} else {
			floorNumber = n >> 1;
			var48 = n >> 2;
			var491 = n >> 3;
			var52 = aFloatArray1246;

			for (var53 = 0; var53 < floorNumber; var53++) {
				var52[var53] *= 0.5F;
			}

			for (var53 = floorNumber; var53 < n; var53++) {
				var52[var53] = -var52[n - var53 - 1];
			}

			float[] var54 = blockFlag ? aFloatArray1249 : aFloatArray1247;
			float[] var34 = blockFlag ? aFloatArray1251 : aFloatArray1248;
			float[] var18 = blockFlag ? aFloatArray1231 : aFloatArray1250;
			int[] var39 = blockFlag ? anIntArray1254 : anIntArray1253;

			float var2;
			float var3;
			float var5;
			int var16;
			float var17;
			for (var16 = 0; var16 < var48; var16++) {
				var17 = var52[var16 * 4] - var52[n - var16 * 4 - 1];
				var5 = var52[var16 * 4 + 2] - var52[n - var16 * 4 - 3];
				var2 = var54[var16 * 2];
				var3 = var54[var16 * 2 + 1];
				var52[n - var16 * 4 - 1] = var17 * var2 - var5 * var3;
				var52[n - var16 * 4 - 3] = var17 * var3 + var5 * var2;
			}

			float var4;
			float var6;
			for (var16 = 0; var16 < var491; var16++) {
				var17 = var52[floorNumber + 3 + var16 * 4];
				var5 = var52[floorNumber + 1 + var16 * 4];
				var2 = var52[var16 * 4 + 3];
				var3 = var52[var16 * 4 + 1];
				var52[floorNumber + 3 + var16 * 4] = var17 + var2;
				var52[floorNumber + 1 + var16 * 4] = var5 + var3;
				var6 = var54[floorNumber - 4 - var16 * 4];
				var4 = var54[floorNumber - 3 - var16 * 4];
				var52[var16 * 4 + 3] = (var17 - var2) * var6 - (var5 - var3) * var4;
				var52[var16 * 4 + 1] = (var5 - var3) * var6 + (var17 - var2) * var4;
			}

			var16 = ChatMessage.ilog(n - 1);

			int var40;
			int var41;
			int var43;
			int var49;
			for (var49 = 0; var49 < var16 - 3; var49++) {
				var43 = n >> var49 + 2;
				var40 = 8 << var49;

				for (var41 = 0; var41 < 2 << var49; var41++) {
					int var45 = n - var43 * 2 * var41;
					int var46 = n - (var41 * 2 + 1) * var43;

					for (int var7 = 0; var7 < n >> var49 + 4; var7++) {
						int var8 = var7 * 4;
						float var35 = var52[var45 - 1 - var8];
						float var31 = var52[var45 - 3 - var8];
						float var36 = var52[var46 - 1 - var8];
						float var32 = var52[var46 - 3 - var8];
						var52[var45 - 1 - var8] = var35 + var36;
						var52[var45 - 3 - var8] = var31 + var32;
						float var37 = var54[var7 * var40];
						float var38 = var54[var7 * var40 + 1];
						var52[var46 - 1 - var8] = (var35 - var36) * var37 - (var31 - var32) * var38;
						var52[var46 - 3 - var8] = (var31 - var32) * var37 + (var35 - var36) * var38;
					}
				}
			}

			for (var49 = 1; var49 < var491 - 1; var49++) {
				var43 = var39[var49];
				if (var49 < var43) {
					var40 = var49 * 8;
					var41 = var43 * 8;
					var6 = var52[var40 + 1];
					var52[var40 + 1] = var52[var41 + 1];
					var52[var41 + 1] = var6;
					var6 = var52[var40 + 3];
					var52[var40 + 3] = var52[var41 + 3];
					var52[var41 + 3] = var6;
					var6 = var52[var40 + 5];
					var52[var40 + 5] = var52[var41 + 5];
					var52[var41 + 5] = var6;
					var6 = var52[var40 + 7];
					var52[var40 + 7] = var52[var41 + 7];
					var52[var41 + 7] = var6;
				}
			}

			for (var49 = 0; var49 < floorNumber; var49++) {
				var52[var49] = var52[var49 * 2 + 1];
			}

			for (var49 = 0; var49 < var491; var49++) {
				var52[n - 1 - var49 * 2] = var52[var49 * 4];
				var52[n - 2 - var49 * 2] = var52[var49 * 4 + 1];
				var52[n - var48 - 1 - var49 * 2] = var52[var49 * 4 + 2];
				var52[n - var48 - 2 - var49 * 2] = var52[var49 * 4 + 3];
			}

			for (var49 = 0; var49 < var491; var49++) {
				var5 = var18[var49 * 2];
				var2 = var18[var49 * 2 + 1];
				var3 = var52[var49 * 2 + floorNumber];
				var6 = var52[var49 * 2 + floorNumber + 1];
				var4 = var52[n - 2 - var49 * 2];
				float var511 = var52[n - 1 - var49 * 2];
				float var521 = (var3 - var4) * var2 + (var6 + var511) * var5;
				var52[var49 * 2 + floorNumber] = (var3 + var4 + var521) * 0.5F;
				var52[n - 2 - var49 * 2] = (var3 + var4 - var521) * 0.5F;
				var521 = (var6 + var511) * var2 - (var3 - var4) * var5;
				var52[var49 * 2 + floorNumber + 1] = (var6 - var511 + var521) * 0.5F;
				var52[n - 1 - var49 * 2] = (-var6 + var511 + var521) * 0.5F;
			}

			for (var49 = 0; var49 < var48; var49++) {
				var52[var49] = var52[var49 * 2 + floorNumber] * var34[var49 * 2]
						+ var52[var49 * 2 + 1 + floorNumber] * var34[var49 * 2 + 1];
				var52[floorNumber - 1 - var49] = var52[var49 * 2 + floorNumber] * var34[var49 * 2 + 1]
						- var52[var49 * 2 + 1 + floorNumber] * var34[var49 * 2];
			}

			for (var49 = 0; var49 < var48; var49++) {
				var52[n - var48 + var49] = -var52[var49];
			}

			for (var49 = 0; var49 < var48; var49++) {
				var52[var49] = var52[var48 + var49];
			}

			for (var49 = 0; var49 < var48; var49++) {
				var52[var48 + var49] = -var52[var48 - var49 - 1];
			}

			for (var49 = 0; var49 < var48; var49++) {
				var52[floorNumber + var49] = var52[n - var49 - 1];
			}

			for (var49 = leftWindowStart; var49 < leftWindowEnd; var49++) {
				var5 = (float) Math
						.sin(((double) (var49 - leftWindowStart) + 0.5D) / (double) leftN * 0.5D * 3.141592653589793D);
				aFloatArray1246[var49] *= (float) Math.sin((double) var5 * 1.5707963267948966D * (double) var5);
			}

			for (var49 = rightWindowStart; var49 < rightWindowEnd; var49++) {
				var5 = (float) Math
						.sin(((double) (var49 - rightWindowStart) + 0.5D) / (double) rightN * 0.5D * 3.141592653589793D
								+ 1.5707963267948966D);
				aFloatArray1246[var49] *= (float) Math.sin((double) var5 * 1.5707963267948966D * (double) var5);
			}
		}

		var52 = null;
		if (this.anInt1225 > 0) {
			var48 = this.anInt1225 + n >> 2;
			var52 = new float[var48];
			if (!this.aBool1245) {
				for (var491 = 0; var491 < this.anInt1244; var491++) {
					var53 = (this.anInt1225 >> 1) + var491;
					var52[var491] += this.aFloatArray1242[var53];
				}
			}

			if (!decoded) {
				for (var491 = leftWindowStart; var491 < n >> 1; var491++) {
					var53 = var52.length - (n >> 1) + var491;
					var52[var53] += aFloatArray1246[var491];
				}
			}
		}

		float[] var501 = this.aFloatArray1242;
		this.aFloatArray1242 = aFloatArray1246;
		aFloatArray1246 = var501;
		this.anInt1225 = n;
		this.anInt1244 = rightWindowEnd - (n >> 1);
		this.aBool1245 = decoded;
		return var52;
	}

	static float float32Unpack(int x) {
		int mantissa = x & 0x1fffff;
		int oMantissa = x & 0x80000000;
		int e = (x & 0x7fe00000) >> 21;
		if (oMantissa != 0) {
			mantissa = -mantissa;
		}

		return (float) ((double) mantissa * Math.pow(2.0D, (double) (e - 788)));
	}

}
