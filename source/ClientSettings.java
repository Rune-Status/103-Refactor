import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ClientSettings {

   static int myWorldPort;
   static Widget aWidget304;
   static int anInt305;
   int screenType = 1;
   LinkedHashMap<Integer, Integer> trustList = new LinkedHashMap();
   boolean hideRoofs;
   boolean muted;
   static int amount = 4;

   ClientSettings() {
   }

   ClientSettings(ByteBuf buf) {
      if(buf != null && buf.payload != null) {
         int size = buf.getUByte();
         if(size >= 0 && size <= amount) {
            this.hideRoofs = buf.getUByte() == 1;
            if(size > 1) {
               this.muted = buf.getUByte() == 1;
            }

            if(size > 3) {
               this.screenType = buf.getUByte();
            }

            if(size > 2) {
               int count = buf.getUByte();

               for(int index = 0; index < count; index++) {
                  int usernameHash = buf.getInt();
                  int authHash = buf.getInt();
                  this.trustList.put(Integer.valueOf(usernameHash), Integer.valueOf(authHash));
               }
            }
         }
      }

   }

   ByteBuf serialize() {
      ByteBuf buf = new ByteBuf(100);
      buf.putByte(amount);
      buf.putByte(this.hideRoofs ? 1 : 0);
      buf.putByte(this.muted ? 1 : 0);
      buf.putByte(this.screenType);
      buf.putByte(this.trustList.size());
      Iterator iterator = this.trustList.entrySet().iterator();

      while(iterator.hasNext()) {
         Entry entry = (Entry)iterator.next();
         buf.putInt(((Integer)entry.getKey()).intValue());
         buf.putInt(((Integer)entry.getValue()).intValue());
      }

      return buf;
   }

   static void method160(int var0) {
      if(var0 != -1 && IdentKitType.loadWidget(var0)) {
         Widget[] var4 = Widget.interfaces[var0];

         for(int var3 = 0; var3 < var4.length; var3++) {
            Widget var2 = var4[var3];
            if(var2.anObjectArray1170 != null) {
               ScriptEvent var1 = new ScriptEvent();
               var1.widget = var2;
               var1.args = var2.anObjectArray1170;
               AbstractByteBuffer.execute(var1, 2000000);
            }
         }
      }

   }

   static final void method162() {
      for(GraphicsStub var0 = (GraphicsStub)Client.graphicsObjectDeque.getFront(); var0 != null; var0 = (GraphicsStub)Client.graphicsObjectDeque.getNext()) {
         if(var0.floorLevel == InterfaceNode.floorLevel * -1331355705 && !var0.finished) {
            if(Client.engineCycle >= var0.startCycle) {
               var0.method934(Client.anInt2066, (byte)15);
               if(var0.finished) {
                  var0.unlink();
               } else {
                  InterfaceNode.landscape.method19(var0.floorLevel, var0.regionX, var0.regionY, var0.height, 60, var0, 0, -1, false);
               }
            }
         } else {
            var0.unlink();
         }
      }

   }

   public static DualNode_Sub13_Sub3_Sub1 method163(AbstractIndex sprites, AbstractIndex fonts, String fontName, String childName) {
      int fileId = sprites.getFile(fontName);
      int childId = sprites.getChild(fileId, childName);
      DualNode_Sub13_Sub3_Sub1 var5;
      if(!Class35.decodeSprite(sprites, fileId, childId)) {
         var5 = null;
      } else {
         var5 = IgnoredPlayer.method415(fonts.getFile(fileId, childId));
      }

      return var5;
   }

   static final void method164(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(IdentKitType.loadWidget(var0)) {
         Class6.aWidgetArray146 = null;
         Class53.method272(Widget.interfaces[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if(Class6.aWidgetArray146 != null) {
            Class53.method272(Class6.aWidgetArray146, -1412584499, var1, var2, var3, var4, BoundaryStub.anInt276, Class75.anInt637, var7);
            Class6.aWidgetArray146 = null;
         }
      } else if(var7 != -1) {
         Client.aBoolArray2118[var7] = true;
      } else {
         for(int var8 = 0; var8 < 100; var8++) {
            Client.aBoolArray2118[var8] = true;
         }
      }

   }

}
