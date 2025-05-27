class A
{
	void show()
	{
		System.out.println("IN A");
	}
}
class B extends A
{
	@Override
	void show()
	{
		System.out.println("IN B");
	}
}
class override1
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.show();
	}
}	
      		