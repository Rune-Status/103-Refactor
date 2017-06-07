import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IdentKitType extends DualNode {

	public static int anInt1457;
	static MachineInfo aNode_Sub10_1467;
	static AbstractIndex identKit_ref;
	public int anInt1459 = -1;
	int[] anIntArray1462 = new int[] { -1, -1, -1, -1, -1 };
	public boolean aBool1466 = false;
	int[] anIntArray1460;
	short[] aShortArray1461;
	short[] aShortArray1465;
	short[] aShortArray1463;
	short[] aShortArray1464;
	static NodeMap identKits = new NodeMap(64);

	public Model method660() {
		if (this.anIntArray1460 == null) {
			return null;
		} else {
			Model[] var2 = new Model[this.anIntArray1460.length];

			for (int var4 = 0; var4 < this.anIntArray1460.length; var4++) {
				var2[var4] = Model.method887(Class120.aClass87_805, this.anIntArray1460[var4], 0);
			}

			Model var41;
			if (var2.length == 1) {
				var41 = var2[0];
			} else {
				var41 = new Model(var2, var2.length);
			}

			int var1;
			if (this.aShortArray1461 != null) {
				for (var1 = 0; var1 < this.aShortArray1461.length; var1++) {
					var41.recolor(this.aShortArray1461[var1], this.aShortArray1465[var1]);
				}
			}

			if (this.aShortArray1463 != null) {
				for (var1 = 0; var1 < this.aShortArray1463.length; var1++) {
					var41.method896(this.aShortArray1463[var1], this.aShortArray1464[var1]);
				}
			}

			return var41;
		}
	}

	void method661(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.anInt1459 = var1.getUByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.getUByte();
				this.anIntArray1460 = new int[var3];

				for (var4 = 0; var4 < var3; var4++) {
					this.anIntArray1460[var4] = var1.getUShort();
				}
			} else if (var2 == 3) {
				this.aBool1466 = true;
			} else if (var2 == 40) {
				var3 = var1.getUByte();
				this.aShortArray1461 = new short[var3];
				this.aShortArray1465 = new short[var3];

				for (var4 = 0; var4 < var3; var4++) {
					this.aShortArray1461[var4] = (short) var1.getUShort();
					this.aShortArray1465[var4] = (short) var1.getUShort();
				}
			} else if (var2 == 41) {
				var3 = var1.getUByte();
				this.aShortArray1463 = new short[var3];
				this.aShortArray1464 = new short[var3];

				for (var4 = 0; var4 < var3; var4++) {
					this.aShortArray1463[var4] = (short) var1.getUShort();
					this.aShortArray1464[var4] = (short) var1.getUShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.anIntArray1462[var2 - 60] = var1.getUShort();
			}
		}

	}

	public boolean method662() {
		if (this.anIntArray1460 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.anIntArray1460.length; var2++) {
				if (!Class120.aClass87_805.method388(this.anIntArray1460[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	public Model method663() {
		Model[] var1 = new Model[5];
		int var4 = 0;

		for (int var5 = 0; var5 < 5; var5++) {
			if (this.anIntArray1462[var5] != -1) {
				var1[var4++] = Model.method887(Class120.aClass87_805, this.anIntArray1462[var5], 0);
			}
		}

		Model var51 = new Model(var1, var4);
		int var2;
		if (this.aShortArray1461 != null) {
			for (var2 = 0; var2 < this.aShortArray1461.length; var2++) {
				var51.recolor(this.aShortArray1461[var2], this.aShortArray1465[var2]);
			}
		}

		if (this.aShortArray1463 != null) {
			for (var2 = 0; var2 < this.aShortArray1463.length; var2++) {
				var51.method896(this.aShortArray1463[var2], this.aShortArray1464[var2]);
			}
		}

		return var51;
	}

	static final void decodeNpcFlags() {
		for (int index = 0; index < Client.pendingNpcFlagsCount; index++) {
			int npcIndex = Client.pendingNpcFlagsIndices[index];
			Npc npc = Client.npcArray[npcIndex];
			int flags = Client.inBuffer.getUByte();
			if ((flags & 0x4) != 0) {
				npc.overheadText = Client.inBuffer.getString();
				npc.anInt1927 = 100;
			}

			if ((flags & 0x10) != 0) {
				npc.targetIndex = Client.inBuffer.getULEShort();
				if (npc.targetIndex == '\uffff') {
					npc.targetIndex = -1;
				}
			}

			int var4;
			int var5;
			int var6;
			if ((flags & 0x1) != 0) {
				var5 = Client.inBuffer.getULEShortA();
				var4 = Client.inBuffer.getUShortA();
				var6 = npc.strictX - (var5 - MachineInfo.chunkLeftX - MachineInfo.chunkLeftX) * 64;
				int var7 = npc.strictY - (var4 - VarClientHub.chunkLeftY - VarClientHub.chunkLeftY) * 64;
				if (var6 != 0 || var7 != 0) {
					npc.anInt1931 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7ff;
				}
			}

			if ((flags & 0x40) != 0) {
				var5 = Client.inBuffer.getUByteS();
				var4 = Client.inBuffer.getUByteA();
				npc.method1018(var5, var4, Client.engineCycle);
				npc.healthBarCycle = Client.engineCycle + 300;
				npc.hitpoints = Client.inBuffer.getULEShort();
				npc.maxHitpoints = Client.inBuffer.getUShort();
			}

			if ((flags & 0x80) != 0) {
				npc.graphicsId = Client.inBuffer.getULEShortA();
				var5 = Client.inBuffer.getInt();
				npc.graphicsHeight = var5 >> 16;
				npc.graphicsDelay = Client.engineCycle + (var5 & 0xffff);
				npc.anInt1925 = 0;
				npc.anInt1940 = 0;
				if (npc.graphicsDelay > Client.engineCycle) {
					npc.anInt1925 = -1;
				}

				if (npc.graphicsId == '\uffff') {
					npc.graphicsId = -1;
				}
			}

			if ((flags & 0x20) != 0) {
				var5 = Client.inBuffer.getUByteC();
				var4 = Client.inBuffer.getUByte();
				npc.method1018(var5, var4, Client.engineCycle);
				npc.healthBarCycle = Client.engineCycle + 300;
				npc.hitpoints = Client.inBuffer.getULEShort();
				npc.maxHitpoints = Client.inBuffer.getULEShort();
			}

			if ((flags & 0x8) != 0) {
				npc.type = VarPlayerType.getNpcType(Client.inBuffer.getULEShortA());
				npc.anInt1915 = npc.type.anInt1589;
				npc.orientation = npc.type.anInt1599 * 1080073435;
				npc.anInt1918 = npc.type.anInt1585 * 1481286257;
				npc.anInt1952 = npc.type.anInt1584 * -826106711;
				npc.anInt1913 = npc.type.anInt1587 * -897665047;
				npc.anInt1939 = npc.type.anInt1588 * -1453546357;
				npc.anInt1959 = npc.type.anInt1601 * 370127001;
				npc.anInt1916 = npc.type.anInt1583 * 711326345;
				npc.anInt1917 = npc.type.anInt1591 * 1969722215;
			}

			if ((flags & 0x2) != 0) {
				var5 = Client.inBuffer.getUShort();
				if (var5 == '\uffff') {
					var5 = -1;
				}

				var4 = Client.inBuffer.getUByteA();
				if (npc.animationId == var5 && var5 != -1) {
					var6 = Node_Sub6.getSequenceType(var5).anInt1486;
					if (var6 == 1) {
						npc.anInt1934 = 0;
						npc.anInt1935 = 0;
						npc.animationDelay = var4;
						npc.anInt1958 = 0;
					}

					if (var6 == 2) {
						npc.anInt1958 = 0;
					}
				} else if (var5 == -1 || npc.animationId == -1 || Node_Sub6.getSequenceType(var5).anInt1480 >= Node_Sub6
						.getSequenceType(npc.animationId).anInt1480) {
					npc.animationId = var5;
					npc.anInt1934 = 0;
					npc.anInt1935 = 0;
					npc.animationDelay = var4;
					npc.anInt1958 = 0;
					npc.anInt1957 = npc.queueSize;
				}
			}
		}

	}

	void decode(ByteBuf var1) {
		while (true) {
			int var3 = var1.getUByte();
			if (var3 == 0) {
				return;
			}

			this.method661(var1, var3);
		}
	}

	public static boolean loadWidget(int parent) {
		if (Widget.loadedInterfaces[parent]) {
			return true;
		} else if (!Widget.widgetIndex.containsFile(parent)) {
			return false;
		} else {
			int size = Widget.widgetIndex.fileCount(parent);
			if (size == 0) {
				Widget.loadedInterfaces[parent] = true;
				return true;
			} else {
				if (Widget.interfaces[parent] == null) {
					Widget.interfaces[parent] = new Widget[size];
				}

				for (int index = 0; index < size; index++) {
					if (Widget.interfaces[parent][index] == null) {
						byte[] var3 = Widget.widgetIndex.getFile(parent, index);
						if (var3 != null) {
							Widget.interfaces[parent][index] = new Widget();
							Widget.interfaces[parent][index].hash = (parent << 16) + index;
							if (var3[0] == -1) {
								Widget.interfaces[parent][index].decodeActive(new ByteBuf(var3));
							} else {
								Widget.interfaces[parent][index].decode(new ByteBuf(var3));
							}
						}
					}
				}

				Widget.loadedInterfaces[parent] = true;
				return true;
			}
		}
	}

	static final boolean method667(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.anInt2045 = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 0x1;
				Client.aPlayerConfig2138.method264(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 0x1;
				Client.aPlayerConfig2138.method263(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.aPlayerConfig2138.method265(false);
			}

			if (var1 == 325) {
				Client.aPlayerConfig2138.method265(true);
			}

			if (var1 == 326) {
				Client.outBuffer.putHeader(136);
				Client.aPlayerConfig2138.method266(Client.outBuffer);
				return true;
			} else {
				return false;
			}
		}
	}

	static final void method668(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.anInt2168; var4++) {
			if (Client.anIntArray2175[var4] + Client.anIntArray2173[var4] > var0
					&& Client.anIntArray2173[var4] < var0 + var2
					&& Client.anIntArray2176[var4] + Client.anIntArray2174[var4] > var1
					&& Client.anIntArray2174[var4] < var1 + var3) {
				Client.aBoolArray2118[var4] = true;
			}
		}

	}

	public boolean method669() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; var2++) {
			if (this.anIntArray1462[var2] != -1 && !Class120.aClass87_805.method388(this.anIntArray1462[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	public static int method670(int var0, int var1, int var2) {
		var2 &= 3;
		return var2 != 0 ? (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 : 7 - var1)) : var0;
	}

	public static void decodeClassVerifier(ByteBuf buf, int var1, int var2) {
		ClassVerifier ver = new ClassVerifier();
		ver.count = buf.getUByte();
		ver.anInt1426 = buf.getInt();
		ver.type = new int[ver.count];
		ver.errorIdentifiers = new int[ver.count];
		ver.fields = new Field[ver.count];
		ver.fieldValues = new int[ver.count];
		ver.methods = new Method[ver.count];
		ver.methodsBytecodes = new byte[ver.count][][];

		for (int index = 0; index < ver.count; index++) {
			try {
				int var25 = buf.getUByte();
				String cName;
				String fName;
				int size;
				if (var25 != 0 && var25 != 1 && var25 != 2) {
					if (var25 == 3 || var25 == 4) {
						cName = buf.getString();
						fName = buf.getString();
						size = buf.getUByte();
						String[] methodNames = new String[size];

						for (int returnType = 0; returnType < size; returnType++) {
							methodNames[returnType] = buf.getString();
						}

						String var27 = buf.getString();
						byte[][] methodBytecodes = new byte[size][];
						int bytecodeSize;
						if (var25 == 3) {
							for (int args = 0; args < size; args++) {
								bytecodeSize = buf.getInt();
								methodBytecodes[args] = new byte[bytecodeSize];
								buf.getBytes(methodBytecodes[args], 0, bytecodeSize);
							}
						}

						ver.type[index] = var25;
						Class[] var28 = new Class[size];

						for (bytecodeSize = 0; bytecodeSize < size; bytecodeSize++) {
							var28[bytecodeSize] = Class59.resolveType(methodNames[bytecodeSize]);
						}

						Class methodReturn = Class59.resolveType(var27);
						if (Class59.resolveType(cName).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = Class59.resolveType(cName).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; var16++) {
							Method var17 = var15[var16];
							if (var17.getName().equals(fName)) {
								Class[] var18 = var17.getParameterTypes();
								if (var28.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var28.length; var20++) {
										if (var28[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var17.getReturnType() == methodReturn) {
										ver.methods[index] = var17;
									}
								}
							}
						}

						ver.methodsBytecodes[index] = methodBytecodes;
					}
				} else {
					cName = buf.getString();
					fName = buf.getString();
					size = 0;
					if (var25 == 1) {
						size = buf.getInt();
					}

					ver.type[index] = var25;
					ver.fieldValues[index] = size;
					if (Class59.resolveType(cName).getClassLoader() == null) {
						throw new SecurityException();
					}

					ver.fields[index] = Class59.resolveType(cName).getDeclaredField(fName);
				}
			} catch (ClassNotFoundException var22) {
				ver.errorIdentifiers[index] = -1;
			} catch (SecurityException var23) {
				ver.errorIdentifiers[index] = -2;
			} catch (NullPointerException var24) {
				ver.errorIdentifiers[index] = -3;
			} catch (Exception var251) {
				ver.errorIdentifiers[index] = -4;
			} catch (Throwable var26) {
				ver.errorIdentifiers[index] = -5;
			}
		}

		Class119.aClass103_804.method419(ver);
	}

	static void method672() {
		if (Client.spellSelected) {
			Widget var0 = AbstractProducer.method146(SequenceType.anInt1488, Client.anInt2128);
			if (var0 != null && var0.anObjectArray1178 != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.anObjectArray1178;
				Class96_Sub1.execute(var1);
			}

			Client.spellSelected = false;
			Class68.method326(var0);
		}

	}

}
