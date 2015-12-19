import java.util.Iterator;

public class Class108 implements Iterable {

	public DualNode aDualNode771 = new DualNode();

	public void method434() {
		while (this.aDualNode771.dualNext != this.aDualNode771) {
			this.aDualNode771.dualNext.unlinkDual();
		}

	}

	public void method435(DualNode var1) {
		if (var1.dualPrevious != null) {
			var1.unlinkDual();
		}

		var1.dualPrevious = this.aDualNode771.dualPrevious;
		var1.dualNext = this.aDualNode771;
		var1.dualPrevious.dualNext = var1;
		var1.dualNext.dualPrevious = var1;
	}

	public Iterator iterator() {
		return new Class101(this);
	}

	public Class108() {
		this.aDualNode771.dualNext = this.aDualNode771;
		this.aDualNode771.dualPrevious = this.aDualNode771;
	}
}
