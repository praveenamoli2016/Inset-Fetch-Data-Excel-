package firstask;

import package2.Master;

public class WUElevate {
	public static void main(String[] args) {
		System.out.println("hello word");
		// calling another package method
		Master s = new Master();
		s.callMasterMethod();

		// calling variable test
		Variable.variableMethod();

	}
}
