package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException  {
		int a=40,b=0,c=0;
		try {
		 c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println(c);
		System.out.println("hello");
		
		
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
		
			System.out.println("nullpointerexception");
		}
		catch(Exception e)
		{
		
			
		}
		finally {
			
		}
		
		
		FileInputStream f=new FileInputStream("E://book1.xlsx");
		
		
	}

}
