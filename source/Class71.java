import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class71 implements KeyListener, FocusListener {

	static Class61 aClass61_589;
	static int[] anIntArray590 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86,
			-1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1,
			-1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52,
			53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231,
			227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1,
			-1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	static int anInt591 = 0;
	public static int[] anIntArray592 = new int[128];
	public static boolean[] aBoolArray593 = new boolean[112];
	static int[] anIntArray594 = new int[128];
	static int anInt595 = 0;
	static int anInt596 = 0;
	static char[] aCharArray597 = new char[128];
	static int[] anIntArray598 = new int[128];
	static int anInt599 = 0;
	static int anInt600 = 0;
	public static volatile int anInt601 = 0;
	public static int anInt602 = 0;
	public static Class71 aClass71_603 = new Class71();

	public final synchronized void keyPressed(KeyEvent var1) {
		if (aClass71_603 != null) {
			anInt601 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray590.length) {
				var2 = anIntArray590[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (1397604687 * anInt596 >= 0 && var2 >= 0) {
				anIntArray594[1397604687 * anInt596] = var2;
				anInt596 = (1 + 1397604687 * anInt596 & 127) * -434850385;
				if (1246538247 * anInt595 == anInt596 * 1397604687) {
					anInt596 = 434850385;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = -1444135991 * anInt591 + 1 & 127;
				if (anInt599 * -103725771 != var3) {
					anIntArray598[-1444135991 * anInt591] = var2;
					aCharArray597[anInt591 * -1444135991] = 0;
					anInt591 = var3 * -1017328007;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final void keyTyped(KeyEvent var1) {
		if (aClass71_603 != null) {
			char var3 = var1.getKeyChar();
			if (var3 != 0 && var3 != '\uffff') {
				boolean var2;
				if ((var3 <= 0 || var3 >= 128) && (var3 < 160 || var3 > 255)) {
					label68: {
						if (var3 != 0) {
							char[] var6 = Class85.characters;

							for (int var4 = 0; var4 < var6.length; ++var4) {
								char var5 = var6[var4];
								if (var5 == var3) {
									var2 = true;
									break label68;
								}
							}
						}

						var2 = false;
					}
				} else {
					var2 = true;
				}

				if (var2) {
					int var7 = 1 + -1444135991 * anInt591 & 127;
					if (var7 != anInt599 * -103725771) {
						anIntArray598[-1444135991 * anInt591] = -1;
						aCharArray597[-1444135991 * anInt591] = var3;
						anInt591 = -1017328007 * var7;
					}
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (aClass71_603 != null) {
			anInt596 = 434850385;
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (aClass71_603 != null) {
			anInt601 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray590.length) {
				var2 = anIntArray590[var2] & -129;
			} else {
				var2 = -1;
			}

			if (1397604687 * anInt596 >= 0 && var2 >= 0) {
				anIntArray594[anInt596 * 1397604687] = ~var2;
				anInt596 = -434850385 * (1 + 1397604687 * anInt596 & 127);
				if (1397604687 * anInt596 == 1246538247 * anInt595) {
					anInt596 = 434850385;
				}
			}
		}

		var1.consume();
	}

	static final void method330(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArg1[var0];
			int var2 = Client.menuArg2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuArg0[var0];
			String var5 = Client.menuActions[var0];
			String var6 = Client.menuNouns[var0];
			ClassVerifier.method583(var1, var2, var3, var4, var5, var6, -2040065729 * Class74.anInt628,
					2090526775 * Class74.anInt629);
		}
	}
}
