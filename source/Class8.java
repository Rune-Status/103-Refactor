import java.awt.Component;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class8 {

	static Class19 aClass19_156;
	public static int anInt157;
	int anInt158 = -1530849888;
	Node_Sub4[] aNode_Sub4Array159 = new Node_Sub4[8];
	int[] anIntArray160;
	Node_Sub4 aNode_Sub4_161;
	long aLong162 = 0L;
	long aLong163 = AnimationSkin.currentTimeMs() * 7521534040423978303L;
	int anInt164;
	int anInt165;
	public static boolean aBool166;
	long aLong167 = 0L;
	int anInt168 = 0;
	int anInt169 = 0;
	int anInt170 = 0;
	int anInt171 = 0;
	public static int anInt172;
	boolean aBool173 = true;
	int anInt174;
	Node_Sub4[] aNode_Sub4Array175 = new Node_Sub4[8];

	void method80() throws Exception {
	}

	static long method81() {
		try {
			URL var0 = new URL(Class37.method212("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			ByteBuf var4 = new ByteBuf(new byte[1000]);

			do {
				int var5 = var3.read(var4.payload, var4.position * 314639891, 1000 - 314639891 * var4.position);
				if (var5 == -1) {
					var4.position = 0;
					long var6 = var4.getLong();
					return var6;
				}

				var4.position += var5 * -184175589;
			} while (var4.position * 314639891 < 1000);

			return 0L;
		} catch (Exception var8) {
			return 0L;
		}
	}

	public final synchronized void method82() {
		if (this.anIntArray160 != null) {
			long var1 = AnimationSkin.currentTimeMs();

			try {
				if (this.aLong167 * 4278827202856281897L != 0L) {
					if (var1 < this.aLong167 * 4278827202856281897L) {
						return;
					}

					this.method88(-105889671 * this.anInt164);
					this.aLong167 = 0L;
					this.aBool173 = true;
				}

				int var3 = this.method89();
				if (-391291481 * this.anInt170 - var3 > this.anInt168 * 2113248743) {
					this.anInt168 = -651549225 * (this.anInt170 * -391291481 - var3);
				}

				int var4 = this.anInt174 * 785401385 + this.anInt165 * -506822939;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > -105889671 * this.anInt164) {
					this.anInt164 += 1755784192;
					if (this.anInt164 * -105889671 > 16384) {
						this.anInt164 = -1972224000;
					}

					this.method93();
					this.method88(this.anInt164 * -105889671);
					var3 = 0;
					this.aBool173 = true;
					if (256 + var4 > this.anInt164 * -105889671) {
						var4 = -105889671 * this.anInt164 - 256;
						this.anInt174 = (var4 - -506822939 * this.anInt165) * 646493721;
					}
				}

				while (var3 < var4) {
					this.method94(this.anIntArray160, 256);
					this.method90();
					var3 += 256;
				}

				if (var1 > -6011821581548601501L * this.aLong162) {
					if (!this.aBool173) {
						if (this.anInt168 * 2113248743 == 0 && this.anInt169 * 510705873 == 0) {
							this.method93();
							this.aLong167 = 6964159870914700569L * (2000L + var1);
							return;
						}

						this.anInt174 = Math.min(510705873 * this.anInt169, 2113248743 * this.anInt168) * 646493721;
						this.anInt169 = this.anInt168 * -216178377;
					} else {
						this.aBool173 = false;
					}

					this.anInt168 = 0;
					this.aLong162 = (2000L + var1) * -7182784584313292213L;
				}

				this.anInt170 = var3 * -1354925545;
			} catch (Exception var6) {
				this.method93();
				this.aLong167 = 6964159870914700569L * (var1 + 2000L);
			}

			try {
				if (var1 > 500000L + 4023840563415325375L * this.aLong163) {
					var1 = this.aLong163 * 4023840563415325375L;
				}

				while (var1 > 5000L + 4023840563415325375L * this.aLong163) {
					this.method85(256);
					this.aLong163 += 7521534040423978303L * (long) (256000 / (-954458055 * anInt157));
				}
			} catch (Exception var5) {
				this.aLong163 = 7521534040423978303L * var1;
			}

		}
	}

	public final synchronized void method83() {
		this.aBool173 = true;

		try {
			this.method80();
		} catch (Exception var2) {
			this.method93();
			this.aLong167 = (AnimationSkin.currentTimeMs() + 2000L) * 6964159870914700569L;
		}

	}

	public final synchronized void method84() {
		if (aClass19_156 != null) {
			boolean var2 = true;

			for (int var1 = 0; var1 < 2; ++var1) {
				if (this == aClass19_156.aClass8Array264[var1]) {
					aClass19_156.aClass8Array264[var1] = null;
				}

				if (aClass19_156.aClass8Array264[var1] != null) {
					var2 = false;
				}
			}

			if (var2) {
				aClass19_156.aBool265 = true;

				while (aClass19_156.aBool266) {
					Class96_Sub1.sleep(50L);
				}

				aClass19_156 = null;
			}
		}

		this.method93();
		this.anIntArray160 = null;
	}

	final void method85(int var1) {
		this.anInt171 -= var1 * 2075018355;
		if (-2139356997 * this.anInt171 < 0) {
			this.anInt171 = 0;
		}

		if (this.aNode_Sub4_161 != null) {
			this.aNode_Sub4_161.method528(var1);
		}

	}

	final void method86(Node_Sub4 var1, int var2) {
		int var3 = var2 >> 5;
		Node_Sub4 var4 = this.aNode_Sub4Array175[var3];
		if (var4 == null) {
			this.aNode_Sub4Array159[var3] = var1;
		} else {
			var4.aNode_Sub4_1259 = var1;
		}

		this.aNode_Sub4Array175[var3] = var1;
		var1.anInt1260 = var2;
	}

	void method87(Component var1) throws Exception {
	}

	void method88(int var1) throws Exception {
	}

	int method89() throws Exception {
		return -105889671 * this.anInt164;
	}

	void method90() throws Exception {
	}

	public final synchronized void method91(Node_Sub4 var1) {
		this.aNode_Sub4_161 = var1;
	}

	public final void method92() {
		this.aBool173 = true;
	}

	void method93() {
	}

	final void method94(int[] var1, int var2) {
		int var3 = var2;
		if (aBool166) {
			var3 = var2 << 1;
		}

		Class45.method232(var1, 0, var3);
		this.anInt171 -= var2 * 2075018355;
		if (this.aNode_Sub4_161 != null && -2139356997 * this.anInt171 <= 0) {
			this.anInt171 += 2075018355 * (-954458055 * anInt157 >> 4);
			IsaacRandom.method67(this.aNode_Sub4_161);
			this.method86(this.aNode_Sub4_161, this.aNode_Sub4_161.method525());
			int var9 = 0;
			int var7 = 255;

			int var10;
			Node_Sub4 var12;
			label132: for (var10 = 7; var7 != 0; --var10) {
				int var8;
				int var11;
				if (var10 < 0) {
					var8 = var10 & 3;
					var11 = -(var10 >> 2);
				} else {
					var8 = var10;
					var11 = 0;
				}

				for (int var13 = var7 >>> var8 & 286331153; var13 != 0; var13 >>>= 4) {
					if ((var13 & 1) != 0) {
						var7 &= ~(1 << var8);
						var12 = null;
						Node_Sub4 var5 = this.aNode_Sub4Array159[var8];

						while (var5 != null) {
							Node_Sub2 var14 = var5.aNode_Sub2_1258;
							if (var14 != null && var14.anInt1212 > var11) {
								var7 |= 1 << var8;
								var12 = var5;
								var5 = var5.aNode_Sub4_1259;
							} else {
								var5.aBool1261 = true;
								int var15 = var5.method527();
								var9 += var15;
								if (var14 != null) {
									var14.anInt1212 += var15;
								}

								if (var9 >= 2067831589 * this.anInt158) {
									break label132;
								}

								Node_Sub4 var6 = var5.method526();
								if (var6 != null) {
									for (int var4 = var5.anInt1260; var6 != null; var6 = var5.method529()) {
										this.method86(var6, var4 * var6.method525() >> 8);
									}
								}

								Node_Sub4 var16 = var5.aNode_Sub4_1259;
								var5.aNode_Sub4_1259 = null;
								if (var12 == null) {
									this.aNode_Sub4Array159[var8] = var16;
								} else {
									var12.aNode_Sub4_1259 = var16;
								}

								if (var16 == null) {
									this.aNode_Sub4Array175[var8] = var12;
								}

								var5 = var16;
							}
						}
					}

					var8 += 4;
					++var11;
				}
			}

			for (var10 = 0; var10 < 8; ++var10) {
				Node_Sub4 var17 = this.aNode_Sub4Array159[var10];
				Node_Sub4[] var18 = this.aNode_Sub4Array159;
				this.aNode_Sub4Array175[var10] = null;

				for (var18[var10] = null; var17 != null; var17 = var12) {
					var12 = var17.aNode_Sub4_1259;
					var17.aNode_Sub4_1259 = null;
				}
			}
		}

		if (this.anInt171 * -2139356997 < 0) {
			this.anInt171 = 0;
		}

		if (this.aNode_Sub4_161 != null) {
			this.aNode_Sub4_161.method530(var1, 0, var2);
		}

		this.aLong163 = AnimationSkin.currentTimeMs() * 7521534040423978303L;
	}

	public static OverlayType getOverlayType(int id) {
		OverlayType type = (OverlayType) OverlayType.overlays.get((long) id);
		if (type != null) {
			return type;
		} else {
			byte[] bytes = OverlayType.overlay_ref.getFile(4, id);
			type = new OverlayType();
			if (bytes != null) {
				type.decode(new ByteBuf(bytes), id);
			}

			type.post();
			OverlayType.overlays.put(type, (long) id);
			return type;
		}
	}

	static void method96(int var0, int var1, int var2, int var3) {
		Widget var4 = AbstractProducer.method146(var0, var1);
		if (var4 != null && var4.anObjectArray1130 != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.anObjectArray1130;
			Class96_Sub1.method504(var5);
		}

		Client.anInt2129 = 461597295 * var3;
		Client.spellSelected = true;
		SequenceType.anInt1488 = var0 * -222991695;
		Client.anInt2128 = 1188249893 * var1;
		Class31.currentSpellTargets = -1648414847 * var2;
		Class68.method326(var4);
	}
}
