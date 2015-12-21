
public class PlayerConfig {

	public static short[][] aShortArrayArray529;
	int[] appearanceColors;
	public static short[] aShortArray530;
	static Class106 aClass106_531 = new Class106(260);
	public boolean female;
	long aLong532;
	public int npcId;
	long aLong533;
	static int[] anIntArray534 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	int[] appearance;
	static CacheIndex aClass87_Sub1_535;

	public void method262(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var6 = 0; var6 < 7; ++var6) {
				for (int var7 = 0; var7 < DualNode_Sub2.anInt1457 * 906908197; ++var7) {
					DualNode_Sub2 var5 = Class20_Sub1.method511(var7);
					if (var5 != null && !var5.aBool1466 && (var3 ? 7 : 0) + var6 == 746079793 * var5.anInt1459) {
						var1[anIntArray534[var6]] = 256 + var7;
						break;
					}
				}
			}
		}

		this.appearance = var1;
		this.appearanceColors = var2;
		this.female = var3;
		this.npcId = 1738384351 * var4;
		this.setHash();
	}

	public void method263(int var1, boolean var2) {
		int var3 = this.appearanceColors[var1];
		if (var2) {
			do {
				++var3;
				if (var3 >= aShortArrayArray529[var1].length) {
					var3 = 0;
				}
			} while (!GameStrings.method465(var1, var3));
		} else {
			do {
				--var3;
				if (var3 < 0) {
					var3 = aShortArrayArray529[var1].length - 1;
				}
			} while (!GameStrings.method465(var1, var3));
		}

		this.appearanceColors[var1] = var3;
		this.setHash();
	}

	public void method264(int var1, boolean var2) {
		if (var1 != 1 || !this.female) {
			int var4 = this.appearance[anIntArray534[var1]];
			if (var4 != 0) {
				var4 -= 256;

				DualNode_Sub2 var3;
				do {
					if (!var2) {
						--var4;
						if (var4 < 0) {
							var4 = 906908197 * DualNode_Sub2.anInt1457 - 1;
						}
					} else {
						++var4;
						if (var4 >= 906908197 * DualNode_Sub2.anInt1457) {
							var4 = 0;
						}
					}

					var3 = Class20_Sub1.method511(var4);
				} while (var3 == null || var3.aBool1466 || (this.female ? 7 : 0) + var1 != var3.anInt1459 * 746079793);

				this.appearance[anIntArray534[var1]] = 256 + var4;
				this.setHash();
			}
		}
	}

	public void method265(boolean var1) {
		if (var1 != this.female) {
			this.method262((int[]) null, this.appearanceColors, var1, -1);
		}
	}

	public void method266(ByteBuf var1) {
		var1.putByte(this.female ? 1 : 0);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var2 = this.appearance[anIntArray534[var3]];
			if (var2 == 0) {
				var1.putByte(-1);
			} else {
				var1.putByte(var2 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.putByte(this.appearanceColors[var3]);
		}

	}

	void setHash() {
		long var1 = -7792981304576825055L * this.aLong533;
		int var5 = this.appearance[5];
		int var4 = this.appearance[9];
		this.appearance[5] = var4;
		this.appearance[9] = var5;
		this.aLong533 = 0L;

		int var3;
		for (var3 = 0; var3 < 12; ++var3) {
			this.aLong533 = -462908861650658591L * (-7792981304576825055L * this.aLong533 << 4);
			if (this.appearance[var3] >= 256) {
				this.aLong533 += -462908861650658591L * (long) (this.appearance[var3] - 256);
			}
		}

		if (this.appearance[0] >= 256) {
			this.aLong533 += -462908861650658591L * (long) (this.appearance[0] - 256 >> 4);
		}

		if (this.appearance[1] >= 256) {
			this.aLong533 += -462908861650658591L * (long) (this.appearance[1] - 256 >> 8);
		}

		for (var3 = 0; var3 < 5; ++var3) {
			this.aLong533 = (this.aLong533 * -7792981304576825055L << 3) * -462908861650658591L;
			this.aLong533 += (long) this.appearanceColors[var3] * -462908861650658591L;
		}

		this.aLong533 = -462908861650658591L * (this.aLong533 * -7792981304576825055L << 1);
		this.aLong533 += -462908861650658591L * (long) (this.female ? 1 : 0);
		this.appearance[5] = var5;
		this.appearance[9] = var4;
		if (0L != var1 && var1 != this.aLong533 * -7792981304576825055L) {
			aClass106_531.method430(var1);
		}

	}

	public Model method268(DualNode_Sub3 var1, int var2, DualNode_Sub3 var3, int var4) {
		if (-84158433 * this.npcId != -1) {
			return DualNode_Sub11.getNpcDefinition(-84158433 * this.npcId).method799(var1, var2, var3, var4);
		} else {
			long var8 = this.aLong533 * -7792981304576825055L;
			int[] var5 = this.appearance;
			if (var1 != null && (var1.anInt1479 * 1712651899 >= 0 || var1.anInt1482 * 1963729991 >= 0)) {
				var5 = new int[12];

				for (int var6 = 0; var6 < 12; ++var6) {
					var5[var6] = this.appearance[var6];
				}

				if (1712651899 * var1.anInt1479 >= 0) {
					var8 += (long) (1712651899 * var1.anInt1479 - this.appearance[5] << 40);
					var5[5] = 1712651899 * var1.anInt1479;
				}

				if (var1.anInt1482 * 1963729991 >= 0) {
					var8 += (long) (1963729991 * var1.anInt1482 - this.appearance[3] << 48);
					var5[3] = 1963729991 * var1.anInt1482;
				}
			}

			Model var15 = (Model) aClass106_531.method427(var8);
			if (var15 == null) {
				boolean var12 = false;

				int var11;
				for (int var13 = 0; var13 < 12; ++var13) {
					var11 = var5[var13];
					if (var11 >= 256 && var11 < 512 && !Class20_Sub1.method511(var11 - 256).method662()) {
						var12 = true;
					}

					if (var11 >= 512 && !FriendedPlayer.getItemDefinition(var11 - 512).method813(this.female)) {
						var12 = true;
					}
				}

				if (var12) {
					if (this.aLong532 * 3298979106963370435L != -1L) {
						var15 = (Model) aClass106_531.method427(3298979106963370435L * this.aLong532);
					}

					if (var15 == null) {
						return null;
					}
				}

				if (var15 == null) {
					Entity_Sub1[] var18 = new Entity_Sub1[12];
					var11 = 0;

					int var10;
					for (int var7 = 0; var7 < 12; ++var7) {
						var10 = var5[var7];
						Entity_Sub1 var14;
						if (var10 >= 256 && var10 < 512) {
							var14 = Class20_Sub1.method511(var10 - 256).method660();
							if (var14 != null) {
								var18[var11++] = var14;
							}
						}

						if (var10 >= 512) {
							var14 = FriendedPlayer.getItemDefinition(var10 - 512).method814(this.female);
							if (var14 != null) {
								var18[var11++] = var14;
							}
						}
					}

					Entity_Sub1 var16 = new Entity_Sub1(var18, var11);

					for (var10 = 0; var10 < 5; ++var10) {
						if (this.appearanceColors[var10] < aShortArrayArray529[var10].length) {
							var16.method895(aShortArray530[var10],
									aShortArrayArray529[var10][this.appearanceColors[var10]]);
						}

						if (this.appearanceColors[var10] < Class85.aShortArrayArray691[var10].length) {
							var16.method895(Colors.aShortArray837[var10],
									Class85.aShortArrayArray691[var10][this.appearanceColors[var10]]);
						}
					}

					var15 = var16.method902(64, 850, -30, -50, -30);
					aClass106_531.method428(var15, var8);
					this.aLong532 = var8 * 3382972943993980651L;
				}
			}

			if (var1 == null && var3 == null) {
				return var15;
			} else {
				Model var17;
				if (var1 != null && var3 != null) {
					var17 = var1.method678(var15, var2, var3, var4);
				} else if (var1 != null) {
					var17 = var1.method681(var15, var2);
				} else {
					var17 = var3.method681(var15, var4);
				}

				return var17;
			}
		}
	}

	public int method269() {
		return this.npcId * -84158433 != -1
				? 305419896 + DualNode_Sub11.getNpcDefinition(-84158433 * this.npcId).anInt1579 * -2095462435
				: (this.appearance[11] << 5) + (this.appearanceColors[0] << 25) + (this.appearanceColors[4] << 20)
						+ (this.appearance[0] << 15) + (this.appearance[8] << 10) + this.appearance[1];
	}

	Entity_Sub1 method270() {
		if (this.npcId * -84158433 != -1) {
			return DualNode_Sub11.getNpcDefinition(this.npcId * -84158433).method800();
		} else {
			boolean var4 = false;

			int var3;
			for (int var1 = 0; var1 < 12; ++var1) {
				var3 = this.appearance[var1];
				if (var3 >= 256 && var3 < 512 && !Class20_Sub1.method511(var3 - 256).method669()) {
					var4 = true;
				}

				if (var3 >= 512 && !FriendedPlayer.getItemDefinition(var3 - 512).method815(this.female)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				Entity_Sub1[] var7 = new Entity_Sub1[12];
				var3 = 0;

				int var2;
				for (int var5 = 0; var5 < 12; ++var5) {
					var2 = this.appearance[var5];
					Entity_Sub1 var6;
					if (var2 >= 256 && var2 < 512) {
						var6 = Class20_Sub1.method511(var2 - 256).method663();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var2 >= 512) {
						var6 = FriendedPlayer.getItemDefinition(var2 - 512).method818(this.female);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				Entity_Sub1 var8 = new Entity_Sub1(var7, var3);

				for (var2 = 0; var2 < 5; ++var2) {
					if (this.appearanceColors[var2] < aShortArrayArray529[var2].length) {
						var8.method895(aShortArray530[var2], aShortArrayArray529[var2][this.appearanceColors[var2]]);
					}

					if (this.appearanceColors[var2] < Class85.aShortArrayArray691[var2].length) {
						var8.method895(Colors.aShortArray837[var2],
								Class85.aShortArrayArray691[var2][this.appearanceColors[var2]]);
					}
				}

				return var8;
			}
		}
	}

	public static void method271(Class87 var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.method383(var1);
		int var6 = var0.method384(var5, var2);
		Class69.method328(var0, var5, var6, var3, var4);
	}
}
