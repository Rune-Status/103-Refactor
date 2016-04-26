import java.awt.Component;

public class ImplSoundSystem extends AbstractSoundSystem {

	static ISoundSystem system;
	int anInt1209;

	void flush() {
		system.flush(this.anInt1209);
	}

	void create(Component var1) throws Exception {
		system.create(var1, sampleRate, highMemory);
	}

	int size() {
		return system.size(this.anInt1209);
	}

	void close() {
		system.close(this.anInt1209);
	}

	void create(int var1) throws Exception {
		if (var1 > '\u8000') {
			throw new IllegalArgumentException();
		} else {
			system.create(this.anInt1209, var1);
		}
	}

	void write() {
		system.write(this.anInt1209, this.anIntArray160);
	}

	ImplSoundSystem(TaskManager var1, int var2) {
		system = var1.system();
		this.anInt1209 = var2;
	}

}
