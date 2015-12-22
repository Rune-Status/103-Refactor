import java.util.Comparator;

final class Class37 implements Comparator {

	static String aString404;
	// $FF: synthetic field
	boolean val$preferOwnWorld;

	public static ObjectDefinition getObjectDefinition(int var0) {
		ObjectDefinition var1 = (ObjectDefinition) ObjectDefinition.aClass106_1685.method427((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectDefinition.aClass87_1682.method391(6, var0);
			var1 = new ObjectDefinition();
			var1.anInt1718 = -55164811 * var0;
			if (var2 != null) {
				var1.method858(new ByteBuf(var2));
			}

			var1.method857();
			if (var1.aBool1720) {
				var1.anInt1690 = 0;
				var1.aBool1714 = false;
			}

			ObjectDefinition.aClass106_1685.method428(var1, (long) var0);
			return var1;
		}
	}

	int method208(Class115 var1, Class115 var2) {
		if (var1.anInt799 * 752101567 == var2.anInt799 * 752101567) {
			return 0;
		} else {
			if (this.val$preferOwnWorld) {
				if (-1631311031 * Client.myWorld == var1.anInt799 * 752101567) {
					return -1;
				}

				if (-1631311031 * Client.myWorld == var2.anInt799 * 752101567) {
					return 1;
				}
			}

			return var1.anInt799 * 752101567 < 752101567 * var2.anInt799 ? -1 : 1;
		}
	}

	public static DualNode_Sub11 method209(int var0) {
		DualNode_Sub11 var1 = (DualNode_Sub11) DualNode_Sub11.aClass106_1545.method427((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DualNode_Sub11.aClass87_1548.method391(16, var0);
			var1 = new DualNode_Sub11();
			if (var2 != null) {
				var1.method723(new ByteBuf(var2));
			}

			DualNode_Sub11.aClass106_1545.method428(var1, (long) var0);
			return var1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method208((Class115) var1, (Class115) var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static void method210(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var7 = (var0 + var1) / 2;
			int var6 = var0;
			World var8 = World.worlds[var7];
			World.worlds[var7] = World.worlds[var1];
			World.worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (method211(World.worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = World.worlds[var9];
					World.worlds[var9] = World.worlds[var6];
					World.worlds[var6++] = var10;
				}
			}

			World.worlds[var1] = World.worlds[var6];
			World.worlds[var6] = var8;
			method210(var0, var6 - 1, var2, var3, var4, var5);
			method210(var6 + 1, var1, var2, var3, var4, var5);
		}

	}

	static int method211(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = Class48.method247(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = Class48.method247(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	static String method212(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (1082541889 * Client.anInt2074 == 1) {
			var0 = var0 + "-wtrc";
		} else if (1082541889 * Client.anInt2074 == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.anInt2074 * 1082541889 == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.anInt2074 * 1082541889 == 5) {
			var0 = var0 + "-wti";
		} else if (1082541889 * Client.anInt2074 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (Client.aString2013 != null) {
			var4 = "/p=" + Client.aString2013;
		}

		String var3 = "runescape.com";
		return var2 + var0 + "." + var3 + "/l=" + Client.anInt2011 * -1025678859 + "/a="
				+ InterfaceNode.anInt1399 * -1929163163 + var4 + "/";
	}

	Class37(boolean var1) {
		this.val$preferOwnWorld = var1;
	}

	static int method213(int var0, int var1) {
		ItemTable var2 = (ItemTable) ItemTable.itemTables.get((long) var0);
		return var2 == null ? 0 : (var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0);
	}

	static void method214() {
		Client.outBuffer.position = 0;
		Client.inBuffer.position = 0;
		Client.frameId = -726667601;
		Client.lastFrameId = -190671919;
		Client.secondLastFrameId = -1000495973;
		Client.thridLastFrameId = 1230533737;
		Client.frameSize = 0;
		Client.anInt2041 = 0;
		Client.anInt2189 = 0;
		Client.menuItemCount = 0;
		Client.menuOpen = false;
		Client.anInt2200 = 0;
		Client.destinationX = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			Client.playerArray[var1] = null;
		}

		Class68.myPlayer = null;

		for (var1 = 0; var1 < Client.npcArray.length; ++var1) {
			Npc var0 = Client.npcArray[var1];
			if (var0 != null) {
				var0.targetIndex = -1611414733;
				var0.aBool1930 = false;
			}
		}

		Colors.method461();
		Node_Sub8.method550(30);

		for (var1 = 0; var1 < 100; ++var1) {
			Client.aBoolArray2118[var1] = true;
		}

		Client.outBuffer.putHeader(23);
		BitBuf var3 = Client.outBuffer;
		int var2 = Client.resizable ? 2 : 1;
		var3.putByte(var2);
		Client.outBuffer.putShort(Class34.gameWidth * -452716157);
		Client.outBuffer.putShort(674167779 * Node_Sub9.gameHeight);
	}
}
