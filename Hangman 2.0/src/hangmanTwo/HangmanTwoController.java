package hangmanTwo;

import java.util.Scanner;

public class HangmanTwoController {
	
	HangmanTwo[] games;
	Scanner console = new Scanner(System.in);
	
	public HangmanTwoController()
	{
		games = new HangmanTwo[] {new HangmanTwo("Holy", "bible"), new HangmanTwo("Weird Name For Coffee", "java"), new HangmanTwo("Smoke", "fire")};
	}
		
		
	public void playGame()
	{
			for(int i = 0; i < games.length; i++)
			{
				while(!games[i].isSolved() && !games[i].isDead())
				{
					System.out.println("Hint: " + games[i].getHint());
					System.out.println("Mask: " + games[i].calculateMask());
					System.out.println("Guess a letter: ");
					games[i].addGuess(console.next());
				}
			}
			
			System.out.println("Thanks for playing!");
	}
		
	public static void main(String[] args)
	{
		HangmanTwoController gc = new HangmanTwoController();
		gc.playGame();
	}

}
