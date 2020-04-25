package OOPS_Inheritance.String_StringBuffer;

import java.util.Scanner;

public class String_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		boolean flag = true;
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i) != (str.charAt(str.length()-i-1)))
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println(str + " is palindrome.");
		else
			System.out.println(str + " is not palindrome.");
		
		sc.close();
	}

}
