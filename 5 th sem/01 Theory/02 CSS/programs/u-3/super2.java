class A
{	
	void disp()
	{
		System.out.println("IN A");
	}
}
class super2 extends A
{
	void disp()
	{
		super.disp();
		System.out.println("IN SUPER2");
	}


	public static void main(String args[])
	{
		super2 s=new super2();
		s.disp();
		
	}
}