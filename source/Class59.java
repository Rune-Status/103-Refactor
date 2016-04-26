public class Class59 {

	static Class16 aClass16_548;
	static CacheIndex midiInstrumentsIndex;

	Class59() throws Throwable {
		throw new Error();
	}

	static void method292(int var0, IndexTable var1, CacheIndex var2) {
		byte[] var3 = null;
		Deque var4 = Class90.aDeque718;
		synchronized (var4) {
			for (Node_Sub9 var5 = (Node_Sub9) Class90.aDeque718
					.getFront(); var5 != null; var5 = (Node_Sub9) Class90.aDeque718.getNext()) {
				if (var5.key == (long) var0 && var5.aClass62_1336 == var1 && var5.anInt1338 == 0) {
					var3 = var5.aByteArray1340;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.method560(var1, var0, var3, true);
		} else {
			byte[] var8 = var1.method302(var0);
			var2.method560(var1, var0, var8, true);
		}

	}

	static final void method293() {
		int[] var0 = GPI.localPlayerIndices;

		int var2;
		for (var2 = 0; var2 < GPI.localPlayerCount; var2++) {
			Player var4 = Client.playerArray[var0[var2]];
			if (var4 != null && var4.anInt1927 > 0) {
				--var4.anInt1927;
				if (var4.anInt1927 == 0) {
					var4.overheadText = null;
				}
			}
		}

		for (var2 = 0; var2 < Client.anInt2225; var2++) {
			int var41 = Client.npcIndices[var2];
			Npc var3 = Client.npcArray[var41];
			if (var3 != null && var3.anInt1927 > 0) {
				--var3.anInt1927;
				if (var3.anInt1927 == 0) {
					var3.overheadText = null;
				}
			}
		}

	}

	static Class resolveType(String var0) throws ClassNotFoundException {
		return var0.equals("B") ? Byte.TYPE
				: (var0.equals("I") ? Integer.TYPE
						: (var0.equals("S") ? Short.TYPE
								: (var0.equals("J") ? Long.TYPE
										: (var0.equals("Z") ? Boolean.TYPE
												: (var0.equals("F") ? Float.TYPE
														: (var0.equals("D") ? Double.TYPE
																: (var0.equals("C") ? java.lang.Character.TYPE
																		: (var0.equals("void") ? Void.TYPE
																				: Class.forName(var0)))))))));
	}

}
