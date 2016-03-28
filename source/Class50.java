public class Class50 {

   static int anInt521 = 0;
   static int anInt517 = 0;
   static int anInt518 = 0;
   static byte[][] aByteArrayArray519 = new byte[1000][];
   static byte[][] aByteArrayArray520 = new byte[250][];
   static byte[][] aByteArrayArray522 = new byte[50][];

   public static void method251() {
      IdentKitType.identKits.method429();
   }

   static synchronized byte[] unpooled(int var0) {
      byte[] var1;
      if(var0 == 100 && anInt521 > 0) {
         var1 = aByteArrayArray519[--anInt521];
         aByteArrayArray519[anInt521] = null;
         return var1;
      } else if(var0 == 5000 && anInt517 > 0) {
         var1 = aByteArrayArray520[--anInt517];
         aByteArrayArray520[anInt517] = null;
         return var1;
      } else if(var0 == 30000 && anInt518 > 0) {
         var1 = aByteArrayArray522[--anInt518];
         aByteArrayArray522[anInt518] = null;
         return var1;
      } else {
         return new byte[var0];
      }
   }

   Class50() throws Throwable {
      throw new Error();
   }

   static int method253() {
      return 9;
   }

   static final void method254() {
      int var1;
      if(Client.anInt2226 != -1) {
         var1 = Client.anInt2226;
         if(IdentKitType.loadWidget(var1)) {
            GameType.method338(Widget.interfaces[var1], -1);
         }
      }

      for(var1 = 0; var1 < Client.anInt2168; var1++) {
         if(Client.aBoolArray2118[var1]) {
            Client.aBoolArray2171[var1] = true;
         }

         Client.aBoolArray2137[var1] = Client.aBoolArray2118[var1];
         Client.aBoolArray2118[var1] = false;
      }

      Client.anInt2192 = Client.engineCycle;
      Client.anInt2122 = -1;
      Client.anInt2123 = -1;
      TileDecorationStub.aWidget838 = null;
      if(Client.anInt2226 != -1) {
         Client.anInt2168 = 0;
         ClientSettings.method164(Client.anInt2226, 0, 0, Class34.gameWidth, Node_Sub9.gameHeight, 0, 0, -1);
      }

      RSGraphics.noClip();
      int var7;
      if(!Client.menuOpen) {
         if(Client.anInt2122 != -1) {
            var1 = Client.anInt2122;
            var7 = Client.anInt2123;
            if(Client.menuItemCount >= 2 || Client.itemSelectionStatus != 0 || Client.spellSelected) {
               String var13;
               if(Client.itemSelectionStatus == 1 && Client.menuItemCount < 2) {
                  var13 = "Use" + " " + Client.selectedItemName + " " + Class35.aString391;
               } else if(Client.spellSelected && Client.menuItemCount < 2) {
                  var13 = Client.menuActionPrefix + " " + Client.selectedSpellName + " " + Class35.aString391;
               } else {
                  var13 = Class25.method165(Client.menuItemCount - 1);
               }

               if(Client.menuItemCount > 2) {
                  var13 = var13 + Class48_Sub1.method545(16777215) + " " + '/' + " " + (Client.menuItemCount - 2) + " more options";
               }

               Class35.b12_full.method966(var13, var1 + 4, var7 + 15, 16777215, 0, Client.engineCycle / 1000);
            }
         }
      } else {
         Class36.method207();
      }

      if(Client.anInt2177 == 3) {
         for(var1 = 0; var1 < Client.anInt2168; var1++) {
            if(Client.aBoolArray2137[var1]) {
               RSGraphics.fillRectangle(Client.anIntArray2173[var1], Client.anIntArray2174[var1], Client.anIntArray2175[var1], Client.anIntArray2176[var1], 16711935, 128);
            } else if(Client.aBoolArray2171[var1]) {
               RSGraphics.fillRectangle(Client.anIntArray2173[var1], Client.anIntArray2174[var1], Client.anIntArray2175[var1], Client.anIntArray2176[var1], 16711680, 128);
            }
         }
      }

      var1 = InterfaceNode.floorLevel * -1331355705;
      var7 = Class68.myPlayer.strictX;
      int var121 = Class68.myPlayer.strictY;
      int var8 = Client.anInt2066;

      for(Node_Sub6 var2 = (Node_Sub6)Node_Sub6.aDeque1279.getFront(); var2 != null; var2 = (Node_Sub6)Node_Sub6.aDeque1279.getNext()) {
         if(var2.anInt1281 != -1 || var2.anIntArray1273 != null) {
            int var4 = 0;
            if(var7 > var2.anInt1269) {
               var4 += var7 - var2.anInt1269;
            } else if(var7 < var2.anInt1271) {
               var4 += var2.anInt1271 - var7;
            }

            if(var121 > var2.anInt1275) {
               var4 += var121 - var2.anInt1275;
            } else if(var121 < var2.anInt1272) {
               var4 += var2.anInt1272 - var121;
            }

            if(var4 - 64 <= var2.anInt1282 && Client.anInt2205 * 873913835 != 0 && var2.anInt1270 == var1) {
               var4 -= 64;
               if(var4 < 0) {
                  var4 = 0;
               }

               int var10 = (var2.anInt1282 - var4) * Client.anInt2205 * 873913835 / var2.anInt1282;
               Class14 var10000;
               if(var2.aNode_Sub4_Sub2_1276 == null) {
                  if(var2.anInt1281 >= 0) {
                     var10000 = (Class14)null;
                     Class14 var11 = Class14.method119(VarClientType.sfxIndex, var2.anInt1281, 0);
                     if(var11 != null) {
                        Node_Sub2_Sub1 var14 = var11.method122().method722(Class59.aClass16_548);
                        Node_Sub4_Sub2 var12 = Node_Sub4_Sub2.method771(var14, 100, var10);
                        var12.method740(-1);
                        FriendedPlayer.aNode_Sub4_Sub1_740.method729(var12);
                        var2.aNode_Sub4_Sub2_1276 = var12;
                     }
                  }
               } else {
                  var2.aNode_Sub4_Sub2_1276.method741(var10);
               }

               if(var2.aNode_Sub4_Sub2_1280 == null) {
                  if(var2.anIntArray1273 != null && (var2.anInt1274 -= var8) <= 0) {
                     int var131 = (int)(Math.random() * (double)var2.anIntArray1273.length);
                     var10000 = (Class14)null;
                     Class14 var141 = Class14.method119(VarClientType.sfxIndex, var2.anIntArray1273[var131], 0);
                     if(var141 != null) {
                        Node_Sub2_Sub1 var15 = var141.method122().method722(Class59.aClass16_548);
                        Node_Sub4_Sub2 var0 = Node_Sub4_Sub2.method771(var15, 100, var10);
                        var0.method740(0);
                        FriendedPlayer.aNode_Sub4_Sub1_740.method729(var0);
                        var2.aNode_Sub4_Sub2_1280 = var0;
                        var2.anInt1274 = var2.anInt1277 + (int)(Math.random() * (double)(var2.anInt1278 - var2.anInt1277));
                     }
                  }
               } else {
                  var2.aNode_Sub4_Sub2_1280.method741(var10);
                  if(!var2.aNode_Sub4_Sub2_1280.method12()) {
                     var2.aNode_Sub4_Sub2_1280 = null;
                  }
               }
            } else {
               if(var2.aNode_Sub4_Sub2_1276 != null) {
                  FriendedPlayer.aNode_Sub4_Sub1_740.method730(var2.aNode_Sub4_Sub2_1276);
                  var2.aNode_Sub4_Sub2_1276 = null;
               }

               if(var2.aNode_Sub4_Sub2_1280 != null) {
                  FriendedPlayer.aNode_Sub4_Sub1_740.method730(var2.aNode_Sub4_Sub2_1280);
                  var2.aNode_Sub4_Sub2_1280 = null;
               }
            }
         }
      }

      Client.anInt2066 = 0;
   }

}
