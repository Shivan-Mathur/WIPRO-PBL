package OOPS_Inheritance.Inheritance;

class Animal
{
	public void eat()
	{
		System.out.println("Animal Eat");
	}
	
	public void sleep()
	{
		System.out.println("Animal Sleep");
	}
}

class Bird extends Animal
{
	public void eat()
	{
		System.out.println("Bird Eat");
	}
	
	public void sleep()
	{
		System.out.println("Bird Sleep");
	}
	
	public void fly()
	{
		System.out.println("Bird Fly");
	}
}

public class Test_1
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		System.out.println();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}