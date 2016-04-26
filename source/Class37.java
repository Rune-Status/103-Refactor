import java.util.Comparator;

final class Class37 implements Comparator {

	static String pinText;
	boolean val$preferOwnWorld;

	public static ObjectType getObjectType(int id) {
		ObjectType type = (ObjectType) ObjectType.objects.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = ObjectType.objects_ref.getFile(6, id);
			type = new ObjectType();
			type.id = id;
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			type.post();
			if (type.aBool1720) {
				type.anInt1690 = 0;
				type.aBool1714 = false;
			}

			ObjectType.objects.put(type, (long) id);
			return type;
		}
	}

	int method208(Class115 var1, Class115 var2) {
		if (var1.anInt799 == var2.anInt799) {
			return 0;
		} else {
			if (this.val$preferOwnWorld) {
				if (Client.myWorld == var1.anInt799) {
					return -1;
				}

				if (Client.myWorld == var2.anInt799) {
					return 1;
				}
			}

			return var1.anInt799 < var2.anInt799 ? -1 : 1;
		}
	}

	public static VarPlayerType getVarPlayerType(int id) {
		VarPlayerType type = (VarPlayerType) VarPlayerType.varplayers.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = VarPlayerType.varplayer_ref.getFile(16, id);
			type = new VarPlayerType();
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			VarPlayerType.varplayers.put(type, (long) id);
			return type;
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

			for (int var9 = var0; var9 < var1; var9++) {
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

	static String method212(String subDomain, boolean ssl) {
		String protocol = ssl ? "https://" : "http://";
		if (Client.socketType == 1) {
			subDomain = subDomain + "-wtrc";
		} else if (Client.socketType == 2) {
			subDomain = subDomain + "-wtqa";
		} else if (Client.socketType == 3) {
			subDomain = subDomain + "-wtwip";
		} else if (Client.socketType == 5) {
			subDomain = subDomain + "-wti";
		} else if (Client.socketType == 4) {
			subDomain = "local";
		}

		String var4 = "";
		if (Client.sessionToken != null) {
			var4 = "/p=" + Client.sessionToken;
		}

		String domain = "runescape.com";
		return protocol + subDomain + "." + domain + "/l=" + Client.anInt2011 + "/a=" + InterfaceNode.anInt1399 + var4
				+ "/";
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
		Client.frameId = -1;
		Client.lastFrameId = -1;
		Client.secondLastFrameId = -1;
		Client.thridLastFrameId = -1;
		Client.frameSize = 0;
		Client.anInt2041 = 0;
		Client.anInt2189 = 0;
		Client.menuItemCount = 0;
		Client.menuOpen = false;
		Client.anInt2200 = 0;
		Client.destinationX = 0;

		int var1;
		for (var1 = 0; var1 < 2048; var1++) {
			Client.playerArray[var1] = null;
		}

		Class68.myPlayer = null;

		for (var1 = 0; var1 < Client.npcArray.length; var1++) {
			Npc var3 = Client.npcArray[var1];
			if (var3 != null) {
				var3.targetIndex = -1;
				var3.aBool1930 = false;
			}
		}

		Colors.method461();
		Node_Sub8.method550(30);

		for (var1 = 0; var1 < 100; var1++) {
			Client.aBoolArray2118[var1] = true;
		}

		Client.outBuffer.putHeader(23);
		BitBuf var31 = Client.outBuffer;
		int var2 = Client.resizable ? 2 : 1;
		var31.putByte(var2);
		Client.outBuffer.putShort(Class34.gameWidth);
		Client.outBuffer.putShort(Node_Sub9.gameHeight);
	}

}
