class copyconst1
{
	int a;
	String name;
	copyconst1(int x,String y)
	{
		a=x;
		name=y;
	}
	void disp()
	{
		System.out.println(a+" "+name);
	}

	public static void main(String args[])
	{
		copyconst1 p=new copyconst1(10,"Adarsh");
		copyconst1 q=p;
		p.disp();
		q.disp();
	}
}