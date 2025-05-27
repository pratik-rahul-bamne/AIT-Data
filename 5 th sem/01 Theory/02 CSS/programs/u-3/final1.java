class student
{
	int rno,marks;
	String name;
	void input()
	{
		System.out.println("ENTER ROLL NO,NAME,MARKS:");
	}
}
class simple1 extends student
{
	void disp()
	{
		rno=1;marks=66;name="ADARSH";
		System.out.println(rno+"  "+name+"  "+marks);
	}
	public static void main(String args[])
	{
		simple1 s1=new simple1();
		s1.input();
		s1.disp();
	}
}		