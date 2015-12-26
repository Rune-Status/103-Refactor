
public final class Class68 {

	static Player myPlayer;

	Class68() throws Throwable {
		throw new Error();
	}

	static void method326(Widget var0) {
		if (Client.anInt2192 * -916689835 == var0.loopCycle * 182565419) {
			Client.aBoolArray2118[var0.boundsIndex * 1983233805] = true;
		}

	}

	static final void method327(Widget var0, int var1, int var2) {
		if (Client.aWidget2141 == null && !Client.menuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var4 = CacheIndex.method555(Class30.getWidgetConfig(var0));
				Widget var3;
				int var6;
				if (var4 != 0) {
					var6 = 0;

					while (true) {
						if (var6 >= var4) {
							var3 = var5;
							break;
						}

						var5 = Class94.getWidget(-1652479707 * var5.parentId);
						if (var5 == null) {
							var3 = null;
							break;
						}

						++var6;
					}
				} else {
					var3 = null;
				}

				Widget var8 = var3;
				if (var3 == null) {
					var8 = var0.parent;
				}

				if (var8 != null) {
					Client.aWidget2141 = var0;
					var5 = var0;
					var4 = CacheIndex.method555(Class30.getWidgetConfig(var0));
					if (var4 == 0) {
						var3 = null;
					} else {
						var6 = 0;

						while (true) {
							if (var6 >= var4) {
								var3 = var5;
								break;
							}

							var5 = Class94.getWidget(-1652479707 * var5.parentId);
							if (var5 == null) {
								var3 = null;
								break;
							}

							++var6;
						}
					}

					var8 = var3;
					if (var3 == null) {
						var8 = var0.parent;
					}

					Client.aWidget2142 = var8;
					Client.anInt2127 = 205666793 * var1;
					Client.anInt2143 = var2 * -940768111;
					FriendedPlayer.anInt739 = 0;
					Client.aBool2150 = false;
					if (Client.menuItemCount * 1768430155 > 0) {
						int var9 = Client.menuItemCount * 1768430155 - 1;
						CacheIndex.aClass4_1333 = new Class4();
						CacheIndex.aClass4_1333.anInt109 = Client.menuArg1[var9] * -615722007;
						CacheIndex.aClass4_1333.anInt106 = 607560247 * Client.menuArg2[var9];
						CacheIndex.aClass4_1333.anInt107 = -859373123 * Client.menuOpcodes[var9];
						CacheIndex.aClass4_1333.anInt105 = Client.menuArg0[var9] * -558864427;
						CacheIndex.aClass4_1333.aString108 = Client.menuActions[var9];
					}

					return;
				}
			}

		}
	}
}
