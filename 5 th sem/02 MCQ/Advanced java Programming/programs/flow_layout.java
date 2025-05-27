import javacx.swing.*;
import java.awt.*;

import javax.swing.JButton;
class flow_layout extends Jframe
{
    Jframe  f;
    f=new Jframe();
    JButton b1= new JButton("one");
    JButton b2= new JButton("two");
    JButton b3= new JButton("three");
    JButton b4= new JButton("four");
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.SetLayout(new FlowLayout(FlowLayout.Right));
    f.setsize(300,300);
    f.setVisible(true);
}
