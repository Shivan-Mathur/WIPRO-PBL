package OOPS_Inheritance.String_StringBuffer;

import java.util.Scanner;

public class String_5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(str.substring(1, str.length()));
		sc.close();
	}

}
