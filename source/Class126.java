import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class126 {

	RandomAccessFile aRandomAccessFile833;
	long aLong834;
	long aLong835;
	protected static int anInt836;

	final void method456(long var1) throws IOException {
		this.aRandomAccessFile833.seek(var1);
		this.aLong835 = var1 * 7395148145892317065L;
	}

	public final int method457(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.aRandomAccessFile833.read(var1, var2, var3);
		if (var4 > 0) {
			this.aLong835 += (long) var4 * 7395148145892317065L;
		}

		return var4;
	}

	public final long method458() throws IOException {
		return this.aRandomAccessFile833.length();
	}

	public Class126(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() >= var3) {
			var1.delete();
		}

		this.aRandomAccessFile833 = new RandomAccessFile(var1, var2);
		this.aLong834 = var3 * -4964951671876364163L;
		this.aLong835 = 0L;
		int var5 = this.aRandomAccessFile833.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.aRandomAccessFile833.seek(0L);
			this.aRandomAccessFile833.write(var5);
		}

		this.aRandomAccessFile833.seek(0L);
	}

	public final void method459() throws IOException {
		if (this.aRandomAccessFile833 != null) {
			this.aRandomAccessFile833.close();
			this.aRandomAccessFile833 = null;
		}

	}

	public final void method460(byte[] var1, int var2, int var3) throws IOException {
		if ((long) var3 + this.aLong835 * -5122398371314086215L > 2578186986756399317L * this.aLong834) {
			this.aRandomAccessFile833.seek(2578186986756399317L * this.aLong834 + 1L);
			this.aRandomAccessFile833.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile833.write(var1, var2, var3);
			this.aLong835 += (long) var3 * 7395148145892317065L;
		}
	}
}
