package OOPS_Inheritance.Encapsulation_Abstraction;

class Author
{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	
	public String toString() 
	{
		return "Name: " + name + ", Email: " + email + ", Gender: " + gender;
	}
}

class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getqtyInStock()
	{
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	public String toString()
	{
		return "Book Name: " + name + ", Author " + author + ", Price: " + price + ", qtyInStock: " + qtyInStock;
	}
}

public class TestClass 
{
	public static void main(String[] args) 
	{
		Author author = new Author("Shivan Mathur", "shivanmthr18@gmail.com", 'M');
		Book book = new Book("Wipro", author, 500, 10);
		
		System.out.println("Book Details: ");
		System.out.println(book);
	}
}