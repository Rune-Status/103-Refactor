import java.awt.Image;
import java.io.EOFException;
import java.io.IOException;

public final class IndexTable {

	public static AbstractProducer imageProducer;
	protected static Image dbImage;
	int maxSize = '\ufde8';
	CacheFile indexFile = null;
	CacheFile dataFile = null;
	int index;
	static byte[] aByteArray571 = new byte[520];

	public byte[] method302(int var1) {
		CacheFile var2 = this.dataFile;
		synchronized (var2) {
			Object var100001;
			try {
				if (this.indexFile.method450() < (long) (var1 * 6 + 6)) {
					var100001 = null;
					return (byte[]) var100001;
				}

				this.indexFile.seek((long) (var1 * 6));
				this.indexFile.method443(aByteArray571, 0, 6);
				int var15 = (aByteArray571[2] & 0xff) + ((aByteArray571[1] & 0xff) << 8)
						+ ((aByteArray571[0] & 0xff) << 16);
				int var4 = (aByteArray571[5] & 0xff) + ((aByteArray571[4] & 0xff) << 8)
						+ ((aByteArray571[3] & 0xff) << 16);
				if (var15 < 0 || var15 > this.maxSize) {
					var100001 = null;
					return (byte[]) var100001;
				}

				if (var4 > 0 && (long) var4 <= this.dataFile.method450() / 520L) {
					byte[] var5 = new byte[var15];
					int var6 = 0;

					for (int var10000 = 0; var6 < var15; var10000++) {
						if (var4 == 0) {
							var100001 = null;
							return (byte[]) var100001;
						}

						this.dataFile.seek((long) (var4 * 520));
						int var8 = var15 - var6;
						if (var8 > 512) {
							var8 = 512;
						}

						this.dataFile.method443(aByteArray571, 0, var8 + 8);
						int var9 = (aByteArray571[1] & 0xff) + ((aByteArray571[0] & 0xff) << 8);
						int var10 = (aByteArray571[3] & 0xff) + ((aByteArray571[2] & 0xff) << 8);
						int var11 = ((aByteArray571[5] & 0xff) << 8) + ((aByteArray571[4] & 0xff) << 16)
								+ (aByteArray571[6] & 0xff);
						int var12 = aByteArray571[7] & 0xff;
						if (var9 != var1 || var10000 != var10 || this.index != var12) {
							var100001 = null;
							return (byte[]) var100001;
						}

						if (var11 < 0 || (long) var11 > this.dataFile.method450() / 520L) {
							var100001 = null;
							return (byte[]) var100001;
						}

						for (int var13 = 0; var13 < var8; var13++) {
							var5[var6++] = aByteArray571[var13 + 8];
						}

						var4 = var11;
					}

					byte[] var18 = var5;
					return var18;
				}

				var100001 = null;
			} catch (IOException var16) {
				return null;
			}

			return (byte[]) var100001;
		}
	}

	public boolean method303(int var1, byte[] var2, int var3) {
		CacheFile var4 = this.dataFile;
		synchronized (var4) {
			if (var3 >= 0 && var3 <= this.maxSize) {
				boolean var5 = this.method305(var1, var2, var3, true);
				if (!var5) {
					var5 = this.method305(var1, var2, var3, false);
				}

				return var5;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	static final int hsl24to16(int hue, int saturation, int lightness) {
		if (lightness > 179) {
			saturation /= 2;
		}

		if (lightness > 192) {
			saturation /= 2;
		}

		if (lightness > 217) {
			saturation /= 2;
		}

		if (lightness > 243) {
			saturation /= 2;
		}

		return lightness / 2 + (saturation / 32 << 7) + (hue / 4 << 10);
	}

	public IndexTable(int var1, CacheFile var2, CacheFile var3, int var4) {
		this.index = var1;
		this.dataFile = var2;
		this.indexFile = var3;
		this.maxSize = var4;
	}

	boolean method305(int var1, byte[] var2, int var3, boolean var4) {
		CacheFile var5 = this.dataFile;
		synchronized (var5) {
			try {
				int var15;
				boolean var100001;
				if (var4) {
					if (this.indexFile.method450() < (long) (var1 * 6 + 6)) {
						var100001 = false;
						return var100001;
					}

					this.indexFile.seek((long) (var1 * 6));
					this.indexFile.method443(aByteArray571, 0, 6);
					var15 = (aByteArray571[5] & 0xff) + ((aByteArray571[4] & 0xff) << 8)
							+ ((aByteArray571[3] & 0xff) << 16);
					if (var15 <= 0 || (long) var15 > this.dataFile.method450() / 520L) {
						var100001 = false;
						return var100001;
					}
				} else {
					var15 = (int) ((this.dataFile.method450() + 519L) / 520L);
					if (var15 == 0) {
						var15 = 1;
					}
				}

				aByteArray571[0] = (byte) (var3 >> 16);
				aByteArray571[1] = (byte) (var3 >> 8);
				aByteArray571[2] = (byte) var3;
				aByteArray571[3] = (byte) (var15 >> 16);
				aByteArray571[4] = (byte) (var15 >> 8);
				aByteArray571[5] = (byte) var15;
				this.indexFile.seek((long) (var1 * 6));
				this.indexFile.write(aByteArray571, 0, 6);
				int var7 = 0;
				int var8 = 0;

				while (true) {
					if (var7 < var3) {
						label130: {
							int var9 = 0;
							int var10;
							if (var4) {
								this.dataFile.seek((long) (var15 * 520));

								try {
									this.dataFile.method443(aByteArray571, 0, 8);
								} catch (EOFException var16) {
									break label130;
								}

								var10 = ((aByteArray571[0] & 0xff) << 8) + (aByteArray571[1] & 0xff);
								int var11 = ((aByteArray571[2] & 0xff) << 8) + (aByteArray571[3] & 0xff);
								var9 = (aByteArray571[6] & 0xff) + ((aByteArray571[4] & 0xff) << 16)
										+ ((aByteArray571[5] & 0xff) << 8);
								int var12 = aByteArray571[7] & 0xff;
								if (var1 != var10 || var11 != var8 || this.index != var12) {
									var100001 = false;
									return var100001;
								}

								if (var9 < 0 || (long) var9 > this.dataFile.method450() / 520L) {
									var100001 = false;
									return var100001;
								}
							}

							if (var9 == 0) {
								var4 = false;
								var9 = (int) ((this.dataFile.method450() + 519L) / 520L);
								if (var9 == 0) {
									++var9;
								}

								if (var9 == var15) {
									++var9;
								}
							}

							if (var3 - var7 <= 512) {
								var9 = 0;
							}

							aByteArray571[0] = (byte) (var1 >> 8);
							aByteArray571[1] = (byte) var1;
							aByteArray571[2] = (byte) (var8 >> 8);
							aByteArray571[3] = (byte) var8;
							aByteArray571[4] = (byte) (var9 >> 16);
							aByteArray571[5] = (byte) (var9 >> 8);
							aByteArray571[6] = (byte) var9;
							aByteArray571[7] = (byte) this.index;
							this.dataFile.seek((long) (var15 * 520));
							this.dataFile.write(aByteArray571, 0, 8);
							var10 = var3 - var7;
							if (var10 > 512) {
								var10 = 512;
							}

							this.dataFile.write(var2, var7, var10);
							var7 += var10;
							var15 = var9;
							++var8;
							continue;
						}
					}

					boolean var10000 = true;
					return var10000;
				}
			} catch (IOException var17) {
				return false;
			}
		}
	}

	public static IndexedSprite method306(AbstractIndex var0, int var1) {
		byte[] var2 = var0.method378(var1);
		boolean var3;
		if (var2 != null) {
			Player.decodeSprite(var2);
			var3 = true;
		} else {
			var3 = false;
		}

		return !var3 ? null : BoundaryStub.set();
	}

}
