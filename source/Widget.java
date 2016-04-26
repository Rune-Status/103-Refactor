public class Widget extends Node {

	static boolean[] loadedInterfaces;
	static AbstractIndex widgetIndex;
	static AbstractIndex aClass87_1131;
	public static Widget[][] interfaces;
	public Object[] anObjectArray1156;
	public Widget[] children;
	public Object[] anObjectArray1181;
	public Object[] anObjectArray1182;
	public Object[] anObjectArray1183;
	public Object[] anObjectArray1184;
	public Object[] anObjectArray1186;
	public Object[] anObjectArray1187;
	public Object[] anObjectArray1188;
	public Object[] anObjectArray1189;
	public Object[] anObjectArray1190;
	public boolean interactable = false;
	public int type;
	public int contentType = 0;
	public int anInt1134 = 0;
	public int anInt1185 = 0;
	public int anInt1135 = 0;
	public int anInt1136 = 0;
	public int anInt1133 = 0;
	public int buttonType = 0;
	public int anInt1132 = 0;
	public int anInt1122 = 0;
	public int parentId = -1;
	public boolean hidden = false;
	public int viewportWidth = 0;
	public int viewportHeight = 0;
	public int textureId = -1;
	public int spriteId = 0;
	public boolean aBool1201 = false;
	public int modelType = 1;
	public int modelId = -1;
	public boolean aBool1144 = false;
	public int alpha = 0;
	public int borderThickness = 0;
	public int shadowColor = 0;
	public int anInt1198 = 0;
	public int anInt1151 = 0;
	public int rotationX = 0;
	public int rotationZ = 0;
	public int rotationY = 0;
	public int modelZoom = 100;
	public int anInt1162 = -1;
	public int fontId = -1;
	public String text = "";
	public int anInt1158 = 0;
	public int anInt1159 = 0;
	public int anInt1138 = 0;
	public int textColor = 0;
	public boolean flippedVertically;
	public int anInt1137 = -532092193;
	public int config = 0;
	public String name = "";
	public boolean aBool1154 = false;
	public boolean textShadowed = false;
	public boolean aBool1161 = false;
	public String[] actions;
	public int anInt1166 = 0;
	public int anInt1146 = 0;
	public boolean flippedHorizontally;
	public int anInt1160 = 0;
	public boolean aBool1142 = false;
	public boolean aBool1179 = false;
	public String selectedAction = "";
	public Object[] anObjectArray1170;
	public Object[] mouseEnterListener;
	public Object[] mouseExitListener;
	public Object[] anObjectArray1178;
	public Object[] anObjectArray1130;
	public Object[] configListenerArgs;
	public Object[] tableListenerArgs;
	public Object[] skillListenerArgs;
	public Object[] renderListener;
	public Object[] anObjectArray1180;
	public Object[] mouseHoverListener;
	public Object[] anObjectArray1171;
	public Object[] anObjectArray1172;
	public Object[] anObjectArray1173;
	public Object[] anObjectArray1174;
	public Object[] anObjectArray1176;
	public Object[] anObjectArray1177;
	public Object[] scrollListener;
	public int[] configTriggers;
	public int[] tableModTriggers;
	public int[] skillTriggers;
	public static boolean aBool1128 = false;
	public int width = 0;
	public int height = 0;
	public boolean aBool1169 = false;
	public int anInt1195 = 0;
	public int anInt1153 = -1;
	public int[] anIntArray1191;
	public int[] anIntArray1168;
	public int[][] varpOpcodes;
	public int[] itemIds;
	public int[] itemQuantities;
	public int columnPadding = 0;
	public int rowPadding = 0;
	public int[] xSprites;
	public int[] anIntArray1163;
	public int[] anIntArray1164;
	public String aString1157 = "";
	public String[] tableActions;
	public int anInt1139 = 0;
	public int anInt1140 = 0;
	public int anInt1141 = 0;
	public int anInt1143 = -1;
	int anInt1147 = 1;
	int anInt1148 = -1;
	public int anInt1150 = -1;
	public String aString1125 = "";
	public String tooltip = "Ok";
	public int hash = -1;
	public int index = -1;
	public int relativeX = 0;
	public int relativeY = 0;
	public int insetX = 0;
	public int insetY = 0;
	public int anInt1149 = 0;
	public int anInt1152 = -1116355379;
	public int anInt1155 = 2;
	public Widget parent = null;
	public int anInt1193 = 1;
	public int itemId = -1;
	public int itemQuantity = 0;
	public int anInt1194 = 0;
	public int anInt1126 = 0;
	public boolean aBool1165 = false;
	public boolean aBool1145 = false;
	public int anInt1196 = -1;
	public int anInt1197 = 0;
	public int anInt1200 = 0;
	public int anInt1199 = 0;
	public int boundsIndex = -1;
	public int loopCycle = -1;
	public boolean aBool1175 = false;
	static NodeMap aClass106_1127 = new NodeMap(50);
	static NodeMap aClass106_1167 = new NodeMap(200);
	static NodeMap aClass106_1192 = new NodeMap(20);
	static NodeMap aClass106_1202 = new NodeMap(8);

	void decodeActive(ByteBuf var1) {
		var1.getUByte();
		this.interactable = true;
		this.type = var1.getUByte();
		this.contentType = var1.getUShort();
		this.anInt1134 = var1.getShort() * 10986657;
		this.anInt1185 = var1.getShort() * -720369495;
		this.anInt1135 = var1.getUShort() * 934649725;
		if (this.type == 9) {
			this.anInt1136 = var1.getShort() * -280898437;
		} else {
			this.anInt1136 = var1.getUShort() * -280898437;
		}

		this.anInt1133 = var1.getByte();
		this.buttonType = var1.getByte();
		this.anInt1132 = var1.getByte();
		this.anInt1122 = var1.getByte();
		this.parentId = var1.getUShort();
		if (this.parentId == '\uffff') {
			this.parentId = -1;
		} else {
			this.parentId += this.hash & 0xffff0000;
		}

		this.hidden = var1.getUByte() == 1;
		if (this.type == 0) {
			this.viewportWidth = var1.getUShort();
			this.viewportHeight = var1.getUShort();
			this.aBool1201 = var1.getUByte() == 1;
		}

		if (this.type == 5) {
			this.textureId = var1.getInt();
			this.spriteId = var1.getUShort();
			this.aBool1144 = var1.getUByte() == 1;
			this.alpha = var1.getUByte();
			this.borderThickness = var1.getUByte();
			this.shadowColor = var1.getInt();
			this.flippedVertically = var1.getUByte() == 1;
			this.flippedHorizontally = var1.getUByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.getUShort();
			if (this.modelId == '\uffff') {
				this.modelId = -1;
			}

			this.anInt1198 = var1.getShort();
			this.anInt1151 = var1.getShort();
			this.rotationX = var1.getUShort();
			this.rotationZ = var1.getUShort();
			this.rotationY = var1.getUShort();
			this.modelZoom = var1.getUShort();
			this.anInt1162 = var1.getUShort();
			if (this.anInt1162 == '\uffff') {
				this.anInt1162 = -1;
			}

			this.aBool1154 = var1.getUByte() == 1;
			var1.getUShort();
			if (this.anInt1133 != 0) {
				this.anInt1160 = var1.getUShort();
			}

			if (this.buttonType != 0) {
				var1.getUShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.getUShort();
			if (this.fontId == '\uffff') {
				this.fontId = -1;
			}

			this.text = var1.getString();
			this.anInt1158 = var1.getUByte();
			this.anInt1159 = var1.getUByte();
			this.anInt1138 = var1.getUByte();
			this.textShadowed = var1.getUByte() == 1;
			this.textColor = var1.getInt();
		}

		if (this.type == 3) {
			this.textColor = var1.getInt();
			this.aBool1161 = var1.getUByte() == 1;
			this.alpha = var1.getUByte();
		}

		if (this.type == 9) {
			this.anInt1137 = var1.getUByte() * -532092193;
			this.textColor = var1.getInt();
			this.aBool1142 = var1.getUByte() == 1;
		}

		this.config = var1.getMedium();
		this.name = var1.getString();
		int var3 = var1.getUByte();
		if (var3 > 0) {
			this.actions = new String[var3];

			for (int var2 = 0; var2 < var3; var2++) {
				this.actions[var2] = var1.getString();
			}
		}

		this.anInt1166 = var1.getUByte();
		this.anInt1146 = var1.getUByte();
		this.aBool1179 = var1.getUByte() == 1;
		this.selectedAction = var1.getString();
		this.anObjectArray1170 = this.method495(var1);
		this.mouseEnterListener = this.method495(var1);
		this.mouseExitListener = this.method495(var1);
		this.anObjectArray1178 = this.method495(var1);
		this.anObjectArray1130 = this.method495(var1);
		this.configListenerArgs = this.method495(var1);
		this.tableListenerArgs = this.method495(var1);
		this.skillListenerArgs = this.method495(var1);
		this.renderListener = this.method495(var1);
		this.anObjectArray1180 = this.method495(var1);
		this.mouseHoverListener = this.method495(var1);
		this.anObjectArray1171 = this.method495(var1);
		this.anObjectArray1172 = this.method495(var1);
		this.anObjectArray1173 = this.method495(var1);
		this.anObjectArray1174 = this.method495(var1);
		this.anObjectArray1176 = this.method495(var1);
		this.anObjectArray1177 = this.method495(var1);
		this.scrollListener = this.method495(var1);
		this.configTriggers = this.method487(var1);
		this.tableModTriggers = this.method487(var1);
		this.skillTriggers = this.method487(var1);
	}

	int[] method487(ByteBuf var1) {
		int var2 = var1.getUByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var4 = new int[var2];

			for (int var3 = 0; var3 < var2; var3++) {
				var4[var3] = var1.getInt();
			}

			return var4;
		}
	}

	public Picture method488(int var1) {
		aBool1128 = false;
		if (var1 >= 0 && var1 < this.anIntArray1164.length) {
			int var2 = this.anIntArray1164[var1];
			if (var2 != -1) {
				Picture var3 = (Picture) aClass106_1167.get((long) var2);
				if (var3 != null) {
					return var3;
				} else {
					AbstractIndex var4 = Npc.aClass87_1967;
					Picture var6;
					if (!Class35.decodeSprite(var4, var2, 0)) {
						var6 = null;
					} else {
						Picture var5 = new Picture();
						var5.width = Class7.width;
						var5.height = Class7.height;
						var5.offsetX = Class7.offsetsX[0];
						var5.offsetY = VarPlayerType.offsetsY[0];
						var5.subWidth = Class7.subWidths[0];
						var5.subHeight = Class7.subHeights[0];
						int var8 = var5.subWidth * var5.subHeight;
						byte[] var9 = Npc.spritePixels[0];
						var5.pixels = new int[var8];

						for (int var7 = 0; var7 < var8; var7++) {
							var5.pixels[var7] = Class85.palette[var9[var7] & 0xff];
						}

						Class65.resetSprite();
						var6 = var5;
					}

					if (var6 != null) {
						aClass106_1167.put(var6, (long) var2);
					} else {
						aBool1128 = true;
					}

					return var6;
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public Picture method489(boolean var1) {
		aBool1128 = false;
		int var11;
		if (var1) {
			var11 = this.anInt1143;
		} else {
			var11 = this.textureId;
		}

		if (var11 == -1) {
			return null;
		} else {
			long var8 = ((long) this.shadowColor << 40) + ((this.flippedVertically ? 1L : 0L) << 38) + (long) var11
					+ ((long) this.borderThickness << 36) + ((this.flippedHorizontally ? 1L : 0L) << 39);
			Picture var2 = (Picture) aClass106_1167.get(var8);
			if (var2 != null) {
				return var2;
			} else {
				AbstractIndex var10 = Npc.aClass87_1967;
				Picture var7;
				if (!Class35.decodeSprite(var10, var11, 0)) {
					var7 = null;
				} else {
					Picture var3 = new Picture();
					var3.width = Class7.width;
					var3.height = Class7.height;
					var3.offsetX = Class7.offsetsX[0];
					var3.offsetY = VarPlayerType.offsetsY[0];
					var3.subWidth = Class7.subWidths[0];
					var3.subHeight = Class7.subHeights[0];
					int var5 = var3.subWidth * var3.subHeight;
					byte[] var12 = Npc.spritePixels[0];
					var3.pixels = new int[var5];

					for (int var4 = 0; var4 < var5; var4++) {
						var3.pixels[var4] = Class85.palette[var12[var4] & 0xff];
					}

					Class65.resetSprite();
					var7 = var3;
				}

				if (var7 == null) {
					aBool1128 = true;
					return null;
				} else {
					if (this.flippedVertically) {
						var7.method943();
					}

					if (this.flippedHorizontally) {
						var7.method942();
					}

					if (this.borderThickness > 0) {
						var7.method941(this.borderThickness);
					}

					if (this.borderThickness >= 1) {
						var7.method952(1);
					}

					if (this.borderThickness >= 2) {
						var7.method952(16777215);
					}

					if (this.shadowColor != 0) {
						var7.method962(this.shadowColor);
					}

					aClass106_1167.put(var7, var8);
					return var7;
				}
			}
		}
	}

	public DualNode_Sub13_Sub3_Sub1 method490() {
		aBool1128 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			DualNode_Sub13_Sub3_Sub1 var1 = (DualNode_Sub13_Sub3_Sub1) aClass106_1192.get((long) this.fontId);
			if (var1 == null) {
				AbstractIndex var3 = Npc.aClass87_1967;
				AbstractIndex var4 = Class96_Sub1.aClass87_1207;
				int var5 = this.fontId;
				DualNode_Sub13_Sub3_Sub1 var2;
				if (!Class35.decodeSprite(var3, var5, 0)) {
					var2 = null;
				} else {
					var2 = IgnoredPlayer.method415(var4.getFile(var5, 0));
				}

				if (var2 != null) {
					aClass106_1192.put(var2, (long) this.fontId);
				} else {
					aBool1128 = true;
				}

				return var2;
			} else {
				return var1;
			}
		}
	}

	public DualNode_Sub14 method491(boolean var1) {
		if (this.anInt1143 == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.anInt1143 : this.textureId;
		if (var2 == -1) {
			return null;
		} else {
			long var7 = ((long) this.borderThickness << 36) + (long) var2 + ((this.flippedVertically ? 1L : 0L) << 38)
					+ ((this.flippedHorizontally ? 1L : 0L) << 39) + ((long) this.shadowColor << 40);
			DualNode_Sub14 var9 = (DualNode_Sub14) aClass106_1202.get(var7);
			if (var9 != null) {
				return var9;
			} else {
				Picture sprite = this.method489(var1);
				if (sprite == null) {
					return null;
				} else {
					Picture copy = sprite.copy();
					int[] var10 = new int[copy.subHeight];
					int[] var6 = new int[copy.subHeight];

					for (int var11 = 0; var11 < copy.subHeight; var11++) {
						int var13 = 0;
						int var4 = copy.subWidth;

						int var3;
						for (var3 = 0; var3 < copy.subWidth; var3++) {
							if (copy.pixels[copy.subWidth * var11 + var3] == 0) {
								var13 = var3;
								break;
							}
						}

						for (var3 = copy.subWidth - 1; var3 >= var13; --var3) {
							if (copy.pixels[copy.subWidth * var11 + var3] == 0) {
								var4 = var3 + 1;
								break;
							}
						}

						var10[var11] = var13;
						var6[var11] = var4 - var13;
					}

					var9 = new DualNode_Sub14(copy.subWidth, copy.subHeight, var6, var10, var2);
					aClass106_1202.put(var9, var7);
					return var9;
				}
			}
		}
	}

	public Rasterizer method492(SequenceType var1, int var2, boolean var3, PlayerConfig var4) {
		aBool1128 = false;
		int var6;
		int var7;
		if (var3) {
			var6 = this.anInt1147;
			var7 = this.anInt1148;
		} else {
			var6 = this.modelType;
			var7 = this.modelId;
		}

		if (var6 == 0) {
			return null;
		} else if (var6 == 1 && var7 == -1) {
			return null;
		} else {
			Rasterizer var8 = (Rasterizer) aClass106_1127.get((long) ((var6 << 16) + var7));
			if (var8 == null) {
				Model var5;
				if (var6 == 1) {
					var5 = Model.method887(aClass87_1131, var7, 0);
					if (var5 == null) {
						aBool1128 = true;
						return null;
					}

					var8 = var5.method902(64, 768, -50, -10, -50);
				}

				if (var6 == 2) {
					var5 = VarPlayerType.getNpcType(var7).method800();
					if (var5 == null) {
						aBool1128 = true;
						return null;
					}

					var8 = var5.method902(64, 768, -50, -10, -50);
				}

				if (var6 == 3) {
					if (var4 == null) {
						return null;
					}

					var5 = var4.method270();
					if (var5 == null) {
						aBool1128 = true;
						return null;
					}

					var8 = var5.method902(64, 768, -50, -10, -50);
				}

				if (var6 == 4) {
					ItemType var9 = FriendedPlayer.getItemType(var7);
					var5 = var9.method809(10);
					if (var5 == null) {
						aBool1128 = true;
						return null;
					}

					var8 = var5.method902(var9.anInt1617 + 64, var9.anInt1638 + 768, -50, -10, -50);
				}

				aClass106_1127.put(var8, (long) ((var6 << 16) + var7));
			}

			if (var1 != null) {
				var8 = var1.method679(var8, var2);
			}

			return var8;
		}
	}

	public void method493(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var4 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var3 = 0; var3 < this.actions.length; var3++) {
					var4[var3] = this.actions[var3];
				}
			}

			this.actions = var4;
		}

		this.actions[var1] = var2;
	}

	static final int method494(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var8 = var2 - 1 & var0;
		int var4 = var1 / var2;
		int var6 = var2 - 1 & var1;
		int var11 = Class33.method197(var3, var4);
		int var10 = Class33.method197(var3 + 1, var4);
		int var7 = Class33.method197(var3, var4 + 1);
		int var5 = Class33.method197(var3 + 1, var4 + 1);
		int var12 = InterfaceNode.method578(var11, var10, var8, var2);
		int var9 = InterfaceNode.method578(var7, var5, var8, var2);
		return InterfaceNode.method578(var12, var9, var6, var2);
	}

	Object[] method495(ByteBuf var1) {
		int var2 = var1.getUByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; var4++) {
				int var5 = var1.getUByte();
				if (var5 != 0) {
					if (var5 == 1) {
						var3[var4] = var1.getString();
					}
				} else {
					var3[var4] = new Integer(var1.getInt());
				}
			}

			this.aBool1169 = true;
			return var3;
		}
	}

	void decode(ByteBuf var1) {
		this.interactable = false;
		this.type = var1.getUByte();
		this.anInt1195 = var1.getUByte();
		this.contentType = var1.getUShort();
		this.anInt1134 = var1.getShort() * 10986657;
		this.anInt1185 = var1.getShort() * -720369495;
		this.anInt1135 = var1.getUShort() * 934649725;
		this.anInt1136 = var1.getUShort() * -280898437;
		this.alpha = var1.getUByte();
		this.parentId = var1.getUShort();
		if (this.parentId == '\uffff') {
			this.parentId = -1;
		} else {
			this.parentId += this.hash & 0xffff0000;
		}

		this.anInt1153 = var1.getUShort();
		if (this.anInt1153 == '\uffff') {
			this.anInt1153 = -1;
		}

		int var3 = var1.getUByte();
		int var5;
		if (var3 > 0) {
			this.anIntArray1191 = new int[var3];
			this.anIntArray1168 = new int[var3];

			for (var5 = 0; var5 < var3; var5++) {
				this.anIntArray1191[var5] = var1.getUByte();
				this.anIntArray1168[var5] = var1.getUShort();
			}
		}

		var5 = var1.getUByte();
		int var2;
		int var4;
		int var8;
		if (var5 > 0) {
			this.varpOpcodes = new int[var5][];

			for (var4 = 0; var4 < var5; var4++) {
				var2 = var1.getUShort();
				this.varpOpcodes[var4] = new int[var2];

				for (var8 = 0; var8 < var2; var8++) {
					this.varpOpcodes[var4][var8] = var1.getUShort();
					if (this.varpOpcodes[var4][var8] == '\uffff') {
						this.varpOpcodes[var4][var8] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.viewportHeight = var1.getUShort();
			this.hidden = var1.getUByte() == 1;
		}

		if (this.type == 1) {
			var1.getUShort();
			var1.getUByte();
		}

		if (this.type == 2) {
			this.itemIds = new int[this.anInt1135 * 124195285 * 507570867 * this.anInt1136];
			this.itemQuantities = new int[this.anInt1135 * 124195285 * 507570867 * this.anInt1136];
			var4 = var1.getUByte();
			if (var4 == 1) {
				this.config |= 268435456;
			}

			var2 = var1.getUByte();
			if (var2 == 1) {
				this.config |= 1073741824;
			}

			var8 = var1.getUByte();
			if (var8 == 1) {
				this.config |= Integer.MIN_VALUE;
			}

			int var11 = var1.getUByte();
			if (var11 == 1) {
				this.config |= 536870912;
			}

			this.columnPadding = var1.getUByte();
			this.rowPadding = var1.getUByte();
			this.xSprites = new int[20];
			this.anIntArray1163 = new int[20];
			this.anIntArray1164 = new int[20];

			int var6;
			for (var6 = 0; var6 < 20; var6++) {
				int var10 = var1.getUByte();
				if (var10 == 1) {
					this.xSprites[var6] = var1.getShort();
					this.anIntArray1163[var6] = var1.getShort();
					this.anIntArray1164[var6] = var1.getInt();
				} else {
					this.anIntArray1164[var6] = -1;
				}
			}

			this.tableActions = new String[5];

			for (var6 = 0; var6 < 5; var6++) {
				String var111 = var1.getString();
				if (var111.length() > 0) {
					this.tableActions[var6] = var111;
					this.config |= 1 << var6 + 23;
				}
			}
		}

		if (this.type == 3) {
			this.aBool1161 = var1.getUByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.anInt1159 = var1.getUByte();
			this.anInt1138 = var1.getUByte();
			this.anInt1158 = var1.getUByte();
			this.fontId = var1.getUShort();
			if (this.fontId == '\uffff') {
				this.fontId = -1;
			}

			this.textShadowed = var1.getUByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.getString();
			this.aString1157 = var1.getString();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.textColor = var1.getInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.anInt1139 = var1.getInt();
			this.anInt1140 = var1.getInt();
			this.anInt1141 = var1.getInt();
		}

		if (this.type == 5) {
			this.textureId = var1.getInt();
			this.anInt1143 = var1.getInt();
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.getUShort();
			if (this.modelId == '\uffff') {
				this.modelId = -1;
			}

			this.anInt1147 = 1;
			this.anInt1148 = var1.getUShort();
			if (this.anInt1148 == '\uffff') {
				this.anInt1148 = -1;
			}

			this.anInt1162 = var1.getUShort();
			if (this.anInt1162 == '\uffff') {
				this.anInt1162 = -1;
			}

			this.anInt1150 = var1.getUShort();
			if (this.anInt1150 == '\uffff') {
				this.anInt1150 = -1;
			}

			this.modelZoom = var1.getUShort();
			this.rotationX = var1.getUShort();
			this.rotationZ = var1.getUShort();
		}

		if (this.type == 7) {
			this.itemIds = new int[this.anInt1136 * 507570867 * this.anInt1135 * 124195285];
			this.itemQuantities = new int[this.anInt1135 * 124195285 * this.anInt1136 * 507570867];
			this.anInt1159 = var1.getUByte();
			this.fontId = var1.getUShort();
			if (this.fontId == '\uffff') {
				this.fontId = -1;
			}

			this.textShadowed = var1.getUByte() == 1;
			this.textColor = var1.getInt();
			this.columnPadding = var1.getShort();
			this.rowPadding = var1.getShort();
			var4 = var1.getUByte();
			if (var4 == 1) {
				this.config |= 1073741824;
			}

			this.tableActions = new String[5];

			for (var2 = 0; var2 < 5; var2++) {
				String var101 = var1.getString();
				if (var101.length() > 0) {
					this.tableActions[var2] = var101;
					this.config |= 1 << var2 + 23;
				}
			}
		}

		if (this.type == 8) {
			this.text = var1.getString();
		}

		if (this.anInt1195 == 2 || this.type == 2) {
			this.selectedAction = var1.getString();
			this.aString1125 = var1.getString();
			var4 = var1.getUShort() & 0x3f;
			this.config |= var4 << 11;
		}

		if (this.anInt1195 == 1 || this.anInt1195 == 4 || this.anInt1195 == 5 || this.anInt1195 == 6) {
			this.tooltip = var1.getString();
			if (this.tooltip.length() == 0) {
				if (this.anInt1195 == 1) {
					this.tooltip = "Ok";
				}

				if (this.anInt1195 == 4) {
					this.tooltip = "Select";
				}

				if (this.anInt1195 == 5) {
					this.tooltip = "Select";
				}

				if (this.anInt1195 == 6) {
					this.tooltip = "Continue";
				}
			}
		}

		if (this.anInt1195 == 1 || this.anInt1195 == 4 || this.anInt1195 == 5) {
			this.config |= 4194304;
		}

		if (this.anInt1195 == 6) {
			this.config |= 1;
		}

	}

	public void method497(int var1, int var2) {
		int var3 = this.itemIds[var2];
		this.itemIds[var2] = this.itemIds[var1];
		this.itemIds[var1] = var3;
		var3 = this.itemQuantities[var2];
		this.itemQuantities[var2] = this.itemQuantities[var1];
		this.itemQuantities[var1] = var3;
	}

}
