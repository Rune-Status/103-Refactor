import java.util.Iterator;

public class Class104 implements Iterator {

	Node aNode759;
	Class103 aClass103_760;
	Node aNode761 = null;

	public boolean hasNext() {
		return this.aNode759 != this.aClass103_760.aNode758;
	}

	public void remove() {
		if (this.aNode761 != null) {
			this.aNode761.unlink();
			this.aNode761 = null;
		} else {
			throw new IllegalStateException();
		}
	}

	public Object next() {
		Node var1 = this.aNode759;
		if (var1 == this.aClass103_760.aNode758) {
			var1 = null;
			this.aNode759 = null;
		} else {
			this.aNode759 = var1.next;
		}

		this.aNode761 = var1;
		return var1;
	}

	Class104(Class103 var1) {
		this.aClass103_760 = var1;
		this.aNode759 = this.aClass103_760.aNode758.next;
		this.aNode761 = null;
	}
}
