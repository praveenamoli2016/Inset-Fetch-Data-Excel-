package Exceptionshandling;

class J{
	void div(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}
}
public class ThrowandThrows {
	public static void main(String[] args){
		//public static void main(String[] args) throws ArithmeticException{
	    J r=new J();
	    try
	    {
	      r.div(2,0);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Value of b is 0");
	    }

}
}
