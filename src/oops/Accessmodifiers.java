package oops;


class employeedetails
{
	String empname;
	static final String companyname="luminar";
	
	
}

public class Accessmodifiers {

	protected int s;
	public static void main(String[] args) {
		
		employeedetails ob=new employeedetails();
		System.out.println(ob.empname="ashi");
		
		System.out.println(employeedetails.companyname);
		//System.out.println(employeedetails.companyname="luminar technolab");
		//System.out.println(employeedetails.companyname);
		
		
		
		
		//parent1 p=new parent1();
		//System.out.println(p.a);
	}

}
