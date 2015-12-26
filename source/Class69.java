
public class Class69 {

	static int[] mapRegionFileIds;

	Class69() throws Throwable {
		throw new Error();
	}

	public static void method328(AbstractIndex var0, int var1, int var2, int var3, boolean var4) {
		Class110.anInt782 = 325298615;
		Class110.aClass87_783 = var0;
		Class98.anInt748 = 18032949 * var1;
		Class111.anInt788 = -832158449 * var2;
		Class110.anInt787 = var3 * 827167249;
		Class44.aBool464 = var4;
		Class110.anInt785 = -1723259600;
	}

	static final void method329(Character var0, int var1) {
		int var2;
		SequenceType var11;
		if (-2112283241 * var0.anInt1928 > -1040073859 * Client.engineCycle) {
			FriendedPlayer.method408(var0);
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0.anInt1947 * -1158366777 >= Client.engineCycle * -1040073859) {
				if (-1158366777 * var0.anInt1947 == Client.engineCycle * -1040073859
						|| var0.animation * -922607859 == -1 || 1301453073 * var0.anInt1936 != 0
						|| var0.anInt1935 * -1968895439 + 1 > Node_Sub6.getSequenceType(var0.animation * -922607859).anIntArray1481[1402685833 * var0.anInt1934]) {
					var2 = var0.anInt1947 * -1158366777 - var0.anInt1928 * -2112283241;
					var4 = -1040073859 * Client.engineCycle - -2112283241 * var0.anInt1928;
					var6 = -2013728192 * var0.anInt1915 + -777033600 * var0.anInt1954;
					var7 = 20962432 * var0.anInt1944 + var0.anInt1915 * -2013728192;
					int var3 = -1235303552 * var0.anInt1943 + -2013728192 * var0.anInt1915;
					var5 = -2013728192 * var0.anInt1915 + var0.anInt1924 * 2137051008;
					var0.strictX = (var3 * var4 + var6 * (var2 - var4)) / var2 * 1705682711;
					var0.strictY = (var5 * var4 + var7 * (var2 - var4)) / var2 * 1421914369;
				}

				var0.anInt1956 = 0;
				var0.anInt1953 = -1269181295 * var0.anInt1948;
				var0.anInt1937 = var0.anInt1953 * -2141141433;
			} else {
				var0.anInt1932 = var0.anInt1959 * 1277708751;
				if (var0.queueSize * 632093179 == 0) {
					var0.anInt1956 = 0;
				} else {
					label446: {
						if (-922607859 * var0.animation != -1 && 1301453073 * var0.anInt1936 == 0) {
							var11 = Node_Sub6.getSequenceType(-922607859 * var0.animation);
							if (-206216795 * var0.anInt1957 > 0 && -1948482873 * var11.anInt1484 == 0) {
								var0.anInt1956 += 1675246587;
								break label446;
							}

							if (var0.anInt1957 * -206216795 <= 0 && -1099577343 * var11.anInt1469 == 0) {
								var0.anInt1956 += 1675246587;
								break label446;
							}
						}

						var2 = var0.strictX * 1272643751;
						var4 = -1801433343 * var0.strictY;
						var6 = var0.anInt1915 * -2013728192 + var0.anIntArray1945[632093179 * var0.queueSize - 1] * 128;
						var7 = -2013728192 * var0.anInt1915 + var0.anIntArray1955[632093179 * var0.queueSize - 1] * 128;
						if (var2 < var6) {
							if (var4 < var7) {
								var0.anInt1953 = -2129414400;
							} else if (var4 > var7) {
								var0.anInt1953 = 1313787136;
							} else {
								var0.anInt1953 = 1739670016;
							}
						} else if (var2 > var6) {
							if (var4 < var7) {
								var0.anInt1953 = -1277648640;
							} else if (var4 <= var7) {
								var0.anInt1953 = -851765760;
							} else {
								var0.anInt1953 = -425882880;
							}
						} else if (var4 < var7) {
							var0.anInt1953 = -1703531520;
						} else if (var4 > var7) {
							var0.anInt1953 = 0;
						}

						byte var12 = var0.aByteArray1951[var0.queueSize * 632093179 - 1];
						if (var6 - var2 <= 256 && var6 - var2 >= -256 && var7 - var4 <= 256 && var7 - var4 >= -256) {
							var5 = -2061229533 * var0.anInt1953 - -2031663291 * var0.anInt1937 & 2047;
							if (var5 > 1024) {
								var5 -= 2048;
							}

							int var9 = var0.anInt1952 * -826106711;
							if (var5 >= -256 && var5 <= 256) {
								var9 = 1481286257 * var0.anInt1918;
							} else if (var5 >= 256 && var5 < 768) {
								var9 = -1453546357 * var0.anInt1939;
							} else if (var5 >= -768 && var5 <= -256) {
								var9 = var0.anInt1913 * -897665047;
							}

							if (var9 == -1) {
								var9 = 1481286257 * var0.anInt1918;
							}

							var0.anInt1932 = var9 * 517768871;
							int var8 = 4;
							boolean var10 = true;
							if (var0 instanceof Npc) {
								var10 = ((Npc) var0).definition.aBool1590;
							}

							if (var10) {
								if (-2061229533 * var0.anInt1953 != -2031663291 * var0.anInt1937
										&& var0.targetIndex * 734924805 == -1 && 1361576967 * var0.orientation != 0) {
									var8 = 2;
								}

								if (var0.queueSize * 632093179 > 2) {
									var8 = 6;
								}

								if (632093179 * var0.queueSize > 3) {
									var8 = 8;
								}

								if (1616877363 * var0.anInt1956 > 0 && var0.queueSize * 632093179 > 1) {
									var8 = 8;
									var0.anInt1956 -= 1675246587;
								}
							} else {
								if (632093179 * var0.queueSize > 1) {
									var8 = 6;
								}

								if (632093179 * var0.queueSize > 2) {
									var8 = 8;
								}

								if (1616877363 * var0.anInt1956 > 0 && var0.queueSize * 632093179 > 1) {
									var8 = 8;
									var0.anInt1956 -= 1675246587;
								}
							}

							if (var12 == 2) {
								var8 <<= 1;
							}

							if (var8 >= 8 && 57983255 * var0.anInt1932 == 1481286257 * var0.anInt1918
									&& -108110871 * var0.anInt1921 != -1) {
								var0.anInt1932 = -1707742465 * var0.anInt1921;
							}

							if (var6 != var2 || var4 != var7) {
								if (var2 < var6) {
									var0.strictX += 1705682711 * var8;
									if (1272643751 * var0.strictX > var6) {
										var0.strictX = var6 * 1705682711;
									}
								} else if (var2 > var6) {
									var0.strictX -= var8 * 1705682711;
									if (var0.strictX * 1272643751 < var6) {
										var0.strictX = 1705682711 * var6;
									}
								}

								if (var4 < var7) {
									var0.strictY += var8 * 1421914369;
									if (-1801433343 * var0.strictY > var7) {
										var0.strictY = var7 * 1421914369;
									}
								} else if (var4 > var7) {
									var0.strictY -= 1421914369 * var8;
									if (var0.strictY * -1801433343 < var7) {
										var0.strictY = 1421914369 * var7;
									}
								}
							}

							if (1272643751 * var0.strictX == var6 && -1801433343 * var0.strictY == var7) {
								var0.queueSize -= 11741491;
								if (var0.anInt1957 * -206216795 > 0) {
									var0.anInt1957 -= 810720813;
								}
							}
						} else {
							var0.strictX = 1705682711 * var6;
							var0.strictY = var7 * 1421914369;
							var0.queueSize -= 11741491;
							if (-206216795 * var0.anInt1957 > 0) {
								var0.anInt1957 -= 810720813;
							}
						}
					}
				}
			}
		}

		if (var0.strictX * 1272643751 < 128 || var0.strictY * -1801433343 < 128 || 1272643751 * var0.strictX >= 13184
				|| -1801433343 * var0.strictY >= 13184) {
			var0.animation = 1587034171;
			var0.anInt1938 = 1738418729;
			var0.anInt1928 = 0;
			var0.anInt1947 = 0;
			var0.strictX = var0.anInt1915 * -1142586432 + var0.anIntArray1945[0] * -715945088;
			var0.strictY = var0.anIntArray1955[0] * 1616412800 + 1467429440 * var0.anInt1915;
			var0.method1016();
		}

		if (var0 == Class68.myPlayer && (var0.strictX * 1272643751 < 1536 || var0.strictY * -1801433343 < 1536
				|| 1272643751 * var0.strictX >= 11776 || -1801433343 * var0.strictY >= 11776)) {
			var0.animation = 1587034171;
			var0.anInt1938 = 1738418729;
			var0.anInt1928 = 0;
			var0.anInt1947 = 0;
			var0.strictX = var0.anIntArray1945[0] * -715945088 + -1142586432 * var0.anInt1915;
			var0.strictY = var0.anIntArray1955[0] * 1616412800 + 1467429440 * var0.anInt1915;
			var0.method1016();
		}

		DualNode_Sub8.method710(var0);
		var0.aBool1919 = false;
		if (var0.anInt1932 * 57983255 != -1) {
			var11 = Node_Sub6.getSequenceType(var0.anInt1932 * 57983255);
			if (var11 != null && var11.anIntArray1474 != null) {
				var0.anInt1933 += 1363672495;
				if (var0.anInt1914 * -1199565973 < var11.anIntArray1474.length
						&& var0.anInt1933 * -1418757809 > var11.anIntArray1481[-1199565973 * var0.anInt1914]) {
					var0.anInt1933 = 1363672495;
					var0.anInt1914 += 1687585091;
					Class20.method147(var11, var0.anInt1914 * -1199565973, var0.strictX * 1272643751,
							-1801433343 * var0.strictY);
				}

				if (-1199565973 * var0.anInt1914 >= var11.anIntArray1474.length) {
					var0.anInt1933 = 0;
					var0.anInt1914 = 0;
					Class20.method147(var11, var0.anInt1914 * -1199565973, var0.strictX * 1272643751,
							-1801433343 * var0.strictY);
				}
			} else {
				var0.anInt1932 = -517768871;
			}
		}

		if (var0.anInt1938 * 1631645159 != -1 && -1040073859 * Client.engineCycle >= var0.anInt1941 * 489022907) {
			if (-1255206495 * var0.anInt1925 < 0) {
				var0.anInt1925 = 0;
			}

			var2 = Class96_Sub1.getSpotAnimType(1631645159 * var0.anInt1938).anInt1441 * -521951217;
			if (var2 != -1) {
				SequenceType var13 = Node_Sub6.getSequenceType(var2);
				if (var13 != null && var13.anIntArray1474 != null) {
					var0.anInt1940 += -1629498229;
					if (var0.anInt1925 * -1255206495 < var13.anIntArray1474.length
							&& 414380835 * var0.anInt1940 > var13.anIntArray1481[var0.anInt1925 * -1255206495]) {
						var0.anInt1940 = -1629498229;
						var0.anInt1925 += 1825378913;
						Class20.method147(var13, var0.anInt1925 * -1255206495, var0.strictX * 1272643751,
								-1801433343 * var0.strictY);
					}

					if (-1255206495 * var0.anInt1925 >= var13.anIntArray1474.length && (var0.anInt1925 * -1255206495 < 0
							|| -1255206495 * var0.anInt1925 >= var13.anIntArray1474.length)) {
						var0.anInt1938 = 1738418729;
					}
				} else {
					var0.anInt1938 = 1738418729;
				}
			} else {
				var0.anInt1938 = 1738418729;
			}
		}

		if (-922607859 * var0.animation != -1 && var0.anInt1936 * 1301453073 <= 1) {
			var11 = Node_Sub6.getSequenceType(var0.animation * -922607859);
			if (-1948482873 * var11.anInt1484 == 1 && var0.anInt1957 * -206216795 > 0
					&& var0.anInt1928 * -2112283241 <= -1040073859 * Client.engineCycle
					&& -1158366777 * var0.anInt1947 < Client.engineCycle * -1040073859) {
				var0.anInt1936 = 1583839217;
				return;
			}
		}

		if (-922607859 * var0.animation != -1 && 1301453073 * var0.anInt1936 == 0) {
			var11 = Node_Sub6.getSequenceType(var0.animation * -922607859);
			if (var11 != null && var11.anIntArray1474 != null) {
				var0.anInt1935 += -1292628271;
				if (1402685833 * var0.anInt1934 < var11.anIntArray1474.length
						&& -1968895439 * var0.anInt1935 > var11.anIntArray1481[var0.anInt1934 * 1402685833]) {
					var0.anInt1935 = -1292628271;
					var0.anInt1934 += -1392640839;
					Class20.method147(var11, var0.anInt1934 * 1402685833, var0.strictX * 1272643751,
							var0.strictY * -1801433343);
				}

				if (var0.anInt1934 * 1402685833 >= var11.anIntArray1474.length) {
					var0.anInt1934 -= 1608002491 * var11.anInt1477;
					var0.anInt1958 += 1464507697;
					if (-1086743599 * var0.anInt1958 >= var11.anInt1483 * -1297434983) {
						var0.animation = 1587034171;
					} else if (var0.anInt1934 * 1402685833 >= 0
							&& 1402685833 * var0.anInt1934 < var11.anIntArray1474.length) {
						Class20.method147(var11, var0.anInt1934 * 1402685833, 1272643751 * var0.strictX,
								var0.strictY * -1801433343);
					} else {
						var0.animation = 1587034171;
					}
				}

				var0.aBool1919 = var11.aBool1475;
			} else {
				var0.animation = 1587034171;
			}
		}

		if (var0.anInt1936 * 1301453073 > 0) {
			var0.anInt1936 -= 1583839217;
		}

	}
}
