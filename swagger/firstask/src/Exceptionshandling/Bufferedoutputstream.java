package Exceptionshandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedoutputstream {
	public static void main(String[] args) throws IOException{
		
			FileOutputStream r = new FileOutputStream("C:\\Users\\Ram Janki Family\\Desktop\\Neeraj.txt");
			BufferedOutputStream bos=new BufferedOutputStream(r);
			//int i=10;
			String s="praveen";
			byte b[]=s.getBytes();
			bos.write(b);
			bos.close();
			r.close();
			System.out.println("succesfully data wrote in file");
		
	}

}


