import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {

	static GameEngine shell = null;
	static int anInt1969 = 0;
	static boolean aBool1970 = false;
	boolean aBool1971 = false;
	static long aLong1972 = 0L;
	static int anInt1973 = -347165529;
	static int anInt1974 = 1386635868;
	static long[] aLongArray1975 = new long[32];
	protected static int anInt1976 = 0;
	static long[] aLongArray1977 = new long[32];
	protected static int anInt1978 = 0;
	public static volatile boolean aBool1979 = true;
	static int anInt1980 = -1823610604;
	protected static boolean aBool1981 = false;
	protected static volatile boolean aBool1982 = false;
	protected static int anInt1983 = 0;
	static volatile boolean focused = true;
	static volatile long aLong1984 = 0L;

	protected final synchronized void method1027() {
		Container var1 = this.method1033();
		if (LandscapeTile.aCanvas1417 != null) {
			LandscapeTile.aCanvas1417.removeFocusListener(this);
			var1.remove(LandscapeTile.aCanvas1417);
		}

		Class34.anInt381 = Math.max(var1.getWidth(), Class126.anInt836 * 2055757083) * -780223189;
		Node_Sub9.anInt1339 = Math.max(var1.getHeight(), -1066486805 * ClanMate.anInt1222) * 427958731;
		Insets var2;
		if (DualNode_Sub10.aFrame1538 != null) {
			var2 = DualNode_Sub10.aFrame1538.getInsets();
			Class34.anInt381 -= -780223189 * (var2.left + var2.right);
			Node_Sub9.anInt1339 -= (var2.bottom + var2.top) * 427958731;
		}

		LandscapeTile.aCanvas1417 = new GameCanvas(this);
		var1.add(LandscapeTile.aCanvas1417);
		LandscapeTile.aCanvas1417.setSize(-452716157 * Class34.anInt381, Node_Sub9.anInt1339 * 674167779);
		LandscapeTile.aCanvas1417.setVisible(true);
		if (DualNode_Sub10.aFrame1538 == var1) {
			var2 = DualNode_Sub10.aFrame1538.getInsets();
			LandscapeTile.aCanvas1417.setLocation(var2.left + 76231581 * anInt1983, var2.top + anInt1978 * -225353991);
		} else {
			LandscapeTile.aCanvas1417.setLocation(76231581 * anInt1983, anInt1978 * -225353991);
		}

		LandscapeTile.aCanvas1417.addFocusListener(this);
		LandscapeTile.aCanvas1417.requestFocus();
		aBool1979 = true;
		int var3 = -452716157 * Class34.anInt381;
		int var4 = 674167779 * Node_Sub9.anInt1339;
		Canvas var5 = LandscapeTile.aCanvas1417;

		Object var9;
		try {
			Class20_Sub2 var6 = new Class20_Sub2();
			var6.method145(var3, var4, var5, (byte) 1);
			var9 = var6;
		} catch (Throwable var8) {
			Class20_Sub1 var7 = new Class20_Sub1();
			var7.method145(var3, var4, var5, (byte) 1);
			var9 = var7;
		}

		if (Class62.aClass20_570 != null) {
			Class62.aClass20_570.method144(((Class20) var9).anImage273.getGraphics(), 0, 0, -819332484);
		}

		Class62.aClass20_570 = (Class20) var9;
		aBool1982 = false;
		aLong1984 = Node_Sub5.currentTimeMs() * -2460302806870968417L;
	}

	protected final boolean method1028() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (!var1.equals("mechscape.com") && !var1.endsWith(".mechscape.com")) {
					if (var1.endsWith("127.0.0.1")) {
						return true;
					} else {
						while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= 48
								&& var1.charAt(var1.length() - 1) <= 57) {
							var1 = var1.substring(0, var1.length() - 1);
						}

						if (var1.endsWith("192.168.1.")) {
							return true;
						} else {
							this.method1032("invalidhost");
							return false;
						}
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void run() {
		try {
			if (Class63.aString579 != null) {
				String var1 = Class63.aString579.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = Class63.aString575;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")
							|| var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4")
							|| var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.")
							|| var2.equals("1.6.0")) {
						this.method1032("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && Class66_Sub2.method553(var2.charAt(var3)); ++var3) {
							;
						}

						String var4 = var2.substring(6, var3);
						boolean var5 = false;
						boolean var6 = false;
						int var7 = 0;
						int var8 = var4.length();
						int var9 = 0;

						boolean var11;
						while (true) {
							if (var9 >= var8) {
								var11 = var6;
								break;
							}

							label156: {
								char var10 = var4.charAt(var9);
								if (var9 == 0) {
									if (var10 == 45) {
										var5 = true;
										break label156;
									}

									if (var10 == 43) {
										break label156;
									}
								}

								int var16;
								if (var10 >= 48 && var10 <= 57) {
									var16 = var10 - 48;
								} else if (var10 >= 65 && var10 <= 90) {
									var16 = var10 - 55;
								} else {
									if (var10 < 97 || var10 > 122) {
										var11 = false;
										break;
									}

									var16 = var10 - 87;
								}

								if (var16 >= 10) {
									var11 = false;
									break;
								}

								if (var5) {
									var16 = -var16;
								}

								int var12 = 10 * var7 + var16;
								if (var12 / 10 != var7) {
									var11 = false;
									break;
								}

								var7 = var12;
								var6 = true;
							}

							++var9;
						}

						if (var11) {
							int var17 = Node_Sub5.method535(var4, 10, true);
							if (var17 < 10) {
								this.method1032("wrongjava");
								return;
							}
						}
					}

					anInt1973 = -1735827645;
				}
			}

			this.setFocusCycleRoot(true);
			this.method1027();
			this.method1031(-1295554880);
			Class90.aClass66_721 = DualNode_Sub12.method778(-74695759);

			while (aLong1972 * 2722427985237087875L == 0L
					|| Node_Sub5.currentTimeMs() < 2722427985237087875L * aLong1972) {
				Node_Sub8.anInt1301 = Class90.aClass66_721.method322(anInt1974 * 2081489859, anInt1973 * 87833367,
						(byte) -6) * 1809972633;

				for (int var15 = 0; var15 < -108132695 * Node_Sub8.anInt1301; ++var15) {
					this.method1029();
				}

				this.method1039();
				GraphicsStub.method935(IsaacRandom.aClass63_102, LandscapeTile.aCanvas1417);
			}
		} catch (Exception var14) {
			Class79.method345((String) null, var14);
			this.method1032("crash");
		}

		this.method1030();
	}

	void method1029() {
		long var1 = Node_Sub5.currentTimeMs();
		long var3 = aLongArray1977[Class78.anInt654 * 1149319977];
		aLongArray1977[Class78.anInt654 * 1149319977] = var1;
		Class78.anInt654 = 549949721 * (Class78.anInt654 * 1149319977 + 1 & 31);
		if (0L != var3 && var1 > var3) {
			;
		}

		synchronized (this) {
			Entity.aBool1439 = focused;
		}

		this.processLogic();
	}

	final synchronized void method1030() {
		if (!aBool1970) {
			aBool1970 = true;

			try {
				LandscapeTile.aCanvas1417.removeFocusListener(this);
			} catch (Exception var5) {
				;
			}

			try {
				this.method1038(-1961815165);
			} catch (Exception var4) {
				;
			}

			if (DualNode_Sub10.aFrame1538 != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
					;
				}
			}

			if (IsaacRandom.aClass63_102 != null) {
				try {
					IsaacRandom.aClass63_102.method312();
				} catch (Exception var2) {
					;
				}
			}

			this.method1035((byte) -100);
		}
	}

	public void start() {
		if (shell == this && !aBool1970) {
			aLong1972 = 0L;
		}
	}

	public void destroy() {
		if (this == shell && !aBool1970) {
			aLong1972 = Node_Sub5.currentTimeMs() * 4455918119670900779L;
			Class96_Sub1.method500(5000L);
			this.method1030();
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		focused = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	protected abstract void method1031(int var1);

	protected void method1032(String var1) {
		if (!this.aBool1971) {
			this.aBool1971 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"),
						"_self");
			} catch (Exception var3) {
				;
			}

		}
	}

	protected Container method1033() {
		return (Container) (DualNode_Sub10.aFrame1538 != null ? DualNode_Sub10.aFrame1538 : this);
	}

	protected Dimension method1034() {
		Container var1 = this.method1033();
		int var2 = Math.max(var1.getWidth(), 2055757083 * Class126.anInt836);
		int var4 = Math.max(var1.getHeight(), ClanMate.anInt1222 * -1066486805);
		if (DualNode_Sub10.aFrame1538 != null) {
			Insets var3 = DualNode_Sub10.aFrame1538.getInsets();
			var2 -= var3.left + var3.right;
			var4 -= var3.bottom + var3.top;
		}

		return new Dimension(var2, var4);
	}

	protected abstract void method1035(byte var1);

	protected final void method1036(int var1, int var2, int var3) {
		try {
			if (shell != null) {
				anInt1969 += 2053161379;
				if (-1859094005 * anInt1969 >= 3) {
					this.method1032("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			shell = this;
			Class34.anInt381 = -780223189 * var1;
			Node_Sub9.anInt1339 = 427958731 * var2;
			Class125.anInt830 = var3 * -778950217;
			CollionMap.anApplet508 = this;
			if (IsaacRandom.aClass63_102 == null) {
				IsaacRandom.aClass63_102 = new Class63();
			}

			IsaacRandom.aClass63_102.method313(this, 1);
		} catch (Exception var5) {
			Class79.method345((String) null, var5);
			this.method1032("crash");
		}

	}

	protected abstract void method1037(short var1);

	public final void focusGained(FocusEvent var1) {
		focused = true;
		aBool1979 = true;
	}

	protected abstract void processLogic();

	protected abstract void method1038(int var1);

	void method1039() {
		Container var1 = this.method1033();
		long var5 = Node_Sub5.currentTimeMs();
		long var2 = aLongArray1975[263003187 * IsaacRandom.anInt97];
		aLongArray1975[IsaacRandom.anInt97 * 263003187] = var5;
		IsaacRandom.anInt97 = (1 + 263003187 * IsaacRandom.anInt97 & 31) * 1221279483;
		if (0L != var2 && var5 > var2) {
			int var4 = (int) (var5 - var2);
			anInt1976 = ((var4 >> 1) + 32000) / var4 * -709122581;
		}

		if ((anInt1980 += -871230615) * 355183833 - 1 > 50) {
			anInt1980 -= -611857790;
			aBool1979 = true;
			LandscapeTile.aCanvas1417.setSize(Class34.anInt381 * -452716157, 674167779 * Node_Sub9.anInt1339);
			LandscapeTile.aCanvas1417.setVisible(true);
			if (DualNode_Sub10.aFrame1538 == var1) {
				Insets var7 = DualNode_Sub10.aFrame1538.getInsets();
				LandscapeTile.aCanvas1417.setLocation(anInt1983 * 76231581 + var7.left,
						var7.top + anInt1978 * -225353991);
			} else {
				LandscapeTile.aCanvas1417.setLocation(anInt1983 * 76231581, anInt1978 * -225353991);
			}
		}

		this.method1037((short) -22689);
	}

	public void stop() {
		if (shell == this && !aBool1970) {
			aLong1972 = (Node_Sub5.currentTimeMs() + 4000L) * 4455918119670900779L;
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (shell == this && !aBool1970) {
			aBool1979 = true;
			if (Class63.aString575 != null && Class63.aString575.startsWith("1.5")
					&& Node_Sub5.currentTimeMs() - aLong1984 * -2499368560980646817L > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= -452716157 * Class34.anInt381
						&& var2.height >= 674167779 * Node_Sub9.anInt1339) {
					aBool1982 = true;
				}
			}

		}
	}

	static DualNode_Sub13_Sub2[] method1040() {
		DualNode_Sub13_Sub2[] var0 = new DualNode_Sub13_Sub2[817614505 * Class7.anInt154];

		for (int var2 = 0; var2 < Class7.anInt154 * 817614505; ++var2) {
			DualNode_Sub13_Sub2 var1 = var0[var2] = new DualNode_Sub13_Sub2();
			var1.anInt1804 = Class7.anInt148 * -749860951;
			var1.anInt1805 = Class7.anInt155 * -1945497809;
			var1.anInt1803 = Class7.anIntArray149[var2];
			var1.anInt1802 = DualNode_Sub11.anIntArray1544[var2];
			var1.anInt1800 = Class7.anIntArray150[var2];
			var1.anInt1801 = Class7.anIntArray151[var2];
			var1.anIntArray1798 = Class85.anIntArray690;
			var1.aByteArray1799 = Npc.aByteArrayArray1966[var2];
		}

		Class65.method318();
		return var0;
	}
}
