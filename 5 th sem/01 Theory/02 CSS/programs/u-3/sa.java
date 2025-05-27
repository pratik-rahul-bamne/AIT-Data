class A
{
	void disp()
	{
		System.out.println("IN A");
	}
}
class sa extends A
{
	void disp()
	{
		System.out.println("IN SA");
	}
	public static void main(String args[])
	{
		sa a=new sa();
		a.sidp();
	}
}