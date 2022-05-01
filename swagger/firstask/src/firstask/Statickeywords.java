package firstask;
class A{
	static String c="praveen";
}


public class Statickeywords {
	static int a=10;
	public static void main(String[] args) {
		A.c="Navren";
		System.out.println(A.c);
		Statickeywords.show();
	}
		public static void show() {
		{
		  System.out.println(a);
		}

}
}

