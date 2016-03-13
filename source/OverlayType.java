
public class OverlayType extends DualNode {

	public int texture = -978001323;
	public static NodeMap overlays = new NodeMap(64);
	public int saturation;
	public int otherHue;
	public int rgbColor = 0;
	public int otherRgbColor = 511239711;
	public int otherLightness;
	public boolean hideUnderlay = true;
	public int lightness;
	public int hue;
	public int otherSaturation;
	public static AbstractIndex overlay_ref;

	void decode(ByteBuf var1, int var2) {
		while (true) {
			int var3 = var1.getUByte();
			if (var3 == 0) {
				return;
			}

			this.method713(var1, var3, var2);
		}
	}

	void method713(ByteBuf var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgbColor = var1.getMedium() * 1304176145;
		} else if (var2 == 2) {
			this.texture = var1.getUByte() * 978001323;
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.otherRgbColor = var1.getMedium() * -511239711;
		} else if (var2 == 8) {
			;
		}

	}

	void setHSL(int rgb) {
		double red = (double) (rgb >> 16 & 0xFF) / 256.0D;
		double green = (double) (rgb >> 8 & 0xFF) / 256.0D;
		double blue = (double) (rgb & 0xFF) / 256.0D;
		double min = red;
		if (green < red) {
			min = green;
		}

		if (blue < min) {
			min = blue;
		}

		double max = red;
		if (green > red) {
			max = green;
		}

		if (blue > max) {
			max = blue;
		}

		double hue = 0.0D;
		double saturation = 0.0D;
		double lightness = (max + min) / 2.0D;
		if (min != max) {
			if (lightness < 0.5D) {
				saturation = (max - min) / (min + max);
			}

			if (lightness >= 0.5D) {
				saturation = (max - min) / (2.0D - max - min);
			}

			if (max == red) {
				hue = (green - blue) / (max - min);
			} else if (green == max) {
				hue = 2.0D + (blue - red) / (max - min);
			} else if (max == blue) {
				hue = (red - green) / (max - min) + 4.0D;
			}
		}

		hue /= 6.0D;
		this.hue = (int) (hue * 256.0D) * 817568045;
		this.saturation = 1558847427 * (int) (saturation * 256.0D);
		this.lightness = 765744919 * (int) (256.0D * lightness);
		if (-958248725 * this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation * -958248725 > 255) {
			this.saturation = -1925864643;
		}

		if (this.lightness * 1921798311 < 0) {
			this.lightness = 0;
		} else if (1921798311 * this.lightness > 255) {
			this.lightness = 1991426025;
		}

	}

	void post() {
		if (this.otherRgbColor * -105977311 != -1) {
			this.setHSL(this.otherRgbColor * -105977311);
			this.otherHue = 61882287 * this.hue;
			this.otherSaturation = 1723377719 * this.saturation;
			this.otherLightness = this.lightness * 1293569841;
		}

		this.setHSL(2024508145 * this.rgbColor);
	}

	public static String method716(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var4 = 0;

				for (long var5 = var0; var5 != 0L; var5 /= 37L) {
					++var4;
				}

				StringBuilder var2;
				char var3;
				for (var2 = new StringBuilder(var4); 0L != var0; var2.append(var3)) {
					long var7 = var0;
					var0 /= 37L;
					var3 = Class91.aCharArray723[(int) (var7 - 37L * var0)];
					if (var3 == 95) {
						int var9 = var2.length() - 1;
						var2.setCharAt(var9, java.lang.Character.toUpperCase(var2.charAt(var9)));
						var3 = 160;
					}
				}

				var2.reverse();
				var2.setCharAt(0, java.lang.Character.toUpperCase(var2.charAt(0)));
				return var2.toString();
			}
		} else {
			return null;
		}
	}
}
