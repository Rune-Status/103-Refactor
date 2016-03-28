import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public final class GraphicsStub extends Entity {

   static int anInt1813;
   int anInt1809 = 0;
   int anInt1811 = 0;
   boolean finished = false;
   int anInt1812;
   int floorLevel;
   int regionX;
   int regionY;
   int height;
   int startCycle;
   SequenceType aDualNode_Sub3_1810;

   static File method933(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      Class75.aFile632 = new File(BitBuf.userHome, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      ByteBuf var8;
      File var20;
      int var15;
      if(Class75.aFile632.exists()) {
         try {
            CacheFileAccessor var19 = new CacheFileAccessor(Class75.aFile632, "rw", 10000L);

            for(var8 = new ByteBuf((int)var19.length()); var8.position < var8.payload.length; var8.position += var15) {
               var15 = var19.read(var8.payload, var8.position, var8.payload.length - var8.position);
               if(var15 == -1) {
                  throw new IOException();
               }
            }

            var8.position = 0;
            var15 = var8.getUByte();
            if(var15 < 1 || var15 > 3) {
               throw new IOException("" + var15);
            }

            int var26 = 0;
            if(var15 > 1) {
               var26 = var8.getUByte();
            }

            if(var15 <= 2) {
               var4 = var8.method645();
               if(var26 == 1) {
                  var5 = var8.method645();
               }
            } else {
               var4 = var8.getJagString();
               if(var26 == 1) {
                  var5 = var8.getJagString();
               }
            }

            var19.close();
         } catch (IOException var18) {
            var18.printStackTrace();
         }

         if(var4 != null) {
            var20 = new File(var4);
            if(!var20.exists()) {
               var4 = null;
            }
         }

         if(var4 != null) {
            var20 = new File(var4, "test.dat");
            if(!AbstractIndex.method393(var20, true)) {
               var4 = null;
            }
         }
      }

      if(var4 == null && var2 == 0) {
         label114:
         for(int var191 = 0; var191 < Class67.historicLocations.length; var191++) {
            for(var15 = 0; var15 < BoundaryDecorationStub.cacheLocations.length; var15++) {
               File var23 = new File(BoundaryDecorationStub.cacheLocations[var15] + Class67.historicLocations[var191] + File.separatorChar + var0 + File.separatorChar);
               if(var23.exists() && AbstractIndex.method393(new File(var23, "test.dat"), true)) {
                  var4 = var23.toString();
                  var6 = true;
                  break label114;
               }
            }
         }
      }

      if(var4 == null) {
         var4 = BitBuf.userHome + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      File var201;
      if(var5 != null) {
         var201 = new File(var5);
         var20 = new File(var4);

         try {
            File[] var21 = var201.listFiles();
            File[] var24 = var21;

            for(int var11 = 0; var11 < var24.length; var11++) {
               File var12 = var24[var11];
               File var13 = new File(var20, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if(!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var17) {
            var17.printStackTrace();
         }

         var6 = true;
      }

      if(var6) {
         var201 = new File(var4);
         var8 = null;

         try {
            CacheFileAccessor var22 = new CacheFileAccessor(Class75.aFile632, "rw", 10000L);
            ByteBuf var25 = new ByteBuf(500);
            var25.putByte(3);
            var25.putByte(var8 != null ? 1 : 0);
            var25.putCESU8(var201.getPath());
            var22.write(var25.payload, 0, var25.position);
            var22.close();
         } catch (IOException var16) {
            var16.printStackTrace();
         }
      }

      return new File(var4);
   }

   protected final Model method654(byte var1) {
      SpotAnimType var2 = Class96_Sub1.getSpotAnimType(this.anInt1812);
      Model var3;
      if(!this.finished) {
         var3 = var2.method656(this.anInt1811);
      } else {
         var3 = var2.method656(-1);
      }

      return var3 == null ? null : var3;
   }

   final void method934(int var1, byte var2) {
      if(!this.finished) {
         this.anInt1809 += var1;

         while(this.anInt1809 > this.aDualNode_Sub3_1810.anIntArray1481[this.anInt1811]) {
            this.anInt1809 -= this.aDualNode_Sub3_1810.anIntArray1481[this.anInt1811];
            ++this.anInt1811;
            if(this.anInt1811 >= this.aDualNode_Sub3_1810.anIntArray1474.length) {
               this.finished = true;
               break;
            }
         }
      }

   }

   GraphicsStub(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.anInt1812 = var1;
      this.floorLevel = var2;
      this.regionX = var3;
      this.regionY = var4;
      this.height = var5;
      this.startCycle = var6 + var7;
      int var8 = Class96_Sub1.getSpotAnimType(this.anInt1812).anInt1441;
      if(var8 != -1) {
         this.finished = false;
         this.aDualNode_Sub3_1810 = Node_Sub6.getSequenceType(var8);
      } else {
         this.finished = true;
      }

   }

   public static void method935(TaskManager var0, Object var1) {
      if(var0.sysEventQueue != null) {
         for(int var2 = 0; var2 < 50 && var0.sysEventQueue.peekEvent() != null; var2++) {
            Class96_Sub1.sleep(1L);
         }

         if(var1 != null) {
            var0.sysEventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }
      }

   }

   public static boolean method936(int var0) {
      ClassVerifier var1 = (ClassVerifier)Class119.aClass103_804.method420();
      return var1 != null;
   }

}
