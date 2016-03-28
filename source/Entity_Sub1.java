public class Entity_Sub1 extends Entity {

   int anInt1770 = 0;
   int anInt1734 = 0;
   int anInt1745;
   int[] anIntArray1731;
   int[] anIntArray1732;
   int[] anIntArray1733;
   int[] anIntArray1756;
   int[] anIntArray1736;
   int[] anIntArray1737;
   byte[] aByteArray1746;
   short[] aShortArray1747;
   short[] aShortArray1748;
   short[] aShortArray1738;
   int[] anIntArray1741;
   byte[] aByteArray1744;
   byte[] aByteArray1730;
   short[] aShortArray1743;
   byte aByte1749 = 0;
   byte[] aByteArray1739;
   byte[] aByteArray1752;
   int[] anIntArray1772;
   short[] aShortArray1753;
   boolean aBool1775 = false;
   short[] aShortArray1750;
   short[] aShortArray1751;
   short[] aShortArray1767;
   short[] aShortArray1768;
   byte[] aByteArray1735;
   short[] aShortArray1754;
   short[] aShortArray1755;
   int[][] anIntArrayArray1759;
   int[][] anIntArrayArray1760;
   Class21[] aClass21Array1762;
   Class27[] aClass27Array1761;
   Class21[] aClass21Array1763;
   public short aShort1764;
   public short aShort1766;
   static int anInt1774;
   int anInt1757;
   int anInt1742;
   int anInt1769;
   int anInt1765;
   int anInt1771;
   static int[] anIntArray1740 = new int[10000];
   static int[] anIntArray1758;
   static int[] anIntArray1773;
   static int[] anIntArray1776;

   public void method886() {
      for(int var1 = 0; var1 < this.anInt1770; var1++) {
         int var2 = this.anIntArray1733[var1];
         this.anIntArray1733[var1] = this.anIntArray1731[var1];
         this.anIntArray1731[var1] = -var2;
      }

      this.method899();
   }

   public static Entity_Sub1 method887(AbstractIndex var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2);
      return var3 == null ? null : new Entity_Sub1(var3);
   }

   void decodeOldFormat(byte[] var1) {
      boolean var2 = false;
      boolean var9 = false;
      ByteBuf var5 = new ByteBuf(var1);
      ByteBuf var6 = new ByteBuf(var1);
      ByteBuf var7 = new ByteBuf(var1);
      ByteBuf var8 = new ByteBuf(var1);
      ByteBuf var38 = new ByteBuf(var1);
      var5.position = var1.length - 18;
      int var10 = var5.getUShort();
      int var11 = var5.getUShort();
      int var12 = var5.getUByte();
      int var42 = var5.getUByte();
      int var15 = var5.getUByte();
      int var16 = var5.getUByte();
      int var25 = var5.getUByte();
      int var17 = var5.getUByte();
      int var18 = var5.getUShort();
      int var19 = var5.getUShort();
      int var20 = var5.getUShort();
      int var21 = var5.getUShort();
      byte var13 = 0;
      int var46 = var13 + var10;
      int var24 = var46;
      var46 += var11;
      int var14 = var46;
      if(var15 == 255) {
         var46 += var11;
      }

      int var26 = var46;
      if(var25 == 1) {
         var46 += var11;
      }

      int var22 = var46;
      if(var42 == 1) {
         var46 += var11;
      }

      int var28 = var46;
      if(var17 == 1) {
         var46 += var10;
      }

      int var30 = var46;
      if(var16 == 1) {
         var46 += var11;
      }

      int var39 = var46;
      var46 += var21;
      int var34 = var46;
      var46 += var11 * 2;
      int var35 = var46;
      var46 += var12 * 6;
      int var36 = var46;
      var46 += var18;
      int var41 = var46;
      var46 += var19;
      int var10000 = var46 + var20;
      this.anInt1770 = var10;
      this.anInt1734 = var11;
      this.anInt1745 = var12;
      this.anIntArray1731 = new int[var10];
      this.anIntArray1732 = new int[var10];
      this.anIntArray1733 = new int[var10];
      this.anIntArray1756 = new int[var11];
      this.anIntArray1736 = new int[var11];
      this.anIntArray1737 = new int[var11];
      if(var12 > 0) {
         this.aByteArray1746 = new byte[var12];
         this.aShortArray1747 = new short[var12];
         this.aShortArray1748 = new short[var12];
         this.aShortArray1738 = new short[var12];
      }

      if(var17 == 1) {
         this.anIntArray1741 = new int[var10];
      }

      if(var42 == 1) {
         this.aByteArray1744 = new byte[var11];
         this.aByteArray1730 = new byte[var11];
         this.aShortArray1743 = new short[var11];
      }

      if(var15 == 255) {
         this.aByteArray1739 = new byte[var11];
      } else {
         this.aByte1749 = (byte)var15;
      }

      if(var16 == 1) {
         this.aByteArray1752 = new byte[var11];
      }

      if(var25 == 1) {
         this.anIntArray1772 = new int[var11];
      }

      this.aShortArray1753 = new short[var11];
      var5.position = var13;
      var6.position = var36;
      var7.position = var41;
      var8.position = var46;
      var38.position = var28;
      int var29 = 0;
      int var32 = 0;
      int var43 = 0;

      int var3;
      int var4;
      int var23;
      int var27;
      int var33;
      for(var23 = 0; var23 < var10; var23++) {
         var27 = var5.getUByte();
         var4 = 0;
         if((var27 & 0x1) != 0) {
            var4 = var6.getSmart();
         }

         var33 = 0;
         if((var27 & 0x2) != 0) {
            var33 = var7.getSmart();
         }

         var3 = 0;
         if((var27 & 0x4) != 0) {
            var3 = var8.getSmart();
         }

         this.anIntArray1731[var23] = var29 + var4;
         this.anIntArray1732[var23] = var32 + var33;
         this.anIntArray1733[var23] = var43 + var3;
         var29 = this.anIntArray1731[var23];
         var32 = this.anIntArray1732[var23];
         var43 = this.anIntArray1733[var23];
         if(var17 == 1) {
            this.anIntArray1741[var23] = var38.getUByte();
         }
      }

      var5.position = var34;
      var6.position = var22;
      var7.position = var14;
      var8.position = var30;
      var38.position = var26;

      for(var23 = 0; var23 < var11; var23++) {
         this.aShortArray1753[var23] = (short)var5.getUShort();
         if(var42 == 1) {
            var27 = var6.getUByte();
            if((var27 & 0x1) == 1) {
               this.aByteArray1744[var23] = 1;
               var2 = true;
            } else {
               this.aByteArray1744[var23] = 0;
            }

            if((var27 & 0x2) == 2) {
               this.aByteArray1730[var23] = (byte)(var27 >> 2);
               this.aShortArray1743[var23] = this.aShortArray1753[var23];
               this.aShortArray1753[var23] = 127;
               if(this.aShortArray1743[var23] != -1) {
                  var9 = true;
               }
            } else {
               this.aByteArray1730[var23] = -1;
               this.aShortArray1743[var23] = -1;
            }
         }

         if(var15 == 255) {
            this.aByteArray1739[var23] = var7.getByte();
         }

         if(var16 == 1) {
            this.aByteArray1752[var23] = var8.getByte();
         }

         if(var25 == 1) {
            this.anIntArray1772[var23] = var38.getUByte();
         }
      }

      var5.position = var39;
      var6.position = var24;
      var23 = 0;
      var27 = 0;
      var4 = 0;
      var33 = 0;

      int var31;
      int var44;
      for(var3 = 0; var3 < var11; var3++) {
         var31 = var6.getUByte();
         if(var31 == 1) {
            var23 = var5.getSmart() + var33;
            var27 = var5.getSmart() + var23;
            var4 = var5.getSmart() + var27;
            var33 = var4;
            this.anIntArray1756[var3] = var23;
            this.anIntArray1736[var3] = var27;
            this.anIntArray1737[var3] = var4;
         }

         if(var31 == 2) {
            var27 = var4;
            var4 = var5.getSmart() + var33;
            var33 = var4;
            this.anIntArray1756[var3] = var23;
            this.anIntArray1736[var3] = var27;
            this.anIntArray1737[var3] = var4;
         }

         if(var31 == 3) {
            var23 = var4;
            var4 = var5.getSmart() + var33;
            var33 = var4;
            this.anIntArray1756[var3] = var23;
            this.anIntArray1736[var3] = var27;
            this.anIntArray1737[var3] = var4;
         }

         if(var31 == 4) {
            var44 = var23;
            var23 = var27;
            var27 = var44;
            var4 = var5.getSmart() + var33;
            var33 = var4;
            this.anIntArray1756[var3] = var23;
            this.anIntArray1736[var3] = var44;
            this.anIntArray1737[var3] = var4;
         }
      }

      var5.position = var35;

      for(var3 = 0; var3 < var12; var3++) {
         this.aByteArray1746[var3] = 0;
         this.aShortArray1747[var3] = (short)var5.getUShort();
         this.aShortArray1748[var3] = (short)var5.getUShort();
         this.aShortArray1738[var3] = (short)var5.getUShort();
      }

      if(this.aByteArray1730 != null) {
         boolean var45 = false;

         for(var31 = 0; var31 < var11; var31++) {
            var44 = this.aByteArray1730[var31] & 0xff;
            if(var44 != 255) {
               if((this.aShortArray1747[var44] & 0xffff) == this.anIntArray1756[var31] && (this.aShortArray1748[var44] & 0xffff) == this.anIntArray1736[var31] && (this.aShortArray1738[var44] & 0xffff) == this.anIntArray1737[var31]) {
                  this.aByteArray1730[var31] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if(!var45) {
            this.aByteArray1730 = null;
         }
      }

      if(!var9) {
         this.aShortArray1743 = null;
      }

      if(!var2) {
         this.aByteArray1744 = null;
      }

   }

   public Entity_Sub1(Entity_Sub1[] var1, int var2) {
      boolean var11 = false;
      boolean var5 = false;
      boolean var7 = false;
      boolean var6 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.anInt1770 = 0;
      this.anInt1734 = 0;
      this.anInt1745 = 0;
      this.aByte1749 = -1;

      Entity_Sub1 var3;
      int var10;
      for(var10 = 0; var10 < var2; var10++) {
         var3 = var1[var10];
         if(var3 != null) {
            this.anInt1770 += var3.anInt1770;
            this.anInt1734 += var3.anInt1734;
            this.anInt1745 += var3.anInt1745;
            if(var3.aByteArray1739 != null) {
               var5 = true;
            } else {
               if(this.aByte1749 == -1) {
                  this.aByte1749 = var3.aByte1749;
               }

               if(this.aByte1749 != var3.aByte1749) {
                  var5 = true;
               }
            }

            var11 |= var3.aByteArray1744 != null;
            var7 |= var3.aByteArray1752 != null;
            var6 |= var3.anIntArray1772 != null;
            var8 |= var3.aShortArray1743 != null;
            var9 |= var3.aByteArray1730 != null;
         }
      }

      this.anIntArray1731 = new int[this.anInt1770];
      this.anIntArray1732 = new int[this.anInt1770];
      this.anIntArray1733 = new int[this.anInt1770];
      this.anIntArray1741 = new int[this.anInt1770];
      this.anIntArray1756 = new int[this.anInt1734];
      this.anIntArray1736 = new int[this.anInt1734];
      this.anIntArray1737 = new int[this.anInt1734];
      if(var11) {
         this.aByteArray1744 = new byte[this.anInt1734];
      }

      if(var5) {
         this.aByteArray1739 = new byte[this.anInt1734];
      }

      if(var7) {
         this.aByteArray1752 = new byte[this.anInt1734];
      }

      if(var6) {
         this.anIntArray1772 = new int[this.anInt1734];
      }

      if(var8) {
         this.aShortArray1743 = new short[this.anInt1734];
      }

      if(var9) {
         this.aByteArray1730 = new byte[this.anInt1734];
      }

      this.aShortArray1753 = new short[this.anInt1734];
      if(this.anInt1745 > 0) {
         this.aByteArray1746 = new byte[this.anInt1745];
         this.aShortArray1747 = new short[this.anInt1745];
         this.aShortArray1748 = new short[this.anInt1745];
         this.aShortArray1738 = new short[this.anInt1745];
         this.aShortArray1750 = new short[this.anInt1745];
         this.aShortArray1751 = new short[this.anInt1745];
         this.aShortArray1767 = new short[this.anInt1745];
         this.aShortArray1768 = new short[this.anInt1745];
         this.aByteArray1735 = new byte[this.anInt1745];
         this.aShortArray1754 = new short[this.anInt1745];
         this.aShortArray1755 = new short[this.anInt1745];
      }

      this.anInt1770 = 0;
      this.anInt1734 = 0;
      this.anInt1745 = 0;

      for(var10 = 0; var10 < var2; var10++) {
         var3 = var1[var10];
         if(var3 != null) {
            int var4;
            for(var4 = 0; var4 < var3.anInt1734; var4++) {
               if(var11 && var3.aByteArray1744 != null) {
                  this.aByteArray1744[this.anInt1734] = var3.aByteArray1744[var4];
               }

               if(var5) {
                  if(var3.aByteArray1739 != null) {
                     this.aByteArray1739[this.anInt1734] = var3.aByteArray1739[var4];
                  } else {
                     this.aByteArray1739[this.anInt1734] = var3.aByte1749;
                  }
               }

               if(var7 && var3.aByteArray1752 != null) {
                  this.aByteArray1752[this.anInt1734] = var3.aByteArray1752[var4];
               }

               if(var6 && var3.anIntArray1772 != null) {
                  this.anIntArray1772[this.anInt1734] = var3.anIntArray1772[var4];
               }

               if(var8) {
                  if(var3.aShortArray1743 != null) {
                     this.aShortArray1743[this.anInt1734] = var3.aShortArray1743[var4];
                  } else {
                     this.aShortArray1743[this.anInt1734] = -1;
                  }
               }

               if(var9) {
                  if(var3.aByteArray1730 != null && var3.aByteArray1730[var4] != -1) {
                     this.aByteArray1730[this.anInt1734] = (byte)(var3.aByteArray1730[var4] + this.anInt1745);
                  } else {
                     this.aByteArray1730[this.anInt1734] = -1;
                  }
               }

               this.aShortArray1753[this.anInt1734] = var3.aShortArray1753[var4];
               this.anIntArray1756[this.anInt1734] = this.method891(var3, var3.anIntArray1756[var4]);
               this.anIntArray1736[this.anInt1734] = this.method891(var3, var3.anIntArray1736[var4]);
               this.anIntArray1737[this.anInt1734] = this.method891(var3, var3.anIntArray1737[var4]);
               ++this.anInt1734;
            }

            for(var4 = 0; var4 < var3.anInt1745; var4++) {
               byte var12 = this.aByteArray1746[this.anInt1745] = var3.aByteArray1746[var4];
               if(var12 == 0) {
                  this.aShortArray1747[this.anInt1745] = (short)this.method891(var3, var3.aShortArray1747[var4]);
                  this.aShortArray1748[this.anInt1745] = (short)this.method891(var3, var3.aShortArray1748[var4]);
                  this.aShortArray1738[this.anInt1745] = (short)this.method891(var3, var3.aShortArray1738[var4]);
               }

               if(var12 >= 1 && var12 <= 3) {
                  this.aShortArray1747[this.anInt1745] = var3.aShortArray1747[var4];
                  this.aShortArray1748[this.anInt1745] = var3.aShortArray1748[var4];
                  this.aShortArray1738[this.anInt1745] = var3.aShortArray1738[var4];
                  this.aShortArray1750[this.anInt1745] = var3.aShortArray1750[var4];
                  this.aShortArray1751[this.anInt1745] = var3.aShortArray1751[var4];
                  this.aShortArray1767[this.anInt1745] = var3.aShortArray1767[var4];
                  this.aShortArray1768[this.anInt1745] = var3.aShortArray1768[var4];
                  this.aByteArray1735[this.anInt1745] = var3.aByteArray1735[var4];
                  this.aShortArray1754[this.anInt1745] = var3.aShortArray1754[var4];
               }

               if(var12 == 2) {
                  this.aShortArray1755[this.anInt1745] = var3.aShortArray1755[var4];
               }

               ++this.anInt1745;
            }
         }
      }

   }

   public Entity_Sub1(Entity_Sub1 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.anInt1770 = var1.anInt1770;
      this.anInt1734 = var1.anInt1734;
      this.anInt1745 = var1.anInt1745;
      int var6;
      if(var2) {
         this.anIntArray1731 = var1.anIntArray1731;
         this.anIntArray1732 = var1.anIntArray1732;
         this.anIntArray1733 = var1.anIntArray1733;
      } else {
         this.anIntArray1731 = new int[this.anInt1770];
         this.anIntArray1732 = new int[this.anInt1770];
         this.anIntArray1733 = new int[this.anInt1770];

         for(var6 = 0; var6 < this.anInt1770; var6++) {
            this.anIntArray1731[var6] = var1.anIntArray1731[var6];
            this.anIntArray1732[var6] = var1.anIntArray1732[var6];
            this.anIntArray1733[var6] = var1.anIntArray1733[var6];
         }
      }

      if(var3) {
         this.aShortArray1753 = var1.aShortArray1753;
      } else {
         this.aShortArray1753 = new short[this.anInt1734];

         for(var6 = 0; var6 < this.anInt1734; var6++) {
            this.aShortArray1753[var6] = var1.aShortArray1753[var6];
         }
      }

      if(!var4 && var1.aShortArray1743 != null) {
         this.aShortArray1743 = new short[this.anInt1734];

         for(var6 = 0; var6 < this.anInt1734; var6++) {
            this.aShortArray1743[var6] = var1.aShortArray1743[var6];
         }
      } else {
         this.aShortArray1743 = var1.aShortArray1743;
      }

      if(var5) {
         this.aByteArray1752 = var1.aByteArray1752;
      } else {
         this.aByteArray1752 = new byte[this.anInt1734];
         if(var1.aByteArray1752 == null) {
            for(var6 = 0; var6 < this.anInt1734; var6++) {
               this.aByteArray1752[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.anInt1734; var6++) {
               this.aByteArray1752[var6] = var1.aByteArray1752[var6];
            }
         }
      }

      this.anIntArray1756 = var1.anIntArray1756;
      this.anIntArray1736 = var1.anIntArray1736;
      this.anIntArray1737 = var1.anIntArray1737;
      this.aByteArray1744 = var1.aByteArray1744;
      this.aByteArray1739 = var1.aByteArray1739;
      this.aByteArray1730 = var1.aByteArray1730;
      this.aByte1749 = var1.aByte1749;
      this.aByteArray1746 = var1.aByteArray1746;
      this.aShortArray1747 = var1.aShortArray1747;
      this.aShortArray1748 = var1.aShortArray1748;
      this.aShortArray1738 = var1.aShortArray1738;
      this.aShortArray1750 = var1.aShortArray1750;
      this.aShortArray1751 = var1.aShortArray1751;
      this.aShortArray1767 = var1.aShortArray1767;
      this.aShortArray1768 = var1.aShortArray1768;
      this.aByteArray1735 = var1.aByteArray1735;
      this.aShortArray1754 = var1.aShortArray1754;
      this.aShortArray1755 = var1.aShortArray1755;
      this.anIntArray1741 = var1.anIntArray1741;
      this.anIntArray1772 = var1.anIntArray1772;
      this.anIntArrayArray1759 = var1.anIntArrayArray1759;
      this.anIntArrayArray1760 = var1.anIntArrayArray1760;
      this.aClass21Array1762 = var1.aClass21Array1762;
      this.aClass27Array1761 = var1.aClass27Array1761;
      this.aClass21Array1763 = var1.aClass21Array1763;
      this.aShort1764 = var1.aShort1764;
      this.aShort1766 = var1.aShort1766;
   }

   public Entity_Sub1 method889() {
      Entity_Sub1 var1 = new Entity_Sub1();
      if(this.aByteArray1744 != null) {
         var1.aByteArray1744 = new byte[this.anInt1734];

         for(int var2 = 0; var2 < this.anInt1734; var2++) {
            var1.aByteArray1744[var2] = this.aByteArray1744[var2];
         }
      }

      var1.anInt1770 = this.anInt1770;
      var1.anInt1734 = this.anInt1734;
      var1.anInt1745 = this.anInt1745;
      var1.anIntArray1731 = this.anIntArray1731;
      var1.anIntArray1732 = this.anIntArray1732;
      var1.anIntArray1733 = this.anIntArray1733;
      var1.anIntArray1756 = this.anIntArray1756;
      var1.anIntArray1736 = this.anIntArray1736;
      var1.anIntArray1737 = this.anIntArray1737;
      var1.aByteArray1739 = this.aByteArray1739;
      var1.aByteArray1752 = this.aByteArray1752;
      var1.aByteArray1730 = this.aByteArray1730;
      var1.aShortArray1753 = this.aShortArray1753;
      var1.aShortArray1743 = this.aShortArray1743;
      var1.aByte1749 = this.aByte1749;
      var1.aByteArray1746 = this.aByteArray1746;
      var1.aShortArray1747 = this.aShortArray1747;
      var1.aShortArray1748 = this.aShortArray1748;
      var1.aShortArray1738 = this.aShortArray1738;
      var1.aShortArray1750 = this.aShortArray1750;
      var1.aShortArray1751 = this.aShortArray1751;
      var1.aShortArray1767 = this.aShortArray1767;
      var1.aShortArray1768 = this.aShortArray1768;
      var1.aByteArray1735 = this.aByteArray1735;
      var1.aShortArray1754 = this.aShortArray1754;
      var1.aShortArray1755 = this.aShortArray1755;
      var1.anIntArray1741 = this.anIntArray1741;
      var1.anIntArray1772 = this.anIntArray1772;
      var1.anIntArrayArray1759 = this.anIntArrayArray1759;
      var1.anIntArrayArray1760 = this.anIntArrayArray1760;
      var1.aClass21Array1762 = this.aClass21Array1762;
      var1.aClass27Array1761 = this.aClass27Array1761;
      var1.aShort1764 = this.aShort1764;
      var1.aShort1766 = this.aShort1766;
      return var1;
   }

   public Entity_Sub1 method890(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method900();
      int var12 = this.anInt1742 + var2;
      int var7 = this.anInt1769 + var2;
      int var8 = this.anInt1771 + var4;
      int var9 = this.anInt1765 + var4;
      if(var12 >= 0 && var7 + 128 >> 7 < var1.length && var8 >= 0 && var9 + 128 >> 7 < var1[0].length) {
         var12 >>= 7;
         var7 = var7 + 127 >> 7;
         var8 >>= 7;
         var9 = var9 + 127 >> 7;
         if(var1[var12][var8] == var3 && var1[var7][var8] == var3 && var1[var12][var9] == var3 && var1[var7][var9] == var3) {
            return this;
         } else {
            Entity_Sub1 var11;
            if(var5) {
               var11 = new Entity_Sub1();
               var11.anInt1770 = this.anInt1770;
               var11.anInt1734 = this.anInt1734;
               var11.anInt1745 = this.anInt1745;
               var11.anIntArray1731 = this.anIntArray1731;
               var11.anIntArray1733 = this.anIntArray1733;
               var11.anIntArray1756 = this.anIntArray1756;
               var11.anIntArray1736 = this.anIntArray1736;
               var11.anIntArray1737 = this.anIntArray1737;
               var11.aByteArray1744 = this.aByteArray1744;
               var11.aByteArray1739 = this.aByteArray1739;
               var11.aByteArray1752 = this.aByteArray1752;
               var11.aByteArray1730 = this.aByteArray1730;
               var11.aShortArray1753 = this.aShortArray1753;
               var11.aShortArray1743 = this.aShortArray1743;
               var11.aByte1749 = this.aByte1749;
               var11.aByteArray1746 = this.aByteArray1746;
               var11.aShortArray1747 = this.aShortArray1747;
               var11.aShortArray1748 = this.aShortArray1748;
               var11.aShortArray1738 = this.aShortArray1738;
               var11.aShortArray1750 = this.aShortArray1750;
               var11.aShortArray1751 = this.aShortArray1751;
               var11.aShortArray1767 = this.aShortArray1767;
               var11.aShortArray1768 = this.aShortArray1768;
               var11.aByteArray1735 = this.aByteArray1735;
               var11.aShortArray1754 = this.aShortArray1754;
               var11.aShortArray1755 = this.aShortArray1755;
               var11.anIntArray1741 = this.anIntArray1741;
               var11.anIntArray1772 = this.anIntArray1772;
               var11.anIntArrayArray1759 = this.anIntArrayArray1759;
               var11.anIntArrayArray1760 = this.anIntArrayArray1760;
               var11.aShort1764 = this.aShort1764;
               var11.aShort1766 = this.aShort1766;
               var11.anIntArray1732 = new int[var11.anInt1770];
            } else {
               var11 = this;
            }

            int var10;
            int var13;
            int var14;
            int var15;
            int var16;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            if(var6 == 0) {
               for(var10 = 0; var10 < var11.anInt1770; var10++) {
                  var13 = this.anIntArray1731[var10] + var2;
                  var20 = this.anIntArray1733[var10] + var4;
                  var18 = var13 & 0x7f;
                  var22 = var20 & 0x7f;
                  var15 = var13 >> 7;
                  var19 = var20 >> 7;
                  var21 = var1[var15][var19] * (128 - var18) + var1[var15 + 1][var19] * var18 >> 7;
                  var14 = var1[var15][var19 + 1] * (128 - var18) + var1[var15 + 1][var19 + 1] * var18 >> 7;
                  var16 = (128 - var22) * var21 + var14 * var22 >> 7;
                  var11.anIntArray1732[var10] = this.anIntArray1732[var10] + var16 - var3;
               }
            } else {
               for(var10 = 0; var10 < var11.anInt1770; var10++) {
                  var13 = (-this.anIntArray1732[var10] << 16) / (this.modelHeight * 1812947537);
                  if(var13 < var6) {
                     var20 = this.anIntArray1731[var10] + var2;
                     var18 = this.anIntArray1733[var10] + var4;
                     var22 = var20 & 0x7f;
                     var15 = var18 & 0x7f;
                     var19 = var20 >> 7;
                     var21 = var18 >> 7;
                     var14 = var1[var19][var21] * (128 - var22) + var1[var19 + 1][var21] * var22 >> 7;
                     var16 = var1[var19][var21 + 1] * (128 - var22) + var1[var19 + 1][var21 + 1] * var22 >> 7;
                     int var17 = (128 - var15) * var14 + var16 * var15 >> 7;
                     var11.anIntArray1732[var10] = this.anIntArray1732[var10] + (var17 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method899();
            return var11;
         }
      } else {
         return this;
      }
   }

   final int method891(Entity_Sub1 var1, int var2) {
      int var3 = -1;
      int var7 = var1.anIntArray1731[var2];
      int var4 = var1.anIntArray1732[var2];
      int var5 = var1.anIntArray1733[var2];

      for(int var6 = 0; var6 < this.anInt1770; var6++) {
         if(this.anIntArray1731[var6] == var7 && this.anIntArray1732[var6] == var4 && this.anIntArray1733[var6] == var5) {
            var3 = var6;
            break;
         }
      }

      if(var3 == -1) {
         this.anIntArray1731[this.anInt1770] = var7;
         this.anIntArray1732[this.anInt1770] = var4;
         this.anIntArray1733[this.anInt1770] = var5;
         if(var1.anIntArray1741 != null) {
            this.anIntArray1741[this.anInt1770] = var1.anIntArray1741[var2];
         }

         var3 = this.anInt1770++;
      }

      return var3;
   }

   public void method892() {
      for(int var1 = 0; var1 < this.anInt1770; var1++) {
         int var2 = this.anIntArray1731[var1];
         this.anIntArray1731[var1] = this.anIntArray1733[var1];
         this.anIntArray1733[var1] = -var2;
      }

      this.method899();
   }

   Entity_Sub1() {
   }

   static void method893(Entity_Sub1 var0, Entity_Sub1 var1, int var2, int var3, int var4, boolean var5) {
      var0.method900();
      var0.method905();
      var1.method900();
      var1.method905();
      ++anInt1774;
      int var7 = 0;
      int[] var8 = var1.anIntArray1731;
      int var14 = var1.anInt1770;

      int var6;
      for(var6 = 0; var6 < var0.anInt1770; var6++) {
         Class21 var9 = var0.aClass21Array1762[var6];
         if(var9.anInt280 * 1053423383 != 0) {
            int var10 = var0.anIntArray1732[var6] - var3;
            if(var10 <= var1.anInt1757) {
               int var11 = var0.anIntArray1731[var6] - var2;
               if(var11 >= var1.anInt1742 && var11 <= var1.anInt1769) {
                  int var12 = var0.anIntArray1733[var6] - var4;
                  if(var12 >= var1.anInt1771 && var12 <= var1.anInt1765) {
                     for(int var13 = 0; var13 < var14; var13++) {
                        Class21 var15 = var1.aClass21Array1762[var13];
                        if(var8[var13] == var11 && var1.anIntArray1733[var13] == var12 && var1.anIntArray1732[var13] == var10 && var15.anInt280 * 1053423383 != 0) {
                           if(var0.aClass21Array1763 == null) {
                              var0.aClass21Array1763 = new Class21[var0.anInt1770];
                           }

                           if(var1.aClass21Array1763 == null) {
                              var1.aClass21Array1763 = new Class21[var14];
                           }

                           Class21 var17 = var0.aClass21Array1763[var6];
                           if(var17 == null) {
                              var17 = var0.aClass21Array1763[var6] = new Class21(var9);
                           }

                           Class21 var16 = var1.aClass21Array1763[var13];
                           if(var16 == null) {
                              var16 = var1.aClass21Array1763[var13] = new Class21(var15);
                           }

                           var17.anInt278 += var15.anInt278;
                           var17.anInt282 += var15.anInt282;
                           var17.anInt279 += var15.anInt279;
                           var17.anInt280 += var15.anInt280;
                           var16.anInt278 += var9.anInt278;
                           var16.anInt282 += var9.anInt282;
                           var16.anInt279 += var9.anInt279;
                           var16.anInt280 += var9.anInt280;
                           ++var7;
                           anIntArray1740[var6] = anInt1774;
                           anIntArray1773[var13] = anInt1774;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var7 >= 3 && var5) {
         for(var6 = 0; var6 < var0.anInt1734; var6++) {
            if(anIntArray1740[var0.anIntArray1756[var6]] == anInt1774 && anIntArray1740[var0.anIntArray1736[var6]] == anInt1774 && anIntArray1740[var0.anIntArray1737[var6]] == anInt1774) {
               if(var0.aByteArray1744 == null) {
                  var0.aByteArray1744 = new byte[var0.anInt1734];
               }

               var0.aByteArray1744[var6] = 2;
            }
         }

         for(var6 = 0; var6 < var1.anInt1734; var6++) {
            if(anIntArray1773[var1.anIntArray1756[var6]] == anInt1774 && anIntArray1773[var1.anIntArray1736[var6]] == anInt1774 && anIntArray1773[var1.anIntArray1737[var6]] == anInt1774) {
               if(var1.aByteArray1744 == null) {
                  var1.aByteArray1744 = new byte[var1.anInt1734];
               }

               var1.aByteArray1744[var6] = 2;
            }
         }
      }

   }

   public void method894(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1770; var4++) {
         this.anIntArray1731[var4] += var1;
         this.anIntArray1732[var4] += var2;
         this.anIntArray1733[var4] += var3;
      }

      this.method899();
   }

   public void method895(short var1, short var2) {
      for(int var3 = 0; var3 < this.anInt1734; var3++) {
         if(this.aShortArray1753[var3] == var1) {
            this.aShortArray1753[var3] = var2;
         }
      }

   }

   public void method896(short var1, short var2) {
      if(this.aShortArray1743 != null) {
         for(int var3 = 0; var3 < this.anInt1734; var3++) {
            if(this.aShortArray1743[var3] == var1) {
               this.aShortArray1743[var3] = var2;
            }
         }
      }

   }

   public void method897() {
      int var1;
      for(var1 = 0; var1 < this.anInt1770; var1++) {
         this.anIntArray1733[var1] = -this.anIntArray1733[var1];
      }

      for(var1 = 0; var1 < this.anInt1734; var1++) {
         int var2 = this.anIntArray1756[var1];
         this.anIntArray1756[var1] = this.anIntArray1737[var1];
         this.anIntArray1737[var1] = var2;
      }

      this.method899();
   }

   public void method898(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt1770; var4++) {
         this.anIntArray1731[var4] = this.anIntArray1731[var4] * var1 / 128;
         this.anIntArray1732[var4] = this.anIntArray1732[var4] * var2 / 128;
         this.anIntArray1733[var4] = this.anIntArray1733[var4] * var3 / 128;
      }

      this.method899();
   }

   void method899() {
      this.aClass21Array1762 = null;
      this.aClass21Array1763 = null;
      this.aClass27Array1761 = null;
      this.aBool1775 = false;
   }

   void method900() {
      if(!this.aBool1775) {
         this.modelHeight = 0;
         this.anInt1757 = 0;
         this.anInt1742 = 999999;
         this.anInt1769 = -999999;
         this.anInt1765 = -99999;
         this.anInt1771 = 99999;

         for(int var3 = 0; var3 < this.anInt1770; var3++) {
            int var4 = this.anIntArray1731[var3];
            int var2 = this.anIntArray1732[var3];
            int var1 = this.anIntArray1733[var3];
            if(var4 < this.anInt1742) {
               this.anInt1742 = var4;
            }

            if(var4 > this.anInt1769) {
               this.anInt1769 = var4;
            }

            if(var1 < this.anInt1771) {
               this.anInt1771 = var1;
            }

            if(var1 > this.anInt1765) {
               this.anInt1765 = var1;
            }

            if(-var2 > this.modelHeight * 1812947537) {
               this.modelHeight = -var2 * -969595215;
            }

            if(var2 > this.anInt1757) {
               this.anInt1757 = var2;
            }
         }

         this.aBool1775 = true;
      }

   }

   static final int method901(int var0, int var1) {
      var1 = (var0 & 0x7f) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 0xff80) + var1;
   }

   public final Model method902(int var1, int var2, int var3, int var4, int var5) {
      this.method905();
      int var15 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var8 = var2 * var15 >> 8;
      Model var10 = new Model();
      var10.anIntArray1870 = new int[this.anInt1734];
      var10.anIntArray1871 = new int[this.anInt1734];
      var10.anIntArray1872 = new int[this.anInt1734];
      if(this.anInt1745 > 0 && this.aByteArray1730 != null) {
         int[] var16 = new int[this.anInt1745];

         int var18;
         for(var18 = 0; var18 < this.anInt1734; var18++) {
            if(this.aByteArray1730[var18] != -1) {
               ++var16[this.aByteArray1730[var18] & 0xff];
            }
         }

         var10.anInt1878 = 0;

         for(var18 = 0; var18 < this.anInt1745; var18++) {
            if(var16[var18] > 0 && this.aByteArray1746[var18] == 0) {
               ++var10.anInt1878;
            }
         }

         var10.anIntArray1879 = new int[var10.anInt1878];
         var10.anIntArray1880 = new int[var10.anInt1878];
         var10.anIntArray1906 = new int[var10.anInt1878];
         var18 = 0;

         int var19;
         for(var19 = 0; var19 < this.anInt1745; var19++) {
            if(var16[var19] > 0 && this.aByteArray1746[var19] == 0) {
               var10.anIntArray1879[var18] = this.aShortArray1747[var19] & 0xffff;
               var10.anIntArray1880[var18] = this.aShortArray1748[var19] & 0xffff;
               var10.anIntArray1906[var18] = this.aShortArray1738[var19] & 0xffff;
               var16[var19] = var18++;
            } else {
               var16[var19] = -1;
            }
         }

         var10.aByteArray1875 = new byte[this.anInt1734];

         for(var19 = 0; var19 < this.anInt1734; var19++) {
            if(this.aByteArray1730[var19] != -1) {
               var10.aByteArray1875[var19] = (byte)var16[this.aByteArray1730[var19] & 0xff];
            } else {
               var10.aByteArray1875[var19] = -1;
            }
         }
      }

      for(int var171 = 0; var171 < this.anInt1734; var171++) {
         byte var181;
         if(this.aByteArray1744 == null) {
            var181 = 0;
         } else {
            var181 = this.aByteArray1744[var171];
         }

         byte var191;
         if(this.aByteArray1752 == null) {
            var191 = 0;
         } else {
            var191 = this.aByteArray1752[var171];
         }

         short var14;
         if(this.aShortArray1743 == null) {
            var14 = -1;
         } else {
            var14 = this.aShortArray1743[var171];
         }

         if(var191 == -2) {
            var181 = 3;
         }

         if(var191 == -1) {
            var181 = 2;
         }

         Class21 var7;
         int var9;
         Class27 var17;
         if(var14 == -1) {
            if(var181 != 0) {
               if(var181 == 1) {
                  var17 = this.aClass27Array1761[var171];
                  var9 = (var17.anInt319 * var3 * -1007204591 + var17.anInt318 * var4 * -1133994153 + var17.anInt317 * var5 * -1926770859) / (var8 / 2 + var8) + var1;
                  var10.anIntArray1870[var171] = method901(this.aShortArray1753[var171] & 0xffff, var9);
                  var10.anIntArray1872[var171] = -1;
               } else if(var181 == 3) {
                  var10.anIntArray1870[var171] = 128;
                  var10.anIntArray1872[var171] = -1;
               } else {
                  var10.anIntArray1872[var171] = -2;
               }
            } else {
               int var13 = this.aShortArray1753[var171] & 0xffff;
               if(this.aClass21Array1763 != null && this.aClass21Array1763[this.anIntArray1756[var171]] != null) {
                  var7 = this.aClass21Array1763[this.anIntArray1756[var171]];
               } else {
                  var7 = this.aClass21Array1762[this.anIntArray1756[var171]];
               }

               var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485 + var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
               var10.anIntArray1870[var171] = method901(var13, var9);
               if(this.aClass21Array1763 != null && this.aClass21Array1763[this.anIntArray1736[var171]] != null) {
                  var7 = this.aClass21Array1763[this.anIntArray1736[var171]];
               } else {
                  var7 = this.aClass21Array1762[this.anIntArray1736[var171]];
               }

               var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485 + var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
               var10.anIntArray1871[var171] = method901(var13, var9);
               if(this.aClass21Array1763 != null && this.aClass21Array1763[this.anIntArray1737[var171]] != null) {
                  var7 = this.aClass21Array1763[this.anIntArray1737[var171]];
               } else {
                  var7 = this.aClass21Array1762[this.anIntArray1737[var171]];
               }

               var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485 + var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
               var10.anIntArray1872[var171] = method901(var13, var9);
            }
         } else if(var181 != 0) {
            if(var181 == 1) {
               var17 = this.aClass27Array1761[var171];
               var9 = (var17.anInt319 * var3 * -1007204591 + var17.anInt318 * var4 * -1133994153 + var17.anInt317 * var5 * -1926770859) / (var8 / 2 + var8) + var1;
               var10.anIntArray1870[var171] = method903(var9);
               var10.anIntArray1872[var171] = -1;
            } else {
               var10.anIntArray1872[var171] = -2;
            }
         } else {
            if(this.aClass21Array1763 != null && this.aClass21Array1763[this.anIntArray1756[var171]] != null) {
               var7 = this.aClass21Array1763[this.anIntArray1756[var171]];
            } else {
               var7 = this.aClass21Array1762[this.anIntArray1756[var171]];
            }

            var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485 + var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
            var10.anIntArray1870[var171] = method903(var9);
            if(this.aClass21Array1763 != null && this.aClass21Array1763[this.anIntArray1736[var171]] != null) {
               var7 = this.aClass21Array1763[this.anIntArray1736[var171]];
            } else {
               var7 = this.aClass21Array1762[this.anIntArray1736[var171]];
            }

            var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485 + var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
            var10.anIntArray1871[var171] = method903(var9);
            if(this.aClass21Array1763 != null && this.aClass21Array1763[this.anIntArray1737[var171]] != null) {
               var7 = this.aClass21Array1763[this.anIntArray1737[var171]];
            } else {
               var7 = this.aClass21Array1762[this.anIntArray1737[var171]];
            }

            var9 = (var7.anInt278 * var3 * -1716485273 + var7.anInt282 * var4 * -1481331485 + var7.anInt279 * var5 * 1113369919) / (var7.anInt280 * var8 * 1053423383) + var1;
            var10.anIntArray1872[var171] = method903(var9);
         }
      }

      this.method908();
      var10.anInt1864 = this.anInt1770;
      var10.verticesX = this.anIntArray1731;
      var10.verticesY = this.anIntArray1732;
      var10.verticesZ = this.anIntArray1733;
      var10.anInt1900 = this.anInt1734;
      var10.anIntArray1867 = this.anIntArray1756;
      var10.anIntArray1868 = this.anIntArray1736;
      var10.anIntArray1869 = this.anIntArray1737;
      var10.aByteArray1888 = this.aByteArray1739;
      var10.aByteArray1874 = this.aByteArray1752;
      var10.aByte1884 = this.aByte1749;
      var10.anIntArrayArray1881 = this.anIntArrayArray1759;
      var10.anIntArrayArray1873 = this.anIntArrayArray1760;
      var10.aShortArray1860 = this.aShortArray1743;
      return var10;
   }

   static final int method903(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   public void method904(int var1) {
      int var2 = anIntArray1758[var1];
      int var4 = anIntArray1776[var1];

      for(int var3 = 0; var3 < this.anInt1770; var3++) {
         int var5 = this.anIntArray1733[var3] * var2 + this.anIntArray1731[var3] * var4 >> 16;
         this.anIntArray1733[var3] = this.anIntArray1733[var3] * var4 - this.anIntArray1731[var3] * var2 >> 16;
         this.anIntArray1731[var3] = var5;
      }

      this.method899();
   }

   Entity_Sub1(byte[] bytes) {
      if(bytes[bytes.length - 1] == -1 && bytes[bytes.length - 2] == -1) {
         this.decodeNewFormat(bytes);
      } else {
         this.decodeOldFormat(bytes);
      }

   }

   public void method905() {
      if(this.aClass21Array1762 == null) {
         this.aClass21Array1762 = new Class21[this.anInt1770];

         int var3;
         for(var3 = 0; var3 < this.anInt1770; var3++) {
            this.aClass21Array1762[var3] = new Class21();
         }

         for(var3 = 0; var3 < this.anInt1734; var3++) {
            int var7 = this.anIntArray1756[var3];
            int var5 = this.anIntArray1736[var3];
            int var6 = this.anIntArray1737[var3];
            int var13 = this.anIntArray1731[var5] - this.anIntArray1731[var7];
            int var8 = this.anIntArray1732[var5] - this.anIntArray1732[var7];
            int var12 = this.anIntArray1733[var5] - this.anIntArray1733[var7];
            int var9 = this.anIntArray1731[var6] - this.anIntArray1731[var7];
            int var14 = this.anIntArray1732[var6] - this.anIntArray1732[var7];
            int var11 = this.anIntArray1733[var6] - this.anIntArray1733[var7];
            int var2 = var8 * var11 - var14 * var12;
            int var4 = var12 * var9 - var11 * var13;

            int var10;
            for(var10 = var13 * var14 - var9 * var8; var2 > 8192 || var4 > 8192 || var10 > 8192 || var2 < -8192 || var4 < -8192 || var10 < -8192; var10 >>= 1) {
               var2 >>= 1;
               var4 >>= 1;
            }

            int var15 = (int)Math.sqrt((double)(var2 * var2 + var4 * var4 + var10 * var10));
            if(var15 <= 0) {
               var15 = 1;
            }

            var2 = var2 * 256 / var15;
            var4 = var4 * 256 / var15;
            var10 = var10 * 256 / var15;
            byte var16;
            if(this.aByteArray1744 == null) {
               var16 = 0;
            } else {
               var16 = this.aByteArray1744[var3];
            }

            if(var16 == 0) {
               Class21 var17 = this.aClass21Array1762[var7];
               var17.anInt278 += var2 * -1411192745;
               var17.anInt282 += var4 * 234223819;
               var17.anInt279 += var10 * -852507969;
               var17.anInt280 += -1902071641;
               var17 = this.aClass21Array1762[var5];
               var17.anInt278 += var2 * -1411192745;
               var17.anInt282 += var4 * 234223819;
               var17.anInt279 += var10 * -852507969;
               var17.anInt280 += -1902071641;
               var17 = this.aClass21Array1762[var6];
               var17.anInt278 += var2 * -1411192745;
               var17.anInt282 += var4 * 234223819;
               var17.anInt279 += var10 * -852507969;
               var17.anInt280 += -1902071641;
            } else if(var16 == 1) {
               if(this.aClass27Array1761 == null) {
                  this.aClass27Array1761 = new Class27[this.anInt1734];
               }

               Class27 var171 = this.aClass27Array1761[var3] = new Class27();
               var171.anInt319 = var2 * 139364849;
               var171.anInt318 = var4 * -809714585;
               var171.anInt317 = var10 * 130921981;
            }
         }
      }

   }

   public void method906() {
      for(int var1 = 0; var1 < this.anInt1770; var1++) {
         this.anIntArray1731[var1] = -this.anIntArray1731[var1];
         this.anIntArray1733[var1] = -this.anIntArray1733[var1];
      }

      this.method899();
   }

   void decodeNewFormat(byte[] var1) {
      ByteBuf var2 = new ByteBuf(var1);
      ByteBuf var9 = new ByteBuf(var1);
      ByteBuf var33 = new ByteBuf(var1);
      ByteBuf var49 = new ByteBuf(var1);
      ByteBuf var7 = new ByteBuf(var1);
      ByteBuf var8 = new ByteBuf(var1);
      ByteBuf var46 = new ByteBuf(var1);
      var2.position = var1.length - 23;
      int numVertices = var2.getUShort();
      int numTriangles = var2.getUShort();
      int numTextureTriangles = var2.getUByte();
      int var13 = var2.getUByte();
      int var31 = var2.getUByte();
      int var16 = var2.getUByte();
      int var4 = var2.getUByte();
      int var18 = var2.getUByte();
      int var19 = var2.getUByte();
      int var20 = var2.getUShort();
      int var21 = var2.getUShort();
      int var22 = var2.getUShort();
      int var23 = var2.getUShort();
      int var24 = var2.getUShort();
      int var25 = 0;
      int var3 = 0;
      int var26 = 0;
      int var5;
      if(numTextureTriangles > 0) {
         this.aByteArray1746 = new byte[numTextureTriangles];
         var2.position = 0;

         for(var5 = 0; var5 < numTextureTriangles; var5++) {
            byte var55 = this.aByteArray1746[var5] = var2.getByte();
            if(var55 == 0) {
               ++var25;
            }

            if(var55 >= 1 && var55 <= 3) {
               ++var3;
            }

            if(var55 == 2) {
               ++var26;
            }
         }
      }

      var5 = numTextureTriangles + numVertices;
      int var561 = var5;
      if(var13 == 1) {
         var5 += numTriangles;
      }

      int var35 = var5;
      var5 += numTriangles;
      int var56 = var5;
      if(var31 == 255) {
         var5 += numTriangles;
      }

      int var37 = var5;
      if(var4 == 1) {
         var5 += numTriangles;
      }

      int var48 = var5;
      if(var19 == 1) {
         var5 += numVertices;
      }

      int var39 = var5;
      if(var16 == 1) {
         var5 += numTriangles;
      }

      int var40 = var5;
      var5 += var23;
      int var57 = var5;
      if(var18 == 1) {
         var5 += numTriangles * 2;
      }

      int var42 = var5;
      var5 += var24;
      int var50 = var5;
      var5 += numTriangles * 2;
      int var10 = var5;
      var5 += var20;
      int var51 = var5;
      var5 += var21;
      int var6 = var5;
      var5 += var22;
      int var43 = var5;
      var5 += var25 * 6;
      int var52 = var5;
      var5 += var3 * 6;
      int var44 = var5;
      var5 += var3 * 6;
      int var54 = var5;
      var5 += var3 * 2;
      int var45 = var5;
      var5 += var3;
      int var47 = var5;
      var5 += var3 * 2 + var26 * 2;
      this.anInt1770 = numVertices;
      this.anInt1734 = numTriangles;
      this.anInt1745 = numTextureTriangles;
      this.anIntArray1731 = new int[numVertices];
      this.anIntArray1732 = new int[numVertices];
      this.anIntArray1733 = new int[numVertices];
      this.anIntArray1756 = new int[numTriangles];
      this.anIntArray1736 = new int[numTriangles];
      this.anIntArray1737 = new int[numTriangles];
      if(var19 == 1) {
         this.anIntArray1741 = new int[numVertices];
      }

      if(var13 == 1) {
         this.aByteArray1744 = new byte[numTriangles];
      }

      if(var31 == 255) {
         this.aByteArray1739 = new byte[numTriangles];
      } else {
         this.aByte1749 = (byte)var31;
      }

      if(var16 == 1) {
         this.aByteArray1752 = new byte[numTriangles];
      }

      if(var4 == 1) {
         this.anIntArray1772 = new int[numTriangles];
      }

      if(var18 == 1) {
         this.aShortArray1743 = new short[numTriangles];
      }

      if(var18 == 1 && numTextureTriangles > 0) {
         this.aByteArray1730 = new byte[numTriangles];
      }

      this.aShortArray1753 = new short[numTriangles];
      if(numTextureTriangles > 0) {
         this.aShortArray1747 = new short[numTextureTriangles];
         this.aShortArray1748 = new short[numTextureTriangles];
         this.aShortArray1738 = new short[numTextureTriangles];
         if(var3 > 0) {
            this.aShortArray1750 = new short[var3];
            this.aShortArray1751 = new short[var3];
            this.aShortArray1767 = new short[var3];
            this.aShortArray1768 = new short[var3];
            this.aByteArray1735 = new byte[var3];
            this.aShortArray1754 = new short[var3];
         }

         if(var26 > 0) {
            this.aShortArray1755 = new short[var26];
         }
      }

      var2.position = numTextureTriangles;
      var9.position = var10;
      var33.position = var51;
      var49.position = var6;
      var7.position = var48;
      int var53 = 0;
      int var28 = 0;
      int var34 = 0;

      int var14;
      int var15;
      int var17;
      int var29;
      int var38;
      for(var15 = 0; var15 < numVertices; var15++) {
         var29 = var2.getUByte();
         var38 = 0;
         if((var29 & 0x1) != 0) {
            var38 = var9.getSmart();
         }

         var17 = 0;
         if((var29 & 0x2) != 0) {
            var17 = var33.getSmart();
         }

         var14 = 0;
         if((var29 & 0x4) != 0) {
            var14 = var49.getSmart();
         }

         this.anIntArray1731[var15] = var53 + var38;
         this.anIntArray1732[var15] = var28 + var17;
         this.anIntArray1733[var15] = var34 + var14;
         var53 = this.anIntArray1731[var15];
         var28 = this.anIntArray1732[var15];
         var34 = this.anIntArray1733[var15];
         if(var19 == 1) {
            this.anIntArray1741[var15] = var7.getUByte();
         }
      }

      var2.position = var50;
      var9.position = var561;
      var33.position = var56;
      var49.position = var39;
      var7.position = var37;
      var8.position = var57;
      var46.position = var42;

      for(var15 = 0; var15 < numTriangles; var15++) {
         this.aShortArray1753[var15] = (short)var2.getUShort();
         if(var13 == 1) {
            this.aByteArray1744[var15] = var9.getByte();
         }

         if(var31 == 255) {
            this.aByteArray1739[var15] = var33.getByte();
         }

         if(var16 == 1) {
            this.aByteArray1752[var15] = var49.getByte();
         }

         if(var4 == 1) {
            this.anIntArray1772[var15] = var7.getUByte();
         }

         if(var18 == 1) {
            this.aShortArray1743[var15] = (short)(var8.getUShort() - 1);
         }

         if(this.aByteArray1730 != null && this.aShortArray1743[var15] != -1) {
            this.aByteArray1730[var15] = (byte)(var46.getUByte() - 1);
         }
      }

      var2.position = var40;
      var9.position = var35;
      var15 = 0;
      var29 = 0;
      var38 = 0;
      var17 = 0;

      int var32;
      for(var14 = 0; var14 < numTriangles; var14++) {
         var32 = var9.getUByte();
         if(var32 == 1) {
            var15 = var2.getSmart() + var17;
            var29 = var2.getSmart() + var15;
            var38 = var2.getSmart() + var29;
            var17 = var38;
            this.anIntArray1756[var14] = var15;
            this.anIntArray1736[var14] = var29;
            this.anIntArray1737[var14] = var38;
         }

         if(var32 == 2) {
            var29 = var38;
            var38 = var2.getSmart() + var17;
            var17 = var38;
            this.anIntArray1756[var14] = var15;
            this.anIntArray1736[var14] = var29;
            this.anIntArray1737[var14] = var38;
         }

         if(var32 == 3) {
            var15 = var38;
            var38 = var2.getSmart() + var17;
            var17 = var38;
            this.anIntArray1756[var14] = var15;
            this.anIntArray1736[var14] = var29;
            this.anIntArray1737[var14] = var38;
         }

         if(var32 == 4) {
            int var41 = var15;
            var15 = var29;
            var29 = var41;
            var38 = var2.getSmart() + var17;
            var17 = var38;
            this.anIntArray1756[var14] = var15;
            this.anIntArray1736[var14] = var41;
            this.anIntArray1737[var14] = var38;
         }
      }

      var2.position = var43;
      var9.position = var52;
      var33.position = var44;
      var49.position = var54;
      var7.position = var45;
      var8.position = var47;

      for(var14 = 0; var14 < numTextureTriangles; var14++) {
         var32 = this.aByteArray1746[var14] & 0xff;
         if(var32 == 0) {
            this.aShortArray1747[var14] = (short)var2.getUShort();
            this.aShortArray1748[var14] = (short)var2.getUShort();
            this.aShortArray1738[var14] = (short)var2.getUShort();
         }

         if(var32 == 1) {
            this.aShortArray1747[var14] = (short)var9.getUShort();
            this.aShortArray1748[var14] = (short)var9.getUShort();
            this.aShortArray1738[var14] = (short)var9.getUShort();
            this.aShortArray1750[var14] = (short)var33.getUShort();
            this.aShortArray1751[var14] = (short)var33.getUShort();
            this.aShortArray1767[var14] = (short)var33.getUShort();
            this.aShortArray1768[var14] = (short)var49.getUShort();
            this.aByteArray1735[var14] = var7.getByte();
            this.aShortArray1754[var14] = (short)var8.getUShort();
         }

         if(var32 == 2) {
            this.aShortArray1747[var14] = (short)var9.getUShort();
            this.aShortArray1748[var14] = (short)var9.getUShort();
            this.aShortArray1738[var14] = (short)var9.getUShort();
            this.aShortArray1750[var14] = (short)var33.getUShort();
            this.aShortArray1751[var14] = (short)var33.getUShort();
            this.aShortArray1767[var14] = (short)var33.getUShort();
            this.aShortArray1768[var14] = (short)var49.getUShort();
            this.aByteArray1735[var14] = var7.getByte();
            this.aShortArray1754[var14] = (short)var8.getUShort();
            this.aShortArray1755[var14] = (short)var8.getUShort();
         }

         if(var32 == 3) {
            this.aShortArray1747[var14] = (short)var9.getUShort();
            this.aShortArray1748[var14] = (short)var9.getUShort();
            this.aShortArray1738[var14] = (short)var9.getUShort();
            this.aShortArray1750[var14] = (short)var33.getUShort();
            this.aShortArray1751[var14] = (short)var33.getUShort();
            this.aShortArray1767[var14] = (short)var33.getUShort();
            this.aShortArray1768[var14] = (short)var49.getUShort();
            this.aByteArray1735[var14] = var7.getByte();
            this.aShortArray1754[var14] = (short)var8.getUShort();
         }
      }

      var2.position = var5;
      var14 = var2.getUByte();
      if(var14 != 0) {
         new Class25();
         var2.getUShort();
         var2.getUShort();
         var2.getUShort();
         var2.getInt();
      }

   }

   void method908() {
      int var1;
      int var2;
      int var3;
      int[] var4;
      if(this.anIntArray1741 != null) {
         var4 = new int[256];
         var2 = 0;

         for(var1 = 0; var1 < this.anInt1770; var1++) {
            var3 = this.anIntArray1741[var1];
            ++var4[var3];
            if(var3 > var2) {
               var2 = var3;
            }
         }

         this.anIntArrayArray1759 = new int[var2 + 1][];

         for(var1 = 0; var1 <= var2; var1++) {
            this.anIntArrayArray1759[var1] = new int[var4[var1]];
            var4[var1] = 0;
         }

         for(var1 = 0; var1 < this.anInt1770; this.anIntArrayArray1759[var3][var4[var3]++] = var1++) {
            var3 = this.anIntArray1741[var1];
         }

         this.anIntArray1741 = null;
      }

      if(this.anIntArray1772 != null) {
         var4 = new int[256];
         var2 = 0;

         for(var1 = 0; var1 < this.anInt1734; var1++) {
            var3 = this.anIntArray1772[var1];
            ++var4[var3];
            if(var3 > var2) {
               var2 = var3;
            }
         }

         this.anIntArrayArray1760 = new int[var2 + 1][];

         for(var1 = 0; var1 <= var2; var1++) {
            this.anIntArrayArray1760[var1] = new int[var4[var1]];
            var4[var1] = 0;
         }

         for(var1 = 0; var1 < this.anInt1734; this.anIntArrayArray1760[var3][var4[var3]++] = var1++) {
            var3 = this.anIntArray1772[var1];
         }

         this.anIntArray1772 = null;
      }

   }

   static {
      anIntArray1758 = TexturedGraphic.SIN_TABLE;
      anIntArray1773 = new int[10000];
      anInt1774 = 0;
      anIntArray1776 = TexturedGraphic.COS_TABLE;
   }

}
