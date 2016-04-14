import java.io.*;

/**
 * This program reads UTF-8 encoded strings from a binary file.
 */

public class ReadUTF
{
	public static void main(String[] args) throws IOException
	{
		String name;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream("UTFnames.dat");
		DataInputStream inputFile = new DataInputStream(fstream);

		System.out.println("Reading the names from the file:");
		while (!endOfFile)
		{

			name = inputFile.readUTF();
			System.out.print(name + " ");

		}
		System.out.println("\nDone.");
		inputFile.close();     
	}
}
