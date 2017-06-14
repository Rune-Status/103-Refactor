public class SoundTask implements Runnable {

	TaskManager manager;
	volatile AbstractSoundSystem[] systems = new AbstractSoundSystem[2];
	volatile boolean shutdown = false;
	volatile boolean running = false;

	public void run() {
		this.running = true;

		try {
			try {
				while (!this.shutdown) {
					for (int i = 0; i < 2; i++) {
						AbstractSoundSystem system = this.systems[i];
						if (system != null) {
							system.method82();
						}
					}

					Class96_Sub1.sleep(10L);
					GraphicsStub.method935(this.manager, (Object) null);
				}
			} catch (Exception var61) {
				Class79.error((String) null, var61);
				this.running = false;
				return;
			}

			this.running = false;
		} finally {
			this.running = false;
		}
	}

}
