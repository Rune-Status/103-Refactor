public final class Npc extends Character {

	static Picture mapedge;
	NpcType type;
	public static byte[][] spritePixels;
	static AbstractIndex aClass87_1967;
	static Class30 aClass30_1968;

	final void method1024(int var1, byte var2) {
		int var3 = this.anIntArray1945[0];
		int var4 = this.anIntArray1955[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (this.animationId != -1 && Node_Sub6.getSequenceType(this.animationId).anInt1469 == 1) {
			this.animationId = -1;
		}

		if (this.queueSize < 9) {
			++this.queueSize;
		}

		for (int var5 = this.queueSize; var5 > 0; --var5) {
			this.anIntArray1945[var5] = this.anIntArray1945[var5 - 1];
			this.anIntArray1955[var5] = this.anIntArray1955[var5 - 1];
			this.aByteArray1951[var5] = this.aByteArray1951[var5 - 1];
		}

		this.anIntArray1945[0] = var3;
		this.anIntArray1955[0] = var4;
		this.aByteArray1951[0] = var2;
	}

	protected final Rasterizer method654(byte var1) {
		if (this.type == null) {
			return null;
		} else {
			SequenceType var3 = this.animationId != -1 && this.animationDelay == 0 ? Node_Sub6.getSequenceType(this.animationId)
					: null;
			SequenceType var4 = this.anInt1932 == -1 || this.anInt1959 == this.anInt1932 && var3 != null ? null
					: Node_Sub6.getSequenceType(this.anInt1932);
			Rasterizer var2 = this.type.method799(var3, this.anInt1934, var4, this.anInt1914);
			if (var2 == null) {
				return null;
			} else {
				var2.method998();
				this.height = var2.modelHeight * 1812947537;
				if (this.graphicsId != -1 && this.anInt1925 != -1) {
					Rasterizer var5 = Class96_Sub1.getSpotAnimType(this.graphicsId).method656(this.anInt1925);
					if (var5 != null) {
						var5.method1008(0, -this.graphicsHeight, 0);
						Rasterizer[] var6 = new Rasterizer[] { var2, var5 };
						var2 = new Rasterizer(var6, 2);
					}
				}

				if (this.type.anInt1589 == 1) {
					var2.allowClickBounds = true;
				}

				return var2;
			}
		}
	}

	final boolean hasConfig() {
		return this.type != null;
	}

	final void method1025(int var1, int var2, boolean var3) {
		if (this.animationId != -1 && Node_Sub6.getSequenceType(this.animationId).anInt1469 == 1) {
			this.animationId = -1;
		}

		if (!var3) {
			int var4 = var1 - this.anIntArray1945[0];
			int var6 = var2 - this.anIntArray1955[0];
			if (var4 >= -8 && var4 <= 8 && var6 >= -8 && var6 <= 8) {
				if (this.queueSize < 9) {
					++this.queueSize;
				}

				for (int var5 = this.queueSize; var5 > 0; --var5) {
					this.anIntArray1945[var5] = this.anIntArray1945[var5 - 1];
					this.anIntArray1955[var5] = this.anIntArray1955[var5 - 1];
					this.aByteArray1951[var5] = this.aByteArray1951[var5 - 1];
				}

				this.anIntArray1945[0] = var1;
				this.anIntArray1955[0] = var2;
				this.aByteArray1951[0] = 1;
				return;
			}
		}

		this.queueSize = 0;
		this.anInt1957 = 0;
		this.anInt1956 = 0;
		this.anIntArray1945[0] = var1;
		this.anIntArray1955[0] = var2;
		this.strictX = this.anInt1915 * 64 + this.anIntArray1945[0] * 128;
		this.strictY = this.anInt1915 * 64 + this.anIntArray1955[0] * 128;
	}

	static World method1026(byte var0) {
		World.anInt1121 = 0;
		World var1;
		if (World.anInt1121 >= World.worldCount) {
			var1 = null;
		} else {
			var1 = World.worlds[++World.anInt1121 - 1];
		}

		return var1;
	}

}
