
public class Node_Sub4_Sub3 extends Node_Sub4 {

	Deque aDeque1652 = new Deque();
	Node_Sub4_Sub1 aNode_Sub4_Sub1_1653 = new Node_Sub4_Sub1();
	Node_Sub4_Sub4 aNode_Sub4_Sub4_1654;

	protected Node_Sub4 method526() {
		Node_Sub14 var1 = (Node_Sub14) this.aDeque1652.method471();
		return (Node_Sub4) (var1 == null ? null
				: (var1.aNode_Sub4_Sub2_1394 != null ? var1.aNode_Sub4_Sub2_1394 : this.method529()));
	}

	protected Node_Sub4 method529() {
		Node_Sub14 var1;
		do {
			var1 = (Node_Sub14) this.aDeque1652.method473();
			if (var1 == null) {
				return null;
			}
		} while (var1.aNode_Sub4_Sub2_1394 == null);

		return var1.aNode_Sub4_Sub2_1394;
	}

	protected int method527() {
		return 0;
	}

	protected void method530(int[] var1, int var2, int var3) {
		this.aNode_Sub4_Sub1_1653.method530(var1, var2, var3);

		for (Node_Sub14 var5 = (Node_Sub14) this.aDeque1652
				.method471(); var5 != null; var5 = (Node_Sub14) this.aDeque1652.method473()) {
			if (!this.aNode_Sub4_Sub4_1654.method849(var5)) {
				int var6 = var2;
				int var4 = var3;

				do {
					if (var4 <= var5.anInt1395 * 536968695) {
						this.method825(var5, var1, var6, var4, var6 + var4);
						var5.anInt1395 -= var4 * -1258269753;
						break;
					}

					this.method825(var5, var1, var6, 536968695 * var5.anInt1395, var4 + var6);
					var6 += 536968695 * var5.anInt1395;
					var4 -= 536968695 * var5.anInt1395;
				} while (!this.aNode_Sub4_Sub4_1654.method848(var5, var1, var6, var4));
			}
		}

	}

	protected void method528(int var1) {
		this.aNode_Sub4_Sub1_1653.method528(var1);

		for (Node_Sub14 var2 = (Node_Sub14) this.aDeque1652
				.method471(); var2 != null; var2 = (Node_Sub14) this.aDeque1652.method473()) {
			if (!this.aNode_Sub4_Sub4_1654.method849(var2)) {
				int var3 = var1;

				do {
					if (var3 <= 536968695 * var2.anInt1395) {
						this.method824(var2, var3);
						var2.anInt1395 -= var3 * -1258269753;
						break;
					}

					this.method824(var2, var2.anInt1395 * 536968695);
					var3 -= var2.anInt1395 * 536968695;
				} while (!this.aNode_Sub4_Sub4_1654.method848(var2, (int[]) null, 0, var3));
			}
		}

	}

	void method824(Node_Sub14 var1, int var2) {
		if ((this.aNode_Sub4_Sub4_1654.anIntArray1667[1956904859 * var1.anInt1379] & 4) != 0
				&& var1.anInt1376 * -524941375 < 0) {
			int var3 = this.aNode_Sub4_Sub4_1654.anIntArray1672[1956904859 * var1.anInt1379]
					/ (-954458055 * Class8.anInt157);
			int var4 = (var3 + 1048575 - var1.anInt1388 * -432572087) / var3;
			var1.anInt1388 = -319108871 * (var1.anInt1388 * -432572087 + var3 * var2 & 1048575);
			if (var4 <= var2) {
				if (this.aNode_Sub4_Sub4_1654.anIntArray1663[var1.anInt1379 * 1956904859] != 0) {
					var1.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var1.aNode_Sub2_Sub1_1378,
							var1.aNode_Sub4_Sub2_1394.method752(), 0, var1.aNode_Sub4_Sub2_1394.method744());
					this.aNode_Sub4_Sub4_1654.method840(var1,
							var1.aNode_Sub12_1387.aShortArray1368[1484938015 * var1.anInt1391] < 0);
				} else {
					var1.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var1.aNode_Sub2_Sub1_1378,
							var1.aNode_Sub4_Sub2_1394.method752(), var1.aNode_Sub4_Sub2_1394.method768(),
							var1.aNode_Sub4_Sub2_1394.method744());
				}

				if (var1.aNode_Sub12_1387.aShortArray1368[var1.anInt1391 * 1484938015] < 0) {
					var1.aNode_Sub4_Sub2_1394.method740(-1);
				}

				var2 = var1.anInt1388 * -432572087 / var3;
			}
		}

		var1.aNode_Sub4_Sub2_1394.method528(var2);
	}

	Node_Sub4_Sub3(Node_Sub4_Sub4 var1) {
		this.aNode_Sub4_Sub4_1654 = var1;
	}

	void method825(Node_Sub14 var1, int[] var2, int var3, int var4, int var5) {
		if ((this.aNode_Sub4_Sub4_1654.anIntArray1667[var1.anInt1379 * 1956904859] & 4) != 0
				&& var1.anInt1376 * -524941375 < 0) {
			int var8 = this.aNode_Sub4_Sub4_1654.anIntArray1672[1956904859 * var1.anInt1379]
					/ (-954458055 * Class8.anInt157);

			while (true) {
				int var9 = (var8 + 1048575 - var1.anInt1388 * -432572087) / var8;
				if (var9 > var4) {
					var1.anInt1388 += var8 * var4 * -319108871;
					break;
				}

				var1.aNode_Sub4_Sub2_1394.method530(var2, var3, var9);
				var3 += var9;
				var4 -= var9;
				var1.anInt1388 += (var8 * var9 - 1048576) * -319108871;
				int var7 = -954458055 * Class8.anInt157 / 100;
				int var10 = 262144 / var8;
				if (var10 < var7) {
					var7 = var10;
				}

				Node_Sub4_Sub2 var6 = var1.aNode_Sub4_Sub2_1394;
				if (this.aNode_Sub4_Sub4_1654.anIntArray1663[1956904859 * var1.anInt1379] == 0) {
					var1.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var1.aNode_Sub2_Sub1_1378, var6.method752(),
							var6.method768(), var6.method744());
				} else {
					var1.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var1.aNode_Sub2_Sub1_1378, var6.method752(), 0,
							var6.method744());
					this.aNode_Sub4_Sub4_1654.method840(var1,
							var1.aNode_Sub12_1387.aShortArray1368[var1.anInt1391 * 1484938015] < 0);
					var1.aNode_Sub4_Sub2_1394.method747(var7, var6.method768());
				}

				if (var1.aNode_Sub12_1387.aShortArray1368[1484938015 * var1.anInt1391] < 0) {
					var1.aNode_Sub4_Sub2_1394.method740(-1);
				}

				var6.method748(var7);
				var6.method530(var2, var3, var5 - var3);
				if (var6.method751()) {
					this.aNode_Sub4_Sub1_1653.method729(var6);
				}
			}
		}

		var1.aNode_Sub4_Sub2_1394.method530(var2, var3, var4);
	}
}
