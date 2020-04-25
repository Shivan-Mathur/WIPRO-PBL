package OOPS_Inheritance.String_StringBuffer;

import java.util.Scanner;

public class String_3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String s = "";
		String ans = "";
		if(str.length() > 2)
			s = str.substring(0, 2);

		for(int i=0; i<str.length(); i++)
			ans += s;
		
		System.out.println(ans);
		sc.close();
	}

}
