package oops;

class Bank
{
	public void interest()
	{
		System.out.println("interest details");
	}
}

class SBI extends Bank
{
	
	@Override
	public void interest() {
		System.out.println("sbi interest");
		super.interest();
	}

	public void deposit()
	{
		System.out.println("deposit");
	}
	
}


public class Methodoverriding {

	public static void main(String[] args) {
		
		SBI s=new SBI();
		s.deposit();
		s.interest();

	}

}
