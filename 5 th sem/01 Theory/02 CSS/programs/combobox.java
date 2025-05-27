import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class combobox extends JFrame{
    String city[]={"pune","mumbai","delhi","nashik"};
    public combobox()
    {
        JComboBox jc= new JComboBox<>(city);
        add(jc);


        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[])
    {
         combobox cc =new combobox();
    }
}      