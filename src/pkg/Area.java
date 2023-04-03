package pkg;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter radius");
		int r=sc.nextInt();
		Area ob=new Area();
		double cr=ob.circle(r);
		System.out.println(cr);
		System.out.println("enter length and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		ob.rectangle(l,b);		

	}

	public double circle(int r)
	{
		double circleresult=3.14*r*r;
		return circleresult;
	}
	
	public void rectangle(int l,int b) {
		
		int rec=l*b;
		System.out.println("rectangle result="+rec);
		
	}
	
   public void triangle() {
		
	}
	
    public void square() {
	
     }

	
}
