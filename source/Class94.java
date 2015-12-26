
public class Class94 {

	public static int[] engineVars;
	static int[] anIntArray734 = new int[32];
	public static boolean aBool735;
	public static int[] tempVars;

	static {
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			anIntArray734[var1] = var0 - 1;
			var0 += var0;
		}

		engineVars = new int[2000];
		tempVars = new int[2000];
	}

	Class94() throws Throwable {
		throw new Error();
	}

	static final void method405(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			Landscape var8, CollisionMap[] var9) {
		ByteBuf var10 = new ByteBuf(var0);
		int var25 = -1;

		while (true) {
			int var12 = var10.getUSmart();
			if (var12 == 0) {
				return;
			}

			var25 += var12;
			int var22 = 0;

			while (true) {
				int var14 = var10.getUSmart();
				if (var14 == 0) {
					break;
				}

				var22 += var14 - 1;
				int var18 = var22 & 63;
				int var17 = var22 >> 6 & 63;
				int var13 = var22 >> 12;
				int var23 = var10.getUByte();
				int var30 = var23 >> 2;
				int var20 = var23 & 3;
				if (var4 == var13 && var17 >= var5 && var17 < 8 + var5 && var18 >= var6 && var18 < var6 + 8) {
					ObjectDefinition var19 = Class37.getObjectDefinition(var25);
					int var24 = var17 & 7;
					int var29 = var18 & 7;
					int var27 = 1162660975 * var19.sizeX;
					int var28 = -1976023901 * var19.sizeY;
					int var11;
					if ((var20 & 1) == 1) {
						var11 = var27;
						var27 = var28;
						var28 = var11;
					}

					int var26 = var7 & 3;
					int var16;
					if (var26 == 0) {
						var16 = var24;
					} else if (var26 == 1) {
						var16 = var29;
					} else if (var26 == 2) {
						var16 = 7 - var24 - (var27 - 1);
					} else {
						var16 = 7 - var29 - (var28 - 1);
					}

					var11 = var2 + var16;
					int var21 = var3 + Character.method1021(var17 & 7, var18 & 7, var7, var19.sizeX * 1162660975,
							var19.sizeY * -1976023901, var20);
					if (var11 > 0 && var21 > 0 && var11 < 103 && var21 < 103) {
						int var31 = var1;
						if ((Class39.renderRules[1][var11][var21] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						ScriptEvent.method650(var1, var11, var21, var25, var7 + var20 & 3, var30, var8, var32);
					}
				}
			}
		}
	}

	public static Widget method406(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & '\uffff';
		if (Widget.interfaces[var1] == null || Widget.interfaces[var1][var2] == null) {
			boolean var3 = DualNode_Sub2.method666(var1);
			if (!var3) {
				return null;
			}
		}
		//System.out.println("Widget: " + var1 + "," + var2);
		return Widget.interfaces[var1][var2];
	}
}
