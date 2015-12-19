
public class FriendedPlayer {

	int world;
	boolean aBool736;
	int anInt737;
	boolean aBool738;
	String displayName;
	static int cameraZ;
	static int anInt739;
	static Node_Sub4_Sub1 aNode_Sub4_Sub1_740;
	String previousName;
	static DualNode_Sub13_Sub2[] aDualNode_Sub13_Sub2Array741;

	static final void method407() {
		for (int var0 = 0; var0 < Client.anInt2225 * 727116725; ++var0) {
			int var1 = Client.npcIndices[var0];
			Npc var2 = Client.npcArray[var1];
			if (var2 != null) {
				Class69.method329(var2, -691506967 * var2.definition.anInt1589);
			}
		}

	}

	static final void method408(Character var0) {
		int var1 = -2112283241 * var0.anInt1928 - -1040073859 * Client.engineCycle;
		int var3 = -777033600 * var0.anInt1954 + -2013728192 * var0.anInt1915;
		int var2 = -2013728192 * var0.anInt1915 + 20962432 * var0.anInt1944;
		var0.strictX += (var3 - 1272643751 * var0.strictX) / var1 * 1705682711;
		var0.strictY += 1421914369 * ((var2 - -1801433343 * var0.strictY) / var1);
		var0.anInt1956 = 0;
		var0.anInt1953 = -1269181295 * var0.anInt1948;
	}

	static final void addMenuRow(String var0, String var1, int var2, int var3, int var4, int var5) {
		if (!Client.menuOpen) {
			if (Client.menuItemCount * 1768430155 < 500) {
				Client.menuActions[Client.menuItemCount * 1768430155] = var0;
				Client.menuNouns[Client.menuItemCount * 1768430155] = var1;
				Client.menuOpcodes[1768430155 * Client.menuItemCount] = var2;
				Client.menuArg0[1768430155 * Client.menuItemCount] = var3;
				Client.menuArg1[Client.menuItemCount * 1768430155] = var4;
				Client.menuArg2[1768430155 * Client.menuItemCount] = var5;
				Client.menuItemCount += 1937006435;
			}

		}
	}

	static final void method409(int var0, int var1, int var2, boolean var3) {
		if (DualNode_Sub2.method666(var0)) {
			Class4.method70(Widget.interfaces[var0], -1, var1, var2, var3);
		}
	}

	public static ItemDefinition getItemDefinition(int var0) {
		ItemDefinition var1 = (ItemDefinition) ItemDefinition.aClass106_1606.method427((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemDefinition.aClass87_1622.method391(10, var0);
			var1 = new ItemDefinition();
			var1.anInt1609 = var0 * 763132019;
			if (var2 != null) {
				var1.method808(new ByteBuf(var2));
			}

			var1.method807();
			if (var1.anInt1633 * -507524473 != -1) {
				var1.method819(getItemDefinition(-507524473 * var1.anInt1633),
						getItemDefinition(-322771797 * var1.anInt1640));
			}

			if (125334003 * var1.notedId != -1) {
				var1.method816(getItemDefinition(125334003 * var1.notedId),
						getItemDefinition(1428864645 * var1.unnotedId));
			}

			if (!Class94.aBool735 && var1.aBool1618) {
				var1.name = GameStrings.aString956;
				var1.aBool1624 = false;
				var1.groundActions = null;
				var1.actions = null;
				var1.anInt1639 = 0;
			}

			ItemDefinition.aClass106_1606.method428(var1, (long) var0);
			return var1;
		}
	}

	static void method410(int var0, int var1) {
		Client.outBuffer.putHeader(2);
		Client.outBuffer.putLEInt(var0);
		Client.outBuffer.putShort(var1);
	}
}
