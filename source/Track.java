public class Track {

	Synthesizer[] synthesizers = new Synthesizer[10];
	int loopStart;
	int loopEnd;

	public static Track getTrack(AbstractIndex index, int file, int child) {
		byte[] b = index.getFile(file, child);
		return b == null ? null : new Track(new ByteBuf(b));
	}

	Track(ByteBuf buf) {
		for (int i = 0; i < 10; i++) {
			int valid = buf.getUByte();
			if (valid != 0) {
				--buf.position;
				this.synthesizers[i] = new Synthesizer();
				this.synthesizers[i].decode(buf);
			}
		}

		this.loopStart = buf.getUShort();
		this.loopEnd = buf.getUShort();
	}

	final byte[] mix() {
		int duration = 0;

		for (int i = 0; i < 10; i++) {
			if (this.synthesizers[i] != null
					&& this.synthesizers[i].duration + this.synthesizers[i].offset > duration) {
				duration = this.synthesizers[i].duration + this.synthesizers[i].offset;
			}
		}

		if (duration == 0) {
			return new byte[0];
		} else {
			int sampleCount = duration * 22050 / 1000;
			byte[] output = new byte[sampleCount];

			for (int i = 0; i < 10; i++) {
				if (this.synthesizers[i] != null) {
					int synthDuration = this.synthesizers[i].duration * 22050 / 1000;
					int synthOffset = this.synthesizers[i].offset * 22050 / 1000;
					int[] samples = this.synthesizers[i].synthesize(synthDuration, this.synthesizers[i].duration);

					for (int j = 0; j < synthDuration; j++) {
						int k = output[j + synthOffset] + (samples[j] >> 8);
						if ((k + 128 & 0xffffff00) != 0) {
							k = k >> 31 ^ 127;
						}

						output[j + synthOffset] = (byte) k;
					}
				}
			}

			return output;
		}
	}

	public final int calculateDelay() {
		int offset = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (this.synthesizers[var2] != null && this.synthesizers[var2].offset / 20 < offset) {
				offset = this.synthesizers[var2].offset / 20;
			}
		}

		if (this.loopStart < this.loopEnd && this.loopStart / 20 < offset) {
			offset = this.loopStart / 20;
		}

		if (offset != 9999999 && offset != 0) {
			for (var2 = 0; var2 < 10; var2++) {
				if (this.synthesizers[var2] != null) {
					this.synthesizers[var2].offset -= offset * 20;
				}
			}

			if (this.loopStart < this.loopEnd) {
				this.loopStart -= offset * 20;
				this.loopEnd -= offset * 20;
			}

			return offset;
		} else {
			return 0;
		}
	}

	public Node_Sub2_Sub1 method122() {
		byte[] var1 = this.mix();
		return new Node_Sub2_Sub1(22050, var1, this.loopStart * 22050 / 1000, this.loopEnd * 22050 / 1000);
	}

}
