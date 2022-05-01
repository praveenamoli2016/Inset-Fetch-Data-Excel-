package firstask;
     /*static variable*/
public class Variable5 {
           static int a=50; //declaration of static variable
        void m1()
        {
        	int a=40;
        	System.out.println("a:"+a);
        	System.out.println("a:"+Variable5.a);//accessing static variable using class name
        }      //within instance method
        public static void main(String[] args) {
        	//System.out.println("a:"+a);
        	Variable5 s=new Variable5();
        	s.m1();
        }
}
