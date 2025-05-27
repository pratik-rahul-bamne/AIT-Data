import java.io.*;
class create_file
{
	public static void main(String args[])throws IOException
	{
		File f=new File("C:\\Users\\Admin\\fh\\abc.txt");
		if(f.createNewFile())
		{	
			System.out.println("File Created Successfully");
		}
		else
		{
			System.out.println("File Already Exist");
		}
	}
}