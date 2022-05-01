package Multithreading;

class Bank extends Thread
{
	//int bal=5000;
	static int bal=5000;
	//int withdraw;
	static int withdraw;
	Bank(int withdraw)
	{
		this.withdraw=withdraw;
	}
	//public void run()
	//public synchronized void run()
	//public static synchronized void run()
	public static synchronized void withdraw()
	{
		String name=Thread.currentThread().getName();
		if(withdraw<=bal)
		{
			System.out.println(name+"withdrawn money");
			bal=bal-withdraw;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
		public void run()
		{
			withdraw();
		}
	}


public class Staticsynchronization {
	public static void main(String[] args) {
		Bank r=new Bank(5000);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.setName("praveen");
		t2.setName("rakesh");
		t1.start();t2.start();
		Bank r2=new Bank(5000);
		Thread t3=new Thread(r2);
		Thread t4=new Thread(r2);
		t3.setName("rahul");
		t4.setName("vipin");
		t3.start();t4.start();
		
		
}
}
