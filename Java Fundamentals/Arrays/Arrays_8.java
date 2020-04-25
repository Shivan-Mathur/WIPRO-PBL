package Java_Fundamentals;

public class Arrays_8 
{
	public static void main(String[] args) 
	{
		int arr[] = {10, 3, 6, 1, 2, 7, 9, 7, 1, 2, 3, 6};
        int len = arr.length;
        int index_of_six = 0, index_of_seven = 0;
        int sum = 0;
        for(int i=0;i<len;i++)
        {
            if(arr[i] == 6)
            {
                index_of_six = i;
            }
            else if(arr[i]==7 && i>index_of_six)
            {
                index_of_seven = i;
                for(int j=index_of_six+1; j<index_of_seven; j++)
                {
                    sum -= arr[j];
                }
            }
            else
            {
                sum+=arr[i];
            }
        }
        
        System.out.println("Sum is : "+sum);
	}
}