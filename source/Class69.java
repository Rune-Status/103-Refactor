public class Class69 {

	static int[] mapRegionFileIds;

	Class69() throws Throwable {
		throw new Error();
	}

	public static void method328(AbstractIndex var0, int var1, int var2, int var3, boolean var4) {
		Class110.anInt782 = 1;
		Class110.aClass87_783 = var0;
		MusicIndex.musicId = var1;
		Class111.anInt788 = var2;
		Class110.anInt787 = var3;
		Class44.aBool464 = var4;
		Class110.anInt785 = 10000;
	}

	static final void method329(Character var0, int var1) {
		int var2;
		SequenceType var11;
		if (var0.anInt1928 > Client.engineCycle) {
			FriendedPlayer.method408(var0);
		} else {
			int var13;
			int var5;
			int var6;
			int var7;
			if (var0.anInt1947 >= Client.engineCycle) {
				if (var0.anInt1947 == Client.engineCycle || var0.animationId == -1 || var0.animationDelay != 0
						|| var0.anInt1935
								+ 1 > Node_Sub6.getSequenceType(var0.animationId).anIntArray1481[var0.anInt1934]) {
					var2 = var0.anInt1947 - var0.anInt1928;
					var13 = Client.engineCycle - var0.anInt1928;
					var6 = var0.anInt1915 * 64 + var0.anInt1954 * -777033600;
					var7 = var0.anInt1944 * 20962432 + var0.anInt1915 * 64;
					int var12 = var0.anInt1943 * -1235303552 + var0.anInt1915 * 64;
					var5 = var0.anInt1915 * 64 + var0.anInt1924 * 2137051008;
					var0.strictX = (var12 * var13 + (var2 - var13) * var6) / var2;
					var0.strictY = (var5 * var13 + (var2 - var13) * var7) / var2;
				}

				var0.anInt1956 = 0;
				var0.anInt1953 = var0.anInt1948;
				var0.anInt1937 = var0.anInt1953;
			} else {
				var0.anInt1932 = var0.anInt1959;
				if (var0.queueSize == 0) {
					var0.anInt1956 = 0;
				} else {
					label332: {
						if (var0.animationId != -1 && var0.animationDelay == 0) {
							var11 = Node_Sub6.getSequenceType(var0.animationId);
							if (var0.anInt1957 > 0 && var11.anInt1484 == 0) {
								++var0.anInt1956;
								break label332;
							}

							if (var0.anInt1957 <= 0 && var11.anInt1469 == 0) {
								++var0.anInt1956;
								break label332;
							}
						}

						var2 = var0.strictX;
						var13 = var0.strictY;
						var6 = var0.anInt1915 * 64 + var0.anIntArray1945[var0.queueSize - 1] * 128;
						var7 = var0.anInt1915 * 64 + var0.anIntArray1955[var0.queueSize - 1] * 128;
						if (var2 < var6) {
							if (var13 < var7) {
								var0.anInt1953 = -2129414400;
							} else if (var13 > var7) {
								var0.anInt1953 = 1313787136;
							} else {
								var0.anInt1953 = 1739670016;
							}
						} else if (var2 > var6) {
							if (var13 < var7) {
								var0.anInt1953 = -1277648640;
							} else if (var13 <= var7) {
								var0.anInt1953 = -851765760;
							} else {
								var0.anInt1953 = -425882880;
							}
						} else if (var13 < var7) {
							var0.anInt1953 = -1703531520;
						} else if (var13 > var7) {
							var0.anInt1953 = 0;
						}

						byte var131 = var0.aByteArray1951[var0.queueSize - 1];
						if (var6 - var2 <= 256 && var6 - var2 >= -256 && var7 - var13 <= 256 && var7 - var13 >= -256) {
							var5 = var0.anInt1953 * -2061229533 - var0.anInt1937 * -2061229533 & 0x7ff;
							if (var5 > 1024) {
								var5 -= 2048;
							}

							int var9 = var0.anInt1952;
							if (var5 >= -256 && var5 <= 256) {
								var9 = var0.anInt1918;
							} else if (var5 >= 256 && var5 < 768) {
								var9 = var0.anInt1939;
							} else if (var5 >= -768 && var5 <= -256) {
								var9 = var0.anInt1913;
							}

							if (var9 == -1) {
								var9 = var0.anInt1918;
							}

							var0.anInt1932 = var9;
							int var8 = 4;
							boolean var10 = true;
							if (var0 instanceof Npc) {
								var10 = ((Npc) var0).type.aBool1590;
							}

							if (var10) {
								if (var0.anInt1953 * -2061229533 != var0.anInt1937 * -2061229533
										&& var0.targetIndex == -1 && var0.orientation * -2031663291 != 0) {
									var8 = 2;
								}

								if (var0.queueSize > 2) {
									var8 = 6;
								}

								if (var0.queueSize > 3) {
									var8 = 8;
								}

								if (var0.anInt1956 > 0 && var0.queueSize > 1) {
									var8 = 8;
									--var0.anInt1956;
								}
							} else {
								if (var0.queueSize > 1) {
									var8 = 6;
								}

								if (var0.queueSize > 2) {
									var8 = 8;
								}

								if (var0.anInt1956 > 0 && var0.queueSize > 1) {
									var8 = 8;
									--var0.anInt1956;
								}
							}

							if (var131 == 2) {
								var8 <<= 1;
							}

							if (var8 >= 8 && var0.anInt1932 == var0.anInt1918 && var0.anInt1921 != -1) {
								var0.anInt1932 = var0.anInt1921;
							}

							if (var6 != var2 || var13 != var7) {
								if (var2 < var6) {
									var0.strictX += var8;
									if (var0.strictX > var6) {
										var0.strictX = var6;
									}
								} else if (var2 > var6) {
									var0.strictX -= var8;
									if (var0.strictX < var6) {
										var0.strictX = var6;
									}
								}

								if (var13 < var7) {
									var0.strictY += var8;
									if (var0.strictY > var7) {
										var0.strictY = var7;
									}
								} else if (var13 > var7) {
									var0.strictY -= var8;
									if (var0.strictY < var7) {
										var0.strictY = var7;
									}
								}
							}

							if (var0.strictX == var6 && var0.strictY == var7) {
								--var0.queueSize;
								if (var0.anInt1957 > 0) {
									--var0.anInt1957;
								}
							}
						} else {
							var0.strictX = var6;
							var0.strictY = var7;
							--var0.queueSize;
							if (var0.anInt1957 > 0) {
								--var0.anInt1957;
							}
						}
					}
				}
			}
		}

		if (var0.strictX < 128 || var0.strictY < 128 || var0.strictX >= 13184 || var0.strictY >= 13184) {
			var0.animationId = -1;
			var0.graphicsId = -1;
			var0.anInt1928 = 0;
			var0.anInt1947 = 0;
			var0.strictX = var0.anInt1915 * 64 + var0.anIntArray1945[0] * 128;
			var0.strictY = var0.anIntArray1955[0] * 128 + var0.anInt1915 * 64;
			var0.method1016();
		}

		if (Class68.myPlayer == var0
				&& (var0.strictX < 1536 || var0.strictY < 1536 || var0.strictX >= 11776 || var0.strictY >= 11776)) {
			var0.animationId = -1;
			var0.graphicsId = -1;
			var0.anInt1928 = 0;
			var0.anInt1947 = 0;
			var0.strictX = var0.anIntArray1945[0] * 128 + var0.anInt1915 * 64;
			var0.strictY = var0.anIntArray1955[0] * 128 + var0.anInt1915 * 64;
			var0.method1016();
		}

		ChatMessage.method710(var0);
		var0.aBool1919 = false;
		if (var0.anInt1932 != -1) {
			var11 = Node_Sub6.getSequenceType(var0.anInt1932);
			if (var11 != null && var11.anIntArray1474 != null) {
				++var0.anInt1933;
				if (var0.anInt1914 < var11.anIntArray1474.length
						&& var0.anInt1933 > var11.anIntArray1481[var0.anInt1914]) {
					var0.anInt1933 = 1;
					++var0.anInt1914;
					AbstractProducer.method147(var11, var0.anInt1914, var0.strictX, var0.strictY);
				}

				if (var0.anInt1914 >= var11.anIntArray1474.length) {
					var0.anInt1933 = 0;
					var0.anInt1914 = 0;
					AbstractProducer.method147(var11, var0.anInt1914, var0.strictX, var0.strictY);
				}
			} else {
				var0.anInt1932 = -1;
			}
		}

		if (var0.graphicsId != -1 && Client.engineCycle >= var0.graphicsDelay) {
			if (var0.anInt1925 < 0) {
				var0.anInt1925 = 0;
			}

			var2 = Class96_Sub1.getSpotAnimType(var0.graphicsId).anInt1441;
			if (var2 != -1) {
				SequenceType var121 = Node_Sub6.getSequenceType(var2);
				if (var121 != null && var121.anIntArray1474 != null) {
					++var0.anInt1940;
					if (var0.anInt1925 < var121.anIntArray1474.length
							&& var0.anInt1940 > var121.anIntArray1481[var0.anInt1925]) {
						var0.anInt1940 = 1;
						++var0.anInt1925;
						AbstractProducer.method147(var121, var0.anInt1925, var0.strictX, var0.strictY);
					}

					if (var0.anInt1925 >= var121.anIntArray1474.length
							&& (var0.anInt1925 < 0 || var0.anInt1925 >= var121.anIntArray1474.length)) {
						var0.graphicsId = -1;
					}
				} else {
					var0.graphicsId = -1;
				}
			} else {
				var0.graphicsId = -1;
			}
		}

		if (var0.animationId != -1 && var0.animationDelay <= 1) {
			var11 = Node_Sub6.getSequenceType(var0.animationId);
			if (var11.anInt1484 == 1 && var0.anInt1957 > 0 && var0.anInt1928 <= Client.engineCycle
					&& var0.anInt1947 < Client.engineCycle) {
				var0.animationDelay = 1;
				return;
			}
		}

		if (var0.animationId != -1 && var0.animationDelay == 0) {
			var11 = Node_Sub6.getSequenceType(var0.animationId);
			if (var11 != null && var11.anIntArray1474 != null) {
				++var0.anInt1935;
				if (var0.anInt1934 < var11.anIntArray1474.length
						&& var0.anInt1935 > var11.anIntArray1481[var0.anInt1934]) {
					var0.anInt1935 = 1;
					++var0.anInt1934;
					AbstractProducer.method147(var11, var0.anInt1934, var0.strictX, var0.strictY);
				}

				if (var0.anInt1934 >= var11.anIntArray1474.length) {
					var0.anInt1934 -= var11.anInt1477;
					++var0.anInt1958;
					if (var0.anInt1958 >= var11.anInt1483) {
						var0.animationId = -1;
					} else if (var0.anInt1934 >= 0 && var0.anInt1934 < var11.anIntArray1474.length) {
						AbstractProducer.method147(var11, var0.anInt1934, var0.strictX, var0.strictY);
					} else {
						var0.animationId = -1;
					}
				}

				var0.aBool1919 = var11.aBool1475;
			} else {
				var0.animationId = -1;
			}
		}

		if (var0.animationDelay > 0) {
			--var0.animationDelay;
		}

	}

}
