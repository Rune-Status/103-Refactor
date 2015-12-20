import java.applet.Applet;

public class CollionMap {

	int width;
	public int[][] flags;
	int anInt505 = 0;
	int anInt506 = 0;
	int height;
	static Applet anApplet508;

	public void method234(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.anInt505 * 1676632637;
		var2 -= 291084413 * this.anInt506;

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.width * 115906415) {
				for (int var8 = var2; var8 < var4 + var2; ++var8) {
					if (var8 >= 0 && var8 < -852495241 * this.height) {
						this.addFlag(var7, var8, var6);
					}
				}
			}
		}

	}

	public void method235(int var1, int var2) {
		var1 -= this.anInt505 * 1676632637;
		var2 -= this.anInt506 * 291084413;
		this.flags[var1][var2] |= 2097152;
	}

	public void method236(int var1, int var2) {
		var1 -= this.anInt505 * 1676632637;
		var2 -= 291084413 * this.anInt506;
		this.flags[var1][var2] |= 262144;
	}

	void addFlag(int var1, int var2, int var3) {
		this.flags[var1][var2] |= var3;
	}

	public void method238(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.anInt505 * 1676632637;
		var2 -= this.anInt506 * 291084413;
		if (var3 == 0) {
			if (var4 == 0) {
				this.removeFlag(var1, var2, 128);
				this.removeFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.removeFlag(var1, var2, 2);
				this.removeFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.removeFlag(var1, var2, 8);
				this.removeFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.removeFlag(var1, var2, 32);
				this.removeFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.removeFlag(var1, var2, 1);
				this.removeFlag(var1 - 1, 1 + var2, 16);
			}

			if (var4 == 1) {
				this.removeFlag(var1, var2, 4);
				this.removeFlag(1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				this.removeFlag(var1, var2, 16);
				this.removeFlag(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.removeFlag(var1, var2, 64);
				this.removeFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.removeFlag(var1, var2, 130);
				this.removeFlag(var1 - 1, var2, 8);
				this.removeFlag(var1, 1 + var2, 32);
			}

			if (var4 == 1) {
				this.removeFlag(var1, var2, 10);
				this.removeFlag(var1, 1 + var2, 32);
				this.removeFlag(1 + var1, var2, 128);
			}

			if (var4 == 2) {
				this.removeFlag(var1, var2, 40);
				this.removeFlag(1 + var1, var2, 128);
				this.removeFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.removeFlag(var1, var2, 160);
				this.removeFlag(var1, var2 - 1, 2);
				this.removeFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.removeFlag(var1, var2, 65536);
					this.removeFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.removeFlag(var1, var2, 1024);
					this.removeFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.removeFlag(var1, var2, 4096);
					this.removeFlag(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					this.removeFlag(var1, var2, 16384);
					this.removeFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.removeFlag(var1, var2, 512);
					this.removeFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.removeFlag(var1, var2, 2048);
					this.removeFlag(1 + var1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					this.removeFlag(var1, var2, 8192);
					this.removeFlag(1 + var1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.removeFlag(var1, var2, '\u8000');
					this.removeFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.removeFlag(var1, var2, 66560);
					this.removeFlag(var1 - 1, var2, 4096);
					this.removeFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.removeFlag(var1, var2, 5120);
					this.removeFlag(var1, 1 + var2, 16384);
					this.removeFlag(1 + var1, var2, 65536);
				}

				if (var4 == 2) {
					this.removeFlag(var1, var2, 20480);
					this.removeFlag(1 + var1, var2, 65536);
					this.removeFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.removeFlag(var1, var2, 81920);
					this.removeFlag(var1, var2 - 1, 1024);
					this.removeFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public void method239(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.anInt505 * 1676632637;
		var2 -= this.anInt506 * 291084413;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < 115906415 * this.width) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.height * -852495241) {
						this.removeFlag(var8, var9, var7);
					}
				}
			}
		}

	}

	void removeFlag(int var1, int var2, int var3) {
		this.flags[var1][var2] &= ~var3;
	}

	public void method241(int var1, int var2) {
		var1 -= this.anInt505 * 1676632637;
		var2 -= 291084413 * this.anInt506;
		this.flags[var1][var2] &= -262145;
	}

	public void method242(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.anInt505 * 1676632637;
		var2 -= this.anInt506 * 291084413;
		if (var3 == 0) {
			if (var4 == 0) {
				this.addFlag(var1, var2, 128);
				this.addFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.addFlag(var1, var2, 2);
				this.addFlag(var1, 1 + var2, 32);
			}

			if (var4 == 2) {
				this.addFlag(var1, var2, 8);
				this.addFlag(1 + var1, var2, 128);
			}

			if (var4 == 3) {
				this.addFlag(var1, var2, 32);
				this.addFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.addFlag(var1, var2, 1);
				this.addFlag(var1 - 1, 1 + var2, 16);
			}

			if (var4 == 1) {
				this.addFlag(var1, var2, 4);
				this.addFlag(1 + var1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.addFlag(var1, var2, 16);
				this.addFlag(1 + var1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.addFlag(var1, var2, 64);
				this.addFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.addFlag(var1, var2, 130);
				this.addFlag(var1 - 1, var2, 8);
				this.addFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.addFlag(var1, var2, 10);
				this.addFlag(var1, var2 + 1, 32);
				this.addFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.addFlag(var1, var2, 40);
				this.addFlag(1 + var1, var2, 128);
				this.addFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.addFlag(var1, var2, 160);
				this.addFlag(var1, var2 - 1, 2);
				this.addFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.addFlag(var1, var2, 65536);
					this.addFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.addFlag(var1, var2, 1024);
					this.addFlag(var1, 1 + var2, 16384);
				}

				if (var4 == 2) {
					this.addFlag(var1, var2, 4096);
					this.addFlag(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					this.addFlag(var1, var2, 16384);
					this.addFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.addFlag(var1, var2, 512);
					this.addFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.addFlag(var1, var2, 2048);
					this.addFlag(var1 + 1, 1 + var2, '\u8000');
				}

				if (var4 == 2) {
					this.addFlag(var1, var2, 8192);
					this.addFlag(1 + var1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.addFlag(var1, var2, '\u8000');
					this.addFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.addFlag(var1, var2, 66560);
					this.addFlag(var1 - 1, var2, 4096);
					this.addFlag(var1, 1 + var2, 16384);
				}

				if (var4 == 1) {
					this.addFlag(var1, var2, 5120);
					this.addFlag(var1, var2 + 1, 16384);
					this.addFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.addFlag(var1, var2, 20480);
					this.addFlag(var1 + 1, var2, 65536);
					this.addFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.addFlag(var1, var2, 81920);
					this.addFlag(var1, var2 - 1, 1024);
					this.addFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	public CollionMap(int var1, int var2) {
		this.width = 374777743 * var1;
		this.height = 252847431 * var2;
		this.flags = new int[this.width * 115906415][-852495241 * this.height];
		this.method244();
	}

	static final void method243() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < Client.menuItemCount * 1768430155 - 1; ++var1) {
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[1 + var1] > 1000) {
					String var3 = Client.menuNouns[var1];
					Client.menuNouns[var1] = Client.menuNouns[1 + var1];
					Client.menuNouns[var1 + 1] = var3;
					String var4 = Client.menuActions[var1];
					Client.menuActions[var1] = Client.menuActions[var1 + 1];
					Client.menuActions[var1 + 1] = var4;
					int var2 = Client.menuOpcodes[var1];
					Client.menuOpcodes[var1] = Client.menuOpcodes[1 + var1];
					Client.menuOpcodes[1 + var1] = var2;
					var2 = Client.menuArg1[var1];
					Client.menuArg1[var1] = Client.menuArg1[var1 + 1];
					Client.menuArg1[1 + var1] = var2;
					var2 = Client.menuArg2[var1];
					Client.menuArg2[var1] = Client.menuArg2[1 + var1];
					Client.menuArg2[1 + var1] = var2;
					var2 = Client.menuArg0[var1];
					Client.menuArg0[var1] = Client.menuArg0[var1 + 1];
					Client.menuArg0[1 + var1] = var2;
					var0 = false;
				}
			}
		}

	}

	public void method244() {
		for (int var1 = 0; var1 < this.width * 115906415; ++var1) {
			for (int var2 = 0; var2 < this.height * -852495241; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.width * 115906415 - 5
						&& var2 < -852495241 * this.height - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}
}
