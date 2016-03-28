import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public final class Class41 {

   static int subPort;

   static String method223(int var0) {
      return "<img=" + var0 + ">";
   }

   Class41() throws Throwable {
      throw new Error();
   }

   static void method224() {
      Class6.username = Class6.username.trim();
      if(Class6.username.length() == 0) {
         GPI.method230("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var0 = AbstractSoundSystem.method81();
         byte var2;
         if(var0 == 0L) {
            var2 = 5;
         } else {
            String var3 = Class6.username;
            Random var4 = new Random();
            ByteBuf var5 = new ByteBuf(128);
            ByteBuf var6 = new ByteBuf(128);
            int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
            var5.putByte(10);

            int var8;
            for(var8 = 0; var8 < 4; var8++) {
               var5.putInt(var4.nextInt());
            }

            var5.putInt(var7[0]);
            var5.putInt(var7[1]);
            var5.putLong(var0);
            var5.putLong(0L);

            for(var8 = 0; var8 < 4; var8++) {
               var5.putInt(var4.nextInt());
            }

            var5.encryptRSA(Class22.aBigInteger283, Class22.aBigInteger284);
            var6.putByte(10);

            for(var8 = 0; var8 < 3; var8++) {
               var6.putInt(var4.nextInt());
            }

            var6.putLong(var4.nextLong());
            var6.put48Bit(var4.nextLong());
            byte[] var24 = new byte[24];

            try {
               Class75.randomDat.seek(0L);
               Class75.randomDat.read(var24);

               int var23;
               for(var23 = 0; var23 < 24 && var24[var23] == 0; var23++) {
                  ;
               }

               if(var23 >= 24) {
                  throw new IOException();
               }
            } catch (Exception var241) {
               for(int var25 = 0; var25 < 24; var25++) {
                  var24[var25] = -1;
               }
            }

            var6.putBytes(var24, 0, 24);
            var6.putLong(var4.nextLong());
            var6.encryptRSA(Class22.aBigInteger283, Class22.aBigInteger284);
            var8 = TileDecorationStub.getLength(var3);
            if(var8 % 8 != 0) {
               var8 += 8 - var8 % 8;
            }

            ByteBuf var251 = new ByteBuf(var8);
            var251.putString(var3);
            var251.position = var8;
            var251.encryptXTEA(var7);
            ByteBuf var261 = new ByteBuf(var5.position + 5 + var6.position + var251.position);
            var261.putByte(2);
            var261.putByte(var5.position);
            var261.putBytes(var5.payload, 0, var5.position);
            var261.putByte(var6.position);
            var261.putBytes(var6.payload, 0, var6.position);
            var261.putShort(var251.position);
            var261.putBytes(var251.payload, 0, var251.position);
            String var11 = Character.method1019(var261.payload);

            byte var17;
            try {
               URL var21 = new URL(Class37.method212("services", false) + "m=accountappeal/login.ws");
               URLConnection var13 = var21.openConnection();
               var13.setDoInput(true);
               var13.setDoOutput(true);
               var13.setConnectTimeout(5000);
               OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
               var14.write("data2=" + Class58.method288(var11) + "&dest=" + Class58.method288("passwordchoice.ws"));
               var14.flush();
               InputStream var15 = var13.getInputStream();
               var261 = new ByteBuf(new byte[1000]);

               while(true) {
                  int var16 = var15.read(var261.payload, var261.position, 1000 - var261.position);
                  if(var16 == -1) {
                     var14.close();
                     var15.close();
                     String var26 = new String(var261.payload);
                     if(var26.startsWith("OFFLINE")) {
                        var17 = 4;
                     } else if(var26.startsWith("WRONG")) {
                        var17 = 7;
                     } else if(var26.startsWith("RELOAD")) {
                        var17 = 3;
                     } else if(var26.startsWith("Not permitted for social network accounts.")) {
                        var17 = 6;
                     } else {
                        var261.decryptXTEA(var7);

                        while(var261.position > 0 && var261.payload[var261.position - 1] == 0) {
                           --var261.position;
                        }

                        var26 = new String(var261.payload, 0, var261.position);
                        boolean var18;
                        if(var26 == null) {
                           var18 = false;
                        } else {
                           label157: {
                              try {
                                 new URL(var26);
                              } catch (MalformedURLException var22) {
                                 var18 = false;
                                 break label157;
                              }

                              var18 = true;
                           }
                        }

                        if(var18) {
                           Class96_Sub1.method503(var26, true, "openjs", false);
                           var17 = 2;
                        } else {
                           var17 = 5;
                        }
                     }
                     break;
                  }

                  var261.position += var16;
                  if(var261.position >= 1000) {
                     var17 = 5;
                     break;
                  }
               }
            } catch (Throwable var231) {
               var231.printStackTrace();
               var17 = 5;
            }

            var2 = var17;
         }

         switch(var2) {
         case 2:
            GPI.method230("", "Page has opened in a new window.", "(Please check your popup blocker.)");
            Class6.anInt116 = 6;
            break;
         case 3:
            GPI.method230("", "Error connecting to server.", "");
            break;
         case 4:
            GPI.method230("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            GPI.method230("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            GPI.method230("", "Error connecting to server.", "");
            break;
         case 7:
            GPI.method230("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }
      }

   }

   public static Class51[] method225(int var0) {
      return new Class51[]{Class51.aClass51_527, Class51.aClass51_524, Class51.aClass51_523};
   }

   static final void method226(Node_Sub8 var0) {
      int var1 = 0;
      int var3 = -1;
      int var5 = 0;
      int var4 = 0;
      if(var0.anInt1303 == 0) {
         var1 = InterfaceNode.landscape.method53(var0.anInt1302, var0.anInt1300, var0.anInt1312);
      }

      if(var0.anInt1303 == 1) {
         var1 = InterfaceNode.landscape.method31(var0.anInt1302, var0.anInt1300, var0.anInt1312);
      }

      if(var0.anInt1303 == 2) {
         var1 = InterfaceNode.landscape.method32(var0.anInt1302, var0.anInt1300, var0.anInt1312);
      }

      if(var0.anInt1303 == 3) {
         var1 = InterfaceNode.landscape.method33(var0.anInt1302, var0.anInt1300, var0.anInt1312);
      }

      if(var1 != 0) {
         int var2 = InterfaceNode.landscape.method34(var0.anInt1302, var0.anInt1300, var0.anInt1312, var1);
         var3 = var1 >> 14 & 0x7fff;
         var5 = var2 & 0x1f;
         var4 = var2 >> 6 & 0x3;
      }

      var0.anInt1304 = var3;
      var0.anInt1313 = var5;
      var0.anInt1306 = var4;
   }

}
