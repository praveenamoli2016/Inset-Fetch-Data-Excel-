             /* Heirarchical inheritance*/
package Workingwithinheritance;
class Heirarchical4
{
	void input()
	{
		System.out.println("enter your name:");
	}
}
 class Heirarchical3 extends Heirarchical4
 {
	 void show()
		{
			System.out.println("my name is praveen:");
		} 
 }
 class Heirarchical2 extends Heirarchical4
 {
	 void disp() // dono method same esliye nhi kiya kyoki overriding ho jayega
		{
			System.out.println("my name is neeraj:");
		} 
 }
public class Heirarchical {
	 public static void main(String[] args) {
		 Heirarchical3 r=new Heirarchical3();
		 Heirarchical2 r2=new Heirarchical2();
		 r.input(); r.show();
		 r2.input(); r2.disp();
		 
	 }
    	 
}
