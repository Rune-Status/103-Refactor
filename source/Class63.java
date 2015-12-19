import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class63 implements Runnable {

	Interface2 anInterface2_574;
	static String aString575;
	Thread aThread576;
	Class61 aClass61_577 = null;
	boolean aBool578 = false;
	static String aString579;
	Class61 aClass61_580 = null;
	EventQueue anEventQueue581;

	public final void run() {
		while (true) {
			Class61 var2;
			synchronized (this) {
				while (true) {
					if (this.aBool578) {
						return;
					}

					if (this.aClass61_577 != null) {
						var2 = this.aClass61_577;
						this.aClass61_577 = this.aClass61_577.aClass61_562;
						if (this.aClass61_577 == null) {
							this.aClass61_580 = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var7) {
						;
					}
				}
			}

			try {
				int var1 = 980815541 * var2.anInt561;
				if (var1 == 1) {
					var2.anObject566 = new Socket(InetAddress.getByName((String) var2.anObject565), var2.anInt564);
				} else if (var1 == 2) {
					Thread var3 = new Thread((Runnable) var2.anObject565);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var2.anInt564);
					var2.anObject566 = var3;
				} else if (var1 == 4) {
					var2.anObject566 = new DataInputStream(((URL) var2.anObject565).openStream());
				} else if (var1 == 3) {
					String var9 = (var2.anInt564 >> 24 & 255) + "." + (var2.anInt564 >> 16 & 255) + "."
							+ (var2.anInt564 >> 8 & 255) + "." + (var2.anInt564 & 255);
					var2.anObject566 = InetAddress.getByName(var9).getHostName();
				}

				var2.anInt563 = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				var2.anInt563 = 2;
			}
		}
	}

	final Class61 method307(int var1, int var2, int var3, Object var4) {
		Class61 var5 = new Class61();
		var5.anInt561 = 589754269 * var1;
		var5.anInt564 = var2;
		var5.anObject565 = var4;
		synchronized (this) {
			if (this.aClass61_580 != null) {
				this.aClass61_580.aClass61_562 = var5;
				this.aClass61_580 = var5;
			} else {
				this.aClass61_580 = this.aClass61_577 = var5;
			}

			this.notify();
			return var5;
		}
	}

	public final Class61 method308(int var1) {
		return this.method307(3, var1, 0, (Object) null);
	}

	public final Class61 method309(URL var1) {
		return this.method307(4, 0, 0, var1);
	}

	public final Interface2 method310() {
		return this.anInterface2_574;
	}

	public final Class61 method311(String var1, int var2) {
		return this.method307(1, var2, 0, var1);
	}

	final void method312() {
		synchronized (this) {
			this.aBool578 = true;
			this.notifyAll();
		}

		try {
			this.aThread576.join();
		} catch (InterruptedException var3) {
			;
		}

	}

	public final Class61 method313(Runnable var1, int var2) {
		return this.method307(2, var2, 0, var1);
	}

	Class63() {
		aString579 = "Unknown";
		aString575 = "1.1";

		try {
			aString579 = System.getProperty("java.vendor");
			aString575 = System.getProperty("java.version");
		} catch (Exception var3) {
			;
		}

		try {
			this.anEventQueue581 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var2) {
			;
		}

		this.aBool578 = false;
		this.aThread576 = new Thread(this);
		this.aThread576.setPriority(10);
		this.aThread576.setDaemon(true);
		this.aThread576.start();
	}

	public static int method314(int var0) {
		return var0 >> 11 & 63;
	}

	public static String method315(int var0) {
		return (var0 >> 24 & 255) + "." + (var0 >> 16 & 255) + "." + (var0 >> 8 & 255) + "." + (var0 & 255);
	}
}
