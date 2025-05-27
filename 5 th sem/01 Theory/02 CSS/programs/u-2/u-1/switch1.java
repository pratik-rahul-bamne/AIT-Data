import java.util.*;
class switch1
{
	public static void main(String args[])
	{
		int ch;
		int a=10,b=20,c;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE:");
		ch=s.nextInt();
		switch(ch)
		{
			case 1:		
				c=a+b;
				System.out.println("ADDITION:"+c);
				break;
			case 2:		
				
				c=a-b;
				System.out.println("SUBTRACTION:"+c);
				break;
			default:
				System.out.println("WRONG CHOICE");
				break;
		}
		
	}
}