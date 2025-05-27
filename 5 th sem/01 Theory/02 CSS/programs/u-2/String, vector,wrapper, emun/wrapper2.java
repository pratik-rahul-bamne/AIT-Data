class wrapper2
{
	public static void main(String args[])
	{
		//Unboxing(Converting Object to primitive)

		
		Integer i=new Integer(10);
		int ab=i.intValue();
		int j=i;			//object to primitive (unboxing)
		System.out.println(i);
		System.out.println(j);
		System.out.println(ab);

		Character ch=new Character('X');
		char cc=ch.charValue();
		char xx=ch;
		System.out.println(ch);
		System.out.println(cc);
		System.out.println(xx);
	}
}