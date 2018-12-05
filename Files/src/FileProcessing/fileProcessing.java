package FileProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileProcessing 
{
	private BufferedReader reader;

	protected void readFromFile() throws IOException
	{
		File f = new File("words.txt");
		reader = new BufferedReader(new FileReader(f));
		String st;
		while((st = reader.readLine()) != null)
		{
			System.out.println(st);
		}
	}
}
