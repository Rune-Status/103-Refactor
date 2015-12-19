import java.util.Iterator;

public class Class97 implements Iterator {

	Node aNode744 = null;
	Node aNode745;
	int anInt746;
	Class107 aClass107_747;

	Class97(Class107 var1) {
		this.aClass107_747 = var1;
		this.method412();
	}

	public Object next() {
		Node var1;
		if (this.aNode745 != this.aClass107_747.aNodeArray768[this.anInt746 - 1]) {
			var1 = this.aNode745;
			this.aNode745 = var1.next;
			this.aNode744 = var1;
			return var1;
		} else {
			do {
				if (this.anInt746 >= this.aClass107_747.anInt770) {
					return null;
				}

				var1 = this.aClass107_747.aNodeArray768[this.anInt746++].next;
			} while (var1 == this.aClass107_747.aNodeArray768[this.anInt746 - 1]);

			this.aNode745 = var1.next;
			this.aNode744 = var1;
			return var1;
		}
	}

	void method412() {
		this.aNode745 = this.aClass107_747.aNodeArray768[0].next;
		this.anInt746 = 1;
		this.aNode744 = null;
	}

	public void remove() {
		if (this.aNode744 == null) {
			throw new IllegalStateException();
		} else {
			this.aNode744.unlink();
			this.aNode744 = null;
		}
	}

	public boolean hasNext() {
		if (this.aNode745 != this.aClass107_747.aNodeArray768[this.anInt746 - 1]) {
			return true;
		} else {
			while (this.anInt746 < this.aClass107_747.anInt770) {
				if (this.aClass107_747.aNodeArray768[this.anInt746++].next != this.aClass107_747.aNodeArray768[this.anInt746
						- 1]) {
					this.aNode745 = this.aClass107_747.aNodeArray768[this.anInt746 - 1].next;
					return true;
				}

				this.aNode745 = this.aClass107_747.aNodeArray768[this.anInt746 - 1];
			}

			return false;
		}
	}
}
