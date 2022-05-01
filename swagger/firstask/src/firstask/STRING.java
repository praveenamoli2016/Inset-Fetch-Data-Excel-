package firstask;

public class STRING {
	public static void main(String[] args) {
		String str="praveen"; 
		String str2=new String("praveen");
		String str3="naveen kumar";
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareTo(str3));
		System.out.println(str3.compareTo(str2));
	}// yah string ke length ke basis par compare karta hai
}
