import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;

public class AnimationSkin extends Node {

   static ClientSettings settings;
   static CacheIndex spritesIndex;
   int anInt1263;
   int anInt1267;
   int[] anIntArray1262;
   int[][] anIntArrayArray1264;

   public static synchronized long currentTimeMs() {
      long var0 = System.currentTimeMillis();
      if(var0 < Class54.aLong539) {
         Class54.aLong540 += Class54.aLong539 - var0;
      }

      Class54.aLong539 = var0;
      return Class54.aLong540 + var0;
   }

   static boolean isFriended(String name, boolean var1) {
      if(name == null) {
         return false;
      } else {
         String var2 = VarPlayerType.method728(name, Class48_Sub1.aClass124_1297);

         for(int var3 = 0; var3 < Client.anInt2184; var3++) {
            if(var2.equalsIgnoreCase(VarPlayerType.method728(Client.friendedPlayers[var3].displayName, Class48_Sub1.aClass124_1297)) && (!var1 || Client.friendedPlayers[var3].world != 0)) {
               return true;
            }
         }

         if(var2.equalsIgnoreCase(VarPlayerType.method728(Class68.myPlayer.name, Class48_Sub1.aClass124_1297))) {
            return true;
         } else {
            return false;
         }
      }
   }

   static void method534() {
      Client client = Client.clientInstance;
      synchronized(client) {
         Container container = Client.clientInstance.container();
         if(container != null) {
            VarClientStringType.anInt1505 = Math.max(container.getSize().width, CacheFileAccessor.anInt836 * 2055757083);
            Class21.anInt281 = Math.max(container.getSize().height, ClanMate.anInt1222 * -1066486805);
            if(VarClientType.gameFrame == container) {
               Insets var3 = VarClientType.gameFrame.getInsets();
               VarClientStringType.anInt1505 -= var3.left + var3.right;
               Class21.anInt281 -= var3.top + var3.bottom;
            }

            if(VarClientStringType.anInt1505 <= 0) {
               VarClientStringType.anInt1505 = 1;
            }

            if(Class21.anInt281 <= 0) {
               Class21.anInt281 = 1;
            }

            if(!Client.resizable) {
               Class34.gameWidth = Client.anInt2233;
               Node_Sub9.gameHeight = Client.anInt2181 * 674167779;
            } else {
               Class34.gameWidth = Math.min(VarClientStringType.anInt1505, 7680);
               Node_Sub9.gameHeight = Math.min(Class21.anInt281, 2160);
            }

            Client.anInt1983 = (VarClientStringType.anInt1505 - Class34.gameWidth) / 2;
            Client.anInt1978 = 0;
            LandscapeTile.gameCanvas.setSize(Class34.gameWidth, Node_Sub9.gameHeight);
            int var31 = Class34.gameWidth;
            int var4 = Node_Sub9.gameHeight;
            Canvas var5 = LandscapeTile.gameCanvas;

            Object producer;
            try {
               producer = new DirectImageProducer();
            } catch (Throwable var13) {
               producer = new ConsumingImageProducer();
            }

            ((AbstractProducer)producer).initializeProducer(var31, var4, var5);
            IndexTable.imageProducer = (AbstractProducer)producer;
            if(VarClientType.gameFrame == container) {
               Insets var17 = VarClientType.gameFrame.getInsets();
               LandscapeTile.gameCanvas.setLocation(Client.anInt1983 + var17.left, var17.top + Client.anInt1978);
            } else {
               LandscapeTile.gameCanvas.setLocation(Client.anInt1983, Client.anInt1978);
            }

            int var171 = Class34.gameWidth;
            int var18 = Node_Sub9.gameHeight;
            if(VarClientStringType.anInt1505 < var171) {
               var171 = VarClientStringType.anInt1505;
            }

            if(Class21.anInt281 < var18) {
               var18 = Class21.anInt281;
            }

            if(settings != null) {
               try {
                  Client var9 = Client.clientInstance;
                  int var10 = Client.resizable ? 2 : 1;
                  JSHelper.call(var9, "resize", new Object[]{Integer.valueOf(var10)});
               } catch (Throwable var12) {
                  ;
               }
            }

            if(Client.anInt2226 != -1) {
               ItemTable.method647(true);
            }

            SpotAnimType.method659();
         }

      }
   }

   AnimationSkin(int var1, byte[] var2) {
      this.anInt1263 = var1;
      ByteBuf var4 = new ByteBuf(var2);
      this.anInt1267 = var4.getUByte();
      this.anIntArray1262 = new int[this.anInt1267];
      this.anIntArrayArray1264 = new int[this.anInt1267][];

      int var3;
      for(var3 = 0; var3 < this.anInt1267; var3++) {
         this.anIntArray1262[var3] = var4.getUByte();
      }

      for(var3 = 0; var3 < this.anInt1267; var3++) {
         this.anIntArrayArray1264[var3] = new int[var4.getUByte()];
      }

      for(var3 = 0; var3 < this.anInt1267; var3++) {
         for(int var5 = 0; var5 < this.anIntArrayArray1264[var3].length; var5++) {
            this.anIntArrayArray1264[var3][var5] = var4.getUByte();
         }
      }

   }

   public static int method535(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var8 = false;
         boolean var4 = false;
         int var6 = 0;
         int var3 = var0.length();

         for(int var7 = 0; var7 < var3; var7++) {
            char var5 = var0.charAt(var7);
            if(var7 == 0) {
               if(var5 == 45) {
                  var8 = true;
                  continue;
               }

               if(var5 == 43 && var2) {
                  continue;
               }
            }

            int var10;
            if(var5 >= 48 && var5 <= 57) {
               var10 = var5 - 48;
            } else if(var5 >= 65 && var5 <= 90) {
               var10 = var5 - 55;
            } else {
               if(var5 < 97 || var5 > 122) {
                  throw new NumberFormatException();
               }

               var10 = var5 - 87;
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var8) {
               var10 = -var10;
            }

            int var9 = var1 * var6 + var10;
            if(var9 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

}
