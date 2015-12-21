import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class26 {

	int anInt306;
	byte[] aByteArray307;
	DataInputStream aDataInputStream308;
	byte[] aByteArray309 = new byte[4];
	static int anInt310;
	long aLong311;
	int anInt312;
	static Class78 aClass78_313;
	int anInt314;
	Class61 aClass61_315;
	static CacheIndex aClass87_Sub1_316;

	byte[] method167() throws IOException {
		if (Node_Sub5.currentTimeMs() > this.aLong311 * 5610376891018015397L) {
			throw new IOException();
		} else {
			if (this.anInt314 * -369390683 == 0) {
				if (this.aClass61_315.anInt563 == 2) {
					throw new IOException();
				}

				if (this.aClass61_315.anInt563 == 1) {
					this.aDataInputStream308 = (DataInputStream) this.aClass61_315.anObject566;
					this.anInt314 = -427006931;
				}
			}

			int var1;
			if (this.anInt314 * -369390683 == 1) {
				var1 = this.aDataInputStream308.available();
				if (var1 > 0) {
					if (this.anInt306 * 802462811 + var1 > 4) {
						var1 = 4 - this.anInt306 * 802462811;
					}

					this.anInt306 += this.aDataInputStream308.read(this.aByteArray309, this.anInt306 * 802462811, var1)
							* -261671981;
					if (this.anInt306 * 802462811 == 4) {
						int var2 = (new ByteBuf(this.aByteArray309)).getInt();
						this.aByteArray307 = new byte[var2];
						this.anInt314 = -854013862;
					}
				}
			}

			if (this.anInt314 * -369390683 == 2) {
				var1 = this.aDataInputStream308.available();
				if (var1 > 0) {
					if (this.anInt312 * 589721777 + var1 > this.aByteArray307.length) {
						var1 = this.aByteArray307.length - 589721777 * this.anInt312;
					}

					this.anInt312 += this.aDataInputStream308.read(this.aByteArray307, 589721777 * this.anInt312, var1)
							* -703473583;
					if (this.anInt312 * 589721777 == this.aByteArray307.length) {
						return this.aByteArray307;
					}
				}
			}

			return null;
		}
	}

	static String method168(Widget var0) {
		return Class63.method314(Class30.getWidgetConfig(var0)) == 0 ? null
				: (var0.selectedAction != null && var0.selectedAction.trim().length() != 0 ? var0.selectedAction
						: null);
	}

	static final void decodePlayerUpdate(BitBuf buf, int size) {
		int position = 314639891 * buf.position;
		GPI.pendingFlagsCount = 0;
		World.decodeLocationUpdates(buf);

		for (int index = 0; index < 716284941 * GPI.pendingFlagsCount; ++index) {
			int playerIndex = GPI.pendingFlagsIndices[index];
			Player player = Client.playerArray[playerIndex];
			int flags = buf.getUByte();
			if ((flags & 16) != 0) {
				flags += buf.getUByte() << 8;
			}

			Class66.decodePlayerFlags(buf, playerIndex, player, flags);
		}

		if (size != buf.position * 314639891 - position) {
			throw new RuntimeException(314639891 * buf.position - position + " " + size);
		}
	}

	Class26(Class63 var1, URL var2) {
		this.aClass61_315 = var1.method309(var2);
		this.anInt314 = 0;
		this.aLong311 = (Node_Sub5.currentTimeMs() + 30000L) * -4402853478160784083L;
	}

	public static void method170(Class87 var0) {
		DualNode_Sub7.aClass87_1511 = var0;
	}
}
