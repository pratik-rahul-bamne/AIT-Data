class A
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("ADDITION:"+c);
	}
	void sub()
	{
		int a=100,b=20,c;
		c=a-b;
		System.out.println("subtraction:"+c);
	}
}
class B extends A
{
	void mul()
	{
		int a=10,b=20,c;
		c=a*b;
		System.out.println("Multiplication:"+c);
	}
	void div()
	{
		int a=100,b=20,c;
		c=a/b;
		System.out.println("Division:"+c);
	}
}
class C extends B
{
	void rem()
	{
		int a=100,b=11,c;
		c=a%b;
		System.out.println("Reminder:"+c);
	}
	
}
class multilevel1
{
	
	public static void main(String args[])
	{
		C s1=new C();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		s1.rem();
	}
}		