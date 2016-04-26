public class Class80 {

	int anInt657;
	int anInt661;
	int[] anIntArray660;
	long aLong665;
	int[] anIntArray658;
	int[] anIntArray659;
	int[] anIntArray664;
	ByteBuf aBuffer662 = new ByteBuf((byte[]) null);
	static byte[] aByteArray663 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0,
			(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
			(byte) 0 };

	void method346(byte[] var1) {
		this.aBuffer662.payload = var1;
		this.aBuffer662.position = 10;
		int var3 = this.aBuffer662.getUShort();
		this.anInt657 = this.aBuffer662.getUShort();
		this.anInt661 = 500000;
		this.anIntArray660 = new int[var3];

		int var2;
		int var5;
		for (var5 = 0; var5 < var3; this.aBuffer662.position += var2) {
			int var4 = this.aBuffer662.getInt();
			var2 = this.aBuffer662.getInt();
			if (var4 == 1297379947) {
				this.anIntArray660[var5] = this.aBuffer662.position;
				++var5;
			}
		}

		this.aLong665 = 0L;
		this.anIntArray658 = new int[var3];

		for (var5 = 0; var5 < var3; var5++) {
			this.anIntArray658[var5] = this.anIntArray660[var5];
		}

		this.anIntArray659 = new int[var3];
		this.anIntArray664 = new int[var3];
	}

	void method347() {
		this.aBuffer662.payload = null;
		this.anIntArray660 = null;
		this.anIntArray658 = null;
		this.anIntArray659 = null;
		this.anIntArray664 = null;
	}

	int method348() {
		return this.anIntArray658.length;
	}

	void method349(int var1) {
		this.aBuffer662.position = this.anIntArray658[var1];
	}

	void method350(int var1) {
		this.anIntArray658[var1] = this.aBuffer662.position;
	}

	Class80() {
	}

	int method351(int var1) {
		byte var2 = this.aBuffer662.payload[this.aBuffer662.position];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 0xff;
			this.anIntArray664[var1] = var5;
			++this.aBuffer662.position;
		} else {
			var5 = this.anIntArray664[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method358(var1, var5);
		} else {
			int var4 = this.aBuffer662.getVarLen();
			if (var5 == 247 && var4 > 0) {
				int var3 = this.aBuffer662.payload[this.aBuffer662.position] & 0xff;
				if (var3 >= 241 && var3 <= 243 || var3 == 246 || var3 == 248 || var3 >= 250 && var3 <= 252
						|| var3 == 254) {
					++this.aBuffer662.position;
					this.anIntArray664[var1] = var3;
					return this.method358(var1, var3);
				}
			}

			this.aBuffer662.position += var4;
			return 0;
		}
	}

	long method352(int var1) {
		return this.aLong665 + (long) var1 * (long) this.anInt661;
	}

	int method353() {
		int var1 = this.anIntArray658.length;
		int var3 = -1;
		int var2 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; var4++) {
			if (this.anIntArray658[var4] >= 0 && this.anIntArray659[var4] < var2) {
				var3 = var4;
				var2 = this.anIntArray659[var4];
			}
		}

		return var3;
	}

	void method354(long var1) {
		this.aLong665 = var1;
		int var4 = this.anIntArray658.length;

		for (int var3 = 0; var3 < var4; var3++) {
			this.anIntArray659[var3] = 0;
			this.anIntArray664[var3] = 0;
			this.aBuffer662.position = this.anIntArray660[var3];
			this.method360(var3);
			this.anIntArray658[var3] = this.aBuffer662.position;
		}

	}

	boolean method355() {
		int var1 = this.anIntArray658.length;

		for (int var2 = 0; var2 < var1; var2++) {
			if (this.anIntArray658[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	int method356(int var1) {
		int var2 = this.method351(var1);
		return var2;
	}

	boolean method357() {
		return this.aBuffer662.payload != null;
	}

	int method358(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var31 = this.aBuffer662.getUByte();
			var4 = this.aBuffer662.getVarLen();
			if (var31 == 47) {
				this.aBuffer662.position += var4;
				return 1;
			} else if (var31 == 81) {
				int var6 = this.aBuffer662.getMedium();
				var4 -= 3;
				int var5 = this.anIntArray659[var1];
				this.aLong665 += (long) var5 * (long) (this.anInt661 - var6);
				this.anInt661 = var6;
				this.aBuffer662.position += var4;
				return 2;
			} else {
				this.aBuffer662.position += var4;
				return 3;
			}
		} else {
			byte var3 = aByteArray663[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = this.aBuffer662.getUByte() << 8 | var2;
			}

			if (var3 >= 2) {
				var4 |= this.aBuffer662.getUByte() << 16;
			}

			return var4;
		}
	}

	Class80(byte[] var1) {
		this.method346(var1);
	}

	void method359() {
		this.aBuffer662.position = -1;
	}

	void method360(int var1) {
		int var2 = this.aBuffer662.getVarLen();
		this.anIntArray659[var1] += var2;
	}

}
