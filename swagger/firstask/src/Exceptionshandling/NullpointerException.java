package Exceptionshandling;

public class NullpointerException {
	public static void main(String[] args) {
		String str=null;
		try
		{
		System.out.println(str.toUpperCase());
	    }
		catch(NullPointerException e)
		{
			System.out.println("null can not be casted");
		}
}
}