
public class Class90 implements Runnable {

	static Deque aDeque717 = new Deque();
	static Deque aDeque718 = new Deque();
	public static int anInt719 = 0;
	public static Object anObject720 = new Object();
	static Timer aClass66_721;
	static int chunkBaseY;

	public void run() {
		try {
			while (true) {
				Deque var1 = aDeque718;
				Node_Sub9 var2;
				synchronized (var1) {
					var2 = (Node_Sub9) aDeque718.getFront();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt1338 * 1215410337 == 0) {
						var2.aClass62_1336.method303((int) var2.key, var2.aByteArray1340, var2.aByteArray1340.length);
						var1 = aDeque718;
						synchronized (var1) {
							var2.unlink();
						}
					} else if (1215410337 * var2.anInt1338 == 1) {
						var2.aByteArray1340 = var2.aClass62_1336.method302((int) var2.key);
						var1 = aDeque718;
						synchronized (var1) {
							aDeque717.method475(var2);
						}
					}

					var14 = anObject720;
					synchronized (var14) {
						if (anInt719 * 1638013353 <= 1) {
							anInt719 = 0;
							anObject720.notifyAll();
							return;
						}

						anInt719 = 1666340504;
					}
				} else {
					Class96_Sub1.sleep(100L);
					var14 = anObject720;
					synchronized (var14) {
						if (anInt719 * 1638013353 <= 1) {
							anInt719 = 0;
							anObject720.notifyAll();
							return;
						}

						anInt719 -= 9935513;
					}
				}
			}
		} catch (Exception var13) {
			Class79.error((String) null, var13);
		}
	}
}
