import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class AbstractProducer {

	public int width;
	public int[] dataArray;
	int height;
	public Image image;

	public abstract void drawImageClip(Graphics var1, int var2, int var3, int var4, int var5);

	public final void setRaster() {
		RSGraphics.setRaster(this.dataArray, this.width, this.height);
	}

	static final void method143(Player var0, int var1, int var2, int var3) {
		if (Class68.myPlayer != var0 && Client.menuItemCount < 400) {
			String var5;
			if (var0.totalLevel == 0) {
				var5 = var0.aStringArray1986[0] + var0.name + var0.aStringArray1986[1]
						+ Class56.method285(var0.combatLevel, Class68.myPlayer.combatLevel) + " " + Class35.aString389
						+ "level-" + var0.combatLevel + Class35.aString392 + var0.aStringArray1986[2];
			} else {
				var5 = var0.aStringArray1986[0] + var0.name + var0.aStringArray1986[1] + " " + Class35.aString389
						+ "skill-" + var0.totalLevel + Class35.aString392 + var0.aStringArray1986[2];
			}

			int var6;
			if (Client.itemSelectionStatus == 1) {
				FriendedPlayer.addMenuRow("Use", Client.selectedItemName + " " + Class35.aString391 + " "
						+ Class48_Sub1.method545(16777215) + var5, 14, var1, var2, var3);
			} else if (Client.spellSelected) {
				if ((Class31.currentSpellTargets & 0x8) == 8) {
					FriendedPlayer.addMenuRow(Client.menuActionPrefix, Client.selectedSpellName + " "
							+ Class35.aString391 + " " + Class48_Sub1.method545(16777215) + var5, 15, var1, var2, var3);
				}
			} else {
				for (var6 = 7; var6 >= 0; --var6) {
					if (Client.playerActions[var6] != null) {
						short var4 = 0;
						if (Client.playerActions[var6].equalsIgnoreCase("Attack")) {
							if (Client.aClass36_2170 == Class36.aClass36_399) {
								continue;
							}

							if (Client.aClass36_2170 == Class36.aClass36_398
									|| Client.aClass36_2170 == Class36.aClass36_403
											&& var0.combatLevel > Class68.myPlayer.combatLevel) {
								var4 = 2000;
							}

							if (Class68.myPlayer.team != 0 && var0.team != 0) {
								if (var0.team == Class68.myPlayer.team) {
									var4 = 2000;
								} else {
									var4 = 0;
								}
							}
						} else if (Client.aBoolArray2109[var6]) {
							var4 = 2000;
						}

						int var8 = Client.anIntArray2108[var6] + var4;
						FriendedPlayer.addMenuRow(Client.playerActions[var6], Class48_Sub1.method545(16777215) + var5,
								var8, var1, var2, var3);
					}
				}
			}

			for (var6 = 0; var6 < Client.menuItemCount; var6++) {
				if (Client.menuOpcodes[var6] == 23) {
					Client.menuNouns[var6] = Class48_Sub1.method545(16777215) + var5;
					break;
				}
			}
		}

	}

	public abstract void drawImage(Graphics var1, int var2, int var3);

	public abstract void initializeProducer(int var1, int var2, Component var3);

	public static Widget method146(int var0, int var1) {
		Widget var2 = Class94.getWidget(var0);
		return var1 == -1 ? var2
				: (var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null);
	}

	static void method147(SequenceType var0, int var1, int var2, int var3) {
		if (Client.audioEffectCount < 50 && Client.anInt2205 * 873913835 != 0 && var0.anIntArray1487 != null
				&& var1 < var0.anIntArray1487.length) {
			int var5 = var0.anIntArray1487[var1];
			if (var5 != 0) {
				int var7 = var5 >> 8;
				int var8 = var5 >> 4 & 0x7;
				int var6 = var5 & 0xf;
				Client.anIntArray2206[Client.audioEffectCount] = var7;
				Client.anIntArray2073[Client.audioEffectCount] = var8;
				Client.anIntArray2029[Client.audioEffectCount] = 0;
				Client.aClass14Array2210[Client.audioEffectCount] = null;
				int var9 = (var2 - 64) / 128;
				int var4 = (var3 - 64) / 128;
				Client.anIntArray2209[Client.audioEffectCount] = (var4 << 8) + var6 + (var9 << 16);
				++Client.audioEffectCount;
			}
		}

	}

}
