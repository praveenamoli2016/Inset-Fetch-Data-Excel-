            /*multilevel inheritance*/
package Workingwithinheritance;
  
class Multilevelinheritance4 {
 int a,b,c;
 void add()
{
	 a=10;b=20;
	 c=a+b;
System.out.println("Sum of two no:"+c);
}
}
class Multilevelinheritance3 extends Multilevelinheritance4

   {
    void multi()
    {
         a=25;b=10;
         c=a*b;
        System.out.println("Multiplication of two no:"+c);
     }
    void div()
	  {
		  a=25;b=5;
	         c=a/b;
	        System.out.println("Division of two no:"+c);
	  }
   }
   class Multilevelinheritance2 extends Multilevelinheritance3{  
	  void rem()
	  {
		  a=22;b=5;
	         c=a%b;
	        System.out.println("Remainder of two no:"+c);
	  }
   }
class Multilevelinheritance {

    public static void main(String[] args) {
	Multilevelinheritance2 r=new Multilevelinheritance2();
       r.add(); r.multi();r.div();r.rem();
}
}

