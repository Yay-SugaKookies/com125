/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.pkg2;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author cwilkins2
 */
public class applet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g){
        //g.setColor(Color.red);
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 250, 250);
        //g.drawOval(50,50,250,250);
        //g.fillOval(50,50,300,300);
        g.setColor(Color.white);
        g.fillOval(190, 100, 70, 70);
        g.fillOval(90, 100, 70, 70);
        g.setColor(Color.black);
        g.drawOval(50, 50, 250, 250);
        g.fillOval(190, 100, 50, 50);
        g.fillOval(90, 100, 50, 50);
        g.drawOval(190, 100, 70, 70);
        g.drawOval(90, 100, 70, 70);
        g.fillOval(140, 200, 70, 70);
        g.setColor(Color.yellow);
        g.fillOval(140, 150, 70, 70);
        g.setColor(Color.pink);
        g.fillOval(210, 190, 60, 30);
        g.fillOval(80, 190, 60, 30);
        g.setColor(Color.white);
        g.fillOval(220, 100, 20, 20);
        g.fillOval(120, 100, 20, 20);
    }
}
