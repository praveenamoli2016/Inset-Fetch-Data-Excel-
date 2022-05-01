package Multithreading;
class Q2 extends Thread {
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
public class joinmethod
{
public static void main(String[] args){
Q2 t1=new Q2();
Q2 t2=new Q2();
Q2 t3=new Q2();
t1.setName("thread 1");
t2.setName("thread 2");
t3.setName("thread 3");
t1.start();
try
{
	t1.join();
}
catch(InterruptedException i)
{
	
}
t2.start();
t3.start();
String name=Thread.currentThread().getName();
for(int i=1;i<=4;i++)
{
       System.out.println(name);
 }

}
}
