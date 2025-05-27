class sb1
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		/*StringBuffer sb1=new StringBuffer(20);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());*/

		StringBuffer sb2=new StringBuffer("HELLO");
		System.out.println(sb2.reverse());

		
		StringBuffer sb3=new StringBuffer("ADARSH");
		sb3.setCharAt(1,'A');
		System.out.println(sb3);
		
		int x=22;
		float y=12.3f;
		sb3.append(x);
		sb3.append(y);
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer("PROGRAMMING");
		sb4.delete(3,7);
		sb4.deleteCharAt(0);
		System.out.println(sb4);
		
	}
}