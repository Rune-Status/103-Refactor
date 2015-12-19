
public final class Class106 {

	int anInt763;
	NodeTable aNodeTable764;
	int anInt765;
	DualNode aDualNode766 = new DualNode();
	Class105 aClass105_767 = new Class105();

	public DualNode method427(long var1) {
		DualNode var3 = (DualNode) this.aNodeTable764.get(var1);
		if (var3 != null) {
			this.aClass105_767.method425(var3);
		}

		return var3;
	}

	public void method428(DualNode var1, long var2) {
		if (this.anInt765 == 0) {
			DualNode var4 = this.aClass105_767.method423();
			var4.unlink();
			var4.unlinkDual();
			if (var4 == this.aDualNode766) {
				var4 = this.aClass105_767.method423();
				var4.unlink();
				var4.unlinkDual();
			}
		} else {
			--this.anInt765;
		}

		this.aNodeTable764.put(var1, var2);
		this.aClass105_767.method425(var1);
	}

	public void method429() {
		this.aClass105_767.method426();
		this.aNodeTable764.method149();
		this.aDualNode766 = new DualNode();
		this.anInt765 = this.anInt763;
	}

	public Class106(int var1) {
		this.anInt763 = var1;
		this.anInt765 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
			;
		}

		this.aNodeTable764 = new NodeTable(var2);
	}

	public void method430(long var1) {
		DualNode var3 = (DualNode) this.aNodeTable764.get(var1);
		if (var3 != null) {
			var3.unlink();
			var3.unlinkDual();
			++this.anInt765;
		}

	}
}
