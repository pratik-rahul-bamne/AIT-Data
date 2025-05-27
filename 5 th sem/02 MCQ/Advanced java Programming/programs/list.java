/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author pandh
 */
public class NewApplet extends Applet {
     List cities;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
     
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.cities =new List(10);
        this.cities.add("mumbai");
        this.cities.add("pune");
        this.cities.add("nashik");
        this.cities.add("nagpur");
        this.cities.add("sangli");
        this.cities.add("kolhapur");
        this.cities.add("satara");
        this.cities.add("karad");
        this.cities.add("jalna");
        this.cities.add("amramati");
        this.add(this.cities);
           
    }

    // TODO overwrite start(), stop() and destroy() methods
}
