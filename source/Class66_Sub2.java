
public class Class66_Sub2 extends Class66 {

	int anInt1317 = -1470624512;
	long aLong1318 = Node_Sub5.currentTimeMs() * -7851503190461573869L;
	long[] aLongArray1319 = new long[10];
	int anInt1320 = 0;
	int anInt1321;
	int anInt1322 = -1663734701;

	void method321() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.aLongArray1319[var2] = 0L;
		}

	}

	int method322(int var1, int var2) {
		int var4 = this.anInt1317 * -897075515;
		int var5 = this.anInt1322 * -546326565;
		this.anInt1317 = 155660092;
		this.anInt1322 = -1663734701;
		this.aLong1318 = Node_Sub5.currentTimeMs() * -7851503190461573869L;
		if (this.aLongArray1319[1407235087 * this.anInt1321] == 0L) {
			this.anInt1317 = var4 * -1817683955;
			this.anInt1322 = -1663734701 * var5;
		} else if (40353379429776667L * this.aLong1318 > this.aLongArray1319[1407235087 * this.anInt1321]) {
			this.anInt1317 = (int) ((long) (2560 * var1)
					/ (this.aLong1318 * 40353379429776667L - this.aLongArray1319[1407235087 * this.anInt1321]))
					* -1817683955;
		}

		if (this.anInt1317 * -897075515 < 25) {
			this.anInt1317 = 1802541381;
		}

		if (-897075515 * this.anInt1317 > 256) {
			this.anInt1317 = -1470624512;
			this.anInt1322 = -1663734701 * (int) ((long) var1
					- (40353379429776667L * this.aLong1318 - this.aLongArray1319[this.anInt1321 * 1407235087]) / 10L);
		}

		if (-546326565 * this.anInt1322 > var1) {
			this.anInt1322 = var1 * -1663734701;
		}

		this.aLongArray1319[1407235087 * this.anInt1321] = this.aLong1318 * 40353379429776667L;
		this.anInt1321 = (1407235087 * this.anInt1321 + 1) % 10 * 1917565679;
		int var6;
		if (-546326565 * this.anInt1322 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (0L != this.aLongArray1319[var6]) {
					this.aLongArray1319[var6] += (long) (this.anInt1322 * -546326565);
				}
			}
		}

		if (this.anInt1322 * -546326565 < var2) {
			this.anInt1322 = var2 * -1663734701;
		}

		Class96_Sub1.method500((long) (this.anInt1322 * -546326565));

		for (var6 = 0; this.anInt1320 * -1165867281 < 256; this.anInt1320 += -1117782645 * this.anInt1317) {
			++var6;
		}

		this.anInt1320 = (this.anInt1320 * -1165867281 & 255) * -784357361;
		return var6;
	}

	Class66_Sub2() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.aLongArray1319[var1] = this.aLong1318 * 40353379429776667L;
		}

	}

	public static DualNode_Sub10 method552(int var0, int var1) {
		DualNode_Sub10 var2 = (DualNode_Sub10) DualNode_Sub10.aClass106_1534.method427((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = DualNode_Sub10.aClass87_1536.getFile(19, var0);
			var2 = new DualNode_Sub10();
			if (var3 != null) {
				var2.method717(new ByteBuf(var3));
			}

			DualNode_Sub10.aClass106_1534.method428(var2, (long) var0);
			return var2;
		}
	}

	public static boolean method553(char var0) {
		return var0 >= 48 && var0 <= 57;
	}

	static final void method554(int var0, int var1) {
		int var2 = Class35.aDualNode_Sub13_Sub3_Sub1_386.method967(GameStrings.aString996);

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuItemCount * 1768430155; ++var3) {
			var4 = Class35.aDualNode_Sub13_Sub3_Sub1_386.method967(Class25.method165(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = 756648549 * Client.menuItemCount + 22;
		var4 = var0 - var2 / 2;
		if (var2 + var4 > Class34.gameWidth * -452716157) {
			var4 = -452716157 * Class34.gameWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var1 + var3 > 674167779 * Node_Sub9.gameHeight) {
			var5 = 674167779 * Node_Sub9.gameHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		Client.menuOpen = true;
		Class7.menuX = var4 * -947513225;
		DualNode_Sub5.menuY = -919188011 * var5;
		Class4.menuWidth = 1685804945 * var2;
		Class4.menuHeight = 1989334774 + 423879157 * Client.menuItemCount;
	}
}
