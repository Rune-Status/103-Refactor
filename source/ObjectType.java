
public class ObjectType extends DualNode {

	public int sizeX = 1223037583;
	static AbstractIndex objects_ref;
	static AbstractIndex aClass87_1683;
	public boolean modelClipped = false;
	public static Class106 aClass106_1684 = new Class106(500);
	public static Class106 objects = new Class106(64);
	public static Class106 aClass106_1686 = new Class106(30);
	public int anInt1687 = 0;
	public String name = "null";
	int[] anIntArray1688;
	int[] anIntArray1689;
	public int anInt1690 = -616734146;
	short[] colors;
	short[] modifiedColors;
	short[] aShortArray1691;
	public int anInt1692 = 1731920317;
	public static Class106 aClass106_1693 = new Class106(30);
	public int sizeY = -1884647669;
	public int[] transformIds;
	short[] aShortArray1694;
	static int anInt1695;
	int clipType = 1376526875;
	static boolean aBool1696 = false;
	public int[] anIntArray1697;
	public int anInt1698 = 1066502373;
	public int anInt1699 = -171381904;
	int anInt1700 = 0;
	int anInt1701 = 0;
	public String[] actions = new String[5];
	boolean aBool1702 = false;
	public int anInt1703 = -19462571;
	boolean aBool1704 = false;
	public boolean clipped = true;
	int anInt1705 = 286918272;
	int anInt1706 = 408619648;
	int anInt1707 = -148141952;
	int anInt1708 = 0;
	int anInt1709 = 0;
	int anInt1710 = 0;
	public boolean aBool1711 = false;
	static Entity_Sub1[] anEntity_Sub1Array1712 = new Entity_Sub1[4];
	public int anInt1713 = 1740157925;
	public boolean aBool1714 = true;
	int varpIndex = -459501529;
	int varp32Index = 2089557189;
	public int anInt1715 = -1479982885;
	public int anInt1716 = 0;
	public int mapFunction = 1295419843;
	public int anInt1717 = 0;
	public int id;
	static Widget aWidget1719;
	boolean aBool1720 = false;

	void post() {
		if (this.anInt1692 * -839074197 == -1) {
			this.anInt1692 = 0;
			if (this.anIntArray1688 != null && (this.anIntArray1689 == null || this.anIntArray1689[0] == 10)) {
				this.anInt1692 = -1731920317;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.anInt1692 = -1731920317;
				}
			}
		}

		if (547466771 * this.anInt1713 == -1) {
			this.anInt1713 = -1740157925 * (-1030255905 * this.anInt1690 != 0 ? 1 : 0);
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
					var1.position += -552526767 * var4;
				} else {
					this.anIntArray1689 = new int[var4];
					this.anIntArray1688 = new int[var4];

					for (var3 = 0; var3 < var4; ++var3) {
						this.anIntArray1688[var3] = var1.getUShort();
						this.anIntArray1689[var3] = var1.getUByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.getString();
		} else if (var2 == 5) {
			var4 = var1.getUByte();
			if (var4 > 0) {
				if (this.anIntArray1688 != null && !aBool1696) {
					var1.position += var4 * -368351178;
				} else {
					this.anIntArray1689 = null;
					this.anIntArray1688 = new int[var4];

					for (var3 = 0; var3 < var4; ++var3) {
						this.anIntArray1688[var3] = var1.getUShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.getUByte() * 1223037583;
		} else if (var2 == 15) {
			this.sizeY = var1.getUByte() * -1884647669;
		} else if (var2 == 17) {
			this.anInt1690 = 0;
			this.aBool1714 = false;
		} else if (var2 == 18) {
			this.aBool1714 = false;
		} else if (var2 == 19) {
			this.anInt1692 = var1.getUByte() * -1731920317;
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.aBool1702 = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.anInt1698 = var1.getUShort() * -1066502373;
			if (this.anInt1698 * -100857069 == '\uffff') {
				this.anInt1698 = 1066502373;
			}
		} else if (var2 == 27) {
			this.anInt1690 = 1839116575;
		} else if (var2 == 28) {
			this.anInt1699 = var1.getUByte() * 1063030455;
		} else if (var2 == 29) {
			this.anInt1700 = var1.getByte() * -987911551;
		} else if (var2 == 39) {
			this.anInt1701 = var1.getByte() * 790035309;
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.getString();
			if (this.actions[var2 - 30].equalsIgnoreCase(GameStrings.aString845)) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.getUByte();
			this.colors = new short[var4];
			this.modifiedColors = new short[var4];

			for (var3 = 0; var3 < var4; ++var3) {
				this.colors[var3] = (short) var1.getUShort();
				this.modifiedColors[var3] = (short) var1.getUShort();
			}
		} else if (var2 == 41) {
			var4 = var1.getUByte();
			this.aShortArray1691 = new short[var4];
			this.aShortArray1694 = new short[var4];

			for (var3 = 0; var3 < var4; ++var3) {
				this.aShortArray1691[var3] = (short) var1.getUShort();
				this.aShortArray1694[var3] = (short) var1.getUShort();
			}
		} else if (var2 == 60) {
			this.mapFunction = var1.getUShort() * -1295419843;
		} else if (var2 == 62) {
			this.aBool1704 = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.anInt1705 = var1.getUShort() * 1478636557;
		} else if (var2 == 66) {
			this.anInt1706 = var1.getUShort() * 2016458261;
		} else if (var2 == 67) {
			this.anInt1707 = var1.getUShort() * -1443997935;
		} else if (var2 == 68) {
			this.anInt1703 = var1.getUShort() * 19462571;
		} else if (var2 == 69) {
			var1.getUByte();
		} else if (var2 == 70) {
			this.anInt1708 = var1.getShort() * -783331611;
		} else if (var2 == 71) {
			this.anInt1709 = var1.getShort() * 1137245033;
		} else if (var2 == 72) {
			this.anInt1710 = var1.getShort() * -305523735;
		} else if (var2 == 73) {
			this.aBool1711 = true;
		} else if (var2 == 74) {
			this.aBool1720 = true;
		} else if (var2 == 75) {
			this.anInt1713 = var1.getUByte() * -1740157925;
		} else if (var2 == 77) {
			this.varpIndex = var1.getUShort() * 459501529;
			if (-560193431 * this.varpIndex == '\uffff') {
				this.varpIndex = -459501529;
			}

			this.varp32Index = var1.getUShort() * -2089557189;
			if (this.varp32Index * 560659955 == '\uffff') {
				this.varp32Index = 2089557189;
			}

			var4 = var1.getUByte();
			this.transformIds = new int[var4 + 1];

			for (var3 = 0; var3 <= var4; ++var3) {
				this.transformIds[var3] = var1.getUShort();
				if (this.transformIds[var3] == '\uffff') {
					this.transformIds[var3] = -1;
				}
			}
		} else if (var2 == 78) {
			this.anInt1715 = var1.getUShort() * 1479982885;
			this.anInt1716 = var1.getUByte() * 266176581;
		} else if (var2 == 79) {
			this.anInt1687 = var1.getUShort() * 1857310455;
			this.anInt1717 = var1.getUShort() * 979955917;
			this.anInt1716 = var1.getUByte() * 266176581;
			var4 = var1.getUByte();
			this.anIntArray1697 = new int[var4];

			for (var3 = 0; var3 < var4; ++var3) {
				this.anIntArray1697[var3] = var1.getUShort();
			}
		} else if (var2 == 81) {
			this.clipType = var1.getUByte() * -203561728;
		}

	}

	public final Entity method860(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.anIntArray1689 == null) {
			var7 = (long) (var2 + (this.id * -521826339 << 10));
		} else {
			var7 = (long) (var2 + (this.id * -521826339 << 10) + (var1 << 3));
		}

		Object var10 = (Entity) aClass106_1693.get(var7);
		if (var10 == null) {
			Entity_Sub1 var9 = this.method863(var1, var2);
			if (var9 == null) {
				return null;
			}

			if (!this.aBool1702) {
				var10 = var9.method902(1607505281 * this.anInt1700 + 64, this.anInt1701 * 1352261597 + 768, -50, -10,
						-50);
			} else {
				var9.aShort1764 = (short) (this.anInt1700 * 1607505281 + 64);
				var9.aShort1766 = (short) (768 + this.anInt1701 * 1352261597);
				var9.method905();
				var10 = var9;
			}

			aClass106_1693.put((DualNode) var10, var7);
		}

		if (this.aBool1702) {
			var10 = ((Entity_Sub1) var10).method889();
		}

		if (912005101 * this.clipType >= 0) {
			if (!(var10 instanceof Model)) {
				if (var10 instanceof Entity_Sub1) {
					var10 = ((Entity_Sub1) var10).method890(var3, var4, var5, var6, true, 912005101 * this.clipType);
				}
			} else {
				var10 = ((Model) var10).method994(var3, var4, var5, var6, true, 912005101 * this.clipType);
			}
		}

		return (Entity) var10;
	}

	public final Model method861(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var9;
		if (this.anIntArray1689 == null) {
			var9 = (long) (var2 + (-521826339 * this.id << 10));
		} else {
			var9 = (long) (var2 + (var1 << 3) + (this.id * -521826339 << 10));
		}

		Model var8 = (Model) aClass106_1686.get(var9);
		if (var8 == null) {
			Entity_Sub1 var7 = this.method863(var1, var2);
			if (var7 == null) {
				return null;
			}

			var8 = var7.method902(this.anInt1700 * 1607505281 + 64, this.anInt1701 * 1352261597 + 768, -50, -10, -50);
			aClass106_1686.put(var8, var9);
		}

		if (this.clipType * 912005101 >= 0) {
			var8 = var8.method994(var3, var4, var5, var6, true, 912005101 * this.clipType);
		}

		return var8;
	}

	public final Model method862(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceType var7,
			int var8) {
		long var9;
		if (this.anIntArray1689 == null) {
			var9 = (long) ((-521826339 * this.id << 10) + var2);
		} else {
			var9 = (long) ((var1 << 3) + (-521826339 * this.id << 10) + var2);
		}

		Model var11 = (Model) aClass106_1686.get(var9);
		if (var11 == null) {
			Entity_Sub1 var12 = this.method863(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.method902(this.anInt1700 * 1607505281 + 64, this.anInt1701 * 1352261597 + 768, -50, -10, -50);
			aClass106_1686.put(var11, var9);
		}

		if (var7 == null && this.clipType * 912005101 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.method676(var11, var8, var2);
			} else {
				var11 = var11.method995(true);
			}

			if (912005101 * this.clipType >= 0) {
				var11 = var11.method994(var3, var4, var5, var6, false, 912005101 * this.clipType);
			}

			return var11;
		}
	}

	final Entity_Sub1 method863(int var1, int var2) {
		Entity_Sub1 var3 = null;
		int var4;
		int var5;
		boolean var6;
		if (this.anIntArray1689 == null) {
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

			for (int var7 = 0; var7 < var5; ++var7) {
				var4 = this.anIntArray1688[var7];
				if (var6) {
					var4 += 65536;
				}

				var3 = (Entity_Sub1) aClass106_1684.get((long) var4);
				if (var3 == null) {
					var3 = Entity_Sub1.method887(aClass87_1683, var4 & '\uffff', 0);
					if (var3 == null) {
						return null;
					}

					if (var6) {
						var3.method897();
					}

					aClass106_1684.put(var3, (long) var4);
				}

				if (var5 > 1) {
					anEntity_Sub1Array1712[var7] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new Entity_Sub1(anEntity_Sub1Array1712, var5);
			}
		} else {
			int var8 = -1;

			for (var5 = 0; var5 < this.anIntArray1689.length; ++var5) {
				if (this.anIntArray1689[var5] == var1) {
					var8 = var5;
					break;
				}
			}

			if (var8 == -1) {
				return null;
			}

			var5 = this.anIntArray1688[var8];
			boolean var10 = this.aBool1704 ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}

			var3 = (Entity_Sub1) aClass106_1684.get((long) var5);
			if (var3 == null) {
				var3 = Entity_Sub1.method887(aClass87_1683, var5 & '\uffff', 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method897();
				}

				aClass106_1684.put(var3, (long) var5);
			}
		}

		if (this.anInt1705 * -38847803 == 128 && this.anInt1706 * -295802563 == 128
				&& 300513777 * this.anInt1707 == 128) {
			var6 = false;
		} else {
			var6 = true;
		}

		boolean var9;
		if (-1836138771 * this.anInt1708 == 0 && -190626599 * this.anInt1709 == 0 && 1501426777 * this.anInt1710 == 0) {
			var9 = false;
		} else {
			var9 = true;
		}

		Entity_Sub1 var11 = new Entity_Sub1(var3, var2 == 0 && !var6 && !var9, this.colors == null,
				this.aShortArray1691 == null, true);
		if (var1 == 4 && var2 > 3) {
			var11.method904(256);
			var11.method894(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var11.method892();
		} else if (var2 == 2) {
			var11.method906();
		} else if (var2 == 3) {
			var11.method886();
		}

		if (this.colors != null) {
			for (var4 = 0; var4 < this.colors.length; ++var4) {
				var11.method895(this.colors[var4], this.modifiedColors[var4]);
			}
		}

		if (this.aShortArray1691 != null) {
			for (var4 = 0; var4 < this.aShortArray1691.length; ++var4) {
				var11.method896(this.aShortArray1691[var4], this.aShortArray1694[var4]);
			}
		}

		if (var6) {
			var11.method898(-38847803 * this.anInt1705, this.anInt1706 * -295802563, 300513777 * this.anInt1707);
		}

		if (var9) {
			var11.method894(-1836138771 * this.anInt1708, this.anInt1709 * -190626599, this.anInt1710 * 1501426777);
		}

		return var11;
	}

	static int method864(char var0, int var1) {
		int var2 = var0 << 4;
		if (java.lang.Character.isUpperCase(var0) || java.lang.Character.isTitleCase(var0)) {
			var0 = java.lang.Character.toLowerCase(var0);
			var2 = 1 + (var0 << 4);
		}

		return var2;
	}

	public boolean method865() {
		if (this.transformIds == null) {
			return this.anInt1715 * -874560339 != -1 || this.anIntArray1697 != null;
		} else {
			for (int var1 = 0; var1 < this.transformIds.length; ++var1) {
				if (this.transformIds[var1] != -1) {
					ObjectType var2 = Class37.getObjectType(this.transformIds[var1]);
					if (-874560339 * var2.anInt1715 != -1 || var2.anIntArray1697 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public final boolean method866(int var1) {
		if (this.anIntArray1689 != null) {
			for (int var4 = 0; var4 < this.anIntArray1689.length; ++var4) {
				if (var1 == this.anIntArray1689[var4]) {
					return aClass87_1683.method388(this.anIntArray1688[var4] & '\uffff', 0);
				}
			}

			return true;
		} else if (this.anIntArray1688 == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.anIntArray1688.length; ++var3) {
				var2 &= aClass87_1683.method388(this.anIntArray1688[var3] & '\uffff', 0);
			}

			return var2;
		}
	}

	public final boolean method867() {
		if (this.anIntArray1688 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.anIntArray1688.length; ++var2) {
				var1 &= aClass87_1683.method388(this.anIntArray1688[var2] & '\uffff', 0);
			}

			return var1;
		}
	}

	public final ObjectType transform() {
		int var1 = -1;
		if (this.varpIndex * -560193431 != -1) {
			var1 = Class91.method401(-560193431 * this.varpIndex);
		} else if (this.varp32Index * 560659955 != -1) {
			var1 = Class94.tempVars[560659955 * this.varp32Index];
		}

		return var1 >= 0 && var1 < this.transformIds.length && this.transformIds[var1] != -1
				? Class37.getObjectType(this.transformIds[var1]) : null;
	}

	public static DualNode_Sub13_Sub2[] method868(AbstractIndex var0, String var1, String var2) {
		int var3 = var0.getFile(var1);
		int var4 = var0.getChild(var3, var2);
		DualNode_Sub13_Sub2[] var5;
		if (!Class35.method202(var0, var3, var4)) {
			var5 = null;
		} else {
			var5 = GameEngine.method1040();
		}

		return var5;
	}

	static void method869(int var0) {
		if (var0 == -3) {
			GPI.method230(GameStrings.aString882, GameStrings.aString997, GameStrings.aString960);
		} else if (var0 == -2) {
			GPI.method230(GameStrings.aString1073, GameStrings.aString886, GameStrings.aString887);
		} else if (var0 == -1) {
			GPI.method230(GameStrings.aString888, GameStrings.aString1040, GameStrings.aString890);
		} else if (var0 == 3) {
			GPI.method230(GameStrings.aString931, GameStrings.aString892, GameStrings.aString893);
		} else if (var0 == 4) {
			GPI.method230(GameStrings.aString894, GameStrings.aString895, GameStrings.aString896);
		} else if (var0 == 5) {
			GPI.method230(GameStrings.aString897, GameStrings.aString898, GameStrings.aString1061);
		} else if (var0 == 6) {
			GPI.method230(GameStrings.aString900, GameStrings.aString908, GameStrings.aString940);
		} else if (var0 == 7) {
			GPI.method230(GameStrings.aString903, GameStrings.aString904, GameStrings.aString905);
		} else if (var0 == 8) {
			GPI.method230(GameStrings.aString906, GameStrings.aString884, GameStrings.aString933);
		} else if (var0 == 9) {
			GPI.method230(GameStrings.aString909, GameStrings.aString910, GameStrings.aString1045);
		} else if (var0 == 10) {
			GPI.method230(GameStrings.aString1006, GameStrings.aString1054, GameStrings.aString872);
		} else if (var0 == 11) {
			GPI.method230(GameStrings.aString915, GameStrings.aString916, GameStrings.aString983);
		} else if (var0 == 12) {
			GPI.method230(GameStrings.aString918, GameStrings.aString919, GameStrings.aString1000);
		} else if (var0 == 13) {
			GPI.method230(GameStrings.aString921, GameStrings.aString922, GameStrings.aString923);
		} else if (var0 == 14) {
			GPI.method230(GameStrings.aString952, GameStrings.aString925, GameStrings.aString926);
		} else if (var0 == 16) {
			GPI.method230(GameStrings.aString953, GameStrings.aString928, GameStrings.aString955);
		} else if (var0 == 17) {
			GPI.method230(GameStrings.aString930, GameStrings.aString950, GameStrings.aString932);
		} else if (var0 == 18) {
			GPI.method230(GameStrings.aString912, GameStrings.aString934, GameStrings.aString935);
		} else if (var0 == 19) {
			GPI.method230(GameStrings.aString936, GameStrings.aString937, GameStrings.aString938);
		} else if (var0 == 20) {
			GPI.method230(GameStrings.aString899, GameStrings.aString979, GameStrings.aString941);
		} else if (var0 == 22) {
			GPI.method230(GameStrings.aString1108, GameStrings.aString943, GameStrings.aString944);
		} else if (var0 == 23) {
			GPI.method230(GameStrings.aString891, GameStrings.aString971, GameStrings.aString947);
		} else if (var0 == 24) {
			GPI.method230(GameStrings.aString948, GameStrings.aString949, GameStrings.aString849);
		} else if (var0 == 25) {
			GPI.method230(GameStrings.aString1029, GameStrings.aString863, GameStrings.aString1022);
		} else if (var0 == 26) {
			GPI.method230(GameStrings.aString1110, GameStrings.aString878, GameStrings.aString1093);
		} else if (var0 == 27) {
			GPI.method230(GameStrings.aString957, GameStrings.aString907, GameStrings.aString959);
		} else if (var0 == 31) {
			GPI.method230(GameStrings.aString920, GameStrings.aString954, GameStrings.aString968);
		} else if (var0 == 32) {
			GPI.method230(GameStrings.aString969, GameStrings.aString970, GameStrings.aString864);
		} else if (var0 == 37) {
			GPI.method230(GameStrings.aString972, GameStrings.aString973, GameStrings.aString974);
		} else if (var0 == 38) {
			GPI.method230(GameStrings.aString975, GameStrings.aString1107, GameStrings.aString977);
		} else if (var0 == 55) {
			GPI.method230(GameStrings.aString978, GameStrings.aString1053, GameStrings.aString980);
		} else {
			if (var0 == 56) {
				GPI.method230(GameStrings.aString981, GameStrings.aString982, GameStrings.aString1109);
				Node_Sub8.method550(11);
				return;
			}

			if (var0 == 57) {
				GPI.method230(GameStrings.aString1001, GameStrings.aString985, GameStrings.aString986);
				Node_Sub8.method550(11);
				return;
			}

			GPI.method230(GameStrings.aString987, GameStrings.aString988, GameStrings.aString964);
		}

		Node_Sub8.method550(10);
	}

	static void method870(Widget[] var0, Widget var1, boolean var2) {
		int var4 = -302755437 * var1.viewportWidth != 0 ? -302755437 * var1.viewportWidth : var1.width * 1645211541;
		int var3 = 177405235 * var1.viewportHeight != 0 ? 177405235 * var1.viewportHeight : 1227800423 * var1.height;
		Class4.method70(var0, -1536575275 * var1.hash, var4, var3, var2);
		if (var1.children != null) {
			Class4.method70(var1.children, var1.hash * -1536575275, var4, var3, var2);
		}

		InterfaceNode var5 = (InterfaceNode) Client.interfaceNodes.get((long) (-1536575275 * var1.hash));
		if (var5 != null) {
			FriendedPlayer.method409(var5.type * 226793949, var4, var3, var2);
		}

		if (-179718399 * var1.contentType == 1337) {
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
