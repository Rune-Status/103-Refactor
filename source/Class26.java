import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class26 {

   static int anInt310;
   static AbstractWheelListener wheelListener;
   static CacheIndex vorbisIndex;
   DataInputStream aDataInputStream308;
   int anInt314;
   int anInt306;
   byte[] aByteArray307;
   int anInt312;
   byte[] aByteArray309 = new byte[4];
   Task aClass61_315;
   long aLong311;

   byte[] method167() throws IOException {
      if(AnimationSkin.currentTimeMs() > this.aLong311) {
         throw new IOException();
      } else {
         if(this.anInt314 == 0) {
            if(this.aClass61_315.status == 2) {
               throw new IOException();
            }

            if(this.aClass61_315.status == 1) {
               this.aDataInputStream308 = (DataInputStream)this.aClass61_315.value;
               this.anInt314 = 1;
            }
         }

         int var1;
         if(this.anInt314 == 1) {
            var1 = this.aDataInputStream308.available();
            if(var1 > 0) {
               if(this.anInt306 + var1 > 4) {
                  var1 = 4 - this.anInt306;
               }

               this.anInt306 += this.aDataInputStream308.read(this.aByteArray309, this.anInt306, var1);
               if(this.anInt306 == 4) {
                  int var2 = (new ByteBuf(this.aByteArray309)).getInt();
                  this.aByteArray307 = new byte[var2];
                  this.anInt314 = 2;
               }
            }
         }

         if(this.anInt314 == 2) {
            var1 = this.aDataInputStream308.available();
            if(var1 > 0) {
               if(this.anInt312 + var1 > this.aByteArray307.length) {
                  var1 = this.aByteArray307.length - this.anInt312;
               }

               this.anInt312 += this.aDataInputStream308.read(this.aByteArray307, this.anInt312, var1);
               if(this.anInt312 == this.aByteArray307.length) {
                  return this.aByteArray307;
               }
            }
         }

         return null;
      }
   }

   static String method168(Widget var0) {
      return TaskManager.method314(Class30.getWidgetConfig(var0)) == 0 ? null : (var0.selectedAction != null && var0.selectedAction.trim().length() != 0 ? var0.selectedAction : null);
   }

   static final void decodePlayerUpdate(BitBuf buf, int size) {
      int position = buf.position;
      GPI.pendingFlagsCount = 0;
      World.decodeLocationUpdates(buf);

      for(int index = 0; index < GPI.pendingFlagsCount; index++) {
         int playerIndex = GPI.pendingFlagsIndices[index];
         Player player = Client.playerArray[playerIndex];
         int flags = buf.getUByte();
         if((flags & 0x10) != 0) {
            flags += buf.getUByte() << 8;
         }

         Timer.decodePlayerFlags(buf, playerIndex, player, flags);
      }

      if(buf.position - position != size) {
         throw new RuntimeException(buf.position - position + " " + size);
      }
   }

   Class26(TaskManager var1, URL var2) {
      this.aClass61_315 = var1.createURL(var2);
      this.anInt314 = 0;
      this.aLong311 = AnimationSkin.currentTimeMs() + 30000L;
   }

   public static void method170(AbstractIndex var0) {
      UnderlayType.underlay_ref = var0;
   }

}
