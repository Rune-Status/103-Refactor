
public final class NodeQueue {

	DualNode aDualNode762 = new DualNode();

	public void method422(DualNode var1) {
		if (var1.dualPrevious != null) {
			var1.unlinkDual();
		}

		var1.dualPrevious = this.aDualNode762;
		var1.dualNext = this.aDualNode762.dualNext;
		var1.dualPrevious.dualNext = var1;
		var1.dualNext.dualPrevious = var1;
	}

	DualNode method423() {
		DualNode var1 = this.aDualNode762.dualNext;
		if (var1 == this.aDualNode762) {
			return null;
		} else {
			var1.unlinkDual();
			return var1;
		}
	}

	public DualNode method424() {
		DualNode var1 = this.aDualNode762.dualNext;
		return var1 == this.aDualNode762 ? null : var1;
	}

	public void method425(DualNode var1) {
		if (var1.dualPrevious != null) {
			var1.unlinkDual();
		}

		var1.dualPrevious = this.aDualNode762.dualPrevious;
		var1.dualNext = this.aDualNode762;
		var1.dualPrevious.dualNext = var1;
		var1.dualNext.dualPrevious = var1;
	}

	void method426() {
		while (true) {
			DualNode var1 = this.aDualNode762.dualNext;
			if (var1 == this.aDualNode762) {
				return;
			}

			var1.unlinkDual();
		}
	}

	public NodeQueue() {
		this.aDualNode762.dualNext = this.aDualNode762;
		this.aDualNode762.dualPrevious = this.aDualNode762;
	}
}
