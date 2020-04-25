package Java_Fundamentals;

public class Arrays_2 
{
	public static void main(String[] args) 
	{
		int arr[]  = {18, 8, 3, 11, 29, 13};
        
		int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i] < min) 
            	min = arr[i];
            if(arr[i] > max) 
            	max = arr[i];
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
	}
}