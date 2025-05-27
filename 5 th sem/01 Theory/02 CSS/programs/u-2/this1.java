class this1
{
	
	void disp()
	{
		System.out.println(this);
	}

	public static void main(String args[])
	{
		this1 t=new this1();
		System.out.println(t);
		t.disp();
	}
}