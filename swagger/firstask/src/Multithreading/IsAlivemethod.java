package Multithreading;
class Q6 extends Thread {
    @Override 
	  public void run()
	  
           {
	              System.out.println("IsAlive method print");
            }
        

}
public class IsAlivemethod
{
public static void main(String[] args){
Q6 t1=new Q6();
Q6 t2=new Q6();
System.out.println(t1.isAlive());
t1.start();
//System.out.println(t1.isAlive());
//t1.start();
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
t2.start();
System.out.println(t2.isAlive());
}
}

