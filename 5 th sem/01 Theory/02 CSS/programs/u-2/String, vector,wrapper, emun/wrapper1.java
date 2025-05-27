class wrapper1
{
	public static void main(String args[])
	{
		//Autoboxing(Converting Primitive to Object)

		int i=100;
		Integer j=Integer.valueOf(i);
		Integer ab=i;
		System.out.println(i);
		System.out.println(j);
		System.out.println(ab);

		char ch='A';
		Character jj=Character.valueOf(ch);
		Character cc=ch;
		System.out.println(ch);
		System.out.println(jj);
		System.out.println(cc);
	}
}