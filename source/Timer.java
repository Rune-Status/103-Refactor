import java.io.File;

public abstract class Timer {

	abstract void method321();

	abstract int method322(int var1, int var2);

	static void setCacheDirectory(File var0) {
		Class79.cacheDirectory = var0;
		if (!Class79.cacheDirectory.exists()) {
			throw new RuntimeException("");
		} else {
			Class79.aBool655 = true;
		}
	}

	static final void decodePlayerFlags(BitBuf buf, int var1, Player var2, int var3) {
		byte tmpMovement = -1;
		int var5;
		if ((var3 & 64) != 0) {
			var5 = buf.getUByte();
			byte[] var6 = new byte[var5];
			ByteBuf var7 = new ByteBuf(var6);
			buf.getBytes(var6, 0, var5);
			GPI.cachedAppearances[var1] = var7;
			var2.decodeApperance(var7);
		}

		int var19;
		if ((var3 & 2) != 0) {
			var5 = buf.getUShort();
			if (var5 == 65535) {
				var5 = -1;
			}

			var19 = buf.getUByte();
			Class43.method229(var2, var5, var19);
		}

		if ((var3 & 128) != 0) {
			var2.targetIndex = buf.getUShort() * 1611414733;
			if (734924805 * var2.targetIndex == 65535) {
				var2.targetIndex = -1611414733;
			}
		}

		if ((var3 & 4) != 0) {
			var2.overheadText = buf.getString();
			if (var2.overheadText.charAt(0) == 126) {
				var2.overheadText = var2.overheadText.substring(1);
				Class75.method334(2, var2.name, var2.overheadText);
			} else if (var2 == Class68.myPlayer) {
				Class75.method334(2, var2.name, var2.overheadText);
			}

			var2.aBool1946 = false;
			var2.anInt1942 = 0;
			var2.anInt1926 = 0;
			var2.anInt1927 = -853552818;
		}

		if ((var3 & 1) != 0) {
			var5 = buf.getUShort();
			var19 = buf.getUByte();
			var2.method1018(var5, var19, -1040073859 * Client.engineCycle);
			var2.healthBarCycle = -1453430444 + Client.engineCycle * 568824035;
			var2.hitpoints = buf.getUByte() * -182432293;
			var2.maxHitpoints = buf.getUByte() * 119158941;
		}

		if ((var3 & 32) != 0) {
			var2.anInt1931 = buf.getUShort() * -316267887;
			if (var2.queueSize * 632093179 == 0) {
				var2.anInt1953 = 47518811 * var2.anInt1931;
				var2.anInt1931 = 316267887;
			}
		}

		if ((var3 & 8) != 0) {
			var5 = buf.getUShort();
			Permission[] var20 = new Permission[] { Permission.PLAYER, Permission.PLAYER_MOD, Permission.JAGEX_MOD,
					Permission.IRONMAN, Permission.HARDCORE_IRONMAN };
			Permission var21 = (Permission) Class30.forOrdinal(var20, buf.getUByte());
			boolean var8 = buf.getUByte() == 1;
			int var9 = buf.getUByte();
			int var10 = 314639891 * buf.position;
			if (var2.name != null && var2.config != null) {
				boolean var11 = false;
				if (var21.aBool615 && World.method485(var2.name)) {
					var11 = true;
				}

				if (!var11 && Client.anInt2183 * 198136383 == 0 && !var2.hidden) {
					GPI.chatBuffer.position = 0;
					buf.getBytes(GPI.chatBuffer.payload, 0, var9);
					GPI.chatBuffer.position = 0;
					ByteBuf var12 = GPI.chatBuffer;

					int var13;
					String var16;
					try {
						var13 = var12.getUSmart();
						if (var13 > 32767) {
							var13 = 32767;
						}

						byte[] var14 = new byte[var13];
						var12.position += Class120.huffman.decompress(var12.payload, 314639891 * var12.position, var14,
								0, var13) * -184175589;
						String var15 = LandscapeTile.getString(var14, 0, var13);
						var16 = var15;
					} catch (Exception var18) {
						var16 = "Cabbage";
					}

					var16 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var16));
					var2.overheadText = var16.trim();
					var2.anInt1942 = -1783525269 * (var5 >> 8);
					var2.anInt1926 = (var5 & 0xFF) * -819780711;
					var2.anInt1927 = -853552818;
					var2.aBool1946 = var8;
					var2.aBool1923 = Class68.myPlayer != var2 && var21.aBool615 && "" != Client.aString2044
							&& var16.toLowerCase().indexOf(Client.aString2044) == -1;
					if (var21.aBool611) {
						var13 = var8 ? 91 : 1;
					} else {
						var13 = var8 ? 90 : 2;
					}

					if (-2127218069 * var21.sprite != -1) {
						Class75.method334(var13, Class41.method223(-2127218069 * var21.sprite) + var2.name, var16);
					} else {
						Class75.method334(var13, var2.name, var16);
					}
				}
			}

			buf.position = -184175589 * (var9 + var10);
		}

		if ((var3 & 256) != 0) {
			var2.anInt1938 = buf.getUShort() * -1738418729;
			var5 = buf.getInt();
			var2.anInt1920 = (var5 >> 16) * 878509897;
			var2.anInt1941 = 1621235571 * ((var5 & 0xFFFF) + Client.engineCycle * -1040073859);
			var2.anInt1925 = 0;
			var2.anInt1940 = 0;
			if (var2.anInt1941 * 489022907 > -1040073859 * Client.engineCycle) {
				var2.anInt1925 = -1825378913;
			}

			if (1631645159 * var2.anInt1938 == 65535) {
				var2.anInt1938 = 1738418729;
			}
		}

		if ((var3 & 2048) != 0) {
			var2.anInt1954 = buf.getByte() * 1999092273;
			var2.anInt1944 = buf.getByte() * 1905120905;
			var2.anInt1943 = buf.getByte() * 1171552311;
			var2.anInt1924 = buf.getByte() * -1263265185;
			var2.anInt1928 = (buf.getUShort() + -1040073859 * Client.engineCycle) * 1935880743;
			var2.anInt1947 = (buf.getUShort() + -1040073859 * Client.engineCycle) * -1370408969;
			var2.anInt1948 = buf.getUShort() * -1704579493;
			if (var2.aBool1999) {
				var2.anInt1954 += var2.anInt2002 * 189523535;
				var2.anInt1944 += 1458816133 * var2.anInt2003;
				var2.anInt1943 += var2.anInt2002 * -135505079;
				var2.anInt1924 += var2.anInt2003 * -990143037;
				var2.queueSize = 0;
			} else {
				var2.anInt1954 += var2.anIntArray1945[0] * 1999092273;
				var2.anInt1944 += var2.anIntArray1955[0] * 1905120905;
				var2.anInt1943 += var2.anIntArray1945[0] * 1171552311;
				var2.anInt1924 += var2.anIntArray1955[0] * -1263265185;
				var2.queueSize = 11741491;
			}

			var2.anInt1957 = 0;
		}

		if ((var3 & 1024) != 0) {
			var5 = buf.getUShort();
			var19 = buf.getUByte();
			var2.method1018(var5, var19, Client.engineCycle * -1040073859);
			var2.healthBarCycle = Client.engineCycle * 568824035 + -1453430444;
			var2.hitpoints = buf.getUByte() * -182432293;
			var2.maxHitpoints = buf.getUByte() * 119158941;
		}

		if ((var3 & 512) != 0) {
			GPI.movementTypes[var1] = buf.getByte();
		}

		if ((var3 & 4096) != 0) {
			tmpMovement = buf.getByte();
		}

		if ((var3 & 8192) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.aStringArray1986[var5] = buf.getString();
				// System.out.println(var5 + ", \"" +
				// var2.aStringArray1986[var5] + "\"");
			}
		}

		if (var2.aBool1999) {
			if (tmpMovement == 127) {
				var2.method1043(-1495988097 * var2.anInt2002, var2.anInt2003 * 1538326301);
			} else {
				byte var22;
				if (tmpMovement != -1) {
					var22 = tmpMovement;
				} else {
					var22 = GPI.movementTypes[var1];
				}

				var2.method1045(var2.anInt2002 * -1495988097, var2.anInt2003 * 1538326301, var22);
			}
		}

	}

	static final void method325() {
		OverlayType.overlays.method429();
		Node_Sub6.method537();
		Class50.method251();
		ObjectType.objects.method429();
		ObjectType.aClass106_1684.method429();
		ObjectType.aClass106_1693.method429();
		ObjectType.aClass106_1686.method429();
		NpcType.npcs.method429();
		NpcType.aClass106_1578.method429();
		ItemType.items.method429();
		ItemType.aClass106_1607.method429();
		ItemType.aClass106_1620.method429();
		SequenceType.sequences.method429();
		SequenceType.aClass106_1473.method429();
		EnumType.method689();
		ExchangeOffer.method373();
		VarPlayerType.method727();
		Class91.method398();
		Class36.method206();
		((TextureLoader) TexturedGraphic.anInterface3_1796).method187();
		RuneScript.aClass106_1725.method429();
		Class34.skeletonsIndex.reset();
		Client.meshesIndex.reset();
		RuneScript.interfaceIndex.reset();
		VarClientType.sfxIndex.reset();
		Class48_Sub1.landscapesIndex.reset();
		Class2.midiTrack1Index.reset();
		Class3.modelsIndex.reset();
		AnimationSkin.spritesIndex.reset();
		Class1.texturesIndex.reset();
		Class40.binaryIndex.reset();
		PlayerConfig.midiTack2Index.reset();
		InvType.clientScriptsIndex.reset();
	}
}
