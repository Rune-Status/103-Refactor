public final class NodeQueue {

	DualNode current = new DualNode();

	public void setHead(DualNode var1) {
		if (var1.dualPrevious != null) {
			var1.unlinkDual();
		}

		var1.dualPrevious = this.current;
		var1.dualNext = this.current.dualNext;
		var1.dualPrevious.dualNext = var1;
		var1.dualNext.dualPrevious = var1;
	}

	DualNode pop() {
		DualNode var1 = this.current.dualNext;
		if (this.current == var1) {
			return null;
		} else {
			var1.unlinkDual();
			return var1;
		}
	}

	public DualNode peek() {
		DualNode var1 = this.current.dualNext;
		return this.current == var1 ? null : var1;
	}

	public void push(DualNode var1) {
		if (var1.dualPrevious != null) {
			var1.unlinkDual();
		}

		var1.dualPrevious = this.current.dualPrevious;
		var1.dualNext = this.current;
		var1.dualPrevious.dualNext = var1;
		var1.dualNext.dualPrevious = var1;
	}

	void clear() {
		while (true) {
			DualNode var1 = this.current.dualNext;
			if (this.current == var1) {
				return;
			}

			var1.unlinkDual();
		}
	}

	public NodeQueue() {
		this.current.dualNext = this.current;
		this.current.dualPrevious = this.current;
	}

}
