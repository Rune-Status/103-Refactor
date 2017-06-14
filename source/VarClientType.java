import java.awt.Frame;

public class VarClientType extends DualNode {

	static AbstractIndex varclient_ref;
	static CacheIndex sfxIndex;
	protected static Frame gameFrame;
	public boolean serialize = false;
	static NodeMap varclients = new NodeMap(64);

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method718(var1, var2);
		}
	}

	void method718(ByteBuf var1, int var2) {
		if (var2 == 2) {
			this.serialize = true;
		}

	}

	public static int method719() {
		return ++MouseInput.anInt617 - 1;
	}

	static int decodeSkipCount(BitBuf var0) {
		int var1 = var0.getBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.getBits(5);
		} else if (var1 == 2) {
			var2 = var0.getBits(8);
		} else {
			var2 = var0.getBits(11);
		}

		return var2;
	}

	static final int getNoise(int x, int y) {
		int z = y * 57 + x;
		z ^= z << 13;
		int v = (z * z * 15731 + 789221) * z + 1376312589 & 0x7fffffff;
		return v >> 19 & 0xff;
	}

}
