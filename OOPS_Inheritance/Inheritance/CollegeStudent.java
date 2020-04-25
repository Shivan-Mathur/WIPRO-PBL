package OOPS_Inheritance.Inheritance;

public class CollegeStudent extends Student
{
	protected String collegeName;
	protected String year;
	
	public CollegeStudent(String name, String dateOfBirth, String studentID, String collegeName, String year)
	{
		super(name, dateOfBirth, studentID);
		this.collegeName = collegeName;
		this.year = year;
	}
	
	public String collegeName()
	{
		return collegeName;
	}
	public String getYear()
	{
		return year;
	}
	
	public String toString()
	{
		return "Student Name: " + name + ", Date of Birth: " + dateOfBirth + ", Student ID: " + studentID + ", College Name: " + collegeName + ", Year: " + year;
	}
}
