package pkg;

public class Employee {

	String empname;
	int empid;
	String empdesignation;
	
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empname="nisha";
		e1.empid=101;
		e1.empdesignation="Tester";
		e1.display();
		Employee e2=new Employee();
		e2.empname="aiswarya";
		e2.empid=102;
		e2.empdesignation="developer";
		e2.display();

		
	}
	
	public void display()
	{
		System.out.println("employee name ="+empname);
		System.out.println("employee id ="+empid);
		System.out.println("employee desgntn ="+empdesignation);
	}
	
	

}
