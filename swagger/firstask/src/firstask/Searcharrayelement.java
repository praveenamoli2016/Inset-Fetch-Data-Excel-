package firstask;

import java.util.Scanner;

public class Searcharrayelement {

	public static void main(String[] args) {
		int n,count=0;
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("array elements:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("enter search elements:");
		n=r.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count>0)
			System.out.println("item found");
			//System.out.println("item found"+count+"times");
		else
			System.out.println("item not found");	
		
	}

}
