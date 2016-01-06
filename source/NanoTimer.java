
public class NanoTimer extends Timer {

	long nanoTime = System.nanoTime() * 7835294065936094705L;

	void method321() {
		this.nanoTime = System.nanoTime() * 7835294065936094705L;
	}

	int method322(int var1, int millis) {
		long nano = (long) millis * 1000000L;
		long elapsed = this.nanoTime * -5715808306233115887L - System.nanoTime();
		if (elapsed < nano) {
			elapsed = nano;
		}

		Class96_Sub1.sleep(elapsed / 1000000L);
		long current = System.nanoTime();

		int index;
		for (index = 0; index < 10
				&& (index < 1 || -5715808306233115887L * this.nanoTime < current); this.nanoTime += 2627139815237000768L
						* (long) var1) {
			++index;
		}

		if (-5715808306233115887L * this.nanoTime < current) {
			this.nanoTime = 7835294065936094705L * current;
		}

		return index;
	}

}
