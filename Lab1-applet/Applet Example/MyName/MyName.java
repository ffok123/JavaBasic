/*
 * MyName.java - to display my name
 */

import java.applet.Applet;
import java.awt.Graphics;

public class MyName extends Applet {

    public void start() {
        repaint();
    }

    public void paint(Graphics g) {

        g.drawString("Chan Tai Man", 5, 15);
        g.drawString("21321/1Z", 5, 35 );

    }
}
