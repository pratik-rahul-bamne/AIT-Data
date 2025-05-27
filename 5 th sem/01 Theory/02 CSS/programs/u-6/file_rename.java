import java.io.*;
class file_rename
{
	public static void main(String args[])throws IOException
	{
		File f=new File("C:\\Users\\Admin\\fh\\abc.txt");
		File r=new File("C:\\Users\\Admin\\fh\\xyz.txt");
		if(f.exists())
		{	
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File Does't Exist");
		}
	}
}