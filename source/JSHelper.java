import java.applet.Applet;
import netscape.javascript.JSObject;

public class JSHelper {

	JSHelper() throws Throwable {
		throw new Error();
	}

	public static Object call(Applet applet, String method, Object[] args) throws Throwable {
		return JSObject.getWindow(applet).call(method, args);
	}
}