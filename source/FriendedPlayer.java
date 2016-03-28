public class FriendedPlayer {

   int world;
   boolean aBool736;
   int anInt737;
   boolean aBool738;
   String displayName;
   static int cameraZ;
   static int anInt739;
   static Node_Sub4_Sub1 aNode_Sub4_Sub1_740;
   String previousName;
   static Sprite[] titlemuteSprite;

   static final void method407() {
      for(int var0 = 0; var0 < Client.anInt2225; var0++) {
         int var1 = Client.npcIndices[var0];
         Npc var2 = Client.npcArray[var1];
         if(var2 != null) {
            Class69.method329(var2, var2.type.anInt1589);
         }
      }

   }

   static final void method408(Character var0) {
      int var1 = var0.anInt1928 - Client.engineCycle;
      int var3 = var0.anInt1954 * -777033600 + var0.anInt1915 * 64;
      int var2 = var0.anInt1915 * 64 + var0.anInt1944 * 20962432;
      var0.strictX += (var3 - var0.strictX) / var1;
      var0.strictY += (var2 - var0.strictY) / var1;
      var0.anInt1956 = 0;
      var0.anInt1953 = var0.anInt1948;
   }

   static final void addMenuRow(String var0, String var1, int var2, int var3, int var4, int var5) {
      if(!Client.menuOpen && Client.menuItemCount < 500) {
         Client.menuActions[Client.menuItemCount] = var0;
         Client.menuNouns[Client.menuItemCount] = var1;
         Client.menuOpcodes[Client.menuItemCount] = var2;
         Client.menuArg0[Client.menuItemCount] = var3;
         Client.menuArg1[Client.menuItemCount] = var4;
         Client.menuArg2[Client.menuItemCount] = var5;
         ++Client.menuItemCount;
      }

   }

   static final void method409(int var0, int var1, int var2, boolean var3) {
      if(IdentKitType.loadWidget(var0)) {
         Class4.method70(Widget.interfaces[var0], -1, var1, var2, var3);
      }

   }

   public static ItemType getItemType(int var0) {
      ItemType type = (ItemType)ItemType.items.get((long)var0);
      if(type != null) {
         return type;
      } else {
         byte[] var2 = ItemType.item_ref.getFile(10, var0);
         type = new ItemType();
         type.id = var0;
         if(var2 != null) {
            type.decode(new ByteBuf(var2));
         }

         type.post();
         if(type.anInt1633 != -1) {
            type.method819(getItemType(type.anInt1633), getItemType(type.anInt1640));
         }

         if(type.notedId != -1) {
            type.method816(getItemType(type.notedId), getItemType(type.unnotedId));
         }

         if(!Class94.aBool735 && type.aBool1618) {
            type.name = "Members object";
            type.aBool1624 = false;
            type.groundActions = null;
            type.actions = null;
            type.anInt1639 = 0;
         }

         ItemType.items.put(type, (long)var0);
         return type;
      }
   }

   static void method410(int var0, int var1) {
      Client.outBuffer.putHeader(2);
      Client.outBuffer.putLEInt(var0);
      Client.outBuffer.putShort(var1);
   }

}
