public final class TileOverlay {

	boolean flat = true;
	int shape;
	int rotation;
	int underlayRGB;
	int overlayRGB;
	int[] vertexX;
	int[] vertexY;
	int[] vertexZ;
	int[] triangleVertexA;
	int[] triangleVertexB;
	int[] triangleVertexC;
	int[] triangleColorA;
	int[] triangleColorB;
	int[] triangleColorC;
	int[] triangleTextureId;
	static int[] vertexSceneY = new int[6];
	static int[][] SHAPE_VERTICIES = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 },
			{ 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 },
			{ 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	static int[] vertexSceneZ = new int[6];
	static int[] vertexSceneX = new int[6];
	static int[] tmpScreenX = new int[6];
	static int[] tmpScreenY = new int[6];
	static int[][] SHAPE_PATHS = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
			{ 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			{ 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			{ 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			{ 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 },
			{ 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 },
			{ 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	TileOverlay(int var1, int rotation, int textureId, int tileX, int tileZ, int swY, int seY, int neY, int nwY, int swColor1,
			int seColor1, int neColor1, int nwColor1, int swColor2, int seColor2, int neColor2, int nwColor2, int var18, int var19) {
		if (swY != seY || swY != neY || swY != nwY) {
			this.flat = false;
		}

		this.shape = var1;
		this.rotation = rotation;
		this.underlayRGB = var18;
		this.overlayRGB = var19;
		short tileSize = 128;
		int halfSize = tileSize / 2;
		int quaterSize = tileSize / 4;
		int threeQuaterSize = tileSize * 3 / 4;
		int[] verticies = SHAPE_VERTICIES[var1];
		int vertexCount = verticies.length;
		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];
		int[] colors1 = new int[vertexCount];
		int[] colors2 = new int[vertexCount];
		int sceneX = tileX * tileSize;
		int sceneZ = tileZ * tileSize;

		int y;
		int vertex;
		int z;
		int color2;
		int x;
		int color1;
		for (int v = 0; v < vertexCount; v++) {
			vertex = verticies[v];
			if ((vertex & 0x1) == 0 && vertex <= 8) {
				vertex = (vertex - rotation - rotation - 1 & 0x7) + 1;
			}

			if (vertex > 8 && vertex <= 12) {
				vertex = (vertex - 9 - rotation & 0x3) + 9;
			}

			if (vertex > 12 && vertex <= 16) {
				vertex = (vertex - 13 - rotation & 0x3) + 13;
			}

			if (vertex == 1) {
				x = sceneX;
				z = sceneZ;
				y = swY;
				color1 = swColor1;
				color2 = swColor2;
			} else if (vertex == 2) {
				x = sceneX + halfSize;
				z = sceneZ;
				y = swY + seY >> 1;
				color1 = swColor1 + seColor1 >> 1;
				color2 = swColor2 + seColor2 >> 1;
			} else if (vertex == 3) {
				x = sceneX + tileSize;
				z = sceneZ;
				y = seY;
				color1 = seColor1;
				color2 = seColor2;
			} else if (vertex == 4) {
				x = sceneX + tileSize;
				z = sceneZ + halfSize;
				y = seY + neY >> 1;
				color1 = seColor1 + neColor1 >> 1;
				color2 = seColor2 + neColor2 >> 1;
			} else if (vertex == 5) {
				x = sceneX + tileSize;
				z = sceneZ + tileSize;
				y = neY;
				color1 = neColor1;
				color2 = neColor2;
			} else if (vertex == 6) {
				x = sceneX + halfSize;
				z = sceneZ + tileSize;
				y = neY + nwY >> 1;
				color1 = neColor1 + nwColor1 >> 1;
				color2 = neColor2 + nwColor2 >> 1;
			} else if (vertex == 7) {
				x = sceneX;
				z = sceneZ + tileSize;
				y = nwY;
				color1 = nwColor1;
				color2 = nwColor2;
			} else if (vertex == 8) {
				x = sceneX;
				z = sceneZ + halfSize;
				y = nwY + swY >> 1;
				color1 = nwColor1 + swColor1 >> 1;
				color2 = nwColor2 + swColor2 >> 1;
			} else if (vertex == 9) {
				x = sceneX + halfSize;
				z = sceneZ + quaterSize;
				y = swY + seY >> 1;
				color1 = swColor1 + seColor1 >> 1;
				color2 = swColor2 + seColor2 >> 1;
			} else if (vertex == 10) {
				x = sceneX + threeQuaterSize;
				z = sceneZ + halfSize;
				y = seY + neY >> 1;
				color1 = seColor1 + neColor1 >> 1;
				color2 = seColor2 + neColor2 >> 1;
			} else if (vertex == 11) {
				x = sceneX + halfSize;
				z = sceneZ + threeQuaterSize;
				y = neY + nwY >> 1;
				color1 = neColor1 + nwColor1 >> 1;
				color2 = neColor2 + nwColor2 >> 1;
			} else if (vertex == 12) {
				x = sceneX + quaterSize;
				z = sceneZ + halfSize;
				y = nwY + swY >> 1;
				color1 = nwColor1 + swColor1 >> 1;
				color2 = nwColor2 + swColor2 >> 1;
			} else if (vertex == 13) {
				x = sceneX + quaterSize;
				z = sceneZ + quaterSize;
				y = swY;
				color1 = swColor1;
				color2 = swColor2;
			} else if (vertex == 14) {
				x = sceneX + threeQuaterSize;
				z = sceneZ + quaterSize;
				y = seY;
				color1 = seColor1;
				color2 = seColor2;
			} else if (vertex == 15) {
				x = sceneX + threeQuaterSize;
				z = sceneZ + threeQuaterSize;
				y = neY;
				color1 = neColor1;
				color2 = neColor2;
			} else {
				x = sceneX + quaterSize;
				z = sceneZ + threeQuaterSize;
				y = nwY;
				color1 = nwColor1;
				color2 = nwColor2;
			}

			this.vertexX[v] = x;
			this.vertexY[v] = y;
			this.vertexZ[v] = z;
			colors1[v] = color1;
			colors2[v] = color2;
		}

		int[] paths = SHAPE_PATHS[var1];
		int triangleCount = paths.length / 4;
		this.triangleVertexA = new int[triangleCount];
		this.triangleVertexB = new int[triangleCount];
		this.triangleVertexC = new int[triangleCount];
		this.triangleColorA = new int[triangleCount];
		this.triangleColorB = new int[triangleCount];
		this.triangleColorC = new int[triangleCount];
		if (textureId != -1) {
			this.triangleTextureId = new int[triangleCount];
		}

		x = 0;

		for (z = 0; z < triangleCount; z++) {
			y = paths[x];
			color1 = paths[x + 1];
			color2 = paths[x + 2];
			int var28 = paths[x + 3];
			x += 4;
			if (color1 < 4) {
				color1 = color1 - rotation & 0x3;
			}

			if (color2 < 4) {
				color2 = color2 - rotation & 0x3;
			}

			if (var28 < 4) {
				var28 = var28 - rotation & 0x3;
			}

			this.triangleVertexA[z] = color1;
			this.triangleVertexB[z] = color2;
			this.triangleVertexC[z] = var28;
			if (y == 0) {
				this.triangleColorA[z] = colors1[color1];
				this.triangleColorB[z] = colors1[color2];
				this.triangleColorC[z] = colors1[var28];
				if (this.triangleTextureId != null) {
					this.triangleTextureId[z] = -1;
				}
			} else {
				this.triangleColorA[z] = colors2[color1];
				this.triangleColorB[z] = colors2[color2];
				this.triangleColorC[z] = colors2[var28];
				if (this.triangleTextureId != null) {
					this.triangleTextureId[z] = textureId;
				}
			}
		}

		z = swY;
		y = seY;
		if (seY < swY) {
			z = seY;
		}

		if (seY > seY) {
			y = seY;
		}

		if (neY < z) {
			z = neY;
		}

		if (neY > y) {
			y = neY;
		}

		if (nwY < z) {
			z = nwY;
		}

		if (nwY > y) {
			y = nwY;
		}

		z /= 14;
		y /= 14;
	}

}
