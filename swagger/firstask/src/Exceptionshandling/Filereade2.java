package Exceptionshandling;
import java.io.FileReader;
import java.io.IOException;

public class Filereade2 {
	public static void main(String[] args) throws IOException{
	
			FileReader r=new FileReader("C:\\Users\\Ram Janki Family\\Desktop\\praveen.txt");

			{
				int i;
				while((i=r.read())!=-1)
				{
					System.out.print((char)i);
				}
				     //r.close();agar yaha par ye likh de to eski koi garanti nhi hai ki hamara file close hi hoga read
			}     //hone ke bad data
	}
}
	
