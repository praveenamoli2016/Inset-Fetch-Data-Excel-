package firstask;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysort {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.println("enter data in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("enter array elements ");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
