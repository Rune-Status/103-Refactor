
public class Node_Sub7 extends Node {

	static int[] anIntArray1284;
	boolean aBool1285;
	int anInt1286;
	int[] anIntArray1287;
	int[] anIntArray1288;
	int[] anIntArray1289;
	int[] anIntArray1290;
	int anInt1291;
	int[] anIntArray1292;
	boolean aBool1293 = false;
	int anInt1294;

	void method541() {
		this.anIntArray1292 = null;
	}

	void method542(int var1) {
		if (this.anIntArray1292 != null) {
			int var2;
			short var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.anInt1294 == 1 || this.anInt1294 == 3) {
				if (anIntArray1284 == null || anIntArray1284.length < this.anIntArray1292.length) {
					anIntArray1284 = new int[this.anIntArray1292.length];
				}

				if (this.anIntArray1292.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var6 = this.anIntArray1292.length;
				var5 = var3 * var1 * this.anInt1291;
				var7 = var6 - 1;
				if (this.anInt1294 == 1) {
					var5 = -var5;
				}

				for (var4 = 0; var4 < var6; ++var4) {
					var2 = var4 + var5 & var7;
					anIntArray1284[var4] = this.anIntArray1292[var2];
				}

				var10 = this.anIntArray1292;
				this.anIntArray1292 = anIntArray1284;
				anIntArray1284 = var10;
			}

			if (this.anInt1294 == 2 || this.anInt1294 == 4) {
				if (anIntArray1284 == null || anIntArray1284.length < this.anIntArray1292.length) {
					anIntArray1284 = new int[this.anIntArray1292.length];
				}

				if (this.anIntArray1292.length == 4096) {
					var3 = 64;
				} else {
					var3 = 128;
				}

				var6 = this.anIntArray1292.length;
				var5 = var1 * this.anInt1291;
				var7 = var3 - 1;
				if (this.anInt1294 == 2) {
					var5 = -var5;
				}

				for (var4 = 0; var4 < var6; var4 += var3) {
					for (var2 = 0; var2 < var3; ++var2) {
						int var8 = var4 + var2;
						int var9 = var4 + (var2 + var5 & var7);
						anIntArray1284[var8] = this.anIntArray1292[var9];
					}
				}

				var10 = this.anIntArray1292;
				this.anIntArray1292 = anIntArray1284;
				anIntArray1284 = var10;
			}

		}
	}

	Node_Sub7(ByteBuf var1) {
		this.anInt1286 = var1.getUShort();
		this.aBool1285 = var1.getUByte() == 1;
		int var3 = var1.getUByte();
		if (var3 >= 1 && var3 <= 4) {
			this.anIntArray1287 = new int[var3];

			int var2;
			for (var2 = 0; var2 < var3; ++var2) {
				this.anIntArray1287[var2] = var1.getUShort();
			}

			if (var3 > 1) {
				this.anIntArray1288 = new int[var3 - 1];

				for (var2 = 0; var2 < var3 - 1; ++var2) {
					this.anIntArray1288[var2] = var1.getUByte();
				}
			}

			if (var3 > 1) {
				this.anIntArray1289 = new int[var3 - 1];

				for (var2 = 0; var2 < var3 - 1; ++var2) {
					this.anIntArray1289[var2] = var1.getUByte();
				}
			}

			this.anIntArray1290 = new int[var3];

			for (var2 = 0; var2 < var3; ++var2) {
				this.anIntArray1290[var2] = var1.getInt();
			}

			this.anInt1294 = var1.getUByte();
			this.anInt1291 = var1.getUByte();
			this.anIntArray1292 = null;
		} else {
			throw new RuntimeException();
		}
	}

	boolean method543(double var1, int var3, AbstractIndex var4) {
		int var5;
		for (var5 = 0; var5 < this.anIntArray1287.length; ++var5) {
			if (var4.method392(this.anIntArray1287[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.anIntArray1292 = new int[var5];

		for (int var7 = 0; var7 < this.anIntArray1287.length; ++var7) {
			DualNode_Sub13_Sub2 var12 = IndexTable.method306(var4, this.anIntArray1287[var7]);
			var12.method930();
			byte[] var14 = var12.aByteArray1799;
			int[] var9 = var12.anIntArray1798;
			int var13 = this.anIntArray1290[var7];
			if ((var13 & -16777216) == 16777216) {
				;
			}

			if ((var13 & -16777216) == 33554432) {
				;
			}

			int var6;
			int var8;
			int var10;
			int var11;
			if ((var13 & -16777216) == 50331648) {
				var10 = var13 & 16711935;
				var11 = var13 >> 8 & 255;

				for (var8 = 0; var8 < var9.length; ++var8) {
					var6 = var9[var8];
					if ((var6 & '\uffff') == var6 >> 8) {
						var6 &= 255;
						var9[var8] = var10 * var6 >> 8 & 16711935 | var11 * var6 & '\uff00';
					}
				}
			}

			for (var10 = 0; var10 < var9.length; ++var10) {
				var9[var10] = DualNode_Sub13_Sub1.method915(var9[var10], var1);
			}

			if (var7 == 0) {
				var10 = 0;
			} else {
				var10 = this.anIntArray1288[var7 - 1];
			}

			if (var7 == 0) {
				;
			}

			if (var10 == 0) {
				if (var12.anInt1800 == var3) {
					for (var11 = 0; var11 < var5; ++var11) {
						this.anIntArray1292[var11] = var9[var14[var11] & 255];
					}
				} else if (var12.anInt1800 == 64 && var3 == 128) {
					var11 = 0;

					for (var8 = 0; var8 < var3; ++var8) {
						for (var6 = 0; var6 < var3; ++var6) {
							this.anIntArray1292[var11++] = var9[var14[(var6 >> 1) + (var8 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var12.anInt1800 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var11 = 0;

					for (var8 = 0; var8 < var3; ++var8) {
						for (var6 = 0; var6 < var3; ++var6) {
							this.anIntArray1292[var11++] = var9[var14[(var6 << 1) + (var8 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var10 == 1) {
				;
			}

			if (var10 == 2) {
				;
			}

			if (var10 == 3) {
				;
			}
		}

		return true;
	}
}
