class complex1
{
	int real;
	int imag;
	public complex1()
	{
	}
	public complex1(int r,int i)
	{
		real=r;
		imag=i;
	}
	public void show()
	{
		System.out.println("The numbers are:"+real+"+"+imag+"i");
	}
	public void sum(complex1 c1, complex1 c2)
	{
		real=c1.real+c2.real;
		imag=c1.imag+c2.imag;
	}
	public static void main(String args[])
	{
		complex1 x1=new complex1(2,3);
		x1.show();
		complex1 x2=new complex1(4,5);
		x2.show();
		complex1 x3=new complex1();
		x3.sum(x1,x2);
		x3.show();
	}
		    
}