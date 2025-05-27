abstract class A
{
	int a,b,c;
	abstract void cal();
	void add()
	{
		c=a+b;
		System.out.println("ADDITION:"+c);
	}
}
class B extends A
{
	B(int x,int y)
	{
		a=x;
		b=y;
	}
	void cal()
	{	
		c=a-b;
		System.out.println("SUBTRACTION:"+c);
	}
}
class abstract1
{
	public static void main(String args[])
	{
		B ab=new B(20,10);
		ab.cal();
		ab.add();
	}
}