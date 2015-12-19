
public class Class14 {

	int anInt230;
	Class10[] aClass10Array231 = new Class10[10];
	int anInt232;

	public static Class14 method119(Class87 var0, int var1, int var2) {
		byte[] var3 = var0.method391(var1, var2);
		return var3 == null ? null : new Class14(new ByteBuf(var3));
	}

	Class14(ByteBuf var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.getUByte();
			if (var3 != 0) {
				var1.position -= -184175589;
				this.aClass10Array231[var2] = new Class10();
				this.aClass10Array231[var2].method99(var1);
			}
		}

		this.anInt230 = var1.getUShort();
		this.anInt232 = var1.getUShort();
	}

	final byte[] method120() {
		int var1 = 0;

		int var3;
		for (var3 = 0; var3 < 10; ++var3) {
			if (this.aClass10Array231[var3] != null
					&& this.aClass10Array231[var3].anInt198 + this.aClass10Array231[var3].anInt199 > var1) {
				var1 = this.aClass10Array231[var3].anInt198 + this.aClass10Array231[var3].anInt199;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			var3 = 22050 * var1 / 1000;
			byte[] var9 = new byte[var3];

			for (int var2 = 0; var2 < 10; ++var2) {
				if (this.aClass10Array231[var2] != null) {
					int var6 = this.aClass10Array231[var2].anInt198 * 22050 / 1000;
					int var7 = this.aClass10Array231[var2].anInt199 * 22050 / 1000;
					int[] var8 = this.aClass10Array231[var2].method98(var6, this.aClass10Array231[var2].anInt198);

					for (int var5 = 0; var5 < var6; ++var5) {
						int var4 = var9[var5 + var7] + (var8[var5] >> 8);
						if ((var4 + 128 & -256) != 0) {
							var4 = var4 >> 31 ^ 127;
						}

						var9[var5 + var7] = (byte) var4;
					}
				}
			}

			return var9;
		}
	}

	public final int method121() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.aClass10Array231[var2] != null && this.aClass10Array231[var2].anInt199 / 20 < var1) {
				var1 = this.aClass10Array231[var2].anInt199 / 20;
			}
		}

		if (this.anInt230 < this.anInt232 && this.anInt230 / 20 < var1) {
			var1 = this.anInt230 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.aClass10Array231[var2] != null) {
					this.aClass10Array231[var2].anInt199 -= var1 * 20;
				}
			}

			if (this.anInt230 < this.anInt232) {
				this.anInt230 -= var1 * 20;
				this.anInt232 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	public Node_Sub2_Sub1 method122() {
		byte[] var1 = this.method120();
		return new Node_Sub2_Sub1(22050, var1, 22050 * this.anInt230 / 1000, 22050 * this.anInt232 / 1000);
	}
}
