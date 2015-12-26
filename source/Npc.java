
public final class Npc extends Character {

	static Sprite aSprite1965;
	NpcType definition;
	public static byte[][] aByteArrayArray1966;
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

		if (-922607859 * this.animation != -1
				&& Node_Sub6.getSequenceType(this.animation * -922607859).anInt1469 * -1099577343 == 1) {
			this.animation = 1587034171;
		}

		if (this.queueSize * 632093179 < 9) {
			this.queueSize += 11741491;
		}

		for (int var5 = this.queueSize * 632093179; var5 > 0; --var5) {
			this.anIntArray1945[var5] = this.anIntArray1945[var5 - 1];
			this.anIntArray1955[var5] = this.anIntArray1955[var5 - 1];
			this.aByteArray1951[var5] = this.aByteArray1951[var5 - 1];
		}

		this.anIntArray1945[0] = var3;
		this.anIntArray1955[0] = var4;
		this.aByteArray1951[0] = var2;
	}

	protected final Model method654(byte var1) {
		if (this.definition == null) {
			return null;
		} else {
			SequenceType var3 = -922607859 * this.animation != -1 && 1301453073 * this.anInt1936 == 0
					? Node_Sub6.getSequenceType(-922607859 * this.animation) : null;
			SequenceType var4 = 57983255 * this.anInt1932 != -1
					&& (370127001 * this.anInt1959 != this.anInt1932 * 57983255 || var3 == null)
							? Node_Sub6.getSequenceType(57983255 * this.anInt1932) : null;
			Model var2 = this.definition.method799(var3, 1402685833 * this.anInt1934, var4,
					-1199565973 * this.anInt1914);
			if (var2 == null) {
				return null;
			} else {
				var2.method998();
				this.anInt1950 = var2.modelHeight * -1831653581;
				if (1631645159 * this.anInt1938 != -1 && this.anInt1925 * -1255206495 != -1) {
					Model var5 = Class96_Sub1.getSpotAnimType(1631645159 * this.anInt1938)
							.method656(-1255206495 * this.anInt1925);
					if (var5 != null) {
						var5.method1008(0, -(1719935737 * this.anInt1920), 0);
						Model[] var6 = new Model[] { var2, var5 };
						var2 = new Model(var6, 2);
					}
				}

				if (this.definition.anInt1589 * -691506967 == 1) {
					var2.allowClickBounds = true;
				}

				return var2;
			}
		}
	}

	final boolean method1017(byte var1) {
		return this.definition != null;
	}

	final void method1025(int var1, int var2, boolean var3) {
		if (this.animation * -922607859 != -1
				&& Node_Sub6.getSequenceType(this.animation * -922607859).anInt1469 * -1099577343 == 1) {
			this.animation = 1587034171;
		}

		if (!var3) {
			int var4 = var1 - this.anIntArray1945[0];
			int var6 = var2 - this.anIntArray1955[0];
			if (var4 >= -8 && var4 <= 8 && var6 >= -8 && var6 <= 8) {
				if (632093179 * this.queueSize < 9) {
					this.queueSize += 11741491;
				}

				for (int var5 = this.queueSize * 632093179; var5 > 0; --var5) {
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
		this.strictX = this.anInt1915 * -1142586432 + -715945088 * this.anIntArray1945[0];
		this.strictY = this.anInt1915 * 1467429440 + this.anIntArray1955[0] * 1616412800;
	}

	static World method1026(byte var0) {
		World.anInt1121 = 0;
		World var1;
		if (World.anInt1121 * -1614070229 >= World.worldCount * -1946617791) {
			var1 = null;
		} else {
			var1 = World.worlds[(World.anInt1121 += -1416261501) * -1614070229 - 1];
		}

		return var1;
	}
}
