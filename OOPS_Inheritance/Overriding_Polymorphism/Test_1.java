package OOPS_Inheritance.Overriding_Polymorphism;

class Fruit
{
	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit()
	{
		name = "Fruit Name";
		taste = "Taste of the fruit";
		size = 0;
	}
	
	public void eat()
	{
		System.out.println(name + " tastes like " + taste);
	}
}

class Apple extends Fruit
{
	public void eat()
	{
		System.out.println("Apple tastes sweet");
	}
}

class Orange extends Fruit
{
	public void eat()
	{
		System.out.println("Orange tastes sweet-tart");
	}
}

public class Test_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		apple.eat();
		orange.eat();

	}

}
