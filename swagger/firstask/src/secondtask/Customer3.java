package secondtask;

import java.util.Scanner;

abstract class bank3 {
	public String name = "my bank";
	public String IFSC = "my bank 123";

	public void bankdetail() {
		System.out.println("bank name" + " " + "bank IFSC code " + IFSC);
	}

	// password 123
	abstract void deposite();

	abstract void withdraw();

	abstract void checkbal();
}

class bankservice extends bank3 {
	private double bal = 5000;
	private int pwd;
	public double money;

	public void deposite() {
		System.out.print("enter password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		System.out.print("enter amount to deposite : ");
		money = s.nextDouble();
		if (pwd == 173) {
			bal = bal + money;
			System.out.println("withdrawn money" + money);
			System.out.println("total balance" + bal);
		} else {
			System.out.println("incorrect password");
		}
	}

	public void withdraw() {
		System.out.print("enter password");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		System.out.print("enter amount to withdrow : ");
		money = s.nextDouble();
		if (pwd == 173) {
			bal = bal - money;
			System.out.println("withdrawn money" + money);
			System.out.println("total balance" + bal);
		} else {
			System.out.println("incorrect password");
		}
	}

	public void checkbal() {
		System.out.println("enterpassword");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();
		if (pwd == 173) {
			System.out.println("total balance" + bal);
		}

	}
}

class Customer3 {
	public static void main(String[] args) {
		bankservice b = new bankservice();
		b.bankdetail();
		System.out.println("1,deposite:");
		System.out.println("2,withdraw:");
		System.out.println("3,checkbalance:");

		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();

		switch (ch) {
		case 1:
			b.deposite();
			break;
		case 2:
			b.withdraw();
			break;
		case 3:
			b.checkbal();
			break;
		default:
			System.out.println("invalid choice: " + ch);

		}

		main(new String[] {});
	}
}


