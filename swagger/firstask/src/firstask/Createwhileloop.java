package firstask;

import java.util.Scanner;

public class Createwhileloop {
	public static void main(String[] args) {
		int num;
		System.out.println("enter any no: ");
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		while (num>=0)
		{		
			if(num%2==0)
			{
				System.out.println("even no: ");
				break;			
			}
			else
			{
				System.out.println("odd no: ");
				break;				
			}				
		}
}


}
