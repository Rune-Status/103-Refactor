import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public final class ConsumingImageProducer extends AbstractProducer implements ImageProducer, ImageObserver {

	static DualNode_Sub13_Sub3_Sub1 p11_full;
	static Task aClass61_1215;
	ColorModel model;
	ImageConsumer consumer;

	public final void initializeProducer(int width, int height, Component comp) {
		this.width = width;
		this.height = height;
		this.dataArray = new int[width * height + 1];
		this.model = new DirectColorModel(32, 16711680, '\uff00', 255);
		this.image = comp.createImage(this);
		this.imageComplete();
		comp.prepareImage(this.image, this);
		this.imageComplete();
		comp.prepareImage(this.image, this);
		this.imageComplete();
		comp.prepareImage(this.image, this);
		this.setRaster();
	}

	public final void drawImage(Graphics g, int x, int y) {
		this.imageComplete();
		g.drawImage(this.image, x, y, this);
	}

	public final void drawImageClip(Graphics g, int x, int y, int width, int height) {
		this.imageComplete(x, y, width, height);
		Shape shape = g.getClip();
		g.clipRect(x, y, width, height);
		g.drawImage(this.image, 0, 0, this);
		g.setClip(shape);
	}

	public boolean imageUpdate(Image img, int flags, int x, int y, int width, int height) {
		return true;
	}

	public synchronized boolean isConsumer(ImageConsumer con) {
		return this.consumer == con;
	}

	public synchronized void removeConsumer(ImageConsumer con) {
		if (this.consumer == con) {
			this.consumer = null;
		}

	}

	public void startProduction(ImageConsumer con) {
		this.addConsumer(con);
	}

	public void requestTopDownLeftRightResend(ImageConsumer con) {
	}

	synchronized void imageComplete() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, this.width, this.height, this.model, this.dataArray, 0, this.width);
			this.consumer.imageComplete(ImageConsumer.SINGLEFRAMEDONE);
		}

	}

	synchronized void imageComplete(int x, int y, int width, int height) {
		if (this.consumer != null) {
			this.consumer.setPixels(x, y, width, height, this.model, this.dataArray, this.width * y + x, this.width);
			this.consumer.imageComplete(ImageConsumer.SINGLEFRAMEDONE);
		}

	}

	public synchronized void addConsumer(ImageConsumer con) {
		this.consumer = con;
		con.setDimensions(this.width, this.height);
		con.setProperties(null);
		con.setColorModel(this.model);
		con.setHints(14);
	}

}
