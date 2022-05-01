package Multithreading;

class Q extends Thread {
       @Override 
	  public void run()
	  {
	     String n=Thread.currentThread().getName();
             for(int i=1;i<=5;i++)
              {
	              System.out.println(n);
               }
            }


}
 public class ThreadSchedur
  {
   public static void main(String[] args){
  Q t1=new Q();
  Q t2=new Q();
  Q t3=new Q();
  t1.setName("thread 1");
  t2.setName("thread 2");
  t3.setName("thread 3");
  t1.start();
  t2.start();
  t3.start();
  //t2.stop();
  /*String n=Thread.currentThread().getName();
  for(int i=1;i<=5;i++)
   {
       System.out.println(n);
    }*/
 }
   }
    
  
