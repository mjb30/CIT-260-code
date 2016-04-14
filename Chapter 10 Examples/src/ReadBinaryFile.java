import java.io.*;

/**
 *  This program opens a binary file, then reads and displays         
 *  the contents. 
 */

public class ReadBinaryFile
{
	public static void main(String[] args) throws IOException
	{
		int number = 0;            // To hold a number
		boolean endOfFile = false; // End of file flag
		FileInputStream fstream = null;
		DataInputStream inputFile = null;

		// Open Numbers.dat as a binary file.
		fstream = new FileInputStream("Numbers.dat");
		inputFile = new DataInputStream(fstream);

		System.out.println("Reading numbers from the file:");

		// Read data from the file.
		while(!endOfFile){ // hmmmm... we need more in this loop!
			try{
				number = inputFile.readInt();
				System.out.println(number);
			}
			catch(EOFException e){
				endOfFile = true;
			}
		}

		// Close the file.
		inputFile.close();
		System.out.println("\nDone.");
	}
}
