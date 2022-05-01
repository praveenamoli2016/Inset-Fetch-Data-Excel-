package firstask;

public class Parenthesestooverride {
	public static void main(String[] args) {
	String str="praveen"; // ye alag hai
	String str2=new String("praveen");// ye alag hai
	System.out.println(str);
	System.out.println(str2);
	System.out.println(str==str2); // false hai ye kyoki ye references ko compare karta hai
	   // value ko compare nhi krta hai
	//use equals method
	System.out.println(str.equals(str2));
	

}
}
