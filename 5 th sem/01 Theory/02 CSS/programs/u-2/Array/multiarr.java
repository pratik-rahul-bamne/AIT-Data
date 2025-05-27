import java.util.*;
class multiarr
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER ARRAY ELEMENTS:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("ARRAY ELEMENTS ARE:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}