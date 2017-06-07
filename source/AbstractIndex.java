import java.io.File;
import java.io.RandomAccessFile;

public abstract class AbstractIndex {

	boolean aBool708;
	boolean aBool700;
	public int crc;
	int anInt709;
	int[] anIntArray703;
	int[] anIntArray698;
	int[] anIntArray707;
	int[] anIntArray702;
	int[][] childEntries;
	Object[] anObjectArray704;
	Object[][] anObjectArrayArray705;
	int[] anIntArray696;
	Class99 aClass99_697;
	int[][] anIntArrayArray706;
	Class99[] aClass99Array694;
	static GZipDecompressor gzip = new GZipDecompressor();
	static int anInt710 = 0;

	AbstractIndex(boolean var1, boolean var2) {
		this.aBool708 = var1;
		this.aBool700 = var2;
	}

	void method374(int var1, byte var2) {
	}

	public byte[] method375(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.anObjectArrayArray705.length && this.anObjectArrayArray705[var1] != null
				&& var2 >= 0 && var2 < this.anObjectArrayArray705[var1].length) {
			if (this.anObjectArrayArray705[var1][var2] == null) {
				boolean var5 = this.method382(var1, var3);
				if (!var5) {
					this.method379(var1);
					var5 = this.method382(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var51 = GroundItem.toByteArray(this.anObjectArrayArray705[var1][var2], false);
			if (this.aBool700) {
				this.anObjectArrayArray705[var1][var2] = null;
			}

			return var51;
		} else {
			return null;
		}
	}

	void method376(byte[] var1) {
		int var2 = var1.length;
		int var7 = LoginHandler.getCrc(var1, 0, var2);
		this.crc = var7;
		ByteBuf var3 = new ByteBuf(UnderlayType.decodeContainer(var1));
		int var6 = var3.getUByte();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var3.getInt();
			}

			int var12 = var3.getUByte();
			if (var6 >= 7) {
				this.anInt709 = var3.getLargeSmart();
			} else {
				this.anInt709 = var3.getUShort();
			}

			int var14 = 0;
			int var5 = -1;
			this.anIntArray703 = new int[this.anInt709];
			int var4;
			if (var6 >= 7) {
				for (var4 = 0; var4 < this.anInt709; var4++) {
					this.anIntArray703[var4] = var14 += var3.getLargeSmart();
					if (this.anIntArray703[var4] > var5) {
						var5 = this.anIntArray703[var4];
					}
				}
			} else {
				for (var4 = 0; var4 < this.anInt709; var4++) {
					this.anIntArray703[var4] = var14 += var3.getUShort();
					if (this.anIntArray703[var4] > var5) {
						var5 = this.anIntArray703[var4];
					}
				}
			}

			this.anIntArray698 = new int[var5 + 1];
			this.anIntArray707 = new int[var5 + 1];
			this.anIntArray702 = new int[var5 + 1];
			this.childEntries = new int[var5 + 1][];
			this.anObjectArray704 = new Object[var5 + 1];
			this.anObjectArrayArray705 = new Object[var5 + 1][];
			if (var12 != 0) {
				this.anIntArray696 = new int[var5 + 1];

				for (var4 = 0; var4 < this.anInt709; var4++) {
					this.anIntArray696[this.anIntArray703[var4]] = var3.getInt();
				}

				this.aClass99_697 = new Class99(this.anIntArray696);
			}

			for (var4 = 0; var4 < this.anInt709; var4++) {
				this.anIntArray698[this.anIntArray703[var4]] = var3.getInt();
			}

			for (var4 = 0; var4 < this.anInt709; var4++) {
				this.anIntArray707[this.anIntArray703[var4]] = var3.getInt();
			}

			for (var4 = 0; var4 < this.anInt709; var4++) {
				this.anIntArray702[this.anIntArray703[var4]] = var3.getUShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var13;
			if (var6 >= 7) {
				for (var4 = 0; var4 < this.anInt709; var4++) {
					var8 = this.anIntArray703[var4];
					var9 = this.anIntArray702[var8];
					var14 = 0;
					var10 = -1;
					this.childEntries[var8] = new int[var9];

					for (var13 = 0; var13 < var9; var13++) {
						var11 = this.childEntries[var8][var13] = var14 += var3.getLargeSmart();
						if (var11 > var10) {
							var10 = var11;
						}
					}

					this.anObjectArrayArray705[var8] = new Object[var10 + 1];
				}
			} else {
				for (var4 = 0; var4 < this.anInt709; var4++) {
					var8 = this.anIntArray703[var4];
					var9 = this.anIntArray702[var8];
					var14 = 0;
					var10 = -1;
					this.childEntries[var8] = new int[var9];

					for (var13 = 0; var13 < var9; var13++) {
						var11 = this.childEntries[var8][var13] = var14 += var3.getUShort();
						if (var11 > var10) {
							var10 = var11;
						}
					}

					this.anObjectArrayArray705[var8] = new Object[var10 + 1];
				}
			}

			if (var12 != 0) {
				this.anIntArrayArray706 = new int[var5 + 1][];
				this.aClass99Array694 = new Class99[var5 + 1];

				for (var4 = 0; var4 < this.anInt709; var4++) {
					var8 = this.anIntArray703[var4];
					var9 = this.anIntArray702[var8];
					this.anIntArrayArray706[var8] = new int[this.anObjectArrayArray705[var8].length];

					for (var10 = 0; var10 < var9; var10++) {
						this.anIntArrayArray706[var8][this.childEntries[var8][var10]] = var3.getInt();
					}

					this.aClass99Array694[var8] = new Class99(this.anIntArrayArray706[var8]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	public boolean method377() {
		boolean var1 = true;

		for (int var3 = 0; var3 < this.anIntArray703.length; var3++) {
			int var2 = this.anIntArray703[var3];
			if (this.anObjectArray704[var2] == null) {
				this.method379(var2);
				if (this.anObjectArray704[var2] == null) {
					var1 = false;
				}
			}
		}

		return var1;
	}

	public byte[] method378(int var1) {
		if (this.anObjectArrayArray705.length == 1) {
			return this.getFile(0, var1);
		} else if (this.anObjectArrayArray705[var1].length != 1) {
			throw new RuntimeException();
		} else {
			return this.getFile(var1, 0);
		}
	}

	void method379(int var1) {
	}

	public int fileCount(int var1) {
		return this.anObjectArrayArray705[var1].length;
	}

	public void reset() {
		for (int var1 = 0; var1 < this.anObjectArrayArray705.length; var1++) {
			if (this.anObjectArrayArray705[var1] != null) {
				for (int var2 = 0; var2 < this.anObjectArrayArray705[var1].length; var2++) {
					this.anObjectArrayArray705[var1][var2] = null;
				}
			}
		}

	}

	boolean method382(int file, int[] keys) {
		if (this.anObjectArray704[file] == null) {
			return false;
		} else {
			int var3 = this.anIntArray702[file];
			int[] var4 = this.childEntries[file];
			Object[] var5 = this.anObjectArrayArray705[file];
			boolean var6 = true;

			for (int var18 = 0; var18 < var3; var18++) {
				if (var5[var4[var18]] == null) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var181;
				if (keys != null && (keys[0] != 0 || keys[1] != 0 || keys[2] != 0 || keys[3] != 0)) {
					var181 = GroundItem.toByteArray(this.anObjectArray704[file], true);
					ByteBuf data = new ByteBuf(var181);
					data.decryptXTEA(keys, 5, data.payload.length);
				} else {
					var181 = GroundItem.toByteArray(this.anObjectArray704[file], false);
				}

				byte[] var19 = UnderlayType.decodeContainer(var181);
				if (this.aBool708) {
					this.anObjectArray704[file] = null;
				}

				if (var3 > 1) {
					int var9 = var19.length;
					--var9;
					int var10 = var19[var9] & 0xff;
					var9 -= var10 * var3 * 4;
					ByteBuf var11 = new ByteBuf(var19);
					int[] var12 = new int[var3];
					var11.position = var9;

					int var14;
					int var15;
					for (int var20 = 0; var20 < var10; var20++) {
						var14 = 0;

						for (var15 = 0; var15 < var3; var15++) {
							var14 += var11.getInt();
							var12[var15] += var14;
						}
					}

					byte[][] var201 = new byte[var3][];

					for (var14 = 0; var14 < var3; var14++) {
						var201[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.position = var9;
					var14 = 0;

					for (var15 = 0; var15 < var10; var15++) {
						int var16 = 0;

						for (int var17 = 0; var17 < var3; var17++) {
							var16 += var11.getInt();
							System.arraycopy(var19, var14, var201[var17], var12[var17], var16);
							var12[var17] += var16;
							var14 += var16;
						}
					}

					for (var15 = 0; var15 < var3; var15++) {
						if (!this.aBool700) {
							var5[var4[var15]] = Node_Sub6.method538(var201[var15], false);
						} else {
							var5[var4[var15]] = var201[var15];
						}
					}
				} else if (!this.aBool700) {
					var5[var4[0]] = Node_Sub6.method538(var19, false);
				} else {
					var5[var4[0]] = var19;
				}

				return true;
			}
		}
	}

	public int getFile(String var1) {
		var1 = var1.toLowerCase();
		return this.aClass99_697.getFile(SequenceType.djb2Hash(var1));
	}

	public int getChild(int file, String var2) {
		var2 = var2.toLowerCase();
		return this.aClass99Array694[file].getFile(SequenceType.djb2Hash(var2));
	}

	public boolean method385(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.aClass99_697.getFile(SequenceType.djb2Hash(var1));
		int var4 = this.aClass99Array694[var3].getFile(SequenceType.djb2Hash(var2));
		return this.method388(var3, var4);
	}

	public boolean method386(String var1) {
		int var2 = this.getFile("");
		return var2 != -1 ? this.method385("", var1) : this.method385(var1, "");
	}

	public void method387(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.aClass99_697.getFile(SequenceType.djb2Hash(var1));
		if (var2 >= 0) {
			this.method374(var2, (byte) 1);
		}

	}

	public boolean method388(int var1, int var2) {
		if (var1 >= 0 && var1 < this.anObjectArrayArray705.length && this.anObjectArrayArray705[var1] != null
				&& var2 >= 0 && var2 < this.anObjectArrayArray705[var1].length) {
			if (this.anObjectArrayArray705[var1][var2] != null) {
				return true;
			} else if (this.anObjectArray704[var1] != null) {
				return true;
			} else {
				this.method379(var1);
				return this.anObjectArray704[var1] != null;
			}
		} else {
			return false;
		}
	}

	public byte[] method389(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.aClass99_697.getFile(SequenceType.djb2Hash(var1));
		int var4 = this.aClass99Array694[var3].getFile(SequenceType.djb2Hash(var2));
		return this.getFile(var3, var4);
	}

	public byte[] getChild(int file, int child) {
		if (file >= 0 && file < this.anObjectArrayArray705.length && this.anObjectArrayArray705[file] != null
				&& child >= 0 && child < this.anObjectArrayArray705[file].length) {
			if (this.anObjectArrayArray705[file][child] == null) {
				boolean var4 = this.method382(file, (int[]) null);
				if (!var4) {
					this.method379(file);
					var4 = this.method382(file, (int[]) null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var41 = GroundItem.toByteArray(this.anObjectArrayArray705[file][child], false);
			return var41;
		} else {
			return null;
		}
	}

	public byte[] getFile(int var1, int var2) {
		return this.method375(var1, var2, (int[]) null);
	}

	public byte[] method392(int var1) {
		if (this.anObjectArrayArray705.length == 1) {
			return this.getChild(0, var1);
		} else if (this.anObjectArrayArray705[var1].length != 1) {
			throw new RuntimeException();
		} else {
			return this.getChild(var1, 0);
		}
	}

	static boolean method393(File var0, boolean var1) {
		try {
			RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
			int var3 = var4.read();
			var4.seek(0L);
			var4.write(var3);
			var4.seek(0L);
			var4.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var41) {
			return false;
		}
	}

	public int[] getChilds(int var1) {
		return this.childEntries[var1];
	}

	public boolean containsFile(int var1) {
		if (this.anObjectArray704[var1] != null) {
			return true;
		} else {
			this.method379(var1);
			return this.anObjectArray704[var1] != null;
		}
	}

	public void method396(int var1) {
		for (int var2 = 0; var2 < this.anObjectArrayArray705[var1].length; var2++) {
			this.anObjectArrayArray705[var1][var2] = null;
		}

	}

	public int size() {
		return this.anObjectArrayArray705.length;
	}

}
