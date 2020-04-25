package Java_Fundamentals;

import java.util.Scanner;

public class Arrays_3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1, 4, 34, 56, 7};
        int index = -1;
        
        int number = sc.nextInt();
        for(int i=0; i<arr.length; i++) 
        {
            if(arr[i] == number) 
            {
                index = i;
                break;
            }
        }
        System.out.println(index);
        sc.close();
	}
}