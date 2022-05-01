package firstask;

public class Createmethod4 {
	public void sum()
	{
	int a=10,b=20;
	int c=a+b;
	System.out.println("addition:"+c);
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
		Createmethod4 r=new Createmethod4();
		r.sum();r.sum(10,20);r.sum(5,2.5);
	}
	
}
