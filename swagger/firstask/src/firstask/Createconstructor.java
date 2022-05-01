package firstask;

public class Createconstructor {
	int a;
	String name;

	/*createconstructor() {
		a = 0;
		name = null;

	}*/ //java me constructor by default hota hai

	void show() {
		System.out.print(a + " " + name);
	}

	public static void main(String[] args) {
		Createconstructor ref = new Createconstructor();// yahi hai constructor
		ref.show();

	}

}
