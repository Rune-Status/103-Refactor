public class Model extends Entity {

	int vertexCount = 0;
	int faceCount = 0;
	int anInt1745;
	int[] vertexX;
	int[] vertexY;
	int[] vertexZ;
	int[] triangleX;
	int[] triangleY;
	int[] triangleZ;
	byte[] textureRenderTypes;
	short[] texTriX;
	short[] texTriY;
	short[] texTriZ;
	int[] vertexSkins;
	byte[] faceType;
	byte[] texturePos;
	short[] faceTextures;
	byte priority = 0;
	byte[] facePriorities;
	byte[] faceAlphas;
	int[] skinValues;
	short[] faceColor;
	boolean aBool1775 = false;
	short[] aShortArray1750;
	short[] aShortArray1751;
	short[] aShortArray1767;
	short[] aShortArray1768;
	byte[] aByteArray1735;
	short[] aShortArray1754;
	short[] texPrimaryColor;
	int[][] anIntArrayArray1759;
	int[][] anIntArrayArray1760;
	Class21[] aClass21Array1762;
	Class27[] aClass27Array1761;
	Class21[] aClass21Array1763;
	public short aShort1764;
	public short aShort1766;
	static int anInt1774;
	int anInt1757;
	int anInt1742;
	int anInt1769;
	int anInt1765;
	int anInt1771;
	static int[] anIntArray1740 = new int[10000];
	static int[] anIntArray1758;
	static int[] anIntArray1773;
	static int[] anIntArray1776;

	public void method886() {
		for (int var1 = 0; var1 < this.vertexCount; var1++) {
			int var2 = this.vertexZ[var1];
			this.vertexZ[var1] = this.vertexX[var1];
			this.vertexX[var1] = -var2;
		}

		this.method899();
	}

	public static Model method887(AbstractIndex var0, int var1, int var2) {
		byte[] var3 = var0.getFile(var1, var2);
		return var3 == null ? null : new Model(var3);
	}

	void decodeOldFormat(byte[] var1) {
		boolean var2 = false;
		boolean var9 = false;
		ByteBuf var5 = new ByteBuf(var1);
		ByteBuf var6 = new ByteBuf(var1);
		ByteBuf var7 = new ByteBuf(var1);
		ByteBuf var8 = new ByteBuf(var1);
		ByteBuf var38 = new ByteBuf(var1);
		var5.position = var1.length - 18;
		int var10 = var5.getUShort();
		int var11 = var5.getUShort();
		int var12 = var5.getUByte();
		int var42 = var5.getUByte();
		int var15 = var5.getUByte();
		int var16 = var5.getUByte();
		int var25 = var5.getUByte();
		int var17 = var5.getUByte();
		int var18 = var5.getUShort();
		int var19 = var5.getUShort();
		int var20 = var5.getUShort();
		int var21 = var5.getUShort();
		byte var13 = 0;
		int var46 = var13 + var10;
		int var24 = var46;
		var46 += var11;
		int var14 = var46;
		if (var15 == 255) {
			var46 += var11;
		}

		int var26 = var46;
		if (var25 == 1) {
			var46 += var11;
		}

		int var22 = var46;
		if (var42 == 1) {
			var46 += var11;
		}

		int var28 = var46;
		if (var17 == 1) {
			var46 += var10;
		}

		int var30 = var46;
		if (var16 == 1) {
			var46 += var11;
		}

		int var39 = var46;
		var46 += var21;
		int var34 = var46;
		var46 += var11 * 2;
		int var35 = var46;
		var46 += var12 * 6;
		int var36 = var46;
		var46 += var18;
		int var41 = var46;
		var46 += var19;
		int var10000 = var46 + var20;
		this.vertexCount = var10;
		this.faceCount = var11;
		this.anInt1745 = var12;
		this.vertexX = new int[var10];
		this.vertexY = new int[var10];
		this.vertexZ = new int[var10];
		this.triangleX = new int[var11];
		this.triangleY = new int[var11];
		this.triangleZ = new int[var11];
		if (var12 > 0) {
			this.textureRenderTypes = new byte[var12];
			this.texTriX = new short[var12];
			this.texTriY = new short[var12];
			this.texTriZ = new short[var12];
		}

		if (var17 == 1) {
			this.vertexSkins = new int[var10];
		}

		if (var42 == 1) {
			this.faceType = new byte[var11];
			this.texturePos = new byte[var11];
			this.faceTextures = new short[var11];
		}

		if (var15 == 255) {
			this.facePriorities = new byte[var11];
		} else {
			this.priority = (byte) var15;
		}

		if (var16 == 1) {
			this.faceAlphas = new byte[var11];
		}

		if (var25 == 1) {
			this.skinValues = new int[var11];
		}

		this.faceColor = new short[var11];
		var5.position = var13;
		var6.position = var36;
		var7.position = var41;
		var8.position = var46;
		var38.position = var28;
		int var29 = 0;
		int var32 = 0;
		int var43 = 0;

		int var3;
		int var4;
		int var23;
		int var27;
		int var33;
		for (var23 = 0; var23 < var10; var23++) {
			var27 = var5.getUByte();
			var4 = 0;
			if ((var27 & 0x1) != 0) {
				var4 = var6.getSmart();
			}

			var33 = 0;
			if ((var27 & 0x2) != 0) {
				var33 = var7.getSmart();
			}

			var3 = 0;
			if ((var27 & 0x4) != 0) {
				var3 = var8.getSmart();
			}

			this.vertexX[var23] = var29 + var4;
			this.vertexY[var23] = var32 + var33;
			this.vertexZ[var23] = var43 + var3;
			var29 = this.vertexX[var23];
			var32 = this.vertexY[var23];
			var43 = this.vertexZ[var23];
			if (var17 == 1) {
				this.vertexSkins[var23] = var38.getUByte();
			}
		}

		var5.position = var34;
		var6.position = var22;
		var7.position = var14;
		var8.position = var30;
		var38.position = var26;

		for (var23 = 0; var23 < var11; var23++) {
			this.faceColor[var23] = (short) var5.getUShort();
			if (var42 == 1) {
				var27 = var6.getUByte();
				if ((var27 & 0x1) == 1) {
					this.faceType[var23] = 1;
					var2 = true;
				} else {
					this.faceType[var23] = 0;
				}

				if ((var27 & 0x2) == 2) {
					this.texturePos[var23] = (byte) (var27 >> 2);
					this.faceTextures[var23] = this.faceColor[var23];
					this.faceColor[var23] = 127;
					if (this.faceTextures[var23] != -1) {
						var9 = true;
					}
				} else {
					this.texturePos[var23] = -1;
					this.faceTextures[var23] = -1;
				}
			}

			if (var15 == 255) {
				this.facePriorities[var23] = var7.getByte();
			}

			if (var16 == 1) {
				this.faceAlphas[var23] = var8.getByte();
			}

			if (var25 == 1) {
				this.skinValues[var23] = var38.getUByte();
			}
		}

		var5.position = var39;
		var6.position = var24;
		var23 = 0;
		var27 = 0;
		var4 = 0;
		var33 = 0;

		int var31;
		int var44;
		for (var3 = 0; var3 < var11; var3++) {
			var31 = var6.getUByte();
			if (var31 == 1) {
				var23 = var5.getSmart() + var33;
				var27 = var5.getSmart() + var23;
				var4 = var5.getSmart() + var27;
				var33 = var4;
				this.triangleX[var3] = var23;
				this.triangleY[var3] = var27;
				this.triangleZ[var3] = var4;
			}

			if (var31 == 2) {
				var27 = var4;
				var4 = var5.getSmart() + var33;
				var33 = var4;
				this.triangleX[var3] = var23;
				this.triangleY[var3] = var27;
				this.triangleZ[var3] = var4;
			}

			if (var31 == 3) {
				var23 = var4;
				var4 = var5.getSmart() + var33;
				var33 = var4;
				this.triangleX[var3] = var23;
				this.triangleY[var3] = var27;
				this.triangleZ[var3] = var4;
			}

			if (var31 == 4) {
				var44 = var23;
				var23 = var27;
				var27 = var44;
				var4 = var5.getSmart() + var33;
				var33 = var4;
				this.triangleX[var3] = var23;
				this.triangleY[var3] = var44;
				this.triangleZ[var3] = var4;
			}
		}

		var5.position = var35;

		for (var3 = 0; var3 < var12; var3++) {
			this.textureRenderTypes[var3] = 0;
			this.texTriX[var3] = (short) var5.getUShort();
			this.texTriY[var3] = (short) var5.getUShort();
			this.texTriZ[var3] = (short) var5.getUShort();
		}

		if (this.texturePos != null) {
			boolean var45 = false;

			for (var31 = 0; var31 < var11; var31++) {
				var44 = this.texturePos[var31] & 0xff;
				if (var44 != 255) {
					if ((this.texTriX[var44] & 0xffff) == this.triangleX[var31]
							&& (this.texTriY[var44] & 0xffff) == this.triangleY[var31]
							&& (this.texTriZ[var44] & 0xffff) == this.triangleZ[var31]) {
						this.texturePos[var31] = -1;
					} else {
						var45 = true;
					}
				}
			}

			if (!var45) {
				this.texturePos = null;
			}
		}

		if (!var9) {
			this.faceTextures = null;
		}

		if (!var2) {
			this.faceType = null;
		}

	}

	public Model(Model[] var1, int var2) {
		boolean var11 = false;
		boolean var5 = false;
		boolean var7 = false;
		boolean var6 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.vertexCount = 0;
		this.faceCount = 0;
		this.anInt1745 = 0;
		this.priority = -1;

		Model var3;
		int var10;
		for (var10 = 0; var10 < var2; var10++) {
			var3 = var1[var10];
			if (var3 != null) {
				this.vertexCount += var3.vertexCount;
				this.faceCount += var3.faceCount;
				this.anInt1745 += var3.anInt1745;
				if (var3.facePriorities != null) {
					var5 = true;
				} else {
					if (this.priority == -1) {
						this.priority = var3.priority;
					}

					if (this.priority != var3.priority) {
						var5 = true;
					}
				}

				var11 |= var3.faceType != null;
				var7 |= var3.faceAlphas != null;
				var6 |= var3.skinValues != null;
				var8 |= var3.faceTextures != null;
				var9 |= var3.texturePos != null;
			}
		}

		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.vertexSkins = new int[this.vertexCount];
		this.triangleX = new int[this.faceCount];
		this.triangleY = new int[this.faceCount];
		this.triangleZ = new int[this.faceCount];
		if (var11) {
			this.faceType = new byte[this.faceCount];
		}

		if (var5) {
			this.facePriorities = new byte[this.faceCount];
		}

		if (var7) {
			this.faceAlphas = new byte[this.faceCount];
		}

		if (var6) {
			this.skinValues = new int[this.faceCount];
		}

		if (var8) {
			this.faceTextures = new short[this.faceCount];
		}

		if (var9) {
			this.texturePos = new byte[this.faceCount];
		}

		this.faceColor = new short[this.faceCount];
		if (this.anInt1745 > 0) {
			this.textureRenderTypes = new byte[this.anInt1745];
			this.texTriX = new short[this.anInt1745];
			this.texTriY = new short[this.anInt1745];
			this.texTriZ = new short[this.anInt1745];
			this.aShortArray1750 = new short[this.anInt1745];
			this.aShortArray1751 = new short[this.anInt1745];
			this.aShortArray1767 = new short[this.anInt1745];
			this.aShortArray1768 = new short[this.anInt1745];
			this.aByteArray1735 = new byte[this.anInt1745];
			this.aShortArray1754 = new short[this.anInt1745];
			this.texPrimaryColor = new short[this.anInt1745];
		}

		this.vertexCount = 0;
		this.faceCount = 0;
		this.anInt1745 = 0;

		for (var10 = 0; var10 < var2; var10++) {
			var3 = var1[var10];
			if (var3 != null) {
				int var4;
				for (var4 = 0; var4 < var3.faceCount; var4++) {
					if (var11 && var3.faceType != null) {
						this.faceType[this.faceCount] = var3.faceType[var4];
					}

					if (var5) {
						if (var3.facePriorities != null) {
							this.facePriorities[this.faceCount] = var3.facePriorities[var4];
						} else {
							this.facePriorities[this.faceCount] = var3.priority;
						}
					}

					if (var7 && var3.faceAlphas != null) {
						this.faceAlphas[this.faceCount] = var3.faceAlphas[var4];
					}

					if (var6 && var3.skinValues != null) {
						this.skinValues[this.faceCount] = var3.skinValues[var4];
					}

					if (var8) {
						if (var3.faceTextures != null) {
							this.faceTextures[this.faceCount] = var3.faceTextures[var4];
						} else {
							this.faceTextures[this.faceCount] = -1;
						}
					}

					if (var9) {
						if (var3.texturePos != null && var3.texturePos[var4] != -1) {
							this.texturePos[this.faceCount] = (byte) (var3.texturePos[var4] + this.anInt1745);
						} else {
							this.texturePos[this.faceCount] = -1;
						}
					}

					this.faceColor[this.faceCount] = var3.faceColor[var4];
					this.triangleX[this.faceCount] = this.method891(var3, var3.triangleX[var4]);
					this.triangleY[this.faceCount] = this.method891(var3, var3.triangleY[var4]);
					this.triangleZ[this.faceCount] = this.method891(var3, var3.triangleZ[var4]);
					++this.faceCount;
				}

				for (var4 = 0; var4 < var3.anInt1745; var4++) {
					byte var12 = this.textureRenderTypes[this.anInt1745] = var3.textureRenderTypes[var4];
					if (var12 == 0) {
						this.texTriX[this.anInt1745] = (short) this.method891(var3, var3.texTriX[var4]);
						this.texTriY[this.anInt1745] = (short) this.method891(var3, var3.texTriY[var4]);
						this.texTriZ[this.anInt1745] = (short) this.method891(var3, var3.texTriZ[var4]);
					}

					if (var12 >= 1 && var12 <= 3) {
						this.texTriX[this.anInt1745] = var3.texTriX[var4];
						this.texTriY[this.anInt1745] = var3.texTriY[var4];
						this.texTriZ[this.anInt1745] = var3.texTriZ[var4];
						this.aShortArray1750[this.anInt1745] = var3.aShortArray1750[var4];
						this.aShortArray1751[this.anInt1745] = var3.aShortArray1751[var4];
						this.aShortArray1767[this.anInt1745] = var3.aShortArray1767[var4];
						this.aShortArray1768[this.anInt1745] = var3.aShortArray1768[var4];
						this.aByteArray1735[this.anInt1745] = var3.aByteArray1735[var4];
						this.aShortArray1754[this.anInt1745] = var3.aShortArray1754[var4];
					}

					if (var12 == 2) {
						this.texPrimaryColor[this.anInt1745] = var3.texPrimaryColor[var4];
					}

					++this.anInt1745;
				}
			}
		}

	}

	public Model(Model var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.vertexCount = var1.vertexCount;
		this.faceCount = var1.faceCount;
		this.anInt1745 = var1.anInt1745;
		int var6;
		if (var2) {
			this.vertexX = var1.vertexX;
			this.vertexY = var1.vertexY;
			this.vertexZ = var1.vertexZ;
		} else {
			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];

			for (var6 = 0; var6 < this.vertexCount; var6++) {
				this.vertexX[var6] = var1.vertexX[var6];
				this.vertexY[var6] = var1.vertexY[var6];
				this.vertexZ[var6] = var1.vertexZ[var6];
			}
		}

		if (var3) {
			this.faceColor = var1.faceColor;
		} else {
			this.faceColor = new short[this.faceCount];

			for (var6 = 0; var6 < this.faceCount; var6++) {
				this.faceColor[var6] = var1.faceColor[var6];
			}
		}

		if (!var4 && var1.faceTextures != null) {
			this.faceTextures = new short[this.faceCount];

			for (var6 = 0; var6 < this.faceCount; var6++) {
				this.faceTextures[var6] = var1.faceTextures[var6];
			}
		} else {
			this.faceTextures = var1.faceTextures;
		}

		if (var5) {
			this.faceAlphas = var1.faceAlphas;
		} else {
			this.faceAlphas = new byte[this.faceCount];
			if (var1.faceAlphas == null) {
				for (var6 = 0; var6 < this.faceCount; var6++) {
					this.faceAlphas[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.faceCount; var6++) {
					this.faceAlphas[var6] = var1.faceAlphas[var6];
				}
			}
		}

		this.triangleX = var1.triangleX;
		this.triangleY = var1.triangleY;
		this.triangleZ = var1.triangleZ;
		this.faceType = var1.faceType;
		this.facePriorities = var1.facePriorities;
		this.texturePos = var1.texturePos;
		this.priority = var1.priority;
		this.textureRenderTypes = var1.textureRenderTypes;
		this.texTriX = var1.texTriX;
		this.texTriY = var1.texTriY;
		this.texTriZ = var1.texTriZ;
		this.aShortArray1750 = var1.aShortArray1750;
		this.aShortArray1751 = var1.aShortArray1751;
		this.aShortArray1767 = var1.aShortArray1767;
		this.aShortArray1768 = var1.aShortArray1768;
		this.aByteArray1735 = var1.aByteArray1735;
		this.aShortArray1754 = var1.aShortArray1754;
		this.texPrimaryColor = var1.texPrimaryColor;
		this.vertexSkins = var1.vertexSkins;
		this.skinValues = var1.skinValues;
		this.anIntArrayArray1759 = var1.anIntArrayArray1759;
		this.anIntArrayArray1760 = var1.anIntArrayArray1760;
		this.aClass21Array1762 = var1.aClass21Array1762;
		this.aClass27Array1761 = var1.aClass27Array1761;
		this.aClass21Array1763 = var1.aClass21Array1763;
		this.aShort1764 = var1.aShort1764;
		this.aShort1766 = var1.aShort1766;
	}

	public Model method889() {
		Model var1 = new Model();
		if (this.faceType != null) {
			var1.faceType = new byte[this.faceCount];

			for (int var2 = 0; var2 < this.faceCount; var2++) {
				var1.faceType[var2] = this.faceType[var2];
			}
		}

		var1.vertexCount = this.vertexCount;
		var1.faceCount = this.faceCount;
		var1.anInt1745 = this.anInt1745;
		var1.vertexX = this.vertexX;
		var1.vertexY = this.vertexY;
		var1.vertexZ = this.vertexZ;
		var1.triangleX = this.triangleX;
		var1.triangleY = this.triangleY;
		var1.triangleZ = this.triangleZ;
		var1.facePriorities = this.facePriorities;
		var1.faceAlphas = this.faceAlphas;
		var1.texturePos = this.texturePos;
		var1.faceColor = this.faceColor;
		var1.faceTextures = this.faceTextures;
		var1.priority = this.priority;
		var1.textureRenderTypes = this.textureRenderTypes;
		var1.texTriX = this.texTriX;
		var1.texTriY = this.texTriY;
		var1.texTriZ = this.texTriZ;
		var1.aShortArray1750 = this.aShortArray1750;
		var1.aShortArray1751 = this.aShortArray1751;
		var1.aShortArray1767 = this.aShortArray1767;
		var1.aShortArray1768 = this.aShortArray1768;
		var1.aByteArray1735 = this.aByteArray1735;
		var1.aShortArray1754 = this.aShortArray1754;
		var1.texPrimaryColor = this.texPrimaryColor;
		var1.vertexSkins = this.vertexSkins;
		var1.skinValues = this.skinValues;
		var1.anIntArrayArray1759 = this.anIntArrayArray1759;
		var1.anIntArrayArray1760 = this.anIntArrayArray1760;
		var1.aClass21Array1762 = this.aClass21Array1762;
		var1.aClass27Array1761 = this.aClass27Array1761;
		var1.aShort1764 = this.aShort1764;
		var1.aShort1766 = this.aShort1766;
		return var1;
	}

	public Model method890(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method900();
		int var12 = this.anInt1742 + var2;
		int var7 = this.anInt1769 + var2;
		int var8 = this.anInt1771 + var4;
		int var9 = this.anInt1765 + var4;
		if (var12 >= 0 && var7 + 128 >> 7 < var1.length && var8 >= 0 && var9 + 128 >> 7 < var1[0].length) {
			var12 >>= 7;
			var7 = var7 + 127 >> 7;
			var8 >>= 7;
			var9 = var9 + 127 >> 7;
			if (var1[var12][var8] == var3 && var1[var7][var8] == var3 && var1[var12][var9] == var3
					&& var1[var7][var9] == var3) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model();
					var11.vertexCount = this.vertexCount;
					var11.faceCount = this.faceCount;
					var11.anInt1745 = this.anInt1745;
					var11.vertexX = this.vertexX;
					var11.vertexZ = this.vertexZ;
					var11.triangleX = this.triangleX;
					var11.triangleY = this.triangleY;
					var11.triangleZ = this.triangleZ;
					var11.faceType = this.faceType;
					var11.facePriorities = this.facePriorities;
					var11.faceAlphas = this.faceAlphas;
					var11.texturePos = this.texturePos;
					var11.faceColor = this.faceColor;
					var11.faceTextures = this.faceTextures;
					var11.priority = this.priority;
					var11.textureRenderTypes = this.textureRenderTypes;
					var11.texTriX = this.texTriX;
					var11.texTriY = this.texTriY;
					var11.texTriZ = this.texTriZ;
					var11.aShortArray1750 = this.aShortArray1750;
					var11.aShortArray1751 = this.aShortArray1751;
					var11.aShortArray1767 = this.aShortArray1767;
					var11.aShortArray1768 = this.aShortArray1768;
					var11.aByteArray1735 = this.aByteArray1735;
					var11.aShortArray1754 = this.aShortArray1754;
					var11.texPrimaryColor = this.texPrimaryColor;
					var11.vertexSkins = this.vertexSkins;
					var11.skinValues = this.skinValues;
					var11.anIntArrayArray1759 = this.anIntArrayArray1759;
					var11.anIntArrayArray1760 = this.anIntArrayArray1760;
					var11.aShort1764 = this.aShort1764;
					var11.aShort1766 = this.aShort1766;
					var11.vertexY = new int[var11.vertexCount];
				} else {
					var11 = this;
				}

				int var10;
				int var13;
				int var14;
				int var15;
				int var16;
				int var18;
				int var19;
				int var20;
				int var21;
				int var22;
				if (var6 == 0) {
					for (var10 = 0; var10 < var11.vertexCount; var10++) {
						var13 = this.vertexX[var10] + var2;
						var20 = this.vertexZ[var10] + var4;
						var18 = var13 & 0x7f;
						var22 = var20 & 0x7f;
						var15 = var13 >> 7;
						var19 = var20 >> 7;
						var21 = var1[var15][var19] * (128 - var18) + var1[var15 + 1][var19] * var18 >> 7;
						var14 = var1[var15][var19 + 1] * (128 - var18) + var1[var15 + 1][var19 + 1] * var18 >> 7;
						var16 = (128 - var22) * var21 + var14 * var22 >> 7;
						var11.vertexY[var10] = this.vertexY[var10] + var16 - var3;
					}
				} else {
					for (var10 = 0; var10 < var11.vertexCount; var10++) {
						var13 = (-this.vertexY[var10] << 16) / (this.modelHeight * 1812947537);
						if (var13 < var6) {
							var20 = this.vertexX[var10] + var2;
							var18 = this.vertexZ[var10] + var4;
							var22 = var20 & 0x7f;
							var15 = var18 & 0x7f;
							var19 = var20 >> 7;
							var21 = var18 >> 7;
							var14 = var1[var19][var21] * (128 - var22) + var1[var19 + 1][var21] * var22 >> 7;
							var16 = var1[var19][var21 + 1] * (128 - var22) + var1[var19 + 1][var21 + 1] * var22 >> 7;
							int var17 = (128 - var15) * var14 + var16 * var15 >> 7;
							var11.vertexY[var10] = this.vertexY[var10]
									+ (var17 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method899();
				return var11;
			}
		} else {
			return this;
		}
	}

	final int method891(Model var1, int var2) {
		int var3 = -1;
		int var7 = var1.vertexX[var2];
		int var4 = var1.vertexY[var2];
		int var5 = var1.vertexZ[var2];

		for (int var6 = 0; var6 < this.vertexCount; var6++) {
			if (this.vertexX[var6] == var7 && this.vertexY[var6] == var4
					&& this.vertexZ[var6] == var5) {
				var3 = var6;
				break;
			}
		}

		if (var3 == -1) {
			this.vertexX[this.vertexCount] = var7;
			this.vertexY[this.vertexCount] = var4;
			this.vertexZ[this.vertexCount] = var5;
			if (var1.vertexSkins != null) {
				this.vertexSkins[this.vertexCount] = var1.vertexSkins[var2];
			}

			var3 = this.vertexCount++;
		}

		return var3;
	}

	public void method892() {
		for (int var1 = 0; var1 < this.vertexCount; var1++) {
			int var2 = this.vertexX[var1];
			this.vertexX[var1] = this.vertexZ[var1];
			this.vertexZ[var1] = -var2;
		}

		this.method899();
	}

	Model() {
	}

	static void method893(Model var0, Model var1, int var2, int var3, int var4, boolean var5) {
		var0.method900();
		var0.method905();
		var1.method900();
		var1.method905();
		++anInt1774;
		int var7 = 0;
		int[] var8 = var1.vertexX;
		int var14 = var1.vertexCount;

		int var6;
		for (var6 = 0; var6 < var0.vertexCount; var6++) {
			Class21 var9 = var0.aClass21Array1762[var6];
			if (var9.anInt280 * 1053423383 != 0) {
				int var10 = var0.vertexY[var6] - var3;
				if (var10 <= var1.anInt1757) {
					int var11 = var0.vertexX[var6] - var2;
					if (var11 >= var1.anInt1742 && var11 <= var1.anInt1769) {
						int var12 = var0.vertexZ[var6] - var4;
						if (var12 >= var1.anInt1771 && var12 <= var1.anInt1765) {
							for (int var13 = 0; var13 < var14; var13++) {
								Class21 var15 = var1.aClass21Array1762[var13];
								if (var8[var13] == var11 && var1.vertexZ[var13] == var12
										&& var1.vertexY[var13] == var10 && var15.anInt280 * 1053423383 != 0) {
									if (var0.aClass21Array1763 == null) {
										var0.aClass21Array1763 = new Class21[var0.vertexCount];
									}

									if (var1.aClass21Array1763 == null) {
										var1.aClass21Array1763 = new Class21[var14];
									}

									Class21 var17 = var0.aClass21Array1763[var6];
									if (var17 == null) {
										var17 = var0.aClass21Array1763[var6] = new Class21(var9);
									}

									Class21 var16 = var1.aClass21Array1763[var13];
									if (var16 == null) {
										var16 = var1.aClass21Array1763[var13] = new Class21(var15);
									}

									var17.anInt278 += var15.anInt278;
									var17.anInt282 += var15.anInt282;
									var17.anInt279 += var15.anInt279;
									var17.anInt280 += var15.anInt280;
									var16.anInt278 += var9.anInt278;
									var16.anInt282 += var9.anInt282;
									var16.anInt279 += var9.anInt279;
									var16.anInt280 += var9.anInt280;
									++var7;
									anIntArray1740[var6] = anInt1774;
									anIntArray1773[var13] = anInt1774;
								}
							}
						}
					}
				}
			}
		}

		if (var7 >= 3 && var5) {
			for (var6 = 0; var6 < var0.faceCount; var6++) {
				if (anIntArray1740[var0.triangleX[var6]] == anInt1774
						&& anIntArray1740[var0.triangleY[var6]] == anInt1774
						&& anIntArray1740[var0.triangleZ[var6]] == anInt1774) {
					if (var0.faceType == null) {
						var0.faceType = new byte[var0.faceCount];
					}

					var0.faceType[var6] = 2;
				}
			}

			for (var6 = 0; var6 < var1.faceCount; var6++) {
				if (anIntArray1773[var1.triangleX[var6]] == anInt1774
						&& anIntArray1773[var1.triangleY[var6]] == anInt1774
						&& anIntArray1773[var1.triangleZ[var6]] == anInt1774) {
					if (var1.faceType == null) {
						var1.faceType = new byte[var1.faceCount];
					}

					var1.faceType[var6] = 2;
				}
			}
		}

	}

	public void method894(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.vertexCount; var4++) {
			this.vertexX[var4] += var1;
			this.vertexY[var4] += var2;
			this.vertexZ[var4] += var3;
		}

		this.method899();
	}

	public void recolor(short actualColor, short modColor) {
		for (int index = 0; index < this.faceCount; index++) {
			if (this.faceColor[index] == actualColor) {
				this.faceColor[index] = modColor;
			}
		}

	}

	public void method896(short var1, short var2) {
		if (this.faceTextures != null) {
			for (int var3 = 0; var3 < this.faceCount; var3++) {
				if (this.faceTextures[var3] == var1) {
					this.faceTextures[var3] = var2;
				}
			}
		}

	}

	public void method897() {
		int var1;
		for (var1 = 0; var1 < this.vertexCount; var1++) {
			this.vertexZ[var1] = -this.vertexZ[var1];
		}

		for (var1 = 0; var1 < this.faceCount; var1++) {
			int var2 = this.triangleX[var1];
			this.triangleX[var1] = this.triangleZ[var1];
			this.triangleZ[var1] = var2;
		}

		this.method899();
	}

	public void method898(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.vertexCount; var4++) {
			this.vertexX[var4] = this.vertexX[var4] * var1 / 128;
			this.vertexY[var4] = this.vertexY[var4] * var2 / 128;
			this.vertexZ[var4] = this.vertexZ[var4] * var3 / 128;
		}

		this.method899();
	}

	void method899() {
		this.aClass21Array1762 = null;
		this.aClass21Array1763 = null;
		this.aClass27Array1761 = null;
		this.aBool1775 = false;
	}

	void method900() {
		if (!this.aBool1775) {
			this.modelHeight = 0;
			this.anInt1757 = 0;
			this.anInt1742 = 999999;
			this.anInt1769 = -999999;
			this.anInt1765 = -99999;
			this.anInt1771 = 99999;

			for (int var3 = 0; var3 < this.vertexCount; var3++) {
				int var4 = this.vertexX[var3];
				int var2 = this.vertexY[var3];
				int var1 = this.vertexZ[var3];
				if (var4 < this.anInt1742) {
					this.anInt1742 = var4;
				}

				if (var4 > this.anInt1769) {
					this.anInt1769 = var4;
				}

				if (var1 < this.anInt1771) {
					this.anInt1771 = var1;
				}

				if (var1 > this.anInt1765) {
					this.anInt1765 = var1;
				}

				if (-var2 > this.modelHeight * 1812947537) {
					this.modelHeight = -var2 * -969595215;
				}

				if (var2 > this.anInt1757) {
					this.anInt1757 = var2;
				}
			}

			this.aBool1775 = true;
		}

	}

	static final int method901(int var0, int var1) {
		var1 = (var0 & 0x7f) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 0xff80) + var1;
	}

	public final Rasterizer method902(int var1, int var2, int var3, int var4, int var5) {
		this.method905();
		int var15 = (int) Math.sqrt((double) (var3 * var3 + var4 * var4 + var5 * var5));
		int var8 = var2 * var15 >> 8;
		Rasterizer var10 = new Rasterizer();
		var10.anIntArray1870 = new int[this.faceCount];
		var10.anIntArray1871 = new int[this.faceCount];
		var10.anIntArray1872 = new int[this.faceCount];
		if (this.anInt1745 > 0 && this.texturePos != null) {
			int[] var16 = new int[this.anInt1745];

			int var18;
			for (var18 = 0; var18 < this.faceCount; var18++) {
				if (this.texturePos[var18] != -1) {
					++var16[this.texturePos[var18] & 0xff];
				}
			}

			var10.anInt1878 = 0;

			for (var18 = 0; var18 < this.anInt1745; var18++) {
				if (var16[var18] > 0 && this.textureRenderTypes[var18] == 0) {
					++var10.anInt1878;
				}
			}

			var10.anIntArray1879 = new int[var10.anInt1878];
			var10.anIntArray1880 = new int[var10.anInt1878];
			var10.anIntArray1906 = new int[var10.anInt1878];
			var18 = 0;

			int var19;
			for (var19 = 0; var19 < this.anInt1745; var19++) {
				if (var16[var19] > 0 && this.textureRenderTypes[var19] == 0) {
					var10.anIntArray1879[var18] = this.texTriX[var19] & 0xffff;
					var10.anIntArray1880[var18] = this.texTriY[var19] & 0xffff;
					var10.anIntArray1906[var18] = this.texTriZ[var19] & 0xffff;
					var16[var19] = var18++;
				} else {
					var16[var19] = -1;
				}
			}

			var10.aByteArray1875 = new byte[this.faceCount];

			for (var19 = 0; var19 < this.faceCount; var19++) {
				if (this.texturePos[var19] != -1) {
					var10.aByteArray1875[var19] = (byte) var16[this.texturePos[var19] & 0xff];
				} else {
					var10.aByteArray1875[var19] = -1;
				}
			}
		}

		for (int var171 = 0; var171 < this.faceCount; var171++) {
			byte var181;
			if (this.faceType == null) {
				var181 = 0;
			} else {
				var181 = this.faceType[var171];
			}

			byte var191;
			if (this.faceAlphas == null) {
				var191 = 0;
			} else {
				var191 = this.faceAlphas[var171];
			}

			short var14;
			if (this.faceTextures == null) {
				var14 = -1;
			} else {
				var14 = this.faceTextures[var171];
			}

			if (var191 == -2) {
				var181 = 3;
			}

			if (var191 == -1) {
				var181 = 2;
			}

			Class21 var7;
			int var9;
			Class27 var17;
			if (var14 == -1) {
				if (var181 != 0) {
					if (var181 == 1) {
						var17 = this.aClass27Array1761[var171];
						var9 = (var17.anInt319 * var3 * -1007204591 + var17.anInt318 * var4 * -1133994153
								+ var17.anInt317 * var5 * -1926770859) / (var8 / 2 + var8) + var1;
						var10.anIntArray1870[var171] = method901(this.faceColor[var171] & 0xffff, var9);
						var10.anIntArray1872[var171] = -1;
					} else if (var181 == 3) {
						var10.anIntArray1870[var171] = 128;
						var10.anIntArray1872[var171] = -1;
					} else {
						var10.anIntArray1872[var171] = -2;
					}
				} else {
					int var13 = this.faceColor[var171] & 0xffff;
					if (this.aClass21Array1763 != null && this.aClass21Array1763[this.triangleX[var171]] != null) {
						var7 = this.aClass21Array1763[this.triangleX[var171]];
					} else {
						var7 = this.aClass21Array1762[this.triangleX[var171]];
					}

					var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485
							+ var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
					var10.anIntArray1870[var171] = method901(var13, var9);
					if (this.aClass21Array1763 != null && this.aClass21Array1763[this.triangleY[var171]] != null) {
						var7 = this.aClass21Array1763[this.triangleY[var171]];
					} else {
						var7 = this.aClass21Array1762[this.triangleY[var171]];
					}

					var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485
							+ var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
					var10.anIntArray1871[var171] = method901(var13, var9);
					if (this.aClass21Array1763 != null && this.aClass21Array1763[this.triangleZ[var171]] != null) {
						var7 = this.aClass21Array1763[this.triangleZ[var171]];
					} else {
						var7 = this.aClass21Array1762[this.triangleZ[var171]];
					}

					var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485
							+ var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
					var10.anIntArray1872[var171] = method901(var13, var9);
				}
			} else if (var181 != 0) {
				if (var181 == 1) {
					var17 = this.aClass27Array1761[var171];
					var9 = (var17.anInt319 * var3 * -1007204591 + var17.anInt318 * var4 * -1133994153
							+ var17.anInt317 * var5 * -1926770859) / (var8 / 2 + var8) + var1;
					var10.anIntArray1870[var171] = method903(var9);
					var10.anIntArray1872[var171] = -1;
				} else {
					var10.anIntArray1872[var171] = -2;
				}
			} else {
				if (this.aClass21Array1763 != null && this.aClass21Array1763[this.triangleX[var171]] != null) {
					var7 = this.aClass21Array1763[this.triangleX[var171]];
				} else {
					var7 = this.aClass21Array1762[this.triangleX[var171]];
				}

				var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485
						+ var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
				var10.anIntArray1870[var171] = method903(var9);
				if (this.aClass21Array1763 != null && this.aClass21Array1763[this.triangleY[var171]] != null) {
					var7 = this.aClass21Array1763[this.triangleY[var171]];
				} else {
					var7 = this.aClass21Array1762[this.triangleY[var171]];
				}

				var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485
						+ var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
				var10.anIntArray1871[var171] = method903(var9);
				if (this.aClass21Array1763 != null && this.aClass21Array1763[this.triangleZ[var171]] != null) {
					var7 = this.aClass21Array1763[this.triangleZ[var171]];
				} else {
					var7 = this.aClass21Array1762[this.triangleZ[var171]];
				}

				var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485
						+ var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
				var10.anIntArray1872[var171] = method903(var9);
			}
		}

		this.method908();
		var10.anInt1864 = this.vertexCount;
		var10.verticesX = this.vertexX;
		var10.verticesY = this.vertexY;
		var10.verticesZ = this.vertexZ;
		var10.anInt1900 = this.faceCount;
		var10.anIntArray1867 = this.triangleX;
		var10.anIntArray1868 = this.triangleY;
		var10.anIntArray1869 = this.triangleZ;
		var10.aByteArray1888 = this.facePriorities;
		var10.aByteArray1874 = this.faceAlphas;
		var10.aByte1884 = this.priority;
		var10.anIntArrayArray1881 = this.anIntArrayArray1759;
		var10.anIntArrayArray1873 = this.anIntArrayArray1760;
		var10.aShortArray1860 = this.faceTextures;
		return var10;
	}

	static final int method903(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}

	public void method904(int var1) {
		int var2 = anIntArray1758[var1];
		int var4 = anIntArray1776[var1];

		for (int var3 = 0; var3 < this.vertexCount; var3++) {
			int var5 = this.vertexZ[var3] * var2 + this.vertexX[var3] * var4 >> 16;
			this.vertexZ[var3] = this.vertexZ[var3] * var4 - this.vertexX[var3] * var2 >> 16;
			this.vertexX[var3] = var5;
		}

		this.method899();
	}

	Model(byte[] bytes) {
		if (bytes[bytes.length - 1] == -1 && bytes[bytes.length - 2] == -1) {
			this.decodeNewFormat(bytes);
		} else {
			this.decodeOldFormat(bytes);
		}

	}

	public void method905() {
		if (this.aClass21Array1762 == null) {
			this.aClass21Array1762 = new Class21[this.vertexCount];

			int var3;
			for (var3 = 0; var3 < this.vertexCount; var3++) {
				this.aClass21Array1762[var3] = new Class21();
			}

			for (var3 = 0; var3 < this.faceCount; var3++) {
				int var7 = this.triangleX[var3];
				int var5 = this.triangleY[var3];
				int var6 = this.triangleZ[var3];
				int var13 = this.vertexX[var5] - this.vertexX[var7];
				int var8 = this.vertexY[var5] - this.vertexY[var7];
				int var12 = this.vertexZ[var5] - this.vertexZ[var7];
				int var9 = this.vertexX[var6] - this.vertexX[var7];
				int var14 = this.vertexY[var6] - this.vertexY[var7];
				int var11 = this.vertexZ[var6] - this.vertexZ[var7];
				int var2 = var8 * var11 - var14 * var12;
				int var4 = var12 * var9 - var11 * var13;

				int var10;
				for (var10 = var13 * var14 - var9 * var8; var2 > 8192 || var4 > 8192 || var10 > 8192 || var2 < -8192
						|| var4 < -8192 || var10 < -8192; var10 >>= 1) {
					var2 >>= 1;
					var4 >>= 1;
				}

				int var15 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var10 * var10));
				if (var15 <= 0) {
					var15 = 1;
				}

				var2 = var2 * 256 / var15;
				var4 = var4 * 256 / var15;
				var10 = var10 * 256 / var15;
				byte var16;
				if (this.faceType == null) {
					var16 = 0;
				} else {
					var16 = this.faceType[var3];
				}

				if (var16 == 0) {
					Class21 var17 = this.aClass21Array1762[var7];
					var17.anInt278 += var2 * -1411192745;
					var17.anInt282 += var4 * 234223819;
					var17.anInt279 += var10 * -852507969;
					var17.anInt280 += -1902071641;
					var17 = this.aClass21Array1762[var5];
					var17.anInt278 += var2 * -1411192745;
					var17.anInt282 += var4 * 234223819;
					var17.anInt279 += var10 * -852507969;
					var17.anInt280 += -1902071641;
					var17 = this.aClass21Array1762[var6];
					var17.anInt278 += var2 * -1411192745;
					var17.anInt282 += var4 * 234223819;
					var17.anInt279 += var10 * -852507969;
					var17.anInt280 += -1902071641;
				} else if (var16 == 1) {
					if (this.aClass27Array1761 == null) {
						this.aClass27Array1761 = new Class27[this.faceCount];
					}

					Class27 var171 = this.aClass27Array1761[var3] = new Class27();
					var171.anInt319 = var2 * 139364849;
					var171.anInt318 = var4 * -809714585;
					var171.anInt317 = var10 * 130921981;
				}
			}
		}

	}

	public void method906() {
		for (int var1 = 0; var1 < this.vertexCount; var1++) {
			this.vertexX[var1] = -this.vertexX[var1];
			this.vertexZ[var1] = -this.vertexZ[var1];
		}

		this.method899();
	}

	void decodeNewFormat(byte[] var1) {
		ByteBuf var2 = new ByteBuf(var1);
		ByteBuf var9 = new ByteBuf(var1);
		ByteBuf var33 = new ByteBuf(var1);
		ByteBuf var49 = new ByteBuf(var1);
		ByteBuf var7 = new ByteBuf(var1);
		ByteBuf var8 = new ByteBuf(var1);
		ByteBuf var46 = new ByteBuf(var1);
		var2.position = var1.length - 23;
		int numVertices = var2.getUShort();
		int numTriangles = var2.getUShort();
		int numTextureTriangles = var2.getUByte();
		int var13 = var2.getUByte();
		int modelPriority = var2.getUByte();
		int var16 = var2.getUByte();
		int var4 = var2.getUByte();
		int texture = var2.getUByte();
		int modelSkins = var2.getUByte();
		int var20 = var2.getUShort();
		int var21 = var2.getUShort();
		int var22 = var2.getUShort();
		int var23 = var2.getUShort();
		int var24 = var2.getUShort();
		int textureCount = 0;
		int var3 = 0;
		int var26 = 0;
		int var5;
		if (numTextureTriangles > 0) {
			this.textureRenderTypes = new byte[numTextureTriangles];
			var2.position = 0;

			for (var5 = 0; var5 < numTextureTriangles; var5++) {
				byte type = this.textureRenderTypes[var5] = var2.getByte();
				if (type == 0) {
					++textureCount;
				}

				if (type >= 1 && type <= 3) {
					++var3;
				}

				if (type == 2) {
					++var26;
				}
			}
		}

		var5 = numTextureTriangles + numVertices;
		int var561 = var5;
		if (var13 == 1) {
			var5 += numTriangles;
		}

		int var35 = var5;
		var5 += numTriangles;
		int var56 = var5;
		if (modelPriority == 255) {
			var5 += numTriangles;
		}

		int var37 = var5;
		if (var4 == 1) {
			var5 += numTriangles;
		}

		int var48 = var5;
		if (modelSkins == 1) {
			var5 += numVertices;
		}

		int var39 = var5;
		if (var16 == 1) {
			var5 += numTriangles;
		}

		int var40 = var5;
		var5 += var23;
		int var57 = var5;
		if (texture == 1) {
			var5 += numTriangles * 2;
		}

		int var42 = var5;
		var5 += var24;
		int var50 = var5;
		var5 += numTriangles * 2;
		int var10 = var5;
		var5 += var20;
		int var51 = var5;
		var5 += var21;
		int var6 = var5;
		var5 += var22;
		int var43 = var5;
		var5 += textureCount * 6;
		int var52 = var5;
		var5 += var3 * 6;
		int var44 = var5;
		var5 += var3 * 6;
		int var54 = var5;
		var5 += var3 * 2;
		int var45 = var5;
		var5 += var3;
		int var47 = var5;
		var5 += var3 * 2 + var26 * 2;
		this.vertexCount = numVertices;
		this.faceCount = numTriangles;
		this.anInt1745 = numTextureTriangles;
		this.vertexX = new int[numVertices];
		this.vertexY = new int[numVertices];
		this.vertexZ = new int[numVertices];
		this.triangleX = new int[numTriangles];
		this.triangleY = new int[numTriangles];
		this.triangleZ = new int[numTriangles];
		if (modelSkins == 1) {
			this.vertexSkins = new int[numVertices];
		}

		if (var13 == 1) {
			this.faceType = new byte[numTriangles];
		}

		if (modelPriority == 255) {
			this.facePriorities = new byte[numTriangles];
		} else {
			this.priority = (byte) modelPriority;
		}

		if (var16 == 1) {
			this.faceAlphas = new byte[numTriangles];
		}

		if (var4 == 1) {
			this.skinValues = new int[numTriangles];
		}

		if (texture == 1) {
			this.faceTextures = new short[numTriangles];
		}

		if (texture == 1 && numTextureTriangles > 0) {
			this.texturePos = new byte[numTriangles];
		}

		this.faceColor = new short[numTriangles];
		if (numTextureTriangles > 0) {
			this.texTriX = new short[numTextureTriangles];
			this.texTriY = new short[numTextureTriangles];
			this.texTriZ = new short[numTextureTriangles];
			if (var3 > 0) {
				this.aShortArray1750 = new short[var3];
				this.aShortArray1751 = new short[var3];
				this.aShortArray1767 = new short[var3];
				this.aShortArray1768 = new short[var3];
				this.aByteArray1735 = new byte[var3];
				this.aShortArray1754 = new short[var3];
			}

			if (var26 > 0) {
				this.texPrimaryColor = new short[var26];
			}
		}

		var2.position = numTextureTriangles;
		var9.position = var10;
		var33.position = var51;
		var49.position = var6;
		var7.position = var48;
		int var53 = 0;
		int var28 = 0;
		int var34 = 0;

		int var14;
		int var15;
		int var17;
		int var29;
		int var38;
		for (var15 = 0; var15 < numVertices; var15++) {
			var29 = var2.getUByte();
			var38 = 0;
			if ((var29 & 0x1) != 0) {
				var38 = var9.getSmart();
			}

			var17 = 0;
			if ((var29 & 0x2) != 0) {
				var17 = var33.getSmart();
			}

			var14 = 0;
			if ((var29 & 0x4) != 0) {
				var14 = var49.getSmart();
			}

			this.vertexX[var15] = var53 + var38;
			this.vertexY[var15] = var28 + var17;
			this.vertexZ[var15] = var34 + var14;
			var53 = this.vertexX[var15];
			var28 = this.vertexY[var15];
			var34 = this.vertexZ[var15];
			if (modelSkins == 1) {
				this.vertexSkins[var15] = var7.getUByte();
			}
		}

		var2.position = var50;
		var9.position = var561;
		var33.position = var56;
		var49.position = var39;
		var7.position = var37;
		var8.position = var57;
		var46.position = var42;

		for (var15 = 0; var15 < numTriangles; var15++) {
			this.faceColor[var15] = (short) var2.getUShort();
			if (var13 == 1) {
				this.faceType[var15] = var9.getByte();
			}

			if (modelPriority == 255) {
				this.facePriorities[var15] = var33.getByte();
			}

			if (var16 == 1) {
				this.faceAlphas[var15] = var49.getByte();
			}

			if (var4 == 1) {
				this.skinValues[var15] = var7.getUByte();
			}

			if (texture == 1) {
				this.faceTextures[var15] = (short) (var8.getUShort() - 1);
			}

			if (this.texturePos != null && this.faceTextures[var15] != -1) {
				this.texturePos[var15] = (byte) (var46.getUByte() - 1);
			}
		}

		var2.position = var40;
		var9.position = var35;
		var15 = 0;
		var29 = 0;
		var38 = 0;
		var17 = 0;

		int var32;
		for (var14 = 0; var14 < numTriangles; var14++) {
			var32 = var9.getUByte();
			if (var32 == 1) {
				var15 = var2.getSmart() + var17;
				var29 = var2.getSmart() + var15;
				var38 = var2.getSmart() + var29;
				var17 = var38;
				this.triangleX[var14] = var15;
				this.triangleY[var14] = var29;
				this.triangleZ[var14] = var38;
			}

			if (var32 == 2) {
				var29 = var38;
				var38 = var2.getSmart() + var17;
				var17 = var38;
				this.triangleX[var14] = var15;
				this.triangleY[var14] = var29;
				this.triangleZ[var14] = var38;
			}

			if (var32 == 3) {
				var15 = var38;
				var38 = var2.getSmart() + var17;
				var17 = var38;
				this.triangleX[var14] = var15;
				this.triangleY[var14] = var29;
				this.triangleZ[var14] = var38;
			}

			if (var32 == 4) {
				int var41 = var15;
				var15 = var29;
				var29 = var41;
				var38 = var2.getSmart() + var17;
				var17 = var38;
				this.triangleX[var14] = var15;
				this.triangleY[var14] = var41;
				this.triangleZ[var14] = var38;
			}
		}

		var2.position = var43;
		var9.position = var52;
		var33.position = var44;
		var49.position = var54;
		var7.position = var45;
		var8.position = var47;

		for (var14 = 0; var14 < numTextureTriangles; var14++) {
			var32 = this.textureRenderTypes[var14] & 0xff;
			if (var32 == 0) {
				this.texTriX[var14] = (short) var2.getUShort();
				this.texTriY[var14] = (short) var2.getUShort();
				this.texTriZ[var14] = (short) var2.getUShort();
			}

			if (var32 == 1) {
				this.texTriX[var14] = (short) var9.getUShort();
				this.texTriY[var14] = (short) var9.getUShort();
				this.texTriZ[var14] = (short) var9.getUShort();
				this.aShortArray1750[var14] = (short) var33.getUShort();
				this.aShortArray1751[var14] = (short) var33.getUShort();
				this.aShortArray1767[var14] = (short) var33.getUShort();
				this.aShortArray1768[var14] = (short) var49.getUShort();
				this.aByteArray1735[var14] = var7.getByte();
				this.aShortArray1754[var14] = (short) var8.getUShort();
			}

			if (var32 == 2) {
				this.texTriX[var14] = (short) var9.getUShort();
				this.texTriY[var14] = (short) var9.getUShort();
				this.texTriZ[var14] = (short) var9.getUShort();
				this.aShortArray1750[var14] = (short) var33.getUShort();
				this.aShortArray1751[var14] = (short) var33.getUShort();
				this.aShortArray1767[var14] = (short) var33.getUShort();
				this.aShortArray1768[var14] = (short) var49.getUShort();
				this.aByteArray1735[var14] = var7.getByte();
				this.aShortArray1754[var14] = (short) var8.getUShort();
				this.texPrimaryColor[var14] = (short) var8.getUShort();
			}

			if (var32 == 3) {
				this.texTriX[var14] = (short) var9.getUShort();
				this.texTriY[var14] = (short) var9.getUShort();
				this.texTriZ[var14] = (short) var9.getUShort();
				this.aShortArray1750[var14] = (short) var33.getUShort();
				this.aShortArray1751[var14] = (short) var33.getUShort();
				this.aShortArray1767[var14] = (short) var33.getUShort();
				this.aShortArray1768[var14] = (short) var49.getUShort();
				this.aByteArray1735[var14] = var7.getByte();
				this.aShortArray1754[var14] = (short) var8.getUShort();
			}
		}

		var2.position = var5;
		var14 = var2.getUByte();
		if (var14 != 0) {
			new Class25();
			var2.getUShort();
			var2.getUShort();
			var2.getUShort();
			var2.getInt();
		}

	}

	void method908() {
		int var1;
		int var2;
		int var3;
		int[] var4;
		if (this.vertexSkins != null) {
			var4 = new int[256];
			var2 = 0;

			for (var1 = 0; var1 < this.vertexCount; var1++) {
				var3 = this.vertexSkins[var1];
				++var4[var3];
				if (var3 > var2) {
					var2 = var3;
				}
			}

			this.anIntArrayArray1759 = new int[var2 + 1][];

			for (var1 = 0; var1 <= var2; var1++) {
				this.anIntArrayArray1759[var1] = new int[var4[var1]];
				var4[var1] = 0;
			}

			for (var1 = 0; var1 < this.vertexCount; this.anIntArrayArray1759[var3][var4[var3]++] = var1++) {
				var3 = this.vertexSkins[var1];
			}

			this.vertexSkins = null;
		}

		if (this.skinValues != null) {
			var4 = new int[256];
			var2 = 0;

			for (var1 = 0; var1 < this.faceCount; var1++) {
				var3 = this.skinValues[var1];
				++var4[var3];
				if (var3 > var2) {
					var2 = var3;
				}
			}

			this.anIntArrayArray1760 = new int[var2 + 1][];

			for (var1 = 0; var1 <= var2; var1++) {
				this.anIntArrayArray1760[var1] = new int[var4[var1]];
				var4[var1] = 0;
			}

			for (var1 = 0; var1 < this.faceCount; this.anIntArrayArray1760[var3][var4[var3]++] = var1++) {
				var3 = this.skinValues[var1];
			}

			this.skinValues = null;
		}

	}

	static {
		anIntArray1758 = TexturedGraphic.SIN_TABLE;
		anIntArray1773 = new int[10000];
		anInt1774 = 0;
		anIntArray1776 = TexturedGraphic.COS_TABLE;
	}

}
