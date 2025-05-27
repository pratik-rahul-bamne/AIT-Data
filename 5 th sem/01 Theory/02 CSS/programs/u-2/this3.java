class this3
{
	this3()
	{
		System.out.println("Hello");
	}
	this3(int a)
	{
		this();
		System.out.println(a);
	}

	public static void main(String args[])
	{
		this3 t=new this3(100);
		
	}
}