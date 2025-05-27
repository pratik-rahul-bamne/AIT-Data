class A
{	
		int a=10;
}
class super1 extends A
{
	void disp()
	{
		int a=20;
		System.out.println(a);
		System.out.println(super.a);
	}


	public static void main(String args[])
	{
		super1 s=new super1();
		s.disp();
		
	}
}