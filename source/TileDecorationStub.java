public final class TileDecorationStub {

   int strictX;
   static Widget aWidget838;
   int strictY;
   public Entity entity;
   public int anInt839;
   int config;
   int height;
   static int chunkBaseX;
   static int[] anIntArray841;

   static final void method462(int var0, int var1, int var2, int var3) {
      if(Client.itemSelectionStatus == 0 && !Client.spellSelected) {
         FriendedPlayer.addMenuRow("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      int var5 = -1;
      int var4 = -1;

      int var7;
      int var8;
      for(var7 = 0; var7 < Model.onCursorCount; var7++) {
         var8 = Model.onCursorUids[var7];
         int var21 = var8 & 0x7f;
         int var10 = var8 >> 7 & 0x7f;
         int var16 = var8 >> 29 & 0x3;
         int var17 = var8 >> 14 & 0x7fff;
         if(var8 != var4) {
            var4 = var8;
            if(var16 == 2 && InterfaceNode.landscape.method34(InterfaceNode.floorLevel * -1331355705, var21, var10, var8) >= 0) {
               ObjectType var15 = Class37.getObjectType(var17);
               if(var15.transformIds != null) {
                  var15 = var15.transform();
               }

               if(var15 == null) {
                  continue;
               }

               if(Client.itemSelectionStatus == 1) {
                  FriendedPlayer.addMenuRow("Use", Client.selectedItemName + " " + Class35.aString391 + " " + Class48_Sub1.method545('\uffff') + var15.name, 1, var8, var21, var10);
               } else if(Client.spellSelected) {
                  if((Class31.currentSpellTargets & 0x4) == 4) {
                     FriendedPlayer.addMenuRow(Client.menuActionPrefix, Client.selectedSpellName + " " + Class35.aString391 + " " + Class48_Sub1.method545('\uffff') + var15.name, 2, var8, var21, var10);
                  }
               } else {
                  String[] var18 = var15.actions;
                  if(Client.aBool2139) {
                     var18 = GameCanvas.method885(var18);
                  }

                  if(var18 != null) {
                     for(int var19 = 4; var19 >= 0; --var19) {
                        if(var18[var19] != null) {
                           short var25 = 0;
                           if(var19 == 0) {
                              var25 = 3;
                           }

                           if(var19 == 1) {
                              var25 = 4;
                           }

                           if(var19 == 2) {
                              var25 = 5;
                           }

                           if(var19 == 3) {
                              var25 = 6;
                           }

                           if(var19 == 4) {
                              var25 = 1001;
                           }

                           FriendedPlayer.addMenuRow(var18[var19], Class48_Sub1.method545('\uffff') + var15.name, var25, var8, var21, var10);
                        }
                     }
                  }

                  FriendedPlayer.addMenuRow("Examine", Class48_Sub1.method545('\uffff') + var15.name, 1002, var15.id << 14, var21, var10);
               }
            }

            int var27;
            Player var241;
            Npc var251;
            int[] var261;
            int var281;
            if(var16 == 1) {
               Npc var24 = Client.npcArray[var17];
               if(var24 == null) {
                  continue;
               }

               if(var24.type.anInt1589 == 1 && (var24.strictX & 0x7f) == 64 && (var24.strictY & 0x7f) == 64) {
                  for(var281 = 0; var281 < Client.anInt2225; var281++) {
                     var251 = Client.npcArray[Client.npcIndices[var281]];
                     if(var251 != null && var251 != var24 && var251.type.anInt1589 == 1 && var24.strictX == var251.strictX && var251.strictY == var24.strictY) {
                        Class39.method219(var251.type, Client.npcIndices[var281], var21, var10);
                     }
                  }

                  var281 = GPI.localPlayerCount;
                  var261 = GPI.localPlayerIndices;

                  for(var27 = 0; var27 < var281; var27++) {
                     var241 = Client.playerArray[var261[var27]];
                     if(var241 != null && var24.strictX == var241.strictX && var24.strictY == var241.strictY) {
                        AbstractProducer.method143(var241, var261[var27], var21, var10);
                     }
                  }
               }

               Class39.method219(var24.type, var17, var21, var10);
            }

            if(var16 == 0) {
               Player var271 = Client.playerArray[var17];
               if(var271 == null) {
                  continue;
               }

               if((var271.strictX & 0x7f) == 64 && (var271.strictY & 0x7f) == 64) {
                  for(var281 = 0; var281 < Client.anInt2225; var281++) {
                     var251 = Client.npcArray[Client.npcIndices[var281]];
                     if(var251 != null && var251.type.anInt1589 == 1 && var271.strictX == var251.strictX && var271.strictY == var251.strictY) {
                        Class39.method219(var251.type, Client.npcIndices[var281], var21, var10);
                     }
                  }

                  var281 = GPI.localPlayerCount;
                  var261 = GPI.localPlayerIndices;

                  for(var27 = 0; var27 < var281; var27++) {
                     var241 = Client.playerArray[var261[var27]];
                     if(var241 != null && var271 != var241 && var241.strictX == var271.strictX && var241.strictY == var271.strictY) {
                        AbstractProducer.method143(var241, var261[var27], var21, var10);
                     }
                  }
               }

               if(Client.anInt2111 != var17) {
                  AbstractProducer.method143(var271, var17, var21, var10);
               } else {
                  var5 = var8;
               }
            }

            if(var16 == 3) {
               Deque var291 = Client.groundItemDeque[InterfaceNode.floorLevel * -1331355705][var21][var10];
               if(var291 != null) {
                  for(GroundItem var26 = (GroundItem)var291.method472(); var26 != null; var26 = (GroundItem)var291.method476()) {
                     ItemType var20 = FriendedPlayer.getItemType(var26.anInt1842);
                     if(Client.itemSelectionStatus == 1) {
                        FriendedPlayer.addMenuRow("Use", Client.selectedItemName + " " + Class35.aString391 + " " + Class48_Sub1.method545(16748608) + var20.name, 16, var26.anInt1842, var21, var10);
                     } else if(Client.spellSelected) {
                        if((Class31.currentSpellTargets & 0x1) == 1) {
                           FriendedPlayer.addMenuRow(Client.menuActionPrefix, Client.selectedSpellName + " " + Class35.aString391 + " " + Class48_Sub1.method545(16748608) + var20.name, 17, var26.anInt1842, var21, var10);
                        }
                     } else {
                        String[] var29 = var20.groundActions;
                        if(Client.aBool2139) {
                           var29 = GameCanvas.method885(var29);
                        }

                        for(int var28 = 4; var28 >= 0; --var28) {
                           if(var29 != null && var29[var28] != null) {
                              byte var14 = 0;
                              if(var28 == 0) {
                                 var14 = 18;
                              }

                              if(var28 == 1) {
                                 var14 = 19;
                              }

                              if(var28 == 2) {
                                 var14 = 20;
                              }

                              if(var28 == 3) {
                                 var14 = 21;
                              }

                              if(var28 == 4) {
                                 var14 = 22;
                              }

                              FriendedPlayer.addMenuRow(var29[var28], Class48_Sub1.method545(16748608) + var20.name, var14, var26.anInt1842, var21, var10);
                           } else if(var28 == 2) {
                              FriendedPlayer.addMenuRow("Take", Class48_Sub1.method545(16748608) + var20.name, 20, var26.anInt1842, var21, var10);
                           }
                        }

                        FriendedPlayer.addMenuRow("Examine", Class48_Sub1.method545(16748608) + var20.name, 1004, var26.anInt1842, var21, var10);
                     }
                  }
               }
            }
         }
      }

      if(var5 != -1) {
         var7 = var5 & 0x7f;
         var8 = var5 >> 7 & 0x7f;
         Player var23 = Client.playerArray[Client.anInt2111];
         AbstractProducer.method143(var23, Client.anInt2111, var7, var8);
      }

   }

   static final void method463(Widget var0) {
      int var1 = var0.contentType;
      if(var1 == 324) {
         if(Client.anInt2230 == -1) {
            Client.anInt2230 = var0.textureId;
            Client.anInt2077 = var0.anInt1143 * 8452631;
         }

         if(Client.aPlayerConfig2138.female) {
            var0.textureId = Client.anInt2230;
         } else {
            var0.textureId = Client.anInt2077 * 18996647;
         }
      } else if(var1 != 325) {
         if(var1 == 327) {
            var0.rotationX = 150;
            var0.rotationZ = (int)(Math.sin((double)Client.engineCycle / 40.0D) * 256.0D) & 0x7ff;
            var0.modelType = 5;
            var0.modelId = 0;
         } else if(var1 == 328) {
            var0.rotationX = 150;
            var0.rotationZ = (int)(Math.sin((double)Client.engineCycle / 40.0D) * 256.0D) & 0x7ff;
            var0.modelType = 5;
            var0.modelId = 1;
         }
      } else {
         if(Client.anInt2230 == -1) {
            Client.anInt2230 = var0.textureId;
            Client.anInt2077 = var0.anInt1143 * 8452631;
         }

         if(Client.aPlayerConfig2138.female) {
            var0.textureId = Client.anInt2077 * 18996647;
         } else {
            var0.textureId = Client.anInt2230;
         }
      }

   }

   public static int getLength(String var0) {
      return var0.length() + 1;
   }

}
