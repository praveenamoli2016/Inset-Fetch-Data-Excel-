package firstask;

import java.util.Arrays;
import java.util.Scanner;

public class Arraycopyof {
	public static void main(String[] args) {
	int a[]=new int[5];
	Scanner r=new Scanner(System.in);
	System.out.println("enter data in array:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=r.nextInt();
	}
	int a2[]=Arrays.copyOf(a,5);//agar ham a2 ka size badhana chahen to
	//int a2[]=Arrays.copyOf(a,6);
	//a2[5]=100;
	System.out.println("enter data in array2:");
	//for(int i=0;i<a.length;i++)
	 for(int i=0;i<a2.length;i++) //dono se same result aayega
		{
			System.out.print(a2[i]+" ");
		}
	}
	}


