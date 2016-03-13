import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Connection implements Runnable {

	int position = 0;
	OutputStream outStream;
	TaskManager manager;
	InputStream inStream;
	boolean closed = false;
	Task task;
	Socket socket;
	int streamOffset = 0;
	byte[] buffer;
	boolean exception = false;
	static short[] aShortArray560;

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
			} else {
				if (this.buffer == null) {
					this.buffer = new byte[5000];
				}

				synchronized (this) {
					for (int index = 0; index < length; ++index) {
						this.buffer[this.position * 823862379] = bytes[offset + index];
						this.position = (this.position * 823862379 + 1) % 5000 * -1278318525;
						if (this.position * 823862379 == (4900 + this.streamOffset * -742805451) % 5000) {
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
	}

	public void run() {
		while (true) {
			try {
				mainLoop: {
					int offset;
					int length;
					synchronized (this) {
						if (this.streamOffset * -742805451 == this.position * 823862379) {
							if (this.closed) {
								break mainLoop;
							}

							try {
								this.wait();
							} catch (InterruptedException var9) {
								;
							}
						}

						offset = -742805451 * this.streamOffset;
						if (823862379 * this.position >= -742805451 * this.streamOffset) {
							length = this.position * 823862379 - -742805451 * this.streamOffset;
						} else {
							length = 5000 - this.streamOffset * -742805451;
						}
					}

					if (length <= 0) {
						continue;
					}

					try {
						this.outStream.write(this.buffer, offset, length);
					} catch (IOException var8) {
						this.exception = true;
					}

					this.streamOffset = (length + this.streamOffset * -742805451) % 5000 * 1649418781;

					try {
						if (this.position * 823862379 == -742805451 * this.streamOffset) {
							this.outStream.flush();
						}
					} catch (IOException var7) {
						this.exception = true;
					}
					continue;
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
			} catch (Exception var11) {
				Class79.error((String) null, var11);
			}

			return;
		}
	}

	public int read() throws IOException {
		return !this.closed ? this.inStream.read() : 0;
	}

	public static GameType[] gameTypes() {
		return new GameType[] { GameType.OLDSCAPE, GameType.GAME5, GameType.GAME3, GameType.STELLARDAWN,
				GameType.GAME4, GameType.RUNESCAPE };
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
		if (SpotAnimType.aWidget1446 == null) {
			if (Client.aWidget2141 == null) {
				int var2 = 823601801 * Class74.anInt627;
				int var0;
				int var1;
				int var3;
				int var4;
				int var6;
				int var8;
				if (Client.menuOpen) {
					if (var2 != 1 && (ClanMate.aBool1221 || var2 != 4)) {
						var1 = Class74.anInt621 * -453286219;
						var3 = Class74.anInt622 * 103771565;
						if (var1 < -1905311417 * Class7.menuX - 10
								|| var1 > 10 + -1905311417 * Class7.menuX + Class4.menuWidth * 1899383153
								|| var3 < InvType.menuY * 1745388413 - 10
								|| var3 > 10 + Class4.menuHeight * 1426002097 + InvType.menuY * 1745388413) {
							Client.menuOpen = false;
							IdentKitType.method668(-1905311417 * Class7.menuX, 1745388413 * InvType.menuY,
									Class4.menuWidth * 1899383153, Class4.menuHeight * 1426002097);
						}
					}

					if (var2 == 1 || !ClanMate.aBool1221 && var2 == 4) {
						var1 = Class7.menuX * -1905311417;
						var3 = 1745388413 * InvType.menuY;
						var4 = 1899383153 * Class4.menuWidth;
						int var5 = -2040065729 * Class74.anInt628;
						int var7 = 2090526775 * Class74.anInt629;
						var6 = -1;

						for (var0 = 0; var0 < Client.menuItemCount * 1768430155; ++var0) {
							var8 = 15 * (Client.menuItemCount * 1768430155 - 1 - var0) + var3 + 31;
							if (var5 > var1 && var5 < var1 + var4 && var7 > var8 - 13 && var7 < 3 + var8) {
								var6 = var0;
							}
						}

						if (var6 != -1) {
							KeyFocusListener.method330(var6);
						}

						Client.menuOpen = false;
						IdentKitType.method668(Class7.menuX * -1905311417, InvType.menuY * 1745388413,
								Class4.menuWidth * 1899383153, 1426002097 * Class4.menuHeight);
					}
				} else {
					if ((var2 == 1 || !ClanMate.aBool1221 && var2 == 4) && Client.menuItemCount * 1768430155 > 0) {
						var1 = Client.menuOpcodes[Client.menuItemCount * 1768430155 - 1];
						if (var1 == 39 || var1 == 40 || var1 == 41 || var1 == 42 || var1 == 43 || var1 == 33
								|| var1 == 34 || var1 == 35 || var1 == 36 || var1 == 37 || var1 == 38 || var1 == 1005) {
							label250: {
								var3 = Client.menuArg1[1768430155 * Client.menuItemCount - 1];
								var4 = Client.menuArg2[1768430155 * Client.menuItemCount - 1];
								Widget var9 = Class94.getWidget(var4);
								var6 = Class30.getWidgetConfig(var9);
								boolean var10 = (var6 >> 28 & 1) != 0;
								if (!var10) {
									if (!Class58.method291(Class30.getWidgetConfig(var9))) {
										break label250;
									}
								}

								if (SpotAnimType.aWidget1446 != null && !Client.aBool2103
										&& Client.anInt2144 * 1052316233 != 1
										&& !Class39.method217(1768430155 * Client.menuItemCount - 1)
										&& Client.menuItemCount * 1768430155 > 0) {
									var0 = Client.anInt2131 * -827759387;
									var8 = Client.anInt2101 * 45845103;
									Node_Sub9.method563(CacheIndex.aClass4_1333, var0, var8);
									CacheIndex.aClass4_1333 = null;
								}

								Client.aBool2103 = false;
								Client.anInt2092 = 0;
								if (SpotAnimType.aWidget1446 != null) {
									Class68.method326(SpotAnimType.aWidget1446);
								}

								SpotAnimType.aWidget1446 = Class94.getWidget(var4);
								Client.anInt2100 = 1355732049 * var3;
								Client.anInt2131 = -744800429 * Class74.anInt628;
								Client.anInt2101 = Class74.anInt629 * -1619983687;
								if (Client.menuItemCount * 1768430155 > 0) {
									var0 = 1768430155 * Client.menuItemCount - 1;
									CacheIndex.aClass4_1333 = new Class4();
									CacheIndex.aClass4_1333.anInt109 = -615722007 * Client.menuArg1[var0];
									CacheIndex.aClass4_1333.anInt106 = Client.menuArg2[var0] * 607560247;
									CacheIndex.aClass4_1333.anInt107 = Client.menuOpcodes[var0] * -859373123;
									CacheIndex.aClass4_1333.anInt105 = Client.menuArg0[var0] * -558864427;
									CacheIndex.aClass4_1333.aString108 = Client.menuActions[var0];
								}

								Class68.method326(SpotAnimType.aWidget1446);
								return;
							}
						}
					}

					if ((var2 == 1 || !ClanMate.aBool1221 && var2 == 4)
							&& (Client.anInt2144 * 1052316233 == 1 && Client.menuItemCount * 1768430155 > 2
									|| Class39.method217(Client.menuItemCount * 1768430155 - 1))) {
						var2 = 2;
					}

					if ((var2 == 1 || !ClanMate.aBool1221 && var2 == 4) && 1768430155 * Client.menuItemCount > 0) {
						KeyFocusListener.method330(Client.menuItemCount * 1768430155 - 1);
					}

					if (var2 == 2 && 1768430155 * Client.menuItemCount > 0) {
						MilliTimer.method554(Class74.anInt628 * -2040065729, 2090526775 * Class74.anInt629);
					}
				}

			}
		}
	}
}
