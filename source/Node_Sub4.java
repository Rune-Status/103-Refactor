public abstract class Node_Sub4 extends Node {

	Node_Sub2 aNode_Sub2_1258;
	Node_Sub4 aNode_Sub4_1259;
	int anInt1260;
	volatile boolean aBool1261 = true;

	int method525() {
		return 255;
	}

	protected abstract Node_Sub4 method526();

	protected abstract int method527();

	protected abstract void method528(int var1);

	protected abstract Node_Sub4 method529();

	protected abstract void method530(int[] var1, int var2, int var3);

	final void method531(int[] var1, int var2, int var3) {
		if (this.aBool1261) {
			this.method530(var1, var2, var3);
		} else {
			this.method528(var3);
		}

	}

}
