package javaapplication6;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;


/**
 *
 * @author DELL
 */
public class JTreedemo1 extends JFrame
{
    JFrame frame;
    JTreedemo1()
    {
        frame =new frame();
        DefaultMutableTreeNode Thispc = new DefaultMutableTreeNode("This pc");
        DefaultMutableTreeNode os = new DefaultMutableTreeNode("os");
        DefaultMutableTreeNode Drive = new DefaultMutableTreeNode("Drive F");
        
       Thispc.add(os);
       Thispc.add(Drive);
        
        DefaultMutableTreeNode Folder = new DefaultMutableTreeNode("ajp");
        DefaultMutableTreeNode Folder1 = new DefaultMutableTreeNode("vs");
        Thispc.add(Folder);
        Thispc.add(Folder1);
        
        JTree i = new JTree(Thispc);
        frame.add(i);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
        JTreedemo1 JTreedemo = new JTreedemo1();  
        
    }
    
}
