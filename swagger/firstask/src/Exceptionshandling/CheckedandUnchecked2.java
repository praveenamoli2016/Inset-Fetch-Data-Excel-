package Exceptionshandling;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

public class CheckedandUnchecked2 {
	private static final int integer = 0;

	public static void main(String[] args)throws IOException {
		InputStreamReader f=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(f);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the value:");
         //String s;
         //s=br.readLine();
         int a,b,c;
           a=Integer.parseInt(br.readLine());
           b=Integer.parseInt(br.readLine());
           c=a/b;
           System.out.println("Value of c:"+c);
         
	}
}

