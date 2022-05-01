package Workingwithinheritance;
interface Arav
{
	 void show();//public+abstract
	     //abstract void show(); ye bhi likh sakte hai
}
	 
interface Aryan
{
	 void disp();//public+abstract by default hai
}

    //agar dono ke pass alag alag requiement hai
class multiple10 implements Arav,Aryan
{
	 public void show() //esliye yaha public likhana hoga 
	                    //agar hm public yaha nhi likhenge to usse yaha par
	                    //by default access modifier default rahega aur
	                    //default public ke mukable chota hota hai weak hota hai
	  {
		  System.out.println("interface Arav");
	  }
	  public void disp()
	  {
		  System.out.println("interface Aryan"); 
	  }
}
public class Multipleinheritance {
	  public static void main(String[] args) {
	    	 
	  	   multiple10 m=new multiple10();
	  	   m.show();m.disp();
	  
}
}





