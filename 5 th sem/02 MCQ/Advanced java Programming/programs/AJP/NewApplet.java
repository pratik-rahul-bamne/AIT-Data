/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author DELL
 */
public class NewApplet extends Applet {
 
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        List l = new List(10,true);
        l.add("Mumbai");
        l.add("pune");
        l.add("Nashik");
        l.add("Nagpur");
        l.add("Sangli");
        l.add("Kolhapur");
        l.add("Mumbai");
        l.add("Mumbai");
        l.add("Mumbai");
        l.add("Mumbai");
        add(l);
            
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
