import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class MouseInput implements MouseListener, MouseMotionListener, FocusListener {

	public static volatile int anInt617 = 0;
	public static volatile int anInt626 = 0;
	public static volatile int anInt625 = 1101998179;
	public static volatile int anInt619 = -1;
	public static volatile int anInt631 = 0;
	public static volatile int anInt620 = 0;
	public static volatile long aLong616 = 0L;
	public static volatile int anInt623 = 0;
	public static MouseInput aClass74_618 = new MouseInput();
	public static int anInt621 = 0;
	public static int anInt622 = 0;
	public static int anInt624 = 0;
	public static int anInt627 = 0;
	public static int anInt628 = 0;
	public static int anInt629 = 0;
	public static long aLong630 = 0L;

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (aClass74_618 != null) {
			anInt617 = 0;
			anInt626 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (aClass74_618 != null) {
			anInt617 = 0;
			anInt625 = var1.getX() * -1101998179;
			anInt619 = var1.getY();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	static ChatMessage method332(int var0) {
		return (ChatMessage) Class32.aClass107_355.method432((long) var0);
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (aClass74_618 != null) {
			anInt617 = 0;
			anInt631 = var1.getX();
			anInt620 = var1.getY();
			aLong616 = AnimationSkin.currentTimeMs();
			if (var1.isAltDown()) {
				anInt623 = 4;
				anInt626 = 809537916;
			} else if (var1.isMetaDown()) {
				anInt623 = 2;
				anInt626 = -1742714690;
			} else {
				anInt623 = 1;
				anInt626 = 1276126303;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		if (aClass74_618 != null) {
			anInt617 = 0;
			anInt625 = var1.getX() * -1101998179;
			anInt619 = var1.getY();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		if (aClass74_618 != null) {
			anInt617 = 0;
			anInt625 = var1.getX() * -1101998179;
			anInt619 = var1.getY();
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (aClass74_618 != null) {
			anInt617 = 0;
			anInt625 = 1101998179;
			anInt619 = -1;
		}

	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (aClass74_618 != null) {
			anInt626 = 0;
		}

	}

	static final void flush(boolean force) {
		Occluder.method201();
		++Client.flushCount;
		if (Client.flushCount >= 50 || force) {
			Client.flushCount = 0;
			if (!Client.socketError && TileUnderlay.gameConnection != null) {
				Client.outBuffer.putHeader(126);

				try {
					TileUnderlay.gameConnection.write(Client.outBuffer.payload, 0, Client.outBuffer.position);
					Client.outBuffer.position = 0;
				} catch (IOException var2) {
					Client.socketError = true;
				}
			}
		}

	}

}
