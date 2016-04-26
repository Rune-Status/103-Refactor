import java.io.EOFException;
import java.io.IOException;

public class CacheFile {

	long aLong810;
	long position;
	long aLong816;
	int anInt807 = 0;
	long length;
	long aLong815 = -1L;
	long aLong809 = -1L;
	CacheFileAccessor aClass126_817;
	byte[] readPayload;
	byte[] writePayload;
	int anInt811;

	public void method443(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (this.aLong815 != -1L && this.position >= this.aLong815
					&& this.position + (long) var3 <= this.aLong815 + (long) this.anInt807) {
				System.arraycopy(this.writePayload, (int) (this.position - this.aLong815), var1, var2, var3);
				this.position += (long) var3;
				return;
			}

			long var15 = this.position;
			int var7 = var3;
			int var8;
			if (this.position >= this.aLong809 && this.position < (long) this.anInt811 + this.aLong809) {
				var8 = (int) ((long) this.anInt811 - (this.position - this.aLong809));
				if (var8 > var3) {
					var8 = var3;
				}

				System.arraycopy(this.readPayload, (int) (this.position - this.aLong809), var1, var2, var8);
				this.position += (long) var8;
				var2 += var8;
				var3 -= var8;
			}

			if (var3 > this.readPayload.length) {
				this.aClass126_817.seek(this.position);

				for (this.aLong810 = this.position; var3 > 0; var3 -= var8) {
					var8 = this.aClass126_817.read(var1, var2, var3);
					if (var8 == -1) {
						break;
					}

					this.aLong810 += (long) var8;
					this.position += (long) var8;
					var2 += var8;
				}
			} else if (var3 > 0) {
				this.method447();
				var8 = var3;
				if (var3 > this.anInt811) {
					var8 = this.anInt811;
				}

				System.arraycopy(this.readPayload, 0, var1, var2, var8);
				var2 += var8;
				var3 -= var8;
				this.position += (long) var8;
			}

			if (this.aLong815 != -1L) {
				if (this.aLong815 > this.position && var3 > 0) {
					var8 = (int) (this.aLong815 - this.position) + var2;
					if (var8 > var2 + var3) {
						var8 = var2 + var3;
					}

					while (var2 < var8) {
						var1[var2++] = 0;
						--var3;
						++this.position;
					}
				}

				long var9 = -1L;
				long var11 = -1L;
				if (this.aLong815 >= var15 && this.aLong815 < (long) var7 + var15) {
					var9 = this.aLong815;
				} else if (var15 >= this.aLong815 && var15 < this.aLong815 + (long) this.anInt807) {
					var9 = var15;
				}

				if (this.aLong815 + (long) this.anInt807 > var15
						&& this.aLong815 + (long) this.anInt807 <= (long) var7 + var15) {
					var11 = this.aLong815 + (long) this.anInt807;
				} else if ((long) var7 + var15 > this.aLong815
						&& (long) var7 + var15 <= (long) this.anInt807 + this.aLong815) {
					var11 = (long) var7 + var15;
				}

				if (var9 > -1L && var11 > var9) {
					int var13 = (int) (var11 - var9);
					System.arraycopy(this.writePayload, (int) (var9 - this.aLong815), var1, (int) (var9 - var15) + var2,
							var13);
					if (var11 > this.position) {
						var3 = (int) ((long) var3 - (var11 - this.position));
						this.position = var11;
					}
				}
			}
		} catch (IOException var131) {
			this.aLong810 = -1L;
			throw var131;
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
			if ((long) var3 + this.position > this.aLong816) {
				this.aLong816 = (long) var3 + this.position;
			}

			if (this.aLong815 != -1L
					&& (this.position < this.aLong815 || this.position > (long) this.anInt807 + this.aLong815)) {
				this.method449();
			}

			if (this.aLong815 != -1L && (long) var3 + this.position > this.aLong815 + (long) this.writePayload.length) {
				int var10 = (int) ((long) this.writePayload.length - (this.position - this.aLong815));
				System.arraycopy(var1, var2, this.writePayload, (int) (this.position - this.aLong815), var10);
				this.position += (long) var10;
				var2 += var10;
				var3 -= var10;
				this.anInt807 = this.writePayload.length;
				this.method449();
			}

			if (var3 <= this.writePayload.length) {
				if (var3 > 0) {
					if (this.aLong815 == -1L) {
						this.aLong815 = this.position;
					}

					System.arraycopy(var1, var2, this.writePayload, (int) (this.position - this.aLong815), var3);
					this.position += (long) var3;
					if (this.position - this.aLong815 > (long) this.anInt807) {
						this.anInt807 = (int) (this.position - this.aLong815);
					}
				}
			} else {
				if (this.aLong810 != this.position) {
					this.aClass126_817.seek(this.position);
					this.aLong810 = this.position;
				}

				this.aClass126_817.write(var1, var2, var3);
				this.aLong810 += (long) var3;
				if (this.aLong810 > this.length) {
					this.length = this.aLong810;
				}

				long var101 = -1L;
				long var7 = -1L;
				if (this.position >= this.aLong809 && this.position < this.aLong809 + (long) this.anInt811) {
					var101 = this.position;
				} else if (this.aLong809 >= this.position && this.aLong809 < (long) var3 + this.position) {
					var101 = this.aLong809;
				}

				if ((long) var3 + this.position > this.aLong809
						&& this.position + (long) var3 <= (long) this.anInt811 + this.aLong809) {
					var7 = (long) var3 + this.position;
				} else if (this.aLong809 + (long) this.anInt811 > this.position
						&& this.aLong809 + (long) this.anInt811 <= (long) var3 + this.position) {
					var7 = (long) this.anInt811 + this.aLong809;
				}

				if (var101 > -1L && var7 > var101) {
					int var9 = (int) (var7 - var101);
					System.arraycopy(var1, (int) ((long) var2 + var101 - this.position), this.readPayload,
							(int) (var101 - this.aLong809), var9);
				}

				this.position += (long) var3;
			}

		} catch (IOException var91) {
			this.aLong810 = -1L;
			throw var91;
		}
	}

	public CacheFile(CacheFileAccessor accessor, int readSize, int writeSize) throws IOException {
		this.aClass126_817 = accessor;
		this.aLong816 = this.length = accessor.length();
		this.readPayload = new byte[readSize];
		this.writePayload = new byte[writeSize];
		this.position = 0L;
	}

	public void read(byte[] var1) throws IOException {
		this.method443(var1, 0, var1.length);
	}

	void method447() throws IOException {
		this.anInt811 = 0;
		if (this.aLong810 != this.position) {
			this.aClass126_817.seek(this.position);
			this.aLong810 = this.position;
		}

		int var1;
		for (this.aLong809 = this.position; this.anInt811 < this.readPayload.length; this.anInt811 += var1) {
			var1 = this.aClass126_817.read(this.readPayload, this.anInt811, this.readPayload.length - this.anInt811);
			if (var1 == -1) {
				break;
			}

			this.aLong810 += (long) var1;
		}

	}

	public void seek(long var1) throws IOException {
		if (var1 >= 0L) {
			this.position = var1;
		} else {
			throw new IOException("");
		}
	}

	void method449() throws IOException {
		if (this.aLong815 != -1L) {
			if (this.aLong810 != this.aLong815) {
				this.aClass126_817.seek(this.aLong815);
				this.aLong810 = this.aLong815;
			}

			this.aClass126_817.write(this.writePayload, 0, this.anInt807);
			this.aLong810 += (long) this.anInt807;
			if (this.aLong810 > this.length) {
				this.length = this.aLong810;
			}

			long var1 = -1L;
			long var3 = -1L;
			if (this.aLong815 >= this.aLong809 && this.aLong815 < this.aLong809 + (long) this.anInt811) {
				var1 = this.aLong815;
			} else if (this.aLong809 >= this.aLong815 && this.aLong809 < this.aLong815 + (long) this.anInt807) {
				var1 = this.aLong809;
			}

			if ((long) this.anInt807 + this.aLong815 > this.aLong809
					&& (long) this.anInt807 + this.aLong815 <= this.aLong809 + (long) this.anInt811) {
				var3 = (long) this.anInt807 + this.aLong815;
			} else if (this.aLong809 + (long) this.anInt811 > this.aLong815
					&& (long) this.anInt811 + this.aLong809 <= this.aLong815 + (long) this.anInt807) {
				var3 = (long) this.anInt811 + this.aLong809;
			}

			if (var1 > -1L && var3 > var1) {
				int var5 = (int) (var3 - var1);
				System.arraycopy(this.writePayload, (int) (var1 - this.aLong815), this.readPayload,
						(int) (var1 - this.aLong809), var5);
			}

			this.aLong815 = -1L;
			this.anInt807 = 0;
		}

	}

	public long method450() {
		return this.aLong816;
	}

}
