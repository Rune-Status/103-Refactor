import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public final class Class41 {

	static int subPort;

	static String method223(int var0) {
		return "<img=" + var0 + ">";
	}

	Class41() throws Throwable {
		throw new Error();
	}

	static void method224() {
		Class6.username = Class6.username.trim();
		if (Class6.username.length() == 0) {
			GPI.method230(GameStrings.aString1085, GameStrings.aString1086, GameStrings.aString1087);
		} else {
			long var0 = Class8.method81();
			byte var2;
			if (0L == var0) {
				var2 = 5;
			} else {
				String var3 = Class6.username;
				Random var4 = new Random();
				ByteBuf var5 = new ByteBuf(128);
				ByteBuf var6 = new ByteBuf(128);
				int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
				var5.putByte(10);

				int var8;
				for (var8 = 0; var8 < 4; ++var8) {
					var5.putInt(var4.nextInt());
				}

				var5.putInt(var7[0]);
				var5.putInt(var7[1]);
				var5.putLong(var0);
				var5.putLong(0L);

				for (var8 = 0; var8 < 4; ++var8) {
					var5.putInt(var4.nextInt());
				}

				var5.encryptRSA(Class22.aBigInteger283, Class22.aBigInteger284);
				var6.putByte(10);

				for (var8 = 0; var8 < 3; ++var8) {
					var6.putInt(var4.nextInt());
				}

				var6.putLong(var4.nextLong());
				var6.put48Bit(var4.nextLong());
				byte[] var24 = new byte[24];

				try {
					Class75.randomDat.seek(0L);
					Class75.randomDat.read(var24);

					int var9;
					for (var9 = 0; var9 < 24 && var24[var9] == 0; ++var9) {
						;
					}

					if (var9 >= 24) {
						throw new IOException();
					}
				} catch (Exception var22) {
					for (int var10 = 0; var10 < 24; ++var10) {
						var24[var10] = -1;
					}
				}

				var6.putBytes(var24, 0, 24);
				var6.putLong(var4.nextLong());
				var6.encryptRSA(Class22.aBigInteger283, Class22.aBigInteger284);
				var8 = TileDecorationStub.getLength(var3);
				if (var8 % 8 != 0) {
					var8 += 8 - var8 % 8;
				}

				ByteBuf var23 = new ByteBuf(var8);
				var23.putString(var3);
				var23.position = var8 * -184175589;
				var23.encryptXTEA(var7);
				ByteBuf var25 = new ByteBuf(
						var5.position * 314639891 + 5 + 314639891 * var6.position + var23.position * 314639891);
				var25.putByte(2);
				var25.putByte(var5.position * 314639891);
				var25.putBytes(var5.payload, 0, var5.position * 314639891);
				var25.putByte(314639891 * var6.position);
				var25.putBytes(var6.payload, 0, var6.position * 314639891);
				var25.putShort(var23.position * 314639891);
				var25.putBytes(var23.payload, 0, var23.position * 314639891);
				String var11 = Character.method1019(var25.payload);

				byte var17;
				try {
					URL var12 = new URL(Class37.method212("services", false) + "m=accountappeal/login.ws");
					URLConnection var13 = var12.openConnection();
					var13.setDoInput(true);
					var13.setDoOutput(true);
					var13.setConnectTimeout(5000);
					OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
					var14.write(
							"data2=" + Class58.method288(var11) + "&dest=" + Class58.method288("passwordchoice.ws"));
					var14.flush();
					InputStream var15 = var13.getInputStream();
					var25 = new ByteBuf(new byte[1000]);

					while (true) {
						int var16 = var15.read(var25.payload, 314639891 * var25.position,
								1000 - var25.position * 314639891);
						if (var16 == -1) {
							var14.close();
							var15.close();
							String var26 = new String(var25.payload);
							if (var26.startsWith("OFFLINE")) {
								var17 = 4;
							} else if (var26.startsWith("WRONG")) {
								var17 = 7;
							} else if (var26.startsWith("RELOAD")) {
								var17 = 3;
							} else if (var26.startsWith("Not permitted for social network accounts.")) {
								var17 = 6;
							} else {
								var25.decryptXTEA(var7);

								while (var25.position * 314639891 > 0
										&& var25.payload[var25.position * 314639891 - 1] == 0) {
									var25.position -= -184175589;
								}

								var26 = new String(var25.payload, 0, 314639891 * var25.position);
								boolean var18;
								if (var26 == null) {
									var18 = false;
								} else {
									label81: {
										try {
											new URL(var26);
										} catch (MalformedURLException var20) {
											var18 = false;
											break label81;
										}

										var18 = true;
									}
								}

								if (var18) {
									Class96_Sub1.method503(var26, true, "openjs", false);
									var17 = 2;
								} else {
									var17 = 5;
								}
							}
							break;
						}

						var25.position += -184175589 * var16;
						if (314639891 * var25.position >= 1000) {
							var17 = 5;
							break;
						}
					}
				} catch (Throwable var21) {
					var21.printStackTrace();
					var17 = 5;
				}

				var2 = var17;
			}

			switch (var2) {
			case 2:
				GPI.method230(GameStrings.aString1088, GameStrings.aString1089, GameStrings.aString1090);
				Class6.anInt116 = -1303002726;
				break;
			case 3:
				GPI.method230(GameStrings.aString1091, GameStrings.aString1092, GameStrings.aString958);
				break;
			case 4:
				GPI.method230(GameStrings.aString1013, GameStrings.aString1095, GameStrings.aString901);
				break;
			case 5:
				GPI.method230(GameStrings.aString1097, GameStrings.aString889, GameStrings.aString1099);
				break;
			case 6:
				GPI.method230(GameStrings.aString867, GameStrings.aString1101, GameStrings.aString1056);
				break;
			case 7:
				GPI.method230(GameStrings.aString1103, GameStrings.aString1104, GameStrings.aString1105);
			}

		}
	}

	public static Class51[] method225(int var0) {
		return new Class51[] { Class51.aClass51_527, Class51.aClass51_524, Class51.aClass51_523 };
	}

	static final void method226(Node_Sub8 var0) {
		int var1 = 0;
		int var3 = -1;
		int var5 = 0;
		int var4 = 0;
		if (-1976125003 * var0.anInt1303 == 0) {
			var1 = InterfaceNode.landscape.method53(584375567 * var0.anInt1302, -1096801001 * var0.anInt1300,
					-127960105 * var0.anInt1312);
		}

		if (-1976125003 * var0.anInt1303 == 1) {
			var1 = InterfaceNode.landscape.method31(584375567 * var0.anInt1302, var0.anInt1300 * -1096801001,
					var0.anInt1312 * -127960105);
		}

		if (-1976125003 * var0.anInt1303 == 2) {
			var1 = InterfaceNode.landscape.method32(584375567 * var0.anInt1302, var0.anInt1300 * -1096801001,
					-127960105 * var0.anInt1312);
		}

		if (-1976125003 * var0.anInt1303 == 3) {
			var1 = InterfaceNode.landscape.method33(584375567 * var0.anInt1302, var0.anInt1300 * -1096801001,
					var0.anInt1312 * -127960105);
		}

		if (var1 != 0) {
			int var2 = InterfaceNode.landscape.method34(var0.anInt1302 * 584375567, var0.anInt1300 * -1096801001,
					var0.anInt1312 * -127960105, var1);
			var3 = var1 >> 14 & 32767;
			var5 = var2 & 31;
			var4 = var2 >> 6 & 3;
		}

		var0.anInt1304 = var3 * 561554519;
		var0.anInt1313 = var5 * 1198251989;
		var0.anInt1306 = -880682117 * var4;
	}
}
