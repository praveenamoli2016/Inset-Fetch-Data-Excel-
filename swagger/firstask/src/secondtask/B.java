package secondtask;

  class C {
	 private void show() //with in class accessible hai
	{
		System.out.println("praveen...");
	}
}

  class B{
	public static void main(String[] args) {
		
       C r=new C();
       r.show();//other class me accessible nhi hai
	}
  }


		



