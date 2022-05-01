package secondtask;

public class Instanseblock {
	Instanseblock()
	{
		System.out.println("default constructor");// instance block default cons se pahle call hota hai
	}

		{//instance block esme kisi keyword ki jarurat nahi hoti hai
		 System.out.println("praveen");
	    }
	 public static void main(String[] args) {
		 Instanseblock r=new Instanseblock();
	 }
}
