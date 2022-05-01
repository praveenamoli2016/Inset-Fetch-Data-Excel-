package firstask;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.print("enter anytwo no:");
		Scanner s=new Scanner(System.in);  //used for taking input from user
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("enter your choise:");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:c=a+b;
		System.out.print("Addition:"+c);
		break;
		case 2:c=a-b;
		System.out.print("subtraction:"+c);
		break;
		case 3:c=a*b;
		System.out.print("multiplication:"+c);
		break;
		case 4:c=a/b;
		System.out.print("division:"+c);
		break;
		case 5:c=a%b;
		System.out.print("Remainder:"+c);
		break;
		default:
		System.out.print("Invalid choice..:");
		
		
		  
		
		}
		
		
		

}
}

