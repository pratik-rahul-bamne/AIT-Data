import java.awt.*;
import java.applet.*;
class B extends Applet
{
	public void init()
	{
	Button b1 =new Button("Submit");
	Checkbox c1=new Checkbox("yes");
	Checkbox c2=new Checkbox("No");
	add(b1);
	add(c1);
	add(c2);
	}
}