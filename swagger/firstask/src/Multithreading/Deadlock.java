package Multithreading;

public class Deadlock {
	public static void main(String[] args) {
		final String s1 = "praveen";
		final String s2 = "nitin";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("Thread 1:locked "+s1);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
					
					synchronized (s2) {
						System.out.println("Thread 1:locked "+ s2);
					}
				}
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (s2) {
					System.out.println("Thread 2:locked "+s2);

					try {
						Thread.sleep(1000);
					} catch (Exception e) {

					}
					synchronized (s1) {
						System.out.println("Thread 2:locked "+s1);
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}