
public class SkeletonSet extends DualNode {

	AnimationSkeleton[] skeletons;
	static int[][] regionXTEAs;

	public boolean method776(int var1, byte var2) {
		return this.skeletons[var1].aBool297;
	}

	public SkeletonSet(AbstractIndex skeletonIndex, AbstractIndex skinIndex, int var3, boolean var4) {
		Deque deque = new Deque();
		int skeletonCount = skeletonIndex.fileCount(var3);
		this.skeletons = new AnimationSkeleton[skeletonCount];
		int[] childs = skeletonIndex.getChilds(var3);
		int child = 0;

		while (child < childs.length) {
			byte[] bytes = skeletonIndex.getFile(var3, childs[child]);
			AnimationSkin var10 = null;
			int skinId = (bytes[0] & 0xFF) << 8 | bytes[1] & 0xFF;
			AnimationSkin var11 = (AnimationSkin) deque.getFront();

			while (true) {
				if (var11 != null) {
					if (skinId != -207314411 * var11.anInt1263) {
						var11 = (AnimationSkin) deque.getNext();
						continue;
					}

					var10 = var11;
				}

				if (var10 == null) {
					byte[] skinBytes;
					if (var4) {
						skinBytes = skinIndex.method390(0, skinId);
					} else {
						skinBytes = skinIndex.method390(skinId, 0);
					}

					var10 = new AnimationSkin(skinId, skinBytes);
					deque.method475(var10);
				}

				this.skeletons[childs[child]] = new AnimationSkeleton(bytes, var10);
				++child;
				break;
			}
		}

	}

	static final void method777(Character var0, int var1) {
		Class2.method62(1272643751 * var0.strictX, -1801433343 * var0.strictY, var1);
	}

	static Timer method778(int var0) {
		try {
			return new NanoTimer();
		} catch (Throwable var2) {
			return new MilliTimer();
		}
	}
}
