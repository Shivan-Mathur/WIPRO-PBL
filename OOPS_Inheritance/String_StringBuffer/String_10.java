package OOPS_Inheritance.String_StringBuffer;
import java.util.Scanner;

public class String_10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		String result = "";
		for(int i=0; i<n; i++)
		{
			result += str.substring(str.length() - n);
		}
		
		System.out.println(result);
		
		sc.close();
	}
}