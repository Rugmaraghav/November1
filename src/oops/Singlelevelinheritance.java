package oops;



class parentclass
{
	
	public void add()
	{
		System.out.println("add");
	}
	public void sub()
	{
		System.out.println("sub");
	}
	
}

class child extends parentclass
{
	
	public void div()
	{
		System.out.println("div");
	}
}


public class Singlelevelinheritance {

	public static void main(String[] args) {
		
		child ob=new child();
		ob.add();
		ob.div();
		ob.sub();
		

	}

}
