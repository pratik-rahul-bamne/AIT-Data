import java.util.*;
class arr6
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		
		System.out.println("ENTER ARRAY-1 ELEMENTS:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int a1[]=Arrays.copyOf(a,5);

		System.out.println("ELEMENTS IN ARRAY2 ARE:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a1[i]);
		}
						
	}
}