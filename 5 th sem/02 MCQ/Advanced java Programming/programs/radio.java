/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;

/**
 *
 * @author pandh
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        RadioButton r1= new RadioButton("MALE");
        RadioButton r2= new RadioButton("FEMALE");
        RadioButton r3= new RadioButton("OTHER");
        add(r1);
        add(r2);
        add(r3);
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
