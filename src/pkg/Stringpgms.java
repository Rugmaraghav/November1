package pkg;

public class Stringpgms {

	public static void main(String[] args) {
		
//1.string concat
		String s="hello";
		String s1="welcome";
		System.out.println(s+s1);//hellowelcome
		System.out.println(s.concat(s1));//hellowelcome
		System.out.println(1+2+s+3+5);//3hello35
		
//2.contains
   String s3="           Welcome";
   System.out.println(s1.contains(s3));//true
   
 //3.equals
   
   System.out.println(s1.equals(s3));//false
   System.out.println(s1.equalsIgnoreCase(s3));
  
 //trim
   System.out.println(s3.trim());
   
 //touppercase
   
   System.out.println(s1.toUpperCase());
   System.out.println(s1.toLowerCase());
   
   //startswith
   System.out.println(s1.startsWith("w"));
   
   //length
   System.out.println(s1.length());
   
  //substring
   System.out.println(s1.substring(2, 4));
  
   //split
   
   String s5="selenium is a webbased tool";
  // System.out.println(s5.split(" "));
   
   String n[]=s5.split(" ");
   
	//charAt()
   System.out.println(s1.charAt(0));
		

	}

}
