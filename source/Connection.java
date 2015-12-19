import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Connection implements Runnable {

	int position = 0;
	OutputStream outStream;
	Class63 aClass63_552;
	InputStream inStream;
	boolean closed = false;
	Class61 aClass61_555;
	Socket socket;
	int anInt557 = 0;
	byte[] buffer;
	boolean aBool559 = false;
	static short[] aShortArray560;

	public void shutdown() {
		if (!this.closed) {
			synchronized (this) {
				this.closed = true;
				this.notifyAll();
			}

			if (this.aClass61_555 != null) {
				while (this.aClass61_555.anInt563 == 0) {
					Class96_Sub1.method500(1L);
				}

				if (this.aClass61_555.anInt563 == 1) {
					try {
						((Thread) this.aClass61_555.anObject566).join();
					} catch (InterruptedException var3) {
						;
					}
				}
			}

			this.aClass61_555 = null;
		}
	}

	public int avail() throws IOException {
		return !this.closed ? this.inStream.available() : 0;
	}

	public void read(byte[] var1, int var2, int var3) throws IOException {
		if (!this.closed) {
			while (var3 > 0) {
				int var4 = this.inStream.read(var1, var2, var3);
				if (var4 <= 0) {
					throw new EOFException();
				}

				var2 += var4;
				var3 -= var4;
			}

		}
	}

	public void write(byte[] bytes, int offset, int length) throws IOException {
		if (!this.closed) {
			if (this.aBool559) {
				this.aBool559 = false;
				throw new IOException();
			} else {
				if (this.buffer == null) {
					this.buffer = new byte[5000];
				}

				synchronized (this) {
					for (int index = 0; index < length; ++index) {
						this.buffer[this.position * 823862379] = bytes[offset + index];
						this.position = (this.position * 823862379 + 1) % 5000 * -1278318525;
						if (this.position * 823862379 == (4900 + this.anInt557 * -742805451) % 5000) {
							throw new IOException();
						}
					}

					if (this.aClass61_555 == null) {
						this.aClass61_555 = this.aClass63_552.method313(this, 3);
					}

					this.notifyAll();
				}
			}
		}
	}

	public void run() {
		while (true) {
			try {
				label79: {
					int var3;
					int var4;
					synchronized (this) {
						if (this.anInt557 * -742805451 == this.position * 823862379) {
							if (this.closed) {
								break label79;
							}

							try {
								this.wait();
							} catch (InterruptedException var9) {
								;
							}
						}

						var3 = -742805451 * this.anInt557;
						if (823862379 * this.position >= -742805451 * this.anInt557) {
							var4 = this.position * 823862379 - -742805451 * this.anInt557;
						} else {
							var4 = 5000 - this.anInt557 * -742805451;
						}
					}

					if (var4 <= 0) {
						continue;
					}

					try {
						this.outStream.write(this.buffer, var3, var4);
					} catch (IOException var8) {
						this.aBool559 = true;
					}

					this.anInt557 = (var4 + this.anInt557 * -742805451) % 5000 * 1649418781;

					try {
						if (this.position * 823862379 == -742805451 * this.anInt557) {
							this.outStream.flush();
						}
					} catch (IOException var7) {
						this.aBool559 = true;
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
				Class79.method345((String) null, var11);
			}

			return;
		}
	}

	public int method299() throws IOException {
		return !this.closed ? this.inStream.read() : 0;
	}

	public static Class77[] method300(int var0) {
		return new Class77[] { Class77.aClass77_651, Class77.aClass77_650, Class77.aClass77_648, Class77.aClass77_647,
				Class77.aClass77_649, Class77.aClass77_652 };
	}

	public Connection(Socket var1, Class63 var2) throws IOException {
		this.aClass63_552 = var2;
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(16384);
		this.socket.setSendBufferSize(16384);
		this.inStream = this.socket.getInputStream();
		this.outStream = this.socket.getOutputStream();
	}

	static final void method301() {
		Class47.method243();
		if (DualNode_Sub1.aWidget1446 == null) {
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
								|| var3 < DualNode_Sub5.menuY * 1745388413 - 10
								|| var3 > 10 + Class4.menuHeight * 1426002097 + DualNode_Sub5.menuY * 1745388413) {
							Client.menuOpen = false;
							DualNode_Sub2.method668(-1905311417 * Class7.menuX, 1745388413 * DualNode_Sub5.menuY,
									Class4.menuWidth * 1899383153, Class4.menuHeight * 1426002097);
						}
					}

					if (var2 == 1 || !ClanMate.aBool1221 && var2 == 4) {
						var1 = Class7.menuX * -1905311417;
						var3 = 1745388413 * DualNode_Sub5.menuY;
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
							Class71.method330(var6);
						}

						Client.menuOpen = false;
						DualNode_Sub2.method668(Class7.menuX * -1905311417, DualNode_Sub5.menuY * 1745388413,
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
								Widget var9 = Class94.method406(var4);
								var6 = Class30.getWidgetConfig(var9);
								boolean var10 = (var6 >> 28 & 1) != 0;
								if (!var10) {
									Class84 var10000 = (Class84) null;
									if (!Class58.method291(Class30.getWidgetConfig(var9), (byte) -60)) {
										break label250;
									}
								}

								if (DualNode_Sub1.aWidget1446 != null && !Client.aBool2103
										&& Client.anInt2144 * 1052316233 != 1
										&& !Class39.method217(1768430155 * Client.menuItemCount - 1)
										&& Client.menuItemCount * 1768430155 > 0) {
									var0 = Client.anInt2131 * -827759387;
									var8 = Client.anInt2101 * 45845103;
									Node_Sub9.method563(Class87_Sub1.aClass4_1333, var0, var8);
									Class87_Sub1.aClass4_1333 = null;
								}

								Client.aBool2103 = false;
								Client.anInt2092 = 0;
								if (DualNode_Sub1.aWidget1446 != null) {
									Class68.method326(DualNode_Sub1.aWidget1446);
								}

								DualNode_Sub1.aWidget1446 = Class94.method406(var4);
								Client.anInt2100 = 1355732049 * var3;
								Client.anInt2131 = -744800429 * Class74.anInt628;
								Client.anInt2101 = Class74.anInt629 * -1619983687;
								if (Client.menuItemCount * 1768430155 > 0) {
									var0 = 1768430155 * Client.menuItemCount - 1;
									Class87_Sub1.aClass4_1333 = new Class4();
									Class87_Sub1.aClass4_1333.anInt109 = -615722007 * Client.menuArg1[var0];
									Class87_Sub1.aClass4_1333.anInt106 = Client.menuArg2[var0] * 607560247;
									Class87_Sub1.aClass4_1333.anInt107 = Client.menuOpcodes[var0] * -859373123;
									Class87_Sub1.aClass4_1333.anInt105 = Client.menuArg0[var0] * -558864427;
									Class87_Sub1.aClass4_1333.aString108 = Client.menuActions[var0];
								}

								Class68.method326(DualNode_Sub1.aWidget1446);
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
						Class71.method330(Client.menuItemCount * 1768430155 - 1);
					}

					if (var2 == 2 && 1768430155 * Client.menuItemCount > 0) {
						Class66_Sub2.method554(Class74.anInt628 * -2040065729, 2090526775 * Class74.anInt629);
					}
				}

			}
		}
	}
}
