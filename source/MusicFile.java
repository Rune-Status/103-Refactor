
public class MusicFile extends Node {

	NodeTable aNodeTable1365;
	byte[] aByteArray1366;

	void method570() {
		if (this.aNodeTable1365 == null) {
			this.aNodeTable1365 = new NodeTable(16);
			int[] var3 = new int[16];
			int[] var5 = new int[16];
			var5[9] = 128;
			var3[9] = 128;
			Class80 var1 = new Class80(this.aByteArray1366);
			int var2 = var1.method348();

			int var4;
			for (var4 = 0; var4 < var2; ++var4) {
				var1.method349(var4);
				var1.method360(var4);
				var1.method350(var4);
			}

			while (true) {
				var4 = var1.method353();
				int var8 = var1.anIntArray659[var4];

				while (var1.anIntArray659[var4] == var8) {
					var1.method349(var4);
					int var9 = var1.method356(var4);
					if (var9 == 1) {
						var1.method359();
						var1.method350(var4);
						if (var1.method355()) {
							return;
						}
						break;
					}

					int var6 = var9 & 240;
					int var10;
					int var12;
					int var13;
					if (var6 == 176) {
						var10 = var9 & 15;
						var13 = var9 >> 8 & 127;
						var12 = var9 >> 16 & 127;
						if (var13 == 0) {
							var3[var10] = (var3[var10] & -2080769) + (var12 << 14);
						}

						if (var13 == 32) {
							var3[var10] = (var3[var10] & -16257) + (var12 << 7);
						}
					}

					if (var6 == 192) {
						var10 = var9 & 15;
						var13 = var9 >> 8 & 127;
						var5[var10] = var3[var10] + var13;
					}

					if (var6 == 144) {
						var10 = var9 & 15;
						var13 = var9 >> 8 & 127;
						var12 = var9 >> 16 & 127;
						if (var12 > 0) {
							int var11 = var5[var10];
							Node_Sub15 var14 = (Node_Sub15) this.aNodeTable1365.get((long) var11);
							if (var14 == null) {
								var14 = new Node_Sub15(new byte[128]);
								this.aNodeTable1365.put(var14, (long) var11);
							}

							var14.aByteArray1418[var13] = 1;
						}
					}

					var1.method360(var4);
					var1.method350(var4);
				}
			}
		}
	}

	MusicFile(ByteBuf buf) {
		buf.position = (buf.payload.length - 3) * -184175589;
		int var2 = buf.getUByte();
		int var3 = buf.getUShort();
		int var24 = 14 + var2 * 10;
		buf.position = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var19 = 0;
		int var25 = 0;
		int var4 = 0;
		int var15 = 0;

		int var11;
		int var12;
		while (var15 < var2) {
			var12 = -1;

			while (true) {
				var11 = buf.getUByte();
				if (var11 != var12) {
					++var24;
				}

				var12 = var11 & 15;
				if (var11 == 7) {
					++var15;
					break;
				}

				if (var11 == 23) {
					++var5;
				} else if (var12 == 0) {
					++var7;
				} else if (var12 == 1) {
					++var8;
				} else if (var12 == 2) {
					++var6;
				} else if (var12 == 3) {
					++var9;
				} else if (var12 == 4) {
					++var19;
				} else if (var12 == 5) {
					++var25;
				} else {
					if (var12 != 6) {
						throw new RuntimeException();
					}

					++var4;
				}
			}
		}

		var24 += 5 * var5;
		var24 += 2 * (var7 + var8 + var6 + var9 + var25);
		var24 += var19 + var4;
		var15 = buf.position * 314639891;
		var12 = var2 + var5 + var6 + var7 + var8 + var9 + var19 + var25 + var4;

		for (var11 = 0; var11 < var12; ++var11) {
			buf.method632();
		}

		var24 += buf.position * 314639891 - var15;
		var11 = buf.position * 314639891;
		int var27 = 0;
		int var28 = 0;
		int var16 = 0;
		int var29 = 0;
		int var30 = 0;
		int var52 = 0;
		int var32 = 0;
		int var39 = 0;
		int var40 = 0;
		int var34 = 0;
		int var35 = 0;
		int var36 = 0;
		int var21 = 0;

		int var37;
		for (var37 = 0; var37 < var6; ++var37) {
			var21 = var21 + buf.getUByte() & 127;
			if (var21 != 0 && var21 != 32) {
				if (var21 == 1) {
					++var27;
				} else if (var21 == 33) {
					++var28;
				} else if (var21 == 7) {
					++var16;
				} else if (var21 == 39) {
					++var29;
				} else if (var21 == 10) {
					++var30;
				} else if (var21 == 42) {
					++var52;
				} else if (var21 == 99) {
					++var32;
				} else if (var21 == 98) {
					++var39;
				} else if (var21 == 101) {
					++var40;
				} else if (var21 == 100) {
					++var34;
				} else if (var21 != 64 && var21 != 65 && var21 != 120 && var21 != 121 && var21 != 123) {
					++var36;
				} else {
					++var35;
				}
			} else {
				++var4;
			}
		}

		var37 = 0;
		int var13 = buf.position * 314639891;
		buf.position += var35 * -184175589;
		int var20 = buf.position * 314639891;
		buf.position += var25 * -184175589;
		int var23 = buf.position * 314639891;
		buf.position += var19 * -184175589;
		int var42 = buf.position * 314639891;
		buf.position += var9 * -184175589;
		int var44 = buf.position * 314639891;
		buf.position += var27 * -184175589;
		int var43 = buf.position * 314639891;
		buf.position += var16 * -184175589;
		int var45 = buf.position * 314639891;
		buf.position += var30 * -184175589;
		int var46 = buf.position * 314639891;
		buf.position += (var7 + var8 + var25) * -184175589;
		int var47 = buf.position * 314639891;
		buf.position += var7 * -184175589;
		int var53 = buf.position * 314639891;
		buf.position += var36 * -184175589;
		int var48 = buf.position * 314639891;
		buf.position += var8 * -184175589;
		int var64 = buf.position * 314639891;
		buf.position += var28 * -184175589;
		int var49 = buf.position * 314639891;
		buf.position += var29 * -184175589;
		int var51 = buf.position * 314639891;
		buf.position += var52 * -184175589;
		int var50 = buf.position * 314639891;
		buf.position += var4 * -184175589;
		int var18 = buf.position * 314639891;
		buf.position += var9 * -184175589;
		int var56 = buf.position * 314639891;
		buf.position += var32 * -184175589;
		int var38 = buf.position * 314639891;
		buf.position += var39 * -184175589;
		int var41 = buf.position * 314639891;
		buf.position += var40 * -184175589;
		int var57 = buf.position * 314639891;
		buf.position += var34 * -184175589;
		int var58 = buf.position * 314639891;
		buf.position += var5 * -552526767;
		this.aByteArray1366 = new byte[var24];
		ByteBuf var17 = new ByteBuf(this.aByteArray1366);
		var17.putInt(1297377380);
		var17.putInt(6);
		var17.putShort(var2 > 1 ? 1 : 0);
		var17.putShort(var2);
		var17.putShort(var3);
		buf.position = var15 * -184175589;
		int var55 = 0;
		int var66 = 0;
		int var54 = 0;
		int var31 = 0;
		int var61 = 0;
		int var22 = 0;
		int var26 = 0;
		int[] var60 = new int[128];
		var21 = 0;
		int var62 = 0;

		while (var62 < var2) {
			var17.putInt(1297379947);
			var17.position += -736702356;
			int var59 = var17.position * 314639891;
			int var33 = -1;

			while (true) {
				int var63 = buf.method632();
				var17.putFlags(var63);
				int var65 = buf.payload[var37++] & 255;
				boolean var10 = var65 != var33;
				var33 = var65 & 15;
				if (var65 == 7) {
					if (var10) {
						var17.putByte(255);
					}

					var17.putByte(47);
					var17.putByte(0);
					var17.putVarInt(var17.position * 314639891 - var59);
					++var62;
					break;
				}

				if (var65 == 23) {
					if (var10) {
						var17.putByte(255);
					}

					var17.putByte(81);
					var17.putByte(3);
					var17.putByte(buf.payload[var58++]);
					var17.putByte(buf.payload[var58++]);
					var17.putByte(buf.payload[var58++]);
				} else {
					var55 ^= var65 >> 4;
					if (var33 == 0) {
						if (var10) {
							var17.putByte(144 + var55);
						}

						var66 += buf.payload[var46++];
						var54 += buf.payload[var47++];
						var17.putByte(var66 & 127);
						var17.putByte(var54 & 127);
					} else if (var33 == 1) {
						if (var10) {
							var17.putByte(128 + var55);
						}

						var66 += buf.payload[var46++];
						var31 += buf.payload[var48++];
						var17.putByte(var66 & 127);
						var17.putByte(var31 & 127);
					} else if (var33 == 2) {
						if (var10) {
							var17.putByte(176 + var55);
						}

						var21 = var21 + buf.payload[var11++] & 127;
						var17.putByte(var21);
						byte var14;
						if (var21 != 0 && var21 != 32) {
							if (var21 == 1) {
								var14 = buf.payload[var44++];
							} else if (var21 == 33) {
								var14 = buf.payload[var64++];
							} else if (var21 == 7) {
								var14 = buf.payload[var43++];
							} else if (var21 == 39) {
								var14 = buf.payload[var49++];
							} else if (var21 == 10) {
								var14 = buf.payload[var45++];
							} else if (var21 == 42) {
								var14 = buf.payload[var51++];
							} else if (var21 == 99) {
								var14 = buf.payload[var56++];
							} else if (var21 == 98) {
								var14 = buf.payload[var38++];
							} else if (var21 == 101) {
								var14 = buf.payload[var41++];
							} else if (var21 == 100) {
								var14 = buf.payload[var57++];
							} else if (var21 != 64 && var21 != 65 && var21 != 120 && var21 != 121 && var21 != 123) {
								var14 = buf.payload[var53++];
							} else {
								var14 = buf.payload[var13++];
							}
						} else {
							var14 = buf.payload[var50++];
						}

						int var67 = var14 + var60[var21];
						var60[var21] = var67;
						var17.putByte(var67 & 127);
					} else if (var33 == 3) {
						if (var10) {
							var17.putByte(224 + var55);
						}

						var61 += buf.payload[var18++];
						var61 += buf.payload[var42++] << 7;
						var17.putByte(var61 & 127);
						var17.putByte(var61 >> 7 & 127);
					} else if (var33 == 4) {
						if (var10) {
							var17.putByte(208 + var55);
						}

						var22 += buf.payload[var23++];
						var17.putByte(var22 & 127);
					} else if (var33 == 5) {
						if (var10) {
							var17.putByte(160 + var55);
						}

						var66 += buf.payload[var46++];
						var26 += buf.payload[var20++];
						var17.putByte(var66 & 127);
						var17.putByte(var26 & 127);
					} else {
						if (var33 != 6) {
							throw new RuntimeException();
						}

						if (var10) {
							var17.putByte(192 + var55);
						}

						var17.putByte(buf.payload[var50++]);
					}
				}
			}
		}

	}

	void method571() {
		this.aNodeTable1365 = null;
	}

	public static MusicFile getMusicFile(AbstractIndex index, int file, int child) {
		byte[] bytes = index.getFile(file, child);
		return bytes == null ? null : new MusicFile(new ByteBuf(bytes));
	}
}
