class s4
{
	public static void main(String args[])
	{
		String a="ADARSH";
		String b="vita";

		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		
		System.out.println(a.concat(b));
		System.out.println(a.length());

		String c="    Institute     ";
		String d="Technology";
		
		System.out.println(c.trim());
		System.out.println(d.isEmpty());

		System.out.println(d.charAt(2));
		System.out.println(d.indexOf('c'));

		System.out.println(a.equals(b));
		System.out.println(b.replace('a','e'));
		
		String f="";
		int l=d.length();
		System.out.println("Length of string d is(l):"+l);
		for(int i=l-1;i>=0;i--)
		{
			f=f+d.charAt(i);	
		}
		System.out.print(f);
	}
}
		