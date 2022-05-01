package Exceptionshandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile {
	public static void main(String[] args) throws IOException {
	FileInputStream r=new FileInputStream("C:\\Users\\Ram Janki Family\\Desktop\\Neeraj.txt");
	FileOutputStream r2=new FileOutputStream("C:\\Users\\Ram Janki Family\\Desktop\\Nitin.txt");
	{
		int i;
		while((i=r.read())!=-1)
		{
			r2.write((char)i);
		}
		System.out.print("Data copyied Sucessfully...");     
}
}

	}


