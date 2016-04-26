import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Connection implements Runnable {

	static short[] aShortArray560;
	boolean closed = false;
	Task task;
	boolean exception = false;
	byte[] buffer;
	int position = 0;
	int streamOffset = 0;
	TaskManager manager;
	Socket socket;
	InputStream inStream;
	OutputStream outStream;

	public void shutdown() {
		if (!this.closed) {
			synchronized (this) {
				this.closed = true;
				this.notifyAll();
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					Class96_Sub1.sleep(1L);
				}

				if (this.task.status == 1) {
					try {
						((Thread) this.task.value).join();
					} catch (InterruptedException var3) {
						;
					}
				}
			}

			this.task = null;
		}

	}

	public int avail() throws IOException {
		return !this.closed ? this.inStream.available() : 0;
	}

	public void read(byte[] bytes, int offset, int length) throws IOException {
		if (!this.closed) {
			while (length > 0) {
				int read = this.inStream.read(bytes, offset, length);
				if (read <= 0) {
					throw new EOFException();
				}

				offset += read;
				length -= read;
			}
		}

	}

	public void write(byte[] bytes, int offset, int length) throws IOException {
		if (!this.closed) {
			if (this.exception) {
				this.exception = false;
				throw new IOException();
			}

			if (this.buffer == null) {
				this.buffer = new byte[5000];
			}

			synchronized (this) {
				for (int index = 0; index < length; index++) {
					this.buffer[this.position] = bytes[offset + index];
					this.position = (this.position + 1) % 5000;
					if (this.position == (this.streamOffset + 4900) % 5000) {
						throw new IOException();
					}
				}

				if (this.task == null) {
					this.task = this.manager.createRunnable(this, 3);
				}

				this.notifyAll();
			}
		}

	}

	public void run() {
		while (true) {
			while (true) {
				try {
					int var11;
					int length;
					label90: {
						synchronized (this) {
							label91: {
								if (this.streamOffset == this.position) {
									if (this.closed) {
										break label91;
									}

									try {
										this.wait();
									} catch (InterruptedException var9) {
										;
									}
								}

								var11 = this.streamOffset;
								if (this.position >= this.streamOffset) {
									length = this.position - this.streamOffset;
								} else {
									length = 5000 - this.streamOffset;
								}
								break label90;
							}
						}

						try {
							if (this.inStream != null) {
								this.inStream.close();
							}

							if (this.outStream != null) {
								this.outStream.close();
							}

							if (this.socket != null) {
								this.socket.close();
							}
						} catch (IOException var6) {
							;
						}

						this.buffer = null;
						break;
					}

					if (length > 0) {
						try {
							this.outStream.write(this.buffer, var11, length);
						} catch (IOException var8) {
							this.exception = true;
						}

						this.streamOffset = (this.streamOffset + length) % 5000;

						try {
							if (this.position == this.streamOffset) {
								this.outStream.flush();
							}
						} catch (IOException var7) {
							this.exception = true;
						}
					}
				} catch (Exception var111) {
					Class79.error((String) null, var111);
					break;
				}
			}

			return;
		}
	}

	public int read() throws IOException {
		return !this.closed ? this.inStream.read() : 0;
	}

	public static GameType[] gameTypes() {
		return new GameType[] { GameType.OLDSCAPE, GameType.GAME5, GameType.GAME3, GameType.STELLARDAWN, GameType.GAME4,
				GameType.RUNESCAPE };
	}

	public Connection(Socket var1, TaskManager var2) throws IOException {
		this.manager = var2;
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(16384);
		this.socket.setSendBufferSize(16384);
		this.inStream = this.socket.getInputStream();
		this.outStream = this.socket.getOutputStream();
	}

	static final void method301() {
		CollisionMap.method243();
		if (SpotAnimType.aWidget1446 == null && Client.aWidget2141 == null) {
			int var2 = Class74.anInt627;
			int var0;
			int var1;
			int var3;
			int var4;
			int var6;
			int var8;
			if (Client.menuOpen) {
				if (var2 != 1 && (ClanMate.aBool1221 || var2 != 4)) {
					var1 = Class74.anInt621;
					var3 = Class74.anInt622;
					if (var1 < Class7.menuX - 10 || var1 > Class7.menuX + 10 + Class4.menuWidth
							|| var3 < InvType.menuY - 10 || var3 > Class4.menuHeight + 10 + InvType.menuY) {
						Client.menuOpen = false;
						IdentKitType.method668(Class7.menuX, InvType.menuY, Class4.menuWidth, Class4.menuHeight);
					}
				}

				if (var2 == 1 || !ClanMate.aBool1221 && var2 == 4) {
					var1 = Class7.menuX;
					var3 = InvType.menuY;
					var4 = Class4.menuWidth;
					int var91 = Class74.anInt628;
					int var101 = Class74.anInt629;
					var6 = -1;

					for (var0 = 0; var0 < Client.menuItemCount; var0++) {
						var8 = (Client.menuItemCount - 1 - var0) * 15 + var3 + 31;
						if (var91 > var1 && var91 < var1 + var4 && var101 > var8 - 13 && var101 < var8 + 3) {
							var6 = var0;
						}
					}

					if (var6 != -1) {
						KeyFocusListener.method330(var6);
					}

					Client.menuOpen = false;
					IdentKitType.method668(Class7.menuX, InvType.menuY, Class4.menuWidth, Class4.menuHeight);
				}
			} else {
				if ((var2 == 1 || !ClanMate.aBool1221 && var2 == 4) && Client.menuItemCount > 0) {
					var1 = Client.menuOpcodes[Client.menuItemCount - 1];
					if (var1 == 39 || var1 == 40 || var1 == 41 || var1 == 42 || var1 == 43 || var1 == 33 || var1 == 34
							|| var1 == 35 || var1 == 36 || var1 == 37 || var1 == 38 || var1 == 1005) {
						var3 = Client.menuArg1[Client.menuItemCount - 1];
						var4 = Client.menuArg2[Client.menuItemCount - 1];
						Widget var9 = Class94.getWidget(var4);
						var6 = Class30.getWidgetConfig(var9);
						boolean var10 = (var6 >> 28 & 0x1) != 0;
						if (var10 || Class58.method291(Class30.getWidgetConfig(var9))) {
							if (SpotAnimType.aWidget1446 != null && !Client.aBool2103 && Client.anInt2144 != 1
									&& !Class39.method217(Client.menuItemCount - 1) && Client.menuItemCount > 0) {
								var0 = Client.anInt2131;
								var8 = Client.anInt2101;
								Node_Sub9.method563(CacheIndex.aClass4_1333, var0, var8);
								CacheIndex.aClass4_1333 = null;
							}

							Client.aBool2103 = false;
							Client.anInt2092 = 0;
							if (SpotAnimType.aWidget1446 != null) {
								Class68.method326(SpotAnimType.aWidget1446);
							}

							SpotAnimType.aWidget1446 = Class94.getWidget(var4);
							Client.anInt2100 = var3;
							Client.anInt2131 = Class74.anInt628;
							Client.anInt2101 = Class74.anInt629;
							if (Client.menuItemCount > 0) {
								var0 = Client.menuItemCount - 1;
								CacheIndex.aClass4_1333 = new Class4();
								CacheIndex.aClass4_1333.anInt109 = Client.menuArg1[var0];
								CacheIndex.aClass4_1333.anInt106 = Client.menuArg2[var0];
								CacheIndex.aClass4_1333.anInt107 = Client.menuOpcodes[var0];
								CacheIndex.aClass4_1333.anInt105 = Client.menuArg0[var0];
								CacheIndex.aClass4_1333.aString108 = Client.menuActions[var0];
							}

							Class68.method326(SpotAnimType.aWidget1446);
							return;
						}
					}
				}

				if ((var2 == 1 || !ClanMate.aBool1221 && var2 == 4)
						&& (Client.anInt2144 == 1 && Client.menuItemCount > 2
								|| Class39.method217(Client.menuItemCount - 1))) {
					var2 = 2;
				}

				if ((var2 == 1 || !ClanMate.aBool1221 && var2 == 4) && Client.menuItemCount > 0) {
					KeyFocusListener.method330(Client.menuItemCount - 1);
				}

				if (var2 == 2 && Client.menuItemCount > 0) {
					MilliTimer.method554(Class74.anInt628, Class74.anInt629);
				}
			}
		}

	}

}
