/*
 * Rectangle.java - Draw a rectangle below interest
 */

import java.applet.Applet;
import java.awt.Graphics;

public class Rectangle extends Applet {

    String buffer;

    public void start() {
        buffer = getParameter( "Interest");
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Chan Tai Man", 5, 15);
        g.drawString("21321/1X", 5, 35 );
        g.drawString(buffer, 5, 55);
        g.drawRect( 10, 60, 230, 80 ); 
    }
}
