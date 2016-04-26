public class Node_Sub12 extends Node {

	short[] aShortArray1368 = new short[128];
	byte[] aByteArray1369 = new byte[128];
	Class109[] aClass109Array1370 = new Class109[128];
	byte[] aByteArray1371 = new byte[128];
	byte[] aByteArray1372 = new byte[128];
	int[] anIntArray1373 = new int[128];
	Node_Sub2_Sub1[] aNode_Sub2_Sub1Array1374 = new Node_Sub2_Sub1[128];
	int anInt1367;

	Node_Sub12(byte[] var1) {
		ByteBuf var3 = new ByteBuf(var1);

		int var4;
		for (var4 = 0; var3.payload[var3.position + var4] != 0; var4++) {
			;
		}

		byte[] var10 = new byte[var4];

		int var9;
		for (var9 = 0; var9 < var4; var9++) {
			var10[var9] = var3.getByte();
		}

		++var3.position;
		++var4;
		var9 = var3.position;
		var3.position += var4;

		int var13;
		for (var13 = 0; var3.payload[var3.position + var13] != 0; var13++) {
			;
		}

		byte[] var14 = new byte[var13];

		int var12;
		for (var12 = 0; var12 < var13; var12++) {
			var14[var12] = var3.getByte();
		}

		++var3.position;
		++var13;
		var12 = var3.position;
		var3.position += var13;

		int var17;
		for (var17 = 0; var3.payload[var3.position + var17] != 0; var17++) {
			;
		}

		byte[] var18 = new byte[var17];

		for (int var45 = 0; var45 < var17; var45++) {
			var18[var45] = var3.getByte();
		}

		++var3.position;
		++var17;
		byte[] var421 = new byte[var17];
		int var23;
		int var24;
		if (var17 > 1) {
			var421[1] = 1;
			int var48 = 1;
			var23 = 2;

			for (var24 = 2; var24 < var17; var24++) {
				int var42 = var3.getUByte();
				if (var42 == 0) {
					var48 = var23++;
				} else {
					if (var42 <= var48) {
						--var42;
					}

					var48 = var42;
				}

				var421[var24] = (byte) var48;
			}
		} else {
			var23 = var17;
		}

		Class109[] var431 = new Class109[var23];

		Class109 var441;
		for (var24 = 0; var24 < var431.length; var24++) {
			var441 = var431[var24] = new Class109();
			int var43 = var3.getUByte();
			if (var43 > 0) {
				var441.aByteArray772 = new byte[var43 * 2];
			}

			var43 = var3.getUByte();
			if (var43 > 0) {
				var441.aByteArray778 = new byte[var43 * 2 + 2];
				var441.aByteArray778[1] = 64;
			}
		}

		var24 = var3.getUByte();
		byte[] var451 = var24 > 0 ? new byte[var24 * 2] : null;
		var24 = var3.getUByte();
		byte[] var46 = var24 > 0 ? new byte[var24 * 2] : null;

		int var28;
		for (var28 = 0; var3.payload[var3.position + var28] != 0; var28++) {
			;
		}

		byte[] var29 = new byte[var28];

		int var22;
		for (var22 = 0; var22 < var28; var22++) {
			var29[var22] = var3.getByte();
		}

		++var3.position;
		++var28;
		var22 = 0;

		int var20;
		for (var20 = 0; var20 < 128; var20++) {
			var22 += var3.getUByte();
			this.aShortArray1368[var20] = (short) var22;
		}

		var22 = 0;

		for (var20 = 0; var20 < 128; var20++) {
			var22 += var3.getUByte();
			this.aShortArray1368[var20] = (short) (this.aShortArray1368[var20] + (var22 << 8));
		}

		var20 = 0;
		int var30 = 0;
		int var32 = 0;

		int var31;
		for (var31 = 0; var31 < 128; var31++) {
			if (var20 == 0) {
				if (var30 < var29.length) {
					var20 = var29[var30++];
				} else {
					var20 = -1;
				}

				var32 = var3.getVarLen();
			}

			this.aShortArray1368[var31] = (short) (this.aShortArray1368[var31] + ((var32 - 1 & 0x2) << 14));
			this.anIntArray1373[var31] = var32;
			--var20;
		}

		var20 = 0;
		var30 = 0;
		var31 = 0;

		int var27;
		for (var27 = 0; var27 < 128; var27++) {
			if (this.anIntArray1373[var27] != 0) {
				if (var20 == 0) {
					if (var30 < var10.length) {
						var20 = var10[var30++];
					} else {
						var20 = -1;
					}

					var31 = var3.payload[var9++] - 1;
				}

				this.aByteArray1371[var27] = (byte) var31;
				--var20;
			}
		}

		var20 = 0;
		var30 = 0;
		var27 = 0;

		for (int var49 = 0; var49 < 128; var49++) {
			if (this.anIntArray1373[var49] != 0) {
				if (var20 == 0) {
					if (var30 < var14.length) {
						var20 = var14[var30++];
					} else {
						var20 = -1;
					}

					var27 = var3.payload[var12++] + 16 << 2;
				}

				this.aByteArray1369[var49] = (byte) var27;
				--var20;
			}
		}

		var20 = 0;
		var30 = 0;
		Class109 var461 = null;

		int var16;
		for (var16 = 0; var16 < 128; var16++) {
			if (this.anIntArray1373[var16] != 0) {
				if (var20 == 0) {
					var461 = var431[var421[var30]];
					if (var30 < var18.length) {
						var20 = var18[var30++];
					} else {
						var20 = -1;
					}
				}

				this.aClass109Array1370[var16] = var461;
				--var20;
			}
		}

		var20 = 0;
		var30 = 0;
		var16 = 0;

		int var6;
		for (var6 = 0; var6 < 128; var6++) {
			if (var20 == 0) {
				if (var30 < var29.length) {
					var20 = var29[var30++];
				} else {
					var20 = -1;
				}

				if (this.anIntArray1373[var6] > 0) {
					var16 = var3.getUByte() + 1;
				}
			}

			this.aByteArray1372[var6] = (byte) var16;
			--var20;
		}

		this.anInt1367 = (var3.getUByte() + 1) * -1206623231;

		Class109 var5;
		int var8;
		for (var6 = 0; var6 < var23; var6++) {
			var5 = var431[var6];
			if (var5.aByteArray772 != null) {
				for (var8 = 1; var8 < var5.aByteArray772.length; var8 += 2) {
					var5.aByteArray772[var8] = var3.getByte();
				}
			}

			if (var5.aByteArray778 != null) {
				for (var8 = 3; var8 < var5.aByteArray778.length - 2; var8 += 2) {
					var5.aByteArray778[var8] = var3.getByte();
				}
			}
		}

		if (var451 != null) {
			for (var6 = 1; var6 < var451.length; var6 += 2) {
				var451[var6] = var3.getByte();
			}
		}

		if (var46 != null) {
			for (var6 = 1; var6 < var46.length; var6 += 2) {
				var46[var6] = var3.getByte();
			}
		}

		for (var6 = 0; var6 < var23; var6++) {
			var5 = var431[var6];
			if (var5.aByteArray778 != null) {
				var22 = 0;

				for (var8 = 2; var8 < var5.aByteArray778.length; var8 += 2) {
					var22 = var22 + 1 + var3.getUByte();
					var5.aByteArray778[var8] = (byte) var22;
				}
			}
		}

		for (var6 = 0; var6 < var23; var6++) {
			var5 = var431[var6];
			if (var5.aByteArray772 != null) {
				var22 = 0;

				for (var8 = 2; var8 < var5.aByteArray772.length; var8 += 2) {
					var22 = var22 + 1 + var3.getUByte();
					var5.aByteArray772[var8] = (byte) var22;
				}
			}
		}

		byte var2;
		int var7;
		int var33;
		int var34;
		int var35;
		int var36;
		int var38;
		byte var41;
		if (var451 != null) {
			var22 = var3.getUByte();
			var451[0] = (byte) var22;

			for (var6 = 2; var6 < var451.length; var6 += 2) {
				var22 = var22 + 1 + var3.getUByte();
				var451[var6] = (byte) var22;
			}

			var41 = var451[0];
			byte var40 = var451[1];

			for (var8 = 0; var8 < var41; var8++) {
				this.aByteArray1372[var8] = (byte) (this.aByteArray1372[var8] * var40 + 32 >> 6);
			}

			for (var8 = 2; var8 < var451.length; var8 += 2) {
				var2 = var451[var8];
				byte var44 = var451[var8 + 1];
				var7 = (var2 - var41) * var40 + (var2 - var41) / 2;

				for (var33 = var41; var33 < var2; var33++) {
					var35 = var2 - var41;
					var34 = var7 >>> 31;
					var36 = (var34 + var7) / var35 - var34;
					this.aByteArray1372[var33] = (byte) (this.aByteArray1372[var33] * var36 + 32 >> 6);
					var7 += var44 - var40;
				}

				var41 = var2;
				var40 = var44;
			}

			for (var38 = var41; var38 < 128; var38++) {
				this.aByteArray1372[var38] = (byte) (this.aByteArray1372[var38] * var40 + 32 >> 6);
			}

			var441 = null;
		}

		if (var46 != null) {
			var22 = var3.getUByte();
			var46[0] = (byte) var22;

			for (var6 = 2; var6 < var46.length; var6 += 2) {
				var22 = var22 + 1 + var3.getUByte();
				var46[var6] = (byte) var22;
			}

			var41 = var46[0];
			int var47 = var46[1] << 1;

			for (var8 = 0; var8 < var41; var8++) {
				var38 = (this.aByteArray1369[var8] & 0xff) + var47;
				if (var38 < 0) {
					var38 = 0;
				}

				if (var38 > 128) {
					var38 = 128;
				}

				this.aByteArray1369[var8] = (byte) var38;
			}

			int var481;
			for (var8 = 2; var8 < var46.length; var8 += 2) {
				var2 = var46[var8];
				var481 = var46[var8 + 1] << 1;
				var7 = (var2 - var41) * var47 + (var2 - var41) / 2;

				for (var33 = var41; var33 < var2; var33++) {
					var35 = var2 - var41;
					var34 = var7 >>> 31;
					var36 = (var34 + var7) / var35 - var34;
					int var37 = (this.aByteArray1369[var33] & 0xff) + var36;
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					this.aByteArray1369[var33] = (byte) var37;
					var7 += var481 - var47;
				}

				var41 = var2;
				var47 = var481;
			}

			for (var38 = var41; var38 < 128; var38++) {
				var481 = (this.aByteArray1369[var38] & 0xff) + var47;
				if (var481 < 0) {
					var481 = 0;
				}

				if (var481 > 128) {
					var481 = 128;
				}

				this.aByteArray1369[var38] = (byte) var481;
			}

			Object var491 = null;
		}

		for (var6 = 0; var6 < var23; var6++) {
			var431[var6].anInt773 = var3.getUByte();
		}

		for (var6 = 0; var6 < var23; var6++) {
			var5 = var431[var6];
			if (var5.aByteArray772 != null) {
				var5.anInt774 = var3.getUByte();
			}

			if (var5.aByteArray778 != null) {
				var5.anInt775 = var3.getUByte();
			}

			if (var5.anInt773 > 0) {
				var5.anInt776 = var3.getUByte();
			}
		}

		for (var6 = 0; var6 < var23; var6++) {
			var431[var6].anInt780 = var3.getUByte();
		}

		for (var6 = 0; var6 < var23; var6++) {
			var5 = var431[var6];
			if (var5.anInt780 > 0) {
				var5.anInt777 = var3.getUByte();
			}
		}

		for (var6 = 0; var6 < var23; var6++) {
			var5 = var431[var6];
			if (var5.anInt777 > 0) {
				var5.anInt779 = var3.getUByte();
			}
		}

	}

	void method573() {
		this.anIntArray1373 = null;
	}

	boolean method574(Class13 var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		Node_Sub2_Sub1 var8 = null;

		for (int var6 = 0; var6 < 128; var6++) {
			if (var2 == null || var2[var6] != 0) {
				int var7 = this.anIntArray1373[var6];
				if (var7 != 0) {
					if (var7 != var5) {
						var5 = var7--;
						if ((var7 & 0x1) == 0) {
							var8 = var1.method113(var7 >> 2, var3);
						} else {
							var8 = var1.method115(var7 >> 2, var3);
						}

						if (var8 == null) {
							var4 = false;
						}
					}

					if (var8 != null) {
						this.aNode_Sub2_Sub1Array1374[var6] = var8;
						this.anIntArray1373[var6] = 0;
					}
				}
			}
		}

		return var4;
	}

}
