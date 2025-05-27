class copy2
{
	int a,b;
	copy2()
	{
		a=10;
		b=20;
		System.out.println(a+" "+b);
	}
	copy2(copy2 ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
	

	public static void main(String args[])
	{
		copy2 cp=new copy2();
		copy2 c=new copy2(cp);
	}
}