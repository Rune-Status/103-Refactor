
public class Class19 implements Runnable {

	Class63 aClass63_263;
	volatile Class8[] aClass8Array264 = new Class8[2];
	volatile boolean aBool265 = false;
	volatile boolean aBool266 = false;

	public void run() {
		this.aBool266 = true;

		try {
			try {
				while (!this.aBool265) {
					for (int var1 = 0; var1 < 2; ++var1) {
						Class8 var2 = this.aClass8Array264[var1];
						if (var2 != null) {
							var2.method82();
						}
					}

					Class96_Sub1.sleep(10L);
					GraphicsStub.method935(this.aClass63_263, (Object) null);
				}
			} catch (Exception var6) {
				Class79.method345((String) null, var6);
				this.aBool266 = false;
				return;
			}

			this.aBool266 = false;
		} finally {
			this.aBool266 = false;
		}
	}

}
