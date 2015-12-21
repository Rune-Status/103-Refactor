import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class Class20_Sub1 extends Class20 implements ImageProducer, ImageObserver {

	ImageConsumer anImageConsumer1213;
	static DualNode_Sub13_Sub3_Sub1 aDualNode_Sub13_Sub3_Sub1_1214;
	static Class61 aClass61_1215;
	ColorModel aColorModel1216;

	public final void method145(int var1, int var2, Component var3, byte var4) {
		this.anInt270 = 409111727 * var1;
		this.anInt272 = var2 * 1577837381;
		this.anIntArray271 = new int[1 + var1 * var2];
		this.aColorModel1216 = new DirectColorModel(32, 16711680, '\uff00', 255);
		this.anImage273 = var3.createImage(this);
		this.method508();
		var3.prepareImage(this.anImage273, this);
		this.method508();
		var3.prepareImage(this.anImage273, this);
		this.method508();
		var3.prepareImage(this.anImage273, this);
		this.method142();
	}

	public final void method144(Graphics var1, int var2, int var3, int var4) {
		this.method508();
		var1.drawImage(this.anImage273, var2, var3, this);
	}

	public final void method141(Graphics var1, int var2, int var3, int var4, int var5, short var6) {
		this.method509(var2, var3, var4, var5);
		Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(this.anImage273, 0, 0, this);
		var1.setClip(var7);
	}

	public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		return true;
	}

	public synchronized boolean isConsumer(ImageConsumer var1) {
		return this.anImageConsumer1213 == var1;
	}

	public synchronized void removeConsumer(ImageConsumer var1) {
		if (var1 == this.anImageConsumer1213) {
			this.anImageConsumer1213 = null;
		}

	}

	public void startProduction(ImageConsumer var1) {
		this.addConsumer(var1);
	}

	public void requestTopDownLeftRightResend(ImageConsumer var1) {
	}

	synchronized void method508() {
		if (this.anImageConsumer1213 != null) {
			this.anImageConsumer1213.setPixels(0, 0, 1154763343 * this.anInt270, -1725941875 * this.anInt272,
					this.aColorModel1216, this.anIntArray271, 0, this.anInt270 * 1154763343);
			this.anImageConsumer1213.imageComplete(2);
		}
	}

	synchronized void method509(int var1, int var2, int var3, int var4) {
		if (this.anImageConsumer1213 != null) {
			this.anImageConsumer1213.setPixels(var1, var2, var3, var4, this.aColorModel1216, this.anIntArray271,
					this.anInt270 * 1154763343 * var2 + var1, 1154763343 * this.anInt270);
			this.anImageConsumer1213.imageComplete(2);
		}
	}

	static Sprite[] method510(Class87 var0, int var1, int var2) {
		if (!Class35.method202(var0, var1, var2)) {
			return null;
		} else {
			Sprite[] var7 = new Sprite[Class7.anInt154 * 817614505];

			for (int var6 = 0; var6 < 817614505 * Class7.anInt154; ++var6) {
				Sprite var5 = var7[var6] = new Sprite();
				var5.anInt1815 = -749860951 * Class7.anInt148;
				var5.anInt1816 = Class7.anInt155 * -1945497809;
				var5.anInt1814 = Class7.anIntArray149[var6];
				var5.anInt1817 = DualNode_Sub11.anIntArray1544[var6];
				var5.height = Class7.anIntArray150[var6];
				var5.width = Class7.anIntArray151[var6];
				int var4 = var5.width * var5.height;
				byte[] var8 = Npc.aByteArrayArray1966[var6];
				var5.pixels = new int[var4];

				for (int var3 = 0; var3 < var4; ++var3) {
					var5.pixels[var3] = Class85.anIntArray690[var8[var3] & 255];
				}
			}

			Class65.method318();
			return var7;
		}
	}

	public synchronized void addConsumer(ImageConsumer var1) {
		this.anImageConsumer1213 = var1;
		var1.setDimensions(1154763343 * this.anInt270, -1725941875 * this.anInt272);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(this.aColorModel1216);
		var1.setHints(14);
	}

	public static DualNode_Sub2 method511(int var0) {
		DualNode_Sub2 var1 = (DualNode_Sub2) DualNode_Sub2.aClass106_1458.method427((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DualNode_Sub2.aClass87_1468.method391(3, var0);
			var1 = new DualNode_Sub2();
			if (var2 != null) {
				var1.method665(new ByteBuf(var2), 2124429388);
			}

			DualNode_Sub2.aClass106_1458.method428(var1, (long) var0);
			return var1;
		}
	}

	static final boolean method512(int var0, int var1, int var2, Class48 var3, CollisionMap var4) {
		int var5 = var0;
		int var11 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		Class58.anIntArrayArray543[var6][var7] = 99;
		Class58.anIntArrayArray546[var6][var7] = 0;
		byte var10 = 0;
		int var13 = 0;
		Class58.anIntArray544[var10] = var0;
		int var20 = var10 + 1;
		Class58.anIntArray547[var10] = var1;
		int[][] var14 = var4.flags;

		label256: while (var20 != var13) {
			var5 = Class58.anIntArray544[var13];
			var11 = Class58.anIntArray547[var13];
			var13 = var13 + 1 & 4095;
			int var18 = var5 - var8;
			int var19 = var11 - var9;
			int var15 = var5 - 1676632637 * var4.anInt505;
			int var16 = var11 - var4.anInt506 * 291084413;
			if (var3.method245(var2, var5, var11, var4, -2034765952)) {
				Class58.anInt545 = -1685050181 * var5;
				Class48_Sub1.anInt1298 = -1194986937 * var11;
				return true;
			}

			int var17 = Class58.anIntArrayArray546[var18][var19] + 1;
			int var12;
			if (var18 > 0 && Class58.anIntArrayArray543[var18 - 1][var19] == 0
					&& (var14[var15 - 1][var16] & 19136782) == 0
					&& (var14[var15 - 1][var16 + var2 - 1] & 19136824) == 0) {
				var12 = 1;

				while (true) {
					if (var12 >= var2 - 1) {
						Class58.anIntArray544[var20] = var5 - 1;
						Class58.anIntArray547[var20] = var11;
						var20 = 1 + var20 & 4095;
						Class58.anIntArrayArray543[var18 - 1][var19] = 2;
						Class58.anIntArrayArray546[var18 - 1][var19] = var17;
						break;
					}

					if ((var14[var15 - 1][var16 + var12] & 19136830) != 0) {
						break;
					}

					++var12;
				}
			}

			if (var18 < 128 - var2 && Class58.anIntArrayArray543[1 + var18][var19] == 0
					&& (var14[var2 + var15][var16] & 19136899) == 0
					&& (var14[var15 + var2][var16 + var2 - 1] & 19136992) == 0) {
				var12 = 1;

				while (true) {
					if (var12 >= var2 - 1) {
						Class58.anIntArray544[var20] = 1 + var5;
						Class58.anIntArray547[var20] = var11;
						var20 = 1 + var20 & 4095;
						Class58.anIntArrayArray543[var18 + 1][var19] = 8;
						Class58.anIntArrayArray546[var18 + 1][var19] = var17;
						break;
					}

					if ((var14[var15 + var2][var12 + var16] & 19136995) != 0) {
						break;
					}

					++var12;
				}
			}

			if (var19 > 0 && Class58.anIntArrayArray543[var18][var19 - 1] == 0
					&& (var14[var15][var16 - 1] & 19136782) == 0
					&& (var14[var15 + var2 - 1][var16 - 1] & 19136899) == 0) {
				var12 = 1;

				while (true) {
					if (var12 >= var2 - 1) {
						Class58.anIntArray544[var20] = var5;
						Class58.anIntArray547[var20] = var11 - 1;
						var20 = 1 + var20 & 4095;
						Class58.anIntArrayArray543[var18][var19 - 1] = 1;
						Class58.anIntArrayArray546[var18][var19 - 1] = var17;
						break;
					}

					if ((var14[var15 + var12][var16 - 1] & 19136911) != 0) {
						break;
					}

					++var12;
				}
			}

			if (var19 < 128 - var2 && Class58.anIntArrayArray543[var18][var19 + 1] == 0
					&& (var14[var15][var2 + var16] & 19136824) == 0
					&& (var14[var15 + var2 - 1][var16 + var2] & 19136992) == 0) {
				var12 = 1;

				while (true) {
					if (var12 >= var2 - 1) {
						Class58.anIntArray544[var20] = var5;
						Class58.anIntArray547[var20] = var11 + 1;
						var20 = 1 + var20 & 4095;
						Class58.anIntArrayArray543[var18][1 + var19] = 4;
						Class58.anIntArrayArray546[var18][1 + var19] = var17;
						break;
					}

					if ((var14[var15 + var12][var16 + var2] & 19137016) != 0) {
						break;
					}

					++var12;
				}
			}

			if (var18 > 0 && var19 > 0 && Class58.anIntArrayArray543[var18 - 1][var19 - 1] == 0
					&& (var14[var15 - 1][var16 - 1] & 19136782) == 0) {
				var12 = 1;

				while (true) {
					if (var12 >= var2) {
						Class58.anIntArray544[var20] = var5 - 1;
						Class58.anIntArray547[var20] = var11 - 1;
						var20 = var20 + 1 & 4095;
						Class58.anIntArrayArray543[var18 - 1][var19 - 1] = 3;
						Class58.anIntArrayArray546[var18 - 1][var19 - 1] = var17;
						break;
					}

					if ((var14[var15 - 1][var12 + (var16 - 1)] & 19136830) != 0
							|| (var14[var15 - 1 + var12][var16 - 1] & 19136911) != 0) {
						break;
					}

					++var12;
				}
			}

			if (var18 < 128 - var2 && var19 > 0 && Class58.anIntArrayArray543[1 + var18][var19 - 1] == 0
					&& (var14[var15 + var2][var16 - 1] & 19136899) == 0) {
				var12 = 1;

				while (true) {
					if (var12 >= var2) {
						Class58.anIntArray544[var20] = var5 + 1;
						Class58.anIntArray547[var20] = var11 - 1;
						var20 = var20 + 1 & 4095;
						Class58.anIntArrayArray543[var18 + 1][var19 - 1] = 9;
						Class58.anIntArrayArray546[var18 + 1][var19 - 1] = var17;
						break;
					}

					if ((var14[var2 + var15][var16 - 1 + var12] & 19136995) != 0
							|| (var14[var12 + var15][var16 - 1] & 19136911) != 0) {
						break;
					}

					++var12;
				}
			}

			if (var18 > 0 && var19 < 128 - var2 && Class58.anIntArrayArray543[var18 - 1][var19 + 1] == 0
					&& (var14[var15 - 1][var16 + var2] & 19136824) == 0) {
				var12 = 1;

				while (true) {
					if (var12 >= var2) {
						Class58.anIntArray544[var20] = var5 - 1;
						Class58.anIntArray547[var20] = 1 + var11;
						var20 = 1 + var20 & 4095;
						Class58.anIntArrayArray543[var18 - 1][1 + var19] = 6;
						Class58.anIntArrayArray546[var18 - 1][1 + var19] = var17;
						break;
					}

					if ((var14[var15 - 1][var16 + var12] & 19136830) != 0
							|| (var14[var15 - 1 + var12][var16 + var2] & 19137016) != 0) {
						break;
					}

					++var12;
				}
			}

			if (var18 < 128 - var2 && var19 < 128 - var2 && Class58.anIntArrayArray543[var18 + 1][var19 + 1] == 0
					&& (var14[var2 + var15][var16 + var2] & 19136992) == 0) {
				for (var12 = 1; var12 < var2; ++var12) {
					if ((var14[var15 + var12][var2 + var16] & 19137016) != 0
							|| (var14[var15 + var2][var12 + var16] & 19136995) != 0) {
						continue label256;
					}
				}

				Class58.anIntArray544[var20] = var5 + 1;
				Class58.anIntArray547[var20] = 1 + var11;
				var20 = var20 + 1 & 4095;
				Class58.anIntArrayArray543[1 + var18][var19 + 1] = 12;
				Class58.anIntArrayArray546[1 + var18][1 + var19] = var17;
			}
		}

		Class58.anInt545 = var5 * -1685050181;
		Class48_Sub1.anInt1298 = var11 * -1194986937;
		return false;
	}

	static final void method513(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Class39.tileHeights[var0][var3 + var1][var2 + var4] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Class39.tileHeights[var0][var1][var3 + var2] = Class39.tileHeights[var0][var1 - 1][var2 + var3];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Class39.tileHeights[var0][var1 + var3][var2] = Class39.tileHeights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Class39.tileHeights[var0][var1 - 1][var2] != 0) {
			Class39.tileHeights[var0][var1][var2] = Class39.tileHeights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Class39.tileHeights[var0][var1][var2 - 1] != 0) {
			Class39.tileHeights[var0][var1][var2] = Class39.tileHeights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Class39.tileHeights[var0][var1 - 1][var2 - 1] != 0) {
			Class39.tileHeights[var0][var1][var2] = Class39.tileHeights[var0][var1 - 1][var2 - 1];
		}

	}
}
