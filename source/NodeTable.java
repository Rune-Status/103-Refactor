
public final class NodeTable {

	Node aNode274;
	Node[] buckets;
	int index;
	Node aNode275;
	int size = 0;

	public Node get(long var1) {
		Node var3 = this.buckets[(int) (var1 & (long) (this.index - 1))];

		for (this.aNode274 = var3.next; this.aNode274 != var3; this.aNode274 = this.aNode274.next) {
			if (this.aNode274.key == var1) {
				Node var4 = this.aNode274;
				this.aNode274 = this.aNode274.next;
				return var4;
			}
		}

		this.aNode274 = null;
		return null;
	}

	void method149() {
		int var1 = 0;

		while (var1 < this.index) {
			Node var2 = this.buckets[var1];

			while (true) {
				Node var3 = var2.next;
				if (var3 == var2) {
					++var1;
					break;
				}

				var3.unlink();
			}
		}

		this.aNode274 = null;
		this.aNode275 = null;
	}

	public Node method150() {
		this.size = 0;
		return this.method151();
	}

	public Node method151() {
		Node var1;
		if (this.size > 0 && this.aNode275 != this.buckets[this.size - 1]) {
			var1 = this.aNode275;
			this.aNode275 = var1.next;
			return var1;
		} else {
			do {
				if (this.size >= this.index) {
					return null;
				}

				var1 = this.buckets[this.size++].next;
			} while (var1 == this.buckets[this.size - 1]);

			this.aNode275 = var1.next;
			return var1;
		}
	}

	public NodeTable(int var1) {
		this.index = var1;
		this.buckets = new Node[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			Node var2 = this.buckets[var3] = new Node();
			var2.next = var2;
			var2.previous = var2;
		}

	}

	public void put(Node var1, long var2) {
		if (var1.previous != null) {
			var1.unlink();
		}

		Node var4 = this.buckets[(int) (var2 & (long) (this.index - 1))];
		var1.previous = var4.previous;
		var1.next = var4;
		var1.previous.next = var1;
		var1.next.previous = var1;
		var1.key = var2;
	}
}
