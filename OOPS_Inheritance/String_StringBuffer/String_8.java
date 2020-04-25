package OOPS_Inheritance.String_StringBuffer;
import java.util.Scanner;

public class String_8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String strs[] = str.split(".[\\*]+.");

		StringBuffer sb = new StringBuffer();

		for (String x : strs)
			sb.append(x);

		System.out.println(sb);

		sc.close();

	}

}
