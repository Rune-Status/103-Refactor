import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class Class8_Sub2 extends Class8 {

	int anInt1217;
	SourceDataLine aSourceDataLine1218;
	AudioFormat anAudioFormat1219;
	byte[] aByteArray1220;

	void method87(Component var1) {
		this.anAudioFormat1219 = new AudioFormat((float) (-954458055 * anInt157), 16, aBool166 ? 2 : 1, true, false);
		this.aByteArray1220 = new byte[256 << (aBool166 ? 2 : 1)];
	}

	void method88(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.anAudioFormat1219, var1 << (aBool166 ? 2 : 1));
			this.aSourceDataLine1218 = (SourceDataLine) AudioSystem.getLine(var2);
			this.aSourceDataLine1218.open();
			this.aSourceDataLine1218.start();
			this.anInt1217 = var1 * -1584098805;
		} catch (LineUnavailableException var3) {
			if (Node_Sub14.method576(var1) != 1) {
				this.method88(World.method482(var1));
			} else {
				this.aSourceDataLine1218 = null;
				throw var3;
			}
		}
	}

	int method89() {
		return this.anInt1217 * 273803683 - (this.aSourceDataLine1218.available() >> (aBool166 ? 2 : 1));
	}

	void method93() {
		if (this.aSourceDataLine1218 != null) {
			this.aSourceDataLine1218.close();
			this.aSourceDataLine1218 = null;
		}

	}

	void method80() {
		this.aSourceDataLine1218.flush();
	}

	void method90() {
		int var1 = 256;
		if (aBool166) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = this.anIntArray160[var2];
			if ((8388608 + var3 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.aByteArray1220[2 * var2] = (byte) (var3 >> 8);
			this.aByteArray1220[1 + var2 * 2] = (byte) (var3 >> 16);
		}

		this.aSourceDataLine1218.write(this.aByteArray1220, 0, var1 << 1);
	}
}
