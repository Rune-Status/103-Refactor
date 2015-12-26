import java.awt.datatransfer.Clipboard;
import java.util.zip.CRC32;

public class CacheIndex extends Class87 {

	IndexTable aClass62_1324;
	int anInt1325;
	volatile boolean[] aBoolArray1326;
	boolean aBool1327 = false;
	static CRC32 aCRC32_1328 = new CRC32();
	static Clipboard aClipboard1329;
	volatile boolean aBool1330 = false;
	int crcValue;
	int anInt1332;
	static Class4 aClass4_1333;
	IndexTable aClass62_1334;
	int anInt1335 = 439070177;

	public static int method555(int var0) {
		return var0 >> 17 & 7;
	}

	public int method556() {
		if (this.aBool1330) {
			return 100;
		} else if (this.anObjectArray704 != null) {
			return 99;
		} else {
			int var1 = NpcDefinition.method804(255, -1858370801 * this.anInt1325);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	void method374(int var1, byte var2) {
		int var3 = -1858370801 * this.anInt1325;
		long var4 = (long) (var1 + (var3 << 16));
		DualNode_Sub15 var6 = (DualNode_Sub15) Class81.aNodeTable673.get(var4);
		if (var6 != null) {
			Class81.aClass105_672.method422(var6);
		}

	}

	void method379(int var1, int var2) {
		if (this.aClass62_1334 != null && this.aBoolArray1326 != null && this.aBoolArray1326[var1]) {
			Class59.method292(var1, this.aClass62_1334, this);
		} else {
			Class39.method221(this, -1858370801 * this.anInt1325, var1, this.anIntArray698[var1], (byte) 2, true);
		}

	}

	public void method557(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.aBool1330) {
				throw new RuntimeException();
			}

			if (this.aClass62_1324 != null) {
				int var5 = this.anInt1325 * -1858370801;
				IndexTable var6 = this.aClass62_1324;
				Node_Sub9 var7 = new Node_Sub9();
				var7.anInt1338 = 0;
				var7.key = (long) var5;
				var7.aByteArray1340 = var2;
				var7.aClass62_1336 = var6;
				Deque var8 = Class90.aDeque718;
				synchronized (var8) {
					Class90.aDeque718.method475(var7);
				}

				Object var21 = Class90.anObject720;
				synchronized (var21) {
					if (1638013353 * Class90.anInt719 == 0) {
						IsaacRandom.aClass63_102.method313(new Class90(), 5);
					}

					Class90.anInt719 = 1666340504;
				}
			}

			this.method376(var2);
			this.method558();
		} else {
			var2[var2.length - 2] = (byte) (this.anIntArray707[var1] >> 8);
			var2[var2.length - 1] = (byte) this.anIntArray707[var1];
			if (this.aClass62_1334 != null) {
				IndexTable var17 = this.aClass62_1334;
				Node_Sub9 var18 = new Node_Sub9();
				var18.anInt1338 = 0;
				var18.key = (long) var1;
				var18.aByteArray1340 = var2;
				var18.aClass62_1336 = var17;
				Deque var19 = Class90.aDeque718;
				synchronized (var19) {
					Class90.aDeque718.method475(var18);
				}

				Object var20 = Class90.anObject720;
				synchronized (var20) {
					if (1638013353 * Class90.anInt719 == 0) {
						IsaacRandom.aClass63_102.method313(new Class90(), 5);
					}

					Class90.anInt719 = 1666340504;
				}

				this.aBoolArray1326[var1] = true;
			}

			if (var4) {
				this.anObjectArray704[var1] = Node_Sub6.method538(var2, false);
			}
		}

	}

	void method558() {
		this.aBoolArray1326 = new boolean[this.anObjectArray704.length];

		int var1;
		for (var1 = 0; var1 < this.aBoolArray1326.length; ++var1) {
			this.aBoolArray1326[var1] = false;
		}

		if (this.aClass62_1334 == null) {
			this.aBool1330 = true;
		} else {
			this.anInt1335 = 439070177;

			for (var1 = 0; var1 < this.aBoolArray1326.length; ++var1) {
				if (this.anIntArray702[var1] > 0) {
					IndexTable var2 = this.aClass62_1334;
					Node_Sub9 var4 = new Node_Sub9();
					var4.anInt1338 = -516148383;
					var4.key = (long) var1;
					var4.aClass62_1336 = var2;
					var4.aClass87_Sub1_1337 = this;
					Deque var5 = Class90.aDeque718;
					synchronized (var5) {
						Class90.aDeque718.method475(var4);
					}

					Object var10 = Class90.anObject720;
					synchronized (var10) {
						if (1638013353 * Class90.anInt719 == 0) {
							IsaacRandom.aClass63_102.method313(new Class90(), 5);
						}

						Class90.anInt719 = 1666340504;
					}

					this.anInt1335 = var1 * -439070177;
				}
			}

			if (this.anInt1335 * 1063954911 == -1) {
				this.aBool1330 = true;
			}

		}
	}

	public int method559() {
		int var1 = 0;
		int var3 = 0;

		int var2;
		for (var2 = 0; var2 < this.anObjectArray704.length; ++var2) {
			if (this.anIntArray702[var2] > 0) {
				var1 += 100;
				var3 += this.method562(var2);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var2 = var3 * 100 / var1;
			return var2;
		}
	}

	public CacheIndex(IndexTable var1, IndexTable var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.aClass62_1334 = var1;
		this.aClass62_1324 = var2;
		this.anInt1325 = var3 * 742460399;
		this.aBool1327 = var6;
		int var7 = this.anInt1325 * -1858370801;
		if (Class93.aBuffer731 != null) {
			Class93.aBuffer731.position = -920877945 + -1473404712 * var7;
			int var9 = Class93.aBuffer731.getInt();
			int var10 = Class93.aBuffer731.getInt();
			this.setInformation(var9, var10);
		} else {
			Class39.method221((CacheIndex) null, 255, 255, 0, (byte) 0, true);
			Class81.aClass87_Sub1Array681[var7] = this;
		}

	}

	public static Varpbit getVarpbit(int var0) {
		Varpbit var1 = (Varpbit) Varpbit.aClass106_1726.method427((long) var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Varpbit.aClass87_1727.getFile(14, var0);
			var1 = new Varpbit();
			if (var2 != null) {
				var1.method874(new ByteBuf(var2));
			}

			Varpbit.aClass106_1726.method428(var1, (long) var0);
			return var1;
		}
	}

	void method560(IndexTable var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (this.aClass62_1324 == var1) {
			if (this.aBool1330) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				Class39.method221(this, 255, -1858370801 * this.anInt1325, this.crcValue * 457223413, (byte) 0, true);
				return;
			}

			aCRC32_1328.reset();
			aCRC32_1328.update(var3, 0, var3.length);
			var6 = (int) aCRC32_1328.getValue();
			ByteBuf var7 = new ByteBuf(DualNode_Sub7.method707(var3));
			int var5 = var7.getUByte();
			if (var5 != 5 && var5 != 6) {
				throw new RuntimeException(var5 + "," + this.anInt1325 * -1858370801 + "," + var2);
			}

			int var8 = 0;
			if (var5 >= 6) {
				var8 = var7.getInt();
			}

			if (var6 != 457223413 * this.crcValue || var8 != 1796955907 * this.anInt1332) {
				Class39.method221(this, 255, this.anInt1325 * -1858370801, 457223413 * this.crcValue, (byte) 0, true);
				return;
			}

			this.method376(var3);
			this.method558();
		} else {
			if (!var4 && 1063954911 * this.anInt1335 == var2) {
				this.aBool1330 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.aBoolArray1326[var2] = false;
				if (this.aBool1327 || var4) {
					Class39.method221(this, this.anInt1325 * -1858370801, var2, this.anIntArray698[var2], (byte) 2,
							var4);
				}

				return;
			}

			aCRC32_1328.reset();
			aCRC32_1328.update(var3, 0, var3.length - 2);
			var6 = (int) aCRC32_1328.getValue();
			int var9 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (this.anIntArray698[var2] != var6 || var9 != this.anIntArray707[var2]) {
				this.aBoolArray1326[var2] = false;
				if (this.aBool1327 || var4) {
					Class39.method221(this, -1858370801 * this.anInt1325, var2, this.anIntArray698[var2], (byte) 2,
							var4);
				}

				return;
			}

			this.aBoolArray1326[var2] = true;
			if (var4) {
				this.anObjectArray704[var2] = Node_Sub6.method538(var3, false);
			}
		}

	}

	public void setInformation(int var1, int var2) {
		this.crcValue = -2002673827 * var1;
		this.anInt1332 = -1397521493 * var2;
		if (this.aClass62_1324 != null) {
			Class59.method292(-1858370801 * this.anInt1325, this.aClass62_1324, this);
		} else {
			Class39.method221(this, 255, -1858370801 * this.anInt1325, this.crcValue * 457223413, (byte) 0, true);
		}

	}

	int method562(int var1) {
		return this.anObjectArray704[var1] != null ? 100
				: (this.aBoolArray1326[var1] ? 100 : NpcDefinition.method804(this.anInt1325 * -1858370801, var1));
	}
}
