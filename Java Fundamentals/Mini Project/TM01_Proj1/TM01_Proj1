package Java_Fundamentals;

import java.util.Scanner;

public class TM1_Project1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String empDetails[][] = new String[7][];

		empDetails[0] = new String[]{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"};
		empDetails[1] = new String[]{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"};
		empDetails[2] = new String[]{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"};
		empDetails[3] = new String[]{"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"};
		empDetails[4] = new String[]{"1005", "Rajan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"};
		empDetails[5] = new String[]{"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"};
		empDetails[6] = new String[]{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"};

		int index = -1;
		String choice = sc.next();

		for (int i=0; i<empDetails.length; i++)
		{
			for (int j=0; j<empDetails[i].length; j++)
			{
				if(choice.equals(empDetails[i][j]))
				{
					index = i;
				}
			}
		}
		
		if(index != -1)
		{
			String desgCode = empDetails[index][3];
			
			String Desg = "";
			String DA = "";

			switch(desgCode)
			{
				case "e":
					Desg = "Engineer";
					DA = "20000";
					break;
				case "c":
					Desg = "Consultant";
					DA = "32000";
					break;
				case "k":
					Desg = "Clerk";
					DA = "12000";
					break;
				case "r":
					Desg = "Receptionist";
					DA = "15000";
					break;
				case "m":
					Desg = "Manager";
					DA = "40000";
					break;
				default:
					System.out.println("there is no employee with empId: " + desgCode);
					break;
			}
			
			int salary = Integer.parseInt(empDetails[index][5])+Integer.parseInt(empDetails[index][6])+Integer.parseInt(DA)-Integer.parseInt(empDetails[index][7]);
			System.out.println("Emp No "+" Emp Name "+" Department "+" Designation "+" Salary ");
			System.out.println(choice + "\t " + empDetails[index][1] + "  \t"+empDetails[index][4]+"  \t"+Desg+"   \t"+salary);
		}
		else
		{
			System.out.println("There is no employee with empId: " + choice);
		}
		sc.close();
	}
}
