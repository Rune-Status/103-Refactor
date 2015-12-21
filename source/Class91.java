
public final class Class91 {

	public static char[] aCharArray723 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9' };

	public static void method398() {
		PlayerConfig.aClass106_531.method429();
	}

	Class91() throws Throwable {
		throw new Error();
	}

	public static DualNode_Sub5 method399(int var0) {
		DualNode_Sub5 var1 = (DualNode_Sub5) DualNode_Sub5.aClass106_1500.method427((long) var0);
		if (var1 == null) {
			byte[] var2 = Class112.aClass87_789.method391(5, var0);
			var1 = new DualNode_Sub5();
			if (var2 != null) {
				var1.method694(new ByteBuf(var2));
			}

			DualNode_Sub5.aClass106_1500.method428(var1, (long) var0);
			return var1;
		} else {
			return var1;
		}
	}

	public static int method400(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	public static int method401(int var0) {
		Varpbit var1 = CacheIndex.getVarpbit(var0);
		int var4 = var1.varp * 12908597;
		int var3 = var1.lowBit * -585070571;
		int var2 = 984543857 * var1.highBit;
		int var5 = Class94.anIntArray734[var2 - var3];
		return Class94.tempVars[var4] >> var3 & var5;
	}

	public static void method402(int var0, Class87 var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.method383(var2);
		int var7 = var1.method384(var6, var3);
		Class110.anInt782 = 325298615;
		Class110.aClass87_783 = var1;
		Class98.anInt748 = 18032949 * var6;
		Class111.anInt788 = -832158449 * var7;
		Class110.anInt787 = 827167249 * var4;
		Class44.aBool464 = var5;
		Class110.anInt785 = var0 * -1836270845;
	}

	static int method403(int var0) {
		DualNode_Sub8 var1 = (DualNode_Sub8) Class32.aClass107_355.method432((long) var0);
		return var1 == null ? -1
				: (var1.dualNext != Class32.aClass108_354.aDualNode771
						? ((DualNode_Sub8) var1.dualNext).anInt1516 * -1699577047 : -1);
	}

}
