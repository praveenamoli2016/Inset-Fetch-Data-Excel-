package firstask;

public class WrapperClass {
	public static void main(String[] args) {
		int i=10;
		boolean b=true;
		double d=20.5;
		//Integer in=new Integer(10); // wrapper class
		Integer in=new Integer(i);// boxing,wrapping
		int j=in.intValue(); // unboxing
		Boolean bn=new Boolean(b);
		Double db=new Double(d);
		//System.out.println(in);
		System.out.println(i+""+b+""+d);
		//System.out.println(b);
		//System.out.println(d);
	}

}
