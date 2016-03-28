public final class Class117 {

   static final int method442(Widget var0, int var1) {
      if(var0.varpOpcodes != null && var1 < var0.varpOpcodes.length) {
         try {
            int[] var13 = var0.varpOpcodes[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var13[var4++];
               int var7 = 0;
               byte var8 = 0;
               if(var6 == 0) {
                  return var3;
               }

               if(var6 == 1) {
                  var7 = Client.levels[var13[var4++]];
               }

               if(var6 == 2) {
                  var7 = Client.experiences[var13[var4++]];
               }

               if(var6 == 3) {
                  var7 = Client.currentLevels[var13[var4++]];
               }

               int var9;
               Widget var10;
               int var11;
               int var12;
               if(var6 == 4) {
                  var9 = var13[var4++] << 16;
                  var9 += var13[var4++];
                  var10 = Class94.getWidget(var9);
                  var11 = var13[var4++];
                  if(var11 != -1 && (!FriendedPlayer.getItemType(var11).aBool1618 || Client.membersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; var12++) {
                        if(var11 + 1 == var10.itemIds[var12]) {
                           var7 += var10.itemQuantities[var12];
                        }
                     }
                  }
               }

               if(var6 == 5) {
                  var7 = Class94.tempVars[var13[var4++]];
               }

               if(var6 == 6) {
                  var7 = Class65.anIntArray582[Client.experiences[var13[var4++]] - 1];
               }

               if(var6 == 7) {
                  var7 = Class94.tempVars[var13[var4++]] * 100 / '\ub71b';
               }

               if(var6 == 8) {
                  var7 = Class68.myPlayer.combatLevel;
               }

               if(var6 == 9) {
                  for(var9 = 0; var9 < 25; var9++) {
                     if(Class65.aBoolArray583[var9]) {
                        var7 += Client.experiences[var9];
                     }
                  }
               }

               if(var6 == 10) {
                  var9 = var13[var4++] << 16;
                  var9 += var13[var4++];
                  var10 = Class94.getWidget(var9);
                  var11 = var13[var4++];
                  if(var11 != -1 && (!FriendedPlayer.getItemType(var11).aBool1618 || Client.membersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; var12++) {
                        if(var11 + 1 == var10.itemIds[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var6 == 11) {
                  var7 = Client.energy;
               }

               if(var6 == 12) {
                  var7 = Client.weight;
               }

               if(var6 == 13) {
                  var9 = Class94.tempVars[var13[var4++]];
                  int var14 = var13[var4++];
                  var7 = (1 << var14 & var9) != 0 ? 1 : 0;
               }

               if(var6 == 14) {
                  var9 = var13[var4++];
                  var7 = Class91.method401(var9);
               }

               if(var6 == 15) {
                  var8 = 1;
               }

               if(var6 == 16) {
                  var8 = 2;
               }

               if(var6 == 17) {
                  var8 = 3;
               }

               if(var6 == 18) {
                  var7 = Node_Sub10.chunkLeftX + (Class68.myPlayer.strictX >> 7);
               }

               if(var6 == 19) {
                  var7 = (Class68.myPlayer.strictY >> 7) + VarClientHub.chunkLeftY;
               }

               if(var6 == 20) {
                  var7 = var13[var4++];
               }

               if(var8 == 0) {
                  if(var5 == 0) {
                     var3 += var7;
                  }

                  if(var5 == 1) {
                     var3 -= var7;
                  }

                  if(var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if(var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var141) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   Class117() throws Throwable {
      throw new Error();
   }

}
