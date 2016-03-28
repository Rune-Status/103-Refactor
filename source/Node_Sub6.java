import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Node_Sub6 extends Node {

   int anInt1269;
   int anInt1270;
   int anInt1271;
   int anInt1272;
   int anInt1274;
   int anInt1275;
   Node_Sub4_Sub2 aNode_Sub4_Sub2_1280;
   ObjectType anObjectDefinition1283;
   int anInt1281;
   int anInt1282;
   int anInt1277;
   int anInt1278;
   int[] anIntArray1273;
   Node_Sub4_Sub2 aNode_Sub4_Sub2_1276;
   static Deque aDeque1279 = new Deque();

   void method536(int var1) {
      int var2 = this.anInt1281;
      ObjectType var3 = this.anObjectDefinition1283.transform();
      if(var3 != null) {
         this.anInt1281 = var3.anInt1715;
         this.anInt1282 = var3.anInt1716 * 1545946752;
         this.anInt1277 = var3.anInt1687 * -1875457101;
         this.anInt1278 = var3.anInt1717;
         this.anIntArray1273 = var3.anIntArray1697;
      } else {
         this.anInt1281 = -1;
         this.anInt1282 = 0;
         this.anInt1277 = 0;
         this.anInt1278 = 0;
         this.anIntArray1273 = null;
      }

      if(this.anInt1281 != var2 && this.aNode_Sub4_Sub2_1276 != null) {
         FriendedPlayer.aNode_Sub4_Sub1_740.method730(this.aNode_Sub4_Sub2_1276);
         this.aNode_Sub4_Sub2_1276 = null;
      }

   }

   public static void method537() {
      UnderlayType.underlays.method429();
   }

   public static Object method538(byte[] var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else {
         if(var0.length > 136 && !AbstractByteBuffer.aBool528) {
            try {
               DirectByteBuffer var3 = new DirectByteBuffer();
               var3.put(var0);
               return var3;
            } catch (Throwable var31) {
               AbstractByteBuffer.aBool528 = true;
            }
         }

         return var1 ? Class44.arrayCopy(var0) : var0;
      }
   }

   public static void initialize(String var0, String var1, int var2, int var3) throws IOException {
      Class75.indexCount = var3;
      Class75.buildOrdinal = var2;

      try {
         Class115.osName = System.getProperty("os.name");
      } catch (Exception var11) {
         Class115.osName = "Unknown";
      }

      DynamicObject.osNameLC = Class115.osName.toLowerCase();

      try {
         BitBuf.userHome = System.getProperty("user.home");
         if(BitBuf.userHome != null) {
            BitBuf.userHome = BitBuf.userHome + "/";
         }
      } catch (Exception var10) {
         ;
      }

      try {
         if(DynamicObject.osNameLC.startsWith("win")) {
            if(BitBuf.userHome == null) {
               BitBuf.userHome = System.getenv("USERPROFILE");
            }
         } else if(BitBuf.userHome == null) {
            BitBuf.userHome = System.getenv("HOME");
         }

         if(BitBuf.userHome != null) {
            BitBuf.userHome = BitBuf.userHome + "/";
         }
      } catch (Exception var9) {
         ;
      }

      if(BitBuf.userHome == null) {
         BitBuf.userHome = "~/";
      }

      BoundaryDecorationStub.cacheLocations = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", BitBuf.userHome, "/tmp/", ""};
      Class67.historicLocations = new String[]{".jagex_cache_" + Class75.buildOrdinal, ".file_store_" + Class75.buildOrdinal};
      int var4 = 0;

      int var15;
      File var17;
      label116:
      while(var4 < 4) {
         Class75.cacheLocation = GraphicsStub.method933(var0, var1, var4);
         if(!Class75.cacheLocation.exists()) {
            Class75.cacheLocation.mkdirs();
         }

         File[] var13 = Class75.cacheLocation.listFiles();
         if(var13 == null) {
            break;
         }

         File[] var16 = var13;
         var15 = 0;

         while(true) {
            if(var15 >= var16.length) {
               break label116;
            }

            var17 = var16[var15];
            if(!AbstractIndex.method393(var17, false)) {
               ++var4;
               break;
            }

            ++var15;
         }
      }

      Timer.setCacheDirectory(Class75.cacheLocation);

      try {
         File var131 = new File(BitBuf.userHome, "random.dat");
         int var14;
         if(var131.exists()) {
            Class75.randomDat = new CacheFile(new CacheFileAccessor(var131, "rw", 25L), 24, 0);
         } else {
            label98:
            for(var15 = 0; var15 < Class67.historicLocations.length; var15++) {
               for(var14 = 0; var14 < BoundaryDecorationStub.cacheLocations.length; var14++) {
                  var17 = new File(BoundaryDecorationStub.cacheLocations[var14] + Class67.historicLocations[var15] + File.separatorChar + "random.dat");
                  if(var17.exists()) {
                     Class75.randomDat = new CacheFile(new CacheFileAccessor(var17, "rw", 25L), 24, 0);
                     break label98;
                  }
               }
            }
         }

         if(Class75.randomDat == null) {
            RandomAccessFile var151 = new RandomAccessFile(var131, "rw");
            var14 = var151.read();
            var151.seek(0L);
            var151.write(var14);
            var151.seek(0L);
            var151.close();
            Class75.randomDat = new CacheFile(new CacheFileAccessor(var131, "rw", 25L), 24, 0);
         }
      } catch (IOException var12) {
         ;
      }

      Class75.cacheDataFile = new CacheFile(new CacheFileAccessor(VarClientStringType.method700("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
      Class75.referenceFile = new CacheFile(new CacheFileAccessor(VarClientStringType.method700("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      Class39.cacheIndexFiles = new CacheFile[Class75.indexCount];

      for(var4 = 0; var4 < Class75.indexCount; var4++) {
         Class39.cacheIndexFiles[var4] = new CacheFile(new CacheFileAccessor(VarClientStringType.method700("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0);
      }

   }

   public static SequenceType getSequenceType(int id) {
      SequenceType type = (SequenceType)SequenceType.sequences.get((long)id);
      if(type != null) {
         return type;
      } else {
         byte[] bytes = SequenceType.seq_ref.getFile(12, id);
         type = new SequenceType();
         if(bytes != null) {
            type.decode(new ByteBuf(bytes));
         }

         type.post();
         SequenceType.sequences.put(type, (long)id);
         return type;
      }
   }

}
