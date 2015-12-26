import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class24 {

	boolean aBool298;
	static int anInt299;
	int anInt300 = -2081218561;
	LinkedHashMap aLinkedHashMap301 = new LinkedHashMap();
	static int anInt302 = -1924448428;
	boolean aBool303;
	static Widget aWidget304;
	static int anInt305;

	Class24() {
		this.method161(true);
	}

	Class24(ByteBuf var1) {
		if (var1 != null && var1.payload != null) {
			int var3 = var1.getUByte();
			if (var3 >= 0 && var3 <= -322571907 * anInt302) {
				if (var1.getUByte() == 1) {
					this.aBool298 = true;
				}

				if (var3 > 1) {
					this.aBool303 = var1.getUByte() == 1;
				}

				if (var3 > 3) {
					this.anInt300 = var1.getUByte() * -2081218561;
				}

				if (var3 > 2) {
					int var2 = var1.getUByte();

					for (int var4 = 0; var4 < var2; ++var4) {
						int var6 = var1.getInt();
						int var5 = var1.getInt();
						this.aLinkedHashMap301.put(Integer.valueOf(var6), Integer.valueOf(var5));
					}
				}
			} else {
				this.method161(true);
			}
		} else {
			this.method161(true);
		}

	}

	ByteBuf method159() {
		ByteBuf var1 = new ByteBuf(100);
		var1.putByte(anInt302 * -322571907);
		var1.putByte(!this.aBool298 ? 0 : 1);
		var1.putByte(this.aBool303 ? 1 : 0);
		var1.putByte(this.anInt300 * -1207115777);
		var1.putByte(this.aLinkedHashMap301.size());
		Iterator var3 = this.aLinkedHashMap301.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var2 = (Entry) var3.next();
			var1.putInt(((Integer) var2.getKey()).intValue());
			var1.putInt(((Integer) var2.getValue()).intValue());
		}

		return var1;
	}

	static void method160(int var0) {
		if (var0 != -1) {
			if (IdentKitType.loadWidget(var0)) {
				Widget[] var4 = Widget.interfaces[var0];

				for (int var3 = 0; var3 < var4.length; ++var3) {
					Widget var2 = var4[var3];
					if (var2.anObjectArray1170 != null) {
						ScriptEvent var1 = new ScriptEvent();
						var1.aWidget1430 = var2;
						var1.args = var2.anObjectArray1170;
						Class52.method261(var1, 2000000);
					}
				}

			}
		}
	}

	void method161(boolean var1) {
	}

	static final void method162() {
		for (GraphicsStub var0 = (GraphicsStub) Client.graphicsObjectDeque
				.method471(); var0 != null; var0 = (GraphicsStub) Client.graphicsObjectDeque.method473()) {
			if (var0.floorLevel * 1273709753 == -747958745 * InterfaceNode.floorLevel && !var0.finished) {
				if (Client.engineCycle * -1040073859 >= -301779367 * var0.startCycle) {
					var0.method934(-1163930299 * Client.anInt2066, (byte) 15);
					if (var0.finished) {
						var0.unlink();
					} else {
						InterfaceNode.landscape.method19(1273709753 * var0.floorLevel, -668663027 * var0.regionX,
								1843197595 * var0.regionY, 2033316957 * var0.height, 60, var0, 0, -1, false);
					}
				}
			} else {
				var0.unlink();
			}
		}

	}

	public static DualNode_Sub13_Sub3_Sub1 method163(AbstractIndex sprites, AbstractIndex fonts, String fontName, String childName) {
		int fileId = sprites.getFile(fontName);
		int childId = sprites.getChild(fileId, childName);
		DualNode_Sub13_Sub3_Sub1 var5;
		if (!Class35.method202(sprites, fileId, childId)) {
			var5 = null;
		} else {
			var5 = IgnoredPlayer.method415(fonts.getFile(fileId, childId));
		}

		return var5;
	}

	static final void method164(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (IdentKitType.loadWidget(var0)) {
			Class6.aWidgetArray146 = null;
			Class53.method272(Widget.interfaces[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (Class6.aWidgetArray146 != null) {
				Class53.method272(Class6.aWidgetArray146, -1412584499, var1, var2, var3, var4,
						316500889 * BoundaryStub.anInt276, -3174751 * Class75.anInt637, var7);
				Class6.aWidgetArray146 = null;
			}

		} else {
			if (var7 != -1) {
				Client.aBoolArray2118[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.aBoolArray2118[var8] = true;
				}
			}

		}
	}
}
