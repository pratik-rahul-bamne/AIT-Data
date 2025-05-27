class vartypes
{
	int a=10; //instance variable
	static int b=20;
	final int C=30;
	public static void main(String args[])
	{
		vartypes obj=new vartypes();
		int d=40;	//local variable
		final int K=50;
		
		System.out.println("A IS:"+obj.a);
		
		System.out.println("B IS:"+b);
		
		System.out.println("C IS:"+obj.C);

		System.out.println("D IS"+d);

		System.out.println("K IS:"+K);
	}
}