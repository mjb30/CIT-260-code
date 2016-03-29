import java.io.*;

/**
 *  This program opens a binary file, then reads and displays         
 *  the contents. 
 */

public class ReadBinaryFile
{
   public static void main(String[] args) throws IOException
   {
      int number;                // To hold a number
      boolean endOfFile = false; // End of file flag
      
      // Open Numbers.dat as a binary file.
      FileInputStream fstream =
                      new FileInputStream("Numbers.dat");
      DataInputStream inputFile =
                      new DataInputStream(fstream);
      
      System.out.println("Reading numbers from the file:");
      
      // Read data from the file.
      while(!endOfFile){ // hmmmm... we need more in this loop!
           number = inputFile.readInt();
           System.out.print(number + " ");
      }

      // Close the file.
      inputFile.close();
      System.out.println("\nDone.");
   }
}
