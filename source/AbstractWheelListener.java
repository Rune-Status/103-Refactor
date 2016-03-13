import java.awt.Component;

public abstract class AbstractWheelListener {

	static int anInt654;

	public abstract void setWheelListener(Component var1);

	public abstract int getRotation();

	public abstract void removeWheelListener(Component var1);

	public static void removeKeyFocusListener(Component comp) {
		comp.removeKeyListener(KeyFocusListener.kfListener);
		comp.removeFocusListener(KeyFocusListener.kfListener);
		KeyFocusListener.anInt596 = 434850385;
	}

	static final void method344() {
		for (int var0 = 0; var0 < Client.audioEffectCount * 2079336095; ++var0) {
			--Client.anIntArray2029[var0];
			if (Client.anIntArray2029[var0] < -10) {
				Client.audioEffectCount -= -857377441;

				for (int var2 = var0; var2 < Client.audioEffectCount * 2079336095; ++var2) {
					Client.anIntArray2206[var2] = Client.anIntArray2206[var2 + 1];
					Client.aClass14Array2210[var2] = Client.aClass14Array2210[var2 + 1];
					Client.anIntArray2073[var2] = Client.anIntArray2073[var2 + 1];
					Client.anIntArray2029[var2] = Client.anIntArray2029[1 + var2];
					Client.anIntArray2209[var2] = Client.anIntArray2209[1 + var2];
				}

				--var0;
			} else {
				Class14 var10 = Client.aClass14Array2210[var0];
				if (var10 == null) {
					var10 = Class14.method119(VarClientType.sfxIndex, Client.anIntArray2206[var0], 0);
					if (var10 == null) {
						continue;
					}

					Client.anIntArray2029[var0] += var10.method121();
					Client.aClass14Array2210[var0] = var10;
				}

				if (Client.anIntArray2029[var0] < 0) {
					int var8;
					if (Client.anIntArray2209[var0] != 0) {
						int var6 = 128 * (Client.anIntArray2209[var0] & 0xFF);
						int var7 = Client.anIntArray2209[var0] >> 16 & 0xFF;
						int var1 = 128 * var7 + 64 - Class68.myPlayer.strictX * 1272643751;
						if (var1 < 0) {
							var1 = -var1;
						}

						int var4 = Client.anIntArray2209[var0] >> 8 & 0xFF;
						int var5 = 64 + 128 * var4 - Class68.myPlayer.strictY * -1801433343;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var3 = var5 + var1 - 128;
						if (var3 > var6) {
							Client.anIntArray2029[var0] = -100;
							continue;
						}

						if (var3 < 0) {
							var3 = 0;
						}

						var8 = (var6 - var3) * Client.anInt2205 * 873913835 / var6;
					} else {
						var8 = Client.anInt2204 * 936209849;
					}

					if (var8 > 0) {
						Node_Sub2_Sub1 var11 = var10.method122().method722(Class59.aClass16_548);
						Node_Sub4_Sub2 var12 = Node_Sub4_Sub2.method771(var11, 100, var8);
						var12.method740(Client.anIntArray2073[var0] - 1);
						FriendedPlayer.aNode_Sub4_Sub1_740.method729(var12);
					}

					Client.anIntArray2029[var0] = -100;
				}
			}
		}

		if (Client.aBool2191) {
			boolean var9;
			if (Class110.anInt782 * -1587772409 != 0) {
				var9 = true;
			} else {
				var9 = Class110.aNode_Sub4_Sub4_784.method831();
			}

			if (!var9) {
				if (Client.anInt2201 * -1994948003 != 0 && 850867613 * Client.anInt2202 != -1) {
					Class69.method328(Class2.midiTrack1Index, Client.anInt2202 * 850867613, 0,
							Client.anInt2201 * -1994948003, false);
				}

				Client.aBool2191 = false;
			}
		}

	}
}
