package Java_Fundamentals;

public class Arrays_1 {

	public static void main(String[] args) 
	{
		int sum = 0, avg;
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i : x) 
        {
            sum += i;
        }
        
        avg=sum / x.length;
        
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + avg);
	}
}
