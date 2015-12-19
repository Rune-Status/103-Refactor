import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class78_Sub1 extends Class78 implements MouseWheelListener {

	int anInt1323 = 0;

	public void method342(Component var1, byte var2) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized int method341(int var1) {
		int var2 = this.anInt1323 * -1019968763;
		this.anInt1323 = 0;
		return var2;
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.anInt1323 += var1.getWheelRotation() * 1221382605;
	}

	public void method340(Component var1, short var2) {
		var1.addMouseWheelListener(this);
	}
}
