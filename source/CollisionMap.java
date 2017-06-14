import java.applet.Applet;

public class CollisionMap {

	static Applet gameApplet;
	int xOffset = 0;
	int yOffset = 0;
	int width;
	int height;
	public int[][] flags;

	public void addObject(int tileX, int tileY, int var3, int var4, boolean solid) {
		int flags = 256;
		if (solid) {
			flags += 131072;
		}

		tileX -= this.xOffset;
		tileY -= this.yOffset;

		for (int x = tileX; x < var3 + tileX; x++) {
			if (x >= 0 && x < this.width) {
				for (int y = tileY; y < var4 + tileY; y++) {
					if (y >= 0 && y < this.height) {
						this.add(x, y, flags);
					}
				}
			}
		}

	}

	public void blockBridge(int x, int y) {
		x -= this.xOffset;
		y -= this.yOffset;
		this.flags[x][y] |= 2097152;
	}

	public void block(int x, int y) {
		x -= this.xOffset;
		y -= this.yOffset;
		this.flags[x][y] |= 262144;
	}

	void add(int x, int y, int flags) {
		this.flags[x][y] |= flags;
	}

	public void removeWall(int x, int y, int type, int rotation, boolean blocks) {
		x -= this.xOffset;
		y -= this.yOffset;
		if (type == 0) {
			if (rotation == 0) {
				this.remove(x, y, 128);
				this.remove(x - 1, y, 8);
			}

			if (rotation == 1) {
				this.remove(x, y, 2);
				this.remove(x, y + 1, 32);
			}

			if (rotation == 2) {
				this.remove(x, y, 8);
				this.remove(x + 1, y, 128);
			}

			if (rotation == 3) {
				this.remove(x, y, 32);
				this.remove(x, y - 1, 2);
			}
		}

		if (type == 1 || type == 3) {
			if (rotation == 0) {
				this.remove(x, y, 1);
				this.remove(x - 1, y + 1, 16);
			}

			if (rotation == 1) {
				this.remove(x, y, 4);
				this.remove(x + 1, y + 1, 64);
			}

			if (rotation == 2) {
				this.remove(x, y, 16);
				this.remove(x + 1, y - 1, 1);
			}

			if (rotation == 3) {
				this.remove(x, y, 64);
				this.remove(x - 1, y - 1, 4);
			}
		}

		if (type == 2) {
			if (rotation == 0) {
				this.remove(x, y, 130);
				this.remove(x - 1, y, 8);
				this.remove(x, y + 1, 32);
			}

			if (rotation == 1) {
				this.remove(x, y, 10);
				this.remove(x, y + 1, 32);
				this.remove(x + 1, y, 128);
			}

			if (rotation == 2) {
				this.remove(x, y, 40);
				this.remove(x + 1, y, 128);
				this.remove(x, y - 1, 2);
			}

			if (rotation == 3) {
				this.remove(x, y, 160);
				this.remove(x, y - 1, 2);
				this.remove(x - 1, y, 8);
			}
		}

		if (blocks) {
			if (type == 0) {
				if (rotation == 0) {
					this.remove(x, y, 65536);
					this.remove(x - 1, y, 4096);
				}

				if (rotation == 1) {
					this.remove(x, y, 1024);
					this.remove(x, y + 1, 16384);
				}

				if (rotation == 2) {
					this.remove(x, y, 4096);
					this.remove(x + 1, y, 65536);
				}

				if (rotation == 3) {
					this.remove(x, y, 16384);
					this.remove(x, y - 1, 1024);
				}
			}

			if (type == 1 || type == 3) {
				if (rotation == 0) {
					this.remove(x, y, 512);
					this.remove(x - 1, y + 1, 8192);
				}

				if (rotation == 1) {
					this.remove(x, y, 2048);
					this.remove(x + 1, y + 1, '\u8000');
				}

				if (rotation == 2) {
					this.remove(x, y, 8192);
					this.remove(x + 1, y - 1, 512);
				}

				if (rotation == 3) {
					this.remove(x, y, '\u8000');
					this.remove(x - 1, y - 1, 2048);
				}
			}

			if (type == 2) {
				if (rotation == 0) {
					this.remove(x, y, 66560);
					this.remove(x - 1, y, 4096);
					this.remove(x, y + 1, 16384);
				}

				if (rotation == 1) {
					this.remove(x, y, 5120);
					this.remove(x, y + 1, 16384);
					this.remove(x + 1, y, 65536);
				}

				if (rotation == 2) {
					this.remove(x, y, 20480);
					this.remove(x + 1, y, 65536);
					this.remove(x, y - 1, 1024);
				}

				if (rotation == 3) {
					this.remove(x, y, 81920);
					this.remove(x, y - 1, 1024);
					this.remove(x - 1, y, 4096);
				}
			}
		}

	}

	public void removeObject(int tileX, int tileY, int sizeX, int sizeY, int rotation, boolean solid) {
		int flag = 256;
		if (solid) {
			flag += 131072;
		}

		tileX -= this.xOffset;
		tileY -= this.yOffset;
		if (rotation == 1 || rotation == 3) {
			int w = sizeX;
			sizeX = sizeY;
			sizeY = w;
		}

		for (int x = tileX; x < sizeX + tileX; x++) {
			if (x >= 0 && x < this.width) {
				for (int y = tileY; y < tileY + sizeY; y++) {
					if (y >= 0 && y < this.height) {
						this.remove(x, y, flag);
					}
				}
			}
		}

	}

	void remove(int x, int y, int flags) {
		this.flags[x][y] &= ~flags;
	}

	public void unblock(int x, int y) {
		x -= this.xOffset;
		y -= this.yOffset;
		this.flags[x][y] &= -262145;
	}

	public void addWall(int x, int y, int type, int rotation, boolean blocks) {
		x -= this.xOffset;
		y -= this.yOffset;
		if (type == 0) {
			if (rotation == 0) {
				this.add(x, y, 128);
				this.add(x - 1, y, 8);
			}

			if (rotation == 1) {
				this.add(x, y, 2);
				this.add(x, y + 1, 32);
			}

			if (rotation == 2) {
				this.add(x, y, 8);
				this.add(x + 1, y, 128);
			}

			if (rotation == 3) {
				this.add(x, y, 32);
				this.add(x, y - 1, 2);
			}
		}

		if (type == 1 || type == 3) {
			if (rotation == 0) {
				this.add(x, y, 1);
				this.add(x - 1, y + 1, 16);
			}

			if (rotation == 1) {
				this.add(x, y, 4);
				this.add(x + 1, y + 1, 64);
			}

			if (rotation == 2) {
				this.add(x, y, 16);
				this.add(x + 1, y - 1, 1);
			}

			if (rotation == 3) {
				this.add(x, y, 64);
				this.add(x - 1, y - 1, 4);
			}
		}

		if (type == 2) {
			if (rotation == 0) {
				this.add(x, y, 130);
				this.add(x - 1, y, 8);
				this.add(x, y + 1, 32);
			}

			if (rotation == 1) {
				this.add(x, y, 10);
				this.add(x, y + 1, 32);
				this.add(x + 1, y, 128);
			}

			if (rotation == 2) {
				this.add(x, y, 40);
				this.add(x + 1, y, 128);
				this.add(x, y - 1, 2);
			}

			if (rotation == 3) {
				this.add(x, y, 160);
				this.add(x, y - 1, 2);
				this.add(x - 1, y, 8);
			}
		}

		if (blocks) {
			if (type == 0) {
				if (rotation == 0) {
					this.add(x, y, 65536);
					this.add(x - 1, y, 4096);
				}

				if (rotation == 1) {
					this.add(x, y, 1024);
					this.add(x, y + 1, 16384);
				}

				if (rotation == 2) {
					this.add(x, y, 4096);
					this.add(x + 1, y, 65536);
				}

				if (rotation == 3) {
					this.add(x, y, 16384);
					this.add(x, y - 1, 1024);
				}
			}

			if (type == 1 || type == 3) {
				if (rotation == 0) {
					this.add(x, y, 512);
					this.add(x - 1, y + 1, 8192);
				}

				if (rotation == 1) {
					this.add(x, y, 2048);
					this.add(x + 1, y + 1, '\u8000');
				}

				if (rotation == 2) {
					this.add(x, y, 8192);
					this.add(x + 1, y - 1, 512);
				}

				if (rotation == 3) {
					this.add(x, y, '\u8000');
					this.add(x - 1, y - 1, 2048);
				}
			}

			if (type == 2) {
				if (rotation == 0) {
					this.add(x, y, 66560);
					this.add(x - 1, y, 4096);
					this.add(x, y + 1, 16384);
				}

				if (rotation == 1) {
					this.add(x, y, 5120);
					this.add(x, y + 1, 16384);
					this.add(x + 1, y, 65536);
				}

				if (rotation == 2) {
					this.add(x, y, 20480);
					this.add(x + 1, y, 65536);
					this.add(x, y - 1, 1024);
				}

				if (rotation == 3) {
					this.add(x, y, 81920);
					this.add(x, y - 1, 1024);
					this.add(x - 1, y, 4096);
				}
			}
		}

	}

	public CollisionMap(int w, int h) {
		this.width = w;
		this.height = h;
		this.flags = new int[this.width][this.height];
		this.reset();
	}

	static final void method243() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < Client.menuItemCount - 1; var1++) {
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
					String var3 = Client.menuNouns[var1];
					Client.menuNouns[var1] = Client.menuNouns[var1 + 1];
					Client.menuNouns[var1 + 1] = var3;
					String var4 = Client.menuActions[var1];
					Client.menuActions[var1] = Client.menuActions[var1 + 1];
					Client.menuActions[var1 + 1] = var4;
					int var2 = Client.menuOpcodes[var1];
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
					Client.menuOpcodes[var1 + 1] = var2;
					var2 = Client.menuArg1[var1];
					Client.menuArg1[var1] = Client.menuArg1[var1 + 1];
					Client.menuArg1[var1 + 1] = var2;
					var2 = Client.menuArg2[var1];
					Client.menuArg2[var1] = Client.menuArg2[var1 + 1];
					Client.menuArg2[var1 + 1] = var2;
					var2 = Client.menuArg0[var1];
					Client.menuArg0[var1] = Client.menuArg0[var1 + 1];
					Client.menuArg0[var1 + 1] = var2;
					var0 = false;
				}
			}
		}

	}

	public void reset() {
		for (int x = 0; x < this.width; x++) {
			for (int y = 0; y < this.height; y++) {
				if (x != 0 && y != 0 && x < this.width - 5 && y < this.height - 5) {
					this.flags[x][y] = 16777216;
				} else {
					this.flags[x][y] = 16777215;
				}
			}
		}

	}

}
