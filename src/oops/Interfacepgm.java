package oops;


interface car
{
  public void speedlimit();
	public void engine();
}

interface cardetails extends car
{
	public void accelaration();
}
class BMW implements car,cardetails
{

	@Override
	public void speedlimit() {
		System.out.println("BMW limit");
		
	}

	@Override
	public void engine() {
		System.out.println("BMW engine");
		
	}

	@Override
	public void accelaration() {
		// TODO Auto-generated method stub
		
	}
	
}
class Maruti implements car
{

	@Override
	public void speedlimit() {
		System.out.println("maruti limit");
		
	}

	@Override
	public void engine() {
		System.out.println("maruti engine");
		
	}
	
}



public class Interfacepgm {

	public static void main(String[] args) {
		//BMW ob=new BMW();
	car c=new BMW();
	c.speedlimit();
	c.engine();
 c=new Maruti();
 c.speedlimit();
 c.engine();
	}

}
