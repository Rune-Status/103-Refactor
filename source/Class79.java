import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Hashtable;

public class Class79 {

	static File cacheDirectory;
	static boolean aBool655 = false;
	static Hashtable aHashtable656 = new Hashtable(16);

	public static void error(String m, Throwable ex) {
		try {
			String error = "";
			if (ex != null) {
				Throwable var3 = ex;
				String var5;
				if (ex instanceof RuntimeException_Sub1) {
					RuntimeException_Sub1 var4 = (RuntimeException_Sub1) ex;
					var5 = var4.aString1806 + " | ";
					var3 = var4.aThrowable1808;
				} else {
					var5 = "";
				}

				StringWriter var18 = new StringWriter();
				PrintWriter var6 = new PrintWriter(var18);
				var3.printStackTrace(var6);
				var6.close();
				String var7 = var18.toString();
				BufferedReader var8 = new BufferedReader(new StringReader(var7));
				String var9 = var8.readLine();

				while (true) {
					String var10 = var8.readLine();
					if (var10 == null) {
						var5 = var5 + "| " + var9;
						error = var5;
						break;
					}

					int var11 = var10.indexOf(40);
					int var12 = var10.indexOf(41, var11 + 1);
					if (var11 >= 0 && var12 >= 0) {
						String var13 = var10.substring(var11 + 1, var12);
						int var14 = var13.indexOf(".java:");
						if (var14 >= 0) {
							var13 = var13.substring(0, var14) + var13.substring(5 + var14);
							var5 = var5 + var13 + ' ';
							continue;
						}

						var10 = var10.substring(0, var11);
					}

					var10 = var10.trim();
					var10 = var10.substring(var10.lastIndexOf(32) + 1);
					var10 = var10.substring(var10.lastIndexOf(9) + 1);
					var5 = var5 + var10 + ' ';
				}
			}

			if (m != null) {
				if (ex != null) {
					error = error + " | ";
				}

				error = error + m;
			}

			System.out.println("Error: " + error);
			error = error.replace(':', '.');
			error = error.replace('@', '_');
			error = error.replace('&', '_');
			error = error.replace('#', '_');
			if (CollisionMap.gameApplet == null) {
				return;
			}

			URL url = new URL(CollisionMap.gameApplet.getCodeBase(),
					"clienterror.ws?c=" + 1316357127 * Class125.gameRevision + "&u=" + RuntimeException_Sub1.myPlayerName
							+ "&v1=" + TaskManager.javaVendor + "&v2=" + TaskManager.javaVersion + "&e=" + error);
			DataInputStream stream = new DataInputStream(url.openStream());
			stream.read();
			stream.close();
		} catch (Exception var16) {
			;
		}

	}

	Class79() throws Throwable {
		throw new Error();
	}
}
