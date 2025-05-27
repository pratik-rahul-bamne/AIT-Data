/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pandh
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class JLabelDem extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField jtf;
    JLabelDem()
    {
        
        b1= new JButton("fisrt");
        b2= new JButton("second");
        jtf= new JTextField(20);
        setLayout(new FlowLayout());
        setSize(300,300);
        add(b1);
        add(b2);
        add(jtf);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            jtf.setText("First button is clicked");
        else
            jtf.setText("Second button is clicked");
            
    }
    public static void main(String args[])
    {
        new JLabelDem();
    }
    
    
    
    
}
