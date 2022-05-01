//define structure of java class

/*Documentation Section
package Declaration
import statements
interface section
class definition
class variable and variables
main method class
methods and behaviors
*/

//Documentation Section

//first java program (Single line comment)

/*my name is praveen
  i am from jaunpur up*/ //(Multi line comment)
/**my name is praveen*/ //(Documentation comment)

package firstask;

import java.util.Scanner;

interface laptop {
	void start();

	void stop();
}

class Structureofclass
{
	String name; // variable
	int id;
	double percentage;

	public static void main(String[] args) {
		System.out.println("enter data");
	Scanner s=new Scanner(System.in);
	String name=s.next();
	int id=s.nextInt();
	double percentage=s.nextDouble();
	System.out.println("enter your name:"+name);
	System.out.println("enter your id:"+id);
	System.out.println("enter your percentage:"+percentage);
	Structureofclass r=new Structureofclass();
		r.disp();	
	}
	void disp() {
		System.out.println("something");
	}
	// code

}