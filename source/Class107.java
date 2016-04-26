import java.util.Iterator;

public final class Class107 implements Iterable {

	Node aNode769;
	int anInt770;
	Node[] aNodeArray768;

	public void method431() {
		for (int var1 = 0; var1 < this.anInt770; var1++) {
			Node var3 = this.aNodeArray768[var1];

			while (true) {
				Node var2 = var3.next;
				if (var2 == var3) {
					break;
				}

				var2.unlink();
			}
		}

		this.aNode769 = null;
	}

	public Node method432(long var1) {
		Node var3 = this.aNodeArray768[(int) ((long) (this.anInt770 - 1) & var1)];

		for (this.aNode769 = var3.next; this.aNode769 != var3; this.aNode769 = this.aNode769.next) {
			if (this.aNode769.key == var1) {
				Node var4 = this.aNode769;
				this.aNode769 = this.aNode769.next;
				return var4;
			}
		}

		this.aNode769 = null;
		return null;
	}

	public void method433(Node var1, long var2) {
		if (var1.previous != null) {
			var1.unlink();
		}

		Node var4 = this.aNodeArray768[(int) ((long) (this.anInt770 - 1) & var2)];
		var1.previous = var4.previous;
		var1.next = var4;
		var1.previous.next = var1;
		var1.next.previous = var1;
		var1.key = var2;
	}

	public Class107(int var1) {
		this.anInt770 = var1;
		this.aNodeArray768 = new Node[var1];

		for (int var2 = 0; var2 < var1; var2++) {
			Node var3 = this.aNodeArray768[var2] = new Node();
			var3.next = var3;
			var3.previous = var3;
		}

	}

	public Iterator iterator() {
		return new Class97(this);
	}

}
