
public class Class21 {

	int anInt278;
	int anInt279;
	int anInt280;
	protected static int anInt281;
	int anInt282;

	static final boolean method155(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		ByteBuf var5 = new ByteBuf(var0);
		int var7 = -1;

		while (true) {
			int var6 = var5.getUSmart();
			if (var6 == 0) {
				return var3;
			}

			var7 += var6;
			int var11 = 0;
			boolean var8 = false;

			while (true) {
				int var4;
				if (var8) {
					var4 = var5.getUSmart();
					if (var4 == 0) {
						break;
					}

					var5.getUByte();
				} else {
					var4 = var5.getUSmart();
					if (var4 == 0) {
						break;
					}

					var11 += var4 - 1;
					int var12 = var11 & 63;
					int var9 = var11 >> 6 & 63;
					int var14 = var5.getUByte() >> 2;
					int var10 = var9 + var1;
					int var13 = var2 + var12;
					if (var10 > 0 && var13 > 0 && var10 < 103 && var13 < 103) {
						ObjectType var15 = Class37.getObjectType(var7);
						if (var14 != 22 || !Client.aBool2010 || var15.anInt1692 * -839074197 != 0
								|| -1030255905 * var15.anInt1690 == 1 || var15.aBool1711) {
							if (!var15.method867()) {
								Client.anInt2049 += -34022823;
								var3 = false;
							}

							var8 = true;
						}
					}
				}
			}
		}
	}

	Class21() {
	}

	static final void method156(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.anIntArray1945[0];
		int var7 = var0.anIntArray1955[0];
		int var6 = var0.method1046();
		if (var4 >= var6 && var4 < 104 - var6 && var7 >= var6 && var7 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var9 = var0.method1046();
				Client.aClass48_Sub1_2234.anInt511 = -1745633279 * var1;
				Client.aClass48_Sub1_2234.anInt509 = var2 * 1201257799;
				Client.aClass48_Sub1_2234.anInt512 = 1741387093;
				Client.aClass48_Sub1_2234.anInt510 = -25596441;
				Class48_Sub1 var11 = Client.aClass48_Sub1_2234;
				int var10 = Class39.method218(var4, var7, var9, var11,
						Client.collisionMaps[-1522270499 * var0.anInt2004], true, Client.anIntArray2235,
						Client.anIntArray2236);
				if (var10 >= 1) {
					for (int var5 = 0; var5 < var10 - 1; ++var5) {
						var0.method1044(Client.anIntArray2235[var5], Client.anIntArray2236[var5], var3);
					}

				}
			}
		}
	}

	static int method157(int var0) {
		DualNode_Sub8 var1 = (DualNode_Sub8) Class32.aClass107_355.method432((long) var0);
		return var1 == null ? -1
				: (var1.dualPrevious == Class32.aClass108_354.aDualNode771 ? -1
						: -1699577047 * ((DualNode_Sub8) var1.dualPrevious).anInt1516);
	}

	Class21(Class21 var1) {
		this.anInt278 = 1 * var1.anInt278;
		this.anInt282 = 1 * var1.anInt282;
		this.anInt279 = var1.anInt279 * 1;
		this.anInt280 = var1.anInt280 * 1;
	}
}
