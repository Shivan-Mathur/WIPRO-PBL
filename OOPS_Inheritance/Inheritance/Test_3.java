package OOPS_Inheritance.Inheritance;

public class Test_3 
{
	public static void main(String[] args) 
	{
		Person_3 person = new Person_3("Shivan Mathur", "18/08/1998");
		Teacher teacher = new Teacher("Prof. Subha S", "01/01/1985", 700000, "Computer Science");
		Student student = new Student("Ayan", "13/08/1998", "16BIT0018");
		CollegeStudent clgStudent = new CollegeStudent("Shivan", "18/08/1998", "16BIT0139", "VIT", "Fourth");
		
		System.out.println(person);
		System.out.println(teacher);
		System.out.println(student);
		System.out.println(clgStudent);
	}
}