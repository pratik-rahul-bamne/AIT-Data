import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusListenerExample extends JFrame implements FocusListener
{
     Button b1,b2,b3;
    
     public FocusListenerExample()
     {
         b1=new Button ("First");
         b2=new Button ("Second");
         b3=new Button ("Third");
         add(b1,BorderLayout.SOUTH);
         add(b2,BorderLayout.NORTH);
         add(b3,BorderLayout.CENTER);
         b1.addFocusListener(this);
         b2.addFocusListener(this);
         b3.addFocusListener(this);
         setSize(800,700);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
     }
 public void focusGained(FocusEvent fe) //method of focuslistener
     {
         if(fe.getSource()==b1)
         	System.out.println(b1.getLabel()+"gained");
         if(fe.getSource()==b2)
         	System.out.println(b2.getLabel()+"gained");
          if(fe.getSource()==b3)
         	System.out.println(b3.getLabel()+"gained");
         if(fe.isTemporary())
         	System.out.println("Temporary Focus");
     }
     public void focusLost(FocusEvent fe) //in focusevent "getID()"is a method
     {
         if(fe.getSource()==b1)
	System.out.println(b1.getLabel()+"lost");
         if(fe.getSource()==b2)
         	System.out.println(b2.getLabel()+"lost");
     
     if(fe.getSource()==b3)
	System.out.println(b3.getLabel()+"lost");
}
     public static void main(String a[])
     {
         new FocusListenerExample();
     }
}
