package myFirstProject;

public class HelloWorld
{	
	// An object is 2 things.
	// 1. Actions. Methods.
	// 2. Attributes. Variables
	private String name = "Nathan";
	private String lastName = "George";
	
	// main method. Starts the program.
	// Method Signature - What makes this method unique.
	public static void main(String[] args) 
	{
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
	}
	{
	// Prints to the console.
		System.out.println("Hello World");
		System.out.println("This is so cool!!");
		System.out.println("I am stuck in Java!!!");
		System.out.println("Let me out!");
	}
	
	
	private void sayHello()
	{
		// Prints to the console.
		System.out.println("Hello World");
	}
	
}