
public class Node_Sub4_Sub4 extends Node_Sub4 {

	int[] anIntArray1655 = new int[16];
	int anInt1656 = -257763072;
	int anInt1657 = 357779008;
	long aLong1658;
	int[] anIntArray1659 = new int[16];
	int[] anIntArray1660 = new int[16];
	int[] anIntArray1661 = new int[16];
	int[] anIntArray1662 = new int[16];
	int[] anIntArray1663 = new int[16];
	int[] anIntArray1664 = new int[16];
	Node_Sub14[][] aNode_Sub14ArrayArray1665 = new Node_Sub14[16][128];
	int[] anIntArray1666 = new int[16];
	int[] anIntArray1667 = new int[16];
	NodeTable aNodeTable1668 = new NodeTable(128);
	int[] anIntArray1669 = new int[16];
	int[] anIntArray1670 = new int[16];
	int[] anIntArray1671 = new int[16];
	int[] anIntArray1672 = new int[16];
	Node_Sub14[][] aNode_Sub14ArrayArray1673 = new Node_Sub14[16][128];
	int[] anIntArray1674 = new int[16];
	Class80 aClass80_1675 = new Class80();
	boolean aBool1676;
	int anInt1677;
	int anInt1678;
	int[] anIntArray1679 = new int[16];
	long aLong1680;
	Node_Sub4_Sub3 aNode_Sub4_Sub3_1681 = new Node_Sub4_Sub3(this);

	void method826(int var1) {
		if (var1 >= 0) {
			this.anIntArray1674[var1] = 12800;
			this.anIntArray1659[var1] = 8192;
			this.anIntArray1660[var1] = 16383;
			this.anIntArray1664[var1] = 8192;
			this.anIntArray1666[var1] = 0;
			this.anIntArray1679[var1] = 8192;
			this.method841(var1);
			this.method842(var1);
			this.anIntArray1667[var1] = 0;
			this.anIntArray1670[var1] = 32767;
			this.anIntArray1669[var1] = 256;
			this.anIntArray1663[var1] = 0;
			this.method854(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method826(var1);
			}

		}
	}

	public synchronized void method827(int var1) {
		this.anInt1656 = 1844486873 * var1;
	}

	public int method828() {
		return this.anInt1656 * 1321975145;
	}

	public synchronized boolean method829(Node_Sub11 var1, Class87 var2, Class13 var3, int var4) {
		var1.method570();
		boolean var7 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[] { var4 };
		}

		for (Node_Sub15 var8 = (Node_Sub15) var1.aNodeTable1365
				.method150(); var8 != null; var8 = (Node_Sub15) var1.aNodeTable1365.method151()) {
			int var9 = (int) var8.key;
			Node_Sub12 var5 = (Node_Sub12) this.aNodeTable1668.get((long) var9);
			if (var5 == null) {
				byte[] var10 = var2.method378(var9);
				Node_Sub12 var11;
				if (var10 == null) {
					var11 = null;
				} else {
					var11 = new Node_Sub12(var10);
				}

				var5 = var11;
				if (var11 == null) {
					var7 = false;
					continue;
				}

				this.aNodeTable1668.put(var11, (long) var9);
			}

			if (!var5.method574(var3, var8.aByteArray1418, var6)) {
				var7 = false;
			}
		}

		if (var7) {
			var1.method571();
		}

		return var7;
	}

	public synchronized void method830() {
		for (Node_Sub12 var1 = (Node_Sub12) this.aNodeTable1668
				.method150(); var1 != null; var1 = (Node_Sub12) this.aNodeTable1668.method151()) {
			var1.method573();
		}

	}

	public synchronized boolean method831() {
		return this.aClass80_1675.method357();
	}

	public synchronized void method832(int var1, int var2) {
		this.method833(var1, var2);
	}

	void method833(int var1, int var2) {
		this.anIntArray1661[var1] = var2;
		this.anIntArray1655[var1] = var2 & -128;
		this.method834(var1, var2);
	}

	void method834(int var1, int var2) {
		if (this.anIntArray1662[var1] != var2) {
			this.anIntArray1662[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.aNode_Sub14ArrayArray1673[var1][var3] = null;
			}
		}

	}

	int method835(Node_Sub14 var1) {
		Class109 var2 = var1.aClass109_1381;
		int var3 = this.anIntArray1660[1956904859 * var1.anInt1379] * this.anIntArray1674[1956904859 * var1.anInt1379]
				+ 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = 16384 + var1.anInt1382 * -722511999 * var3 >> 15;
		var3 = 1321975145 * this.anInt1656 * var3 + 128 >> 8;
		if (141570201 * var2.anInt773 > 0) {
			var3 = (int) ((double) var3 * Math.pow(0.5D,
					1.953125E-5D * (double) (-1039195515 * var1.anInt1396) * (double) (141570201 * var2.anInt773))
					+ 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.aByteArray772 != null) {
			var7 = var1.anInt1390 * 2008166831;
			var6 = var2.aByteArray772[1 + var1.anInt1389 * 831660161];
			if (var1.anInt1389 * 831660161 < var2.aByteArray772.length - 2) {
				var4 = (var2.aByteArray772[var1.anInt1389 * 831660161] & 255) << 8;
				var5 = (var2.aByteArray772[2 + var1.anInt1389 * 831660161] & 255) << 8;
				var6 += (var2.aByteArray772[3 + 831660161 * var1.anInt1389] - var6) * (var7 - var4) / (var5 - var4);
			}

			var3 = var3 * var6 + 32 >> 6;
		}

		if (var1.anInt1376 * -524941375 > 0 && var2.aByteArray778 != null) {
			var7 = -524941375 * var1.anInt1376;
			var6 = var2.aByteArray778[var1.anInt1377 * 1969966021 + 1];
			if (1969966021 * var1.anInt1377 < var2.aByteArray778.length - 2) {
				var4 = (var2.aByteArray778[var1.anInt1377 * 1969966021] & 255) << 8;
				var5 = (var2.aByteArray778[1969966021 * var1.anInt1377 + 2] & 255) << 8;
				var6 += (var7 - var4) * (var2.aByteArray778[var1.anInt1377 * 1969966021 + 3] - var6) / (var5 - var4);
			}

			var3 = 32 + var6 * var3 >> 6;
		}

		return var3;
	}

	void method836(int var1, int var2, int var3) {
		Node_Sub14 var4 = this.aNode_Sub14ArrayArray1665[var1][var2];
		if (var4 != null) {
			this.aNode_Sub14ArrayArray1665[var1][var2] = null;
			if ((this.anIntArray1667[var1] & 2) != 0) {
				for (Node_Sub14 var5 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652
						.method471(); var5 != null; var5 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652
								.method473()) {
					if (1956904859 * var5.anInt1379 == 1956904859 * var4.anInt1379 && -524941375 * var5.anInt1376 < 0
							&& var5 != var4) {
						var4.anInt1376 = 0;
						break;
					}
				}
			} else {
				var4.anInt1376 = 0;
			}

		}
	}

	void method837(int var1, int var2, int var3) {
	}

	void method838(int var1, int var2) {
		this.anIntArray1664[var1] = var2;
	}

	void method839(int var1) {
		for (Node_Sub14 var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652
				.method471(); var2 != null; var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652.method473()) {
			if (var1 < 0 || var2.anInt1379 * 1956904859 == var1) {
				if (var2.aNode_Sub4_Sub2_1394 != null) {
					var2.aNode_Sub4_Sub2_1394.method748(-954458055 * Class8.anInt157 / 100);
					if (var2.aNode_Sub4_Sub2_1394.method751()) {
						this.aNode_Sub4_Sub3_1681.aNode_Sub4_Sub1_1653.method729(var2.aNode_Sub4_Sub2_1394);
					}

					var2.method575();
				}

				if (-524941375 * var2.anInt1376 < 0) {
					this.aNode_Sub14ArrayArray1665[1956904859 * var2.anInt1379][var2.anInt1391 * 1484938015] = null;
				}

				var2.unlink();
			}
		}

	}

	void method840(Node_Sub14 var1, boolean var2) {
		int var3 = var1.aNode_Sub2_Sub1_1378.aByteArray1543.length;
		int var4;
		if (var2 && var1.aNode_Sub2_Sub1_1378.aBool1539) {
			int var5 = var3 + var3 - var1.aNode_Sub2_Sub1_1378.anInt1541;
			var4 = (int) ((long) this.anIntArray1663[var1.anInt1379 * 1956904859] * (long) var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.aNode_Sub4_Sub2_1394.method746(true);
			}
		} else {
			var4 = (int) ((long) var3 * (long) this.anIntArray1663[var1.anInt1379 * 1956904859] >> 6);
		}

		var1.aNode_Sub4_Sub2_1394.method745(var4);
	}

	void method841(int var1) {
		if ((this.anIntArray1667[var1] & 2) != 0) {
			for (Node_Sub14 var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652
					.method471(); var2 != null; var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652.method473()) {
				if (1956904859 * var2.anInt1379 == var1
						&& this.aNode_Sub14ArrayArray1665[var1][1484938015 * var2.anInt1391] == null
						&& -524941375 * var2.anInt1376 < 0) {
					var2.anInt1376 = 0;
				}
			}
		}

	}

	void method842(int var1) {
		if ((this.anIntArray1667[var1] & 4) != 0) {
			for (Node_Sub14 var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652
					.method471(); var2 != null; var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652.method473()) {
				if (var2.anInt1379 * 1956904859 == var1) {
					var2.anInt1388 = 0;
				}
			}
		}

	}

	void method843(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var4 = var1 >> 16 & 127;
			this.method836(var3, var5, var4);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var4 = var1 >> 16 & 127;
			if (var4 > 0) {
				this.method853(var3, var5, var4);
			} else {
				this.method836(var3, var5, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var4 = var1 >> 16 & 127;
			this.method837(var3, var5, var4);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var4 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.anIntArray1655[var3] = (var4 << 14) + (this.anIntArray1655[var3] & -2080769);
			}

			if (var5 == 32) {
				this.anIntArray1655[var3] = (this.anIntArray1655[var3] & -16257) + (var4 << 7);
			}

			if (var5 == 1) {
				this.anIntArray1666[var3] = (this.anIntArray1666[var3] & -16257) + (var4 << 7);
			}

			if (var5 == 33) {
				this.anIntArray1666[var3] = var4 + (this.anIntArray1666[var3] & -128);
			}

			if (var5 == 5) {
				this.anIntArray1679[var3] = (var4 << 7) + (this.anIntArray1679[var3] & -16257);
			}

			if (var5 == 37) {
				this.anIntArray1679[var3] = var4 + (this.anIntArray1679[var3] & -128);
			}

			if (var5 == 7) {
				this.anIntArray1674[var3] = (this.anIntArray1674[var3] & -16257) + (var4 << 7);
			}

			if (var5 == 39) {
				this.anIntArray1674[var3] = var4 + (this.anIntArray1674[var3] & -128);
			}

			if (var5 == 10) {
				this.anIntArray1659[var3] = (this.anIntArray1659[var3] & -16257) + (var4 << 7);
			}

			if (var5 == 42) {
				this.anIntArray1659[var3] = (this.anIntArray1659[var3] & -128) + var4;
			}

			if (var5 == 11) {
				this.anIntArray1660[var3] = (var4 << 7) + (this.anIntArray1660[var3] & -16257);
			}

			if (var5 == 43) {
				this.anIntArray1660[var3] = (this.anIntArray1660[var3] & -128) + var4;
			}

			if (var5 == 64) {
				if (var4 >= 64) {
					this.anIntArray1667[var3] |= 1;
				} else {
					this.anIntArray1667[var3] &= -2;
				}
			}

			if (var5 == 65) {
				if (var4 >= 64) {
					this.anIntArray1667[var3] |= 2;
				} else {
					this.method841(var3);
					this.anIntArray1667[var3] &= -3;
				}
			}

			if (var5 == 99) {
				this.anIntArray1670[var3] = (this.anIntArray1670[var3] & 127) + (var4 << 7);
			}

			if (var5 == 98) {
				this.anIntArray1670[var3] = (this.anIntArray1670[var3] & 16256) + var4;
			}

			if (var5 == 101) {
				this.anIntArray1670[var3] = (var4 << 7) + (this.anIntArray1670[var3] & 127) + 16384;
			}

			if (var5 == 100) {
				this.anIntArray1670[var3] = (this.anIntArray1670[var3] & 16256) + 16384 + var4;
			}

			if (var5 == 120) {
				this.method839(var3);
			}

			if (var5 == 121) {
				this.method826(var3);
			}

			if (var5 == 123) {
				this.method851(var3);
			}

			int var6;
			if (var5 == 6) {
				var6 = this.anIntArray1670[var3];
				if (var6 == 16384) {
					this.anIntArray1669[var3] = (var4 << 7) + (this.anIntArray1669[var3] & -16257);
				}
			}

			if (var5 == 38) {
				var6 = this.anIntArray1670[var3];
				if (var6 == 16384) {
					this.anIntArray1669[var3] = var4 + (this.anIntArray1669[var3] & -128);
				}
			}

			if (var5 == 16) {
				this.anIntArray1663[var3] = (var4 << 7) + (this.anIntArray1663[var3] & -16257);
			}

			if (var5 == 48) {
				this.anIntArray1663[var3] = var4 + (this.anIntArray1663[var3] & -128);
			}

			if (var5 == 81) {
				if (var4 >= 64) {
					this.anIntArray1667[var3] |= 4;
				} else {
					this.method842(var3);
					this.anIntArray1667[var3] &= -5;
				}
			}

			if (var5 == 17) {
				this.method854(var3, (var4 << 7) + (this.anIntArray1671[var3] & -16257));
			}

			if (var5 == 49) {
				this.method854(var3, var4 + (this.anIntArray1671[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method834(var3, this.anIntArray1655[var3] + var5);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method850(var3, var5);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
			this.method838(var3, var5);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method852();
			}
		}
	}

	public synchronized void method844() {
		for (Node_Sub12 var1 = (Node_Sub12) this.aNodeTable1668
				.method150(); var1 != null; var1 = (Node_Sub12) this.aNodeTable1668.method151()) {
			var1.unlink();
		}

	}

	int method845(Node_Sub14 var1) {
		int var2 = var1.anInt1384 * -744296441 + (-1856256381 * var1.anInt1386 * var1.anInt1385 * 267719497 >> 12);
		var2 += this.anIntArray1669[1956904859 * var1.anInt1379]
				* (this.anIntArray1664[1956904859 * var1.anInt1379] - 8192) >> 12;
		Class109 var3 = var1.aClass109_1381;
		int var4;
		if (var3.anInt780 * 167621977 > 0
				&& (-1320499447 * var3.anInt777 > 0 || this.anIntArray1666[var1.anInt1379 * 1956904859] > 0)) {
			var4 = var3.anInt777 * -1320499447 << 2;
			int var5 = -44265019 * var3.anInt779 << 1;
			if (1779295195 * var1.anInt1392 < var5) {
				var4 = var1.anInt1392 * 1779295195 * var4 / var5;
			}

			var4 += this.anIntArray1666[var1.anInt1379 * 1956904859] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double) (1035944307 * var1.anInt1393 & 511));
			var2 += (int) (var6 * (double) var4);
		}

		var4 = (int) ((double) (256 * var1.aNode_Sub2_Sub1_1378.anInt1542)
				* Math.pow(2.0D, (double) var2 * 3.255208333333333E-4D) / (double) (-954458055 * Class8.anInt157)
				+ 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	int method846(Node_Sub14 var1) {
		int var2 = this.anIntArray1659[1956904859 * var1.anInt1379];
		return var2 >= 8192 ? 16384 - (32 + (16384 - var2) * (128 - var1.anInt1383 * 1621860817) >> 6)
				: 32 + 1621860817 * var1.anInt1383 * var2 >> 6;
	}

	protected synchronized Node_Sub4 method526() {
		return this.aNode_Sub4_Sub3_1681;
	}

	protected synchronized Node_Sub4 method529() {
		return null;
	}

	protected synchronized int method527() {
		return 0;
	}

	protected synchronized void method530(int[] var1, int var2, int var3) {
		if (this.aClass80_1675.method357()) {
			int var5 = this.aClass80_1675.anInt657 * this.anInt1657 * 332692849 / (-954458055 * Class8.anInt157);

			do {
				long var6 = -3956681610824063275L * this.aLong1658 + (long) var5 * (long) var3;
				if (this.aLong1680 * -5392750227611328195L - var6 >= 0L) {
					this.aLong1658 = 6345129286088335997L * var6;
					break;
				}

				int var4 = (int) (((long) var5
						+ (-5392750227611328195L * this.aLong1680 - this.aLong1658 * -3956681610824063275L) - 1L)
						/ (long) var5);
				this.aLong1658 += (long) var4 * (long) var5 * 6345129286088335997L;
				this.aNode_Sub4_Sub3_1681.method530(var1, var2, var4);
				var2 += var4;
				var3 -= var4;
				this.method847();
			} while (this.aClass80_1675.method357());
		}

		this.aNode_Sub4_Sub3_1681.method530(var1, var2, var3);
	}

	protected synchronized void method528(int var1) {
		if (this.aClass80_1675.method357()) {
			int var5 = this.aClass80_1675.anInt657 * this.anInt1657 * 332692849 / (Class8.anInt157 * -954458055);

			do {
				long var3 = (long) var1 * (long) var5 + -3956681610824063275L * this.aLong1658;
				if (-5392750227611328195L * this.aLong1680 - var3 >= 0L) {
					this.aLong1658 = 6345129286088335997L * var3;
					break;
				}

				int var2 = (int) (((long) var5
						+ (-5392750227611328195L * this.aLong1680 - this.aLong1658 * -3956681610824063275L) - 1L)
						/ (long) var5);
				this.aLong1658 += 6345129286088335997L * (long) var2 * (long) var5;
				this.aNode_Sub4_Sub3_1681.method528(var2);
				var1 -= var2;
				this.method847();
			} while (this.aClass80_1675.method357());
		}

		this.aNode_Sub4_Sub3_1681.method528(var1);
	}

	void method847() {
		int var1 = 510598059 * this.anInt1677;
		int var2 = 68475093 * this.anInt1678;

		long var4;
		for (var4 = this.aLong1680 * -5392750227611328195L; var2 == 68475093 * this.anInt1678; var4 = this.aClass80_1675
				.method352(var2)) {
			while (var2 == this.aClass80_1675.anIntArray659[var1]) {
				this.aClass80_1675.method349(var1);
				int var3 = this.aClass80_1675.method356(var1);
				if (var3 == 1) {
					this.aClass80_1675.method359();
					this.aClass80_1675.method350(var1);
					if (this.aClass80_1675.method355()) {
						if (!this.aBool1676 || var2 == 0) {
							this.method852();
							this.aClass80_1675.method347();
							return;
						}

						this.aClass80_1675.method354(var4);
					}
					break;
				}

				if ((var3 & 128) != 0) {
					this.method843(var3);
				}

				this.aClass80_1675.method360(var1);
				this.aClass80_1675.method350(var1);
			}

			var1 = this.aClass80_1675.method353();
			var2 = this.aClass80_1675.anIntArray659[var1];
		}

		this.anInt1677 = 1741883139 * var1;
		this.anInt1678 = 1469685885 * var2;
		this.aLong1680 = var4 * 6966871617677229589L;
	}

	boolean method848(Node_Sub14 var1, int[] var2, int var3, int var4) {
		var1.anInt1395 = Class8.anInt157 * -954458055 / 100 * -1258269753;
		if (-524941375 * var1.anInt1376 >= 0
				&& (var1.aNode_Sub4_Sub2_1394 == null || var1.aNode_Sub4_Sub2_1394.method750())) {
			var1.method575();
			var1.unlink();
			if (var1.anInt1380 * 1587834581 > 0
					&& this.aNode_Sub14ArrayArray1673[1956904859 * var1.anInt1379][var1.anInt1380
							* 1587834581] == var1) {
				this.aNode_Sub14ArrayArray1673[var1.anInt1379 * 1956904859][1587834581 * var1.anInt1380] = null;
			}

			return true;
		} else {
			int var8 = -1856256381 * var1.anInt1386;
			if (var8 > 0) {
				var8 -= (int) (16.0D
						* Math.pow(2.0D,
								4.921259842519685E-4D * (double) this.anIntArray1679[var1.anInt1379 * 1956904859])
						+ 0.5D);
				if (var8 < 0) {
					var8 = 0;
				}

				var1.anInt1386 = -723306453 * var8;
			}

			var1.aNode_Sub4_Sub2_1394.method749(this.method845(var1));
			Class109 var7 = var1.aClass109_1381;
			boolean var9 = false;
			var1.anInt1392 += -1674092461;
			var1.anInt1393 += -2024797437 * var7.anInt780;
			double var5 = 5.086263020833333E-6D
					* (double) ((var1.anInt1386 * -1856256381 * var1.anInt1385 * 267719497 >> 12)
							+ (1484938015 * var1.anInt1391 - 60 << 8));
			if (141570201 * var7.anInt773 > 0) {
				if (699672919 * var7.anInt776 > 0) {
					var1.anInt1396 += (int) (128.0D * Math.pow(2.0D, var5 * (double) (699672919 * var7.anInt776))
							+ 0.5D) * 1412269645;
				} else {
					var1.anInt1396 += 381888128;
				}
			}

			if (var7.aByteArray772 != null) {
				if (var7.anInt774 * -418698837 > 0) {
					var1.anInt1390 += (int) (128.0D * Math.pow(2.0D, (double) (var7.anInt774 * -418698837) * var5)
							+ 0.5D) * 560579919;
				} else {
					var1.anInt1390 += -1260214400;
				}

				while (831660161 * var1.anInt1389 < var7.aByteArray772.length - 2 && 2008166831
						* var1.anInt1390 > (var7.aByteArray772[831660161 * var1.anInt1389 + 2] & 255) << 8) {
					var1.anInt1389 += -1193525502;
				}

				if (831660161 * var1.anInt1389 == var7.aByteArray772.length - 2
						&& var7.aByteArray772[1 + 831660161 * var1.anInt1389] == 0) {
					var9 = true;
				}
			}

			if (var1.anInt1376 * -524941375 >= 0 && var7.aByteArray778 != null
					&& (this.anIntArray1667[var1.anInt1379 * 1956904859] & 1) == 0
					&& (var1.anInt1380 * 1587834581 < 0
							|| var1 != this.aNode_Sub14ArrayArray1673[1956904859 * var1.anInt1379][1587834581
									* var1.anInt1380])) {
				if (var7.anInt775 * -370360363 > 0) {
					var1.anInt1376 += (int) (128.0D * Math.pow(2.0D, var5 * (double) (-370360363 * var7.anInt775))
							+ 0.5D) * -200669119;
				} else {
					var1.anInt1376 += 84156544;
				}

				while (1969966021 * var1.anInt1377 < var7.aByteArray778.length - 2 && var1.anInt1376
						* -524941375 > (var7.aByteArray778[2 + var1.anInt1377 * 1969966021] & 255) << 8) {
					var1.anInt1377 += 617608730;
				}

				if (var7.aByteArray778.length - 2 == var1.anInt1377 * 1969966021) {
					var9 = true;
				}
			}

			if (var9) {
				var1.aNode_Sub4_Sub2_1394.method748(536968695 * var1.anInt1395);
				if (var2 != null) {
					var1.aNode_Sub4_Sub2_1394.method530(var2, var3, var4);
				} else {
					var1.aNode_Sub4_Sub2_1394.method528(var4);
				}

				if (var1.aNode_Sub4_Sub2_1394.method751()) {
					this.aNode_Sub4_Sub3_1681.aNode_Sub4_Sub1_1653.method729(var1.aNode_Sub4_Sub2_1394);
				}

				var1.method575();
				if (-524941375 * var1.anInt1376 >= 0) {
					var1.unlink();
					if (1587834581 * var1.anInt1380 > 0
							&& var1 == this.aNode_Sub14ArrayArray1673[var1.anInt1379 * 1956904859][var1.anInt1380
									* 1587834581]) {
						this.aNode_Sub14ArrayArray1673[var1.anInt1379 * 1956904859][var1.anInt1380 * 1587834581] = null;
					}
				}

				return true;
			} else {
				var1.aNode_Sub4_Sub2_1394.method765(var1.anInt1395 * 536968695, this.method835(var1),
						this.method846(var1));
				return false;
			}
		}
	}

	boolean method849(Node_Sub14 var1) {
		if (var1.aNode_Sub4_Sub2_1394 == null) {
			if (-524941375 * var1.anInt1376 >= 0) {
				var1.unlink();
				if (var1.anInt1380 * 1587834581 > 0
						&& this.aNode_Sub14ArrayArray1673[var1.anInt1379 * 1956904859][1587834581
								* var1.anInt1380] == var1) {
					this.aNode_Sub14ArrayArray1673[1956904859 * var1.anInt1379][1587834581 * var1.anInt1380] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	void method850(int var1, int var2) {
	}

	void method851(int var1) {
		for (Node_Sub14 var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652
				.method471(); var2 != null; var2 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652.method473()) {
			if ((var1 < 0 || var1 == var2.anInt1379 * 1956904859) && -524941375 * var2.anInt1376 < 0) {
				this.aNode_Sub14ArrayArray1665[1956904859 * var2.anInt1379][var2.anInt1391 * 1484938015] = null;
				var2.anInt1376 = 0;
			}
		}

	}

	void method852() {
		this.method839(-1);
		this.method826(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.anIntArray1662[var1] = this.anIntArray1661[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.anIntArray1655[var1] = this.anIntArray1661[var1] & -128;
		}

	}

	void method853(int var1, int var2, int var3) {
		this.method836(var1, var2, 64);
		if ((this.anIntArray1667[var1] & 2) != 0) {
			for (Node_Sub14 var4 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652
					.method472(); var4 != null; var4 = (Node_Sub14) this.aNode_Sub4_Sub3_1681.aDeque1652.method476()) {
				if (var4.anInt1379 * 1956904859 == var1 && var4.anInt1376 * -524941375 < 0) {
					this.aNode_Sub14ArrayArray1665[var1][1484938015 * var4.anInt1391] = null;
					this.aNode_Sub14ArrayArray1665[var1][var2] = var4;
					int var6 = var4.anInt1384 * -744296441
							+ (267719497 * var4.anInt1385 * -1856256381 * var4.anInt1386 >> 12);
					var4.anInt1384 += (var2 - var4.anInt1391 * 1484938015 << 8) * -1554678345;
					var4.anInt1385 = (var6 - -744296441 * var4.anInt1384) * -1732227335;
					var4.anInt1386 = 864202752;
					var4.anInt1391 = 1507418335 * var2;
					return;
				}
			}
		}

		Node_Sub12 var8 = (Node_Sub12) this.aNodeTable1668.get((long) this.anIntArray1662[var1]);
		if (var8 != null) {
			Node_Sub2_Sub1 var9 = var8.aNode_Sub2_Sub1Array1374[var2];
			if (var9 != null) {
				Node_Sub14 var7 = new Node_Sub14();
				var7.anInt1379 = var1 * 210325139;
				var7.aNode_Sub12_1387 = var8;
				var7.aNode_Sub2_Sub1_1378 = var9;
				var7.aClass109_1381 = var8.aClass109Array1370[var2];
				var7.anInt1380 = -1790748035 * var8.aByteArray1371[var2];
				var7.anInt1391 = var2 * 1507418335;
				var7.anInt1382 = (var8.aByteArray1372[var2] * var8.anInt1367 * -822371327 * var3 * var3 + 1024 >> 11)
						* -1743198079;
				var7.anInt1383 = (var8.aByteArray1369[var2] & 255) * -626501839;
				var7.anInt1384 = -1554678345 * ((var2 << 8) - (var8.aShortArray1368[var2] & 32767));
				var7.anInt1396 = 0;
				var7.anInt1390 = 0;
				var7.anInt1389 = 0;
				var7.anInt1376 = 200669119;
				var7.anInt1377 = 0;
				if (this.anIntArray1663[var1] == 0) {
					var7.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var9, this.method845(var7),
							this.method835(var7), this.method846(var7));
				} else {
					var7.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var9, this.method845(var7), 0,
							this.method846(var7));
					this.method840(var7, var8.aShortArray1368[var2] < 0);
				}

				if (var8.aShortArray1368[var2] < 0) {
					var7.aNode_Sub4_Sub2_1394.method740(-1);
				}

				if (1587834581 * var7.anInt1380 >= 0) {
					Node_Sub14 var5 = this.aNode_Sub14ArrayArray1673[var1][1587834581 * var7.anInt1380];
					if (var5 != null && -524941375 * var5.anInt1376 < 0) {
						this.aNode_Sub14ArrayArray1665[var1][var5.anInt1391 * 1484938015] = null;
						var5.anInt1376 = 0;
					}

					this.aNode_Sub14ArrayArray1673[var1][1587834581 * var7.anInt1380] = var7;
				}

				this.aNode_Sub4_Sub3_1681.aDeque1652.method475(var7);
				this.aNode_Sub14ArrayArray1665[var1][var2] = var7;
			}
		}
	}

	void method854(int var1, int var2) {
		this.anIntArray1671[var1] = var2;
		this.anIntArray1672[var1] = (int) (2097152.0D * Math.pow(2.0D, (double) var2 * 5.4931640625E-4D) + 0.5D);
	}

	public synchronized void method855(Node_Sub11 var1, boolean var2) {
		this.method856();
		this.aClass80_1675.method346(var1.aByteArray1366);
		this.aBool1676 = var2;
		this.aLong1658 = 0L;
		int var4 = this.aClass80_1675.method348();

		for (int var3 = 0; var3 < var4; ++var3) {
			this.aClass80_1675.method349(var3);
			this.aClass80_1675.method360(var3);
			this.aClass80_1675.method350(var3);
		}

		this.anInt1677 = this.aClass80_1675.method353() * 1741883139;
		this.anInt1678 = this.aClass80_1675.anIntArray659[this.anInt1677 * 510598059] * 1469685885;
		this.aLong1680 = this.aClass80_1675.method352(68475093 * this.anInt1678) * 6966871617677229589L;
	}

	public synchronized void method856() {
		this.aClass80_1675.method347();
		this.method852();
	}

	public Node_Sub4_Sub4() {
		this.method852();
	}
}
