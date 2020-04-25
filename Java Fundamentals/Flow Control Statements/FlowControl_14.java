package Java_Fundamentals;

public class FlowControl_14 
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
        
		if(args.length == 0) 
        {
            System.out.println("Please enter an integer number");
            System.exit(0);
        }
        
        else if (num == 0 || num == 1)
        	System.out.println(num + "is neither prime nor composite");
        
        else 
        	checkPrime(num);
	}

	private static void checkPrime(int num) 
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
		
		if(flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}

}
