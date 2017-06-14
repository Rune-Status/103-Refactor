import java.io.File;
import java.io.IOException;

public final class BoundaryStub {

	static int anInt276;
	int strictY;
	int floorLevel;
	int orientationB;
	public Entity entityA;
	public Entity entityB;
	int orientationA;
	int strictX;
	int config = 0;
	public int bitset = 0;

	static IndexedSprite set() {
		IndexedSprite sprite = new IndexedSprite();
		sprite.width = Class7.width;
		sprite.height = Class7.height;
		sprite.offsetX = Class7.offsetsX[0];
		sprite.offsetY = VarPlayerType.offsetsY[0];
		sprite.subWidth = Class7.subWidths[0];
		sprite.subHeight = Class7.subHeights[0];
		sprite.palette = Class85.palette;
		sprite.pixels = Npc.spritePixels[0];
		Class65.resetSprite();
		return sprite;
	}

	public static CacheFileAccessor getPreferences(String prefType, String gameType, boolean serialize) {
		File osPref = new File(Class75.cacheLocation, "preferences" + prefType + ".dat");
		if (osPref.exists()) {
			try {
				CacheFileAccessor suffix1 = new CacheFileAccessor(osPref, "rw", 10000L);
				return suffix1;
			} catch (IOException var10) {
				;
			}
		}

		String suffix = "";
		if (Class75.buildOrdinal == 33) {
			suffix = "_rc";
		} else if (Class75.buildOrdinal == 34) {
			suffix = "_wip";
		}

		File jagexPref = new File(BitBuf.userHome, "jagex_" + gameType + "_preferences" + prefType + suffix + ".dat");
		CacheFileAccessor accessor;
		if (!serialize && jagexPref.exists()) {
			try {
				accessor = new CacheFileAccessor(jagexPref, "rw", 10000L);
				return accessor;
			} catch (IOException var9) {
				;
			}
		}

		try {
			accessor = new CacheFileAccessor(osPref, "rw", 10000L);
			return accessor;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

}
