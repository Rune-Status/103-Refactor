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

	public static InvType getInvType(int id) {
		InvType type = (InvType) InvType.invs.get((long) id);
		if (type == null) {
			byte[] bytes = Class112.inv_ref.getFile(5, id);
			type = new InvType();
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			InvType.invs.put(type, (long) id);
			return type;
		} else {
			return type;
		}
	}

	public static int bkdrHash(CharSequence seq) {
		int length = seq.length();
		int hash = 0;

		for (int i = 0; i < length; i++) {
			hash = (hash << 5) - hash + seq.charAt(i);
		}

		return hash;
	}

	public static int method401(int var0) {
		VarBitType var1 = CacheIndex.getVarBitType(var0);
		int var4 = var1.varp;
		int var3 = var1.lowBit;
		int var2 = var1.highBit;
		int var5 = Class94.anIntArray734[var2 - var3];
		return Class94.tempVars[var4] >> var3 & var5;
	}

	public static void method402(int var0, AbstractIndex var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getFile(var2);
		int var7 = var1.getChild(var6, var3);
		Class110.anInt782 = 1;
		Class110.aClass87_783 = var1;
		MusicIndex.musicId = var6;
		Class111.anInt788 = var7;
		Class110.anInt787 = var4;
		Class44.aBool464 = var5;
		Class110.anInt785 = var0;
	}

	static int method403(int var0) {
		ChatMessage var1 = (ChatMessage) Class32.aClass107_355.method432((long) var0);
		return var1 == null ? -1
				: (var1.dualNext != Class32.aClass108_354.aDualNode771 ? ((ChatMessage) var1.dualNext).anInt1516
						: -1);
	}

}
