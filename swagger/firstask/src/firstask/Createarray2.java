package firstask;

import java.util.Scanner;

public class Createarray2 {
	public static void main(String[] args) {
		//int a[]= {10,20,30,40,50};//a[5];
		int a[]=new int[5];//create array by new keyword
		System.out.print("enter array elements");
		Scanner s=new Scanner(System.in);
		//using for loop
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.print("\n array elements");
		for(int b:a)
		{
		System.out.print(b+" ");
		}
	}
	


}
