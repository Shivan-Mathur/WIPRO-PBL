package OOPS_Inheritance.String_StringBuffer;

import java.util.Scanner;

public class String_11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		String result = "";
		
		while (str1.indexOf(str2) != -1) 
		{	
			int index = str1.indexOf(str2);
			
			if (index == 0 && index + str2.length() < str1.length() - 1) 
			{
				result += str1.charAt(index + str2.length());
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index - 1 >= 0 && index + str2.length() >= str1.length()) 
			{
				result += str1.charAt(index - 1);
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			
			if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) 
			{
				result += str1.charAt(index - 1);
				result += str1.charAt(index + str2.length());
				str1 = str1.replaceFirst(str2, "");
			}
		}

		System.out.println(result);
		
		sc.close();
	}
}