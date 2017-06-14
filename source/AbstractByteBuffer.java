import java.applet.Applet;
import java.util.Date;

public abstract class AbstractByteBuffer {

	static boolean aBool528 = false;

	public static Sprite method257(AbstractIndex sprites, String file, String child) {
		int fileId = sprites.getFile(file);
		int childId = sprites.getChild(fileId, child);
		Sprite var9;
		if (Class35.decodeSprite(sprites, fileId, childId)) {
			Sprite picture = new Sprite();
			picture.width = Class7.width;
			picture.height = Class7.height;
			picture.offsetX = Class7.offsetsX[0];
			picture.offsetY = VarPlayerType.offsetsY[0];
			picture.subWidth = Class7.subWidths[0];
			picture.subHeight = Class7.subHeights[0];
			int size = picture.subWidth * picture.subHeight;
			byte[] pixels = Npc.spritePixels[0];
			picture.pixels = new int[size];

			for (int index = 0; index < size; index++) {
				picture.pixels[index] = Class85.palette[pixels[index] & 0xff];
			}

			Class65.resetSprite();
			var9 = picture;
		} else {
			var9 = null;
		}

		return var9;
	}

	abstract byte[] get();

	abstract void put(byte[] var1);

	public static void method260(Applet var0, String var1) {
		Class70.anApplet587 = var0;
		Class70.aString586 = var1;
	}

}
