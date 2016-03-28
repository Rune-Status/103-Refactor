public class ClanMate extends Node {

   int world;
   byte rank;
   static boolean aBool1221;
   protected static int anInt1222;
   String aString1223;
   String displayName;

   public static VarClientStringType getVarClientStringType(int var0) {
      VarClientStringType type = (VarClientStringType)VarClientStringType.varclientstrings.get((long)var0);
      if(type != null) {
         return type;
      } else {
         byte[] bytes = VarClientStringType.varclientstring_ref.getFile(15, var0);
         type = new VarClientStringType();
         if(bytes != null) {
            type.decode(new ByteBuf(bytes));
         }

         VarClientStringType.varclientstrings.put(type, (long)var0);
         return type;
      }
   }

}
