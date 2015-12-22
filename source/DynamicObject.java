import java.awt.Component;

public class DynamicObject extends Entity {

	int orientation;
	int anInt1960;
	int floorLevel;
	int regionX;
	int regionY;
	DualNode_Sub3 aDualNode_Sub3_1961;
	int anInt1962;
	int anInt1963;
	public static String aString1964;
	int type;

	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
		this.anInt1962 = var1 * -1338124091;
		this.type = -2023943149 * var2;
		this.orientation = 2041023979 * var3;
		this.floorLevel = 254224793 * var4;
		this.regionX = -1322341781 * var5;
		this.regionY = var6 * -1552283421;
		if (var7 != -1) {
			this.aDualNode_Sub3_1961 = Node_Sub6.method540(var7, -1502270040);
			this.anInt1960 = 0;
			this.anInt1963 = Client.engineCycle * -1207738427 - 932026345;
			if (this.aDualNode_Sub3_1961.anInt1486 * 972933669 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject) var9;
				if (this.aDualNode_Sub3_1961 == var10.aDualNode_Sub3_1961) {
					this.anInt1960 = var10.anInt1960 * 1;
					this.anInt1963 = 1 * var10.anInt1963;
					return;
				}
			}

			if (var8 && this.aDualNode_Sub3_1961.anInt1477 * 174111251 != -1) {
				this.anInt1960 = (int) (Math.random() * (double) this.aDualNode_Sub3_1961.anIntArray1474.length)
						* 218220251;
				this.anInt1963 -= (int) (Math.random()
						* (double) this.aDualNode_Sub3_1961.anIntArray1481[-49101485 * this.anInt1960]) * 932026345;
			}
		}

	}

	protected final Model method654(byte var1) {
		if (this.aDualNode_Sub3_1961 != null) {
			int var4 = Client.engineCycle * -1040073859 - this.anInt1963 * 2095493209;
			if (var4 > 100 && 174111251 * this.aDualNode_Sub3_1961.anInt1477 > 0) {
				var4 = 100;
			}

			while (var4 > this.aDualNode_Sub3_1961.anIntArray1481[this.anInt1960 * -49101485]) {
				var4 -= this.aDualNode_Sub3_1961.anIntArray1481[this.anInt1960 * -49101485];
				this.anInt1960 += 218220251;
				if (-49101485 * this.anInt1960 >= this.aDualNode_Sub3_1961.anIntArray1474.length) {
					this.anInt1960 -= this.aDualNode_Sub3_1961.anInt1477 * 1639768129;
					if (-49101485 * this.anInt1960 < 0
							|| -49101485 * this.anInt1960 >= this.aDualNode_Sub3_1961.anIntArray1474.length) {
						this.aDualNode_Sub3_1961 = null;
						break;
					}
				}
			}

			this.anInt1963 = 932026345 * (-1040073859 * Client.engineCycle - var4);
		}

		ObjectDefinition var13 = Class37.getObjectDefinition(-1889540595 * this.anInt1962);
		if (var13.transformIds != null) {
			var13 = var13.transform();
		}

		if (var13 == null) {
			return null;
		} else {
			int var2;
			int var5;
			if (this.orientation * 775238339 != 1 && 775238339 * this.orientation != 3) {
				var2 = var13.sizeX * 1162660975;
				var5 = -1976023901 * var13.sizeY;
			} else {
				var2 = -1976023901 * var13.sizeY;
				var5 = 1162660975 * var13.sizeX;
			}

			int var3 = this.regionX * 1134670403 + (var2 >> 1);
			int var11 = 1134670403 * this.regionX + (1 + var2 >> 1);
			int var12 = (var5 >> 1) + this.regionY * 317684939;
			int var6 = this.regionY * 317684939 + (1 + var5 >> 1);
			int[][] var7 = Class39.tileHeights[936123049 * this.floorLevel];
			int var9 = var7[var11][var12] + var7[var3][var12] + var7[var3][var6] + var7[var11][var6] >> 2;
			int var8 = (1134670403 * this.regionX << 7) + (var2 << 6);
			int var10 = (var5 << 6) + (this.regionY * 317684939 << 7);
			return var13.method862(-757213669 * this.type, 775238339 * this.orientation, var7, var8, var9, var10,
					this.aDualNode_Sub3_1961, this.anInt1960 * -49101485);
		}
	}

	static void method1022(Component var0, Class87 var1, Class87 var2, boolean var3, int var4) {
		if (Class6.aBool142) {
			if (var4 == 4) {
				Class6.anInt116 = -868668484;
			}

		} else {
			Class6.anInt116 = var4 * -217167121;
			RSGraphics.reset();
			byte[] var6 = var1.method389("title.jpg", "");
			Class56.aSprite542 = new Sprite(var6, var0);
			Class6.aSprite137 = Class56.aSprite542.method937();
			if ((Client.myWorldFlags * 1115656689 & 536870912) != 0) {
				IgnoredPlayer.aDualNode_Sub13_Sub2_754 = DualNode_Sub3.method680(var2, "logo_deadman_mode", "");
			} else {
				IgnoredPlayer.aDualNode_Sub13_Sub2_754 = DualNode_Sub3.method680(var2, "logo", "");
			}

			Class6.aDualNode_Sub13_Sub2_147 = DualNode_Sub3.method680(var2, "titlebox", "");
			Class6.aDualNode_Sub13_Sub2_117 = DualNode_Sub3.method680(var2, "titlebutton", "");
			Class6.aDualNode_Sub13_Sub2Array118 = ObjectDefinition.method868(var2, "runes", "");
			FriendedPlayer.aDualNode_Sub13_Sub2Array741 = ObjectDefinition.method868(var2, "title_mute", "");
			Class6.aDualNode_Sub13_Sub2_120 = DualNode_Sub3.method680(var2, "options_radio_buttons,0", "");
			Class6.aDualNode_Sub13_Sub2_121 = DualNode_Sub3.method680(var2, "options_radio_buttons,2", "");
			TileDecorationStub.anIntArray841 = new int[256];

			int var5;
			for (var5 = 0; var5 < 64; ++var5) {
				TileDecorationStub.anIntArray841[var5] = var5 * 262144;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				TileDecorationStub.anIntArray841[64 + var5] = 16711680 + 1024 * var5;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				TileDecorationStub.anIntArray841[128 + var5] = 4 * var5 + 16776960;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				TileDecorationStub.anIntArray841[192 + var5] = 16777215;
			}

			Class118.anIntArray803 = new int[256];

			for (var5 = 0; var5 < 64; ++var5) {
				Class118.anIntArray803[var5] = var5 * 1024;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				Class118.anIntArray803[64 + var5] = 4 * var5 + '\uff00';
			}

			for (var5 = 0; var5 < 64; ++var5) {
				Class118.anIntArray803[var5 + 128] = '\uffff' + var5 * 262144;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				Class118.anIntArray803[192 + var5] = 16777215;
			}

			Class6.anIntArray125 = new int[256];

			for (var5 = 0; var5 < 64; ++var5) {
				Class6.anIntArray125[var5] = var5 * 4;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				Class6.anIntArray125[var5 + 64] = 262144 * var5 + 255;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				Class6.anIntArray125[var5 + 128] = var5 * 1024 + 16711935;
			}

			for (var5 = 0; var5 < 64; ++var5) {
				Class6.anIntArray125[192 + var5] = 16777215;
			}

			Class6.anIntArray124 = new int[256];
			Class33.anIntArray365 = new int['\u8000'];
			Class73.anIntArray605 = new int['\u8000'];
			Varpbit.method877((DualNode_Sub13_Sub2) null);
			Class122.anIntArray818 = new int['\u8000'];
			Class4.anIntArray110 = new int['\u8000'];
			if (var3) {
				Class6.aString136 = "";
				Class6.aString123 = "";
			}

			Class114.anInt795 = 0;
			Class37.aString404 = "";
			Class6.aBool139 = true;
			Class6.loadedWorlds = false;
			if (!Node_Sub5.aClass24_1265.aBool303) {
				Class91.method402(2, Class2.aClass87_Sub1_79, "scape main", "", 255, false);
			} else {
				Class65.method320(2);
			}

			ScriptEvent.method652(false);
			Class6.aBool142 = true;
			Class6.anInt132 = 1079825139 * ((-452716157 * Class34.gameWidth - 1468194207 * Client.anInt2233) / 2);
			Class6.anInt126 = 1843765198 + Class6.anInt132 * 132725497;
			Class56.aSprite542.method958(1933284923 * Class6.anInt132, 0);
			Class6.aSprite137.method958(Class6.anInt132 * 1933284923 + 382, 0);
			IgnoredPlayer.aDualNode_Sub13_Sub2_754.method929(
					Class6.anInt132 * 1933284923 + 382 - IgnoredPlayer.aDualNode_Sub13_Sub2_754.anInt1800 / 2, 18);
		}
	}

	public static Sprite[] method1023(Class87 var0, String var1, String var2) {
		int var3 = var0.method383(var1);
		int var4 = var0.method384(var3, var2);
		return Class20_Sub1.method510(var0, var3, var4);
	}
}
