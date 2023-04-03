package oops;

abstract class Bank
{
	
	abstract public void deposit();
	abstract public void withdraw();
	public void minimumbalance()
	{
		System.out.println("minimum blance is 1000");
	}
}

class Sbi extends Bank
{

	@Override
	public void deposit() {
	System.out.println("sbi deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("sbi withdraw");
		
	}
	
	class federal extends Bank
	{

		@Override
		public void deposit() {
			
			
		}

		@Override
		public void withdraw() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}

class federal extends Bank
{

	@Override
	public void deposit() {
		System.out.println("federel deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("federal withdraw");
		
	}
	
	
}


public class Abstractpgm {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.deposit();
		ob.withdraw();
		ob.minimumbalance();
		

	}

}
