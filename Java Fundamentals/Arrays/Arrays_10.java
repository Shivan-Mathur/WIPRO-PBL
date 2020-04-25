package Java_Fundamentals;

public class Arrays_10 
{
	public static void main(String[] args) 
	{
		if (args.length != 9) 
		{
			System.out.println("Please enter 9 integer numbers");
		}
		else 
		{
			int[][] arr = new int[3][3];
			int index = 0;

			for (int i=0; i<arr.length; i++) 
			{
				for (int j=0; j<arr[0].length; j++) 
				{
					arr[i][j] = Integer.parseInt(args[index++]);
				}
			}

			int max = arr[0][0];
			for (int i=0; i<arr.length; i++) 
			{
				for (int j=0; j<arr[0].length; j++) 
				{
					if(arr[i][j] > max)
						max = arr[i][j];
				}
			}

			System.out.println("The biggest number in the given array is " + max);
		}
	}
}