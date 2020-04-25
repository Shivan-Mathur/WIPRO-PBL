package OOPS_Inheritance.Inheritance;

public class Student extends Person_3
{
	protected String studentID;
	
	public Student(String name, String dateOfBirth, String studentID)
	{
		super(name, dateOfBirth);
		this.studentID = studentID;
	}
	
	public String getStudentID()
	{
		return studentID;
	}
	
	public String toString()
	{
		return "Student Name: " + name + ", Date of Birth: " + dateOfBirth + ", Student ID: " + studentID;
	}
}
