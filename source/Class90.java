public class Class90 implements Runnable {

	static Timer timer;
	static int chunkBaseY;
	public static int anInt719 = 0;
	static Deque aDeque717 = new Deque();
	static Deque aDeque718 = new Deque();
	public static Object anObject720 = new Object();

	public void run() {
		try {
			while (true) {
				Deque var13 = aDeque718;
				Node_Sub9 var2;
				synchronized (var13) {
					var2 = (Node_Sub9) aDeque718.getFront();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt1338 == 0) {
						var2.aClass62_1336.method303((int) var2.key, var2.aByteArray1340, var2.aByteArray1340.length);
						var13 = aDeque718;
						synchronized (var13) {
							var2.unlink();
						}
					} else if (var2.anInt1338 == 1) {
						var2.aByteArray1340 = var2.aClass62_1336.method302((int) var2.key);
						var13 = aDeque718;
						synchronized (var13) {
							aDeque717.method475(var2);
						}
					}

					var14 = anObject720;
					synchronized (var14) {
						if (anInt719 <= 1) {
							anInt719 = 0;
							anObject720.notifyAll();
							return;
						}

						anInt719 = 600;
					}
				} else {
					Class96_Sub1.sleep(100L);
					var14 = anObject720;
					synchronized (var14) {
						if (anInt719 <= 1) {
							anInt719 = 0;
							anObject720.notifyAll();
							return;
						}

						--anInt719;
					}
				}
			}
		} catch (Exception var141) {
			Class79.error((String) null, var141);
		}
	}

}
