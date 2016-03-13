import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IdentKitType extends DualNode {

	public static int anInt1457;
	static NodeMap identKits = new NodeMap(64);
	public int anInt1459 = 188525871;
	int[] anIntArray1460;
	short[] aShortArray1461;
	int[] anIntArray1462 = new int[] { -1, -1, -1, -1, -1 };
	short[] aShortArray1463;
	short[] aShortArray1464;
	short[] aShortArray1465;
	public boolean aBool1466 = false;
	static Node_Sub10 aNode_Sub10_1467;
	static AbstractIndex identKit_ref;

	public Entity_Sub1 method660() {
		if (this.anIntArray1460 == null) {
			return null;
		} else {
			Entity_Sub1[] var2 = new Entity_Sub1[this.anIntArray1460.length];

			for (int var3 = 0; var3 < this.anIntArray1460.length; ++var3) {
				var2[var3] = Entity_Sub1.method887(Class120.aClass87_805, this.anIntArray1460[var3], 0);
			}

			Entity_Sub1 var4;
			if (var2.length == 1) {
				var4 = var2[0];
			} else {
				var4 = new Entity_Sub1(var2, var2.length);
			}

			int var1;
			if (this.aShortArray1461 != null) {
				for (var1 = 0; var1 < this.aShortArray1461.length; ++var1) {
					var4.method895(this.aShortArray1461[var1], this.aShortArray1465[var1]);
				}
			}

			if (this.aShortArray1463 != null) {
				for (var1 = 0; var1 < this.aShortArray1463.length; ++var1) {
					var4.method896(this.aShortArray1463[var1], this.aShortArray1464[var1]);
				}
			}

			return var4;
		}
	}

	void method661(ByteBuf var1, int var2) {
		if (var2 == 1) {
			this.anInt1459 = var1.getUByte() * -188525871;
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.getUByte();
				this.anIntArray1460 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.anIntArray1460[var4] = var1.getUShort();
				}
			} else if (var2 == 3) {
				this.aBool1466 = true;
			} else if (var2 == 40) {
				var3 = var1.getUByte();
				this.aShortArray1461 = new short[var3];
				this.aShortArray1465 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.aShortArray1461[var4] = (short) var1.getUShort();
					this.aShortArray1465[var4] = (short) var1.getUShort();
				}
			} else if (var2 == 41) {
				var3 = var1.getUByte();
				this.aShortArray1463 = new short[var3];
				this.aShortArray1464 = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
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

			for (int var2 = 0; var2 < this.anIntArray1460.length; ++var2) {
				if (!Class120.aClass87_805.method388(this.anIntArray1460[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	public Entity_Sub1 method663() {
		Entity_Sub1[] var1 = new Entity_Sub1[5];
		int var4 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.anIntArray1462[var3] != -1) {
				var1[var4++] = Entity_Sub1.method887(Class120.aClass87_805, this.anIntArray1462[var3], 0);
			}
		}

		Entity_Sub1 var5 = new Entity_Sub1(var1, var4);
		int var2;
		if (this.aShortArray1461 != null) {
			for (var2 = 0; var2 < this.aShortArray1461.length; ++var2) {
				var5.method895(this.aShortArray1461[var2], this.aShortArray1465[var2]);
			}
		}

		if (this.aShortArray1463 != null) {
			for (var2 = 0; var2 < this.aShortArray1463.length; ++var2) {
				var5.method896(this.aShortArray1463[var2], this.aShortArray1464[var2]);
			}
		}

		return var5;
	}

	static final void decodeNpcFlags() {
		for (int index = 0; index < -143667549 * Client.pendingNpcFlagsCount; ++index) {
			int npcIndex = Client.pendingNpcFlagsIndices[index];
			Npc npc = Client.npcArray[npcIndex];
			int flags = Client.inBuffer.getUByte();
			if ((flags & 4) != 0) {
				npc.overheadText = Client.inBuffer.getString();
				npc.anInt1927 = -569035212;
			}

			if ((flags & 16) != 0) {
				npc.targetIndex = Client.inBuffer.getULEShort() * 1611414733;
				if (734924805 * npc.targetIndex == 65535) {
					npc.targetIndex = -1611414733;
				}
			}

			int var4;
			int var5;
			int var6;
			if ((flags & 1) != 0) {
				var5 = Client.inBuffer.getULEShortA();
				var4 = Client.inBuffer.getUShortA();
				var6 = npc.strictX * 1272643751
						- (var5 - 1426698711 * Node_Sub10.chunkLeftX - Node_Sub10.chunkLeftX * 1426698711) * 64;
				int var7 = npc.strictY * -1801433343
						- (var4 - 714823515 * VarClientHub.chunkLeftY - VarClientHub.chunkLeftY * 714823515) * 64;
				if (var6 != 0 || var7 != 0) {
					npc.anInt1931 = ((int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 2047) * -316267887;
				}
			}

			if ((flags & 64) != 0) {
				var5 = Client.inBuffer.getUByteS();
				var4 = Client.inBuffer.getUByteA();
				npc.method1018(var5, var4, -1040073859 * Client.engineCycle);
				npc.healthBarCycle = 568824035 * Client.engineCycle + -1453430444;
				npc.hitpoints = Client.inBuffer.getULEShort() * -182432293;
				npc.maxHitpoints = Client.inBuffer.getUShort() * 119158941;
			}

			if ((flags & 128) != 0) {
				npc.anInt1938 = Client.inBuffer.getULEShortA() * -1738418729;
				var5 = Client.inBuffer.getInt();
				npc.anInt1920 = (var5 >> 16) * 878509897;
				npc.anInt1941 = 1621235571 * (Client.engineCycle * -1040073859 + (var5 & 0xFFFF));
				npc.anInt1925 = 0;
				npc.anInt1940 = 0;
				if (489022907 * npc.anInt1941 > -1040073859 * Client.engineCycle) {
					npc.anInt1925 = -1825378913;
				}

				if (1631645159 * npc.anInt1938 == 65535) {
					npc.anInt1938 = 1738418729;
				}
			}

			if ((flags & 32) != 0) {
				var5 = Client.inBuffer.getUByteC();
				var4 = Client.inBuffer.getUByte();
				npc.method1018(var5, var4, -1040073859 * Client.engineCycle);
				npc.healthBarCycle = -1453430444 + 568824035 * Client.engineCycle;
				npc.hitpoints = Client.inBuffer.getULEShort() * -182432293;
				npc.maxHitpoints = Client.inBuffer.getULEShort() * 119158941;
			}

			if ((flags & 8) != 0) {
				npc.type = VarPlayerType.getNpcType(Client.inBuffer.getULEShortA());
				npc.anInt1915 = npc.type.anInt1589 * 1447916577;
				npc.orientation = npc.type.anInt1599 * 506128019;
				npc.anInt1918 = -147360311 * npc.type.anInt1585;
				npc.anInt1952 = npc.type.anInt1584 * 404950129;
				npc.anInt1913 = 1055000573 * npc.type.anInt1587;
				npc.anInt1939 = 985741173 * npc.type.anInt1588;
				npc.anInt1959 = 1706784279 * npc.type.anInt1601;
				npc.anInt1916 = npc.type.anInt1583 * -1634865443;
				npc.anInt1917 = 118379263 * npc.type.anInt1591;
			}

			if ((flags & 2) != 0) {
				var5 = Client.inBuffer.getUShort();
				if (var5 == 65535) {
					var5 = -1;
				}

				var4 = Client.inBuffer.getUByteA();
				if (-922607859 * npc.animation == var5 && var5 != -1) {
					var6 = Node_Sub6.getSequenceType(var5).anInt1486 * 972933669;
					if (var6 == 1) {
						npc.anInt1934 = 0;
						npc.anInt1935 = 0;
						npc.anInt1936 = 1583839217 * var4;
						npc.anInt1958 = 0;
					}

					if (var6 == 2) {
						npc.anInt1958 = 0;
					}
				} else if (var5 == -1 || npc.animation * -922607859 == -1 || Node_Sub6.getSequenceType(var5).anInt1480
						* -610992485 >= Node_Sub6.getSequenceType(-922607859 * npc.animation).anInt1480 * -610992485) {
					npc.animation = -1587034171 * var5;
					npc.anInt1934 = 0;
					npc.anInt1935 = 0;
					npc.anInt1936 = 1583839217 * var4;
					npc.anInt1958 = 0;
					npc.anInt1957 = -2078876897 * npc.queueSize;
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

				for (int index = 0; index < size; ++index) {
					if (Widget.interfaces[parent][index] == null) {
						byte[] var3 = Widget.widgetIndex.getFile(parent, index);
						if (var3 != null) {
							Widget.interfaces[parent][index] = new Widget();
							Widget.interfaces[parent][index].hash = ((parent << 16) + index) * 1463664765;
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
		int var1 = -179718399 * var0.contentType;
		if (var1 == 205) {
			Client.anInt2045 = -453788862;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.aPlayerConfig2138.method264(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
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
		for (int var4 = 0; var4 < -580551879 * Client.anInt2168; ++var4) {
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

		for (int var2 = 0; var2 < 5; ++var2) {
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
		ver.count = buf.getUByte() * 669809141;
		ver.anInt1426 = buf.getInt() * 554885847;
		ver.type = new int[ver.count * -707810723];
		ver.errorIdentifiers = new int[ver.count * -707810723];
		ver.fields = new Field[-707810723 * ver.count];
		ver.fieldValues = new int[-707810723 * ver.count];
		ver.methods = new Method[-707810723 * ver.count];
		ver.methodsBytecodes = new byte[-707810723 * ver.count][][];

		for (int index = 0; index < -707810723 * ver.count; ++index) {
			try {
				int type = buf.getUByte();
				String cName;
				String fName;
				int size;
				if (type != 0 && type != 1 && type != 2) {
					if (type == 3 || type == 4) {
						cName = buf.getString();
						fName = buf.getString();
						size = buf.getUByte();
						String[] methodNames = new String[size];

						for (int var10 = 0; var10 < size; ++var10) {
							methodNames[var10] = buf.getString();
						}

						String returnType = buf.getString();
						byte[][] methodBytecodes = new byte[size][];
						int bytecodeSize;
						if (type == 3) {
							for (int mIndex = 0; mIndex < size; ++mIndex) {
								bytecodeSize = buf.getInt();
								methodBytecodes[mIndex] = new byte[bytecodeSize];
								buf.getBytes(methodBytecodes[mIndex], 0, bytecodeSize);
							}
						}

						ver.type[index] = type;
						Class<?>[] args = new Class<?>[size];

						for (bytecodeSize = 0; bytecodeSize < size; ++bytecodeSize) {
							args[bytecodeSize] = Class59.resolveType(methodNames[bytecodeSize]);
						}

						Class<?> methodReturn = Class59.resolveType(returnType);
						if (Class59.resolveType(cName).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = Class59.resolveType(cName).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (var17.getName().equals(fName)) {
								Class[] var18 = var17.getParameterTypes();
								if (args.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < args.length; ++var20) {
										if (args[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && methodReturn == var17.getReturnType()) {
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
					if (type == 1) {
						size = buf.getInt();
					}

					ver.type[index] = type;
					ver.fieldValues[index] = size;
					if (Class59.resolveType(cName).getClassLoader() == null) {
						throw new SecurityException();
					}

					ver.fields[index] = Class59.resolveType(cName).getDeclaredField(fName);
				}
			} catch (ClassNotFoundException var21) {
				ver.errorIdentifiers[index] = -1;
			} catch (SecurityException var22) {
				ver.errorIdentifiers[index] = -2;
			} catch (NullPointerException var23) {
				ver.errorIdentifiers[index] = -3;
			} catch (Exception var24) {
				ver.errorIdentifiers[index] = -4;
			} catch (Throwable var25) {
				ver.errorIdentifiers[index] = -5;
			}
		}

		Class119.aClass103_804.method419(ver);
	}

	static void method672() {
		if (Client.spellSelected) {
			Widget var0 = AbstractProducer.method146(SequenceType.anInt1488 * -1195336111,
					1149825709 * Client.anInt2128);
			if (var0 != null && var0.anObjectArray1178 != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.anObjectArray1178;
				Class96_Sub1.method504(var1);
			}

			Client.spellSelected = false;
			Class68.method326(var0);
		}
	}
}
