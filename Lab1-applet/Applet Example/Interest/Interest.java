/*
 * Interest.java - Show the interest parameter
 */

import java.applet.Applet;
import java.awt.Graphics;

public class Interest extends Applet {

    String buffer;

    public void start() {
        buffer = getParameter( "Interest");
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Chan Tai Man", 5, 15);
        g.drawString("21321/1X", 5, 35 );
        g.drawString(buffer, 5, 55);
    }
}
