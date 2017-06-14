import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class SourceDataSoundSystem extends AbstractSoundSystem {

	AudioFormat format;
	byte[] bytes;
	SourceDataLine source;
	int size;

	void create(Component var1) {
		this.format = new AudioFormat((float) sampleRate, 16, highMemory ? 2 : 1, true, false);
		this.bytes = new byte[256 << (highMemory ? 2 : 1)];
	}

	void create(int size) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.format, size << (highMemory ? 2 : 1));
			this.source = (SourceDataLine) AudioSystem.getLine(var3);
			this.source.open();
			this.source.start();
			this.size = size;
		} catch (LineUnavailableException var31) {
			if (Node_Sub14.method576(size) == 1) {
				this.source = null;
				throw var31;
			}

			this.create(World.method482(size));
		}

	}

	int size() {
		return this.size - (this.source.available() >> (highMemory ? 2 : 1));
	}

	void close() {
		if (this.source != null) {
			this.source.close();
			this.source = null;
		}

	}

	void flush() {
		this.source.flush();
	}

	void write() {
		int size = 256;
		if (highMemory) {
			size <<= 1;
		}

		for (int var2 = 0; var2 < size; var2++) {
			int var3 = this.samples[var2];
			if ((var3 + 8388608 & 0xff000000) != 0) {
				var3 = var3 >> 31 ^ 8388607;
			}

			this.bytes[var2 * 2] = (byte) (var3 >> 8);
			this.bytes[var2 * 2 + 1] = (byte) (var3 >> 16);
		}

		this.source.write(this.bytes, 0, size << 1);
	}

}
