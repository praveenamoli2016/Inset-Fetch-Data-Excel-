package firstask;

public class Constructoroverloading {
	int a; double b; String c;
	Constructoroverloading()
	{
		a=10;b=20.5;c="praveen";
		System.out.println();
	}
	Constructoroverloading(int x)
	{
		 x=a;
	}
	Constructoroverloading(double y,String z)
	{
		b=y;c=z;
	}
	public static void main(String[] args) {
		Constructoroverloading r=new Constructoroverloading();
		Constructoroverloading r2=new Constructoroverloading(15);
		Constructoroverloading r3=new Constructoroverloading(2.5,"naveen");
		System.out.println(r.a+" "+r.b+" "+r.c);
		System.out.println(r2.a);
		System.out.println(r3.b+" "+r3.c);
	}
}
