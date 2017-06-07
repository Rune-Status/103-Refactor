public class ObjectType extends DualNode {

	static AbstractIndex objects_ref;
	static AbstractIndex aClass87_1683;
	static int anInt1695;
	public int id;
	static Widget aWidget1719;
	public int sizeX = 1;
	public boolean modelClipped = false;
	public int anInt1687 = 0;
	public String name = "null";
	public int anInt1690 = 2;
	public int anInt1692 = -1;
	public int sizeY = 1;
	int clipType = -1;
	public int anInt1698 = -1;
	public int anInt1699 = 16;
	int ambient = 0;
	int contrast = 0;
	public String[] actions = new String[5];
	boolean nonFlatShading = false;
	public int anInt1703 = -1;
	boolean aBool1704 = false;
	public boolean clipped = true;
	int anInt1705 = 128;
	int anInt1706 = 128;
	int anInt1707 = 128;
	int anInt1708 = 0;
	int anInt1709 = 0;
	int anInt1710 = 0;
	public boolean aBool1711 = false;
	public int anInt1713 = -1;
	public boolean aBool1714 = true;
	int varpIndex = -1;
	int varp32Index = -1;
	public int anInt1715 = -1;
	public int anInt1716 = 0;
	public int mapFunction = -1;
	public int anInt1717 = 0;
	boolean aBool1720 = false;
	int[] objectTypes;
	int[] anIntArray1688;
	short[] colors;
	short[] modifiedColors;
	short[] aShortArray1691;
	short[] aShortArray1694;
	public int[] anIntArray1697;
	public int[] transformIds;
	public static NodeMap aClass106_1684 = new NodeMap(500);
	public static NodeMap objects = new NodeMap(64);
	public static NodeMap aClass106_1686 = new NodeMap(30);
	public static NodeMap aClass106_1693 = new NodeMap(30);
	static boolean aBool1696 = false;
	static Model[] anEntity_Sub1Array1712 = new Model[4];

	void post() {
		if (this.anInt1692 == -1) {
			this.anInt1692 = 0;
			if (this.anIntArray1688 != null && (this.objectTypes == null || this.objectTypes[0] == 10)) {
				this.anInt1692 = 1;
			}

			for (int var1 = 0; var1 < 5; var1++) {
				if (this.actions[var1] != null) {
					this.anInt1692 = 1;
				}
			}
		}

		if (this.anInt1713 == -1) {
			this.anInt1713 = 1 * (this.anInt1690 != 0 ? 1 : 0);
		}

	}

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method859(var1, var2);
		}
	}

	void method859(ByteBuf var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var4 = var1.getUByte();
			if (var4 > 0) {
				if (this.anIntArray1688 != null && !aBool1696) {
					var1.position += var4 * 3;
				} else {
					this.objectTypes = new int[var4];
					this.anIntArray1688 = new int[var4];

					for (var3 = 0; var3 < var4; var3++) {
						this.anIntArray1688[var3] = var1.getUShort();
						this.objectTypes[var3] = var1.getUByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.getString();
		} else if (var2 == 5) {
			var4 = var1.getUByte();
			if (var4 > 0) {
				if (this.anIntArray1688 != null && !aBool1696) {
					var1.position += var4 * 2;
				} else {
					this.objectTypes = null;
					this.anIntArray1688 = new int[var4];

					for (var3 = 0; var3 < var4; var3++) {
						this.anIntArray1688[var3] = var1.getUShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.getUByte();
		} else if (var2 == 15) {
			this.sizeY = var1.getUByte();
		} else if (var2 == 17) {
			this.anInt1690 = 0;
			this.aBool1714 = false;
		} else if (var2 == 18) {
			this.aBool1714 = false;
		} else if (var2 == 19) {
			this.anInt1692 = var1.getUByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.anInt1698 = var1.getUShort();
			if (this.anInt1698 == '\uffff') {
				this.anInt1698 = -1;
			}
		} else if (var2 == 27) {
			this.anInt1690 = 1;
		} else if (var2 == 28) {
			this.anInt1699 = var1.getUByte();
		} else if (var2 == 29) {
			this.ambient = var1.getByte();
		} else if (var2 == 39) {
			this.contrast = var1.getByte() * 25;
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.getString();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.getUByte();
			this.colors = new short[var4];
			this.modifiedColors = new short[var4];

			for (var3 = 0; var3 < var4; var3++) {
				this.colors[var3] = (short) var1.getUShort();
				this.modifiedColors[var3] = (short) var1.getUShort();
			}
		} else if (var2 == 41) {
			var4 = var1.getUByte();
			this.aShortArray1691 = new short[var4];
			this.aShortArray1694 = new short[var4];

			for (var3 = 0; var3 < var4; var3++) {
				this.aShortArray1691[var3] = (short) var1.getUShort();
				this.aShortArray1694[var3] = (short) var1.getUShort();
			}
		} else if (var2 == 60) {
			this.mapFunction = var1.getUShort();
		} else if (var2 == 62) {
			this.aBool1704 = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.anInt1705 = var1.getUShort();
		} else if (var2 == 66) {
			this.anInt1706 = var1.getUShort();
		} else if (var2 == 67) {
			this.anInt1707 = var1.getUShort();
		} else if (var2 == 68) {
			this.anInt1703 = var1.getUShort();
		} else if (var2 == 69) {
			var1.getUByte();
		} else if (var2 == 70) {
			this.anInt1708 = var1.getShort();
		} else if (var2 == 71) {
			this.anInt1709 = var1.getShort();
		} else if (var2 == 72) {
			this.anInt1710 = var1.getShort();
		} else if (var2 == 73) {
			this.aBool1711 = true;
		} else if (var2 == 74) {
			this.aBool1720 = true;
		} else if (var2 == 75) {
			this.anInt1713 = var1.getUByte();
		} else if (var2 == 77) {
			this.varpIndex = var1.getUShort();
			if (this.varpIndex == '\uffff') {
				this.varpIndex = -1;
			}

			this.varp32Index = var1.getUShort();
			if (this.varp32Index == '\uffff') {
				this.varp32Index = -1;
			}

			var4 = var1.getUByte();
			this.transformIds = new int[var4 + 1];

			for (var3 = 0; var3 <= var4; var3++) {
				this.transformIds[var3] = var1.getUShort();
				if (this.transformIds[var3] == '\uffff') {
					this.transformIds[var3] = -1;
				}
			}
		} else if (var2 == 78) {
			this.anInt1715 = var1.getUShort();
			this.anInt1716 = var1.getUByte() * 266176581;
		} else if (var2 == 79) {
			this.anInt1687 = var1.getUShort() * 938400635;
			this.anInt1717 = var1.getUShort();
			this.anInt1716 = var1.getUByte() * 266176581;
			var4 = var1.getUByte();
			this.anIntArray1697 = new int[var4];

			for (var3 = 0; var3 < var4; var3++) {
				this.anIntArray1697[var3] = var1.getUShort();
			}
		} else if (var2 == 81) {
			this.clipType = var1.getUByte() * 256;
		}

	}

	public final Entity method860(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.objectTypes == null) {
			var7 = (long) ((this.id << 10) + var2);
		} else {
			var7 = (long) ((this.id << 10) + var2 + (var1 << 3));
		}

		Object var10 = (Entity) aClass106_1693.get(var7);
		if (var10 == null) {
			Model var9 = this.getModel(var1, var2);
			if (var9 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var10 = var9.method902(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var9.aShort1764 = (short) (this.ambient + 64);
				var9.aShort1766 = (short) (this.contrast + 768);
				var9.method905();
				var10 = var9;
			}

			aClass106_1693.put((DualNode) var10, var7);
		}

		if (this.nonFlatShading) {
			var10 = ((Model) var10).method889();
		}

		if (this.clipType >= 0) {
			if (!(var10 instanceof Rasterizer)) {
				if (var10 instanceof Model) {
					var10 = ((Model) var10).method890(var3, var4, var5, var6, true, this.clipType);
				}
			} else {
				var10 = ((Rasterizer) var10).method994(var3, var4, var5, var6, true, this.clipType);
			}
		}

		return (Entity) var10;
	}

	public final Rasterizer method861(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var9;
		if (this.objectTypes == null) {
			var9 = (long) ((this.id << 10) + var2);
		} else {
			var9 = (long) ((var1 << 3) + var2 + (this.id << 10));
		}

		Rasterizer var8 = (Rasterizer) aClass106_1686.get(var9);
		if (var8 == null) {
			Model var7 = this.getModel(var1, var2);
			if (var7 == null) {
				return null;
			}

			var8 = var7.method902(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			aClass106_1686.put(var8, var9);
		}

		if (this.clipType >= 0) {
			var8 = var8.method994(var3, var4, var5, var6, true, this.clipType);
		}

		return var8;
	}

	public final Rasterizer method862(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceType var7,
			int var8) {
		long var9;
		if (this.objectTypes == null) {
			var9 = (long) ((this.id << 10) + var2);
		} else {
			var9 = (long) ((var1 << 3) + (this.id << 10) + var2);
		}

		Rasterizer var11 = (Rasterizer) aClass106_1686.get(var9);
		if (var11 == null) {
			Model var12 = this.getModel(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.method902(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			aClass106_1686.put(var11, var9);
		}

		if (var7 == null && this.clipType == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.method676(var11, var8, var2);
			} else {
				var11 = var11.method995(true);
			}

			if (this.clipType >= 0) {
				var11 = var11.method994(var3, var4, var5, var6, false, this.clipType);
			}

			return var11;
		}
	}

	final Model getModel(int var1, int var2) {
		Model var3 = null;
		int var4;
		int var5;
		boolean var6;
		int var9;
		if (this.objectTypes == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.anIntArray1688 == null) {
				return null;
			}

			var6 = this.aBool1704;
			if (var1 == 2 && var2 > 3) {
				var6 = !var6;
			}

			var5 = this.anIntArray1688.length;

			for (var9 = 0; var9 < var5; var9++) {
				var4 = this.anIntArray1688[var9];
				if (var6) {
					var4 += 65536;
				}

				var3 = (Model) aClass106_1684.get((long) var4);
				if (var3 == null) {
					var3 = Model.method887(aClass87_1683, var4 & 0xffff, 0);
					if (var3 == null) {
						return null;
					}

					if (var6) {
						var3.method897();
					}

					aClass106_1684.put(var3, (long) var4);
				}

				if (var5 > 1) {
					anEntity_Sub1Array1712[var9] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new Model(anEntity_Sub1Array1712, var5);
			}
		} else {
			var9 = -1;

			for (var5 = 0; var5 < this.objectTypes.length; var5++) {
				if (this.objectTypes[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var5 = this.anIntArray1688[var9];
			boolean var11 = this.aBool1704 ^ var2 > 3;
			if (var11) {
				var5 += 65536;
			}

			var3 = (Model) aClass106_1684.get((long) var5);
			if (var3 == null) {
				var3 = Model.method887(aClass87_1683, var5 & 0xffff, 0);
				if (var3 == null) {
					return null;
				}

				if (var11) {
					var3.method897();
				}

				aClass106_1684.put(var3, (long) var5);
			}
		}

		if (this.anInt1705 == 128 && this.anInt1706 == 128 && this.anInt1707 == 128) {
			var6 = false;
		} else {
			var6 = true;
		}

		boolean var10;
		if (this.anInt1708 == 0 && this.anInt1709 == 0 && this.anInt1710 == 0) {
			var10 = false;
		} else {
			var10 = true;
		}

		Model var91 = new Model(var3, var2 == 0 && !var6 && !var10, this.colors == null, this.aShortArray1691 == null,
				true);
		if (var1 == 4 && var2 > 3) {
			var91.method904(256);
			var91.method894(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var91.method892();
		} else if (var2 == 2) {
			var91.method906();
		} else if (var2 == 3) {
			var91.method886();
		}

		if (this.colors != null) {
			for (var4 = 0; var4 < this.colors.length; var4++) {
				var91.recolor(this.colors[var4], this.modifiedColors[var4]);
			}
		}

		if (this.aShortArray1691 != null) {
			for (var4 = 0; var4 < this.aShortArray1691.length; var4++) {
				var91.method896(this.aShortArray1691[var4], this.aShortArray1694[var4]);
			}
		}

		if (var6) {
			var91.method898(this.anInt1705, this.anInt1706, this.anInt1707);
		}

		if (var10) {
			var91.method894(this.anInt1708, this.anInt1709, this.anInt1710);
		}

		return var91;
	}

	static int method864(char var0, int var1) {
		int var2 = var0 << 4;
		if (java.lang.Character.isUpperCase(var0) || java.lang.Character.isTitleCase(var0)) {
			var0 = java.lang.Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		return var2;
	}

	public boolean method865() {
		if (this.transformIds == null) {
			return this.anInt1715 != -1 || this.anIntArray1697 != null;
		} else {
			for (int var1 = 0; var1 < this.transformIds.length; var1++) {
				if (this.transformIds[var1] != -1) {
					ObjectType var2 = Class37.getObjectType(this.transformIds[var1]);
					if (var2.anInt1715 != -1 || var2.anIntArray1697 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public final boolean method866(int var1) {
		if (this.objectTypes != null) {
			for (int var4 = 0; var4 < this.objectTypes.length; var4++) {
				if (this.objectTypes[var4] == var1) {
					return aClass87_1683.method388(this.anIntArray1688[var4] & 0xffff, 0);
				}
			}

			return true;
		} else if (this.anIntArray1688 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.anIntArray1688.length; var3++) {
				var2 &= aClass87_1683.method388(this.anIntArray1688[var3] & 0xffff, 0);
			}

			return var2;
		}
	}

	public final boolean method867() {
		if (this.anIntArray1688 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.anIntArray1688.length; var2++) {
				var1 &= aClass87_1683.method388(this.anIntArray1688[var2] & 0xffff, 0);
			}

			return var1;
		}
	}

	public final ObjectType transform() {
		int var1 = -1;
		if (this.varpIndex != -1) {
			var1 = Class91.method401(this.varpIndex);
		} else if (this.varp32Index != -1) {
			var1 = Class94.tempVars[this.varp32Index];
		}

		return var1 >= 0 && var1 < this.transformIds.length && this.transformIds[var1] != -1
				? Class37.getObjectType(this.transformIds[var1]) : null;
	}

	public static Sprite[] method868(AbstractIndex var0, String var1, String var2) {
		int var3 = var0.getFile(var1);
		int var4 = var0.getChild(var3, var2);
		Sprite[] var5;
		if (!Class35.decodeSprite(var0, var3, var4)) {
			var5 = null;
		} else {
			var5 = GameEngine.method1040();
		}

		return var5;
	}

	static void method869(int var0) {
		if (var0 == -3) {
			GPI.method230("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			GPI.method230("", "Error connecting to server.", "");
		} else {
			GPI.method230("Unexpected server response", "Please try using a different world.", "");
		}

		Node_Sub8.setClientState(10);
	}

	static void method870(Widget[] var0, Widget var1, boolean var2) {
		int var4 = var1.viewportWidth != 0 ? var1.viewportWidth : var1.width;
		int var3 = var1.viewportHeight != 0 ? var1.viewportHeight : var1.height * 1227800423;
		Class4.method70(var0, var1.hash, var4, var3, var2);
		if (var1.children != null) {
			Class4.method70(var1.children, var1.hash, var4, var3, var2);
		}

		InterfaceNode var5 = (InterfaceNode) Client.interfaceNodes.get((long) var1.hash);
		if (var5 != null) {
			FriendedPlayer.method409(var5.type, var4, var3, var2);
		}

		if (var1.contentType == 1337) {
			;
		}

	}

	public static EnumType getEnumType(int id) {
		EnumType type = (EnumType) EnumType.enums.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = EnumType.enum_ref.getFile(8, id);
			type = new EnumType();
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			EnumType.enums.put(type, (long) id);
			return type;
		}
	}

}
