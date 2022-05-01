                   /*by extending thread class*/
package Multithreading;

  class P4 extends Thread {//esme single thread hai esliye esme 10 sec lag rahe hai
         //@Override 
	  //public void run()
	  public void fun()//ye override method to hai nhi
	  
            {
            try
              {
               for(int i=1;i<=5;i++)
                {
	              System.out.println("praveen");
	               Thread.sleep(1000);
                 }
              }
          catch(InterruptedException i)
          {
 
          }
 

}
   class Byextendingthread2
    {
     public void main(String[] args) throws InterruptedException{
    P4 t=new P4();
    //t.start();
    t.fun();
     for(int i=1;i<=5;i++)
      {
        System.out.println("neeraj");
        Thread.sleep(1000);
      }
     }
      }
    }


