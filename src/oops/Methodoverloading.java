package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		
		
		Methodoverloading m=new Methodoverloading();
		m.add();
		m.add(30, 20);
		m.add(20, 40, 10);
		

	}
	
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}

}
