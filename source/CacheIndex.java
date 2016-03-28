import java.awt.datatransfer.Clipboard;
import java.util.zip.CRC32;

public class CacheIndex extends AbstractIndex {

   static Clipboard sysClipboard;
   static Class4 aClass4_1333;
   volatile boolean[] aBoolArray1326;
   int anInt1335 = -1;
   volatile boolean aBool1330 = false;
   boolean aBool1327 = false;
   IndexTable aClass62_1334;
   IndexTable aClass62_1324;
   int anInt1325;
   int crcValue;
   int anInt1332;
   static CRC32 crc32 = new CRC32();

   public static int method555(int var0) {
      return var0 >> 17 & 0x7;
   }

   public int percentage() {
      if(this.aBool1330) {
         return 100;
      } else if(this.anObjectArray704 != null) {
         return 99;
      } else {
         int var1 = NpcType.method804(255, this.anInt1325);
         if(var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   void method374(int var1, byte var2) {
      int var3 = this.anInt1325;
      long var4 = (long)((var3 << 16) + var1);
      FileRequest var6 = (FileRequest)Class81.aNodeTable673.get(var4);
      if(var6 != null) {
         Class81.aNodeQueue_672.method422(var6);
      }

   }

   void method379(int var1) {
      if(this.aClass62_1334 != null && this.aBoolArray1326 != null && this.aBoolArray1326[var1]) {
         Class59.method292(var1, this.aClass62_1334, this);
      } else {
         Class39.method221(this, this.anInt1325, var1, this.anIntArray698[var1], (byte)2, true);
      }

   }

   public void method557(int var1, byte[] var2, boolean var3, boolean var4) {
      if(var3) {
         if(this.aBool1330) {
            throw new RuntimeException();
         }

         if(this.aClass62_1324 != null) {
            int var17 = this.anInt1325;
            IndexTable var18 = this.aClass62_1324;
            Node_Sub9 var19 = new Node_Sub9();
            var19.anInt1338 = 0;
            var19.key = (long)var17;
            var19.aByteArray1340 = var2;
            var19.aClass62_1336 = var18;
            Deque var20 = Class90.aDeque718;
            synchronized(var20) {
               Class90.aDeque718.method475(var19);
            }

            Object var21 = Class90.anObject720;
            synchronized(var21) {
               if(Class90.anInt719 == 0) {
                  IsaacRandom.taskManager.createRunnable(new Class90(), 5);
               }

               Class90.anInt719 = 600;
            }
         }

         this.method376(var2);
         this.method558();
      } else {
         var2[var2.length - 2] = (byte)(this.anIntArray707[var1] >> 8);
         var2[var2.length - 1] = (byte)this.anIntArray707[var1];
         if(this.aClass62_1334 != null) {
            IndexTable var171 = this.aClass62_1334;
            Node_Sub9 var181 = new Node_Sub9();
            var181.anInt1338 = 0;
            var181.key = (long)var1;
            var181.aByteArray1340 = var2;
            var181.aClass62_1336 = var171;
            Deque var191 = Class90.aDeque718;
            synchronized(var191) {
               Class90.aDeque718.method475(var181);
            }

            Object var201 = Class90.anObject720;
            synchronized(var201) {
               if(Class90.anInt719 == 0) {
                  IsaacRandom.taskManager.createRunnable(new Class90(), 5);
               }

               Class90.anInt719 = 600;
            }

            this.aBoolArray1326[var1] = true;
         }

         if(var4) {
            this.anObjectArray704[var1] = Node_Sub6.method538(var2, false);
         }
      }

   }

   void method558() {
      this.aBoolArray1326 = new boolean[this.anObjectArray704.length];

      int var1;
      for(var1 = 0; var1 < this.aBoolArray1326.length; var1++) {
         this.aBoolArray1326[var1] = false;
      }

      if(this.aClass62_1334 == null) {
         this.aBool1330 = true;
      } else {
         this.anInt1335 = -1;

         for(var1 = 0; var1 < this.aBoolArray1326.length; var1++) {
            if(this.anIntArray702[var1] > 0) {
               IndexTable var2 = this.aClass62_1334;
               Node_Sub9 var4 = new Node_Sub9();
               var4.anInt1338 = 1;
               var4.key = (long)var1;
               var4.aClass62_1336 = var2;
               var4.aClass87_Sub1_1337 = this;
               Deque var5 = Class90.aDeque718;
               synchronized(var5) {
                  Class90.aDeque718.method475(var4);
               }

               Object var10 = Class90.anObject720;
               synchronized(var10) {
                  if(Class90.anInt719 == 0) {
                     IsaacRandom.taskManager.createRunnable(new Class90(), 5);
                  }

                  Class90.anInt719 = 600;
               }

               this.anInt1335 = var1;
            }
         }

         if(this.anInt1335 == -1) {
            this.aBool1330 = true;
         }
      }

   }

   public int method559() {
      int var1 = 0;
      int var3 = 0;

      int var2;
      for(var2 = 0; var2 < this.anObjectArray704.length; var2++) {
         if(this.anIntArray702[var2] > 0) {
            var1 += 100;
            var3 += this.method562(var2);
         }
      }

      if(var1 == 0) {
         return 100;
      } else {
         var2 = var3 * 100 / var1;
         return var2;
      }
   }

   public CacheIndex(IndexTable var1, IndexTable var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.aClass62_1334 = var1;
      this.aClass62_1324 = var2;
      this.anInt1325 = var3;
      this.aBool1327 = var6;
      int var7 = this.anInt1325;
      if(Class93.aBuffer731 != null) {
         Class93.aBuffer731.position = var7 * 8 + 5;
         int var9 = Class93.aBuffer731.getInt();
         int var10 = Class93.aBuffer731.getInt();
         this.setInformation(var9, var10);
      } else {
         Class39.method221((CacheIndex)null, 255, 255, 0, (byte)0, true);
         Class81.aClass87_Sub1Array681[var7] = this;
      }

   }

   public static VarBitType getVarBitType(int id) {
      VarBitType type = (VarBitType)VarBitType.varbits.get((long)id);
      if(type != null) {
         return type;
      } else {
         byte[] bytes = VarBitType.varbit_ref.getFile(14, id);
         type = new VarBitType();
         if(bytes != null) {
            type.decode(new ByteBuf(bytes));
         }

         VarBitType.varbits.put(type, (long)id);
         return type;
      }
   }

   void method560(IndexTable var1, int var2, byte[] var3, boolean var4) {
      int var6;
      if(this.aClass62_1324 == var1) {
         if(this.aBool1330) {
            throw new RuntimeException();
         } else if(var3 == null) {
            Class39.method221(this, 255, this.anInt1325, this.crcValue, (byte)0, true);
         } else {
            crc32.reset();
            crc32.update(var3, 0, var3.length);
            var6 = (int)crc32.getValue();
            ByteBuf var91 = new ByteBuf(UnderlayType.decodeContainer(var3));
            int var5 = var91.getUByte();
            if(var5 != 5 && var5 != 6) {
               throw new RuntimeException(var5 + "," + this.anInt1325 + "," + var2);
            } else {
               int var8 = 0;
               if(var5 >= 6) {
                  var8 = var91.getInt();
               }

               if(this.crcValue != var6 || this.anInt1332 != var8) {
                  Class39.method221(this, 255, this.anInt1325, this.crcValue, (byte)0, true);
               } else {
                  this.method376(var3);
                  this.method558();
               }
            }
         }
      } else {
         if(!var4 && this.anInt1335 == var2) {
            this.aBool1330 = true;
         }

         if(var3 != null && var3.length > 2) {
            crc32.reset();
            crc32.update(var3, 0, var3.length - 2);
            var6 = (int)crc32.getValue();
            int var9 = ((var3[var3.length - 2] & 0xff) << 8) + (var3[var3.length - 1] & 0xff);
            if(this.anIntArray698[var2] == var6 && this.anIntArray707[var2] == var9) {
               this.aBoolArray1326[var2] = true;
               if(var4) {
                  this.anObjectArray704[var2] = Node_Sub6.method538(var3, false);
               }

            } else {
               this.aBoolArray1326[var2] = false;
               if(this.aBool1327 || var4) {
                  Class39.method221(this, this.anInt1325, var2, this.anIntArray698[var2], (byte)2, var4);
               }

            }
         } else {
            this.aBoolArray1326[var2] = false;
            if(this.aBool1327 || var4) {
               Class39.method221(this, this.anInt1325, var2, this.anIntArray698[var2], (byte)2, var4);
            }

         }
      }
   }

   public void setInformation(int var1, int var2) {
      this.crcValue = var1;
      this.anInt1332 = var2;
      if(this.aClass62_1324 != null) {
         Class59.method292(this.anInt1325, this.aClass62_1324, this);
      } else {
         Class39.method221(this, 255, this.anInt1325, this.crcValue, (byte)0, true);
      }

   }

   int method562(int var1) {
      return this.anObjectArray704[var1] != null ? 100 : (this.aBoolArray1326[var1] ? 100 : NpcType.method804(this.anInt1325, var1));
   }

}
