import java.util.HashMap;
import java.util.Map;

public class Class32 {

	static int anInt356;
	static IndexedSprite[] aDualNode_Sub13_Sub2Array357;
	static Class108 aClass108_354 = new Class108();
	static Class107 aClass107_355 = new Class107(1024);
	static int anInt358 = 0;
	static Map messageContainers = new HashMap();

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

			for (int var0 = 0; var0 < Class75.indexCount; var0++) {
				Scene.cacheIndexFiles[var0].method444();
			}

			Class75.referenceFile.method444();
			Class75.randomDat.method444();
		} catch (Exception var1) {
			;
		}

	}

	Class32() throws Throwable {
		throw new Error();
	}

	static final void method195(int var0, int var1) {
		Deque var2 = Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var0][var1];
		if (var2 == null) {
			InterfaceNode.landscape.method28(InterfaceNode.floorLevel * -1331355705, var0, var1);
		} else {
			long var7 = -99999999L;
			GroundItem var9 = null;

			GroundItem var3;
			for (var3 = (GroundItem) var2.getFront(); var3 != null; var3 = (GroundItem) var2.getNext()) {
				ItemType var12 = FriendedPlayer.getItemType(var3.anInt1842);
				long var11 = (long) var12.storeValue;
				if (var12.stackable == 1) {
					var11 = (long) (var3.quantity + 1) * var11;
				}

				if (var11 > var7) {
					var7 = var11;
					var9 = var3;
				}
			}

			if (var9 == null) {
				InterfaceNode.landscape.method28(InterfaceNode.floorLevel * -1331355705, var0, var1);
			} else {
				var2.addTail(var9);
				GroundItem var121 = null;
				GroundItem var111 = null;

				for (var3 = (GroundItem) var2.getFront(); var3 != null; var3 = (GroundItem) var2.getNext()) {
					if (var9.anInt1842 != var3.anInt1842) {
						if (var121 == null) {
							var121 = var3;
						}

						if (var3.anInt1842 != var121.anInt1842 && var111 == null) {
							var111 = var3;
						}
					}
				}

				int var10 = (var1 << 7) + var0 + 1610612736;
				InterfaceNode.landscape.addItemPile(InterfaceNode.floorLevel * -1331355705, var0, var1,
						NpcType.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, InterfaceNode.floorLevel * -1331355705),
						var9, var10, var121, var111);
			}
		}

	}

	public static void method196(AbstractIndex var0) {
		VarClientType.varclient_ref = var0;
	}

}
