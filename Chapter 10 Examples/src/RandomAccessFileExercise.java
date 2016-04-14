// Example using RandomFileAccess

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExercise {

    public static void main(String[] args) {
    	final int RECORD_SIZE = 12; //hmmmmm.... what is the record size
        try {
            // Create a new instance of RandomAccessFile class. We'll do a "r"
            // read and "w" write operation to the file. If you want to do a write
            // operation you must also allow read operation to the RandomAccessFile
            // instance.
            RandomAccessFile raf = new RandomAccessFile("movies.dat", "rw");  //hmmm... something might be wrong here

            // Let's write some book's title to the end of the file
            String movie[] = new String[20];
            movie[0] = "Batman v Superman   ";
            movie[1] = "Zootopia            ";
            movie[2] = "Deadpool            ";
            movie[3] = "Greek Wedding 2     ";
            movie[4] = "Miracles from Heaven";
            movie[5] = "The Force Awakens   ";
            movie[6] = "Kung Fu Panda 3     ";
            movie[7] = "100 Cloverfield Lane"; //typo
            movie[8] = "Divergent Allegiant ";
            movie[9] = "Eye in the Sky      ";
            
            int[] stars = new int[10];
            stars[0] = 92; //29
            stars[1] = 98;
            stars[2] = 83;
            stars[3] = 25;
            stars[4] = 50;
            stars[5] = 29; //92
            stars[6] = 86;
            stars[7] = 89;
            stars[8] = 12;
            stars[9] = 93;
            
          
            for (int i = 0; i < movie.length; i++) {
                raf.writeUTF(movie[i]);
                raf.writeInt(stars[i]);
            }

            // To do: Write different book at the end of the file (replace J2EE Basic)
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
