                             /*method overriding*/
package Workingwithinheritance;

class sachin
{
void draw()
{
System.out.println("can not say shape type");
}
}
class square extends sachin
{
@Override//eska ye mtb hota hai ye bas ye indicate krta hai ki ye method overriden method hai
void draw()// koi aur programer agar apke program ke uper wale hisse ko nahi bhi dekhega sirf etne hisse ko dekhega to 
{
System.out.println("square shape");	// vah jan jayega ki yah draw method overhiden method hai kyki hmne eske uper ye line likh rakha hai
}
}

public class Runtimepolymorphism  {
public static void main(String[] args) {
sachin r=new square();
r.draw();

}
}

