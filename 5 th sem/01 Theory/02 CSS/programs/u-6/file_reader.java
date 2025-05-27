import java.io.*;
class file_reader
{
	public static void main(String args[])throws IOException
	{
		FileReader r=new FileReader("C:\\Users\\Admin\\fh\\read.txt");
		
		int i;
		while((i=r.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}