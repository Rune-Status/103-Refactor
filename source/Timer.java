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
		if ((var3 & 0x40) != 0) {
			var5 = buf.getUByte();
			byte[] var19 = new byte[var5];
			ByteBuf var22 = new ByteBuf(var19);
			buf.getBytes(var19, 0, var5);
			GPI.cachedAppearances[var1] = var22;
			var2.decodeApperance(var22);
		}

		int var191;
		if ((var3 & 0x2) != 0) {
			var5 = buf.getUShort();
			if (var5 == '\uffff') {
				var5 = -1;
			}

			var191 = buf.getUByte();
			Class43.method229(var2, var5, var191);
		}

		if ((var3 & 0x80) != 0) {
			var2.targetIndex = buf.getUShort();
			if (var2.targetIndex == '\uffff') {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 0x4) != 0) {
			var2.overheadText = buf.getString();
			if (var2.overheadText.charAt(0) == 126) {
				var2.overheadText = var2.overheadText.substring(1);
				Class75.method334(2, var2.name, var2.overheadText);
			} else if (Class68.myPlayer == var2) {
				Class75.method334(2, var2.name, var2.overheadText);
			}

			var2.aBool1946 = false;
			var2.anInt1942 = 0;
			var2.anInt1926 = 0;
			var2.anInt1927 = 150;
		}

		if ((var3 & 0x1) != 0) {
			var5 = buf.getUShort();
			var191 = buf.getUByte();
			var2.method1018(var5, var191, Client.engineCycle);
			var2.healthBarCycle = Client.engineCycle + 300;
			var2.hitpoints = buf.getUByte();
			var2.maxHitpoints = buf.getUByte();
		}

		if ((var3 & 0x20) != 0) {
			var2.anInt1931 = buf.getUShort();
			if (var2.queueSize == 0) {
				var2.anInt1953 = var2.anInt1931 * 736533899;
				var2.anInt1931 = -1;
			}
		}

		if ((var3 & 0x8) != 0) {
			var5 = buf.getUShort();
			Permission[] var20 = new Permission[] { Permission.PLAYER, Permission.PLAYER_MOD, Permission.JAGEX_MOD,
					Permission.IRONMAN, Permission.HARDCORE_IRONMAN };
			Permission var21 = (Permission) Class30.forOrdinal(var20, buf.getUByte());
			boolean var8 = buf.getUByte() == 1;
			int var9 = buf.getUByte();
			int var10 = buf.position;
			if (var2.name != null && var2.config != null) {
				boolean var11 = false;
				if (var21.aBool615 && World.method485(var2.name)) {
					var11 = true;
				}

				if (!var11 && Client.anInt2183 == 0 && !var2.hidden) {
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

						byte[] var18 = new byte[var13];
						var12.position += Class120.huffman.decompress(var12.payload, var12.position, var18, 0, var13);
						String var15 = LandscapeTile.getString(var18, 0, var13);
						var16 = var15;
					} catch (Exception var181) {
						var16 = "Cabbage";
					}

					var16 = DualNode_Sub13_Sub3.appendTags(Class48.method246(var16));
					var2.overheadText = var16.trim();
					var2.anInt1942 = var5 >> 8;
					var2.anInt1926 = var5 & 0xff;
					var2.anInt1927 = 150;
					var2.aBool1946 = var8;
					var2.aBool1923 = Class68.myPlayer != var2 && var21.aBool615 && Client.aString2044 != ""
							&& var16.toLowerCase().indexOf(Client.aString2044) == -1;
					if (var21.aBool611) {
						var13 = var8 ? 91 : 1;
					} else {
						var13 = var8 ? 90 : 2;
					}

					if (var21.sprite != -1) {
						Class75.method334(var13, Class41.method223(var21.sprite) + var2.name, var16);
					} else {
						Class75.method334(var13, var2.name, var16);
					}
				}
			}

			buf.position = var9 + var10;
		}

		if ((var3 & 0x100) != 0) {
			var2.graphicsId = buf.getUShort();
			var5 = buf.getInt();
			var2.graphicsHeight = var5 >> 16;
			var2.graphicsDelay = (var5 & 0xffff) + Client.engineCycle;
			var2.anInt1925 = 0;
			var2.anInt1940 = 0;
			if (var2.graphicsDelay > Client.engineCycle) {
				var2.anInt1925 = -1;
			}

			if (var2.graphicsId == '\uffff') {
				var2.graphicsId = -1;
			}
		}

		if ((var3 & 0x800) != 0) {
			var2.anInt1954 = buf.getByte() * 1999092273;
			var2.anInt1944 = buf.getByte() * 1905120905;
			var2.anInt1943 = buf.getByte() * 1171552311;
			var2.anInt1924 = buf.getByte() * -1263265185;
			var2.anInt1928 = buf.getUShort() + Client.engineCycle;
			var2.anInt1947 = buf.getUShort() + Client.engineCycle;
			var2.anInt1948 = buf.getUShort() * 736533899;
			if (var2.aBool1999) {
				var2.anInt1954 += var2.anInt2002 * 1999092273;
				var2.anInt1944 += var2.anInt2003 * 1905120905;
				var2.anInt1943 += var2.anInt2002 * 1171552311;
				var2.anInt1924 += var2.anInt2003 * -1263265185;
				var2.queueSize = 0;
			} else {
				var2.anInt1954 += var2.anIntArray1945[0] * 1999092273;
				var2.anInt1944 += var2.anIntArray1955[0] * 1905120905;
				var2.anInt1943 += var2.anIntArray1945[0] * 1171552311;
				var2.anInt1924 += var2.anIntArray1955[0] * -1263265185;
				var2.queueSize = 1;
			}

			var2.anInt1957 = 0;
		}

		if ((var3 & 0x400) != 0) {
			var5 = buf.getUShort();
			var191 = buf.getUByte();
			var2.method1018(var5, var191, Client.engineCycle);
			var2.healthBarCycle = Client.engineCycle + 300;
			var2.hitpoints = buf.getUByte();
			var2.maxHitpoints = buf.getUByte();
		}

		if ((var3 & 0x200) != 0) {
			GPI.movementTypes[var1] = buf.getByte();
		}

		if ((var3 & 0x1000) != 0) {
			tmpMovement = buf.getByte();
		}

		if ((var3 & 0x2000) != 0) {
			for (var5 = 0; var5 < 3; var5++) {
				var2.aStringArray1986[var5] = buf.getString();
			}
		}

		if (var2.aBool1999) {
			if (tmpMovement == 127) {
				var2.method1043(var2.anInt2002, var2.anInt2003);
			} else {
				byte var211;
				if (tmpMovement != -1) {
					var211 = tmpMovement;
				} else {
					var211 = GPI.movementTypes[var1];
				}

				var2.method1045(var2.anInt2002, var2.anInt2003, var211);
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
		SequenceType.skeletons.method429();
		EnumType.method689();
		ExchangeOffer.method373();
		VarPlayerType.method727();
		Class91.method398();
		Class36.method206();
		((TextureLoader) TexturedGraphic.textureLoader).reset();
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
