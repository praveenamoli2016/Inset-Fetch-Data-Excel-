                    /*simple inheritance*/

package Workingwithinheritance;

 class Simpleinheritance2  {
int roll,marks;
//private int roll,marks;
//protected int roll,marks;
String name;
 void input()
 //private void input() // private member ko access nhi kar sakte
 //protected void input()
{
System.out.println("enter roll,name & marks: ");
}


}
 class Simpleinheritance extends Simpleinheritance2
{
void Star()
{
roll=1;name="praveen";marks=89;

System.out.println( roll+" "+name+" " +" "+marks);
}


public static void main(String[] args) {
	 Simpleinheritance r=new Simpleinheritance();
    r.input(); r.Star();
}
}



