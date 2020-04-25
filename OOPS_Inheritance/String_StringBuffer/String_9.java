package OOPS_Inheritance.String_StringBuffer;
import java.util.Scanner;

public class String_9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		String result = "";
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;
		
		for(int i=0; i<smaller.length(); i++)
		{
			result += a.charAt(i);
			result += b.charAt(i);
		}
		
		result += bigger.substring(smaller.length());
		
		System.out.println(result);
		
		sc.close();
	}
}
