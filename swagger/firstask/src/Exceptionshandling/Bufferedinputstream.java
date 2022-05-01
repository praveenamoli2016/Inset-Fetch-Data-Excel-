package Exceptionshandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Bufferedinputstream {
	public static void main(String[] args) throws IOException{
		
			FileInputStream r = new FileInputStream("C:\\Users\\Ram Janki Family\\Desktop\\Neeraj.txt");
			BufferedInputStream bos=new BufferedInputStream(r);
			int i;
			while((i=bos.read())!=-1)
			{
				System.out.print(i);
				System.out.print((char)i);
			}
			bos.close();
			r.close();
			
			
			//System.out.println("succesfully data wrote in file")
		
	}

}


