import java.math.BigInteger;

public class Class22 {

   static BuildType buildType;
   static int anInt286;
   static BigInteger aBigInteger283 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static BigInteger aBigInteger284 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   Class22() throws Throwable {
      throw new Error();
   }

   static void method158(int var0) {
      if(var0 == -1 && !Client.aBool2191) {
         Class110.aNode_Sub4_Sub4_784.method856();
         Class110.anInt782 = 1;
         Class110.aClass87_783 = null;
      } else if(var0 != -1 && Client.anInt2202 != var0 && Client.anInt2201 != 0 && !Client.aBool2191) {
         CacheIndex var2 = Class2.midiTrack1Index;
         int var1 = Client.anInt2201;
         Class110.anInt782 = 1;
         Class110.aClass87_783 = var2;
         Class98.musicId = var0;
         Class111.anInt788 = 0;
         Class110.anInt787 = var1;
         Class44.aBool464 = false;
         Class110.anInt785 = 2;
      }

      Client.anInt2202 = var0;
   }

}
