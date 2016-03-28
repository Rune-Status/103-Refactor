public class BlockType implements IOrdinal {

   public static boolean aBool725;
   public int type;
   int ordinal;
   public static BlockType TRUST = new BlockType(1, 0);
   public static BlockType NORMAL = new BlockType(0, 2);
   public static BlockType PIN = new BlockType(3, 3);
   public static BlockType PIN_TRUST = new BlockType(2, 1);

   public int ordinal() {
      return this.ordinal;
   }

   BlockType(int var1, int var2) {
      this.type = var1;
      this.ordinal = var2;
   }

}
