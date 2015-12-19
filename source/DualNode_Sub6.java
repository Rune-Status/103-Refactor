import java.io.File;
import java.io.RandomAccessFile;

public class DualNode_Sub6 extends DualNode {

	static Class106 aClass106_1504 = new Class106(64);
	protected static int anInt1505;
	public static Class87 aClass87_1506;
	static byte[][][] aByteArrayArrayArray1507;
	public boolean aBool1508 = false;

	void method696(ByteBuf var1) {
		while (true) {
			int var2 = var1.getUByte();
			if (var2 == 0) {
				return;
			}

			this.method697(var1, var2);
		}
	}

	void method697(ByteBuf var1, int var2) {
		if (var2 == 2) {
			this.aBool1508 = true;
		}

	}

	public static void method698() {
		while (true) {
			Deque var0 = Class90.aDeque718;
			Node_Sub9 var1;
			synchronized (var0) {
				var1 = (Node_Sub9) Class90.aDeque717.method469();
			}

			if (var1 == null) {
				return;
			}

			var1.aClass87_Sub1_1337.method560(var1.aClass62_1336, (int) var1.key, var1.aByteArray1340, false);
		}
	}

	public static void method699(Class87 var0, Class87 var1, Class87 var2) {
		DualNode_Sub3.aClass87_1489 = var0;
		DualNode_Sub3.aClass87_1470 = var1;
		DualNode_Sub3.aClass87_1471 = var2;
	}

	static File method700(String var0) {
		if (!Class79.aBool655) {
			throw new RuntimeException("");
		} else {
			File var1 = (File) Class79.aHashtable656.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(Class79.cacheDirectory, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						Class79.aHashtable656.put(var0, var2);
						return var2;
					}
				} catch (Exception var7) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var6) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

}
