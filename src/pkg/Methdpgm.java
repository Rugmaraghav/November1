package pkg;

public class Methdpgm {

	public static void main(String[] args) {
		
  Methdpgm ob=new Methdpgm();
  ob.add();
 int subresult= ob.sub(40, 20);
 System.out.println("sub"+subresult);
 double divresult=ob.div();
 System.out.println("div"+divresult);
 ob.mul(20, 2);
 
	}
	
	
	
//1.method without parameter and without returntype
	
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println("add"+c);}
//	}                                                              1.triangle(0.5*b*h) 
//	                                                                2.circle(3.14*r*r)
//                                                                    3.rectangle(l*b)
//                                                                    4.square(a*a)
//2.method with parameter and with returntype
	
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
		
	}
	
//3.method without parameter and with returntype
	
	public double div()
	{
		double a=30,b=3;
		double d=a/b;
		return d;
		
	}
	
//4.method with parameter and without returntype
	
	public void mul(int v1,int v2)
	{
		int mulresult=v1*v2;
		System.out.println("mul"+mulresult);
	}
	
	
}
