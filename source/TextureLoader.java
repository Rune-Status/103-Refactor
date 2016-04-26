public class TextureLoader implements ITextureLoader {

	static int anInt334;
	static int sessionId;
	double brightness = 1.0D;
	int size = 0;
	int width = 128;
	Deque deque = new Deque();
	AbstractIndex sprites;
	int maxSize;
	Texture[] textures;

	public void brightness(double var1) {
		this.brightness = var1;
		this.reset();
	}

	public int[] pixels(int id) {
		Texture texture = this.textures[id];
		if (texture != null) {
			if (texture.pixels != null) {
				this.deque.method474(texture);
				texture.loaded = true;
				return texture.pixels;
			}

			boolean success = texture.method543(this.brightness, this.width, this.sprites);
			if (success) {
				if (this.size == 0) {
					Texture var5 = (Texture) this.deque.method470();
					var5.resetPixels();
				} else {
					--this.size;
				}

				this.deque.method474(texture);
				texture.loaded = true;
				return texture.pixels;
			}
		}

		return null;
	}

	public boolean method8(int var1) {
		return this.textures[var1].aBool1285;
	}

	public boolean lowMem() {
		return this.width == 64;
	}

	public TextureLoader(AbstractIndex texureIndex, AbstractIndex spriteIndex, int var3, double var4, int var6) {
		this.sprites = spriteIndex;
		this.maxSize = var3 * 1927636669;
		this.size = this.maxSize * -1517992811;
		this.brightness = var4;
		this.width = var6;
		int[] childs = texureIndex.getChilds(0);
		this.textures = new Texture[texureIndex.fileCount(0)];

		for (int index = 0; index < childs.length; index++) {
			ByteBuf buf = new ByteBuf(texureIndex.getFile(0, childs[index]));
			this.textures[childs[index]] = new Texture(buf);
		}

	}

	public void method186(int var1) {
		for (int var2 = 0; var2 < this.textures.length; var2++) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.anInt1294 != 0 && var3.loaded) {
				var3.method542(var1);
				var3.loaded = false;
			}
		}

	}

	public int method7(int var1) {
		return this.textures[var1] != null ? this.textures[var1].anInt1286 : 0;
	}

	public void reset() {
		for (int var1 = 0; var1 < this.textures.length; var1++) {
			if (this.textures[var1] != null) {
				this.textures[var1].resetPixels();
			}
		}

		this.deque = new Deque();
		this.size = this.maxSize * -1517992811;
	}

}
