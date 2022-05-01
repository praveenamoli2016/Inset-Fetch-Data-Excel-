package Exceptionshandling;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) {
		try {
			FileReader r = new FileReader("C:\\Users\\Ram Janki Family\\Desktop\\OM.txt");
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
