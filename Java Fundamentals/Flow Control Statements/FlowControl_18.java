package Java_Fundamentals;

import java.util.Scanner;

public class FlowControl_18 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = reverseNumber(n);
		
		if(n == num)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " is not a palindrome");
		
		sc.close();
	}

	private static int reverseNumber(int n) 
	{
		int num = 0;
		while(n > 0)
		{
			num = num*10 + n%10;
			n = n/10;
		}
		return num;
	}
}
