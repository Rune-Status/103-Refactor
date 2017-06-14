public class SkeletonSet extends DualNode {

	static int[][] regionXTEAs;
	AnimationSkeleton[] skeletons;

	public boolean method776(int var1) {
		return this.skeletons[var1].aBool297;
	}

	public SkeletonSet(AbstractIndex skeletonIndex, AbstractIndex skinIndex, int id, boolean falseBool) {
		Deque skins = new Deque();
		int skeletonCount = skeletonIndex.fileCount(id);
		this.skeletons = new AnimationSkeleton[skeletonCount];
		int[] childs = skeletonIndex.getChilds(id);

		for (int child = 0; child < childs.length; child++) {
			byte[] bytes = skeletonIndex.getFile(id, childs[child]);
			AnimationSkin skin = null;
			int skinId = (bytes[0] & 0xff) << 8 | bytes[1] & 0xff;

			for (AnimationSkin cSkin = (AnimationSkin) skins.getFront(); cSkin != null; cSkin = (AnimationSkin) skins
					.getNext()) {
				if (cSkin.id == skinId) {
					skin = cSkin;
					break;
				}
			}

			if (skin == null) {
				byte[] skinBytes;
				if (falseBool) {
					skinBytes = skinIndex.getChild(0, skinId);
				} else {
					skinBytes = skinIndex.getChild(skinId, 0);
				}

				skin = new AnimationSkin(skinId, skinBytes);
				skins.addFront(skin);
			}

			this.skeletons[childs[child]] = new AnimationSkeleton(bytes, skin);
		}

	}

	static final void characterToScreen(Character character, int height) {
		Class2.tileToScreen(character.strictX, character.strictY, height);
	}

	static Timer getTimer() {
		try {
			return new NanoTimer();
		} catch (Throwable var2) {
			return new MilliTimer();
		}
	}

}
