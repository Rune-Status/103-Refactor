public class TextureLoader implements Interface3 {

	int anInt327 = 1123596160;
	Deque deque = new Deque();
	int anInt329;
	int anInt330 = 0;
	double brightness = 1.0D;
	Texture[] textures;
	AbstractIndex sprites;
	static int anInt334;
	static int sessionId;

	public void method185(double var1) {
		this.brightness = var1;
		this.method187();
	}

	public int[] method10(int id) {
		Texture texture = this.textures[id];
		if (texture != null) {
			if (texture.pixels != null) {
				this.deque.method474(texture);
				texture.aBool1293 = true;
				return texture.pixels;
			}

			boolean success = texture.method543(this.brightness, 403475855 * this.anInt327, this.sprites);
			if (success) {
				if (this.anInt330 * -1517992811 == 0) {
					Texture var5 = (Texture) this.deque.method470();
					var5.resetPixels();
				} else {
					this.anInt330 -= 1927636669;
				}

				this.deque.method474(texture);
				texture.aBool1293 = true;
				return texture.pixels;
			}
		}

		return null;
	}

	public boolean method8(int var1, byte var2) {
		return this.textures[var1].aBool1285;
	}

	public boolean method9(int var1, byte var2) {
		return 403475855 * this.anInt327 == 64;
	}

	public TextureLoader(AbstractIndex texureIndex, AbstractIndex spriteIndex, int var3, double var4, int var6) {
		this.sprites = spriteIndex;
		this.anInt329 = -393029919 * var3;
		this.anInt330 = this.anInt329 * 1019426653;
		this.brightness = var4;
		this.anInt327 = 1787162991 * var6;
		int[] childs = texureIndex.getChilds(0);
		this.textures = new Texture[texureIndex.fileCount(0)];

		for (int index = 0; index < childs.length; ++index) {
			ByteBuf buf = new ByteBuf(texureIndex.getFile(0, childs[index]));
			this.textures[childs[index]] = new Texture(buf);
		}
	}

	public void method186(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.anInt1294 != 0 && var3.aBool1293) {
				var3.method542(var1);
				var3.aBool1293 = false;
			}
		}

	}

	public int method7(int var1, int var2) {
		return this.textures[var1] != null ? this.textures[var1].anInt1286 : 0;
	}

	public void method187() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].resetPixels();
			}
		}

		this.deque = new Deque();
		this.anInt330 = this.anInt329 * 1019426653;
	}
}
