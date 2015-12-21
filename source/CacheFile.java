import java.io.EOFException;
import java.io.IOException;

public class CacheFile {

	int anInt807 = 0;
	byte[] aByteArray808;
	long aLong809 = 5253023908969503755L;
	long aLong810;
	int anInt811;
	byte[] aByteArray812;
	long aLong813;
	long aLong814;
	long aLong815 = -5097607827615164521L;
	long aLong816;
	CacheFileAccessor aClass126_817;

	public void method443(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (-1L != -2285779735292712999L * this.aLong815
					&& -8326374793673939791L * this.aLong814 >= this.aLong815 * -2285779735292712999L
					&& -8326374793673939791L * this.aLong814 + (long) var3 <= -2285779735292712999L * this.aLong815
							+ (long) (this.anInt807 * 183200453)) {
				System.arraycopy(this.aByteArray812,
						(int) (this.aLong814 * -8326374793673939791L - this.aLong815 * -2285779735292712999L), var1,
						var2, var3);
				this.aLong814 += (long) var3 * -5616494910779726767L;
				return;
			}

			long var4 = this.aLong814 * -8326374793673939791L;
			int var7 = var3;
			int var8;
			if (this.aLong814 * -8326374793673939791L >= this.aLong809 * 5978608391698526301L
					&& this.aLong814 * -8326374793673939791L < (long) (this.anInt811 * -293863773)
							+ this.aLong809 * 5978608391698526301L) {
				var8 = (int) ((long) (-293863773 * this.anInt811)
						- (this.aLong814 * -8326374793673939791L - 5978608391698526301L * this.aLong809));
				if (var8 > var3) {
					var8 = var3;
				}

				System.arraycopy(this.aByteArray808,
						(int) (this.aLong814 * -8326374793673939791L - 5978608391698526301L * this.aLong809), var1,
						var2, var8);
				this.aLong814 += -5616494910779726767L * (long) var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > this.aByteArray808.length) {
				this.aClass126_817.seek(-8326374793673939791L * this.aLong814);

				for (this.aLong810 = this.aLong814 * 1575725130253279575L; var3 > 0; var3 -= var8) {
					var8 = this.aClass126_817.read(var1, var2, var3);
					if (var8 == -1) {
						break;
					}

					this.aLong810 += -7398757543161329529L * (long) var8;
					this.aLong814 += (long) var8 * -5616494910779726767L;
					var2 += var8;
				}
			} else if (var3 > 0) {
				this.method447();
				var8 = var3;
				if (var3 > this.anInt811 * -293863773) {
					var8 = -293863773 * this.anInt811;
				}

				System.arraycopy(this.aByteArray808, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				this.aLong814 += -5616494910779726767L * (long) var8;
			}

			if (-1L != this.aLong815 * -2285779735292712999L) {
				if (this.aLong815 * -2285779735292712999L > this.aLong814 * -8326374793673939791L && var3 > 0) {
					var8 = (int) (this.aLong815 * -2285779735292712999L - -8326374793673939791L * this.aLong814) + var2;
					if (var8 > var2 + var3) {
						var8 = var2 + var3;
					}

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						this.aLong814 += -5616494910779726767L;
					}
				}

				long var9 = -1L;
				long var11 = -1L;
				if (-2285779735292712999L * this.aLong815 >= var4
						&& -2285779735292712999L * this.aLong815 < (long) var7 + var4) {
					var9 = this.aLong815 * -2285779735292712999L;
				} else if (var4 >= -2285779735292712999L * this.aLong815
						&& var4 < this.aLong815 * -2285779735292712999L + (long) (183200453 * this.anInt807)) {
					var9 = var4;
				}

				if (-2285779735292712999L * this.aLong815 + (long) (183200453 * this.anInt807) > var4
						&& this.aLong815 * -2285779735292712999L + (long) (this.anInt807 * 183200453) <= var4
								+ (long) var7) {
					var11 = this.aLong815 * -2285779735292712999L + (long) (this.anInt807 * 183200453);
				} else if ((long) var7 + var4 > this.aLong815 * -2285779735292712999L && (long) var7
						+ var4 <= (long) (183200453 * this.anInt807) + -2285779735292712999L * this.aLong815) {
					var11 = (long) var7 + var4;
				}

				if (var9 > -1L && var11 > var9) {
					int var13 = (int) (var11 - var9);
					System.arraycopy(this.aByteArray812, (int) (var9 - this.aLong815 * -2285779735292712999L), var1,
							(int) (var9 - var4) + var2, var13);
					if (var11 > this.aLong814 * -8326374793673939791L) {
						var3 = (int) ((long) var3 - (var11 - -8326374793673939791L * this.aLong814));
						this.aLong814 = var11 * -5616494910779726767L;
					}
				}
			}
		} catch (IOException var15) {
			this.aLong810 = 7398757543161329529L;
			throw var15;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	public void method444() throws IOException {
		this.method449();
		this.aClass126_817.close();
	}

	public void write(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long) var3 + this.aLong814 * -8326374793673939791L > this.aLong816 * -6553346398192807047L) {
				this.aLong816 = -6892656516173322551L * ((long) var3 + this.aLong814 * -8326374793673939791L);
			}

			if (-1L != this.aLong815 * -2285779735292712999L
					&& (-8326374793673939791L * this.aLong814 < -2285779735292712999L * this.aLong815
							|| this.aLong814 * -8326374793673939791L > (long) (183200453 * this.anInt807)
									+ this.aLong815 * -2285779735292712999L)) {
				this.method449();
			}

			if (-1L != this.aLong815 * -2285779735292712999L
					&& (long) var3 + this.aLong814 * -8326374793673939791L > this.aLong815 * -2285779735292712999L
							+ (long) this.aByteArray812.length) {
				int var4 = (int) ((long) this.aByteArray812.length
						- (this.aLong814 * -8326374793673939791L - this.aLong815 * -2285779735292712999L));
				System.arraycopy(var1, var2, this.aByteArray812,
						(int) (-8326374793673939791L * this.aLong814 - this.aLong815 * -2285779735292712999L), var4);
				this.aLong814 += -5616494910779726767L * (long) var4;
				var2 += var4;
				var3 -= var4;
				this.anInt807 = this.aByteArray812.length * -1159298035;
				this.method449();
			}

			if (var3 <= this.aByteArray812.length) {
				if (var3 > 0) {
					if (-2285779735292712999L * this.aLong815 == -1L) {
						this.aLong815 = -5837336162449394535L * this.aLong814;
					}

					System.arraycopy(var1, var2, this.aByteArray812,
							(int) (this.aLong814 * -8326374793673939791L - this.aLong815 * -2285779735292712999L),
							var3);
					this.aLong814 += -5616494910779726767L * (long) var3;
					if (this.aLong814 * -8326374793673939791L
							- this.aLong815 * -2285779735292712999L > (long) (this.anInt807 * 183200453)) {
						this.anInt807 = (int) (-8326374793673939791L * this.aLong814
								- this.aLong815 * -2285779735292712999L) * -1159298035;
					}

				}
			} else {
				if (-4876416496348054217L * this.aLong810 != -8326374793673939791L * this.aLong814) {
					this.aClass126_817.seek(this.aLong814 * -8326374793673939791L);
					this.aLong810 = 1575725130253279575L * this.aLong814;
				}

				this.aClass126_817.write(var1, var2, var3);
				this.aLong810 += -7398757543161329529L * (long) var3;
				if (-4876416496348054217L * this.aLong810 > 182354950301920001L * this.aLong813) {
					this.aLong813 = 2869469855561285687L * this.aLong810;
				}

				long var5 = -1L;
				long var7 = -1L;
				if (-8326374793673939791L * this.aLong814 >= 5978608391698526301L * this.aLong809
						&& -8326374793673939791L * this.aLong814 < 5978608391698526301L * this.aLong809
								+ (long) (-293863773 * this.anInt811)) {
					var5 = this.aLong814 * -8326374793673939791L;
				} else if (5978608391698526301L * this.aLong809 >= -8326374793673939791L * this.aLong814
						&& this.aLong809 * 5978608391698526301L < (long) var3 + -8326374793673939791L * this.aLong814) {
					var5 = 5978608391698526301L * this.aLong809;
				}

				if ((long) var3 + -8326374793673939791L * this.aLong814 > 5978608391698526301L * this.aLong809
						&& -8326374793673939791L * this.aLong814 + (long) var3 <= (long) (-293863773 * this.anInt811)
								+ this.aLong809 * 5978608391698526301L) {
					var7 = (long) var3 + this.aLong814 * -8326374793673939791L;
				} else if (this.aLong809 * 5978608391698526301L
						+ (long) (this.anInt811 * -293863773) > -8326374793673939791L * this.aLong814
						&& this.aLong809 * 5978608391698526301L + (long) (-293863773 * this.anInt811) <= (long) var3
								+ -8326374793673939791L * this.aLong814) {
					var7 = (long) (-293863773 * this.anInt811) + 5978608391698526301L * this.aLong809;
				}

				if (var5 > -1L && var7 > var5) {
					int var9 = (int) (var7 - var5);
					System.arraycopy(var1, (int) (var5 + (long) var2 - this.aLong814 * -8326374793673939791L),
							this.aByteArray808, (int) (var5 - this.aLong809 * 5978608391698526301L), var9);
				}

				this.aLong814 += (long) var3 * -5616494910779726767L;
			}
		} catch (IOException var10) {
			this.aLong810 = 7398757543161329529L;
			throw var10;
		}
	}

	public CacheFile(CacheFileAccessor var1, int var2, int var3) throws IOException {
		this.aClass126_817 = var1;
		this.aLong816 = (this.aLong813 = var1.length() * -5755731196710398719L) * -9096814420392384055L;
		this.aByteArray808 = new byte[var2];
		this.aByteArray812 = new byte[var3];
		this.aLong814 = 0L;
	}

	public void read(byte[] var1) throws IOException {
		this.method443(var1, 0, var1.length);
	}

	void method447() throws IOException {
		this.anInt811 = 0;
		if (-4876416496348054217L * this.aLong810 != this.aLong814 * -8326374793673939791L) {
			this.aClass126_817.seek(this.aLong814 * -8326374793673939791L);
			this.aLong810 = this.aLong814 * 1575725130253279575L;
		}

		int var1;
		for (this.aLong809 = this.aLong814 * 3944497200042446949L; this.anInt811
				* -293863773 < this.aByteArray808.length; this.anInt811 += 235906315 * var1) {
			var1 = this.aClass126_817.read(this.aByteArray808, this.anInt811 * -293863773,
					this.aByteArray808.length - this.anInt811 * -293863773);
			if (var1 == -1) {
				break;
			}

			this.aLong810 += (long) var1 * -7398757543161329529L;
		}

	}

	public void seek(long var1) throws IOException {
		if (var1 >= 0L) {
			this.aLong814 = -5616494910779726767L * var1;
		} else {
			throw new IOException("");
		}
	}

	void method449() throws IOException {
		if (-1L != this.aLong815 * -2285779735292712999L) {
			if (this.aLong810 * -4876416496348054217L != -2285779735292712999L * this.aLong815) {
				this.aClass126_817.seek(-2285779735292712999L * this.aLong815);
				this.aLong810 = -5602583930400994449L * this.aLong815;
			}

			this.aClass126_817.write(this.aByteArray812, 0, 183200453 * this.anInt807);
			this.aLong810 += (long) this.anInt807 * 8285643226346288611L;
			if (-4876416496348054217L * this.aLong810 > 182354950301920001L * this.aLong813) {
				this.aLong813 = 2869469855561285687L * this.aLong810;
			}

			long var1 = -1L;
			long var3 = -1L;
			if (-2285779735292712999L * this.aLong815 >= this.aLong809 * 5978608391698526301L
					&& this.aLong815 * -2285779735292712999L < this.aLong809 * 5978608391698526301L
							+ (long) (this.anInt811 * -293863773)) {
				var1 = this.aLong815 * -2285779735292712999L;
			} else if (this.aLong809 * 5978608391698526301L >= this.aLong815 * -2285779735292712999L
					&& 5978608391698526301L * this.aLong809 < this.aLong815 * -2285779735292712999L
							+ (long) (183200453 * this.anInt807)) {
				var1 = 5978608391698526301L * this.aLong809;
			}

			if ((long) (183200453 * this.anInt807) + -2285779735292712999L * this.aLong815 > 5978608391698526301L
					* this.aLong809
					&& (long) (183200453 * this.anInt807)
							+ -2285779735292712999L * this.aLong815 <= 5978608391698526301L * this.aLong809
									+ (long) (-293863773 * this.anInt811)) {
				var3 = (long) (this.anInt807 * 183200453) + -2285779735292712999L * this.aLong815;
			} else if (5978608391698526301L * this.aLong809
					+ (long) (this.anInt811 * -293863773) > -2285779735292712999L * this.aLong815
					&& (long) (-293863773 * this.anInt811)
							+ 5978608391698526301L * this.aLong809 <= -2285779735292712999L * this.aLong815
									+ (long) (183200453 * this.anInt807)) {
				var3 = (long) (this.anInt811 * -293863773) + 5978608391698526301L * this.aLong809;
			}

			if (var1 > -1L && var3 > var1) {
				int var5 = (int) (var3 - var1);
				System.arraycopy(this.aByteArray812, (int) (var1 - this.aLong815 * -2285779735292712999L),
						this.aByteArray808, (int) (var1 - 5978608391698526301L * this.aLong809), var5);
			}

			this.aLong815 = -5097607827615164521L;
			this.anInt807 = 0;
		}

	}

	public long method450() {
		return this.aLong816 * -6553346398192807047L;
	}
}
