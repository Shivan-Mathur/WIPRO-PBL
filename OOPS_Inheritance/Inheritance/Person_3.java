package OOPS_Inheritance.Inheritance;

public class Person_3 
{
	protected String name;
	protected String dateOfBirth;
	
	public Person_3(String name, String dateOfBirth)
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName()
	{
		return name;
	}
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	public String toString()
	{
		return "Name: " + name + ", Date of Birth: " + dateOfBirth;
	}
}
