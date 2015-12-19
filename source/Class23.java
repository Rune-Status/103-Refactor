
public class Class23 {

	static int[] anIntArray287 = new int[500];
	int[] anIntArray288;
	static int[] anIntArray289 = new int[500];
	static int[] anIntArray290 = new int[500];
	Node_Sub5 aNode_Sub5_291 = null;
	int anInt292 = -1;
	int[] anIntArray293;
	static int[] anIntArray294 = new int[500];
	int[] anIntArray295;
	int[] anIntArray296;
	boolean aBool297 = false;

	Class23(byte[] var1, Node_Sub5 var2) {
		this.aNode_Sub5_291 = var2;
		ByteBuf var6 = new ByteBuf(var1);
		ByteBuf var9 = new ByteBuf(var1);
		var6.position = -368351178;
		int var7 = var6.getUByte();
		int var8 = -1;
		int var4 = 0;
		var9.position = (var6.position * 314639891 + var7) * -184175589;

		int var3;
		for (var3 = 0; var3 < var7; ++var3) {
			int var5 = var6.getUByte();
			if (var5 > 0) {
				if (this.aNode_Sub5_291.anIntArray1262[var3] != 0) {
					for (int var10 = var3 - 1; var10 > var8; --var10) {
						if (this.aNode_Sub5_291.anIntArray1262[var10] == 0) {
							anIntArray294[var4] = var10;
							anIntArray287[var4] = 0;
							anIntArray289[var4] = 0;
							anIntArray290[var4] = 0;
							++var4;
							break;
						}
					}
				}

				anIntArray294[var4] = var3;
				short var11 = 0;
				if (this.aNode_Sub5_291.anIntArray1262[var3] == 3) {
					var11 = 128;
				}

				if ((var5 & 1) != 0) {
					anIntArray287[var4] = var9.getSmart();
				} else {
					anIntArray287[var4] = var11;
				}

				if ((var5 & 2) != 0) {
					anIntArray289[var4] = var9.getSmart();
				} else {
					anIntArray289[var4] = var11;
				}

				if ((var5 & 4) != 0) {
					anIntArray290[var4] = var9.getSmart();
				} else {
					anIntArray290[var4] = var11;
				}

				var8 = var3;
				++var4;
				if (this.aNode_Sub5_291.anIntArray1262[var3] == 5) {
					this.aBool297 = true;
				}
			}
		}

		if (var9.position * 314639891 != var1.length) {
			throw new RuntimeException();
		} else {
			this.anInt292 = var4;
			this.anIntArray293 = new int[var4];
			this.anIntArray288 = new int[var4];
			this.anIntArray295 = new int[var4];
			this.anIntArray296 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3) {
				this.anIntArray293[var3] = anIntArray294[var3];
				this.anIntArray288[var3] = anIntArray287[var3];
				this.anIntArray295[var3] = anIntArray289[var3];
				this.anIntArray296[var3] = anIntArray290[var3];
			}

		}
	}
}
