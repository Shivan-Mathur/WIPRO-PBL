package Java_Fundamentals;

public class FlowControl_13 
{
	public static void main(String[] args) 
	{
		for(int i=10; i<100; i++)
		{
			boolean ans = checkPrime(i);
			
			if(ans)
				System.out.println(i);
		}
	}

	private static boolean checkPrime(int num) 
	{
		boolean flag = true;
		for(int i=2; i<Math.sqrt(num); i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	

}
