public final class Class46 {

	byte[] aByteArray467;
	int anInt470;
	byte[] aByteArray471;
	int anInt473;
	int anInt476;
	int anInt477;
	byte aByte478;
	int anInt479;
	int anInt480;
	int anInt481;
	int anInt482;
	int anInt484;
	int anInt488;
	int anInt492;
	int anInt501;
	int anInt502;
	int anInt465 = 6;
	int anInt466 = 16;
	int anInt468 = 18002;
	int anInt469 = 50;
	int anInt472 = 4096;
	int anInt474 = 258;
	boolean[] aBoolArray475 = new boolean[256];
	int anInt483 = 0;
	int[] anIntArray485 = new int[256];
	int anInt486 = 0;
	int[] anIntArray487 = new int[257];
	byte[] aByteArray489 = new byte[4096];
	boolean[] aBoolArray490 = new boolean[16];
	byte[] aByteArray491 = new byte[256];
	int[] anIntArray493 = new int[16];
	byte[] aByteArray494 = new byte[18002];
	byte[] aByteArray495 = new byte[18002];
	byte[][] aByteArrayArray496 = new byte[6][258];
	int[][] anIntArrayArray497 = new int[6][258];
	int[][] anIntArrayArray498 = new int[6][258];
	int[][] anIntArrayArray499 = new int[6][258];
	int[] anIntArray500 = new int[6];

	public static String decodeCESU8(byte[] bytes, int offset, int length) {
		char[] chars = new char[length];
		int count = 0;
		int var6 = offset;

		int val;
		for (int var8 = length + offset; var6 < var8; chars[count++] = (char) val) {
			int var5 = bytes[var6++] & 0xff;
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
					if (var6 + 1 < var8 && (bytes[var6] & 0xc0) == 128 && (bytes[var6 + 1] & 0xc0) == 128) {
						val = (var5 & 0xf) << 12 | (bytes[var6++] & 0x3f) << 6 | bytes[var6++] & 0x3f;
						if (val < 2048) {
							val = '\ufffd';
						}
					} else {
						val = '\ufffd';
					}
				} else if (var5 < 248) {
					if (var6 + 2 < var8 && (bytes[var6] & 0xc0) == 128 && (bytes[var6 + 1] & 0xc0) == 128
							&& (bytes[var6 + 2] & 0xc0) == 128) {
						val = (var5 & 0x7) << 18 | (bytes[var6++] & 0x3f) << 12 | (bytes[var6++] & 0x3f) << 6
								| bytes[var6++] & 0x3f;
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
			} else if (var6 < var8 && (bytes[var6] & 0xc0) == 128) {
				val = (var5 & 0x1f) << 6 | bytes[var6++] & 0x3f;
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
