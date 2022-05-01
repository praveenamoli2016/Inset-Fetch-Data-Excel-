package firstask;

import java.util.Scanner;

public class Create3Darray {
	public static void main(String[] args) {
		int size,i;
		Scanner r = new Scanner(System.in);
		System.out.print("enter size of array:");
		size = r.nextInt();
		int a[] = new int[size];
		
		for ( i = 0; i < size; i++) {
			System.out.print("enter array elements:");
			a[i] = r.nextInt();
		}
		System.out.print("print array elements:");
		for ( i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
