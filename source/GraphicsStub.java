import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public final class GraphicsStub extends Entity {

	int anInt1809 = 0;
	int startCycle;
	int regionX;
	int regionY;
	int height;
	DualNode_Sub3 aDualNode_Sub3_1810;
	int anInt1811 = 0;
	int anInt1812;
	boolean finished = false;
	int floorLevel;
	static int anInt1813;

	static File method933(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		Class75.aFile632 = new File(BitBuf.aString1729, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		ByteBuf var8;
		File var20;
		if (Class75.aFile632.exists()) {
			try {
				Class126 var7 = new Class126(Class75.aFile632, "rw", 10000L);

				int var9;
				for (var8 = new ByteBuf((int) var7.method458()); 314639891
						* var8.position < var8.payload.length; var8.position += -184175589 * var9) {
					var9 = var7.method457(var8.payload, var8.position * 314639891,
							var8.payload.length - var8.position * 314639891);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.position = 0;
				var9 = var8.getUByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.getUByte();
				}

				if (var9 <= 2) {
					var4 = var8.method645();
					if (var10 == 1) {
						var5 = var8.method645();
					}
				} else {
					var4 = var8.getJagString();
					if (var10 == 1) {
						var5 = var8.getJagString();
					}
				}

				var7.method459();
			} catch (IOException var17) {
				var17.printStackTrace();
			}

			if (var4 != null) {
				var20 = new File(var4);
				if (!var20.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var20 = new File(var4, "test.dat");
				if (!Class87.method393(var20, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label113: for (int var18 = 0; var18 < Class67.aStringArray584.length; ++var18) {
				for (int var21 = 0; var21 < BoundaryDecorationStub.aStringArray217.length; ++var21) {
					File var22 = new File(BoundaryDecorationStub.aStringArray217[var21] + Class67.aStringArray584[var18]
							+ File.separatorChar + var0 + File.separatorChar);
					if (var22.exists() && Class87.method393(new File(var22, "test.dat"), true)) {
						var4 = var22.toString();
						var6 = true;
						break label113;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = BitBuf.aString1729 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0
					+ File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var19;
		if (var5 != null) {
			var19 = new File(var5);
			var20 = new File(var4);

			try {
				File[] var23 = var19.listFiles();
				File[] var25 = var23;

				for (int var11 = 0; var11 < var25.length; ++var11) {
					File var12 = var25[var11];
					File var13 = new File(var20, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var16) {
				var16.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var19 = new File(var4);
			var8 = null;

			try {
				Class126 var24 = new Class126(Class75.aFile632, "rw", 10000L);
				ByteBuf var26 = new ByteBuf(500);
				var26.putByte(3);
				var26.putByte(var8 != null ? 1 : 0);
				var26.putCESU8(var19.getPath());
				var24.method460(var26.payload, 0, var26.position * 314639891);
				var24.method459();
			} catch (IOException var15) {
				var15.printStackTrace();
			}
		}

		return new File(var4);
	}

	protected final Model method654(byte var1) {
		DualNode_Sub1 var2 = Class96_Sub1.method499(1099063177 * this.anInt1812, (byte) 1);
		Model var3;
		if (!this.finished) {
			var3 = var2.method656(this.anInt1811 * 155883933);
		} else {
			var3 = var2.method656(-1);
		}

		return var3 == null ? null : var3;
	}

	final void method934(int var1, byte var2) {
		if (!this.finished) {
			this.anInt1809 += 1739678157 * var1;

			while (this.anInt1809 * -1560120571 > this.aDualNode_Sub3_1810.anIntArray1481[this.anInt1811 * 155883933]) {
				this.anInt1809 -= 1739678157 * this.aDualNode_Sub3_1810.anIntArray1481[155883933 * this.anInt1811];
				this.anInt1811 += 982234293;
				if (155883933 * this.anInt1811 >= this.aDualNode_Sub3_1810.anIntArray1474.length) {
					this.finished = true;
					break;
				}
			}

		}
	}

	GraphicsStub(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.anInt1812 = var1 * -2055354695;
		this.floorLevel = var2 * 263160201;
		this.regionX = var3 * 1032422341;
		this.regionY = 1007615891 * var4;
		this.height = -144474123 * var5;
		this.startCycle = (var6 + var7) * -1971277335;
		int var8 = Class96_Sub1.method499(1099063177 * this.anInt1812, (byte) 1).anInt1441 * -521951217;
		if (var8 != -1) {
			this.finished = false;
			this.aDualNode_Sub3_1810 = Node_Sub6.method540(var8, -922230802);
		} else {
			this.finished = true;
		}

	}

	public static void method935(Class63 var0, Object var1) {
		if (var0.anEventQueue581 != null) {
			for (int var2 = 0; var2 < 50 && var0.anEventQueue581.peekEvent() != null; ++var2) {
				Class96_Sub1.method500(1L);
			}

			if (var1 != null) {
				var0.anEventQueue581.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	public static boolean method936(int var0) {
		Node_Sub16 var1 = (Node_Sub16) Class119.aClass103_804.method420();
		return var1 != null;
	}
}
