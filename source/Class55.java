public final class Class55 {

   static Class46 aClass46_541 = new Class46();

   public static int bunzip2(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class46 var5 = aClass46_541;
      synchronized(var5) {
         aClass46_541.aByteArray471 = var2;
         aClass46_541.anInt486 = var4;
         aClass46_541.aByteArray467 = var0;
         aClass46_541.anInt483 = 0;
         aClass46_541.anInt479 = var1;
         aClass46_541.anInt470 = 0;
         aClass46_541.anInt480 = 0;
         aClass46_541.anInt476 = 0;
         aClass46_541.anInt477 = 0;
         method278(aClass46_541);
         var1 -= aClass46_541.anInt479;
         aClass46_541.aByteArray471 = null;
         aClass46_541.aByteArray467 = null;
         return var1;
      }
   }

   static void method277(Class46 var0) {
      byte var1 = var0.aByte478;
      int var2 = var0.anInt502;
      int var3 = var0.anInt473;
      int var4 = var0.anInt484;
      int[] var5 = Class93.anIntArray732;
      int var6 = var0.anInt481;
      byte[] var10 = var0.aByteArray467;
      int var11 = var0.anInt483;
      int var7 = var0.anInt479;
      int var9 = var0.anInt501 + 1;

      label65:
      while(true) {
         if(var2 > 0) {
            while(true) {
               if(var7 == 0) {
                  break label65;
               }

               if(var2 == 1) {
                  if(var7 == 0) {
                     var2 = 1;
                     break label65;
                  }

                  var10[var11] = var1;
                  ++var11;
                  --var7;
                  break;
               }

               var10[var11] = var1;
               --var2;
               ++var11;
               --var7;
            }
         }

         boolean var14 = true;

         byte var12;
         while(var14) {
            var14 = false;
            if(var3 == var9) {
               var2 = 0;
               break label65;
            }

            var1 = (byte)var4;
            var6 = var5[var6];
            var12 = (byte)(var6 & 0xff);
            var6 >>= 8;
            ++var3;
            if(var12 != var4) {
               var4 = var12;
               if(var7 == 0) {
                  var2 = 1;
                  break label65;
               }

               var10[var11] = var1;
               ++var11;
               --var7;
               var14 = true;
            } else if(var3 == var9) {
               if(var7 == 0) {
                  var2 = 1;
                  break label65;
               }

               var10[var11] = var1;
               ++var11;
               --var7;
               var14 = true;
            }
         }

         var2 = 2;
         var6 = var5[var6];
         var12 = (byte)(var6 & 0xff);
         var6 >>= 8;
         ++var3;
         if(var3 != var9) {
            if(var12 != var4) {
               var4 = var12;
            } else {
               var2 = 3;
               var6 = var5[var6];
               var12 = (byte)(var6 & 0xff);
               var6 >>= 8;
               ++var3;
               if(var3 != var9) {
                  if(var12 != var4) {
                     var4 = var12;
                  } else {
                     var6 = var5[var6];
                     var12 = (byte)(var6 & 0xff);
                     var6 >>= 8;
                     ++var3;
                     var2 = (var12 & 0xff) + 4;
                     var6 = var5[var6];
                     var4 = (byte)(var6 & 0xff);
                     var6 >>= 8;
                     ++var3;
                  }
               }
            }
         }
      }

      int var13 = var0.anInt477;
      var0.anInt477 += var7 - var7;
      if(var0.anInt477 < var13) {
         ;
      }

      var0.aByte478 = var1;
      var0.anInt502 = var2;
      var0.anInt473 = var3;
      var0.anInt484 = var4;
      Class93.anIntArray732 = var5;
      var0.anInt481 = var6;
      var0.aByteArray467 = var10;
      var0.anInt483 = var11;
      var0.anInt479 = var7;
   }

   static void method278(Class46 var0) {
      int var19 = 0;
      int[] var20 = null;
      int[] var17 = null;
      int[] var15 = null;
      var0.anInt482 = 959267293;
      if(Class93.anIntArray732 == null) {
         Class93.anIntArray732 = new int[var0.anInt482 * -1332132064];
      }

      boolean var23 = true;

      while(true) {
         while(var23) {
            byte var9 = method279(var0);
            if(var9 == 23) {
               return;
            }

            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method279(var0);
            var9 = method283(var0);
            if(var9 != 0) {
               ;
            }

            var0.anInt492 = 0;
            var9 = method279(var0);
            var0.anInt492 = var0.anInt492 << 8 | var9 & 0xff;
            var9 = method279(var0);
            var0.anInt492 = var0.anInt492 << 8 | var9 & 0xff;
            var9 = method279(var0);
            var0.anInt492 = var0.anInt492 << 8 | var9 & 0xff;

            int var35;
            for(var35 = 0; var35 < 16; var35++) {
               var9 = method283(var0);
               if(var9 == 1) {
                  var0.aBoolArray490[var35] = true;
               } else {
                  var0.aBoolArray490[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; var35++) {
               var0.aBoolArray475[var35] = false;
            }

            int var55;
            for(var35 = 0; var35 < 16; var35++) {
               if(var0.aBoolArray490[var35]) {
                  for(var55 = 0; var55 < 16; var55++) {
                     var9 = method283(var0);
                     if(var9 == 1) {
                        var0.aBoolArray475[var35 * 16 + var55] = true;
                     }
                  }
               }
            }

            method281(var0);
            int var54 = var0.anInt488 + 2;
            int var39 = method280(3, var0);
            int var56 = method280(15, var0);

            for(var35 = 0; var35 < var56; var35++) {
               var55 = 0;

               while(true) {
                  var9 = method283(var0);
                  if(var9 == 0) {
                     var0.aByteArray495[var35] = (byte)var55;
                     break;
                  }

                  ++var55;
               }
            }

            byte[] var21 = new byte[6];

            byte var22;
            for(var22 = 0; var22 < var39; var21[var22] = var22++) {
               ;
            }

            for(var35 = 0; var35 < var56; var35++) {
               var22 = var0.aByteArray495[var35];

               byte var37;
               for(var37 = var21[var22]; var22 > 0; --var22) {
                  var21[var22] = var21[var22 - 1];
               }

               var21[0] = var37;
               var0.aByteArray494[var35] = var37;
            }

            int var41;
            int var32;
            for(var32 = 0; var32 < var39; var32++) {
               var41 = method280(5, var0);

               for(var35 = 0; var35 < var54; var35++) {
                  while(true) {
                     var9 = method283(var0);
                     if(var9 == 0) {
                        var0.aByteArrayArray496[var32][var35] = (byte)var41;
                        break;
                     }

                     var9 = method283(var0);
                     if(var9 == 0) {
                        ++var41;
                     } else {
                        --var41;
                     }
                  }
               }
            }

            for(var32 = 0; var32 < var39; var32++) {
               byte var33 = 32;
               byte var43 = 0;

               for(var35 = 0; var35 < var54; var35++) {
                  if(var0.aByteArrayArray496[var32][var35] > var43) {
                     var43 = var0.aByteArrayArray496[var32][var35];
                  }

                  if(var0.aByteArrayArray496[var32][var35] < var33) {
                     var33 = var0.aByteArrayArray496[var32][var35];
                  }
               }

               method282(var0.anIntArrayArray497[var32], var0.anIntArrayArray498[var32], var0.anIntArrayArray499[var32], var0.aByteArrayArray496[var32], var33, var43, var54);
               var0.anIntArray500[var32] = var33;
            }

            var41 = var0.anInt488 + 1;
            int var341 = -1;
            byte var40 = 0;

            for(var35 = 0; var35 <= 255; var35++) {
               var0.anIntArray485[var35] = 0;
            }

            int var52 = 4095;

            int var51;
            int var53;
            for(var51 = 15; var51 >= 0; --var51) {
               for(var53 = 15; var53 >= 0; --var53) {
                  var0.aByteArray489[var52] = (byte)(var51 * 16 + var53);
                  --var52;
               }

               var0.anIntArray493[var51] = var52 + 1;
            }

            int var45 = 0;
            byte var47;
            if(var40 == 0) {
               ++var341;
               var40 = 50;
               var47 = var0.aByteArray494[var341];
               var19 = var0.anIntArray500[var47];
               var20 = var0.anIntArrayArray497[var47];
               var15 = var0.anIntArrayArray499[var47];
               var17 = var0.anIntArrayArray498[var47];
            }

            int var42 = var40 - 1;
            int var46 = var19;

            byte var48;
            int var49;
            for(var49 = method280(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
               ++var46;
               var48 = method283(var0);
            }

            int var50 = var15[var49 - var17[var46]];

            while(true) {
               while(var50 != var41) {
                  int var36;
                  int var38;
                  if(var50 != 0 && var50 != 1) {
                     var36 = var50 - 1;
                     int var25;
                     if(var36 < 16) {
                        var38 = var0.anIntArray493[0];

                        for(var9 = var0.aByteArray489[var38 + var36]; var36 > 3; var36 -= 4) {
                           var25 = var38 + var36;
                           var0.aByteArray489[var25] = var0.aByteArray489[var25 - 1];
                           var0.aByteArray489[var25 - 1] = var0.aByteArray489[var25 - 2];
                           var0.aByteArray489[var25 - 2] = var0.aByteArray489[var25 - 3];
                           var0.aByteArray489[var25 - 3] = var0.aByteArray489[var25 - 4];
                        }

                        while(var36 > 0) {
                           var0.aByteArray489[var38 + var36] = var0.aByteArray489[var38 + var36 - 1];
                           --var36;
                        }

                        var0.aByteArray489[var38] = var9;
                     } else {
                        var25 = var36 / 16;
                        int var34 = var36 % 16;
                        var38 = var0.anIntArray493[var25] + var34;

                        for(var9 = var0.aByteArray489[var38]; var38 > var0.anIntArray493[var25]; --var38) {
                           var0.aByteArray489[var38] = var0.aByteArray489[var38 - 1];
                        }

                        ++var0.anIntArray493[var25];

                        while(var25 > 0) {
                           --var0.anIntArray493[var25];
                           var0.aByteArray489[var0.anIntArray493[var25]] = var0.aByteArray489[var0.anIntArray493[var25 - 1] + 16 - 1];
                           --var25;
                        }

                        --var0.anIntArray493[0];
                        var0.aByteArray489[var0.anIntArray493[0]] = var9;
                        if(var0.anIntArray493[0] == 0) {
                           var52 = 4095;

                           for(var51 = 15; var51 >= 0; --var51) {
                              for(var53 = 15; var53 >= 0; --var53) {
                                 var0.aByteArray489[var52] = var0.aByteArray489[var0.anIntArray493[var51] + var53];
                                 --var52;
                              }

                              var0.anIntArray493[var51] = var52 + 1;
                           }
                        }
                     }

                     ++var0.anIntArray485[var0.aByteArray491[var9 & 0xff] & 0xff];
                     Class93.anIntArray732[var45] = var0.aByteArray491[var9 & 0xff] & 0xff;
                     ++var45;
                     if(var42 == 0) {
                        ++var341;
                        var42 = 50;
                        var47 = var0.aByteArray494[var341];
                        var19 = var0.anIntArray500[var47];
                        var20 = var0.anIntArrayArray497[var47];
                        var15 = var0.anIntArrayArray499[var47];
                        var17 = var0.anIntArrayArray498[var47];
                     }

                     --var42;
                     var46 = var19;

                     for(var49 = method280(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
                        ++var46;
                        var48 = method283(var0);
                     }

                     var50 = var15[var49 - var17[var46]];
                  } else {
                     var36 = -1;
                     var38 = 1;

                     do {
                        if(var50 == 0) {
                           var36 += var38;
                        } else if(var50 == 1) {
                           var36 += var38 * 2;
                        }

                        var38 *= 2;
                        if(var42 == 0) {
                           ++var341;
                           var42 = 50;
                           var47 = var0.aByteArray494[var341];
                           var19 = var0.anIntArray500[var47];
                           var20 = var0.anIntArrayArray497[var47];
                           var15 = var0.anIntArrayArray499[var47];
                           var17 = var0.anIntArrayArray498[var47];
                        }

                        --var42;
                        var46 = var19;

                        for(var49 = method280(var19, var0); var49 > var20[var46]; var49 = var49 << 1 | var48) {
                           ++var46;
                           var48 = method283(var0);
                        }

                        var50 = var15[var49 - var17[var46]];
                     } while(var50 == 0 || var50 == 1);

                     ++var36;
                     var9 = var0.aByteArray491[var0.aByteArray489[var0.anIntArray493[0]] & 0xff];

                     for(var0.anIntArray485[var9 & 0xff] += var36; var36 > 0; --var36) {
                        Class93.anIntArray732[var45] = var9 & 0xff;
                        ++var45;
                     }
                  }
               }

               var0.anInt502 = 0;
               var0.aByte478 = 0;
               var0.anIntArray487[0] = 0;

               for(var35 = 1; var35 <= 256; var35++) {
                  var0.anIntArray487[var35] = var0.anIntArray485[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; var35++) {
                  var0.anIntArray487[var35] += var0.anIntArray487[var35 - 1];
               }

               for(var35 = 0; var35 < var45; var35++) {
                  var9 = (byte)(Class93.anIntArray732[var35] & 0xff);
                  Class93.anIntArray732[var0.anIntArray487[var9 & 0xff]] |= var35 << 8;
                  ++var0.anIntArray487[var9 & 0xff];
               }

               var0.anInt481 = Class93.anIntArray732[var0.anInt492] >> 8;
               var0.anInt473 = 0;
               var0.anInt481 = Class93.anIntArray732[var0.anInt481];
               var0.anInt484 = (byte)(var0.anInt481 & 0xff);
               var0.anInt481 >>= 8;
               ++var0.anInt473;
               var0.anInt501 = var45;
               method277(var0);
               if(var0.anInt473 == var0.anInt501 + 1 && var0.anInt502 == 0) {
                  var23 = true;
                  break;
               }

               var23 = false;
               break;
            }
         }

         return;
      }
   }

   static byte method279(Class46 var0) {
      return (byte)method280(8, var0);
   }

   static int method280(int var0, Class46 var1) {
      while(var1.anInt470 < var0) {
         var1.anInt480 = var1.anInt480 << 8 | var1.aByteArray471[var1.anInt486] & 0xff;
         var1.anInt470 += 8;
         ++var1.anInt486;
         ++var1.anInt476;
         if(var1.anInt476 == 0) {
            ;
         }
      }

      int var2 = var1.anInt480 >> var1.anInt470 - var0 & (1 << var0) - 1;
      var1.anInt470 -= var0;
      return var2;
   }

   static void method281(Class46 var0) {
      var0.anInt488 = 0;

      for(int var1 = 0; var1 < 256; var1++) {
         if(var0.aBoolArray475[var1]) {
            var0.aByteArray491[var0.anInt488] = (byte)var1;
            ++var0.anInt488;
         }
      }

   }

   static void method282(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var9;
      int var10;
      for(var9 = var4; var9 <= var5; var9++) {
         for(var10 = 0; var10 < var6; var10++) {
            if(var3[var10] == var9) {
               var2[var7] = var10;
               ++var7;
            }
         }
      }

      for(var9 = 0; var9 < 23; var9++) {
         var1[var9] = 0;
      }

      for(var9 = 0; var9 < var6; var9++) {
         ++var1[var3[var9] + 1];
      }

      for(var9 = 1; var9 < 23; var9++) {
         var1[var9] += var1[var9 - 1];
      }

      for(var9 = 0; var9 < 23; var9++) {
         var0[var9] = 0;
      }

      var10 = 0;

      for(var9 = var4; var9 <= var5; var9++) {
         var10 += var1[var9 + 1] - var1[var9];
         var0[var9] = var10 - 1;
         var10 <<= 1;
      }

      for(var9 = var4 + 1; var9 <= var5; var9++) {
         var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
      }

   }

   static byte method283(Class46 var0) {
      return (byte)method280(1, var0);
   }

   Class55() throws Throwable {
      throw new Error();
   }

}
