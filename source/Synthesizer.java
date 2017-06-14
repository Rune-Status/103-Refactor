import java.util.Random;

public class Synthesizer {

	int[] oscillatorVolume = new int[] { 0, 0, 0, 0, 0 };
	int[] oscillatorPitchShift = new int[] { 0, 0, 0, 0, 0 };
	int[] oscillatorDelays = new int[] { 0, 0, 0, 0, 0 };
	int delayTime = 0;
	int delayDecay = 100;
	int duration = 500;
	int offset = 0;
	Envelope pitch;
	Envelope volume;
	Envelope pitchModifier;
	Envelope pitchModifierAmplitude;
	Envelope volumeMultiplier;
	Envelope volumeMultiplierAmplitude;
	Envelope release;
	Envelope attack;
	Filter filter;
	Envelope filterEnvelope;
	static int[] NOISE = new int['\u8000'];
	static int[] SINE;
	static int[] samples;
	static int[] phases;
	static int[] delays;
	static int[] volumeSteps;
	static int[] pitchSteps;
	static int[] pitchBaseSteps;

	final int[] synthesize(int sampleCount, int duration) {
		SampleFill.fill(samples, 0, sampleCount);
		if (duration < 10) {
			return samples;
		} else {
			double samplesPerStep = (double) sampleCount / ((double) duration + 0.0D);
			this.pitch.reset();
			this.volume.reset();
			int pitchMultiplierStep = 0;
			int pitchModifierBaseStep = 0;
			int pitchModifierPhase = 0;
			if (this.pitchModifier != null) {
				this.pitchModifier.reset();
				this.pitchModifierAmplitude.reset();
				pitchMultiplierStep = (int) ((double) (this.pitchModifier.end - this.pitchModifier.start) * 32.768D / samplesPerStep);
				pitchModifierBaseStep = (int) ((double) this.pitchModifier.start * 32.768D / samplesPerStep);
			}

			int volumeMultiplierStep = 0;
			int volumeMultiplierBaseStep = 0;
			int volumeMultiplierPhase = 0;
			if (this.volumeMultiplier != null) {
				this.volumeMultiplier.reset();
				this.volumeMultiplierAmplitude.reset();
				volumeMultiplierStep = (int) ((double) (this.volumeMultiplier.end - this.volumeMultiplier.start) * 32.768D / samplesPerStep);
				volumeMultiplierBaseStep = (int) ((double) this.volumeMultiplier.start * 32.768D / samplesPerStep);
			}

			int i;
			for (i = 0; i < 5; i++) {
				if (this.oscillatorVolume[i] != 0) {
					phases[i] = 0;
					delays[i] = (int) ((double) this.oscillatorDelays[i] * samplesPerStep);
					volumeSteps[i] = (this.oscillatorVolume[i] << 14) / 100;
					pitchSteps[i] = (int) ((double) (this.pitch.end - this.pitch.start)
							* 32.768D * Math.pow(1.0057929410678534D, (double) this.oscillatorPitchShift[i]) / samplesPerStep);
					pitchBaseSteps[i] = (int) ((double) this.pitch.start * 32.768D / samplesPerStep);
				}
			}

			int var3;
			int var4;
			int var11;
			int var17;
			for (i = 0; i < sampleCount; i++) {
				var4 = this.pitch.step(sampleCount);
				var11 = this.volume.step(sampleCount);
				if (this.pitchModifier != null) {
					var3 = this.pitchModifier.step(sampleCount);
					var17 = this.pitchModifierAmplitude.step(sampleCount);
					var4 += this.evaluateWave(pitchModifierPhase, var17, this.pitchModifier.form) >> 1;
					pitchModifierPhase += (var3 * pitchMultiplierStep >> 16) + pitchModifierBaseStep;
				}

				if (this.volumeMultiplier != null) {
					var3 = this.volumeMultiplier.step(sampleCount);
					var17 = this.volumeMultiplierAmplitude.step(sampleCount);
					var11 = ((this.evaluateWave(volumeMultiplierPhase, var17, this.volumeMultiplier.form) >> 1) + '\u8000') * var11 >> 15;
					volumeMultiplierPhase += (var3 * volumeMultiplierStep >> 16) + volumeMultiplierBaseStep;
				}

				for (var3 = 0; var3 < 5; var3++) {
					if (this.oscillatorVolume[var3] != 0) {
						var17 = delays[var3] + i;
						if (var17 < sampleCount) {
							samples[var17] += this.evaluateWave(phases[var3],
									volumeSteps[var3] * var11 >> 15, this.pitch.form);
							phases[var3] += (pitchSteps[var3] * var4 >> 16) + pitchBaseSteps[var3];
						}
					}
				}
			}

			int var8;
			if (this.release != null) {
				this.release.reset();
				this.attack.reset();
				i = 0;
				boolean var9 = false;
				boolean var5 = true;

				for (var3 = 0; var3 < sampleCount; var3++) {
					var17 = this.release.step(sampleCount);
					var8 = this.attack.step(sampleCount);
					if (var5) {
						var4 = this.release.start
								+ ((this.release.end - this.release.start) * var17 >> 8);
					} else {
						var4 = this.release.start
								+ ((this.release.end - this.release.start) * var8 >> 8);
					}

					i += 256;
					if (i >= var4) {
						i = 0;
						var5 = !var5;
					}

					if (var5) {
						samples[var3] = 0;
					}
				}
			}

			if (this.delayTime > 0 && this.delayDecay > 0) {
				i = (int) ((double) this.delayTime * samplesPerStep);

				for (var4 = i; var4 < sampleCount; var4++) {
					samples[var4] += samples[var4 - i] * this.delayDecay / 100;
				}
			}

			if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
				this.filterEnvelope.reset();
				i = this.filterEnvelope.step(sampleCount + 1);
				var4 = this.filter.compute(0, (float) i / 65536.0F);
				var11 = this.filter.compute(1, (float) i / 65536.0F);
				if (sampleCount >= var4 + var11) {
					var3 = 0;
					var17 = var11;
					if (var11 > sampleCount - var4) {
						var17 = sampleCount - var4;
					}

					int var19;
					while (var3 < var17) {
						var8 = (int) ((long) samples[var3 + var4] * (long) Filter.fowardMultiplier >> 16);

						for (var19 = 0; var19 < var4; var19++) {
							var8 += (int) ((long) samples[var3 + var4 - 1 - var19]
									* (long) Filter.coefficients[0][var19] >> 16);
						}

						for (var19 = 0; var19 < var3; var19++) {
							var8 -= (int) ((long) samples[var3 - 1 - var19]
									* (long) Filter.coefficients[1][var19] >> 16);
						}

						samples[var3] = var8;
						i = this.filterEnvelope.step(sampleCount + 1);
						++var3;
					}

					var17 = 128;

					while (true) {
						if (var17 > sampleCount - var4) {
							var17 = sampleCount - var4;
						}

						int var20;
						while (var3 < var17) {
							var19 = (int) ((long) samples[var3 + var4] * (long) Filter.fowardMultiplier >> 16);

							for (var20 = 0; var20 < var4; var20++) {
								var19 += (int) ((long) samples[var3 + var4 - 1 - var20]
										* (long) Filter.coefficients[0][var20] >> 16);
							}

							for (var20 = 0; var20 < var11; var20++) {
								var19 -= (int) ((long) samples[var3 - 1 - var20]
										* (long) Filter.coefficients[1][var20] >> 16);
							}

							samples[var3] = var19;
							i = this.filterEnvelope.step(sampleCount + 1);
							++var3;
						}

						if (var3 >= sampleCount - var4) {
							while (var3 < sampleCount) {
								var19 = 0;

								for (var20 = var3 + var4 - sampleCount; var20 < var4; var20++) {
									var19 += (int) ((long) samples[var3 + var4 - 1 - var20]
											* (long) Filter.coefficients[0][var20] >> 16);
								}

								for (var20 = 0; var20 < var11; var20++) {
									var19 -= (int) ((long) samples[var3 - 1 - var20]
											* (long) Filter.coefficients[1][var20] >> 16);
								}

								samples[var3] = var19;
								this.filterEnvelope.step(sampleCount + 1);
								++var3;
							}
							break;
						}

						var4 = this.filter.compute(0, (float) i / 65536.0F);
						var11 = this.filter.compute(1, (float) i / 65536.0F);
						var17 += 128;
					}
				}
			}

			for (i = 0; i < sampleCount; i++) {
				if (samples[i] < -32768) {
					samples[i] = -32768;
				}

				if (samples[i] > 32767) {
					samples[i] = 32767;
				}
			}

			return samples;
		}
	}

	final void decode(ByteBuf buffer) {
		this.pitch = new Envelope();
		this.pitch.decode(buffer);
		this.volume = new Envelope();
		this.volume.decode(buffer);
		int option = buffer.getUByte();
		if (option != 0) {
			--buffer.position;
			this.pitchModifier = new Envelope();
			this.pitchModifier.decode(buffer);
			this.pitchModifierAmplitude = new Envelope();
			this.pitchModifierAmplitude.decode(buffer);
		}

		option = buffer.getUByte();
		if (option != 0) {
			--buffer.position;
			this.volumeMultiplier = new Envelope();
			this.volumeMultiplier.decode(buffer);
			this.volumeMultiplierAmplitude = new Envelope();
			this.volumeMultiplierAmplitude.decode(buffer);
		}

		option = buffer.getUByte();
		if (option != 0) {
			--buffer.position;
			this.release = new Envelope();
			this.release.decode(buffer);
			this.attack = new Envelope();
			this.attack.decode(buffer);
		}

		for (int i = 0; i < 10; i++) {
			int volume = buffer.getUSmart();
			if (volume == 0) {
				break;
			}

			this.oscillatorVolume[i] = volume;
			this.oscillatorPitchShift[i] = buffer.getSmart();
			this.oscillatorDelays[i] = buffer.getUSmart();
		}

		this.delayTime = buffer.getUSmart();
		this.delayDecay = buffer.getUSmart();
		this.duration = buffer.getUShort();
		this.offset = buffer.getUShort();
		this.filter = new Filter();
		this.filterEnvelope = new Envelope();
		this.filter.decode(buffer, this.filterEnvelope);
	}

	final int evaluateWave(int amplitude, int phase, int table) {
		return table == 1 ? ((amplitude & 0x7fff) < 16384 ? phase : -phase)
				: (table == 2 ? SINE[amplitude & 0x7fff] * phase >> 14
						: (table == 3 ? ((amplitude & 0x7fff) * phase >> 14) - phase
								: (table == 4 ? NOISE[amplitude / 2607 & 0x7fff] * phase : 0)));
	}

	static {
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < '\u8000'; var1++) {
			NOISE[var1] = (var0.nextInt() & 0x2) - 1;
		}

		SINE = new int['\u8000'];

		for (var1 = 0; var1 < '\u8000'; var1++) {
			SINE[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}

		samples = new int[220500];
		phases = new int[5];
		delays = new int[5];
		volumeSteps = new int[5];
		pitchSteps = new int[5];
		pitchBaseSteps = new int[5];
	}

}
