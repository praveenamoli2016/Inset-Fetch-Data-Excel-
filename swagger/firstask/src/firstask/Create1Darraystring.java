package firstask;

import java.util.Scanner;

public class Create1Darraystring {
	public static void main(String[] args) {
	 Scanner r=new Scanner(System.in);
	 System.out.println("Please input array size : ");
     int size =  r.nextInt();
     String[] a= new String[size];
     System.out.println("Please input array elements : ");
     for(int i=0;i<a.length;i++)
     {
    	 a[i]= r.next();
     }
     System.out.println("array elements are : ");
     for(int i=0;i<a.length;i++)
     {
    	 System.out.println(a[i]);
     }
     
     
     
}
}
