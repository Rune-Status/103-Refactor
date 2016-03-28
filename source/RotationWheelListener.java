import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class RotationWheelListener extends AbstractWheelListener implements MouseWheelListener {

   int rotation = 0;

   public void removeWheelListener(Component comp) {
      comp.removeMouseWheelListener(this);
   }

   public synchronized int getRotation() {
      int rot = this.rotation;
      this.rotation = 0;
      return rot;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.rotation += var1.getWheelRotation();
   }

   public void setWheelListener(Component comp) {
      comp.addMouseWheelListener(this);
   }

}
