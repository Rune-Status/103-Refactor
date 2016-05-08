import java.io.IOException;
import java.net.URL;

public class Class30 implements Runnable {

	static Widget aWidget339;
	static AbstractSoundSystem aClass8_341;
	boolean aBool336 = true;
	int[] anIntArray337 = new int[500];
	int anInt338 = 0;
	int[] anIntArray340 = new int[500];
	Object anObject342 = new Object();

	public static void method188(Connection con, boolean login) {
		if (Class81.js5Con != null) {
			try {
				Class81.js5Con.shutdown();
			} catch (Exception var7) {
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
								ByteBuf var5 = new ByteBuf(4);
								var5.putByte(4);
								var5.putByte(Class81.xorKey);
								var5.putShort(0);
								Class81.js5Con.write(var5.payload, 0, 4);
							} catch (IOException var6) {
								try {
									Class81.js5Con.shutdown();
								} catch (Exception var51) {
									;
								}

								++Class81.anInt684;
								Class81.js5Con = null;
							}
						}

						Class81.anInt667 = 0;
						Class81.aLong668 = AnimationSkin.currentTimeMs();
						return;
					}

					Class81.aNodeQueue_672.method422(var2);
					Class81.aNodeTable673.put(var2, var2.key);
					++Class81.anInt674;
					--Class81.anInt669;
				}
			}

			Class81.aNodeTable685.put(var2, var2.key);
			++Class81.anInt670;
			--Class81.anInt679;
		}
	}

	public void run() {
		for (; this.aBool336; Class96_Sub1.sleep(50L)) {
			Object var1 = this.anObject342;
			synchronized (var1) {
				if (this.anInt338 < 500) {
					this.anIntArray337[this.anInt338] = MouseInput.anInt621;
					this.anIntArray340[this.anInt338] = MouseInput.anInt622;
					++this.anInt338;
				}
			}
		}

	}

	static boolean loadWorlds() {
		try {
			if (BuildType.aClass26_644 == null) {
				BuildType.aClass26_644 = new Class26(IsaacRandom.taskManager, new URL(Client.worldListURL));
			} else {
				byte[] var4 = BuildType.aClass26_644.method167();
				if (var4 != null) {
					ByteBuf var1 = new ByteBuf(var4);
					World.worldCount = var1.getUShort();
					World.worlds = new World[World.worldCount];

					World var3;
					for (int var2 = 0; var2 < World.worldCount; var3.index = var2++) {
						var3 = World.worlds[var2] = new World();
						var3.id = var1.getUShort();
						var3.flags = var1.getInt();
						var3.domain = var1.getString();
						var3.activity = var1.getString();
						var3.location = var1.getUByte();
						var3.population = var1.getShort();
					}

					Permission.method331(World.worlds, 0, World.worlds.length - 1, World.anIntArray1118,
							World.anIntArray1119);
					BuildType.aClass26_644 = null;
					return true;
				}
			}
		} catch (Exception var41) {
			var41.printStackTrace();
			BuildType.aClass26_644 = null;
		}

		return false;
	}

	static int getWidgetConfig(Widget var0) {
		WidgetConfig var1 = (WidgetConfig) Client.widgetConfigs.get((long) var0.index + ((long) var0.hash << 32));
		return var1 != null ? var1.config : var0.config;
	}

	public static IOrdinal forOrdinal(IOrdinal[] ordinals, int ordinal) {
		for (int index = 0; index < ordinals.length; index++) {
			IOrdinal iordinal = ordinals[index];
			if (iordinal.ordinal() == ordinal) {
				return iordinal;
			}
		}

		return null;
	}

}
