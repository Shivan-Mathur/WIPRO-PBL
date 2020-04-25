package OOPS_Inheritance.Classes_and_Objects;

class Calculator
{
	public static int powerInt(int num1, int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, double num2)
	{
		return Math.pow(num1, num2);
	}
}

public class TestCalculatorClass 
{
	public static void main(String[] args) 
	{
		System.out.println(Calculator.powerInt(5, 3));
		System.out.println(Calculator.powerDouble(6.3, 5.1));
	}
}