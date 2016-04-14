import java.io.*;

/**
 *  This program opens a binary file, then reads and displays         
 *  the contents. 
 */

public class ReadMysteryBinaryFile
{
	public static void main(String[] args) throws IOException
	{
		char number = 0;                // To hold a number
		boolean endOfFile = false; // End of file flag
		FileInputStream fstream = null;
		DataInputStream inputFile = null;

		// Open Numbers.dat as a binary file.
		fstream = new FileInputStream("mystery.dat");
		inputFile = new DataInputStream(fstream);

		System.out.println("Reading numbers from the file:");

		// Read data from the file.
		while(!endOfFile){ // hmmmm... we need more in this loop!
			number = inputFile.readChar();
			System.out.print(number + " ");
		}

		// Close the file.
		inputFile.close();
		System.out.println("\nDone.");
	}
}
