public class VarPlayerType extends DualNode {

	public static int[] offsetsY;
	public static int anInt1547;
	static AbstractIndex varplayer_ref;
	public int anInt1546 = 0;
	static NodeMap varplayers = new NodeMap(64);

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method726(var1, var2);
		}
	}

	static int method724() {
		return ++Class32.anInt358 - 1;
	}

	static Widget method725(Widget var0) {
		int var1 = CacheIndex.method555(Class30.getWidgetConfig(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; var2++) {
				var0 = Class94.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}

	void method726(ByteBuf var1, int var2) {
		if (var2 == 5) {
			this.anInt1546 = var1.getUShort();
		}

	}

	public static void method727() {
		varplayers.method429();
	}

	public static String method728(CharSequence var0, Class124 var1) {
		if (var0 == null) {
			return null;
		} else {
			int var4 = 0;

			int var5;
			for (var5 = var0.length(); var4 < var5 && EnumType.method688(var0.charAt(var4)); var4++) {
				;
			}

			while (var5 > var4 && EnumType.method688(var0.charAt(var5 - 1))) {
				--var5;
			}

			int var2 = var5 - var4;
			if (var2 >= 1 && var2 <= InvType.method693(var1)) {
				StringBuilder var3 = new StringBuilder(var2);

				for (int var8 = var4; var8 < var5; var8++) {
					char var6 = var0.charAt(var8);
					if (Node_Sub10.method565(var6)) {
						char var7 = Class39.method216(var6);
						if (var7 != 0) {
							var3.append(var7);
						}
					}
				}

				if (var3.length() == 0) {
					return null;
				} else {
					return var3.toString();
				}
			} else {
				return null;
			}
		}
	}

	public static NpcType getNpcType(int id) {
		NpcType type = (NpcType) NpcType.npcs.get((long) id);
		if (type == null) {
			byte[] bytes = Class84.npc_ref.getFile(9, id);
			type = new NpcType();
			type.id = id;
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			type.post();
			NpcType.npcs.put(type, (long) id);
			return type;
		} else {
			return type;
		}
	}

}
