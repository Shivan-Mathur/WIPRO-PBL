package OOPS_Inheritance.Classes_and_Objects;

class Patient
{
	private String patientName;
	private double height;
	private double weight;
	
	public Patient(String name, double height, double weight)
	{
		this.patientName = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double computeBMI()
	{
		return weight / (height * height);
	}
}
public class TestPatientClass 
{
	public static void main(String[] args) 
	{
		Patient P = new Patient("Shivan", 1.737, 51);
		
		System.out.println(P.computeBMI());
	}
}