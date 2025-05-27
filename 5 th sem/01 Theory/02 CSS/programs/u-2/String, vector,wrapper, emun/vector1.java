import java.util.*;
class vector1
{
      public static void main(String args[])
      {
	Vector v=new Vector();

	v.addElement("One");
	v.addElement("Two");
	v.addElement("Three");
        System.out.println("Vector Elements:"+v);

	v.insertElementAt("HI",1);
	System.out.println("After Inserting Vector Elements:"+v);
	System.out.println("Size of V:"+v.size());
	
	v.removeElement("Two");
	System.out.println("After Removing (Two) Vector Elements:"+v);

	v.removeElementAt(2);
	System.out.println("After Removing  Elements at 1:"+v);

	v.removeAllElements();
	System.out.println("After removing all Elements:"+v);

      }
}			