public class Node {

	public long key;
	public Node next;
	Node previous;

	public boolean hasPrevious() {
		return this.previous != null;
	}

	public void unlink() {
		if (this.previous != null) {
			this.previous.next = this.next;
			this.next.previous = this.previous;
			this.next = null;
			this.previous = null;
		}

	}

}
