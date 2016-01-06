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

public final class DirectImageProducer extends AbstractProducer {

	Component component;

	public final void drawImageClip(Graphics g, int x, int y, int width, int height) {
		Shape shape = g.getClip();
		g.clipRect(x, y, width, height);
		g.drawImage(this.image, 0, 0, this.component);
		g.setClip(shape);
	}

	public final void initializeProducer(int width, int height, Component comp) {
		this.width = 409111727 * width;
		this.height = height * 1577837381;
		this.dataArray = new int[1 + width * height];
		DataBufferInt buf = new DataBufferInt(this.dataArray, this.dataArray.length);
		DirectColorModel cm = new DirectColorModel(32, 16711680, '\uff00', 255);
		WritableRaster raster = Raster.createWritableRaster(
				cm.createCompatibleSampleModel(this.width * 1154763343, this.height * -1725941875), buf, (Point) null);
		this.image = new BufferedImage(cm, raster, false, new Hashtable<Object, Object>());
		this.component = comp;
		this.setRaster();
	}

	public final void drawImage(Graphics g, int x, int y) {
		g.drawImage(this.image, x, y, this.component);
	}
}
