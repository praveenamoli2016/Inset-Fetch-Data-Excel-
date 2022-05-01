                  /*by implementing runnable interface*/

 package Multithreading;

  class P3 implements Runnable{
      public void run()
       {
        for(int i=1;i<=5;i++)
        {
         System.out.println("my child thread...");
        }
    }

  }
class Byimplementingruntimeinterface
    {
     public static void main(String[] args){
      P3 r=new P3();
      Thread t=new Thread(r);
      t.start();
         for(int i=1;i<=5;i++)
	   {
	     System.out.println("main thread...");
       }
     }
}



