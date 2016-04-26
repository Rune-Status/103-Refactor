public class Huffman {

	static long aLong449;
	int[] masks;
	byte[] bits;
	int[] keys;

	public Huffman(byte[] bytes) {
		this.masks = new int[bytes.length];
		this.bits = bytes;
		int[] var5 = new int[33];
		this.keys = new int[8];
		int var7 = 0;

		for (int offset = 0; offset < bytes.length; offset++) {
			byte val = bytes[offset];
			if (val != 0) {
				int var11 = 1 << 32 - val;
				int var9 = var5[val];
				this.masks[offset] = var9;
				int var2;
				int var3;
				int var12;
				int var13;
				if ((var9 & var11) != 0) {
					var12 = var5[val - 1];
				} else {
					var12 = var9 | var11;

					for (var2 = val - 1; var2 >= 1; --var2) {
						var13 = var5[var2];
						if (var13 != var9) {
							break;
						}

						var3 = 1 << 32 - var2;
						if ((var13 & var3) != 0) {
							var5[var2] = var5[var2 - 1];
							break;
						}

						var5[var2] = var13 | var3;
					}
				}

				var5[val] = var12;

				for (var2 = val + 1; var2 <= 32; var2++) {
					if (var5[var2] == var9) {
						var5[var2] = var12;
					}
				}

				var2 = 0;

				for (var13 = 0; var13 < val; var13++) {
					var3 = Integer.MIN_VALUE >>> var13;
					if ((var9 & var3) != 0) {
						if (this.keys[var2] == 0) {
							this.keys[var2] = var7;
						}

						var2 = this.keys[var2];
					} else {
						++var2;
					}

					if (var2 >= this.keys.length) {
						int[] var10 = new int[this.keys.length * 2];

						for (int var14 = 0; var14 < this.keys.length; var14++) {
							var10[var14] = this.keys[var14];
						}

						this.keys = var10;
					}

					var3 >>>= 1;
				}

				this.keys[var2] = ~offset;
				if (var2 >= var7) {
					var7 = var2 + 1;
				}
			}
		}

	}

	public int decompress(byte[] src, int srcOff, byte[] dest, int destOff, int destLen) {
		if (destLen == 0) {
			return 0;
		} else {
			int key = 0;
			destLen += destOff;
			int offset = srcOff;

			while (true) {
				byte b = src[offset];
				if (b < 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				int val;
				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				if ((b & 0x40) != 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				if ((b & 0x20) != 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				if ((b & 0x10) != 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				if ((b & 0x8) != 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				if ((b & 0x4) != 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				if ((b & 0x2) != 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				if ((b & 0x1) != 0) {
					key = this.keys[key];
				} else {
					++key;
				}

				if ((val = this.keys[key]) < 0) {
					dest[destOff++] = (byte) (~val);
					if (destOff >= destLen) {
						break;
					}

					key = 0;
				}

				++offset;
			}

			return offset + 1 - srcOff;
		}
	}

	public int compress(byte[] src, int srcOff, int srcLen, byte[] dest, int destOff) {
		int key = 0;
		int bytePos = destOff << 3;

		for (srcLen += srcOff; srcOff < srcLen; srcOff++) {
			int val = src[srcOff] & 0xff;
			int mask = this.masks[val];
			byte bitSize = this.bits[val];
			if (bitSize == 0) {
				throw new RuntimeException("");
			}

			int offset = bytePos >> 3;
			int remaining = bytePos & 0x7;
			key &= -remaining >> 31;
			int var8 = (bitSize + remaining - 1 >> 3) + offset;
			remaining += 24;
			dest[offset] = (byte) (key |= mask >>> remaining);
			if (offset < var8) {
				++offset;
				remaining -= 8;
				dest[offset] = (byte) (key = mask >>> remaining);
				if (offset < var8) {
					++offset;
					remaining -= 8;
					dest[offset] = (byte) (key = mask >>> remaining);
					if (offset < var8) {
						++offset;
						remaining -= 8;
						dest[offset] = (byte) (key = mask >>> remaining);
						if (offset < var8) {
							++offset;
							remaining -= 8;
							dest[offset] = (byte) (key = mask << -remaining);
						}
					}
				}
			}

			bytePos += bitSize;
		}

		return (bytePos + 7 >> 3) - destOff;
	}

}
