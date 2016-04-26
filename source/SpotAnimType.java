import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class SpotAnimType extends DualNode {

	public static AbstractIndex aClass87_1440;
	int id;
	static Widget aWidget1446;
	public static AbstractIndex anim_ref;
	public int anInt1441 = -1;
	int anInt1447 = 0;
	int anInt1450 = 128;
	int anInt1452 = 0;
	int anInt1453 = 0;
	int anInt1455 = 128;
	int anInt1444;
	short[] aShortArray1454;
	short[] aShortArray1451;
	short[] aShortArray1448;
	short[] aShortArray1449;
	static NodeMap aClass106_1442 = new NodeMap(30);
	static NodeMap spotanims = new NodeMap(64);

	void decode(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method657(var1, var2);
		}
	}

	public final Rasterizer method656(int var1) {
		Rasterizer var2 = (Rasterizer) aClass106_1442.get((long) this.id);
		if (var2 == null) {
			Model var5 = Model.method887(aClass87_1440, this.anInt1444, 0);
			if (var5 == null) {
				return null;
			}

			int var4;
			if (this.aShortArray1454 != null) {
				for (var4 = 0; var4 < this.aShortArray1454.length; var4++) {
					var5.method895(this.aShortArray1454[var4], this.aShortArray1451[var4]);
				}
			}

			if (this.aShortArray1448 != null) {
				for (var4 = 0; var4 < this.aShortArray1448.length; var4++) {
					var5.method896(this.aShortArray1448[var4], this.aShortArray1449[var4]);
				}
			}

			var2 = var5.method902(this.anInt1453 + 64, this.anInt1447 + 850, -30, -50, -30);
			aClass106_1442.put(var2, (long) this.id);
		}

		Rasterizer var51;
		if (this.anInt1441 != -1 && var1 != -1) {
			var51 = Node_Sub6.getSequenceType(this.anInt1441).method677(var2, var1);
		} else {
			var51 = var2.method996(true);
		}

		if (this.anInt1450 != 128 || this.anInt1455 != 128) {
			var51.method1007(this.anInt1450, this.anInt1455, this.anInt1450);
		}

		if (this.anInt1452 != 0) {
			if (this.anInt1452 == 90) {
				var51.method1013();
			}

			if (this.anInt1452 == 180) {
				var51.method1013();
				var51.method1013();
			}

			if (this.anInt1452 == 270) {
				var51.method1013();
				var51.method1013();
				var51.method1013();
			}
		}

		return var51;
	}

	void method657(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.anInt1444 = var1.getUShort();
		} else if (var2 == 2) {
			this.anInt1441 = var1.getUShort();
		} else if (var2 == 4) {
			this.anInt1450 = var1.getUShort();
		} else if (var2 == 5) {
			this.anInt1455 = var1.getUShort();
		} else if (var2 != 6) {
			if (var2 == 7) {
				this.anInt1453 = var1.getUByte();
			} else if (var2 == 8) {
				this.anInt1447 = var1.getUByte();
			} else {
				int var3;
				int var4;
				if (var2 == 40) {
					var4 = var1.getUByte();
					this.aShortArray1454 = new short[var4];
					this.aShortArray1451 = new short[var4];

					for (var3 = 0; var3 < var4; var3++) {
						this.aShortArray1454[var3] = (short) var1.getUShort();
						this.aShortArray1451[var3] = (short) var1.getUShort();
					}
				} else if (var2 == 41) {
					var4 = var1.getUByte();
					this.aShortArray1448 = new short[var4];
					this.aShortArray1449 = new short[var4];

					for (var3 = 0; var3 < var4; var3++) {
						this.aShortArray1448[var3] = (short) var1.getUShort();
						this.aShortArray1449[var3] = (short) var1.getUShort();
					}
				}
			}
		} else {
			this.anInt1452 = var1.getUShort();
		}

	}

	static void method658(int var0, String var1, String var2, String var3) {
		Class5 var4 = (Class5) Class32.aMap359.get(Integer.valueOf(var0));
		if (var4 == null) {
			var4 = new Class5();
			Class32.aMap359.put(Integer.valueOf(var0), var4);
		}

		DualNode_Sub8 var5 = var4.method72(var0, var1, var2, var3);
		Class32.aClass107_355.method433(var5, (long) var5.anInt1516);
		Class32.aClass108_354.method435(var5);
		Client.anInt2078 = Client.anInt2151;
	}

	static void method659() {
		int var0 = Client.anInt1983;
		int var1 = Client.anInt1978;
		int var2 = VarClientStringType.anInt1505 - Class34.gameWidth - var0;
		int var3 = Class21.anInt281 - Node_Sub9.gameHeight - var1;
		if (var0 > 0 || var2 > 0 || var1 > 0 || var3 > 0) {
			try {
				Container var4 = Client.clientInstance.container();
				int var5 = 0;
				int var6 = 0;
				if (VarClientType.gameFrame == var4) {
					Insets var9 = VarClientType.gameFrame.getInsets();
					var5 = var9.left;
					var6 = var9.top;
				}

				Graphics var91 = var4.getGraphics();
				var91.setColor(Color.black);
				if (var0 > 0) {
					var91.fillRect(var5, var6, var0, Class21.anInt281);
				}

				if (var1 > 0) {
					var91.fillRect(var5, var6, VarClientStringType.anInt1505, var1);
				}

				if (var2 > 0) {
					var91.fillRect(VarClientStringType.anInt1505 + var5 - var2, var6, var2, Class21.anInt281);
				}

				if (var3 > 0) {
					var91.fillRect(var5, Class21.anInt281 + var6 - var3, VarClientStringType.anInt1505, var3);
				}
			} catch (Exception var8) {
				;
			}
		}

	}

}
