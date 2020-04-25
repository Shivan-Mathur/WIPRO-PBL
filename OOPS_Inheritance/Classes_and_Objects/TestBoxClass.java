package OOPS_Inheritance.Classes_and_Objects;

class Box 
{
	public double width;
	public double height;
	public double depth;
	
	public Box(double width, double height, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getVolume()
	{
		return width * height * depth;
	}
}

public class TestBoxClass 
{
	public static void main(String[] args) 
	{
		Box box = new Box(20, 18.5, 15);
		System.out.println("Volume of Box is: " + box.getVolume());
	}
}