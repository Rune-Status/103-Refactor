import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class114 {

	public static Comparator aComparator790 = new Class116();
	public static Comparator aComparator791;
	public static Comparator aComparator792;
	public List aList793;
	public static Comparator aComparator794;
	static int pin;

	public Class114(ByteBuf var1, boolean var2) {
		int var4 = var1.getUShort();
		boolean var5 = var1.getUByte() == 1;
		byte var6;
		if (var5) {
			var6 = 1;
		} else {
			var6 = 0;
		}

		int var7 = var1.getUShort();
		this.aList793 = new ArrayList(var7);

		for (int var3 = 0; var3 < var7; ++var3) {
			this.aList793.add(new Class115(var1, var6, var4));
		}

	}

	static {
		new Class112();
		aComparator791 = new Class111();
		aComparator792 = new Class122();
		aComparator794 = new Class123();
	}

	public void method438(Comparator var1, boolean var2) {
		if (!var2) {
			Collections.sort(this.aList793, Collections.reverseOrder(var1));
		} else {
			Collections.sort(this.aList793, var1);
		}

	}
}
