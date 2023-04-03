package pkg;

public class Employeeusingconstructor {
	String empname;
	int empid;
	String designation;
	
	
	Employeeusingconstructor(String empname,int empid,String designation)
	{
		this.empname=empname;
		this.empid=empid;
		this.designation=designation;
		
	}
	public void display()
	{
		System.out.println("employee name ="+empname);
		System.out.println("employee id ="+empid);
		System.out.println("employee desgntn ="+designation);
	}
	
	
	

	public static void main(String[] args) {
		
		Employeeusingconstructor ob=new Employeeusingconstructor("vishnu", 103, "tester");
		ob.display();
	}

}
