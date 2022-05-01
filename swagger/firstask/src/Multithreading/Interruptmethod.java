package Multithreading;
class Q7 extends Thread {
    @Override 
	  public void run()
	  {
    	//try
    	//{
         for(int i=1;i<=5;i++)
	  
           {
	              System.out.println("Interrupted method print");
	              //Thread.sleep(3000);
            }
        
	  }
    	/*catch(InterruptedException i)
    	{
    
    	}*/
}

public class Interruptmethod
{
public static void main(String[] args){
Q7 t=new Q7();
t.start();
t.interrupt();
}
}



