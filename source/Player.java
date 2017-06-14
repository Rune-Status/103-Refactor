import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

public final class Player extends Character {

	int anInt1985;
	int anInt1987;
	static int anInt1988;
	int anInt1991;
	int anInt1992;
	int anInt1993;
	int anInt1994;
	int anInt1995;
	int anInt1997;
	int anInt2000;
	int skullIcon = -1;
	int prayerIcon = -1;
	int team;
	String name;
	int combatLevel;
	int totalLevel;
	boolean hidden;
	PlayerConfig config;
	Model aModel2001;
	String[] aStringArray1986 = new String[3];
	int anInt1989;
	int anInt1990;
	boolean aBool1996;
	boolean aBool1999;
	int anInt2002;
	int anInt2003;
	int anInt2004;

	final void decodeApperance(ByteBuf var1) {
		var1.position = 0;
		int var2 = var1.getUByte();
		this.skullIcon = var1.getByte();
		this.prayerIcon = var1.getByte();
		int var3 = -1;
		this.team = 0;
		int[] var6 = new int[12];

		int var5;
		int var7;
		for (int var9 = 0; var9 < 12; var9++) {
			var5 = var1.getUByte();
			if (var5 == 0) {
				var6[var9] = 0;
			} else {
				var7 = var1.getUByte();
				var6[var9] = (var5 << 8) + var7;
				if (var9 == 0 && var6[0] == '\uffff') {
					var3 = var1.getUShort();
					break;
				}

				if (var6[var9] >= 512) {
					int var8 = FriendedPlayer.getItemType(var6[var9] - 512).anInt1639;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var91 = new int[5];

		for (var5 = 0; var5 < 5; var5++) {
			var7 = var1.getUByte();
			if (var7 < 0 || var7 >= PlayerConfig.colorsToReplace[var5].length) {
				var7 = 0;
			}

			var91[var5] = var7;
		}

		this.anInt1959 = var1.getUShort();
		if (this.anInt1959 == '\uffff') {
			this.anInt1959 = -1;
		}

		this.anInt1916 = var1.getUShort();
		if (this.anInt1916 == '\uffff') {
			this.anInt1916 = -1;
		}

		this.anInt1917 = this.anInt1916 * 517768871;
		this.anInt1918 = var1.getUShort();
		if (this.anInt1918 == '\uffff') {
			this.anInt1918 = -1;
		}

		this.anInt1952 = var1.getUShort();
		if (this.anInt1952 == '\uffff') {
			this.anInt1952 = -1;
		}

		this.anInt1913 = var1.getUShort();
		if (this.anInt1913 == '\uffff') {
			this.anInt1913 = -1;
		}

		this.anInt1939 = var1.getUShort();
		if (this.anInt1939 == '\uffff') {
			this.anInt1939 = -1;
		}

		this.anInt1921 = var1.getUShort();
		if (this.anInt1921 == '\uffff') {
			this.anInt1921 = -1;
		}

		this.name = var1.getString();
		if (Class68.myPlayer == this) {
			RuntimeException_Sub1.myPlayerName = this.name;
		}

		this.combatLevel = var1.getUByte();
		this.totalLevel = var1.getUShort();
		this.hidden = var1.getUByte() == 1;
		if (Client.socketType == 0 && Client.myRights >= 2) {
			this.hidden = false;
		}

		if (this.config == null) {
			this.config = new PlayerConfig();
		}

		this.config.method262(var6, var91, var2 == 1, var3);
	}

	protected final Model getModel(byte var1) {
		if (this.config == null) {
			return null;
		} else {
			SequenceType var6 = this.animationId != -1 && this.animationDelay == 0 ? Node_Sub6.getSequenceType(this.animationId)
					: null;
			SequenceType var3 = this.anInt1932 == -1 || this.aBool1996
					|| this.anInt1932 == this.anInt1959 && var6 != null ? null
							: Node_Sub6.getSequenceType(this.anInt1932);
			Model var4 = this.config.method268(var6, this.anInt1934, var3, this.anInt1914);
			if (var4 == null) {
				return null;
			} else {
				var4.method998();
				this.charHeight = var4.height * 1812947537;
				Model var2;
				Model[] var5;
				if (!this.aBool1996 && this.graphicsId != -1 && this.anInt1925 != -1) {
					var2 = Class96_Sub1.getSpotAnimType(this.graphicsId).method656(this.anInt1925);
					if (var2 != null) {
						var2.method1008(0, -this.graphicsHeight, 0);
						var5 = new Model[] { var4, var2 };
						var4 = new Model(var5, 2);
					}
				}

				if (!this.aBool1996 && this.aModel2001 != null) {
					if (Client.engineCycle >= this.anInt1990) {
						this.aModel2001 = null;
					}

					if (Client.engineCycle >= this.anInt1989 && Client.engineCycle < this.anInt1990) {
						var2 = this.aModel2001;
						var2.method1008(this.anInt1991 - this.strictX, this.anInt1992 - this.anInt1997,
								this.anInt1993 - this.strictY);
						if (this.anInt1953 * -2061229533 == 512) {
							var2.method1013();
							var2.method1013();
							var2.method1013();
						} else if (this.anInt1953 * -2061229533 == 1024) {
							var2.method1013();
							var2.method1013();
						} else if (this.anInt1953 * -2061229533 == 1536) {
							var2.method1013();
						}

						var5 = new Model[] { var4, var2 };
						var4 = new Model(var5, 2);
						if (this.anInt1953 * -2061229533 == 512) {
							var2.method1013();
						} else if (this.anInt1953 * -2061229533 == 1024) {
							var2.method1013();
							var2.method1013();
						} else if (this.anInt1953 * -2061229533 == 1536) {
							var2.method1013();
							var2.method1013();
							var2.method1013();
						}

						var2.method1008(this.strictX - this.anInt1991, this.anInt1997 - this.anInt1992,
								this.strictY - this.anInt1993);
					}
				}

				var4.allowClickBounds = true;
				return var4;
			}
		}
	}

	static void decodeSprite(byte[] bytes) {
		ByteBuf buf = new ByteBuf(bytes);
		buf.position = bytes.length - 2;
		Class7.size = buf.getUShort();
		Class7.offsetsX = new int[Class7.size];
		VarPlayerType.offsetsY = new int[Class7.size];
		Class7.subWidths = new int[Class7.size];
		Class7.subHeights = new int[Class7.size];
		Npc.spritePixels = new byte[Class7.size][];
		buf.position = bytes.length - 7 - Class7.size * 8;
		Class7.width = buf.getUShort();
		Class7.height = buf.getUShort();
		int paletteSize = (buf.getUByte() & 0xff) + 1;

		int index;
		for (index = 0; index < Class7.size; index++) {
			Class7.offsetsX[index] = buf.getUShort();
		}

		for (index = 0; index < Class7.size; index++) {
			VarPlayerType.offsetsY[index] = buf.getUShort();
		}

		for (index = 0; index < Class7.size; index++) {
			Class7.subWidths[index] = buf.getUShort();
		}

		for (index = 0; index < Class7.size; index++) {
			Class7.subHeights[index] = buf.getUShort();
		}

		buf.position = bytes.length - 7 - Class7.size * 8 - (paletteSize - 1) * 3;
		Class85.palette = new int[paletteSize];

		for (index = 1; index < paletteSize; index++) {
			Class85.palette[index] = buf.getMedium();
			if (Class85.palette[index] == 0) {
				Class85.palette[index] = 1;
			}
		}

		buf.position = 0;

		for (index = 0; index < Class7.size; index++) {
			int subWidth = Class7.subWidths[index];
			int subHeight = Class7.subHeights[index];
			int size = subHeight * subWidth;
			byte[] pixels = new byte[size];
			Npc.spritePixels[index] = pixels;
			int flags = buf.getUByte();
			int w;
			if (flags == 0) {
				for (w = 0; w < size; w++) {
					pixels[w] = buf.getByte();
				}
			} else if (flags == 1) {
				for (w = 0; w < subWidth; w++) {
					for (int h = 0; h < subHeight; h++) {
						pixels[subWidth * h + w] = buf.getByte();
					}
				}
			}
		}

	}

	void method1043(int var1, int var2) {
		this.queueSize = 0;
		this.anInt1957 = 0;
		this.anInt1956 = 0;
		this.anIntArray1945[0] = var1;
		this.anIntArray1955[0] = var2;
		int var3 = this.getSize();
		this.strictX = var3 * 64 + this.anIntArray1945[0] * 128;
		this.strictY = this.anIntArray1955[0] * 128 + var3 * 64;
	}

	final void method1044(int var1, int var2, byte var3) {
		if (this.queueSize < 9) {
			++this.queueSize;
		}

		for (int var4 = this.queueSize; var4 > 0; --var4) {
			this.anIntArray1945[var4] = this.anIntArray1945[var4 - 1];
			this.anIntArray1955[var4] = this.anIntArray1955[var4 - 1];
			this.aByteArray1951[var4] = this.aByteArray1951[var4 - 1];
		}

		this.anIntArray1945[0] = var1;
		this.anIntArray1955[0] = var2;
		this.aByteArray1951[0] = var3;
	}

	final boolean hasConfig() {
		return this.config != null;
	}

	final void method1045(int var1, int var2, byte var3) {
		if (this.animationId != -1 && Node_Sub6.getSequenceType(this.animationId).anInt1469 == 1) {
			this.animationId = -1;
		}

		this.anInt1931 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (this.anIntArray1945[0] >= 0 && this.anIntArray1945[0] < 104 && this.anIntArray1955[0] >= 0
					&& this.anIntArray1955[0] < 104) {
				if (var3 == 2) {
					Class21.method156(this, var1, var2, (byte) 2);
				}

				this.method1044(var1, var2, var3);
			} else {
				this.method1043(var1, var2);
			}
		} else {
			this.method1043(var1, var2);
		}

	}

	Player() {
		for (int var1 = 0; var1 < 3; var1++) {
			this.aStringArray1986[var1] = "";
		}

		this.combatLevel = 0;
		this.totalLevel = 0;
		this.anInt1989 = 0;
		this.anInt1990 = 0;
		this.aBool1996 = false;
		this.team = 0;
		this.hidden = false;
		this.aBool1999 = false;
	}

	int getSize() {
		return this.config != null && this.config.npcId != -1 ? VarPlayerType.getNpcType(this.config.npcId).anInt1589
				: 1;
	}

	static void decodeMovement(BitBuf var0, int var1) {
		boolean var5 = var0.getBits(1) == 1;
		if (var5) {
			GPI.pendingFlagsIndices[++GPI.pendingFlagsCount - 1] = var1;
		}

		int var7 = var0.getBits(2);
		Player var3 = Client.playerArray[var1];
		if (var7 == 0) {
			if (var5) {
				var3.aBool1999 = false;
			} else {
				if (Client.myPlayerIndex == var1) {
					throw new RuntimeException();
				}

				GPI.cachedRegions[var1] = (var3.anInt2004 << 28)
						+ (MachineInfo.chunkLeftX + var3.anIntArray1945[0] >> 6 << 14)
						+ (VarClientHub.chunkLeftY + var3.anIntArray1955[0] >> 6);
				if (var3.anInt1931 != -1) {
					GPI.cachedDirections[var1] = var3.anInt1931;
				} else {
					GPI.cachedDirections[var1] = var3.anInt1953 * -2061229533;
				}

				GPI.cachedIndices[var1] = var3.targetIndex;
				Client.playerArray[var1] = null;
				if (var0.getBits(1) != 0) {
					Class4.decodeRegionHash(var0, var1);
				}
			}
		} else {
			int var2;
			int var4;
			int var6;
			if (var7 == 1) {
				var2 = var0.getBits(3);
				var4 = var3.anIntArray1945[0];
				var6 = var3.anIntArray1955[0];
				if (var2 == 0) {
					--var4;
					--var6;
				} else if (var2 == 1) {
					--var6;
				} else if (var2 == 2) {
					++var4;
					--var6;
				} else if (var2 == 3) {
					--var4;
				} else if (var2 == 4) {
					++var4;
				} else if (var2 == 5) {
					--var4;
					++var6;
				} else if (var2 == 6) {
					++var6;
				} else if (var2 == 7) {
					++var4;
					++var6;
				}

				if (Client.myPlayerIndex != var1 || var3.strictX >= 1536 && var3.strictY >= 1536 && var3.strictX < 11776
						&& var3.strictY < 11776) {
					if (var5) {
						var3.aBool1999 = true;
						var3.anInt2002 = var4;
						var3.anInt2003 = var6;
					} else {
						var3.aBool1999 = false;
						var3.method1045(var4, var6, GPI.movementTypes[var1]);
					}
				} else {
					var3.method1043(var4, var6);
					var3.aBool1999 = false;
				}
			} else if (var7 == 2) {
				var2 = var0.getBits(4);
				var4 = var3.anIntArray1945[0];
				var6 = var3.anIntArray1955[0];
				if (var2 == 0) {
					var4 -= 2;
					var6 -= 2;
				} else if (var2 == 1) {
					--var4;
					var6 -= 2;
				} else if (var2 == 2) {
					var6 -= 2;
				} else if (var2 == 3) {
					++var4;
					var6 -= 2;
				} else if (var2 == 4) {
					var4 += 2;
					var6 -= 2;
				} else if (var2 == 5) {
					var4 -= 2;
					--var6;
				} else if (var2 == 6) {
					var4 += 2;
					--var6;
				} else if (var2 == 7) {
					var4 -= 2;
				} else if (var2 == 8) {
					var4 += 2;
				} else if (var2 == 9) {
					var4 -= 2;
					++var6;
				} else if (var2 == 10) {
					var4 += 2;
					++var6;
				} else if (var2 == 11) {
					var4 -= 2;
					var6 += 2;
				} else if (var2 == 12) {
					--var4;
					var6 += 2;
				} else if (var2 == 13) {
					var6 += 2;
				} else if (var2 == 14) {
					++var4;
					var6 += 2;
				} else if (var2 == 15) {
					var4 += 2;
					var6 += 2;
				}

				if (Client.myPlayerIndex != var1 || var3.strictX >= 1536 && var3.strictY >= 1536 && var3.strictX < 11776
						&& var3.strictY < 11776) {
					if (var5) {
						var3.aBool1999 = true;
						var3.anInt2002 = var4;
						var3.anInt2003 = var6;
					} else {
						var3.aBool1999 = false;
						var3.method1045(var4, var6, GPI.movementTypes[var1]);
					}
				} else {
					var3.method1043(var4, var6);
					var3.aBool1999 = false;
				}
			} else {
				var2 = var0.getBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var2 == 0) {
					var4 = var0.getBits(12);
					var6 = var4 >> 10;
					var11 = var4 >> 5 & 0x1f;
					if (var11 > 15) {
						var11 -= 32;
					}

					var10 = var4 & 0x1f;
					if (var10 > 15) {
						var10 -= 32;
					}

					var9 = var3.anIntArray1945[0] + var11;
					var8 = var3.anIntArray1955[0] + var10;
					if (Client.myPlayerIndex == var1 && (var3.strictX < 1536 || var3.strictY < 1536
							|| var3.strictX >= 11776 || var3.strictY >= 11776)) {
						var3.method1043(var9, var8);
						var3.aBool1999 = false;
					} else if (var5) {
						var3.aBool1999 = true;
						var3.anInt2002 = var9;
						var3.anInt2003 = var8;
					} else {
						var3.aBool1999 = false;
						var3.method1045(var9, var8, GPI.movementTypes[var1]);
					}

					var3.anInt2004 = (byte) (var3.anInt2004 + var6 & 0x3);
					if (Client.myPlayerIndex == var1) {
						InterfaceNode.floorLevel = var3.anInt2004 * 1008529911;
					}
				} else {
					var4 = var0.getBits(30);
					var6 = var4 >> 28;
					var11 = var4 >> 14 & 0x3fff;
					var10 = var4 & 0x3fff;
					var9 = (MachineInfo.chunkLeftX + var11 + var3.anIntArray1945[0] & 0x3fff) - MachineInfo.chunkLeftX;
					var8 = (VarClientHub.chunkLeftY + var10 + var3.anIntArray1955[0] & 0x3fff)
							- VarClientHub.chunkLeftY;
					if (Client.myPlayerIndex == var1 && (var3.strictX < 1536 || var3.strictY < 1536
							|| var3.strictX >= 11776 || var3.strictY >= 11776)) {
						var3.method1043(var9, var8);
						var3.aBool1999 = false;
					} else if (var5) {
						var3.aBool1999 = true;
						var3.anInt2002 = var9;
						var3.anInt2003 = var8;
					} else {
						var3.aBool1999 = false;
						var3.method1045(var9, var8, GPI.movementTypes[var1]);
					}

					var3.anInt2004 = (byte) (var3.anInt2004 + var6 & 0x3);
					if (Client.myPlayerIndex == var1) {
						InterfaceNode.floorLevel = var3.anInt2004 * 1008529911;
					}
				}
			}
		}

	}

	static void method1048(Widget var0) {
		Widget var3 = var0.parentId == -1 ? null : Class94.getWidget(var0.parentId);
		int var1;
		int var2;
		if (var3 == null) {
			var1 = Occluder.gameWidth;
			var2 = Node_Sub9.gameHeight;
		} else {
			var1 = var3.width;
			var2 = var3.height * 1227800423;
		}

		VarClientHub.method183(var0, var1, var2, false);
		SequenceType.method682(var0, var1, var2);
	}

	static String method1049(Widget var0, int var1) {
		return !MachineInfo.method569(Class30.getWidgetConfig(var0), var1) && var0.anObjectArray1180 == null ? null
				: (var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null
						&& var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null);
	}

	static boolean method1050(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!Class70.aString586.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); var4++) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = JSHelper.call(Class70.anApplet587, var2,
						new Object[] { (new URL(Class70.anApplet587.getCodeBase(), var0)).toString() });
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				Class70.anApplet587.getAppletContext().showDocument(new URL(Class70.anApplet587.getCodeBase(), var0),
						"_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var8 = Class70.anApplet587;
				JSObject.getWindow(var8).call("loggedout", (Object[]) null);
			} catch (Throwable var9) {
				;
			}

			try {
				Class70.anApplet587.getAppletContext().showDocument(new URL(Class70.anApplet587.getCodeBase(), var0),
						"_top");
				return true;
			} catch (Exception var81) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static BuildType[] buildTypes() {
		return new BuildType[] { BuildType.BUILD_LIVE, BuildType.LIVE, BuildType.WIP, BuildType.RC };
	}

}
