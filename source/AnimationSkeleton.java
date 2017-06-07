public class AnimationSkeleton {

	AnimationSkin skin = null;
	int anInt292 = -1;
	boolean aBool297 = false;
	int[] anIntArray293;
	int[] anIntArray288;
	int[] anIntArray295;
	int[] anIntArray296;
	static int[] anIntArray287 = new int[500];
	static int[] anIntArray289 = new int[500];
	static int[] anIntArray290 = new int[500];
	static int[] anIntArray294 = new int[500];

	AnimationSkeleton(byte[] bytes, AnimationSkin skin) {
		this.skin = skin;
		ByteBuf buf = new ByteBuf(bytes);
		ByteBuf buf1 = new ByteBuf(bytes);
		buf.position = 2;
		int count = buf.getUByte();
		int var8 = -1;
		int var4 = 0;
		buf1.position = buf.position + count;

		for (int i = 0; i < count; i++) {
			int var5 = buf.getUByte();
			if (var5 > 0) {
				if (this.skin.types[i] != 0) {
					for (int j = i - 1; j > var8; --j) {
						if (this.skin.types[j] == 0) {
							anIntArray294[var4] = j;
							anIntArray287[var4] = 0;
							anIntArray289[var4] = 0;
							anIntArray290[var4] = 0;
							++var4;
							break;
						}
					}
				}

				anIntArray294[var4] = i;
				short var111 = 0;
				if (this.skin.types[i] == 3) {
					var111 = 128;
				}

				if ((var5 & 0x1) != 0) {
					anIntArray287[var4] = buf1.getSmart();
				} else {
					anIntArray287[var4] = var111;
				}

				if ((var5 & 0x2) != 0) {
					anIntArray289[var4] = buf1.getSmart();
				} else {
					anIntArray289[var4] = var111;
				}

				if ((var5 & 0x4) != 0) {
					anIntArray290[var4] = buf1.getSmart();
				} else {
					anIntArray290[var4] = var111;
				}

				var8 = i;
				++var4;
				if (this.skin.types[i] == 5) {
					this.aBool297 = true;
				}
			}
		}

		if (buf1.position != bytes.length) {
			throw new RuntimeException();
		} else {
			this.anInt292 = var4;
			this.anIntArray293 = new int[var4];
			this.anIntArray288 = new int[var4];
			this.anIntArray295 = new int[var4];
			this.anIntArray296 = new int[var4];

			for (int i = 0; i < var4; i++) {
				this.anIntArray293[i] = anIntArray294[i];
				this.anIntArray288[i] = anIntArray287[i];
				this.anIntArray295[i] = anIntArray289[i];
				this.anIntArray296[i] = anIntArray290[i];
			}

		}
	}

}
