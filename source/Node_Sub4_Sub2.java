
public class Node_Sub4_Sub2 extends Node_Sub4 {

	int anInt1553;
	int anInt1554;
	boolean aBool1555;
	int anInt1556;
	int anInt1557;
	int anInt1558;
	int anInt1559;
	int anInt1560;
	int anInt1561;
	int anInt1562;
	int anInt1563;
	int anInt1564;
	int anInt1565;
	int anInt1566;
	int anInt1567;

	public synchronized void method528(int var1) {
		if (this.anInt1563 > 0) {
			if (var1 >= this.anInt1563) {
				if (this.anInt1561 == Integer.MIN_VALUE) {
					this.anInt1561 = 0;
					this.anInt1559 = 0;
					this.anInt1558 = 0;
					this.anInt1560 = 0;
					this.unlink();
					var1 = this.anInt1563;
				}

				this.anInt1563 = 0;
				this.method739();
			} else {
				this.anInt1560 += this.anInt1565 * var1;
				this.anInt1558 += this.anInt1564 * var1;
				this.anInt1559 += this.anInt1567 * var1;
				this.anInt1563 -= var1;
			}
		}

		Node_Sub2_Sub1 var2 = (Node_Sub2_Sub1) this.aNode_Sub2_1258;
		int var4 = this.anInt1562 << 8;
		int var5 = this.anInt1553 << 8;
		int var7 = var2.aByteArray1543.length << 8;
		int var6 = var5 - var4;
		if (var6 <= 0) {
			this.anInt1566 = 0;
		}

		if (this.anInt1557 < 0) {
			if (this.anInt1554 <= 0) {
				this.method769();
				this.unlink();
				return;
			}

			this.anInt1557 = 0;
		}

		if (this.anInt1557 >= var7) {
			if (this.anInt1554 >= 0) {
				this.method769();
				this.unlink();
				return;
			}

			this.anInt1557 = var7 - 1;
		}

		this.anInt1557 += this.anInt1554 * var1;
		if (this.anInt1566 < 0) {
			if (!this.aBool1555) {
				if (this.anInt1554 < 0) {
					if (this.anInt1557 >= var4) {
						return;
					}

					this.anInt1557 = var5 - 1 - (var5 - 1 - this.anInt1557) % var6;
				} else {
					if (this.anInt1557 < var5) {
						return;
					}

					this.anInt1557 = var4 + (this.anInt1557 - var4) % var6;
				}

			} else {
				if (this.anInt1554 < 0) {
					if (this.anInt1557 >= var4) {
						return;
					}

					this.anInt1557 = var4 + var4 - 1 - this.anInt1557;
					this.anInt1554 = -this.anInt1554;
				}

				while (this.anInt1557 >= var5) {
					this.anInt1557 = var5 + var5 - 1 - this.anInt1557;
					this.anInt1554 = -this.anInt1554;
					if (this.anInt1557 >= var4) {
						return;
					}

					this.anInt1557 = var4 + var4 - 1 - this.anInt1557;
					this.anInt1554 = -this.anInt1554;
				}

			}
		} else {
			if (this.anInt1566 > 0) {
				if (this.aBool1555) {
					label166: {
						if (this.anInt1554 < 0) {
							if (this.anInt1557 >= var4) {
								return;
							}

							this.anInt1557 = var4 + var4 - 1 - this.anInt1557;
							this.anInt1554 = -this.anInt1554;
							if (--this.anInt1566 == 0) {
								break label166;
							}
						}

						do {
							if (this.anInt1557 < var5) {
								return;
							}

							this.anInt1557 = var5 + var5 - 1 - this.anInt1557;
							this.anInt1554 = -this.anInt1554;
							if (--this.anInt1566 == 0) {
								break;
							}

							if (this.anInt1557 >= var4) {
								return;
							}

							this.anInt1557 = var4 + var4 - 1 - this.anInt1557;
							this.anInt1554 = -this.anInt1554;
						} while (--this.anInt1566 != 0);
					}
				} else {
					label176: {
						int var3;
						if (this.anInt1554 < 0) {
							if (this.anInt1557 >= var4) {
								return;
							}

							var3 = (var5 - 1 - this.anInt1557) / var6;
							if (var3 >= this.anInt1566) {
								this.anInt1557 += var6 * this.anInt1566;
								this.anInt1566 = 0;
								break label176;
							}

							this.anInt1557 += var6 * var3;
							this.anInt1566 -= var3;
						} else {
							if (this.anInt1557 < var5) {
								return;
							}

							var3 = (this.anInt1557 - var4) / var6;
							if (var3 >= this.anInt1566) {
								this.anInt1557 -= var6 * this.anInt1566;
								this.anInt1566 = 0;
								break label176;
							}

							this.anInt1557 -= var6 * var3;
							this.anInt1566 -= var3;
						}

						return;
					}
				}
			}

			if (this.anInt1554 < 0) {
				if (this.anInt1557 < 0) {
					this.anInt1557 = -1;
					this.method769();
					this.unlink();
				}
			} else if (this.anInt1557 >= var7) {
				this.anInt1557 = var7;
				this.method769();
				this.unlink();
			}

		}
	}

	static int method736(int var0, int var1) {
		return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
	}

	public static Node_Sub4_Sub2 method737(Node_Sub2_Sub1 var0, int var1, int var2, int var3) {
		return var0.aByteArray1543 != null && var0.aByteArray1543.length != 0
				? new Node_Sub4_Sub2(var0, var1, var2, var3) : null;
	}

	Node_Sub4_Sub2(Node_Sub2_Sub1 var1, int var2, int var3) {
		this.aNode_Sub2_1258 = var1;
		this.anInt1562 = var1.anInt1541;
		this.anInt1553 = var1.anInt1540;
		this.aBool1555 = var1.aBool1539;
		this.anInt1554 = var2;
		this.anInt1561 = var3;
		this.anInt1556 = 8192;
		this.anInt1557 = 0;
		this.method739();
	}

	Node_Sub4_Sub2(Node_Sub2_Sub1 var1, int var2, int var3, int var4) {
		this.aNode_Sub2_1258 = var1;
		this.anInt1562 = var1.anInt1541;
		this.anInt1553 = var1.anInt1540;
		this.aBool1555 = var1.aBool1539;
		this.anInt1554 = var2;
		this.anInt1561 = var3;
		this.anInt1556 = var4;
		this.anInt1557 = 0;
		this.method739();
	}

	static int method738(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9, Node_Sub4_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1557 = var3 << 8;
		return var4 >> 1;
	}

	void method739() {
		this.anInt1560 = this.anInt1561;
		this.anInt1558 = method772(this.anInt1561, this.anInt1556);
		this.anInt1559 = method736(this.anInt1561, this.anInt1556);
	}

	public synchronized void method740(int var1) {
		this.anInt1566 = var1;
	}

	public synchronized void method741(int var1) {
		this.method743(var1 << 6, this.method744());
	}

	synchronized void method742(int var1) {
		this.method743(var1, this.method744());
	}

	synchronized void method743(int var1, int var2) {
		this.anInt1561 = var1;
		this.anInt1556 = var2;
		this.anInt1563 = 0;
		this.method739();
	}

	public synchronized int method744() {
		return this.anInt1556 < 0 ? -1 : this.anInt1556;
	}

	public synchronized void method745(int var1) {
		int var2 = ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.anInt1557 = var1;
	}

	public synchronized void method746(boolean var1) {
		this.anInt1554 = (this.anInt1554 ^ this.anInt1554 >> 31) + (this.anInt1554 >>> 31);
		if (var1) {
			this.anInt1554 = -this.anInt1554;
		}

	}

	public synchronized void method747(int var1, int var2) {
		this.method765(var1, var2, this.method744());
	}

	public synchronized void method748(int var1) {
		if (var1 == 0) {
			this.method742(0);
			this.unlink();
		} else if (this.anInt1558 == 0 && this.anInt1559 == 0) {
			this.anInt1563 = 0;
			this.anInt1561 = 0;
			this.anInt1560 = 0;
			this.unlink();
		} else {
			int var2 = -this.anInt1560;
			if (this.anInt1560 > var2) {
				var2 = this.anInt1560;
			}

			if (-this.anInt1558 > var2) {
				var2 = -this.anInt1558;
			}

			if (this.anInt1558 > var2) {
				var2 = this.anInt1558;
			}

			if (-this.anInt1559 > var2) {
				var2 = -this.anInt1559;
			}

			if (this.anInt1559 > var2) {
				var2 = this.anInt1559;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.anInt1563 = var1;
			this.anInt1561 = Integer.MIN_VALUE;
			this.anInt1565 = -this.anInt1560 / var1;
			this.anInt1564 = -this.anInt1558 / var1;
			this.anInt1567 = -this.anInt1559 / var1;
		}
	}

	public synchronized void method749(int var1) {
		if (this.anInt1554 >= 0) {
			this.anInt1554 = var1;
		} else {
			this.anInt1554 = -var1;
		}

	}

	public boolean method750() {
		return this.anInt1557 < 0
				|| this.anInt1557 >= ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543.length << 8;
	}

	public boolean method751() {
		return this.anInt1563 != 0;
	}

	protected Node_Sub4 method529() {
		return null;
	}

	protected int method527() {
		return this.anInt1561 == 0 && this.anInt1563 == 0 ? 0 : 1;
	}

	protected Node_Sub4 method526() {
		return null;
	}

	public synchronized int method752() {
		return this.anInt1554 >= 0 ? this.anInt1554 : -this.anInt1554;
	}

	int method753(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.anInt1563 > 0) {
				int var6 = var2 + this.anInt1563;
				if (var6 > var4) {
					var6 = var4;
				}

				this.anInt1563 += var2;
				if (this.anInt1554 == 256 && (this.anInt1557 & 0xFF) == 0) {
					if (Class8.aBool166) {
						var2 = method759(0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1,
								this.anInt1557, var2, this.anInt1558, this.anInt1559, this.anInt1564, this.anInt1567, 0,
								var6, var3, this);
					} else {
						var2 = method758(((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
								var2, this.anInt1560, this.anInt1565, 0, var6, var3, this);
					}
				} else if (Class8.aBool166) {
					var2 = method762(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
							var2, this.anInt1558, this.anInt1559, this.anInt1564, this.anInt1567, 0, var6, var3, this,
							this.anInt1554, var5);
				} else {
					var2 = method761(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
							var2, this.anInt1560, this.anInt1565, 0, var6, var3, this, this.anInt1554, var5);
				}

				this.anInt1563 -= var2;
				if (this.anInt1563 != 0) {
					return var2;
				}

				if (!this.method755()) {
					continue;
				}

				return var4;
			}

			if (this.anInt1554 == 256 && (this.anInt1557 & 0xFF) == 0) {
				if (Class8.aBool166) {
					return method738(0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
							var2, this.anInt1558, this.anInt1559, 0, var4, var3, this);
				}

				return method756(((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557, var2,
						this.anInt1560, 0, var4, var3, this);
			}

			if (Class8.aBool166) {
				return method767(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
						var2, this.anInt1558, this.anInt1559, 0, var4, var3, this, this.anInt1554, var5);
			}

			return method757(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557, var2,
					this.anInt1560, 0, var4, var3, this, this.anInt1554, var5);
		}
	}

	int method754(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.anInt1563 > 0) {
				int var6 = var2 + this.anInt1563;
				if (var6 > var4) {
					var6 = var4;
				}

				this.anInt1563 += var2;
				if (this.anInt1554 == -256 && (this.anInt1557 & 0xFF) == 0) {
					if (Class8.aBool166) {
						var2 = method770(0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1,
								this.anInt1557, var2, this.anInt1558, this.anInt1559, this.anInt1564, this.anInt1567, 0,
								var6, var3, this);
					} else {
						var2 = method760(((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
								var2, this.anInt1560, this.anInt1565, 0, var6, var3, this);
					}
				} else if (Class8.aBool166) {
					var2 = method764(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
							var2, this.anInt1558, this.anInt1559, this.anInt1564, this.anInt1567, 0, var6, var3, this,
							this.anInt1554, var5);
				} else {
					var2 = method763(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
							var2, this.anInt1560, this.anInt1565, 0, var6, var3, this, this.anInt1554, var5);
				}

				this.anInt1563 -= var2;
				if (this.anInt1563 != 0) {
					return var2;
				}

				if (!this.method755()) {
					continue;
				}

				return var4;
			}

			if (this.anInt1554 == -256 && (this.anInt1557 & 0xFF) == 0) {
				if (Class8.aBool166) {
					return method775(0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
							var2, this.anInt1558, this.anInt1559, 0, var4, var3, this);
				}

				return method773(((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557, var2,
						this.anInt1560, 0, var4, var3, this);
			}

			if (Class8.aBool166) {
				return method774(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557,
						var2, this.anInt1558, this.anInt1559, 0, var4, var3, this, this.anInt1554, var5);
			}

			return method766(0, 0, ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543, var1, this.anInt1557, var2,
					this.anInt1560, 0, var4, var3, this, this.anInt1554, var5);
		}
	}

	boolean method755() {
		int var1 = this.anInt1561;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method772(var1, this.anInt1556);
			var3 = method736(var1, this.anInt1556);
		}

		if (this.anInt1560 == var1 && this.anInt1558 == var2 && this.anInt1559 == var3) {
			if (this.anInt1561 == Integer.MIN_VALUE) {
				this.anInt1561 = 0;
				this.anInt1559 = 0;
				this.anInt1558 = 0;
				this.anInt1560 = 0;
				this.unlink();
				return true;
			} else {
				this.method739();
				return false;
			}
		} else {
			if (this.anInt1560 < var1) {
				this.anInt1565 = 1;
				this.anInt1563 = var1 - this.anInt1560;
			} else if (this.anInt1560 > var1) {
				this.anInt1565 = -1;
				this.anInt1563 = this.anInt1560 - var1;
			} else {
				this.anInt1565 = 0;
			}

			if (this.anInt1558 < var2) {
				this.anInt1564 = 1;
				if (this.anInt1563 == 0 || this.anInt1563 > var2 - this.anInt1558) {
					this.anInt1563 = var2 - this.anInt1558;
				}
			} else if (this.anInt1558 > var2) {
				this.anInt1564 = -1;
				if (this.anInt1563 == 0 || this.anInt1563 > this.anInt1558 - var2) {
					this.anInt1563 = this.anInt1558 - var2;
				}
			} else {
				this.anInt1564 = 0;
			}

			if (this.anInt1559 < var3) {
				this.anInt1567 = 1;
				if (this.anInt1563 == 0 || this.anInt1563 > var3 - this.anInt1559) {
					this.anInt1563 = var3 - this.anInt1559;
				}
			} else if (this.anInt1559 > var3) {
				this.anInt1567 = -1;
				if (this.anInt1563 == 0 || this.anInt1563 > this.anInt1559 - var3) {
					this.anInt1563 = this.anInt1559 - var3;
				}
			} else {
				this.anInt1567 = 0;
			}

			return false;
		}
	}

	static int method756(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			Node_Sub4_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.anInt1557 = var2 << 8;
		return var3;
	}

	static int method757(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, Node_Sub4_Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.anInt1557 = var4;
		return var5;
	}

	static int method758(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			Node_Sub4_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.anInt1558 += var9.anInt1564 * (var6 - var3);
		var9.anInt1559 += var9.anInt1567 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt1560 = var4 >> 2;
		var9.anInt1557 = var2 << 8;
		return var3;
	}

	static int method759(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, int var11, Node_Sub4_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.anInt1560 += var12.anInt1565 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1558 = var5 >> 2;
		var12.anInt1559 = var6 >> 2;
		var12.anInt1557 = var3 << 8;
		return var4 >> 1;
	}

	static int method760(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
			Node_Sub4_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.anInt1558 += var9.anInt1564 * (var6 - var3);
		var9.anInt1559 += var9.anInt1567 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt1560 = var4 >> 2;
		var9.anInt1557 = var2 << 8;
		return var3;
	}

	static int method761(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, Node_Sub4_Sub2 var11, int var12, int var13) {
		var11.anInt1558 -= var11.anInt1564 * var5;
		var11.anInt1559 -= var11.anInt1567 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt1558 += var11.anInt1564 * var5;
		var11.anInt1559 += var11.anInt1567 * var5;
		var11.anInt1560 = var6;
		var11.anInt1557 = var4;
		return var5;
	}

	static int method762(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, int var11, int var12, Node_Sub4_Sub2 var13, int var14, int var15) {
		var13.anInt1560 -= var13.anInt1565 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1560 += var13.anInt1565 * var5;
		var13.anInt1558 = var6;
		var13.anInt1559 = var7;
		var13.anInt1557 = var4;
		return var5;
	}

	static int method763(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, Node_Sub4_Sub2 var11, int var12, int var13) {
		var11.anInt1558 -= var11.anInt1564 * var5;
		var11.anInt1559 -= var11.anInt1567 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt1558 += var11.anInt1564 * var5;
		var11.anInt1559 += var11.anInt1567 * var5;
		var11.anInt1560 = var6;
		var11.anInt1557 = var4;
		return var5;
	}

	static int method764(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, int var11, int var12, Node_Sub4_Sub2 var13, int var14, int var15) {
		var13.anInt1560 -= var13.anInt1565 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1560 += var13.anInt1565 * var5;
		var13.anInt1558 = var6;
		var13.anInt1559 = var7;
		var13.anInt1557 = var4;
		return var5;
	}

	public synchronized void method765(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method743(var2, var3);
		} else {
			int var6 = method772(var2, var3);
			int var5 = method736(var2, var3);
			if (this.anInt1558 == var6 && this.anInt1559 == var5) {
				this.anInt1563 = 0;
			} else {
				int var4 = var2 - this.anInt1560;
				if (this.anInt1560 - var2 > var4) {
					var4 = this.anInt1560 - var2;
				}

				if (var6 - this.anInt1558 > var4) {
					var4 = var6 - this.anInt1558;
				}

				if (this.anInt1558 - var6 > var4) {
					var4 = this.anInt1558 - var6;
				}

				if (var5 - this.anInt1559 > var4) {
					var4 = var5 - this.anInt1559;
				}

				if (this.anInt1559 - var5 > var4) {
					var4 = this.anInt1559 - var5;
				}

				if (var1 > var4) {
					var1 = var4;
				}

				this.anInt1563 = var1;
				this.anInt1561 = var2;
				this.anInt1556 = var3;
				this.anInt1565 = (var2 - this.anInt1560) / var1;
				this.anInt1564 = (var6 - this.anInt1558) / var1;
				this.anInt1567 = (var5 - this.anInt1559) / var1;
			}
		}
	}

	static int method766(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, Node_Sub4_Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
		}

		var10.anInt1557 = var4;
		return var5;
	}

	static int method767(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, Node_Sub4_Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt1557 = var4;
		return var5 >> 1;
	}

	public synchronized int method768() {
		return this.anInt1561 == Integer.MIN_VALUE ? 0 : this.anInt1561;
	}

	void method769() {
		if (this.anInt1563 != 0) {
			if (this.anInt1561 == Integer.MIN_VALUE) {
				this.anInt1561 = 0;
			}

			this.anInt1563 = 0;
			this.method739();
		}

	}

	static int method770(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, int var11, Node_Sub4_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.anInt1560 += var12.anInt1565 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1558 = var5 >> 2;
		var12.anInt1559 = var6 >> 2;
		var12.anInt1557 = var3 << 8;
		return var4 >> 1;
	}

	int method525() {
		int var1 = this.anInt1560 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.anInt1566 == 0) {
			var1 -= var1 * this.anInt1557 / (((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543.length << 8);
		} else if (this.anInt1566 >= 0) {
			var1 -= var1 * this.anInt1562 / ((Node_Sub2_Sub1) this.aNode_Sub2_1258).aByteArray1543.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	public static Node_Sub4_Sub2 method771(Node_Sub2_Sub1 var0, int var1, int var2) {
		return var0.aByteArray1543 != null && var0.aByteArray1543.length != 0 ? new Node_Sub4_Sub2(var0,
				(int) ((long) var0.anInt1542 * 256L * (long) var1 / (long) (Class8.anInt157 * -956524988)), var2 << 6)
				: null;
	}

	static int method772(int var0, int var1) {
		return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	static int method773(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
			Node_Sub4_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.anInt1557 = var2 << 8;
		return var3;
	}

	static int method774(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8,
			int var9, int var10, Node_Sub4_Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 0xFF);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt1557 = var4;
		return var5 >> 1;
	}

	public synchronized void method530(int[] var1, int var2, int var3) {
		if (this.anInt1561 == 0 && this.anInt1563 == 0) {
			this.method528(var3);
		} else {
			Node_Sub2_Sub1 var4 = (Node_Sub2_Sub1) this.aNode_Sub2_1258;
			int var7 = this.anInt1562 << 8;
			int var6 = this.anInt1553 << 8;
			int var5 = var4.aByteArray1543.length << 8;
			int var8 = var6 - var7;
			if (var8 <= 0) {
				this.anInt1566 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.anInt1557 < 0) {
				if (this.anInt1554 <= 0) {
					this.method769();
					this.unlink();
					return;
				}

				this.anInt1557 = 0;
			}

			if (this.anInt1557 >= var5) {
				if (this.anInt1554 >= 0) {
					this.method769();
					this.unlink();
					return;
				}

				this.anInt1557 = var5 - 1;
			}

			if (this.anInt1566 < 0) {
				if (this.aBool1555) {
					if (this.anInt1554 < 0) {
						var9 = this.method754(var1, var2, var7, var3, var4.aByteArray1543[this.anInt1562]);
						if (this.anInt1557 >= var7) {
							return;
						}

						this.anInt1557 = var7 + var7 - 1 - this.anInt1557;
						this.anInt1554 = -this.anInt1554;
					}

					while (true) {
						var9 = this.method753(var1, var9, var6, var3, var4.aByteArray1543[this.anInt1553 - 1]);
						if (this.anInt1557 < var6) {
							return;
						}

						this.anInt1557 = var6 + var6 - 1 - this.anInt1557;
						this.anInt1554 = -this.anInt1554;
						var9 = this.method754(var1, var9, var7, var3, var4.aByteArray1543[this.anInt1562]);
						if (this.anInt1557 >= var7) {
							return;
						}

						this.anInt1557 = var7 + var7 - 1 - this.anInt1557;
						this.anInt1554 = -this.anInt1554;
					}
				} else if (this.anInt1554 < 0) {
					while (true) {
						var9 = this.method754(var1, var9, var7, var3, var4.aByteArray1543[this.anInt1553 - 1]);
						if (this.anInt1557 >= var7) {
							return;
						}

						this.anInt1557 = var6 - 1 - (var6 - 1 - this.anInt1557) % var8;
					}
				} else {
					while (true) {
						var9 = this.method753(var1, var9, var6, var3, var4.aByteArray1543[this.anInt1562]);
						if (this.anInt1557 < var6) {
							return;
						}

						this.anInt1557 = var7 + (this.anInt1557 - var7) % var8;
					}
				}
			} else {
				if (this.anInt1566 > 0) {
					if (this.aBool1555) {
						label177: {
							if (this.anInt1554 < 0) {
								var9 = this.method754(var1, var2, var7, var3, var4.aByteArray1543[this.anInt1562]);
								if (this.anInt1557 >= var7) {
									return;
								}

								this.anInt1557 = var7 + var7 - 1 - this.anInt1557;
								this.anInt1554 = -this.anInt1554;
								if (--this.anInt1566 == 0) {
									break label177;
								}
							}

							do {
								var9 = this.method753(var1, var9, var6, var3, var4.aByteArray1543[this.anInt1553 - 1]);
								if (this.anInt1557 < var6) {
									return;
								}

								this.anInt1557 = var6 + var6 - 1 - this.anInt1557;
								this.anInt1554 = -this.anInt1554;
								if (--this.anInt1566 == 0) {
									break;
								}

								var9 = this.method754(var1, var9, var7, var3, var4.aByteArray1543[this.anInt1562]);
								if (this.anInt1557 >= var7) {
									return;
								}

								this.anInt1557 = var7 + var7 - 1 - this.anInt1557;
								this.anInt1554 = -this.anInt1554;
							} while (--this.anInt1566 != 0);
						}
					} else {
						int var10;
						if (this.anInt1554 < 0) {
							while (true) {
								var9 = this.method754(var1, var9, var7, var3, var4.aByteArray1543[this.anInt1553 - 1]);
								if (this.anInt1557 >= var7) {
									return;
								}

								var10 = (var6 - 1 - this.anInt1557) / var8;
								if (var10 >= this.anInt1566) {
									this.anInt1557 += var8 * this.anInt1566;
									this.anInt1566 = 0;
									break;
								}

								this.anInt1557 += var8 * var10;
								this.anInt1566 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method753(var1, var9, var6, var3, var4.aByteArray1543[this.anInt1562]);
								if (this.anInt1557 < var6) {
									return;
								}

								var10 = (this.anInt1557 - var7) / var8;
								if (var10 >= this.anInt1566) {
									this.anInt1557 -= var8 * this.anInt1566;
									this.anInt1566 = 0;
									break;
								}

								this.anInt1557 -= var8 * var10;
								this.anInt1566 -= var10;
							}
						}
					}
				}

				if (this.anInt1554 < 0) {
					this.method754(var1, var9, 0, var3, 0);
					if (this.anInt1557 < 0) {
						this.anInt1557 = -1;
						this.method769();
						this.unlink();
					}
				} else {
					this.method753(var1, var9, var5, var3, 0);
					if (this.anInt1557 >= var5) {
						this.anInt1557 = var5;
						this.method769();
						this.unlink();
					}
				}

			}
		}
	}

	static int method775(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8,
			int var9, Node_Sub4_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1557 = var3 << 8;
		return var4 >> 1;
	}
}
