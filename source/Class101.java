import java.util.Iterator;

public class Class101 implements Iterator {

	DualNode aDualNode752;
	DualNode aDualNode753 = null;
	Class108 aClass108_751;

	public Object next() {
		DualNode var1 = this.aDualNode752;
		if (this.aClass108_751.aDualNode771 == var1) {
			var1 = null;
			this.aDualNode752 = null;
		} else {
			this.aDualNode752 = var1.dualNext;
		}

		this.aDualNode753 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.aDualNode752 != this.aClass108_751.aDualNode771;
	}

	public void remove() {
		if (this.aDualNode753 == null) {
			throw new IllegalStateException();
		} else {
			this.aDualNode753.unlinkDual();
			this.aDualNode753 = null;
		}
	}

	Class101(Class108 var1) {
		this.aClass108_751 = var1;
		this.aDualNode752 = this.aClass108_751.aDualNode771.dualNext;
		this.aDualNode753 = null;
	}

}
