
public class Node_Sub10 extends Node {

	int anInt1341;
	int anInt1342;
	int anInt1343;
	boolean aBool1344;
	int anInt1345;
	int anInt1346;
	int anInt1347;
	int anInt1348;
	int anInt1349;
	int anInt1350;
	String aString1351;
	int anInt1352;
	int anInt1353;
	String aString1354;
	String aString1355;
	String aString1356;
	int anInt1357;
	int anInt1358;
	int anInt1359;
	String aString1360;
	String aString1361;
	int[] anIntArray1362 = new int[3];
	int anInt1363;
	boolean aBool1364;
	static int chunkLeftX;

	static final boolean method565(char var0) {
		if (java.lang.Character.isISOControl(var0)) {
			return false;
		} else {
			boolean var4 = var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
			if (var4) {
				return true;
			} else {
				char[] var1 = Class83.aCharArray688;

				int var2;
				char var3;
				for (var2 = 0; var2 < var1.length; ++var2) {
					var3 = var1[var2];
					if (var3 == var0) {
						return true;
					}
				}

				var1 = Class83.aCharArray687;

				for (var2 = 0; var2 < var1.length; ++var2) {
					var3 = var1[var2];
					if (var3 == var0) {
						return true;
					}
				}

				return false;
			}
		}
	}

	public void method566(ByteBuf var1) {
		var1.putByte(6);
		var1.putByte(-411220879 * this.anInt1343);
		var1.putByte(this.aBool1344 ? 1 : 0);
		var1.putByte(this.anInt1345 * 567640867);
		var1.putByte(-1844108581 * this.anInt1363);
		var1.putByte(this.anInt1349 * 535197789);
		var1.putByte(-1149750771 * this.anInt1348);
		var1.putByte(1374491313 * this.anInt1342);
		var1.putByte(this.aBool1364 ? 1 : 0);
		var1.putShort(-864398599 * this.anInt1350);
		var1.putByte(-856978823 * this.anInt1347);
		var1.putMedium(-830383997 * this.anInt1352);
		var1.putShort(-620298247 * this.anInt1353);
		var1.putJagString(this.aString1354);
		var1.putJagString(this.aString1351);
		var1.putJagString(this.aString1355);
		var1.putJagString(this.aString1356);
		var1.putByte(1311683181 * this.anInt1358);
		var1.putShort(32408097 * this.anInt1357);
		var1.putJagString(this.aString1360);
		var1.putJagString(this.aString1361);
		var1.putByte(this.anInt1341 * 153252251);
		var1.putByte(this.anInt1359 * 2060761779);

		for (int var2 = 0; var2 < this.anIntArray1362.length; ++var2) {
			var1.putInt(this.anIntArray1362[var2]);
		}

		var1.putInt(1223494517 * this.anInt1346);
	}

	public Node_Sub10(boolean var1) {
		if (var1) {
			if (DynamicObject.osNameLC.startsWith("win")) {
				this.anInt1343 = 1610480785;
			} else if (DynamicObject.osNameLC.startsWith("mac")) {
				this.anInt1343 = -1074005726;
			} else if (DynamicObject.osNameLC.startsWith("linux")) {
				this.anInt1343 = 536475059;
			} else {
				this.anInt1343 = 2146955844;
			}

			String var2;
			try {
				var2 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception var11) {
				var2 = "";
			}

			String var4;
			try {
				var4 = System.getProperty("os.version").toLowerCase();
			} catch (Exception var10) {
				var4 = "";
			}

			String var3 = "Unknown";
			String var5 = "1.1";

			try {
				var3 = System.getProperty("java.vendor");
				var5 = System.getProperty("java.version");
			} catch (Exception var9) {
				;
			}

			if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
				this.aBool1344 = false;
			} else {
				this.aBool1344 = true;
			}

			if (this.anInt1343 * -411220879 == 1) {
				if (var4.indexOf("4.0") != -1) {
					this.anInt1345 = 14271627;
				} else if (var4.indexOf("4.1") != -1) {
					this.anInt1345 = 28543254;
				} else if (var4.indexOf("4.9") != -1) {
					this.anInt1345 = 42814881;
				} else if (var4.indexOf("5.0") != -1) {
					this.anInt1345 = 57086508;
				} else if (var4.indexOf("5.1") != -1) {
					this.anInt1345 = 71358135;
				} else if (var4.indexOf("5.2") != -1) {
					this.anInt1345 = 114173016;
				} else if (var4.indexOf("6.0") != -1) {
					this.anInt1345 = 85629762;
				} else if (var4.indexOf("6.1") != -1) {
					this.anInt1345 = 99901389;
				} else if (var4.indexOf("6.2") != -1) {
					this.anInt1345 = 128444643;
				} else if (var4.indexOf("6.3") != -1) {
					this.anInt1345 = 142716270;
				}
			} else if (this.anInt1343 * -411220879 == 2) {
				if (var4.indexOf("10.4") != -1) {
					this.anInt1345 = 285432540;
				} else if (var4.indexOf("10.5") != -1) {
					this.anInt1345 = 299704167;
				} else if (var4.indexOf("10.6") != -1) {
					this.anInt1345 = 313975794;
				} else if (var4.indexOf("10.7") != -1) {
					this.anInt1345 = 328247421;
				} else if (var4.indexOf("10.8") != -1) {
					this.anInt1345 = 342519048;
				} else if (var4.indexOf("10.9") != -1) {
					this.anInt1345 = 356790675;
				} else if (var4.indexOf("10.10") != -1) {
					this.anInt1345 = 371062302;
				}
			}

			if (var3.toLowerCase().indexOf("sun") != -1) {
				this.anInt1363 = -2071721645;
			} else if (var3.toLowerCase().indexOf("microsoft") != -1) {
				this.anInt1363 = 151524006;
			} else if (var3.toLowerCase().indexOf("apple") != -1) {
				this.anInt1363 = -1920197639;
			} else if (var3.toLowerCase().indexOf("oracle") != -1) {
				this.anInt1363 = -1768673633;
			} else {
				this.anInt1363 = 303048012;
			}

			int var6 = 2;
			int var7 = 0;

			char var8;
			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var8 - 48 + 10 * var7;
					++var6;
				}
			} catch (Exception var14) {
				;
			}

			this.anInt1349 = var7 * -522118155;
			var6 = var5.indexOf(46, 2) + 1;
			var7 = 0;

			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = var7 * 10 + (var8 - 48);
					++var6;
				}
			} catch (Exception var13) {
				;
			}

			this.anInt1348 = -537629499 * var7;
			var6 = var5.indexOf(95, 4) + 1;
			var7 = 0;

			try {
				while (var6 < var5.length()) {
					var8 = var5.charAt(var6);
					if (var8 < 48 || var8 > 57) {
						break;
					}

					var7 = 10 * var7 + (var8 - 48);
					++var6;
				}
			} catch (Exception var12) {
				;
			}

			this.anInt1342 = 1077409361 * var7;
			this.aBool1364 = false;
			this.anInt1350 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1291858103;
			if (535197789 * this.anInt1349 > 3) {
				this.anInt1347 = Runtime.getRuntime().availableProcessors() * -1530871863;
			} else {
				this.anInt1347 = 0;
			}

			this.anInt1352 = 0;
		}

		if (this.aString1354 == null) {
			this.aString1354 = "";
		}

		if (this.aString1351 == null) {
			this.aString1351 = "";
		}

		if (this.aString1355 == null) {
			this.aString1355 = "";
		}

		if (this.aString1356 == null) {
			this.aString1356 = "";
		}

		if (this.aString1360 == null) {
			this.aString1360 = "";
		}

		if (this.aString1361 == null) {
			this.aString1361 = "";
		}

		this.method568();
	}

	public int method567() {
		byte var1 = 38;
		String var16 = this.aString1354;
		int var7 = var16.length() + 2;
		int var20 = var1 + var7;
		String var11 = this.aString1351;
		int var3 = var11.length() + 2;
		var20 += var3;
		String var14 = this.aString1355;
		int var12 = var14.length() + 2;
		var20 += var12;
		String var8 = this.aString1356;
		int var9 = var8.length() + 2;
		var20 += var9;
		String var4 = this.aString1360;
		int var18 = var4.length() + 2;
		var20 += var18;
		String var5 = this.aString1361;
		int var10 = var5.length() + 2;
		var20 += var10;
		return var20;
	}

	void method568() {
		if (this.aString1354.length() > 40) {
			this.aString1354 = this.aString1354.substring(0, 40);
		}

		if (this.aString1351.length() > 40) {
			this.aString1351 = this.aString1351.substring(0, 40);
		}

		if (this.aString1355.length() > 10) {
			this.aString1355 = this.aString1355.substring(0, 10);
		}

		if (this.aString1356.length() > 10) {
			this.aString1356 = this.aString1356.substring(0, 10);
		}

	}

	public static boolean method569(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}
}
