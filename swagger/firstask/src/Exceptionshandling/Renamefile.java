package Exceptionshandling;

import java.io.File;
public class Renamefile {

		public static void main(String[] args)  {
			
			File f = new File("C:\\Users\\Ram Janki Family\\Desktop\\Praveen.txt");
			File f2 = new File("C:\\Users\\Ram Janki Family\\Desktop\\Neeraj.txt");
				if(f.exists())
					
			    {
					System.out.println("file name:"+f.renameTo(f2));

				} 
				
			    else
			    {
				  System.out.println("file does not exists...!");
			    }
		}
			

	}



