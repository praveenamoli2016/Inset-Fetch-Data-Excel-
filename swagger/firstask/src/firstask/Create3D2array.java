package firstask;

public class Create3D2array {

	public static void main(String[] args) {
		int a[][][]= {{{4,6,3},{3,2,5},{5,8,3}}};//declare,creation and initialization
		System.out.println(a);
		System.out.println(a[0]);
		//System.out.println(a[1][1]);//error index out of bound exception
		System.out.println(a[0][1][1]);
	}

}
