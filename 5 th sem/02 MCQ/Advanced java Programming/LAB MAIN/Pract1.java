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
public class Pract1 extends Applet {
     List cities;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
     
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.cities =new List(4);
        this.cities.add("marathi");
        this.cities.add("Hindi");
        this.cities.add("English");
        this.cities.add("Sanskrit");
        add(cities);
        
           
    }

    // TODO overwrite start(), stop() and destroy() methods
}
