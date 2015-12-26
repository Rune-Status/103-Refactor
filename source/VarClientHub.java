import java.io.EOFException;

public class VarClientHub {

	static Class51 aClass51_320;
	boolean[] varcSerials;
	boolean[] varcstringSerials;
	int[] varcs;
	String[] varcstrings;
	boolean changed = false;
	long lastSerialize;
	static int regionBaseY;

	void putVarc(int id, int val) {
		this.varcs[id] = val;
		if (this.varcSerials[id]) {
			this.changed = true;
		}

	}

	String getVarcString(int id) {
		return this.varcstrings[id];
	}

	static final void method173(int var0) {
		if (IdentKitType.loadWidget(var0)) {
			Widget[] var2 = Widget.interfaces[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				Widget var1 = var2[var3];
				if (var1 != null) {
					var1.anInt1194 = 0;
					var1.anInt1126 = 0;
				}
			}

		}
	}

	void serialize() {
		CacheFileAccessor var1 = this.method179(true);
		boolean var14 = false;

		try {
			label183: {
				try {
					var14 = true;
					int var2 = 3;
					int var3 = 0;

					int var4;
					for (var4 = 0; var4 < this.varcs.length; ++var4) {
						if (this.varcSerials[var4] && this.varcs[var4] != -1) {
							var2 += 6;
							++var3;
						}
					}

					var2 += 2;
					var4 = 0;

					for (int var5 = 0; var5 < this.varcstrings.length; ++var5) {
						if (this.varcstringSerials[var5] && this.varcstrings[var5] != null) {
							var2 += 2 + TileDecorationStub.getLength(this.varcstrings[var5]);
							++var4;
						}
					}

					ByteBuf var20 = new ByteBuf(var2);
					var20.putByte(1);
					var20.putShort(var3);

					int var6;
					for (var6 = 0; var6 < this.varcs.length; ++var6) {
						if (this.varcSerials[var6] && this.varcs[var6] != -1) {
							var20.putShort(var6);
							var20.putInt(this.varcs[var6]);
						}
					}

					var20.putShort(var4);
					var6 = 0;

					while (true) {
						if (var6 >= this.varcstrings.length) {
							var1.write(var20.payload, 0, 314639891 * var20.position);
							break;
						}

						if (this.varcstringSerials[var6] && this.varcstrings[var6] != null) {
							var20.putShort(var6);
							var20.putString(this.varcstrings[var6]);
						}

						++var6;
					}
				} catch (Exception var18) {
					try {
						var1.close();
						var14 = false;
					} catch (Exception var16) {
						var14 = false;
					}
					break label183;
				}

				try {
					var1.close();
					var14 = false;
				} catch (Exception var17) {
					var14 = false;
				}
			}
		} finally {
			if (var14) {
				try {
					var1.close();
				} catch (Exception var15) {
					;
				}

			}
		}

		this.changed = false;
		this.lastSerialize = Node_Sub5.currentTimeMs() * -4897623063149766703L;
	}

	void deserialize() {
		CacheFileAccessor var1 = this.method179(false);
		boolean var20 = false;

		try {
			label186: {
				try {
					var20 = true;
					byte[] var2 = new byte[(int) var1.length()];

					int var4;
					for (int var3 = 0; var3 < var2.length; var3 += var4) {
						var4 = var1.read(var2, var3, var2.length - var3);
						if (var4 == -1) {
							throw new EOFException();
						}
					}

					ByteBuf buf = new ByteBuf(var2);
					if (buf.payload.length - buf.position * 314639891 < 1) {
						try {
							var1.close();
						} catch (Exception var23) {
							;
						}

						return;
					}

					int var5 = buf.getUByte();
					if (var5 < 0 || var5 > 1) {
						try {
							var1.close();
						} catch (Exception var25) {
							;
						}

						return;
					}

					int var6 = buf.getUShort();

					int var7;
					int var8;
					int var9;
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = buf.getUShort();
						var9 = buf.getInt();
						if (this.varcSerials[var8]) {
							this.varcs[var8] = var9;
						}
					}

					var7 = buf.getUShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = buf.getUShort();
						String var10 = buf.getString();
						if (this.varcstringSerials[var9]) {
							this.varcstrings[var9] = var10;
						}
					}
				} catch (Exception var26) {
					try {
						var1.close();
						var20 = false;
					} catch (Exception var22) {
						var20 = false;
					}
					break label186;
				}

				try {
					var1.close();
					var20 = false;
				} catch (Exception var24) {
					var20 = false;
				}
			}
		} finally {
			if (var20) {
				try {
					var1.close();
				} catch (Exception var21) {
					;
				}

			}
		}

		this.changed = false;
	}

	void process() {
		if (this.changed && this.lastSerialize * -2233906655684255439L < Node_Sub5.currentTimeMs() - 60000L) {
			this.serialize();
		}

	}

	boolean changed() {
		return this.changed;
	}

	void reset() {
		int var1;
		for (var1 = 0; var1 < this.varcs.length; ++var1) {
			if (!this.varcSerials[var1]) {
				this.varcs[var1] = -1;
			}
		}

		for (var1 = 0; var1 < this.varcstrings.length; ++var1) {
			if (!this.varcstringSerials[var1]) {
				this.varcstrings[var1] = null;
			}
		}

	}

	CacheFileAccessor method179(boolean var1) {
		return BoundaryStub.method154("2", Client.aClass77_2091.aString646, var1);
	}

	VarClientHub() {
		this.varcs = new int[Client.configsIndex.fileCount(19)];
		this.varcstrings = new String[Client.configsIndex.fileCount(15)];
		this.varcSerials = new boolean[this.varcs.length];

		int index;
		for (index = 0; index < this.varcs.length; ++index) {
			VarClientType varc = Class66_Sub2.getClientType(index);
			this.varcSerials[index] = varc.serialize;
		}

		this.varcstringSerials = new boolean[this.varcstrings.length];

		for (index = 0; index < this.varcstrings.length; ++index) {
			VarClientStringType varc_string = ClanMate.getVarClientStringType(index);
			this.varcstringSerials[index] = varc_string.serialize;
		}

		for (index = 0; index < this.varcs.length; ++index) {
			this.varcs[index] = -1;
		}

		this.deserialize();
	}

	int getVarc(int id) {
		return this.varcs[id];
	}

	void putVarcString(int id, String val) {
		this.varcstrings[id] = val;
		if (this.varcstringSerials[id]) {
			this.changed = true;
		}

	}

	static final void method182(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var2 + var0; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					Class39.aByteArrayArrayArray430[0][var5][var4] = 127;
					if (var5 == var0 && var5 > 0) {
						Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5 + 1][var4];
					}

					if (var1 == var4 && var4 > 0) {
						Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5][var4 - 1];
					}

					if (var4 == var1 + var3 && var4 < 103) {
						Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	static void method183(Widget var0, int var1, int var2, boolean var3) {
		int var4 = 1645211541 * var0.width;
		int var6 = var0.height * 1227800423;
		if (-1693000097 * var0.anInt1133 == 0) {
			var0.width = var0.anInt1135 * -1435301567;
		} else if (-1693000097 * var0.anInt1133 == 1) {
			var0.width = (var1 - var0.anInt1135 * 124195285) * 786424765;
		} else if (-1693000097 * var0.anInt1133 == 2) {
			var0.width = 786424765 * (124195285 * var0.anInt1135 * var1 >> 14);
		}

		if (var0.buttonType * 1039689039 == 0) {
			var0.height = var0.anInt1136 * -773929259;
		} else if (var0.buttonType * 1039689039 == 1) {
			var0.height = (var2 - 507570867 * var0.anInt1136) * -1446581161;
		} else if (1039689039 * var0.buttonType == 2) {
			var0.height = -1446581161 * (var2 * 507570867 * var0.anInt1136 >> 14);
		}

		if (var0.anInt1133 * -1693000097 == 4) {
			var0.width = 786424765
					* (-1440091941 * var0.anInt1193 * 1227800423 * var0.height / (var0.anInt1152 * 1321191429));
		}

		if (var0.buttonType * 1039689039 == 4) {
			var0.height = var0.width * 1645211541 * var0.anInt1152 * 1321191429 / (-1440091941 * var0.anInt1193)
					* -1446581161;
		}

		if (Client.aBool2024 && var0.type * -1305917269 == 0) {
			if (var0.height * 1227800423 < 5 && 1645211541 * var0.width < 5) {
				var0.height = 1357028787;
				var0.width = -362843471;
			} else {
				if (var0.height * 1227800423 <= 0) {
					var0.height = 1357028787;
				}

				if (var0.width * 1645211541 <= 0) {
					var0.width = -362843471;
				}
			}
		}

		if (-179718399 * var0.contentType == 1337) {
			Client.aWidget2231 = var0;
		}

		if (var3 && var0.anObjectArray1188 != null
				&& (var4 != 1645211541 * var0.width || 1227800423 * var0.height != var6)) {
			ScriptEvent var5 = new ScriptEvent();
			var5.aWidget1430 = var0;
			var5.args = var0.anObjectArray1188;
			Client.aDeque2164.method475(var5);
		}

	}

	static final void method184() {
		for (Projectile var0 = (Projectile) Client.projectileDeque
				.method471(); var0 != null; var0 = (Projectile) Client.projectileDeque.method473()) {
			if (var0.anInt1844 * -2138425693 == -747958745 * InterfaceNode.floorLevel
					&& -1040073859 * Client.engineCycle <= var0.loopCycle * -2082473613) {
				if (Client.engineCycle * -1040073859 >= 826970615 * var0.anInt1846) {
					if (846206463 * var0.targetIndex > 0) {
						Npc var1 = Client.npcArray[846206463 * var0.targetIndex - 1];
						if (var1 != null && var1.strictX * 1272643751 >= 0 && 1272643751 * var1.strictX < 13312
								&& -1801433343 * var1.strictY >= 0 && -1801433343 * var1.strictY < 13312) {
							var0.method992(var1.strictX * 1272643751, var1.strictY * -1801433343,
									NpcType.method802(var1.strictX * 1272643751, var1.strictY * -1801433343,
											-2138425693 * var0.anInt1844) - var0.endHeight * -1190049527,
									-1040073859 * Client.engineCycle);
						}
					}

					if (var0.targetIndex * 846206463 < 0) {
						int var2 = -(var0.targetIndex * 846206463) - 1;
						Player var3;
						if (var2 == Client.myPlayerIndex * 1467227105) {
							var3 = Class68.myPlayer;
						} else {
							var3 = Client.playerArray[var2];
						}

						if (var3 != null && 1272643751 * var3.strictX >= 0 && 1272643751 * var3.strictX < 13312
								&& var3.strictY * -1801433343 >= 0 && var3.strictY * -1801433343 < 13312) {
							var0.method992(1272643751 * var3.strictX, var3.strictY * -1801433343,
									NpcType.method802(1272643751 * var3.strictX, -1801433343 * var3.strictY,
											-2138425693 * var0.anInt1844) - -1190049527 * var0.endHeight,
									Client.engineCycle * -1040073859);
						}
					}

					var0.method993(-1163930299 * Client.anInt2066);
					InterfaceNode.landscape.method19(-747958745 * InterfaceNode.floorLevel, (int) var0.aDouble1848,
							(int) var0.aDouble1849, (int) var0.aDouble1843, 60, var0, var0.anInt1850 * 1329670755, -1,
							false);
				}
			} else {
				var0.unlink();
			}
		}

	}
}
