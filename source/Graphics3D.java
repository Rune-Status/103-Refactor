public class Graphics3D extends Raster {

	static int centerX;
	static int centerY;
	static int anInt1789;
	static int anInt1777;
	static int anInt1797;
	static int anInt1783;
	static boolean lowMem = false;
	static boolean aBool1778 = false;
	static boolean textX = false;
	static int rightX;
	static int anInt1787;
	static int[] anIntArray1790 = new int[1024];
	public static ITextureLoader textureLoader;
	public static boolean aBool1780 = true;
	static int alpha = 0;
	public static int viewportWidth = 512;
	public static int[] SIN_TABLE = new int[2048];
	public static int[] COS_TABLE = new int[2048];
	public static int[] palette = new int[65536];
	static int[] anIntArray1794 = new int[512];
	static int[] anIntArray1795 = new int[2048];

	public static final void method909() {
		method924(draw_region_x, draw_region_y, draw_region_max_x, draw_region_max_y);
	}

	public static final void method910() {
		centerX = rightX / 2;
		centerY = anInt1787 / 2;
		anInt1789 = -centerX;
		anInt1777 = rightX - centerX;
		anInt1797 = -centerY;
		anInt1783 = anInt1787 - centerY;
	}

	public static final void method911(int var0, int var1) {
		int var2 = anIntArray1790[0];
		int var3 = var2 / raster_width;
		int var4 = var2 - raster_width * var3;
		centerX = var0 - var4;
		centerY = var1 - var3;
		anInt1789 = -centerX;
		anInt1777 = rightX - centerX;
		anInt1797 = -centerY;
		anInt1783 = anInt1787 - centerY;
	}

	static final void method912(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17,
			int var18) {
		int[] var19 = textureLoader.pixels(var18);
		int var22;
		if (var19 == null) {
			var22 = textureLoader.getAverageTextureRGB(var18);
			fillShadedTriangle(var0, var1, var2, var3, var4, var5, method921(var22, var6), method921(var22, var7),
					method921(var22, var8));
		} else {
			lowMem = textureLoader.lowMem();
			aBool1778 = textureLoader.method8(var18);
			var22 = var4 - var3;
			int var24 = var1 - var0;
			int var31 = var5 - var3;
			int var30 = var2 - var0;
			int var26 = var7 - var6;
			int var40 = var8 - var6;
			int var27 = 0;
			if (var1 != var0) {
				var27 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var29 = 0;
			if (var2 != var1) {
				var29 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var23 = 0;
			if (var2 != var0) {
				var23 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var32 = var22 * var30 - var31 * var24;
			if (var32 != 0) {
				int var33 = (var26 * var30 - var40 * var24 << 9) / var32;
				int var25 = (var40 * var22 - var26 * var31 << 9) / var32;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var34 = var11 * var12 - var14 * var9 << 14;
				int var36 = (int) (((long) (var14 * var15 - var17 * var12) << 3 << 14) / (long) viewportWidth);
				int var41 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) viewportWidth);
				int var20 = var10 * var12 - var13 * var9 << 14;
				int var37 = (int) (((long) (var13 * var15 - var16 * var12) << 3 << 14) / (long) viewportWidth);
				int var21 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) viewportWidth);
				int var35 = var13 * var11 - var10 * var14 << 14;
				int var38 = (int) (((long) (var16 * var14 - var13 * var17) << 3 << 14) / (long) viewportWidth);
				int var39 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) viewportWidth);
				int var28;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < anInt1787) {
						if (var1 > anInt1787) {
							var1 = anInt1787;
						}

						if (var2 > anInt1787) {
							var2 = anInt1787;
						}

						var6 = (var6 << 9) - var33 * var3 + var33;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var23 * var0;
								var3 -= var27 * var0;
								var6 -= var25 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var29 * var1;
								var1 = 0;
							}

							var28 = var0 - centerY;
							var34 += var41 * var28;
							var20 += var21 * var28;
							var35 += var39 * var28;
							if (var0 != var1 && var23 < var27 || var0 == var1 && var23 > var29) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1790[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method919(raster, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var33,
													var34, var20, var35, var36, var37, var38);
											var5 += var23;
											var4 += var29;
											var6 += var25;
											var0 += raster_width;
											var34 += var41;
											var20 += var21;
											var35 += var39;
										}
									}

									method919(raster, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var33, var34,
											var20, var35, var36, var37, var38);
									var5 += var23;
									var3 += var27;
									var6 += var25;
									var0 += raster_width;
									var34 += var41;
									var20 += var21;
									var35 += var39;
								}
							}

							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1790[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method919(raster, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var33, var34,
												var20, var35, var36, var37, var38);
										var5 += var23;
										var4 += var29;
										var6 += var25;
										var0 += raster_width;
										var34 += var41;
										var20 += var21;
										var35 += var39;
									}
								}

								method919(raster, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var33, var34, var20,
										var35, var36, var37, var38);
								var5 += var23;
								var3 += var27;
								var6 += var25;
								var0 += raster_width;
								var34 += var41;
								var20 += var21;
								var35 += var39;
							}
						}

						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var23 * var0;
							var3 -= var27 * var0;
							var6 -= var25 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var29 * var2;
							var2 = 0;
						}

						var28 = var0 - centerY;
						var34 += var41 * var28;
						var20 += var21 * var28;
						var35 += var39 * var28;
						if (var0 != var2 && var23 < var27 || var0 == var2 && var29 > var27) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1790[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method919(raster, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var33, var34,
												var20, var35, var36, var37, var38);
										var5 += var29;
										var3 += var27;
										var6 += var25;
										var0 += raster_width;
										var34 += var41;
										var20 += var21;
										var35 += var39;
									}
								}

								method919(raster, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var33, var34, var20,
										var35, var36, var37, var38);
								var4 += var23;
								var3 += var27;
								var6 += var25;
								var0 += raster_width;
								var34 += var41;
								var20 += var21;
								var35 += var39;
							}
						}

						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1790[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method919(raster, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var33, var34,
											var20, var35, var36, var37, var38);
									var5 += var29;
									var3 += var27;
									var6 += var25;
									var0 += raster_width;
									var34 += var41;
									var20 += var21;
									var35 += var39;
								}
							}

							method919(raster, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var33, var34, var20,
									var35, var36, var37, var38);
							var4 += var23;
							var3 += var27;
							var6 += var25;
							var0 += raster_width;
							var34 += var41;
							var20 += var21;
							var35 += var39;
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1787) {
						if (var2 > anInt1787) {
							var2 = anInt1787;
						}

						if (var0 > anInt1787) {
							var0 = anInt1787;
						}

						var7 = (var7 << 9) - var33 * var4 + var33;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var27 * var1;
								var4 -= var29 * var1;
								var7 -= var25 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var23 * var2;
								var2 = 0;
							}

							var28 = var1 - centerY;
							var34 += var41 * var28;
							var20 += var21 * var28;
							var35 += var39 * var28;
							if (var1 != var2 && var27 < var29 || var1 == var2 && var27 > var23) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1790[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method919(raster, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var33,
													var34, var20, var35, var36, var37, var38);
											var3 += var27;
											var5 += var23;
											var7 += var25;
											var1 += raster_width;
											var34 += var41;
											var20 += var21;
											var35 += var39;
										}
									}

									method919(raster, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var33, var34,
											var20, var35, var36, var37, var38);
									var3 += var27;
									var4 += var29;
									var7 += var25;
									var1 += raster_width;
									var34 += var41;
									var20 += var21;
									var35 += var39;
								}
							}

							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1790[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method919(raster, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var33, var34,
												var20, var35, var36, var37, var38);
										var3 += var27;
										var5 += var23;
										var7 += var25;
										var1 += raster_width;
										var34 += var41;
										var20 += var21;
										var35 += var39;
									}
								}

								method919(raster, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var33, var34, var20,
										var35, var36, var37, var38);
								var3 += var27;
								var4 += var29;
								var7 += var25;
								var1 += raster_width;
								var34 += var41;
								var20 += var21;
								var35 += var39;
							}
						}

						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var27 * var1;
							var4 -= var29 * var1;
							var7 -= var25 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var23 * var0;
							var0 = 0;
						}

						var28 = var1 - centerY;
						var34 += var41 * var28;
						var20 += var21 * var28;
						var35 += var39 * var28;
						if (var27 < var29) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1790[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method919(raster, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var33, var34,
												var20, var35, var36, var37, var38);
										var3 += var23;
										var4 += var29;
										var7 += var25;
										var1 += raster_width;
										var34 += var41;
										var20 += var21;
										var35 += var39;
									}
								}

								method919(raster, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var33, var34, var20,
										var35, var36, var37, var38);
								var5 += var27;
								var4 += var29;
								var7 += var25;
								var1 += raster_width;
								var34 += var41;
								var20 += var21;
								var35 += var39;
							}
						}

						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1790[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method919(raster, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var33, var34,
											var20, var35, var36, var37, var38);
									var3 += var23;
									var4 += var29;
									var7 += var25;
									var1 += raster_width;
									var34 += var41;
									var20 += var21;
									var35 += var39;
								}
							}

							method919(raster, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var33, var34, var20,
									var35, var36, var37, var38);
							var5 += var27;
							var4 += var29;
							var7 += var25;
							var1 += raster_width;
							var34 += var41;
							var20 += var21;
							var35 += var39;
						}
					}
				} else if (var2 < anInt1787) {
					if (var0 > anInt1787) {
						var0 = anInt1787;
					}

					if (var1 > anInt1787) {
						var1 = anInt1787;
					}

					var8 = (var8 << 9) - var33 * var5 + var33;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var29 * var2;
							var5 -= var23 * var2;
							var8 -= var25 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var27 * var0;
							var0 = 0;
						}

						var28 = var2 - centerY;
						var34 += var41 * var28;
						var20 += var21 * var28;
						var35 += var39 * var28;
						if (var29 < var23) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1790[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method919(raster, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var33, var34,
												var20, var35, var36, var37, var38);
										var4 += var29;
										var3 += var27;
										var8 += var25;
										var2 += raster_width;
										var34 += var41;
										var20 += var21;
										var35 += var39;
									}
								}

								method919(raster, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var33, var34, var20,
										var35, var36, var37, var38);
								var4 += var29;
								var5 += var23;
								var8 += var25;
								var2 += raster_width;
								var34 += var41;
								var20 += var21;
								var35 += var39;
							}
						}

						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1790[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method919(raster, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var33, var34,
											var20, var35, var36, var37, var38);
									var4 += var29;
									var3 += var27;
									var8 += var25;
									var2 += raster_width;
									var34 += var41;
									var20 += var21;
									var35 += var39;
								}
							}

							method919(raster, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var33, var34, var20,
									var35, var36, var37, var38);
							var4 += var29;
							var5 += var23;
							var8 += var25;
							var2 += raster_width;
							var34 += var41;
							var20 += var21;
							var35 += var39;
						}
					}

					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var29 * var2;
						var5 -= var23 * var2;
						var8 -= var25 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var27 * var1;
						var1 = 0;
					}

					var28 = var2 - centerY;
					var34 += var41 * var28;
					var20 += var21 * var28;
					var35 += var39 * var28;
					if (var29 < var23) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1790[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method919(raster, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var33, var34,
											var20, var35, var36, var37, var38);
									var4 += var27;
									var5 += var23;
									var8 += var25;
									var2 += raster_width;
									var34 += var41;
									var20 += var21;
									var35 += var39;
								}
							}

							method919(raster, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var33, var34, var20,
									var35, var36, var37, var38);
							var3 += var29;
							var5 += var23;
							var8 += var25;
							var2 += raster_width;
							var34 += var41;
							var20 += var21;
							var35 += var39;
						}
					}

					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1790[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method919(raster, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var33, var34, var20,
										var35, var36, var37, var38);
								var4 += var27;
								var5 += var23;
								var8 += var25;
								var2 += raster_width;
								var34 += var41;
								var20 += var21;
								var35 += var39;
							}
						}

						method919(raster, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var33, var34, var20, var35,
								var36, var37, var38);
						var3 += var29;
						var5 += var23;
						var8 += var25;
						var2 += raster_width;
						var34 += var41;
						var20 += var21;
						var35 += var39;
					}
				}
			}
		}

	}

	public static final void setBrightness(double var0) {
		method914(var0, 0, 512);
	}

	static final void method914(double var0, int var2, int var3) {
		var0 += Math.random() * 0.03D - 0.015D;
		int var8 = var2 * 128;

		for (int var9 = var2; var9 < var3; var9++) {
			double var10 = (double) (var9 >> 3) / 64.0D + 0.0078125D;
			double var19 = (double) (var9 & 0x7) / 8.0D + 0.0625D;

			for (int var16 = 0; var16 < 128; var16++) {
				double var4 = (double) var16 / 128.0D;
				double var6 = var4;
				double var31 = var4;
				double var21 = var4;
				if (var19 != 0.0D) {
					double var12;
					if (var4 < 0.5D) {
						var12 = (var19 + 1.0D) * var4;
					} else {
						var12 = var4 + var19 - var4 * var19;
					}

					double var14 = var4 * 2.0D - var12;
					double var27 = var10 + 0.3333333333333333D;
					if (var27 > 1.0D) {
						--var27;
					}

					double var17 = var10 - 0.3333333333333333D;
					if (var17 < 0.0D) {
						++var17;
					}

					if (var27 * 6.0D < 1.0D) {
						var6 = (var12 - var14) * 6.0D * var27 + var14;
					} else if (var27 * 2.0D < 1.0D) {
						var6 = var12;
					} else if (var27 * 3.0D < 2.0D) {
						var6 = (var12 - var14) * (0.6666666666666666D - var27) * 6.0D + var14;
					} else {
						var6 = var14;
					}

					if (var10 * 6.0D < 1.0D) {
						var31 = (var12 - var14) * 6.0D * var10 + var14;
					} else if (var10 * 2.0D < 1.0D) {
						var31 = var12;
					} else if (var10 * 3.0D < 2.0D) {
						var31 = (var12 - var14) * (0.6666666666666666D - var10) * 6.0D + var14;
					} else {
						var31 = var14;
					}

					if (var17 * 6.0D < 1.0D) {
						var21 = (var12 - var14) * 6.0D * var17 + var14;
					} else if (var17 * 2.0D < 1.0D) {
						var21 = var12;
					} else if (var17 * 3.0D < 2.0D) {
						var21 = (var12 - var14) * (0.6666666666666666D - var17) * 6.0D + var14;
					} else {
						var21 = var14;
					}
				}

				int var28 = (int) (var6 * 256.0D);
				int var13 = (int) (var31 * 256.0D);
				int var271 = (int) (var21 * 256.0D);
				int var15 = (var28 << 16) + (var13 << 8) + var271;
				var15 = adjustRGB(var15, var0);
				if (var15 == 0) {
					var15 = 1;
				}

				palette[var8++] = var15;
			}
		}

	}

	static int adjustRGB(int rgb, double brightness) {
		double red = (double) (rgb >> 16) / 256.0D;
		double green = (double) (rgb >> 8 & 0xff) / 256.0D;
		double blue = (double) (rgb & 0xff) / 256.0D;
		red = Math.pow(red, brightness);
		green = Math.pow(green, brightness);
		blue = Math.pow(blue, brightness);
		int aRed = (int) (red * 256.0D);
		int aGreen = (int) (green * 256.0D);
		int aBlue = (int) (blue * 256.0D);
		return (aRed << 16) + (aGreen << 8) + aBlue;
	}

	Graphics3D() throws Throwable {
		throw new Error();
	}

	public static void method916(int var0, int var1, int var2) {
		textX = var0 < 0 || var0 > rightX || var1 < 0 || var1 > rightX || var2 < 0 || var2 > rightX;
	}

	public static final void method917(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < anInt1787) {
				if (var1 > anInt1787) {
					var1 = anInt1787;
				}

				if (var2 > anInt1787) {
					var2 = anInt1787;
				}

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1790[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method918(raster, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += raster_width;
								}
							}

							method918(raster, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += raster_width;
						}
					}

					var2 -= var1;
					var1 -= var0;
					var0 = anIntArray1790[var0];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var2;
								if (var2 < 0) {
									return;
								}

								method918(raster, var0, var6, 0, var5 >> 14, var4 >> 14);
								var5 += var9;
								var4 += var8;
								var0 += raster_width;
							}
						}

						method918(raster, var0, var6, 0, var5 >> 14, var3 >> 14);
						var5 += var9;
						var3 += var7;
						var0 += raster_width;
					}
				}

				var4 = var3 <<= 14;
				if (var0 < 0) {
					var4 -= var9 * var0;
					var3 -= var7 * var0;
					var0 = 0;
				}

				var5 <<= 14;
				if (var2 < 0) {
					var5 -= var8 * var2;
					var2 = 0;
				}

				if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
					var1 -= var2;
					var2 -= var0;
					var0 = anIntArray1790[var0];

					while (true) {
						--var2;
						if (var2 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method918(raster, var0, var6, 0, var5 >> 14, var3 >> 14);
								var5 += var8;
								var3 += var7;
								var0 += raster_width;
							}
						}

						method918(raster, var0, var6, 0, var4 >> 14, var3 >> 14);
						var4 += var9;
						var3 += var7;
						var0 += raster_width;
					}
				}

				var1 -= var2;
				var2 -= var0;
				var0 = anIntArray1790[var0];

				while (true) {
					--var2;
					if (var2 < 0) {
						while (true) {
							--var1;
							if (var1 < 0) {
								return;
							}

							method918(raster, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var8;
							var3 += var7;
							var0 += raster_width;
						}
					}

					method918(raster, var0, var6, 0, var3 >> 14, var4 >> 14);
					var4 += var9;
					var3 += var7;
					var0 += raster_width;
				}
			}
		} else if (var1 <= var2) {
			if (var1 < anInt1787) {
				if (var2 > anInt1787) {
					var2 = anInt1787;
				}

				if (var0 > anInt1787) {
					var0 = anInt1787;
				}

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if ((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1790[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method918(raster, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += raster_width;
								}
							}

							method918(raster, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += raster_width;
						}
					}

					var0 -= var2;
					var2 -= var1;
					var1 = anIntArray1790[var1];

					while (true) {
						--var2;
						if (var2 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method918(raster, var1, var6, 0, var3 >> 14, var5 >> 14);
								var3 += var7;
								var5 += var9;
								var1 += raster_width;
							}
						}

						method918(raster, var1, var6, 0, var3 >> 14, var4 >> 14);
						var3 += var7;
						var4 += var8;
						var1 += raster_width;
					}
				}

				var5 = var4 <<= 14;
				if (var1 < 0) {
					var5 -= var7 * var1;
					var4 -= var8 * var1;
					var1 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var9 * var0;
					var0 = 0;
				}

				if (var7 < var8) {
					var2 -= var0;
					var0 -= var1;
					var1 = anIntArray1790[var1];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var2;
								if (var2 < 0) {
									return;
								}

								method918(raster, var1, var6, 0, var3 >> 14, var4 >> 14);
								var3 += var9;
								var4 += var8;
								var1 += raster_width;
							}
						}

						method918(raster, var1, var6, 0, var5 >> 14, var4 >> 14);
						var5 += var7;
						var4 += var8;
						var1 += raster_width;
					}
				}

				var2 -= var0;
				var0 -= var1;
				var1 = anIntArray1790[var1];

				while (true) {
					--var0;
					if (var0 < 0) {
						while (true) {
							--var2;
							if (var2 < 0) {
								return;
							}

							method918(raster, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var9;
							var4 += var8;
							var1 += raster_width;
						}
					}

					method918(raster, var1, var6, 0, var4 >> 14, var5 >> 14);
					var5 += var7;
					var4 += var8;
					var1 += raster_width;
				}
			}
		} else if (var2 < anInt1787) {
			if (var0 > anInt1787) {
				var0 = anInt1787;
			}

			if (var1 > anInt1787) {
				var1 = anInt1787;
			}

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1790[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method918(raster, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += raster_width;
							}
						}

						method918(raster, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += raster_width;
					}
				}

				var1 -= var0;
				var0 -= var2;
				var2 = anIntArray1790[var2];

				while (true) {
					--var0;
					if (var0 < 0) {
						while (true) {
							--var1;
							if (var1 < 0) {
								return;
							}

							method918(raster, var2, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var8;
							var3 += var7;
							var2 += raster_width;
						}
					}

					method918(raster, var2, var6, 0, var5 >> 14, var4 >> 14);
					var4 += var8;
					var5 += var9;
					var2 += raster_width;
				}
			}

			var3 = var5 <<= 14;
			if (var2 < 0) {
				var3 -= var8 * var2;
				var5 -= var9 * var2;
				var2 = 0;
			}

			var4 <<= 14;
			if (var1 < 0) {
				var4 -= var7 * var1;
				var1 = 0;
			}

			if (var8 < var9) {
				var0 -= var1;
				var1 -= var2;
				var2 = anIntArray1790[var2];

				while (true) {
					--var1;
					if (var1 < 0) {
						while (true) {
							--var0;
							if (var0 < 0) {
								return;
							}

							method918(raster, var2, var6, 0, var4 >> 14, var5 >> 14);
							var4 += var7;
							var5 += var9;
							var2 += raster_width;
						}
					}

					method918(raster, var2, var6, 0, var3 >> 14, var5 >> 14);
					var3 += var8;
					var5 += var9;
					var2 += raster_width;
				}
			}

			var0 -= var1;
			var1 -= var2;
			var2 = anIntArray1790[var2];

			while (true) {
				--var1;
				if (var1 < 0) {
					while (true) {
						--var0;
						if (var0 < 0) {
							return;
						}

						method918(raster, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var7;
						var5 += var9;
						var2 += raster_width;
					}
				}

				method918(raster, var2, var6, 0, var5 >> 14, var3 >> 14);
				var3 += var8;
				var5 += var9;
				var2 += raster_width;
			}
		}

	}

	static final void method918(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (textX) {
			if (var5 > rightX) {
				var5 = rightX;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (alpha == 0) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 0x3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			} else if (alpha == 254) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 0x3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var0[var1];
						}
					}

					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
				}
			} else {
				int var7 = alpha;
				int var8 = 256 - alpha;
				var2 = ((var2 & 0xff00ff) * var8 >> 8 & 0xff00ff) + ((var2 & 0xff00) * var8 >> 8 & 0xff00);

				while (true) {
					--var3;
					int var6;
					if (var3 < 0) {
						var3 = var5 - var4 & 0x3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var6 = var0[var1];
							var0[var1++] = ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff) + var2
									+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
						}
					}

					var6 = var0[var1];
					var0[var1++] = ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff) + var2
							+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
					var6 = var0[var1];
					var0[var1++] = ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff) + var2
							+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
					var6 = var0[var1];
					var0[var1++] = ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff) + var2
							+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
					var6 = var0[var1];
					var0[var1++] = ((var6 & 0xff00ff) * var7 >> 8 & 0xff00ff) + var2
							+ ((var6 & 0xff00) * var7 >> 8 & 0xff00);
				}
			}
		}
	}

	static final void method919(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (textX) {
			if (var6 > rightX) {
				var6 = rightX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var23 = var6 - var5;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			if (lowMem) {
				var19 = var5 - centerX;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var20 = var11 >> 12;
				if (var20 != 0) {
					var16 = var9 / var20;
					var21 = var10 / var20;
					if (var16 < 0) {
						var16 = 0;
					} else if (var16 > 4032) {
						var16 = 4032;
					}
				} else {
					var16 = 0;
					var21 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var20 = var11 >> 12;
				if (var20 != 0) {
					var15 = var9 / var20;
					var22 = var10 / var20;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 4032) {
						var15 = 4032;
					}
				} else {
					var15 = 0;
					var22 = 0;
				}

				var2 = (var16 << 20) + var21;
				var17 = (var15 - var16 >> 3 << 20) + (var22 - var21 >> 3);
				var23 >>= 3;
				var8 <<= 3;
				var18 = var7 >> 8;
				if (aBool1778) {
					if (var23 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var16 = var15;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var20 = var11 >> 12;
							if (var20 != 0) {
								var15 = var9 / var20;
								var22 = var10 / var20;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 4032) {
									var15 = 4032;
								}
							} else {
								var15 = 0;
								var22 = 0;
							}

							var2 = (var16 << 20) + var21;
							var17 = (var15 - var16 >> 3 << 20) + (var22 - var21 >> 3);
							var7 += var8;
							var18 = var7 >> 8;
							--var23;
						} while (var23 > 0);
					}

					var23 = var6 - var5 & 0x7;
					if (var23 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							--var23;
						} while (var23 > 0);
					}
				} else {
					if (var23 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var16 = var15;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var20 = var11 >> 12;
							if (var20 != 0) {
								var15 = var9 / var20;
								var22 = var10 / var20;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 4032) {
									var15 = 4032;
								}
							} else {
								var15 = 0;
								var22 = 0;
							}

							var2 = (var16 << 20) + var21;
							var17 = (var15 - var16 >> 3 << 20) + (var22 - var21 >> 3);
							var7 += var8;
							var18 = var7 >> 8;
							--var23;
						} while (var23 > 0);
					}

					var23 = var6 - var5 & 0x7;
					if (var23 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							--var23;
						} while (var23 > 0);
					}
				}
			} else {
				var19 = var5 - centerX;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var20 = var11 >> 14;
				if (var20 != 0) {
					var16 = var9 / var20;
					var21 = var10 / var20;
					if (var16 < 0) {
						var16 = 0;
					} else if (var16 > 16256) {
						var16 = 16256;
					}
				} else {
					var16 = 0;
					var21 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var20 = var11 >> 14;
				if (var20 != 0) {
					var15 = var9 / var20;
					var22 = var10 / var20;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 16256) {
						var15 = 16256;
					}
				} else {
					var15 = 0;
					var22 = 0;
				}

				var2 = (var16 << 18) + var21;
				var17 = (var15 - var16 >> 3 << 18) + (var22 - var21 >> 3);
				var23 >>= 3;
				var8 <<= 3;
				var18 = var7 >> 8;
				if (aBool1778) {
					if (var23 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var16 = var15;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var20 = var11 >> 14;
							if (var20 != 0) {
								var15 = var9 / var20;
								var22 = var10 / var20;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 16256) {
									var15 = 16256;
								}
							} else {
								var15 = 0;
								var22 = 0;
							}

							var2 = (var16 << 18) + var21;
							var17 = (var15 - var16 >> 3 << 18) + (var22 - var21 >> 3);
							var7 += var8;
							var18 = var7 >> 8;
							--var23;
						} while (var23 > 0);
					}

					var23 = var6 - var5 & 0x7;
					if (var23 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
									+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							var2 += var17;
							--var23;
						} while (var23 > 0);
					}
				} else {
					if (var23 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var16 = var15;
							var21 = var22;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var20 = var11 >> 14;
							if (var20 != 0) {
								var15 = var9 / var20;
								var22 = var10 / var20;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 16256) {
									var15 = 16256;
								}
							} else {
								var15 = 0;
								var22 = 0;
							}

							var2 = (var16 << 18) + var21;
							var17 = (var15 - var16 >> 3 << 18) + (var22 - var21 >> 3);
							var7 += var8;
							var18 = var7 >> 8;
							--var23;
						} while (var23 > 0);
					}

					var23 = var6 - var5 & 0x7;
					if (var23 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var18 & 0xff00ff00)
										+ ((var3 & 0xff00) * var18 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var17;
							--var23;
						} while (var23 > 0);
					}
				}
			}
		}

	}

	static final void method920(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (textX) {
			if (var6 > rightX) {
				var6 = rightX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var16 = var6 - var5;
			int var15;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (lowMem) {
				var18 = var5 - centerX;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var20 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var16;
				var10 += var13 * var16;
				var11 += var14 * var16;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var22 = var9 / var19;
					var23 = var10 / var19;
				} else {
					var22 = 0;
					var23 = 0;
				}

				var2 = (var20 << 20) + var21;
				var15 = ((var22 - var20) / var16 << 20) + (var23 - var21) / var16;
				var16 >>= 3;
				var8 <<= 3;
				var17 = var7 >> 8;
				if (aBool1778) {
					if (var16 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var7 += var8;
							var17 = var7 >> 8;
							--var16;
						} while (var16 > 0);
					}

					var16 = var6 - var5 & 0x7;
					if (var16 > 0) {
						do {
							var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							--var16;
						} while (var16 > 0);
					}
				} else {
					if (var16 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							var7 += var8;
							var17 = var7 >> 8;
							--var16;
						} while (var16 > 0);
					}

					var16 = var6 - var5 & 0x7;
					if (var16 > 0) {
						do {
							if ((var3 = var1[(var2 & 0xfc0) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							--var16;
						} while (var16 > 0);
					}
				}
			} else {
				var18 = var5 - centerX;
				var9 += var12 * var18;
				var10 += var13 * var18;
				var11 += var14 * var18;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var20 = var9 / var19;
					var21 = var10 / var19;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var9 += var12 * var16;
				var10 += var13 * var16;
				var11 += var14 * var16;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var22 = var9 / var19;
					var23 = var10 / var19;
				} else {
					var22 = 0;
					var23 = 0;
				}

				var2 = (var20 << 18) + var21;
				var15 = ((var22 - var20) / var16 << 18) + (var23 - var21) / var16;
				var16 >>= 3;
				var8 <<= 3;
				var17 = var7 >> 8;
				if (aBool1778) {
					if (var16 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							var7 += var8;
							var17 = var7 >> 8;
							--var16;
						} while (var16 > 0);
					}

					var16 = var6 - var5 & 0x7;
					if (var16 > 0) {
						do {
							var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
									+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							var2 += var15;
							--var16;
						} while (var16 > 0);
					}
				} else {
					if (var16 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							var7 += var8;
							var17 = var7 >> 8;
							--var16;
						} while (var16 > 0);
					}

					var16 = var6 - var5 & 0x7;
					if (var16 > 0) {
						do {
							if ((var3 = var1[(var2 & 0x3f80) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 0xff00ff) * var17 & 0xff00ff00)
										+ ((var3 & 0xff00) * var17 & 0xff0000) >> 8;
							}

							++var4;
							var2 += var15;
							--var16;
						} while (var16 > 0);
					}
				}
			}
		}

	}

	static final int method921(int var0, int var1) {
		var1 = (var0 & 0x7f) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 0xff80) + var1;
	}

	static final void fillShadedTriangle(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		int var9 = var4 - var3;
		int var16 = var1 - var0;
		int var10 = var5 - var3;
		int var11 = var2 - var0;
		int var12 = var7 - var6;
		int var20 = var8 - var6;
		int var13;
		if (var2 != var1) {
			var13 = (var5 - var4 << 14) / (var2 - var1);
		} else {
			var13 = 0;
		}

		int var14;
		if (var1 != var0) {
			var14 = (var9 << 14) / var16;
		} else {
			var14 = 0;
		}

		int var18;
		if (var2 != var0) {
			var18 = (var10 << 14) / var11;
		} else {
			var18 = 0;
		}

		int var17 = var9 * var11 - var10 * var16;
		if (var17 != 0) {
			int var19 = (var12 * var11 - var20 * var16 << 8) / var17;
			int var15 = (var20 * var9 - var12 * var10 << 8) / var17;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < anInt1787) {
					if (var1 > anInt1787) {
						var1 = anInt1787;
					}

					if (var2 > anInt1787) {
						var2 = anInt1787;
					}

					var6 = (var6 << 8) - var19 * var3 + var19;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var18 * var0;
							var3 -= var14 * var0;
							var6 -= var15 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var13 * var1;
							var1 = 0;
						}

						if (var0 != var1 && var18 < var14 || var0 == var1 && var18 > var13) {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1790[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method923(raster, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19);
										var5 += var18;
										var4 += var13;
										var6 += var15;
										var0 += raster_width;
									}
								}

								method923(raster, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
								var5 += var18;
								var3 += var14;
								var6 += var15;
								var0 += raster_width;
							}
						}

						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1790[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method923(raster, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19);
									var5 += var18;
									var4 += var13;
									var6 += var15;
									var0 += raster_width;
								}
							}

							method923(raster, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
							var5 += var18;
							var3 += var14;
							var6 += var15;
							var0 += raster_width;
						}
					}

					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var18 * var0;
						var3 -= var14 * var0;
						var6 -= var15 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var13 * var2;
						var2 = 0;
					}

					if ((var0 == var2 || var18 >= var14) && (var0 != var2 || var13 <= var14)) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1790[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method923(raster, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
									var5 += var13;
									var3 += var14;
									var6 += var15;
									var0 += raster_width;
								}
							}

							method923(raster, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19);
							var4 += var18;
							var3 += var14;
							var6 += var15;
							var0 += raster_width;
						}
					}

					var1 -= var2;
					var2 -= var0;
					var0 = anIntArray1790[var0];

					while (true) {
						--var2;
						if (var2 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method923(raster, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
								var5 += var13;
								var3 += var14;
								var6 += var15;
								var0 += raster_width;
							}
						}

						method923(raster, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19);
						var4 += var18;
						var3 += var14;
						var6 += var15;
						var0 += raster_width;
					}
				}
			} else if (var1 <= var2) {
				if (var1 < anInt1787) {
					if (var2 > anInt1787) {
						var2 = anInt1787;
					}

					if (var0 > anInt1787) {
						var0 = anInt1787;
					}

					var7 = (var7 << 8) - var19 * var4 + var19;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var14 * var1;
							var4 -= var13 * var1;
							var7 -= var15 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var18 * var2;
							var2 = 0;
						}

						if (var1 != var2 && var14 < var13 || var1 == var2 && var14 > var18) {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1790[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method923(raster, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19);
										var3 += var14;
										var5 += var18;
										var7 += var15;
										var1 += raster_width;
									}
								}

								method923(raster, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
								var3 += var14;
								var4 += var13;
								var7 += var15;
								var1 += raster_width;
							}
						}

						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1790[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method923(raster, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19);
									var3 += var14;
									var5 += var18;
									var7 += var15;
									var1 += raster_width;
								}
							}

							method923(raster, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
							var3 += var14;
							var4 += var13;
							var7 += var15;
							var1 += raster_width;
						}
					}

					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var14 * var1;
						var4 -= var13 * var1;
						var7 -= var15 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var18 * var0;
						var0 = 0;
					}

					if (var14 < var13) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1790[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method923(raster, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
									var3 += var18;
									var4 += var13;
									var7 += var15;
									var1 += raster_width;
								}
							}

							method923(raster, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19);
							var5 += var14;
							var4 += var13;
							var7 += var15;
							var1 += raster_width;
						}
					}

					var2 -= var0;
					var0 -= var1;
					var1 = anIntArray1790[var1];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var2;
								if (var2 < 0) {
									return;
								}

								method923(raster, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
								var3 += var18;
								var4 += var13;
								var7 += var15;
								var1 += raster_width;
							}
						}

						method923(raster, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19);
						var5 += var14;
						var4 += var13;
						var7 += var15;
						var1 += raster_width;
					}
				}
			} else if (var2 < anInt1787) {
				if (var0 > anInt1787) {
					var0 = anInt1787;
				}

				if (var1 > anInt1787) {
					var1 = anInt1787;
				}

				var8 = (var8 << 8) - var19 * var5 + var19;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var13 * var2;
						var5 -= var18 * var2;
						var8 -= var15 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var14 * var0;
						var0 = 0;
					}

					if (var13 < var18) {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1790[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method923(raster, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19);
									var4 += var13;
									var3 += var14;
									var8 += var15;
									var2 += raster_width;
								}
							}

							method923(raster, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
							var4 += var13;
							var5 += var18;
							var8 += var15;
							var2 += raster_width;
						}
					}

					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1790[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method923(raster, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19);
								var4 += var13;
								var3 += var14;
								var8 += var15;
								var2 += raster_width;
							}
						}

						method923(raster, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
						var4 += var13;
						var5 += var18;
						var8 += var15;
						var2 += raster_width;
					}
				}

				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var13 * var2;
					var5 -= var18 * var2;
					var8 -= var15 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var14 * var1;
					var1 = 0;
				}

				if (var13 < var18) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1790[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method923(raster, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
								var4 += var14;
								var5 += var18;
								var8 += var15;
								var2 += raster_width;
							}
						}

						method923(raster, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19);
						var3 += var13;
						var5 += var18;
						var8 += var15;
						var2 += raster_width;
					}
				}

				var0 -= var1;
				var1 -= var2;
				var2 = anIntArray1790[var2];

				while (true) {
					--var1;
					if (var1 < 0) {
						while (true) {
							--var0;
							if (var0 < 0) {
								return;
							}

							method923(raster, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
							var4 += var14;
							var5 += var18;
							var8 += var15;
							var2 += raster_width;
						}
					}

					method923(raster, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
					var3 += var13;
					var5 += var18;
					var8 += var15;
					var2 += raster_width;
				}
			}
		}

	}

	static final void method923(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (textX) {
			if (var5 > rightX) {
				var5 = rightX;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (aBool1780) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (alpha == 0) {
					if (var3 > 0) {
						do {
							var2 = palette[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 0x3;
					if (var3 > 0) {
						var2 = palette[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				} else {
					var10 = alpha;
					var8 = 256 - alpha;
					if (var3 > 0) {
						do {
							var2 = palette[var6 >> 8];
							var6 += var7;
							var2 = ((var2 & 0xff00ff) * var8 >> 8 & 0xff00ff) + ((var2 & 0xff00) * var8 >> 8 & 0xff00);
							var9 = var0[var1];
							var0[var1++] = ((var9 & 0xff00ff) * var10 >> 8 & 0xff00ff) + var2
									+ ((var9 & 0xff00) * var10 >> 8 & 0xff00);
							var9 = var0[var1];
							var0[var1++] = ((var9 & 0xff00ff) * var10 >> 8 & 0xff00ff) + var2
									+ ((var9 & 0xff00) * var10 >> 8 & 0xff00);
							var9 = var0[var1];
							var0[var1++] = ((var9 & 0xff00ff) * var10 >> 8 & 0xff00ff) + var2
									+ ((var9 & 0xff00) * var10 >> 8 & 0xff00);
							var9 = var0[var1];
							var0[var1++] = ((var9 & 0xff00ff) * var10 >> 8 & 0xff00ff) + var2
									+ ((var9 & 0xff00) * var10 >> 8 & 0xff00);
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 0x3;
					if (var3 > 0) {
						var2 = palette[var6 >> 8];
						var2 = ((var2 & 0xff00ff) * var8 >> 8 & 0xff00ff) + ((var2 & 0xff00) * var8 >> 8 & 0xff00);

						do {
							var9 = var0[var1];
							var0[var1++] = ((var9 & 0xff00ff) * var10 >> 8 & 0xff00ff) + var2
									+ ((var9 & 0xff00) * var10 >> 8 & 0xff00);
							--var3;
						} while (var3 > 0);
					}
				}
			} else {
				var3 = var5 - var4;
				if (alpha == 0) {
					do {
						var0[var1++] = palette[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				} else {
					var10 = alpha;
					var8 = 256 - alpha;

					do {
						var2 = palette[var6 >> 8];
						var6 += var7;
						var2 = ((var2 & 0xff00ff) * var8 >> 8 & 0xff00ff) + ((var2 & 0xff00) * var8 >> 8 & 0xff00);
						var9 = var0[var1];
						var0[var1++] = ((var9 & 0xff00ff) * var10 >> 8 & 0xff00ff) + var2
								+ ((var9 & 0xff00) * var10 >> 8 & 0xff00);
						--var3;
					} while (var3 > 0);
				}
			}
		}

	}

	static final void method924(int var0, int var1, int var2, int var3) {
		rightX = var2 - var0;
		anInt1787 = var3 - var1;
		method910();
		if (anIntArray1790.length < anInt1787) {
			anIntArray1790 = new int[World.method482(anInt1787)];
		}

		int var5 = raster_width * var1 + var0;

		for (int var4 = 0; var4 < anInt1787; var4++) {
			anIntArray1790[var4] = var5;
			var5 += raster_width;
		}

	}

	public static final void setTextureLoader(ITextureLoader var0) {
		textureLoader = var0;
	}

	static final void fillTexturedTriangle(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17,
			int var18) {
		int[] var19 = textureLoader.pixels(var18);
		int var21;
		if (var19 == null) {
			var21 = textureLoader.getAverageTextureRGB(var18);
			fillShadedTriangle(var0, var1, var2, var3, var4, var5, method921(var21, var6), method921(var21, var7),
					method921(var21, var8));
		} else {
			lowMem = textureLoader.lowMem();
			aBool1778 = textureLoader.method8(var18);
			var21 = var4 - var3;
			int var22 = var1 - var0;
			int var23 = var5 - var3;
			int var24 = var2 - var0;
			int var25 = var7 - var6;
			int var33 = var8 - var6;
			int var20 = 0;
			if (var1 != var0) {
				var20 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var29 = 0;
			if (var2 != var1) {
				var29 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var26 = 0;
			if (var2 != var0) {
				var26 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var30 = var21 * var24 - var23 * var22;
			if (var30 != 0) {
				int var34 = (var25 * var24 - var33 * var22 << 9) / var30;
				int var38 = (var33 * var21 - var25 * var23 << 9) / var30;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var40 = var11 * var12 - var14 * var9 << 14;
				int var35 = (int) (((long) (var14 * var15 - var17 * var12) << 14) / (long) viewportWidth);
				int var36 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) viewportWidth);
				int var27 = var10 * var12 - var13 * var9 << 14;
				int var41 = (int) (((long) (var13 * var15 - var16 * var12) << 14) / (long) viewportWidth);
				int var28 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) viewportWidth);
				int var31 = var13 * var11 - var10 * var14 << 14;
				int var37 = (int) (((long) (var16 * var14 - var13 * var17) << 14) / (long) viewportWidth);
				int var32 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) viewportWidth);
				int var39;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < anInt1787) {
						if (var1 > anInt1787) {
							var1 = anInt1787;
						}

						if (var2 > anInt1787) {
							var2 = anInt1787;
						}

						var6 = (var6 << 9) - var34 * var3 + var34;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var26 * var0;
								var3 -= var20 * var0;
								var6 -= var38 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var29 * var1;
								var1 = 0;
							}

							var39 = var0 - centerY;
							var40 += var36 * var39;
							var27 += var28 * var39;
							var31 += var32 * var39;
							if (var0 != var1 && var26 < var20 || var0 == var1 && var26 > var29) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1790[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method920(raster, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var34,
													var40, var27, var31, var35, var41, var37);
											var5 += var26;
											var4 += var29;
											var6 += var38;
											var0 += raster_width;
											var40 += var36;
											var27 += var28;
											var31 += var32;
										}
									}

									method920(raster, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var34, var40,
											var27, var31, var35, var41, var37);
									var5 += var26;
									var3 += var20;
									var6 += var38;
									var0 += raster_width;
									var40 += var36;
									var27 += var28;
									var31 += var32;
								}
							}

							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1790[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method920(raster, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var34, var40,
												var27, var31, var35, var41, var37);
										var5 += var26;
										var4 += var29;
										var6 += var38;
										var0 += raster_width;
										var40 += var36;
										var27 += var28;
										var31 += var32;
									}
								}

								method920(raster, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var34, var40, var27,
										var31, var35, var41, var37);
								var5 += var26;
								var3 += var20;
								var6 += var38;
								var0 += raster_width;
								var40 += var36;
								var27 += var28;
								var31 += var32;
							}
						}

						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var26 * var0;
							var3 -= var20 * var0;
							var6 -= var38 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var29 * var2;
							var2 = 0;
						}

						var39 = var0 - centerY;
						var40 += var36 * var39;
						var27 += var28 * var39;
						var31 += var32 * var39;
						if (var0 != var2 && var26 < var20 || var0 == var2 && var29 > var20) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1790[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method920(raster, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var34, var40,
												var27, var31, var35, var41, var37);
										var5 += var29;
										var3 += var20;
										var6 += var38;
										var0 += raster_width;
										var40 += var36;
										var27 += var28;
										var31 += var32;
									}
								}

								method920(raster, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var34, var40, var27,
										var31, var35, var41, var37);
								var4 += var26;
								var3 += var20;
								var6 += var38;
								var0 += raster_width;
								var40 += var36;
								var27 += var28;
								var31 += var32;
							}
						}

						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1790[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method920(raster, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var34, var40,
											var27, var31, var35, var41, var37);
									var5 += var29;
									var3 += var20;
									var6 += var38;
									var0 += raster_width;
									var40 += var36;
									var27 += var28;
									var31 += var32;
								}
							}

							method920(raster, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var34, var40, var27,
									var31, var35, var41, var37);
							var4 += var26;
							var3 += var20;
							var6 += var38;
							var0 += raster_width;
							var40 += var36;
							var27 += var28;
							var31 += var32;
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1787) {
						if (var2 > anInt1787) {
							var2 = anInt1787;
						}

						if (var0 > anInt1787) {
							var0 = anInt1787;
						}

						var7 = (var7 << 9) - var34 * var4 + var34;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var20 * var1;
								var4 -= var29 * var1;
								var7 -= var38 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var26 * var2;
								var2 = 0;
							}

							var39 = var1 - centerY;
							var40 += var36 * var39;
							var27 += var28 * var39;
							var31 += var32 * var39;
							if (var1 != var2 && var20 < var29 || var1 == var2 && var20 > var26) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1790[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method920(raster, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var34,
													var40, var27, var31, var35, var41, var37);
											var3 += var20;
											var5 += var26;
											var7 += var38;
											var1 += raster_width;
											var40 += var36;
											var27 += var28;
											var31 += var32;
										}
									}

									method920(raster, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var34, var40,
											var27, var31, var35, var41, var37);
									var3 += var20;
									var4 += var29;
									var7 += var38;
									var1 += raster_width;
									var40 += var36;
									var27 += var28;
									var31 += var32;
								}
							}

							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1790[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method920(raster, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var34, var40,
												var27, var31, var35, var41, var37);
										var3 += var20;
										var5 += var26;
										var7 += var38;
										var1 += raster_width;
										var40 += var36;
										var27 += var28;
										var31 += var32;
									}
								}

								method920(raster, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var34, var40, var27,
										var31, var35, var41, var37);
								var3 += var20;
								var4 += var29;
								var7 += var38;
								var1 += raster_width;
								var40 += var36;
								var27 += var28;
								var31 += var32;
							}
						}

						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var20 * var1;
							var4 -= var29 * var1;
							var7 -= var38 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var39 = var1 - centerY;
						var40 += var36 * var39;
						var27 += var28 * var39;
						var31 += var32 * var39;
						if (var20 < var29) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1790[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method920(raster, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var34, var40,
												var27, var31, var35, var41, var37);
										var3 += var26;
										var4 += var29;
										var7 += var38;
										var1 += raster_width;
										var40 += var36;
										var27 += var28;
										var31 += var32;
									}
								}

								method920(raster, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var34, var40, var27,
										var31, var35, var41, var37);
								var5 += var20;
								var4 += var29;
								var7 += var38;
								var1 += raster_width;
								var40 += var36;
								var27 += var28;
								var31 += var32;
							}
						}

						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1790[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method920(raster, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var34, var40,
											var27, var31, var35, var41, var37);
									var3 += var26;
									var4 += var29;
									var7 += var38;
									var1 += raster_width;
									var40 += var36;
									var27 += var28;
									var31 += var32;
								}
							}

							method920(raster, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var34, var40, var27,
									var31, var35, var41, var37);
							var5 += var20;
							var4 += var29;
							var7 += var38;
							var1 += raster_width;
							var40 += var36;
							var27 += var28;
							var31 += var32;
						}
					}
				} else if (var2 < anInt1787) {
					if (var0 > anInt1787) {
						var0 = anInt1787;
					}

					if (var1 > anInt1787) {
						var1 = anInt1787;
					}

					var8 = (var8 << 9) - var34 * var5 + var34;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var29 * var2;
							var5 -= var26 * var2;
							var8 -= var38 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var20 * var0;
							var0 = 0;
						}

						var39 = var2 - centerY;
						var40 += var36 * var39;
						var27 += var28 * var39;
						var31 += var32 * var39;
						if (var29 < var26) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1790[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method920(raster, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var34, var40,
												var27, var31, var35, var41, var37);
										var4 += var29;
										var3 += var20;
										var8 += var38;
										var2 += raster_width;
										var40 += var36;
										var27 += var28;
										var31 += var32;
									}
								}

								method920(raster, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var34, var40, var27,
										var31, var35, var41, var37);
								var4 += var29;
								var5 += var26;
								var8 += var38;
								var2 += raster_width;
								var40 += var36;
								var27 += var28;
								var31 += var32;
							}
						}

						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1790[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method920(raster, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var34, var40,
											var27, var31, var35, var41, var37);
									var4 += var29;
									var3 += var20;
									var8 += var38;
									var2 += raster_width;
									var40 += var36;
									var27 += var28;
									var31 += var32;
								}
							}

							method920(raster, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var34, var40, var27,
									var31, var35, var41, var37);
							var4 += var29;
							var5 += var26;
							var8 += var38;
							var2 += raster_width;
							var40 += var36;
							var27 += var28;
							var31 += var32;
						}
					}

					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var29 * var2;
						var5 -= var26 * var2;
						var8 -= var38 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var20 * var1;
						var1 = 0;
					}

					var39 = var2 - centerY;
					var40 += var36 * var39;
					var27 += var28 * var39;
					var31 += var32 * var39;
					if (var29 < var26) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1790[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method920(raster, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var34, var40,
											var27, var31, var35, var41, var37);
									var4 += var20;
									var5 += var26;
									var8 += var38;
									var2 += raster_width;
									var40 += var36;
									var27 += var28;
									var31 += var32;
								}
							}

							method920(raster, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var34, var40, var27,
									var31, var35, var41, var37);
							var3 += var29;
							var5 += var26;
							var8 += var38;
							var2 += raster_width;
							var40 += var36;
							var27 += var28;
							var31 += var32;
						}
					}

					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1790[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method920(raster, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var34, var40, var27,
										var31, var35, var41, var37);
								var4 += var20;
								var5 += var26;
								var8 += var38;
								var2 += raster_width;
								var40 += var36;
								var27 += var28;
								var31 += var32;
							}
						}

						method920(raster, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var34, var40, var27, var31,
								var35, var41, var37);
						var3 += var29;
						var5 += var26;
						var8 += var38;
						var2 += raster_width;
						var40 += var36;
						var27 += var28;
						var31 += var32;
					}
				}
			}
		}

	}

	static {
		int var0;
		for (var0 = 1; var0 < 512; var0++) {
			anIntArray1794[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; var0++) {
			anIntArray1795[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; var0++) {
			SIN_TABLE[var0] = (int) (Math.sin((double) var0 * 0.0030679615D) * 65536.0D);
			COS_TABLE[var0] = (int) (Math.cos((double) var0 * 0.0030679615D) * 65536.0D);
		}

	}

}
