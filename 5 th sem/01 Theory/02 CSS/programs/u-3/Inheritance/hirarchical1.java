class A
{
	void input()
	{
		
		System.out.println("ENTER YOUR NAME:");
	}
	
}
class B extends A
{
	void show()
	{
		
		System.out.println("MY NAME IS RAM");
	}
}
class C extends A
{
	void disp()
	{
		System.out.println("MY NAME IS LAKHAN");
	}
	
}
class hirarchical1
{
	
	public static void main(String args[])
	{
		B b1=new B();
		C c1=new C();
		b1.input(); 
		b1.show();
		c1.input();
		c1.disp();
	}
}		