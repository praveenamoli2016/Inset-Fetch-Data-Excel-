package Multithreading;

class Q4 extends Thread {
    @Override 
	  public void run()
	  {
	     String name=Thread.currentThread().getName();
          for(int i=1;i<=4;i++)
           {
	              System.out.println(name);
	              Thread.yield();
            }
         }
}
    class Q5 extends Thread {
        @Override 
    	  public void run()
    	  {
    	     String name=Thread.currentThread().getName();
              for(int i=1;i<=4;i++)
               {
    	              System.out.println(name);
             }
}
    }
public class Yieldmethod
{
public static void main(String[] args){
Q4 t1=new Q4();
Q5 t2=new Q5();
t1.start();
t2.start();

 }
}
    





