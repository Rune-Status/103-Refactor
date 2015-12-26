import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class SpotAnimType extends DualNode {

	public static AbstractIndex aClass87_1440;
	public int anInt1441 = 1973532945;
	static Class106 aClass106_1442 = new Class106(30);
	int id;
	int anInt1444;
	static Class106 spotanims = new Class106(64);
	static Widget aWidget1446;
	int anInt1447 = 0;
	short[] aShortArray1448;
	short[] aShortArray1449;
	int anInt1450 = 2071703936;
	short[] aShortArray1451;
	int anInt1452 = 0;
	int anInt1453 = 0;
	short[] aShortArray1454;
	int anInt1455 = -1396281216;
	public static AbstractIndex anim_ref;

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method657(var1, var2);
		}
	}

	public final Model method656(int var1) {
		Model var2 = (Model) aClass106_1442.get((long) (this.id * 189082171));
		if (var2 == null) {
			Entity_Sub1 var3 = Entity_Sub1.method887(aClass87_1440, this.anInt1444 * 1407877429, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.aShortArray1454 != null) {
				for (var4 = 0; var4 < this.aShortArray1454.length; ++var4) {
					var3.method895(this.aShortArray1454[var4], this.aShortArray1451[var4]);
				}
			}

			if (this.aShortArray1448 != null) {
				for (var4 = 0; var4 < this.aShortArray1448.length; ++var4) {
					var3.method896(this.aShortArray1448[var4], this.aShortArray1449[var4]);
				}
			}

			var2 = var3.method902(64 + -1189221219 * this.anInt1453, 850 + 443559011 * this.anInt1447, -30, -50, -30);
			aClass106_1442.put(var2, (long) (this.id * 189082171));
		}

		Model var5;
		if (this.anInt1441 * -521951217 != -1 && var1 != -1) {
			var5 = Node_Sub6.getSequenceType(this.anInt1441 * -521951217).method677(var2, var1);
		} else {
			var5 = var2.method996(true);
		}

		if (2013938251 * this.anInt1450 != 128 || -742344927 * this.anInt1455 != 128) {
			var5.method1007(2013938251 * this.anInt1450, this.anInt1455 * -742344927, this.anInt1450 * 2013938251);
		}

		if (this.anInt1452 * -41252113 != 0) {
			if (-41252113 * this.anInt1452 == 90) {
				var5.method1013();
			}

			if (this.anInt1452 * -41252113 == 180) {
				var5.method1013();
				var5.method1013();
			}

			if (this.anInt1452 * -41252113 == 270) {
				var5.method1013();
				var5.method1013();
				var5.method1013();
			}
		}

		return var5;
	}

	void method657(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.anInt1444 = var1.getUShort() * -2057139939;
		} else if (var2 == 2) {
			this.anInt1441 = var1.getUShort() * -1973532945;
		} else if (var2 == 4) {
			this.anInt1450 = var1.getUShort() * -1359546525;
		} else if (var2 == 5) {
			this.anInt1455 = var1.getUShort() * 895061217;
		} else if (var2 != 6) {
			if (var2 == 7) {
				this.anInt1453 = var1.getUByte() * 59767221;
			} else if (var2 == 8) {
				this.anInt1447 = var1.getUByte() * 1217115467;
			} else {
				int var3;
				int var4;
				if (var2 == 40) {
					var4 = var1.getUByte();
					this.aShortArray1454 = new short[var4];
					this.aShortArray1451 = new short[var4];

					for (var3 = 0; var3 < var4; ++var3) {
						this.aShortArray1454[var3] = (short) var1.getUShort();
						this.aShortArray1451[var3] = (short) var1.getUShort();
					}
				} else if (var2 == 41) {
					var4 = var1.getUByte();
					this.aShortArray1448 = new short[var4];
					this.aShortArray1449 = new short[var4];

					for (var3 = 0; var3 < var4; ++var3) {
						this.aShortArray1448[var3] = (short) var1.getUShort();
						this.aShortArray1449[var3] = (short) var1.getUShort();
					}
				}
			}
		} else {
			this.anInt1452 = var1.getUShort() * 1160504335;
		}

	}

	static void method658(int var0, String var1, String var2, String var3) {
		Class5 var4 = (Class5) Class32.aMap359.get(Integer.valueOf(var0));
		if (var4 == null) {
			var4 = new Class5();
			Class32.aMap359.put(Integer.valueOf(var0), var4);
		}

		DualNode_Sub8 var5 = var4.method72(var0, var1, var2, var3);
		Class32.aClass107_355.method433(var5, (long) (-1699577047 * var5.anInt1516));
		Class32.aClass108_354.method435(var5);
		Client.anInt2078 = 1175697367 * Client.anInt2151;
	}

	static void method659() {
		int var0 = Client.anInt1983 * 76231581;
		int var1 = Client.anInt1978 * -225353991;
		int var2 = -1830553327 * VarClientStringType.anInt1505 - -452716157 * Class34.gameWidth - var0;
		int var3 = 2045896553 * Class21.anInt281 - 674167779 * Node_Sub9.gameHeight - var1;
		if (var0 > 0 || var2 > 0 || var1 > 0 || var3 > 0) {
			try {
				Container var4 = Client.aClient2005.method1033();
				int var5 = 0;
				int var6 = 0;
				if (var4 == VarClientType.aFrame1538) {
					Insets var7 = VarClientType.aFrame1538.getInsets();
					var5 = var7.left;
					var6 = var7.top;
				}

				Graphics var9 = var4.getGraphics();
				var9.setColor(Color.black);
				if (var0 > 0) {
					var9.fillRect(var5, var6, var0, Class21.anInt281 * 2045896553);
				}

				if (var1 > 0) {
					var9.fillRect(var5, var6, -1830553327 * VarClientStringType.anInt1505, var1);
				}

				if (var2 > 0) {
					var9.fillRect(var5 + VarClientStringType.anInt1505 * -1830553327 - var2, var6, var2,
							Class21.anInt281 * 2045896553);
				}

				if (var3 > 0) {
					var9.fillRect(var5, Class21.anInt281 * 2045896553 + var6 - var3,
							VarClientStringType.anInt1505 * -1830553327, var3);
				}
			} catch (Exception var8) {
				;
			}
		}

	}
}
