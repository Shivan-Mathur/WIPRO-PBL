package Java_Fundamentals;

import java.util.Scanner;

public class Check_Odd_Even {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if( a%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
