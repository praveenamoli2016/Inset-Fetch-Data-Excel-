package Exceptionshandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileinputstream  {
	public static void main(String[] args) {
		try {
			FileInputStream r = new FileInputStream("C:\\Users\\Ram Janki Family\\Desktop\\Neeraj.txt");
			int i;	
			while ((i = r.read()) != -1) {
				System.out.print((char) i);
			}
			r.close();
			System.out.println("file closed");//
			System.out.println("succesfully data wrote in file");
		} catch (IOException e) {
			System.out.println("exception handled...");
		}

	}

}

