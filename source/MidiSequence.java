
public class MidiSequence {

	int anInt233;
	int[] anIntArray234 = new int[2];
	int anInt235;
	int anInt236;
	int anInt237 = 2;
	int anInt238;
	int anInt239;
	int anInt240;
	int anInt241;
	int anInt242;
	int[] anIntArray243 = new int[2];

	final void method123(ByteBuf var1) {
		this.anInt238 = var1.getUByte();
		this.anInt233 = var1.getInt();
		this.anInt236 = var1.getInt();
		this.method126(var1);
	}

	final void method124() {
		this.anInt239 = 0;
		this.anInt240 = 0;
		this.anInt241 = 0;
		this.anInt242 = 0;
		this.anInt235 = 0;
	}

	final int method125(int var1) {
		if (this.anInt235 >= this.anInt239) {
			this.anInt242 = this.anIntArray243[this.anInt240++] << 15;
			if (this.anInt240 >= this.anInt237) {
				this.anInt240 = this.anInt237 - 1;
			}

			this.anInt239 = (int) ((double) this.anIntArray234[this.anInt240] / 65536.0D * (double) var1);
			if (this.anInt239 > this.anInt235) {
				this.anInt241 = ((this.anIntArray243[this.anInt240] << 15) - this.anInt242)
						/ (this.anInt239 - this.anInt235);
			}
		}

		this.anInt242 += this.anInt241;
		++this.anInt235;
		return this.anInt242 - this.anInt241 >> 15;
	}

	MidiSequence() {
		this.anIntArray234[0] = 0;
		this.anIntArray234[1] = '\uffff';
		this.anIntArray243[0] = 0;
		this.anIntArray243[1] = '\uffff';
	}

	final void method126(ByteBuf var1) {
		this.anInt237 = var1.getUByte();
		this.anIntArray234 = new int[this.anInt237];
		this.anIntArray243 = new int[this.anInt237];

		for (int var2 = 0; var2 < this.anInt237; ++var2) {
			this.anIntArray234[var2] = var1.getUShort();
			this.anIntArray243[var2] = var1.getUShort();
		}

	}
}
