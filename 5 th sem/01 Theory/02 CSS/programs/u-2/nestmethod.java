class nestmethod
{
	int a;
	String name;
	nestmethod(int x,String y)
	{
		a=x;
		name=y;
	}
	void disp()
	{
		System.out.println(a+" "+name);
	}
	void result()
	{
		
		disp();
		System.out.println("END of RESULT");
	}

	public static void main(String args[])
	{
		nestmethod n=new nestmethod(10,"Adarsh");
		n.result();
		
	}
}