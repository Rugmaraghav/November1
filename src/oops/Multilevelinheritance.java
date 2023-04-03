package oops;

class A
{
	String companyname="luminar";
	public void display()
	{
		System.out.println("display method");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("showmethod");
	}
}

class c extends B
{
	public void setvalues()
	{
		System.out.println("values");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
		c ob=new c();
		System.out.println(ob.companyname);
		ob.show();
		ob.display();
		ob.setvalues();
	}

}
