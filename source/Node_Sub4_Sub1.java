
public class Node_Sub4_Sub1 extends Node_Sub4 {

	Deque aDeque1549 = new Deque();
	Deque aDeque1550 = new Deque();
	int anInt1551 = 0;
	int anInt1552 = -1;

	public final synchronized void method729(Node_Sub4 var1) {
		this.aDeque1549.method474(var1);
	}

	public final synchronized void method730(Node_Sub4 var1) {
		var1.unlink();
	}

	void method731() {
		if (this.anInt1551 > 0) {
			for (Node_Sub1 var1 = (Node_Sub1) this.aDeque1550
					.getFront(); var1 != null; var1 = (Node_Sub1) this.aDeque1550.getNext()) {
				var1.anInt1211 -= this.anInt1551;
			}

			this.anInt1552 -= this.anInt1551;
			this.anInt1551 = 0;
		}

	}

	void method732(Node var1, Node_Sub1 var2) {
		while (var1 != this.aDeque1550.head && ((Node_Sub1) var1).anInt1211 <= var2.anInt1211) {
			var1 = var1.next;
		}

		Deque.method468(var2, var1);
		this.anInt1552 = ((Node_Sub1) this.aDeque1550.head.next).anInt1211;
	}

	protected Node_Sub4 method526() {
		return (Node_Sub4) this.aDeque1549.getFront();
	}

	protected Node_Sub4 method529() {
		return (Node_Sub4) this.aDeque1549.getNext();
	}

	protected int method527() {
		return 0;
	}

	public final synchronized void method530(int[] var1, int var2, int var3) {
		do {
			if (this.anInt1552 < 0) {
				this.method735(var1, var2, var3);
				return;
			}

			if (this.anInt1551 + var3 < this.anInt1552) {
				this.anInt1551 += var3;
				this.method735(var1, var2, var3);
				return;
			}

			int var4 = this.anInt1552 - this.anInt1551;
			this.method735(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.anInt1551 += var4;
			this.method731();
			Node_Sub1 var5 = (Node_Sub1) this.aDeque1550.getFront();
			synchronized (var5) {
				int var7 = var5.method507(this);
				if (var7 < 0) {
					var5.anInt1211 = 0;
					this.method734(var5);
				} else {
					var5.anInt1211 = var7;
					this.method732(var5.next, var5);
				}
			}
		} while (var3 != 0);

	}

	public final synchronized void method528(int var1) {
		do {
			if (this.anInt1552 < 0) {
				this.method733(var1);
				return;
			}

			if (this.anInt1551 + var1 < this.anInt1552) {
				this.anInt1551 += var1;
				this.method733(var1);
				return;
			}

			int var2 = this.anInt1552 - this.anInt1551;
			this.method733(var2);
			var1 -= var2;
			this.anInt1551 += var2;
			this.method731();
			Node_Sub1 var3 = (Node_Sub1) this.aDeque1550.getFront();
			synchronized (var3) {
				int var5 = var3.method507(this);
				if (var5 < 0) {
					var3.anInt1211 = 0;
					this.method734(var3);
				} else {
					var3.anInt1211 = var5;
					this.method732(var3.next, var3);
				}
			}
		} while (var1 != 0);

	}

	void method733(int var1) {
		for (Node_Sub4 var2 = (Node_Sub4) this.aDeque1549.getFront(); var2 != null; var2 = (Node_Sub4) this.aDeque1549
				.getNext()) {
			var2.method528(var1);
		}

	}

	void method734(Node_Sub1 var1) {
		var1.unlink();
		var1.method506();
		Node var2 = this.aDeque1550.head.next;
		if (var2 == this.aDeque1550.head) {
			this.anInt1552 = -1;
		} else {
			this.anInt1552 = ((Node_Sub1) var2).anInt1211;
		}

	}

	void method735(int[] var1, int var2, int var3) {
		for (Node_Sub4 var4 = (Node_Sub4) this.aDeque1549.getFront(); var4 != null; var4 = (Node_Sub4) this.aDeque1549
				.getNext()) {
			var4.method531(var1, var2, var3);
		}

	}
}
