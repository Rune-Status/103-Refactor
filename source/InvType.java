
public class InvType extends DualNode {

	static NodeMap invs = new NodeMap(64);
	public int anInt1501 = 0;
	static CacheIndex clientScriptsIndex;
	static int[] landRegionFielIds;
	static int menuY;

	void method692(ByteBuf var1, int var2) {
		if (var2 == 2) {
			this.anInt1501 = var1.getUShort() * -683865097;
		}

	}

	static final int method693(Class124 var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch (var0.ordinal * -1635059495) {
			case 4:
				return 20;
			default:
				return 12;
			}
		}
	}

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method692(var1, var2);
		}
	}

	static char method695(char var0, int var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		return var0 == 338 ? 'O' : (var0 == 339 ? 'o' : (var0 == 376 ? 'Y' : var0));
	}

}
