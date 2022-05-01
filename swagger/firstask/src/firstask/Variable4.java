package firstask;

public class Variable4 {
    int num=20;
    void m1()
    {
    	int num=30;
    	System.out.println("number:"+num);
    	System.out.println("number:"+this.num);
    }
    public static void main(String[] args) {
    	Variable4 s=new Variable4();
    	s.m1();
    }
}
