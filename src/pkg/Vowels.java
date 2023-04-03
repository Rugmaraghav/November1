package pkg;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Vowels v=new Vowels();
		v.countofvowels(s);

	}

	public  void countofvowels(String s) {
		
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				c++;
			}
		}
		System.out.println("count of vowels="+c);
		
	}

}
