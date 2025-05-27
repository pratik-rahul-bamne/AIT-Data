import java.util.*;
class switch2
{
	public static void main(String args[])
	{
		System.out.println("Enter Choice:");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		switch(ch)
		{
			case 'A':
			System.out.println("PRINTED A");
			break;
			case 'B':
			System.out.println("PRINTED B");
			break;
			default:
			System.out.println("WRONG");
		}
		
		
	}
}