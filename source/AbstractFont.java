import java.util.Random;

public abstract class AbstractFont extends Raster {

	public static IndexedSprite[] modSprites;
	int[] anIntArray1826;
	public int verticalSpace = 0;
	byte[] aByteArray1821;
	static int alpha = 256;
	static int anInt1837 = 0;
	byte[][] gylphs = new byte[256][];
	int[] horizontalOffsets;
	int[] verticalOffsets;
	int[] gylphHeights;
	int[] glyphWidths;
	int minSpacing;
	int maxSpacing;
	static int anInt1836 = 0;
	static int strikeRGB = -1;
	static int underlineRGB = -1;
	static int prevShadeRGB = -1;
	static int shadeRGB = -1;
	static int prevColorRGB = 0;
	static int colorRGB = 0;
	static Random aRandom1828 = new Random();
	static String[] aStringArray1839 = new String[100];

	public void method964(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method984(var4, var5);
			int[] var8 = new int[var1.length()];

			for (int var7 = 0; var7 < var1.length(); var7++) {
				var8[var7] = (int) (Math.sin((double) var7 / 2.0D + (double) var6 / 5.0D) * 5.0D);
			}

			this.method976(var1, var2 - this.method967(var1) / 2, var3, (int[]) null, var8);
		}

	}

	void method965(byte[] var1) {
		this.anIntArray1826 = new int[256];
		int var3;
		if (var1.length == 257) {
			for (var3 = 0; var3 < this.anIntArray1826.length; var3++) {
				this.anIntArray1826[var3] = var1[var3] & 0xff;
			}

			this.verticalSpace = var1[256] & 0xff;
		} else {
			var3 = 0;

			for (int var12 = 0; var12 < 256; var12++) {
				this.anIntArray1826[var12] = var1[var3++] & 0xff;
			}

			int[] var121 = new int[256];
			int[] var9 = new int[256];

			int var2;
			for (var2 = 0; var2 < 256; var2++) {
				var121[var2] = var1[var3++] & 0xff;
			}

			for (var2 = 0; var2 < 256; var2++) {
				var9[var2] = var1[var3++] & 0xff;
			}

			byte[][] var10 = new byte[256][];

			int var6;
			for (int var14 = 0; var14 < 256; var14++) {
				var10[var14] = new byte[var121[var14]];
				byte var11 = 0;

				for (var6 = 0; var6 < var10[var14].length; var6++) {
					var11 += var1[var3++];
					var10[var14][var6] = var11;
				}
			}

			byte[][] var131 = new byte[256][];

			int var141;
			for (var141 = 0; var141 < 256; var141++) {
				var131[var141] = new byte[var121[var141]];
				byte var13 = 0;

				for (int var7 = 0; var7 < var131[var141].length; var7++) {
					var13 += var1[var3++];
					var131[var141][var7] = var13;
				}
			}

			this.aByteArray1821 = new byte[65536];

			for (var141 = 0; var141 < 256; var141++) {
				if (var141 != 32 && var141 != 160) {
					for (var6 = 0; var6 < 256; var6++) {
						if (var6 != 32 && var6 != 160) {
							this.aByteArray1821[(var141 << 8) + var6] = (byte) method986(var10, var131, var9,
									this.anIntArray1826, var121, var141, var6);
						}
					}
				}
			}

			this.verticalSpace = var9[32] + var121[32];
		}

	}

	public void method966(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method984(var4, var5);
			aRandom1828.setSeed((long) var6);
			alpha = (aRandom1828.nextInt() & 0x1f) + 192;
			int[] var9 = new int[var1.length()];
			int var8 = 0;

			for (int var7 = 0; var7 < var1.length(); var7++) {
				var9[var7] = var8;
				if ((aRandom1828.nextInt() & 0x3) == 0) {
					++var8;
				}
			}

			this.method976(var1, var2, var3, var9, (int[]) null);
		}

	}

	public int method967(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); var5++) {
				char var6 = var1.charAt(var5);
				if (var6 == 60) {
					var2 = var5;
				} else {
					if (var6 == 62 && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = 60;
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										String var8 = var7.substring(4);
										int var9 = AnimationSkin.getInt(var8, 10, true);
										var4 += modSprites[var9].width;
										var3 = -1;
									} catch (Exception var10) {
										;
									}
								}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160) {
						var6 = 32;
					}

					if (var2 == -1) {
						var4 += this.anIntArray1826[(char) (IgnoredPlayer.method414(var6) & 0xff)];
						if (this.aByteArray1821 != null && var3 != -1) {
							var4 += this.aByteArray1821[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	int method968(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var21 = 0; var21 < var13; var21++) {
				char var15 = var1.charAt(var21);
				if (var15 == 60) {
					var10 = var21;
				} else {
					if (var15 == 62 && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var21);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += this.method981('<');
							if (this.aByteArray1821 != null && var11 != -1) {
								var4 += this.aByteArray1821[(var11 << 8) + 60];
							}

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += this.method981('>');
							if (this.aByteArray1821 != null && var11 != -1) {
								var4 += this.aByteArray1821[(var11 << 8) + 62];
							}

							var11 = 62;
						} else if (var16.startsWith("img=")) {
							try {
								String var17 = var16.substring(4);
								int var18 = AnimationSkin.getInt(var17, 10, true);
								var4 += modSprites[var18].width;
								var11 = 0;
							} catch (Exception var19) {
								;
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method981(var15);
							if (this.aByteArray1821 != null && var11 != -1) {
								var4 += this.aByteArray1821[(var11 << 8) + var15];
							}

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var20 = var6.toString();
			if (var20.length() > var5) {
				var3[var12++] = var20.substring(var5, var20.length());
			}

			return var12;
		}
	}

	public int method969(String var1, int var2) {
		int var3 = this.method968(var1, new int[] { var2 }, aStringArray1839);
		int var5 = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			int var6 = this.method967(aStringArray1839[var4]);
			if (var6 > var5) {
				var5 = var6;
			}
		}

		return var5;
	}

	public int method970(String var1, int var2) {
		return this.method968(var1, new int[] { var2 }, aStringArray1839);
	}

	public static String appendTags(String var0) {
		int var1 = var0.length();
		int var3 = 0;

		for (int var6 = 0; var6 < var1; var6++) {
			char var7 = var0.charAt(var6);
			if (var7 == 60 || var7 == 62) {
				var3 += 3;
			}
		}

		StringBuilder var61 = new StringBuilder(var1 + var3);

		for (int var71 = 0; var71 < var1; var71++) {
			char var5 = var0.charAt(var71);
			if (var5 == 60) {
				var61.append("<lt>");
			} else if (var5 == 62) {
				var61.append("<gt>");
			} else {
				var61.append(var5);
			}
		}

		return var61.toString();
	}

	public void method972(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method984(var4, var5);
			this.method975(var1, var2 - this.method967(var1), var3);
		}

	}

	public void method973(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method984(var4, var5);
			int[] var7 = new int[var1.length()];
			int[] var9 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); var8++) {
				var7[var8] = (int) (Math.sin((double) var8 / 5.0D + (double) var6 / 5.0D) * 5.0D);
				var9[var8] = (int) (Math.sin((double) var8 / 3.0D + (double) var6 / 5.0D) * 5.0D);
			}

			this.method976(var1, var2 - this.method967(var1) / 2, var3, var7, var9);
		}

	}

	public void method974(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			this.method984(var4, var5);
			double var8 = 7.0D - (double) var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); var11++) {
				var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) var6 / 1.0D) * var8);
			}

			this.method976(var1, var2 - this.method967(var1) / 2, var3, (int[]) null, var10);
		}

	}

	void method975(String var1, int var2, int var3) {
		var3 -= this.verticalSpace;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); var6++) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (IgnoredPlayer.method414(var1.charAt(var6)) & 0xff);
				if (var7 == 60) {
					var4 = var6;
				} else {
					int var10;
					if (var7 == 62 && var4 != -1) {
						String var14 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var14.equals("lt")) {
							var7 = 60;
						} else {
							if (!var14.equals("gt")) {
								if (var14.startsWith("img=")) {
									try {
										String var141 = var14.substring(4);
										var10 = AnimationSkin.getInt(var141, 10, true);
										IndexedSprite var12 = modSprites[var10];
										var12.method929(var2, this.verticalSpace + var3 - var12.height);
										var2 += var12.width;
										var5 = -1;
									} catch (Exception var121) {
										;
									}
								} else {
									this.setRGB(var14);
								}
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160) {
						var7 = 32;
					}

					if (var4 == -1) {
						if (this.aByteArray1821 != null && var5 != -1) {
							var2 += this.aByteArray1821[(var5 << 8) + var7];
						}

						int var13 = this.gylphHeights[var7];
						var10 = this.glyphWidths[var7];
						if (var7 != 32) {
							if (alpha == 256) {
								if (shadeRGB != -1) {
									renderShadeRGB(this.gylphs[var7], this.horizontalOffsets[var7] + var2 + 1,
											this.verticalOffsets[var7] + var3 + 1, var13, var10, shadeRGB);
								}

								this.renderRGB(this.gylphs[var7], this.horizontalOffsets[var7] + var2,
										this.verticalOffsets[var7] + var3, var13, var10, colorRGB);
							} else {
								if (shadeRGB != -1) {
									renderShadeRGBA(this.gylphs[var7], this.horizontalOffsets[var7] + var2 + 1,
											this.verticalOffsets[var7] + var3 + 1, var13, var10, shadeRGB, alpha);
								}

								this.renderRGBA(this.gylphs[var7], this.horizontalOffsets[var7] + var2,
										this.verticalOffsets[var7] + var3, var13, var10, colorRGB, alpha);
							}
						} else if (anInt1836 > 0) {
							anInt1837 += anInt1836;
							var2 += anInt1837 >> 8;
							anInt1837 &= 255;
						}

						int var9 = this.anIntArray1826[var7];
						if (strikeRGB != -1) {
							drawHorizontal(var2, (int) ((double) this.verticalSpace * 0.7D) + var3, var9, strikeRGB);
						}

						if (underlineRGB != -1) {
							drawHorizontal(var2, this.verticalSpace + var3 + 1, var9, underlineRGB);
						}

						var2 += var9;
						var5 = var7;
					}
				}
			}
		}

	}

	void method976(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.verticalSpace;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); var9++) {
			if (var1.charAt(var9) != 0) {
				char var10 = (char) (IgnoredPlayer.method414(var1.charAt(var9)) & 0xff);
				if (var10 == 60) {
					var6 = var9;
				} else {
					int var12;
					int var13;
					int var15;
					if (var10 == 62 && var6 != -1) {
						String var19 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var19.equals("lt")) {
							var10 = 60;
						} else {
							if (!var19.equals("gt")) {
								if (var19.startsWith("img=")) {
									try {
										if (var4 != null) {
											var12 = var4[var8];
										} else {
											var12 = 0;
										}

										if (var5 != null) {
											var13 = var5[var8];
										} else {
											var13 = 0;
										}

										++var8;
										String var191 = var19.substring(4);
										var15 = AnimationSkin.getInt(var191, 10, true);
										IndexedSprite var17 = modSprites[var15];
										var17.method929(var2 + var12, this.verticalSpace + var3 - var17.height + var13);
										var2 += var17.width;
										var7 = -1;
									} catch (Exception var171) {
										;
									}
								} else {
									this.setRGB(var19);
								}
								continue;
							}

							var10 = 62;
						}
					}

					if (var10 == 160) {
						var10 = 32;
					}

					if (var6 == -1) {
						if (this.aByteArray1821 != null && var7 != -1) {
							var2 += this.aByteArray1821[(var7 << 8) + var10];
						}

						int var18 = this.gylphHeights[var10];
						var12 = this.glyphWidths[var10];
						if (var4 != null) {
							var13 = var4[var8];
						} else {
							var13 = 0;
						}

						if (var5 != null) {
							var15 = var5[var8];
						} else {
							var15 = 0;
						}

						++var8;
						if (var10 != 32) {
							if (alpha == 256) {
								if (shadeRGB != -1) {
									renderShadeRGB(this.gylphs[var10],
											this.horizontalOffsets[var10] + var2 + 1 + var13,
											this.verticalOffsets[var10] + var3 + 1 + var15, var18, var12, shadeRGB);
								}

								this.renderRGB(this.gylphs[var10],
										this.horizontalOffsets[var10] + var2 + var13,
										this.verticalOffsets[var10] + var3 + var15, var18, var12, colorRGB);
							} else {
								if (shadeRGB != -1) {
									renderShadeRGBA(this.gylphs[var10],
											this.horizontalOffsets[var10] + var2 + 1 + var13,
											this.verticalOffsets[var10] + var3 + 1 + var15, var18, var12, shadeRGB,
											alpha);
								}

								this.renderRGBA(this.gylphs[var10],
										this.horizontalOffsets[var10] + var2 + var13,
										this.verticalOffsets[var10] + var3 + var15, var18, var12, colorRGB, alpha);
							}
						} else if (anInt1836 > 0) {
							anInt1837 += anInt1836;
							var2 += anInt1837 >> 8;
							anInt1837 &= 255;
						}

						int var14 = this.anIntArray1826[var10];
						if (strikeRGB != -1) {
							drawHorizontal(var2, (int) ((double) this.verticalSpace * 0.7D) + var3, var14, strikeRGB);
						}

						if (underlineRGB != -1) {
							drawHorizontal(var2, this.verticalSpace + var3, var14, underlineRGB);
						}

						var2 += var14;
						var7 = var10;
					}
				}
			}
		}

	}

	AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.horizontalOffsets = var2;
		this.verticalOffsets = var3;
		this.gylphHeights = var4;
		this.glyphWidths = var5;
		this.method965(var1);
		this.gylphs = var7;
		int var9 = Integer.MAX_VALUE;
		int var10 = Integer.MIN_VALUE;

		for (int i = 0; i < 256; i++) {
			if (this.verticalOffsets[i] < var9 && this.glyphWidths[i] != 0) {
				var9 = this.verticalOffsets[i];
			}

			if (this.verticalOffsets[i] + this.glyphWidths[i] > var10) {
				var10 = this.verticalOffsets[i] + this.glyphWidths[i];
			}
		}

		this.minSpacing = this.verticalSpace - var9;
		this.maxSpacing = var10 - this.verticalSpace;
	}

	static void renderShadeRGB(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = raster_width * var2 + var1;
		int var10 = raster_width - var3;
		int var7 = 0;
		int var9 = 0;
		int var8;
		if (var2 < draw_region_y) {
			var8 = draw_region_y - var2;
			var4 -= var8;
			var2 = draw_region_y;
			var9 += var8 * var3;
			var6 += raster_width * var8;
		}

		if (var2 + var4 > draw_region_max_y) {
			var4 -= var2 + var4 - draw_region_max_y;
		}

		if (var1 < draw_region_x) {
			var8 = draw_region_x - var1;
			var3 -= var8;
			var1 = draw_region_x;
			var9 += var8;
			var6 += var8;
			var7 += var8;
			var10 += var8;
		}

		if (var1 + var3 > draw_region_max_x) {
			var8 = var1 + var3 - draw_region_max_x;
			var3 -= var8;
			var7 += var8;
			var10 += var8;
		}

		if (var3 > 0 && var4 > 0) {
			render(raster, var0, var5, var9, var6, var3, var4, var10, var7);
		}

	}

	static void renderShadeRGBA(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = raster_width * var2 + var1;
		int var9 = raster_width - var3;
		int var11 = 0;
		int var10 = 0;
		int var8;
		if (var2 < draw_region_y) {
			var8 = draw_region_y - var2;
			var4 -= var8;
			var2 = draw_region_y;
			var10 += var8 * var3;
			var7 += raster_width * var8;
		}

		if (var2 + var4 > draw_region_max_y) {
			var4 -= var2 + var4 - draw_region_max_y;
		}

		if (var1 < draw_region_x) {
			var8 = draw_region_x - var1;
			var3 -= var8;
			var1 = draw_region_x;
			var10 += var8;
			var7 += var8;
			var11 += var8;
			var9 += var8;
		}

		if (var1 + var3 > draw_region_max_x) {
			var8 = var1 + var3 - draw_region_max_x;
			var3 -= var8;
			var11 += var8;
			var9 += var8;
		}

		if (var3 > 0 && var4 > 0) {
			renderRGBA(raster, var0, var5, var10, var7, var3, var4, var9, var11, var6);
		}

	}

	static void renderRGBA(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9) {
		var2 = ((var2 & 0xff00ff) * var9 & 0xff00ff00) + ((var2 & 0xff00) * var9 & 0xff0000) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; var10++) {
			for (int var12 = -var5; var12 < 0; var12++) {
				if (var1[var3++] != 0) {
					int var11 = var0[var4];
					var0[var4++] = (((var11 & 0xff00ff) * var9 & 0xff00ff00)
							+ ((var11 & 0xff00) * var9 & 0xff0000) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method980(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method984(var4, var5);
			this.method975(var1, var2, var3);
		}

	}

	int method981(char var1) {
		if (var1 == 160) {
			var1 = 32;
		}

		return this.anIntArray1826[IgnoredPlayer.method414(var1) & 0xff];
	}

	public void method982(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method984(var4, var5);
			this.method975(var1, var2 - this.method967(var1) / 2, var3);
		}

	}

	void method983(String var1, int var2) {
		int var3 = 0;
		boolean var6 = false;

		for (int var4 = 0; var4 < var1.length(); var4++) {
			char var5 = var1.charAt(var4);
			if (var5 == 60) {
				var6 = true;
			} else if (var5 == 62) {
				var6 = false;
			} else if (!var6 && var5 == 32) {
				++var3;
			}
		}

		if (var3 > 0) {
			anInt1836 = (var2 - this.method967(var1) << 8) / var3;
		}

	}

	void method984(int var1, int var2) {
		strikeRGB = -1;
		underlineRGB = -1;
		prevShadeRGB = var2;
		shadeRGB = var2;
		prevColorRGB = var1;
		colorRGB = var1;
		alpha = 256;
		anInt1836 = 0;
		anInt1837 = 0;
	}

	void setRGB(String text) {
		try {
			String subtext;
			int rgb;
			if (text.startsWith("col=")) {
				subtext = text.substring(4);
				rgb = AnimationSkin.getInt(subtext, 16, true);
				colorRGB = rgb;
			} else if (text.equals("/col")) {
				colorRGB = prevColorRGB;
			} else if (text.startsWith("str=")) {
				subtext = text.substring(4);
				rgb = AnimationSkin.getInt(subtext, 16, true);
				strikeRGB = rgb;
			} else if (text.equals("str")) {
				strikeRGB = 8388608;
			} else if (text.equals("/str")) {
				strikeRGB = -1;
			} else if (text.startsWith("u=")) {
				subtext = text.substring(2);
				rgb = AnimationSkin.getInt(subtext, 16, true);
				underlineRGB = rgb;
			} else if (text.equals("u")) {
				underlineRGB = 0;
			} else if (text.equals("/u")) {
				underlineRGB = -1;
			} else if (text.startsWith("shad=")) {
				subtext = text.substring(5);
				rgb = AnimationSkin.getInt(subtext, 16, true);
				shadeRGB = rgb;
			} else if (text.equals("shad")) {
				shadeRGB = 0;
			} else if (text.equals("/shad")) {
				shadeRGB = prevShadeRGB;
			} else if (text.equals("br")) {
				this.method984(prevColorRGB, prevShadeRGB);
			}
		} catch (Exception var4) {
			;
		}

	}

	AbstractFont(byte[] var1) {
		this.method965(var1);
	}

	static int method986(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var16 = var4[var5] + var7;
		int var10 = var2[var6];
		int var18 = var4[var6] + var10;
		int var8 = var7;
		if (var10 > var7) {
			var8 = var10;
		}

		int var17 = var16;
		if (var18 < var16) {
			var17 = var18;
		}

		int var19 = var3[var5];
		if (var3[var6] < var19) {
			var19 = var3[var6];
		}

		byte[] var11 = var1[var5];
		byte[] var13 = var0[var6];
		int var12 = var8 - var7;
		int var14 = var8 - var10;

		for (int var9 = var8; var9 < var17; var9++) {
			int var15 = var11[var12++] + var13[var14++];
			if (var15 < var19) {
				var19 = var15;
			}
		}

		return -var19;
	}

	static void render(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 0x3);

		for (int var11 = -var6; var11 < 0; var11++) {
			int var10;
			for (var10 = var9; var10 < 0; var10++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var10 = var5; var10 < 0; var10++) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	abstract void renderRGBA(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	abstract void renderRGB(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	public int method990(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9,
			int var10) {
		if (var1 == null) {
			return 0;
		} else {
			this.method984(var6, var7);
			if (var10 == 0) {
				var10 = this.verticalSpace;
			}

			int[] var14 = new int[] { var4 };
			if (var5 < this.minSpacing + this.maxSpacing + var10 && var5 < var10 + var10) {
				var14 = null;
			}

			int var12 = this.method968(var1, var14, aStringArray1839);
			if (var9 == 3 && var12 == 1) {
				var9 = 1;
			}

			int var11;
			int var13;
			if (var9 == 0) {
				var13 = this.minSpacing + var3;
			} else if (var9 == 1) {
				var13 = this.minSpacing + var3 + (var5 - this.minSpacing - this.maxSpacing - (var12 - 1) * var10) / 2;
			} else if (var9 == 2) {
				var13 = var3 + var5 - this.maxSpacing - (var12 - 1) * var10;
			} else {
				var11 = (var5 - this.minSpacing - this.maxSpacing - (var12 - 1) * var10) / (var12 + 1);
				if (var11 < 0) {
					var11 = 0;
				}

				var13 = this.minSpacing + var3 + var11;
				var10 += var11;
			}

			for (var11 = 0; var11 < var12; var11++) {
				if (var8 == 0) {
					this.method975(aStringArray1839[var11], var2, var13);
				} else if (var8 == 1) {
					this.method975(aStringArray1839[var11], (var4 - this.method967(aStringArray1839[var11])) / 2 + var2,
							var13);
				} else if (var8 == 2) {
					this.method975(aStringArray1839[var11], var2 + var4 - this.method967(aStringArray1839[var11]),
							var13);
				} else if (var12 - 1 == var11) {
					this.method975(aStringArray1839[var11], var2, var13);
				} else {
					this.method983(aStringArray1839[var11], var4);
					this.method975(aStringArray1839[var11], var2, var13);
					anInt1836 = 0;
				}

				var13 += var10;
			}

			return var12;
		}
	}

}
