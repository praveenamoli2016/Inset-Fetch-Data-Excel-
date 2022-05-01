package firstask;

public class Createmethod7 {

	public int sum() // return type ko change kar sakte hai
	{
		int a = 10, b = 20;
		int c = a + b;
		return c;
	}

	public String sum(int a, int b) {
		System.out.println("sum=" + (a + b));
		String c="praveen";
		return c;
	}

	public double sum(int a, double b) {
		double c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Createmethod7 r = new Createmethod7();		
		System.out.println("addition:" + r.sum());
		System.out.println("print:" + r.sum(7, 8));
		System.out.println("addition:" + r.sum(5, 2.5));
	}

}
