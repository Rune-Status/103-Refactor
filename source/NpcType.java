public class NpcType extends DualNode {

	public int id;
	static AbstractIndex aClass87_1596;
	public int anInt1577 = -1;
	int varpIndex = -1;
	public int anInt1583 = 176841799;
	public int anInt1584 = 951990375;
	public int anInt1585 = 929243503;
	public boolean aBool1586 = false;
	public int anInt1587 = -505909337;
	public int anInt1588 = -1473487651;
	public int anInt1589 = 1;
	public boolean aBool1590 = true;
	public int anInt1591 = -1652337345;
	public String[] actions = new String[5];
	public boolean aBool1593 = true;
	public int combatLevel = -1;
	int anInt1594 = 128;
	int anInt1595 = 128;
	int anInt1597 = 0;
	int anInt1598 = 0;
	public int anInt1599 = -939182368;
	public int anInt1601 = 592731223;
	public String name = "null";
	public boolean aBool1602 = true;
	int varp32Index = -1;
	public boolean aBool1603 = false;
	public int anInt1604 = 30;
	int[] anIntArray1581;
	short[] colors;
	short[] modifiedColors;
	short[] aShortArray1600;
	short[] aShortArray1592;
	int[] anIntArray1582;
	public int[] transformIds;
	public static NodeMap aClass106_1578 = new NodeMap(50);
	public static NodeMap npcs = new NodeMap(64);

	void method797(ByteBuf var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.getUByte();
			this.anIntArray1581 = new int[var3];

			for (var4 = 0; var4 < var3; var4++) {
				this.anIntArray1581[var4] = var1.getUShort();
			}
		} else if (var2 == 2) {
			this.name = var1.getString();
		} else if (var2 == 12) {
			this.anInt1589 = var1.getUByte();
		} else if (var2 == 13) {
			this.anInt1601 = var1.getUShort() * -592731223;
		} else if (var2 == 14) {
			this.anInt1585 = var1.getUShort() * -929243503;
		} else if (var2 == 15) {
			this.anInt1583 = var1.getUShort() * -176841799;
		} else if (var2 == 16) {
			this.anInt1591 = var1.getUShort() * 1652337345;
		} else if (var2 == 17) {
			this.anInt1585 = var1.getUShort() * -929243503;
			this.anInt1584 = var1.getUShort() * -951990375;
			this.anInt1587 = var1.getUShort() * 505909337;
			this.anInt1588 = var1.getUShort() * 1473487651;
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.getString();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.getUByte();
			this.colors = new short[var3];
			this.modifiedColors = new short[var3];

			for (var4 = 0; var4 < var3; var4++) {
				this.colors[var4] = (short) var1.getUShort();
				this.modifiedColors[var4] = (short) var1.getUShort();
			}
		} else if (var2 == 41) {
			var3 = var1.getUByte();
			this.aShortArray1600 = new short[var3];
			this.aShortArray1592 = new short[var3];

			for (var4 = 0; var4 < var3; var4++) {
				this.aShortArray1600[var4] = (short) var1.getUShort();
				this.aShortArray1592[var4] = (short) var1.getUShort();
			}
		} else if (var2 == 60) {
			var3 = var1.getUByte();
			this.anIntArray1582 = new int[var3];

			for (var4 = 0; var4 < var3; var4++) {
				this.anIntArray1582[var4] = var1.getUShort();
			}
		} else if (var2 == 93) {
			this.aBool1593 = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.getUShort();
		} else if (var2 == 97) {
			this.anInt1594 = var1.getUShort();
		} else if (var2 == 98) {
			this.anInt1595 = var1.getUShort();
		} else if (var2 == 99) {
			this.aBool1586 = true;
		} else if (var2 == 100) {
			this.anInt1598 = var1.getByte();
		} else if (var2 == 101) {
			this.anInt1597 = var1.getByte() * 5;
		} else if (var2 == 102) {
			this.anInt1577 = var1.getUShort();
		} else if (var2 == 103) {
			this.anInt1599 = var1.getUShort() * 1581263287;
		} else if (var2 == 106) {
			this.varpIndex = var1.getUShort();
			if (this.varpIndex == '\uffff') {
				this.varpIndex = -1;
			}

			this.varp32Index = var1.getUShort();
			if (this.varp32Index == '\uffff') {
				this.varp32Index = -1;
			}

			var3 = var1.getUByte();
			this.transformIds = new int[var3 + 1];

			for (var4 = 0; var4 <= var3; var4++) {
				this.transformIds[var4] = var1.getUShort();
				if (this.transformIds[var4] == '\uffff') {
					this.transformIds[var4] = -1;
				}
			}
		} else if (var2 == 107) {
			this.aBool1602 = false;
		} else if (var2 == 109) {
			this.aBool1590 = false;
		} else if (var2 == 111) {
			this.aBool1603 = true;
		} else if (var2 == 112) {
			this.anInt1604 = var1.getUByte();
		}

	}

	void post() {
	}

	public final Rasterizer method799(SequenceType var1, int var2, SequenceType var3, int var4) {
		if (this.transformIds != null) {
			NpcType var111 = this.transform();
			return var111 == null ? null : var111.method799(var1, var2, var3, var4);
		} else {
			Rasterizer var5 = (Rasterizer) aClass106_1578.get((long) this.id);
			if (var5 == null) {
				boolean var12 = false;

				for (int var8 = 0; var8 < this.anIntArray1581.length; var8++) {
					if (!aClass87_1596.method388(this.anIntArray1581[var8], 0)) {
						var12 = true;
					}
				}

				if (var12) {
					return null;
				}

				Model[] var121 = new Model[this.anIntArray1581.length];

				int var6;
				for (var6 = 0; var6 < this.anIntArray1581.length; var6++) {
					var121[var6] = Model.method887(aClass87_1596, this.anIntArray1581[var6], 0);
				}

				Model var11;
				if (var121.length == 1) {
					var11 = var121[0];
				} else {
					var11 = new Model(var121, var121.length);
				}

				if (this.colors != null) {
					for (var6 = 0; var6 < this.colors.length; var6++) {
						var11.method895(this.colors[var6], this.modifiedColors[var6]);
					}
				}

				if (this.aShortArray1600 != null) {
					for (var6 = 0; var6 < this.aShortArray1600.length; var6++) {
						var11.method896(this.aShortArray1600[var6], this.aShortArray1592[var6]);
					}
				}

				var5 = var11.method902(this.anInt1598 + 64, this.anInt1597 + 850, -30, -50, -30);
				aClass106_1578.put(var5, (long) this.id);
			}

			Rasterizer var10;
			if (var1 != null && var3 != null) {
				var10 = var1.method678(var5, var2, var3, var4);
			} else if (var1 != null) {
				var10 = var1.method681(var5, var2);
			} else if (var3 != null) {
				var10 = var3.method681(var5, var4);
			} else {
				var10 = var5.method995(true);
			}

			if (this.anInt1594 != 128 || this.anInt1595 != 128) {
				var10.method1007(this.anInt1594, this.anInt1595, this.anInt1594);
			}

			return var10;
		}
	}

	public final Model method800() {
		if (this.transformIds != null) {
			NpcType var5 = this.transform();
			return var5 == null ? null : var5.method800();
		} else if (this.anIntArray1582 == null) {
			return null;
		} else {
			boolean var2 = false;

			for (int var7 = 0; var7 < this.anIntArray1582.length; var7++) {
				if (!aClass87_1596.method388(this.anIntArray1582[var7], 0)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				Model[] var61 = new Model[this.anIntArray1582.length];

				for (int var6 = 0; var6 < this.anIntArray1582.length; var6++) {
					var61[var6] = Model.method887(aClass87_1596, this.anIntArray1582[var6], 0);
				}

				Model var71;
				if (var61.length == 1) {
					var71 = var61[0];
				} else {
					var71 = new Model(var61, var61.length);
				}

				int var1;
				if (this.colors != null) {
					for (var1 = 0; var1 < this.colors.length; var1++) {
						var71.method895(this.colors[var1], this.modifiedColors[var1]);
					}
				}

				if (this.aShortArray1600 != null) {
					for (var1 = 0; var1 < this.aShortArray1600.length; var1++) {
						var71.method896(this.aShortArray1600[var1], this.aShortArray1592[var1]);
					}
				}

				return var71;
			}
		}
	}

	public final NpcType transform() {
		int var1 = -1;
		if (this.varpIndex != -1) {
			var1 = Class91.method401(this.varpIndex);
		} else if (this.varp32Index != -1) {
			var1 = Class94.tempVars[this.varp32Index];
		}

		return var1 >= 0 && var1 < this.transformIds.length && this.transformIds[var1] != -1
				? VarPlayerType.getNpcType(this.transformIds[var1]) : null;
	}

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method797(var1, var2);
		}
	}

	static final int method802(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (Class39.renderRules[1][var3][var4] & 0x2) == 2) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 0x7f;
			int var5 = var1 & 0x7f;
			int var9 = Class39.tileHeights[var6][var3][var4] * (128 - var7)
					+ Class39.tileHeights[var6][var3 + 1][var4] * var7 >> 7;
			int var8 = Class39.tileHeights[var6][var3 + 1][var4 + 1] * var7
					+ Class39.tileHeights[var6][var3][var4 + 1] * (128 - var7) >> 7;
			return (128 - var5) * var9 + var8 * var5 >> 7;
		} else {
			return 0;
		}
	}

	public boolean method803() {
		if (this.transformIds == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.varpIndex != -1) {
				var1 = Class91.method401(this.varpIndex);
			} else if (this.varp32Index != -1) {
				var1 = Class94.tempVars[this.varp32Index];
			}

			return var1 >= 0 && var1 < this.transformIds.length && this.transformIds[var1] != -1;
		}
	}

	static int method804(int var0, int var1) {
		long var2 = (long) ((var0 << 16) + var1);
		return Class1.currentRequest != null && Class1.currentRequest.key == var2 ? Class81.currentBuffer.position * 99
				/ (Class81.currentBuffer.payload.length - Class1.currentRequest.padding) + 1 : 0;
	}

	static final void method805(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		Node_Sub8 var9 = null;

		for (Node_Sub8 var10 = (Node_Sub8) Client.aDeque2193
				.getFront(); var10 != null; var10 = (Node_Sub8) Client.aDeque2193.getNext()) {
			if (var10.anInt1302 == var0 && var10.anInt1300 == var1 && var10.anInt1312 == var2
					&& var10.anInt1303 == var3) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new Node_Sub8();
			var9.anInt1302 = var0;
			var9.anInt1303 = var3;
			var9.anInt1300 = var1;
			var9.anInt1312 = var2;
			Class41.method226(var9);
			Client.aDeque2193.method475(var9);
		}

		var9.anInt1307 = var4;
		var9.anInt1305 = var5;
		var9.anInt1308 = var6;
		var9.anInt1310 = var7;
		var9.anInt1311 = var8;
	}

	static CacheIndex openCacheIndex(int var0, boolean var1, boolean var2, boolean var3) {
		IndexTable var4 = null;
		if (Class75.cacheDataFile != null) {
			var4 = new IndexTable(var0, Class75.cacheDataFile, Class39.cacheIndexFiles[var0], 1000000);
		}

		return new CacheIndex(var4, Class3.refIndexTable, var0, var1, var2, var3);
	}

}
