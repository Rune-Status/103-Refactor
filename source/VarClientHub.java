import java.io.EOFException;

public class VarClientHub {

   static Class51 aClass51_320;
   static int chunkLeftY;
   boolean changed = false;
   long lastSerialize;
   int[] varcs;
   String[] varcstrings;
   boolean[] varcSerials;
   boolean[] varcstringSerials;

   void putVarc(int id, int val) {
      this.varcs[id] = val;
      if(this.varcSerials[id]) {
         this.changed = true;
      }

   }

   String getVarcString(int id) {
      return this.varcstrings[id];
   }

   static final void method173(int var0) {
      if(IdentKitType.loadWidget(var0)) {
         Widget[] var2 = Widget.interfaces[var0];

         for(int var3 = 0; var3 < var2.length; var3++) {
            Widget var1 = var2[var3];
            if(var1 != null) {
               var1.anInt1194 = 0;
               var1.anInt1126 = 0;
            }
         }
      }

   }

   void serialize() {
      CacheFileAccessor var1 = this.getVarPrefs(true);
      boolean var14 = false;

      try {
         label199: {
            try {
               var14 = true;
               int var17 = 3;
               int var16 = 0;

               int var4;
               for(var4 = 0; var4 < this.varcs.length; var4++) {
                  if(this.varcSerials[var4] && this.varcs[var4] != -1) {
                     var17 += 6;
                     ++var16;
                  }
               }

               var17 += 2;
               var4 = 0;

               for(int var20 = 0; var20 < this.varcstrings.length; var20++) {
                  if(this.varcstringSerials[var20] && this.varcstrings[var20] != null) {
                     var17 += TileDecorationStub.getLength(this.varcstrings[var20]) + 2;
                     ++var4;
                  }
               }

               ByteBuf var21 = new ByteBuf(var17);
               var21.putByte(1);
               var21.putShort(var16);

               int var6;
               for(var6 = 0; var6 < this.varcs.length; var6++) {
                  if(this.varcSerials[var6] && this.varcs[var6] != -1) {
                     var21.putShort(var6);
                     var21.putInt(this.varcs[var6]);
                  }
               }

               var21.putShort(var4);
               var6 = 0;

               while(true) {
                  if(var6 >= this.varcstrings.length) {
                     var1.write(var21.payload, 0, var21.position);
                     break;
                  }

                  if(this.varcstringSerials[var6] && this.varcstrings[var6] != null) {
                     var21.putShort(var6);
                     var21.putString(this.varcstrings[var6]);
                  }

                  ++var6;
               }
            } catch (Exception var19) {
               try {
                  var1.close();
                  var14 = false;
               } catch (Exception var18) {
                  var14 = false;
               }
               break label199;
            }

            try {
               var1.close();
               var14 = false;
            } catch (Exception var171) {
               var14 = false;
            }
         }
      } finally {
         if(var14) {
            try {
               var1.close();
            } catch (Exception var161) {
               ;
            }
         }

      }

      this.changed = false;
      this.lastSerialize = AnimationSkin.currentTimeMs();
   }

   void deserialize() {
      CacheFileAccessor accessor = this.getVarPrefs(false);
      boolean caught = false;

      try {
         label225: {
            try {
               caught = true;
               byte[] var24 = new byte[(int)accessor.length()];

               int var22;
               for(int buf = 0; buf < var24.length; buf += var22) {
                  var22 = accessor.read(var24, buf, var24.length - buf);
                  if(var22 == -1) {
                     throw new EOFException();
                  }
               }

               ByteBuf var31 = new ByteBuf(var24);
               if(var31.payload.length - var31.position < 1) {
                  try {
                     accessor.close();
                  } catch (Exception var27) {
                     ;
                  }

                  return;
               }

               int version = var31.getUByte();
               if(version < 0 || version > 1) {
                  try {
                     accessor.close();
                  } catch (Exception var28) {
                     ;
                  }

                  return;
               }

               int cCount = var31.getUShort();

               int csCount;
               int i;
               int key;
               for(csCount = 0; csCount < cCount; csCount++) {
                  i = var31.getUShort();
                  key = var31.getInt();
                  if(this.varcSerials[i]) {
                     this.varcs[i] = key;
                  }
               }

               csCount = var31.getUShort();

               for(i = 0; i < csCount; i++) {
                  key = var31.getUShort();
                  String val = var31.getString();
                  if(this.varcstringSerials[key]) {
                     this.varcstrings[key] = val;
                  }
               }
            } catch (Exception var29) {
               try {
                  accessor.close();
                  caught = false;
               } catch (Exception var26) {
                  caught = false;
               }
               break label225;
            }

            try {
               accessor.close();
               caught = false;
            } catch (Exception var25) {
               caught = false;
            }
         }
      } finally {
         if(caught) {
            try {
               accessor.close();
            } catch (Exception var241) {
               ;
            }
         }

      }

      this.changed = false;
   }

   void process() {
      if(this.changed && this.lastSerialize < AnimationSkin.currentTimeMs() - 60000L) {
         this.serialize();
      }

   }

   boolean changed() {
      return this.changed;
   }

   void reset() {
      int var1;
      for(var1 = 0; var1 < this.varcs.length; var1++) {
         if(!this.varcSerials[var1]) {
            this.varcs[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.varcstrings.length; var1++) {
         if(!this.varcstringSerials[var1]) {
            this.varcstrings[var1] = null;
         }
      }

   }

   CacheFileAccessor getVarPrefs(boolean serialize) {
      return BoundaryStub.getPreferences("2", Client.gameType.identifier, serialize);
   }

   VarClientHub() {
      this.varcs = new int[Client.configsIndex.fileCount(19)];
      this.varcstrings = new String[Client.configsIndex.fileCount(15)];
      this.varcSerials = new boolean[this.varcs.length];

      int index;
      for(index = 0; index < this.varcs.length; index++) {
         VarClientType varc_string = MilliTimer.getVarClientType(index);
         this.varcSerials[index] = varc_string.serialize;
      }

      this.varcstringSerials = new boolean[this.varcstrings.length];

      for(index = 0; index < this.varcstrings.length; index++) {
         VarClientStringType var3 = ClanMate.getVarClientStringType(index);
         this.varcstringSerials[index] = var3.serialize;
      }

      for(index = 0; index < this.varcs.length; index++) {
         this.varcs[index] = -1;
      }

      this.deserialize();
   }

   int getVarc(int id) {
      return this.varcs[id];
   }

   void putVarcString(int id, String val) {
      this.varcstrings[id] = val;
      if(this.varcstringSerials[id]) {
         this.changed = true;
      }

   }

   static final void method182(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; var4++) {
         for(int var5 = var0; var5 <= var2 + var0; var5++) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               Class39.aByteArrayArrayArray430[0][var5][var4] = 127;
               if(var5 == var0 && var5 > 0) {
                  Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5 - 1][var4];
               }

               if(var0 + var2 == var5 && var5 < 103) {
                  Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5 + 1][var4];
               }

               if(var1 == var4 && var4 > 0) {
                  Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5][var4 - 1];
               }

               if(var1 + var3 == var4 && var4 < 103) {
                  Class39.tileHeights[0][var5][var4] = Class39.tileHeights[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   static void method183(Widget var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var6 = var0.height * 1227800423;
      if(var0.anInt1133 == 0) {
         var0.width = var0.anInt1135 * 124195285;
      } else if(var0.anInt1133 == 1) {
         var0.width = var1 - var0.anInt1135 * 124195285;
      } else if(var0.anInt1133 == 2) {
         var0.width = var0.anInt1135 * 124195285 * var1 >> 14;
      }

      if(var0.buttonType == 0) {
         var0.height = var0.anInt1136 * -773929259;
      } else if(var0.buttonType == 1) {
         var0.height = (var2 - var0.anInt1136 * 507570867) * -1446581161;
      } else if(var0.buttonType == 2) {
         var0.height = (var2 * 507570867 * var0.anInt1136 >> 14) * -1446581161;
      }

      if(var0.anInt1133 == 4) {
         var0.width = var0.anInt1193 * 1227800423 * var0.height / (var0.anInt1152 * 1321191429);
      }

      if(var0.buttonType == 4) {
         var0.height = var0.width * var0.anInt1152 * 1321191429 / var0.anInt1193 * -1446581161;
      }

      if(Client.aBool2024 && var0.type == 0) {
         if(var0.height * 1227800423 < 5 && var0.width < 5) {
            var0.height = 1357028787;
            var0.width = 5;
         } else {
            if(var0.height * 1227800423 <= 0) {
               var0.height = 1357028787;
            }

            if(var0.width <= 0) {
               var0.width = 5;
            }
         }
      }

      if(var0.contentType == 1337) {
         Client.aWidget2231 = var0;
      }

      if(var3 && var0.anObjectArray1188 != null && (var0.width != var4 || var0.height * 1227800423 != var6)) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var0;
         var5.args = var0.anObjectArray1188;
         Client.aDeque2164.method475(var5);
      }

   }

   static final void method184() {
      for(Projectile var0 = (Projectile)Client.projectileDeque.getFront(); var0 != null; var0 = (Projectile)Client.projectileDeque.getNext()) {
         if(var0.anInt1844 == InterfaceNode.floorLevel * -1331355705 && Client.engineCycle <= var0.loopCycle) {
            if(Client.engineCycle >= var0.anInt1846) {
               if(var0.targetIndex > 0) {
                  Npc var2 = Client.npcArray[var0.targetIndex - 1];
                  if(var2 != null && var2.strictX >= 0 && var2.strictX < 13312 && var2.strictY >= 0 && var2.strictY < 13312) {
                     var0.method992(var2.strictX, var2.strictY, NpcType.method802(var2.strictX, var2.strictY, var0.anInt1844) - var0.endHeight, Client.engineCycle);
                  }
               }

               if(var0.targetIndex < 0) {
                  int var21 = -var0.targetIndex - 1;
                  Player var3;
                  if(Client.myPlayerIndex == var21) {
                     var3 = Class68.myPlayer;
                  } else {
                     var3 = Client.playerArray[var21];
                  }

                  if(var3 != null && var3.strictX >= 0 && var3.strictX < 13312 && var3.strictY >= 0 && var3.strictY < 13312) {
                     var0.method992(var3.strictX, var3.strictY, NpcType.method802(var3.strictX, var3.strictY, var0.anInt1844) - var0.endHeight, Client.engineCycle);
                  }
               }

               var0.method993(Client.anInt2066);
               InterfaceNode.landscape.method19(InterfaceNode.floorLevel * -1331355705, (int)var0.aDouble1848, (int)var0.aDouble1849, (int)var0.aDouble1843, 60, var0, var0.anInt1850, -1, false);
            }
         } else {
            var0.unlink();
         }
      }

   }

}
