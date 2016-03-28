import java.util.zip.CRC32;

public class Class81 {

   public static Connection js5Con;
   public static long aLong668;
   public static ByteBuf currentBuffer;
   public static int anInt667 = 0;
   public static int anInt669 = 0;
   public static int anInt670 = 0;
   public static byte xorKey = 0;
   public static NodeQueue aNodeQueue_672 = new NodeQueue();
   static NodeTable aNodeTable673 = new NodeTable(4096);
   public static int anInt674 = 0;
   public static NodeTable aNodeTable675 = new NodeTable(4096);
   public static int currentPosition = 0;
   public static ByteBuf aBuffer677 = new ByteBuf(8);
   public static int anInt679 = 0;
   public static CRC32 aCRC32_680 = new CRC32();
   public static CacheIndex[] aClass87_Sub1Array681 = new CacheIndex[256];
   public static NodeTable aNodeTable682 = new NodeTable(32);
   public static int anInt683 = 0;
   public static int anInt684 = 0;
   public static NodeTable aNodeTable685 = new NodeTable(4096);

   static final void method361() {
      if(Client.anInt2045 > 0) {
         logout();
      } else {
         Node_Sub8.method550(40);
         Class35.aClass60_394 = Class31.gameConnection;
         Class31.gameConnection = null;
      }

   }

   static final void logout() {
      if(Class31.gameConnection != null) {
         Class31.gameConnection.shutdown();
         Class31.gameConnection = null;
      }

      Timer.method325();
      InterfaceNode.landscape.method15();

      for(int var1 = 0; var1 < 4; var1++) {
         Client.collisionMaps[var1].method244();
      }

      System.gc();
      Class65.method320(2);
      Client.anInt2202 = -1;
      Client.aBool2191 = false;

      for(Node_Sub6 var11 = (Node_Sub6)Node_Sub6.aDeque1279.getFront(); var11 != null; var11 = (Node_Sub6)Node_Sub6.aDeque1279.getNext()) {
         if(var11.aNode_Sub4_Sub2_1276 != null) {
            FriendedPlayer.aNode_Sub4_Sub1_740.method730(var11.aNode_Sub4_Sub2_1276);
            var11.aNode_Sub4_Sub2_1276 = null;
         }

         if(var11.aNode_Sub4_Sub2_1280 != null) {
            FriendedPlayer.aNode_Sub4_Sub1_740.method730(var11.aNode_Sub4_Sub2_1280);
            var11.aNode_Sub4_Sub2_1280 = null;
         }
      }

      Node_Sub6.aDeque1279.method467();
      Node_Sub8.method550(10);
   }

   Class81() throws Throwable {
      throw new Error();
   }

}
