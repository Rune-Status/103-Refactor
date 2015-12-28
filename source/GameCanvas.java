import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class GameCanvas extends Canvas {

	Component component;

	static void resetItemTable(int var0) {
		ItemTable table = (ItemTable) ItemTable.itemTables.get((long) var0);
		if (table != null) {
			for (int index = 0; index < table.ids.length; ++index) {
				table.ids[index] = -1;
				table.quantities[index] = 0;
			}

		}
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	GameCanvas(Component var1) {
		this.component = var1;
	}

	static final String[] method885(String[] var0) {
		String[] var1 = new String[5];

		for (int var2 = 0; var2 < 5; ++var2) {
			var1[var2] = var2 + ": ";
			if (var0 != null && var0[var2] != null) {
				var1[var2] = var1[var2] + var0[var2];
			}
		}

		return var1;
	}
}
