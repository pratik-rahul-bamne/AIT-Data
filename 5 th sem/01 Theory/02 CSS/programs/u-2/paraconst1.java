class paraconst1
{
	int a,b;
	paraconst1(int x,int y)
	{
		a=x;
		b=y;
	}
	void disp()
	{
		System.out.println(a+" "+b);
	}

	public static void main(String args[])
	{
		paraconst1 p=new paraconst1(10,20);
		p.disp();
	}
}