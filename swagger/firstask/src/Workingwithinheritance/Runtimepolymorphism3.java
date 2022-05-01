                  /*method overriding*/
package Workingwithinheritance;

   class sachin3                                         
   {
     void draw()
   {
     System.out.println("can not say shape type");
    }
  }
 class square3 extends sachin3
{
  @Override
   void draw() 
  {
  super.draw();
   System.out.println("square shape");	// vah jan jayega ki yah draw method overhiden method hai kyki hmne eske uper ye line likh rakha hai
   }
}
  public class Runtimepolymorphism3 {
   public static void main(String[] args) {
      sachin3 r=new square3(); //agar yaha pe hamara square ka hi ref variable hota to hame sirf ek hi error dega
      r.draw();      // square2 r=new square2();

   }
}

