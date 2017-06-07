public class MachineInfo extends Node {

	int anInt1341;
	int anInt1346;
	int anInt1353;
	int anInt1357;
	int anInt1358;
	int anInt1359;
	static int chunkLeftX;
	int[] anIntArray1362 = new int[3];
	int osType;
	String aString1354;
	String aString1351;
	String aString1355;
	String aString1356;
	String aString1360;
	String aString1361;
	boolean os32Bit;
	int osVersionType;
	int javaVendorType;
	int javaVersionMajor;
	int javaVersionMinor;
	int javaVersionPatch;
	boolean aBool1364;
	int maxMemoryMB;
	int availProcessors;
	int anInt1352;

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
				for (var2 = 0; var2 < var1.length; var2++) {
					var3 = var1[var2];
					if (var3 == var0) {
						return true;
					}
				}

				var1 = Class83.aCharArray687;

				for (var2 = 0; var2 < var1.length; var2++) {
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
		var1.putByte(this.osType);
		var1.putByte(this.os32Bit ? 1 : 0);
		var1.putByte(this.osVersionType);
		var1.putByte(this.javaVendorType);
		var1.putByte(this.javaVersionMajor);
		var1.putByte(this.javaVersionMinor);
		var1.putByte(this.javaVersionPatch);
		var1.putByte(this.aBool1364 ? 1 : 0);
		var1.putShort(this.maxMemoryMB);
		var1.putByte(this.availProcessors);
		var1.putMedium(this.anInt1352);
		var1.putShort(this.anInt1353 * -620298247);
		var1.putJagString(this.aString1354);
		var1.putJagString(this.aString1351);
		var1.putJagString(this.aString1355);
		var1.putJagString(this.aString1356);
		var1.putByte(this.anInt1358 * 1311683181);
		var1.putShort(this.anInt1357 * 32408097);
		var1.putJagString(this.aString1360);
		var1.putJagString(this.aString1361);
		var1.putByte(this.anInt1341 * 153252251);
		var1.putByte(this.anInt1359 * 2060761779);

		for (int var2 = 0; var2 < this.anIntArray1362.length; var2++) {
			var1.putInt(this.anIntArray1362[var2]);
		}

		var1.putInt(this.anInt1346 * 1223494517);
	}

	public MachineInfo(boolean var1) {
		if (var1) {
			if (DynamicObject.osNameLC.startsWith("win")) {
				this.osType = 1;
			} else if (DynamicObject.osNameLC.startsWith("mac")) {
				this.osType = 2;
			} else if (DynamicObject.osNameLC.startsWith("linux")) {
				this.osType = 3;
			} else {
				this.osType = 4;
			}

			String osArch;
			try {
				osArch = System.getProperty("os.arch").toLowerCase();
			} catch (Exception var12) {
				osArch = "";
			}

			String osVersion;
			try {
				osVersion = System.getProperty("os.version").toLowerCase();
			} catch (Exception var11) {
				osVersion = "";
			}

			String javaVendor = "Unknown";
			String javaVersion = "1.1";

			try {
				javaVendor = System.getProperty("java.vendor");
				javaVersion = System.getProperty("java.version");
			} catch (Exception var10) {
				;
			}

			if (!osArch.startsWith("amd64") && !osArch.startsWith("x86_64")) {
				this.os32Bit = false;
			} else {
				this.os32Bit = true;
			}

			if (this.osType == 1) {
				if (osVersion.indexOf("4.0") != -1) {
					this.osVersionType = 1;
				} else if (osVersion.indexOf("4.1") != -1) {
					this.osVersionType = 2;
				} else if (osVersion.indexOf("4.9") != -1) {
					this.osVersionType = 3;
				} else if (osVersion.indexOf("5.0") != -1) {
					this.osVersionType = 4;
				} else if (osVersion.indexOf("5.1") != -1) {
					this.osVersionType = 5;
				} else if (osVersion.indexOf("5.2") != -1) {
					this.osVersionType = 8;
				} else if (osVersion.indexOf("6.0") != -1) {
					this.osVersionType = 6;
				} else if (osVersion.indexOf("6.1") != -1) {
					this.osVersionType = 7;
				} else if (osVersion.indexOf("6.2") != -1) {
					this.osVersionType = 9;
				} else if (osVersion.indexOf("6.3") != -1) {
					this.osVersionType = 10;
				}
			} else if (this.osType == 2) {
				if (osVersion.indexOf("10.4") != -1) {
					this.osVersionType = 20;
				} else if (osVersion.indexOf("10.5") != -1) {
					this.osVersionType = 21;
				} else if (osVersion.indexOf("10.6") != -1) {
					this.osVersionType = 22;
				} else if (osVersion.indexOf("10.7") != -1) {
					this.osVersionType = 23;
				} else if (osVersion.indexOf("10.8") != -1) {
					this.osVersionType = 24;
				} else if (osVersion.indexOf("10.9") != -1) {
					this.osVersionType = 25;
				} else if (osVersion.indexOf("10.10") != -1) {
					this.osVersionType = 26;
				}
			}

			if (javaVendor.toLowerCase().indexOf("sun") != -1) {
				this.javaVendorType = 1;
			} else if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
				this.javaVendorType = 2;
			} else if (javaVendor.toLowerCase().indexOf("apple") != -1) {
				this.javaVendorType = 3;
			} else if (javaVendor.toLowerCase().indexOf("oracle") != -1) {
				this.javaVendorType = 5;
			} else {
				this.javaVendorType = 4;
			}

			int index = 2;
			int acc = 0;
			
			char c;
			try {
				while (index < javaVersion.length()) {
					c = javaVersion.charAt(index);
					if (c < 48 || c > 57) {
						break;
					}
					
					acc = acc * 10 + (c - 48);
					++index;
				}
			} catch (Exception var15) {
				;
			}

			this.javaVersionMajor = acc;
			index = javaVersion.indexOf(46, 2) + 1;
			acc = 0;

			try {
				while (index < javaVersion.length()) {
					c = javaVersion.charAt(index);
					if (c < 48 || c > 57) {
						break;
					}

					acc = acc * 10 + (c - 48);
					++index;
				}
			} catch (Exception var14) {
				;
			}

			this.javaVersionMinor = acc;
			index = javaVersion.indexOf(95, 4) + 1;
			acc = 0;

			try {
				while (index < javaVersion.length()) {
					c = javaVersion.charAt(index);
					if (c < 48 || c > 57) {
						break;
					}

					acc = acc * 10 + (c - 48);
					++index;
				}
			} catch (Exception var13) {
				;
			}

			this.javaVersionPatch = acc;
			this.aBool1364 = false;
			this.maxMemoryMB = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
			if (this.javaVersionMajor > 3) {
				this.availProcessors = Runtime.getRuntime().availableProcessors();
			} else {
				this.availProcessors = 0;
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
		return (var0 >> var1 + 1 & 0x1) != 0;
	}

}
