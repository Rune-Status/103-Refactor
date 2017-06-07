
/**
 * Copyright (c) 2015 Kyle Friz & Kayla
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.Color;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

/**
 * @author Kyle Friz
 * @date Apr 9, 2015
 */
public class GameClient extends JFrame implements AppletStub {

	private static final long serialVersionUID = -1657955994522660237L;

	private String host;
	private Client clnt;
	public static boolean rsps;
	public static boolean dump;
	private Map<String, String> map;

	public static void main(String[] args) throws Exception {
		GameClient app = new GameClient();
		app.startApplet();
	}

	public GameClient() {
		super("OSRS #103 || Kyle Friz");
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(781, 541));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void startApplet() {
		try {
			rsps = false;
			dump = true;
			clnt = new Client();
			map = new HashMap<>();
			host = rsps ? new String("http://127.0.0.1") : new String("http://oldschool86.runescape.com");

			map.put("11", "5");
			map.put("12", "true");
			map.put("13", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
			map.put("14", "1");
			map.put("15", "false");
			map.put("1", "0");
			map.put("2", "0");
			map.put("3", "0");
			map.put("4", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
			map.put("5", "");
			map.put("6", "1");
			map.put("7", "true");
			map.put("8", "54073");
			map.put("9", ".runescape.com");
			map.put("10", "0");

			clnt.setStub(this);

			add(clnt);
			pack();
			setVisible(true);

			clnt.init();
			clnt.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(int width, int height) {
		clnt.resize(width, height);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.AppletStub#getAppletContext()
	 */
	@Override
	public AppletContext getAppletContext() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.AppletStub#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL(host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.AppletStub#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL(host);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.applet.AppletStub#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String key) {
		return map.get(key);
	}
}
