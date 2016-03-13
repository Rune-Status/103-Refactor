import java.util.zip.Inflater;

public class GZipDecompressor {

	static Connection js5Connection;
	static byte[][][] overlayRotations;
	Inflater inflator;
	public static AbstractIndex aClass87_516;

	public void decompress(ByteBuf buf, byte[] dest) {
		if (buf.payload[314639891 * buf.position] == 31 && buf.payload[1 + buf.position * 314639891] == -117) {
			if (this.inflator == null) {
				this.inflator = new Inflater(true);
			}

			try {
				this.inflator.setInput(buf.payload, 10 + 314639891 * buf.position,
						buf.payload.length - (8 + 10 + buf.position * 314639891));
				this.inflator.inflate(dest);
			} catch (Exception var4) {
				this.inflator.reset();
				throw new RuntimeException("");
			}

			this.inflator.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	static final void method249(boolean var0) {
		for (int var1 = 0; var1 < 727116725 * Client.anInt2225; ++var1) {
			Npc var2 = Client.npcArray[Client.npcIndices[var1]];
			int var4 = 536870912 + (Client.npcIndices[var1] << 14);
			if (var2 != null && var2.hasConfig() && var0 == var2.type.aBool1586 && var2.type.method803()) {
				int var5 = 1272643751 * var2.strictX >> 7;
				int var3 = -1801433343 * var2.strictY >> 7;
				if (var5 >= 0 && var5 < 104 && var3 >= 0 && var3 < 104) {
					if (-1776294967 * var2.anInt1915 == 1 && (var2.strictX * 1272643751 & 127) == 64
							&& (-1801433343 * var2.strictY & 127) == 64) {
						if (-1317183381 * Client.anInt2208 == Client.anIntArrayArray2121[var5][var3]) {
							continue;
						}

						Client.anIntArrayArray2121[var5][var3] = Client.anInt2208 * -1317183381;
					}

					if (!var2.type.aBool1602) {
						var4 -= Integer.MIN_VALUE;
					}

					InterfaceNode.landscape.method19(InterfaceNode.floorLevel * -747958745, 1272643751 * var2.strictX,
							-1801433343 * var2.strictY,
							NpcType.method802(var2.anInt1915 * -2013728192 - 64 + var2.strictX * 1272643751,
									var2.anInt1915 * -2013728192 - 64 + -1801433343 * var2.strictY,
									InterfaceNode.floorLevel * -747958745),
							60 + (var2.anInt1915 * -2013728192 - 64), var2, var2.anInt1937 * -2031663291, var4,
							var2.aBool1919);
				}
			}
		}

	}

	public static long method250(CharSequence var0) {
		long var1 = 0L;
		int var5 = var0.length();

		for (int var3 = 0; var3 < var5; ++var3) {
			var1 *= 37L;
			char var4 = var0.charAt(var3);
			if (var4 >= 65 && var4 <= 90) {
				var1 += (long) (1 + var4 - 65);
			} else if (var4 >= 97 && var4 <= 122) {
				var1 += (long) (1 + var4 - 97);
			} else if (var4 >= 48 && var4 <= 57) {
				var1 += (long) (27 + var4 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}
}
