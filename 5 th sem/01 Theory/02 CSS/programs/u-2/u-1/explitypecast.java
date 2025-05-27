class explitypecast
{
	public static void main(String args[])
	{
		double x=10;	//8 bytes
		int y=(int) x;    // 4 bytes (Implicit Conversion)
		
		System.out.println(x);
		System.out.println(y);
		
	}
}