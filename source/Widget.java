
public class Widget extends Node {

	public int anInt1122 = 0;
	static boolean[] loadedInterfaces;
	static Class87 widgetIndex;
	public String aString1125 = "";
	public int anInt1126;
	static Class106 aClass106_1127 = new Class106(50);
	public int config = 0;
	public int spriteId = 0;
	public static boolean aBool1128 = false;
	public boolean interactable = false;
	public int anInt1129 = -1463664765;
	public int index = -938225275;
	public Object[] anObjectArray1130;
	public int columnPadding = 0;
	static Class87 aClass87_1131;
	public int anInt1132 = 0;
	public Object[] mouseHoverListener;
	public int anInt1133 = 0;
	public int buttonType = 0;
	public int anInt1134 = 0;
	public int rotationX = 0;
	public int anInt1135 = 0;
	public int anInt1136 = 0;
	public int relativeX = 0;
	public int relativeY = 0;
	public int width = 0;
	public int shadowColor = 0;
	public int anInt1137 = -532092193;
	public int anInt1138 = 0;
	public int parentId = -742443693;
	public boolean hidden = false;
	public int insetX = 0;
	public int insetY = 0;
	public int[] skillTriggers;
	public int viewportHeight = 0;
	public int textColor = 0;
	public int anInt1139 = 0;
	public int anInt1140 = 0;
	public int anInt1141 = 0;
	public int alpha = 0;
	public static Widget[][] interfaces;
	public boolean aBool1142 = false;
	public int textureId = -8452631;
	public int anInt1143 = 134170007;
	public Object[] mouseEnterListener;
	public boolean aBool1144 = false;
	public int[] xSprites;
	public boolean aBool1145;
	public boolean flippedVertically;
	public int anInt1146 = 0;
	public int loopCycle;
	public int modelId = 541123263;
	int anInt1147 = 2074402997;
	int anInt1148 = -1281953087;
	public int anInt1149 = 0;
	public int anInt1150 = -1031227777;
	public Object[] tableListenerArgs;
	public int anInt1151 = 0;
	public int height = 0;
	public int modelType = -376460707;
	public int anInt1152 = -1116355379;
	public int modelZoom = -859504940;
	public int anInt1153 = -1344074445;
	public int fontId = -189801909;
	public boolean aBool1154 = false;
	public int anInt1155 = 1197573590;
	public Object[] anObjectArray1156;
	public String text = "";
	public String aString1157 = "";
	public int anInt1158 = 0;
	public int anInt1159 = 0;
	public int anInt1160 = 0;
	public boolean textShadowed = false;
	public boolean aBool1161 = false;
	public int rotationY = 0;
	public int anInt1162 = -1986493785;
	public int[] anIntArray1163;
	public int[] anIntArray1164;
	public boolean aBool1165;
	public Widget[] children;
	public String name = "";
	public String[] actions;
	public Widget parent = null;
	public int anInt1166 = 0;
	static Class106 aClass106_1167 = new Class106(200);
	public int[] anIntArray1168;
	public String selectedAction = "";
	public boolean aBool1169 = false;
	public Object[] anObjectArray1170;
	public Object[] anObjectArray1171;
	public Object[] anObjectArray1172;
	public Object[] anObjectArray1173;
	public Object[] anObjectArray1174;
	public boolean aBool1175;
	public int rowPadding = 0;
	public Object[] mouseExitListener;
	public Object[] anObjectArray1176;
	public Object[] anObjectArray1177;
	public int borderThickness = 0;
	public Object[] anObjectArray1178;
	public int contentType = 0;
	public int[] configTriggers;
	public int type;
	public int[] tableModTriggers;
	public Object[] skillListenerArgs;
	public boolean aBool1179 = false;
	public Object[] renderListener;
	public Object[] anObjectArray1180;
	public Object[] scrollListener;
	public Object[] anObjectArray1181;
	public Object[] anObjectArray1182;
	public Object[] anObjectArray1183;
	public Object[] anObjectArray1184;
	public int anInt1185 = 0;
	public Object[] anObjectArray1186;
	public Object[] anObjectArray1187;
	public Object[] anObjectArray1188;
	public Object[] anObjectArray1189;
	public Object[] anObjectArray1190;
	public int[][] varpOpcodes;
	public int[] anIntArray1191;
	public int viewportWidth = 0;
	static Class106 aClass106_1192 = new Class106(20);
	public Object[] configListenerArgs;
	public String tooltip;
	public int anInt1193 = -1646228653;
	public int[] itemQuantities;
	public int itemId;
	public int itemQuantity;
	public int anInt1194;
	public int anInt1195 = 0;
	public int[] itemIds;
	public boolean flippedHorizontally;
	public String[] tableActions;
	public int anInt1196;
	public int anInt1197;
	public int anInt1198 = 0;
	public int anInt1199;
	public int boundsIndex;
	public int anInt1200;
	public boolean aBool1201;
	public int rotationZ = 0;
	static Class106 aClass106_1202 = new Class106(8);

	void decodeActive(ByteBuf var1) {
		var1.getUByte();
		this.interactable = true;
		this.type = var1.getUByte() * 1702392323;
		this.contentType = var1.getUShort() * -2071508735;
		this.anInt1134 = var1.getShort() * 10986657;
		this.anInt1185 = var1.getShort() * -720369495;
		this.anInt1135 = var1.getUShort() * 934649725;
		if (this.type * -1305917269 == 9) {
			this.anInt1136 = var1.getShort() * -280898437;
		} else {
			this.anInt1136 = var1.getUShort() * -280898437;
		}

		this.anInt1133 = var1.getByte() * -1174864481;
		this.buttonType = var1.getByte() * -1361079889;
		this.anInt1132 = var1.getByte() * 821393763;
		this.anInt1122 = var1.getByte() * -1510479807;
		this.parentId = var1.getUShort() * 742443693;
		if (-1652479707 * this.parentId == '\uffff') {
			this.parentId = -742443693;
		} else {
			this.parentId = 742443693 * ((this.anInt1129 * -1536575275 & -65536) + this.parentId * -1652479707);
		}

		this.hidden = var1.getUByte() == 1;
		if (this.type * -1305917269 == 0) {
			this.viewportWidth = var1.getUShort() * -1460374373;
			this.viewportHeight = var1.getUShort() * 2144421371;
			this.aBool1201 = var1.getUByte() == 1;
		}

		if (-1305917269 * this.type == 5) {
			this.textureId = var1.getInt() * 8452631;
			this.spriteId = var1.getUShort() * -2073708251;
			this.aBool1144 = var1.getUByte() == 1;
			this.alpha = var1.getUByte() * -150375007;
			this.borderThickness = var1.getUByte() * -1058827231;
			this.shadowColor = var1.getInt() * 1485125361;
			this.flippedVertically = var1.getUByte() == 1;
			this.flippedHorizontally = var1.getUByte() == 1;
		}

		if (-1305917269 * this.type == 6) {
			this.modelType = -376460707;
			this.modelId = var1.getUShort() * -541123263;
			if (this.modelId * 686060225 == '\uffff') {
				this.modelId = 541123263;
			}

			this.anInt1198 = var1.getShort() * 1821510845;
			this.anInt1151 = var1.getShort() * 1509391427;
			this.rotationX = var1.getUShort() * 1055873919;
			this.rotationZ = var1.getUShort() * -478470667;
			this.rotationY = var1.getUShort() * -1820349821;
			this.modelZoom = var1.getUShort() * -438091779;
			this.anInt1162 = var1.getUShort() * 1986493785;
			if (467073769 * this.anInt1162 == '\uffff') {
				this.anInt1162 = -1986493785;
			}

			this.aBool1154 = var1.getUByte() == 1;
			var1.getUShort();
			if (this.anInt1133 * -1693000097 != 0) {
				this.anInt1160 = var1.getUShort() * 1064993113;
			}

			if (1039689039 * this.buttonType != 0) {
				var1.getUShort();
			}
		}

		if (this.type * -1305917269 == 4) {
			this.fontId = var1.getUShort() * 189801909;
			if (-335454051 * this.fontId == '\uffff') {
				this.fontId = -189801909;
			}

			this.text = var1.getString();
			this.anInt1158 = var1.getUByte() * -51845037;
			this.anInt1159 = var1.getUByte() * 1328854359;
			this.anInt1138 = var1.getUByte() * 252282377;
			this.textShadowed = var1.getUByte() == 1;
			this.textColor = var1.getInt() * 1053943595;
		}

		if (-1305917269 * this.type == 3) {
			this.textColor = var1.getInt() * 1053943595;
			this.aBool1161 = var1.getUByte() == 1;
			this.alpha = var1.getUByte() * -150375007;
		}

		if (-1305917269 * this.type == 9) {
			this.anInt1137 = var1.getUByte() * -532092193;
			this.textColor = var1.getInt() * 1053943595;
			this.aBool1142 = var1.getUByte() == 1;
		}

		this.config = var1.getMedium() * 583340921;
		this.name = var1.getString();
		int var3 = var1.getUByte();
		if (var3 > 0) {
			this.actions = new String[var3];

			for (int var2 = 0; var2 < var3; ++var2) {
				this.actions[var2] = var1.getString();
			}
		}

		this.anInt1166 = var1.getUByte() * -172520565;
		this.anInt1146 = var1.getUByte() * -77181551;
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

			for (int var3 = 0; var3 < var2; ++var3) {
				var4[var3] = var1.getInt();
			}

			return var4;
		}
	}

	public Sprite method488(int var1) {
		aBool1128 = false;
		if (var1 >= 0 && var1 < this.anIntArray1164.length) {
			int var2 = this.anIntArray1164[var1];
			if (var2 != -1) {
				Sprite var3 = (Sprite) aClass106_1167.method427((long) var2);
				if (var3 != null) {
					return var3;
				} else {
					Class87 var4 = Npc.aClass87_1967;
					Sprite var6;
					if (!Class35.method202(var4, var2, 0)) {
						var6 = null;
					} else {
						Sprite var5 = new Sprite();
						var5.anInt1815 = -749860951 * Class7.anInt148;
						var5.anInt1816 = -1945497809 * Class7.anInt155;
						var5.anInt1814 = Class7.anIntArray149[0];
						var5.anInt1817 = DualNode_Sub11.anIntArray1544[0];
						var5.height = Class7.anIntArray150[0];
						var5.width = Class7.anIntArray151[0];
						int var8 = var5.height * var5.width;
						byte[] var9 = Npc.aByteArrayArray1966[0];
						var5.pixels = new int[var8];

						for (int var7 = 0; var7 < var8; ++var7) {
							var5.pixels[var7] = Class85.anIntArray690[var9[var7] & 255];
						}

						Class65.method318();
						var6 = var5;
					}

					if (var6 != null) {
						aClass106_1167.method428(var6, (long) var2);
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

	public Sprite method489(boolean var1) {
		aBool1128 = false;
		int var11;
		if (var1) {
			var11 = this.anInt1143 * -1162840615;
		} else {
			var11 = 18996647 * this.textureId;
		}

		if (var11 == -1) {
			return null;
		} else {
			long var8 = ((long) (2139159057 * this.shadowColor) << 40) + ((this.flippedVertically ? 1L : 0L) << 38)
					+ (long) var11 + ((long) (-357503007 * this.borderThickness) << 36)
					+ ((this.flippedHorizontally ? 1L : 0L) << 39);
			Sprite var2 = (Sprite) aClass106_1167.method427(var8);
			if (var2 != null) {
				return var2;
			} else {
				Class87 var10 = Npc.aClass87_1967;
				Sprite var7;
				if (!Class35.method202(var10, var11, 0)) {
					var7 = null;
				} else {
					Sprite var3 = new Sprite();
					var3.anInt1815 = -749860951 * Class7.anInt148;
					var3.anInt1816 = Class7.anInt155 * -1945497809;
					var3.anInt1814 = Class7.anIntArray149[0];
					var3.anInt1817 = DualNode_Sub11.anIntArray1544[0];
					var3.height = Class7.anIntArray150[0];
					var3.width = Class7.anIntArray151[0];
					int var5 = var3.height * var3.width;
					byte[] var12 = Npc.aByteArrayArray1966[0];
					var3.pixels = new int[var5];

					for (int var4 = 0; var4 < var5; ++var4) {
						var3.pixels[var4] = Class85.anIntArray690[var12[var4] & 255];
					}

					Class65.method318();
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

					if (this.borderThickness * -357503007 > 0) {
						var7.method941(this.borderThickness * -357503007);
					}

					if (this.borderThickness * -357503007 >= 1) {
						var7.method952(1);
					}

					if (this.borderThickness * -357503007 >= 2) {
						var7.method952(16777215);
					}

					if (this.shadowColor * 2139159057 != 0) {
						var7.method962(this.shadowColor * 2139159057);
					}

					aClass106_1167.method428(var7, var8);
					return var7;
				}
			}
		}
	}

	public DualNode_Sub13_Sub3_Sub1 method490() {
		aBool1128 = false;
		if (this.fontId * -335454051 == -1) {
			return null;
		} else {
			DualNode_Sub13_Sub3_Sub1 var1 = (DualNode_Sub13_Sub3_Sub1) aClass106_1192
					.method427((long) (-335454051 * this.fontId));
			if (var1 == null) {
				Class87 var3 = Npc.aClass87_1967;
				Class87 var4 = Class96_Sub1.aClass87_1207;
				int var5 = -335454051 * this.fontId;
				DualNode_Sub13_Sub3_Sub1 var2;
				if (!Class35.method202(var3, var5, 0)) {
					var2 = null;
				} else {
					var2 = IgnoredPlayer.method415(var4.getFile(var5, 0));
				}

				if (var2 != null) {
					aClass106_1192.method428(var2, (long) (this.fontId * -335454051));
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
		if (-1162840615 * this.anInt1143 == -1) {
			var1 = false;
		}

		int var2 = var1 ? this.anInt1143 * -1162840615 : this.textureId * 18996647;
		if (var2 == -1) {
			return null;
		} else {
			long var7 = ((long) (-357503007 * this.borderThickness) << 36) + (long) var2
					+ ((this.flippedVertically ? 1L : 0L) << 38) + ((this.flippedHorizontally ? 1L : 0L) << 39)
					+ ((long) (this.shadowColor * 2139159057) << 40);
			DualNode_Sub14 var9 = (DualNode_Sub14) aClass106_1202.method427(var7);
			if (var9 != null) {
				return var9;
			} else {
				Sprite var12 = this.method489(var1);
				if (var12 == null) {
					return null;
				} else {
					Sprite var5 = var12.method938();
					int[] var10 = new int[var5.width];
					int[] var6 = new int[var5.width];
					int var11 = 0;

					while (var11 < var5.width) {
						int var13 = 0;
						int var4 = var5.height;
						int var3 = 0;

						while (true) {
							if (var3 < var5.height) {
								if (var5.pixels[var3 + var11 * var5.height] != 0) {
									++var3;
									continue;
								}

								var13 = var3;
							}

							for (var3 = var5.height - 1; var3 >= var13; --var3) {
								if (var5.pixels[var3 + var11 * var5.height] == 0) {
									var4 = 1 + var3;
									break;
								}
							}

							var10[var11] = var13;
							var6[var11] = var4 - var13;
							++var11;
							break;
						}
					}

					var9 = new DualNode_Sub14(var5.height, var5.width, var6, var10, var2);
					aClass106_1202.method428(var9, var7);
					return var9;
				}
			}
		}
	}

	public Model method492(DualNode_Sub3 var1, int var2, boolean var3, PlayerConfig var4) {
		aBool1128 = false;
		int var6;
		int var7;
		if (var3) {
			var6 = this.anInt1147 * -1959457379;
			var7 = this.anInt1148 * 489906879;
		} else {
			var6 = -768837131 * this.modelType;
			var7 = 686060225 * this.modelId;
		}

		if (var6 == 0) {
			return null;
		} else if (var6 == 1 && var7 == -1) {
			return null;
		} else {
			Model var8 = (Model) aClass106_1127.method427((long) (var7 + (var6 << 16)));
			if (var8 == null) {
				Entity_Sub1 var5;
				if (var6 == 1) {
					var5 = Entity_Sub1.method887(aClass87_1131, var7, 0);
					if (var5 == null) {
						aBool1128 = true;
						return null;
					}

					var8 = var5.method902(64, 768, -50, -10, -50);
				}

				if (var6 == 2) {
					var5 = DualNode_Sub11.getNpcDefinition(var7).method800();
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
					ItemDefinition var9 = FriendedPlayer.getItemDefinition(var7);
					var5 = var9.method809(10);
					if (var5 == null) {
						aBool1128 = true;
						return null;
					}

					var8 = var5.method902(64 + -1058514191 * var9.anInt1617, 768 + var9.anInt1638 * 1955247405, -50,
							-10, -50);
				}

				aClass106_1127.method428(var8, (long) ((var6 << 16) + var7));
			}

			if (var1 != null) {
				var8 = var1.method679(var8, var2);
			}

			return var8;
		}
	}

	public void method493(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var4 = new String[1 + var1];
			if (this.actions != null) {
				for (int var3 = 0; var3 < this.actions.length; ++var3) {
					var4[var3] = this.actions[var3];
				}
			}

			this.actions = var4;
		}

		this.actions[var1] = var2;
	}

	static final int method494(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var8 = var0 & var2 - 1;
		int var4 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var11 = Class33.method197(var3, var4);
		int var10 = Class33.method197(var3 + 1, var4);
		int var7 = Class33.method197(var3, var4 + 1);
		int var5 = Class33.method197(1 + var3, 1 + var4);
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

			for (int var4 = 0; var4 < var2; ++var4) {
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
		this.type = var1.getUByte() * 1702392323;
		this.anInt1195 = var1.getUByte() * 1390425787;
		this.contentType = var1.getUShort() * -2071508735;
		this.anInt1134 = var1.getShort() * 10986657;
		this.anInt1185 = var1.getShort() * -720369495;
		this.anInt1135 = var1.getUShort() * 934649725;
		this.anInt1136 = var1.getUShort() * -280898437;
		this.alpha = var1.getUByte() * -150375007;
		this.parentId = var1.getUShort() * 742443693;
		if (-1652479707 * this.parentId == '\uffff') {
			this.parentId = -742443693;
		} else {
			this.parentId = 742443693 * (this.parentId * -1652479707 + (-1536575275 * this.anInt1129 & -65536));
		}

		this.anInt1153 = var1.getUShort() * 1344074445;
		if (this.anInt1153 * -700429819 == '\uffff') {
			this.anInt1153 = -1344074445;
		}

		int var3 = var1.getUByte();
		int var5;
		if (var3 > 0) {
			this.anIntArray1191 = new int[var3];
			this.anIntArray1168 = new int[var3];

			for (var5 = 0; var5 < var3; ++var5) {
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

			for (var4 = 0; var4 < var5; ++var4) {
				var2 = var1.getUShort();
				this.varpOpcodes[var4] = new int[var2];

				for (var8 = 0; var8 < var2; ++var8) {
					this.varpOpcodes[var4][var8] = var1.getUShort();
					if (this.varpOpcodes[var4][var8] == '\uffff') {
						this.varpOpcodes[var4][var8] = -1;
					}
				}
			}
		}

		if (-1305917269 * this.type == 0) {
			this.viewportHeight = var1.getUShort() * 2144421371;
			this.hidden = var1.getUByte() == 1;
		}

		if (this.type * -1305917269 == 1) {
			var1.getUShort();
			var1.getUByte();
		}

		if (this.type * -1305917269 == 2) {
			this.itemIds = new int[124195285 * this.anInt1135 * 507570867 * this.anInt1136];
			this.itemQuantities = new int[124195285 * this.anInt1135 * 507570867 * this.anInt1136];
			var4 = var1.getUByte();
			if (var4 == 1) {
				this.config = 583340921 * (-1817319735 * this.config | 268435456);
			}

			var2 = var1.getUByte();
			if (var2 == 1) {
				this.config = 583340921 * (-1817319735 * this.config | 1073741824);
			}

			var8 = var1.getUByte();
			if (var8 == 1) {
				this.config = 583340921 * (this.config * -1817319735 | Integer.MIN_VALUE);
			}

			int var9 = var1.getUByte();
			if (var9 == 1) {
				this.config = (-1817319735 * this.config | 536870912) * 583340921;
			}

			this.columnPadding = var1.getUByte() * 1585606775;
			this.rowPadding = var1.getUByte() * -393969859;
			this.xSprites = new int[20];
			this.anIntArray1163 = new int[20];
			this.anIntArray1164 = new int[20];

			int var6;
			for (var6 = 0; var6 < 20; ++var6) {
				int var7 = var1.getUByte();
				if (var7 == 1) {
					this.xSprites[var6] = var1.getShort();
					this.anIntArray1163[var6] = var1.getShort();
					this.anIntArray1164[var6] = var1.getInt();
				} else {
					this.anIntArray1164[var6] = -1;
				}
			}

			this.tableActions = new String[5];

			for (var6 = 0; var6 < 5; ++var6) {
				String var10 = var1.getString();
				if (var10.length() > 0) {
					this.tableActions[var6] = var10;
					this.config = (this.config * -1817319735 | 1 << var6 + 23) * 583340921;
				}
			}
		}

		if (-1305917269 * this.type == 3) {
			this.aBool1161 = var1.getUByte() == 1;
		}

		if (this.type * -1305917269 == 4 || -1305917269 * this.type == 1) {
			this.anInt1159 = var1.getUByte() * 1328854359;
			this.anInt1138 = var1.getUByte() * 252282377;
			this.anInt1158 = var1.getUByte() * -51845037;
			this.fontId = var1.getUShort() * 189801909;
			if (-335454051 * this.fontId == '\uffff') {
				this.fontId = -189801909;
			}

			this.textShadowed = var1.getUByte() == 1;
		}

		if (-1305917269 * this.type == 4) {
			this.text = var1.getString();
			this.aString1157 = var1.getString();
		}

		if (-1305917269 * this.type == 1 || -1305917269 * this.type == 3 || this.type * -1305917269 == 4) {
			this.textColor = var1.getInt() * 1053943595;
		}

		if (this.type * -1305917269 == 3 || this.type * -1305917269 == 4) {
			this.anInt1139 = var1.getInt() * -1762562445;
			this.anInt1140 = var1.getInt() * -727461959;
			this.anInt1141 = var1.getInt() * 1763279165;
		}

		if (-1305917269 * this.type == 5) {
			this.textureId = var1.getInt() * 8452631;
			this.anInt1143 = var1.getInt() * -134170007;
		}

		if (this.type * -1305917269 == 6) {
			this.modelType = -376460707;
			this.modelId = var1.getUShort() * -541123263;
			if (this.modelId * 686060225 == '\uffff') {
				this.modelId = 541123263;
			}

			this.anInt1147 = 2074402997;
			this.anInt1148 = var1.getUShort() * 1281953087;
			if (this.anInt1148 * 489906879 == '\uffff') {
				this.anInt1148 = -1281953087;
			}

			this.anInt1162 = var1.getUShort() * 1986493785;
			if (467073769 * this.anInt1162 == '\uffff') {
				this.anInt1162 = -1986493785;
			}

			this.anInt1150 = var1.getUShort() * 1031227777;
			if (this.anInt1150 * -213715327 == '\uffff') {
				this.anInt1150 = -1031227777;
			}

			this.modelZoom = var1.getUShort() * -438091779;
			this.rotationX = var1.getUShort() * 1055873919;
			this.rotationZ = var1.getUShort() * -478470667;
		}

		if (this.type * -1305917269 == 7) {
			this.itemIds = new int[507570867 * this.anInt1136 * this.anInt1135 * 124195285];
			this.itemQuantities = new int[this.anInt1135 * 124195285 * this.anInt1136 * 507570867];
			this.anInt1159 = var1.getUByte() * 1328854359;
			this.fontId = var1.getUShort() * 189801909;
			if (this.fontId * -335454051 == '\uffff') {
				this.fontId = -189801909;
			}

			this.textShadowed = var1.getUByte() == 1;
			this.textColor = var1.getInt() * 1053943595;
			this.columnPadding = var1.getShort() * 1585606775;
			this.rowPadding = var1.getShort() * -393969859;
			var4 = var1.getUByte();
			if (var4 == 1) {
				this.config = (-1817319735 * this.config | 1073741824) * 583340921;
			}

			this.tableActions = new String[5];

			for (var2 = 0; var2 < 5; ++var2) {
				String var11 = var1.getString();
				if (var11.length() > 0) {
					this.tableActions[var2] = var11;
					this.config = (-1817319735 * this.config | 1 << var2 + 23) * 583340921;
				}
			}
		}

		if (-1305917269 * this.type == 8) {
			this.text = var1.getString();
		}

		if (this.anInt1195 * -1300193677 == 2 || this.type * -1305917269 == 2) {
			this.selectedAction = var1.getString();
			this.aString1125 = var1.getString();
			var4 = var1.getUShort() & 63;
			this.config = 583340921 * (-1817319735 * this.config | var4 << 11);
		}

		if (this.anInt1195 * -1300193677 == 1 || -1300193677 * this.anInt1195 == 4 || -1300193677 * this.anInt1195 == 5
				|| -1300193677 * this.anInt1195 == 6) {
			this.tooltip = var1.getString();
			if (this.tooltip.length() == 0) {
				if (this.anInt1195 * -1300193677 == 1) {
					this.tooltip = GameStrings.aString846;
				}

				if (this.anInt1195 * -1300193677 == 4) {
					this.tooltip = GameStrings.aString847;
				}

				if (this.anInt1195 * -1300193677 == 5) {
					this.tooltip = GameStrings.aString847;
				}

				if (this.anInt1195 * -1300193677 == 6) {
					this.tooltip = GameStrings.aString848;
				}
			}
		}

		if (this.anInt1195 * -1300193677 == 1 || -1300193677 * this.anInt1195 == 4
				|| this.anInt1195 * -1300193677 == 5) {
			this.config = 583340921 * (this.config * -1817319735 | 4194304);
		}

		if (this.anInt1195 * -1300193677 == 6) {
			this.config = 583340921 * (-1817319735 * this.config | 1);
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

	public Widget() {
		this.tooltip = GameStrings.aString846;
		this.itemId = 444483265;
		this.itemQuantity = 0;
		this.anInt1194 = 0;
		this.anInt1126 = 0;
		this.aBool1165 = false;
		this.aBool1145 = false;
		this.anInt1196 = 1933665077;
		this.anInt1197 = 0;
		this.anInt1200 = 0;
		this.anInt1199 = 0;
		this.boundsIndex = 2140330043;
		this.loopCycle = -948384899;
		this.aBool1201 = false;
		this.aBool1175 = false;
	}
}
