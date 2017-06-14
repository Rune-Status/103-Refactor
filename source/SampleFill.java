public class SampleFill {

	SampleFill() throws Throwable {
		throw new Error();
	}

	public static void fill(int[] ints, int offset, int length) {
		for (length = offset + length - 7; offset < length; ints[offset++] = 0) {
			ints[offset++] = 0;
			ints[offset++] = 0;
			ints[offset++] = 0;
			ints[offset++] = 0;
			ints[offset++] = 0;
			ints[offset++] = 0;
			ints[offset++] = 0;
		}

		for (length += 7; offset < length; ints[offset++] = 0) {
			;
		}

	}

}
