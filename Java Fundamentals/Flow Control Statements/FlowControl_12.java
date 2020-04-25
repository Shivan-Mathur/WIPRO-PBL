package Java_Fundamentals;

import java.util.Scanner;

public class FlowControl_12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean flag = true;
		for(int i=2; i<Math.sqrt(num); i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
		
		sc.close();
	}
}
