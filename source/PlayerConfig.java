public class PlayerConfig {

	public static short[][] colorsToReplace;
	public static short[] colorsToFind;
	static CacheIndex midiTack2Index;
	int[] appearance;
	int[] appearanceColors;
	public boolean female;
	public int npcId;
	long aLong533;
	long aLong532;
	static NodeMap aClass106_531 = new NodeMap(260);
	static int[] anIntArray534 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	public void method262(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var6 = 0; var6 < 7; var6++) {
				for (int var7 = 0; var7 < IdentKitType.anInt1457; var7++) {
					IdentKitType var5 = Client.getIdentKitType(var7);
					if (var5 != null && !var5.aBool1466 && (var3 ? 7 : 0) + var6 == var5.anInt1459) {
						var1[anIntArray534[var6]] = var7 + 256;
						break;
					}
				}
			}
		}

		this.appearance = var1;
		this.appearanceColors = var2;
		this.female = var3;
		this.npcId = var4;
		this.setHash();
	}

	public void method263(int var1, boolean var2) {
		int var3 = this.appearanceColors[var1];
		if (var2) {
			do {
				++var3;
				if (var3 >= colorsToReplace[var1].length) {
					var3 = 0;
				}
			} while (!GameStrings.method465(var1, var3));
		} else {
			do {
				--var3;
				if (var3 < 0) {
					var3 = colorsToReplace[var1].length - 1;
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

				IdentKitType var3;
				do {
					do {
						do {
							if (!var2) {
								--var4;
								if (var4 < 0) {
									var4 = IdentKitType.anInt1457 - 1;
								}
							} else {
								++var4;
								if (var4 >= IdentKitType.anInt1457) {
									var4 = 0;
								}
							}

							var3 = Client.getIdentKitType(var4);
						} while (var3 == null);
					} while (var3.aBool1466);
				} while ((this.female ? 7 : 0) + var1 != var3.anInt1459);

				this.appearance[anIntArray534[var1]] = var4 + 256;
				this.setHash();
			}
		}

	}

	public void method265(boolean var1) {
		if (this.female != var1) {
			this.method262((int[]) null, this.appearanceColors, var1, -1);
		}

	}

	public void method266(ByteBuf var1) {
		var1.putByte(this.female ? 1 : 0);

		int var3;
		for (var3 = 0; var3 < 7; var3++) {
			int var2 = this.appearance[anIntArray534[var3]];
			if (var2 == 0) {
				var1.putByte(-1);
			} else {
				var1.putByte(var2 - 256);
			}
		}

		for (var3 = 0; var3 < 5; var3++) {
			var1.putByte(this.appearanceColors[var3]);
		}

	}

	void setHash() {
		long var1 = this.aLong533 * -7792981304576825055L;
		int var5 = this.appearance[5];
		int var4 = this.appearance[9];
		this.appearance[5] = var4;
		this.appearance[9] = var5;
		this.aLong533 = 0L;

		int var3;
		for (var3 = 0; var3 < 12; var3++) {
			this.aLong533 = (this.aLong533 * -7792981304576825055L << 4) * -462908861650658591L;
			if (this.appearance[var3] >= 256) {
				this.aLong533 += (long) (this.appearance[var3] - 256) * -462908861650658591L;
			}
		}

		if (this.appearance[0] >= 256) {
			this.aLong533 += (long) (this.appearance[0] - 256 >> 4) * -462908861650658591L;
		}

		if (this.appearance[1] >= 256) {
			this.aLong533 += (long) (this.appearance[1] - 256 >> 8) * -462908861650658591L;
		}

		for (var3 = 0; var3 < 5; var3++) {
			this.aLong533 = (this.aLong533 * -7792981304576825055L << 3) * -462908861650658591L;
			this.aLong533 += (long) this.appearanceColors[var3] * -462908861650658591L;
		}

		this.aLong533 = (this.aLong533 * -7792981304576825055L << 1) * -462908861650658591L;
		this.aLong533 += -462908861650658591L * (long) (this.female ? 1 : 0);
		this.appearance[5] = var5;
		this.appearance[9] = var4;
		if (var1 != 0L && var1 != this.aLong533 * -7792981304576825055L) {
			aClass106_531.method430(var1);
		}

	}

	public Model method268(SequenceType var1, int var2, SequenceType var3, int var4) {
		if (this.npcId != -1) {
			return VarPlayerType.getNpcType(this.npcId).method799(var1, var2, var3, var4);
		} else {
			long var8 = this.aLong533 * -7792981304576825055L;
			int[] var5 = this.appearance;
			if (var1 != null && (var1.anInt1479 >= 0 || var1.anInt1482 >= 0)) {
				var5 = new int[12];

				for (int var15 = 0; var15 < 12; var15++) {
					var5[var15] = this.appearance[var15];
				}

				if (var1.anInt1479 >= 0) {
					var8 += (long) (var1.anInt1479 - this.appearance[5] << 40);
					var5[5] = var1.anInt1479;
				}

				if (var1.anInt1482 >= 0) {
					var8 += (long) (var1.anInt1482 - this.appearance[3] << 48);
					var5[3] = var1.anInt1482;
				}
			}

			Model var151 = (Model) aClass106_531.get(var8);
			if (var151 == null) {
				boolean var17 = false;

				int var11;
				for (int var18 = 0; var18 < 12; var18++) {
					var11 = var5[var18];
					if (var11 >= 256 && var11 < 512
							&& !Client.getIdentKitType(var11 - 256).method662()) {
						var17 = true;
					}

					if (var11 >= 512 && !FriendedPlayer.getItemType(var11 - 512).method813(this.female)) {
						var17 = true;
					}
				}

				if (var17) {
					if (this.aLong532 != -1L) {
						var151 = (Model) aClass106_531.get(this.aLong532);
					}

					if (var151 == null) {
						return null;
					}
				}

				if (var151 == null) {
					RSModel[] var171 = new RSModel[12];
					var11 = 0;

					int var10;
					for (int var16 = 0; var16 < 12; var16++) {
						var10 = var5[var16];
						RSModel var14;
						if (var10 >= 256 && var10 < 512) {
							var14 = Client.getIdentKitType(var10 - 256).method660();
							if (var14 != null) {
								var171[var11++] = var14;
							}
						}

						if (var10 >= 512) {
							var14 = FriendedPlayer.getItemType(var10 - 512).method814(this.female);
							if (var14 != null) {
								var171[var11++] = var14;
							}
						}
					}

					RSModel var181 = new RSModel(var171, var11);

					for (var10 = 0; var10 < 5; var10++) {
						if (this.appearanceColors[var10] < colorsToReplace[var10].length) {
							var181.recolor(colorsToFind[var10], colorsToReplace[var10][this.appearanceColors[var10]]);
						}

						if (this.appearanceColors[var10] < Class85.colorsToReplace1[var10].length) {
							var181.recolor(Colors.colorToFind1[var10],
									Class85.colorsToReplace1[var10][this.appearanceColors[var10]]);
						}
					}

					var151 = var181.method902(64, 850, -30, -50, -30);
					aClass106_531.put(var151, var8);
					this.aLong532 = var8;
				}
			}

			if (var1 == null && var3 == null) {
				return var151;
			} else {
				Model var161;
				if (var1 != null && var3 != null) {
					var161 = var1.method678(var151, var2, var3, var4);
				} else if (var1 != null) {
					var161 = var1.method681(var151, var2);
				} else {
					var161 = var3.method681(var151, var4);
				}

				return var161;
			}
		}
	}

	public int method269() {
		return this.npcId != -1 ? VarPlayerType.getNpcType(this.npcId).id + 305419896
				: (this.appearance[11] << 5) + (this.appearanceColors[0] << 25) + (this.appearanceColors[4] << 20)
						+ (this.appearance[0] << 15) + (this.appearance[8] << 10) + this.appearance[1];
	}

	RSModel method270() {
		if (this.npcId != -1) {
			return VarPlayerType.getNpcType(this.npcId).method800();
		} else {
			boolean var4 = false;

			int var3;
			for (int var7 = 0; var7 < 12; var7++) {
				var3 = this.appearance[var7];
				if (var3 >= 256 && var3 < 512 && !Client.getIdentKitType(var3 - 256).method669()) {
					var4 = true;
				}

				if (var3 >= 512 && !FriendedPlayer.getItemType(var3 - 512).method815(this.female)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				RSModel[] var71 = new RSModel[12];
				var3 = 0;

				int var2;
				for (int var8 = 0; var8 < 12; var8++) {
					var2 = this.appearance[var8];
					RSModel var6;
					if (var2 >= 256 && var2 < 512) {
						var6 = Client.getIdentKitType(var2 - 256).method663();
						if (var6 != null) {
							var71[var3++] = var6;
						}
					}

					if (var2 >= 512) {
						var6 = FriendedPlayer.getItemType(var2 - 512).method818(this.female);
						if (var6 != null) {
							var71[var3++] = var6;
						}
					}
				}

				RSModel var81 = new RSModel(var71, var3);

				for (var2 = 0; var2 < 5; var2++) {
					if (this.appearanceColors[var2] < colorsToReplace[var2].length) {
						var81.recolor(colorsToFind[var2], colorsToReplace[var2][this.appearanceColors[var2]]);
					}

					if (this.appearanceColors[var2] < Class85.colorsToReplace1[var2].length) {
						var81.recolor(Colors.colorToFind1[var2],
								Class85.colorsToReplace1[var2][this.appearanceColors[var2]]);
					}
				}

				return var81;
			}
		}
	}

	public static void method271(AbstractIndex var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getFile(var1);
		int var6 = var0.getChild(var5, var2);
		Class69.method328(var0, var5, var6, var3, var4);
	}

}
