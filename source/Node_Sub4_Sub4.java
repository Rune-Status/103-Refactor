public class Node_Sub4_Sub4 extends Node_Sub4 {

   int anInt1656 = 256;
   long aLong1658;
   int anInt1677;
   int anInt1678;
   long aLong1680;
   boolean aBool1676;
   int[] anIntArray1655 = new int[16];
   int anInt1657 = 357779008;
   int[] anIntArray1659 = new int[16];
   int[] anIntArray1660 = new int[16];
   int[] anIntArray1661 = new int[16];
   int[] anIntArray1662 = new int[16];
   int[] anIntArray1663 = new int[16];
   int[] anIntArray1664 = new int[16];
   Node_Sub14[][] aNode_Sub14ArrayArray1665 = new Node_Sub14[16][128];
   int[] anIntArray1666 = new int[16];
   int[] anIntArray1667 = new int[16];
   NodeTable aNodeTable1668 = new NodeTable(128);
   int[] anIntArray1669 = new int[16];
   int[] anIntArray1670 = new int[16];
   int[] anIntArray1671 = new int[16];
   int[] anIntArray1672 = new int[16];
   Node_Sub14[][] aNode_Sub14ArrayArray1673 = new Node_Sub14[16][128];
   int[] anIntArray1674 = new int[16];
   Class80 aClass80_1675 = new Class80();
   int[] anIntArray1679 = new int[16];
   Node_Sub4_Sub3 aNode_Sub4_Sub3_1681 = new Node_Sub4_Sub3(this);

   void method826(int var1) {
      if(var1 >= 0) {
         this.anIntArray1674[var1] = 12800;
         this.anIntArray1659[var1] = 8192;
         this.anIntArray1660[var1] = 16383;
         this.anIntArray1664[var1] = 8192;
         this.anIntArray1666[var1] = 0;
         this.anIntArray1679[var1] = 8192;
         this.method841(var1);
         this.method842(var1);
         this.anIntArray1667[var1] = 0;
         this.anIntArray1670[var1] = 32767;
         this.anIntArray1669[var1] = 256;
         this.anIntArray1663[var1] = 0;
         this.method854(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; var1++) {
            this.method826(var1);
         }
      }

   }

   public synchronized void method827(int var1) {
      this.anInt1656 = var1;
   }

   public int method828() {
      return this.anInt1656;
   }

   public synchronized boolean method829(MusicFile var1, AbstractIndex var2, Class13 var3, int var4) {
      var1.method570();
      boolean var7 = true;
      int[] var6 = null;
      if(var4 > 0) {
         var6 = new int[]{var4};
      }

      for(Node_Sub15 var8 = (Node_Sub15)var1.aNodeTable1365.method150(); var8 != null; var8 = (Node_Sub15)var1.aNodeTable1365.method151()) {
         int var9 = (int)var8.key;
         Node_Sub12 var5 = (Node_Sub12)this.aNodeTable1668.get((long)var9);
         if(var5 == null) {
            byte[] var10 = var2.method378(var9);
            Node_Sub12 var11;
            if(var10 == null) {
               var11 = null;
            } else {
               var11 = new Node_Sub12(var10);
            }

            var5 = var11;
            if(var11 == null) {
               var7 = false;
               continue;
            }

            this.aNodeTable1668.put(var11, (long)var9);
         }

         if(!var5.method574(var3, var8.aByteArray1418, var6)) {
            var7 = false;
         }
      }

      if(var7) {
         var1.method571();
      }

      return var7;
   }

   public synchronized void method830() {
      for(Node_Sub12 var1 = (Node_Sub12)this.aNodeTable1668.method150(); var1 != null; var1 = (Node_Sub12)this.aNodeTable1668.method151()) {
         var1.method573();
      }

   }

   public synchronized boolean method831() {
      return this.aClass80_1675.method357();
   }

   public synchronized void method832(int var1, int var2) {
      this.method833(var1, var2);
   }

   void method833(int var1, int var2) {
      this.anIntArray1661[var1] = var2;
      this.anIntArray1655[var1] = var2 & 0xffffff80;
      this.method834(var1, var2);
   }

   void method834(int var1, int var2) {
      if(this.anIntArray1662[var1] != var2) {
         this.anIntArray1662[var1] = var2;

         for(int var3 = 0; var3 < 128; var3++) {
            this.aNode_Sub14ArrayArray1673[var1][var3] = null;
         }
      }

   }

   int method835(Node_Sub14 var1) {
      Class109 var2 = var1.aClass109_1381;
      int var3 = this.anIntArray1660[var1.anInt1379] * this.anIntArray1674[var1.anInt1379] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var1.anInt1382 * var3 + 16384 >> 15;
      var3 = this.anInt1656 * var3 + 128 >> 8;
      if(var2.anInt773 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, (double)var1.anInt1396 * 1.953125E-5D * (double)var2.anInt773) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if(var2.aByteArray772 != null) {
         var7 = var1.anInt1390;
         var6 = var2.aByteArray772[var1.anInt1389 + 1];
         if(var1.anInt1389 < var2.aByteArray772.length - 2) {
            var4 = (var2.aByteArray772[var1.anInt1389] & 0xff) << 8;
            var5 = (var2.aByteArray772[var1.anInt1389 + 2] & 0xff) << 8;
            var6 += (var2.aByteArray772[var1.anInt1389 + 3] - var6) * (var7 - var4) / (var5 - var4);
         }

         var3 = var3 * var6 + 32 >> 6;
      }

      if(var1.anInt1376 > 0 && var2.aByteArray778 != null) {
         var7 = var1.anInt1376;
         var6 = var2.aByteArray778[var1.anInt1377 + 1];
         if(var1.anInt1377 < var2.aByteArray778.length - 2) {
            var4 = (var2.aByteArray778[var1.anInt1377] & 0xff) << 8;
            var5 = (var2.aByteArray778[var1.anInt1377 + 2] & 0xff) << 8;
            var6 += (var7 - var4) * (var2.aByteArray778[var1.anInt1377 + 3] - var6) / (var5 - var4);
         }

         var3 = var6 * var3 + 32 >> 6;
      }

      return var3;
   }

   void method836(int var1, int var2, int var3) {
      Node_Sub14 var4 = this.aNode_Sub14ArrayArray1665[var1][var2];
      if(var4 != null) {
         this.aNode_Sub14ArrayArray1665[var1][var2] = null;
         if((this.anIntArray1667[var1] & 0x2) != 0) {
            for(Node_Sub14 var5 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getFront(); var5 != null; var5 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getNext()) {
               if(var5.anInt1379 == var4.anInt1379 && var5.anInt1376 < 0 && var5 != var4) {
                  var4.anInt1376 = 0;
                  break;
               }
            }
         } else {
            var4.anInt1376 = 0;
         }
      }

   }

   void method837(int var1, int var2, int var3) {
   }

   void method838(int var1, int var2) {
      this.anIntArray1664[var1] = var2;
   }

   void method839(int var1) {
      for(Node_Sub14 var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getFront(); var2 != null; var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getNext()) {
         if(var1 < 0 || var2.anInt1379 == var1) {
            if(var2.aNode_Sub4_Sub2_1394 != null) {
               var2.aNode_Sub4_Sub2_1394.method748(AbstractSoundSystem.sampleRate / 100);
               if(var2.aNode_Sub4_Sub2_1394.method751()) {
                  this.aNode_Sub4_Sub3_1681.aNode_Sub4_Sub1_1653.method729(var2.aNode_Sub4_Sub2_1394);
               }

               var2.method575();
            }

            if(var2.anInt1376 < 0) {
               this.aNode_Sub14ArrayArray1665[var2.anInt1379][var2.anInt1391] = null;
            }

            var2.unlink();
         }
      }

   }

   void method840(Node_Sub14 var1, boolean var2) {
      int var3 = var1.aNode_Sub2_Sub1_1378.aByteArray1543.length;
      int var4;
      if(var2 && var1.aNode_Sub2_Sub1_1378.aBool1539) {
         int var5 = var3 + var3 - var1.aNode_Sub2_Sub1_1378.anInt1541;
         var4 = (int)((long)this.anIntArray1663[var1.anInt1379] * (long)var5 >> 6);
         var3 <<= 8;
         if(var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.aNode_Sub4_Sub2_1394.method746(true);
         }
      } else {
         var4 = (int)((long)var3 * (long)this.anIntArray1663[var1.anInt1379] >> 6);
      }

      var1.aNode_Sub4_Sub2_1394.method745(var4);
   }

   void method841(int var1) {
      if((this.anIntArray1667[var1] & 0x2) != 0) {
         for(Node_Sub14 var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getFront(); var2 != null; var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getNext()) {
            if(var2.anInt1379 == var1 && this.aNode_Sub14ArrayArray1665[var1][var2.anInt1391] == null && var2.anInt1376 < 0) {
               var2.anInt1376 = 0;
            }
         }
      }

   }

   void method842(int var1) {
      if((this.anIntArray1667[var1] & 0x4) != 0) {
         for(Node_Sub14 var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getFront(); var2 != null; var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getNext()) {
            if(var2.anInt1379 == var1) {
               var2.anInt1388 = 0;
            }
         }
      }

   }

   void method843(int var1) {
      int var2 = var1 & 0xf0;
      int var3;
      int var4;
      int var5;
      if(var2 == 128) {
         var3 = var1 & 0xf;
         var5 = var1 >> 8 & 0x7f;
         var4 = var1 >> 16 & 0x7f;
         this.method836(var3, var5, var4);
      } else if(var2 == 144) {
         var3 = var1 & 0xf;
         var5 = var1 >> 8 & 0x7f;
         var4 = var1 >> 16 & 0x7f;
         if(var4 > 0) {
            this.method853(var3, var5, var4);
         } else {
            this.method836(var3, var5, 64);
         }
      } else if(var2 == 160) {
         var3 = var1 & 0xf;
         var5 = var1 >> 8 & 0x7f;
         var4 = var1 >> 16 & 0x7f;
         this.method837(var3, var5, var4);
      } else if(var2 == 176) {
         var3 = var1 & 0xf;
         var5 = var1 >> 8 & 0x7f;
         var4 = var1 >> 16 & 0x7f;
         if(var5 == 0) {
            this.anIntArray1655[var3] = (var4 << 14) + (this.anIntArray1655[var3] & 0xffe03fff);
         }

         if(var5 == 32) {
            this.anIntArray1655[var3] = (this.anIntArray1655[var3] & 0xffffc07f) + (var4 << 7);
         }

         if(var5 == 1) {
            this.anIntArray1666[var3] = (this.anIntArray1666[var3] & 0xffffc07f) + (var4 << 7);
         }

         if(var5 == 33) {
            this.anIntArray1666[var3] = (this.anIntArray1666[var3] & 0xffffff80) + var4;
         }

         if(var5 == 5) {
            this.anIntArray1679[var3] = (var4 << 7) + (this.anIntArray1679[var3] & 0xffffc07f);
         }

         if(var5 == 37) {
            this.anIntArray1679[var3] = (this.anIntArray1679[var3] & 0xffffff80) + var4;
         }

         if(var5 == 7) {
            this.anIntArray1674[var3] = (this.anIntArray1674[var3] & 0xffffc07f) + (var4 << 7);
         }

         if(var5 == 39) {
            this.anIntArray1674[var3] = (this.anIntArray1674[var3] & 0xffffff80) + var4;
         }

         if(var5 == 10) {
            this.anIntArray1659[var3] = (this.anIntArray1659[var3] & 0xffffc07f) + (var4 << 7);
         }

         if(var5 == 42) {
            this.anIntArray1659[var3] = (this.anIntArray1659[var3] & 0xffffff80) + var4;
         }

         if(var5 == 11) {
            this.anIntArray1660[var3] = (var4 << 7) + (this.anIntArray1660[var3] & 0xffffc07f);
         }

         if(var5 == 43) {
            this.anIntArray1660[var3] = (this.anIntArray1660[var3] & 0xffffff80) + var4;
         }

         if(var5 == 64) {
            if(var4 >= 64) {
               this.anIntArray1667[var3] |= 1;
            } else {
               this.anIntArray1667[var3] &= -2;
            }
         }

         if(var5 == 65) {
            if(var4 >= 64) {
               this.anIntArray1667[var3] |= 2;
            } else {
               this.method841(var3);
               this.anIntArray1667[var3] &= -3;
            }
         }

         if(var5 == 99) {
            this.anIntArray1670[var3] = (this.anIntArray1670[var3] & 0x7f) + (var4 << 7);
         }

         if(var5 == 98) {
            this.anIntArray1670[var3] = (this.anIntArray1670[var3] & 0x3f80) + var4;
         }

         if(var5 == 101) {
            this.anIntArray1670[var3] = (var4 << 7) + (this.anIntArray1670[var3] & 0x7f) + 16384;
         }

         if(var5 == 100) {
            this.anIntArray1670[var3] = (this.anIntArray1670[var3] & 0x3f80) + 16384 + var4;
         }

         if(var5 == 120) {
            this.method839(var3);
         }

         if(var5 == 121) {
            this.method826(var3);
         }

         if(var5 == 123) {
            this.method851(var3);
         }

         int var6;
         if(var5 == 6) {
            var6 = this.anIntArray1670[var3];
            if(var6 == 16384) {
               this.anIntArray1669[var3] = (var4 << 7) + (this.anIntArray1669[var3] & 0xffffc07f);
            }
         }

         if(var5 == 38) {
            var6 = this.anIntArray1670[var3];
            if(var6 == 16384) {
               this.anIntArray1669[var3] = (this.anIntArray1669[var3] & 0xffffff80) + var4;
            }
         }

         if(var5 == 16) {
            this.anIntArray1663[var3] = (var4 << 7) + (this.anIntArray1663[var3] & 0xffffc07f);
         }

         if(var5 == 48) {
            this.anIntArray1663[var3] = (this.anIntArray1663[var3] & 0xffffff80) + var4;
         }

         if(var5 == 81) {
            if(var4 >= 64) {
               this.anIntArray1667[var3] |= 4;
            } else {
               this.method842(var3);
               this.anIntArray1667[var3] &= -5;
            }
         }

         if(var5 == 17) {
            this.method854(var3, (var4 << 7) + (this.anIntArray1671[var3] & 0xffffc07f));
         }

         if(var5 == 49) {
            this.method854(var3, (this.anIntArray1671[var3] & 0xffffff80) + var4);
         }
      } else if(var2 == 192) {
         var3 = var1 & 0xf;
         var5 = var1 >> 8 & 0x7f;
         this.method834(var3, this.anIntArray1655[var3] + var5);
      } else if(var2 == 208) {
         var3 = var1 & 0xf;
         var5 = var1 >> 8 & 0x7f;
         this.method850(var3, var5);
      } else if(var2 == 224) {
         var3 = var1 & 0xf;
         var5 = (var1 >> 9 & 0x3f80) + (var1 >> 8 & 0x7f);
         this.method838(var3, var5);
      } else {
         var2 = var1 & 0xff;
         if(var2 == 255) {
            this.method852();
         }
      }

   }

   public synchronized void method844() {
      for(Node_Sub12 var1 = (Node_Sub12)this.aNodeTable1668.method150(); var1 != null; var1 = (Node_Sub12)this.aNodeTable1668.method151()) {
         var1.unlink();
      }

   }

   int method845(Node_Sub14 var1) {
      int var2 = var1.anInt1384 + (var1.anInt1386 * -1856256381 * var1.anInt1385 * 267719497 >> 12);
      var2 += this.anIntArray1669[var1.anInt1379] * (this.anIntArray1664[var1.anInt1379] - 8192) >> 12;
      Class109 var3 = var1.aClass109_1381;
      int var4;
      if(var3.anInt780 > 0 && (var3.anInt777 > 0 || this.anIntArray1666[var1.anInt1379] > 0)) {
         var4 = var3.anInt777 << 2;
         int var5 = var3.anInt779 << 1;
         if(var1.anInt1392 < var5) {
            var4 = var1.anInt1392 * var4 / var5;
         }

         var4 += this.anIntArray1666[var1.anInt1379] >> 7;
         double var6 = Math.sin((double)(var1.anInt1393 & 0x1ff) * 0.01227184630308513D);
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.aNode_Sub2_Sub1_1378.anInt1542 * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)AbstractSoundSystem.sampleRate + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   int method846(Node_Sub14 var1) {
      int var2 = this.anIntArray1659[var1.anInt1379];
      return var2 >= 8192 ? 16384 - ((16384 - var2) * (128 - var1.anInt1383) + 32 >> 6) : var1.anInt1383 * var2 + 32 >> 6;
   }

   protected synchronized Node_Sub4 method526() {
      return this.aNode_Sub4_Sub3_1681;
   }

   protected synchronized Node_Sub4 method529() {
      return null;
   }

   protected synchronized int method527() {
      return 0;
   }

   protected synchronized void method530(int[] var1, int var2, int var3) {
      if(this.aClass80_1675.method357()) {
         int var5 = this.aClass80_1675.anInt657 * this.anInt1657 * 332692849 / AbstractSoundSystem.sampleRate;

         do {
            long var6 = this.aLong1658 * -3956681610824063275L + (long)var5 * (long)var3;
            if(this.aLong1680 - var6 >= 0L) {
               this.aLong1658 = var6 * 6345129286088335997L;
               break;
            }

            int var4 = (int)(((long)var5 + (this.aLong1680 - this.aLong1658 * -3956681610824063275L) - 1L) / (long)var5);
            this.aLong1658 += (long)var4 * (long)var5 * 6345129286088335997L;
            this.aNode_Sub4_Sub3_1681.method530(var1, var2, var4);
            var2 += var4;
            var3 -= var4;
            this.method847();
         } while(this.aClass80_1675.method357());
      }

      this.aNode_Sub4_Sub3_1681.method530(var1, var2, var3);
   }

   protected synchronized void method528(int var1) {
      if(this.aClass80_1675.method357()) {
         int var5 = this.aClass80_1675.anInt657 * this.anInt1657 * 332692849 / AbstractSoundSystem.sampleRate;

         do {
            long var3 = (long)var1 * (long)var5 + this.aLong1658 * -3956681610824063275L;
            if(this.aLong1680 - var3 >= 0L) {
               this.aLong1658 = var3 * 6345129286088335997L;
               break;
            }

            int var2 = (int)(((long)var5 + (this.aLong1680 - this.aLong1658 * -3956681610824063275L) - 1L) / (long)var5);
            this.aLong1658 += (long)var2 * 6345129286088335997L * (long)var5;
            this.aNode_Sub4_Sub3_1681.method528(var2);
            var1 -= var2;
            this.method847();
         } while(this.aClass80_1675.method357());
      }

      this.aNode_Sub4_Sub3_1681.method528(var1);
   }

   void method847() {
      int var1 = this.anInt1677;
      int var2 = this.anInt1678;

      long var4;
      for(var4 = this.aLong1680; this.anInt1678 == var2; var4 = this.aClass80_1675.method352(var2)) {
         while(this.aClass80_1675.anIntArray659[var1] == var2) {
            this.aClass80_1675.method349(var1);
            int var3 = this.aClass80_1675.method356(var1);
            if(var3 == 1) {
               this.aClass80_1675.method359();
               this.aClass80_1675.method350(var1);
               if(this.aClass80_1675.method355()) {
                  if(!this.aBool1676 || var2 == 0) {
                     this.method852();
                     this.aClass80_1675.method347();
                     return;
                  }

                  this.aClass80_1675.method354(var4);
               }
               break;
            }

            if((var3 & 0x80) != 0) {
               this.method843(var3);
            }

            this.aClass80_1675.method360(var1);
            this.aClass80_1675.method350(var1);
         }

         var1 = this.aClass80_1675.method353();
         var2 = this.aClass80_1675.anIntArray659[var1];
      }

      this.anInt1677 = var1;
      this.anInt1678 = var2;
      this.aLong1680 = var4;
   }

   boolean method848(Node_Sub14 var1, int[] var2, int var3, int var4) {
      var1.anInt1395 = AbstractSoundSystem.sampleRate / 100;
      if(var1.anInt1376 < 0 || var1.aNode_Sub4_Sub2_1394 != null && !var1.aNode_Sub4_Sub2_1394.method750()) {
         int var8 = var1.anInt1386 * -1856256381;
         if(var8 > 0) {
            var8 -= (int)(Math.pow(2.0D, (double)this.anIntArray1679[var1.anInt1379] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if(var8 < 0) {
               var8 = 0;
            }

            var1.anInt1386 = var8 * -723306453;
         }

         var1.aNode_Sub4_Sub2_1394.method749(this.method845(var1));
         Class109 var7 = var1.aClass109_1381;
         boolean var9 = false;
         ++var1.anInt1392;
         var1.anInt1393 += var7.anInt780;
         double var5 = (double)((var1.anInt1386 * -1856256381 * var1.anInt1385 * 267719497 >> 12) + (var1.anInt1391 - 60 << 8)) * 5.086263020833333E-6D;
         if(var7.anInt773 > 0) {
            if(var7.anInt776 > 0) {
               var1.anInt1396 += (int)(Math.pow(2.0D, (double)var7.anInt776 * var5) * 128.0D + 0.5D);
            } else {
               var1.anInt1396 += 128;
            }
         }

         if(var7.aByteArray772 != null) {
            if(var7.anInt774 > 0) {
               var1.anInt1390 += (int)(Math.pow(2.0D, (double)var7.anInt774 * var5) * 128.0D + 0.5D);
            } else {
               var1.anInt1390 += 128;
            }

            while(var1.anInt1389 < var7.aByteArray772.length - 2 && var1.anInt1390 > (var7.aByteArray772[var1.anInt1389 + 2] & 0xff) << 8) {
               var1.anInt1389 += 2;
            }

            if(var1.anInt1389 == var7.aByteArray772.length - 2 && var7.aByteArray772[var1.anInt1389 + 1] == 0) {
               var9 = true;
            }
         }

         if(var1.anInt1376 >= 0 && var7.aByteArray778 != null && (this.anIntArray1667[var1.anInt1379] & 0x1) == 0 && (var1.anInt1380 < 0 || this.aNode_Sub14ArrayArray1673[var1.anInt1379][var1.anInt1380] != var1)) {
            if(var7.anInt775 > 0) {
               var1.anInt1376 += (int)(Math.pow(2.0D, (double)var7.anInt775 * var5) * 128.0D + 0.5D);
            } else {
               var1.anInt1376 += 128;
            }

            while(var1.anInt1377 < var7.aByteArray778.length - 2 && var1.anInt1376 > (var7.aByteArray778[var1.anInt1377 + 2] & 0xff) << 8) {
               var1.anInt1377 += 2;
            }

            if(var7.aByteArray778.length - 2 == var1.anInt1377) {
               var9 = true;
            }
         }

         if(var9) {
            var1.aNode_Sub4_Sub2_1394.method748(var1.anInt1395);
            if(var2 != null) {
               var1.aNode_Sub4_Sub2_1394.method530(var2, var3, var4);
            } else {
               var1.aNode_Sub4_Sub2_1394.method528(var4);
            }

            if(var1.aNode_Sub4_Sub2_1394.method751()) {
               this.aNode_Sub4_Sub3_1681.aNode_Sub4_Sub1_1653.method729(var1.aNode_Sub4_Sub2_1394);
            }

            var1.method575();
            if(var1.anInt1376 >= 0) {
               var1.unlink();
               if(var1.anInt1380 > 0 && this.aNode_Sub14ArrayArray1673[var1.anInt1379][var1.anInt1380] == var1) {
                  this.aNode_Sub14ArrayArray1673[var1.anInt1379][var1.anInt1380] = null;
               }
            }

            return true;
         } else {
            var1.aNode_Sub4_Sub2_1394.method765(var1.anInt1395, this.method835(var1), this.method846(var1));
            return false;
         }
      } else {
         var1.method575();
         var1.unlink();
         if(var1.anInt1380 > 0 && this.aNode_Sub14ArrayArray1673[var1.anInt1379][var1.anInt1380] == var1) {
            this.aNode_Sub14ArrayArray1673[var1.anInt1379][var1.anInt1380] = null;
         }

         return true;
      }
   }

   boolean method849(Node_Sub14 var1) {
      if(var1.aNode_Sub4_Sub2_1394 == null) {
         if(var1.anInt1376 >= 0) {
            var1.unlink();
            if(var1.anInt1380 > 0 && this.aNode_Sub14ArrayArray1673[var1.anInt1379][var1.anInt1380] == var1) {
               this.aNode_Sub14ArrayArray1673[var1.anInt1379][var1.anInt1380] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void method850(int var1, int var2) {
   }

   void method851(int var1) {
      for(Node_Sub14 var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getFront(); var2 != null; var2 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.getNext()) {
         if((var1 < 0 || var2.anInt1379 == var1) && var2.anInt1376 < 0) {
            this.aNode_Sub14ArrayArray1665[var2.anInt1379][var2.anInt1391] = null;
            var2.anInt1376 = 0;
         }
      }

   }

   void method852() {
      this.method839(-1);
      this.method826(-1);

      int var1;
      for(var1 = 0; var1 < 16; var1++) {
         this.anIntArray1662[var1] = this.anIntArray1661[var1];
      }

      for(var1 = 0; var1 < 16; var1++) {
         this.anIntArray1655[var1] = this.anIntArray1661[var1] & 0xffffff80;
      }

   }

   void method853(int var1, int var2, int var3) {
      this.method836(var1, var2, 64);
      if((this.anIntArray1667[var1] & 0x2) != 0) {
         for(Node_Sub14 var8 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.method472(); var8 != null; var8 = (Node_Sub14)this.aNode_Sub4_Sub3_1681.aDeque1652.method476()) {
            if(var8.anInt1379 == var1 && var8.anInt1376 < 0) {
               this.aNode_Sub14ArrayArray1665[var1][var8.anInt1391] = null;
               this.aNode_Sub14ArrayArray1665[var1][var2] = var8;
               int var9 = var8.anInt1384 + (var8.anInt1385 * 267719497 * -1856256381 * var8.anInt1386 >> 12);
               var8.anInt1384 += var2 - var8.anInt1391 << 8;
               var8.anInt1385 = (var9 - var8.anInt1384) * -1732227335;
               var8.anInt1386 = 864202752;
               var8.anInt1391 = var2;
               return;
            }
         }
      }

      Node_Sub12 var81 = (Node_Sub12)this.aNodeTable1668.get((long)this.anIntArray1662[var1]);
      if(var81 != null) {
         Node_Sub2_Sub1 var91 = var81.aNode_Sub2_Sub1Array1374[var2];
         if(var91 != null) {
            Node_Sub14 var7 = new Node_Sub14();
            var7.anInt1379 = var1;
            var7.aNode_Sub12_1387 = var81;
            var7.aNode_Sub2_Sub1_1378 = var91;
            var7.aClass109_1381 = var81.aClass109Array1370[var2];
            var7.anInt1380 = var81.aByteArray1371[var2];
            var7.anInt1391 = var2;
            var7.anInt1382 = var81.aByteArray1372[var2] * var81.anInt1367 * -822371327 * var3 * var3 + 1024 >> 11;
            var7.anInt1383 = var81.aByteArray1369[var2] & 0xff;
            var7.anInt1384 = (var2 << 8) - (var81.aShortArray1368[var2] & 0x7fff);
            var7.anInt1396 = 0;
            var7.anInt1390 = 0;
            var7.anInt1389 = 0;
            var7.anInt1376 = -1;
            var7.anInt1377 = 0;
            if(this.anIntArray1663[var1] == 0) {
               var7.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var91, this.method845(var7), this.method835(var7), this.method846(var7));
            } else {
               var7.aNode_Sub4_Sub2_1394 = Node_Sub4_Sub2.method737(var91, this.method845(var7), 0, this.method846(var7));
               this.method840(var7, var81.aShortArray1368[var2] < 0);
            }

            if(var81.aShortArray1368[var2] < 0) {
               var7.aNode_Sub4_Sub2_1394.method740(-1);
            }

            if(var7.anInt1380 >= 0) {
               Node_Sub14 var5 = this.aNode_Sub14ArrayArray1673[var1][var7.anInt1380];
               if(var5 != null && var5.anInt1376 < 0) {
                  this.aNode_Sub14ArrayArray1665[var1][var5.anInt1391] = null;
                  var5.anInt1376 = 0;
               }

               this.aNode_Sub14ArrayArray1673[var1][var7.anInt1380] = var7;
            }

            this.aNode_Sub4_Sub3_1681.aDeque1652.method475(var7);
            this.aNode_Sub14ArrayArray1665[var1][var2] = var7;
         }
      }

   }

   void method854(int var1, int var2) {
      this.anIntArray1671[var1] = var2;
      this.anIntArray1672[var1] = (int)(Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
   }

   public synchronized void method855(MusicFile var1, boolean var2) {
      this.method856();
      this.aClass80_1675.method346(var1.aByteArray1366);
      this.aBool1676 = var2;
      this.aLong1658 = 0L;
      int var4 = this.aClass80_1675.method348();

      for(int var3 = 0; var3 < var4; var3++) {
         this.aClass80_1675.method349(var3);
         this.aClass80_1675.method360(var3);
         this.aClass80_1675.method350(var3);
      }

      this.anInt1677 = this.aClass80_1675.method353();
      this.anInt1678 = this.aClass80_1675.anIntArray659[this.anInt1677];
      this.aLong1680 = this.aClass80_1675.method352(this.anInt1678);
   }

   public synchronized void method856() {
      this.aClass80_1675.method347();
      this.method852();
   }

   public Node_Sub4_Sub4() {
      this.method852();
   }

}
