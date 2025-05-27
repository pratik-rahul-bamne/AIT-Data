import java.io.*;
class copy_file
{
	public static void main(String args[])throws IOException
	{
		FileInputStream r=new FileInputStream("C:\\Users\\Admin\\fh\\read.txt");
		FileOutputStream w=new FileOutputStream("C:\\Users\\Admin\\fh\\xyz.txt");
		
		int i;
		while((i=r.read())!=-