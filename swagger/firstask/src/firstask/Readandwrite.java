package firstask;

public class Readandwrite {
	int Numberofball;
	public static void main(String[] args) {
		Readandwrite rr=new Readandwrite();
		Readandwrite rr2;//reassignment
		rr2 = rr; // dereferances
		rr.Numberofball=10;  //write
		System.out.println(rr.Numberofball);//read
		//System.out.println(rr2.Numberofball);
	
}
}