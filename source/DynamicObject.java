import java.awt.Component;

public class DynamicObject extends Entity {

	public static String osNameLC;
	int anInt1962;
	int type;
	int orientation;
	int floorLevel;
	int regionX;
	int regionY;
	SequenceType aDualNode_Sub3_1961;
	int anInt1960;
	int anInt1963;

	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
		this.anInt1962 = var1;
		this.type = var2;
		this.orientation = var3;
		this.floorLevel = var4;
		this.regionX = var5;
		this.regionY = var6;
		if (var7 != -1) {
			this.aDualNode_Sub3_1961 = Node_Sub6.getSequenceType(var7);
			this.anInt1960 = 0;
			this.anInt1963 = Client.engineCycle - 1;
			if (this.aDualNode_Sub3_1961.anInt1486 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject) var9;
				if (this.aDualNode_Sub3_1961 == var10.aDualNode_Sub3_1961) {
					this.anInt1960 = var10.anInt1960;
					this.anInt1963 = var10.anInt1963;
					return;
				}
			}

			if (var8 && this.aDualNode_Sub3_1961.anInt1477 != -1) {
				this.anInt1960 = (int) (Math.random() * (double) this.aDualNode_Sub3_1961.anIntArray1474.length);
				this.anInt1963 -= (int) (Math.random()
						* (double) this.aDualNode_Sub3_1961.anIntArray1481[this.anInt1960]);
			}
		}

	}

	protected final Rasterizer method654(byte var1) {
		if (this.aDualNode_Sub3_1961 != null) {
			int var13 = Client.engineCycle - this.anInt1963;
			if (var13 > 100 && this.aDualNode_Sub3_1961.anInt1477 > 0) {
				var13 = 100;
			}

			label46: {
				do {
					do {
						if (var13 <= this.aDualNode_Sub3_1961.anIntArray1481[this.anInt1960]) {
							break label46;
						}

						var13 -= this.aDualNode_Sub3_1961.anIntArray1481[this.anInt1960];
						++this.anInt1960;
					} while (this.anInt1960 < this.aDualNode_Sub3_1961.anIntArray1474.length);

					this.anInt1960 -= this.aDualNode_Sub3_1961.anInt1477;
				} while (this.anInt1960 >= 0 && this.anInt1960 < this.aDualNode_Sub3_1961.anIntArray1474.length);

				this.aDualNode_Sub3_1961 = null;
			}

			this.anInt1963 = Client.engineCycle - var13;
		}

		ObjectType var131 = Class37.getObjectType(this.anInt1962);
		if (var131.transformIds != null) {
			var131 = var131.transform();
		}

		if (var131 == null) {
			return null;
		} else {
			int var2;
			int var5;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var131.sizeX;
				var5 = var131.sizeY;
			} else {
				var2 = var131.sizeY;
				var5 = var131.sizeX;
			}

			int var3 = this.regionX + (var2 >> 1);
			int var11 = this.regionX + (var2 + 1 >> 1);
			int var12 = (var5 >> 1) + this.regionY;
			int var6 = this.regionY + (var5 + 1 >> 1);
			int[][] var7 = Class39.tileHeights[this.floorLevel];
			int var9 = var7[var11][var12] + var7[var3][var12] + var7[var3][var6] + var7[var11][var6] >> 2;
			int var8 = (this.regionX << 7) + (var2 << 6);
			int var10 = (var5 << 6) + (this.regionY << 7);
			return var131.method862(this.type, this.orientation, var7, var8, var9, var10, this.aDualNode_Sub3_1961,
					this.anInt1960);
		}
	}

	static void method1022(Component var0, AbstractIndex binary, AbstractIndex sprites, boolean var3, int var4) {
		if (Class6.aBool142) {
			if (var4 == 4) {
				Class6.anInt116 = 4;
			}
		} else {
			Class6.anInt116 = var4;
			RSGraphics.reset();
			byte[] var6 = binary.method389("title.jpg", "");
			Class56.aSprite542 = new Picture(var6, var0);
			Class6.aSprite137 = Class56.aSprite542.method937();
			if ((Client.myWorldFlags & 0x20000000) != 0) {
				IgnoredPlayer.logoSprite = SequenceType.getSprite(sprites, "logo_deadman_mode", "");
			} else {
				IgnoredPlayer.logoSprite = SequenceType.getSprite(sprites, "logo", "");
			}

			Class6.titleboxSprite = SequenceType.getSprite(sprites, "titlebox", "");
			Class6.titlebuttonSprite = SequenceType.getSprite(sprites, "titlebutton", "");
			Class6.runesSprite = ObjectType.method868(sprites, "runes", "");
			FriendedPlayer.titlemuteSprite = ObjectType.method868(sprites, "title_mute", "");
			Class6.radioButtons0Sprite = SequenceType.getSprite(sprites, "options_radio_buttons,0", "");
			Class6.radioButtons2Sprite = SequenceType.getSprite(sprites, "options_radio_buttons,2", "");
			TileDecorationStub.anIntArray841 = new int[256];

			int var5;
			for (var5 = 0; var5 < 64; var5++) {
				TileDecorationStub.anIntArray841[var5] = var5 * 262144;
			}

			for (var5 = 0; var5 < 64; var5++) {
				TileDecorationStub.anIntArray841[var5 + 64] = var5 * 1024 + 16711680;
			}

			for (var5 = 0; var5 < 64; var5++) {
				TileDecorationStub.anIntArray841[var5 + 128] = var5 * 4 + 16776960;
			}

			for (var5 = 0; var5 < 64; var5++) {
				TileDecorationStub.anIntArray841[var5 + 192] = 16777215;
			}

			Class118.anIntArray803 = new int[256];

			for (var5 = 0; var5 < 64; var5++) {
				Class118.anIntArray803[var5] = var5 * 1024;
			}

			for (var5 = 0; var5 < 64; var5++) {
				Class118.anIntArray803[var5 + 64] = var5 * 4 + '\uff00';
			}

			for (var5 = 0; var5 < 64; var5++) {
				Class118.anIntArray803[var5 + 128] = var5 * 262144 + '\uffff';
			}

			for (var5 = 0; var5 < 64; var5++) {
				Class118.anIntArray803[var5 + 192] = 16777215;
			}

			Class6.anIntArray125 = new int[256];

			for (var5 = 0; var5 < 64; var5++) {
				Class6.anIntArray125[var5] = var5 * 4;
			}

			for (var5 = 0; var5 < 64; var5++) {
				Class6.anIntArray125[var5 + 64] = var5 * 262144 + 255;
			}

			for (var5 = 0; var5 < 64; var5++) {
				Class6.anIntArray125[var5 + 128] = var5 * 1024 + 16711935;
			}

			for (var5 = 0; var5 < 64; var5++) {
				Class6.anIntArray125[var5 + 192] = 16777215;
			}

			Class6.anIntArray124 = new int[256];
			Class33.anIntArray365 = new int['\u8000'];
			Permission.anIntArray605 = new int['\u8000'];
			VarBitType.method877((Sprite) null);
			Class122.anIntArray818 = new int['\u8000'];
			Class4.anIntArray110 = new int['\u8000'];
			if (var3) {
				Class6.username = "";
				Class6.password = "";
			}

			Class114.pin = 0;
			Class37.pinText = "";
			Class6.trust = true;
			Class6.loadedWorlds = false;
			if (!AnimationSkin.settings.muted) {
				Class91.method402(2, Class2.midiTrack1Index, "scape main", "", 255, false);
			} else {
				Class65.method320(2);
			}

			ScriptEvent.sendConInfo(false);
			Class6.aBool142 = true;
			Class6.anInt132 = (Class34.gameWidth - Client.anInt2233) / 2;
			Class6.anInt126 = Class6.anInt132 + 202;
			Class56.aSprite542.method958(Class6.anInt132, 0);
			Class6.aSprite137.method958(Class6.anInt132 + 382, 0);
			IgnoredPlayer.logoSprite.method929(Class6.anInt132 + 382 - IgnoredPlayer.logoSprite.subWidth / 2, 18);
		}

	}

	public static Picture[] method1023(AbstractIndex var0, String var1, String var2) {
		int var3 = var0.getFile(var1);
		int var4 = var0.getChild(var3, var2);
		return Client.method510(var0, var3, var4);
	}

}
