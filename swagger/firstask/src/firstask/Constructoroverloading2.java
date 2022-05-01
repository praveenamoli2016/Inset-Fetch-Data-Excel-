package firstask;

public class Constructoroverloading2 {
	int a; double b; String c;
	private Constructoroverloading2()
	{
		a=10;b=20.5;c="praveen";
		System.out.println();
	}
	 /*constructoroverloading2()
	{
		a=10;b=20.5;c="praveen";
		System.out.println();
	}*/
	Constructoroverloading2(int x)
	{
		 x=a;
	}
	Constructoroverloading2(double y,String z)
	{
		b=y;c=z;
	}

	public static void main(String[] args) {
		Constructoroverloading2 r=new Constructoroverloading2();
		Constructoroverloading2 r2=new Constructoroverloading2(15);
		Constructoroverloading2 r3=new Constructoroverloading2(2.5,"naveen");
		System.out.println(r.a+" "+r.b+" "+r.c);
		System.out.println(r2.a);
		System.out.println(r3.b+" "+r3.c);
	}

	

	}


