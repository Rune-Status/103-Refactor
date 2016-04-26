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

public final class ConsumingImageProducer extends AbstractProducer implements ImageProducer, ImageObserver {

	static DualNode_Sub13_Sub3_Sub1 p11_full;
	static Task aClass61_1215;
	ColorModel model;
	ImageConsumer consumer;

	public final void initializeProducer(int width, int height, Component comp) {
		this.width = width;
		this.height = height;
		this.dataArray = new int[width * height + 1];
		this.model = new DirectColorModel(32, 16711680, '\uff00', 255);
		this.image = comp.createImage(this);
		this.imageComplete();
		comp.prepareImage(this.image, this);
		this.imageComplete();
		comp.prepareImage(this.image, this);
		this.imageComplete();
		comp.prepareImage(this.image, this);
		this.setRaster();
	}

	public final void drawImage(Graphics g, int x, int y) {
		this.imageComplete();
		g.drawImage(this.image, x, y, this);
	}

	public final void drawImageClip(Graphics g, int x, int y, int width, int height) {
		this.imageComplete(x, y, width, height);
		Shape shape = g.getClip();
		g.clipRect(x, y, width, height);
		g.drawImage(this.image, 0, 0, this);
		g.setClip(shape);
	}

	public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		return true;
	}

	public synchronized boolean isConsumer(ImageConsumer var1) {
		return this.consumer == var1;
	}

	public synchronized void removeConsumer(ImageConsumer var1) {
		if (this.consumer == var1) {
			this.consumer = null;
		}

	}

	public void startProduction(ImageConsumer var1) {
		this.addConsumer(var1);
	}

	public void requestTopDownLeftRightResend(ImageConsumer var1) {
	}

	synchronized void imageComplete() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, this.width, this.height, this.model, this.dataArray, 0, this.width);
			this.consumer.imageComplete(2);
		}

	}

	synchronized void imageComplete(int x, int y, int width, int height) {
		if (this.consumer != null) {
			this.consumer.setPixels(x, y, width, height, this.model, this.dataArray, this.width * y + x, this.width);
			this.consumer.imageComplete(2);
		}

	}

	static Picture[] method510(AbstractIndex var0, int var1, int var2) {
		if (!Class35.decodeSprite(var0, var1, var2)) {
			return null;
		} else {
			Picture[] var7 = new Picture[Class7.size];

			for (int var6 = 0; var6 < Class7.size; var6++) {
				Picture var5 = var7[var6] = new Picture();
				var5.width = Class7.width;
				var5.height = Class7.height;
				var5.offsetX = Class7.offsetsX[var6];
				var5.offsetY = VarPlayerType.offsetsY[var6];
				var5.subWidth = Class7.subWidths[var6];
				var5.subHeight = Class7.subHeights[var6];
				int var4 = var5.subHeight * var5.subWidth;
				byte[] var8 = Npc.spritePixels[var6];
				var5.pixels = new int[var4];

				for (int var3 = 0; var3 < var4; var3++) {
					var5.pixels[var3] = Class85.palette[var8[var3] & 0xff];
				}
			}

			Class65.resetSprite();
			return var7;
		}
	}

	public synchronized void addConsumer(ImageConsumer consumer) {
		this.consumer = consumer;
		consumer.setDimensions(this.width, this.height);
		consumer.setProperties((Hashtable) null);
		consumer.setColorModel(this.model);
		consumer.setHints(14);
	}

	public static IdentKitType getIdentKitType(int id) {
		IdentKitType type = (IdentKitType) IdentKitType.identKits.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = IdentKitType.identKit_ref.getFile(3, id);
			type = new IdentKitType();
			if (bytes != null) {
				type.decode(new ByteBuf(bytes));
			}

			IdentKitType.identKits.put(type, (long) id);
			return type;
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

		while (true) {
			label241: while (true) {
				int var18;
				int var19;
				int var15;
				int var16;
				int var17;
				int var12;
				do {
					do {
						do {
							label218: do {
								if (var20 == var13) {
									Class58.anInt545 = var5;
									Class48_Sub1.anInt1298 = var11;
									return false;
								}

								var5 = Class58.anIntArray544[var13];
								var11 = Class58.anIntArray547[var13];
								var13 = var13 + 1 & 0xfff;
								var18 = var5 - var8;
								var19 = var11 - var9;
								var15 = var5 - var4.anInt505;
								var16 = var11 - var4.anInt506;
								if (var3.method245(var2, var5, var11, var4, -2034765952)) {
									Class58.anInt545 = var5;
									Class48_Sub1.anInt1298 = var11;
									return true;
								}

								var17 = Class58.anIntArrayArray546[var18][var19] + 1;
								if (var18 > 0 && Class58.anIntArrayArray543[var18 - 1][var19] == 0
										&& (var14[var15 - 1][var16] & 0x124010e) == 0
										&& (var14[var15 - 1][var16 + var2 - 1] & 0x1240138) == 0) {
									var12 = 1;

									while (true) {
										if (var12 >= var2 - 1) {
											Class58.anIntArray544[var20] = var5 - 1;
											Class58.anIntArray547[var20] = var11;
											var20 = var20 + 1 & 0xfff;
											Class58.anIntArrayArray543[var18 - 1][var19] = 2;
											Class58.anIntArrayArray546[var18 - 1][var19] = var17;
											break;
										}

										if ((var14[var15 - 1][var16 + var12] & 0x124013e) != 0) {
											break;
										}

										++var12;
									}
								}

								if (var18 < 128 - var2 && Class58.anIntArrayArray543[var18 + 1][var19] == 0
										&& (var14[var2 + var15][var16] & 0x1240183) == 0
										&& (var14[var15 + var2][var16 + var2 - 1] & 0x12401e0) == 0) {
									var12 = 1;

									while (true) {
										if (var12 >= var2 - 1) {
											Class58.anIntArray544[var20] = var5 + 1;
											Class58.anIntArray547[var20] = var11;
											var20 = var20 + 1 & 0xfff;
											Class58.anIntArrayArray543[var18 + 1][var19] = 8;
											Class58.anIntArrayArray546[var18 + 1][var19] = var17;
											break;
										}

										if ((var14[var15 + var2][var12 + var16] & 0x12401e3) != 0) {
											break;
										}

										++var12;
									}
								}

								if (var19 > 0 && Class58.anIntArrayArray543[var18][var19 - 1] == 0
										&& (var14[var15][var16 - 1] & 0x124010e) == 0
										&& (var14[var15 + var2 - 1][var16 - 1] & 0x1240183) == 0) {
									var12 = 1;

									while (true) {
										if (var12 >= var2 - 1) {
											Class58.anIntArray544[var20] = var5;
											Class58.anIntArray547[var20] = var11 - 1;
											var20 = var20 + 1 & 0xfff;
											Class58.anIntArrayArray543[var18][var19 - 1] = 1;
											Class58.anIntArrayArray546[var18][var19 - 1] = var17;
											break;
										}

										if ((var14[var15 + var12][var16 - 1] & 0x124018f) != 0) {
											break;
										}

										++var12;
									}
								}

								if (var19 < 128 - var2 && Class58.anIntArrayArray543[var18][var19 + 1] == 0
										&& (var14[var15][var2 + var16] & 0x1240138) == 0
										&& (var14[var15 + var2 - 1][var16 + var2] & 0x12401e0) == 0) {
									var12 = 1;

									while (true) {
										if (var12 >= var2 - 1) {
											Class58.anIntArray544[var20] = var5;
											Class58.anIntArray547[var20] = var11 + 1;
											var20 = var20 + 1 & 0xfff;
											Class58.anIntArrayArray543[var18][var19 + 1] = 4;
											Class58.anIntArrayArray546[var18][var19 + 1] = var17;
											break;
										}

										if ((var14[var15 + var12][var16 + var2] & 0x12401f8) != 0) {
											break;
										}

										++var12;
									}
								}

								if (var18 > 0 && var19 > 0 && Class58.anIntArrayArray543[var18 - 1][var19 - 1] == 0
										&& (var14[var15 - 1][var16 - 1] & 0x124010e) == 0) {
									var12 = 1;

									while (true) {
										if (var12 >= var2) {
											Class58.anIntArray544[var20] = var5 - 1;
											Class58.anIntArray547[var20] = var11 - 1;
											var20 = var20 + 1 & 0xfff;
											Class58.anIntArrayArray543[var18 - 1][var19 - 1] = 3;
											Class58.anIntArrayArray546[var18 - 1][var19 - 1] = var17;
											break;
										}

										if ((var14[var15 - 1][var16 - 1 + var12] & 0x124013e) != 0
												|| (var14[var15 - 1 + var12][var16 - 1] & 0x124018f) != 0) {
											break;
										}

										++var12;
									}
								}

								if (var18 < 128 - var2 && var19 > 0
										&& Class58.anIntArrayArray543[var18 + 1][var19 - 1] == 0
										&& (var14[var15 + var2][var16 - 1] & 0x1240183) == 0) {
									var12 = 1;

									while (true) {
										if (var12 >= var2) {
											Class58.anIntArray544[var20] = var5 + 1;
											Class58.anIntArray547[var20] = var11 - 1;
											var20 = var20 + 1 & 0xfff;
											Class58.anIntArrayArray543[var18 + 1][var19 - 1] = 9;
											Class58.anIntArrayArray546[var18 + 1][var19 - 1] = var17;
											break;
										}

										if ((var14[var2 + var15][var16 - 1 + var12] & 0x12401e3) != 0
												|| (var14[var12 + var15][var16 - 1] & 0x124018f) != 0) {
											break;
										}

										++var12;
									}
								}

								if (var18 > 0 && var19 < 128 - var2
										&& Class58.anIntArrayArray543[var18 - 1][var19 + 1] == 0
										&& (var14[var15 - 1][var16 + var2] & 0x1240138) == 0) {
									for (var12 = 1; var12 < var2; var12++) {
										if ((var14[var15 - 1][var16 + var12] & 0x124013e) != 0
												|| (var14[var15 - 1 + var12][var16 + var2] & 0x12401f8) != 0) {
											continue label218;
										}
									}

									Class58.anIntArray544[var20] = var5 - 1;
									Class58.anIntArray547[var20] = var11 + 1;
									var20 = var20 + 1 & 0xfff;
									Class58.anIntArrayArray543[var18 - 1][var19 + 1] = 6;
									Class58.anIntArrayArray546[var18 - 1][var19 + 1] = var17;
								}
							} while (var18 >= 128 - var2);
						} while (var19 >= 128 - var2);
					} while (Class58.anIntArrayArray543[var18 + 1][var19 + 1] != 0);
				} while ((var14[var2 + var15][var16 + var2] & 0x12401e0) != 0);

				for (var12 = 1; var12 < var2; var12++) {
					if ((var14[var15 + var12][var2 + var16] & 0x12401f8) != 0
							|| (var14[var15 + var2][var12 + var16] & 0x12401e3) != 0) {
						continue label241;
					}
				}

				Class58.anIntArray544[var20] = var5 + 1;
				Class58.anIntArray547[var20] = var11 + 1;
				var20 = var20 + 1 & 0xfff;
				Class58.anIntArrayArray543[var18 + 1][var19 + 1] = 12;
				Class58.anIntArrayArray546[var18 + 1][var19 + 1] = var17;
			}
		}
	}

	static final void method513(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				Class39.tileHeights[var0][var3 + var1][var2 + var4] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; var3++) {
				Class39.tileHeights[var0][var1][var3 + var2] = Class39.tileHeights[var0][var1 - 1][var2 + var3];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; var3++) {
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
