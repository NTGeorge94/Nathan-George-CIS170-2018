package javacar;

public class Car 
{

	private String name = "Nathan";
	private String lastName = "George";
	
	
	
	public static void main(String[] args)
	{
		System.out.println("\n");
		String [] Parts = {"Ford", "Fiesta", "2014", "Hatchback"};
	
		for(String name : Parts) 
		{
			System.out.println(name);
			System.out.println(",");
			
		}
	}
}
