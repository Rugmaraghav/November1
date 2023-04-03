package pkg;

public class Stringp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jmeter is used for performance testing";
		String a[]=s.split(" ");
		for(String s1:a)
		{
			System.out.println(s1);
			if(s1.equals("performance"))
			{
				break;
			}
		}

	}

}
