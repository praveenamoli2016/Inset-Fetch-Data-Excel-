                        /*Createfile2*/
package Exceptionshandling;
import java.io.File;
import java.io.IOException;
public class Createfile2 {
	public static void main(String[] args) throws IOException {//abhi exception ko main method ka caller jvm handle karega
		
		File f = new File("C:\\Users\\Ram Janki Family\\Desktop\\OM2.txt");
		
		  
			if(f.createNewFile())
		    {
				System.out.println("file successfully create...!");
			} 
			
		    else
		    {
			  System.out.println("file already exist...!");
		    }
		  
				
			}
	}
		
