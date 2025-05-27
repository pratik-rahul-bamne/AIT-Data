abstract class animal
{
	public abstract void sound();
}
class dog extends animal
{
	public void sound()
	{
		System.out.println(" DOG IS BARKING");
	}
}
class lion extends animal
{
	public void sound()
	{
		System.out.println(" LION IS ROARING");
	}
}
class abstract3
{
	public static void main(String args[])
	{
		animal d=new dog();
		d.sound();
		lion l=new lion();
		l.sound();
	}
}	
	