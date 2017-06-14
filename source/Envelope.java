public class Envelope {

	int form;
	int start;
	int end;
	int threshold;
	int segmentIndex;
	int step;
	int amplitude;
	int ticks;
	int[] durations = new int[2];
	int segments = 2;
	int[] peaks = new int[2];

	final void decode(ByteBuf buf) {
		this.form = buf.getUByte();
		this.start = buf.getInt();
		this.end = buf.getInt();
		this.decodeSegments(buf);
	}

	final void reset() {
		this.threshold = 0;
		this.segmentIndex = 0;
		this.step = 0;
		this.amplitude = 0;
		this.ticks = 0;
	}

	final int step(int period) {
		if (this.ticks >= this.threshold) {
			this.amplitude = this.peaks[this.segmentIndex++] << 15;
			if (this.segmentIndex >= this.segments) {
				this.segmentIndex = this.segments - 1;
			}

			this.threshold = (int) ((double) this.durations[this.segmentIndex] / 65536.0D * (double) period);
			if (this.threshold > this.ticks) {
				this.step = ((this.peaks[this.segmentIndex] << 15) - this.amplitude)
						/ (this.threshold - this.ticks);
			}
		}

		this.amplitude += this.step;
		++this.ticks;
		return this.amplitude - this.step >> 15;
	}

	Envelope() {
		this.durations[0] = 0;
		this.durations[1] = '\uffff';
		this.peaks[0] = 0;
		this.peaks[1] = '\uffff';
	}

	final void decodeSegments(ByteBuf buf) {
		this.segments = buf.getUByte();
		this.durations = new int[this.segments];
		this.peaks = new int[this.segments];

		for (int i = 0; i < this.segments; i++) {
			this.durations[i] = buf.getUShort();
			this.peaks[i] = buf.getUShort();
		}

	}

}
