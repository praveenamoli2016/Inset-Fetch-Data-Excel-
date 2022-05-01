                /*Multiple inheritance*/

package Workingwithinheritance;
interface Arav2
{
	 void show();//public+abstract
	     //abstract void show(); ye bhi likh sakte hai
}
	 
interface Aryan2
{
	 void show();//public+abstract by default hai
}


class Multiple implements Arav2,Aryan2
{
	 public void show() //esliye yaha public likhana hoga 
	                    //agar hm public yaha nhi likhenge to usse yaha par
	                    //by default access modifier default rahega aur
	                    //default public ke mukable chota hota hai weak hota hai
	  {
		  System.out.println("interface Arav2 & Aryan2");
	  }
}
	 public class Multipleinheritance2 {
	  public static void main(String[] args) {
	    	 
	  	   Multiple m=new Multiple();
	  	   m.show();
	  
}
}

