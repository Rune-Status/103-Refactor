import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class TaskManager implements Runnable {

	ISoundSystem system;
	Task currentTask = null;
	Task cachedTask = null;
	boolean closed = false;
	static String javaVendor;
	static String javaVersion;
	EventQueue sysEventQueue;
	Thread thread;

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
				int var6 = task.type;
				if (var6 == 1) {
					task.value = new Socket(InetAddress.getByName((String) task.object), task.stack);
				} else if (var6 == 2) {
					Thread host = new Thread((Runnable) task.object);
					host.setDaemon(true);
					host.start();
					host.setPriority(task.stack);
					task.value = host;
				} else if (var6 == 4) {
					task.value = new DataInputStream(((URL) task.object).openStream());
				} else if (var6 == 3) {
					String host1 = (task.stack >> 24 & 0xff) + "." + (task.stack >> 16 & 0xff) + "."
							+ (task.stack >> 8 & 0xff) + "." + (task.stack & 0xff);
					task.value = InetAddress.getByName(host1).getHostName();
				}

				task.status = 1;
			} catch (ThreadDeath var5) {
				throw var5;
			} catch (Throwable var61) {
				task.status = 2;
			}
		}
	}

	final Task createTask(int t, int s, Object o) {
		Task type = new Task();
		type.type = t;
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

	public final ISoundSystem system() {
		return this.system;
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
		return var0 >> 11 & 0x3f;
	}

	public static String method315(int var0) {
		return (var0 >> 24 & 0xff) + "." + (var0 >> 16 & 0xff) + "." + (var0 >> 8 & 0xff) + "." + (var0 & 0xff);
	}

}
