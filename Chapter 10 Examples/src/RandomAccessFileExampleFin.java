// Example using RandomFileAccess

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExampleFin {

    public static void main(String[] args) {
    	int recordSize = 12;
        try {
            // Create a new instance of RandomAccessFile class. We'll do a "r"
            // read and "w" write operation to the file. If you want to do a write
            // operation you must also allow read operation to the RandomAccessFile
            // instance.
            RandomAccessFile raf = new RandomAccessFile("books.dat", "rw");  //hmmm... something might be wrong here

            // Let's write some book's title to the end of the file
            String books[] = new String[5];
            books[0] = "Pro. JSP  ";
            books[1] = "Interface ";
            books[2] = "J Security";
            books[3] = "JaHandbook";
            books[4] = "J2EE Basic";

            for (int i = 0; i < books.length; i++) {
                raf.writeUTF(books[i]);
            }

            // To do: Write different book at the end of the file.
            //
            //byte[] bytes = books[0].getBytes();
            //int loc = bytes.length;
            //System.out.println("loc is" + loc);
            raf.seek(recordSize);
            raf.writeUTF("Servlets  ");

            // To do: Move the file pointer to the beginning of the file
            //
            raf.seek(0);
            // While the file pointer is less than the file length, read the
            // next strings of data file from the current position of the
            // file pointer
            while (raf.getFilePointer() < raf.length()) {
            	// To do: Read each string and print it out
            	//
            	System.out.println(raf.readUTF());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
