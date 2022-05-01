package secondtask;
interface vehical
{
	String name="TVS"; //public+static+final
	 int Speed=100;   // public+static+final
	void start();    //public+abstract
	void stop();     // interface ka koi bhi method ho bydefault vah pub+abshota hai
 default void color()
	   {
		   System.out.println("	TVS color is red");  
	   }
}
  class customer12 implements vehical {
	  
	  @Override //ye ek annotation hai java me ye bas hame ye batata hai ye jo method hm implement
	  public void start()
	  {
		  System.out.println("start(): insert key and press start button"+name);
	  }
	  @Override //kar rahe hai start and stop ye method ko hm override kr rahe hai
	  public void stop()
	  {
		  System.out.println("stop(): exit key");
	  }
  }
  public class Interface {
	  public static void main(String[] args) {
			 customer12 c=new customer12();
			 c.start(); c.stop(); c.color();
			 System.out.println("Speed");
			 
			 
	  }
  }
			 


