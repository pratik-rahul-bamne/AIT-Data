class constover1
{	
	constover1()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	constover1(int x, int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	constover1(int x, double y)
	{
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		constover1 c1=new constover1();
		constover1 c2=new constover1(12,5);
		constover1 c3=new constover1(22,23.21);
	}
}	
	