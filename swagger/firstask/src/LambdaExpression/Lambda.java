                    /*LambdaExpression*/
//without lambda expression example
/*public void show()
{
	System.out.println("praveen");
}*/
//lambda expression example
/* () ->System.out.println("praveen");
	() ->{(System.out.println("praveen");}
}*/
                   //with parameter normal example
 /*public void show(int n1,int n2)
{
	System.out.println("sum:"+(n1+n2));
}*/
              //with parameter lambda expression example
/* (int n1,int n2) ->System.out.println("praveen");
	(n1,n2) ->System.out.println("sum:"+(n1+n2));
}*/

              //with parameter & return normal example
/*public int square(int num)
    {
	return num*num;
	}
	     //with parameter & return lambda expression example
	(int num) ->return num*num;
	(n1,n2) ->num*num
}*/

              //with parameter & return normal example
/*public int findSize(ArrayList a)
    {
	return a.size();
	}
	     //with parameter & return lambda expression example
	(a) -> a.size();
	 a -> a.size();
}*/

package LambdaExpression;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
