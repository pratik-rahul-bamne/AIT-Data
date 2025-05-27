class defconst
{
	int a;
	String name;
	defconst()
	{
		a=10;
		name="Adarsh";
	}
	void disp()
	{
		System.out.println(a+" "+name);
	}

	public static void main(String args[])
	{
		defconst d=new defconst();
		d.disp();
	}
}