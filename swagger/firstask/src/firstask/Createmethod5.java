package firstask;

public class Createmethod5 {
	public void sum(int a)
	{
	
	System.out.println("print:"+a);
	}
	public void sum(long a)
	{
	System.out.println("print:"+a);
    }
	public void sum(double b)
	{
	System.out.println("print:"+b);
    }
	public void sum(byte b)
	{
	System.out.println("print:"+b);
    }
	public static void main(String[] args) {
		Createmethod5 r=new Createmethod5();
		r.sum(5);r.sum(10);r.sum(5);r.sum(8);
	}
	

}
