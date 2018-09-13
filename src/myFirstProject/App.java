package myFirstProject;

public class App {
	

	
	public static void main(String[] argz)
	{
		User u1 = new User();
		u1.setFirstName("George");
		u1.setLastName("John");
		u1.setEmail("george@john.com");
		u1.setUserName("gjohn");
	
		User u2 = new User();
		u2.setFirstName("Matt");
		u2.setLastName("Smith");
		u2.setEmail("bowtiesarecool@mail.com");
		u2.setUserName("coolbowtie");
		
		System.out.println(u1.getEmail());
		System.out.println(u2.getEmail());
		System.out.println(u1.getLastName());
		System.out.println(u2.getLastName());
	
		for(int x = 1; x < 100; x++)
		{
			// Prompt user to guess a letter.
			// Prompt user with mask of word (recalculate mask)
			// Prompt user with hint.
			// Collect user input.
			// Repeat...
			System.out.println(x);
			
		}
	}
	
	// Ask Mike how the heck to do this...
	private void generateMask()
	{
		
	}

}
