abstract class A
{
	abstract void add();
	abstract void sub();
}
abstract class B extends A
{
	public void add()
	{
		System.out.println(10+10);
	}
}
class C extends B
{
	public void sub()
	{
		System.out.println(11-10);
	}
}
class abstract4
{

	public static void main(String args[])
	{
		C obj=new C();
		obj.add();
		obj.sub();
	}
}