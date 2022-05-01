package firstask;

import java.util.Scanner;

public class Create2Darray {
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		System.out.println("enter array elements");
		Scanner r=new Scanner(System.in);
		for(int i=0;i<2;i++)//for row
			//use nested for loop
		{
			for(int j=0;j<2;j++) // for coloum
			{
				a[i][j]=r.nextInt();//for data input
			}
			
		}
		System.out.println("Matrix:\n");
	
	for(int i=0;i<2;i++)
		
	{
		for(int j=0;j<2;j++) 
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println("\n");
	}

}
}
