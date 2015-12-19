
public class DualNode extends Node {

	public DualNode dualPrevious;
	public DualNode dualNext;

	public void unlinkDual() {
		if (this.dualPrevious != null) {
			this.dualPrevious.dualNext = this.dualNext;
			this.dualNext.dualPrevious = this.dualPrevious;
			this.dualNext = null;
			this.dualPrevious = null;
		}
	}
}
