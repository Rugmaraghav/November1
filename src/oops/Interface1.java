package oops;



interface BasicAnimal
{
	public void eat();
	public void sleep();
}
class Monkey
{
	public void jump()
	{
		System.out.println("monkey jump");
	}
	public void bite()
	{
		System.out.println("monkey bite");
	}
}

class human extends Monkey implements BasicAnimal{
	public void speak()
	{
		System.out.println("speak");
	}

	@Override
	public void eat() {
		
		System.out.println("eat");
	}

	@Override
	public void sleep() {
		
		System.out.println("sleep");
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		human ob=new human();
		ob.sleep();
		ob.speak();
		ob.eat();
		ob.bite();
		ob.jump();

	}

}
