public class Class88 {

	static Sprite[] cross;
	static char[] aCharArray711 = new char[64];
	static char[] aCharArray714;
	static int[] anIntArray713;

	Class88() throws Throwable {
		throw new Error();
	}

	static void setWorld(World world) {
		if (world.method477() != Client.membersWorld) {
			Client.membersWorld = world.method477();
			boolean var1 = world.method477();
			if (Class94.aBool735 != var1) {
				ItemType.items.method429();
				ItemType.aClass106_1607.method429();
				ItemType.aClass106_1620.method429();
				Class94.aBool735 = var1;
			}
		}

		World.myWorldDomain = world.domain;
		Client.myWorld = world.id;
		Client.myWorldFlags = world.flags;
		Class82.mainPort = Client.socketType == 0 ? '\uaa4a' : world.id + '\u9c40';
		Class41.subPort = Client.socketType == 0 ? 443 : world.id + '\uc350';
		ClientSettings.myWorldPort = Class82.mainPort;
	}

	static {
		int var0;
		for (var0 = 0; var0 < 26; var0++) {
			aCharArray711[var0] = (char) (var0 + 65);
		}

		for (var0 = 26; var0 < 52; var0++) {
			aCharArray711[var0] = (char) (var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			aCharArray711[var0] = (char) (var0 + 48 - 52);
		}

		aCharArray711[62] = 43;
		aCharArray711[63] = 47;
		aCharArray714 = new char[64];

		for (var0 = 0; var0 < 26; var0++) {
			aCharArray714[var0] = (char) (var0 + 65);
		}

		for (var0 = 26; var0 < 52; var0++) {
			aCharArray714[var0] = (char) (var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; var0++) {
			aCharArray714[var0] = (char) (var0 + 48 - 52);
		}

		aCharArray714[62] = 42;
		aCharArray714[63] = 45;
		anIntArray713 = new int[128];

		for (var0 = 0; var0 < anIntArray713.length; var0++) {
			anIntArray713[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; var0++) {
			anIntArray713[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; var0++) {
			anIntArray713[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; var0++) {
			anIntArray713[var0] = var0 - 48 + 52;
		}

		int[] var2 = anIntArray713;
		anIntArray713[43] = 62;
		var2[42] = 62;
		int[] var1 = anIntArray713;
		anIntArray713[47] = 63;
		var1[45] = 63;
	}

}
