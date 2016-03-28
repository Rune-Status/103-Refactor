public class RuneScript extends DualNode {

   int[] opcodes;
   int intArgCount;
   String[] stringOperands;
   public static Class13 aClass13_1721;
   int stringArgCount;
   int intStackCount;
   static int anInt1722;
   int[] intOperands;
   static CacheIndex interfaceIndex;
   static int[] anIntArray1724;
   static Picture minimapSprite;
   int stringStackCount;
   static NodeMap aClass106_1725 = new NodeMap(128);

   public static void setHuffman(Huffman var0) {
      Class120.huffman = var0;
   }

   static final void prcoessSceneFrame() {
      int var0;
      int var1;
      int var2;
      int var3;
      GroundItem var29;
      if(Client.frameId == 36) {
         var0 = Client.inBuffer.getULEShort();
         var1 = Client.inBuffer.getUByteA();
         var2 = InterfaceNode.anInt1400 + (var1 >> 4 & 0x7);
         var3 = (var1 & 0x7) + Player.anInt1988;
         if(var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
            Deque var4 = Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var2][var3];
            if(var4 != null) {
               for(var29 = (GroundItem)var4.getFront(); var29 != null; var29 = (GroundItem)var4.getNext()) {
                  if((var0 & 0x7fff) == var29.anInt1842) {
                     var29.unlink();
                     break;
                  }
               }

               if(var4.getFront() == null) {
                  Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var2][var3] = null;
               }

               Class32.method195(var2, var3);
            }
         }
      } else {
         int var5;
         int var6;
         int var7;
         int var9;
         int var32;
         if(Client.frameId == 15) {
            var0 = Client.inBuffer.getUByte();
            var1 = InterfaceNode.anInt1400 + (var0 >> 4 & 0x7);
            var2 = Player.anInt1988 + (var0 & 0x7);
            var3 = Client.inBuffer.getUShort();
            var32 = Client.inBuffer.getUByte();
            var5 = var32 >> 4 & 0xf;
            var6 = var32 & 0x7;
            var9 = Client.inBuffer.getUByte();
            if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
               var7 = var5 + 1;
               if(Class68.myPlayer.anIntArray1945[0] >= var1 - var7 && Class68.myPlayer.anIntArray1945[0] <= var1 + var7 && Class68.myPlayer.anIntArray1955[0] >= var2 - var7 && Class68.myPlayer.anIntArray1955[0] <= var7 + var2 && Client.anInt2205 * 873913835 != 0 && var6 > 0 && Client.audioEffectCount < 50) {
                  Client.anIntArray2206[Client.audioEffectCount] = var3;
                  Client.anIntArray2073[Client.audioEffectCount] = var6;
                  Client.anIntArray2029[Client.audioEffectCount] = var9;
                  Client.aClass14Array2210[Client.audioEffectCount] = null;
                  Client.anIntArray2209[Client.audioEffectCount] = (var1 << 16) + var5 + (var2 << 8);
                  ++Client.audioEffectCount;
               }
            }
         }

         if(Client.frameId == 220) {
            var0 = Client.inBuffer.getUByte();
            var1 = InterfaceNode.anInt1400 + (var0 >> 4 & 0x7);
            var2 = (var0 & 0x7) + Player.anInt1988;
            var3 = Client.inBuffer.getUShort();
            var32 = Client.inBuffer.getUShort();
            var5 = Client.inBuffer.getUShort();
            if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
               Deque var40 = Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var1][var2];
               if(var40 != null) {
                  for(GroundItem var8 = (GroundItem)var40.getFront(); var8 != null; var8 = (GroundItem)var40.getNext()) {
                     if((var3 & 0x7fff) == var8.anInt1842 && var8.quantity == var32) {
                        var8.quantity = var5;
                        break;
                     }
                  }

                  Class32.method195(var1, var2);
               }
            }
         } else {
            int var33;
            if(Client.frameId == 25) {
               var0 = Client.inBuffer.getUByte();
               var1 = var0 >> 2;
               var2 = var0 & 0x3;
               var3 = Client.anIntArray2056[var1];
               var32 = Client.inBuffer.getUByte();
               var5 = InterfaceNode.anInt1400 + (var32 >> 4 & 0x7);
               var6 = Player.anInt1988 + (var32 & 0x7);
               var9 = Client.inBuffer.getUShort();
               if(var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                  if(var3 == 0) {
                     BoundaryStub var34 = InterfaceNode.landscape.method21(InterfaceNode.floorLevel * -1331355705, var5, var6);
                     if(var34 != null) {
                        var33 = var34.anInt277 >> 14 & 0x7fff;
                        if(var1 == 2) {
                           var34.entityA = new DynamicObject(var33, 2, var2 + 4, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var34.entityA);
                           var34.entityB = new DynamicObject(var33, 2, var2 + 1 & 0x3, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var34.entityB);
                        } else {
                           var34.entityA = new DynamicObject(var33, var1, var2, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var34.entityA);
                        }
                     }
                  }

                  if(var3 == 1) {
                     BoundaryDecorationStub var35 = InterfaceNode.landscape.method29(InterfaceNode.floorLevel * -1331355705, var5, var6);
                     if(var35 != null) {
                        var33 = var35.anInt218 >> 14 & 0x7fff;
                        if(var1 != 4 && var1 != 5) {
                           if(var1 == 6) {
                              var35.entityA = new DynamicObject(var33, 4, var2 + 4, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var35.entityA);
                           } else if(var1 == 7) {
                              var35.entityA = new DynamicObject(var33, 4, (var2 + 2 & 0x3) + 4, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var35.entityA);
                           } else if(var1 == 8) {
                              var35.entityA = new DynamicObject(var33, 4, var2 + 4, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var35.entityA);
                              var35.entityB = new DynamicObject(var33, 4, (var2 + 2 & 0x3) + 4, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var35.entityB);
                           }
                        } else {
                           var35.entityA = new DynamicObject(var33, 4, var2, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var35.entityA);
                        }
                     }
                  }

                  if(var3 == 2) {
                     EntityMarker var36 = InterfaceNode.landscape.method30(InterfaceNode.floorLevel * -1331355705, var5, var6);
                     if(var1 == 11) {
                        var1 = 10;
                     }

                     if(var36 != null) {
                        var36.entity = new DynamicObject(var36.anInt269 >> 14 & 0x7fff, var1, var2, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var36.entity);
                     }
                  }

                  if(var3 == 3) {
                     TileDecorationStub var371 = InterfaceNode.landscape.method59(InterfaceNode.floorLevel * -1331355705, var5, var6);
                     if(var371 != null) {
                        var371.entity = new DynamicObject(var371.anInt839 >> 14 & 0x7fff, 22, var2, InterfaceNode.floorLevel * -1331355705, var5, var6, var9, false, var371.entity);
                     }
                  }
               }
            } else if(Client.frameId == 147) {
               var0 = Client.inBuffer.getUByteA();
               var1 = InterfaceNode.anInt1400 + (var0 >> 4 & 0x7);
               var2 = (var0 & 0x7) + Player.anInt1988;
               var3 = Client.inBuffer.getUShortA();
               var32 = Client.inBuffer.getUShortA();
               if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                  var29 = new GroundItem();
                  var29.anInt1842 = var3;
                  var29.quantity = var32;
                  if(Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var1][var2] == null) {
                     Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var1][var2] = new Deque();
                  }

                  Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var1][var2].method475(var29);
                  Class32.method195(var1, var2);
               }
            } else if(Client.frameId == 182) {
               var0 = Client.inBuffer.getUByteS();
               var1 = (var0 >> 4 & 0x7) + InterfaceNode.anInt1400;
               var2 = Player.anInt1988 + (var0 & 0x7);
               var3 = Client.inBuffer.getUByte();
               var32 = var3 >> 2;
               var5 = var3 & 0x3;
               var6 = Client.anIntArray2056[var32];
               if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                  NpcType.method805(InterfaceNode.floorLevel * -1331355705, var1, var2, var6, -1, var32, var5, 0, -1);
               }
            } else if(Client.frameId == 231) {
               var0 = Client.inBuffer.getUByte();
               var1 = (var0 >> 4 & 0x7) + InterfaceNode.anInt1400;
               var2 = Player.anInt1988 + (var0 & 0x7);
               var3 = Client.inBuffer.getUShort();
               var32 = Client.inBuffer.getUByte();
               var5 = Client.inBuffer.getUShort();
               if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                  var1 = var1 * 128 + 64;
                  var2 = var2 * 128 + 64;
                  GraphicsStub var38 = new GraphicsStub(var3, InterfaceNode.floorLevel * -1331355705, var1, var2, NpcType.method802(var1, var2, InterfaceNode.floorLevel * -1331355705) - var32, var5, Client.engineCycle);
                  Client.graphicsObjectDeque.method475(var38);
               }
            } else {
               int var23;
               int var39;
               if(Client.frameId == 108) {
                  var0 = Client.inBuffer.getUByte();
                  var1 = (var0 >> 4 & 0x7) + InterfaceNode.anInt1400;
                  var2 = (var0 & 0x7) + Player.anInt1988;
                  var3 = Client.inBuffer.getByte() + var1;
                  var32 = Client.inBuffer.getByte() + var2;
                  var5 = Client.inBuffer.getShort();
                  var6 = Client.inBuffer.getUShort();
                  var9 = Client.inBuffer.getUByte() * 4;
                  var7 = Client.inBuffer.getUByte() * 4;
                  var33 = Client.inBuffer.getUShort();
                  int var37 = Client.inBuffer.getUShort();
                  var23 = Client.inBuffer.getUByte();
                  var39 = Client.inBuffer.getUByte();
                  if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var32 >= 0 && var3 < 104 && var32 < 104 && var6 != '\uffff') {
                     var1 = var1 * 128 + 64;
                     var2 = var2 * 128 + 64;
                     var3 = var3 * 128 + 64;
                     var32 = var32 * 128 + 64;
                     Projectile var11 = new Projectile(var6, InterfaceNode.floorLevel * -1331355705, var1, var2, NpcType.method802(var1, var2, InterfaceNode.floorLevel * -1331355705) - var9, Client.engineCycle + var33, Client.engineCycle + var37, var23, var39, var5, var7);
                     var11.method992(var3, var32, NpcType.method802(var3, var32, InterfaceNode.floorLevel * -1331355705) - var7, Client.engineCycle + var33);
                     Client.projectileDeque.method475(var11);
                  }
               } else {
                  if(Client.frameId == 5) {
                     var0 = Client.inBuffer.getUByteC();
                     var1 = var0 >> 2;
                     var2 = var0 & 0x3;
                     var3 = Client.anIntArray2056[var1];
                     var32 = Client.inBuffer.getUByte();
                     var5 = (var32 >> 4 & 0x7) + InterfaceNode.anInt1400;
                     var6 = (var32 & 0x7) + Player.anInt1988;
                     byte var401 = Client.inBuffer.getByteA();
                     var7 = Client.inBuffer.getULEShort();
                     byte var41 = Client.inBuffer.getByteA();
                     byte var22 = Client.inBuffer.getByteA();
                     var23 = Client.inBuffer.getUShort();
                     var39 = Client.inBuffer.getUShort();
                     int var10 = Client.inBuffer.getULEShortA();
                     byte var21 = Client.inBuffer.getByteS();
                     Player var12;
                     if(Client.myPlayerIndex == var39) {
                        var12 = Class68.myPlayer;
                     } else {
                        var12 = Client.playerArray[var39];
                     }

                     if(var12 != null) {
                        ObjectType var16 = Class37.getObjectType(var10);
                        int var13;
                        int var24;
                        if(var2 != 1 && var2 != 3) {
                           var24 = var16.sizeX;
                           var13 = var16.sizeY;
                        } else {
                           var24 = var16.sizeY;
                           var13 = var16.sizeX;
                        }

                        int var25 = (var24 >> 1) + var5;
                        int var26 = (var24 + 1 >> 1) + var5;
                        int var27 = (var13 >> 1) + var6;
                        int var28 = (var13 + 1 >> 1) + var6;
                        int[][] var17 = Class39.tileHeights[InterfaceNode.floorLevel * -1331355705];
                        int var19 = var17[var25][var28] + var17[var25][var27] + var17[var26][var27] + var17[var26][var28] >> 2;
                        int var18 = (var24 << 6) + (var5 << 7);
                        int var20 = (var13 << 6) + (var6 << 7);
                        Model var15 = var16.method861(var1, var2, var17, var18, var19, var20);
                        if(var15 != null) {
                           NpcType.method805(InterfaceNode.floorLevel * -1331355705, var5, var6, var3, -1, 0, 0, var7 + 1, var23 + 1);
                           var12.anInt1989 = Client.engineCycle + var7;
                           var12.anInt1990 = Client.engineCycle + var23;
                           var12.aModel2001 = var15;
                           var12.anInt1991 = var5 * 128 + var24 * 64;
                           var12.anInt1993 = var6 * 128 + var13 * 64;
                           var12.anInt1992 = var19;
                           byte var14;
                           if(var21 > var401) {
                              var14 = var21;
                              var21 = var401;
                              var401 = var14;
                           }

                           if(var22 > var41) {
                              var14 = var22;
                              var22 = var41;
                              var41 = var14;
                           }

                           var12.anInt1994 = var5 + var21;
                           var12.anInt1987 = var401 + var5;
                           var12.anInt1995 = var6 + var22;
                           var12.anInt1985 = var6 + var41;
                        }
                     }
                  }

                  if(Client.frameId == 189) {
                     var0 = Client.inBuffer.getUByteA();
                     var1 = (var0 >> 4 & 0x7) + InterfaceNode.anInt1400;
                     var2 = (var0 & 0x7) + Player.anInt1988;
                     var3 = Client.inBuffer.getUByte();
                     var32 = var3 >> 2;
                     var5 = var3 & 0x3;
                     var6 = Client.anIntArray2056[var32];
                     var9 = Client.inBuffer.getUShort();
                     if(var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                        NpcType.method805(InterfaceNode.floorLevel * -1331355705, var1, var2, var6, var9, var32, var5, 0, -1);
                     }
                  }
               }
            }
         }
      }

   }

}
