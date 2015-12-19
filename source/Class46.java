
public final class Class46 {

	int anInt465 = 6;
	int anInt466 = 16;
	byte[] aByteArray467;
	int anInt468 = 18002;
	int anInt469 = 50;
	int anInt470;
	byte[] aByteArray471;
	int anInt472 = 4096;
	int anInt473;
	int anInt474 = 258;
	boolean[] aBoolArray475 = new boolean[256];
	int anInt476;
	int anInt477;
	byte aByte478;
	int anInt479;
	int anInt480;
	int anInt481;
	int anInt482;
	int anInt483 = 0;
	int anInt484;
	int[] anIntArray485 = new int[256];
	int anInt486 = 0;
	int[] anIntArray487 = new int[257];
	int anInt488;
	byte[] aByteArray489 = new byte[4096];
	boolean[] aBoolArray490 = new boolean[16];
	byte[] aByteArray491 = new byte[256];
	int anInt492;
	int[] anIntArray493 = new int[16];
	byte[] aByteArray494 = new byte[18002];
	byte[] aByteArray495 = new byte[18002];
	byte[][] aByteArrayArray496 = new byte[6][258];
	int[][] anIntArrayArray497 = new int[6][258];
	int[][] anIntArrayArray498 = new int[6][258];
	int[][] anIntArrayArray499 = new int[6][258];
	int[] anIntArray500 = new int[6];
	int anInt501;
	int anInt502;

	public static String getJagString(byte[] bytes, int offset, int length) {
		char[] chars = new char[length];
		int count = 0;
		int var6 = offset;

		int val;
		for (int var8 = length + offset; var6 < var8; chars[count++] = (char) val) {
			int var5 = bytes[var6++] & 255;
			if (var5 < 128) {
				if (var5 == 0) {
					val = '\ufffd';
				} else {
					val = var5;
				}
			} else if (var5 < 192) {
				val = '\ufffd';
			} else if (var5 >= 224) {
				if (var5 < 240) {
					if (1 + var6 < var8 && (bytes[var6] & 192) == 128 && (bytes[var6 + 1] & 192) == 128) {
						val = (var5 & 15) << 12 | (bytes[var6++] & 63) << 6 | bytes[var6++] & 63;
						if (val < 2048) {
							val = '\ufffd';
						}
					} else {
						val = '\ufffd';
					}
				} else if (var5 < 248) {
					if (var6 + 2 < var8 && (bytes[var6] & 192) == 128 && (bytes[1 + var6] & 192) == 128
							&& (bytes[var6 + 2] & 192) == 128) {
						val = (var5 & 7) << 18 | (bytes[var6++] & 63) << 12 | (bytes[var6++] & 63) << 6
								| bytes[var6++] & 63;
						if (val >= 65536 && val <= 1114111) {
							val = '\ufffd';
						} else {
							val = '\ufffd';
						}
					} else {
						val = '\ufffd';
					}
				} else {
					val = '\ufffd';
				}
			} else if (var6 < var8 && (bytes[var6] & 192) == 128) {
				val = (var5 & 31) << 6 | bytes[var6++] & 63;
				if (val < 128) {
					val = '\ufffd';
				}
			} else {
				val = '\ufffd';
			}
		}

		return new String(chars, 0, count);
	}
}
