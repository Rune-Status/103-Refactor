public class Deque {

	Node current;
	public Node tail = new Node();

	public void clear() {
		while (true) {
			Node var1 = this.tail.next;
			if (this.tail == var1) {
				this.current = null;
				return;
			}

			var1.unlink();
		}
	}

	public Deque() {
		this.tail.next = this.tail;
		this.tail.previous = this.tail;
	}

	public static void method468(Node var0, Node var1) {
		if (var0.previous != null) {
			var0.unlink();
		}

		var0.previous = var1.previous;
		var0.next = var1;
		var0.previous.next = var0;
		var0.next.previous = var0;
	}

	public Node popFront() {
		Node var1 = this.tail.next;
		if (this.tail == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	public Node popTail() {
		Node var1 = this.tail.previous;
		if (this.tail == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	public Node getFront() {
		Node var1 = this.tail.next;
		if (this.tail != var1) {
			this.current = var1.next;
			return var1;
		} else {
			this.current = null;
			return null;
		}
	}

	public Node getTail() {
		Node var1 = this.tail.previous;
		if (this.tail != var1) {
			this.current = var1.previous;
			return var1;
		} else {
			this.current = null;
			return null;
		}
	}

	public Node getNext() {
		Node var1 = this.current;
		if (this.tail == var1) {
			this.current = null;
			return null;
		} else {
			this.current = var1.next;
			return var1;
		}
	}

	public void addTail(Node var1) {
		if (var1.previous != null) {
			var1.unlink();
		}

		var1.previous = this.tail;
		var1.next = this.tail.next;
		var1.previous.next = var1;
		var1.next.previous = var1;
	}

	public void addFront(Node var1) {
		if (var1.previous != null) {
			var1.unlink();
		}

		var1.previous = this.tail.previous;
		var1.next = this.tail;
		var1.previous.next = var1;
		var1.next.previous = var1;
	}

	public Node getPrevious() {
		Node var1 = this.current;
		if (this.tail != var1) {
			this.current = var1.previous;
			return var1;
		} else {
			this.current = null;
			return null;
		}
	}

}
