import java.awt.Component;

public class Class8_Sub1 extends Class8 {

	int anInt1209;
	static Interface2 anInterface2_1210;

	void method80() {
		anInterface2_1210.method6(this.anInt1209);
	}

	void method87(Component var1) throws Exception {
		anInterface2_1210.method5(var1, anInt157 * -954458055, aBool166);
	}

	int method89() {
		return anInterface2_1210.method2(this.anInt1209);
	}

	void method93() {
		anInterface2_1210.method4(this.anInt1209);
	}

	void method88(int var1) throws Exception {
		if (var1 > '\u8000') {
			throw new IllegalArgumentException();
		} else {
			anInterface2_1210.method1(this.anInt1209, var1);
		}
	}

	void method90() {
		anInterface2_1210.method3(this.anInt1209, this.anIntArray160);
	}

	Class8_Sub1(TaskManager var1, int var2) {
		anInterface2_1210 = var1.method310();
		this.anInt1209 = var2;
	}
}
