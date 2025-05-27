import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComponentEventExample1 
{
  public static void main(String[] args) 
  {
      JFrame frame = new JFrame("ComponentEventExample");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      TextArea txtArea = new TextArea();
      Checkbox checkbox1 = new Checkbox("Checkbox 1");
      Checkbox checkbox2 = new Checkbox("Checkbox 2");
      frame.add(txtArea, BorderLayout.CENTER);
      frame.add(checkbox1, BorderLayout.NORTH);
      frame.add(checkbox2, BorderLayout.SOUTH);
      frame.setVisible(true);
      ComponentListener componentListener = new MyCompList();
      frame.addComponentListener(componentListener);
  }
}
class MyCompList implements ComponentListener 
{
    public void componentShown(ComponentEvent evt) 
    {
        System.out.println("componentShown");
    }

    public void componentHidden(ComponentEvent evt) 
    {
         System.out.println("componentHidden");
     }

    public void componentMoved(ComponentEvent evt) 
    {
         System.out.println("componentMoved");
    }

     public void componentResized(ComponentEvent evt) 
     {
          System.out.println("componentResized");
     }
}
