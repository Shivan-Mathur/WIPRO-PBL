package Java_Fundamentals;

import java.util.ArrayList;

public class Arrays_7 
{
	public static void main(String[] args) 
	{
		int[] array = {12, 34, 12, 45, 67, 89};
       ArrayList<Integer> list = new ArrayList<>();

        for (int item : array) 
        {
            if (!list.contains(item))
                list.add(item);
        }
        
        for(int i=0; i<list.size(); i++)
        	System.out.println(list.get(i));
	}
}