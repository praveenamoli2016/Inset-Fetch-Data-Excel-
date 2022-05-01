package firstask;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayequal {

	public static void main(String[] args) {
		int a[]=new int[5];
		int a2[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.println("enter data in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("enter data in array2:");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=r.nextInt();
		}
		boolean b=Arrays.equals(a,a2);
			System.out.print("Are both arrays are equals"+b);
		}
	}

