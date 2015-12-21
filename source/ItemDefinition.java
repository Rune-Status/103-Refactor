import java.awt.Canvas;
import java.awt.Color;
import java.io.IOException;

public class ItemDefinition extends DualNode {

	int anInt1605;
	public static Class106 aClass106_1606 = new Class106(64);
	public static Class106 aClass106_1607 = new Class106(50);
	int anInt1608;
	public int anInt1609;
	short[] aShortArray1610;
	public String name = "null";
	short[] colors;
	short[] modifiedColors;
	short[] aShortArray1611;
	public int storeValue = 1382601623;
	public int anInt1612 = 0;
	public int anInt1613 = 0;
	int anInt1614;
	int anInt1615;
	public int anInt1616 = 0;
	public int stackable = 0;
	public int anInt1617;
	public boolean aBool1618 = false;
	static Sprite[] aSpriteArray1619;
	public static Class106 aClass106_1620 = new Class106(200);
	int anInt1621;
	public static Class87 aClass87_1622;
	int anInt1623;
	public boolean aBool1624;
	int unnotedId;
	int anInt1625;
	int anInt1626;
	int anInt1627;
	int anInt1628;
	int anInt1629;
	public String[] actions;
	int anInt1630;
	int[] anIntArray1631;
	int[] anIntArray1632;
	public String[] groundActions;
	public int anInt1633;
	public int anInt1634 = 0;
	int anInt1635;
	int anInt1636;
	public int anInt1637 = -960162032;
	public int anInt1638;
	public int anInt1639;
	public int anInt1640;
	int anInt1641;
	int notedId;
	public int anInt1642 = 0;
	int anInt1643;

	void method807() {
	}

	void method808(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method817(var1, var2);
		}
	}

	public final Entity_Sub1 method809(int var1) {
		int var3;
		if (this.anIntArray1631 != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.anIntArray1632[var3] && this.anIntArray1632[var3] != 0) {
					var2 = this.anIntArray1631[var3];
				}
			}

			if (var2 != -1) {
				return FriendedPlayer.getItemDefinition(var2).method809(1);
			}
		}

		Entity_Sub1 var4 = Entity_Sub1.method887(Class49.aClass87_516, this.anInt1630 * 908818241, 0);
		if (var4 == null) {
			return null;
		} else {
			if (-1690965437 * this.anInt1615 != 128 || -128875985 * this.anInt1635 != 128
					|| this.anInt1636 * -1842417525 != 128) {
				var4.method898(-1690965437 * this.anInt1615, -128875985 * this.anInt1635, this.anInt1636 * -1842417525);
			}

			if (this.colors != null) {
				for (var3 = 0; var3 < this.colors.length; ++var3) {
					var4.method895(this.colors[var3], this.modifiedColors[var3]);
				}
			}

			if (this.aShortArray1611 != null) {
				for (var3 = 0; var3 < this.aShortArray1611.length; ++var3) {
					var4.method896(this.aShortArray1611[var3], this.aShortArray1610[var3]);
				}
			}

			return var4;
		}
	}

	static void method810() {
		Class78.method343(LandscapeTile.aCanvas1417);
		Canvas var0 = LandscapeTile.aCanvas1417;
		var0.removeMouseListener(Class74.aClass74_618);
		var0.removeMouseMotionListener(Class74.aClass74_618);
		var0.removeFocusListener(Class74.aClass74_618);
		Class74.anInt626 = 0;
		if (Class26.aClass78_313 != null) {
			Class26.aClass78_313.method342(LandscapeTile.aCanvas1417, (byte) -9);
		}

		Client.aClient2005.method1027();
		LandscapeTile.aCanvas1417.setBackground(Color.black);
		Varpbit.method876(LandscapeTile.aCanvas1417);
		Canvas var1 = LandscapeTile.aCanvas1417;
		var1.addMouseListener(Class74.aClass74_618);
		var1.addMouseMotionListener(Class74.aClass74_618);
		var1.addFocusListener(Class74.aClass74_618);
		if (Class26.aClass78_313 != null) {
			Class26.aClass78_313.method340(LandscapeTile.aCanvas1417, (short) 22759);
		}

		if (-1074177723 * Client.anInt2226 != -1) {
			ItemTable.method647(false);
		}

		Client.aBool1981 = true;
	}

	public final Model method811(int var1) {
		if (this.anIntArray1631 != null && var1 > 1) {
			int var3 = -1;

			for (int var2 = 0; var2 < 10; ++var2) {
				if (var1 >= this.anIntArray1632[var2] && this.anIntArray1632[var2] != 0) {
					var3 = this.anIntArray1631[var2];
				}
			}

			if (var3 != -1) {
				return FriendedPlayer.getItemDefinition(var3).method811(1);
			}
		}

		Model var6 = (Model) aClass106_1607.method427((long) (this.anInt1609 * 1548676283));
		if (var6 != null) {
			return var6;
		} else {
			Entity_Sub1 var5 = Entity_Sub1.method887(Class49.aClass87_516, this.anInt1630 * 908818241, 0);
			if (var5 == null) {
				return null;
			} else {
				if (-1690965437 * this.anInt1615 != 128 || -128875985 * this.anInt1635 != 128
						|| -1842417525 * this.anInt1636 != 128) {
					var5.method898(-1690965437 * this.anInt1615, this.anInt1635 * -128875985,
							-1842417525 * this.anInt1636);
				}

				int var4;
				if (this.colors != null) {
					for (var4 = 0; var4 < this.colors.length; ++var4) {
						var5.method895(this.colors[var4], this.modifiedColors[var4]);
					}
				}

				if (this.aShortArray1611 != null) {
					for (var4 = 0; var4 < this.aShortArray1611.length; ++var4) {
						var5.method896(this.aShortArray1611[var4], this.aShortArray1610[var4]);
					}
				}

				var6 = var5.method902(-1058514191 * this.anInt1617 + 64, 768 + this.anInt1638 * 1955247405, -50, -10,
						-50);
				var6.allowClickBounds = true;
				aClass106_1607.method428(var6, (long) (this.anInt1609 * 1548676283));
				return var6;
			}
		}
	}

	public ItemDefinition method812(int var1) {
		if (this.anIntArray1631 != null && var1 > 1) {
			int var3 = -1;

			for (int var2 = 0; var2 < 10; ++var2) {
				if (var1 >= this.anIntArray1632[var2] && this.anIntArray1632[var2] != 0) {
					var3 = this.anIntArray1631[var2];
				}
			}

			if (var3 != -1) {
				return FriendedPlayer.getItemDefinition(var3);
			}
		}

		return this;
	}

	public final boolean method813(boolean var1) {
		int var2 = -821171859 * this.anInt1641;
		int var3 = -1921075131 * this.anInt1608;
		int var4 = -649106615 * this.anInt1626;
		if (var1) {
			var2 = 1114049831 * this.anInt1605;
			var3 = -792495881 * this.anInt1614;
			var4 = -316692799 * this.anInt1627;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!Class49.aClass87_516.method388(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !Class49.aClass87_516.method388(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !Class49.aClass87_516.method388(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final Entity_Sub1 method814(boolean var1) {
		int var2 = -821171859 * this.anInt1641;
		int var5 = -1921075131 * this.anInt1608;
		int var4 = this.anInt1626 * -649106615;
		if (var1) {
			var2 = 1114049831 * this.anInt1605;
			var5 = -792495881 * this.anInt1614;
			var4 = -316692799 * this.anInt1627;
		}

		if (var2 == -1) {
			return null;
		} else {
			Entity_Sub1 var6 = Entity_Sub1.method887(Class49.aClass87_516, var2, 0);
			if (var5 != -1) {
				Entity_Sub1 var3 = Entity_Sub1.method887(Class49.aClass87_516, var5, 0);
				if (var4 != -1) {
					Entity_Sub1 var7 = Entity_Sub1.method887(Class49.aClass87_516, var4, 0);
					Entity_Sub1[] var8 = new Entity_Sub1[] { var6, var3, var7 };
					var6 = new Entity_Sub1(var8, 3);
				} else {
					Entity_Sub1[] var10 = new Entity_Sub1[] { var6, var3 };
					var6 = new Entity_Sub1(var10, 2);
				}
			}

			if (!var1 && this.anInt1623 * 287819475 != 0) {
				var6.method894(0, this.anInt1623 * 287819475, 0);
			}

			if (var1 && this.anInt1625 * 130573621 != 0) {
				var6.method894(0, 130573621 * this.anInt1625, 0);
			}

			int var9;
			if (this.colors != null) {
				for (var9 = 0; var9 < this.colors.length; ++var9) {
					var6.method895(this.colors[var9], this.modifiedColors[var9]);
				}
			}

			if (this.aShortArray1611 != null) {
				for (var9 = 0; var9 < this.aShortArray1611.length; ++var9) {
					var6.method896(this.aShortArray1611[var9], this.aShortArray1610[var9]);
				}
			}

			return var6;
		}
	}

	public final boolean method815(boolean var1) {
		int var2 = -1745101833 * this.anInt1628;
		int var4 = 737513797 * this.anInt1629;
		if (var1) {
			var2 = 1382121007 * this.anInt1643;
			var4 = 1943979269 * this.anInt1621;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var3 = true;
			if (!Class49.aClass87_516.method388(var2, 0)) {
				var3 = false;
			}

			if (var4 != -1 && !Class49.aClass87_516.method388(var4, 0)) {
				var3 = false;
			}

			return var3;
		}
	}

	void method816(ItemDefinition var1, ItemDefinition var2) {
		this.anInt1630 = var1.anInt1630 * 1;
		this.anInt1637 = var1.anInt1637 * 1;
		this.anInt1612 = var1.anInt1612 * 1;
		this.anInt1613 = 1 * var1.anInt1613;
		this.anInt1634 = 1 * var1.anInt1634;
		this.anInt1642 = var1.anInt1642 * 1;
		this.anInt1616 = var1.anInt1616 * 1;
		this.colors = var2.colors;
		this.modifiedColors = var2.modifiedColors;
		this.aShortArray1611 = var2.aShortArray1611;
		this.aShortArray1610 = var2.aShortArray1610;
		this.name = var2.name;
		this.aBool1618 = var2.aBool1618;
		this.stackable = 1 * var2.stackable;
		this.anInt1641 = 1 * var2.anInt1641;
		this.anInt1608 = var2.anInt1608 * 1;
		this.anInt1626 = var2.anInt1626 * 1;
		this.anInt1605 = var2.anInt1605 * 1;
		this.anInt1614 = 1 * var2.anInt1614;
		this.anInt1627 = var2.anInt1627 * 1;
		this.anInt1628 = 1 * var2.anInt1628;
		this.anInt1629 = var2.anInt1629 * 1;
		this.anInt1643 = 1 * var2.anInt1643;
		this.anInt1621 = 1 * var2.anInt1621;
		this.anInt1639 = 1 * var2.anInt1639;
		this.groundActions = var2.groundActions;
		this.actions = new String[5];
		if (var2.actions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.actions[var3] = var2.actions[var3];
			}
		}

		this.actions[4] = GameStrings.aString966;
		this.storeValue = 0;
	}

	void method817(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.anInt1630 = var1.getUShort() * -674424639;
		} else if (var2 == 2) {
			this.name = var1.getString();
		} else if (var2 == 4) {
			this.anInt1637 = var1.getUShort() * -1306150139;
		} else if (var2 == 5) {
			this.anInt1612 = var1.getUShort() * 135687661;
		} else if (var2 == 6) {
			this.anInt1613 = var1.getUShort() * -463941183;
		} else if (var2 == 7) {
			this.anInt1642 = var1.getUShort() * -1139144573;
			if (this.anInt1642 * 2086962731 > 32767) {
				this.anInt1642 -= 142802944;
			}
		} else if (var2 == 8) {
			this.anInt1616 = var1.getUShort() * 2111045293;
			if (-2057824987 * this.anInt1616 > 32767) {
				this.anInt1616 -= -22216704;
			}
		} else if (var2 == 11) {
			this.stackable = 1721830175;
		} else if (var2 == 12) {
			this.storeValue = var1.getInt() * 1382601623;
		} else if (var2 == 16) {
			this.aBool1618 = true;
		} else if (var2 == 23) {
			this.anInt1641 = var1.getUShort() * 1910868069;
			this.anInt1623 = var1.getUByte() * -1037794981;
		} else if (var2 == 24) {
			this.anInt1608 = var1.getUShort() * -836789619;
		} else if (var2 == 25) {
			this.anInt1605 = var1.getUShort() * -1561226601;
			this.anInt1625 = var1.getUByte() * -908557027;
		} else if (var2 == 26) {
			this.anInt1614 = var1.getUShort() * -1814771513;
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.getString();
			if (this.groundActions[var2 - 30].equalsIgnoreCase(GameStrings.aString845)) {
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

				for (var3 = 0; var3 < var4; ++var3) {
					this.colors[var3] = (short) var1.getUShort();
					this.modifiedColors[var3] = (short) var1.getUShort();
				}
			} else if (var2 == 41) {
				var4 = var1.getUByte();
				this.aShortArray1611 = new short[var4];
				this.aShortArray1610 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					this.aShortArray1611[var3] = (short) var1.getUShort();
					this.aShortArray1610[var3] = (short) var1.getUShort();
				}
			} else if (var2 == 65) {
				this.aBool1624 = true;
			} else if (var2 == 78) {
				this.anInt1626 = var1.getUShort() * -1629128967;
			} else if (var2 == 79) {
				this.anInt1627 = var1.getUShort() * -1586370239;
			} else if (var2 == 90) {
				this.anInt1628 = var1.getUShort() * -1668721209;
			} else if (var2 == 91) {
				this.anInt1643 = var1.getUShort() * 327059663;
			} else if (var2 == 92) {
				this.anInt1629 = var1.getUShort() * 304503181;
			} else if (var2 == 93) {
				this.anInt1621 = var1.getUShort() * 228605901;
			} else if (var2 == 95) {
				this.anInt1634 = var1.getUShort() * -375066123;
			} else if (var2 == 97) {
				this.anInt1640 = var1.getUShort() * 133297667;
			} else if (var2 == 98) {
				this.anInt1633 = var1.getUShort() * -1767449801;
			} else if (var2 >= 100 && var2 < 110) {
				if (this.anIntArray1631 == null) {
					this.anIntArray1631 = new int[10];
					this.anIntArray1632 = new int[10];
				}

				this.anIntArray1631[var2 - 100] = var1.getUShort();
				this.anIntArray1632[var2 - 100] = var1.getUShort();
			} else if (var2 == 110) {
				this.anInt1615 = var1.getUShort() * 1611805291;
			} else if (var2 == 111) {
				this.anInt1635 = var1.getUShort() * 1478558927;
			} else if (var2 == 112) {
				this.anInt1636 = var1.getUShort() * -446826717;
			} else if (var2 == 113) {
				this.anInt1617 = var1.getByte() * -262842863;
			} else if (var2 == 114) {
				this.anInt1638 = var1.getByte() * 886041913;
			} else if (var2 == 115) {
				this.anInt1639 = var1.getUByte() * -1632397881;
			} else if (var2 == 139) {
				this.unnotedId = var1.getUShort() * 922585677;
			} else if (var2 == 140) {
				this.notedId = var1.getUShort() * 1087213371;
			}
		}

	}

	ItemDefinition() {
		this.groundActions = new String[] { null, null, GameStrings.aString1084, null, null };
		this.actions = new String[] { null, null, null, null, GameStrings.aString844 };
		this.anInt1641 = -1910868069;
		this.anInt1608 = 836789619;
		this.anInt1623 = 0;
		this.anInt1605 = 1561226601;
		this.anInt1614 = 1814771513;
		this.anInt1625 = 0;
		this.anInt1626 = 1629128967;
		this.anInt1627 = 1586370239;
		this.anInt1628 = 1668721209;
		this.anInt1629 = -304503181;
		this.anInt1643 = -327059663;
		this.anInt1621 = -228605901;
		this.anInt1640 = -133297667;
		this.anInt1633 = 1767449801;
		this.anInt1615 = 152647040;
		this.anInt1635 = 276981632;
		this.anInt1636 = -1359244928;
		this.anInt1617 = 0;
		this.anInt1638 = 0;
		this.anInt1639 = 0;
		this.aBool1624 = false;
		this.unnotedId = -922585677;
		this.notedId = -1087213371;
	}

	public final Entity_Sub1 method818(boolean var1) {
		int var2 = -1745101833 * this.anInt1628;
		int var4 = this.anInt1629 * 737513797;
		if (var1) {
			var2 = 1382121007 * this.anInt1643;
			var4 = 1943979269 * this.anInt1621;
		}

		if (var2 == -1) {
			return null;
		} else {
			Entity_Sub1 var5 = Entity_Sub1.method887(Class49.aClass87_516, var2, 0);
			if (var4 != -1) {
				Entity_Sub1 var3 = Entity_Sub1.method887(Class49.aClass87_516, var4, 0);
				Entity_Sub1[] var6 = new Entity_Sub1[] { var5, var3 };
				var5 = new Entity_Sub1(var6, 2);
			}

			int var7;
			if (this.colors != null) {
				for (var7 = 0; var7 < this.colors.length; ++var7) {
					var5.method895(this.colors[var7], this.modifiedColors[var7]);
				}
			}

			if (this.aShortArray1611 != null) {
				for (var7 = 0; var7 < this.aShortArray1611.length; ++var7) {
					var5.method896(this.aShortArray1611[var7], this.aShortArray1610[var7]);
				}
			}

			return var5;
		}
	}

	void method819(ItemDefinition var1, ItemDefinition var2) {
		this.anInt1630 = var1.anInt1630 * 1;
		this.anInt1637 = var1.anInt1637 * 1;
		this.anInt1612 = var1.anInt1612 * 1;
		this.anInt1613 = 1 * var1.anInt1613;
		this.anInt1634 = var1.anInt1634 * 1;
		this.anInt1642 = var1.anInt1642 * 1;
		this.anInt1616 = var1.anInt1616 * 1;
		this.colors = var1.colors;
		this.modifiedColors = var1.modifiedColors;
		this.aShortArray1611 = var1.aShortArray1611;
		this.aShortArray1610 = var1.aShortArray1610;
		this.name = var2.name;
		this.aBool1618 = var2.aBool1618;
		this.storeValue = var2.storeValue * 1;
		this.stackable = 1721830175;
	}

	static void method820(int var0, int var1, int var2, int var3) {
		ItemTable var4 = (ItemTable) ItemTable.itemTables.get((long) var0);
		if (var4 == null) {
			var4 = new ItemTable();
			ItemTable.itemTables.put(var4, (long) var0);
		}

		if (var4.anIntArray1428.length <= var1) {
			int[] var7 = new int[1 + var1];
			int[] var5 = new int[var1 + 1];

			int var6;
			for (var6 = 0; var6 < var4.anIntArray1428.length; ++var6) {
				var7[var6] = var4.anIntArray1428[var6];
				var5[var6] = var4.quantities[var6];
			}

			for (var6 = var4.anIntArray1428.length; var6 < var1; ++var6) {
				var7[var6] = -1;
				var5[var6] = 0;
			}

			var4.anIntArray1428 = var7;
			var4.quantities = var5;
		}

		var4.anIntArray1428[var1] = var2;
		var4.quantities[var1] = var3;
	}

	static Class24 method821() {
		CacheFileAccessor var0 = null;
		Class24 var1 = new Class24();

		try {
			var0 = BoundaryStub.method154("", Client.aClass77_2091.aString646, false);
			byte[] var2 = new byte[(int) var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new Class24(new ByteBuf(var2));
		} catch (Exception var6) {
			;
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
			;
		}

		return var1;
	}
}
