package OOPS_Inheritance.Inheritance;

public class Teacher extends Person_3
{
	protected int salary;
	protected String subject;
	
	public Teacher(String name, String dateOfBirth, int salary, String subject)
	{
		super(name, dateOfBirth);
		this.salary = salary;
		this.subject = subject;
	}
	
	public int getSalary()
	{
		return salary;
	}
	public String getSubject()
	{
		return subject;
	}
	
	public String toString()
	{
		return "Teacher Name: " + name + ", Date of Birth: " + dateOfBirth + ", Subject: " + subject + ", Salary: " + salary;
	}
}
