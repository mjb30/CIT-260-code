import java.io.*;

/**
 * This program opens a binary file and writes the contents
 * of an int array to the file.
 */

public class MysteryBinaryFileWriter
{
   public static void main(String[] args) throws IOException
   {
      // Create an array of integers.
      char[] numbers = new String("You've figured it out -- these are characters!").toCharArray();
      
      // Open a binary file for output.
      FileOutputStream fstream =
                    new FileOutputStream("mystery.dat");
      DataOutputStream outputFile = 
                    new DataOutputStream(fstream);
      
      System.out.println("Writing to the file...");
      
      // Write the array elements to the binary file.
      for (int i = 0; i < numbers.length; i++)
         outputFile.writeChar(numbers[i]);

      // Close the file.      
      outputFile.close();
      System.out.println("Done.");
   }
}
