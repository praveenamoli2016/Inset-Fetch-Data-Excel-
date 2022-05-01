package secondtask;
abstract class animal
{
	void legs()
	{
		 System.out.println("all animals have 4 legs");
	}
	abstract void sound();
	abstract void eat();
}
    class Dog extends animal
    {
    	@Override
    	void sound()
    	{
    		System.out.println("bow bow ...");
    	}
    	void eat()
    	{
    		System.out.println("meat eating");
    	}
	 }
     class cow extends animal
     {
    	 @Override
     	void sound()
     	{
     		System.out.println("Ooo Ooo ...");
     	}
     	void eat()
     	{
     		System.out.println("grass eating");
     	}
 	 }

 class Abstractclass {
	 public static void main(String[] args) {
		 Dog d=new Dog();
		 cow c=new cow();
		 d.sound(); d.eat(); d.legs();
		 c.sound(); c.eat();  c.legs();
		 
	 }

}

