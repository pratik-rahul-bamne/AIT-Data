class A
{	
	A()
	{
		System.out.println("IN A");
	}
}
class super3 extends A
{
	super3()
	{
		super();
		System.out.println("IN SUPER2");
	}


	public static void main(String args[])
	{
		super3 s=new super3();
		
		
	}
}