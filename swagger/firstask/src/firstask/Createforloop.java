package firstask;

import java.util.Scanner;

public class Createforloop {
	public static void main(String[] args) {
		int num;
		System.out.println("enter any no: ");
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		for(int i=1;i<=10;i++)//print table of 1 to 10
		{
			
			System.out.println(num*i);
		}
	}

}
