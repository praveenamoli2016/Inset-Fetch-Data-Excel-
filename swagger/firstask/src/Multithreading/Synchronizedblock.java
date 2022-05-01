package Multithreading;
class Y  {
	public void show(String name)
	//public synchronized void show(String name)
	{
		;;;;;//assume 100 line of code
		synchronized(this)
	  {
	    for(int i=1;i<=4;i++)
		  System.out.println("Shree ram janki bhawan"+name);
	  }
	}
	;;;;;//assume 100 line of code
}
	class Y2 extends Thread
	{
	 
		Y y;
		String name;
		Y2(Y y,String name)
		{
			this.y=y;
			this.name=name;
		}
		public void run()
		{
			y.show(name);
	    }
	}
	

public class Synchronizedblock
{
public static void main(String[] args){
	Y y=new Y();
Y2 t1=new Y2(y,"praveen");
Y2 t2=new Y2(y,"anil");
t1.start();
t2.start();
}
}




