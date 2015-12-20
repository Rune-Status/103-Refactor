import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

public final class Player extends Character {

	int anInt1985;
	PlayerConfig config;
	int skullIcon = 1894915347;
	int prayerIcon = 262247627;
	String[] aStringArray1986 = new String[3];
	int anInt1987;
	int totalLevel;
	static int anInt1988;
	int anInt1989;
	int anInt1990;
	int anInt1991;
	int anInt1992;
	int anInt1993;
	String name;
	int anInt1994;
	int anInt1995;
	boolean aBool1996;
	int anInt1997;
	int team;
	boolean aBool1998;
	boolean aBool1999;
	int anInt2000;
	Model aModel2001;
	int anInt2002;
	int anInt2003;
	int anInt2004;
	int combatLevel;

	final void method1041(ByteBuf var1) {
		var1.position = 0;
		int var2 = var1.getUByte();
		this.skullIcon = var1.getByte() * -1894915347;
		this.prayerIcon = var1.getByte() * -262247627;
		int var3 = -1;
		this.team = 0;
		int[] var6 = new int[12];

		int var5;
		int var7;
		for (int var4 = 0; var4 < 12; ++var4) {
			var5 = var1.getUByte();
			if (var5 == 0) {
				var6[var4] = 0;
			} else {
				var7 = var1.getUByte();
				var6[var4] = var7 + (var5 << 8);
				if (var4 == 0 && var6[0] == '\uffff') {
					var3 = var1.getUShort();
					break;
				}

				if (var6[var4] >= 512) {
					int var8 = FriendedPlayer.getItemDefinition(var6[var4] - 512).anInt1639 * 1721605111;
					if (var8 != 0) {
						this.team = -1052938061 * var8;
					}
				}
			}
		}

		int[] var9 = new int[5];

		for (var5 = 0; var5 < 5; ++var5) {
			var7 = var1.getUByte();
			if (var7 < 0 || var7 >= PlayerConfig.aShortArrayArray529[var5].length) {
				var7 = 0;
			}

			var9[var5] = var7;
		}

		this.anInt1959 = var1.getUShort() * -592731223;
		if (370127001 * this.anInt1959 == '\uffff') {
			this.anInt1959 = 592731223;
		}

		this.anInt1916 = var1.getUShort() * -176841799;
		if (this.anInt1916 * 711326345 == '\uffff') {
			this.anInt1916 = 176841799;
		}

		this.anInt1917 = 2073877321 * this.anInt1916;
		this.anInt1918 = var1.getUShort() * -929243503;
		if (1481286257 * this.anInt1918 == '\uffff') {
			this.anInt1918 = 929243503;
		}

		this.anInt1952 = var1.getUShort() * -951990375;
		if (-826106711 * this.anInt1952 == '\uffff') {
			this.anInt1952 = 951990375;
		}

		this.anInt1913 = var1.getUShort() * 505909337;
		if (this.anInt1913 * -897665047 == '\uffff') {
			this.anInt1913 = -505909337;
		}

		this.anInt1939 = var1.getUShort() * 1473487651;
		if (this.anInt1939 * -1453546357 == '\uffff') {
			this.anInt1939 = -1473487651;
		}

		this.anInt1921 = var1.getUShort() * 71707737;
		if (this.anInt1921 * -108110871 == '\uffff') {
			this.anInt1921 = -71707737;
		}

		this.name = var1.getString();
		if (Class68.myPlayer == this) {
			RuntimeException_Sub1.aString1807 = this.name;
		}

		this.combatLevel = var1.getUByte() * -811997547;
		this.totalLevel = var1.getUShort() * -1535283903;
		this.aBool1998 = var1.getUByte() == 1;
		if (Client.anInt2074 * 1082541889 == 0 && Client.myRights * 1520983779 >= 2) {
			this.aBool1998 = false;
		}

		if (this.config == null) {
			this.config = new PlayerConfig();
		}

		this.config.method262(var6, var9, var2 == 1, var3);
	}

	protected final Model method654(byte var1) {
		if (this.config == null) {
			return null;
		} else {
			DualNode_Sub3 var6 = this.animation * -922607859 != -1 && this.anInt1936 * 1301453073 == 0
					? Node_Sub6.method540(this.animation * -922607859, -846609165) : null;
			DualNode_Sub3 var3 = this.anInt1932 * 57983255 != -1 && !this.aBool1996
					&& (this.anInt1932 * 57983255 != this.anInt1959 * 370127001 || var6 == null)
							? Node_Sub6.method540(57983255 * this.anInt1932, -714223326) : null;
			Model var4 = this.config.method268(var6, this.anInt1934 * 1402685833, var3, this.anInt1914 * -1199565973);
			if (var4 == null) {
				return null;
			} else {
				var4.method998();
				this.anInt1950 = var4.modelHeight * -1831653581;
				Model var2;
				Model[] var5;
				if (!this.aBool1996 && this.anInt1938 * 1631645159 != -1 && this.anInt1925 * -1255206495 != -1) {
					var2 = Class96_Sub1.method499(this.anInt1938 * 1631645159, (byte) 1)
							.method656(-1255206495 * this.anInt1925);
					if (var2 != null) {
						var2.method1008(0, -(1719935737 * this.anInt1920), 0);
						var5 = new Model[] { var4, var2 };
						var4 = new Model(var5, 2);
					}
				}

				if (!this.aBool1996 && this.aModel2001 != null) {
					if (Client.engineCycle * -1040073859 >= this.anInt1990 * 959962901) {
						this.aModel2001 = null;
					}

					if (Client.engineCycle * -1040073859 >= this.anInt1989 * 359131139
							&& -1040073859 * Client.engineCycle < 959962901 * this.anInt1990) {
						var2 = this.aModel2001;
						var2.method1008(-1309525793 * this.anInt1991 - this.strictX * 1272643751,
								597111337 * this.anInt1992 - -868972383 * this.anInt1997,
								128838003 * this.anInt1993 - -1801433343 * this.strictY);
						if (this.anInt1953 * -2061229533 == 512) {
							var2.method1013();
							var2.method1013();
							var2.method1013();
						} else if (this.anInt1953 * -2061229533 == 1024) {
							var2.method1013();
							var2.method1013();
						} else if (-2061229533 * this.anInt1953 == 1536) {
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

						var2.method1008(1272643751 * this.strictX - this.anInt1991 * -1309525793,
								-868972383 * this.anInt1997 - 597111337 * this.anInt1992,
								-1801433343 * this.strictY - this.anInt1993 * 128838003);
					}
				}

				var4.allowClickBounds = true;
				return var4;
			}
		}
	}

	static void method1042(byte[] var0) {
		ByteBuf var1 = new ByteBuf(var0);
		var1.position = (var0.length - 2) * -184175589;
		Class7.anInt154 = var1.getUShort() * 2080683417;
		Class7.anIntArray149 = new int[Class7.anInt154 * 817614505];
		DualNode_Sub11.anIntArray1544 = new int[817614505 * Class7.anInt154];
		Class7.anIntArray150 = new int[817614505 * Class7.anInt154];
		Class7.anIntArray151 = new int[Class7.anInt154 * 817614505];
		Npc.aByteArrayArray1966 = new byte[817614505 * Class7.anInt154][];
		var1.position = -184175589 * (var0.length - 7 - Class7.anInt154 * -2049018552);
		Class7.anInt148 = var1.getUShort() * -1327133543;
		Class7.anInt155 = var1.getUShort() * -1754818609;
		int var3 = (var1.getUByte() & 255) + 1;

		int var2;
		for (var2 = 0; var2 < 817614505 * Class7.anInt154; ++var2) {
			Class7.anIntArray149[var2] = var1.getUShort();
		}

		for (var2 = 0; var2 < 817614505 * Class7.anInt154; ++var2) {
			DualNode_Sub11.anIntArray1544[var2] = var1.getUShort();
		}

		for (var2 = 0; var2 < 817614505 * Class7.anInt154; ++var2) {
			Class7.anIntArray150[var2] = var1.getUShort();
		}

		for (var2 = 0; var2 < 817614505 * Class7.anInt154; ++var2) {
			Class7.anIntArray151[var2] = var1.getUShort();
		}

		var1.position = (var0.length - 7 - -2049018552 * Class7.anInt154 - (var3 - 1) * 3) * -184175589;
		Class85.anIntArray690 = new int[var3];

		for (var2 = 1; var2 < var3; ++var2) {
			Class85.anIntArray690[var2] = var1.getMedium();
			if (Class85.anIntArray690[var2] == 0) {
				Class85.anIntArray690[var2] = 1;
			}
		}

		var1.position = 0;

		for (var2 = 0; var2 < 817614505 * Class7.anInt154; ++var2) {
			int var5 = Class7.anIntArray150[var2];
			int var8 = Class7.anIntArray151[var2];
			int var9 = var8 * var5;
			byte[] var7 = new byte[var9];
			Npc.aByteArrayArray1966[var2] = var7;
			int var6 = var1.getUByte();
			int var4;
			if (var6 == 0) {
				for (var4 = 0; var4 < var9; ++var4) {
					var7[var4] = var1.getByte();
				}
			} else if (var6 == 1) {
				for (var4 = 0; var4 < var5; ++var4) {
					for (int var10 = 0; var10 < var8; ++var10) {
						var7[var5 * var10 + var4] = var1.getByte();
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
		int var3 = this.method1046();
		this.strictX = 1789511104 * var3 + -715945088 * this.anIntArray1945[0];
		this.strictY = this.anIntArray1955[0] * 1616412800 + var3 * 808206400;
	}

	final void method1044(int var1, int var2, byte var3) {
		if (632093179 * this.queueSize < 9) {
			this.queueSize += 11741491;
		}

		for (int var4 = this.queueSize * 632093179; var4 > 0; --var4) {
			this.anIntArray1945[var4] = this.anIntArray1945[var4 - 1];
			this.anIntArray1955[var4] = this.anIntArray1955[var4 - 1];
			this.aByteArray1951[var4] = this.aByteArray1951[var4 - 1];
		}

		this.anIntArray1945[0] = var1;
		this.anIntArray1955[0] = var2;
		this.aByteArray1951[0] = var3;
	}

	final boolean method1017(byte var1) {
		return this.config != null;
	}

	final void method1045(int var1, int var2, byte var3) {
		if (this.animation * -922607859 != -1
				&& Node_Sub6.method540(-922607859 * this.animation, -55186589).anInt1469 * -1099577343 == 1) {
			this.animation = 1587034171;
		}

		this.anInt1931 = 316267887;
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
		for (int var1 = 0; var1 < 3; ++var1) {
			this.aStringArray1986[var1] = "";
		}

		this.combatLevel = 0;
		this.totalLevel = 0;
		this.anInt1989 = 0;
		this.anInt1990 = 0;
		this.aBool1996 = false;
		this.team = 0;
		this.aBool1998 = false;
		this.aBool1999 = false;
	}

	int method1046() {
		return this.config != null && this.config.npcId * -84158433 != -1
				? DualNode_Sub11.getNpcDefinition(this.config.npcId * -84158433).anInt1589 * -691506967 : 1;
	}

	static void decodeMovement(BitBuf var0, int var1) {
		boolean var5 = var0.getBits(1) == 1;
		if (var5) {
			GPI.pendingFlagsIndices[(GPI.pendingFlagsCount += -299545915) * 716284941 - 1] = var1;
		}

		int var7 = var0.getBits(2);
		Player var3 = Client.playerArray[var1];
		if (var7 == 0) {
			if (var5) {
				var3.aBool1999 = false;
			} else if (Client.myPlayerIndex * 1467227105 == var1) {
				throw new RuntimeException();
			} else {
				GPI.cachedRegions[var1] = (var3.anInt2004 * -1522270499 << 28)
						+ (1426698711 * Node_Sub10.regionBaseX + var3.anIntArray1945[0] >> 6 << 14)
						+ (Class28.regionBaseY * 714823515 + var3.anIntArray1955[0] >> 6);
				if (var3.anInt1931 * -744366479 != -1) {
					GPI.cachedDirections[var1] = var3.anInt1931 * -744366479;
				} else {
					GPI.cachedDirections[var1] = -2061229533 * var3.anInt1953;
				}

				GPI.cachedIndices[var1] = var3.targetIndex * 734924805;
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

				if (var1 == 1467227105 * Client.myPlayerIndex
						&& (var3.strictX * 1272643751 < 1536 || var3.strictY * -1801433343 < 1536
								|| var3.strictX * 1272643751 >= 11776 || var3.strictY * -1801433343 >= 11776)) {
					var3.method1043(var4, var6);
					var3.aBool1999 = false;
				} else if (var5) {
					var3.aBool1999 = true;
					var3.anInt2002 = -37570689 * var4;
					var3.anInt2003 = var6 * 1026931509;
				} else {
					var3.aBool1999 = false;
					var3.method1045(var4, var6, GPI.movementTypes[var1]);
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

				if (Client.myPlayerIndex * 1467227105 == var1
						&& (1272643751 * var3.strictX < 1536 || -1801433343 * var3.strictY < 1536
								|| var3.strictX * 1272643751 >= 11776 || var3.strictY * -1801433343 >= 11776)) {
					var3.method1043(var4, var6);
					var3.aBool1999 = false;
				} else if (var5) {
					var3.aBool1999 = true;
					var3.anInt2002 = var4 * -37570689;
					var3.anInt2003 = var6 * 1026931509;
				} else {
					var3.aBool1999 = false;
					var3.method1045(var4, var6, GPI.movementTypes[var1]);
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
					var11 = var4 >> 5 & 31;
					if (var11 > 15) {
						var11 -= 32;
					}

					var10 = var4 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var9 = var3.anIntArray1945[0] + var11;
					var8 = var3.anIntArray1955[0] + var10;
					if (var1 == Client.myPlayerIndex * 1467227105
							&& (var3.strictX * 1272643751 < 1536 || var3.strictY * -1801433343 < 1536
									|| 1272643751 * var3.strictX >= 11776 || -1801433343 * var3.strictY >= 11776)) {
						var3.method1043(var9, var8);
						var3.aBool1999 = false;
					} else if (var5) {
						var3.aBool1999 = true;
						var3.anInt2002 = -37570689 * var9;
						var3.anInt2003 = var8 * 1026931509;
					} else {
						var3.aBool1999 = false;
						var3.method1045(var9, var8, GPI.movementTypes[var1]);
					}

					var3.anInt2004 = (byte) (-1522270499 * var3.anInt2004 + var6 & 3) * -1668953739;
					if (var1 == 1467227105 * Client.myPlayerIndex) {
						InterfaceNode.floorLevel = var3.anInt2004 * -1941196453;
					}

				} else {
					var4 = var0.getBits(30);
					var6 = var4 >> 28;
					var11 = var4 >> 14 & 16383;
					var10 = var4 & 16383;
					var9 = (var11 + Node_Sub10.regionBaseX * 1426698711 + var3.anIntArray1945[0] & 16383)
							- 1426698711 * Node_Sub10.regionBaseX;
					var8 = (var10 + Class28.regionBaseY * 714823515 + var3.anIntArray1955[0] & 16383)
							- 714823515 * Class28.regionBaseY;
					if (1467227105 * Client.myPlayerIndex == var1
							&& (1272643751 * var3.strictX < 1536 || -1801433343 * var3.strictY < 1536
									|| 1272643751 * var3.strictX >= 11776 || var3.strictY * -1801433343 >= 11776)) {
						var3.method1043(var9, var8);
						var3.aBool1999 = false;
					} else if (var5) {
						var3.aBool1999 = true;
						var3.anInt2002 = var9 * -37570689;
						var3.anInt2003 = var8 * 1026931509;
					} else {
						var3.aBool1999 = false;
						var3.method1045(var9, var8, GPI.movementTypes[var1]);
					}

					var3.anInt2004 = -1668953739 * (byte) (var6 + -1522270499 * var3.anInt2004 & 3);
					if (Client.myPlayerIndex * 1467227105 == var1) {
						InterfaceNode.floorLevel = -1941196453 * var3.anInt2004;
					}

				}
			}
		}
	}

	static void method1048(Widget var0) {
		Widget var3 = -1652479707 * var0.parentId == -1 ? null : Class94.method406(var0.parentId * -1652479707);
		int var1;
		int var2;
		if (var3 == null) {
			var1 = Class34.anInt381 * -452716157;
			var2 = 674167779 * Node_Sub9.anInt1339;
		} else {
			var1 = 1645211541 * var3.width;
			var2 = 1227800423 * var3.height;
		}

		Class28.method183(var0, var1, var2, false);
		DualNode_Sub3.method682(var0, var1, var2);
	}

	static String method1049(Widget var0, int var1) {
		return !Node_Sub10.method569(Class30.getWidgetConfig(var0), var1) && var0.anObjectArray1180 == null ? null
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

					for (int var4 = 0; var4 < var0.length(); ++var4) {
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
				Object var10 = Class64.method316(Class70.anApplet587, var2,
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
				Applet var3 = Class70.anApplet587;
				JSObject.getWindow(var3).call("loggedout", (Object[]) null);
			} catch (Throwable var9) {
				;
			}

			try {
				Class70.anApplet587.getAppletContext().showDocument(new URL(Class70.anApplet587.getCodeBase(), var0),
						"_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static Class76[] method1051() {
		return new Class76[] { Class76.BUILD_LIVE, Class76.LIVE, Class76.WIP, Class76.RC };
	}
}
