package pkg;

public class Employeeusingmethod {
	
	String empname;
	int empid;
	String designation;
	
	public void setvalues(String empname,int empid,String designation)
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
		
		
		Employeeusingmethod ob=new Employeeusingmethod();
		ob.setvalues("hifas", 104, "Developer");
		ob.display();
		
		
		
	}

}
