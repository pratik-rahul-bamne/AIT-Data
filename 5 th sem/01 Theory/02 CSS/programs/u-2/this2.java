class this2
{
	int a;		//instance variable
	this2(int a)	//local variable
	{
		this.a=a;
	}
	void disp()
	{
		System.out.println(a);
	}

	public static void main(String args[])
	{
		this2 t=new this2(100);
		t.disp();
	}
}