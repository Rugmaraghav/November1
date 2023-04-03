package oops;


class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	long salary;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("salary="+salary);
	}
	
}

class Employee extends Member
{
	String specialization;
}

class manager extends Member
{
	String department;
}

public class Inheritancepgm {

	public static void main(String[] args) {
		
		Employee ob=new Employee();
		ob.name="nisha";
		ob.age=23;
		ob.address="abc";
		ob.phoneno=98765452l;
		ob.salary=5000;
		System.out.println(ob.specialization="Developer");
		ob.printdetails();
		manager ob1=new manager();
		ob1.name="riya";
		ob1.age=32;
		ob1.address="abczx";
		ob1.phoneno=98765452l;
		ob1.salary=50000;
		ob1.printdetails();
		

	}

}
