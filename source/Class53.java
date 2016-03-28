import java.util.Calendar;
import java.util.TimeZone;

public class Class53 {

   static String[] aStringArray537 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   static String[][] aStringArrayArray538 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00c3\u00a4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
   static Calendar aCalendar536;

   Class53() throws Throwable {
      throw new Error();
   }

   static final void method272(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      RSGraphics.setDrawRegion(var2, var3, var4, var5);
      TexturedGraphic.method909();

      for(int var14 = 0; var14 < var0.length; var14++) {
         Widget var15 = var0[var14];
         if(var15 != null && (var15.parentId == var1 || var1 == -1412584499 && Client.aWidget2141 == var15)) {
            int var18;
            if(var8 == -1) {
               Client.anIntArray2173[Client.anInt2168] = var15.relativeX + var6;
               Client.anIntArray2174[Client.anInt2168] = var15.relativeY + var7;
               Client.anIntArray2175[Client.anInt2168] = var15.width;
               Client.anIntArray2176[Client.anInt2168] = var15.height * 1227800423;
               var18 = ++Client.anInt2168 - 1;
            } else {
               var18 = var8;
            }

            var15.boundsIndex = var18;
            var15.loopCycle = Client.engineCycle;
            if(!var15.interactable || !IsaacRandom.method68(var15)) {
               if(var15.contentType > 0) {
                  TileDecorationStub.method463(var15);
               }

               int var10 = var15.relativeX + var6;
               int var11 = var15.relativeY + var7;
               int var19 = var15.alpha;
               int var22;
               int var23;
               if(Client.aWidget2141 == var15) {
                  if(var1 != -1412584499 && !var15.aBool1179) {
                     Class6.aWidgetArray146 = var0;
                     BoundaryStub.anInt276 = var6;
                     Class75.anInt637 = var7;
                     continue;
                  }

                  if(Client.aBool2150 && Client.aBool2145) {
                     var22 = Class74.anInt621;
                     var23 = Class74.anInt622;
                     var22 -= Client.anInt2127;
                     var23 -= Client.anInt2143;
                     if(var22 < Client.anInt2146) {
                        var22 = Client.anInt2146;
                     }

                     if(var15.width + var22 > Client.aWidget2142.width + Client.anInt2146) {
                        var22 = Client.anInt2146 + Client.aWidget2142.width - var15.width;
                     }

                     if(var23 < Client.anInt2147) {
                        var23 = Client.anInt2147;
                     }

                     if(var15.height * 1227800423 + var23 > Client.aWidget2142.height * 1227800423 + Client.anInt2147) {
                        var23 = Client.anInt2147 + Client.aWidget2142.height * 1227800423 - var15.height * 1227800423;
                     }

                     var10 = var22;
                     var11 = var23;
                  }

                  if(!var15.aBool1179) {
                     var19 = 128;
                  }
               }

               int var9;
               int var13;
               int var16;
               int var28;
               int var29;
               int var31;
               if(var15.type == 2) {
                  var22 = var2;
                  var23 = var3;
                  var28 = var4;
                  var29 = var5;
               } else if(var15.type == 9) {
                  var9 = var10;
                  var16 = var11;
                  var13 = var15.width + var10;
                  var31 = var15.height * 1227800423 + var11;
                  if(var13 < var10) {
                     var9 = var13;
                     var13 = var10;
                  }

                  if(var31 < var11) {
                     var16 = var31;
                     var31 = var11;
                  }

                  ++var13;
                  ++var31;
                  var22 = var9 > var2 ? var9 : var2;
                  var23 = var16 > var3 ? var16 : var3;
                  var28 = var13 < var4 ? var13 : var4;
                  var29 = var31 < var5 ? var31 : var5;
               } else {
                  var9 = var15.width + var10;
                  var16 = var15.height * 1227800423 + var11;
                  var22 = var10 > var2 ? var10 : var2;
                  var23 = var11 > var3 ? var11 : var3;
                  var28 = var9 < var4 ? var9 : var4;
                  var29 = var16 < var5 ? var16 : var5;
               }

               if(!var15.interactable || var22 < var28 && var23 < var29) {
                  int var24;
                  int var25;
                  int var26;
                  int var27;
                  int var30;
                  int var34;
                  int var35;
                  int var36;
                  int var37;
                  int var38;
                  int var39;
                  int var40;
                  boolean var67;
                  if(var15.contentType != 0) {
                     if(var15.contentType == 1336) {
                        if(Client.displayFps) {
                           var11 += 15;
                           Client.p12_full.method972("Fps:" + Client.anInt1976, var15.width + var10, var11, 16776960, -1);
                           var11 += 15;
                           Runtime var60 = Runtime.getRuntime();
                           var16 = (int)((var60.totalMemory() - var60.freeMemory()) / 1024L);
                           var13 = 16776960;
                           if(var16 > '\u8000' && Client.lowMemory) {
                              var13 = 16711680;
                           }

                           if(var16 > 65536 && !Client.lowMemory) {
                              var13 = 16711680;
                           }

                           Client.p12_full.method972("Mem:" + var16 + "k", var15.width + var10, var11, var13, -1);
                           var11 += 15;
                        }
                        continue;
                     }

                     if(var15.contentType == 1337) {
                        Client.anInt2122 = var10;
                        Client.anInt2123 = var11;
                        var13 = var15.width;
                        var31 = var15.height * 1227800423;
                        ++Client.anInt2208;
                        EntityMarker.method140(Class1.aClass1_3);
                        boolean var56 = false;
                        if(Client.anInt2111 >= 0) {
                           var30 = GPI.localPlayerCount;
                           int[] var511 = GPI.localPlayerIndices;

                           for(var24 = 0; var24 < var30; var24++) {
                              if(Client.anInt2111 == var511[var24]) {
                                 var56 = true;
                                 break;
                              }
                           }
                        }

                        if(var56) {
                           EntityMarker.method140(Class1.aClass1_1);
                        }

                        GZipDecompressor.method249(true);
                        EntityMarker.method140(var56 ? Class1.aClass1_6 : Class1.aClass1_2);
                        GZipDecompressor.method249(false);
                        VarClientHub.method184();
                        ClientSettings.method162();
                        Class13.method118(var10, var11, var13, var31, true);
                        var9 = Client.anInt2223;
                        var16 = Client.anInt2224;
                        var13 = Client.screenHeight;
                        var31 = Client.screenWidth;
                        RSGraphics.setDrawRegion(var9, var16, var9 + var13, var31 + var16);
                        TexturedGraphic.method909();
                        int var52;
                        if(!Client.aBool2046) {
                           var30 = Client.anInt2051;
                           if(Client.anInt2119 / 256 > var30) {
                              var30 = Client.anInt2119 / 256;
                           }

                           if(Client.aBoolArray2033[4] && Client.anIntArray2213[4] + 128 > var30) {
                              var30 = Client.anIntArray2213[4] + 128;
                           }

                           var38 = Client.anInt2060 + Client.minimapRotation & 0x7ff;
                           var24 = GPI.anInt461;
                           var40 = NpcType.method802(Class68.myPlayer.strictX, Class68.myPlayer.strictY, InterfaceNode.floorLevel * -1331355705) - Client.anInt2185;
                           var25 = SequenceType.anInt1476;
                           var26 = var30 * 3 + 600;
                           var27 = 2048 - var30 & 0x7ff;
                           var37 = 2048 - var38 & 0x7ff;
                           var39 = 0;
                           var34 = 0;
                           var36 = var26;
                           int var68;
                           if(var27 != 0) {
                              var35 = TexturedGraphic.SIN_TABLE[var27];
                              var68 = TexturedGraphic.COS_TABLE[var27];
                              var52 = var68 * var34 - var35 * var26 >> 16;
                              var36 = var68 * var26 + var35 * var34 >> 16;
                              var34 = var52;
                           }

                           if(var37 != 0) {
                              var35 = TexturedGraphic.SIN_TABLE[var37];
                              var68 = TexturedGraphic.COS_TABLE[var37];
                              var52 = var68 * var39 + var35 * var36 >> 16;
                              var36 = var68 * var36 - var39 * var35 >> 16;
                              var39 = var52;
                           }

                           Projectile.cameraX = var24 - var39;
                           FriendedPlayer.cameraZ = var40 - var34;
                           Class72.cameraY = var25 - var36;
                           Class67.cameraPitch = var30;
                           Class65.cameraYaw = var38;
                        }

                        if(!Client.aBool2046) {
                           var30 = Class56.method287();
                        } else {
                           var30 = Class48_Sub1.method544();
                        }

                        var38 = Projectile.cameraX;
                        var24 = FriendedPlayer.cameraZ;
                        var40 = Class72.cameraY;
                        var25 = Class67.cameraPitch;
                        var26 = Class65.cameraYaw;

                        for(var27 = 0; var27 < 5; var27++) {
                           if(Client.aBoolArray2033[var27]) {
                              var37 = (int)(Math.random() * (double)(Client.anIntArray2212[var27] * 2 + 1) - (double)Client.anIntArray2212[var27] + Math.sin((double)Client.anIntArray2215[var27] * ((double)Client.anIntArray2216[var27] / 100.0D)) * (double)Client.anIntArray2213[var27]);
                              if(var27 == 0) {
                                 Projectile.cameraX += var37;
                              }

                              if(var27 == 1) {
                                 FriendedPlayer.cameraZ += var37;
                              }

                              if(var27 == 2) {
                                 Class72.cameraY += var37;
                              }

                              if(var27 == 3) {
                                 Class65.cameraYaw = Class65.cameraYaw + var37 & 0x7ff;
                              }

                              if(var27 == 4) {
                                 Class67.cameraPitch += var37;
                                 if(Class67.cameraPitch < 128) {
                                    Class67.cameraPitch = 128;
                                 }

                                 if(Class67.cameraPitch > 383) {
                                    Class67.cameraPitch = 383;
                                 }
                              }
                           }
                        }

                        var27 = Class74.anInt621;
                        var37 = Class74.anInt622;
                        if(Class74.anInt627 != 0) {
                           var27 = Class74.anInt628;
                           var37 = Class74.anInt629;
                        }

                        if(var27 >= var9 && var27 < var9 + var13 && var37 >= var16 && var37 < var31 + var16) {
                           Model.aBool1904 = true;
                           Model.onCursorCount = 0;
                           Model.anInt1905 = var27 - var9;
                           Model.anInt1910 = var37 - var16;
                        } else {
                           Model.aBool1904 = false;
                           Model.onCursorCount = 0;
                        }

                        Class34.method201();
                        RSGraphics.method793(var9, var16, var13, var31, 0);
                        Class34.method201();
                        var39 = TexturedGraphic.anInt1784;
                        TexturedGraphic.anInt1784 = Client.screenZoom * -478819715;
                        InterfaceNode.landscape.method39(Projectile.cameraX, FriendedPlayer.cameraZ, Class72.cameraY, Class67.cameraPitch, Class65.cameraYaw, var30);
                        TexturedGraphic.anInt1784 = var39;
                        Class34.method201();
                        InterfaceNode.landscape.method50();
                        Client.anInt2082 = 0;
                        var67 = false;
                        var36 = -1;
                        var35 = GPI.localPlayerCount;
                        int[] var64 = GPI.localPlayerIndices;

                        for(var52 = 0; var52 < Client.anInt2225 + var35; var52++) {
                           Object var70;
                           if(var52 < var35) {
                              var70 = Client.playerArray[var64[var52]];
                              if(Client.anInt2111 == var64[var52]) {
                                 var67 = true;
                                 var36 = var52;
                                 continue;
                              }
                           } else {
                              var70 = Client.npcArray[Client.npcIndices[var52 - var35]];
                           }

                           Class39.method215((Character)var70, var52, var9, var16, var13, var31);
                        }

                        if(var67) {
                           Class39.method215(Client.playerArray[Client.anInt2111], var36, var9, var16, var13, var31);
                        }

                        for(var52 = 0; var52 < Client.anInt2082; var52++) {
                           int var72 = Client.anIntArray2084[var52];
                           int var66 = Client.anIntArray2085[var52];
                           int var45 = Client.anIntArray2087[var52];
                           int var21 = Client.anIntArray2086[var52];
                           boolean var46 = true;

                           while(var46) {
                              var46 = false;

                              for(int var71 = 0; var71 < var52; var71++) {
                                 if(var66 + 2 > Client.anIntArray2085[var71] - Client.anIntArray2086[var71] && var66 - var21 < Client.anIntArray2085[var71] + 2 && var72 - var45 < Client.anIntArray2084[var71] + Client.anIntArray2087[var71] && var72 + var45 > Client.anIntArray2084[var71] - Client.anIntArray2087[var71] && Client.anIntArray2085[var71] - Client.anIntArray2086[var71] < var66) {
                                    var66 = Client.anIntArray2085[var71] - Client.anIntArray2086[var71];
                                    var46 = true;
                                 }
                              }
                           }

                           Client.anInt2093 = Client.anIntArray2084[var52];
                           Client.anInt2094 = Client.anIntArray2085[var52] = var66;
                           String var711 = Client.aStringArray2090[var52];
                           if(Client.anInt2133 == 0) {
                              int var12 = 16776960;
                              if(Client.anIntArray2088[var52] < 6) {
                                 var12 = Client.anIntArray2023[Client.anIntArray2088[var52]];
                              }

                              if(Client.anIntArray2088[var52] == 6) {
                                 var12 = Client.anInt2208 % 20 < 10 ? 16711680 : 16776960;
                              }

                              if(Client.anIntArray2088[var52] == 7) {
                                 var12 = Client.anInt2208 % 20 < 10 ? 255 : '\uffff';
                              }

                              if(Client.anIntArray2088[var52] == 8) {
                                 var12 = Client.anInt2208 % 20 < 10 ? '\ub000' : 8454016;
                              }

                              int var32;
                              if(Client.anIntArray2088[var52] == 9) {
                                 var32 = 150 - Client.anIntArray2132[var52];
                                 if(var32 < 50) {
                                    var12 = var32 * 1280 + 16711680;
                                 } else if(var32 < 100) {
                                    var12 = 16776960 - (var32 - 50) * 327680;
                                 } else if(var32 < 150) {
                                    var12 = (var32 - 100) * 5 + '\uff00';
                                 }
                              }

                              if(Client.anIntArray2088[var52] == 10) {
                                 var32 = 150 - Client.anIntArray2132[var52];
                                 if(var32 < 50) {
                                    var12 = var32 * 5 + 16711680;
                                 } else if(var32 < 100) {
                                    var12 = 16711935 - (var32 - 50) * 327680;
                                 } else if(var32 < 150) {
                                    var12 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
                                 }
                              }

                              if(Client.anIntArray2088[var52] == 11) {
                                 var32 = 150 - Client.anIntArray2132[var52];
                                 if(var32 < 50) {
                                    var12 = 16777215 - var32 * 327685;
                                 } else if(var32 < 100) {
                                    var12 = (var32 - 50) * 327685 + '\uff00';
                                 } else if(var32 < 150) {
                                    var12 = 16777215 - (var32 - 100) * 327680;
                                 }
                              }

                              if(Client.anIntArray2089[var52] == 0) {
                                 Class35.b12_full.method982(var711, Client.anInt2093 + var9, Client.anInt2094 + var16, var12, 0);
                              }

                              if(Client.anIntArray2089[var52] == 1) {
                                 Class35.b12_full.method964(var711, Client.anInt2093 + var9, Client.anInt2094 + var16, var12, 0, Client.anInt2208);
                              }

                              if(Client.anIntArray2089[var52] == 2) {
                                 Class35.b12_full.method973(var711, Client.anInt2093 + var9, Client.anInt2094 + var16, var12, 0, Client.anInt2208);
                              }

                              if(Client.anIntArray2089[var52] == 3) {
                                 Class35.b12_full.method974(var711, Client.anInt2093 + var9, Client.anInt2094 + var16, var12, 0, Client.anInt2208, 150 - Client.anIntArray2132[var52]);
                              }

                              if(Client.anIntArray2089[var52] == 4) {
                                 var32 = (150 - Client.anIntArray2132[var52]) * (Class35.b12_full.method967(var711) + 100) / 150;
                                 RSGraphics.setInnerDrawRegion(Client.anInt2093 + var9 - 50, var16, Client.anInt2093 + var9 + 50, var16 + var31);
                                 Class35.b12_full.method980(var711, Client.anInt2093 + var9 + 50 - var32, Client.anInt2094 + var16, var12, 0);
                                 RSGraphics.setDrawRegion(var9, var16, var9 + var13, var16 + var31);
                              }

                              if(Client.anIntArray2089[var52] == 5) {
                                 var32 = 150 - Client.anIntArray2132[var52];
                                 int var42 = 0;
                                 if(var32 < 25) {
                                    var42 = var32 - 25;
                                 } else if(var32 > 125) {
                                    var42 = var32 - 125;
                                 }

                                 RSGraphics.setInnerDrawRegion(var9, Client.anInt2094 + var16 - Class35.b12_full.anInt1824 - 1, var13 + var9, var16 + 5 + Client.anInt2094);
                                 Class35.b12_full.method982(var711, Client.anInt2093 + var9, Client.anInt2094 + var16 + var42, var12, 0);
                                 RSGraphics.setDrawRegion(var9, var16, var13 + var9, var31 + var16);
                              }
                           } else {
                              Class35.b12_full.method982(var711, Client.anInt2093 + var9, Client.anInt2094 + var16, 16776960, 0);
                           }
                        }

                        if(Client.anInt2075 == 2) {
                           Class2.method62(Client.anInt2116 + (Client.hintArrowX - Node_Sub10.chunkLeftX << 7), (Client.hintArrowY - VarClientHub.chunkLeftY << 7) + Client.anInt2025, Client.anInt2032 * 1818880718);
                           if(Client.anInt2093 > -1 && Client.engineCycle % 20 < 10) {
                              Class39.aSpriteArray442[0].method946(Client.anInt2093 + var9 - 12, Client.anInt2094 + var16 - 28);
                           }
                        }

                        ((TextureLoader)TexturedGraphic.textureLoader).method186(Client.anInt2066);
                        Class5.method71(var9, var16, var13, var31);
                        Projectile.cameraX = var38;
                        FriendedPlayer.cameraZ = var24;
                        Class72.cameraY = var40;
                        Class67.cameraPitch = var25;
                        Class65.cameraYaw = var26;
                        if(Client.aBool2214) {
                           byte var73 = 0;
                           var36 = Class81.anInt679 + var73 + Class81.anInt670;
                           if(var36 == 0) {
                              Client.aBool2214 = false;
                           }
                        }

                        if(Client.aBool2214) {
                           RSGraphics.method793(var9, var16, var13, var31, 0);
                           Class82.method363("Loading - please wait.", false);
                        }

                        Client.aBoolArray2118[var15.boundsIndex] = true;
                        RSGraphics.setDrawRegion(var2, var3, var4, var5);
                        continue;
                     }

                     if(var15.contentType == 1338) {
                        Node_Sub8.method547(var15, var10, var11, var18);
                        RSGraphics.setDrawRegion(var2, var3, var4, var5);
                        continue;
                     }

                     if(var15.contentType == 1339) {
                        DualNode_Sub14 var541 = var15.method491(false);
                        if(var541 != null) {
                           if(Client.anInt2200 < 3) {
                              Class48_Sub1.aSprite1296.method957(var10, var11, var541.anInt1647, var541.anInt1648, 25, 25, Client.minimapRotation, 256, var541.anIntArray1646, var541.anIntArray1645);
                           } else {
                              RSGraphics.method792(var10, var11, 0, var541.anIntArray1646, var541.anIntArray1645);
                           }
                        }

                        RSGraphics.setDrawRegion(var2, var3, var4, var5);
                        continue;
                     }
                  }

                  if(var15.type == 0) {
                     if(!var15.interactable && IsaacRandom.method68(var15) && ObjectType.aWidget1719 != var15) {
                        continue;
                     }

                     if(!var15.interactable) {
                        if(var15.insetY > var15.viewportHeight - var15.height * 1227800423) {
                           var15.insetY = var15.viewportHeight - var15.height * 1227800423;
                        }

                        if(var15.insetY < 0) {
                           var15.insetY = 0;
                        }
                     }

                     method272(var0, var15.hash, var22, var23, var28, var29, var10 - var15.insetX, var11 - var15.insetY, var18);
                     if(var15.children != null) {
                        method272(var15.children, var15.hash, var22, var23, var28, var29, var10 - var15.insetX, var11 - var15.insetY, var18);
                     }

                     InterfaceNode var17 = (InterfaceNode)Client.interfaceNodes.get((long)var15.hash);
                     if(var17 != null) {
                        ClientSettings.method164(var17.type, var22, var23, var28, var29, var10, var11, var18);
                     }

                     RSGraphics.setDrawRegion(var2, var3, var4, var5);
                     TexturedGraphic.method909();
                  }

                  if(Client.resizable || Client.aBoolArray2137[var18] || Client.anInt2177 > 1) {
                     int var481;
                     if(var15.type == 0 && !var15.interactable && var15.viewportHeight > var15.height * 1227800423) {
                        var9 = var15.width + var10;
                        var16 = var15.insetY;
                        var13 = var15.height * 1227800423;
                        var31 = var15.viewportHeight;
                        Class35.aDualNode_Sub13_Sub2Array395[0].method929(var9, var11);
                        Class35.aDualNode_Sub13_Sub2Array395[1].method929(var9, var13 + var11 - 16);
                        RSGraphics.method793(var9, var11 + 16, 16, var13 - 32, Client.anInt2067);
                        var481 = (var13 - 32) * var13 / var31;
                        if(var481 < 8) {
                           var481 = 8;
                        }

                        var30 = (var13 - 32 - var481) * var16 / (var31 - var13);
                        RSGraphics.method793(var9, var30 + 16 + var11, 16, var481, Client.anInt2068);
                        RSGraphics.method784(var9, var30 + var11 + 16, var481, Client.anInt2070);
                        RSGraphics.method784(var9 + 1, var11 + 16 + var30, var481, Client.anInt2070);
                        RSGraphics.method796(var9, var30 + 16 + var11, 16, Client.anInt2070);
                        RSGraphics.method796(var9, var11 + 17 + var30, 16, Client.anInt2070);
                        RSGraphics.method784(var9 + 15, var11 + 16 + var30, var481, Client.anInt2069);
                        RSGraphics.method784(var9 + 14, var30 + 17 + var11, var481 - 1, Client.anInt2069);
                        RSGraphics.method796(var9, var481 + var30 + var11 + 15, 16, Client.anInt2069);
                        RSGraphics.method796(var9 + 1, var11 + 14 + var30 + var481, 15, Client.anInt2069);
                     }

                     if(var15.type != 1) {
                        if(var15.type == 2) {
                           var9 = 0;

                           for(var16 = 0; var16 < var15.anInt1136 * 507570867; var16++) {
                              for(var13 = 0; var13 < var15.anInt1135 * 124195285; var13++) {
                                 var31 = (var15.columnPadding + 32) * var13 + var10;
                                 var481 = (var15.rowPadding + 32) * var16 + var11;
                                 if(var9 < 20) {
                                    var31 += var15.xSprites[var9];
                                    var481 += var15.anIntArray1163[var9];
                                 }

                                 if(var15.itemIds[var9] <= 0) {
                                    if(var15.anIntArray1164 != null && var9 < 20) {
                                       Picture var50 = var15.method488(var9);
                                       if(var50 != null) {
                                          var50.method946(var31, var481);
                                       } else if(Widget.aBool1128) {
                                          Class68.method326(var15);
                                       }
                                    }
                                 } else {
                                    boolean var49 = false;
                                    var67 = false;
                                    var24 = var15.itemIds[var9] - 1;
                                    if(var31 + 32 > var2 && var31 < var4 && var481 + 32 > var3 && var481 < var5 || SpotAnimType.aWidget1446 == var15 && Client.anInt2100 == var9) {
                                       Picture var621;
                                       if(Client.itemSelectionStatus == 1 && Class40.selectedItemIndex == var9 && var15.hash == Class22.anInt286) {
                                          var621 = Entity.getItemSprite(var24, var15.itemQuantities[var9], 2, 0, 2, false);
                                       } else {
                                          var621 = Entity.getItemSprite(var24, var15.itemQuantities[var9], 1, 3153952, 2, false);
                                       }

                                       if(var621 != null) {
                                          if(SpotAnimType.aWidget1446 == var15 && Client.anInt2100 == var9) {
                                             var30 = Class74.anInt621 - Client.anInt2131;
                                             var38 = Class74.anInt622 - Client.anInt2101;
                                             if(var30 < 5 && var30 > -5) {
                                                var30 = 0;
                                             }

                                             if(var38 < 5 && var38 > -5) {
                                                var38 = 0;
                                             }

                                             if(Client.anInt2092 < 5) {
                                                var30 = 0;
                                                var38 = 0;
                                             }

                                             var621.method951(var31 + var30, var481 + var38, 128);
                                             if(var1 != -1) {
                                                Widget var69 = var0[var1 & 0xffff];
                                                if(var38 + var481 < RSGraphics.draw_region_y && var69.insetY > 0) {
                                                   var26 = Client.anInt2066 * (RSGraphics.draw_region_y - var481 - var38) / 3;
                                                   if(var26 > Client.anInt2066 * 10) {
                                                      var26 = Client.anInt2066 * 10;
                                                   }

                                                   if(var26 > var69.insetY) {
                                                      var26 = var69.insetY;
                                                   }

                                                   var69.insetY -= var26;
                                                   Client.anInt2101 += var26;
                                                   Class68.method326(var69);
                                                }

                                                if(var38 + var481 + 32 > RSGraphics.draw_region_max_y && var69.insetY < var69.viewportHeight - var69.height * 1227800423) {
                                                   var26 = Client.anInt2066 * (var38 + 32 + var481 - RSGraphics.draw_region_max_y) / 3;
                                                   if(var26 > Client.anInt2066 * 10) {
                                                      var26 = Client.anInt2066 * 10;
                                                   }

                                                   if(var26 > var69.viewportHeight - var69.height * 1227800423 - var69.insetY) {
                                                      var26 = var69.viewportHeight - var69.height * 1227800423 - var69.insetY;
                                                   }

                                                   var69.insetY += var26;
                                                   Client.anInt2101 -= var26;
                                                   Class68.method326(var69);
                                                }
                                             }
                                          } else if(Class30.aWidget339 == var15 && Client.anInt2099 == var9) {
                                             var621.method951(var31, var481, 128);
                                          } else {
                                             var621.method946(var31, var481);
                                          }
                                       } else {
                                          Class68.method326(var15);
                                       }
                                    }
                                 }

                                 ++var9;
                              }
                           }
                        } else if(var15.type == 3) {
                           if(RuntimeException_Sub1.method932(var15)) {
                              var9 = var15.anInt1139;
                              if(ObjectType.aWidget1719 == var15 && var15.anInt1141 != 0) {
                                 var9 = var15.anInt1141;
                              }
                           } else {
                              var9 = var15.textColor;
                              if(ObjectType.aWidget1719 == var15 && var15.anInt1140 != 0) {
                                 var9 = var15.anInt1140;
                              }
                           }

                           if(var19 == 0) {
                              if(var15.aBool1161) {
                                 RSGraphics.method793(var10, var11, var15.width, var15.height * 1227800423, var9);
                              } else {
                                 RSGraphics.drawRectangle(var10, var11, var15.width, var15.height * 1227800423, var9);
                              }
                           } else if(var15.aBool1161) {
                              RSGraphics.fillRectangle(var10, var11, var15.width, var15.height * 1227800423, var9, 256 - (var19 & 0xff));
                           } else {
                              RSGraphics.method794(var10, var11, var15.width, var15.height * 1227800423, var9, 256 - (var19 & 0xff));
                           }
                        } else {
                           DualNode_Sub13_Sub3_Sub1 var48;
                           if(var15.type == 4) {
                              var48 = var15.method490();
                              if(var48 == null) {
                                 if(Widget.aBool1128) {
                                    Class68.method326(var15);
                                 }
                              } else {
                                 String var55 = var15.text;
                                 if(RuntimeException_Sub1.method932(var15)) {
                                    var16 = var15.anInt1139;
                                    if(ObjectType.aWidget1719 == var15 && var15.anInt1141 != 0) {
                                       var16 = var15.anInt1141;
                                    }

                                    if(var15.aString1157.length() > 0) {
                                       var55 = var15.aString1157;
                                    }
                                 } else {
                                    var16 = var15.textColor;
                                    if(ObjectType.aWidget1719 == var15 && var15.anInt1140 != 0) {
                                       var16 = var15.anInt1140;
                                    }
                                 }

                                 if(var15.interactable && var15.itemId != -1) {
                                    ItemType var59 = FriendedPlayer.getItemType(var15.itemId);
                                    var55 = var59.name;
                                    if(var55 == null) {
                                       var55 = "null";
                                    }

                                    if((var59.stackable == 1 || var15.itemQuantity != 1) && var15.itemQuantity != -1) {
                                       var55 = Class48_Sub1.method545(16748608) + var55 + Class35.aString393 + " " + 'x' + EnumType.method690(var15.itemQuantity);
                                    }
                                 }

                                 if(Client.aWidget2135 == var15) {
                                    GameStrings var61 = (GameStrings)null;
                                    var55 = "Please wait...";
                                    var16 = var15.textColor;
                                 }

                                 if(!var15.interactable) {
                                    var55 = Node_Sub8.method551(var55, var15);
                                 }

                                 var48.method990(var55, var10, var11, var15.width, var15.height * 1227800423, var16, var15.textShadowed ? 0 : -1, var15.anInt1159, var15.anInt1138, var15.anInt1158);
                              }
                           } else if(var15.type == 5) {
                              Picture var531;
                              if(!var15.interactable) {
                                 var531 = var15.method489(RuntimeException_Sub1.method932(var15));
                                 if(var531 != null) {
                                    var531.method946(var10, var11);
                                 } else if(Widget.aBool1128) {
                                    Class68.method326(var15);
                                 }
                              } else {
                                 if(var15.itemId != -1) {
                                    var531 = Entity.getItemSprite(var15.itemId, var15.itemQuantity, var15.borderThickness, var15.shadowColor, var15.anInt1155, false);
                                 } else {
                                    var531 = var15.method489(false);
                                 }

                                 if(var531 == null) {
                                    if(Widget.aBool1128) {
                                       Class68.method326(var15);
                                    }
                                 } else {
                                    var16 = var531.width;
                                    var13 = var531.height;
                                    if(!var15.aBool1144) {
                                       var31 = var15.width * 4096 / var16;
                                       if(var15.spriteId != 0) {
                                          var531.method945(var15.width / 2 + var10, var15.height * 1227800423 / 2 + var11, var15.spriteId, var31);
                                       } else if(var19 != 0) {
                                          var531.method953(var10, var11, var15.width, var15.height * 1227800423, 256 - (var19 & 0xff));
                                       } else if(var15.width == var16 && var15.height * 1227800423 == var13) {
                                          var531.method946(var10, var11);
                                       } else {
                                          var531.method944(var10, var11, var15.width, var15.height * 1227800423);
                                       }
                                    } else {
                                       RSGraphics.setInnerDrawRegion(var10, var11, var15.width + var10, var15.height * 1227800423 + var11);
                                       var31 = (var15.width + (var16 - 1)) / var16;
                                       var481 = (var15.height * 1227800423 + (var13 - 1)) / var13;

                                       for(var30 = 0; var30 < var31; var30++) {
                                          for(var38 = 0; var38 < var481; var38++) {
                                             if(var15.spriteId != 0) {
                                                var531.method945(var16 * var30 + var10 + var16 / 2, var13 * var38 + var11 + var13 / 2, var15.spriteId, 4096);
                                             } else if(var19 != 0) {
                                                var531.method951(var16 * var30 + var10, var13 * var38 + var11, 256 - (var19 & 0xff));
                                             } else {
                                                var531.method946(var16 * var30 + var10, var38 * var13 + var11);
                                             }
                                          }
                                       }

                                       RSGraphics.setDrawRegion(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              ItemType var53;
                              if(var15.type == 6) {
                                 boolean var58 = RuntimeException_Sub1.method932(var15);
                                 if(var58) {
                                    var16 = var15.anInt1150;
                                 } else {
                                    var16 = var15.anInt1162;
                                 }

                                 Model var63 = null;
                                 var31 = 0;
                                 if(var15.itemId != -1) {
                                    var53 = FriendedPlayer.getItemType(var15.itemId);
                                    if(var53 != null) {
                                       var53 = var53.method812(var15.itemQuantity);
                                       var63 = var53.method811(1);
                                       if(var63 != null) {
                                          var63.method998();
                                          var31 = var63.modelHeight * 1812947537 / 2;
                                       } else {
                                          Class68.method326(var15);
                                       }
                                    }
                                 } else if(var15.modelType == 5) {
                                    if(var15.modelId == 0) {
                                       var63 = Client.aPlayerConfig2138.method268((SequenceType)null, -1, (SequenceType)null, -1);
                                    } else {
                                       var63 = Class68.myPlayer.method654((byte)13);
                                    }
                                 } else if(var16 == -1) {
                                    var63 = var15.method492((SequenceType)null, -1, var58, Class68.myPlayer.config);
                                    if(var63 == null && Widget.aBool1128) {
                                       Class68.method326(var15);
                                    }
                                 } else {
                                    SequenceType var65 = Node_Sub6.getSequenceType(var16);
                                    var63 = var15.method492(var65, var15.anInt1194, var58, Class68.myPlayer.config);
                                    if(var63 == null && Widget.aBool1128) {
                                       Class68.method326(var15);
                                    }
                                 }

                                 TexturedGraphic.method911(var15.width / 2 + var10, var15.height * 1227800423 / 2 + var11);
                                 var481 = var15.modelZoom * TexturedGraphic.SIN_TABLE[var15.rotationX] >> 16;
                                 var30 = var15.modelZoom * TexturedGraphic.COS_TABLE[var15.rotationX] >> 16;
                                 if(var63 != null) {
                                    if(!var15.interactable) {
                                       var63.method1012(0, var15.rotationZ, 0, var15.rotationX, 0, var481, var30);
                                    } else {
                                       var63.method998();
                                       if(var15.aBool1154) {
                                          var63.method1014(0, var15.rotationZ, var15.rotationY, var15.rotationX, var15.anInt1198, var481 + var31 + var15.anInt1151, var15.anInt1151 + var30, var15.modelZoom);
                                       } else {
                                          var63.method1012(0, var15.rotationZ, var15.rotationY, var15.rotationX, var15.anInt1198, var15.anInt1151 + var481 + var31, var15.anInt1151 + var30);
                                       }
                                    }
                                 }

                                 TexturedGraphic.method910();
                              } else {
                                 if(var15.type == 7) {
                                    var48 = var15.method490();
                                    if(var48 == null) {
                                       if(Widget.aBool1128) {
                                          Class68.method326(var15);
                                       }
                                       continue;
                                    }

                                    var16 = 0;

                                    for(var13 = 0; var13 < var15.anInt1136 * 507570867; var13++) {
                                       for(var31 = 0; var31 < var15.anInt1135 * 124195285; var31++) {
                                          if(var15.itemIds[var16] > 0) {
                                             var53 = FriendedPlayer.getItemType(var15.itemIds[var16] - 1);
                                             String var51;
                                             if(var53.stackable != 1 && var15.itemQuantities[var16] == 1) {
                                                var51 = Class48_Sub1.method545(16748608) + var53.name + Class35.aString393;
                                             } else {
                                                var51 = Class48_Sub1.method545(16748608) + var53.name + Class35.aString393 + " " + 'x' + EnumType.method690(var15.itemQuantities[var16]);
                                             }

                                             var38 = (var15.columnPadding + 115) * var31 + var10;
                                             var24 = (var15.rowPadding + 12) * var13 + var11;
                                             if(var15.anInt1159 == 0) {
                                                var48.method980(var51, var38, var24, var15.textColor, var15.textShadowed ? 0 : -1);
                                             } else if(var15.anInt1159 == 1) {
                                                var48.method982(var51, var15.width / 2 + var38, var24, var15.textColor, var15.textShadowed ? 0 : -1);
                                             } else {
                                                var48.method972(var51, var15.width + var38 - 1, var24, var15.textColor, var15.textShadowed ? 0 : -1);
                                             }
                                          }

                                          ++var16;
                                       }
                                    }
                                 }

                                 if(var15.type == 8 && ScriptEvent.aWidget1437 == var15 && Client.anInt2008 == Client.anInt2117) {
                                    var9 = 0;
                                    var16 = 0;
                                    DualNode_Sub13_Sub3_Sub1 var57 = Client.p12_full;
                                    String var62 = var15.text;

                                    String var54;
                                    for(var62 = Node_Sub8.method551(var62, var15); var62.length() > 0; var16 += var57.anInt1824 + 1) {
                                       var30 = var62.indexOf(Class35.aString390);
                                       if(var30 != -1) {
                                          var54 = var62.substring(0, var30);
                                          var62 = var62.substring(var30 + 4);
                                       } else {
                                          var54 = var62;
                                          var62 = "";
                                       }

                                       var38 = var57.method967(var54);
                                       if(var38 > var9) {
                                          var9 = var38;
                                       }
                                    }

                                    var9 += 6;
                                    var16 += 7;
                                    var30 = var15.width + var10 - 5 - var9;
                                    var38 = var15.height * 1227800423 + 5 + var11;
                                    if(var30 < var10 + 5) {
                                       var30 = var10 + 5;
                                    }

                                    if(var9 + var30 > var4) {
                                       var30 = var4 - var9;
                                    }

                                    if(var38 + var16 > var5) {
                                       var38 = var5 - var16;
                                    }

                                    RSGraphics.method793(var30, var38, var9, var16, 16777120);
                                    RSGraphics.drawRectangle(var30, var38, var9, var16, 0);
                                    var62 = var15.text;
                                    var24 = var57.anInt1824 + var38 + 2;

                                    for(var62 = Node_Sub8.method551(var62, var15); var62.length() > 0; var24 += var57.anInt1824 + 1) {
                                       var40 = var62.indexOf(Class35.aString390);
                                       if(var40 != -1) {
                                          var54 = var62.substring(0, var40);
                                          var62 = var62.substring(var40 + 4);
                                       } else {
                                          var54 = var62;
                                          var62 = "";
                                       }

                                       var57.method980(var54, var30 + 3, var24, 0, -1);
                                    }
                                 }

                                 if(var15.type == 9) {
                                    if(var15.anInt1137 * 562385183 == 1) {
                                       if(var15.aBool1142) {
                                          var9 = var10;
                                          var16 = var15.height * 1227800423 + var11;
                                          var13 = var15.width + var10;
                                          var31 = var11;
                                       } else {
                                          var9 = var10;
                                          var16 = var11;
                                          var13 = var15.width + var10;
                                          var31 = var15.height * 1227800423 + var11;
                                       }

                                       RSGraphics.drawLine(var9, var16, var13, var31, var15.textColor);
                                    } else {
                                       var9 = var15.width >= 0 ? var15.width : -var15.width;
                                       var16 = var15.height * 1227800423 >= 0 ? var15.height * 1227800423 : -(var15.height * 1227800423);
                                       var13 = var9;
                                       if(var9 < var16) {
                                          var13 = var16;
                                       }

                                       if(var13 != 0) {
                                          var31 = (var15.width << 16) / var13;
                                          var481 = (var15.height * 1227800423 << 16) / var13;
                                          if(var481 <= var31) {
                                             var31 = -var31;
                                          } else {
                                             var481 = -var481;
                                          }

                                          var30 = var15.anInt1137 * 562385183 * var481 >> 17;
                                          var38 = var15.anInt1137 * 562385183 * var481 + 1 >> 17;
                                          var24 = var31 * 562385183 * var15.anInt1137 >> 17;
                                          var40 = var15.anInt1137 * 562385183 * var31 + 1 >> 17;
                                          var25 = var10 + var30;
                                          var26 = var10 - var38;
                                          var27 = var15.width + var10 - var38;
                                          var37 = var30 + var10 + var15.width;
                                          var39 = var24 + var11;
                                          var34 = var11 - var40;
                                          var36 = var15.height * 1227800423 + var11 - var40;
                                          var35 = var24 + var11 + var15.height * 1227800423;
                                          TexturedGraphic.method916(var25, var26, var27);
                                          TexturedGraphic.method917(var39, var34, var36, var25, var26, var27, var15.textColor);
                                          TexturedGraphic.method916(var25, var27, var37);
                                          TexturedGraphic.method917(var39, var36, var35, var25, var27, var37, var15.textColor);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static byte[] method273(CharSequence var0) {
      int var1 = var0.length();
      byte[] var4 = new byte[var1];

      for(int var3 = 0; var3 < var1; var3++) {
         char var2 = var0.charAt(var3);
         if((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
            if(var2 == 8364) {
               var4[var3] = -128;
            } else if(var2 == 8218) {
               var4[var3] = -126;
            } else if(var2 == 402) {
               var4[var3] = -125;
            } else if(var2 == 8222) {
               var4[var3] = -124;
            } else if(var2 == 8230) {
               var4[var3] = -123;
            } else if(var2 == 8224) {
               var4[var3] = -122;
            } else if(var2 == 8225) {
               var4[var3] = -121;
            } else if(var2 == 710) {
               var4[var3] = -120;
            } else if(var2 == 8240) {
               var4[var3] = -119;
            } else if(var2 == 352) {
               var4[var3] = -118;
            } else if(var2 == 8249) {
               var4[var3] = -117;
            } else if(var2 == 338) {
               var4[var3] = -116;
            } else if(var2 == 381) {
               var4[var3] = -114;
            } else if(var2 == 8216) {
               var4[var3] = -111;
            } else if(var2 == 8217) {
               var4[var3] = -110;
            } else if(var2 == 8220) {
               var4[var3] = -109;
            } else if(var2 == 8221) {
               var4[var3] = -108;
            } else if(var2 == 8226) {
               var4[var3] = -107;
            } else if(var2 == 8211) {
               var4[var3] = -106;
            } else if(var2 == 8212) {
               var4[var3] = -105;
            } else if(var2 == 732) {
               var4[var3] = -104;
            } else if(var2 == 8482) {
               var4[var3] = -103;
            } else if(var2 == 353) {
               var4[var3] = -102;
            } else if(var2 == 8250) {
               var4[var3] = -101;
            } else if(var2 == 339) {
               var4[var3] = -100;
            } else if(var2 == 382) {
               var4[var3] = -98;
            } else if(var2 == 376) {
               var4[var3] = -97;
            } else {
               var4[var3] = 63;
            }
         } else {
            var4[var3] = (byte)var2;
         }
      }

      return var4;
   }

   public static int putJagString(CharSequence sequence, int offset, int length, byte[] bytes, int position) {
      int size = length - offset;

      for(int index = 0; index < size; index++) {
         char c = sequence.charAt(offset + index);
         if((c <= 0 || c >= 128) && (c < 160 || c > 255)) {
            if(c == 8364) {
               bytes[position + index] = -128;
            } else if(c == 8218) {
               bytes[position + index] = -126;
            } else if(c == 402) {
               bytes[position + index] = -125;
            } else if(c == 8222) {
               bytes[position + index] = -124;
            } else if(c == 8230) {
               bytes[position + index] = -123;
            } else if(c == 8224) {
               bytes[index + position] = -122;
            } else if(c == 8225) {
               bytes[position + index] = -121;
            } else if(c == 710) {
               bytes[position + index] = -120;
            } else if(c == 8240) {
               bytes[index + position] = -119;
            } else if(c == 352) {
               bytes[index + position] = -118;
            } else if(c == 8249) {
               bytes[position + index] = -117;
            } else if(c == 338) {
               bytes[index + position] = -116;
            } else if(c == 381) {
               bytes[index + position] = -114;
            } else if(c == 8216) {
               bytes[index + position] = -111;
            } else if(c == 8217) {
               bytes[index + position] = -110;
            } else if(c == 8220) {
               bytes[index + position] = -109;
            } else if(c == 8221) {
               bytes[position + index] = -108;
            } else if(c == 8226) {
               bytes[position + index] = -107;
            } else if(c == 8211) {
               bytes[position + index] = -106;
            } else if(c == 8212) {
               bytes[index + position] = -105;
            } else if(c == 732) {
               bytes[position + index] = -104;
            } else if(c == 8482) {
               bytes[index + position] = -103;
            } else if(c == 353) {
               bytes[index + position] = -102;
            } else if(c == 8250) {
               bytes[index + position] = -101;
            } else if(c == 339) {
               bytes[index + position] = -100;
            } else if(c == 382) {
               bytes[index + position] = -98;
            } else if(c == 376) {
               bytes[index + position] = -97;
            } else {
               bytes[index + position] = 63;
            }
         } else {
            bytes[position + index] = (byte)c;
         }
      }

      return size;
   }

   public static void method275(int var0) {
      if(var0 != -1 && Widget.loadedInterfaces[var0]) {
         Widget.widgetIndex.method396(var0);
         if(Widget.interfaces[var0] != null) {
            boolean var1 = true;

            for(int var2 = 0; var2 < Widget.interfaces[var0].length; var2++) {
               if(Widget.interfaces[var0][var2] != null) {
                  if(Widget.interfaces[var0][var2].type != 2) {
                     Widget.interfaces[var0][var2] = null;
                  } else {
                     var1 = false;
                  }
               }
            }

            if(var1) {
               Widget.interfaces[var0] = null;
            }

            Widget.loadedInterfaces[var0] = false;
         }
      }

   }

   static {
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      aCalendar536 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

}
