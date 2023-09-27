/*
 * Param.java - to get Applet’s parameter
 */

import java.applet.Applet;
import java.awt.Graphics;

public class Param extends Applet {

    String buffer;

    public void start() {
        buffer = getParameter( "text");
        repaint();
    }

    public void paint(Graphics g) {
	//Draw the parameter string in applet.
        g.drawString(buffer, 5, 15);
    }
}
