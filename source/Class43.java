public class Class43 {

	static byte aByte451;

	static void method229(Player var0, int var1, int var2) {
		if (var0.animation == var1 && var1 != -1) {
			int var3 = Node_Sub6.getSequenceType(var1).anInt1486;
			if (var3 == 1) {
				var0.anInt1934 = 0;
				var0.anInt1935 = 0;
				var0.anInt1936 = var2;
				var0.anInt1958 = 0;
			}

			if (var3 == 2) {
				var0.anInt1958 = 0;
			}
		} else if (var1 == -1 || var0.animation == -1
				|| Node_Sub6.getSequenceType(var1).anInt1480 >= Node_Sub6.getSequenceType(var0.animation).anInt1480) {
			var0.animation = var1;
			var0.anInt1934 = 0;
			var0.anInt1935 = 0;
			var0.anInt1936 = var2;
			var0.anInt1958 = 0;
			var0.anInt1957 = var0.queueSize;
		}

	}

	Class43() throws Throwable {
		throw new Error();
	}

}
