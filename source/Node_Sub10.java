public class Node_Sub10 extends Node {

   int anInt1341;
   int anInt1346;
   int anInt1353;
   int anInt1357;
   int anInt1358;
   int anInt1359;
   static int chunkLeftX;
   int[] anIntArray1362 = new int[3];
   int anInt1343;
   String aString1354;
   String aString1351;
   String aString1355;
   String aString1356;
   String aString1360;
   String aString1361;
   boolean aBool1344;
   int anInt1345;
   int anInt1363;
   int anInt1349;
   int anInt1348;
   int anInt1342;
   boolean aBool1364;
   int anInt1350;
   int anInt1347;
   int anInt1352;

   static final boolean method565(char var0) {
      if(java.lang.Character.isISOControl(var0)) {
         return false;
      } else {
         boolean var4 = var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
         if(var4) {
            return true;
         } else {
            char[] var1 = Class83.aCharArray688;

            int var2;
            char var3;
            for(var2 = 0; var2 < var1.length; var2++) {
               var3 = var1[var2];
               if(var3 == var0) {
                  return true;
               }
            }

            var1 = Class83.aCharArray687;

            for(var2 = 0; var2 < var1.length; var2++) {
               var3 = var1[var2];
               if(var3 == var0) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public void method566(ByteBuf var1) {
      var1.putByte(6);
      var1.putByte(this.anInt1343);
      var1.putByte(this.aBool1344 ? 1 : 0);
      var1.putByte(this.anInt1345);
      var1.putByte(this.anInt1363);
      var1.putByte(this.anInt1349);
      var1.putByte(this.anInt1348);
      var1.putByte(this.anInt1342);
      var1.putByte(this.aBool1364 ? 1 : 0);
      var1.putShort(this.anInt1350);
      var1.putByte(this.anInt1347);
      var1.putMedium(this.anInt1352);
      var1.putShort(this.anInt1353 * -620298247);
      var1.putJagString(this.aString1354);
      var1.putJagString(this.aString1351);
      var1.putJagString(this.aString1355);
      var1.putJagString(this.aString1356);
      var1.putByte(this.anInt1358 * 1311683181);
      var1.putShort(this.anInt1357 * 32408097);
      var1.putJagString(this.aString1360);
      var1.putJagString(this.aString1361);
      var1.putByte(this.anInt1341 * 153252251);
      var1.putByte(this.anInt1359 * 2060761779);

      for(int var2 = 0; var2 < this.anIntArray1362.length; var2++) {
         var1.putInt(this.anIntArray1362[var2]);
      }

      var1.putInt(this.anInt1346 * 1223494517);
   }

   public Node_Sub10(boolean var1) {
      if(var1) {
         if(DynamicObject.osNameLC.startsWith("win")) {
            this.anInt1343 = 1;
         } else if(DynamicObject.osNameLC.startsWith("mac")) {
            this.anInt1343 = 2;
         } else if(DynamicObject.osNameLC.startsWith("linux")) {
            this.anInt1343 = 3;
         } else {
            this.anInt1343 = 4;
         }

         String var2;
         try {
            var2 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var12) {
            var2 = "";
         }

         String var4;
         try {
            var4 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var11) {
            var4 = "";
         }

         String var3 = "Unknown";
         String var5 = "1.1";

         try {
            var3 = System.getProperty("java.vendor");
            var5 = System.getProperty("java.version");
         } catch (Exception var10) {
            ;
         }

         if(!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
            this.aBool1344 = false;
         } else {
            this.aBool1344 = true;
         }

         if(this.anInt1343 == 1) {
            if(var4.indexOf("4.0") != -1) {
               this.anInt1345 = 1;
            } else if(var4.indexOf("4.1") != -1) {
               this.anInt1345 = 2;
            } else if(var4.indexOf("4.9") != -1) {
               this.anInt1345 = 3;
            } else if(var4.indexOf("5.0") != -1) {
               this.anInt1345 = 4;
            } else if(var4.indexOf("5.1") != -1) {
               this.anInt1345 = 5;
            } else if(var4.indexOf("5.2") != -1) {
               this.anInt1345 = 8;
            } else if(var4.indexOf("6.0") != -1) {
               this.anInt1345 = 6;
            } else if(var4.indexOf("6.1") != -1) {
               this.anInt1345 = 7;
            } else if(var4.indexOf("6.2") != -1) {
               this.anInt1345 = 9;
            } else if(var4.indexOf("6.3") != -1) {
               this.anInt1345 = 10;
            }
         } else if(this.anInt1343 == 2) {
            if(var4.indexOf("10.4") != -1) {
               this.anInt1345 = 20;
            } else if(var4.indexOf("10.5") != -1) {
               this.anInt1345 = 21;
            } else if(var4.indexOf("10.6") != -1) {
               this.anInt1345 = 22;
            } else if(var4.indexOf("10.7") != -1) {
               this.anInt1345 = 23;
            } else if(var4.indexOf("10.8") != -1) {
               this.anInt1345 = 24;
            } else if(var4.indexOf("10.9") != -1) {
               this.anInt1345 = 25;
            } else if(var4.indexOf("10.10") != -1) {
               this.anInt1345 = 26;
            }
         }

         if(var3.toLowerCase().indexOf("sun") != -1) {
            this.anInt1363 = 1;
         } else if(var3.toLowerCase().indexOf("microsoft") != -1) {
            this.anInt1363 = 2;
         } else if(var3.toLowerCase().indexOf("apple") != -1) {
            this.anInt1363 = 3;
         } else if(var3.toLowerCase().indexOf("oracle") != -1) {
            this.anInt1363 = 5;
         } else {
            this.anInt1363 = 4;
         }

         int var6 = 2;
         int var7 = 0;

         char var8;
         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var8 - 48 + var7 * 10;
               ++var6;
            }
         } catch (Exception var15) {
            ;
         }

         this.anInt1349 = var7;
         var6 = var5.indexOf(46, 2) + 1;
         var7 = 0;

         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var7 * 10 + (var8 - 48);
               ++var6;
            }
         } catch (Exception var14) {
            ;
         }

         this.anInt1348 = var7;
         var6 = var5.indexOf(95, 4) + 1;
         var7 = 0;

         try {
            while(var6 < var5.length()) {
               var8 = var5.charAt(var6);
               if(var8 < 48 || var8 > 57) {
                  break;
               }

               var7 = var7 * 10 + (var8 - 48);
               ++var6;
            }
         } catch (Exception var13) {
            ;
         }

         this.anInt1342 = var7;
         this.aBool1364 = false;
         this.anInt1350 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         if(this.anInt1349 > 3) {
            this.anInt1347 = Runtime.getRuntime().availableProcessors();
         } else {
            this.anInt1347 = 0;
         }

         this.anInt1352 = 0;
      }

      if(this.aString1354 == null) {
         this.aString1354 = "";
      }

      if(this.aString1351 == null) {
         this.aString1351 = "";
      }

      if(this.aString1355 == null) {
         this.aString1355 = "";
      }

      if(this.aString1356 == null) {
         this.aString1356 = "";
      }

      if(this.aString1360 == null) {
         this.aString1360 = "";
      }

      if(this.aString1361 == null) {
         this.aString1361 = "";
      }

      this.method568();
   }

   public int method567() {
      byte var1 = 38;
      String var16 = this.aString1354;
      int var7 = var16.length() + 2;
      int var20 = var1 + var7;
      String var11 = this.aString1351;
      int var3 = var11.length() + 2;
      var20 += var3;
      String var14 = this.aString1355;
      int var12 = var14.length() + 2;
      var20 += var12;
      String var8 = this.aString1356;
      int var9 = var8.length() + 2;
      var20 += var9;
      String var4 = this.aString1360;
      int var18 = var4.length() + 2;
      var20 += var18;
      String var5 = this.aString1361;
      int var10 = var5.length() + 2;
      var20 += var10;
      return var20;
   }

   void method568() {
      if(this.aString1354.length() > 40) {
         this.aString1354 = this.aString1354.substring(0, 40);
      }

      if(this.aString1351.length() > 40) {
         this.aString1351 = this.aString1351.substring(0, 40);
      }

      if(this.aString1355.length() > 10) {
         this.aString1355 = this.aString1355.substring(0, 10);
      }

      if(this.aString1356.length() > 10) {
         this.aString1356 = this.aString1356.substring(0, 10);
      }

   }

   public static boolean method569(int var0, int var1) {
      return (var0 >> var1 + 1 & 0x1) != 0;
   }

}
