import java.io.IOException;
import java.net.URL;

public class Class30 implements Runnable {

	boolean aBool336 = true;
	int[] anIntArray337 = new int[500];
	int anInt338 = 0;
	static Widget aWidget339;
	int[] anIntArray340 = new int[500];
	static Class8 aClass8_341;
	Object anObject342 = new Object();

	public static void method188(Connection con, boolean login) {
		if (Class81.js5Con != null) {
			try {
				Class81.js5Con.shutdown();
			} catch (Exception var6) {
				;
			}

			Class81.js5Con = null;
		}

		Class81.js5Con = con;
		ScriptEvent.sendConInfo(login);
		Class81.aBuffer677.position = 0;
		Class1.currentRequest = null;
		Class81.currentBuffer = null;
		Class81.currentPosition = 0;

		while (true) {
			FileRequest var2 = (FileRequest) Class81.aNodeTable682.method150();
			if (var2 == null) {
				while (true) {
					var2 = (FileRequest) Class81.aNodeTable675.method150();
					if (var2 == null) {
						if (Class81.xorKey != 0) {
							try {
								ByteBuf var7 = new ByteBuf(4);
								var7.putByte(4);
								var7.putByte(Class81.xorKey);
								var7.putShort(0);
								Class81.js5Con.write(var7.payload, 0, 4);
							} catch (IOException var5) {
								try {
									Class81.js5Con.shutdown();
								} catch (Exception var4) {
									;
								}

								Class81.anInt684 += -1096754175;
								Class81.js5Con = null;
							}
						}

						Class81.anInt667 = 0;
						Class81.aLong668 = Node_Sub5.currentTimeMs() * 8420123348744189037L;
						return;
					}

					Class81.aClass105_672.method422(var2);
					Class81.aNodeTable673.put(var2, var2.key);
					Class81.anInt674 += 556834453;
					Class81.anInt669 -= 30759979;
				}
			}

			Class81.aNodeTable685.put(var2, var2.key);
			Class81.anInt670 += -1554399579;
			Class81.anInt679 -= 255344863;
		}
	}

	public void run() {
		for (; this.aBool336; Class96_Sub1.sleep(50L)) {
			Object var1 = this.anObject342;
			synchronized (var1) {
				if (this.anInt338 * 598524519 < 500) {
					this.anIntArray337[598524519 * this.anInt338] = -453286219 * Class74.anInt621;
					this.anIntArray340[598524519 * this.anInt338] = Class74.anInt622 * 103771565;
					this.anInt338 += -396936873;
				}
			}
		}

	}

	static boolean loadWorlds() {
		try {
			if (Class76.aClass26_644 == null) {
				Class76.aClass26_644 = new Class26(IsaacRandom.aClass63_102, new URL(Client.aString2012));
			} else {
				byte[] var0 = Class76.aClass26_644.method167();
				if (var0 != null) {
					ByteBuf var1 = new ByteBuf(var0);
					World.worldCount = var1.getUShort() * 1128208321;
					World.worlds = new World[-1946617791 * World.worldCount];

					for (int var2 = 0; var2 < World.worldCount * -1946617791; ++var2) {
						World var3 = World.worlds[var2] = new World();
						var3.id = var1.getUShort() * -430891615;
						var3.flags = var1.getInt() * 1825398059;
						var3.domain = var1.getString();
						var3.activity = var1.getString();
						var3.location = var1.getUByte() * -348321337;
						var3.population = var1.getShort() * 1388875023;
						var3.index = var2 * -882618271;
					}

					Permission.method331(World.worlds, 0, World.worlds.length - 1, World.anIntArray1118,
							World.anIntArray1119);
					Class76.aClass26_644 = null;
					return true;
				}
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			Class76.aClass26_644 = null;
		}

		return false;
	}

	static int getWidgetConfig(Widget var0) {
		WidgetConfig var1 = (WidgetConfig) Client.widgetConfigs
				.get((long) (2021294259 * var0.index) + ((long) (-1536575275 * var0.hash) << 32));
		return var1 != null ? var1.config : var0.config * -1817319735;
	}

	public static IOrdinal forOrdinal(IOrdinal[] ordinals, int ordinal) {
		for (int index = 0; index < ordinals.length; ++index) {
			IOrdinal iordinal = ordinals[index];
			if (ordinal == iordinal.ordinal()) {
				return iordinal;
			}
		}

		return null;
	}
}
