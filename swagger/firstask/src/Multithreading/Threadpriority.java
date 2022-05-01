package Multithreading;

class Q8 extends Thread {
    @Override 
	  public void run()
	  {
    	System.out.println(Thread.currentThread().getName());
    	System.out.println(Thread.currentThread().getPriority());
         /*for(int i=1;i<=5;i++)
	  
           {
	              System.out.println("Interrupted method print");
           }*/
        
	  }
   
}

public class Threadpriority
{
public static void main(String[] args){
Q8 t1=new Q8();
Q8 t2=new Q8();
Q8 t3=new Q8();
t1.setName("thread 1");
t2.setName("thread 2");
t3.setName("thread 3");
t1.setPriority(3);
t2.setPriority(7);
t3.setPriority(4);
//t3.setPriority(13);
t1.start();
t2.start();
t3.start();

}
}




