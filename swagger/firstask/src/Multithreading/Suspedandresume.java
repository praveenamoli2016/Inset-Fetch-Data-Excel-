package Multithreading;
class Q3 extends Thread {
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
public class Suspedandresume
{
public static void main(String[] args){
Q3 t1=new Q3();
Q3 t2=new Q3();
Q3 t3=new Q3();
t1.setName("praveen");
t2.setName("sachin");
t3.setName("naveen");
t1.start();
t2.start();
t2.suspend();
t3.start();
t2.resume();

try
{
	t1.join();
}
catch(InterruptedException i)
{
	
}
t2.start();
t3.start();

}
}

