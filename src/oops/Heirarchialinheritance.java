package oops;

class A
{
	public void add()
	{
		System.out.println("add");
	}
}

class B extends A
{
	public void sub()
	{
		System.out.println("sub");
	}
}
class c extends A
{
	public void div() {
		System.out.println("div");
	}
}

public class Heirarchialinheritance {

	public static void main(String[] args) {
	
    B ob=new B();
    ob.add();
    ob.sub();
    
    c ob1=new c();
    ob1.div();
    ob1.add();
		
		
	}

}
