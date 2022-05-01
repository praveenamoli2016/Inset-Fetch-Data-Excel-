package firstask;

   class copy {
	int a; String b;
	copy()
	{
		a=10; b="praveen";
		System.out.println(a+" "+b);
	}
	copy(copy ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
	class Createcopyconstructor
	{
		public static void main(String[] args) {
			copy r=new copy();
			copy r2=new copy(r);
		}
	}
	



