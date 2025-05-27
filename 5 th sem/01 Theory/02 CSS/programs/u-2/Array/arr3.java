import java.util.*;
class arr3
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		System.out.println("ENTER ARRAY ELEMENTS:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}	

		System.out.println("ARRAY ELEMENTS ARE");

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}