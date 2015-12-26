
public class Node_Sub3 extends Node {

	static int anInt1224;
	int anInt1225;
	int anInt1226;
	int anInt1227;
	int anInt1228;
	boolean aBool1229;
	static Class9[] aClass9Array1230;
	static float[] aFloatArray1231;
	static int anInt1232;
	static int[] anIntArray1233;
	static int anInt1234;
	byte[] aByteArray1235;
	static Class18[] aClass18Array1236;
	static int anInt1237;
	static Class17[] aClass17Array1238;
	static boolean[] aBoolArray1239;
	int anInt1240;
	static boolean aBool1241 = false;
	float[] aFloatArray1242;
	static Class12[] aClass12Array1243;
	int anInt1244;
	boolean aBool1245;
	static float[] aFloatArray1246;
	static float[] aFloatArray1247;
	static float[] aFloatArray1248;
	static float[] aFloatArray1249;
	static float[] aFloatArray1250;
	static float[] aFloatArray1251;
	static byte[] aByteArray1252;
	static int[] anIntArray1253;
	static int[] anIntArray1254;
	byte[][] aByteArrayArray1255;
	int anInt1256;
	int anInt1257;

	static int method515() {
		int var0 = aByteArray1252[anInt1224] >> anInt1232 & 1;
		++anInt1232;
		anInt1224 += anInt1232 >> 3;
		anInt1232 &= 7;
		return var0;
	}

	static void method516(byte[] var0) {
		method521(var0, 0);
		anInt1237 = 1 << method517(4);
		anInt1234 = 1 << method517(4);
		aFloatArray1246 = new float[anInt1234];

		int var1;
		int var2;
		int var3;
		int var6;
		int var7;
		for (var6 = 0; var6 < 2; ++var6) {
			var7 = var6 != 0 ? anInt1234 : anInt1237;
			var3 = var7 >> 1;
			var2 = var7 >> 2;
			var1 = var7 >> 3;
			float[] var9 = new float[var3];

			for (int var4 = 0; var4 < var2; ++var4) {
				var9[2 * var4] = (float) Math.cos((double) (4 * var4) * 3.141592653589793D / (double) var7);
				var9[2 * var4 + 1] = -((float) Math.sin((double) (4 * var4) * 3.141592653589793D / (double) var7));
			}

			float[] var18 = new float[var3];

			for (int var10 = 0; var10 < var2; ++var10) {
				var18[2 * var10] = (float) Math
						.cos((double) (2 * var10 + 1) * 3.141592653589793D / (double) (2 * var7));
				var18[2 * var10 + 1] = (float) Math
						.sin((double) (2 * var10 + 1) * 3.141592653589793D / (double) (2 * var7));
			}

			float[] var20 = new float[var2];

			for (int var11 = 0; var11 < var1; ++var11) {
				var20[2 * var11] = (float) Math.cos((double) (4 * var11 + 2) * 3.141592653589793D / (double) var7);
				var20[2 * var11
						+ 1] = -((float) Math.sin((double) (4 * var11 + 2) * 3.141592653589793D / (double) var7));
			}

			int[] var21 = new int[var1];
			int var12 = DualNode_Sub8.method709(var1 - 1);

			for (int var8 = 0; var8 < var1; ++var8) {
				int var5 = var8;
				int var13 = var12;

				int var15;
				for (var15 = 0; var13 > 0; --var13) {
					var15 = var15 << 1 | var5 & 1;
					var5 >>>= 1;
				}

				var21[var8] = var15;
			}

			if (var6 != 0) {
				aFloatArray1249 = var9;
				aFloatArray1251 = var18;
				aFloatArray1231 = var20;
				anIntArray1254 = var21;
			} else {
				aFloatArray1247 = var9;
				aFloatArray1248 = var18;
				aFloatArray1250 = var20;
				anIntArray1253 = var21;
			}
		}

		var6 = method517(8) + 1;
		aClass12Array1243 = new Class12[var6];

		for (var7 = 0; var7 < var6; ++var7) {
			aClass12Array1243[var7] = new Class12();
		}

		var7 = method517(6) + 1;

		for (var3 = 0; var3 < var7; ++var3) {
			method517(16);
		}

		var7 = method517(6) + 1;
		aClass18Array1236 = new Class18[var7];

		for (var3 = 0; var3 < var7; ++var3) {
			aClass18Array1236[var3] = new Class18();
		}

		var3 = method517(6) + 1;
		aClass9Array1230 = new Class9[var3];

		for (var2 = 0; var2 < var3; ++var2) {
			aClass9Array1230[var2] = new Class9();
		}

		var2 = method517(6) + 1;
		aClass17Array1238 = new Class17[var2];

		for (var1 = 0; var1 < var2; ++var1) {
			aClass17Array1238[var1] = new Class17();
		}

		var1 = method517(6) + 1;
		aBoolArray1239 = new boolean[var1];
		anIntArray1233 = new int[var1];

		for (int var19 = 0; var19 < var1; ++var19) {
			aBoolArray1239[var19] = method515() != 0;
			method517(16);
			method517(16);
			anIntArray1233[var19] = method517(8);
		}

	}

	static int method517(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - anInt1232; var0 -= var3) {
			var3 = 8 - anInt1232;
			int var4 = (1 << var3) - 1;
			var1 += (aByteArray1252[anInt1224] >> anInt1232 & var4) << var2;
			anInt1232 = 0;
			++anInt1224;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += (aByteArray1252[anInt1224] >> anInt1232 & var3) << var2;
			anInt1232 += var0;
		}

		return var1;
	}

	static boolean method518(Class87 var0) {
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
				this.aFloatArray1242 = new float[anInt1234];
				this.aByteArray1235 = new byte[this.anInt1226];
				this.anInt1227 = 0;
				this.anInt1257 = 0;
			}

			for (; this.anInt1257 < this.aByteArrayArray1255.length; ++this.anInt1257) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method523(this.anInt1257);
				if (var2 != null) {
					int var5 = this.anInt1227;
					int var6 = var2.length;
					if (var6 > this.anInt1226 - var5) {
						var6 = this.anInt1226 - var5;
					}

					for (int var3 = 0; var3 < var6; ++var3) {
						int var4 = (int) (128.0F + var2[var3] * 128.0F);
						if ((var4 & -256) != 0) {
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
			byte[] var7 = this.aByteArray1235;
			this.aByteArray1235 = null;
			return new Node_Sub2_Sub1(this.anInt1240, var7, this.anInt1256, this.anInt1228, this.aBool1229);
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

		for (int var3 = 0; var3 < var5; ++var3) {
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

	static void method521(byte[] var0, int var1) {
		aByteArray1252 = var0;
		anInt1224 = var1;
		anInt1232 = 0;
	}

	static Node_Sub3 method522(Class87 var0, int var1, int var2) {
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
		method521(this.aByteArrayArray1255[var1], 0);
		method515();
		int var25 = method517(DualNode_Sub8.method709(anIntArray1233.length - 1));
		boolean var10 = aBoolArray1239[var25];
		int var9 = var10 ? anInt1234 : anInt1237;
		boolean var13 = false;
		boolean var14 = false;
		if (var10) {
			var13 = method515() != 0;
			var14 = method515() != 0;
		}

		int var22 = var9 >> 1;
		int var11;
		int var19;
		int var21;
		if (var10 && !var13) {
			var11 = (var9 >> 2) - (anInt1237 >> 2);
			var19 = (var9 >> 2) + (anInt1237 >> 2);
			var21 = anInt1237 >> 1;
		} else {
			var11 = 0;
			var19 = var22;
			var21 = var9 >> 1;
		}

		int var20;
		int var23;
		int var24;
		if (var10 && !var14) {
			var23 = var9 - (var9 >> 2) - (anInt1237 >> 2);
			var20 = var9 - (var9 >> 2) + (anInt1237 >> 2);
			var24 = anInt1237 >> 1;
		} else {
			var23 = var22;
			var20 = var9;
			var24 = var9 >> 1;
		}

		Class17 var26 = aClass17Array1238[anIntArray1233[var25]];
		int var27 = var26.anInt249;
		int var28 = var26.anIntArray248[var27];
		boolean var29 = !aClass18Array1236[var28].method134();
		boolean var50 = var29;

		for (var28 = 0; var28 < var26.anInt247; ++var28) {
			Class9 var30 = aClass9Array1230[var26.anIntArray250[var28]];
			float[] var12 = aFloatArray1246;
			var30.method97(var12, var9 >> 1, var50);
		}

		int var51;
		if (!var29) {
			var28 = var26.anInt249;
			var51 = var26.anIntArray248[var28];
			aClass18Array1236[var51].method136(aFloatArray1246, var9 >> 1);
		}

		int var47;
		if (var29) {
			for (var28 = var9 >> 1; var28 < var9; ++var28) {
				aFloatArray1246[var28] = 0.0F;
			}
		} else {
			var28 = var9 >> 1;
			var51 = var9 >> 2;
			var47 = var9 >> 3;
			float[] var15 = aFloatArray1246;

			int var33;
			for (var33 = 0; var33 < var28; ++var33) {
				var15[var33] *= 0.5F;
			}

			for (var33 = var28; var33 < var9; ++var33) {
				var15[var33] = -var15[var9 - var33 - 1];
			}

			float[] var54 = var10 ? aFloatArray1249 : aFloatArray1247;
			float[] var34 = var10 ? aFloatArray1251 : aFloatArray1248;
			float[] var18 = var10 ? aFloatArray1231 : aFloatArray1250;
			int[] var39 = var10 ? anIntArray1254 : anIntArray1253;

			float var2;
			float var3;
			float var5;
			int var16;
			float var17;
			for (var16 = 0; var16 < var51; ++var16) {
				var17 = var15[4 * var16] - var15[var9 - 4 * var16 - 1];
				var5 = var15[4 * var16 + 2] - var15[var9 - 4 * var16 - 3];
				var2 = var54[2 * var16];
				var3 = var54[2 * var16 + 1];
				var15[var9 - 4 * var16 - 1] = var17 * var2 - var5 * var3;
				var15[var9 - 4 * var16 - 3] = var17 * var3 + var5 * var2;
			}

			float var4;
			float var6;
			for (var16 = 0; var16 < var47; ++var16) {
				var17 = var15[var28 + 3 + 4 * var16];
				var5 = var15[var28 + 1 + 4 * var16];
				var2 = var15[4 * var16 + 3];
				var3 = var15[4 * var16 + 1];
				var15[var28 + 3 + 4 * var16] = var17 + var2;
				var15[var28 + 1 + 4 * var16] = var5 + var3;
				var6 = var54[var28 - 4 - 4 * var16];
				var4 = var54[var28 - 3 - 4 * var16];
				var15[4 * var16 + 3] = (var17 - var2) * var6 - (var5 - var3) * var4;
				var15[4 * var16 + 1] = (var5 - var3) * var6 + (var17 - var2) * var4;
			}

			var16 = DualNode_Sub8.method709(var9 - 1);

			int var40;
			int var41;
			int var43;
			int var49;
			for (var49 = 0; var49 < var16 - 3; ++var49) {
				var43 = var9 >> var49 + 2;
				var40 = 8 << var49;

				for (var41 = 0; var41 < 2 << var49; ++var41) {
					int var44 = var9 - var43 * 2 * var41;
					int var42 = var9 - var43 * (2 * var41 + 1);

					for (int var7 = 0; var7 < var9 >> var49 + 4; ++var7) {
						int var8 = 4 * var7;
						float var35 = var15[var44 - 1 - var8];
						float var31 = var15[var44 - 3 - var8];
						float var36 = var15[var42 - 1 - var8];
						float var32 = var15[var42 - 3 - var8];
						var15[var44 - 1 - var8] = var35 + var36;
						var15[var44 - 3 - var8] = var31 + var32;
						float var37 = var54[var7 * var40];
						float var38 = var54[var7 * var40 + 1];
						var15[var42 - 1 - var8] = (var35 - var36) * var37 - (var31 - var32) * var38;
						var15[var42 - 3 - var8] = (var31 - var32) * var37 + (var35 - var36) * var38;
					}
				}
			}

			for (var49 = 1; var49 < var47 - 1; ++var49) {
				var43 = var39[var49];
				if (var49 < var43) {
					var40 = 8 * var49;
					var41 = 8 * var43;
					var6 = var15[var40 + 1];
					var15[var40 + 1] = var15[var41 + 1];
					var15[var41 + 1] = var6;
					var6 = var15[var40 + 3];
					var15[var40 + 3] = var15[var41 + 3];
					var15[var41 + 3] = var6;
					var6 = var15[var40 + 5];
					var15[var40 + 5] = var15[var41 + 5];
					var15[var41 + 5] = var6;
					var6 = var15[var40 + 7];
					var15[var40 + 7] = var15[var41 + 7];
					var15[var41 + 7] = var6;
				}
			}

			for (var49 = 0; var49 < var28; ++var49) {
				var15[var49] = var15[2 * var49 + 1];
			}

			for (var49 = 0; var49 < var47; ++var49) {
				var15[var9 - 1 - 2 * var49] = var15[4 * var49];
				var15[var9 - 2 - 2 * var49] = var15[4 * var49 + 1];
				var15[var9 - var51 - 1 - 2 * var49] = var15[4 * var49 + 2];
				var15[var9 - var51 - 2 - 2 * var49] = var15[4 * var49 + 3];
			}

			for (var49 = 0; var49 < var47; ++var49) {
				var5 = var18[2 * var49];
				var2 = var18[2 * var49 + 1];
				var3 = var15[var28 + 2 * var49];
				var6 = var15[var28 + 2 * var49 + 1];
				var4 = var15[var9 - 2 - 2 * var49];
				float var45 = var15[var9 - 1 - 2 * var49];
				float var46 = var2 * (var3 - var4) + var5 * (var6 + var45);
				var15[var28 + 2 * var49] = (var3 + var4 + var46) * 0.5F;
				var15[var9 - 2 - 2 * var49] = (var3 + var4 - var46) * 0.5F;
				var46 = var2 * (var6 + var45) - var5 * (var3 - var4);
				var15[var28 + 2 * var49 + 1] = (var6 - var45 + var46) * 0.5F;
				var15[var9 - 1 - 2 * var49] = (-var6 + var45 + var46) * 0.5F;
			}

			for (var49 = 0; var49 < var51; ++var49) {
				var15[var49] = var15[2 * var49 + var28] * var34[2 * var49]
						+ var15[2 * var49 + 1 + var28] * var34[2 * var49 + 1];
				var15[var28 - 1 - var49] = var15[2 * var49 + var28] * var34[2 * var49 + 1]
						- var15[2 * var49 + 1 + var28] * var34[2 * var49];
			}

			for (var49 = 0; var49 < var51; ++var49) {
				var15[var9 - var51 + var49] = -var15[var49];
			}

			for (var49 = 0; var49 < var51; ++var49) {
				var15[var49] = var15[var51 + var49];
			}

			for (var49 = 0; var49 < var51; ++var49) {
				var15[var51 + var49] = -var15[var51 - var49 - 1];
			}

			for (var49 = 0; var49 < var51; ++var49) {
				var15[var28 + var49] = var15[var9 - var49 - 1];
			}

			for (var49 = var11; var49 < var19; ++var49) {
				var5 = (float) Math.sin(((double) (var49 - var11) + 0.5D) / (double) var21 * 0.5D * 3.141592653589793D);
				aFloatArray1246[var49] *= (float) Math.sin(1.5707963267948966D * (double) var5 * (double) var5);
			}

			for (var49 = var23; var49 < var20; ++var49) {
				var5 = (float) Math.sin(((double) (var49 - var23) + 0.5D) / (double) var24 * 0.5D * 3.141592653589793D
						+ 1.5707963267948966D);
				aFloatArray1246[var49] *= (float) Math.sin(1.5707963267948966D * (double) var5 * (double) var5);
			}
		}

		float[] var52 = null;
		if (this.anInt1225 > 0) {
			var51 = this.anInt1225 + var9 >> 2;
			var52 = new float[var51];
			int var48;
			if (!this.aBool1245) {
				for (var47 = 0; var47 < this.anInt1244; ++var47) {
					var48 = (this.anInt1225 >> 1) + var47;
					var52[var47] += this.aFloatArray1242[var48];
				}
			}

			if (!var29) {
				for (var47 = var11; var47 < var9 >> 1; ++var47) {
					var48 = var52.length - (var9 >> 1) + var47;
					var52[var48] += aFloatArray1246[var47];
				}
			}
		}

		float[] var53 = this.aFloatArray1242;
		this.aFloatArray1242 = aFloatArray1246;
		aFloatArray1246 = var53;
		this.anInt1225 = var9;
		this.anInt1244 = var20 - (var9 >> 1);
		this.aBool1245 = var29;
		return var52;
	}

	static float method524(int var0) {
		int var1 = var0 & 2097151;
		int var3 = var0 & Integer.MIN_VALUE;
		int var2 = (var0 & 2145386496) >> 21;
		if (var3 != 0) {
			var1 = -var1;
		}

		return (float) ((double) var1 * Math.pow(2.0D, (double) (var2 - 788)));
	}
}
