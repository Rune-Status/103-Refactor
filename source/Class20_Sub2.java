import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class20_Sub2 extends Class20 {

	Component aComponent1268;

	public final void method141(Graphics var1, int var2, int var3, int var4, int var5, short var6) {
		Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(this.anImage273, 0, 0, this.aComponent1268);
		var1.setClip(var7);
	}

	public final void method145(int var1, int var2, Component var3, byte var4) {
		this.anInt270 = 409111727 * var1;
		this.anInt272 = var2 * 1577837381;
		this.anIntArray271 = new int[1 + var1 * var2];
		DataBufferInt var6 = new DataBufferInt(this.anIntArray271, this.anIntArray271.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, '\uff00', 255);
		WritableRaster var7 = Raster.createWritableRaster(
				var5.createCompatibleSampleModel(this.anInt270 * 1154763343, this.anInt272 * -1725941875), var6,
				(Point) null);
		this.anImage273 = new BufferedImage(var5, var7, false, new Hashtable());
		this.aComponent1268 = var3;
		this.method142();
	}

	public final void method144(Graphics var1, int var2, int var3, int var4) {
		var1.drawImage(this.anImage273, var2, var3, this.aComponent1268);
	}
}
