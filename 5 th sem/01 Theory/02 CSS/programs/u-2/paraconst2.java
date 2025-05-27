class paraconst2
{
	int a;
	String name;
	paraconst2(int x,String y)
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
		paraconst2 p=new paraconst2(10,"Adarsh");
		p.disp();
	}
}