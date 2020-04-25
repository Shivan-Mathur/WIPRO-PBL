package Java_Fundamentals;

public class Arrays_5 
{
	public static void main(String[] args) 
	{
		int arr[] = {3, 25, 9, 29, 11, 18, 13};
        int len = arr.length;

        for(int i=0; i<len-1; i++) 
        {
            for(int j=0; j<len-i-1; j++) 
            {
                if(arr[j] > arr[j+1]) 
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println("Smallest two numbers are: " + arr[0] + " and " + arr[1]);
        System.out.println("Largest two numbers are: " + arr[len-1] + " and " + arr[len-2]);
	}
}