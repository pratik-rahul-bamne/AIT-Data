import java.io.*;
class file_info
{
	public static void main(String args[])
	{
		File f=new File("C:\\Users\\Admin\\fh\\lc.txt");
		if(f.exists())
		{
			System.out.println("File Name:"+f.getName());
			System.out.println("File Location:"+f.getAbsolutePath());
			System.out.println("File Writable:"+f.canWrite());
			System.out.println("File Readable:"+f.canRead());
			System.out.println("File Size:"+f.length());
		}
		else
		{
			System.out.println("File Does not Exist");
		}
	}
}