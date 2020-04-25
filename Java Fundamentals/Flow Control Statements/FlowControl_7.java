package Java_Fundamentals;

public class FlowControl_7 
{

	public static void main(String[] args) 
	{
		char ch = 'S';
		
		if (Character.isLowerCase(ch))
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        else
            System.out.println(ch + "->" + Character.toLowerCase(ch));
	}

}
