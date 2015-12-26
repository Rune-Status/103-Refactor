import java.util.HashMap;
import java.util.Map;

public class Class32 {

	static Class108 aClass108_354 = new Class108();
	static Class107 aClass107_355 = new Class107(1024);
	static int anInt356;
	static DualNode_Sub13_Sub2[] aDualNode_Sub13_Sub2Array357;
	static int anInt358 = 0;
	static Map aMap359 = new HashMap();

	public static void method193(AbstractIndex var0, AbstractIndex var1, AbstractIndex var2, AbstractIndex var3) {
		Widget.widgetIndex = var0;
		Widget.aClass87_1131 = var1;
		Npc.aClass87_1967 = var2;
		Class96_Sub1.aClass87_1207 = var3;
		Widget.interfaces = new Widget[Widget.widgetIndex.size()][];
		Widget.loadedInterfaces = new boolean[Widget.widgetIndex.size()];
	}

	public static void method194() {
		try {
			Class75.cacheDataFile.method444();

			for (int var0 = 0; var0 < 855046563 * Class75.anInt638; ++var0) {
				Class39.cacheIndexFiles[var0].method444();
			}

			Class75.aClass121_636.method444();
			Class75.randomDat.method444();
		} catch (Exception var1) {
			;
		}

	}

	Class32() throws Throwable {
		throw new Error();
	}

	static final void method195(int var0, int var1) {
		Deque var2 = Client.groundItemDeque[-747958745 * InterfaceNode.floorLevel][var0][var1];
		if (var2 == null) {
			InterfaceNode.landscape.method28(InterfaceNode.floorLevel * -747958745, var0, var1);
		} else {
			long var7 = -99999999L;
			GroundItem var9 = null;

			GroundItem var3;
			for (var3 = (GroundItem) var2.method471(); var3 != null; var3 = (GroundItem) var2.method473()) {
				ItemType var4 = FriendedPlayer.getItemType(-848428919 * var3.anInt1842);
				long var5 = (long) (60742695 * var4.storeValue);
				if (var4.stackable * 1303294175 == 1) {
					var5 *= (long) (1308808435 * var3.quantity + 1);
				}

				if (var5 > var7) {
					var7 = var5;
					var9 = var3;
				}
			}

			if (var9 == null) {
				InterfaceNode.landscape.method28(-747958745 * InterfaceNode.floorLevel, var0, var1);
			} else {
				var2.method474(var9);
				GroundItem var12 = null;
				GroundItem var11 = null;

				for (var3 = (GroundItem) var2.method471(); var3 != null; var3 = (GroundItem) var2.method473()) {
					if (-848428919 * var9.anInt1842 != -848428919 * var3.anInt1842) {
						if (var12 == null) {
							var12 = var3;
						}

						if (var3.anInt1842 * -848428919 != -848428919 * var12.anInt1842 && var11 == null) {
							var11 = var3;
						}
					}
				}

				int var10 = var0 + (var1 << 7) + 1610612736;
				InterfaceNode.landscape.addItemPile(-747958745 * InterfaceNode.floorLevel, var0, var1, NpcType
						.method802(var0 * 128 + 64, var1 * 128 + 64, -747958745 * InterfaceNode.floorLevel), var9,
						var10, var12, var11);
			}
		}
	}

	public static void method196(AbstractIndex var0) {
		VarClientType.varclient_ref = var0;
	}
}
