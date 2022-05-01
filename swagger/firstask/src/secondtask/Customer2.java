package secondtask;

import java.util.Scanner;

class bank2 {
	 public double bal=5000;
	 public int pwd;
	 public void Deposite(double money) {
		 System.out.print("enter password");
		 Scanner s=new Scanner(System.in);
		 pwd=s.nextInt();
		 if(pwd==173)
		 {
			 bal=bal+money;
			 System.out.println("withdrawn money"+money);
			 System.out.println("total balance"+bal);
		 }
		 else
		 {
			 System.out.println("incorrect password"); 
		 }
	 }
	 public void withdraw(double money) {
		 System.out.print("enter password");
		 Scanner s=new Scanner(System.in);
		 pwd=s.nextInt();
		 if(pwd==173)
		 {
			 bal=bal-money;
			 System.out.println("withdrawn money"+money);
			 System.out.println("total balance"+bal);
		 }
		 else
		 {
			 System.out.println("incorrect password"); 
		 }
	 }
	   public void checkbal() {
		   System.out.println("enterpassword");
		   Scanner s=new Scanner(System.in);
			 pwd=s.nextInt();
			 if(pwd==173)
			 {
				 System.out.println("total balance"+bal); 
			 }
		   
	   }
}
	   class Customer2 {//customer bahari persion hai
		   public static void main(String[] args) {
			   bank2 b=new bank2();
			   System.out.println(b.bal);
			   int ch;
			   System.out.println("1,deposite:");
			   System.out.println("2,withdraw:");
			   System.out.println("3,checkbalance:");
			   Scanner s=new Scanner(System.in);
				 ch=s.nextInt();
			   switch(ch)
			   {
			   case 1: b.Deposite(2000);
			   break;
			   case 2: b.withdraw(500);
			   break;
			   case 3: b.checkbal();
			   break;
			   default: System.out.println("invalid choice:");
			   
			   }
		   }
	   }



