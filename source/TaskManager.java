import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class TaskManager implements Runnable {

	Interface2 anInterface2_574;
	static String javaVersion;
	Thread thread;
	Task currentTask = null;
	boolean closed = false;
	static String javaVendor;
	Task cachedTask = null;
	EventQueue sysEventQueue;

	public final void run() {
		while (true) {
			Task task;
			synchronized (this) {
				while (true) {
					if (this.closed) {
						return;
					}

					if (this.currentTask != null) {
						task = this.currentTask;
						this.currentTask = this.currentTask.task;
						if (this.currentTask == null) {
							this.cachedTask = null;
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
				int type = 980815541 * task.type;
				if (type == 1) {
					task.value = new Socket(InetAddress.getByName((String) task.object), task.stack);
				} else if (type == 2) {
					Thread thread = new Thread((Runnable) task.object);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(task.stack);
					task.value = thread;
				} else if (type == 4) {
					task.value = new DataInputStream(((URL) task.object).openStream());
				} else if (type == 3) {
					String host = (task.stack >> 24 & 0xFF) + "." + (task.stack >> 16 & 0xFF) + "."
							+ (task.stack >> 8 & 0xFF) + "." + (task.stack & 0xFF);
					task.value = InetAddress.getByName(host).getHostName();
				}

				task.status = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var6) {
				task.status = 2;
			}
		}
	}

	final Task createTask(int t, int s, Object o) {
		Task type = new Task();
		type.type = 589754269 * t;
		type.stack = s;
		type.object = o;
		synchronized (this) {
			if (this.cachedTask != null) {
				this.cachedTask.task = type;
				this.cachedTask = type;
			} else {
				this.cachedTask = this.currentTask = type;
			}

			this.notify();
			return type;
		}
	}

	public final Task createHost(int hash) {
		return this.createTask(3, hash, (Object) null);
	}

	public final Task createURL(URL url) {
		return this.createTask(4, 0, url);
	}

	public final Interface2 method310() {
		return this.anInterface2_574;
	}

	public final Task createSocket(String host, int port) {
		return this.createTask(1, port, host);
	}

	final void join() {
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
			;
		}

	}

	public final Task createRunnable(Runnable runnable, int priority) {
		return this.createTask(2, priority, runnable);
	}

	TaskManager() {
		javaVendor = "Unknown";
		javaVersion = "1.1";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var3) {
			;
		}

		try {
			this.sysEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var2) {
			;
		}

		this.closed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	public static int method314(int var0) {
		return var0 >> 11 & 63;
	}

	public static String method315(int var0) {
		return (var0 >> 24 & 0xFF) + "." + (var0 >> 16 & 0xFF) + "." + (var0 >> 8 & 0xFF) + "." + (var0 & 0xFF);
	}
}
