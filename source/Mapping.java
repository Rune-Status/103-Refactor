public class Mapping {

	int anInt247;
	int mux;
	int[] submapFloors;
	int[] anIntArray250;

	Mapping() {
		Node_Sub3.getInt(16);
		this.anInt247 = Node_Sub3.getBit() != 0 ? Node_Sub3.getInt(4) + 1 : 1;
		if (Node_Sub3.getBit() != 0) {
			Node_Sub3.getInt(8);
		}

		Node_Sub3.getInt(2);
		if (this.anInt247 > 1) {
			this.mux = Node_Sub3.getInt(4);
		}

		this.submapFloors = new int[this.anInt247];
		this.anIntArray250 = new int[this.anInt247];

		for (int var1 = 0; var1 < this.anInt247; var1++) {
			Node_Sub3.getInt(8);
			this.submapFloors[var1] = Node_Sub3.getInt(8);
			this.anIntArray250[var1] = Node_Sub3.getInt(8);
		}

	}

}
