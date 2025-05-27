import java.util.*;
class arr5
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int a1[]=new int[5];
		System.out.println("ENTER ARRAY-1 ELEMENTS:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("ENTER ARRAY-2 ELEMENTS:");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=s.nextInt();
		}
			
		boolean b=Arrays.equals(a,a1);
		System.out.println("ARRAY EQUAL?--->"+b);

		
	}
}