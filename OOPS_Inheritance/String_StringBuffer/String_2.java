package OOPS_Inheritance.String_StringBuffer;

import java.util.Scanner;

public class String_2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.charAt(s1.length()-1) == s2.charAt(0))
			System.out.println(s1 + s2.substring(1));
		else
			System.out.println(s1 + " " + s2);
		
		sc.close();
	}
}