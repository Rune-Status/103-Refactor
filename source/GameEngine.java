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

	boolean aBool1971 = false;
	public static volatile boolean aBool1979 = true;
	protected static volatile boolean aBool1982 = false;
	static volatile long aLong1984 = 0L;
	static int anInt1973 = 1;
	static boolean aBool1970 = false;
	static long aLong1972 = 0L;
	static volatile boolean focused = true;
	static int shellCount = 0;
	static GameEngine shell = null;
	static int anInt1980 = 500;
	protected static int fps = 0;
	static int anInt1974 = 20;
	static long[] aLongArray1975 = new long[32];
	static long[] aLongArray1977 = new long[32];
	protected static int anInt1978 = 0;
	protected static boolean aBool1981 = false;
	protected static int anInt1983 = 0;

	protected final synchronized void method1027() {
		Container var1 = this.container();
		if (LandscapeTile.gameCanvas != null) {
			LandscapeTile.gameCanvas.removeFocusListener(this);
			var1.remove(LandscapeTile.gameCanvas);
		}

		Class34.gameWidth = Math.max(var1.getWidth(), CacheFileAccessor.anInt836 * 2055757083);
		Node_Sub9.gameHeight = Math.max(var1.getHeight(), ClanMate.anInt1222 * -1066486805);
		Insets var2;
		if (VarClientType.gameFrame != null) {
			var2 = VarClientType.gameFrame.getInsets();
			Class34.gameWidth -= var2.left + var2.right;
			Node_Sub9.gameHeight -= var2.bottom + var2.top;
		}

		LandscapeTile.gameCanvas = new GameCanvas(this);
		var1.add(LandscapeTile.gameCanvas);
		LandscapeTile.gameCanvas.setSize(Class34.gameWidth, Node_Sub9.gameHeight);
		LandscapeTile.gameCanvas.setVisible(true);
		if (VarClientType.gameFrame == var1) {
			var2 = VarClientType.gameFrame.getInsets();
			LandscapeTile.gameCanvas.setLocation(var2.left + anInt1983, var2.top + anInt1978);
		} else {
			LandscapeTile.gameCanvas.setLocation(anInt1983, anInt1978);
		}

		LandscapeTile.gameCanvas.addFocusListener(this);
		LandscapeTile.gameCanvas.requestFocus();
		aBool1979 = true;
		int width = Class34.gameWidth;
		int height = Node_Sub9.gameHeight;
		Canvas canvas = LandscapeTile.gameCanvas;

		Object producer;
		try {
			DirectImageProducer var8 = new DirectImageProducer();
			var8.initializeProducer(width, height, canvas);
			producer = var8;
		} catch (Throwable var9) {
			ConsumingImageProducer cip = new ConsumingImageProducer();
			cip.initializeProducer(width, height, canvas);
			producer = cip;
		}

		if (IndexTable.imageProducer != null) {
			IndexTable.imageProducer.drawImage(((AbstractProducer) producer).image.getGraphics(), 0, 0);
		}

		IndexTable.imageProducer = (AbstractProducer) producer;
		aBool1982 = false;
		aLong1984 = AnimationSkin.currentTimeMs();
	}

	protected final boolean isValidHost() {
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
							this.error("invalidhost");
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
			if (TaskManager.javaVendor != null) {
				String var14 = TaskManager.javaVendor.toLowerCase();
				if (var14.indexOf("sun") != -1 || var14.indexOf("apple") != -1) {
					String var2 = TaskManager.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")
							|| var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4")
							|| var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.")
							|| var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && MilliTimer.method553(var2.charAt(var3)); var3++) {
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

							label162: {
								char var17 = var4.charAt(var9);
								if (var9 == 0) {
									if (var17 == 45) {
										var5 = true;
										break label162;
									}

									if (var17 == 43) {
										break label162;
									}
								}

								int var16;
								if (var17 >= 48 && var17 <= 57) {
									var16 = var17 - 48;
								} else if (var17 >= 65 && var17 <= 90) {
									var16 = var17 - 55;
								} else {
									if (var17 < 97 || var17 > 122) {
										var11 = false;
										break;
									}

									var16 = var17 - 87;
								}

								if (var16 >= 10) {
									var11 = false;
									break;
								}

								if (var5) {
									var16 = -var16;
								}

								int var12 = var7 * 10 + var16;
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
							int var161 = AnimationSkin.method535(var4, 10, true);
							if (var161 < 10) {
								this.error("wrongjava");
								return;
							}
						}
					}

					anInt1973 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method1027();
			this.method1031(-1295554880);
			Class90.timer = SkeletonSet.getTimer();

			while (aLong1972 == 0L || AnimationSkin.currentTimeMs() < aLong1972) {
				Node_Sub8.anInt1301 = Class90.timer.method322(anInt1974, anInt1973);

				for (int var15 = 0; var15 < Node_Sub8.anInt1301; var15++) {
					this.method1029();
				}

				this.method1039();
				GraphicsStub.method935(IsaacRandom.taskManager, LandscapeTile.gameCanvas);
			}
		} catch (Exception var141) {
			Class79.error((String) null, var141);
			this.error("crash");
		}

		this.method1030();
	}

	void method1029() {
		long var1 = AnimationSkin.currentTimeMs();
		long var3 = aLongArray1977[AbstractWheelListener.anInt654];
		aLongArray1977[AbstractWheelListener.anInt654] = var1;
		AbstractWheelListener.anInt654 = AbstractWheelListener.anInt654 + 1 & 0x1f;
		if (var3 != 0L && var1 > var3) {
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
				LandscapeTile.gameCanvas.removeFocusListener(this);
			} catch (Exception var5) {
				;
			}

			try {
				this.method1038(-1961815165);
			} catch (Exception var4) {
				;
			}

			if (VarClientType.gameFrame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
					;
				}
			}

			if (IsaacRandom.taskManager != null) {
				try {
					IsaacRandom.taskManager.join();
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
		if (shell == this && !aBool1970) {
			aLong1972 = AnimationSkin.currentTimeMs();
			Class96_Sub1.sleep(5000L);
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

	protected void error(String var1) {
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

	protected Container container() {
		return (Container) (VarClientType.gameFrame != null ? VarClientType.gameFrame : this);
	}

	protected Dimension method1034() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), CacheFileAccessor.anInt836 * 2055757083);
		int var4 = Math.max(var1.getHeight(), ClanMate.anInt1222 * -1066486805);
		if (VarClientType.gameFrame != null) {
			Insets var3 = VarClientType.gameFrame.getInsets();
			var2 -= var3.left + var3.right;
			var4 -= var3.bottom + var3.top;
		}

		return new Dimension(var2, var4);
	}

	protected abstract void method1035(byte var1);

	protected final void initialize(int var1, int var2, int var3) {
		try {
			if (shell != null) {
				++shellCount;
				if (shellCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			shell = this;
			Class34.gameWidth = var1;
			Node_Sub9.gameHeight = var2;
			Class125.gameRevision = var3;
			CollisionMap.gameApplet = this;
			if (IsaacRandom.taskManager == null) {
				IsaacRandom.taskManager = new TaskManager();
			}

			IsaacRandom.taskManager.createRunnable(this, 1);
		} catch (Exception var5) {
			Class79.error((String) null, var5);
			this.error("crash");
		}

	}

	protected abstract void method1037();

	public final void focusGained(FocusEvent var1) {
		focused = true;
		aBool1979 = true;
	}

	protected abstract void processLogic();

	protected abstract void method1038(int var1);

	void method1039() {
		Container var1 = this.container();
		long var5 = AnimationSkin.currentTimeMs();
		long var2 = aLongArray1975[IsaacRandom.anInt97];
		aLongArray1975[IsaacRandom.anInt97] = var5;
		IsaacRandom.anInt97 = IsaacRandom.anInt97 + 1 & 0x1f;
		if (var2 != 0L && var5 > var2) {
			int var7 = (int) (var5 - var2);
			fps = ((var7 >> 1) + 32000) / var7;
		}

		if (++anInt1980 - 1 > 50) {
			anInt1980 -= 50;
			aBool1979 = true;
			LandscapeTile.gameCanvas.setSize(Class34.gameWidth, Node_Sub9.gameHeight);
			LandscapeTile.gameCanvas.setVisible(true);
			if (VarClientType.gameFrame == var1) {
				Insets var71 = VarClientType.gameFrame.getInsets();
				LandscapeTile.gameCanvas.setLocation(anInt1983 + var71.left, var71.top + anInt1978);
			} else {
				LandscapeTile.gameCanvas.setLocation(anInt1983, anInt1978);
			}
		}

		this.method1037();
	}

	public void stop() {
		if (shell == this && !aBool1970) {
			aLong1972 = AnimationSkin.currentTimeMs() + 4000L;
		}

	}

	public final synchronized void paint(Graphics var1) {
		if (shell == this && !aBool1970) {
			aBool1979 = true;
			if (TaskManager.javaVersion != null && TaskManager.javaVersion.startsWith("1.5")
					&& AnimationSkin.currentTimeMs() - aLong1984 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Class34.gameWidth && var2.height >= Node_Sub9.gameHeight) {
					aBool1982 = true;
				}
			}
		}

	}

	static Sprite[] method1040() {
		Sprite[] var0 = new Sprite[Class7.size];

		for (int var2 = 0; var2 < Class7.size; var2++) {
			Sprite var1 = var0[var2] = new Sprite();
			var1.width = Class7.width;
			var1.height = Class7.height;
			var1.offsetX = Class7.offsetsX[var2];
			var1.offsetY = VarPlayerType.offsetsY[var2];
			var1.subWidth = Class7.subWidths[var2];
			var1.subHeight = Class7.subHeights[var2];
			var1.palette = Class85.palette;
			var1.pixels = Npc.spritePixels[var2];
		}

		Class65.resetSprite();
		return var0;
	}

}
