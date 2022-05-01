                  /*by extending thread class*/

package Multithreading;

class P extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("praveen");
		}
	}

}

class Byextendingthread {
	public static void main(String[] args) {
		P t = new P();
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("neeraj");
		}
	}
}
