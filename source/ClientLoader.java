import javax.swing.*;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Project: 74deob
 * Date: 06-03-2015
 * Time: 19:05
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public final class ClientLoader {

    public static final String DEFAULT_USERNAME = "justin_12@live.ca"; //"itsuki.juro@creatures.me";
    public static final String DEFAULT_PASSWORD = "woopy"; //"housefaggot";

    private ClientLoader() {

    }

    public static void main(final String... argsz) {
        final JFrame penis = new JFrame("#74 client");
        final JavConfig cfg = new JavConfig();
        final Client client = new Client();
        client.setStub(cfg.mkStub());
        client.init();
        client.start();
        penis.setMinimumSize(new Dimension(775, 533)); //grow le penis xdddd
        penis.add(client);
        penis.setVisible(true);
        penis.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        while (true) {
            Scanner in = new Scanner(System.in);
            try {
                String command = in.nextLine();
                final String[] args = command.split(" ");
                command = args[0].toLowerCase();
                // shift args left by one, to overwrite header, keeping it simple...
                System.arraycopy(args, 1, args, 0, args.length - 1);
                args[args.length - 1] = null; //remove tail
                final int num_args = args.length - 1;
                // System.out.println("Command: '" + command + "'" + " Args(" + num_args + ") = " + Arrays.toString(args));
                // System.out.println(command);

               
            } catch (Throwable e) {
                e.printStackTrace();
                ;
            }
        }

    }

    private static final class JavConfig {

        private final Map<String, String> params = new HashMap<>();
        private String codebase;

        private JavConfig() {
            try {
                final BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://oldschool.runescape.com/jav_config.ws").openStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("codebase="))
                        codebase = line.substring(9);
                    if (line.startsWith("param=")) {
                        String k = line.substring(line.indexOf('=') + 1);
                        k = k.substring(0, k.indexOf('='));
                        final String v = line.substring(7 + k.length());
                        params.put(k, v);
                    }
                }
            } catch (final IOException e) {
                throw new InternalError("wyd");
            }
        }

        private ClientStub mkStub() {
            return new ClientStub(this);
        }
    }

    private static final class ClientStub implements AppletStub {

        private final JavConfig config;

        private ClientStub(final JavConfig config) {
            this.config = config;
        }

        @Override
        public boolean isActive() {
            return true;
        }

        @Override
        public URL getDocumentBase() {
            try {
                return new URL(config.codebase);
            } catch (final MalformedURLException e) {
                return null;
            }
        }

        @Override
        public URL getCodeBase() {
            try {
                return new URL(config.codebase);
            } catch (final MalformedURLException e) {
                return null;
            }
        }

        @Override
        public String getParameter(final String name) {
            return config.params.get(name);
        }

        @Override
        public AppletContext getAppletContext() {
            return null;
        }

        @Override
        public void appletResize(final int width, final int height) {
        }
    }
}
