import java.awt.*;    
import javax.swing.*;    
public class BorderLayout  
{     
JFrame jframe;    
// constructor  
BorderLayout()  
{  
    // creating a Frame   
    jframe = new JFrame();    
    // create buttons  
    JButton btn1 = new JButton("Tanishka");    
    JButton btn2 = new JButton("Deepak");    
    JButton btn3 = new JButton("Sanika");   
    JButton btn4 = new JButton("Sizuka");    
    JButton btn5 = new JButton("Pratik");  
     // creating an object of the BorderLayout class using   
     // the parameterized constructor where the horizontal gap is 20   
     // and vertical gap is 15. The gap will be evident when buttons are placed   
     // in the frame  
    jframe.setLayout(new java.awt.BorderLayout());  
    jframe.add(btn1, java.awt.BorderLayout.NORTH);    
    jframe.add(btn2, java.awt.BorderLayout.SOUTH);    
    jframe.add(btn3, java.awt.BorderLayout.EAST);    
    jframe.add(btn4, java.awt.BorderLayout.WEST);    
    jframe.add(btn5, java.awt.BorderLayout.CENTER);    
    jframe.setSize(300,300);    
    jframe.setVisible(true);    
}    
// main method  
public static void main(String argvs[])   
{    
    new BorderLayout();    
}
}