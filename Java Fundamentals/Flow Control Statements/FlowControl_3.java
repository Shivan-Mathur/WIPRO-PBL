package Java_Fundamentals;

public class FlowControl_3 {

	public static void main(String[] args) 
	{
		if(args.length == 0)
			System.out.println("No values");
		else
		{
			int n = args.length;
			for(int i=0; i<n - 2; i++)
				System.out.println(args[i] +",");
			System.out.println(args[n-1]);
		}

	}

}
