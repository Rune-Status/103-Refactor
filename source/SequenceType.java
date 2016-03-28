public class SequenceType extends DualNode {

   static AbstractIndex aClass87_1470;
   static AbstractIndex aClass87_1471;
   static int anInt1476;
   static int anInt1488;
   static AbstractIndex seq_ref;
   public int anInt1469 = -1;
   public boolean aBool1475 = false;
   public int anInt1477 = -1;
   public int anInt1479 = -1;
   public int anInt1480 = 5;
   public int anInt1482 = -1;
   public int anInt1483 = 99;
   public int anInt1484 = -1;
   public int anInt1486 = 2;
   public int[] anIntArray1481;
   int[] anIntArray1478;
   public int[] anIntArray1474;
   int[] anIntArray1485;
   public int[] anIntArray1487;
   public static NodeMap sequences = new NodeMap(64);
   public static NodeMap aClass106_1473 = new NodeMap(100);

   void decode(ByteBuf var1) {
      while(true) {
         int var2 = var1.getUByte();
         if(var2 == 0) {
            return;
         }

         this.method674(var1, var2);
      }
   }

   void method674(ByteBuf var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var4 = var1.getUShort();
         this.anIntArray1481 = new int[var4];

         for(var3 = 0; var3 < var4; var3++) {
            this.anIntArray1481[var3] = var1.getUShort();
         }

         this.anIntArray1474 = new int[var4];

         for(var3 = 0; var3 < var4; var3++) {
            this.anIntArray1474[var3] = var1.getUShort();
         }

         for(var3 = 0; var3 < var4; var3++) {
            this.anIntArray1474[var3] += var1.getUShort() << 16;
         }
      } else if(var2 == 2) {
         this.anInt1477 = var1.getUShort();
      } else if(var2 == 3) {
         var4 = var1.getUByte();
         this.anIntArray1478 = new int[var4 + 1];

         for(var3 = 0; var3 < var4; var3++) {
            this.anIntArray1478[var3] = var1.getUByte();
         }

         this.anIntArray1478[var4] = 9999999;
      } else if(var2 == 4) {
         this.aBool1475 = true;
      } else if(var2 == 5) {
         this.anInt1480 = var1.getUByte();
      } else if(var2 == 6) {
         this.anInt1479 = var1.getUShort();
      } else if(var2 == 7) {
         this.anInt1482 = var1.getUShort();
      } else if(var2 == 8) {
         this.anInt1483 = var1.getUByte();
      } else if(var2 == 9) {
         this.anInt1484 = var1.getUByte();
      } else if(var2 == 10) {
         this.anInt1469 = var1.getUByte();
      } else if(var2 == 11) {
         this.anInt1486 = var1.getUByte();
      } else if(var2 == 12) {
         var4 = var1.getUByte();
         this.anIntArray1485 = new int[var4];

         for(var3 = 0; var3 < var4; var3++) {
            this.anIntArray1485[var3] = var1.getUShort();
         }

         for(var3 = 0; var3 < var4; var3++) {
            this.anIntArray1485[var3] += var1.getUShort() << 16;
         }
      } else if(var2 == 13) {
         var4 = var1.getUByte();
         this.anIntArray1487 = new int[var4];

         for(var3 = 0; var3 < var4; var3++) {
            this.anIntArray1487[var3] = var1.getMedium();
         }
      }

   }

   void post() {
      if(this.anInt1484 == -1) {
         if(this.anIntArray1478 == null) {
            this.anInt1484 = 0;
         } else {
            this.anInt1484 = 2;
         }
      }

      if(this.anInt1469 == -1) {
         if(this.anIntArray1478 != null) {
            this.anInt1469 = 2;
         } else {
            this.anInt1469 = 0;
         }
      }

   }

   Model method676(Model var1, int var2, int var3) {
      var2 = this.anIntArray1474[var2];
      SkeletonSet var5 = method685(var2 >> 16);
      var2 &= '\uffff';
      if(var5 == null) {
         return var1.method995(true);
      } else {
         Model var4 = var1.method995(!var5.method776(var2, (byte)-110));
         var3 &= 3;
         if(var3 == 1) {
            var4.method1004();
         } else if(var3 == 2) {
            var4.method1003();
         } else if(var3 == 3) {
            var4.method1013();
         }

         var4.method1001(var5, var2);
         if(var3 == 1) {
            var4.method1013();
         } else if(var3 == 2) {
            var4.method1003();
         } else if(var3 == 3) {
            var4.method1004();
         }

         return var4;
      }
   }

   Model method677(Model var1, int var2) {
      var2 = this.anIntArray1474[var2];
      SkeletonSet var3 = method685(var2 >> 16);
      var2 &= '\uffff';
      if(var3 == null) {
         return var1.method996(true);
      } else {
         Model var4 = var1.method996(!var3.method776(var2, (byte)-36));
         var4.method1001(var3, var2);
         return var4;
      }
   }

   public Model method678(Model var1, int var2, SequenceType var3, int var4) {
      var2 = this.anIntArray1474[var2];
      SkeletonSet var6 = method685(var2 >> 16);
      var2 &= '\uffff';
      if(var6 == null) {
         return var3.method681(var1, var4);
      } else {
         var4 = var3.anIntArray1474[var4];
         SkeletonSet var7 = method685(var4 >> 16);
         var4 &= '\uffff';
         Model var5;
         if(var7 == null) {
            var5 = var1.method995(!var6.method776(var2, (byte)-108));
            var5.method1001(var6, var2);
            return var5;
         } else {
            var5 = var1.method995(!var6.method776(var2, (byte)-102) & !var7.method776(var4, (byte)-72));
            var5.method1006(var6, var2, var7, var4, this.anIntArray1478);
            return var5;
         }
      }
   }

   public Model method679(Model var1, int var2) {
      int var3 = this.anIntArray1474[var2];
      SkeletonSet var4 = method685(var3 >> 16);
      var3 &= '\uffff';
      if(var4 == null) {
         return var1.method995(true);
      } else {
         SkeletonSet var5 = null;
         int var6 = 0;
         if(this.anIntArray1485 != null && var2 < this.anIntArray1485.length) {
            var6 = this.anIntArray1485[var2];
            var5 = method685(var6 >> 16);
            var6 &= '\uffff';
         }

         Model var7;
         if(var5 != null && var6 != '\uffff') {
            var7 = var1.method995(!var4.method776(var3, (byte)-35) & !var5.method776(var6, (byte)-91));
            var7.method1001(var4, var3);
            var7.method1001(var5, var6);
            return var7;
         } else {
            var7 = var1.method995(!var4.method776(var3, (byte)-103));
            var7.method1001(var4, var3);
            return var7;
         }
      }
   }

   public static Sprite getSprite(AbstractIndex index, String iFile, String iChild) {
      int fileId = index.getFile(iFile);
      int childId = index.getChild(fileId, iChild);
      System.out.println(iFile + ", (8, " + fileId + ", " + childId + ")");
      Sprite sprite;
      if(!Class35.decodeSprite(index, fileId, childId)) {
         sprite = null;
      } else {
         sprite = BoundaryStub.set();
      }

      return sprite;
   }

   public Model method681(Model var1, int var2) {
      var2 = this.anIntArray1474[var2];
      SkeletonSet var4 = method685(var2 >> 16);
      var2 &= '\uffff';
      if(var4 == null) {
         return var1.method995(true);
      } else {
         Model var3 = var1.method995(!var4.method776(var2, (byte)-78));
         var3.method1001(var4, var2);
         return var3;
      }
   }

   static void method682(Widget var0, int var1, int var2) {
      if(var0.anInt1132 == 0) {
         var0.relativeX = var0.anInt1134 * -459849887;
      } else if(var0.anInt1132 == 1) {
         var0.relativeX = (var1 - var0.width) / 2 + var0.anInt1134 * -459849887;
      } else if(var0.anInt1132 == 2) {
         var0.relativeX = var1 - var0.width - var0.anInt1134 * -459849887;
      } else if(var0.anInt1132 == 3) {
         var0.relativeX = var0.anInt1134 * -459849887 * var1 >> 14;
      } else if(var0.anInt1132 == 4) {
         var0.relativeX = (var1 - var0.width) / 2 + (var0.anInt1134 * var1 * -459849887 >> 14);
      } else {
         var0.relativeX = var1 - var0.width - (var1 * -459849887 * var0.anInt1134 >> 14);
      }

      if(var0.anInt1122 == 0) {
         var0.relativeY = var0.anInt1185 * 538516377;
      } else if(var0.anInt1122 == 1) {
         var0.relativeY = var0.anInt1185 * 538516377 + (var2 - var0.height * 1227800423) / 2;
      } else if(var0.anInt1122 == 2) {
         var0.relativeY = var2 - var0.height * 1227800423 - var0.anInt1185 * 538516377;
      } else if(var0.anInt1122 == 3) {
         var0.relativeY = var2 * 538516377 * var0.anInt1185 >> 14;
      } else if(var0.anInt1122 == 4) {
         var0.relativeY = (var2 - var0.height * 1227800423) / 2 + (var0.anInt1185 * 538516377 * var2 >> 14);
      } else {
         var0.relativeY = var2 - var0.height * 1227800423 - (var2 * 538516377 * var0.anInt1185 >> 14);
      }

      if(Client.aBool2024 && var0.type == 0) {
         if(var0.relativeX < 0) {
            var0.relativeX = 0;
         } else if(var0.width + var0.relativeX > var1) {
            var0.relativeX = var1 - var0.width;
         }

         if(var0.relativeY < 0) {
            var0.relativeY = 0;
         } else if(var0.relativeY + var0.height * 1227800423 > var2) {
            var0.relativeY = var2 - var0.height * 1227800423;
         }
      }

   }

   public static int djb2Hash(CharSequence var0) {
      int var1 = var0.length();
      int var3 = 0;

      for(int var2 = 0; var2 < var1; var2++) {
         var3 = (var3 << 5) - var3 + IgnoredPlayer.method414(var0.charAt(var2));
      }

      return var3;
   }

   static final void method684(String var0) {
      if(var0 != null) {
         String var3 = VarPlayerType.method728(var0, Class48_Sub1.aClass124_1297);
         if(var3 != null) {
            for(int var1 = 0; var1 < Client.anInt2184; var1++) {
               FriendedPlayer var2 = Client.friendedPlayers[var1];
               String var4 = var2.displayName;
               String var5 = VarPlayerType.method728(var4, Class48_Sub1.aClass124_1297);
               if(ItemTable.method646(var0, var3, var4, var5)) {
                  --Client.anInt2184;

                  for(int var6 = var1; var6 < Client.anInt2184; var6++) {
                     Client.friendedPlayers[var6] = Client.friendedPlayers[var6 + 1];
                  }

                  Client.anInt2114 = Client.anInt2151;
                  Client.outBuffer.putHeader(210);
                  Client.outBuffer.putByte(TileDecorationStub.getLength(var0));
                  Client.outBuffer.putString(var0);
                  break;
               }
            }
         }
      }

   }

   static SkeletonSet method685(int var0) {
      SkeletonSet var1 = (SkeletonSet)aClass106_1473.get((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         AbstractIndex var2 = aClass87_1470;
         AbstractIndex var3 = aClass87_1471;
         boolean var4 = true;
         int[] var5 = var2.getChilds(var0);

         for(int var10 = 0; var10 < var5.length; var10++) {
            byte[] var11 = var2.method390(var0, var5[var10]);
            if(var11 == null) {
               var4 = false;
            } else {
               int var8 = (var11[0] & 0xff) << 8 | var11[1] & 0xff;
               byte[] var9 = var3.method390(var8, 0);
               if(var9 == null) {
                  var4 = false;
               }
            }
         }

         SkeletonSet var111;
         if(!var4) {
            var111 = null;
         } else {
            try {
               var111 = new SkeletonSet(var2, var3, var0, false);
            } catch (Exception var101) {
               var111 = null;
            }
         }

         if(var111 != null) {
            aClass106_1473.put(var111, (long)var0);
         }

         return var111;
      }
   }

}
