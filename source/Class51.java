import java.util.Date;

public class Class51 {

	static Class51 aClass51_523 = new Class51(2);
	public static Class51 aClass51_524 = new Class51(1);
	public int anInt525;
	static int[] anIntArray526;
	static Class51 aClass51_527 = new Class51(0);

	Class51(int var1) {
		this.anInt525 = -587344377 * var1;
	}

	public static String method255(long var0) {
		Class53.aCalendar536.setTime(new Date(var0));
		int var5 = Class53.aCalendar536.get(7);
		int var3 = Class53.aCalendar536.get(5);
		int var6 = Class53.aCalendar536.get(2);
		int var2 = Class53.aCalendar536.get(1);
		int var4 = Class53.aCalendar536.get(11);
		int var7 = Class53.aCalendar536.get(12);
		int var8 = Class53.aCalendar536.get(13);
		return Class53.aStringArray537[var5 - 1] + ", " + var3 / 10 + var3 % 10 + "-"
				+ Class53.aStringArrayArray538[0][var6] + "-" + var2 + " " + var4 / 10 + var4 % 10 + ":" + var7 / 10
				+ var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	static final void drawDot(int var0, int var1, int var2, int var3, Sprite var4, DualNode_Sub14 var5) {
		if (var4 != null) {
			int var6 = Client.minimapScale * -1718342721 + -1916997753 * Client.minimapRotation & 2047;
			int var9 = var2 * var2 + var3 * var3;
			if (var9 <= 6400) {
				int var8 = TexturedGraphic.SIN_TABLE[var6];
				int var7 = TexturedGraphic.COS_TABLE[var6];
				var8 = 256 * var8 / (Client.viewRotation * -806982331 + 256);
				var7 = var7 * 256 / (-806982331 * Client.viewRotation + 256);
				int var10 = var8 * var3 + var2 * var7 >> 16;
				int var11 = var7 * var3 - var8 * var2 >> 16;
				if (var9 > 2500) {
					var4.method954(662480183 * var5.anInt1647 / 2 + var10 - var4.anInt1815 / 2,
							-988977157 * var5.anInt1648 / 2 - var11 - var4.anInt1816 / 2, var0, var1,
							662480183 * var5.anInt1647, var5.anInt1648 * -988977157, var5.anIntArray1646,
							var5.anIntArray1645);
				} else {
					var4.method946(var10 + 662480183 * var5.anInt1647 / 2 + var0 - var4.anInt1815 / 2,
							var5.anInt1648 * -988977157 / 2 + var1 - var11 - var4.anInt1816 / 2);
				}

			}
		}
	}
}
