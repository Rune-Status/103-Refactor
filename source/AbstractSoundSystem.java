import java.awt.Component;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class AbstractSoundSystem {

   public static int sampleRate;
   int anInt165;
   public static boolean highMemory;
   public static int anInt172;
   int anInt158 = 32;
   Node_Sub4[] aNode_Sub4Array159 = new Node_Sub4[8];
   long aLong162 = 0L;
   long aLong163 = AnimationSkin.currentTimeMs();
   long aLong167 = 0L;
   int anInt168 = 0;
   int anInt169 = 0;
   int anInt170 = 0;
   int anInt171 = 0;
   boolean aBool173 = true;
   Node_Sub4[] aNode_Sub4Array175 = new Node_Sub4[8];
   int anInt164;
   int anInt174;
   int[] anIntArray160;
   static Class19 aClass19_156;
   Node_Sub4 aNode_Sub4_161;

   void flush() throws Exception {
   }

   static long method81() {
      try {
         URL var8 = new URL(Class37.method212("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var8.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         ByteBuf var4 = new ByteBuf(new byte[1000]);

         do {
            int var5 = var3.read(var4.payload, var4.position, 1000 - var4.position);
            if(var5 == -1) {
               var4.position = 0;
               long var6 = var4.getLong();
               return var6;
            }

            var4.position += var5;
         } while(var4.position < 1000);

         return 0L;
      } catch (Exception var81) {
         return 0L;
      }
   }

   public final synchronized void method82() {
      if(this.anIntArray160 != null) {
         long var1 = AnimationSkin.currentTimeMs();

         try {
            if(this.aLong167 != 0L) {
               if(var1 < this.aLong167) {
                  return;
               }

               this.create(this.anInt164);
               this.aLong167 = 0L;
               this.aBool173 = true;
            }

            int var5 = this.size();
            if(this.anInt170 - var5 > this.anInt168) {
               this.anInt168 = this.anInt170 - var5;
            }

            int var4 = this.anInt174 + this.anInt165;
            if(var4 + 256 > 16384) {
               var4 = 16128;
            }

            if(var4 + 256 > this.anInt164) {
               this.anInt164 += 1024;
               if(this.anInt164 > 16384) {
                  this.anInt164 = 16384;
               }

               this.close();
               this.create(this.anInt164);
               var5 = 0;
               this.aBool173 = true;
               if(var4 + 256 > this.anInt164) {
                  var4 = this.anInt164 - 256;
                  this.anInt174 = var4 - this.anInt165;
               }
            }

            while(var5 < var4) {
               this.method94(this.anIntArray160, 256);
               this.write();
               var5 += 256;
            }

            if(var1 > this.aLong162) {
               if(!this.aBool173) {
                  if(this.anInt168 == 0 && this.anInt169 == 0) {
                     this.close();
                     this.aLong167 = var1 + 2000L;
                     return;
                  }

                  this.anInt174 = Math.min(this.anInt169, this.anInt168);
                  this.anInt169 = this.anInt168;
               } else {
                  this.aBool173 = false;
               }

               this.anInt168 = 0;
               this.aLong162 = var1 + 2000L;
            }

            this.anInt170 = var5;
         } catch (Exception var6) {
            this.close();
            this.aLong167 = var1 + 2000L;
         }

         try {
            if(var1 > this.aLong163 + 500000L) {
               var1 = this.aLong163;
            }

            while(var1 > this.aLong163 + 5000L) {
               this.method85(256);
               this.aLong163 += (long)(256000 / sampleRate);
            }
         } catch (Exception var51) {
            this.aLong163 = var1;
         }
      }

   }

   public final synchronized void method83() {
      this.aBool173 = true;

      try {
         this.flush();
      } catch (Exception var2) {
         this.close();
         this.aLong167 = AnimationSkin.currentTimeMs() + 2000L;
      }

   }

   public final synchronized void method84() {
      if(aClass19_156 != null) {
         boolean var2 = true;

         for(int var1 = 0; var1 < 2; var1++) {
            if(aClass19_156.aClass8Array264[var1] == this) {
               aClass19_156.aClass8Array264[var1] = null;
            }

            if(aClass19_156.aClass8Array264[var1] != null) {
               var2 = false;
            }
         }

         if(var2) {
            aClass19_156.aBool265 = true;

            while(aClass19_156.aBool266) {
               Class96_Sub1.sleep(50L);
            }

            aClass19_156 = null;
         }
      }

      this.close();
      this.anIntArray160 = null;
   }

   final void method85(int var1) {
      this.anInt171 -= var1;
      if(this.anInt171 < 0) {
         this.anInt171 = 0;
      }

      if(this.aNode_Sub4_161 != null) {
         this.aNode_Sub4_161.method528(var1);
      }

   }

   final void method86(Node_Sub4 var1, int var2) {
      int var3 = var2 >> 5;
      Node_Sub4 var4 = this.aNode_Sub4Array175[var3];
      if(var4 == null) {
         this.aNode_Sub4Array159[var3] = var1;
      } else {
         var4.aNode_Sub4_1259 = var1;
      }

      this.aNode_Sub4Array175[var3] = var1;
      var1.anInt1260 = var2;
   }

   void create(Component var1) throws Exception {
   }

   void create(int var1) throws Exception {
   }

   int size() throws Exception {
      return this.anInt164;
   }

   void write() throws Exception {
   }

   public final synchronized void method91(Node_Sub4 var1) {
      this.aNode_Sub4_161 = var1;
   }

   public final void method92() {
      this.aBool173 = true;
   }

   void close() {
   }

   final void method94(int[] var1, int var2) {
      int var3 = var2;
      if(highMemory) {
         var3 = var2 << 1;
      }

      Class45.method232(var1, 0, var3);
      this.anInt171 -= var2;
      if(this.aNode_Sub4_161 != null && this.anInt171 <= 0) {
         this.anInt171 += sampleRate >> 4;
         IsaacRandom.method67(this.aNode_Sub4_161);
         this.method86(this.aNode_Sub4_161, this.aNode_Sub4_161.method525());
         int var9 = 0;
         int var7 = 255;

         int var10;
         Node_Sub4 var12;
         label105:
         for(var10 = 7; var7 != 0; --var10) {
            int var17;
            int var18;
            if(var10 < 0) {
               var17 = var10 & 0x3;
               var18 = -(var10 >> 2);
            } else {
               var17 = var10;
               var18 = 0;
            }

            for(int var13 = var7 >>> var17 & 0x11111111; var13 != 0; var13 >>>= 4) {
               if((var13 & 0x1) != 0) {
                  var7 &= ~(1 << var17);
                  var12 = null;
                  Node_Sub4 var5 = this.aNode_Sub4Array159[var17];

                  label99:
                  while(true) {
                     while(true) {
                        if(var5 == null) {
                           break label99;
                        }

                        Node_Sub2 var14 = var5.aNode_Sub2_1258;
                        if(var14 != null && var14.anInt1212 > var18) {
                           var7 |= 1 << var17;
                           var12 = var5;
                           var5 = var5.aNode_Sub4_1259;
                        } else {
                           var5.aBool1261 = true;
                           int var15 = var5.method527();
                           var9 += var15;
                           if(var14 != null) {
                              var14.anInt1212 += var15;
                           }

                           if(var9 >= this.anInt158) {
                              break label105;
                           }

                           Node_Sub4 var6 = var5.method526();
                           if(var6 != null) {
                              for(int var16 = var5.anInt1260; var6 != null; var6 = var5.method529()) {
                                 this.method86(var6, var6.method525() * var16 >> 8);
                              }
                           }

                           Node_Sub4 var181 = var5.aNode_Sub4_1259;
                           var5.aNode_Sub4_1259 = null;
                           if(var12 == null) {
                              this.aNode_Sub4Array159[var17] = var181;
                           } else {
                              var12.aNode_Sub4_1259 = var181;
                           }

                           if(var181 == null) {
                              this.aNode_Sub4Array175[var17] = var12;
                           }

                           var5 = var181;
                        }
                     }
                  }
               }

               var17 += 4;
               ++var18;
            }
         }

         for(var10 = 0; var10 < 8; var10++) {
            Node_Sub4 var161 = this.aNode_Sub4Array159[var10];
            Node_Sub4[] var171 = this.aNode_Sub4Array159;
            this.aNode_Sub4Array175[var10] = null;

            for(var171[var10] = null; var161 != null; var161 = var12) {
               var12 = var161.aNode_Sub4_1259;
               var161.aNode_Sub4_1259 = null;
            }
         }
      }

      if(this.anInt171 < 0) {
         this.anInt171 = 0;
      }

      if(this.aNode_Sub4_161 != null) {
         this.aNode_Sub4_161.method530(var1, 0, var2);
      }

      this.aLong163 = AnimationSkin.currentTimeMs();
   }

   public static OverlayType getOverlayType(int id) {
      OverlayType type = (OverlayType)OverlayType.overlays.get((long)id);
      if(type != null) {
         return type;
      } else {
         byte[] bytes = OverlayType.overlay_ref.getFile(4, id);
         type = new OverlayType();
         if(bytes != null) {
            type.decode(new ByteBuf(bytes), id);
         }

         type.post();
         OverlayType.overlays.put(type, (long)id);
         return type;
      }
   }

   static void method96(int var0, int var1, int var2, int var3) {
      Widget var4 = AbstractProducer.method146(var0, var1);
      if(var4 != null && var4.anObjectArray1130 != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.widget = var4;
         var5.args = var4.anObjectArray1130;
         Class96_Sub1.execute(var5);
      }

      Client.anInt2129 = var3;
      Client.spellSelected = true;
      SequenceType.anInt1488 = var0;
      Client.anInt2128 = var1;
      Class31.currentSpellTargets = var2;
      Class68.method326(var4);
   }

}
