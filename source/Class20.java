import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Class20 {

	public int anInt270;
	public int[] anIntArray271;
	int anInt272;
	public Image anImage273;

	public abstract void method141(Graphics var1, int var2, int var3, int var4, int var5, short var6);

	public final void method142() {
		RSGraphics.setRaster(this.anIntArray271, this.anInt270 * 1154763343, this.anInt272 * -1725941875);
	}

	static final void method143(Player var0, int var1, int var2, int var3) {
		if (Class68.myPlayer != var0) {
			if (Client.menuItemCount * 1768430155 < 400) {
				String var5;
				if (var0.totalLevel * -1553063231 == 0) {
					var5 = var0.aStringArray1986[0] + var0.name + var0.aStringArray1986[1]
							+ Class56.method285(1614853309 * var0.combatLevel,
									Class68.myPlayer.combatLevel * 1614853309)
							+ " " + Class35.aString389 + GameStrings.aString999 + 1614853309 * var0.combatLevel
							+ Class35.aString392 + var0.aStringArray1986[2];
				} else {
					var5 = var0.aStringArray1986[0] + var0.name + var0.aStringArray1986[1] + " " + Class35.aString389
							+ GameStrings.aString989 + -1553063231 * var0.totalLevel + Class35.aString392
							+ var0.aStringArray1986[2];
				}

				int var6;
				if (Client.itemSelectionStatus * -1110581093 == 1) {
					FriendedPlayer.addMenuRow(GameStrings.aString993, Client.selectedItemName + " " + Class35.aString391
							+ " " + Class48_Sub1.method545(16777215) + var5, 14, var1, var2, var3);
				} else if (Client.spellSelected) {
					if ((2016481409 * Class31.currentSpellTargets & 8) == 8) {
						FriendedPlayer.addMenuRow(Client.menuActionPrefix, Client.selectedSpellName + " "
								+ Class35.aString391 + " " + Class48_Sub1.method545(16777215) + var5, 15, var1, var2,
								var3);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerActions[var6] != null) {
							short var4 = 0;
							if (Client.playerActions[var6].equalsIgnoreCase(GameStrings.aString1112)) {
								if (Client.aClass36_2170 == Class36.aClass36_399) {
									continue;
								}

								if (Client.aClass36_2170 == Class36.aClass36_398
										|| Client.aClass36_2170 == Class36.aClass36_403 && 1614853309
												* var0.combatLevel > 1614853309 * Class68.myPlayer.combatLevel) {
									var4 = 2000;
								}

								if (-103629189 * Class68.myPlayer.team != 0 && var0.team * -103629189 != 0) {
									if (var0.team * -103629189 == Class68.myPlayer.team * -103629189) {
										var4 = 2000;
									} else {
										var4 = 0;
									}
								}
							} else if (Client.aBoolArray2109[var6]) {
								var4 = 2000;
							}

							boolean var7 = false;
							int var8 = Client.anIntArray2108[var6] + var4;
							FriendedPlayer.addMenuRow(Client.playerActions[var6],
									Class48_Sub1.method545(16777215) + var5, var8, var1, var2, var3);
						}
					}
				}

				for (var6 = 0; var6 < 1768430155 * Client.menuItemCount; ++var6) {
					if (Client.menuOpcodes[var6] == 23) {
						Client.menuNouns[var6] = Class48_Sub1.method545(16777215) + var5;
						break;
					}
				}

			}
		}
	}

	public abstract void method144(Graphics var1, int var2, int var3, int var4);

	public abstract void method145(int var1, int var2, Component var3, byte var4);

	public static Widget method146(int var0, int var1) {
		Widget var2 = Class94.getWidget(var0);
		return var1 == -1 ? var2
				: (var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null);
	}

	static void method147(SequenceType var0, int var1, int var2, int var3) {
		if (Client.audioEffectCount * 2079336095 < 50 && Client.anInt2205 * 873913835 != 0) {
			if (var0.anIntArray1487 != null && var1 < var0.anIntArray1487.length) {
				int var5 = var0.anIntArray1487[var1];
				if (var5 != 0) {
					int var7 = var5 >> 8;
					int var8 = var5 >> 4 & 7;
					int var6 = var5 & 15;
					Client.anIntArray2206[Client.audioEffectCount * 2079336095] = var7;
					Client.anIntArray2073[2079336095 * Client.audioEffectCount] = var8;
					Client.anIntArray2029[Client.audioEffectCount * 2079336095] = 0;
					Client.aClass14Array2210[2079336095 * Client.audioEffectCount] = null;
					int var9 = (var2 - 64) / 128;
					int var4 = (var3 - 64) / 128;
					Client.anIntArray2209[2079336095 * Client.audioEffectCount] = var6 + (var4 << 8) + (var9 << 16);
					Client.audioEffectCount += -857377441;
				}
			}
		}
	}
}
