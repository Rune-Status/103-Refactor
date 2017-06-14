import java.awt.Canvas;
import java.awt.Color;
import java.io.IOException;

public class ItemType extends DualNode {

	public int id;
	static Sprite[] prayerIcons;
	public static AbstractIndex item_ref;
	int anInt1630;
	public int anInt1637 = 2000;
	public int anInt1612 = 0;
	public int anInt1613 = 0;
	public int anInt1634 = 0;
	public int anInt1642 = 0;
	public int anInt1616 = 0;
	short[] colors;
	short[] modifiedColors;
	short[] aShortArray1611;
	short[] aShortArray1610;
	public String name = "null";
	public boolean aBool1618 = false;
	public int stackable = 0;
	int anInt1641 = -1;
	int anInt1608 = -1;
	int anInt1626 = -1;
	int anInt1605 = -1;
	int anInt1614 = -1;
	int anInt1627 = -1;
	int anInt1628 = -1;
	int anInt1629 = -1;
	int anInt1643 = -1;
	int anInt1621 = -1;
	public int anInt1639 = 0;
	public String[] groundActions = new String[] { null, null, "Take", null, null };
	public String[] actions = new String[] { null, null, null, null, "Drop" };
	public int storeValue = 1;
	int anInt1623 = 0;
	int anInt1625 = 0;
	public boolean aBool1624 = false;
	public int anInt1640 = -1;
	public int anInt1633 = -1;
	int anInt1615 = 128;
	int[] anIntArray1631;
	int[] anIntArray1632;
	int anInt1635 = 128;
	int anInt1636 = 128;
	public int anInt1617 = 0;
	public int anInt1638 = 0;
	int unnotedId = -1;
	int notedId = -1;
	public static NodeMap items = new NodeMap(64);
	public static NodeMap aClass106_1607 = new NodeMap(50);
	public static NodeMap aClass106_1620 = new NodeMap(200);

	void post() {
	}

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method817(var1, var2);
		}
	}

	public final RSModel method809(int var1) {
		int var3;
		if (this.anIntArray1631 != null && var1 > 1) {
			int var4 = -1;

			for (var3 = 0; var3 < 10; var3++) {
				if (var1 >= this.anIntArray1632[var3] && this.anIntArray1632[var3] != 0) {
					var4 = this.anIntArray1631[var3];
				}
			}

			if (var4 != -1) {
				return FriendedPlayer.getItemType(var4).method809(1);
			}
		}

		RSModel var41 = RSModel.method887(GZipDecompressor.aClass87_516, this.anInt1630, 0);
		if (var41 == null) {
			return null;
		} else {
			if (this.anInt1615 != 128 || this.anInt1635 != 128 || this.anInt1636 != 128) {
				var41.method898(this.anInt1615, this.anInt1635, this.anInt1636);
			}

			if (this.colors != null) {
				for (var3 = 0; var3 < this.colors.length; var3++) {
					var41.recolor(this.colors[var3], this.modifiedColors[var3]);
				}
			}

			if (this.aShortArray1611 != null) {
				for (var3 = 0; var3 < this.aShortArray1611.length; var3++) {
					var41.method896(this.aShortArray1611[var3], this.aShortArray1610[var3]);
				}
			}

			return var41;
		}
	}

	static void method810() {
		AbstractWheelListener.removeKeyFocusListener(LandscapeTile.gameCanvas);
		Canvas var0 = LandscapeTile.gameCanvas;
		var0.removeMouseListener(MouseInput.aClass74_618);
		var0.removeMouseMotionListener(MouseInput.aClass74_618);
		var0.removeFocusListener(MouseInput.aClass74_618);
		MouseInput.anInt626 = 0;
		if (Class26.wheelListener != null) {
			Class26.wheelListener.removeWheelListener(LandscapeTile.gameCanvas);
		}

		Client.clientInstance.method1027();
		LandscapeTile.gameCanvas.setBackground(Color.black);
		VarBitType.setKeyFocusListener(LandscapeTile.gameCanvas);
		Canvas var1 = LandscapeTile.gameCanvas;
		var1.addMouseListener(MouseInput.aClass74_618);
		var1.addMouseMotionListener(MouseInput.aClass74_618);
		var1.addFocusListener(MouseInput.aClass74_618);
		if (Class26.wheelListener != null) {
			Class26.wheelListener.setWheelListener(LandscapeTile.gameCanvas);
		}

		if (Client.anInt2226 != -1) {
			ItemTable.method647(false);
		}

		Client.aBool1981 = true;
	}

	public final Model method811(int var1) {
		if (this.anIntArray1631 != null && var1 > 1) {
			int var6 = -1;

			for (int var5 = 0; var5 < 10; var5++) {
				if (var1 >= this.anIntArray1632[var5] && this.anIntArray1632[var5] != 0) {
					var6 = this.anIntArray1631[var5];
				}
			}

			if (var6 != -1) {
				return FriendedPlayer.getItemType(var6).method811(1);
			}
		}

		Model var51 = (Model) aClass106_1607.get((long) this.id);
		if (var51 != null) {
			return var51;
		} else {
			RSModel var61 = RSModel.method887(GZipDecompressor.aClass87_516, this.anInt1630, 0);
			if (var61 == null) {
				return null;
			} else {
				if (this.anInt1615 != 128 || this.anInt1635 != 128 || this.anInt1636 != 128) {
					var61.method898(this.anInt1615, this.anInt1635, this.anInt1636);
				}

				int var4;
				if (this.colors != null) {
					for (var4 = 0; var4 < this.colors.length; var4++) {
						var61.recolor(this.colors[var4], this.modifiedColors[var4]);
					}
				}

				if (this.aShortArray1611 != null) {
					for (var4 = 0; var4 < this.aShortArray1611.length; var4++) {
						var61.method896(this.aShortArray1611[var4], this.aShortArray1610[var4]);
					}
				}

				var51 = var61.method902(this.anInt1617 + 64, this.anInt1638 + 768, -50, -10, -50);
				var51.allowClickBounds = true;
				aClass106_1607.put(var51, (long) this.id);
				return var51;
			}
		}
	}

	public ItemType method812(int var1) {
		if (this.anIntArray1631 != null && var1 > 1) {
			int var3 = -1;

			for (int var2 = 0; var2 < 10; var2++) {
				if (var1 >= this.anIntArray1632[var2] && this.anIntArray1632[var2] != 0) {
					var3 = this.anIntArray1631[var2];
				}
			}

			if (var3 != -1) {
				return FriendedPlayer.getItemType(var3);
			}
		}

		return this;
	}

	public final boolean method813(boolean var1) {
		int var2 = this.anInt1641;
		int var3 = this.anInt1608;
		int var4 = this.anInt1626;
		if (var1) {
			var2 = this.anInt1605;
			var3 = this.anInt1614;
			var4 = this.anInt1627;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!GZipDecompressor.aClass87_516.method388(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !GZipDecompressor.aClass87_516.method388(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !GZipDecompressor.aClass87_516.method388(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final RSModel method814(boolean var1) {
		int var2 = this.anInt1641;
		int var5 = this.anInt1608;
		int var4 = this.anInt1626;
		if (var1) {
			var2 = this.anInt1605;
			var5 = this.anInt1614;
			var4 = this.anInt1627;
		}

		if (var2 == -1) {
			return null;
		} else {
			RSModel var6 = RSModel.method887(GZipDecompressor.aClass87_516, var2, 0);
			if (var5 != -1) {
				RSModel var9 = RSModel.method887(GZipDecompressor.aClass87_516, var5, 0);
				if (var4 != -1) {
					RSModel var10 = RSModel.method887(GZipDecompressor.aClass87_516, var4, 0);
					RSModel[] var8 = new RSModel[] { var6, var9, var10 };
					var6 = new RSModel(var8, 3);
				} else {
					RSModel[] var101 = new RSModel[] { var6, var9 };
					var6 = new RSModel(var101, 2);
				}
			}

			if (!var1 && this.anInt1623 != 0) {
				var6.method894(0, this.anInt1623, 0);
			}

			if (var1 && this.anInt1625 != 0) {
				var6.method894(0, this.anInt1625, 0);
			}

			int var91;
			if (this.colors != null) {
				for (var91 = 0; var91 < this.colors.length; var91++) {
					var6.recolor(this.colors[var91], this.modifiedColors[var91]);
				}
			}

			if (this.aShortArray1611 != null) {
				for (var91 = 0; var91 < this.aShortArray1611.length; var91++) {
					var6.method896(this.aShortArray1611[var91], this.aShortArray1610[var91]);
				}
			}

			return var6;
		}
	}

	public final boolean method815(boolean var1) {
		int var2 = this.anInt1628;
		int var4 = this.anInt1629;
		if (var1) {
			var2 = this.anInt1643;
			var4 = this.anInt1621;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var3 = true;
			if (!GZipDecompressor.aClass87_516.method388(var2, 0)) {
				var3 = false;
			}

			if (var4 != -1 && !GZipDecompressor.aClass87_516.method388(var4, 0)) {
				var3 = false;
			}

			return var3;
		}
	}

	void method816(ItemType var1, ItemType var2) {
		this.anInt1630 = var1.anInt1630;
		this.anInt1637 = var1.anInt1637;
		this.anInt1612 = var1.anInt1612;
		this.anInt1613 = var1.anInt1613;
		this.anInt1634 = var1.anInt1634;
		this.anInt1642 = var1.anInt1642;
		this.anInt1616 = var1.anInt1616;
		this.colors = var2.colors;
		this.modifiedColors = var2.modifiedColors;
		this.aShortArray1611 = var2.aShortArray1611;
		this.aShortArray1610 = var2.aShortArray1610;
		this.name = var2.name;
		this.aBool1618 = var2.aBool1618;
		this.stackable = var2.stackable;
		this.anInt1641 = var2.anInt1641;
		this.anInt1608 = var2.anInt1608;
		this.anInt1626 = var2.anInt1626;
		this.anInt1605 = var2.anInt1605;
		this.anInt1614 = var2.anInt1614;
		this.anInt1627 = var2.anInt1627;
		this.anInt1628 = var2.anInt1628;
		this.anInt1629 = var2.anInt1629;
		this.anInt1643 = var2.anInt1643;
		this.anInt1621 = var2.anInt1621;
		this.anInt1639 = var2.anInt1639;
		this.groundActions = var2.groundActions;
		this.actions = new String[5];
		if (var2.actions != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.actions[var3] = var2.actions[var3];
			}
		}

		this.actions[4] = "Discard";
		this.storeValue = 0;
	}

	void method817(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.anInt1630 = var1.getUShort();
		} else if (var2 == 2) {
			this.name = var1.getString();
		} else if (var2 == 4) {
			this.anInt1637 = var1.getUShort();
		} else if (var2 == 5) {
			this.anInt1612 = var1.getUShort();
		} else if (var2 == 6) {
			this.anInt1613 = var1.getUShort();
		} else if (var2 == 7) {
			this.anInt1642 = var1.getUShort();
			if (this.anInt1642 > 32767) {
				this.anInt1642 -= 65536;
			}
		} else if (var2 == 8) {
			this.anInt1616 = var1.getUShort();
			if (this.anInt1616 > 32767) {
				this.anInt1616 -= 65536;
			}
		} else if (var2 == 11) {
			this.stackable = 1;
		} else if (var2 == 12) {
			this.storeValue = var1.getInt();
		} else if (var2 == 16) {
			this.aBool1618 = true;
		} else if (var2 == 23) {
			this.anInt1641 = var1.getUShort();
			this.anInt1623 = var1.getUByte();
		} else if (var2 == 24) {
			this.anInt1608 = var1.getUShort();
		} else if (var2 == 25) {
			this.anInt1605 = var1.getUShort();
			this.anInt1625 = var1.getUByte();
		} else if (var2 == 26) {
			this.anInt1614 = var1.getUShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.getString();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.actions[var2 - 35] = var1.getString();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var4 = var1.getUByte();
				this.colors = new short[var4];
				this.modifiedColors = new short[var4];

				for (var3 = 0; var3 < var4; var3++) {
					this.colors[var3] = (short) var1.getUShort();
					this.modifiedColors[var3] = (short) var1.getUShort();
				}
			} else if (var2 == 41) {
				var4 = var1.getUByte();
				this.aShortArray1611 = new short[var4];
				this.aShortArray1610 = new short[var4];

				for (var3 = 0; var3 < var4; var3++) {
					this.aShortArray1611[var3] = (short) var1.getUShort();
					this.aShortArray1610[var3] = (short) var1.getUShort();
				}
			} else if (var2 == 65) {
				this.aBool1624 = true;
			} else if (var2 == 78) {
				this.anInt1626 = var1.getUShort();
			} else if (var2 == 79) {
				this.anInt1627 = var1.getUShort();
			} else if (var2 == 90) {
				this.anInt1628 = var1.getUShort();
			} else if (var2 == 91) {
				this.anInt1643 = var1.getUShort();
			} else if (var2 == 92) {
				this.anInt1629 = var1.getUShort();
			} else if (var2 == 93) {
				this.anInt1621 = var1.getUShort();
			} else if (var2 == 95) {
				this.anInt1634 = var1.getUShort();
			} else if (var2 == 97) {
				this.anInt1640 = var1.getUShort();
			} else if (var2 == 98) {
				this.anInt1633 = var1.getUShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.anIntArray1631 == null) {
					this.anIntArray1631 = new int[10];
					this.anIntArray1632 = new int[10];
				}

				this.anIntArray1631[var2 - 100] = var1.getUShort();
				this.anIntArray1632[var2 - 100] = var1.getUShort();
			} else if (var2 == 110) {
				this.anInt1615 = var1.getUShort();
			} else if (var2 == 111) {
				this.anInt1635 = var1.getUShort();
			} else if (var2 == 112) {
				this.anInt1636 = var1.getUShort();
			} else if (var2 == 113) {
				this.anInt1617 = var1.getByte();
			} else if (var2 == 114) {
				this.anInt1638 = var1.getByte() * 5;
			} else if (var2 == 115) {
				this.anInt1639 = var1.getUByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.getUShort();
			} else if (var2 == 140) {
				this.notedId = var1.getUShort();
			}
		}

	}

	public final RSModel method818(boolean var1) {
		int var2 = this.anInt1628;
		int var4 = this.anInt1629;
		if (var1) {
			var2 = this.anInt1643;
			var4 = this.anInt1621;
		}

		if (var2 == -1) {
			return null;
		} else {
			RSModel var5 = RSModel.method887(GZipDecompressor.aClass87_516, var2, 0);
			if (var4 != -1) {
				RSModel var7 = RSModel.method887(GZipDecompressor.aClass87_516, var4, 0);
				RSModel[] var6 = new RSModel[] { var5, var7 };
				var5 = new RSModel(var6, 2);
			}

			int var71;
			if (this.colors != null) {
				for (var71 = 0; var71 < this.colors.length; var71++) {
					var5.recolor(this.colors[var71], this.modifiedColors[var71]);
				}
			}

			if (this.aShortArray1611 != null) {
				for (var71 = 0; var71 < this.aShortArray1611.length; var71++) {
					var5.method896(this.aShortArray1611[var71], this.aShortArray1610[var71]);
				}
			}

			return var5;
		}
	}

	void method819(ItemType var1, ItemType var2) {
		this.anInt1630 = var1.anInt1630;
		this.anInt1637 = var1.anInt1637;
		this.anInt1612 = var1.anInt1612;
		this.anInt1613 = var1.anInt1613;
		this.anInt1634 = var1.anInt1634;
		this.anInt1642 = var1.anInt1642;
		this.anInt1616 = var1.anInt1616;
		this.colors = var1.colors;
		this.modifiedColors = var1.modifiedColors;
		this.aShortArray1611 = var1.aShortArray1611;
		this.aShortArray1610 = var1.aShortArray1610;
		this.name = var2.name;
		this.aBool1618 = var2.aBool1618;
		this.storeValue = var2.storeValue;
		this.stackable = 1;
	}

	static void setItemTableSlot(int id, int slot, int itemId, int quantity) {
		ItemTable table = (ItemTable) ItemTable.itemTables.get((long) id);
		if (table == null) {
			table = new ItemTable();
			ItemTable.itemTables.put(table, (long) id);
		}

		if (table.ids.length <= slot) {
			int[] ids = new int[slot + 1];
			int[] quantities = new int[slot + 1];

			int var6;
			for (var6 = 0; var6 < table.ids.length; var6++) {
				ids[var6] = table.ids[var6];
				quantities[var6] = table.quantities[var6];
			}

			for (var6 = table.ids.length; var6 < slot; var6++) {
				ids[var6] = -1;
				quantities[var6] = 0;
			}

			table.ids = ids;
			table.quantities = quantities;
		}

		table.ids[slot] = itemId;
		table.quantities[slot] = quantity;
	}

	static ClientSettings desrializeSettings() {
		CacheFileAccessor accessor = null;
		ClientSettings settings = new ClientSettings();

		try {
			accessor = BoundaryStub.getPreferences("", Client.gameType.identifier, false);
			byte[] bytes = new byte[(int) accessor.length()];

			int read;
			for (int offset = 0; offset < bytes.length; offset += read) {
				read = accessor.read(bytes, offset, bytes.length - offset);
				if (read == -1) {
					throw new IOException();
				}
			}

			settings = new ClientSettings(new ByteBuf(bytes));
		} catch (Exception var6) {
			;
		}

		try {
			if (accessor != null) {
				accessor.close();
			}
		} catch (Exception var5) {
			;
		}

		return settings;
	}

}
