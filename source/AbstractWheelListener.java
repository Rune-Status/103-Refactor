import java.awt.Component;

public abstract class AbstractWheelListener {

	static int anInt654;

	public abstract void setWheelListener(Component var1);

	public abstract int getRotation();

	public abstract void removeWheelListener(Component var1);

	public static void removeKeyFocusListener(Component comp) {
		comp.removeKeyListener(KeyFocusListener.kfListener);
		comp.removeFocusListener(KeyFocusListener.kfListener);
		KeyFocusListener.anInt596 = -1;
	}

	static final void method344() {
		for (int var9 = 0; var9 < Client.audioEffectCount; var9++) {
			--Client.anIntArray2029[var9];
			if (Client.anIntArray2029[var9] >= -10) {
				Track var101 = Client.aClass14Array2210[var9];
				if (var101 == null) {
					var101 = Track.getTrack(VarClientType.sfxIndex, Client.anIntArray2206[var9], 0);
					if (var101 == null) {
						continue;
					}

					Client.anIntArray2029[var9] += var101.calculateDelay();
					Client.aClass14Array2210[var9] = var101;
				}

				if (Client.anIntArray2029[var9] < 0) {
					int var8;
					if (Client.anIntArray2209[var9] != 0) {
						int var11 = (Client.anIntArray2209[var9] & 0xff) * 128;
						int var12 = Client.anIntArray2209[var9] >> 16 & 0xff;
						int var1 = var12 * 128 + 64 - Class68.myPlayer.strictX;
						if (var1 < 0) {
							var1 = -var1;
						}

						int var4 = Client.anIntArray2209[var9] >> 8 & 0xff;
						int var5 = var4 * 128 + 64 - Class68.myPlayer.strictY;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var3 = var5 + var1 - 128;
						if (var3 > var11) {
							Client.anIntArray2029[var9] = -100;
							continue;
						}

						if (var3 < 0) {
							var3 = 0;
						}

						var8 = (var11 - var3) * Client.anInt2205 * 873913835 / var11;
					} else {
						var8 = Client.anInt2204;
					}

					if (var8 > 0) {
						Node_Sub2_Sub1 var111 = var101.method122().method722(Class59.aClass16_548);
						Node_Sub4_Sub2 var121 = Node_Sub4_Sub2.method771(var111, 100, var8);
						var121.method740(Client.anIntArray2073[var9] - 1);
						FriendedPlayer.aNode_Sub4_Sub1_740.method729(var121);
					}

					Client.anIntArray2029[var9] = -100;
				}
			} else {
				--Client.audioEffectCount;

				for (int var10 = var9; var10 < Client.audioEffectCount; var10++) {
					Client.anIntArray2206[var10] = Client.anIntArray2206[var10 + 1];
					Client.aClass14Array2210[var10] = Client.aClass14Array2210[var10 + 1];
					Client.anIntArray2073[var10] = Client.anIntArray2073[var10 + 1];
					Client.anIntArray2029[var10] = Client.anIntArray2029[var10 + 1];
					Client.anIntArray2209[var10] = Client.anIntArray2209[var10 + 1];
				}

				--var9;
			}
		}

		if (Client.aBool2191) {
			boolean var91;
			if (Class110.anInt782 != 0) {
				var91 = true;
			} else {
				var91 = Class110.aNode_Sub4_Sub4_784.method831();
			}

			if (!var91) {
				if (Client.anInt2201 != 0 && Client.anInt2202 != -1) {
					Class69.method328(Class2.midiTrack1Index, Client.anInt2202, 0, Client.anInt2201, false);
				}

				Client.aBool2191 = false;
			}
		}

	}

}
