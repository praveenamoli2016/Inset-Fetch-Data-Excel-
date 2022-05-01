                     /*FileWriter*/
package Exceptionshandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("C:\\Users\\Ram Janki Family\\Desktop\\OM.txt");
			try
			{
				f.write("java program...");
			}
			finally
			{
				f.close();//
			}
			System.out.println("succesfully data wrote in file");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
		
	}

}
