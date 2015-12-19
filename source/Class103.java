import java.util.Iterator;

public class Class103 implements Iterable {

	Node aNode758 = new Node();

	public void method419(Node var1) {
		if (var1.previous != null) {
			var1.unlink();
		}

		var1.previous = this.aNode758.previous;
		var1.next = this.aNode758;
		var1.previous.next = var1;
		var1.next.previous = var1;
	}

	public Node method420() {
		return this.method421((Node) null);
	}

	Node method421(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.aNode758.next;
		} else {
			var2 = var1;
		}

		return var2 == this.aNode758 ? null : var2;
	}

	public Iterator iterator() {
		return new Class104(this);
	}

	public Class103() {
		this.aNode758.next = this.aNode758;
		this.aNode758.previous = this.aNode758;
	}
}
