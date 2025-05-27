import java.io.*;
class file_writer
{
	public static void main(String args[])throws IOException
	{
		FileWriter f=new FileWriter("C:\\Users\\Admin\\fh\\write.txt");
		f.write("WELCOME TO JAVA PROGRAMMING.....");
		System.out.println("Successfully Wrote Data....");
	}
}