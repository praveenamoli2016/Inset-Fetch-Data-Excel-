package firstask;

import java.util.Scanner;

public class Create2Darraystring {
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		 System.out.println("Please input array size : ");
	      int size1 =  r.nextInt();
	      int size2 =  r.nextInt();
	     String[][] a= new String[size1][size2];
	     System.out.println("Please input array elements : ");
	     for(int i=0;i<size1;i++)
	     {
	    	 for(int j=0;j<size2;j++)
	     {
	    	 a[i][j]=r.next();
	     }
	    	 System.out.println(" array element are: \n");
	     }
	    	 for(int i=0;i<size1;i++)
		     {
		    	 for(int j=0;j<size2;j++)
		     {
		    	 System.out.print(a[i][j]+" ");
		     }
		    	 System.out.print("\n");
	}

}
}
