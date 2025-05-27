import java.util.*;
class switch1
{
	public static void main(String args[])
	{
		System.out.println("Enter Choice:");
		Scanner s=new Scanner(System.in);
		String name=new String();
		name=s.nextLine();
		switch(name)
		{
			case "A":
			System.out.println("PRINTED A");
			break;
			case "B":
			System.out.println("PRINTED B");
			break;
			default:
		S	ystem.out.println("WRONG");
		}
		
		
	}
}