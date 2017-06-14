import java.io.File;
import java.io.RandomAccessFile;

public abstract class AbstractIndex {

	boolean aBool708;
	boolean aBool700;
	public int crc;
	int idSize;
	int[] fileIds;
	int[] crcs;
	int[] versions;
	int[] childSizes;
	int[][] childEntries;
	Object[] anObjectArray704;
	Object[][] childs;
	int[] identifiersArray;
	Identifiers identifiers;
	int[][] childIdentifiersArray;
	Identifiers[] childIdentifiers;
	static GZipDecompressor gzip = new GZipDecompressor();
	static int anInt710 = 0;

	AbstractIndex(boolean var1, boolean var2) {
		this.aBool708 = var1;
		this.aBool700 = var2;
	}

	void method374(int var1, byte var2) {
	}

	public byte[] method375(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.childs.length && this.childs[var1] != null
				&& var2 >= 0 && var2 < this.childs[var1].length) {
			if (this.childs[var1][var2] == null) {
				boolean var5 = this.method382(var1, var3);
				if (!var5) {
					this.method379(var1);
					var5 = this.method382(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var51 = GroundItem.toByteArray(this.childs[var1][var2], false);
			if (this.aBool700) {
				this.childs[var1][var2] = null;
			}

			return var51;
		} else {
			return null;
		}
	}

	void method376(byte[] bytes) {
		this.crc = LoginHandler.getCrc(bytes, 0, bytes.length);
		ByteBuf buf = new ByteBuf(UnderlayType.decodeContainer(bytes));
		int format = buf.getUByte();
		if (format >= 5 && format <= 7) {
			if (format >= 6) {
				buf.getInt();
			}

			int flags = buf.getUByte();
			if (format >= 7) {
				this.idSize = buf.getLargeSmart();
			} else {
				this.idSize = buf.getUShort();
			}

			int acc = 0;
			int fileSize = -1;
			this.fileIds = new int[this.idSize];
			if (format >= 7) {
				for (int i = 0; i < this.idSize; i++) {
					this.fileIds[i] = acc += buf.getLargeSmart();
					if (this.fileIds[i] > fileSize) {
						fileSize = this.fileIds[i];
					}
				}
			} else {
				for (int i = 0; i < this.idSize; i++) {
					this.fileIds[i] = acc += buf.getUShort();
					if (this.fileIds[i] > fileSize) {
						fileSize = this.fileIds[i];
					}
				}
			}

			this.crcs = new int[fileSize + 1];
			this.versions = new int[fileSize + 1];
			this.childSizes = new int[fileSize + 1];
			this.childEntries = new int[fileSize + 1][];
			this.anObjectArray704 = new Object[fileSize + 1];
			this.childs = new Object[fileSize + 1][];
			if (flags != 0) {
				this.identifiersArray = new int[fileSize + 1];

				for (int i = 0; i < this.idSize; i++) {
					this.identifiersArray[this.fileIds[i]] = buf.getInt();
				}

				this.identifiers = new Identifiers(this.identifiersArray);
			}

			for (int i = 0; i < this.idSize; i++) {
				this.crcs[this.fileIds[i]] = buf.getInt();
			}

			for (int i = 0; i < this.idSize; i++) {
				this.versions[this.fileIds[i]] = buf.getInt();
			}

			for (int i = 0; i < this.idSize; i++) {
				this.childSizes[this.fileIds[i]] = buf.getUShort();
			}

			int fileId;
			int childSize;
			int childCount;
			int childId;
			if (format >= 7) {
				for (int i = 0; i < this.idSize; i++) {
					fileId = this.fileIds[i];
					childSize = this.childSizes[fileId];
					acc = 0;
					childCount = -1;
					this.childEntries[fileId] = new int[childSize];

					for (int j = 0; j < childSize; j++) {
						childId = this.childEntries[fileId][j] = acc += buf.getLargeSmart();
						if (childId > childCount) {
							childCount = childId;
						}
					}

					this.childs[fileId] = new Object[childCount + 1];
				}
			} else {
				for (int i = 0; i < this.idSize; i++) {
					fileId = this.fileIds[i];
					childSize = this.childSizes[fileId];
					acc = 0;
					childCount = -1;
					this.childEntries[fileId] = new int[childSize];

					for (int j = 0; j < childSize; j++) {
						childId = this.childEntries[fileId][j] = acc += buf.getUShort();
						if (childId > childCount) {
							childCount = childId;
						}
					}

					this.childs[fileId] = new Object[childCount + 1];
				}
			}

			if (flags != 0) {
				this.childIdentifiersArray = new int[fileSize + 1][];
				this.childIdentifiers = new Identifiers[fileSize + 1];

				for (int i = 0; i < this.idSize; i++) {
					fileId = this.fileIds[i];
					childSize = this.childSizes[fileId];
					this.childIdentifiersArray[fileId] = new int[this.childs[fileId].length];

					for (childCount = 0; childCount < childSize; childCount++) {
						this.childIdentifiersArray[fileId][this.childEntries[fileId][childCount]] = buf.getInt();
					}

					this.childIdentifiers[fileId] = new Identifiers(this.childIdentifiersArray[fileId]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	public boolean method377() {
		boolean var1 = true;

		for (int var3 = 0; var3 < this.fileIds.length; var3++) {
			int var2 = this.fileIds[var3];
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
		if (this.childs.length == 1) {
			return this.getFile(0, var1);
		} else if (this.childs[var1].length != 1) {
			throw new RuntimeException();
		} else {
			return this.getFile(var1, 0);
		}
	}

	void method379(int var1) {
	}

	public int fileCount(int var1) {
		return this.childs[var1].length;
	}

	public void reset() {
		for (int var1 = 0; var1 < this.childs.length; var1++) {
			if (this.childs[var1] != null) {
				for (int var2 = 0; var2 < this.childs[var1].length; var2++) {
					this.childs[var1][var2] = null;
				}
			}
		}

	}

	boolean method382(int file, int[] keys) {
		if (this.anObjectArray704[file] == null) {
			return false;
		} else {
			int var3 = this.childSizes[file];
			int[] var4 = this.childEntries[file];
			Object[] var5 = this.childs[file];
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
		return this.identifiers.getFile(SequenceType.djb2Hash(var1));
	}

	public int getChild(int file, String var2) {
		var2 = var2.toLowerCase();
		return this.childIdentifiers[file].getFile(SequenceType.djb2Hash(var2));
	}

	public boolean method385(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.identifiers.getFile(SequenceType.djb2Hash(var1));
		int var4 = this.childIdentifiers[var3].getFile(SequenceType.djb2Hash(var2));
		return this.method388(var3, var4);
	}

	public boolean method386(String var1) {
		int var2 = this.getFile("");
		return var2 != -1 ? this.method385("", var1) : this.method385(var1, "");
	}

	public void method387(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.identifiers.getFile(SequenceType.djb2Hash(var1));
		if (var2 >= 0) {
			this.method374(var2, (byte) 1);
		}

	}

	public boolean method388(int var1, int var2) {
		if (var1 >= 0 && var1 < this.childs.length && this.childs[var1] != null
				&& var2 >= 0 && var2 < this.childs[var1].length) {
			if (this.childs[var1][var2] != null) {
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
		int var3 = this.identifiers.getFile(SequenceType.djb2Hash(var1));
		int var4 = this.childIdentifiers[var3].getFile(SequenceType.djb2Hash(var2));
		return this.getFile(var3, var4);
	}

	public byte[] getChild(int file, int child) {
		if (file >= 0 && file < this.childs.length && this.childs[file] != null
				&& child >= 0 && child < this.childs[file].length) {
			if (this.childs[file][child] == null) {
				boolean var4 = this.method382(file, (int[]) null);
				if (!var4) {
					this.method379(file);
					var4 = this.method382(file, (int[]) null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var41 = GroundItem.toByteArray(this.childs[file][child], false);
			return var41;
		} else {
			return null;
		}
	}

	public byte[] getFile(int var1, int var2) {
		return this.method375(var1, var2, (int[]) null);
	}

	public byte[] method392(int var1) {
		if (this.childs.length == 1) {
			return this.getChild(0, var1);
		} else if (this.childs[var1].length != 1) {
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
		for (int var2 = 0; var2 < this.childs[var1].length; var2++) {
			this.childs[var1][var2] = null;
		}

	}

	public int size() {
		return this.childs.length;
	}

}
