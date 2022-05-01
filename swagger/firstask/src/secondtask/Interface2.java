package secondtask;
interface vehical3
{
	String name="TVS"; //public+static+final
  // public+static+final
	void start();    //public+abstract
    void stop();     // interface ka koi bhi method ho bydefault vah pub+abshota hai

    default void color()
   {
	   System.out.println("	TVS color is red");  
   }
    static void speed()
    {
    	System.out.println("TVS speed is 100km/hr");
    }
}

  class customer14 implements vehical3 {
	  
	  @Override //ye ek annotation hai java me ye bas hame ye batata hai ye jo method hm implement
	  public void start()
	  {
		      // name="Honda"; ye assign nhi hoga agar customer tvs ka honda karne ka prayash kr raha hai 
		  System.out.println("start(): insert key and press start button"+name);
	  }
	  @Override //kar rahe hai start and stop ye method ko hm override kr rahe hai
	  public void stop()
	  {
		  System.out.println("stop(): exit key");
	  }
  }
  public class Interface2 { 
	  public static void main(String[] args) {
			 customer14 c=new customer14();
			 c.start(); c.stop(); c.color();
			 vehical3.speed();
			 	 System.out.println("speed");
			 
	  }
  }
   		 
