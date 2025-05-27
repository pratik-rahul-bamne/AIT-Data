class b
{
	void add(int ... a)
	{
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println("SUM IS:"+sum);
	}	
}
class varargs
{
	public static void main(String args[])
	{
		b r=new b();
		r.add();
		r.add(10);
		r.add(10,20);
		r.add(10,20,30);
	}
}
		