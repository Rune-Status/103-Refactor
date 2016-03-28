public class SkeletonSet extends DualNode {

   static int[][] regionXTEAs;
   AnimationSkeleton[] skeletons;

   public boolean method776(int var1, byte var2) {
      return this.skeletons[var1].aBool297;
   }

   public SkeletonSet(AbstractIndex skeletonIndex, AbstractIndex skinIndex, int var3, boolean var4) {
      Deque deque = new Deque();
      int skeletonCount = skeletonIndex.fileCount(var3);
      this.skeletons = new AnimationSkeleton[skeletonCount];
      int[] childs = skeletonIndex.getChilds(var3);

      for(int child = 0; child < childs.length; child++) {
         byte[] bytes = skeletonIndex.getFile(var3, childs[child]);
         AnimationSkin var10 = null;
         int skinId = (bytes[0] & 0xff) << 8 | bytes[1] & 0xff;

         for(AnimationSkin var11 = (AnimationSkin)deque.getFront(); var11 != null; var11 = (AnimationSkin)deque.getNext()) {
            if(var11.anInt1263 == skinId) {
               var10 = var11;
               break;
            }
         }

         if(var10 == null) {
            byte[] skinBytes;
            if(var4) {
               skinBytes = skinIndex.method390(0, skinId);
            } else {
               skinBytes = skinIndex.method390(skinId, 0);
            }

            var10 = new AnimationSkin(skinId, skinBytes);
            deque.method475(var10);
         }

         this.skeletons[childs[child]] = new AnimationSkeleton(bytes, var10);
      }

   }

   static final void method777(Character var0, int var1) {
      Class2.method62(var0.strictX, var0.strictY, var1);
   }

   static Timer method778(int var0) {
      try {
         return new NanoTimer();
      } catch (Throwable var2) {
         return new MilliTimer();
      }
   }

}
