import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class combobox extends JFrame{
    String city[]={"pune","mumbai","delhi","nashik"};
    public combobox()
    {
        JList jl =new JList<>(city);
        add(jl);


        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public class combobox2 extends JFrame{
    String travel[]={"travel","one day trip","7 days trip","15 days trip"};
    public combobox2()
    {
        JList jl =new JList<>(city);
        add(jl);


        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String args[])
    {
         combobox cc =new combobox();
         combobox2 cc =new combobox2();
    }
}      