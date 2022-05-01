package Multithreading;

class Bus implements Runnable {

	int available = 2, passenger;

	Bus(int passenger) {
		this.passenger = passenger;// Passenger=1
	}

	@Override
	// public void run()
	public synchronized void run() // t1 or t2 or t3
	{
		String name = Thread.currentThread().getName();
		if (available > 0) {
			System.out.println(name + " " + "Reserved Seat:");
			available = available - 1;

		} else {
			System.out.println("Seat is not available:");
		}

	}
}

public class Synchroniztionmethod {
	public static void main(String[] args) {
		Bus r = new Bus(3);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.setName("sachin");
		t2.setName("praveen");
		t3.setName("naveeen");
		t1.start();
		t2.start();
		t3.start();

	}
}
