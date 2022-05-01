package firstask;

public class Createmethod6 {
	public int sum() //return type ko change kar sakte hai
	{
	int a=10,b=20;
	int c=a+b;
	return c;
	}
	public void sum(int a,int b)
	{
	int c=a+b;
	System.out.println("addition:"+c);
    }
	public void sum(int a,double b)
	{
	double c=a+b;
	System.out.println("addition:"+c);
    }
	public static void main(String[] args) {
		Createmethod6 r=new Createmethod6();
		r.sum();r.sum(10,20);r.sum(5,2.5);
		//int d=r.sum();r.sum(10,20);r.sum(5,2.5);
		System.out.println("addition:"+r.sum());
		//System.out.println("addition:"+d);
	}
	
}

