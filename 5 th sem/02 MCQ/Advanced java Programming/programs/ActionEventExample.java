/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 
/* <applet code="ActionEventExample" width=200 height=200>
</applet> */
 
public class ActionEventExample extends Applet implements ActionListener
{
     String am="";

       public void init()
       {
                Button B1 = new Button("Ok");
                Button B2 = new Button("Cancel");

                add(B1);
                add(B2);

                B1.addActionListener(this); //Listener Registered
                B2.addActionListener(this); //Listener Registered
        }
public void paint(Graphics g)
       {
                g.drawString(am,30,70);
        }
 
public void actionPerformed(ActionEvent ae)
        {
                          
                String action = ae.getActionCommand();
               
                if(action.equals("Ok"))
                        am = "Ok Button Pressed";
                else if(action.equals("Cancel"))
                        am = "Cancel Button Pressed";
               
                repaint();
        }
}
